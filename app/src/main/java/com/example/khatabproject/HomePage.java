package com.example.khatabproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    ImageView img1; ImageView img2; ImageView img3; ImageView img4; ImageView img5; ImageView img6;
    TextView txt1;TextView txt2;TextView txt3;TextView txt4;TextView txt5;TextView txt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Configuration config = getResources().getConfiguration();
        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_home_page);


        txt1 =(TextView) findViewById(R.id.sethtextview);
        txt2 =(TextView) findViewById(R.id.isistextview);
        txt3 =(TextView) findViewById(R.id.osiristextview);
        txt4 =(TextView) findViewById(R.id.ratextview);



        img1 = (ImageView) findViewById(R.id.sethimageview);
        img2 = (ImageView) findViewById(R.id.isisimage);

        img3 = (ImageView) findViewById(R.id.osirisimageview);
        img4 = (ImageView) findViewById(R.id.raimageview);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mainIntent = new Intent(HomePage.this,
                        seth.class);
                startActivity(mainIntent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(HomePage.this,
                        isis.class);
                startActivity(mainIntent);
            }
        }); img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(HomePage.this,
                        osiris.class);
                startActivity(mainIntent);
            }
        }); img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(HomePage.this,
                        ra.class);
                startActivity(mainIntent);
            }
        });










    }
}
