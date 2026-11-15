package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.b6;
import bi.g2;
import bi.o2;
import bi.x5;
import bi.z4;
import c8.ja;
import di.e0;
import di.kb;
import di.lb;
import di.qa;
import di.t;
import di.u8;
import di.z6;
import fh.g;
import hi.e1;
import hi.q4;
import j$.util.Objects;
import java.util.ArrayList;
import ki.n3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Wallet.w6;
import org.telegram.ui.o00;
import org.telegram.ui.p00;
import org.telegram.ui.rv;
import org.telegram.ui.z51;
import ug.s1;
import v4.b0;
import v4.h0;
import wg.c1;
public final class f extends p00 implements is {
    public FrameLayout S;
    public w6 T;
    public kb U;
    public it0 V;
    public o2 W;
    public View X;
    public te.a Y;
    public te.a Z;
    public te.a f15953a0;
    public int f15955c0;
    public int f15956d0;
    public boolean f15957e0;
    public boolean f15958f0;
    public o2 f15960h0;
    public final boolean f15961i0;
    public LinearLayout f15962j0;
    public SpannableStringBuilder f15963k0;
    public h6 f15964l0;
    public h6 m0;
    public g2 f15965n0;
    public hi.d f15966o0;
    public z51 f15967p0;
    public hi.d f15968q0;
    public hi.d f15969r0;
    public boolean f15970s0;
    public boolean f15971t0;
    public x5 f15972u0;
    public int f15954b0 = -1;
    public final e1 f15959g0 = new e1(this, 21);

    public f() {
        boolean z10;
        t0.u();
        if (!r2.a()) {
            t0.r();
            z10 = false;
        } else {
            z10 = true;
        }
        this.f15961i0 = z10;
        this.N = true;
    }

    public static void A0(f fVar, int i7) {
        b41 G;
        x5 x5Var = fVar.f15972u0;
        if (x5Var != null && (G = x5Var.G(i7)) != null) {
            int i10 = G.d;
            if (i10 == -1) {
                fVar.f15972u0.O(true);
            } else if (i10 == -2) {
                u8.y(fVar.currentAccount, true).u();
                c1.l1(1, v1.a(fVar.currentAccount).b());
            } else if (i10 == -3) {
                u8.y(fVar.currentAccount, true).V();
                fVar.f15972u0.O(true);
            } else if (i10 == -4) {
                if (np.s1(fVar.currentAccount).v2()) {
                    org.telegram.ui.b.b(fVar.currentAccount);
                } else {
                    fVar.presentFragment(new n3(fVar.getUserConfig().e()));
                }
            }
        }
    }

    public final void D0() {
        G0();
        uj0 uj0Var = this.f50075c;
        if (uj0Var != null && this.V != null && uj0Var.getLayoutParams() != null) {
            int C = i20.C(48.0f, this.f15955c0, -g0.L(8.0f));
            int C2 = i20.C(48.0f, this.f15956d0, -g0.L(8.0f));
            g0.A3(this.f50075c, 0, C, 0, C2);
            uj0 uj0Var2 = this.f50075c;
            int i7 = -C;
            uj0Var2.setPadding(uj0Var2.getPaddingLeft(), i7, this.f50075c.getPaddingRight(), this.f15956d0 - C2);
            this.V.z(i7, -C2);
        }
    }

    public final void E0(ArrayList arrayList, p41 p41Var) {
        boolean z10;
        uj0 uj0Var;
        it0 it0Var = this.V;
        if (it0Var != null && it0Var.f35713f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15954b0 = -1;
        if (getParentActivity() != null) {
            u8 y10 = u8.y(this.currentAccount, true);
            b41 b41Var = new b41(-2);
            b41Var.f33177c = (rv) super.o0(getParentActivity());
            arrayList.add(b41Var);
            arrayList.add(b41.k(this.f15962j0));
            boolean z11 = this.f15961i0;
            if (z11) {
                arrayList.add(b41.C(hd.M0(2131749514, null)));
            }
            boolean N = y10.N(0);
            this.f15970s0 = N;
            if (N) {
                if (!z11) {
                    arrayList.add(b41.C(null));
                }
                this.f15954b0 = arrayList.size();
                arrayList.add(b41.n(this.W, -2));
                if (z10 && (uj0Var = this.f50075c) != null) {
                    e1 e1Var = this.f15959g0;
                    uj0Var.removeCallbacks(e1Var);
                    this.f50075c.post(e1Var);
                    return;
                }
                return;
            }
            arrayList.add(b41.m(this.f15960h0));
        }
    }

    public final void F0() {
        int i7;
        final boolean z10;
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        u8 y10 = u8.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().f25451y7.f25857l.f13134b).f24257a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f15963k0);
        spannableStringBuilder.append((CharSequence) lb.M0(p10, 0.66f, ' '));
        this.f15964l0.setText(spannableStringBuilder);
        if (((int) ((p10.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.m0.setText("≈" + r1.i().f(i7, "USD"));
        } else {
            this.m0.setText(hd.M0(2131742789, null));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = e0.g(this.currentAccount).j(getUserConfig().e(), true);
        if (j3 != null && (tL_starsRevenueStatus = j3.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f15971t0 == z10) {
            return;
        }
        this.f15971t0 = z10;
        this.f15965n0.setVisibility(0);
        this.f15967p0.setVisibility(0);
        ViewPropertyAnimator animate = this.f15965n0.animate();
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).withEndAction(new Runnable(this) {
            public final f f15949b;

            {
                this.f15949b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f15949b.f15965n0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f15949b.f15967p0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f15967p0.animate();
        if (!z10) {
            f11 = 0.0f;
        }
        animate2.alpha(f11).withEndAction(new Runnable(this) {
            public final f f15949b;

            {
                this.f15949b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f15949b.f15965n0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f15949b.f15967p0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    public final void G0() {
        if (this.X == null) {
            return;
        }
        int L = g0.L(44.0f) + k.getCurrentActionBarHeight() + this.f15955c0;
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
            f10 = aVar.f57085e;
        }
        te.a aVar2 = this.Z;
        if (aVar2 != null) {
            f11 = aVar2.f57085e;
        }
        view.setTranslationY(((-(1.0f - f10)) * k.getCurrentActionBarHeight()) - ((1.0f - f11) * g0.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f10;
        int i7;
        int i10;
        this.H = false;
        this.F = g0.L(238.0f);
        it0 it0Var = new it0(context);
        this.V = it0Var;
        it0Var.setCommonInsetsManagedExternally(true);
        if (!this.f15957e0) {
            o4 o4Var = this.parentLayout;
            if (o4Var != null && ((ActionBarLayout) o4Var).T0) {
                i10 = 0;
            } else {
                i10 = g0.f23605m;
            }
            this.f15955c0 = i10;
            this.f15956d0 = g0.f23606n;
        }
        int i11 = 8;
        this.V.setGeometry(new gc.b(this, 8));
        this.V.z(-i20.C(48.0f, this.f15955c0, -g0.L(8.0f)), -i20.C(48.0f, this.f15956d0, -g0.L(8.0f)));
        it0 it0Var2 = this.V;
        it0Var2.getClass();
        this.W = new o2(26, context, it0Var2);
        this.U = new kb(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.f15960h0 = new o2(4, context, this);
        super.createView(context);
        o00 o00Var = this.f50080s;
        getBaseSimpleGlass().f(o00Var, this.f50075c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f56051n = this.V;
        this.f50075c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f56052o = new di.f(2, this, new di.e(2, o00Var));
        FrameLayout tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        float f11 = 0.0f;
        view.setAlpha(0.0f);
        it0 it0Var3 = this.V;
        it0Var3.addView(this.X, it0Var3.indexOfChild(tabsContainer), ja.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        a aVar = new a(this, 0);
        er erVar = er.h;
        te.a aVar2 = new te.a(0, aVar, erVar, 380L, false);
        this.Y = aVar2;
        this.Z = new te.a(1, new a(this, 1), erVar, 380L, false);
        this.f15953a0 = new te.a(2, new a(this, 2), erVar, 380L, false);
        if (!this.f50075c.canScrollVertically(-1) && !this.simpleActionBar.v()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar2.a(z10, false);
        this.Z.a(this.V.f35713f0, false);
        this.f50075c.j(new z4(this, 16));
        G0();
        g c10 = getBaseSimpleGlass().f56042c.c(tabsContainer, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        o4 o4Var2 = this.parentLayout;
        if (o4Var2 != null && ((ActionBarLayout) o4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        w6 w6Var = new w6(170, context, false);
        this.T = w6Var;
        w6Var.setStarParticlesView(this.f50076e);
        this.S.addView(this.T, ja.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(hd.M0(2131749512, null), g0.H2(g0.U2(hd.M0(2131749513, null), new ai.a(context, 9)), true), this.S, null);
        this.f50075c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(erVar);
        kVar.n(350L);
        this.f50075c.setItemAnimator(kVar);
        this.f50075c.setOnItemClickListener(new b6(this, 12));
        this.f50080s.addView(new nz(getParentActivity()), ja.c(-1.0f, -1));
        u8.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f15962j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f15962j0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        h6 h6Var = new h6(getParentActivity(), false, true, false);
        this.f15964l0 = h6Var;
        h6Var.setTypeface(g0.o());
        this.f15964l0.setTextSize(g0.L(32.0f));
        this.f15964l0.setGravity(17);
        q6.Y(this.f15964l0, j6.G6, this.resourceProvider);
        this.f15963k0 = new SpannableStringBuilder("S");
        eq eqVar = new eq(2131231957, 0);
        eqVar.d = false;
        eqVar.I = 0.5f;
        eqVar.J = 0.5f;
        eqVar.f34414r = -g0.L(3.0f);
        eqVar.f34415s = 0.0f;
        this.f15963k0.setSpan(eqVar, 0, 1, 33);
        this.f15962j0.addView(this.f15964l0, ja.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        h6 h6Var2 = new h6(getParentActivity(), false, false, false);
        this.m0 = h6Var2;
        h6Var2.setTextSize(g0.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(hd.M0(2131742789, null));
        q6.Y(this.m0, j6.f29260z6, this.resourceProvider);
        this.f15962j0.addView(this.m0, ja.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        g2 g2Var = new g2(6, getParentActivity(), this);
        this.f15965n0 = g2Var;
        frameLayout2.addView(g2Var);
        boolean z11 = this.f15961i0;
        if (z11) {
            hi.d dVar = new hi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f15966o0 = dVar;
            dVar.f();
            this.f15966o0.i(hd.M0(2131744030, null), false, true);
            this.f15966o0.setOnClickListener(new View.OnClickListener(this) {
                public final f f15947b;

                {
                    this.f15947b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i12 = r2;
                    f fVar = this.f15947b;
                    switch (i12) {
                        case 0:
                            vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                            return;
                        case 1:
                            vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                            return;
                        default:
                            fVar.presentFragment(new t(1, fVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.f15965n0.addView(this.f15966o0, ja.e(-1, 48, 119));
        }
        z51 z51Var = new z51(5, getParentActivity(), this);
        this.f15967p0 = z51Var;
        frameLayout2.addView(z51Var);
        hi.d dVar2 = new hi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f15968q0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new eq(2131231977, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.M0(2131744043, null));
        this.f15968q0.i(spannableStringBuilder, false, true);
        this.f15968q0.setOnClickListener(new View.OnClickListener(this) {
            public final f f15947b;

            {
                this.f15947b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r2;
                f fVar = this.f15947b;
                switch (i12) {
                    case 0:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                        return;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                        return;
                    default:
                        fVar.presentFragment(new t(1, fVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (z11) {
            this.f15967p0.addView(this.f15968q0, ja.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        hi.d dVar3 = new hi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f15969r0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new eq(2131231973, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) hd.M0(2131744044, null));
        this.f15969r0.i(spannableStringBuilder2, false, true);
        this.f15969r0.setOnClickListener(new View.OnClickListener(this) {
            public final f f15947b;

            {
                this.f15947b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r2;
                f fVar = this.f15947b;
                switch (i12) {
                    case 0:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                        return;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744028, null), false);
                        return;
                    default:
                        fVar.presentFragment(new t(1, fVar.getUserConfig().e()));
                        return;
                }
            }
        });
        this.f15967p0.addView(this.f15969r0, ja.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f15962j0.addView(frameLayout2, ja.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.f15965n0.animate().cancel();
        this.f15967p0.animate().cancel();
        z51 z51Var2 = this.f15967p0;
        if (this.f15971t0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        z51Var2.setAlpha(f10);
        g2 g2Var2 = this.f15965n0;
        if (!this.f15971t0) {
            f11 = 1.0f;
        }
        g2Var2.setAlpha(f11);
        z51 z51Var3 = this.f15967p0;
        if (this.f15971t0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        z51Var3.setVisibility(i7);
        g2 g2Var3 = this.f15965n0;
        if (!this.f15971t0) {
            i11 = 0;
        }
        g2Var3.setVisibility(i11);
        F0();
        x5 x5Var = this.f15972u0;
        if (x5Var != null) {
            x5Var.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25590v3) {
            u0();
            x5 x5Var = this.f15972u0;
            if (x5Var != null) {
                x5Var.O(true);
            }
            h0();
        } else if (i7 == ns.f25618z3) {
            u8 y10 = u8.y(this.currentAccount, true);
            if (this.f15970s0 != y10.N(0)) {
                this.f15970s0 = y10.N(0);
                u0();
                x5 x5Var2 = this.f15972u0;
                if (x5Var2 != null) {
                    x5Var2.O(false);
                }
                h0();
            }
        } else if (i7 == ns.A3) {
            x5 x5Var3 = this.f15972u0;
            if (x5Var3 != null) {
                x5Var3.O(true);
            }
        } else if (i7 == ns.f25611y3) {
            F0();
        } else if (i7 == ns.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return j6.x0(null, j6.f28940i5, false);
    }

    @Override
    public final void h0() {
        it0 it0Var;
        super.h0();
        if (this.f15958f0 && (it0Var = this.V) != null && this.f15954b0 != -1) {
            it0Var.a();
        }
        this.f15958f0 = false;
    }

    @Override
    public final void i0() {
        this.f50080s.addView(this.V, ja.c(-1.0f, -1));
        this.V.u(this.f50075c, new a(this, 3));
        it0 it0Var = this.V;
        kb kbVar = this.U;
        w61 viewPager = kbVar.getViewPager();
        kb kbVar2 = this.U;
        Objects.requireNonNull(kbVar2);
        it0Var.x(kbVar, viewPager, new z6(kbVar2, 23));
        this.V.y(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        it0 it0Var = this.V;
        if (it0Var == null || motionEvent == null || it0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().f41298b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final h0 k0() {
        x5 x5Var = new x5(this, this.f50075c, getParentActivity(), this.currentAccount, this.classGuid, new q4(this, 4), getResourceProvider(), 3);
        this.f15972u0 = x5Var;
        x5Var.f38199r = false;
        return x5Var;
    }

    @Override
    public final b0 l0(Context context) {
        it0 it0Var = this.V;
        it0Var.getClass();
        return new jg.i0(5, it0Var, false);
    }

    @Override
    public final s1 m0() {
        return new qa(getParentActivity(), 75, 1, 1);
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
        ns.f(this.currentAccount).c(this, ns.f25590v3);
        ns.f(this.currentAccount).c(this, ns.f25611y3);
        ns.f(this.currentAccount).c(this, ns.f25618z3);
        ns.f(this.currentAccount).c(this, ns.A3);
        ns.f(this.currentAccount).c(this, ns.C3);
        u8.y(this.currentAccount, true).S(true);
        u8.y(this.currentAccount, true).R();
        u8.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        uj0 uj0Var = this.f50075c;
        if (uj0Var != null) {
            uj0Var.removeCallbacks(this.f15959g0);
        }
        ns.f(this.currentAccount).n(this, ns.f25590v3);
        ns.f(this.currentAccount).n(this, ns.f25611y3);
        ns.f(this.currentAccount).n(this, ns.f25618z3);
        ns.f(this.currentAccount).n(this, ns.A3);
        ns.f(this.currentAccount).n(this, ns.C3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f15957e0 = true;
        this.f15955c0 = i10;
        this.f15956d0 = i12;
        D0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        w6 w6Var = this.T;
        if (w6Var != null) {
            w6Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.T;
        if (w6Var != null) {
            w6Var.setPaused(false);
        }
    }

    @Override
    public final float q0() {
        uj0 uj0Var = this.f50075c;
        if (uj0Var == null) {
            return 0.0f;
        }
        return uj0Var.getY();
    }

    @Override
    public final View r0() {
        return this.V;
    }

    @Override
    public final void s0(boolean z10) {
        te.a aVar = this.f15953a0;
        if (aVar != null && aVar.f57086f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public final void t0(float f10) {
        w6 w6Var = this.T;
        if (w6Var != null) {
            w6Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override
    public final void u0() {
        boolean z10;
        super.u0();
        it0 it0Var = this.V;
        if (it0Var != null && it0Var.f35713f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15958f0 = z10;
        uj0 uj0Var = this.f50075c;
        if (uj0Var != null && this.Q >= 0) {
            this.R -= uj0Var.getPaddingTop();
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
