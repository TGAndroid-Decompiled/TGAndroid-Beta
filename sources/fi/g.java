package fi;

import ah.x;
import ai.ga;
import ai.ic;
import ai.k0;
import ai.ld;
import ai.md;
import ai.q;
import ai.ra;
import ai.wa;
import ai.wc;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import gi.u3;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.qa1;
import org.telegram.ui.v10;
import org.telegram.ui.x10;
import org.telegram.ui.y10;
import s4.g0;
import sg.x1;
import ug.m1;
import w7.z5;
public final class g extends y10 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public m6 Q;
    public ld R;
    public ic S;
    public final boolean T = C0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public q6 W;
    public q6 X;
    public x Y;
    public ei.d Z;
    public qa1 f10611a0;
    public ei.d f10612b0;
    public ei.d f10613c0;
    public boolean f10614d0;
    public boolean f10615e0;
    public d f10616f0;

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
        g61 G;
        d dVar = gVar.f10616f0;
        if (dVar != null && (G = dVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                gVar.f10616f0.N(true);
            } else if (i11 == -2) {
                ga.y(gVar.currentAccount, true).u();
                m1.f0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
            } else if (i11 == -3) {
                ga.y(gVar.currentAccount, true).W();
                gVar.f10616f0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(gVar.currentAccount);
                } else {
                    gVar.presentFragment(new u3(gVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void D0(ArrayList arrayList, t61 t61Var) {
        if (getParentActivity() == null) {
            return;
        }
        ga y3 = ga.y(this.currentAccount, true);
        g61 g61Var = new g61(-2);
        g61Var.f26493c = (v10) super.r0(getParentActivity());
        arrayList.add(g61Var);
        arrayList.add(g61.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            i2.e.B(R.string.GramEarningsHint, arrayList);
        }
        boolean O = y3.O(0);
        this.f10614d0 = O;
        if (O) {
            if (!z10) {
                arrayList.add(g61.B(null));
            }
            arrayList.add(g61.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(g61.l(this.S));
    }

    public final void E0() {
        int i10;
        float f7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        ga y3 = ga.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) md.K0(p5, 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        if (((int) ((p5.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.X.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = k0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        if (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = false;
        }
        if (this.f10615e0 == z10) {
            return;
        }
        this.f10615e0 = z10;
        this.Y.setVisibility(0);
        this.f10611a0.setVisibility(0);
        ViewPropertyAnimator animate = this.Y.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final g f10602b;

            {
                this.f10602b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f10602b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f10602b.f10611a0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f10611a0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final g f10602b;

            {
                this.f10602b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f10602b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f10602b.f10611a0.setVisibility(8);
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
        this.R = new ld(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new ic(this, context, 2);
        super.createView(context);
        d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        m6 m6Var = new m6(170, context, false);
        this.Q = m6Var;
        m6Var.setStarParticlesView(this.e);
        this.P.addView(this.Q, z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        m0(LocaleController.getString(R.string.GramEarningsTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GramEarningsText), new ra(context, 7)), true), this.P, null);
        this.f43315c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.f45944m = false;
        kVar.C = false;
        kVar.o(bs.h);
        kVar.n(350L);
        this.f43315c.setItemAnimator(kVar);
        this.f43315c.setOnItemClickListener(new wa(this, 10));
        this.f43319s.addView(new z00(getParentActivity()), z5.c(-1.0f, -1));
        ga.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        q6 q6Var = new q6(getParentActivity(), false, true, false);
        this.W = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(h6.w0(h6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        yq yqVar = new yq(R.drawable.mini_gram_72, 0);
        yqVar.recolorDrawable = false;
        yqVar.setScale(0.5f, 0.5f);
        float f10 = 0.0f;
        yqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(yqVar, 0, 1, 33);
        this.U.addView(this.W, z5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        q6 q6Var2 = new q6(getParentActivity(), false, false, false);
        this.X = q6Var2;
        q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(h6.w0(h6.f21394z6, this.resourceProvider));
        this.U.addView(this.X, z5.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        x xVar = new x(this, getParentActivity(), 5);
        this.Y = xVar;
        frameLayout2.addView(xVar);
        boolean z10 = this.T;
        if (z10) {
            ei.d dVar = new ei.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.Z = dVar;
            dVar.e();
            this.Z.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.Z.setOnClickListener(new View.OnClickListener(this) {
                public final g f10600b;

                {
                    this.f10600b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.t(this.f10600b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            pf.d.t(this.f10600b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            g gVar = this.f10600b;
                            gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.Y.addView(this.Z, z5.e(-1, 48, 119));
        }
        qa1 qa1Var = new qa1(this, getParentActivity(), 3);
        this.f10611a0 = qa1Var;
        frameLayout2.addView(qa1Var);
        ei.d dVar2 = new ei.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f10612b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new yq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.f10612b0.g(spannableStringBuilder, false, true);
        this.f10612b0.setOnClickListener(new View.OnClickListener(this) {
            public final g f10600b;

            {
                this.f10600b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pf.d.t(this.f10600b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        pf.d.t(this.f10600b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f10600b;
                        gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.f10611a0.addView(this.f10612b0, z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ei.d dVar3 = new ei.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f10613c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new yq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.f10613c0.g(spannableStringBuilder2, false, true);
        this.f10613c0.setOnClickListener(new View.OnClickListener(this) {
            public final g f10600b;

            {
                this.f10600b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pf.d.t(this.f10600b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        pf.d.t(this.f10600b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f10600b;
                        gVar.presentFragment(new ai.x(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.f10611a0.addView(this.f10613c0, z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, z5.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.Y.animate().cancel();
        this.f10611a0.animate().cancel();
        qa1 qa1Var2 = this.f10611a0;
        if (this.f10615e0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        qa1Var2.setAlpha(f7);
        x xVar2 = this.Y;
        if (!this.f10615e0) {
            f10 = 1.0f;
        }
        xVar2.setAlpha(f10);
        qa1 qa1Var3 = this.f10611a0;
        int i11 = 8;
        if (this.f10615e0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        qa1Var3.setVisibility(i10);
        x xVar3 = this.Y;
        if (!this.f10615e0) {
            i11 = 0;
        }
        xVar3.setVisibility(i11);
        E0();
        d dVar4 = this.f10616f0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            d dVar = this.f10616f0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            ga y3 = ga.y(this.currentAccount, true);
            if (this.f10614d0 != y3.O(0)) {
                this.f10614d0 = y3.O(0);
                t0();
                d dVar2 = this.f10616f0;
                if (dVar2 != null) {
                    dVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            d dVar3 = this.f10616f0;
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
        return h6.x0(null, h6.f21077i5, false);
    }

    @Override
    public final g0 n0() {
        d dVar = new d(this, this.f43315c, getParentActivity(), this.currentAccount, this.classGuid, new q(this, 21), getResourceProvider());
        this.f10616f0 = dVar;
        dVar.f30438r = false;
        return dVar;
    }

    @Override
    public final x10 o0() {
        return new wc(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        ga.y(this.currentAccount, true).T(true);
        ga.y(this.currentAccount, true).S();
        ga.y(this.currentAccount, true).z();
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
        m6 m6Var = this.Q;
        if (m6Var != null) {
            m6Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        m6 m6Var = this.Q;
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
        ld ldVar = this.R;
        boolean z10 = false;
        if (ldVar != null && (ldVar.getParent() instanceof View)) {
            if (this.f43315c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
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
        m6 m6Var = this.Q;
        if (m6Var != null) {
            m6Var.setHeaderTilt(f7 * 70.0f);
        }
    }
}
