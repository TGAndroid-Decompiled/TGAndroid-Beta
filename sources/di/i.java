package di;

import ai.f0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.v;
import ci.bb;
import ei.e4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Wallet.d6;
import org.telegram.ui.dc1;
import org.telegram.ui.o20;
import org.telegram.ui.p20;
import rg.w1;
import s4.i0;
import s4.j;
import tg.m1;
import w7.x5;
import yh.m5;
import yh.o;
import yh.o7;
import yh.p7;
public final class i extends p20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public d6 Q;
    public o7 R;
    public bb S;
    public final boolean T = C0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public r6 W;
    public r6 X;
    public f0 Y;
    public ci.d Z;
    public dc1 f8384a0;
    public ci.d f8385b0;
    public ci.d f8386c0;
    public boolean f8387d0;
    public boolean f8388e0;
    public e f8389f0;

    public i() {
        this.M = true;
    }

    public static boolean C0() {
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            return false;
        }
        return true;
    }

    public static void y0(i iVar, int i10) {
        q61 G;
        e eVar = iVar.f8389f0;
        if (eVar != null && (G = eVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                iVar.f8389f0.N(true);
            } else if (i11 == -2) {
                m5.y(iVar.currentAccount, true).u();
                m1.f0(1, BirthdayController.getInstance(iVar.currentAccount).getState());
            } else if (i11 == -3) {
                m5.y(iVar.currentAccount, true).W();
                iVar.f8389f0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(iVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(iVar.currentAccount);
                } else {
                    iVar.presentFragment(new e4(iVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void D0(ArrayList arrayList, d71 d71Var) {
        if (getParentActivity() == null) {
            return;
        }
        m5 y3 = m5.y(this.currentAccount, true);
        q61 q61Var = new q61(-2);
        q61Var.f30056c = (bb) super.r0(getParentActivity());
        arrayList.add(q61Var);
        arrayList.add(q61.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            hg.c.n(R.string.GramEarningsHint, arrayList);
        }
        boolean O = y3.O(0);
        this.f8387d0 = O;
        if (O) {
            if (!z10) {
                arrayList.add(q61.B(null));
            }
            arrayList.add(q61.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(q61.l(this.S));
    }

    public final void E0() {
        int i10;
        float f7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        m5 y3 = m5.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) p7.K0(p5, 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        if (((int) ((p5.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.X.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = o.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        if (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = false;
        }
        if (this.f8388e0 == z10) {
            return;
        }
        this.f8388e0 = z10;
        this.Y.setVisibility(0);
        this.f8384a0.setVisibility(0);
        ViewPropertyAnimator animate = this.Y.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final i f8375b;

            {
                this.f8375b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f8375b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f8375b.f8384a0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f8384a0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final i f8375b;

            {
                this.f8375b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f8375b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f8375b.f8384a0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    @Override
    public final View createView(Context context) {
        float f7;
        int i10;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        this.R = new o7(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new bb(this, context, 1);
        super.createView(context);
        d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        d6 d6Var = new d6(170, context, false);
        this.Q = d6Var;
        d6Var.setStarParticlesView(this.f40685e);
        this.P.addView(this.Q, x5.a(170.0f, 0.0f, 32.0f, 0.0f, 12.0f, 170, 17));
        m0(LocaleController.getString(R.string.GramEarningsTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GramEarningsText), new a(context, 0)), true), this.P, null);
        this.f40684c.setOverScrollMode(2);
        j jVar = new j();
        jVar.f47742m = false;
        jVar.C = false;
        jVar.o(is.h);
        jVar.n(350L);
        this.f40684c.setItemAnimator(jVar);
        this.f40684c.setOnItemClickListener(new ai.g(this, 6));
        this.f40689s.addView(new i10(getParentActivity()), x5.d(-1.0f, -1));
        m5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        r6 r6Var = new r6(getParentActivity(), false, true, false);
        this.W = r6Var;
        r6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(i6.w0(i6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        er erVar = new er(R.drawable.mini_gram_72, 0);
        erVar.recolorDrawable = false;
        erVar.setScale(0.5f, 0.5f);
        float f10 = 0.0f;
        erVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(erVar, 0, 1, 33);
        this.U.addView(this.W, x5.a(40.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        r6 r6Var2 = new r6(getParentActivity(), false, false, false);
        this.X = r6Var2;
        r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(i6.w0(i6.f21203z6, this.resourceProvider));
        this.U.addView(this.X, x5.a(20.0f, 24.0f, 0.0f, 24.0f, 8.0f, -1, 17));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        f0 f0Var = new f0(this, getParentActivity(), 2);
        this.Y = f0Var;
        frameLayout2.addView(f0Var);
        boolean z10 = this.T;
        if (z10) {
            ci.d dVar = new ci.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.Z = dVar;
            dVar.e();
            this.Z.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.Z.setOnClickListener(new View.OnClickListener(this) {
                public final i f8373b;

                {
                    this.f8373b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            of.f.u(this.f8373b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            of.f.u(this.f8373b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            i iVar = this.f8373b;
                            iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.Y.addView(this.Z, x5.e(-1, 48, 119));
        }
        dc1 dc1Var = new dc1(this, getParentActivity(), 1);
        this.f8384a0 = dc1Var;
        frameLayout2.addView(dc1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f8385b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new er(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.f8385b0.g(spannableStringBuilder, false, true);
        this.f8385b0.setOnClickListener(new View.OnClickListener(this) {
            public final i f8373b;

            {
                this.f8373b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        of.f.u(this.f8373b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        of.f.u(this.f8373b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        i iVar = this.f8373b;
                        iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.f8384a0.addView(this.f8385b0, x5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f8386c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new er(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.f8386c0.g(spannableStringBuilder2, false, true);
        this.f8386c0.setOnClickListener(new View.OnClickListener(this) {
            public final i f8373b;

            {
                this.f8373b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        of.f.u(this.f8373b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        of.f.u(this.f8373b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        i iVar = this.f8373b;
                        iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.f8384a0.addView(this.f8386c0, x5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, x5.a(48.0f, 20.0f, 6.0f, 20.0f, 4.0f, -1, 17));
        this.Y.animate().cancel();
        this.f8384a0.animate().cancel();
        dc1 dc1Var2 = this.f8384a0;
        if (this.f8388e0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        dc1Var2.setAlpha(f7);
        f0 f0Var2 = this.Y;
        if (!this.f8388e0) {
            f10 = 1.0f;
        }
        f0Var2.setAlpha(f10);
        dc1 dc1Var3 = this.f8384a0;
        int i11 = 8;
        if (this.f8388e0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dc1Var3.setVisibility(i10);
        f0 f0Var3 = this.Y;
        if (!this.f8388e0) {
            i11 = 0;
        }
        f0Var3.setVisibility(i11);
        E0();
        e eVar = this.f8389f0;
        if (eVar != null) {
            eVar.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            e eVar = this.f8389f0;
            if (eVar != null) {
                eVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            m5 y3 = m5.y(this.currentAccount, true);
            if (this.f8387d0 != y3.O(0)) {
                this.f8387d0 = y3.O(0);
                t0();
                e eVar2 = this.f8389f0;
                if (eVar2 != null) {
                    eVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            e eVar3 = this.f8389f0;
            if (eVar3 != null) {
                eVar3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            E0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            E0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return i6.x0(null, i6.f20891i5, false);
    }

    @Override
    public final i0 n0() {
        e eVar = new e(this, this.f40684c, getParentActivity(), this.currentAccount, this.classGuid, new v(this, 10), getResourceProvider());
        this.f8389f0 = eVar;
        eVar.f25587r = false;
        return eVar;
    }

    @Override
    public final o20 o0() {
        return new f(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        m5.y(this.currentAccount, true).T(true);
        m5.y(this.currentAccount, true).S();
        m5.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onPause() {
        super.onPause();
        d6 d6Var = this.Q;
        if (d6Var != null) {
            d6Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        d6 d6Var = this.Q;
        if (d6Var != null) {
            d6Var.setPaused(false);
        }
    }

    @Override
    public final w1 p0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        o7 o7Var = this.R;
        boolean z10 = false;
        if (o7Var != null && (o7Var.getParent() instanceof View)) {
            if (this.f40684c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }

    @Override
    public final void s0(float f7) {
        d6 d6Var = this.Q;
        if (d6Var != null) {
            d6Var.setHeaderTilt(f7 * 70.0f);
        }
    }
}
