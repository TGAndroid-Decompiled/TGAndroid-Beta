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
public final class mf2 extends fy0 {
    public static final int f2 = -2;
    public final TL_account.TL_connectedBot S1;
    public final TLRPC.User T1;
    public final m41 U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final u41 X1;
    public final u41 Y1;
    public l5c Z1;
    public boolean a2;
    public Boolean b2;
    public int c2;
    public int d2;
    public int e2;

    public mf2(Activity activity, TL_account.TL_connectedBot tL_connectedBot, on7 on7Var, wjb wjbVar) {
        super(2, wjbVar, (Context) activity, false);
        this.S1 = tL_connectedBot;
        TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(tL_connectedBot.bot_id));
        this.T1 = V1;
        this.E1 = gl.L(36.0f);
        this.u1 = 0.15f;
        m41 m41Var = new m41(activity, this.a, new hq1(this, (byte) 26), wjbVar);
        this.U1 = m41Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.a2 = tL_businessBotRecipients.exclude_selected;
        m41Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        pb0 pb0Var = new pb0((wjb) null);
        be0 be0Var = new be0(activity);
        be0Var.setRoundRadius(gl.L(40.0f));
        pb0Var.q(V1);
        be0Var.f(V1, pb0Var);
        linearLayout.addView(be0Var, nme.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        zkb.X(textView, bkb.F6, wjbVar);
        textView.setGravity(17);
        textView.setTypeface(gl.o());
        textView.setText(l7c.q(V1));
        linearLayout.addView(textView, nme.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.o1.setTitle(l7c.q(V1));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.x6, wjbVar);
        de9.q(textView2, 17, null, 2131745368);
        linearLayout.addView(textView2, nme.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String o = l7c.o(V1);
        if (!TextUtils.isEmpty(o)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            zkb.X(textView3, bkb.Wc, wjbVar);
            textView3.setText("@" + o);
            textView3.setGravity(17);
            linearLayout.addView(textView3, nme.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i = bkb.Z6;
        s0(bkb.v0(i, this.J0));
        M(i);
        this.c2 = this.H0;
        o39 o39Var = this.n1;
        int i2 = this.u0;
        o39Var.setPadding(i2, 0, i2, gl.L(72.0f));
        this.n1.r1();
        this.n1.setOnItemClickListener(new u(this, (byte) 13));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        frameLayout.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, bkb.v0(i, this.J0)), bkb.v0(i, this.J0), bkb.v0(i, this.J0)}));
        u41 u41Var = new u41(wjbVar, activity, true);
        u41Var.setRoundRadius(24);
        this.X1 = u41Var;
        int v0 = bkb.v0(bkb.mk, this.J0);
        this.e2 = v0;
        u41Var.setColor(v0);
        u41Var.setText(k96.M0(2131743964, null));
        u41Var.setOnClickListener(new b0(this, tL_connectedBot, on7Var, (byte) 23));
        frameLayout.addView(u41Var, nme.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        u41 u41Var2 = new u41(wjbVar, activity, true);
        u41Var2.setRoundRadius(24);
        this.Y1 = u41Var2;
        u41Var2.setText(k96.M0(2131752773, null));
        u41Var2.setOnClickListener(new kb1(this, tL_connectedBot, (byte) 19));
        frameLayout.addView(u41Var2, nme.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        Y0(false);
        FrameLayout.LayoutParams e = nme.e(-1, -2, 80);
        int i3 = e.leftMargin;
        int i4 = this.u0;
        e.leftMargin = i3 + i4;
        e.rightMargin += i4;
        this.b.addView(frameLayout, e);
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        l5c l5cVar = this.Z1;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
    }

    @Override
    public final boolean E() {
        m41 m41Var = this.U1;
        if (m41Var != null) {
            m41Var.g();
        }
        return false;
    }

    @Override
    public final boolean F() {
        m41 m41Var = this.U1;
        if (m41Var != null && m41Var.g()) {
            return false;
        }
        return this.d0;
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, true, new w72(this, (byte) 4), this.J0);
        this.Z1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return null;
    }

    @Override
    public final void L0(float f) {
        jia titleTextView = this.o1.getTitleTextView();
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
        m41 m41Var = this.U1;
        if (m41Var != null && m41Var.g()) {
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
        u41 u41Var = this.Y1;
        u41 u41Var2 = this.X1;
        float f11 = 0.8f;
        if (!z) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            u41Var.setVisibility(i);
            u41Var.animate().cancel();
            if (z2) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            u41Var.setAlpha(f6);
            if (z2) {
                f7 = 1.0f;
            } else {
                f7 = 0.8f;
            }
            u41Var.setScaleX(f7);
            if (z2) {
                f8 = 1.0f;
            } else {
                f8 = 0.8f;
            }
            u41Var.setScaleY(f8);
            if (z2) {
                i2 = 8;
            }
            u41Var2.setVisibility(i2);
            u41Var2.animate().cancel();
            if (!z2) {
                f10 = 1.0f;
            }
            u41Var2.setAlpha(f10);
            if (!z2) {
                f9 = 1.0f;
            } else {
                f9 = 0.8f;
            }
            u41Var2.setScaleX(f9);
            if (!z2) {
                f11 = 1.0f;
            }
            u41Var2.setScaleY(f11);
            return;
        }
        u41Var.setVisibility(0);
        ViewPropertyAnimator animate = u41Var.animate();
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
        s33 s33Var = s33.h;
        duration.setInterpolator(s33Var).withEndAction(new Runnable(this) {
            public final mf2 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z2;
                mf2 mf2Var = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            mf2Var.Y1.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (z3) {
                            mf2Var.X1.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        u41Var2.setVisibility(0);
        ViewPropertyAnimator animate2 = u41Var2.animate();
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
        scaleX2.scaleY(f11).setDuration(320L).setInterpolator(s33Var).withEndAction(new Runnable(this) {
            public final mf2 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                boolean z3 = z2;
                mf2 mf2Var = this.b;
                switch (b) {
                    case 0:
                        if (!z3) {
                            mf2Var.Y1.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (z3) {
                            mf2Var.X1.setVisibility(8);
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
            int i2 = bkb.Z6;
            int v0 = bkb.v0(i2, this.J0);
            if (v0 != this.d2) {
                this.d2 = v0;
                s0(v0);
                FrameLayout frameLayout = this.W1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{bkb.p1(0.0f, v0), v0, v0}));
                }
            }
            int v02 = bkb.v0(bkb.mk, this.J0);
            u41 u41Var = this.X1;
            if (u41Var != null && v02 != this.e2) {
                this.e2 = v02;
                u41Var.setColor(v02);
            }
            int v03 = bkb.v0(i2, this.J0);
            if (this.G0 < 0 && (i = this.H0) == this.c2 && v03 != i) {
                this.H0 = v03;
                this.c2 = v03;
                x0(v03);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
