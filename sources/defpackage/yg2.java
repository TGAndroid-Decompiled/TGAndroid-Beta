package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class yg2 extends mz0 {
    public static final int f2 = -2;
    public final TL_account.TL_connectedBot S1;
    public final TLRPC.User T1;
    public final t51 U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final b61 X1;
    public final b61 Y1;
    public l7c Z1;
    public boolean a2;
    public Boolean b2;
    public int c2;
    public int d2;
    public int e2;

    public yg2(Activity activity, TL_account.TL_connectedBot tL_connectedBot, ge7 ge7Var, ylb ylbVar) {
        super(2, ylbVar, (Context) activity, false);
        this.S1 = tL_connectedBot;
        TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(tL_connectedBot.bot_id));
        this.T1 = W1;
        this.E1 = gm.L(36.0f);
        this.u1 = 0.15f;
        t51 t51Var = new t51(activity, this.a, new xf2(this, (byte) 1), ylbVar);
        this.U1 = t51Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.a2 = tL_businessBotRecipients.exclude_selected;
        t51Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        pc0 pc0Var = new pc0((ylb) null);
        bf0 bf0Var = new bf0(activity);
        bf0Var.setRoundRadius(gm.L(40.0f));
        pc0Var.q(W1);
        bf0Var.f(W1, pc0Var);
        linearLayout.addView(bf0Var, qoe.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        anb.X(textView, cmb.F6, ylbVar);
        textView.setGravity(17);
        textView.setTypeface(gm.o());
        textView.setText(m9c.r(W1));
        linearLayout.addView(textView, qoe.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.o1.setTitle(m9c.r(W1));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.x6, ylbVar);
        hg9.p(textView2, 17, null, 2131745294);
        linearLayout.addView(textView2, qoe.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String p = m9c.p(W1);
        if (!TextUtils.isEmpty(p)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            anb.X(textView3, cmb.Wc, ylbVar);
            textView3.setText("@" + p);
            textView3.setGravity(17);
            linearLayout.addView(textView3, qoe.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i = cmb.Z6;
        s0(cmb.v0(i, this.J0));
        L(i);
        this.c2 = this.H0;
        r59 r59Var = this.n1;
        int i2 = this.u0;
        r59Var.setPadding(i2, 0, i2, gm.L(72.0f));
        this.n1.r1();
        this.n1.setOnItemClickListener(new u(this, (byte) 14));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        frameLayout.setPadding(gm.L(12.0f), gm.L(6.0f), gm.L(12.0f), gm.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, cmb.v0(i, this.J0)), cmb.v0(i, this.J0), cmb.v0(i, this.J0)}));
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        this.X1 = b61Var;
        int v0 = cmb.v0(cmb.mk, this.J0);
        this.e2 = v0;
        b61Var.setColor(v0);
        b61Var.setText(jb6.M0(2131743890, null));
        b61Var.setOnClickListener(new b0(this, tL_connectedBot, ge7Var, (byte) 23));
        frameLayout.addView(b61Var, qoe.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        b61 b61Var2 = new b61(ylbVar, activity, true);
        b61Var2.setRoundRadius(24);
        this.Y1 = b61Var2;
        b61Var2.setText(jb6.M0(2131752738, null));
        b61Var2.setOnClickListener(new rc1(this, tL_connectedBot, (byte) 20));
        frameLayout.addView(b61Var2, qoe.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        Y0(false);
        FrameLayout.LayoutParams e = qoe.e(-1, -2, 80);
        int i3 = e.leftMargin;
        int i4 = this.u0;
        e.leftMargin = i3 + i4;
        e.rightMargin += i4;
        this.b.addView(frameLayout, e);
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        l7c l7cVar = this.Z1;
        if (l7cVar != null) {
            l7cVar.O(false);
        }
    }

    @Override
    public final boolean C() {
        t51 t51Var = this.U1;
        if (t51Var != null) {
            t51Var.g();
        }
        return false;
    }

    @Override
    public final boolean E() {
        t51 t51Var = this.U1;
        if (t51Var != null && t51Var.g()) {
            return false;
        }
        return this.d0;
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, true, new h92(this, (byte) 4), this.J0);
        this.Z1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return null;
    }

    @Override
    public final void L0(float f) {
        lka titleTextView = this.o1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
    }

    public final void Y0(boolean z) {
        final boolean z2;
        float f;
        float f3;
        float f4;
        float f5;
        int i;
        float f6;
        float f7;
        float f8;
        float f9;
        int i2 = 0;
        t51 t51Var = this.U1;
        if (t51Var != null && t51Var.g()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = this.b2;
        if (bool != null && bool.booleanValue() == z2) {
            return;
        }
        this.b2 = Boolean.valueOf(z2);
        float f10 = 0.0f;
        b61 b61Var = this.Y1;
        b61 b61Var2 = this.X1;
        float f11 = 0.8f;
        if (!z) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            b61Var.setVisibility(i);
            b61Var.animate().cancel();
            if (z2) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            b61Var.setAlpha(f6);
            if (z2) {
                f7 = 1.0f;
            } else {
                f7 = 0.8f;
            }
            b61Var.setScaleX(f7);
            if (z2) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            b61Var.setScaleY(f8);
            if (z2) {
                i2 = 8;
            }
            b61Var2.setVisibility(i2);
            b61Var2.animate().cancel();
            if (!z2) {
                f10 = 1.0f;
            }
            b61Var2.setAlpha(f10);
            if (!z2) {
                f9 = 1.0f;
            } else {
                f9 = 0.8f;
            }
            b61Var2.setScaleX(f9);
            if (!z2) {
                f11 = 1.0f;
            }
            b61Var2.setScaleY(f11);
            return;
        }
        b61Var.setVisibility(0);
        ViewPropertyAnimator animate = b61Var.animate();
        if (z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f);
        if (z2) {
            f3 = 1.0f;
        } else {
            f3 = 0.8f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f3);
        if (z2) {
            f4 = 1.0f;
        } else {
            f4 = 0.8f;
        }
        ViewPropertyAnimator duration = scaleX.scaleY(f4).setDuration(320L);
        d53 d53Var = d53.h;
        duration.setInterpolator(d53Var).withEndAction(new Runnable(this) {
            public final yg2 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z2;
                yg2 yg2Var = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            yg2Var.Y1.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (z3) {
                            yg2Var.X1.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        b61Var2.setVisibility(0);
        ViewPropertyAnimator animate2 = b61Var2.animate();
        if (!z2) {
            f10 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate2.alpha(f10);
        if (!z2) {
            f5 = 1.0f;
        } else {
            f5 = 0.8f;
        }
        ViewPropertyAnimator scaleX2 = alpha2.scaleX(f5);
        if (!z2) {
            f11 = 1.0f;
        }
        scaleX2.scaleY(f11).setDuration(320L).setInterpolator(d53Var).withEndAction(new Runnable(this) {
            public final yg2 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z2;
                yg2 yg2Var = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            yg2Var.Y1.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (z3) {
                            yg2Var.X1.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    @Override
    public final void p0() {
        int i;
        try {
            super.p0();
            int i2 = cmb.Z6;
            int v0 = cmb.v0(i2, this.J0);
            if (v0 != this.d2) {
                this.d2 = v0;
                s0(v0);
                FrameLayout frameLayout = this.W1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, v0), v0, v0}));
                }
            }
            int v02 = cmb.v0(cmb.mk, this.J0);
            b61 b61Var = this.X1;
            if (b61Var != null && v02 != this.e2) {
                this.e2 = v02;
                b61Var.setColor(v02);
            }
            int v03 = cmb.v0(i2, this.J0);
            if (this.G0 < 0 && (i = this.H0) == this.c2 && v03 != i) {
                this.H0 = v03;
                this.c2 = v03;
                x0(v03);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
