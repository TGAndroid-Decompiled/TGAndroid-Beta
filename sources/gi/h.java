package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b6.i;
import bh.r;
import bi.ca;
import bi.cc;
import bi.cd;
import bi.dd;
import bi.m0;
import bi.ra;
import bi.y;
import fi.ua;
import hi.d4;
import ig.j0;
import j$.util.Objects;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.r5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zq;
import org.telegram.ui.Wallet.m6;
import org.telegram.ui.b20;
import org.telegram.ui.d3;
import org.telegram.ui.e20;
import org.telegram.ui.f20;
import org.telegram.ui.za1;
import s4.c0;
import s4.h0;
import s4.l;
import tg.x1;
import vg.n1;
public final class h extends f20 implements NotificationCenter.NotificationCenterDelegate {
    public FrameLayout R;
    public m6 S;
    public cd T;
    public mw0 U;
    public cc V;
    public View W;
    public oe.b X;
    public oe.b Y;
    public oe.b Z;
    public int f12503b0;
    public int f12504c0;
    public boolean f12505d0;
    public boolean f12506e0;
    public cc f12508g0;
    public LinearLayout f12510i0;
    public SpannableStringBuilder f12511j0;
    public s6 f12512k0;
    public s6 f12513l0;
    public r m0;
    public fi.d f12514n0;
    public za1 f12515o0;
    public fi.d f12516p0;
    public fi.d f12517q0;
    public boolean f12518r0;
    public boolean f12519s0;
    public e f12520t0;
    public int f12502a0 = -1;
    public final ua f12507f0 = new ua(this, 5);
    public final boolean f12509h0 = z0();

    public h() {
        this.M = true;
    }

    public static void w0(h hVar, int i10) {
        u61 G;
        e eVar = hVar.f12520t0;
        if (eVar != null && (G = eVar.G(i10)) != null) {
            int i11 = G.d;
            if (i11 == -1) {
                hVar.f12520t0.O(true);
            } else if (i11 == -2) {
                ca.y(hVar.currentAccount, true).u();
                n1.e0(1, BirthdayController.getInstance(hVar.currentAccount).getState());
            } else if (i11 == -3) {
                ca.y(hVar.currentAccount, true).W();
                hVar.f12520t0.O(true);
            } else if (i11 == -4) {
                if (MessagesController.getInstance(hVar.currentAccount).isFrozen()) {
                    org.telegram.ui.b.b(hVar.currentAccount);
                } else {
                    hVar.presentFragment(new d4(hVar.getUserConfig().getClientUserId()));
                }
            }
        }
    }

    public static r5 y0(h hVar) {
        return hVar.simpleActionBar;
    }

    public static boolean z0() {
        if (!ApplicationLoader.isStandaloneBuild() && !BuildVars.isBetaApp() && !BuildVars.isHuaweiStoreApp()) {
            return false;
        }
        return true;
    }

    public final void A0() {
        D0();
        nm0 nm0Var = this.f39131c;
        if (nm0Var != null && this.U != null && nm0Var.getLayoutParams() != null) {
            int g7 = d3.g(48.0f, this.f12503b0, -AndroidUtilities.dp(8.0f));
            int g10 = d3.g(48.0f, this.f12504c0, -AndroidUtilities.dp(8.0f));
            AndroidUtilities.setViewLayoutMargins(this.f39131c, 0, g7, 0, g10);
            nm0 nm0Var2 = this.f39131c;
            int i10 = -g7;
            nm0Var2.setPadding(nm0Var2.getPaddingLeft(), i10, this.f39131c.getPaddingRight(), this.f12504c0 - g10);
            this.U.z(i10, -g10);
        }
    }

    public final void B0(ArrayList arrayList, k71 k71Var) {
        boolean z10;
        nm0 nm0Var;
        mw0 mw0Var = this.U;
        if (mw0Var != null && mw0Var.f30653e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12502a0 = -1;
        if (getParentActivity() != null) {
            ca y3 = ca.y(this.currentAccount, true);
            u61 u61Var = new u61(-2);
            u61Var.f33243c = (b20) super.k0(getParentActivity());
            arrayList.add(u61Var);
            arrayList.add(u61.k(this.f12510i0));
            boolean z11 = this.f12509h0;
            if (z11) {
                ic.a.z(R.string.GramEarningsHint, arrayList);
            }
            boolean O = y3.O(0);
            this.f12518r0 = O;
            if (O) {
                if (!z11) {
                    arrayList.add(u61.C(null));
                }
                this.f12502a0 = arrayList.size();
                arrayList.add(u61.n(this.V, -2));
                if (z10 && (nm0Var = this.f39131c) != null) {
                    ua uaVar = this.f12507f0;
                    nm0Var.removeCallbacks(uaVar);
                    this.f39131c.post(uaVar);
                    return;
                }
                return;
            }
            arrayList.add(u61.m(this.f12508g0));
        }
    }

    public final void C0() {
        int i10;
        float f7;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        final boolean z10 = true;
        ca y3 = ca.y(this.currentAccount, true);
        double d = getMessagesController().config.tonUsdRate.get();
        TL_stars.StarsAmount p10 = y3.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f12511j0);
        spannableStringBuilder.append((CharSequence) dd.I0(p10, 0.66f, ' '));
        this.f12512k0.setText(spannableStringBuilder);
        if (((int) ((p10.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.f12513l0.setText("≈" + BillingController.getInstance().formatCurrency(i10, "USD"));
        } else {
            this.f12513l0.setText(LocaleController.getString(R.string.YourTonBalance));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = m0.g(this.currentAccount).j(getUserConfig().getClientUserId(), true);
        if (j10 == null || (tL_starsRevenueStatus = j10.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = false;
        }
        if (this.f12519s0 == z10) {
            return;
        }
        this.f12519s0 = z10;
        this.m0.setVisibility(0);
        this.f12515o0.setVisibility(0);
        ViewPropertyAnimator animate = this.m0.animate();
        float f10 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).withEndAction(new Runnable(this) {
            public final h f12493b;

            {
                this.f12493b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f12493b.m0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f12493b.f12515o0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f12515o0.animate();
        if (!z10) {
            f10 = 0.0f;
        }
        animate2.alpha(f10).withEndAction(new Runnable(this) {
            public final h f12493b;

            {
                this.f12493b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f12493b.m0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f12493b.f12515o0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    public final void D0() {
        if (this.W == null) {
            return;
        }
        int dp = AndroidUtilities.dp(44.0f) + k.getCurrentActionBarHeight() + this.f12503b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != dp) {
            layoutParams.height = dp;
            this.W.setLayoutParams(layoutParams);
        }
        E0();
    }

    public final void E0() {
        float f7;
        View view = this.W;
        if (view == null) {
            return;
        }
        oe.b bVar = this.X;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        oe.b bVar2 = this.Y;
        if (bVar2 != null) {
            f10 = bVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * k.getCurrentActionBarHeight()) - ((1.0f - f10) * AndroidUtilities.dp(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f7;
        int i10;
        int i11;
        this.G = false;
        this.E = AndroidUtilities.dp(238.0f);
        mw0 mw0Var = new mw0(context);
        this.U = mw0Var;
        mw0Var.setCommonInsetsManagedExternally(true);
        if (!this.f12505d0) {
            j5 j5Var = this.parentLayout;
            if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.statusBarHeight;
            }
            this.f12503b0 = i11;
            this.f12504c0 = AndroidUtilities.navigationBarHeight;
        }
        this.U.setGeometry(new i(this, 23));
        this.U.z(-d3.g(48.0f, this.f12503b0, -AndroidUtilities.dp(8.0f)), -d3.g(48.0f, this.f12504c0, -AndroidUtilities.dp(8.0f)));
        mw0 mw0Var2 = this.U;
        mw0Var2.getClass();
        this.V = new cc(mw0Var2, context, 24);
        this.T = new cd(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.f12508g0 = new cc(this, context, 2);
        super.createView(context);
        e20 e20Var = this.f39135s;
        getBaseSimpleGlass().e(e20Var, this.f39131c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.f39138y.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().h = this.U;
        this.f39131c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f19423i = new bi.g(2, this, new bi.f(2, e20Var));
        FrameLayout tabsContainer = this.T.getTabsContainer();
        View view = new View(getParentActivity());
        this.W = view;
        float f10 = 0.0f;
        view.setAlpha(0.0f);
        mw0 mw0Var3 = this.U;
        mw0Var3.addView(this.W, mw0Var3.indexOfChild(tabsContainer), kb1.i(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        a aVar = new a(this, 0);
        ds dsVar = ds.h;
        oe.b bVar = new oe.b(0, aVar, dsVar, 380L, false);
        this.X = bVar;
        this.Y = new oe.b(1, new a(this, 1), dsVar, 380L, false);
        this.Z = new oe.b(2, new a(this, 2), dsVar, 380L, false);
        if (!this.f39131c.canScrollVertically(-1) && !this.simpleActionBar.o()) {
            z10 = false;
        } else {
            z10 = true;
        }
        bVar.a(z10, false);
        this.Y.a(this.U.f30653e0, false);
        this.f39131c.j(new ai.b(this, 11));
        D0();
        eh.d c10 = getBaseSimpleGlass().f19420c.c(tabsContainer, null, false);
        c10.v(gh.c.m(this.resourceProvider));
        c10.w(AndroidUtilities.dp(9.66f));
        c10.x(AndroidUtilities.dp(18.0f));
        tabsContainer.setBackground(c10);
        j5 j5Var2 = this.parentLayout;
        if (j5Var2 != null && ((ActionBarLayout) j5Var2).T0) {
            this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        m6 m6Var = new m6(170, context, false);
        this.S = m6Var;
        m6Var.setStarParticlesView(this.e);
        this.R.addView(this.S, kb1.h(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        f0(LocaleController.getString(R.string.GramEarningsTitle), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GramEarningsText), new ra(context, 7)), true), this.R, null);
        this.f39131c.setOverScrollMode(2);
        l lVar = new l();
        lVar.f47798m = false;
        lVar.C = false;
        lVar.o(dsVar);
        lVar.n(350L);
        this.f39131c.setItemAnimator(lVar);
        this.f39131c.setOnItemClickListener(new ai.k(this, 11));
        this.f39135s.addView(new z00(getParentActivity()), kb1.g(-1.0f, -1));
        ca.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f12510i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f12510i0.setPadding(0, AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(10.0f));
        s6 s6Var = new s6(getParentActivity(), false, true, false);
        this.f12512k0 = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        this.f12512k0.setTextSize(AndroidUtilities.dp(32.0f));
        this.f12512k0.setGravity(17);
        f7.Z(this.f12512k0, y6.G6, this.resourceProvider);
        this.f12511j0 = new SpannableStringBuilder("S");
        zq zqVar = new zq(R.drawable.mini_gram_72, 0);
        zqVar.recolorDrawable = false;
        zqVar.setScale(0.5f, 0.5f);
        zqVar.translate(-AndroidUtilities.dp(3.0f), 0.0f);
        this.f12511j0.setSpan(zqVar, 0, 1, 33);
        this.f12510i0.addView(this.f12512k0, kb1.h(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        s6 s6Var2 = new s6(getParentActivity(), false, false, false);
        this.f12513l0 = s6Var2;
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        this.f12513l0.setGravity(17);
        this.f12513l0.setText(LocaleController.getString(R.string.YourTonBalance));
        f7.Z(this.f12513l0, y6.f23768z6, this.resourceProvider);
        this.f12510i0.addView(this.f12513l0, kb1.h(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        r rVar = new r(this, getParentActivity(), 5);
        this.m0 = rVar;
        frameLayout2.addView(rVar);
        boolean z11 = this.f12509h0;
        if (z11) {
            fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f12514n0 = dVar;
            dVar.f();
            this.f12514n0.i(LocaleController.getString(R.string.TopUpViaFragment), false, true);
            this.f12514n0.setOnClickListener(new View.OnClickListener(this) {
                public final h f12491b;

                {
                    this.f12491b = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (r2) {
                        case 0:
                            qf.d.t(this.f12491b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        case 1:
                            qf.d.t(this.f12491b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                            return;
                        default:
                            h hVar = this.f12491b;
                            hVar.presentFragment(new y(1, hVar.getUserConfig().getClientUserId()));
                            return;
                    }
                }
            });
            this.m0.addView(this.f12514n0, kb1.i(-1, 48, 119));
        }
        za1 za1Var = new za1(this, getParentActivity(), 4);
        this.f12515o0 = za1Var;
        frameLayout2.addView(za1Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f12516p0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new zq(R.drawable.mini_topup, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TonTopUp));
        this.f12516p0.i(spannableStringBuilder, false, true);
        this.f12516p0.setOnClickListener(new View.OnClickListener(this) {
            public final h f12491b;

            {
                this.f12491b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        qf.d.t(this.f12491b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        qf.d.t(this.f12491b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        h hVar = this.f12491b;
                        hVar.presentFragment(new y(1, hVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        if (z11) {
            this.f12515o0.addView(this.f12516p0, kb1.t(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        fi.d dVar3 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f12517q0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new zq(R.drawable.mini_stats, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.TonStats));
        this.f12517q0.i(spannableStringBuilder2, false, true);
        this.f12517q0.setOnClickListener(new View.OnClickListener(this) {
            public final h f12491b;

            {
                this.f12491b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        qf.d.t(this.f12491b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    case 1:
                        qf.d.t(this.f12491b.getParentActivity(), LocaleController.getString(R.string.TopUpViaFragmentLink));
                        return;
                    default:
                        h hVar = this.f12491b;
                        hVar.presentFragment(new y(1, hVar.getUserConfig().getClientUserId()));
                        return;
                }
            }
        });
        this.f12515o0.addView(this.f12517q0, kb1.t(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f12510i0.addView(frameLayout2, kb1.h(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.m0.animate().cancel();
        this.f12515o0.animate().cancel();
        za1 za1Var2 = this.f12515o0;
        if (this.f12519s0) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        za1Var2.setAlpha(f7);
        r rVar2 = this.m0;
        if (!this.f12519s0) {
            f10 = 1.0f;
        }
        rVar2.setAlpha(f10);
        za1 za1Var3 = this.f12515o0;
        int i12 = 8;
        if (this.f12519s0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        za1Var3.setVisibility(i10);
        r rVar3 = this.m0;
        if (!this.f12519s0) {
            i12 = 0;
        }
        rVar3.setVisibility(i12);
        C0();
        e eVar = this.f12520t0;
        if (eVar != null) {
            eVar.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void d0() {
        mw0 mw0Var;
        super.d0();
        if (this.f12506e0 && (mw0Var = this.U) != null && this.f12502a0 != -1) {
            mw0Var.a();
        }
        this.f12506e0 = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starOptionsLoaded) {
            q0();
            e eVar = this.f12520t0;
            if (eVar != null) {
                eVar.O(true);
            }
            d0();
        } else if (i10 == NotificationCenter.starTransactionsLoaded) {
            ca y3 = ca.y(this.currentAccount, true);
            if (this.f12518r0 != y3.O(0)) {
                this.f12518r0 = y3.O(0);
                q0();
                e eVar2 = this.f12520t0;
                if (eVar2 != null) {
                    eVar2.O(false);
                }
                d0();
            }
        } else if (i10 == NotificationCenter.starSubscriptionsLoaded) {
            e eVar3 = this.f12520t0;
            if (eVar3 != null) {
                eVar3.O(true);
            }
        } else if (i10 == NotificationCenter.starBalanceUpdated) {
            C0();
        } else if (i10 == NotificationCenter.botStarsUpdated && getUserConfig().getClientUserId() == ((Long) objArr[0]).longValue()) {
            C0();
        }
    }

    @Override
    public final void e0() {
        this.f39135s.addView(this.U, kb1.g(-1.0f, -1));
        this.U.u(this.f39131c, new a(this, 3));
        mw0 mw0Var = this.U;
        cd cdVar = this.T;
        v91 viewPager = cdVar.getViewPager();
        cd cdVar2 = this.T;
        Objects.requireNonNull(cdVar2);
        mw0Var.x(cdVar, viewPager, new e1.c(cdVar2, 12));
        this.U.y(this.T.getTabsContainer());
        this.T.getTabsContainer().setLayoutParams(kb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        A0();
    }

    @Override
    public final h0 g0() {
        e eVar = new e(this, this.f39131c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 24), getResourceProvider());
        this.f12520t0 = eVar;
        eVar.f29878r = false;
        return eVar;
    }

    @Override
    public final int getNavigationBarColor() {
        return y6.x0(null, y6.f23448i5, false);
    }

    @Override
    public final c0 h0(Context context) {
        mw0 mw0Var = this.U;
        mw0Var.getClass();
        return new j0(5, mw0Var, false);
    }

    @Override
    public final x1 i0() {
        return new d(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        mw0 mw0Var = this.U;
        if (mw0Var == null || motionEvent == null || mw0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.getViewPager().f33632b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean j0() {
        return false;
    }

    @Override
    public final View k0(Context context) {
        throw null;
    }

    @Override
    public final float m0() {
        nm0 nm0Var = this.f39131c;
        if (nm0Var == null) {
            return 0.0f;
        }
        return nm0Var.getY();
    }

    @Override
    public final View n0() {
        return this.U;
    }

    @Override
    public final void o0(boolean z10) {
        oe.b bVar = this.Z;
        if (bVar != null && bVar.f19326f != z10) {
            bVar.a(z10, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.botStarsUpdated);
        ca.y(this.currentAccount, true).T(true);
        ca.y(this.currentAccount, true).S();
        ca.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm0 nm0Var = this.f39131c;
        if (nm0Var != null) {
            nm0Var.removeCallbacks(this.f12507f0);
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starSubscriptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f12505d0 = true;
        this.f12503b0 = i11;
        this.f12504c0 = i13;
        A0();
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
    public final void p0(float f7) {
        m6 m6Var = this.S;
        if (m6Var != null) {
            m6Var.setHeaderTilt(f7 * 70.0f);
        }
    }

    @Override
    public final void q0() {
        boolean z10;
        super.q0();
        mw0 mw0Var = this.U;
        if (mw0Var != null && mw0Var.f30653e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12506e0 = z10;
        nm0 nm0Var = this.f39131c;
        if (nm0Var != null && this.P >= 0) {
            this.Q -= nm0Var.getPaddingTop();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean v0() {
        return true;
    }
}
