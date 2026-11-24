package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class bp5 extends my0 implements jm7 {
    public final TextView[] l1;
    public final TextView m1;
    public final k46 n1;
    public final yv1 o1;
    public final s09 p1;
    public final ap5 q1;
    public boolean r1;
    public final p09 s1;
    public final TextView[] t1;
    public final String u1;

    public bp5(Context context, String str, yv1 yv1Var, ylb ylbVar) {
        super(1, ylbVar, context, false);
        this.l1 = new TextView[2];
        this.t1 = new TextView[2];
        kg5 kg5Var = new kg5(this, (byte) 5);
        this.w0 = false;
        this.v0 = false;
        this.o1 = yv1Var;
        this.u1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 20.0f);
        int i = cmb.i5;
        anb.X(textView, i, ylbVar);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        p09 p09Var = new p09(2131624063, gm.L(120.0f), gm.L(120.0f), false, null);
        this.s1 = p09Var;
        p09Var.E(true);
        ?? imageView = new ImageView(context);
        this.p1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624064, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, qoe.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().N(178, kg5Var);
        TextView textView2 = new TextView(context);
        this.m1 = textView2;
        wi8.v(textView2, 1, 24.0f);
        anb.X(textView2, i, ylbVar);
        frameLayout.addView(textView2, qoe.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        k46 k46Var = new k46(getContext());
        this.n1 = k46Var;
        int i2 = cmb.Ei;
        k46Var.setProgressColor(cmb.v0(i2, this.J0));
        k46Var.setBackColor(cmb.v0(cmb.F5, this.J0));
        frameLayout.addView(k46Var, qoe.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.a = view;
        int L = gm.L(4.0f);
        int v0 = cmb.v0(i2, ylbVar);
        int i3 = cmb.Gi;
        int v02 = cmb.v0(i3, ylbVar);
        fg0 i0 = cmb.i0(L, L, L, L, v0, v02, v02);
        wmb M = anb.M(i2);
        wmb M2 = anb.M(i3);
        view.setBackground(i0);
        anb.j(view, i0, M, M2, ylbVar);
        frameLayout2.addView(view, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, qoe.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.c = imageView2;
        int L2 = gm.L(20.0f);
        int i4 = cmb.Ii;
        ShapeDrawable K = cmb.K(L2, cmb.v0(i4, ylbVar));
        wmb M3 = anb.M(i4);
        imageView2.setBackground(K);
        anb.j(imageView2, K, M3, null, ylbVar);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView2, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
        imageView2.f(2131624062, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, qoe.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        td4.x(textView3, i4, ylbVar, 1, 14.0f);
        linearLayout.addView(textView3, qoe.t(-2, -2, 16, 10, 0, 0, 0));
        this.q1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(jb6.M0(2131749019, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new ca5(this, (byte) 11));
        view.setPivotY(gm.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, qoe.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i5 = 0; i5 < 2; i5++) {
            this.l1[i5] = new TextView(context);
            this.l1[i5].setTextSize(1, 16.0f);
            this.l1[i5].setTypeface(gm.o());
            anb.X(this.l1[i5], cmb.i5, ylbVar);
            frameLayout.addView(this.l1[i5], qoe.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.t1[i5] = new TextView(context);
            this.t1[i5].setTextSize(1, 14.0f);
            anb.X(this.t1[i5], cmb.q5, ylbVar);
            this.t1[i5].setGravity(1);
            frameLayout.addView(this.t1[i5], qoe.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            TextView[] textViewArr = this.t1;
            if (i5 == 0) {
                textViewArr[i5].setText(jb6.M0(2131749004, null));
            } else {
                textViewArr[i5].setAlpha(0.0f);
                this.t1[i5].setTranslationY(gm.L(10.0f));
                this.l1[i5].setAlpha(0.0f);
                this.l1[i5].setTranslationY(gm.L(10.0f));
            }
        }
        if (this.o1 != null) {
            textView.setText(jb6.M0(2131749003, null));
            r5a A = this.o1.getSendMessagesHelper().A(this.o1.a());
            this.m1.setText(String.format("%d%%", Integer.valueOf(A.l)));
            this.n1.a(false, A.l / 100.0f);
            this.l1[0].setText(jb6.a0("ImportCount", null, 2131749020, gm.i0(A.i, false, false), gm.i0(A.h, false, false)));
            this.t1[1].setText(jb6.M0(2131749018, null));
            this.l1[1].setText(jb6.M0(2131749017, null));
            this.o1.getNotificationCenter().b(this, nm7.v1);
            return;
        }
        textView.setText(jb6.M0(2131748993, null));
        v5a v5aVar = (v5a) a6a.B(this.a).G.get(str);
        this.m1.setText(String.format("%d%%", Integer.valueOf(v5aVar.j)));
        this.n1.a(false, v5aVar.j / 100.0f);
        this.l1[0].setText(jb6.a0("ImportCount", null, 2131749020, gm.i0(v5aVar.i, false, false), gm.i0(v5aVar.h, false, false)));
        this.t1[1].setText(jb6.M0(2131748998, null));
        this.l1[1].setText(jb6.M0(2131748997, null));
        nm7.f(this.a).b(this, nm7.w1);
    }

    public final void D0() {
        this.r1 = true;
        this.p1.setAutoRepeat(false);
        ap5 ap5Var = this.q1;
        ap5Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(d53.g);
        Property property = View.ALPHA;
        TextView textView = this.m1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -gm.L(10.0f));
        TextView[] textViewArr = this.t1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -gm.L(10.0f));
        TextView[] textViewArr2 = this.l1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -gm.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.n1, property, 0.0f), ObjectAnimator.ofFloat(ap5Var.d, property2, gm.L(8.0f), 0.0f));
        ap5Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        ap5Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        ap5Var.c.d();
        animatorSet.start();
    }

    @Override
    public final void H() {
        super.H();
        yv1 yv1Var = this.o1;
        if (yv1Var != null) {
            yv1Var.getNotificationCenter().n(this, nm7.v1);
        } else {
            nm7.f(this.a).n(this, nm7.w1);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.v1;
        k46 k46Var = this.n1;
        TextView[] textViewArr = this.l1;
        TextView textView = this.m1;
        s09 s09Var = this.p1;
        if (i == i3) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            yv1 yv1Var = this.o1;
            r5a A = yv1Var.getSendMessagesHelper().A(yv1Var.a());
            if (A == null) {
                D0();
                return;
            }
            if (!this.r1 && ((180 - s09Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= A.p) {
                s09Var.setAutoRepeat(false);
                this.r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(A.l)));
            textViewArr[0].setText(jb6.a0("ImportCount", null, 2131749020, gm.i0(A.i, false, false), gm.i0(A.h, false, false)));
            k46Var.a(true, A.l / 100.0f);
        } else if (i == nm7.w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            v5a v5aVar = (v5a) a6a.B(this.a).G.get(this.u1);
            if (v5aVar == null) {
                D0();
                return;
            }
            if (!this.r1 && ((180 - s09Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= v5aVar.n) {
                s09Var.setAutoRepeat(false);
                this.r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(v5aVar.j)));
            textViewArr[0].setText(jb6.a0("ImportCount", null, 2131749020, gm.i0(v5aVar.i, false, false), gm.i0(v5aVar.h, false, false)));
            k46Var.a(true, v5aVar.j / 100.0f);
        }
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            k46 k46Var = this.n1;
            if (k46Var != null) {
                k46Var.setProgressColor(cmb.v0(cmb.Ei, this.J0));
                k46Var.setBackColor(cmb.v0(cmb.F5, this.J0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
