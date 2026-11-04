package lg;

import ai.j6;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import gi.q4;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.o2;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
public final class j0 extends ma {
    public static final int f18338d2 = -1;
    public static final int f18339e2 = -2;
    public final TL_account.TL_connectedBot Q1;
    public final TLRPC.User R1;
    public final b0 S1;
    public final LinearLayout T1;
    public final FrameLayout U1;
    public final gi.d V1;
    public final gi.d W1;
    public f41 X1;
    public boolean Y1;
    public Boolean Z1;
    public int f18340a2;
    public int f18341b2;
    public int c2;

    public j0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, o2 o2Var, e6 e6Var) {
        super(2, (Context) activity, e6Var, false);
        this.Q1 = tL_connectedBot;
        TLRPC.User a22 = hp.s1(this.f28583a).a2(Long.valueOf(tL_connectedBot.bot_id));
        this.R1 = a22;
        this.C1 = org.telegram.messenger.g0.L(36.0f);
        this.f36108s1 = 0.15f;
        b0 b0Var = new b0(activity, this.f28583a, new n(this, 1), e6Var);
        this.S1 = b0Var;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.Y1 = tL_businessBotRecipients.exclude_selected;
        b0Var.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
        u8 u8Var = new u8((e6) null);
        k9 k9Var = new k9(activity);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(40.0f));
        u8Var.r(a22);
        k9Var.e(a22, u8Var);
        linearLayout.addView(k9Var, mf.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        r6.V(textView, k6.G6, e6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(l10.p(a22));
        linearLayout.addView(textView, mf.s(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.m1.setTitle(l10.p(a22));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        r6.V(textView2, k6.f28273y6, e6Var);
        k5.m(textView2, 17, null, 2131745570);
        linearLayout.addView(textView2, mf.s(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String n4 = l10.n(a22);
        if (!TextUtils.isEmpty(n4)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            r6.V(textView3, k6.Uc, e6Var);
            textView3.setText("@" + n4);
            textView3.setGravity(17);
            linearLayout.addView(textView3, mf.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i3 = k6.f27824a7;
        v0(k6.w0(i3, this.J0));
        P(i3);
        this.f18340a2 = this.H0;
        tj0 tj0Var = this.f36102l1;
        int i10 = this.f28618u0;
        tj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(72.0f));
        this.f36102l1.r1();
        this.f36102l1.setOnItemClickListener(new j6(this, 17));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.U1 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, k6.w0(i3, this.J0)), k6.w0(i3, this.J0), k6.w0(i3, this.J0)}));
        gi.d dVar = new gi.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.V1 = dVar;
        int w02 = k6.w0(k6.kk, this.J0);
        this.c2 = w02;
        dVar.setColor(w02);
        dVar.setText(bd.M0(2131744215, null));
        dVar.setOnClickListener(new ai.h(this, tL_connectedBot, o2Var, 17));
        frameLayout.addView(dVar, mf.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        gi.d dVar2 = new gi.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.W1 = dVar2;
        dVar2.setText(bd.M0(2131752785, null));
        dVar2.setOnClickListener(new ai.d(26, this, tL_connectedBot));
        frameLayout.addView(dVar2, mf.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        d1(false);
        FrameLayout.LayoutParams e10 = mf.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.f28618u0;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.f28586b.addView(frameLayout, e10);
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36102l1.setItemAnimator(kVar);
        f41 f41Var = this.X1;
        if (f41Var != null) {
            f41Var.O(false);
        }
    }

    @Override
    public final boolean G() {
        b0 b0Var = this.S1;
        if (b0Var != null) {
            b0Var.g();
        }
        return false;
    }

    @Override
    public final boolean H() {
        b0 b0Var = this.S1;
        if (b0Var != null && b0Var.g()) {
            return false;
        }
        return this.f28592d0;
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.f28583a, 0, true, new q4(this, 17), this.J0);
        this.X1 = f41Var;
        f41Var.f33698r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final void Q0(float f10) {
        org.telegram.ui.ActionBar.k5 titleTextView = this.m1.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void d1(boolean z10) {
        final boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        int i3;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10 = 0;
        b0 b0Var = this.S1;
        if (b0Var != null && b0Var.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.Z1;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        this.Z1 = Boolean.valueOf(z11);
        float f18 = 0.0f;
        gi.d dVar = this.V1;
        gi.d dVar2 = this.W1;
        float f19 = 0.8f;
        if (!z10) {
            if (z11) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            dVar2.setVisibility(i3);
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
        xq xqVar = xq.h;
        duration.setInterpolator(xqVar).withEndAction(new Runnable(this) {
            public final j0 f18331b;

            {
                this.f18331b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        j0 j0Var = this.f18331b;
                        if (!z12) {
                            j0Var.W1.setVisibility(8);
                            return;
                        } else {
                            j0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        j0 j0Var2 = this.f18331b;
                        if (z13) {
                            j0Var2.V1.setVisibility(8);
                            return;
                        } else {
                            j0Var2.getClass();
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
        scaleX2.scaleY(f19).setDuration(320L).setInterpolator(xqVar).withEndAction(new Runnable(this) {
            public final j0 f18331b;

            {
                this.f18331b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        boolean z12 = z11;
                        j0 j0Var = this.f18331b;
                        if (!z12) {
                            j0Var.W1.setVisibility(8);
                            return;
                        } else {
                            j0Var.getClass();
                            return;
                        }
                    default:
                        boolean z13 = z11;
                        j0 j0Var2 = this.f18331b;
                        if (z13) {
                            j0Var2.V1.setVisibility(8);
                            return;
                        } else {
                            j0Var2.getClass();
                            return;
                        }
                }
            }
        }).start();
    }

    @Override
    public final void s0() {
        int i3;
        try {
            super.s0();
            int i10 = k6.f27824a7;
            int w02 = k6.w0(i10, this.J0);
            if (w02 != this.f18341b2) {
                this.f18341b2 = w02;
                v0(w02);
                FrameLayout frameLayout = this.U1;
                if (frameLayout != null) {
                    frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{k6.r1(0.0f, w02), w02, w02}));
                }
            }
            int w03 = k6.w0(k6.kk, this.J0);
            gi.d dVar = this.V1;
            if (dVar != null && w03 != this.c2) {
                this.c2 = w03;
                dVar.setColor(w03);
            }
            int w04 = k6.w0(i10, this.J0);
            if (this.G0 < 0 && (i3 = this.H0) == this.f18340a2 && w04 != i3) {
                this.H0 = w04;
                this.f18340a2 = w04;
                E0(w04);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
