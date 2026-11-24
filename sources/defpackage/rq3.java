package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class rq3 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final LimitPreviewView c;

    public rq3(Context context, ylb ylbVar) {
        super(context);
        setOrientation(1);
        setPadding(gm.L(6.0f), 0, gm.L(6.0f), 0);
        TextView textView = new TextView(context);
        this.a = textView;
        ts2.s(textView, 1, 15.0f);
        anb.X(textView, cmb.F6, ylbVar);
        addView(textView, qoe.q(-1, -2, 0.0f, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.x6, ylbVar);
        textView2.setTextSize(1, 14.0f);
        addView(textView2, qoe.q(-1, -2, 0.0f, 0, 16, 1, 16, 0));
        LimitPreviewView limitPreviewView = new LimitPreviewView(context, 0, 10, 20, ylbVar);
        this.c = limitPreviewView;
        addView(limitPreviewView, qoe.q(-1, -2, 0.0f, 0, 0, 8, 0, 21));
    }

    public final void a(qq3 qq3Var) {
        this.a.setText(qq3Var.a);
        this.b.setText(qq3Var.b);
        LimitPreviewView limitPreviewView = this.c;
        limitPreviewView.w.setText(String.format("%d", Integer.valueOf(qq3Var.d)));
        limitPreviewView.x.setText(String.format("%d", Integer.valueOf(qq3Var.c)));
    }
}
