package di;

import ai.f0;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.v;
import ci.eb;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.x51;
import org.telegram.ui.dc1;
import org.telegram.ui.s20;
import org.telegram.ui.t20;
import rg.v1;
import s4.h0;
import s4.j;
import tg.n1;
import w7.x5;
import yh.o;
import yh.v5;
import yh.x7;
import yh.y7;
public final class i extends t20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public sg.e Q;
    public x7 R;
    public eb S;
    public final boolean T = B0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public n6 W;
    public n6 X;
    public f0 Y;
    public ci.d Z;
    public dc1 f7759a0;
    public ci.d f7760b0;
    public ci.d f7761c0;
    public boolean f7762d0;
    public boolean f7763e0;
    public e f7764f0;

    public i() {
        this.M = true;
    }

    public static boolean B0() {
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            return false;
        }
        return true;
    }

    public static void x0(i iVar, int i10) {
        j51 G;
        e eVar = iVar.f7764f0;
        if (eVar != null && (G = eVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                iVar.f7764f0.N(true);
            } else if (i11 == -2) {
                v5.y(iVar.currentAccount, true).u();
                n1.e0(1, BirthdayController.getInstance(iVar.currentAccount).getState());
            } else if (i11 == -3) {
                v5.y(iVar.currentAccount, true).W();
                iVar.f7764f0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(iVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(iVar.currentAccount);
                } else {
                    iVar.presentFragment(new e4(iVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void C0(ArrayList arrayList, x51 x51Var) {
        if (getParentActivity() == null) {
            return;
        }
        v5 y3 = v5.y(this.currentAccount, true);
        j51 j51Var = new j51(-2);
        j51Var.f25121c = (eb) super.r0(getParentActivity());
        arrayList.add(j51Var);
        arrayList.add(j51.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            e2.w(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y3.O(0);
        this.f7762d0 = O;
        if (O) {
            if (!z10) {
                arrayList.add(j51.B(null));
            }
            arrayList.add(j51.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(j51.l(this.S));
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
        spannableStringBuilder.append((CharSequence) y7.J0(p5, 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        int i10 = (int) ((p5.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            n6 n6Var = this.X;
            n6Var.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = o.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        z10 = (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false;
        if (this.f7763e0 == z10) {
            return;
        }
        this.f7763e0 = z10;
        this.Y.setVisibility(0);
        this.f7759a0.setVisibility(0);
        ViewPropertyAnimator animate = this.Y.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final i f7750b;

            {
                this.f7750b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f7750b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f7750b.f7759a0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f7759a0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final i f7750b;

            {
                this.f7750b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f7750b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f7750b.f7759a0.setVisibility(8);
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
        this.R = new x7(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new eb(this, context, 1);
        super.createView(context);
        e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        sg.e eVar = new sg.e(context, 1, 4);
        this.Q = eVar;
        sg.a aVar = eVar.f42964b;
        aVar.f42952w = j6.fk;
        aVar.f42953x = j6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new a(context, 0)), true), this.P, null);
        this.f37628c.setOverScrollMode(2);
        j jVar = new j();
        jVar.f42737m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.f37628c.setItemAnimator(jVar);
        this.f37628c.setOnItemClickListener(new ai.g(this, 6));
        this.f37632s.addView(new r00(getParentActivity()), x5.c(-1.0f, -1));
        v5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        n6 n6Var = new n6(getParentActivity(), false, true, false);
        this.W = n6Var;
        n6Var.setTypeface(AndroidUtilities.bold());
        this.W.setTextSize(AndroidUtilities.dp(32.0f));
        this.W.setGravity(17);
        this.W.setTextColor(j6.v0(j6.G6, this.resourceProvider));
        this.V = new SpannableStringBuilder("S");
        oq oqVar = new oq(R.drawable.mini_gram_72, 0);
        oqVar.setOverrideColor(-13397548);
        oqVar.setScale(0.5f, 0.5f);
        float f10 = 0.0f;
        oqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.V.setSpan(oqVar, 0, 1, 33);
        this.U.addView(this.W, x5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        n6 n6Var2 = new n6(getParentActivity(), false, false, false);
        this.X = n6Var2;
        n6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(j6.v0(j6.f19264z6, this.resourceProvider));
        this.U.addView(this.X, x5.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        f0 f0Var = new f0(this, getParentActivity(), 3);
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
                public final i f7748b;

                {
                    this.f7748b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f7748b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            nf.f.u(this.f7748b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            i iVar = this.f7748b;
                            iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.Y.addView(this.Z, x5.e(-1, 48, 119));
        }
        dc1 dc1Var = new dc1(this, getParentActivity(), 1);
        this.f7759a0 = dc1Var;
        frameLayout2.addView(dc1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f7760b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new oq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.f7760b0.g(spannableStringBuilder, false, true);
        this.f7760b0.setOnClickListener(new View.OnClickListener(this) {
            public final i f7748b;

            {
                this.f7748b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nf.f.u(this.f7748b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        nf.f.u(this.f7748b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        i iVar = this.f7748b;
                        iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.f7759a0.addView(this.f7760b0, x5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f7761c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new oq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.f7761c0.g(spannableStringBuilder2, false, true);
        this.f7761c0.setOnClickListener(new View.OnClickListener(this) {
            public final i f7748b;

            {
                this.f7748b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nf.f.u(this.f7748b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        nf.f.u(this.f7748b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        i iVar = this.f7748b;
                        iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.f7759a0.addView(this.f7761c0, x5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, x5.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.Y.animate().cancel();
        this.f7759a0.animate().cancel();
        dc1 dc1Var2 = this.f7759a0;
        if (this.f7763e0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        dc1Var2.setAlpha(f7);
        f0 f0Var2 = this.Y;
        if (!this.f7763e0) {
            f10 = 1.0f;
        }
        f0Var2.setAlpha(f10);
        dc1 dc1Var3 = this.f7759a0;
        int i11 = 8;
        if (this.f7763e0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        dc1Var3.setVisibility(i10);
        f0 f0Var3 = this.Y;
        if (!this.f7763e0) {
            i11 = 0;
        }
        f0Var3.setVisibility(i11);
        D0();
        e eVar2 = this.f7764f0;
        if (eVar2 != null) {
            eVar2.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            e eVar = this.f7764f0;
            if (eVar != null) {
                eVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            v5 y3 = v5.y(this.currentAccount, true);
            if (this.f7762d0 != y3.O(0)) {
                this.f7762d0 = y3.O(0);
                s0();
                e eVar2 = this.f7764f0;
                if (eVar2 != null) {
                    eVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            e eVar3 = this.f7764f0;
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
        return j6.w0(null, j6.f18952i5, false);
    }

    @Override
    public final h0 n0() {
        e eVar = new e(this, this.f37628c, getParentActivity(), this.currentAccount, this.classGuid, new v(this, 10), getResourceProvider());
        this.f7764f0 = eVar;
        eVar.f29854r = false;
        return eVar;
    }

    @Override
    public final s20 o0() {
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
        sg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(true);
            this.Q.setDialogVisible(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        sg.e eVar = this.Q;
        if (eVar != null) {
            eVar.setPaused(false);
            this.Q.setDialogVisible(false);
        }
    }

    @Override
    public final v1 p0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean q0() {
        x7 x7Var = this.R;
        boolean z10 = false;
        if (x7Var != null && (x7Var.getParent() instanceof View)) {
            if (this.f37628c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
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
