package hi;

import ai.f6;
import ai.j5;
import ai.j6;
import ai.o2;
import ai.s1;
import ai.x2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.cd;
import b8.mf;
import ci.bb;
import ci.e9;
import ci.v;
import ci.vb;
import ci.wb;
import ei.y8;
import ii.q3;
import j$.util.Objects;
import java.util.ArrayList;
import kg.f0;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.r1;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.v1;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.voip.r0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.u6;
import org.telegram.ui.k00;
import org.telegram.ui.l00;
import org.telegram.ui.s51;
import u4.b0;
import u4.h0;
import vg.t1;
import xg.e1;
public final class g extends l00 implements cs {
    public FrameLayout S;
    public u6 T;
    public vb U;
    public gt0 V;
    public x2 W;
    public View X;
    public qe.a Y;
    public qe.a Z;
    public qe.a f14432a0;
    public int f14434c0;
    public int f14435d0;
    public boolean f14436e0;
    public boolean f14437f0;
    public x2 f14439h0;
    public final boolean f14440i0;
    public LinearLayout f14441j0;
    public SpannableStringBuilder f14442k0;
    public h6 f14443l0;
    public h6 m0;
    public o2 f14444n0;
    public gi.d f14445o0;
    public s51 f14446p0;
    public gi.d f14447q0;
    public gi.d f14448r0;
    public boolean f14449s0;
    public boolean f14450t0;
    public f6 f14451u0;
    public int f14433b0 = -1;
    public final gi.f6 f14438g0 = new gi.f6(this, 13);

    public g() {
        boolean z10;
        t0.u();
        if (!r2.a()) {
            t0.r();
            z10 = false;
        } else {
            z10 = true;
        }
        this.f14440i0 = z10;
        this.N = true;
    }

    public static void A0(g gVar, int i3) {
        r31 G;
        f6 f6Var = gVar.f14451u0;
        if (f6Var != null && (G = f6Var.G(i3)) != null) {
            int i10 = G.d;
            if (i10 == -1) {
                gVar.f14451u0.O(true);
            } else if (i10 == -2) {
                e9.y(gVar.currentAccount, true).u();
                e1.l1(1, v1.a(gVar.currentAccount).b());
            } else if (i10 == -3) {
                e9.y(gVar.currentAccount, true).V();
                gVar.f14451u0.O(true);
            } else if (i10 == -4) {
                if (hp.s1(gVar.currentAccount).v2()) {
                    org.telegram.ui.b.b(gVar.currentAccount);
                } else {
                    gVar.presentFragment(new q3(gVar.getUserConfig().e()));
                }
            }
        }
    }

    public final void D0() {
        G0();
        tj0 tj0Var = this.f47063c;
        if (tj0Var != null && this.V != null && tj0Var.getLayoutParams() != null) {
            int C = q.C(48.0f, this.f14434c0, -g0.L(8.0f));
            int C2 = q.C(48.0f, this.f14435d0, -g0.L(8.0f));
            g0.B3(this.f47063c, 0, C, 0, C2);
            tj0 tj0Var2 = this.f47063c;
            int i3 = -C;
            tj0Var2.setPadding(tj0Var2.getPaddingLeft(), i3, this.f47063c.getPaddingRight(), this.f14435d0 - C2);
            this.V.z(i3, -C2);
        }
    }

    public final void E0(ArrayList arrayList, f41 f41Var) {
        boolean z10;
        tj0 tj0Var;
        gt0 gt0Var = this.V;
        if (gt0Var != null && gt0Var.f34196f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14433b0 = -1;
        if (getParentActivity() != null) {
            e9 y9 = e9.y(this.currentAccount, true);
            r31 r31Var = new r31(-2);
            r31Var.f37620c = (r0) super.o0(getParentActivity());
            arrayList.add(r31Var);
            arrayList.add(r31.k(this.f14441j0));
            boolean z11 = this.f14440i0;
            if (z11) {
                arrayList.add(r31.C(bd.M0(2131749522, null)));
            }
            boolean N = y9.N(0);
            this.f14449s0 = N;
            if (N) {
                if (!z11) {
                    arrayList.add(r31.C(null));
                }
                this.f14433b0 = arrayList.size();
                arrayList.add(r31.n(this.W, -2));
                if (z10 && (tj0Var = this.f47063c) != null) {
                    gi.f6 f6Var = this.f14438g0;
                    tj0Var.removeCallbacks(f6Var);
                    this.f47063c.post(f6Var);
                    return;
                }
                return;
            }
            arrayList.add(r31.m(this.f14439h0));
        }
    }

    public final void F0() {
        int i3;
        final boolean z10;
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        e9 y9 = e9.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().f23167x7.f24665l.f14429b).f23413a;
        TL_stars.StarsAmount p10 = y9.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f14442k0);
        spannableStringBuilder.append((CharSequence) wb.M0(p10, 0.66f, ' '));
        this.f14443l0.setText(spannableStringBuilder);
        if (((int) ((p10.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.m0.setText("≈" + r1.i().f(i3, "USD"));
        } else {
            this.m0.setText(bd.M0(2131742799, null));
        }
        TLRPC.TL_payments_starsRevenueStats j10 = ci.i0.g(this.currentAccount).j(getUserConfig().e(), true);
        if (j10 != null && (tL_starsRevenueStatus = j10.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f14450t0 == z10) {
            return;
        }
        this.f14450t0 = z10;
        this.f14444n0.setVisibility(0);
        this.f14446p0.setVisibility(0);
        ViewPropertyAnimator animate = this.f14444n0.animate();
        float f11 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).withEndAction(new Runnable(this) {
            public final g f14426b;

            {
                this.f14426b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f14426b.f14444n0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f14426b.f14446p0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f14446p0.animate();
        if (!z10) {
            f11 = 0.0f;
        }
        animate2.alpha(f11).withEndAction(new Runnable(this) {
            public final g f14426b;

            {
                this.f14426b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z10) {
                            this.f14426b.f14444n0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z10) {
                            this.f14426b.f14446p0.setVisibility(8);
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
        int L = g0.L(44.0f) + k.getCurrentActionBarHeight() + this.f14434c0;
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
        qe.a aVar = this.Y;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f53840e;
        }
        qe.a aVar2 = this.Z;
        if (aVar2 != null) {
            f11 = aVar2.f53840e;
        }
        view.setTranslationY(((-(1.0f - f10)) * k.getCurrentActionBarHeight()) - ((1.0f - f11) * g0.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        float f10;
        int i3;
        int i10;
        this.H = false;
        this.F = g0.L(238.0f);
        gt0 gt0Var = new gt0(context);
        this.V = gt0Var;
        gt0Var.setCommonInsetsManagedExternally(true);
        if (!this.f14436e0) {
            q4 q4Var = this.parentLayout;
            if (q4Var != null && ((ActionBarLayout) q4Var).T0) {
                i10 = 0;
            } else {
                i10 = g0.f22602m;
            }
            this.f14434c0 = i10;
            this.f14435d0 = g0.f22603n;
        }
        this.V.setGeometry(new d(this, 0));
        this.V.z(-q.C(48.0f, this.f14434c0, -g0.L(8.0f)), -q.C(48.0f, this.f14435d0, -g0.L(8.0f)));
        gt0 gt0Var2 = this.V;
        gt0Var2.getClass();
        this.W = new x2(26, context, gt0Var2);
        this.U = new vb(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.V);
        this.f14439h0 = new x2(4, context, this);
        super.createView(context);
        k00 k00Var = this.f47068s;
        getBaseSimpleGlass().f(k00Var, this.f47063c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.E.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f53533m = this.V;
        this.f47063c.setCaptureSectionsDecoratorAllowed(true);
        this.U.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f53534n = new ci.g(2, this, new ci.f(2, k00Var));
        FrameLayout tabsContainer = this.U.getTabsContainer();
        View view = new View(getParentActivity());
        this.X = view;
        float f11 = 0.0f;
        view.setAlpha(0.0f);
        gt0 gt0Var3 = this.V;
        gt0Var3.addView(this.X, gt0Var3.indexOfChild(tabsContainer), mf.e(-1, 0, 48));
        this.X.setBackground(getBaseSimpleGlass().a(this.X));
        a aVar = new a(this, 0);
        xq xqVar = xq.h;
        qe.a aVar2 = new qe.a(0, aVar, xqVar, 380L, false);
        this.Y = aVar2;
        this.Z = new qe.a(1, new a(this, 1), xqVar, 380L, false);
        this.f14432a0 = new qe.a(2, new a(this, 2), xqVar, 380L, false);
        if (!this.f47063c.canScrollVertically(-1) && !this.simpleActionBar.s()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar2.a(z10, false);
        this.Z.a(this.V.f34196f0, false);
        this.f47063c.j(new j5(this, 16));
        G0();
        gh.g c2 = getBaseSimpleGlass().f53525c.c(tabsContainer, null, false);
        c2.p(cd.m(this.resourceProvider));
        c2.q(g0.L(9.66f));
        c2.r(g0.L(18.0f));
        tabsContainer.setBackground(c2);
        q4 q4Var2 = this.parentLayout;
        if (q4Var2 != null && ((ActionBarLayout) q4Var2).U0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.S = frameLayout;
        frameLayout.setClickable(true);
        u6 u6Var = new u6(170, context, false);
        this.T = u6Var;
        u6Var.setStarParticlesView(this.f47064e);
        this.S.addView(this.T, mf.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        int i11 = 8;
        j0(bd.M0(2131749520, null), g0.H2(g0.U2(bd.M0(2131749521, null), new s1(context, 8)), true), this.S, null);
        this.f47063c.setOverScrollMode(2);
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.f47063c.setItemAnimator(kVar);
        this.f47063c.setOnItemClickListener(new j6(this, 12));
        this.f47068s.addView(new gz(getParentActivity()), mf.c(-1.0f, -1));
        e9.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f14441j0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f14441j0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        h6 h6Var = new h6(getParentActivity(), false, true, false);
        this.f14443l0 = h6Var;
        h6Var.setTypeface(g0.o());
        this.f14443l0.setTextSize(g0.L(32.0f));
        this.f14443l0.setGravity(17);
        r6.Z(this.f14443l0, k6.G6, this.resourceProvider);
        this.f14442k0 = new SpannableStringBuilder("S");
        wp wpVar = new wp(2131231957, 0);
        wpVar.d = false;
        wpVar.I = 0.5f;
        wpVar.J = 0.5f;
        wpVar.f40045r = -g0.L(3.0f);
        wpVar.f40046s = 0.0f;
        this.f14442k0.setSpan(wpVar, 0, 1, 33);
        this.f14441j0.addView(this.f14443l0, mf.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        h6 h6Var2 = new h6(getParentActivity(), false, false, false);
        this.m0 = h6Var2;
        h6Var2.setTextSize(g0.L(14.0f));
        this.m0.setGravity(17);
        this.m0.setText(bd.M0(2131742799, null));
        r6.Z(this.m0, k6.f28290z6, this.resourceProvider);
        this.f14441j0.addView(this.m0, mf.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        o2 o2Var = new o2(6, getParentActivity(), this);
        this.f14444n0 = o2Var;
        frameLayout2.addView(o2Var);
        boolean z11 = this.f14440i0;
        if (z11) {
            gi.d dVar = new gi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f14445o0 = dVar;
            dVar.f();
            this.f14445o0.i(bd.M0(2131744040, null), false, true);
            this.f14445o0.setOnClickListener(new View.OnClickListener(this) {
                public final g f14424b;

                {
                    this.f14424b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i12 = r2;
                    g gVar = this.f14424b;
                    switch (i12) {
                        case 0:
                            sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                            return;
                        case 1:
                            sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                            return;
                        default:
                            gVar.presentFragment(new v(1, gVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.f14444n0.addView(this.f14445o0, mf.e(-1, 48, 119));
        }
        s51 s51Var = new s51(5, getParentActivity(), this);
        this.f14446p0 = s51Var;
        frameLayout2.addView(s51Var);
        gi.d dVar2 = new gi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f14447q0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(2131231977, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) bd.M0(2131744053, null));
        this.f14447q0.i(spannableStringBuilder, false, true);
        this.f14447q0.setOnClickListener(new View.OnClickListener(this) {
            public final g f14424b;

            {
                this.f14424b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r2;
                g gVar = this.f14424b;
                switch (i12) {
                    case 0:
                        sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                        return;
                    case 1:
                        sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                        return;
                    default:
                        gVar.presentFragment(new v(1, gVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (z11) {
            this.f14446p0.addView(this.f14447q0, mf.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        gi.d dVar3 = new gi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f14448r0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(2131231973, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) bd.M0(2131744054, null));
        this.f14448r0.i(spannableStringBuilder2, false, true);
        this.f14448r0.setOnClickListener(new View.OnClickListener(this) {
            public final g f14424b;

            {
                this.f14424b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i12 = r2;
                g gVar = this.f14424b;
                switch (i12) {
                    case 0:
                        sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                        return;
                    case 1:
                        sf.c.v(gVar.getParentActivity(), bd.M0(2131744038, null), false);
                        return;
                    default:
                        gVar.presentFragment(new v(1, gVar.getUserConfig().e()));
                        return;
                }
            }
        });
        this.f14446p0.addView(this.f14448r0, mf.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f14441j0.addView(frameLayout2, mf.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.f14444n0.animate().cancel();
        this.f14446p0.animate().cancel();
        s51 s51Var2 = this.f14446p0;
        if (this.f14450t0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        s51Var2.setAlpha(f10);
        o2 o2Var2 = this.f14444n0;
        if (!this.f14450t0) {
            f11 = 1.0f;
        }
        o2Var2.setAlpha(f11);
        s51 s51Var3 = this.f14446p0;
        if (this.f14450t0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        s51Var3.setVisibility(i3);
        o2 o2Var3 = this.f14444n0;
        if (!this.f14450t0) {
            i11 = 0;
        }
        o2Var3.setVisibility(i11);
        F0();
        f6 f6Var = this.f14451u0;
        if (f6Var != null) {
            f6Var.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23322v3) {
            u0();
            f6 f6Var = this.f14451u0;
            if (f6Var != null) {
                f6Var.O(true);
            }
            h0();
        } else if (i3 == hs.f23350z3) {
            e9 y9 = e9.y(this.currentAccount, true);
            if (this.f14449s0 != y9.N(0)) {
                this.f14449s0 = y9.N(0);
                u0();
                f6 f6Var2 = this.f14451u0;
                if (f6Var2 != null) {
                    f6Var2.O(false);
                }
                h0();
            }
        } else if (i3 == hs.A3) {
            f6 f6Var3 = this.f14451u0;
            if (f6Var3 != null) {
                f6Var3.O(true);
            }
        } else if (i3 == hs.f23343y3) {
            F0();
        } else if (i3 == hs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return k6.x0(null, k6.f27971i5, false);
    }

    @Override
    public final void h0() {
        gt0 gt0Var;
        super.h0();
        if (this.f14437f0 && (gt0Var = this.V) != null && this.f14433b0 != -1) {
            gt0Var.a();
        }
        this.f14437f0 = false;
    }

    @Override
    public final void i0() {
        this.f47068s.addView(this.V, mf.c(-1.0f, -1));
        this.V.u(this.f47063c, new a(this, 3));
        gt0 gt0Var = this.V;
        vb vbVar = this.U;
        n61 viewPager = vbVar.getViewPager();
        vb vbVar2 = this.U;
        Objects.requireNonNull(vbVar2);
        gt0Var.x(vbVar, viewPager, new y8(vbVar2, 12));
        this.V.y(this.U.getTabsContainer());
        this.U.getTabsContainer().setLayoutParams(mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        gt0 gt0Var = this.V;
        if (gt0Var == null || motionEvent == null || gt0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.V.c() || this.U.getViewPager().f36384b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final h0 k0() {
        f6 f6Var = new f6(this, this.f47063c, getParentActivity(), this.currentAccount, this.classGuid, new gi.q4(this, 4), getResourceProvider(), 3);
        this.f14451u0 = f6Var;
        f6Var.f33698r = false;
        return f6Var;
    }

    @Override
    public final b0 l0(Context context) {
        gt0 gt0Var = this.V;
        gt0Var.getClass();
        return new f0(5, gt0Var, false);
    }

    @Override
    public final t1 m0() {
        return new bb(getParentActivity(), 75, 1, 1);
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
        hs.f(this.currentAccount).c(this, hs.f23322v3);
        hs.f(this.currentAccount).c(this, hs.f23343y3);
        hs.f(this.currentAccount).c(this, hs.f23350z3);
        hs.f(this.currentAccount).c(this, hs.A3);
        hs.f(this.currentAccount).c(this, hs.C3);
        e9.y(this.currentAccount, true).S(true);
        e9.y(this.currentAccount, true).R();
        e9.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        tj0 tj0Var = this.f47063c;
        if (tj0Var != null) {
            tj0Var.removeCallbacks(this.f14438g0);
        }
        hs.f(this.currentAccount).n(this, hs.f23322v3);
        hs.f(this.currentAccount).n(this, hs.f23343y3);
        hs.f(this.currentAccount).n(this, hs.f23350z3);
        hs.f(this.currentAccount).n(this, hs.A3);
        hs.f(this.currentAccount).n(this, hs.C3);
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f14436e0 = true;
        this.f14434c0 = i10;
        this.f14435d0 = i12;
        D0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        u6 u6Var = this.T;
        if (u6Var != null) {
            u6Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        u6 u6Var = this.T;
        if (u6Var != null) {
            u6Var.setPaused(false);
        }
    }

    @Override
    public final float q0() {
        tj0 tj0Var = this.f47063c;
        if (tj0Var == null) {
            return 0.0f;
        }
        return tj0Var.getY();
    }

    @Override
    public final View r0() {
        return this.V;
    }

    @Override
    public final void s0(boolean z10) {
        qe.a aVar = this.f14432a0;
        if (aVar != null && aVar.f53841f != z10) {
            aVar.a(z10, true);
        }
    }

    @Override
    public final void t0(float f10) {
        u6 u6Var = this.T;
        if (u6Var != null) {
            u6Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override
    public final void u0() {
        boolean z10;
        super.u0();
        gt0 gt0Var = this.V;
        if (gt0Var != null && gt0Var.f34196f0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14437f0 = z10;
        tj0 tj0Var = this.f47063c;
        if (tj0Var != null && this.Q >= 0) {
            this.R -= tj0Var.getPaddingTop();
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
