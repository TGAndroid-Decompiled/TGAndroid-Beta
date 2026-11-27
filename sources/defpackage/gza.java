package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class gza extends LinearLayout {
    public final int a;
    public final vnb b;
    public final de0 c;
    public final ema d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public boolean r;
    public boolean s;

    public gza(int i, vnb vnbVar, Context context) {
        super(context);
        this.a = i;
        this.b = vnbVar;
        setOrientation(0);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(46.0f));
        addView(de0Var, tre.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        ema emaVar = new ema(context);
        this.d = emaVar;
        int i2 = aob.G6;
        yob.W(emaVar, i2, vnbVar);
        emaVar.setTextSize(16);
        emaVar.setTypeface(hl.o());
        jn7.i(emaVar);
        linearLayout.addView(emaVar, tre.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView m = ik8.m(linearLayout, textView, tre.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f = m;
        int i3 = aob.z6;
        yob.X(m, i3, vnbVar);
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, tre.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        qd4.w(textView2, i2, vnbVar, 1, 16.0f);
        textView2.setGravity(5);
        TextView m2 = ik8.m(linearLayout2, textView2, tre.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.n = m2;
        yob.X(m2, i3, vnbVar);
        m2.setTextSize(1, 13.0f);
        m2.setGravity(5);
        linearLayout2.addView(m2, tre.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            canvas.drawRect(hl.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.r) {
            f = 68.0f;
        } else {
            f = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
    }
}
