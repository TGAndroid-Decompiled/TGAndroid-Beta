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
public final class ep5 extends nx0 implements fn7 {
    public final TextView[] l1;
    public final TextView m1;
    public final n46 n1;
    public final zu1 o1;
    public final e29 p1;
    public final dp5 q1;
    public boolean r1;
    public final b29 s1;
    public final TextView[] t1;
    public final String u1;

    public ep5(Context context, String str, zu1 zu1Var, vnb vnbVar) {
        super(1, vnbVar, context, false);
        this.l1 = new TextView[2];
        this.t1 = new TextView[2];
        ea5 ea5Var = new ea5(this, (byte) 13);
        this.w0 = false;
        this.v0 = false;
        this.o1 = zu1Var;
        this.u1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 20.0f);
        int i = aob.j5;
        yob.X(textView, i, vnbVar);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, tre.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        b29 b29Var = new b29(2131624063, hl.L(120.0f), hl.L(120.0f), false, null);
        this.s1 = b29Var;
        b29Var.E(true);
        ?? imageView = new ImageView(context);
        this.p1 = imageView;
        imageView.setAutoRepeat(true);
        imageView.f(2131624064, 120, 120, null);
        imageView.d();
        frameLayout.addView((View) imageView, tre.d(160, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        imageView.getAnimatedDrawable().N(178, ea5Var);
        TextView textView2 = new TextView(context);
        this.m1 = textView2;
        ik8.v(textView2, 1, 24.0f);
        yob.X(textView2, i, vnbVar);
        frameLayout.addView(textView2, tre.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        n46 n46Var = new n46(getContext());
        this.n1 = n46Var;
        int i2 = aob.Fi;
        n46Var.setProgressColor(aob.v0(i2, this.J0));
        n46Var.setBackColor(aob.v0(aob.G5, this.J0));
        frameLayout.addView(n46Var, tre.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ?? frameLayout2 = new FrameLayout(context);
        View view = new View(context);
        frameLayout2.a = view;
        int L = hl.L(4.0f);
        int v0 = aob.v0(i2, vnbVar);
        int i3 = aob.Hi;
        int v02 = aob.v0(i3, vnbVar);
        hf0 i0 = aob.i0(L, L, L, L, v0, v02, v02);
        uob M = yob.M(i2);
        uob M2 = yob.M(i3);
        view.setBackground(i0);
        yob.j(view, i0, M, M2, vnbVar);
        frameLayout2.addView(view, tre.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.d = linearLayout;
        linearLayout.setOrientation(0);
        frameLayout2.addView(linearLayout, tre.e(-2, -2, 17));
        ?? imageView2 = new ImageView(context);
        frameLayout2.c = imageView2;
        int L2 = hl.L(20.0f);
        int i4 = aob.Ji;
        ShapeDrawable K = aob.K(L2, aob.v0(i4, vnbVar));
        uob M3 = yob.M(i4);
        imageView2.setBackground(K);
        yob.j(imageView2, K, M3, null, vnbVar);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView2, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView2.f(2131624062, 26, 26, null);
        imageView2.setScaleX(0.8f);
        imageView2.setScaleY(0.8f);
        linearLayout.addView((View) imageView2, tre.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        frameLayout2.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        qd4.w(textView3, i4, vnbVar, 1, 14.0f);
        linearLayout.addView(textView3, tre.t(-2, -2, 16, 10, 0, 0, 0));
        this.q1 = frameLayout2;
        frameLayout2.setBackground(null);
        frameLayout2.setText(ob6.M0(2131749016, null));
        frameLayout2.setVisibility(4);
        view.setOnClickListener(new sa5(this, (byte) 9));
        view.setPivotY(hl.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView((View) frameLayout2, tre.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i5 = 0; i5 < 2; i5++) {
            this.l1[i5] = new TextView(context);
            this.l1[i5].setTextSize(1, 16.0f);
            this.l1[i5].setTypeface(hl.o());
            yob.X(this.l1[i5], aob.j5, vnbVar);
            frameLayout.addView(this.l1[i5], tre.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.t1[i5] = new TextView(context);
            this.t1[i5].setTextSize(1, 14.0f);
            yob.X(this.t1[i5], aob.r5, vnbVar);
            this.t1[i5].setGravity(1);
            frameLayout.addView(this.t1[i5], tre.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            TextView[] textViewArr = this.t1;
            if (i5 == 0) {
                textViewArr[i5].setText(ob6.M0(2131749001, null));
            } else {
                textViewArr[i5].setAlpha(0.0f);
                this.t1[i5].setTranslationY(hl.L(10.0f));
                this.l1[i5].setAlpha(0.0f);
                this.l1[i5].setTranslationY(hl.L(10.0f));
            }
        }
        if (this.o1 != null) {
            textView.setText(ob6.M0(2131749000, null));
            i7a A = this.o1.getSendMessagesHelper().A(this.o1.a());
            this.m1.setText(String.format("%d%%", Integer.valueOf(A.l)));
            this.n1.a(false, A.l / 100.0f);
            this.l1[0].setText(ob6.a0("ImportCount", null, 2131749017, hl.i0(A.i, false, false), hl.i0(A.h, false, false)));
            this.t1[1].setText(ob6.M0(2131749015, null));
            this.l1[1].setText(ob6.M0(2131749014, null));
            this.o1.getNotificationCenter().b(this, jn7.v1);
            return;
        }
        textView.setText(ob6.M0(2131748990, null));
        m7a m7aVar = (m7a) r7a.B(this.a).G.get(str);
        this.m1.setText(String.format("%d%%", Integer.valueOf(m7aVar.j)));
        this.n1.a(false, m7aVar.j / 100.0f);
        this.l1[0].setText(ob6.a0("ImportCount", null, 2131749017, hl.i0(m7aVar.i, false, false), hl.i0(m7aVar.h, false, false)));
        this.t1[1].setText(ob6.M0(2131748995, null));
        this.l1[1].setText(ob6.M0(2131748994, null));
        jn7.f(this.a).b(this, jn7.w1);
    }

    public final void E0() {
        this.r1 = true;
        this.p1.setAutoRepeat(false);
        dp5 dp5Var = this.q1;
        dp5Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(k43.g);
        Property property = View.ALPHA;
        TextView textView = this.m1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, property2, -hl.L(10.0f));
        TextView[] textViewArr = this.t1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], property2, -hl.L(10.0f));
        TextView[] textViewArr2 = this.l1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], property2, -hl.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], property2, 0.0f), ObjectAnimator.ofFloat(this.n1, property, 0.0f), ObjectAnimator.ofFloat(dp5Var.d, property2, hl.L(8.0f), 0.0f));
        dp5Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        dp5Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        dp5Var.c.d();
        animatorSet.start();
    }

    @Override
    public final void H() {
        super.H();
        zu1 zu1Var = this.o1;
        if (zu1Var != null) {
            zu1Var.getNotificationCenter().n(this, jn7.v1);
        } else {
            jn7.f(this.a).n(this, jn7.w1);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.v1;
        n46 n46Var = this.n1;
        TextView[] textViewArr = this.l1;
        TextView textView = this.m1;
        e29 e29Var = this.p1;
        if (i == i3) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            zu1 zu1Var = this.o1;
            i7a A = zu1Var.getSendMessagesHelper().A(zu1Var.a());
            if (A == null) {
                E0();
                return;
            }
            if (!this.r1 && ((180 - e29Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= A.p) {
                e29Var.setAutoRepeat(false);
                this.r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(A.l)));
            textViewArr[0].setText(ob6.a0("ImportCount", null, 2131749017, hl.i0(A.i, false, false), hl.i0(A.h, false, false)));
            n46Var.a(true, A.l / 100.0f);
        } else if (i == jn7.w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            m7a m7aVar = (m7a) r7a.B(this.a).G.get(this.u1);
            if (m7aVar == null) {
                E0();
                return;
            }
            if (!this.r1 && ((180 - e29Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= m7aVar.n) {
                e29Var.setAutoRepeat(false);
                this.r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(m7aVar.j)));
            textViewArr[0].setText(ob6.a0("ImportCount", null, 2131749017, hl.i0(m7aVar.i, false, false), hl.i0(m7aVar.h, false, false)));
            n46Var.a(true, m7aVar.j / 100.0f);
        }
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            n46 n46Var = this.n1;
            if (n46Var != null) {
                n46Var.setProgressColor(aob.v0(aob.Fi, this.J0));
                n46Var.setBackColor(aob.v0(aob.G5, this.J0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
