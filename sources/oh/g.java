package oh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bg.o;
import bg.x2;
import cg.h0;
import cg.s2;
import dg.i;
import eg.w2;
import f2.p0;
import i7.f6;
import java.util.ArrayList;
import jh.b0;
import jh.ha;
import jh.ia;
import jh.q;
import jh.s7;
import jh.t9;
import nh.t4;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;
import org.telegram.ui.ua1;
import org.telegram.ui.y10;
import org.telegram.ui.z10;
import ph.d3;
public final class g extends z10 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout L;
    public i M;
    public ha N;
    public h0 O;
    public final boolean P = B0();
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public o6 S;
    public o6 T;
    public x2 U;
    public nh.d V;
    public ua1 W;
    public nh.d X;
    public nh.d Y;
    public boolean Z;
    public boolean f19574a0;
    public d f19575b0;

    public g() {
        this.I = true;
    }

    public static boolean B0() {
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            return false;
        }
        return true;
    }

    public static void x0(g gVar, int i10) {
        w41 G;
        d dVar = gVar.f19575b0;
        if (dVar != null && (G = dVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                gVar.f19575b0.N(true);
            } else if (i11 == -2) {
                s7.y(gVar.currentAccount, true).u();
                w2.e0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
            } else if (i11 == -3) {
                s7.y(gVar.currentAccount, true).W();
                gVar.f19575b0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                    org.telegram.ui.c.b(gVar.currentAccount);
                } else {
                    gVar.presentFragment(new d3(gVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void C0(ArrayList arrayList, k51 k51Var) {
        if (getParentActivity() == null) {
            return;
        }
        s7 y8 = s7.y(this.currentAccount, true);
        w41 w41Var = new w41(-2);
        w41Var.f34293c = (h0) super.r0(getParentActivity());
        arrayList.add(w41Var);
        arrayList.add(w41.k(this.Q));
        boolean z10 = this.P;
        if (z10) {
            th.A(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y8.O(0);
        this.Z = O;
        if (O) {
            if (!z10) {
                arrayList.add(w41.B(null));
            }
            arrayList.add(w41.p(this.N, AndroidUtilities.dp(24.0f) + l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(w41.l(this.O));
    }

    public final void D0() {
        float f9;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        s7 y8 = s7.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p10 = y8.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) ia.J0(p10, 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        int i10 = (int) ((p10.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            o6 o6Var = this.T;
            o6Var.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.T.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = b0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        z10 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false;
        if (this.f19574a0 == z10) {
            return;
        }
        this.f19574a0 = z10;
        this.U.setVisibility(0);
        this.W.setVisibility(0);
        ViewPropertyAnimator animate = this.U.animate();
        float f10 = 1.0f;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        animate.alpha(f9).withEndAction(new Runnable(this) {
            public final g f19567b;

            {
                this.f19567b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f19567b.U.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f19567b.W.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.W.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final g f19567b;

            {
                this.f19567b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f19567b.U.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f19567b.W.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    @Override
    public final View createView(Context context) {
        float f9;
        int i10;
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new ha(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.O = new h0(this, context, 4);
        super.createView(context);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setClickable(true);
        i iVar = new i(context, 1, 4);
        this.M = iVar;
        dg.a aVar = iVar.f5590b;
        aVar.f5568w = g6.fk;
        aVar.f5569x = g6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.f45016e);
        this.L.addView(this.M, f6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new e2.e(context, 11)), true), this.L, null);
        this.f45015c.setOverScrollMode(2);
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jr.h);
        lVar.n(350L);
        this.f45015c.setItemAnimator(lVar);
        this.f45015c.setOnItemClickListener(new o(this, 17));
        this.f45020s.addView(new n00(getParentActivity()), f6.c(-1.0f, -1));
        s7.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        o6 o6Var = new o6(getParentActivity(), false, true, false);
        this.S = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(g6.v0(g6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        iq iqVar = new iq(R.drawable.mini_gram_72, 0);
        iqVar.setOverrideColor(-13397548);
        iqVar.setScale(0.5f, 0.5f);
        float f10 = 0.0f;
        iqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.R.setSpan(iqVar, 0, 1, 33);
        this.Q.addView(this.S, f6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        o6 o6Var2 = new o6(getParentActivity(), false, false, false);
        this.T = o6Var2;
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourTonBalance));
        this.T.setTextColor(g6.v0(g6.f23450z6, this.resourceProvider));
        this.Q.addView(this.T, f6.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        x2 x2Var = new x2(this, getParentActivity(), 13);
        this.U = x2Var;
        frameLayout2.addView(x2Var);
        boolean z10 = this.P;
        if (z10) {
            nh.d dVar = new nh.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.V = dVar;
            dVar.e();
            this.V.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.V.setOnClickListener(new View.OnClickListener(this) {
                public final g f19565b;

                {
                    this.f19565b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ye.d.u(this.f19565b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            ye.d.u(this.f19565b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            g gVar = this.f19565b;
                            gVar.presentFragment(new q(1, gVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.U.addView(this.V, f6.e(-1, 48, 119));
        }
        ua1 ua1Var = new ua1(this, getParentActivity(), 5);
        this.W = ua1Var;
        frameLayout2.addView(ua1Var);
        nh.d dVar2 = new nh.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.X = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new iq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.X.g(spannableStringBuilder, false, true);
        this.X.setOnClickListener(new View.OnClickListener(this) {
            public final g f19565b;

            {
                this.f19565b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ye.d.u(this.f19565b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        ye.d.u(this.f19565b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f19565b;
                        gVar.presentFragment(new q(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.W.addView(this.X, f6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        nh.d dVar3 = new nh.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.Y = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new iq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.Y.g(spannableStringBuilder2, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final g f19565b;

            {
                this.f19565b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ye.d.u(this.f19565b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        ye.d.u(this.f19565b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f19565b;
                        gVar.presentFragment(new q(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.W.addView(this.Y, f6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, f6.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.U.animate().cancel();
        this.W.animate().cancel();
        ua1 ua1Var2 = this.W;
        if (this.f19574a0) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ua1Var2.setAlpha(f9);
        x2 x2Var2 = this.U;
        if (!this.f19574a0) {
            f10 = 1.0f;
        }
        x2Var2.setAlpha(f10);
        ua1 ua1Var3 = this.W;
        int i11 = 8;
        if (this.f19574a0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ua1Var3.setVisibility(i10);
        x2 x2Var3 = this.U;
        if (!this.f19574a0) {
            i11 = 0;
        }
        x2Var3.setVisibility(i11);
        D0();
        d dVar4 = this.f19575b0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            d dVar = this.f19575b0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            s7 y8 = s7.y(this.currentAccount, true);
            if (this.Z != y8.O(0)) {
                this.Z = y8.O(0);
                s0();
                d dVar2 = this.f19575b0;
                if (dVar2 != null) {
                    dVar2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            d dVar3 = this.f19575b0;
            if (dVar3 != null) {
                dVar3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            D0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            D0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return g6.w0(null, g6.f23151i5, false);
    }

    @Override
    public final p0 n0() {
        d dVar = new d(this, this.f45015c, getParentActivity(), this.currentAccount, this.classGuid, new t4(this, 4), getResourceProvider());
        this.f19575b0 = dVar;
        dVar.f29939r = false;
        return dVar;
    }

    @Override
    public final y10 o0() {
        return new t9(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        s7.y(this.currentAccount, true).T(true);
        s7.y(this.currentAccount, true).S();
        s7.y(this.currentAccount, true).z();
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
        i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        i iVar = this.M;
        if (iVar != null) {
            iVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override
    public final s2 p0() {
        return new c(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        ha haVar = this.N;
        boolean z10 = false;
        if (haVar != null && (haVar.getParent() instanceof View)) {
            if (this.f45015c.getHeight() - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override
    public final View r0(Context context) {
        throw null;
    }
}
