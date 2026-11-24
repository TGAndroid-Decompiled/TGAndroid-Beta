package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class bh6 extends FrameLayout {
    public static final int G = 0;
    public final PointF E;
    public int F;
    public final k44 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final x0c f;
    public final wp4 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView w;
    public final FrameLayout x;
    public boolean y;

    public bh6(Context context, ViewGroup viewGroup, View view, String str, final k44 k44Var) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        PointF pointF = new PointF();
        this.E = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = k44Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new yg6(this));
        addView(view2, qoe.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, qoe.c(-1.0f, -1));
        x0c x0cVar = new x0c(getContext());
        this.f = x0cVar;
        x0cVar.setTransformType(1);
        x0cVar.setDrawBackground(false);
        wp4 wp4Var = new wp4(null, context, false);
        this.h = wp4Var;
        wp4Var.addView(x0cVar, qoe.e(56, 56, 17));
        wp4Var.a(x0cVar);
        wp4Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                byte b = r1;
                k44 k44Var2 = k44Var;
                bh6 bh6Var = this;
                switch (b) {
                    case 0:
                        k44Var2.D(bh6Var);
                        return;
                    default:
                        k44Var2.D(bh6Var);
                        return;
                }
            }
        });
        wp4Var.setContentDescription(jb6.M0(2131751291, null));
        addView(wp4Var, qoe.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        addView(frameLayout, qoe.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(jb6.M0(2131751753, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        TextView l = wi8.l(frameLayout, textView, qoe.d(-1, -2.0f, i, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = l;
        l.setText(str);
        l.setTextSize(1, 18.0f);
        l.setTypeface(gm.o());
        l.setSingleLine();
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout.addView(l, qoe.d(-1, -2.0f, i2, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = gm.L(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(jb6.M0(2131751272, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = gm.L(6.0f);
        int i5 = cmb.Mi;
        textView2.setBackground(cmb.H0(L2, cmb.w0(null, i5, false)));
        textView2.setOnClickListener(new yg6(this, k44Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i6 = L / 2;
        textView2.setPadding(L, i6, L, i6);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        TextView l2 = wi8.l(frameLayout, textView2, qoe.d(-2, -2.0f, i3 | 80, 8.0f, 8.0f, 8.0f, 8.0f), context);
        this.w = l2;
        l2.setText(jb6.M0(2131752089, null));
        l2.setSingleLine();
        l2.setTextSize(1, 16.0f);
        l2.setBackground(cmb.H0(gm.L(6.0f), cmb.w0(null, i5, false)));
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                byte b = r1;
                k44 k44Var2 = k44Var;
                bh6 bh6Var = this;
                switch (b) {
                    case 0:
                        k44Var2.D(bh6Var);
                        return;
                    default:
                        k44Var2.D(bh6Var);
                        return;
                }
            }
        });
        l2.setTypeface(typeface);
        l2.setPadding(L, i6, L, i6);
        if (jb6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        frameLayout.addView(l2, qoe.d(-2, -2.0f, i4 | 80, 8.0f, 8.0f, 8.0f, 8.0f));
        zgc.b(view, viewGroup, pointF);
        wp4Var.setTranslationX(pointF.x);
        wp4Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.y) {
            return;
        }
        this.y = true;
        ((lh6) this.a.b).h0.c0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new ah6(this, (byte) 1));
        duration.addUpdateListener(new xg6(this, (byte) 0));
        duration.setInterpolator(d53.f);
        duration.start();
    }

    public final void b() {
        int w0 = cmb.w0(null, cmb.N9, false);
        x0c x0cVar = this.f;
        x0cVar.setColor(w0);
        x0cVar.setBackgroundColor(cmb.w0(null, cmb.O9, false));
        int w02 = cmb.w0(null, cmb.g5, false);
        FrameLayout frameLayout = this.x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(cmb.b0(gm.L(12.0f), w02));
        } else if (w02 != this.F) {
            cmb.A1(w02, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.F = w02;
        this.n.setTextColor(cmb.w0(null, cmb.p5, false));
        this.r.setTextColor(cmb.w0(null, cmb.i5, false));
        int i = cmb.Mi;
        this.s.setTextColor(cmb.w0(null, i, false));
        this.w.setTextColor(cmb.w0(null, i, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - gm.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
