package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ydb extends iz4 implements gk7 {
    public FrameLayout S;
    public lnc T;
    public iva U;
    public dha V;
    public si9 W;
    public View X;
    public fm0 Y;
    public fm0 Z;
    public fm0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public si9 h0;
    public final boolean i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public hn l0;
    public hn m0;
    public LinearLayout n0;
    public u41 o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public vb s0;
    public int b0 = -1;
    public final kya g0 = new kya(this, (byte) 25);

    public ydb() {
        boolean z;
        a.t();
        if (!w01.a()) {
            a.q();
            z = false;
        } else {
            z = true;
        }
        this.i0 = z;
        this.N = true;
    }

    public final void B0() {
        F0();
        o39 o39Var = this.c;
        if (o39Var != null && this.V != null && o39Var.getLayoutParams() != null) {
            int x = b00.x(48.0f, this.c0, -gl.L(8.0f));
            int x2 = b00.x(48.0f, this.d0, -gl.L(8.0f));
            gl.v3(this.c, 0, x, 0, x2);
            o39 o39Var2 = this.c;
            int i = -x;
            o39Var2.setPadding(o39Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - x2);
            this.V.A(i, -x2);
        }
    }

    public final void C0(ArrayList arrayList, l5c l5cVar) {
        boolean z;
        o39 o39Var;
        dha dhaVar = this.V;
        if (dhaVar != null && dhaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = -1;
        if (getParentActivity() != null) {
            gta v = gta.v(this.currentAccount, true);
            c4c c4cVar = new c4c(-2);
            c4cVar.c = (sb) super.n0(getParentActivity());
            arrayList.add(c4cVar);
            arrayList.add(c4c.k(this.j0));
            boolean z2 = this.i0;
            if (z2 && !uz4.c(this.currentAccount)) {
                arrayList.add(c4c.C(k96.M0(2131749339, null)));
            }
            boolean K = v.K(0);
            this.p0 = K;
            if (K) {
                if (!z2 || uz4.c(this.currentAccount)) {
                    arrayList.add(c4c.C(null));
                }
                this.b0 = arrayList.size();
                arrayList.add(c4c.n(this.W, -2));
                if (z && (o39Var = this.c) != null) {
                    kya kyaVar = this.g0;
                    o39Var.removeCallbacks(kyaVar);
                    this.c.post(kyaVar);
                    return;
                }
                return;
            }
            arrayList.add(c4c.m(this.h0));
        }
    }

    public final void D0(int i) {
        c4c G;
        vb vbVar = this.s0;
        if (vbVar != null && (G = vbVar.G(i)) != null) {
            int i2 = G.d;
            if (i2 == -1) {
                this.s0.O(true);
            } else if (i2 == -2) {
                gta.v(this.currentAccount, true).r();
                xu4.f1(true, oj0.a(this.currentAccount).b());
            } else if (i2 == -3) {
                gta.v(this.currentAccount, true).U();
                this.s0.O(true);
            } else if (i2 == -4) {
                if (na7.q1(this.currentAccount).t2()) {
                    h5.b(this.currentAccount);
                } else {
                    presentFragment(new eg1(getUserConfig().e()));
                }
            }
        }
    }

    public final void E0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = true;
        gta v = gta.v(this.currentAccount, true);
        double d = getMessagesController().k4.k.i;
        TL_stars.StarsAmount m = v.m();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) jva.G0(m, 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        int i = (int) ((m.amount / 1.0E9d) * d * 100.0d);
        hn hnVar = this.m0;
        if (i > 0) {
            hnVar.setText("≈" + ci0.h().e(i, "USD"));
        } else {
            hnVar.setText(k96.M0(2131742526, null));
        }
        int i2 = 0;
        TLRPC.TL_payments_starsRevenueStats j = ct0.g(this.currentAccount).j(getUserConfig().e(), false);
        if (!this.r0) {
            if (j == null || (tL_starsRevenueStatus = j.status) == null || !tL_starsRevenueStatus.overall_revenue.positive()) {
                z = false;
            }
            if (this.q0 == z) {
                return;
            }
            this.q0 = z;
            this.n0.animate().cancel();
            LinearLayout linearLayout = this.n0;
            if (!z) {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
            LinearLayout linearLayout2 = this.n0;
            float f = 1.0f;
            if (z) {
                linearLayout2.setAlpha(0.0f);
                this.n0.animate().alpha(1.0f).start();
                return;
            }
            if (!z) {
                f = 0.0f;
            }
            linearLayout2.setAlpha(f);
        }
    }

    public final void F0() {
        if (this.X == null) {
            return;
        }
        int L = gl.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        G0();
    }

    public final void G0() {
        float f;
        View view = this.X;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.Y;
        float f2 = 0.0f;
        if (fm0Var == null) {
            f = 0.0f;
        } else {
            f = fm0Var.e;
        }
        fm0 fm0Var2 = this.Z;
        if (fm0Var2 != null) {
            f2 = fm0Var2.e;
        }
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - f2) * gl.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        int i;
        int i2;
        int i3;
        this.H = false;
        this.F = gl.L(238.0f);
        dha dhaVar = new dha(context);
        this.V = dhaVar;
        dhaVar.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            ui5 ui5Var = this.parentLayout;
            if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
                i3 = 0;
            } else {
                i3 = gl.m;
            }
            this.c0 = i3;
            this.d0 = gl.n;
        }
        this.V.setGeometry(new u39(this, (byte) 18));
        this.V.A(-b00.x(48.0f, this.c0, -gl.L(8.0f)), -b00.x(48.0f, this.d0, -gl.L(8.0f)));
        dha dhaVar2 = this.V;
        dhaVar2.getClass();
        this.W = new si9((byte) 6, context, dhaVar2);
        this.U = new iva(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new si9((byte) 12, context, this);
        super.createView(context);
        hz4 hz4Var = this.s;
        getBaseSimpleGlass().f(hz4Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new cg0(this, new gua(hz4Var, (byte) 1), (byte) 9);
        FrameLayout tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        float f = 0.0f;
        view.setAlpha(0.0f);
        dha dhaVar3 = this.V;
        dhaVar3.addView(this.X, dhaVar3.indexOfChild(tabsContainer), nme.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        tdb tdbVar = new tdb(this, (byte) 1);
        s33 s33Var = s33.h;
        fm0 fm0Var = new fm0(0, tdbVar, s33Var, 380L, false);
        this.Y = fm0Var;
        this.Z = new fm0(1, new tdb(this, (byte) 2), s33Var, 380L, false);
        this.a0 = new fm0(2, new tdb(this, (byte) 3), s33Var, 380L, false);
        if (!this.c.canScrollVertically(-1) && !this.simpleActionBar.x()) {
            z = false;
        } else {
            z = true;
        }
        fm0Var.a(z, false);
        this.Z.a(this.V.f0, false);
        this.c.j(new vdb(this, (byte) 0));
        F0();
        il0 c = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c.p(nod.l(this.resourceProvider));
        c.q(gl.L(9.66f));
        c.r(gl.L(18.0f));
        tabsContainer.setBackground(c);
        ui5 ui5Var2 = this.parentLayout;
        if (ui5Var2 != null && ((ActionBarLayout) ui5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        lnc lncVar = new lnc(170, context, false);
        this.T = lncVar;
        lncVar.setStarParticlesView(this.e);
        this.S.addView(this.T, nme.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        String M0 = k96.M0(2131749336, null);
        if (uz4.c(this.currentAccount)) {
            i = 2131749337;
        } else {
            i = 2131749338;
        }
        i0(M0, gl.D2(gl.N2(k96.M0(i, null), -1, 0, new vf1(context, (byte) 24), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33Var);
        gb3Var.n(350L);
        this.c.setItemAnimator(gb3Var);
        this.c.setOnItemClickListener(new f09(this, (byte) 19));
        this.s.addView(new qh4(getParentActivity()), nme.c(-1.0f, -1));
        gta.v(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, gl.L(20.0f), 0, gl.L(10.0f));
        hn hnVar = new hn(getParentActivity(), false, true, false);
        this.l0 = hnVar;
        hnVar.setTypeface(gl.o());
        this.l0.setTextSize(gl.L(32.0f));
        this.l0.setGravity(17);
        zkb.U(this.l0, bkb.F6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        cm2 cm2Var = new cm2(2131231961, 0);
        cm2Var.d = false;
        cm2Var.I = 0.5f;
        cm2Var.J = 0.5f;
        cm2Var.r = -gl.L(3.0f);
        cm2Var.s = 0.0f;
        this.k0.setSpan(cm2Var, 0, 1, 33);
        this.j0.addView(this.l0, nme.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        hn hnVar2 = new hn(getParentActivity(), false, false, false);
        this.m0 = hnVar2;
        hnVar2.setTextSize(gl.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(k96.M0(2131742526, null));
        zkb.U(this.m0, bkb.y6, this.resourceProvider);
        this.j0.addView(this.m0, nme.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
        this.n0 = linearLayout2;
        linearLayout2.setOrientation(0);
        boolean c2 = uz4.c(this.currentAccount);
        this.r0 = c2;
        if (c2) {
            this.q0 = true;
            u41 u41Var = new u41(this.resourceProvider, getParentActivity(), true);
            u41Var.setRoundRadius(24);
            this.o0 = u41Var;
            u41Var.i(k96.M0(2131749330, null), false, true);
            this.o0.setOnClickListener(new View.OnClickListener(this) {
                public final ydb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    ydb ydbVar = this.b;
                    switch (b) {
                        case 0:
                            u41 u41Var2 = ydbVar.o0;
                            if (u41Var2 != null && !u41Var2.R) {
                                u41Var2.setLoading(true);
                                int currentAccount = ydbVar.getCurrentAccount();
                                ae2 ae2Var = new ae2(u41Var2, ydbVar, (byte) 15);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new tf(ae2Var, (byte) 28));
                                return;
                            }
                            return;
                        default:
                            ydbVar.presentFragment(new ss0(1, ydbVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.n0.addView(this.o0, nme.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        } else {
            u41 u41Var2 = new u41(this.resourceProvider, getParentActivity(), true);
            u41Var2.setRoundRadius(24);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
            spannableStringBuilder.setSpan(new cm2(2131231977, 2), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) k96.M0(2131743803, null));
            u41Var2.i(spannableStringBuilder, false, true);
            u41Var2.setOnClickListener(new View.OnClickListener(this) {
                public final ydb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    ydb ydbVar = this.b;
                    switch (b) {
                        case 0:
                            u41 u41Var22 = ydbVar.o0;
                            if (u41Var22 != null && !u41Var22.R) {
                                u41Var22.setLoading(true);
                                int currentAccount = ydbVar.getCurrentAccount();
                                ae2 ae2Var = new ae2(u41Var22, ydbVar, (byte) 15);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new tf(ae2Var, (byte) 28));
                                return;
                            }
                            return;
                        default:
                            ydbVar.presentFragment(new ss0(1, ydbVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.n0.addView(u41Var2, nme.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        }
        this.j0.addView(this.n0, nme.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        LinearLayout linearLayout3 = this.n0;
        if (this.q0) {
            f = 1.0f;
        }
        linearLayout3.setAlpha(f);
        LinearLayout linearLayout4 = this.n0;
        if (this.q0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout4.setVisibility(i2);
        E0();
        vb vbVar = this.s0;
        if (vbVar != null) {
            vbVar.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.w3) {
            t0();
            vb vbVar = this.s0;
            if (vbVar != null) {
                vbVar.O(true);
            }
            g0();
        } else if (i == kk7.A3) {
            gta v = gta.v(this.currentAccount, true);
            if (this.p0 != v.K(0)) {
                this.p0 = v.K(0);
                t0();
                vb vbVar2 = this.s0;
                if (vbVar2 != null) {
                    vbVar2.O(false);
                }
                g0();
            }
        } else if (i == kk7.B3) {
            vb vbVar3 = this.s0;
            if (vbVar3 != null) {
                vbVar3.O(true);
            }
        } else if (i == kk7.z3) {
            E0();
        } else if (i == kk7.D3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            E0();
        }
    }

    @Override
    public final void g0() {
        dha dhaVar;
        super.g0();
        if (this.f0 && (dhaVar = this.V) != null && this.b0 != -1) {
            dhaVar.a();
        }
        this.f0 = false;
    }

    @Override
    public final int getNavigationBarColor() {
        return bkb.w0(null, bkb.h5, false);
    }

    @Override
    public final void h0() {
        this.s.addView(this.V, nme.c(-1.0f, -1));
        this.V.v(this.c, new tdb(this, (byte) 0));
        dha dhaVar = this.V;
        iva ivaVar = this.U;
        wec viewPager = ivaVar.getViewPager();
        iva ivaVar2 = this.U;
        Objects.requireNonNull(ivaVar2);
        dhaVar.y(ivaVar, viewPager, new hza(ivaVar2, (byte) 13));
        this.V.z(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(nme.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        B0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        dha dhaVar = this.V;
        if (dhaVar == null || motionEvent == null || dhaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final w39 j0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new n4b(this, (byte) 3), getResourceProvider(), (byte) 5);
        this.s0 = vbVar;
        vbVar.r = false;
        return vbVar;
    }

    @Override
    public final t26 k0(Context context) {
        dha dhaVar = this.V;
        dhaVar.getClass();
        return new xe2((Object) dhaVar, (byte) 5);
    }

    @Override
    public final cra l0() {
        return new wdb(getParentActivity(), 75, 1);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final View n0(Context context) {
        throw null;
    }

    @Override
    public final boolean onFragmentCreate() {
        kk7.f(this.currentAccount).b(this, kk7.w3);
        kk7.f(this.currentAccount).b(this, kk7.z3);
        kk7.f(this.currentAccount).b(this, kk7.A3);
        kk7.f(this.currentAccount).b(this, kk7.B3);
        kk7.f(this.currentAccount).b(this, kk7.D3);
        gta.v(this.currentAccount, true).P(true);
        gta.v(this.currentAccount, true).O();
        ct0.g(this.currentAccount).j(getUserConfig().e(), true);
        gta.v(this.currentAccount, true).w();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        o39 o39Var = this.c;
        if (o39Var != null) {
            o39Var.removeCallbacks(this.g0);
        }
        kk7.f(this.currentAccount).n(this, kk7.w3);
        kk7.f(this.currentAccount).n(this, kk7.z3);
        kk7.f(this.currentAccount).n(this, kk7.A3);
        kk7.f(this.currentAccount).n(this, kk7.B3);
        kk7.f(this.currentAccount).n(this, kk7.D3);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.e0 = true;
        this.c0 = i2;
        this.d0 = i4;
        B0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        lnc lncVar = this.T;
        if (lncVar != null) {
            lncVar.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        lnc lncVar = this.T;
        if (lncVar != null) {
            lncVar.setPaused(false);
        }
    }

    @Override
    public final float p0() {
        o39 o39Var = this.c;
        if (o39Var == null) {
            return 0.0f;
        }
        return o39Var.getY();
    }

    @Override
    public final View q0() {
        return this.V;
    }

    @Override
    public final void r0(boolean z) {
        fm0 fm0Var = this.a0;
        if (fm0Var != null && fm0Var.f != z) {
            fm0Var.a(z, true);
        }
    }

    @Override
    public final void s0(float f) {
        lnc lncVar = this.T;
        if (lncVar != null) {
            lncVar.setHeaderTilt(f * 70.0f);
        }
    }

    @Override
    public final void t0() {
        boolean z;
        super.t0();
        dha dhaVar = this.V;
        if (dhaVar != null && dhaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.f0 = z;
        o39 o39Var = this.c;
        if (o39Var != null && this.Q >= 0) {
            this.R -= o39Var.getPaddingTop();
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
