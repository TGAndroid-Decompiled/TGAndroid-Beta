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
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.x51;
import org.telegram.ui.bc1;
import org.telegram.ui.q20;
import org.telegram.ui.r20;
import rg.v1;
import s4.h0;
import s4.j;
import tg.m1;
import w7.y5;
import yh.o;
import yh.t5;
import yh.u7;
import yh.v7;
public final class i extends r20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout P;
    public sg.e Q;
    public u7 R;
    public eb S;
    public final boolean T = B0();
    public LinearLayout U;
    public SpannableStringBuilder V;
    public p6 W;
    public p6 X;
    public f0 Y;
    public ci.d Z;
    public bc1 f7758a0;
    public ci.d f7759b0;
    public ci.d f7760c0;
    public boolean f7761d0;
    public boolean f7762e0;
    public e f7763f0;

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
        x51 G;
        e eVar = iVar.f7763f0;
        if (eVar != null && (G = eVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                iVar.f7763f0.N(true);
            } else if (i11 == -2) {
                t5.y(iVar.currentAccount, true).u();
                m1.e0(1, BirthdayController.getInstance(iVar.currentAccount).getState());
            } else if (i11 == -3) {
                t5.y(iVar.currentAccount, true).W();
                iVar.f7763f0.N(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(iVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(iVar.currentAccount);
                } else {
                    iVar.presentFragment(new e4(iVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public final void C0(ArrayList arrayList, l61 l61Var) {
        if (getParentActivity() == null) {
            return;
        }
        t5 y3 = t5.y(this.currentAccount, true);
        x51 x51Var = new x51(-2);
        x51Var.f30242c = (eb) super.r0(getParentActivity());
        arrayList.add(x51Var);
        arrayList.add(x51.k(this.U));
        boolean z10 = this.T;
        if (z10) {
            e2.w(R.string.TopUpViaFragmentInfo, arrayList);
        }
        boolean O = y3.O(0);
        this.f7761d0 = O;
        if (O) {
            if (!z10) {
                arrayList.add(x51.B(null));
            }
            arrayList.add(x51.p(this.R, AndroidUtilities.dp(24.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.navigationBarHeight, false));
            return;
        }
        arrayList.add(x51.l(this.S));
    }

    public final void D0() {
        float f7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        t5 y3 = t5.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p5 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.V);
        spannableStringBuilder.append((CharSequence) v7.J0(p5, 0.66f, ' '));
        this.W.setText(spannableStringBuilder);
        int i10 = (int) ((p5.amount / 1.0E9d) * d * 100.0d);
        if (i10 > 0) {
            p6 p6Var = this.X;
            p6Var.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = o.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        z10 = (j3 == null || (tL_starsRevenueStatus = j3.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) ? false : false;
        if (this.f7762e0 == z10) {
            return;
        }
        this.f7762e0 = z10;
        this.Y.setVisibility(0);
        this.f7758a0.setVisibility(0);
        ViewPropertyAnimator animate = this.Y.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final i f7749b;

            {
                this.f7749b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f7749b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f7749b.f7758a0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f7758a0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final i f7749b;

            {
                this.f7749b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f7749b.Y.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f7749b.f7758a0.setVisibility(8);
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
        this.R = new u7(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider());
        this.S = new eb(this, context, 1);
        super.createView(context);
        d5 d5Var = this.parentLayout;
        if (d5Var != null && ((ActionBarLayout) d5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClickable(true);
        sg.e eVar = new sg.e(context, 1, 4);
        this.Q = eVar;
        sg.a aVar = eVar.f43195b;
        aVar.f43183w = j6.fk;
        aVar.f43184x = j6.gk;
        aVar.b();
        this.Q.setStarParticlesView(this.e);
        this.P.addView(this.Q, y5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        m0(LocaleController.getString(R.string.TONBalanceTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TONBalanceText), new a(context, 0)), true), this.P, null);
        this.f36938c.setOverScrollMode(2);
        j jVar = new j();
        jVar.f42964m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.f36938c.setItemAnimator(jVar);
        this.f36938c.setOnItemClickListener(new ai.g(this, 6));
        this.f36942s.addView(new r00(getParentActivity()), y5.c(-1.0f, -1));
        t5.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        this.U.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        p6 p6Var = new p6(getParentActivity(), false, true, false);
        this.W = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
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
        this.U.addView(this.W, y5.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        p6 p6Var2 = new p6(getParentActivity(), false, false, false);
        this.X = p6Var2;
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.X.setGravity(17);
        this.X.setText(LocaleController.getString(R.string.YourTonBalance));
        this.X.setTextColor(j6.v0(j6.f19464z6, this.resourceProvider));
        this.U.addView(this.X, y5.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
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
                public final i f7747b;

                {
                    this.f7747b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            nf.f.u(this.f7747b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            nf.f.u(this.f7747b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            i iVar = this.f7747b;
                            iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.Y.addView(this.Z, y5.e(-1, 48, 119));
        }
        bc1 bc1Var = new bc1(this, getParentActivity(), 1);
        this.f7758a0 = bc1Var;
        frameLayout2.addView(bc1Var);
        ci.d dVar2 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f7759b0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new oq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.f7759b0.g(spannableStringBuilder, false, true);
        this.f7759b0.setOnClickListener(new View.OnClickListener(this) {
            public final i f7747b;

            {
                this.f7747b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nf.f.u(this.f7747b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        nf.f.u(this.f7747b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        i iVar = this.f7747b;
                        iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z10) {
            this.f7758a0.addView(this.f7759b0, y5.p(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        ci.d dVar3 = new ci.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f7760c0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new oq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.f7760c0.g(spannableStringBuilder2, false, true);
        this.f7760c0.setOnClickListener(new View.OnClickListener(this) {
            public final i f7747b;

            {
                this.f7747b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nf.f.u(this.f7747b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        nf.f.u(this.f7747b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        i iVar = this.f7747b;
                        iVar.presentFragment(new yh.g(1, iVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.f7758a0.addView(this.f7760c0, y5.p(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.U.addView(frameLayout2, y5.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.Y.animate().cancel();
        this.f7758a0.animate().cancel();
        bc1 bc1Var2 = this.f7758a0;
        if (this.f7762e0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        bc1Var2.setAlpha(f7);
        f0 f0Var2 = this.Y;
        if (!this.f7762e0) {
            f10 = 1.0f;
        }
        f0Var2.setAlpha(f10);
        bc1 bc1Var3 = this.f7758a0;
        int i11 = 8;
        if (this.f7762e0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        bc1Var3.setVisibility(i10);
        f0 f0Var3 = this.Y;
        if (!this.f7762e0) {
            i11 = 0;
        }
        f0Var3.setVisibility(i11);
        D0();
        e eVar2 = this.f7763f0;
        if (eVar2 != null) {
            eVar2.N(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            s0();
            e eVar = this.f7763f0;
            if (eVar != null) {
                eVar.N(true);
            }
            if (this.N == 0 && this.O < 0) {
                this.O = 0;
            }
            l0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            t5 y3 = t5.y(this.currentAccount, true);
            if (this.f7761d0 != y3.O(0)) {
                this.f7761d0 = y3.O(0);
                s0();
                e eVar2 = this.f7763f0;
                if (eVar2 != null) {
                    eVar2.N(true);
                }
                if (this.N == 0 && this.O < 0) {
                    this.O = 0;
                }
                l0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            e eVar3 = this.f7763f0;
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
        return j6.w0(null, j6.f19151i5, false);
    }

    @Override
    public final h0 n0() {
        e eVar = new e(this, this.f36938c, getParentActivity(), this.currentAccount, this.classGuid, new v(this, 10), getResourceProvider());
        this.f7763f0 = eVar;
        eVar.f26042r = false;
        return eVar;
    }

    @Override
    public final q20 o0() {
        return new f(this, getParentActivity());
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botStarsUpdated);
        t5.y(this.currentAccount, true).T(true);
        t5.y(this.currentAccount, true).S();
        t5.y(this.currentAccount, true).z();
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
        u7 u7Var = this.R;
        boolean z10 = false;
        if (u7Var != null && (u7Var.getParent() instanceof View)) {
            if (this.f36938c.getHeight() - ((View) this.R.getParent()).getBottom() >= 0) {
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
