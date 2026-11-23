package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
public final class ib extends LinearLayout {
    public final int f9034a;
    public final org.telegram.ui.ActionBar.h6 f9035b;
    public final org.telegram.ui.Components.q9 f9036c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final TextView f9037e;
    public final TextView f9038f;
    public final TextView h;
    public final TextView f9039n;
    public boolean f9040r;
    public boolean f9041s;

    public ib(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f9034a = i7;
        this.f9035b = h6Var;
        setOrientation(0);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f9036c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(q9Var, c8.na.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.na.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, h6Var);
        m5Var.setTextSize(16);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        ls.i(m5Var);
        linearLayout.addView(m5Var, c8.na.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f9037e = textView;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f10 = o10.f(linearLayout, textView, c8.na.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f9038f = f10;
        int i11 = org.telegram.ui.ActionBar.m6.f29758z6;
        org.telegram.ui.ActionBar.t6.U(f10, i11, h6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, c8.na.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.f3.l(textView2, i10, h6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f11 = o10.f(linearLayout2, textView2, c8.na.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f9039n = f11;
        org.telegram.ui.ActionBar.t6.U(f11, i11, h6Var);
        f11.setTextSize(1, 13.0f);
        f11.setGravity(5);
        linearLayout2.addView(f11, c8.na.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9041s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.f29470k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f9040r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
