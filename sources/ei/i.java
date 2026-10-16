package ei;

import ah.x;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ci.u;
import di.ab;
import fi.f4;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.ic1;
import org.telegram.ui.u20;
import org.telegram.ui.v20;
import s4.g0;
import sg.x1;
import ug.m1;
import w7.z5;
import zh.n5;
import zh.o7;
import zh.p;
import zh.p7;
public final class i extends v20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public c6 Q;
    public o7 R;
    public ab S;
    public final boolean T = C0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public s6 W;
    public s6 X;
    public x Y;
    public di.d Z;
    public ic1 f8799a0;
    public di.d f8800b0;
    public di.d f8801c0;
    public boolean f8802d0;
    public boolean f8803e0;
    public e f8804f0;

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
        m61 G;
        e eVar = iVar.f8804f0;
        if (eVar != null && (G = eVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                iVar.f8804f0.N(true);
            } else if (i11 == -2) {
                n5.y(iVar.currentAccount, true).u();
                m1.f0(1, BirthdayController.getInstance(iVar.currentAccount).getState());
            } else if (i11 == -3) {
                n5.y(iVar.currentAccount, true).W();
                iVar.f8804f0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(iVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(iVar.currentAccount);
                } else {
                    iVar.presentFragment(new f4(iVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void D0(ArrayList arrayList, a71 a71Var) {
        if (getParentActivity() == null) {
            return;
        }
        n5 y3 = n5.y(this.currentAccount, true);
        m61 m61Var = new m61(-2);
        m61Var.f26940c = (ab) super.r0(getParentActivity());
        arrayList.add(m61Var);
        arrayList.add(m61.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            i2.d.B(R.string.GramEarningsHint, arrayList);
        }
        boolean O = y3.O(0);
        this.f8802d0 = O;
        if (O) {
            if (!z10) {
                arrayList.add(m61.B(null));
            }
            arrayList.add(m61.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(m61.l(this.S));
    }

    public final void E0() {
        int i10;
        float f7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        n5 y3 = n5.y(this.currentAccount, true);
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
        TLRPC.TL_payments_starsRevenueStats j10 = p.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        if (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = false;
        }
        if (this.f8803e0 == z10) {
            return;
        }
        this.f8803e0 = z10;
        this.Y.setVisibility(0);
        this.f8799a0.setVisibility(0);
        ViewPropertyAnimator animate = this.Y.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final i f8790b;

            {
                this.f8790b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f8790b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f8790b.f8799a0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f8799a0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final i f8790b;

            {
                this.f8790b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f8790b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f8790b.f8799a0.setVisibility(8);
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
        this.S = new ab(this, context, 1);
        super.createView(context);
        b5 b5Var = this.parentLayout;
        if (b5Var != null && ((ActionBarLayout) b5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        c6 c6Var = new c6(170, context, false);
        this.Q = c6Var;
        c6Var.setStarParticlesView(this.e);
        this.P.addView(this.Q, z5.a(170.0f, 0.0f, 32.0f, 0.0f, 12.0f, 170, 17));
        m0(LocaleController.getString(R.string.GramEarningsTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GramEarningsText), new a(context, 0)), true), this.P, null);
        this.f40548c.setOverScrollMode(2);
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.f40548c.setItemAnimator(kVar);
        this.f40548c.setOnItemClickListener(new bi.d(this, 6));
        this.f40552s.addView(new d10(getParentActivity()), z5.d(-1.0f, -1));
        n5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        s6 s6Var = new s6(getParentActivity(), false, true, false);
        this.W = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(g6.w0(g6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        br brVar = new br(R.drawable.mini_gram_72, 0);
        brVar.recolorDrawable = false;
        brVar.setScale(0.5f, 0.5f);
        float f10 = 0.0f;
        brVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(brVar, 0, 1, 33);
        this.U.addView(this.W, z5.a(40.0f, 24.0f, 0.0f, 24.0f, 0.0f, -1, 17));
        s6 s6Var2 = new s6(getParentActivity(), false, false, false);
        this.X = s6Var2;
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(g6.w0(g6.f20005z6, this.resourceProvider));
        this.U.addView(this.X, z5.a(20.0f, 24.0f, 0.0f, 24.0f, 8.0f, -1, 17));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        x xVar = new x(this, getParentActivity(), 3);
        this.Y = xVar;
        frameLayout2.addView(xVar);
        boolean z10 = this.T;
        if (z10) {
            di.d dVar = new di.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.Z = dVar;
            dVar.e();
            this.Z.g(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.Z.setOnClickListener(new View.OnClickListener(this) {
                public final i f8788b;

                {
                    this.f8788b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            pf.d.t(this.f8788b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            pf.d.t(this.f8788b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            i iVar = this.f8788b;
                            iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.Y.addView(this.Z, z5.e(-1, 48, 119));
        }
        ic1 ic1Var = new ic1(this, getParentActivity(), 1);
        this.f8799a0 = ic1Var;
        frameLayout2.addView(ic1Var);
        di.d dVar2 = new di.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f8800b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new br(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.f8800b0.g(spannableStringBuilder, false, true);
        this.f8800b0.setOnClickListener(new View.OnClickListener(this) {
            public final i f8788b;

            {
                this.f8788b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pf.d.t(this.f8788b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        pf.d.t(this.f8788b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        i iVar = this.f8788b;
                        iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.f8799a0.addView(this.f8800b0, z5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        di.d dVar3 = new di.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f8801c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new br(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.f8801c0.g(spannableStringBuilder2, false, true);
        this.f8801c0.setOnClickListener(new View.OnClickListener(this) {
            public final i f8788b;

            {
                this.f8788b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        pf.d.t(this.f8788b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        pf.d.t(this.f8788b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        i iVar = this.f8788b;
                        iVar.presentFragment(new zh.g(1, iVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.f8799a0.addView(this.f8801c0, z5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, z5.a(48.0f, 20.0f, 6.0f, 20.0f, 4.0f, -1, 17));
        this.Y.animate().cancel();
        this.f8799a0.animate().cancel();
        ic1 ic1Var2 = this.f8799a0;
        if (this.f8803e0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ic1Var2.setAlpha(f7);
        x xVar2 = this.Y;
        if (!this.f8803e0) {
            f10 = 1.0f;
        }
        xVar2.setAlpha(f10);
        ic1 ic1Var3 = this.f8799a0;
        int i11 = 8;
        if (this.f8803e0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        ic1Var3.setVisibility(i10);
        x xVar3 = this.Y;
        if (!this.f8803e0) {
            i11 = 0;
        }
        xVar3.setVisibility(i11);
        E0();
        e eVar = this.f8804f0;
        if (eVar != null) {
            eVar.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            t0();
            e eVar = this.f8804f0;
            if (eVar != null) {
                eVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            n5 y3 = n5.y(this.currentAccount, true);
            if (this.f8802d0 != y3.O(0)) {
                this.f8802d0 = y3.O(0);
                t0();
                e eVar2 = this.f8804f0;
                if (eVar2 != null) {
                    eVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            e eVar3 = this.f8804f0;
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
        return g6.x0(null, g6.f19689i5, false);
    }

    @Override
    public final g0 n0() {
        e eVar = new e(this, this.f40548c, getParentActivity(), this.currentAccount, this.classGuid, new u(this, 10), getResourceProvider());
        this.f8804f0 = eVar;
        eVar.f23145r = false;
        return eVar;
    }

    @Override
    public final u20 o0() {
        return new f(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        n5.y(this.currentAccount, true).T(true);
        n5.y(this.currentAccount, true).S();
        n5.y(this.currentAccount, true).z();
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
        c6 c6Var = this.Q;
        if (c6Var != null) {
            c6Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        c6 c6Var = this.Q;
        if (c6Var != null) {
            c6Var.setPaused(false);
        }
    }

    @Override
    public final x1 p0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        o7 o7Var = this.R;
        boolean z10 = false;
        if (o7Var != null && (o7Var.getParent() instanceof View)) {
            if (this.f40548c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
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
        c6 c6Var = this.Q;
        if (c6Var != null) {
            c6Var.setHeaderTilt(f7 * 70.0f);
        }
    }
}
