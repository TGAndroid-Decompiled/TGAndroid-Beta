package ii;

import ai.b1;
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
import hi.w;
import hi.y7;
import j$.util.Objects;
import java.util.ArrayList;
import ki.i3;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.r1;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Wallet.n7;
import org.telegram.ui.b61;
import org.telegram.ui.q00;
import org.telegram.ui.r00;
import org.telegram.ui.tv;
import ug.t1;
import v4.c0;
public final class t extends r00 implements fs {
    public FrameLayout S;
    public n7 T;
    public ob U;
    public st0 V;
    public o3 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a f16425a0;
    public int f16427c0;
    public int f16428d0;
    public boolean f16429e0;
    public boolean f16430f0;
    public o3 f16432h0;
    public final boolean f16433i0;
    public LinearLayout f16434j0;
    public SpannableStringBuilder f16435k0;
    public n6 f16436l0;
    public n6 m0;
    public g3 f16437n0;
    public hi.e f16438o0;
    public b61 f16439p0;
    public hi.e f16440q0;
    public hi.e f16441r0;
    public boolean f16442s0;
    public boolean f16443t0;
    public boolean f16444u0;
    public j8 f16445v0;
    public int f16426b0 = -1;
    public final w f16431g0 = new w(this, 25);

    public t() {
        boolean z10;
        t0.u();
        if (!s2.a()) {
            t0.r();
            z10 = false;
        } else {
            z10 = true;
        }
        this.f16433i0 = z10;
        this.N = true;
    }

    public static void A0(t tVar, int i7) {
        n41 G;
        j8 j8Var = tVar.f16445v0;
        if (j8Var != null && (G = j8Var.G(i7)) != null) {
            int i10 = G.d;
            if (i10 == -1) {
                tVar.f16445v0.O(true);
            } else if (i10 == -2) {
                y8.y(tVar.currentAccount, true).u();
                f2.l1(true, v1.a(tVar.currentAccount).b());
            } else if (i10 == -3) {
                y8.y(tVar.currentAccount, true).U();
                tVar.f16445v0.O(true);
            } else if (i10 == -4) {
                if (mp.u1(tVar.currentAccount).A2()) {
                    org.telegram.ui.b.b(tVar.currentAccount);
                } else {
                    tVar.presentFragment(new i3(tVar.getUserConfig().e()));
                }
            }
        }
    }

    public final void D0() {
        G0();
        ek0 ek0Var = this.f51569c;
        if (ek0Var != null && this.V != null && ek0Var.getLayoutParams() != null) {
            int D = m10.D(48.0f, this.f16427c0, -g0.L(8.0f));
            int D2 = m10.D(48.0f, this.f16428d0, -g0.L(8.0f));
            g0.z3(this.f51569c, 0, D, 0, D2);
            ek0 ek0Var2 = this.f51569c;
            int i7 = -D;
            ek0Var2.setPadding(ek0Var2.getPaddingLeft(), i7, this.f51569c.getPaddingRight(), this.f16428d0 - D2);
            this.V.z(i7, -D2);
        }
    }

    public final void E0(ArrayList arrayList, b51 b51Var) {
        boolean z10;
        ek0 ek0Var;
        st0 st0Var = this.V;
        if (st0Var != null && st0Var.f39707f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16426b0 = -1;
        if (getParentActivity() != null) {
            y8 y10 = y8.y(this.currentAccount, true);
            n41 n41Var = new n41(-2);
            n41Var.f37647c = (tv) super.o0(getParentActivity());
            arrayList.add(n41Var);
            arrayList.add(n41.k(this.f16434j0));
            boolean z11 = this.f16433i0;
            if (z11 && !n.c(this.currentAccount)) {
                arrayList.add(n41.C(gd.N0(2131749338, null)));
            }
            boolean M = y10.M(0);
            this.f16442s0 = M;
            if (M) {
                if (!z11 || n.c(this.currentAccount)) {
                    arrayList.add(n41.C(null));
                }
                this.f16426b0 = arrayList.size();
                arrayList.add(n41.n(this.W, -2));
                if (z10 && (ek0Var = this.f51569c) != null) {
                    w wVar = this.f16431g0;
                    ek0Var.removeCallbacks(wVar);
                    this.f51569c.post(wVar);
                    return;
                }
                return;
            }
            arrayList.add(n41.m(this.f16432h0));
        }
    }

    public final void F0() {
        int i7;
        final boolean z10;
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        y8 y10 = y8.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().A7.f26246l.f13936b).f24630a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f16435k0);
        spannableStringBuilder.append((CharSequence) pb.M0(p10, 0.66f, ' '));
        this.f16436l0.setText(spannableStringBuilder);
        if (((int) ((p10.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.m0.setText("≈" + r1.i().f(i7, "USD"));
        } else {
            this.m0.setText(gd.N0(2131742518, null));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = e0.g(this.currentAccount).j(getUserConfig().e(), false);
        if (!this.f16444u0) {
            if (j3 != null && (tL_starsRevenueStatus = j3.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f16443t0 == z10) {
                return;
            }
            this.f16443t0 = z10;
            this.f16437n0.setVisibility(0);
            this.f16439p0.setVisibility(0);
            ViewPropertyAnimator animate = this.f16437n0.animate();
            float f11 = 1.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).withEndAction(new Runnable(this) {
                public final t f16421b;

                {
                    this.f16421b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f16421b.f16437n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f16421b.f16439p0.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            }).start();
            ViewPropertyAnimator animate2 = this.f16439p0.animate();
            if (!z10) {
                f11 = 0.0f;
            }
            animate2.alpha(f11).withEndAction(new Runnable(this) {
                public final t f16421b;

                {
                    this.f16421b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            if (z10) {
                                this.f16421b.f16437n0.setVisibility(8);
                                return;
                            }
                            return;
                        default:
                            if (!z10) {
                                this.f16421b.f16439p0.setVisibility(8);
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
        int L = g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.f16427c0;
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
            f10 = aVar.f57779e;
        }
        te.a aVar2 = this.Z;
        if (aVar2 != null) {
            f11 = aVar2.f57779e;
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
        st0 st0Var = new st0(context);
        this.V = st0Var;
        st0Var.setCommonInsetsManagedExternally(true);
        if (!this.f16429e0) {
            r4 r4Var = this.parentLayout;
            if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
                i12 = 0;
            } else {
                i12 = g0.f24220m;
            }
            this.f16427c0 = i12;
            this.f16428d0 = g0.f24221n;
        }
        this.V.setGeometry(new h6.o(this, 7));
        this.V.z(-m10.D(48.0f, this.f16427c0, -g0.L(8.0f)), -m10.D(48.0f, this.f16428d0, -g0.L(8.0f)));
        st0 st0Var2 = this.V;
        st0Var2.getClass();
        this.W = new o3(26, context, st0Var2);
        this.U = new ob(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.f16432h0 = new o3(4, context, this);
        super.createView(context);
        q00 q00Var = this.f51574s;
        getBaseSimpleGlass().f(q00Var, this.f51569c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f56748n = this.V;
        this.f51569c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f56749o = new di.f(2, this, new di.e(2, q00Var));
        FrameLayout tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        view.setAlpha(0.0f);
        st0 st0Var3 = this.V;
        st0Var3.addView(this.X, st0Var3.indexOfChild(tabsContainer), na.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        o oVar = new o(this, 0);
        kr krVar = kr.h;
        te.a aVar = new te.a(0, oVar, krVar, 380L, false);
        this.Y = aVar;
        this.Z = new te.a(1, new o(this, 1), krVar, 380L, false);
        this.f16425a0 = new te.a(2, new o(this, 2), krVar, 380L, false);
        if (!this.f51569c.canScrollVertically(-1) && !this.simpleActionBar.x()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar.a(z10, false);
        this.Z.a(this.V.f39707f0, false);
        this.f51569c.j(new bi.v1(this, 17));
        G0();
        fh.g c10 = getBaseSimpleGlass().f56739c.c(tabsContainer, null, false);
        c10.p(j0.m(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        r4 r4Var2 = this.parentLayout;
        if (r4Var2 != null && ((ActionBarLayout) r4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        n7 n7Var = new n7(170, context, false);
        this.T = n7Var;
        n7Var.setStarParticlesView(this.f51570e);
        this.S.addView(this.T, na.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        String N0 = gd.N0(2131749335, null);
        if (n.c(this.currentAccount)) {
            i7 = 2131749336;
        } else {
            i7 = 2131749337;
        }
        int i13 = 8;
        j0(N0, g0.H2(g0.T2(gd.N0(i7, null), new h2(context, 8)), true), this.S, null);
        this.f51569c.setOverScrollMode(2);
        v4.l lVar = new v4.l();
        lVar.f59274m = false;
        lVar.C = false;
        lVar.o(krVar);
        lVar.n(350L);
        this.f51569c.setItemAnimator(lVar);
        this.f51569c.setOnItemClickListener(new n8(this, 12));
        this.f51574s.addView(new tz(getParentActivity()), na.c(-1.0f, -1));
        y8.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f16434j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f16434j0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        n6 n6Var = new n6(getParentActivity(), false, true, false);
        this.f16436l0 = n6Var;
        n6Var.setTypeface(g0.o());
        this.f16436l0.setTextSize(g0.L(32.0f));
        this.f16436l0.setGravity(17);
        u6.Y(this.f16436l0, org.telegram.ui.ActionBar.n6.G6, this.resourceProvider);
        this.f16435k0 = new SpannableStringBuilder("S");
        kq kqVar = new kq(2131231961, 0);
        kqVar.d = false;
        kqVar.I = 0.5f;
        kqVar.J = 0.5f;
        kqVar.f36853r = -g0.L(3.0f);
        kqVar.f36854s = 0.0f;
        this.f16435k0.setSpan(kqVar, 0, 1, 33);
        this.f16434j0.addView(this.f16436l0, na.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        n6 n6Var2 = new n6(getParentActivity(), false, false, false);
        this.m0 = n6Var2;
        n6Var2.setTextSize(g0.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(gd.N0(2131742518, null));
        u6.Y(this.m0, org.telegram.ui.ActionBar.n6.f29862z6, this.resourceProvider);
        this.f16434j0.addView(this.m0, na.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        g3 g3Var = new g3(6, getParentActivity(), this);
        this.f16437n0 = g3Var;
        frameLayout2.addView(g3Var);
        boolean c11 = n.c(this.currentAccount);
        this.f16444u0 = c11;
        if (c11) {
            this.f16443t0 = true;
        }
        boolean z11 = this.f16433i0;
        if (z11 && !c11) {
            hi.e eVar = new hi.e(getParentActivity(), this.resourceProvider, true);
            eVar.setRoundRadius(24);
            this.f16438o0 = eVar;
            eVar.f();
            this.f16438o0.i(gd.N0(2131743785, null), false, true);
            this.f16438o0.setOnClickListener(new View.OnClickListener(this) {
                public final t f16419b;

                {
                    this.f16419b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    t tVar = this.f16419b;
                    switch (i14) {
                        case 0:
                            vf.c.v(tVar.getParentActivity(), gd.N0(2131743783, null), false);
                            return;
                        case 1:
                            vf.c.v(tVar.getParentActivity(), gd.N0(2131743783, null), false);
                            return;
                        case 2:
                            hi.e eVar2 = tVar.f16440q0;
                            if (eVar2 != null && !eVar2.R) {
                                eVar2.setLoading(true);
                                int currentAccount = tVar.getCurrentAccount();
                                r6 r6Var = new r6(10, eVar2, tVar);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new b1(r6Var, 13));
                                return;
                            }
                            return;
                        default:
                            tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.f16437n0.addView(this.f16438o0, na.e(-1, 48, 119));
        }
        b61 b61Var = new b61(4, getParentActivity(), this);
        this.f16439p0 = b61Var;
        frameLayout2.addView(b61Var);
        hi.e eVar2 = new hi.e(getParentActivity(), this.resourceProvider, true);
        eVar2.setRoundRadius(24);
        this.f16440q0 = eVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new kq(2131231981, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) gd.N0(2131743798, null));
        this.f16440q0.i(spannableStringBuilder, false, true);
        this.f16440q0.setOnClickListener(new View.OnClickListener(this) {
            public final t f16419b;

            {
                this.f16419b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                t tVar = this.f16419b;
                switch (i14) {
                    case 0:
                        vf.c.v(tVar.getParentActivity(), gd.N0(2131743783, null), false);
                        return;
                    case 1:
                        vf.c.v(tVar.getParentActivity(), gd.N0(2131743783, null), false);
                        return;
                    case 2:
                        hi.e eVar22 = tVar.f16440q0;
                        if (eVar22 != null && !eVar22.R) {
                            eVar22.setLoading(true);
                            int currentAccount = tVar.getCurrentAccount();
                            r6 r6Var = new r6(10, eVar22, tVar);
                            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                            tL_payments_getStarsRevenueStats.ton = true;
                            tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new b1(r6Var, 13));
                            return;
                        }
                        return;
                    default:
                        tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (this.f16444u0) {
            this.f16440q0.i(gd.N0(2131749329, null), false, true);
            this.f16440q0.setOnClickListener(new View.OnClickListener(this) {
                public final t f16419b;

                {
                    this.f16419b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i14 = r2;
                    t tVar = this.f16419b;
                    switch (i14) {
                        case 0:
                            vf.c.v(tVar.getParentActivity(), gd.N0(2131743783, null), false);
                            return;
                        case 1:
                            vf.c.v(tVar.getParentActivity(), gd.N0(2131743783, null), false);
                            return;
                        case 2:
                            hi.e eVar22 = tVar.f16440q0;
                            if (eVar22 != null && !eVar22.R) {
                                eVar22.setLoading(true);
                                int currentAccount = tVar.getCurrentAccount();
                                r6 r6Var = new r6(10, eVar22, tVar);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new b1(r6Var, 13));
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
        if (z11 || this.f16444u0) {
            b61 b61Var2 = this.f16439p0;
            hi.e eVar3 = this.f16440q0;
            if (this.f16444u0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b61Var2.addView(eVar3, na.q(-1, 48, 17.0f, 1, 0, 0, i10, 0));
        }
        hi.e eVar4 = new hi.e(getParentActivity(), this.resourceProvider, true);
        eVar4.setRoundRadius(24);
        this.f16441r0 = eVar4;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new kq(2131231977, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) gd.N0(2131743799, null));
        this.f16441r0.i(spannableStringBuilder2, false, true);
        this.f16441r0.setOnClickListener(new View.OnClickListener(this) {
            public final t f16419b;

            {
                this.f16419b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i14 = r2;
                t tVar = this.f16419b;
                switch (i14) {
                    case 0:
                        vf.c.v(tVar.getParentActivity(), gd.N0(2131743783, null), false);
                        return;
                    case 1:
                        vf.c.v(tVar.getParentActivity(), gd.N0(2131743783, null), false);
                        return;
                    case 2:
                        hi.e eVar22 = tVar.f16440q0;
                        if (eVar22 != null && !eVar22.R) {
                            eVar22.setLoading(true);
                            int currentAccount = tVar.getCurrentAccount();
                            r6 r6Var = new r6(10, eVar22, tVar);
                            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                            tL_payments_getStarsRevenueStats.ton = true;
                            tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                            ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new b1(r6Var, 13));
                            return;
                        }
                        return;
                    default:
                        tVar.presentFragment(new di.t(1, tVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (!this.f16444u0) {
            this.f16439p0.addView(this.f16441r0, na.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        }
        this.f16434j0.addView(frameLayout2, na.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.f16437n0.animate().cancel();
        this.f16439p0.animate().cancel();
        b61 b61Var3 = this.f16439p0;
        if (this.f16443t0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        b61Var3.setAlpha(f10);
        g3 g3Var2 = this.f16437n0;
        if (this.f16443t0) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        g3Var2.setAlpha(f11);
        b61 b61Var4 = this.f16439p0;
        if (this.f16443t0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        b61Var4.setVisibility(i11);
        g3 g3Var3 = this.f16437n0;
        if (!this.f16443t0) {
            i13 = 0;
        }
        g3Var3.setVisibility(i13);
        F0();
        j8 j8Var = this.f16445v0;
        if (j8Var != null) {
            j8Var.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25320x3) {
            u0();
            j8 j8Var = this.f16445v0;
            if (j8Var != null) {
                j8Var.O(true);
            }
            h0();
        } else if (i7 == ks.B3) {
            y8 y10 = y8.y(this.currentAccount, true);
            if (this.f16442s0 != y10.M(0)) {
                this.f16442s0 = y10.M(0);
                u0();
                j8 j8Var2 = this.f16445v0;
                if (j8Var2 != null) {
                    j8Var2.O(false);
                }
                h0();
            }
        } else if (i7 == ks.C3) {
            j8 j8Var3 = this.f16445v0;
            if (j8Var3 != null) {
                j8Var3.O(true);
            }
        } else if (i7 == ks.A3) {
            F0();
        } else if (i7 == ks.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29542i5, false);
    }

    @Override
    public final void h0() {
        st0 st0Var;
        super.h0();
        if (this.f16430f0 && (st0Var = this.V) != null && this.f16426b0 != -1) {
            st0Var.a();
        }
        this.f16430f0 = false;
    }

    @Override
    public final void i0() {
        this.f51574s.addView(this.V, na.c(-1.0f, -1));
        this.V.u(this.f51569c, new o(this, 3));
        st0 st0Var = this.V;
        ob obVar = this.U;
        k71 viewPager = obVar.getViewPager();
        ob obVar2 = this.U;
        Objects.requireNonNull(obVar2);
        st0Var.x(obVar, viewPager, new v6(obVar2, 27));
        this.V.y(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        st0 st0Var = this.V;
        if (st0Var == null || motionEvent == null || st0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().f36663b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final v4.i0 k0() {
        j8 j8Var = new j8(this, this.f51569c, getParentActivity(), this.currentAccount, this.classGuid, new y7(this, 4), getResourceProvider(), 3);
        this.f16445v0 = j8Var;
        j8Var.f33631r = false;
        return j8Var;
    }

    @Override
    public final c0 l0(Context context) {
        st0 st0Var = this.V;
        st0Var.getClass();
        return new jg.i0(5, st0Var, false);
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
        ks.f(this.currentAccount).c(this, ks.f25320x3);
        ks.f(this.currentAccount).c(this, ks.A3);
        ks.f(this.currentAccount).c(this, ks.B3);
        ks.f(this.currentAccount).c(this, ks.C3);
        ks.f(this.currentAccount).c(this, ks.E3);
        y8.y(this.currentAccount, true).R(true);
        y8.y(this.currentAccount, true).Q();
        e0.g(this.currentAccount).j(getUserConfig().e(), true);
        y8.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ek0 ek0Var = this.f51569c;
        if (ek0Var != null) {
            ek0Var.removeCallbacks(this.f16431g0);
        }
        ks.f(this.currentAccount).n(this, ks.f25320x3);
        ks.f(this.currentAccount).n(this, ks.A3);
        ks.f(this.currentAccount).n(this, ks.B3);
        ks.f(this.currentAccount).n(this, ks.C3);
        ks.f(this.currentAccount).n(this, ks.E3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f16429e0 = true;
        this.f16427c0 = i10;
        this.f16428d0 = i12;
        D0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        n7 n7Var = this.T;
        if (n7Var != null) {
            n7Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        n7 n7Var = this.T;
        if (n7Var != null) {
            n7Var.setPaused(false);
        }
    }

    @Override
    public final float q0() {
        ek0 ek0Var = this.f51569c;
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
        te.a aVar = this.f16425a0;
        if (aVar != null && aVar.f57780f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public final void t0(float f10) {
        n7 n7Var = this.T;
        if (n7Var != null) {
            n7Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override
    public final void u0() {
        boolean z10;
        super.u0();
        st0 st0Var = this.V;
        if (st0Var != null && st0Var.f39707f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16430f0 = z10;
        ek0 ek0Var = this.f51569c;
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
