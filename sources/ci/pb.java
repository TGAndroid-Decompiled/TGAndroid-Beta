package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.hs;
public final class pb extends LinearLayout {
    public final int f5780a;
    public final org.telegram.ui.ActionBar.e6 f5781b;
    public final org.telegram.ui.Components.k9 f5782c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView f5783e;
    public final TextView f5784f;
    public final TextView h;
    public final TextView f5785n;
    public boolean f5786r;
    public boolean f5787s;

    public pb(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5780a = i3;
        this.f5781b = e6Var;
        setOrientation(0);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f5782c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(k9Var, mf.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, mf.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, e6Var);
        k5Var.setTextSize(16);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        hs.i(k5Var);
        linearLayout.addView(k5Var, mf.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f5783e = textView;
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f5784f = f10;
        int i11 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.r6.V(f10, i11, e6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, mf.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.k5.n(textView2, i10, e6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f11 = org.telegram.messenger.camera.q.f(linearLayout2, textView2, mf.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f5785n = f11;
        org.telegram.ui.ActionBar.r6.V(f11, i11, e6Var);
        f11.setTextSize(1, 13.0f);
        f11.setGravity(5);
        linearLayout2.addView(f11, mf.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5787s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.f5786r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
