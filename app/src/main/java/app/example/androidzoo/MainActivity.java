package app.example.androidzoo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ Food 2 อย่างไว้ใน ArrayList<Food> ชื่อว่า foods
        //
        List<Food> foods = new ArrayList<Food>();
        Food food = new Food();
        food.setFood_name("กิตติ สุทธิสัมพันธ");
        food.setFood_image("https://p16-va.lemon8cdn.com/tos-alisg-v-a3e477-sg/7beaa0ff871e4b5da623b0f7a9e4ab23~tplv-tej9nj120t-origin.webp");
        food.setFood_price(1);
        foods.add(food);

        Food food2 = new Food();
        food2.setFood_name("โกวิท มาลัยศิริรัตน");
        food2.setFood_image("https://p16-va.lemon8cdn.com/tos-alisg-v-a3e477-sg/6cbcb004343840bc9ab03e0a699bf9a7~tplv-tej9nj120t-origin.webp");
        food2.setFood_price(2);
        foods.add(food2);


        // ส่ง foods ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(foods, this);
        recyclerView.setAdapter(mAdapter);


    }
}