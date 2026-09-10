package ci;

import ai.c0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.ld;
import bi.nc;
import com.google.android.gms.internal.vision.e2;
import di.h4;
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
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y00;
import org.telegram.ui.gc1;
import org.telegram.ui.r20;
import org.telegram.ui.s20;
import qg.x1;
import s4.h0;
import sg.p1;
import w7.a6;
import xh.p;
import xh.v5;
import xh.y7;
import xh.z7;
public final class j extends s20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public rg.f Q;
    public y7 R;
    public nc S;
    public final boolean T = B0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public o6 W;
    public o6 X;
    public ld Y;
    public bi.d Z;
    public gc1 f4711a0;
    public bi.d f4712b0;
    public bi.d f4713c0;
    public boolean f4714d0;
    public boolean f4715e0;
    public e f4716f0;

    public j() {
        this.M = true;
    }

    public static boolean B0() {
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            return false;
        }
        return true;
    }

    public static void x0(j jVar, int i10) {
        v51 G;
        e eVar = jVar.f4716f0;
        if (eVar != null && (G = eVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                jVar.f4716f0.N(true);
            } else if (i11 == -2) {
                v5.y(jVar.currentAccount, true).u();
                p1.e0(1, BirthdayController.getInstance(jVar.currentAccount).getState());
            } else if (i11 == -3) {
                v5.y(jVar.currentAccount, true).W();
                jVar.f4716f0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(jVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(jVar.currentAccount);
                } else {
                    jVar.presentFragment(new h4(jVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void C0(ArrayList arrayList, j61 j61Var) {
        if (getParentActivity() == null) {
            return;
        }
        v5 y3 = v5.y(this.currentAccount, true);
        v51 v51Var = new v51(-2);
        v51Var.f27823c = (nc) super.r0(getParentActivity());
        arrayList.add(v51Var);
        arrayList.add(v51.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            e2.w(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y3.O(0);
        this.f4714d0 = O;
        if (O) {
            if (!z10) {
                arrayList.add(v51.B(null));
            }
            arrayList.add(v51.p(this.R, AndroidUtilities.dp(24.0f) + l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(v51.l(this.S));
    }

    public final void D0() {
        float f7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        v5 y3 = v5.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) z7.J0(p5, 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        int i10 = (int) ((p5.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            o6 o6Var = this.X;
            o6Var.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = p.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        z10 = (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false;
        if (this.f4715e0 == z10) {
            return;
        }
        this.f4715e0 = z10;
        this.Y.setVisibility(0);
        this.f4711a0.setVisibility(0);
        ViewPropertyAnimator animate = this.Y.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final j f4699b;

            {
                this.f4699b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f4699b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f4699b.f4711a0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f4711a0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final j f4699b;

            {
                this.f4699b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f4699b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f4699b.f4711a0.setVisibility(8);
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
        this.R = new y7(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new nc(this, context, 1);
        super.createView(context);
        f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        rg.f fVar = new rg.f(context, 1, 4);
        this.Q = fVar;
        rg.a aVar = fVar.f41485b;
        aVar.f41471w = j6.fk;
        aVar.f41472x = j6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, a6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new a(context, 0)), true), this.P, null);
        this.f36527c.setOverScrollMode(2);
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wr.h);
        jVar.n(350L);
        this.f36527c.setItemAnimator(jVar);
        this.f36527c.setOnItemClickListener(new ai.g(this, 5));
        this.f36531s.addView(new y00(getParentActivity()), a6.c(-1.0f, -1));
        v5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        o6 o6Var = new o6(getParentActivity(), false, true, false);
        this.W = o6Var;
        o6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(j6.v0(j6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        uq uqVar = new uq(R.drawable.mini_gram_72, 0);
        uqVar.setOverrideColor(-13397548);
        uqVar.setScale(0.5f, 0.5f);
        float f10 = 0.0f;
        uqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(uqVar, 0, 1, 33);
        this.U.addView(this.W, a6.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        o6 o6Var2 = new o6(getParentActivity(), false, false, false);
        this.X = o6Var2;
        o6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(j6.v0(j6.f18325z6, this.resourceProvider));
        this.U.addView(this.X, a6.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        ld ldVar = new ld(this, getParentActivity(), 1);
        this.Y = ldVar;
        frameLayout2.addView(ldVar);
        boolean z10 = this.T;
        if (z10) {
            bi.d dVar = new bi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.Z = dVar;
            dVar.e();
            this.Z.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.Z.setOnClickListener(new View.OnClickListener(this) {
                public final j f4697b;

                {
                    this.f4697b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f4697b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            nf.f.u(this.f4697b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            j jVar2 = this.f4697b;
                            jVar2.presentFragment(new xh.h(1, jVar2.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.Y.addView(this.Z, a6.e(-1, 48, 119));
        }
        gc1 gc1Var = new gc1(this, getParentActivity(), 1);
        this.f4711a0 = gc1Var;
        frameLayout2.addView(gc1Var);
        bi.d dVar2 = new bi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f4712b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new uq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.f4712b0.g(spannableStringBuilder, false, true);
        this.f4712b0.setOnClickListener(new View.OnClickListener(this) {
            public final j f4697b;

            {
                this.f4697b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nf.f.u(this.f4697b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        nf.f.u(this.f4697b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        j jVar2 = this.f4697b;
                        jVar2.presentFragment(new xh.h(1, jVar2.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.f4711a0.addView(this.f4712b0, a6.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        bi.d dVar3 = new bi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f4713c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new uq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.f4713c0.g(spannableStringBuilder2, false, true);
        this.f4713c0.setOnClickListener(new View.OnClickListener(this) {
            public final j f4697b;

            {
                this.f4697b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nf.f.u(this.f4697b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        nf.f.u(this.f4697b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        j jVar2 = this.f4697b;
                        jVar2.presentFragment(new xh.h(1, jVar2.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.f4711a0.addView(this.f4713c0, a6.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, a6.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.Y.animate().cancel();
        this.f4711a0.animate().cancel();
        gc1 gc1Var2 = this.f4711a0;
        if (this.f4715e0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        gc1Var2.setAlpha(f7);
        ld ldVar2 = this.Y;
        if (!this.f4715e0) {
            f10 = 1.0f;
        }
        ldVar2.setAlpha(f10);
        gc1 gc1Var3 = this.f4711a0;
        int i11 = 8;
        if (this.f4715e0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gc1Var3.setVisibility(i10);
        ld ldVar3 = this.Y;
        if (!this.f4715e0) {
            i11 = 0;
        }
        ldVar3.setVisibility(i11);
        D0();
        e eVar = this.f4716f0;
        if (eVar != null) {
            eVar.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            e eVar = this.f4716f0;
            if (eVar != null) {
                eVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            v5 y3 = v5.y(this.currentAccount, true);
            if (this.f4714d0 != y3.O(0)) {
                this.f4714d0 = y3.O(0);
                s0();
                e eVar2 = this.f4716f0;
                if (eVar2 != null) {
                    eVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            e eVar3 = this.f4716f0;
            if (eVar3 != null) {
                eVar3.N(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            D0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            D0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return j6.w0(null, j6.f18016i5, false);
    }

    @Override
    public final h0 n0() {
        e eVar = new e(this, this.f36527c, getParentActivity(), this.currentAccount, this.classGuid, new c0(this, 10), getResourceProvider());
        this.f4716f0 = eVar;
        eVar.f24250r = false;
        return eVar;
    }

    @Override
    public final r20 o0() {
        return new f(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        v5.y(this.currentAccount, true).T(true);
        v5.y(this.currentAccount, true).S();
        v5.y(this.currentAccount, true).z();
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
        rg.f fVar = this.Q;
        if (fVar != null) {
            fVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        rg.f fVar = this.Q;
        if (fVar != null) {
            fVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override
    public final x1 p0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        y7 y7Var = this.R;
        boolean z10 = false;
        if (y7Var != null && (y7Var.getParent() instanceof View)) {
            if (this.f36527c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
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
