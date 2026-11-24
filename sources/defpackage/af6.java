package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class af6 extends FrameLayout {
    public static final int G = 0;
    public final PointF E;
    public int F;
    public final pj4 a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final wyb f;
    public final un4 h;
    public final TextView n;
    public final TextView r;
    public final TextView s;
    public final TextView w;
    public final FrameLayout x;
    public boolean y;

    public af6(Context context, ViewGroup viewGroup, View view, String str, final pj4 pj4Var) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        PointF pointF = new PointF();
        this.E = pointF;
        this.b = viewGroup;
        this.c = view;
        this.a = pj4Var;
        View view2 = new View(getContext());
        this.d = view2;
        view2.setOnClickListener(new xe6(this));
        addView(view2, nme.c(-1.0f, -1));
        View view3 = new View(getContext());
        this.e = view3;
        view3.setBackgroundColor(1073741824);
        view3.setAlpha(0.0f);
        addView(view3, nme.c(-1.0f, -1));
        wyb wybVar = new wyb(getContext());
        this.f = wybVar;
        wybVar.setTransformType(1);
        wybVar.setDrawBackground(false);
        un4 un4Var = new un4(null, context, false);
        this.h = un4Var;
        un4Var.addView(wybVar, nme.e(56, 56, 17));
        un4Var.a(wybVar);
        un4Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                byte b = r1;
                pj4 pj4Var2 = pj4Var;
                af6 af6Var = this;
                switch (b) {
                    case 0:
                        pj4Var2.U(af6Var);
                        return;
                    default:
                        pj4Var2.U(af6Var);
                        return;
                }
            }
        });
        un4Var.setContentDescription(k96.M0(2131751342, null));
        addView(un4Var, nme.e(56, 56, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        addView(frameLayout, nme.d(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n = textView;
        textView.setText(k96.M0(2131751804, null));
        textView.setTextSize(1, 14.0f);
        textView.setSingleLine();
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        TextView l = ug8.l(frameLayout, textView, nme.d(-1, -2.0f, i, 24.0f, 20.0f, 24.0f, 0.0f), context);
        this.r = l;
        l.setText(str);
        l.setTextSize(1, 18.0f);
        l.setTypeface(gl.o());
        l.setSingleLine();
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout.addView(l, nme.d(-1, -2.0f, i2, 24.0f, 48.0f, 24.0f, 0.0f));
        int L = gl.L(16.0f);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setText(k96.M0(2131751323, null));
        textView2.setSingleLine();
        textView2.setTextSize(1, 16.0f);
        int L2 = gl.L(6.0f);
        int i5 = bkb.Mi;
        textView2.setBackground(bkb.H0(L2, bkb.w0(null, i5, false)));
        textView2.setOnClickListener(new xe6(this, pj4Var));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        int i6 = L / 2;
        textView2.setPadding(L, i6, L, i6);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        TextView l2 = ug8.l(frameLayout, textView2, nme.d(-2, -2.0f, i3 | 80, 8.0f, 8.0f, 8.0f, 8.0f), context);
        this.w = l2;
        l2.setText(k96.M0(2131752140, null));
        l2.setSingleLine();
        l2.setTextSize(1, 16.0f);
        l2.setBackground(bkb.H0(gl.L(6.0f), bkb.w0(null, i5, false)));
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                byte b = r1;
                pj4 pj4Var2 = pj4Var;
                af6 af6Var = this;
                switch (b) {
                    case 0:
                        pj4Var2.U(af6Var);
                        return;
                    default:
                        pj4Var2.U(af6Var);
                        return;
                }
            }
        });
        l2.setTypeface(typeface);
        l2.setPadding(L, i6, L, i6);
        if (k96.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        frameLayout.addView(l2, nme.d(-2, -2.0f, i4 | 80, 8.0f, 8.0f, 8.0f, 8.0f));
        zec.b(view, viewGroup, pointF);
        un4Var.setTranslationX(pointF.x);
        un4Var.setTranslationY(pointF.y);
        requestLayout();
        b();
    }

    public final void a() {
        if (this.y) {
            return;
        }
        this.y = true;
        ((lf6) this.a.b).h0.c0 = null;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
        duration.addListener(new ze6(this, (byte) 1));
        duration.addUpdateListener(new we6(this, (byte) 0));
        duration.setInterpolator(s33.f);
        duration.start();
    }

    public final void b() {
        int w0 = bkb.w0(null, bkb.N9, false);
        wyb wybVar = this.f;
        wybVar.setColor(w0);
        wybVar.setBackgroundColor(bkb.w0(null, bkb.O9, false));
        int w02 = bkb.w0(null, bkb.g5, false);
        FrameLayout frameLayout = this.x;
        if (frameLayout.getBackground() == null) {
            frameLayout.setBackground(bkb.b0(gl.L(12.0f), w02));
        } else if (w02 != this.F) {
            bkb.A1(w02, frameLayout.getBackground());
            frameLayout.invalidate();
        }
        this.F = w02;
        this.n.setTextColor(bkb.w0(null, bkb.p5, false));
        this.r.setTextColor(bkb.w0(null, bkb.i5, false));
        int i = bkb.Mi;
        this.s.setTextColor(bkb.w0(null, i, false));
        this.w.setTextColor(bkb.w0(null, i, false));
        this.h.updateColors();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.x;
        int measuredHeight = frameLayout.getMeasuredHeight();
        int translationY = (int) (this.h.getTranslationY() - gl.L(32.0f));
        frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, frameLayout.getRight(), translationY);
    }
}
