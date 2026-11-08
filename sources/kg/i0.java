package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import fi.h9;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
public final class i0 extends na {
    public static final int f17400c2 = -1;
    public static final int d2 = -2;
    public final TL_account.TL_connectedBot P1;
    public final TLRPC.User Q1;
    public final a0 R1;
    public final LinearLayout S1;
    public final FrameLayout T1;
    public final fi.d U1;
    public final fi.d V1;
    public l41 W1;
    public boolean X1;
    public Boolean Y1;
    public int Z1;
    public int f17401a2;
    public int f17402b2;

    public i0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, r2 r2Var, f6 f6Var) {
        super(2, (Context) activity, f6Var, false);
        this.P1 = tL_connectedBot;
        TLRPC.User a22 = qp.s1(this.f28616a).a2(Long.valueOf(tL_connectedBot.bot_id));
        this.Q1 = a22;
        this.B1 = org.telegram.messenger.g0.L(36.0f);
        this.f36282r1 = 0.15f;
        a0 a0Var = new a0(activity, this.f28616a, new h9(this, 24), f6Var);
        this.R1 = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.X1 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
        w8 w8Var = new w8((f6) null);
        l9 l9Var = new l9(activity);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        w8Var.r(a22);
        l9Var.e(a22, w8Var);
        linearLayout.addView(l9Var, ha.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        r6.V(textView, k6.G6, f6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(t10.p(a22));
        linearLayout.addView(textView, ha.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.l1.setTitle(t10.p(a22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, k6.f28244y6, f6Var);
        k5.m(textView2, 17, null, 2131745563);
        linearLayout.addView(textView2, ha.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String n10 = t10.n(a22);
        if (!TextUtils.isEmpty(n10)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            r6.V(textView3, k6.Uc, f6Var);
            textView3.setText("@" + n10);
            textView3.setGravity(17);
            linearLayout.addView(textView3, ha.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i7 = k6.f27796a7;
        v0(k6.w0(i7, this.I0));
        P(i7);
        this.Z1 = this.G0;
        pj0 pj0Var = this.f36277k1;
        int i10 = this.f28649t0;
        pj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(72.0f));
        this.f36277k1.r1();
        this.f36277k1.setOnItemClickListener(new ai.k(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.T1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, k6.w0(i7, this.I0)), k6.w0(i7, this.I0), k6.w0(i7, this.I0)}));
        fi.d dVar = new fi.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.U1 = dVar;
        int w02 = k6.w0(k6.kk, this.I0);
        this.f17402b2 = w02;
        dVar.setColor(w02);
        dVar.setText(id.M0(2131744208, null));
        dVar.setOnClickListener(new ah.g(this, tL_connectedBot, r2Var, 12));
        frameLayout.addView(dVar, ha.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        fi.d dVar2 = new fi.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.V1 = dVar2;
        dVar2.setText(id.M0(2131752785, null));
        dVar2.setOnClickListener(new bi.r(20, this, tL_connectedBot));
        frameLayout.addView(dVar2, ha.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d1(false);
        FrameLayout.LayoutParams e10 = ha.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.f28649t0;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.f28619b.addView(frameLayout, e10);
        v4.k kVar = new v4.k();
        kVar.f57070m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36277k1.setItemAnimator(kVar);
        l41 l41Var = this.W1;
        if (l41Var != null) {
            l41Var.O(false);
        }
    }

    @Override
    public final boolean G() {
        a0 a0Var = this.R1;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override
    public final boolean H() {
        a0 a0Var = this.R1;
        if (a0Var != null && a0Var.g()) {
            return false;
        }
        return this.f28623c0;
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.f28616a, 0, true, new hi.u1(this, 7), this.I0);
        this.W1 = l41Var;
        l41Var.f35528r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final void Q0(float f10) {
        org.telegram.ui.ActionBar.k5 titleTextView = this.l1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void d1(boolean z9) {
        final boolean z10;
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
        a0 a0Var = this.R1;
        if (a0Var != null && a0Var.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.Y1;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.Y1 = Boolean.valueOf(z10);
        float f18 = 0.0f;
        fi.d dVar = this.U1;
        fi.d dVar2 = this.V1;
        float f19 = 0.8f;
        if (!z9) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            dVar2.setVisibility(i7);
            dVar2.animate().cancel();
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            dVar2.setAlpha(f14);
            if (z10) {
                f15 = 1.0f;
            } else {
                f15 = 0.8f;
            }
            dVar2.setScaleX(f15);
            if (z10) {
                f16 = 1.0f;
            } else {
                f16 = 0.8f;
            }
            dVar2.setScaleY(f16);
            if (z10) {
                i10 = 8;
            }
            dVar.setVisibility(i10);
            dVar.animate().cancel();
            if (!z10) {
                f18 = 1.0f;
            }
            dVar.setAlpha(f18);
            if (!z10) {
                f17 = 1.0f;
            } else {
                f17 = 0.8f;
            }
            dVar.setScaleX(f17);
            if (!z10) {
                f19 = 1.0f;
            }
            dVar.setScaleY(f19);
            return;
        }
        dVar2.setVisibility(0);
        ViewPropertyAnimator animate = dVar2.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.8f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.8f;
        }
        ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(320L);
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).withEndAction(new Runnable(this) {
            public final i0 f17397b;

            {
                this.f17397b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        i0 i0Var = this.f17397b;
                        if (!z11) {
                            i0Var.V1.setVisibility(8);
                            return;
                        } else {
                            i0Var.getClass();
                            return;
                        }
                    default:
                        boolean z12 = z10;
                        i0 i0Var2 = this.f17397b;
                        if (z12) {
                            i0Var2.U1.setVisibility(8);
                            return;
                        } else {
                            i0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
        dVar.setVisibility(0);
        ViewPropertyAnimator animate2 = dVar.animate();
        if (!z10) {
            f18 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate2.alpha(f18);
        if (!z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.8f;
        }
        ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
        if (!z10) {
            f19 = 1.0f;
        }
        scaleX2.scaleY(f19).setDuration(320L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
            public final i0 f17397b;

            {
                this.f17397b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z11 = z10;
                        i0 i0Var = this.f17397b;
                        if (!z11) {
                            i0Var.V1.setVisibility(8);
                            return;
                        } else {
                            i0Var.getClass();
                            return;
                        }
                    default:
                        boolean z12 = z10;
                        i0 i0Var2 = this.f17397b;
                        if (z12) {
                            i0Var2.U1.setVisibility(8);
                            return;
                        } else {
                            i0Var2.getClass();
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
            int i10 = k6.f27796a7;
            int w02 = k6.w0(i10, this.I0);
            if (w02 != this.f17401a2) {
                this.f17401a2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.T1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = k6.w0(k6.kk, this.I0);
            fi.d dVar = this.U1;
            if (dVar != null && w03 != this.f17402b2) {
                this.f17402b2 = w03;
                dVar.setColor(w03);
            }
            int w04 = k6.w0(i10, this.I0);
            if (this.F0 < 0 && (i7 = this.G0) == this.Z1 && w04 != i7) {
                this.G0 = w04;
                this.Z1 = w04;
                E0(w04);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
