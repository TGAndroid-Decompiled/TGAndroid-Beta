package fi;

import ah.x;
import ai.ha;
import ai.jc;
import ai.k0;
import ai.md;
import ai.nd;
import ai.q;
import ai.sa;
import ai.xa;
import ai.xc;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import gi.u3;
import i2.o1;
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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.x00;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.a20;
import org.telegram.ui.b20;
import org.telegram.ui.ua1;
import s4.g0;
import sg.x1;
import ug.l1;
import w7.z5;
public final class g extends b20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout R;
    public m6 S;
    public md T;
    public jc U;
    public final boolean V = C0();
    public LinearLayout W;
    public SpannableStringBuilder X;
    public o6 Y;
    public o6 Z;
    public x f10626a0;
    public ei.d f10627b0;
    public ua1 f10628c0;
    public ei.d f10629d0;
    public ei.d f10630e0;
    public boolean f10631f0;
    public boolean f10632g0;
    public d f10633h0;

    public g() {
        this.M = true;
    }

    public static boolean C0() {
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            return false;
        }
        return true;
    }

    public static void y0(g gVar, int i10) {
        l61 G;
        d dVar = gVar.f10633h0;
        if (dVar != null && (G = dVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                gVar.f10633h0.N(true);
            } else if (i11 == -2) {
                ha.y(gVar.currentAccount, true).u();
                l1.e0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
            } else if (i11 == -3) {
                ha.y(gVar.currentAccount, true).W();
                gVar.f10633h0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(gVar.currentAccount);
                } else {
                    gVar.presentFragment(new u3(gVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void D0(ArrayList arrayList, a71 a71Var) {
        if (getParentActivity() == null) {
            return;
        }
        ha y3 = ha.y(this.currentAccount, true);
        l61 l61Var = new l61(-2);
        l61Var.f28221c = (jc) super.r0(getParentActivity());
        arrayList.add(l61Var);
        arrayList.add(l61.k(this.W));
        boolean z10 = this.V;
        if (z10) {
            o1.B(R.string.GramEarningsHint, arrayList);
        }
        boolean O = y3.O(0);
        this.f10631f0 = O;
        if (O) {
            if (!z10) {
                arrayList.add(l61.B(null));
            }
            arrayList.add(l61.p(this.T, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(l61.l(this.U));
    }

    public final void E0() {
        int i10;
        float f7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        ha y3 = ha.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.X);
        spannableStringBuilder.append((CharSequence) nd.K0(p5, 0.66f, ' '));
        this.Y.setText(spannableStringBuilder);
        if (((int) ((p5.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.Z.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.Z.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = k0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        if (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = false;
        }
        if (this.f10632g0 == z10) {
            return;
        }
        this.f10632g0 = z10;
        this.f10626a0.setVisibility(0);
        this.f10628c0.setVisibility(0);
        ViewPropertyAnimator animate = this.f10626a0.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final g f10617b;

            {
                this.f10617b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f10617b.f10626a0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f10617b.f10628c0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f10628c0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final g f10617b;

            {
                this.f10617b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f10617b.f10626a0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f10617b.f10628c0.setVisibility(8);
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
        this.T = new md(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.U = new jc(this, context, 2);
        super.createView(context);
        h5 h5Var = this.parentLayout;
        if (h5Var != null && ((ActionBarLayout) h5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        m6 m6Var = new m6(170, context, false);
        this.S = m6Var;
        m6Var.setStarParticlesView(this.e);
        this.R.addView(this.S, z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.GramEarningsTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GramEarningsText), new sa(context, 7)), true), this.R, null);
        this.f35894c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(zr.h);
        kVar.n(350L);
        this.f35894c.setItemAnimator(kVar);
        this.f35894c.setOnItemClickListener(new xa(this, 10));
        this.f35898s.addView(new x00(getParentActivity()), z5.c(-1.0f, -1));
        ha.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        this.W.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        o6 o6Var = new o6(getParentActivity(), false, true, false);
        this.Y = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        this.Y.setTextSize(AndroidUtilities.dp(32.0f));
        this.Y.setGravity(17);
        r6.a0(this.Y, k6.G6, this.resourceProvider);
        this.X = new SpannableStringBuilder("S");
        vq vqVar = new vq(R.drawable.mini_gram_72, 0);
        vqVar.recolorDrawable = false;
        vqVar.setScale(0.5f, 0.5f);
        float f10 = 0.0f;
        vqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.X.setSpan(vqVar, 0, 1, 33);
        this.W.addView(this.Y, z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        o6 o6Var2 = new o6(getParentActivity(), false, false, false);
        this.Z = o6Var2;
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.Z.setGravity(17);
        this.Z.setText(LocaleController.getString(R.string.YourTonBalance));
        r6.a0(this.Z, k6.f21589z6, this.resourceProvider);
        this.W.addView(this.Z, z5.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        x xVar = new x(this, getParentActivity(), 5);
        this.f10626a0 = xVar;
        frameLayout2.addView(xVar);
        boolean z10 = this.V;
        if (z10) {
            ei.d dVar = new ei.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f10627b0 = dVar;
            dVar.f();
            this.f10627b0.i(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.f10627b0.setOnClickListener(new View.OnClickListener(this) {
                public final g f10615b;

                {
                    this.f10615b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.t(this.f10615b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            pf.d.t(this.f10615b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            g gVar = this.f10615b;
                            gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.f10626a0.addView(this.f10627b0, z5.e(-1, 48, 119));
        }
        ua1 ua1Var = new ua1(this, getParentActivity(), 3);
        this.f10628c0 = ua1Var;
        frameLayout2.addView(ua1Var);
        ei.d dVar2 = new ei.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f10629d0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new vq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.f10629d0.i(spannableStringBuilder, false, true);
        this.f10629d0.setOnClickListener(new View.OnClickListener(this) {
            public final g f10615b;

            {
                this.f10615b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pf.d.t(this.f10615b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        pf.d.t(this.f10615b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f10615b;
                        gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.f10628c0.addView(this.f10629d0, z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ei.d dVar3 = new ei.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f10630e0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new vq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.f10630e0.i(spannableStringBuilder2, false, true);
        this.f10630e0.setOnClickListener(new View.OnClickListener(this) {
            public final g f10615b;

            {
                this.f10615b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pf.d.t(this.f10615b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        pf.d.t(this.f10615b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f10615b;
                        gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.f10628c0.addView(this.f10630e0, z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.W.addView(frameLayout2, z5.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.f10626a0.animate().cancel();
        this.f10628c0.animate().cancel();
        ua1 ua1Var2 = this.f10628c0;
        if (this.f10632g0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ua1Var2.setAlpha(f7);
        x xVar2 = this.f10626a0;
        if (!this.f10632g0) {
            f10 = 1.0f;
        }
        xVar2.setAlpha(f10);
        ua1 ua1Var3 = this.f10628c0;
        int i11 = 8;
        if (this.f10632g0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ua1Var3.setVisibility(i10);
        x xVar3 = this.f10626a0;
        if (!this.f10632g0) {
            i11 = 0;
        }
        xVar3.setVisibility(i11);
        E0();
        d dVar4 = this.f10633h0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            d dVar = this.f10633h0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.P == 0 && this.Q < 0) {
                this.Q = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            ha y3 = ha.y(this.currentAccount, true);
            if (this.f10631f0 != y3.O(0)) {
                this.f10631f0 = y3.O(0);
                t0();
                d dVar2 = this.f10633h0;
                if (dVar2 != null) {
                    dVar2.N(true);
                }
                if (this.P == 0 && this.Q < 0) {
                    this.Q = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            d dVar3 = this.f10633h0;
            if (dVar3 != null) {
                dVar3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            E0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            E0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return k6.x0(null, k6.f21272i5, false);
    }

    @Override
    public final g0 n0() {
        d dVar = new d(this, this.f35894c, getParentActivity(), this.currentAccount, this.classGuid, new q(this, 21), getResourceProvider());
        this.f10633h0 = dVar;
        dVar.f24646r = false;
        return dVar;
    }

    @Override
    public final a20 o0() {
        return new xc(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        ha.y(this.currentAccount, true).T(true);
        ha.y(this.currentAccount, true).S();
        ha.y(this.currentAccount, true).z();
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
        m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.setPaused(false);
        }
    }

    @Override
    public final x1 p0() {
        return new c(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        md mdVar = this.T;
        boolean z10 = false;
        if (mdVar != null && (mdVar.getParent() instanceof View)) {
            if (this.f35894c.getHeight() - ((View) this.T.getParent()).getBottom() >= 0) {
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
        m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.setHeaderTilt(f7 * 70.0f);
        }
    }
}
