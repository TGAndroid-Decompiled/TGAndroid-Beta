package kg;

import ai.v2;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.i8;
import c8.ma;
import hi.e7;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.jw0;
public final class l0 extends sa {
    public static final int f18370g2 = -1;
    public static final int f18371h2 = -2;
    public final TL_account.TL_connectedBot T1;
    public final TLRPC.User U1;
    public final a0 V1;
    public final LinearLayout W1;
    public final FrameLayout X1;
    public final hi.d Y1;
    public final hi.d Z1;
    public z41 f18372a2;
    public boolean f18373b2;
    public Boolean f18374c2;
    public int d2;
    public int f18375e2;
    public int f18376f2;

    public l0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, jw0 jw0Var, i6 i6Var) {
        super(2, (Context) activity, i6Var, false);
        this.T1 = tL_connectedBot;
        TLRPC.User c22 = mp.u1(this.f30189a).c2(Long.valueOf(tL_connectedBot.bot_id));
        this.U1 = c22;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.f39541v1 = 0.15f;
        a0 a0Var = new a0(activity, this.f30189a, new j0(this, 0), i6Var);
        this.V1 = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f18373b2 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W1 = linearLayout;
        linearLayout.setOrientation(1);
        b9 b9Var = new b9((i6) null);
        q9 q9Var = new q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        b9Var.r(c22);
        q9Var.f(c22, b9Var);
        linearLayout.addView(q9Var, ma.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        u6.U(textView, n6.G6, i6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(o10.q(c22));
        linearLayout.addView(textView, ma.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.f39535p1.setTitle(o10.q(c22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, n6.f29788y6, i6Var);
        f3.k(textView2, 17, null, 2131745365);
        linearLayout.addView(textView2, ma.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String o4 = o10.o(c22);
        if (!TextUtils.isEmpty(o4)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            u6.U(textView3, n6.Xc, i6Var);
            textView3.setText("@" + o4);
            textView3.setGravity(17);
            linearLayout.addView(textView3, ma.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i7 = n6.f29339a7;
        v0(n6.w0(i7, this.J0));
        Q(i7);
        this.d2 = this.H0;
        ck0 ck0Var = this.f39534o1;
        int i10 = this.f30227u0;
        ck0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(72.0f));
        this.f39534o1.r1();
        this.f39534o1.setOnItemClickListener(new i8(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n6.r1(0.0f, n6.w0(i7, this.J0)), n6.w0(i7, this.J0), n6.w0(i7, this.J0)}));
        hi.d dVar = new hi.d(activity, i6Var, true);
        dVar.setRoundRadius(24);
        this.Y1 = dVar;
        int w02 = n6.w0(n6.nk, this.J0);
        this.f18376f2 = w02;
        dVar.setColor(w02);
        dVar.setText(gd.M0(2131743970, null));
        dVar.setOnClickListener(new ah.h(this, tL_connectedBot, jw0Var, 17));
        frameLayout.addView(dVar, ma.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        hi.d dVar2 = new hi.d(activity, i6Var, true);
        dVar2.setRoundRadius(24);
        this.Z1 = dVar2;
        dVar2.setText(gd.M0(2131752774, null));
        dVar2.setOnClickListener(new v2(26, this, tL_connectedBot));
        frameLayout.addView(dVar2, ma.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        e1(false);
        FrameLayout.LayoutParams e10 = ma.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.f30227u0;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.f30192b.addView(frameLayout, e10);
        v4.k kVar = new v4.k();
        kVar.f59151m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.f39534o1.setItemAnimator(kVar);
        z41 z41Var = this.f18372a2;
        if (z41Var != null) {
            z41Var.O(false);
        }
    }

    @Override
    public final boolean G() {
        a0 a0Var = this.V1;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override
    public final boolean I() {
        a0 a0Var = this.V1;
        if (a0Var != null && a0Var.g()) {
            return false;
        }
        return this.f30198d0;
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.f30189a, 0, true, new e7(this, 9), this.J0);
        this.f18372a2 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return null;
    }

    @Override
    public final void R0(float f10) {
        n5 titleTextView = this.f39535p1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void e1(boolean z10) {
        final boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        int i7;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10 = 0;
        a0 a0Var = this.V1;
        if (a0Var != null && a0Var.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f18374c2;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f18374c2 = Boolean.valueOf(z11);
        float f18 = 0.0f;
        hi.d dVar = this.Y1;
        hi.d dVar2 = this.Z1;
        float f19 = 0.8f;
        if (!z10) {
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            dVar2.setVisibility(i7);
            dVar2.animate().cancel();
            if (z11) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            dVar2.setAlpha(f14);
            if (z11) {
                f15 = 1.0f;
            } else {
                f15 = 0.8f;
            }
            dVar2.setScaleX(f15);
            if (z11) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            dVar2.setScaleY(f16);
            if (z11) {
                i10 = 8;
            }
            dVar.setVisibility(i10);
            dVar.animate().cancel();
            if (!z11) {
                f18 = 1.0f;
            }
            dVar.setAlpha(f18);
            if (!z11) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            dVar.setScaleX(f17);
            if (!z11) {
                f19 = 1.0f;
            }
            dVar.setScaleY(f19);
            return;
        }
        dVar2.setVisibility(0);
        ViewPropertyAnimator animate = dVar2.animate();
        if (z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (z11) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(320L);
        lr lrVar = lr.h;
        duration.setInterpolator(lrVar).withEndAction(new Runnable(this) {
            public final l0 f18367b;

            {
                this.f18367b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        l0 l0Var = this.f18367b;
                        if (!z12) {
                            l0Var.Z1.setVisibility(8);
                            return;
                        } else {
                            l0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        l0 l0Var2 = this.f18367b;
                        if (z13) {
                            l0Var2.Y1.setVisibility(8);
                            return;
                        } else {
                            l0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
        dVar.setVisibility(0);
        ViewPropertyAnimator animate2 = dVar.animate();
        if (!z11) {
            f18 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate2.alpha(f18);
        if (!z11) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
        if (!z11) {
            f19 = 1.0f;
        }
        scaleX2.scaleY(f19).setDuration(320L).setInterpolator(lrVar).withEndAction(new Runnable(this) {
            public final l0 f18367b;

            {
                this.f18367b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        l0 l0Var = this.f18367b;
                        if (!z12) {
                            l0Var.Z1.setVisibility(8);
                            return;
                        } else {
                            l0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        l0 l0Var2 = this.f18367b;
                        if (z13) {
                            l0Var2.Y1.setVisibility(8);
                            return;
                        } else {
                            l0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final void s0() {
        int i7;
        try {
            super.s0();
            int i10 = n6.f29339a7;
            int w02 = n6.w0(i10, this.J0);
            if (w02 != this.f18375e2) {
                this.f18375e2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.X1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = n6.w0(n6.nk, this.J0);
            hi.d dVar = this.Y1;
            if (dVar != null && w03 != this.f18376f2) {
                this.f18376f2 = w03;
                dVar.setColor(w03);
            }
            int w04 = n6.w0(i10, this.J0);
            if (this.G0 < 0 && (i7 = this.H0) == this.d2 && w04 != i7) {
                this.H0 = w04;
                this.d2 = w04;
                E0(w04);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
