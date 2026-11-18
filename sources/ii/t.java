package ii;

import ai.e1;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.a2;
import bi.a3;
import bi.e8;
import bi.i3;
import bi.i8;
import bi.m6;
import bi.q1;
import c8.ma;
import di.c7;
import di.e0;
import di.ob;
import di.pb;
import di.ua;
import di.x8;
import hi.e7;
import hi.w4;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.r1;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Wallet.m7;
import org.telegram.ui.d61;
import org.telegram.ui.r00;
import org.telegram.ui.s00;
import org.telegram.ui.uv;
import ug.u1;
import v4.c0;
public final class t extends s00 implements fs {
    public FrameLayout S;
    public m7 T;
    public ob U;
    public qt0 V;
    public i3 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a f16337a0;
    public int f16339c0;
    public int f16340d0;
    public boolean f16341e0;
    public boolean f16342f0;
    public i3 f16344h0;
    public final boolean f16345i0;
    public LinearLayout f16346j0;
    public SpannableStringBuilder f16347k0;
    public n6 f16348l0;
    public n6 m0;
    public a3 f16349n0;
    public hi.d f16350o0;
    public d61 f16351p0;
    public hi.d f16352q0;
    public hi.d f16353r0;
    public boolean f16354s0;
    public boolean f16355t0;
    public boolean f16356u0;
    public e8 f16357v0;
    public int f16338b0 = -1;
    public final hi.k f16343g0 = new hi.k(this, 25);

    public t() {
        boolean z10;
        t0.u();
        if (!s2.a()) {
            t0.r();
            z10 = false;
        } else {
            z10 = true;
        }
        this.f16345i0 = z10;
        this.N = true;
    }

    public static void A0(t tVar, int i7) {
        l41 G;
        e8 e8Var = tVar.f16357v0;
        if (e8Var != null && (G = e8Var.G(i7)) != null) {
            int i10 = G.d;
            if (i10 == -1) {
                tVar.f16357v0.O(true);
            } else if (i10 == -2) {
                x8.y(tVar.currentAccount, true).u();
                a2.l1(true, v1.a(tVar.currentAccount).b());
            } else if (i10 == -3) {
                x8.y(tVar.currentAccount, true).U();
                tVar.f16357v0.O(true);
            } else if (i10 == -4) {
                if (mp.u1(tVar.currentAccount).A2()) {
                    org.telegram.ui.b.b(tVar.currentAccount);
                } else {
                    tVar.presentFragment(new ki.i3(tVar.getUserConfig().e()));
                }
            }
        }
    }

    public final void D0() {
        G0();
        ck0 ck0Var = this.f51834c;
        if (ck0Var != null && this.V != null && ck0Var.getLayoutParams() != null) {
            int D = n10.D(48.0f, this.f16339c0, -g0.L(8.0f));
            int D2 = n10.D(48.0f, this.f16340d0, -g0.L(8.0f));
            g0.z3(this.f51834c, 0, D, 0, D2);
            ck0 ck0Var2 = this.f51834c;
            int i7 = -D;
            ck0Var2.setPadding(ck0Var2.getPaddingLeft(), i7, this.f51834c.getPaddingRight(), this.f16340d0 - D2);
            this.V.z(i7, -D2);
        }
    }

    public final void E0(ArrayList arrayList, z41 z41Var) {
        boolean z10;
        ck0 ck0Var;
        qt0 qt0Var = this.V;
        if (qt0Var != null && qt0Var.f38906f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16338b0 = -1;
        if (getParentActivity() != null) {
            x8 y10 = x8.y(this.currentAccount, true);
            l41 l41Var = new l41(-2);
            l41Var.f37010c = (uv) super.o0(getParentActivity());
            arrayList.add(l41Var);
            arrayList.add(l41.k(this.f16346j0));
            boolean z11 = this.f16345i0;
            if (z11 && !n.c(this.currentAccount)) {
                arrayList.add(l41.C(gd.M0(2131749339, null)));
            }
            boolean M = y10.M(0);
            this.f16354s0 = M;
            if (M) {
                if (!z11 || n.c(this.currentAccount)) {
                    arrayList.add(l41.C(null));
                }
                this.f16338b0 = arrayList.size();
                arrayList.add(l41.n(this.W, -2));
                if (z10 && (ck0Var = this.f51834c) != null) {
                    hi.k kVar = this.f16343g0;
                    ck0Var.removeCallbacks(kVar);
                    this.f51834c.post(kVar);
                    return;
                }
                return;
            }
            arrayList.add(l41.m(this.f16344h0));
        }
    }

    public final void F0() {
        int i7;
        final boolean z10;
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        x8 y10 = x8.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().A7.f26153l.f15645b).f24535a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f16347k0);
        spannableStringBuilder.append((CharSequence) pb.M0(p10, 0.66f, ' '));
        this.f16348l0.setText(spannableStringBuilder);
        if (((int) ((p10.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.m0.setText("≈" + r1.i().f(i7, "USD"));
        } else {
            this.m0.setText(gd.M0(2131742531, null));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = e0.g(this.currentAccount).j(getUserConfig().e(), false);
        if (!this.f16356u0) {
            if (j3 != null && (tL_starsRevenueStatus = j3.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f16355t0 == z10) {
                return;
            }
            this.f16355t0 = z10;
            this.f16349n0.setVisibility(0);
            this.f16351p0.setVisibility(0);
            ViewPropertyAnimator animate = this.f16349n0.animate();
            float f11 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final t f16333b;

                {
                    this.f16333b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f16333b.f16349n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f16333b.f16351p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f16351p0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final t f16333b;

                {
                    this.f16333b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f16333b.f16349n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f16333b.f16351p0.setVisibility(8);
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
        int L = g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f16339c0;
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
            f10 = aVar.f57657e;
        }
        te.a aVar2 = this.Z;
        if (aVar2 != null) {
            f11 = aVar2.f57657e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * g0.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        int i7;
        int i10;
        float f10;
        int i11;
        int i12;
        this.H = false;
        this.F = g0.L(238.0f);
        qt0 qt0Var = new qt0(context);
        this.V = qt0Var;
        qt0Var.setCommonInsetsManagedExternally(true);
        if (!this.f16341e0) {
            s4 s4Var = this.parentLayout;
            if (s4Var != null && ((ActionBarLayout) s4Var).T0) {
                i12 = 0;
            } else {
                i12 = g0.f24115m;
            }
            this.f16339c0 = i12;
            this.f16340d0 = g0.f24116n;
        }
        this.V.setGeometry(new w4(this, 4));
        this.V.z(-n10.D(48.0f, this.f16339c0, -g0.L(8.0f)), -n10.D(48.0f, this.f16340d0, -g0.L(8.0f)));
        qt0 qt0Var2 = this.V;
        qt0Var2.getClass();
        this.W = new i3(26, context, qt0Var2);
        this.U = new ob(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.f16344h0 = new i3(4, context, this);
        super.createView(context);
        r00 r00Var = this.f51839s;
        getBaseSimpleGlass().f(r00Var, this.f51834c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f56625n = this.V;
        this.f51834c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f56626o = new di.f(2, this, new di.e(2, r00Var));
        FrameLayout tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        float f11 = 0.0f;
        view.setAlpha(0.0f);
        qt0 qt0Var3 = this.V;
        qt0Var3.addView(this.X, qt0Var3.indexOfChild(tabsContainer), ma.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        o oVar = new o(this, 0);
        lr lrVar = lr.h;
        te.a aVar = new te.a(0, oVar, lrVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new o(this, 1), lrVar, 380L, false);
        this.f16337a0 = new te.a(2, new o(this, 2), lrVar, 380L, false);
        if (!this.f51834c.canScrollVertically(-1) && !this.simpleActionBar.x()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar.a(z10, false);
        this.Z.a(this.V.f38906f0, false);
        this.f51834c.j(new q1(this, 17));
        G0();
        fh.g c10 = getBaseSimpleGlass().f56616c.c(tabsContainer, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        s4 s4Var2 = this.parentLayout;
        if (s4Var2 != null && ((ActionBarLayout) s4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        m7 m7Var = new m7(170, context, false);
        this.T = m7Var;
        m7Var.setStarParticlesView(this.f51835e);
        this.S.addView(this.T, ma.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        String M0 = gd.M0(2131749336, null);
        if (n.c(this.currentAccount)) {
            i7 = 2131749337;
        } else {
            i7 = 2131749338;
        }
        j0(M0, g0.H2(g0.T2(gd.M0(i7, null), new ai.a(context, 9)), true), this.S, null);
        this.f51834c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.f59151m = false;
        kVar.C = false;
        kVar.o(lrVar);
        kVar.n(350L);
        this.f51834c.setItemAnimator(kVar);
        this.f51834c.setOnItemClickListener(new i8(this, 12));
        this.f51839s.addView(new uz(getParentActivity()), ma.c(-1.0f, -1));
        x8.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f16346j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f16346j0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        n6 n6Var = new n6(getParentActivity(), false, true, false);
        this.f16348l0 = n6Var;
        n6Var.setTypeface(g0.o());
        this.f16348l0.setTextSize(g0.L(32.0f));
        this.f16348l0.setGravity(17);
        u6.Y(this.f16348l0, org.telegram.ui.ActionBar.n6.G6, this.resourceProvider);
        this.f16347k0 = new SpannableStringBuilder("S");
        lq lqVar = new lq(2131231958, 0);
        lqVar.d = false;
        lqVar.I = 0.5f;
        lqVar.J = 0.5f;
        lqVar.f37198r = -g0.L(3.0f);
        lqVar.f37199s = 0.0f;
        this.f16347k0.setSpan(lqVar, 0, 1, 33);
        this.f16346j0.addView(this.f16348l0, ma.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        n6 n6Var2 = new n6(getParentActivity(), false, false, false);
        this.m0 = n6Var2;
        n6Var2.setTextSize(g0.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(gd.M0(2131742531, null));
        u6.Y(this.m0, org.telegram.ui.ActionBar.n6.f29807z6, this.resourceProvider);
        this.f16346j0.addView(this.m0, ma.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        a3 a3Var = new a3(6, getParentActivity(), this);
        this.f16349n0 = a3Var;
        frameLayout2.addView(a3Var);
        boolean c11 = n.c(this.currentAccount);
        this.f16356u0 = c11;
        if (c11) {
            this.f16355t0 = true;
        }
        boolean z11 = this.f16345i0;
        if (z11 && !c11) {
            hi.d dVar = new hi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f16350o0 = dVar;
            dVar.f();
            this.f16350o0.i(gd.M0(2131743795, null), false, true);
            this.f16350o0.setOnClickListener(new View.OnClickListener(this) {
                public final t f16331b;

                {
                    this.f16331b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    t tVar = this.f16331b;
                    switch (i13) {
                        case 0:
                            vf.c.v(tVar.getParentActivity(), gd.M0(2131743793, null), false);
                            return;
                        case 1:
                            vf.c.v(tVar.getParentActivity(), gd.M0(2131743793, null), false);
                            return;
                        case 2:
                            hi.d dVar2 = tVar.f16352q0;
                            if (dVar2 != null && !dVar2.R) {
                                dVar2.setLoading(true);
                                int currentAccount = tVar.getCurrentAccount();
                                m6 m6Var = new m6(10, dVar2, tVar);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new e1(m6Var, 13));
                                return;
                            }
                            return;
                        default:
                            tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.f16349n0.addView(this.f16350o0, ma.e(-1, 48, 119));
        }
        d61 d61Var = new d61(4, getParentActivity(), this);
        this.f16351p0 = d61Var;
        frameLayout2.addView(d61Var);
        hi.d dVar2 = new hi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f16352q0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new lq(2131231978, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.M0(2131743808, null));
        this.f16352q0.i(spannableStringBuilder, false, true);
        this.f16352q0.setOnClickListener(new View.OnClickListener(this) {
            public final t f16331b;

            {
                this.f16331b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i13 = r2;
                t tVar = this.f16331b;
                switch (i13) {
                    case 0:
                        vf.c.v(tVar.getParentActivity(), gd.M0(2131743793, null), false);
                        return;
                    case 1:
                        vf.c.v(tVar.getParentActivity(), gd.M0(2131743793, null), false);
                        return;
                    case 2:
                        hi.d dVar22 = tVar.f16352q0;
                        if (dVar22 != null && !dVar22.R) {
                            dVar22.setLoading(true);
                            int currentAccount = tVar.getCurrentAccount();
                            m6 m6Var = new m6(10, dVar22, tVar);
                            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                            tL_payments_getStarsRevenueStats.ton = true;
                            tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new e1(m6Var, 13));
                            return;
                        }
                        return;
                    default:
                        tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (this.f16356u0) {
            this.f16352q0.i(gd.M0(2131749330, null), false, true);
            this.f16352q0.setOnClickListener(new View.OnClickListener(this) {
                public final t f16331b;

                {
                    this.f16331b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i13 = r2;
                    t tVar = this.f16331b;
                    switch (i13) {
                        case 0:
                            vf.c.v(tVar.getParentActivity(), gd.M0(2131743793, null), false);
                            return;
                        case 1:
                            vf.c.v(tVar.getParentActivity(), gd.M0(2131743793, null), false);
                            return;
                        case 2:
                            hi.d dVar22 = tVar.f16352q0;
                            if (dVar22 != null && !dVar22.R) {
                                dVar22.setLoading(true);
                                int currentAccount = tVar.getCurrentAccount();
                                m6 m6Var = new m6(10, dVar22, tVar);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new e1(m6Var, 13));
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
        int i13 = 8;
        if (z11 || this.f16356u0) {
            d61 d61Var2 = this.f16351p0;
            hi.d dVar3 = this.f16352q0;
            if (this.f16356u0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            d61Var2.addView(dVar3, ma.q(-1, 48, 17.0f, 1, 0, 0, i10, 0));
        }
        hi.d dVar4 = new hi.d(getParentActivity(), this.resourceProvider, true);
        dVar4.setRoundRadius(24);
        this.f16353r0 = dVar4;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new lq(2131231974, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) gd.M0(2131743809, null));
        this.f16353r0.i(spannableStringBuilder2, false, true);
        this.f16353r0.setOnClickListener(new View.OnClickListener(this) {
            public final t f16331b;

            {
                this.f16331b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i132 = r2;
                t tVar = this.f16331b;
                switch (i132) {
                    case 0:
                        vf.c.v(tVar.getParentActivity(), gd.M0(2131743793, null), false);
                        return;
                    case 1:
                        vf.c.v(tVar.getParentActivity(), gd.M0(2131743793, null), false);
                        return;
                    case 2:
                        hi.d dVar22 = tVar.f16352q0;
                        if (dVar22 != null && !dVar22.R) {
                            dVar22.setLoading(true);
                            int currentAccount = tVar.getCurrentAccount();
                            m6 m6Var = new m6(10, dVar22, tVar);
                            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                            tL_payments_getStarsRevenueStats.ton = true;
                            tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new e1(m6Var, 13));
                            return;
                        }
                        return;
                    default:
                        tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (!this.f16356u0) {
            this.f16351p0.addView(this.f16353r0, ma.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        }
        this.f16346j0.addView(frameLayout2, ma.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.f16349n0.animate().cancel();
        this.f16351p0.animate().cancel();
        d61 d61Var3 = this.f16351p0;
        if (this.f16355t0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        d61Var3.setAlpha(f10);
        a3 a3Var2 = this.f16349n0;
        if (!this.f16355t0) {
            f11 = 1.0f;
        }
        a3Var2.setAlpha(f11);
        d61 d61Var4 = this.f16351p0;
        if (this.f16355t0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        d61Var4.setVisibility(i11);
        a3 a3Var3 = this.f16349n0;
        if (!this.f16355t0) {
            i13 = 0;
        }
        a3Var3.setVisibility(i13);
        F0();
        e8 e8Var = this.f16357v0;
        if (e8Var != null) {
            e8Var.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25223x3) {
            u0();
            e8 e8Var = this.f16357v0;
            if (e8Var != null) {
                e8Var.O(true);
            }
            h0();
        } else if (i7 == ks.B3) {
            x8 y10 = x8.y(this.currentAccount, true);
            if (this.f16354s0 != y10.M(0)) {
                this.f16354s0 = y10.M(0);
                u0();
                e8 e8Var2 = this.f16357v0;
                if (e8Var2 != null) {
                    e8Var2.O(false);
                }
                h0();
            }
        } else if (i7 == ks.C3) {
            e8 e8Var3 = this.f16357v0;
            if (e8Var3 != null) {
                e8Var3.O(true);
            }
        } else if (i7 == ks.A3) {
            F0();
        } else if (i7 == ks.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29487i5, false);
    }

    @Override
    public final void h0() {
        qt0 qt0Var;
        super.h0();
        if (this.f16342f0 && (qt0Var = this.V) != null && this.f16338b0 != -1) {
            qt0Var.a();
        }
        this.f16342f0 = false;
    }

    @Override
    public final void i0() {
        this.f51839s.addView(this.V, ma.c(-1.0f, -1));
        this.V.u(this.f51834c, new o(this, 3));
        qt0 qt0Var = this.V;
        ob obVar = this.U;
        g71 viewPager = obVar.getViewPager();
        ob obVar2 = this.U;
        Objects.requireNonNull(obVar2);
        qt0Var.x(obVar, viewPager, new c7(obVar2, 24));
        this.V.y(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        qt0 qt0Var = this.V;
        if (qt0Var == null || motionEvent == null || qt0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().f35376b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final v4.i0 k0() {
        e8 e8Var = new e8(this, this.f51834c, getParentActivity(), this.currentAccount, this.classGuid, new e7(this, 4), getResourceProvider(), 3);
        this.f16357v0 = e8Var;
        e8Var.f42809r = false;
        return e8Var;
    }

    @Override
    public final c0 l0(Context context) {
        qt0 qt0Var = this.V;
        qt0Var.getClass();
        return new jg.i0(5, qt0Var, false);
    }

    @Override
    public final u1 m0() {
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
        ks.f(this.currentAccount).c(this, ks.f25223x3);
        ks.f(this.currentAccount).c(this, ks.A3);
        ks.f(this.currentAccount).c(this, ks.B3);
        ks.f(this.currentAccount).c(this, ks.C3);
        ks.f(this.currentAccount).c(this, ks.E3);
        x8.y(this.currentAccount, true).R(true);
        x8.y(this.currentAccount, true).Q();
        e0.g(this.currentAccount).j(getUserConfig().e(), true);
        x8.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ck0 ck0Var = this.f51834c;
        if (ck0Var != null) {
            ck0Var.removeCallbacks(this.f16343g0);
        }
        ks.f(this.currentAccount).n(this, ks.f25223x3);
        ks.f(this.currentAccount).n(this, ks.A3);
        ks.f(this.currentAccount).n(this, ks.B3);
        ks.f(this.currentAccount).n(this, ks.C3);
        ks.f(this.currentAccount).n(this, ks.E3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f16341e0 = true;
        this.f16339c0 = i10;
        this.f16340d0 = i12;
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
        ck0 ck0Var = this.f51834c;
        if (ck0Var == null) {
            return 0.0f;
        }
        return ck0Var.getY();
    }

    @Override
    public final View r0() {
        return this.V;
    }

    @Override
    public final void s0(boolean z10) {
        te.a aVar = this.f16337a0;
        if (aVar != null && aVar.f57658f != z10) {
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
        qt0 qt0Var = this.V;
        if (qt0Var != null && qt0Var.f38906f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16342f0 = z10;
        ck0 ck0Var = this.f51834c;
        if (ck0Var != null && this.Q >= 0) {
            this.R -= ck0Var.getPaddingTop();
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
