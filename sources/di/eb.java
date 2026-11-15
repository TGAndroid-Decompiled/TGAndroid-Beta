package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
public final class eb extends LinearLayout {
    public final int f8513a;
    public final org.telegram.ui.ActionBar.e6 f8514b;
    public final org.telegram.ui.Components.i9 f8515c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final TextView f8516e;
    public final TextView f8517f;
    public final TextView h;
    public final TextView f8518n;
    public boolean f8519r;
    public boolean f8520s;

    public eb(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f8513a = i7;
        this.f8514b = e6Var;
        setOrientation(0);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f8515c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f));
        addView(i9Var, c8.ja.q(46, 46, 0.0f, 19, 13, 0, 13, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 16, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.X(j5Var, i10, e6Var);
        j5Var.setTextSize(16);
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        ns.i(j5Var);
        linearLayout.addView(j5Var, c8.ja.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        TextView textView = new TextView(context);
        this.f8516e = textView;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        textView.setTextSize(1, 13.0f);
        textView.setVisibility(8);
        TextView f10 = i20.f(linearLayout, textView, c8.ja.k(0.0f, 0.0f, 0.0f, 1.0f, -1, -2), context);
        this.f8517f = f10;
        int i11 = org.telegram.ui.ActionBar.j6.f29260z6;
        org.telegram.ui.ActionBar.q6.U(f10, i11, e6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        addView(linearLayout2, c8.ja.q(-2, -2, 0.0f, 16, 0, 0, 18, 0));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        org.telegram.messenger.k5.m(textView2, i10, e6Var, 1, 16.0f);
        textView2.setGravity(5);
        TextView f11 = i20.f(linearLayout2, textView2, c8.ja.t(-1, -2, 5, 0, 0, 0, 1), context);
        this.f8518n = f11;
        org.telegram.ui.ActionBar.q6.U(f11, i11, e6Var);
        f11.setTextSize(1, 13.0f);
        f11.setGravity(5);
        linearLayout2.addView(f11, c8.ja.t(-1, -2, 5, 0, 0, 0, 0));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8520s) {
            canvas.drawRect(org.telegram.messenger.g0.L(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f8519r) {
            f10 = 68.0f;
        } else {
            f10 = 58.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
    }
}
