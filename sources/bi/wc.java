package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.qs;
public final class wc extends LinearLayout {
    public final int f4991a;
    public final org.telegram.ui.ActionBar.f6 f4992b;
    public final org.telegram.ui.Components.l9 f4993c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView f4994e;
    public final TextView f4995f;
    public final TextView h;
    public final TextView f4996n;
    public boolean f4997r;
    public boolean f4998s;

    public wc(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f4991a = i7;
        this.f4992b = f6Var;
        setOrientation(0);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f4993c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(l9Var, c8.ha.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, f6Var);
        k5Var.setTextSize(16);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        qs.i(k5Var);
        linearLayout.addView(k5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f4994e = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f4995f = f10;
        int i11 = org.telegram.ui.ActionBar.k6.f28258z6;
        org.telegram.ui.ActionBar.r6.V(f10, i11, f6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, c8.ha.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.k5.n(textView2, i10, f6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout2, textView2, c8.ha.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f4996n = f11;
        org.telegram.ui.ActionBar.r6.V(f11, i11, f6Var);
        f11.setTextSize(1, 13.0f);
        f11.setGravity(5);
        linearLayout2.addView(f11, c8.ha.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4998s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f4997r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
