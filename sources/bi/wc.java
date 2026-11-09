package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.qs;
public final class wc extends LinearLayout {
    public final int f4989a;
    public final org.telegram.ui.ActionBar.g6 f4990b;
    public final org.telegram.ui.Components.l9 f4991c;
    public final org.telegram.ui.ActionBar.l5 d;
    public final TextView f4992e;
    public final TextView f4993f;
    public final TextView h;
    public final TextView f4994n;
    public boolean f4995r;
    public boolean f4996s;

    public wc(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f4989a = i7;
        this.f4990b = g6Var;
        setOrientation(0);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f4991c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(l9Var, c8.ha.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.d = l5Var;
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.X(l5Var, i10, g6Var);
        l5Var.setTextSize(16);
        l5Var.setTypeface(org.telegram.messenger.g0.o());
        qs.i(l5Var);
        linearLayout.addView(l5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f4992e = textView;
        org.telegram.ui.ActionBar.s6.U(textView, i10, g6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f4993f = f10;
        int i11 = org.telegram.ui.ActionBar.l6.f28275z6;
        org.telegram.ui.ActionBar.s6.U(f10, i11, g6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, c8.ha.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.k5.n(textView2, i10, g6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout2, textView2, c8.ha.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f4994n = f11;
        org.telegram.ui.ActionBar.s6.U(f11, i11, g6Var);
        f11.setTextSize(1, 13.0f);
        f11.setGravity(5);
        linearLayout2.addView(f11, c8.ha.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4996s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f4995r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
