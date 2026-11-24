package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class gxa extends LinearLayout {
    public final int a;
    public final ylb b;
    public final bf0 c;
    public final lka d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public boolean r;
    public boolean s;

    public gxa(int i, ylb ylbVar, Context context) {
        super(context);
        this.a = i;
        this.b = ylbVar;
        setOrientation(0);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(46.0f));
        addView(bf0Var, qoe.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        int i2 = cmb.F6;
        anb.W(lkaVar, i2, ylbVar);
        lkaVar.setTextSize(16);
        lkaVar.setTypeface(gm.o());
        nm7.i(lkaVar);
        linearLayout.addView(lkaVar, qoe.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.e = textView;
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView m = wi8.m(linearLayout, textView, qoe.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f = m;
        int i3 = cmb.y6;
        anb.X(m, i3, ylbVar);
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, qoe.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        td4.x(textView2, i2, ylbVar, 1, 16.0f);
        textView2.setGravity(5);
        TextView m2 = wi8.m(linearLayout2, textView2, qoe.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.n = m2;
        anb.X(m2, i3, ylbVar);
        m2.setTextSize(1, 13.0f);
        m2.setGravity(5);
        linearLayout2.addView(m2, qoe.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.s) {
            canvas.drawRect(gm.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), cmb.j0);
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gm.L(f), 1073741824));
    }
}
