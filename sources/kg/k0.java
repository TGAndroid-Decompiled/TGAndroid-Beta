package kg;

import ai.o2;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.n8;
import c8.na;
import hi.e7;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sa;
import org.telegram.ui.zn0;
public final class k0 extends sa {
    public static final int f18363g2 = -1;
    public static final int f18364h2 = -2;
    public final TL_account.TL_connectedBot T1;
    public final TLRPC.User U1;
    public final b0 V1;
    public final LinearLayout W1;
    public final FrameLayout X1;
    public final hi.d Y1;
    public final hi.d Z1;
    public c51 f18365a2;
    public boolean f18366b2;
    public Boolean f18367c2;
    public int d2;
    public int f18368e2;
    public int f18369f2;

    public k0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, zn0 zn0Var, h6 h6Var) {
        super(2, (Context) activity, h6Var, false);
        this.T1 = tL_connectedBot;
        TLRPC.User c22 = np.u1(this.f30139a).c2(Long.valueOf(tL_connectedBot.bot_id));
        this.U1 = c22;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.f39494v1 = 0.15f;
        b0 b0Var = new b0(activity, this.f30139a, new hi.b0(this, 29), h6Var);
        this.V1 = b0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f18366b2 = tL_businessBotRecipients.exclude_selected;
        b0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W1 = linearLayout;
        linearLayout.setOrientation(1);
        b9 b9Var = new b9((h6) null);
        q9 q9Var = new q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        b9Var.r(c22);
        q9Var.f(c22, b9Var);
        linearLayout.addView(q9Var, na.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        t6.U(textView, m6.G6, h6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(p10.q(c22));
        linearLayout.addView(textView, na.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.f39488p1.setTitle(p10.q(c22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, m6.f29739y6, h6Var);
        f3.k(textView2, 17, null, 2131745364);
        linearLayout.addView(textView2, na.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String o4 = p10.o(c22);
        if (!TextUtils.isEmpty(o4)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            t6.U(textView3, m6.Xc, h6Var);
            textView3.setText("@" + o4);
            textView3.setGravity(17);
            linearLayout.addView(textView3, na.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i7 = m6.f29290a7;
        v0(m6.w0(i7, this.J0));
        Q(i7);
        this.d2 = this.H0;
        ek0 ek0Var = this.f39487o1;
        int i10 = this.f30177u0;
        ek0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(72.0f));
        this.f39487o1.r1();
        this.f39487o1.setOnItemClickListener(new n8(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, m6.w0(i7, this.J0)), m6.w0(i7, this.J0), m6.w0(i7, this.J0)}));
        hi.d dVar = new hi.d(activity, h6Var, true);
        dVar.setRoundRadius(24);
        this.Y1 = dVar;
        int w02 = m6.w0(m6.nk, this.J0);
        this.f18369f2 = w02;
        dVar.setColor(w02);
        dVar.setText(hd.N0(2131743964, null));
        dVar.setOnClickListener(new ah.h(this, tL_connectedBot, zn0Var, 17));
        frameLayout.addView(dVar, na.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        hi.d dVar2 = new hi.d(activity, h6Var, true);
        dVar2.setRoundRadius(24);
        this.Z1 = dVar2;
        dVar2.setText(hd.N0(2131752773, null));
        dVar2.setOnClickListener(new o2(25, this, tL_connectedBot));
        frameLayout.addView(dVar2, na.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        e1(false);
        FrameLayout.LayoutParams e10 = na.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.f30177u0;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.f30142b.addView(frameLayout, e10);
        v4.k kVar = new v4.k();
        kVar.f59139m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f39487o1.setItemAnimator(kVar);
        c51 c51Var = this.f18365a2;
        if (c51Var != null) {
            c51Var.O(false);
        }
    }

    @Override
    public final boolean G() {
        b0 b0Var = this.V1;
        if (b0Var != null) {
            b0Var.g();
        }
        return false;
    }

    @Override
    public final boolean I() {
        b0 b0Var = this.V1;
        if (b0Var != null && b0Var.g()) {
            return false;
        }
        return this.f30148d0;
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.f30139a, 0, true, new e7(this, 9), this.J0);
        this.f18365a2 = c51Var;
        c51Var.f34026r = false;
        return c51Var;
    }

    @Override
    public final CharSequence P0() {
        return null;
    }

    @Override
    public final void R0(float f10) {
        m5 titleTextView = this.f39488p1.getTitleTextView();
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
        b0 b0Var = this.V1;
        if (b0Var != null && b0Var.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f18367c2;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f18367c2 = Boolean.valueOf(z11);
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
        nr nrVar = nr.h;
        duration.setInterpolator(nrVar).withEndAction(new Runnable(this) {
            public final k0 f18356b;

            {
                this.f18356b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f18356b;
                        if (!z12) {
                            k0Var.Z1.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f18356b;
                        if (z13) {
                            k0Var2.Y1.setVisibility(8);
                            return;
                        } else {
                            k0Var2.getClass();
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
        scaleX2.scaleY(f19).setDuration(320L).setInterpolator(nrVar).withEndAction(new Runnable(this) {
            public final k0 f18356b;

            {
                this.f18356b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f18356b;
                        if (!z12) {
                            k0Var.Z1.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f18356b;
                        if (z13) {
                            k0Var2.Y1.setVisibility(8);
                            return;
                        } else {
                            k0Var2.getClass();
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
            int i10 = m6.f29290a7;
            int w02 = m6.w0(i10, this.J0);
            if (w02 != this.f18368e2) {
                this.f18368e2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.X1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = m6.w0(m6.nk, this.J0);
            hi.d dVar = this.Y1;
            if (dVar != null && w03 != this.f18369f2) {
                this.f18369f2 = w03;
                dVar.setColor(w03);
            }
            int w04 = m6.w0(i10, this.J0);
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
