package kg;

import ai.p2;
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
import hi.y7;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ra;
import org.telegram.ui.ao0;
public final class k0 extends ra {
    public static final int f18458g2 = -1;
    public static final int f18459h2 = -2;
    public final TL_account.TL_connectedBot T1;
    public final TLRPC.User U1;
    public final b0 V1;
    public final LinearLayout W1;
    public final FrameLayout X1;
    public final hi.e Y1;
    public final hi.e Z1;
    public b51 f18460a2;
    public boolean f18461b2;
    public Boolean f18462c2;
    public int d2;
    public int f18463e2;
    public int f18464f2;

    public k0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, ao0 ao0Var, i6 i6Var) {
        super(2, (Context) activity, i6Var, false);
        this.T1 = tL_connectedBot;
        TLRPC.User c22 = mp.u1(this.f30223a).c2(Long.valueOf(tL_connectedBot.bot_id));
        this.U1 = c22;
        this.F1 = org.telegram.messenger.g0.L(36.0f);
        this.f39253v1 = 0.15f;
        b0 b0Var = new b0(activity, this.f30223a, new i0(this, 0), i6Var);
        this.V1 = b0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f18461b2 = tL_businessBotRecipients.exclude_selected;
        b0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W1 = linearLayout;
        linearLayout.setOrientation(1);
        a9 a9Var = new a9((i6) null);
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        a9Var.r(c22);
        p9Var.f(c22, a9Var);
        linearLayout.addView(p9Var, na.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        u6.U(textView, n6.G6, i6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(n10.q(c22));
        linearLayout.addView(textView, na.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.f39247p1.setTitle(n10.q(c22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        u6.U(textView2, n6.f29843y6, i6Var);
        f3.k(textView2, 17, null, 2131745364);
        linearLayout.addView(textView2, na.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String o4 = n10.o(c22);
        if (!TextUtils.isEmpty(o4)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            u6.U(textView3, n6.Xc, i6Var);
            textView3.setText("@" + o4);
            textView3.setGravity(17);
            linearLayout.addView(textView3, na.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i7 = n6.f29394a7;
        v0(n6.w0(i7, this.J0));
        Q(i7);
        this.d2 = this.H0;
        ek0 ek0Var = this.f39246o1;
        int i10 = this.f30261u0;
        ek0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(72.0f));
        this.f39246o1.r1();
        this.f39246o1.setOnItemClickListener(new n8(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.X1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n6.r1(0.0f, n6.w0(i7, this.J0)), n6.w0(i7, this.J0), n6.w0(i7, this.J0)}));
        hi.e eVar = new hi.e(activity, i6Var, true);
        eVar.setRoundRadius(24);
        this.Y1 = eVar;
        int w02 = n6.w0(n6.nk, this.J0);
        this.f18464f2 = w02;
        eVar.setColor(w02);
        eVar.setText(gd.N0(2131743960, null));
        eVar.setOnClickListener(new ah.h(this, tL_connectedBot, ao0Var, 17));
        frameLayout.addView(eVar, na.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        hi.e eVar2 = new hi.e(activity, i6Var, true);
        eVar2.setRoundRadius(24);
        this.Z1 = eVar2;
        eVar2.setText(gd.N0(2131752773, null));
        eVar2.setOnClickListener(new p2(25, this, tL_connectedBot));
        frameLayout.addView(eVar2, na.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        e1(false);
        FrameLayout.LayoutParams e10 = na.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.f30261u0;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.f30226b.addView(frameLayout, e10);
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(kr.h);
        lVar.n(350L);
        this.f39246o1.setItemAnimator(lVar);
        b51 b51Var = this.f18460a2;
        if (b51Var != null) {
            b51Var.O(false);
        }
    }

    @Override
    public final boolean F() {
        b0 b0Var = this.V1;
        if (b0Var != null) {
            b0Var.g();
        }
        return false;
    }

    @Override
    public final boolean H() {
        b0 b0Var = this.V1;
        if (b0Var != null && b0Var.g()) {
            return false;
        }
        return this.f30232d0;
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        b51 b51Var = new b51(ek0Var, getContext(), this.f30223a, 0, true, new y7(this, 9), this.J0);
        this.f18460a2 = b51Var;
        b51Var.f33631r = false;
        return b51Var;
    }

    @Override
    public final CharSequence P0() {
        return null;
    }

    @Override
    public final void R0(float f10) {
        n5 titleTextView = this.f39247p1.getTitleTextView();
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
        Boolean bool = this.f18462c2;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.f18462c2 = Boolean.valueOf(z11);
        float f18 = 0.0f;
        hi.e eVar = this.Y1;
        hi.e eVar2 = this.Z1;
        float f19 = 0.8f;
        if (!z10) {
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            eVar2.setVisibility(i7);
            eVar2.animate().cancel();
            if (z11) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            eVar2.setAlpha(f14);
            if (z11) {
                f15 = 1.0f;
            } else {
                f15 = 0.8f;
            }
            eVar2.setScaleX(f15);
            if (z11) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            eVar2.setScaleY(f16);
            if (z11) {
                i10 = 8;
            }
            eVar.setVisibility(i10);
            eVar.animate().cancel();
            if (!z11) {
                f18 = 1.0f;
            }
            eVar.setAlpha(f18);
            if (!z11) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            eVar.setScaleX(f17);
            if (!z11) {
                f19 = 1.0f;
            }
            eVar.setScaleY(f19);
            return;
        }
        eVar2.setVisibility(0);
        ViewPropertyAnimator animate = eVar2.animate();
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
        kr krVar = kr.h;
        duration.setInterpolator(krVar).withEndAction(new Runnable(this) {
            public final k0 f18451b;

            {
                this.f18451b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f18451b;
                        if (!z12) {
                            k0Var.Z1.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f18451b;
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
        eVar.setVisibility(0);
        ViewPropertyAnimator animate2 = eVar.animate();
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
        scaleX2.scaleY(f19).setDuration(320L).setInterpolator(krVar).withEndAction(new Runnable(this) {
            public final k0 f18451b;

            {
                this.f18451b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        k0 k0Var = this.f18451b;
                        if (!z12) {
                            k0Var.Z1.setVisibility(8);
                            return;
                        } else {
                            k0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        k0 k0Var2 = this.f18451b;
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
            int i10 = n6.f29394a7;
            int w02 = n6.w0(i10, this.J0);
            if (w02 != this.f18463e2) {
                this.f18463e2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.X1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = n6.w0(n6.nk, this.J0);
            hi.e eVar = this.Y1;
            if (eVar != null && w03 != this.f18464f2) {
                this.f18464f2 = w03;
                eVar.setColor(w03);
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
