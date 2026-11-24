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
public final class bn5 extends fx0 implements gk7 {
    public final TextView[] l1;
    public final TextView m1;
    public final j26 n1;
    public final mu1 o1;
    public final ry8 p1;
    public final an5 q1;
    public boolean r1;
    public final oy8 s1;
    public final TextView[] t1;
    public final String u1;

    public bn5(Context context, String str, mu1 mu1Var, wjb wjbVar) {
        super(1, wjbVar, context, false);
        this.l1 = new TextView[2];
        this.t1 = new TextView[2];
        iu4 iu4Var = new iu4(this, (byte) 28);
        this.w0 = false;
        this.v0 = false;
        this.o1 = mu1Var;
        this.u1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        ug8.v(textView, 1, 20.0f);
        int i = bkb.i5;
        zkb.X(textView, i, wjbVar);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, nme.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        oy8 oy8Var = new oy8(2131624063, gl.L(120.0f), gl.L(120.0f), false, null);
        this.s1 = oy8Var;
        oy8Var.E(true);
        ?? imageView = new ImageView(context);
        this.p1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624064, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, nme.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().N(178, iu4Var);
        TextView textView2 = new TextView(context);
        this.m1 = textView2;
        ug8.v(textView2, 1, 24.0f);
        zkb.X(textView2, i, wjbVar);
        frameLayout.addView(textView2, nme.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        j26 j26Var = new j26(getContext());
        this.n1 = j26Var;
        int i2 = bkb.Ei;
        j26Var.setProgressColor(bkb.v0(i2, this.J0));
        j26Var.setBackColor(bkb.v0(bkb.F5, this.J0));
        frameLayout.addView(j26Var, nme.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.a = view;
        int L = gl.L(4.0f);
        int v0 = bkb.v0(i2, wjbVar);
        int i3 = bkb.Gi;
        int v02 = bkb.v0(i3, wjbVar);
        ff0 i0 = bkb.i0(L, L, L, L, v0, v02, v02);
        vkb M = zkb.M(i2);
        vkb M2 = zkb.M(i3);
        view.setBackground(i0);
        zkb.j(view, i0, M, M2, wjbVar);
        frameLayout2.addView(view, nme.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, nme.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.c = imageView2;
        int L2 = gl.L(20.0f);
        int i4 = bkb.Ii;
        ShapeDrawable K = bkb.K(L2, bkb.v0(i4, wjbVar));
        vkb M3 = zkb.M(i4);
        imageView2.setBackground(K);
        zkb.j(imageView2, K, M3, null, wjbVar);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView2, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView2.f(2131624062, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, nme.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        tb4.w(textView3, i4, wjbVar, 1, 14.0f);
        linearLayout.addView(textView3, nme.t(-2, -2, 16, 10, 0, 0, 0));
        this.q1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(k96.M0(2131749070, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new b95(this, (byte) 8));
        view.setPivotY(gl.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, nme.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i5 = 0; i5 < 2; i5++) {
            this.l1[i5] = new TextView(context);
            this.l1[i5].setTextSize(1, 16.0f);
            this.l1[i5].setTypeface(gl.o());
            zkb.X(this.l1[i5], bkb.i5, wjbVar);
            frameLayout.addView(this.l1[i5], nme.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.t1[i5] = new TextView(context);
            this.t1[i5].setTextSize(1, 14.0f);
            zkb.X(this.t1[i5], bkb.q5, wjbVar);
            this.t1[i5].setGravity(1);
            frameLayout.addView(this.t1[i5], nme.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            TextView[] textViewArr = this.t1;
            if (i5 == 0) {
                textViewArr[i5].setText(k96.M0(2131749055, null));
            } else {
                textViewArr[i5].setAlpha(0.0f);
                this.t1[i5].setTranslationY(gl.L(10.0f));
                this.l1[i5].setAlpha(0.0f);
                this.l1[i5].setTranslationY(gl.L(10.0f));
            }
        }
        if (this.o1 != null) {
            textView.setText(k96.M0(2131749054, null));
            p3a A = this.o1.getSendMessagesHelper().A(this.o1.a());
            this.m1.setText(String.format("%d%%", Integer.valueOf(A.l)));
            this.n1.a(false, A.l / 100.0f);
            this.l1[0].setText(k96.a0("ImportCount", null, 2131749071, gl.i0(A.i, false, false), gl.i0(A.h, false, false)));
            this.t1[1].setText(k96.M0(2131749069, null));
            this.l1[1].setText(k96.M0(2131749068, null));
            this.o1.getNotificationCenter().b(this, kk7.u1);
            return;
        }
        textView.setText(k96.M0(2131749044, null));
        u3a u3aVar = (u3a) z3a.B(this.a).G.get(str);
        this.m1.setText(String.format("%d%%", Integer.valueOf(u3aVar.j)));
        this.n1.a(false, u3aVar.j / 100.0f);
        this.l1[0].setText(k96.a0("ImportCount", null, 2131749071, gl.i0(u3aVar.i, false, false), gl.i0(u3aVar.h, false, false)));
        this.t1[1].setText(k96.M0(2131749049, null));
        this.l1[1].setText(k96.M0(2131749048, null));
        kk7.f(this.a).b(this, kk7.v1);
    }

    public final void D0() {
        this.r1 = true;
        this.p1.setAutoRepeat(false);
        an5 an5Var = this.q1;
        an5Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(s33.g);
        Property property = View.ALPHA;
        TextView textView = this.m1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -gl.L(10.0f));
        TextView[] textViewArr = this.t1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -gl.L(10.0f));
        TextView[] textViewArr2 = this.l1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -gl.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.n1, property, 0.0f), ObjectAnimator.ofFloat(an5Var.d, property2, gl.L(8.0f), 0.0f));
        an5Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        an5Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        an5Var.c.d();
        animatorSet.start();
    }

    @Override
    public final void I() {
        super.I();
        mu1 mu1Var = this.o1;
        if (mu1Var != null) {
            mu1Var.getNotificationCenter().n(this, kk7.u1);
        } else {
            kk7.f(this.a).n(this, kk7.v1);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.u1;
        j26 j26Var = this.n1;
        TextView[] textViewArr = this.l1;
        TextView textView = this.m1;
        ry8 ry8Var = this.p1;
        if (i == i3) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            mu1 mu1Var = this.o1;
            p3a A = mu1Var.getSendMessagesHelper().A(mu1Var.a());
            if (A == null) {
                D0();
                return;
            }
            if (!this.r1 && ((180 - ry8Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= A.p) {
                ry8Var.setAutoRepeat(false);
                this.r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(A.l)));
            textViewArr[0].setText(k96.a0("ImportCount", null, 2131749071, gl.i0(A.i, false, false), gl.i0(A.h, false, false)));
            j26Var.a(true, A.l / 100.0f);
        } else if (i == kk7.v1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            u3a u3aVar = (u3a) z3a.B(this.a).G.get(this.u1);
            if (u3aVar == null) {
                D0();
                return;
            }
            if (!this.r1 && ((180 - ry8Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= u3aVar.n) {
                ry8Var.setAutoRepeat(false);
                this.r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(u3aVar.j)));
            textViewArr[0].setText(k96.a0("ImportCount", null, 2131749071, gl.i0(u3aVar.i, false, false), gl.i0(u3aVar.h, false, false)));
            j26Var.a(true, u3aVar.j / 100.0f);
        }
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            j26 j26Var = this.n1;
            if (j26Var != null) {
                j26Var.setProgressColor(bkb.v0(bkb.Ei, this.J0));
                j26Var.setBackColor(bkb.v0(bkb.F5, this.J0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
