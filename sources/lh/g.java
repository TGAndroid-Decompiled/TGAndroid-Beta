package lh;

import ag.j;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bg.g3;
import f2.n;
import f2.r0;
import fh.d2;
import fh.l2;
import g7.e6;
import gh.c0;
import gh.na;
import gh.oa;
import gh.r;
import gh.v7;
import gh.z9;
import java.util.ArrayList;
import kh.b8;
import mh.u3;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ta1;
import org.telegram.ui.w10;
import org.telegram.ui.x10;
import zf.w1;
public final class g extends x10 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout L;
    public j M;
    public na N;
    public l2 O;
    public final boolean P = A0();
    public LinearLayout Q;
    public SpannableStringBuilder R;
    public j6 S;
    public j6 T;
    public d2 U;
    public kh.d V;
    public ta1 W;
    public kh.d X;
    public kh.d Y;
    public boolean Z;
    public boolean f16880a0;
    public d f16881b0;

    public g() {
        this.I = true;
    }

    public static boolean A0() {
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            return false;
        }
        return true;
    }

    public static void w0(g gVar, int i9) {
        l41 G;
        d dVar = gVar.f16881b0;
        if (dVar != null && (G = dVar.G(i9)) != null) {
            int i10 = G.d;
            if (i10 == -1) {
                gVar.f16881b0.N(true);
            } else if (i10 == -2) {
                v7.y(gVar.currentAccount, true).u();
                g3.d0(1, BirthdayController.getInstance(gVar.currentAccount).getState());
            } else if (i10 == -3) {
                v7.y(gVar.currentAccount, true).W();
                gVar.f16881b0.N(true);
            } else if (i10 == -4) {
                if (MessagesController.getInstance(gVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(gVar.currentAccount);
                } else {
                    gVar.presentFragment(new u3(gVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void B0(ArrayList arrayList, z41 z41Var) {
        if (getParentActivity() == null) {
            return;
        }
        v7 y10 = v7.y(this.currentAccount, true);
        l41 l41Var = new l41(-2);
        l41Var.f30332c = (l2) super.q0(getParentActivity());
        arrayList.add(l41Var);
        arrayList.add(l41.k(this.Q));
        boolean z10 = this.P;
        if (z10) {
            j2.y(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y10.O(0);
        this.Z = O;
        if (O) {
            if (!z10) {
                arrayList.add(l41.B(null));
            }
            arrayList.add(l41.p(this.N, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(l41.l(this.O));
    }

    public final void C0() {
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        v7 y10 = v7.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p6 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.R);
        spannableStringBuilder.append((CharSequence) oa.I0(p6, 0.66f, ' '));
        this.S.setText(spannableStringBuilder);
        int i9 = (int) ((p6.amount / 1.0E9d) * d * 100.0d);
        if (i9 > 0) {
            j6 j6Var = this.T;
            j6Var.setText("≈" + BillingController.getInstance().formatCurrency(i9, "USD"));
        } else {
            this.T.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = c0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        z10 = (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false;
        if (this.f16880a0 == z10) {
            return;
        }
        this.f16880a0 = z10;
        this.U.setVisibility(0);
        this.W.setVisibility(0);
        ViewPropertyAnimator animate = this.U.animate();
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).withEndAction(new Runnable(this) {
            public final g f16873b;

            {
                this.f16873b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f16873b.U.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f16873b.W.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.W.animate();
        if (!z10) {
            f11 = 0.0f;
        }
        animate2.alpha(f11).withEndAction(new Runnable(this) {
            public final g f16873b;

            {
                this.f16873b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f16873b.U.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f16873b.W.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    @Override
    public final View createView(Context context) {
        float f10;
        int i9;
        this.C = false;
        this.A = AndroidUtilities.dp(238.0f);
        this.N = new na(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.O = new l2(this, context, 3);
        super.createView(context);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        frameLayout.setClickable(true);
        j jVar = new j(context, 1, 4);
        this.M = jVar;
        ag.a aVar = jVar.f205b;
        aVar.f181w = f6.fk;
        aVar.f182x = f6.gk;
        aVar.b();
        this.M.setStarParticlesView(this.f44315e);
        this.L.addView(this.M, e6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        l0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new e2.f(context, 11)), true), this.L, null);
        this.f44314c.setOverScrollMode(2);
        n nVar = new n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.f44314c.setItemAnimator(nVar);
        this.f44314c.setOnItemClickListener(new eh.j(this, 13));
        this.f44319s.addView(new c00(getParentActivity()), e6.c(-1.0f, -1));
        v7.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.Q = linearLayout;
        linearLayout.setOrientation(1);
        this.Q.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        j6 j6Var = new j6(getParentActivity(), false, true, false);
        this.S = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        this.S.setTextSize(AndroidUtilities.dp(32.0f));
        this.S.setGravity(17);
        this.S.setTextColor(f6.v0(f6.G6, this.resourceProvider));
        this.R = new SpannableStringBuilder("S");
        eq eqVar = new eq(R.drawable.mini_gram_72, 0);
        eqVar.setOverrideColor(-13397548);
        eqVar.setScale(0.5f, 0.5f);
        float f11 = 0.0f;
        eqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.R.setSpan(eqVar, 0, 1, 33);
        this.Q.addView(this.S, e6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        j6 j6Var2 = new j6(getParentActivity(), false, false, false);
        this.T = j6Var2;
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.T.setGravity(17);
        this.T.setText(LocaleController.getString(R.string.YourTonBalance));
        this.T.setTextColor(f6.v0(f6.f23386z6, this.resourceProvider));
        this.Q.addView(this.T, e6.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        d2 d2Var = new d2(this, getParentActivity(), 7);
        this.U = d2Var;
        frameLayout2.addView(d2Var);
        boolean z10 = this.P;
        if (z10) {
            kh.d dVar = new kh.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.V = dVar;
            dVar.e();
            this.V.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.V.setOnClickListener(new View.OnClickListener(this) {
                public final g f16871b;

                {
                    this.f16871b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ve.e.u(this.f16871b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            ve.e.u(this.f16871b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            g gVar = this.f16871b;
                            gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.U.addView(this.V, e6.e(-1, 48, 119));
        }
        ta1 ta1Var = new ta1(this, getParentActivity(), 4);
        this.W = ta1Var;
        frameLayout2.addView(ta1Var);
        kh.d dVar2 = new kh.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.X = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new eq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.X.g(spannableStringBuilder, false, true);
        this.X.setOnClickListener(new View.OnClickListener(this) {
            public final g f16871b;

            {
                this.f16871b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ve.e.u(this.f16871b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        ve.e.u(this.f16871b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f16871b;
                        gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.W.addView(this.X, e6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        kh.d dVar3 = new kh.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.Y = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new eq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.Y.g(spannableStringBuilder2, false, true);
        this.Y.setOnClickListener(new View.OnClickListener(this) {
            public final g f16871b;

            {
                this.f16871b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ve.e.u(this.f16871b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        ve.e.u(this.f16871b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        g gVar = this.f16871b;
                        gVar.presentFragment(new r(1, gVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.W.addView(this.Y, e6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.Q.addView(frameLayout2, e6.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.U.animate().cancel();
        this.W.animate().cancel();
        ta1 ta1Var2 = this.W;
        if (this.f16880a0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ta1Var2.setAlpha(f10);
        d2 d2Var2 = this.U;
        if (!this.f16880a0) {
            f11 = 1.0f;
        }
        d2Var2.setAlpha(f11);
        ta1 ta1Var3 = this.W;
        int i10 = 8;
        if (this.f16880a0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        ta1Var3.setVisibility(i9);
        d2 d2Var3 = this.U;
        if (!this.f16880a0) {
            i10 = 0;
        }
        d2Var3.setVisibility(i10);
        C0();
        d dVar4 = this.f16881b0;
        if (dVar4 != null) {
            dVar4.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starOptionsLoaded) {
            r0();
            d dVar = this.f16881b0;
            if (dVar != null) {
                dVar.N(true);
            }
            if (this.J == 0 && this.K < 0) {
                this.K = 0;
            }
            k0();
        } else if (i9 == NotificationCenter.starTransactionsLoaded) {
            v7 y10 = v7.y(this.currentAccount, true);
            if (this.Z != y10.O(0)) {
                this.Z = y10.O(0);
                r0();
                d dVar2 = this.f16881b0;
                if (dVar2 != null) {
                    dVar2.N(true);
                }
                if (this.J == 0 && this.K < 0) {
                    this.K = 0;
                }
                k0();
            }
        } else if (i9 == NotificationCenter.starSubscriptionsLoaded) {
            d dVar3 = this.f16881b0;
            if (dVar3 != null) {
                dVar3.N(true);
            }
        } else if (i9 == NotificationCenter.starBalanceUpdated) {
            C0();
        } else if (i9 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            C0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return f6.w0(null, f6.f23091i5, false);
    }

    @Override
    public final r0 m0() {
        d dVar = new d(this, this.f44314c, getParentActivity(), this.currentAccount, this.classGuid, new b8(this, 3), getResourceProvider());
        this.f16881b0 = dVar;
        dVar.f35188r = false;
        return dVar;
    }

    @Override
    public final w10 n0() {
        return new z9(this, getParentActivity());
    }

    @Override
    public final w1 o0() {
        return new c(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        v7.y(this.currentAccount, true).T(true);
        v7.y(this.currentAccount, true).S();
        v7.y(this.currentAccount, true).z();
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
        j jVar = this.M;
        if (jVar != null) {
            jVar.setPaused(true);
            this.M.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        j jVar = this.M;
        if (jVar != null) {
            jVar.setPaused(false);
            this.M.setDialogVisible(false);
        }
    }

    @Override
    public final boolean p0() {
        na naVar = this.N;
        boolean z10 = false;
        if (naVar != null && (naVar.getParent() instanceof View)) {
            if (this.f44314c.getHeight() - ((View) this.N.getParent()).getBottom() >= 0) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override
    public final View q0(Context context) {
        throw null;
    }
}
