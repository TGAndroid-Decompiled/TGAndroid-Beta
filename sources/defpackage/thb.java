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
public final class thb extends m15 implements fn7 {
    public FrameLayout S;
    public yrc T;
    public mza U;
    public wka V;
    public nf9 W;
    public View X;
    public fm0 Y;
    public fm0 Z;
    public fm0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public nf9 h0;
    public final boolean i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public in l0;
    public in m0;
    public LinearLayout n0;
    public c51 o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public wb s0;
    public int b0 = -1;
    public final s8b g0 = new s8b(this, (byte) 12);

    public thb() {
        boolean z;
        a.t();
        if (!f11.a()) {
            a.q();
            z = false;
        } else {
            z = true;
        }
        this.i0 = z;
        this.N = true;
    }

    public final void C0() {
        G0();
        d79 d79Var = this.c;
        if (d79Var != null && this.V != null && d79Var.getLayoutParams() != null) {
            int y = c00.y(48.0f, this.c0, -hl.L(8.0f));
            int y2 = c00.y(48.0f, this.d0, -hl.L(8.0f));
            hl.v3(this.c, 0, y, 0, y2);
            d79 d79Var2 = this.c;
            int i = -y;
            d79Var2.setPadding(d79Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - y2);
            this.V.A(i, -y2);
        }
    }

    public final void D0(ArrayList arrayList, l9c l9cVar) {
        boolean z;
        d79 d79Var;
        wka wkaVar = this.V;
        if (wkaVar != null && wkaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = -1;
        if (getParentActivity() != null) {
            jxa v = jxa.v(this.currentAccount, true);
            b8c b8cVar = new b8c(-2);
            b8cVar.c = (tb) super.n0(getParentActivity());
            arrayList.add(b8cVar);
            arrayList.add(b8c.k(this.j0));
            boolean z2 = this.i0;
            if (z2 && !z15.c(this.currentAccount)) {
                arrayList.add(b8c.C(ob6.M0(2131749285, null)));
            }
            boolean K = v.K(0);
            this.p0 = K;
            if (K) {
                if (!z2 || z15.c(this.currentAccount)) {
                    arrayList.add(b8c.C(null));
                }
                this.b0 = arrayList.size();
                arrayList.add(b8c.n(this.W, -2));
                if (z && (d79Var = this.c) != null) {
                    s8b s8bVar = this.g0;
                    d79Var.removeCallbacks(s8bVar);
                    this.c.post(s8bVar);
                    return;
                }
                return;
            }
            arrayList.add(b8c.m(this.h0));
        }
    }

    public final void E0(int i) {
        b8c G;
        wb wbVar = this.s0;
        if (wbVar != null && (G = wbVar.G(i)) != null) {
            int i2 = G.d;
            if (i2 == -1) {
                this.s0.O(true);
            } else if (i2 == -2) {
                jxa.v(this.currentAccount, true).r();
                bx4.g1(true, pj0.a(this.currentAccount).b());
            } else if (i2 == -3) {
                jxa.v(this.currentAccount, true).V();
                this.s0.O(true);
            } else if (i2 == -4) {
                if (uc7.s1(this.currentAccount).x2()) {
                    i5.b(this.currentAccount);
                } else {
                    presentFragment(new ng1(getUserConfig().e()));
                }
            }
        }
    }

    public final void F0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = true;
        jxa v = jxa.v(this.currentAccount, true);
        double d = getMessagesController().l4.k.i;
        TL_stars.StarsAmount m = v.m();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) nza.H0(m, 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        int i = (int) ((m.amount / 1.0E9d) * d * 100.0d);
        in inVar = this.m0;
        if (i > 0) {
            inVar.setText("≈" + di0.h().e(i, "USD"));
        } else {
            inVar.setText(ob6.M0(2131742420, null));
        }
        int i2 = 0;
        TLRPC.TL_payments_starsRevenueStats j = kt0.g(this.currentAccount).j(getUserConfig().e(), false);
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

    public final void G0() {
        if (this.X == null) {
            return;
        }
        int L = hl.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
        ViewGroup.LayoutParams layoutParams = this.X.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.X.setLayoutParams(layoutParams);
        }
        H0();
    }

    public final void H0() {
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
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - f2) * hl.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        int i;
        int i2;
        int i3;
        this.H = false;
        this.F = hl.L(238.0f);
        wka wkaVar = new wka(context);
        this.V = wkaVar;
        wkaVar.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
                i3 = 0;
            } else {
                i3 = hl.m;
            }
            this.c0 = i3;
            this.d0 = hl.n;
        }
        this.V.setGeometry(new ve9(this, (byte) 15));
        this.V.A(-c00.y(48.0f, this.c0, -hl.L(8.0f)), -c00.y(48.0f, this.d0, -hl.L(8.0f)));
        wka wkaVar2 = this.V;
        wkaVar2.getClass();
        this.W = new nf9((byte) 7, context, wkaVar2);
        this.U = new mza(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new nf9((byte) 13, context, this);
        super.createView(context);
        l15 l15Var = this.s;
        getBaseSimpleGlass().h(l15Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new dg0(this, new kya(l15Var, (byte) 1), (byte) 10);
        FrameLayout tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        float f = 0.0f;
        view.setAlpha(0.0f);
        wka wkaVar3 = this.V;
        wkaVar3.addView(this.X, wkaVar3.indexOfChild(tabsContainer), tre.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        ohb ohbVar = new ohb(this, (byte) 1);
        k43 k43Var = k43.h;
        fm0 fm0Var = new fm0(0, ohbVar, k43Var, 380L, false);
        this.Y = fm0Var;
        this.Z = new fm0(1, new ohb(this, (byte) 2), k43Var, 380L, false);
        this.a0 = new fm0(2, new ohb(this, (byte) 3), k43Var, 380L, false);
        if (!this.c.canScrollVertically(-1) && !this.simpleActionBar.z()) {
            z = false;
        } else {
            z = true;
        }
        fm0Var.a(z, false);
        this.Z.a(this.V.f0, false);
        this.c.j(new qhb(this, (byte) 0));
        G0();
        jl0 c = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c.p(dtd.l(this.resourceProvider));
        c.q(hl.L(9.66f));
        c.r(hl.L(18.0f));
        tabsContainer.setBackground(c);
        wk5 wk5Var2 = this.parentLayout;
        if (wk5Var2 != null && ((ActionBarLayout) wk5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231244);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        yrc yrcVar = new yrc(170, context, false);
        this.T = yrcVar;
        yrcVar.setStarParticlesView(this.e);
        this.S.addView(this.T, tre.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        String M0 = ob6.M0(2131749282, null);
        if (z15.c(this.currentAccount)) {
            i = 2131749283;
        } else {
            i = 2131749284;
        }
        i0(M0, hl.D2(hl.N2(ob6.M0(i, null), -1, 0, new xf1(context, (byte) 24), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43Var);
        zb3Var.n(350L);
        this.c.setItemAnimator(zb3Var);
        this.c.setOnItemClickListener(new t39(this, (byte) 19));
        this.s.addView(new tj4(getParentActivity()), tre.c(-1.0f, -1));
        jxa.v(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, hl.L(20.0f), 0, hl.L(10.0f));
        in inVar = new in(getParentActivity(), false, true, false);
        this.l0 = inVar;
        inVar.setTypeface(hl.o());
        this.l0.setTextSize(hl.L(32.0f));
        this.l0.setGravity(17);
        yob.U(this.l0, aob.G6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        wm2 wm2Var = new wm2(2131231961, 0);
        wm2Var.d = false;
        wm2Var.I = 0.5f;
        wm2Var.J = 0.5f;
        wm2Var.r = -hl.L(3.0f);
        wm2Var.s = 0.0f;
        this.k0.setSpan(wm2Var, 0, 1, 33);
        this.j0.addView(this.l0, tre.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        in inVar2 = new in(getParentActivity(), false, false, false);
        this.m0 = inVar2;
        inVar2.setTextSize(hl.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(ob6.M0(2131742420, null));
        yob.U(this.m0, aob.z6, this.resourceProvider);
        this.j0.addView(this.m0, tre.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
        this.n0 = linearLayout2;
        linearLayout2.setOrientation(0);
        boolean c2 = z15.c(this.currentAccount);
        this.r0 = c2;
        if (c2) {
            this.q0 = true;
            c51 c51Var = new c51(this.resourceProvider, getParentActivity(), true);
            c51Var.setRoundRadius(24);
            this.o0 = c51Var;
            c51Var.i(ob6.M0(2131749276, null), false, true);
            this.o0.setOnClickListener(new View.OnClickListener(this) {
                public final thb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    thb thbVar = this.b;
                    switch (b) {
                        case 0:
                            c51 c51Var2 = thbVar.o0;
                            if (c51Var2 != null && !c51Var2.R) {
                                c51Var2.setLoading(true);
                                int currentAccount = thbVar.getCurrentAccount();
                                qe2 qe2Var = new qe2(c51Var2, thbVar, (byte) 15);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new ye(qe2Var, (byte) 29));
                                return;
                            }
                            return;
                        default:
                            thbVar.presentFragment(new at0(1, thbVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.n0.addView(this.o0, tre.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        } else {
            c51 c51Var2 = new c51(this.resourceProvider, getParentActivity(), true);
            c51Var2.setRoundRadius(24);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
            spannableStringBuilder.setSpan(new wm2(2131231977, 2), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131743697, null));
            c51Var2.i(spannableStringBuilder, false, true);
            c51Var2.setOnClickListener(new View.OnClickListener(this) {
                public final thb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    thb thbVar = this.b;
                    switch (b) {
                        case 0:
                            c51 c51Var22 = thbVar.o0;
                            if (c51Var22 != null && !c51Var22.R) {
                                c51Var22.setLoading(true);
                                int currentAccount = thbVar.getCurrentAccount();
                                qe2 qe2Var = new qe2(c51Var22, thbVar, (byte) 15);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new ye(qe2Var, (byte) 29));
                                return;
                            }
                            return;
                        default:
                            thbVar.presentFragment(new at0(1, thbVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.n0.addView(c51Var2, tre.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        }
        this.j0.addView(this.n0, tre.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
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
        F0();
        wb wbVar = this.s0;
        if (wbVar != null) {
            wbVar.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.x3) {
            t0();
            wb wbVar = this.s0;
            if (wbVar != null) {
                wbVar.O(true);
            }
            g0();
        } else if (i == jn7.B3) {
            jxa v = jxa.v(this.currentAccount, true);
            if (this.p0 != v.K(0)) {
                this.p0 = v.K(0);
                t0();
                wb wbVar2 = this.s0;
                if (wbVar2 != null) {
                    wbVar2.O(false);
                }
                g0();
            }
        } else if (i == jn7.C3) {
            wb wbVar3 = this.s0;
            if (wbVar3 != null) {
                wbVar3.O(true);
            }
        } else if (i == jn7.A3) {
            F0();
        } else if (i == jn7.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final void g0() {
        wka wkaVar;
        super.g0();
        if (this.f0 && (wkaVar = this.V) != null && this.b0 != -1) {
            wkaVar.a();
        }
        this.f0 = false;
    }

    @Override
    public final int getNavigationBarColor() {
        return aob.w0(null, aob.i5, false);
    }

    @Override
    public final void h0() {
        this.s.addView(this.V, tre.c(-1.0f, -1));
        this.V.v(this.c, new ohb(this, (byte) 0));
        wka wkaVar = this.V;
        mza mzaVar = this.U;
        vic viewPager = mzaVar.getViewPager();
        mza mzaVar2 = this.U;
        Objects.requireNonNull(mzaVar2);
        wkaVar.y(mzaVar, viewPager, new hja(mzaVar2, (byte) 26));
        this.V.z(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        C0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        wka wkaVar = this.V;
        if (wkaVar == null || motionEvent == null || wkaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final j79 j0() {
        wb wbVar = new wb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new l8b(this, (byte) 3), getResourceProvider(), (byte) 5);
        this.s0 = wbVar;
        wbVar.r = false;
        return wbVar;
    }

    @Override
    public final x46 k0(Context context) {
        wka wkaVar = this.V;
        wkaVar.getClass();
        return new of2((Object) wkaVar, (byte) 5);
    }

    @Override
    public final eva l0() {
        return new rhb(getParentActivity(), 75, 1);
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
        jn7.f(this.currentAccount).b(this, jn7.x3);
        jn7.f(this.currentAccount).b(this, jn7.A3);
        jn7.f(this.currentAccount).b(this, jn7.B3);
        jn7.f(this.currentAccount).b(this, jn7.C3);
        jn7.f(this.currentAccount).b(this, jn7.E3);
        jxa.v(this.currentAccount, true).Q(true);
        jxa.v(this.currentAccount, true).P();
        kt0.g(this.currentAccount).j(getUserConfig().e(), true);
        jxa.v(this.currentAccount, true).w();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        d79 d79Var = this.c;
        if (d79Var != null) {
            d79Var.removeCallbacks(this.g0);
        }
        jn7.f(this.currentAccount).n(this, jn7.x3);
        jn7.f(this.currentAccount).n(this, jn7.A3);
        jn7.f(this.currentAccount).n(this, jn7.B3);
        jn7.f(this.currentAccount).n(this, jn7.C3);
        jn7.f(this.currentAccount).n(this, jn7.E3);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.e0 = true;
        this.c0 = i2;
        this.d0 = i4;
        C0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        yrc yrcVar = this.T;
        if (yrcVar != null) {
            yrcVar.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        yrc yrcVar = this.T;
        if (yrcVar != null) {
            yrcVar.setPaused(false);
        }
    }

    @Override
    public final float p0() {
        d79 d79Var = this.c;
        if (d79Var == null) {
            return 0.0f;
        }
        return d79Var.getY();
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
        yrc yrcVar = this.T;
        if (yrcVar != null) {
            yrcVar.setHeaderTilt(f * 70.0f);
        }
    }

    @Override
    public final void t0() {
        boolean z;
        super.t0();
        wka wkaVar = this.V;
        if (wkaVar != null && wkaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.f0 = z;
        d79 d79Var = this.c;
        if (d79Var != null && this.Q >= 0) {
            this.R -= d79Var.getPaddingTop();
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
