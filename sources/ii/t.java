package ii;

import ai.a1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.f2;
import bi.g3;
import bi.h2;
import bi.j8;
import bi.n8;
import bi.o3;
import bi.r6;
import c8.j0;
import c8.na;
import di.e0;
import di.ob;
import di.pb;
import di.ua;
import di.v6;
import di.y8;
import hi.b0;
import hi.e7;
import hi.x4;
import j$.util.Objects;
import java.util.ArrayList;
import ki.h3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r1;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Wallet.m7;
import org.telegram.ui.d61;
import org.telegram.ui.r00;
import org.telegram.ui.s00;
import org.telegram.ui.uv;
import ug.t1;
import v4.h0;
public final class t extends s00 implements gs {
    public FrameLayout S;
    public m7 T;
    public ob U;
    public tt0 V;
    public o3 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a f16328a0;
    public int f16330c0;
    public int f16331d0;
    public boolean f16332e0;
    public boolean f16333f0;
    public o3 f16335h0;
    public final boolean f16336i0;
    public LinearLayout f16337j0;
    public SpannableStringBuilder f16338k0;
    public o6 f16339l0;
    public o6 m0;
    public g3 f16340n0;
    public hi.d f16341o0;
    public d61 f16342p0;
    public hi.d f16343q0;
    public hi.d f16344r0;
    public boolean f16345s0;
    public boolean f16346t0;
    public boolean f16347u0;
    public j8 f16348v0;
    public int f16329b0 = -1;
    public final b0 f16334g0 = new b0(this, 24);

    public t() {
        boolean z10;
        t0.u();
        if (!s2.a()) {
            t0.r();
            z10 = false;
        } else {
            z10 = true;
        }
        this.f16336i0 = z10;
        this.N = true;
    }

    public static void A0(t tVar, int i7) {
        o41 G;
        j8 j8Var = tVar.f16348v0;
        if (j8Var != null && (G = j8Var.G(i7)) != null) {
            int i10 = G.d;
            if (i10 == -1) {
                tVar.f16348v0.O(true);
            } else if (i10 == -2) {
                y8.y(tVar.currentAccount, true).u();
                f2.l1(true, v1.a(tVar.currentAccount).b());
            } else if (i10 == -3) {
                y8.y(tVar.currentAccount, true).U();
                tVar.f16348v0.O(true);
            } else if (i10 == -4) {
                if (np.u1(tVar.currentAccount).A2()) {
                    org.telegram.ui.b.b(tVar.currentAccount);
                } else {
                    tVar.presentFragment(new h3(tVar.getUserConfig().e()));
                }
            }
        }
    }

    public final void D0() {
        G0();
        ek0 ek0Var = this.f51836c;
        if (ek0Var != null && this.V != null && ek0Var.getLayoutParams() != null) {
            int D = o10.D(48.0f, this.f16330c0, -g0.L(8.0f));
            int D2 = o10.D(48.0f, this.f16331d0, -g0.L(8.0f));
            g0.z3(this.f51836c, 0, D, 0, D2);
            ek0 ek0Var2 = this.f51836c;
            int i7 = -D;
            ek0Var2.setPadding(ek0Var2.getPaddingLeft(), i7, this.f51836c.getPaddingRight(), this.f16331d0 - D2);
            this.V.z(i7, -D2);
        }
    }

    public final void E0(ArrayList arrayList, c51 c51Var) {
        boolean z10;
        ek0 ek0Var;
        tt0 tt0Var = this.V;
        if (tt0Var != null && tt0Var.f40026f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16329b0 = -1;
        if (getParentActivity() != null) {
            y8 y10 = y8.y(this.currentAccount, true);
            o41 o41Var = new o41(-2);
            o41Var.f38050c = (uv) super.o0(getParentActivity());
            arrayList.add(o41Var);
            arrayList.add(o41.k(this.f16337j0));
            boolean z11 = this.f16336i0;
            if (z11 && !n.c(this.currentAccount)) {
                arrayList.add(o41.C(hd.N0(2131749338, null)));
            }
            boolean M = y10.M(0);
            this.f16345s0 = M;
            if (M) {
                if (!z11 || n.c(this.currentAccount)) {
                    arrayList.add(o41.C(null));
                }
                this.f16329b0 = arrayList.size();
                arrayList.add(o41.n(this.W, -2));
                if (z10 && (ek0Var = this.f51836c) != null) {
                    b0 b0Var = this.f16334g0;
                    ek0Var.removeCallbacks(b0Var);
                    this.f51836c.post(b0Var);
                    return;
                }
                return;
            }
            arrayList.add(o41.m(this.f16335h0));
        }
    }

    public final void F0() {
        int i7;
        final boolean z10;
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        y8 y10 = y8.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().A7.f26195l.f15680b).f24529a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f16338k0);
        spannableStringBuilder.append((CharSequence) pb.M0(p10, 0.66f, ' '));
        this.f16339l0.setText(spannableStringBuilder);
        if (((int) ((p10.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.m0.setText("≈" + r1.i().f(i7, "USD"));
        } else {
            this.m0.setText(hd.N0(2131742525, null));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = e0.g(this.currentAccount).j(getUserConfig().e(), false);
        if (!this.f16347u0) {
            if (j3 != null && (tL_starsRevenueStatus = j3.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f16346t0 == z10) {
                return;
            }
            this.f16346t0 = z10;
            this.f16340n0.setVisibility(0);
            this.f16342p0.setVisibility(0);
            ViewPropertyAnimator animate = this.f16340n0.animate();
            float f11 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final t f16324b;

                {
                    this.f16324b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f16324b.f16340n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f16324b.f16342p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f16342p0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final t f16324b;

                {
                    this.f16324b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f16324b.f16340n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f16324b.f16342p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
        }
    }

    public final void G0() {
        if (this.X == null) {
            return;
        }
        int L = g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f16330c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        H0();
    }

    public final void H0() {
        float f10;
        View view = this.X;
        if (view == null) {
            return;
        }
        te.a aVar = this.Y;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f57665e;
        }
        te.a aVar2 = this.Z;
        if (aVar2 != null) {
            f11 = aVar2.f57665e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * g0.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        this.H = false;
        this.F = g0.L(238.0f);
        tt0 tt0Var = new tt0(context);
        this.V = tt0Var;
        tt0Var.setCommonInsetsManagedExternally(true);
        if (!this.f16332e0) {
            r4 r4Var = this.parentLayout;
            if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
                i12 = 0;
            } else {
                i12 = g0.f24004m;
            }
            this.f16330c0 = i12;
            this.f16331d0 = g0.f24005n;
        }
        this.V.setGeometry(new x4(this, 4));
        this.V.z(-o10.D(48.0f, this.f16330c0, -g0.L(8.0f)), -o10.D(48.0f, this.f16331d0, -g0.L(8.0f)));
        tt0 tt0Var2 = this.V;
        tt0Var2.getClass();
        this.W = new o3(26, context, tt0Var2);
        this.U = new ob(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.f16335h0 = new o3(4, context, this);
        super.createView(context);
        r00 r00Var = this.f51841s;
        getBaseSimpleGlass().f(r00Var, this.f51836c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f56635n = this.V;
        this.f51836c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f56636o = new di.f(2, this, new di.e(2, r00Var));
        FrameLayout tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        tt0 tt0Var3 = this.V;
        tt0Var3.addView(this.X, tt0Var3.indexOfChild(tabsContainer), na.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        o oVar = new o(this, 0);
        nr nrVar = nr.h;
        te.a aVar = new te.a(0, oVar, nrVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new o(this, 1), nrVar, 380L, false);
        this.f16328a0 = new te.a(2, new o(this, 2), nrVar, 380L, false);
        if (!this.f51836c.canScrollVertically(-1) && !this.simpleActionBar.x()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar.a(z10, false);
        this.Z.a(this.V.f40026f0, false);
        this.f51836c.j(new bi.v1(this, 17));
        G0();
        fh.g c10 = getBaseSimpleGlass().f56626c.c(tabsContainer, null, false);
        c10.p(j0.m(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        r4 r4Var2 = this.parentLayout;
        if (r4Var2 != null && ((ActionBarLayout) r4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        m7 m7Var = new m7(170, context, false);
        this.T = m7Var;
        m7Var.setStarParticlesView(this.f51837e);
        this.S.addView(this.T, na.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        String N0 = hd.N0(2131749335, null);
        if (n.c(this.currentAccount)) {
            i7 = 2131749336;
        } else {
            i7 = 2131749337;
        }
        int i13 = 8;
        j0(N0, g0.H2(g0.T2(hd.N0(i7, null), new h2(context, 8)), true), this.S, null);
        this.f51836c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.f59139m = false;
        kVar.C = false;
        kVar.o(nrVar);
        kVar.n(350L);
        this.f51836c.setItemAnimator(kVar);
        this.f51836c.setOnItemClickListener(new n8(this, 12));
        this.f51841s.addView(new wz(getParentActivity()), na.c(-1.0f, -1));
        y8.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f16337j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f16337j0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        o6 o6Var = new o6(getParentActivity(), false, true, false);
        this.f16339l0 = o6Var;
        o6Var.setTypeface(g0.o());
        this.f16339l0.setTextSize(g0.L(32.0f));
        this.f16339l0.setGravity(17);
        t6.Y(this.f16339l0, m6.G6, this.resourceProvider);
        this.f16338k0 = new SpannableStringBuilder("S");
        nq nqVar = new nq(2131231958, 0);
        nqVar.d = false;
        nqVar.I = 0.5f;
        nqVar.J = 0.5f;
        nqVar.f37907r = -g0.L(3.0f);
        nqVar.f37908s = 0.0f;
        this.f16338k0.setSpan(nqVar, 0, 1, 33);
        this.f16337j0.addView(this.f16339l0, na.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        o6 o6Var2 = new o6(getParentActivity(), false, false, false);
        this.m0 = o6Var2;
        o6Var2.setTextSize(g0.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(hd.N0(2131742525, null));
        t6.Y(this.m0, m6.f29758z6, this.resourceProvider);
        this.f16337j0.addView(this.m0, na.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        g3 g3Var = new g3(6, getParentActivity(), this);
        this.f16340n0 = g3Var;
        frameLayout2.addView(g3Var);
        boolean c11 = n.c(this.currentAccount);
        this.f16347u0 = c11;
        if (c11) {
            this.f16346t0 = true;
        }
        boolean z11 = this.f16336i0;
        if (z11 && !c11) {
            hi.d dVar = new hi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f16341o0 = dVar;
            dVar.f();
            this.f16341o0.i(hd.N0(2131743789, null), false, true);
            this.f16341o0.setOnClickListener(new View.OnClickListener(this) {
                public final t f16322b;

                {
                    this.f16322b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    t tVar = this.f16322b;
                    switch (i14) {
                        case 0:
                            vf.c.v(tVar.getParentActivity(), hd.N0(2131743787, null), false);
                            return;
                        case 1:
                            vf.c.v(tVar.getParentActivity(), hd.N0(2131743787, null), false);
                            return;
                        case 2:
                            hi.d dVar2 = tVar.f16343q0;
                            if (dVar2 != null && !dVar2.R) {
                                dVar2.setLoading(true);
                                int currentAccount = tVar.getCurrentAccount();
                                r6 r6Var = new r6(10, dVar2, tVar);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new a1(r6Var, 13));
                                return;
                            }
                            return;
                        default:
                            tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.f16340n0.addView(this.f16341o0, na.e(-1, 48, 119));
        }
        d61 d61Var = new d61(4, getParentActivity(), this);
        this.f16342p0 = d61Var;
        frameLayout2.addView(d61Var);
        hi.d dVar2 = new hi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f16343q0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new nq(2131231978, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.N0(2131743802, null));
        this.f16343q0.i(spannableStringBuilder, false, true);
        this.f16343q0.setOnClickListener(new View.OnClickListener(this) {
            public final t f16322b;

            {
                this.f16322b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                t tVar = this.f16322b;
                switch (i14) {
                    case 0:
                        vf.c.v(tVar.getParentActivity(), hd.N0(2131743787, null), false);
                        return;
                    case 1:
                        vf.c.v(tVar.getParentActivity(), hd.N0(2131743787, null), false);
                        return;
                    case 2:
                        hi.d dVar22 = tVar.f16343q0;
                        if (dVar22 != null && !dVar22.R) {
                            dVar22.setLoading(true);
                            int currentAccount = tVar.getCurrentAccount();
                            r6 r6Var = new r6(10, dVar22, tVar);
                            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                            tL_payments_getStarsRevenueStats.ton = true;
                            tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new a1(r6Var, 13));
                            return;
                        }
                        return;
                    default:
                        tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (this.f16347u0) {
            this.f16343q0.i(hd.N0(2131749329, null), false, true);
            this.f16343q0.setOnClickListener(new View.OnClickListener(this) {
                public final t f16322b;

                {
                    this.f16322b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    t tVar = this.f16322b;
                    switch (i14) {
                        case 0:
                            vf.c.v(tVar.getParentActivity(), hd.N0(2131743787, null), false);
                            return;
                        case 1:
                            vf.c.v(tVar.getParentActivity(), hd.N0(2131743787, null), false);
                            return;
                        case 2:
                            hi.d dVar22 = tVar.f16343q0;
                            if (dVar22 != null && !dVar22.R) {
                                dVar22.setLoading(true);
                                int currentAccount = tVar.getCurrentAccount();
                                r6 r6Var = new r6(10, dVar22, tVar);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new a1(r6Var, 13));
                                return;
                            }
                            return;
                        default:
                            tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                            return;
                    }
                }
            });
        }
        if (z11 || this.f16347u0) {
            d61 d61Var2 = this.f16342p0;
            hi.d dVar3 = this.f16343q0;
            if (this.f16347u0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d61Var2.addView(dVar3, na.q(-1, 48, 17.0f, 1, 0, 0, i10, 0));
        }
        hi.d dVar4 = new hi.d(getParentActivity(), this.resourceProvider, true);
        dVar4.setRoundRadius(24);
        this.f16344r0 = dVar4;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new nq(2131231974, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) hd.N0(2131743803, null));
        this.f16344r0.i(spannableStringBuilder2, false, true);
        this.f16344r0.setOnClickListener(new View.OnClickListener(this) {
            public final t f16322b;

            {
                this.f16322b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                t tVar = this.f16322b;
                switch (i14) {
                    case 0:
                        vf.c.v(tVar.getParentActivity(), hd.N0(2131743787, null), false);
                        return;
                    case 1:
                        vf.c.v(tVar.getParentActivity(), hd.N0(2131743787, null), false);
                        return;
                    case 2:
                        hi.d dVar22 = tVar.f16343q0;
                        if (dVar22 != null && !dVar22.R) {
                            dVar22.setLoading(true);
                            int currentAccount = tVar.getCurrentAccount();
                            r6 r6Var = new r6(10, dVar22, tVar);
                            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                            tL_payments_getStarsRevenueStats.ton = true;
                            tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new a1(r6Var, 13));
                            return;
                        }
                        return;
                    default:
                        tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (!this.f16347u0) {
            this.f16342p0.addView(this.f16344r0, na.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        }
        this.f16337j0.addView(frameLayout2, na.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.f16340n0.animate().cancel();
        this.f16342p0.animate().cancel();
        d61 d61Var3 = this.f16342p0;
        if (this.f16346t0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        d61Var3.setAlpha(f10);
        g3 g3Var2 = this.f16340n0;
        if (this.f16346t0) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        g3Var2.setAlpha(f11);
        d61 d61Var4 = this.f16342p0;
        if (this.f16346t0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        d61Var4.setVisibility(i11);
        g3 g3Var3 = this.f16340n0;
        if (!this.f16346t0) {
            i13 = 0;
        }
        g3Var3.setVisibility(i13);
        F0();
        j8 j8Var = this.f16348v0;
        if (j8Var != null) {
            j8Var.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25379x3) {
            u0();
            j8 j8Var = this.f16348v0;
            if (j8Var != null) {
                j8Var.O(true);
            }
            h0();
        } else if (i7 == ls.B3) {
            y8 y10 = y8.y(this.currentAccount, true);
            if (this.f16345s0 != y10.M(0)) {
                this.f16345s0 = y10.M(0);
                u0();
                j8 j8Var2 = this.f16348v0;
                if (j8Var2 != null) {
                    j8Var2.O(false);
                }
                h0();
            }
        } else if (i7 == ls.C3) {
            j8 j8Var3 = this.f16348v0;
            if (j8Var3 != null) {
                j8Var3.O(true);
            }
        } else if (i7 == ls.A3) {
            F0();
        } else if (i7 == ls.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return m6.x0(null, m6.f29438i5, false);
    }

    @Override
    public final void h0() {
        tt0 tt0Var;
        super.h0();
        if (this.f16333f0 && (tt0Var = this.V) != null && this.f16329b0 != -1) {
            tt0Var.a();
        }
        this.f16333f0 = false;
    }

    @Override
    public final void i0() {
        this.f51841s.addView(this.V, na.c(-1.0f, -1));
        this.V.u(this.f51836c, new o(this, 3));
        tt0 tt0Var = this.V;
        ob obVar = this.U;
        j71 viewPager = obVar.getViewPager();
        ob obVar2 = this.U;
        Objects.requireNonNull(obVar2);
        tt0Var.x(obVar, viewPager, new v6(obVar2, 25));
        this.V.y(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        tt0 tt0Var = this.V;
        if (tt0Var == null || motionEvent == null || tt0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().f36391b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final h0 k0() {
        j8 j8Var = new j8(this, this.f51836c, getParentActivity(), this.currentAccount, this.classGuid, new e7(this, 4), getResourceProvider(), 3);
        this.f16348v0 = j8Var;
        j8Var.f34026r = false;
        return j8Var;
    }

    @Override
    public final v4.b0 l0(Context context) {
        tt0 tt0Var = this.V;
        tt0Var.getClass();
        return new jg.i0(5, tt0Var, false);
    }

    @Override
    public final t1 m0() {
        return new ua(getParentActivity(), 75, 1, 1);
    }

    @Override
    public final boolean n0() {
        return false;
    }

    @Override
    public final View o0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        ls.f(this.currentAccount).c(this, ls.f25379x3);
        ls.f(this.currentAccount).c(this, ls.A3);
        ls.f(this.currentAccount).c(this, ls.B3);
        ls.f(this.currentAccount).c(this, ls.C3);
        ls.f(this.currentAccount).c(this, ls.E3);
        y8.y(this.currentAccount, true).R(true);
        y8.y(this.currentAccount, true).Q();
        e0.g(this.currentAccount).j(getUserConfig().e(), true);
        y8.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ek0 ek0Var = this.f51836c;
        if (ek0Var != null) {
            ek0Var.removeCallbacks(this.f16334g0);
        }
        ls.f(this.currentAccount).n(this, ls.f25379x3);
        ls.f(this.currentAccount).n(this, ls.A3);
        ls.f(this.currentAccount).n(this, ls.B3);
        ls.f(this.currentAccount).n(this, ls.C3);
        ls.f(this.currentAccount).n(this, ls.E3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f16332e0 = true;
        this.f16330c0 = i10;
        this.f16331d0 = i12;
        D0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        m7 m7Var = this.T;
        if (m7Var != null) {
            m7Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        m7 m7Var = this.T;
        if (m7Var != null) {
            m7Var.setPaused(false);
        }
    }

    @Override
    public final float q0() {
        ek0 ek0Var = this.f51836c;
        if (ek0Var == null) {
            return 0.0f;
        }
        return ek0Var.getY();
    }

    @Override
    public final View r0() {
        return this.V;
    }

    @Override
    public final void s0(boolean z10) {
        te.a aVar = this.f16328a0;
        if (aVar != null && aVar.f57666f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public final void t0(float f10) {
        m7 m7Var = this.T;
        if (m7Var != null) {
            m7Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override
    public final void u0() {
        boolean z10;
        super.u0();
        tt0 tt0Var = this.V;
        if (tt0Var != null && tt0Var.f40026f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16333f0 = z10;
        ek0 ek0Var = this.f51836c;
        if (ek0Var != null && this.Q >= 0) {
            this.R -= ek0Var.getPaddingTop();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean z0() {
        return true;
    }
}
