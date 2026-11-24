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
public final class yfb extends h15 implements jm7 {
    public FrameLayout S;
    public npc T;
    public mxa U;
    public fja V;
    public xd9 W;
    public View X;
    public fn0 Y;
    public fn0 Z;
    public fn0 a0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f0;
    public xd9 h0;
    public final boolean i0;
    public LinearLayout j0;
    public SpannableStringBuilder k0;
    public io l0;
    public io m0;
    public LinearLayout n0;
    public b61 o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public vb s0;
    public int b0 = -1;
    public final zcb g0 = new zcb(this, (byte) 3);

    public yfb() {
        boolean z;
        a.t();
        if (!e21.a()) {
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
        r59 r59Var = this.c;
        if (r59Var != null && this.V != null && r59Var.getLayoutParams() != null) {
            int x = b10.x(48.0f, this.c0, -gm.L(8.0f));
            int x2 = b10.x(48.0f, this.d0, -gm.L(8.0f));
            gm.v3(this.c, 0, x, 0, x2);
            r59 r59Var2 = this.c;
            int i = -x;
            r59Var2.setPadding(r59Var2.getPaddingLeft(), i, this.c.getPaddingRight(), this.d0 - x2);
            this.V.A(i, -x2);
        }
    }

    public final void D0(ArrayList arrayList, l7c l7cVar) {
        boolean z;
        r59 r59Var;
        fja fjaVar = this.V;
        if (fjaVar != null && fjaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.b0 = -1;
        if (getParentActivity() != null) {
            jva v = jva.v(this.currentAccount, true);
            c6c c6cVar = new c6c(-2);
            c6cVar.c = (sb) super.o0(getParentActivity());
            arrayList.add(c6cVar);
            arrayList.add(c6c.k(this.j0));
            boolean z2 = this.i0;
            if (z2 && !u15.c(this.currentAccount)) {
                arrayList.add(c6c.C(jb6.M0(2131749288, null)));
            }
            boolean K = v.K(0);
            this.p0 = K;
            if (K) {
                if (!z2 || u15.c(this.currentAccount)) {
                    arrayList.add(c6c.C(null));
                }
                this.b0 = arrayList.size();
                arrayList.add(c6c.n(this.W, -2));
                if (z && (r59Var = this.c) != null) {
                    zcb zcbVar = this.g0;
                    r59Var.removeCallbacks(zcbVar);
                    this.c.post(zcbVar);
                    return;
                }
                return;
            }
            arrayList.add(c6c.m(this.h0));
        }
    }

    public final void E0(int i) {
        c6c G;
        vb vbVar = this.s0;
        if (vbVar != null && (G = vbVar.G(i)) != null) {
            int i2 = G.d;
            if (i2 == -1) {
                this.s0.O(true);
            } else if (i2 == -2) {
                jva.v(this.currentAccount, true).r();
                yw4.f1(true, ok0.a(this.currentAccount).b());
            } else if (i2 == -3) {
                jva.v(this.currentAccount, true).U();
                this.s0.O(true);
            } else if (i2 == -4) {
                if (oc7.r1(this.currentAccount).u2()) {
                    h5.b(this.currentAccount);
                } else {
                    presentFragment(new mh1(getUserConfig().e()));
                }
            }
        }
    }

    public final void F0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z = true;
        jva v = jva.v(this.currentAccount, true);
        double d = getMessagesController().l4.k.i;
        TL_stars.StarsAmount m = v.m();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0);
        spannableStringBuilder.append((CharSequence) nxa.H0(m, 0.66f, ' '));
        this.l0.setText(spannableStringBuilder);
        int i = (int) ((m.amount / 1.0E9d) * d * 100.0d);
        io ioVar = this.m0;
        if (i > 0) {
            ioVar.setText("≈" + cj0.h().e(i, "USD"));
        } else {
            ioVar.setText(jb6.M0(2131742452, null));
        }
        int i2 = 0;
        TLRPC.TL_payments_starsRevenueStats j = ku0.g(this.currentAccount).j(getUserConfig().e(), false);
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
        int L = gm.L(44.0f) + org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() + this.c0;
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
        fn0 fn0Var = this.Y;
        float f2 = 0.0f;
        if (fn0Var == null) {
            f = 0.0f;
        } else {
            f = fn0Var.e;
        }
        fn0 fn0Var2 = this.Z;
        if (fn0Var2 != null) {
            f2 = fn0Var2.e;
        }
        view.setTranslationY(((-(1.0f - f)) * org.telegram.ui.ActionBar.a.getCurrentActionBarHeight()) - ((1.0f - f2) * gm.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        int i;
        int i2;
        int i3;
        this.H = false;
        this.F = gm.L(238.0f);
        fja fjaVar = new fja(context);
        this.V = fjaVar;
        fjaVar.setCommonInsetsManagedExternally(true);
        if (!this.e0) {
            tk5 tk5Var = this.parentLayout;
            if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
                i3 = 0;
            } else {
                i3 = gm.m;
            }
            this.c0 = i3;
            this.d0 = gm.n;
        }
        this.V.setGeometry(new x59(this, (byte) 18));
        this.V.A(-b10.x(48.0f, this.c0, -gm.L(8.0f)), -b10.x(48.0f, this.d0, -gm.L(8.0f)));
        fja fjaVar2 = this.V;
        fjaVar2.getClass();
        this.W = new xd9((byte) 7, context, fjaVar2);
        this.U = new mxa(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.h0 = new xd9((byte) 13, context, this);
        super.createView(context);
        g15 g15Var = this.s;
        getBaseSimpleGlass().f(g15Var, this.c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().n = this.V;
        this.c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().o = new dh0(this, new kwa(g15Var, (byte) 1), (byte) 9);
        FrameLayout tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        float f = 0.0f;
        view.setAlpha(0.0f);
        fja fjaVar3 = this.V;
        fjaVar3.addView(this.X, fjaVar3.indexOfChild(tabsContainer), qoe.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        ufb ufbVar = new ufb(this, (byte) 1);
        d53 d53Var = d53.h;
        fn0 fn0Var = new fn0(0, ufbVar, d53Var, 380L, false);
        this.Y = fn0Var;
        this.Z = new fn0(1, new ufb(this, (byte) 2), d53Var, 380L, false);
        this.a0 = new fn0(2, new ufb(this, (byte) 3), d53Var, 380L, false);
        if (!this.c.canScrollVertically(-1) && !this.simpleActionBar.x()) {
            z = false;
        } else {
            z = true;
        }
        fn0Var.a(z, false);
        this.Z.a(this.V.f0, false);
        this.c.j(new k2b(this, (byte) 1));
        G0();
        im0 c = getBaseSimpleGlass().c.c(tabsContainer, null, false);
        c.p(qqd.l(this.resourceProvider));
        c.q(gm.L(9.66f));
        c.r(gm.L(18.0f));
        tabsContainer.setBackground(c);
        tk5 tk5Var2 = this.parentLayout;
        if (tk5Var2 != null && ((ActionBarLayout) tk5Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231245);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        npc npcVar = new npc(170, context, false);
        this.T = npcVar;
        npcVar.setStarParticlesView(this.e);
        this.S.addView(this.T, qoe.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        String M0 = jb6.M0(2131749285, null);
        if (u15.c(this.currentAccount)) {
            i = 2131749286;
        } else {
            i = 2131749287;
        }
        j0(M0, gm.D2(gm.N2(jb6.M0(i, null), -1, 0, new dh1(context, (byte) 24), null), true), this.S, null);
        this.c.setOverScrollMode(2);
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53Var);
        sc3Var.n(350L);
        this.c.setItemAnimator(sc3Var);
        this.c.setOnItemClickListener(new s19(this, (byte) 20));
        this.s.addView(new uj4(getParentActivity()), qoe.c(-1.0f, -1));
        jva.v(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.j0.setPadding(0, gm.L(20.0f), 0, gm.L(10.0f));
        io ioVar = new io(getParentActivity(), false, true, false);
        this.l0 = ioVar;
        ioVar.setTypeface(gm.o());
        this.l0.setTextSize(gm.L(32.0f));
        this.l0.setGravity(17);
        anb.U(this.l0, cmb.F6, this.resourceProvider);
        this.k0 = new SpannableStringBuilder("S");
        pn2 pn2Var = new pn2(2131231962, 0);
        pn2Var.d = false;
        pn2Var.I = 0.5f;
        pn2Var.J = 0.5f;
        pn2Var.r = -gm.L(3.0f);
        pn2Var.s = 0.0f;
        this.k0.setSpan(pn2Var, 0, 1, 33);
        this.j0.addView(this.l0, qoe.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        io ioVar2 = new io(getParentActivity(), false, false, false);
        this.m0 = ioVar2;
        ioVar2.setTextSize(gm.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(jb6.M0(2131742452, null));
        anb.U(this.m0, cmb.y6, this.resourceProvider);
        this.j0.addView(this.m0, qoe.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
        this.n0 = linearLayout2;
        linearLayout2.setOrientation(0);
        boolean c2 = u15.c(this.currentAccount);
        this.r0 = c2;
        if (c2) {
            this.q0 = true;
            b61 b61Var = new b61(this.resourceProvider, getParentActivity(), true);
            b61Var.setRoundRadius(24);
            this.o0 = b61Var;
            b61Var.i(jb6.M0(2131749279, null), false, true);
            this.o0.setOnClickListener(new View.OnClickListener(this) {
                public final yfb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    yfb yfbVar = this.b;
                    switch (b) {
                        case 0:
                            b61 b61Var2 = yfbVar.o0;
                            if (b61Var2 != null && !b61Var2.R) {
                                b61Var2.setLoading(true);
                                int currentAccount = yfbVar.getCurrentAccount();
                                lf2 lf2Var = new lf2(b61Var2, yfbVar, (byte) 17);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new tg(lf2Var, (byte) 29));
                                return;
                            }
                            return;
                        default:
                            yfbVar.presentFragment(new au0(1, yfbVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.n0.addView(this.o0, qoe.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        } else {
            b61 b61Var2 = new b61(this.resourceProvider, getParentActivity(), true);
            b61Var2.setRoundRadius(24);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
            spannableStringBuilder.setSpan(new pn2(2131231978, 2), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131743729, null));
            b61Var2.i(spannableStringBuilder, false, true);
            b61Var2.setOnClickListener(new View.OnClickListener(this) {
                public final yfb b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    byte b = r2;
                    yfb yfbVar = this.b;
                    switch (b) {
                        case 0:
                            b61 b61Var22 = yfbVar.o0;
                            if (b61Var22 != null && !b61Var22.R) {
                                b61Var22.setLoading(true);
                                int currentAccount = yfbVar.getCurrentAccount();
                                lf2 lf2Var = new lf2(b61Var22, yfbVar, (byte) 17);
                                TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
                                tL_payments_getStarsRevenueStats.ton = true;
                                tL_payments_getStarsRevenueStats.peer = new TLRPC.TL_inputPeerSelf();
                                ConnectionsManager.getInstance(currentAccount).sendRequest(tL_payments_getStarsRevenueStats, new tg(lf2Var, (byte) 29));
                                return;
                            }
                            return;
                        default:
                            yfbVar.presentFragment(new au0(1, yfbVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.n0.addView(b61Var2, qoe.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        }
        this.j0.addView(this.n0, qoe.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
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
        vb vbVar = this.s0;
        if (vbVar != null) {
            vbVar.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.x3) {
            u0();
            vb vbVar = this.s0;
            if (vbVar != null) {
                vbVar.O(true);
            }
            h0();
        } else if (i == nm7.B3) {
            jva v = jva.v(this.currentAccount, true);
            if (this.p0 != v.K(0)) {
                this.p0 = v.K(0);
                u0();
                vb vbVar2 = this.s0;
                if (vbVar2 != null) {
                    vbVar2.O(false);
                }
                h0();
            }
        } else if (i == nm7.C3) {
            vb vbVar3 = this.s0;
            if (vbVar3 != null) {
                vbVar3.O(true);
            }
        } else if (i == nm7.A3) {
            F0();
        } else if (i == nm7.E3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return cmb.w0(null, cmb.h5, false);
    }

    @Override
    public final void h0() {
        fja fjaVar;
        super.h0();
        if (this.f0 && (fjaVar = this.V) != null && this.b0 != -1) {
            fjaVar.a();
        }
        this.f0 = false;
    }

    @Override
    public final void i0() {
        this.s.addView(this.V, qoe.c(-1.0f, -1));
        this.V.v(this.c, new ufb(this, (byte) 0));
        fja fjaVar = this.V;
        mxa mxaVar = this.U;
        wgc viewPager = mxaVar.getViewPager();
        mxa mxaVar2 = this.U;
        Objects.requireNonNull(mxaVar2);
        fjaVar.y(mxaVar, viewPager, new wta(mxaVar2, (byte) 17));
        this.V.z(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        C0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        fja fjaVar = this.V;
        if (fjaVar == null || motionEvent == null || fjaVar.o(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final y59 k0() {
        vb vbVar = new vb(this, this.c, getParentActivity(), this.currentAccount, this.classGuid, new o6b(this, (byte) 3), getResourceProvider(), (byte) 5);
        this.s0 = vbVar;
        vbVar.r = false;
        return vbVar;
    }

    @Override
    public final u46 l0(Context context) {
        fja fjaVar = this.V;
        fjaVar.getClass();
        return new jg2((Object) fjaVar, (byte) 5);
    }

    @Override
    public final dta m0() {
        return new wfb(getParentActivity(), 75, 1);
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
        nm7.f(this.currentAccount).b(this, nm7.x3);
        nm7.f(this.currentAccount).b(this, nm7.A3);
        nm7.f(this.currentAccount).b(this, nm7.B3);
        nm7.f(this.currentAccount).b(this, nm7.C3);
        nm7.f(this.currentAccount).b(this, nm7.E3);
        jva.v(this.currentAccount, true).P(true);
        jva.v(this.currentAccount, true).O();
        ku0.g(this.currentAccount).j(getUserConfig().e(), true);
        jva.v(this.currentAccount, true).w();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        r59 r59Var = this.c;
        if (r59Var != null) {
            r59Var.removeCallbacks(this.g0);
        }
        nm7.f(this.currentAccount).n(this, nm7.x3);
        nm7.f(this.currentAccount).n(this, nm7.A3);
        nm7.f(this.currentAccount).n(this, nm7.B3);
        nm7.f(this.currentAccount).n(this, nm7.C3);
        nm7.f(this.currentAccount).n(this, nm7.E3);
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
        npc npcVar = this.T;
        if (npcVar != null) {
            npcVar.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        npc npcVar = this.T;
        if (npcVar != null) {
            npcVar.setPaused(false);
        }
    }

    @Override
    public final float q0() {
        r59 r59Var = this.c;
        if (r59Var == null) {
            return 0.0f;
        }
        return r59Var.getY();
    }

    @Override
    public final View r0() {
        return this.V;
    }

    @Override
    public final void s0(boolean z) {
        fn0 fn0Var = this.a0;
        if (fn0Var != null && fn0Var.f != z) {
            fn0Var.a(z, true);
        }
    }

    @Override
    public final void t0(float f) {
        npc npcVar = this.T;
        if (npcVar != null) {
            npcVar.setHeaderTilt(f * 70.0f);
        }
    }

    @Override
    public final void u0() {
        boolean z;
        super.u0();
        fja fjaVar = this.V;
        if (fjaVar != null && fjaVar.f0) {
            z = true;
        } else {
            z = false;
        }
        this.f0 = z;
        r59 r59Var = this.c;
        if (r59Var != null && this.Q >= 0) {
            this.R -= r59Var.getPaddingTop();
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
