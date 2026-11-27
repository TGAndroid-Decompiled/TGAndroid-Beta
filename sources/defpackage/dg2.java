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
public final class dg2 extends ny0 {
    public static final int f2 = -2;
    public final TL_account.TL_connectedBot S1;
    public final TLRPC.User T1;
    public final u41 U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final c51 X1;
    public final c51 Y1;
    public l9c Z1;
    public boolean a2;
    public Boolean b2;
    public int c2;
    public int d2;
    public int e2;

    public dg2(Activity activity, TL_account.TL_connectedBot tL_connectedBot, oe7 oe7Var, vnb vnbVar) {
        super(2, vnbVar, (Context) activity, false);
        this.S1 = tL_connectedBot;
        TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(tL_connectedBot.bot_id));
        this.T1 = X1;
        this.E1 = hl.L(36.0f);
        this.u1 = 0.15f;
        u41 u41Var = new u41(activity, this.a, new vd2(this, (byte) 2), vnbVar);
        this.U1 = u41Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.a2 = tL_businessBotRecipients.exclude_selected;
        u41Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        rb0 rb0Var = new rb0((vnb) null);
        de0 de0Var = new de0(activity);
        de0Var.setRoundRadius(hl.L(40.0f));
        rb0Var.q(X1);
        de0Var.f(X1, rb0Var);
        linearLayout.addView(de0Var, tre.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        yob.X(textView, aob.G6, vnbVar);
        textView.setGravity(17);
        textView.setTypeface(hl.o());
        textView.setText(lbc.r(X1));
        linearLayout.addView(textView, tre.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.o1.setTitle(lbc.r(X1));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.y6, vnbVar);
        uh9.q(textView2, 17, null, 2131745288);
        linearLayout.addView(textView2, tre.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String p = lbc.p(X1);
        if (!TextUtils.isEmpty(p)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            yob.X(textView3, aob.Xc, vnbVar);
            textView3.setText("@" + p);
            textView3.setGravity(17);
            linearLayout.addView(textView3, tre.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i = aob.a7;
        s0(aob.v0(i, this.J0));
        L(i);
        this.c2 = this.H0;
        d79 d79Var = this.n1;
        int i2 = this.u0;
        d79Var.setPadding(i2, 0, i2, hl.L(72.0f));
        this.n1.s1();
        this.n1.setOnItemClickListener(new u(this, (byte) 13));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        frameLayout.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, aob.v0(i, this.J0)), aob.v0(i, this.J0), aob.v0(i, this.J0)}));
        c51 c51Var = new c51(vnbVar, activity, true);
        c51Var.setRoundRadius(24);
        this.X1 = c51Var;
        int v0 = aob.v0(aob.nk, this.J0);
        this.e2 = v0;
        c51Var.setColor(v0);
        c51Var.setText(ob6.M0(2131743858, null));
        c51Var.setOnClickListener(new c0(this, tL_connectedBot, oe7Var, (byte) 23));
        frameLayout.addView(c51Var, tre.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        c51 c51Var2 = new c51(vnbVar, activity, true);
        c51Var2.setRoundRadius(24);
        this.Y1 = c51Var2;
        c51Var2.setText(ob6.M0(2131752766, null));
        c51Var2.setOnClickListener(new sb1(this, tL_connectedBot, (byte) 21));
        frameLayout.addView(c51Var2, tre.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        Z0(false);
        FrameLayout.LayoutParams e = tre.e(-1, -2, 80);
        int i3 = e.leftMargin;
        int i4 = this.u0;
        e.leftMargin = i3 + i4;
        e.rightMargin += i4;
        this.b.addView(frameLayout, e);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.n1.setItemAnimator(zb3Var);
        l9c l9cVar = this.Z1;
        if (l9cVar != null) {
            l9cVar.O(false);
        }
    }

    @Override
    public final boolean D() {
        u41 u41Var = this.U1;
        if (u41Var != null) {
            u41Var.g();
        }
        return false;
    }

    @Override
    public final boolean E() {
        u41 u41Var = this.U1;
        if (u41Var != null && u41Var.g()) {
            return false;
        }
        return this.d0;
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new n82(this, (byte) 4), this.J0);
        this.Z1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return null;
    }

    @Override
    public final void M0(float f) {
        ema titleTextView = this.o1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f);
        }
    }

    public final void Z0(boolean z) {
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
        u41 u41Var = this.U1;
        if (u41Var != null && u41Var.g()) {
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
        c51 c51Var = this.Y1;
        c51 c51Var2 = this.X1;
        float f11 = 0.8f;
        if (!z) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            c51Var.setVisibility(i);
            c51Var.animate().cancel();
            if (z2) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            c51Var.setAlpha(f6);
            if (z2) {
                f7 = 1.0f;
            } else {
                f7 = 0.8f;
            }
            c51Var.setScaleX(f7);
            if (z2) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            c51Var.setScaleY(f8);
            if (z2) {
                i2 = 8;
            }
            c51Var2.setVisibility(i2);
            c51Var2.animate().cancel();
            if (!z2) {
                f10 = 1.0f;
            }
            c51Var2.setAlpha(f10);
            if (!z2) {
                f9 = 1.0f;
            } else {
                f9 = 0.8f;
            }
            c51Var2.setScaleX(f9);
            if (!z2) {
                f11 = 1.0f;
            }
            c51Var2.setScaleY(f11);
            return;
        }
        c51Var.setVisibility(0);
        ViewPropertyAnimator animate = c51Var.animate();
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
        k43 k43Var = k43.h;
        duration.setInterpolator(k43Var).withEndAction(new Runnable(this) {
            public final dg2 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z2;
                dg2 dg2Var = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            dg2Var.Y1.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (z3) {
                            dg2Var.X1.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        c51Var2.setVisibility(0);
        ViewPropertyAnimator animate2 = c51Var2.animate();
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
        scaleX2.scaleY(f11).setDuration(320L).setInterpolator(k43Var).withEndAction(new Runnable(this) {
            public final dg2 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z2;
                dg2 dg2Var = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            dg2Var.Y1.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (z3) {
                            dg2Var.X1.setVisibility(8);
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
            int i2 = aob.a7;
            int v0 = aob.v0(i2, this.J0);
            if (v0 != this.d2) {
                this.d2 = v0;
                s0(v0);
                FrameLayout frameLayout = this.W1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, v0), v0, v0}));
                }
            }
            int v02 = aob.v0(aob.nk, this.J0);
            c51 c51Var = this.X1;
            if (c51Var != null && v02 != this.e2) {
                this.e2 = v02;
                c51Var.setColor(v02);
            }
            int v03 = aob.v0(i2, this.J0);
            if (this.G0 < 0 && (i = this.H0) == this.c2 && v03 != i) {
                this.H0 = v03;
                this.c2 = v03;
                y0(v03);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
