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
import fi.v9;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q2;
import org.telegram.ui.Components.v8;
import org.telegram.ui.Components.wq;
public final class i0 extends ma {
    public static final int f17400f2 = -1;
    public static final int f17401g2 = -2;
    public final TL_account.TL_connectedBot S1;
    public final TLRPC.User T1;
    public final a0 U1;
    public final LinearLayout V1;
    public final FrameLayout W1;
    public final fi.d X1;
    public final fi.d Y1;
    public m41 Z1;
    public boolean f17402a2;
    public Boolean f17403b2;
    public int f17404c2;
    public int d2;
    public int f17405e2;

    public i0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, q2 q2Var, h6 h6Var) {
        super(2, (Context) activity, h6Var, false);
        this.S1 = tL_connectedBot;
        TLRPC.User a22 = qp.s1(this.f28669a).a2(Long.valueOf(tL_connectedBot.bot_id));
        this.T1 = a22;
        this.E1 = org.telegram.messenger.g0.L(36.0f);
        this.f35908u1 = 0.15f;
        a0 a0Var = new a0(activity, this.f28669a, new v9(this, 23), h6Var);
        this.U1 = a0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.f17402a2 = tL_businessBotRecipients.exclude_selected;
        a0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        v8 v8Var = new v8((h6) null);
        k9 k9Var = new k9(activity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        v8Var.r(a22);
        k9Var.e(a22, v8Var);
        linearLayout.addView(k9Var, ha.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        t6.U(textView, m6.G6, h6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(t10.p(a22));
        linearLayout.addView(textView, ha.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.f35902o1.setTitle(t10.p(a22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, m6.f28282y6, h6Var);
        k5.m(textView2, 17, null, 2131745560);
        linearLayout.addView(textView2, ha.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String n10 = t10.n(a22);
        if (!TextUtils.isEmpty(n10)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            t6.U(textView3, m6.Uc, h6Var);
            textView3.setText("@" + n10);
            textView3.setGravity(17);
            linearLayout.addView(textView3, ha.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i7 = m6.f27834a7;
        v0(m6.w0(i7, this.I0));
        P(i7);
        this.f17404c2 = this.G0;
        pj0 pj0Var = this.n1;
        int i10 = this.f28705t0;
        pj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(72.0f));
        this.n1.r1();
        this.n1.setOnItemClickListener(new ai.k(this, 16));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.W1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, m6.w0(i7, this.I0)), m6.w0(i7, this.I0), m6.w0(i7, this.I0)}));
        fi.d dVar = new fi.d(activity, h6Var, true);
        dVar.setRoundRadius(24);
        this.X1 = dVar;
        int w02 = m6.w0(m6.kk, this.I0);
        this.f17405e2 = w02;
        dVar.setColor(w02);
        dVar.setText(id.M0(2131744205, null));
        dVar.setOnClickListener(new ah.g(this, tL_connectedBot, q2Var, 12));
        frameLayout.addView(dVar, ha.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        fi.d dVar2 = new fi.d(activity, h6Var, true);
        dVar2.setRoundRadius(24);
        this.Y1 = dVar2;
        dVar2.setText(id.M0(2131752785, null));
        dVar2.setOnClickListener(new bi.r(20, this, tL_connectedBot));
        frameLayout.addView(dVar2, ha.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d1(false);
        FrameLayout.LayoutParams e10 = ha.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.f28705t0;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.f28672b.addView(frameLayout, e10);
        v4.k kVar = new v4.k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        m41 m41Var = this.Z1;
        if (m41Var != null) {
            m41Var.O(false);
        }
    }

    @Override
    public final boolean G() {
        a0 a0Var = this.U1;
        if (a0Var != null) {
            a0Var.g();
        }
        return false;
    }

    @Override
    public final boolean H() {
        a0 a0Var = this.U1;
        if (a0Var != null && a0Var.g()) {
            return false;
        }
        return this.f28676c0;
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.f28669a, 0, true, new hi.u1(this, 7), this.I0);
        this.Z1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final void Q0(float f10) {
        m5 titleTextView = this.f35902o1.getTitleTextView();
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
        a0 a0Var = this.U1;
        if (a0Var != null && a0Var.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.f17403b2;
        if (bool != null && bool.booleanValue() == z10) {
            return;
        }
        this.f17403b2 = Boolean.valueOf(z10);
        float f18 = 0.0f;
        fi.d dVar = this.X1;
        fi.d dVar2 = this.Y1;
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
        wq wqVar = wq.h;
        duration.setInterpolator(wqVar).withEndAction(new Runnable(this) {
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
                            i0Var.Y1.setVisibility(8);
                            return;
                        } else {
                            i0Var.getClass();
                            return;
                        }
                    default:
                        boolean z12 = z10;
                        i0 i0Var2 = this.f17397b;
                        if (z12) {
                            i0Var2.X1.setVisibility(8);
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
        scaleX2.scaleY(f19).setDuration(320L).setInterpolator(wqVar).withEndAction(new Runnable(this) {
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
                            i0Var.Y1.setVisibility(8);
                            return;
                        } else {
                            i0Var.getClass();
                            return;
                        }
                    default:
                        boolean z12 = z10;
                        i0 i0Var2 = this.f17397b;
                        if (z12) {
                            i0Var2.X1.setVisibility(8);
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
            int i10 = m6.f27834a7;
            int w02 = m6.w0(i10, this.I0);
            if (w02 != this.d2) {
                this.d2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.W1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = m6.w0(m6.kk, this.I0);
            fi.d dVar = this.X1;
            if (dVar != null && w03 != this.f17405e2) {
                this.f17405e2 = w03;
                dVar.setColor(w03);
            }
            int w04 = m6.w0(i10, this.I0);
            if (this.F0 < 0 && (i7 = this.G0) == this.f17404c2 && w04 != i7) {
                this.G0 = w04;
                this.f17404c2 = w04;
                E0(w04);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
