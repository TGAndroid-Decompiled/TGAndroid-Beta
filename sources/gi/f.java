package gi;

import aa.n;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.cd;
import bi.dd;
import bi.e5;
import bi.ea;
import bi.ec;
import bi.g;
import bi.gc;
import bi.hc;
import bi.n0;
import bi.pa;
import bi.z;
import c8.ha;
import fi.h9;
import hi.q3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
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
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.w6;
import org.telegram.ui.c61;
import org.telegram.ui.l00;
import org.telegram.ui.n00;
import org.telegram.ui.o00;
import ug.q1;
import v4.b0;
import wg.f1;
public final class f extends o00 implements ls {
    public FrameLayout R;
    public w6 S;
    public cd T;
    public ht0 U;
    public ec V;
    public View W;
    public te.a X;
    public te.a Y;
    public te.a Z;
    public int f13985b0;
    public int f13986c0;
    public boolean f13987d0;
    public boolean f13988e0;
    public ec f13990g0;
    public final boolean f13991h0;
    public LinearLayout f13992i0;
    public SpannableStringBuilder f13993j0;
    public j6 f13994k0;
    public j6 f13995l0;
    public e5 m0;
    public fi.d f13996n0;
    public c61 f13997o0;
    public fi.d f13998p0;
    public fi.d f13999q0;
    public boolean f14000r0;
    public boolean f14001s0;
    public hc f14002t0;
    public int f13984a0 = -1;
    public final h9 f13989f0 = new h9(this, 8);

    public f() {
        boolean z9;
        t0.u();
        if (!r2.a()) {
            t0.r();
            z9 = false;
        } else {
            z9 = true;
        }
        this.f13991h0 = z9;
        this.M = true;
    }

    public static void A0(f fVar, int i7) {
        r31 G;
        hc hcVar = fVar.f14002t0;
        if (hcVar != null && (G = hcVar.G(i7)) != null) {
            int i10 = G.d;
            if (i10 == -1) {
                fVar.f14002t0.O(true);
            } else if (i10 == -2) {
                ea.y(fVar.currentAccount, true).u();
                f1.l1(1, v1.a(fVar.currentAccount).b());
            } else if (i10 == -3) {
                ea.y(fVar.currentAccount, true).V();
                fVar.f14002t0.O(true);
            } else if (i10 == -4) {
                if (qp.s1(fVar.currentAccount).v2()) {
                    org.telegram.ui.b.b(fVar.currentAccount);
                } else {
                    fVar.presentFragment(new q3(fVar.getUserConfig().e()));
                }
            }
        }
    }

    public final void D0() {
        G0();
        pj0 pj0Var = this.f48165c;
        if (pj0Var != null && this.U != null && pj0Var.getLayoutParams() != null) {
            int C = q.C(48.0f, this.f13985b0, -g0.L(8.0f));
            int C2 = q.C(48.0f, this.f13986c0, -g0.L(8.0f));
            g0.B3(this.f48165c, 0, C, 0, C2);
            pj0 pj0Var2 = this.f48165c;
            int i7 = -C;
            pj0Var2.setPadding(pj0Var2.getPaddingLeft(), i7, this.f48165c.getPaddingRight(), this.f13986c0 - C2);
            this.U.z(i7, -C2);
        }
    }

    public final void E0(ArrayList arrayList, f41 f41Var) {
        boolean z9;
        pj0 pj0Var;
        ht0 ht0Var = this.U;
        if (ht0Var != null && ht0Var.f34422e0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13984a0 = -1;
        if (getParentActivity() != null) {
            ea y10 = ea.y(this.currentAccount, true);
            r31 r31Var = new r31(-2);
            r31Var.f37591c = (l00) super.o0(getParentActivity());
            arrayList.add(r31Var);
            arrayList.add(r31.k(this.f13992i0));
            boolean z10 = this.f13991h0;
            if (z10) {
                arrayList.add(r31.C(hd.M0(2131749513, null)));
            }
            boolean N = y10.N(0);
            this.f14000r0 = N;
            if (N) {
                if (!z10) {
                    arrayList.add(r31.C(null));
                }
                this.f13984a0 = arrayList.size();
                arrayList.add(r31.n(this.V, -2));
                if (z9 && (pj0Var = this.f48165c) != null) {
                    h9 h9Var = this.f13989f0;
                    pj0Var.removeCallbacks(h9Var);
                    this.f48165c.post(h9Var);
                    return;
                }
                return;
            }
            arrayList.add(r31.m(this.f13990g0));
        }
    }

    public final void F0() {
        int i7;
        final boolean z9;
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        ea y10 = ea.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().f24927x7.f24438l.f14323b).f23003a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f13993j0);
        spannableStringBuilder.append((CharSequence) dd.M0(p10, 0.66f, ' '));
        this.f13994k0.setText(spannableStringBuilder);
        if (((int) ((p10.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.f13995l0.setText("≈" + r1.i().f(i7, "USD"));
        } else {
            this.f13995l0.setText(hd.M0(2131742790, null));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = n0.g(this.currentAccount).j(getUserConfig().e(), true);
        if (j3 != null && (tL_starsRevenueStatus = j3.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f14001s0 == z9) {
            return;
        }
        this.f14001s0 = z9;
        this.m0.setVisibility(0);
        this.f13997o0.setVisibility(0);
        ViewPropertyAnimator animate = this.m0.animate();
        float f11 = 1.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).withEndAction(new Runnable(this) {
            public final f f13980b;

            {
                this.f13980b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z9) {
                            this.f13980b.m0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z9) {
                            this.f13980b.f13997o0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f13997o0.animate();
        if (!z9) {
            f11 = 0.0f;
        }
        animate2.alpha(f11).withEndAction(new Runnable(this) {
            public final f f13980b;

            {
                this.f13980b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z9) {
                            this.f13980b.m0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z9) {
                            this.f13980b.f13997o0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
    }

    public final void G0() {
        if (this.W == null) {
            return;
        }
        int L = g0.L(44.0f) + k.getCurrentActionBarHeight() + this.f13985b0;
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.W.setLayoutParams(layoutParams);
        }
        H0();
    }

    public final void H0() {
        float f10;
        View view = this.W;
        if (view == null) {
            return;
        }
        te.a aVar = this.X;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f55370e;
        }
        te.a aVar2 = this.Y;
        if (aVar2 != null) {
            f11 = aVar2.f55370e;
        }
        view.setTranslationY(((-(1.0f - f10)) * k.getCurrentActionBarHeight()) - ((1.0f - f11) * g0.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z9;
        float f10;
        int i7;
        int i10;
        this.G = false;
        this.E = g0.L(238.0f);
        ht0 ht0Var = new ht0(context);
        this.U = ht0Var;
        ht0Var.setCommonInsetsManagedExternally(true);
        if (!this.f13987d0) {
            q4 q4Var = this.parentLayout;
            if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
                i10 = 0;
            } else {
                i10 = g0.f22531m;
            }
            this.f13985b0 = i10;
            this.f13986c0 = g0.f22532n;
        }
        this.U.setGeometry(new n(this, 29));
        this.U.z(-q.C(48.0f, this.f13985b0, -g0.L(8.0f)), -q.C(48.0f, this.f13986c0, -g0.L(8.0f)));
        ht0 ht0Var2 = this.U;
        ht0Var2.getClass();
        this.V = new ec(25, context, ht0Var2);
        this.T = new cd(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.f13990g0 = new ec(3, context, this);
        super.createView(context);
        n00 n00Var = this.f48170s;
        getBaseSimpleGlass().f(n00Var, this.f48165c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f21027n = this.U;
        this.f48165c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f21028o = new g(2, this, new bi.f(2, n00Var));
        FrameLayout tabsContainer = this.T.getTabsContainer();
        View view = new View(getParentActivity());
        this.W = view;
        float f11 = 0.0f;
        view.setAlpha(0.0f);
        ht0 ht0Var3 = this.U;
        ht0Var3.addView(this.W, ht0Var3.indexOfChild(tabsContainer), ha.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        a aVar = new a(this, 0);
        xq xqVar = xq.h;
        te.a aVar2 = new te.a(0, aVar, xqVar, 380L, false);
        this.X = aVar2;
        this.Y = new te.a(1, new a(this, 1), xqVar, 380L, false);
        this.Z = new te.a(2, new a(this, 2), xqVar, 380L, false);
        if (!this.f48165c.canScrollVertically(-1) && !this.simpleActionBar.s()) {
            z9 = false;
        } else {
            z9 = true;
        }
        aVar2.a(z9, false);
        this.Y.a(this.U.f34422e0, false);
        this.f48165c.j(new ai.b(this, 13));
        G0();
        fh.g c10 = getBaseSimpleGlass().f21018c.c(tabsContainer, null, false);
        c10.p(c8.g0.m(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        q4 q4Var2 = this.parentLayout;
        if (q4Var2 != null && ((ActionBarLayout) q4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        w6 w6Var = new w6(170, context, false);
        this.S = w6Var;
        w6Var.setStarParticlesView(this.f48166e);
        this.R.addView(this.S, ha.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(hd.M0(2131749511, null), g0.H2(g0.U2(hd.M0(2131749512, null), new pa(context, 7)), true), this.R, null);
        this.f48165c.setOverScrollMode(2);
        v4.k kVar = new v4.k();
        kVar.f56954m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        this.f48165c.setItemAnimator(kVar);
        this.f48165c.setOnItemClickListener(new ai.k(this, 11));
        this.f48170s.addView(new jz(getParentActivity()), ha.c(-1.0f, -1));
        ea.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f13992i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f13992i0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        j6 j6Var = new j6(getParentActivity(), false, true, false);
        this.f13994k0 = j6Var;
        j6Var.setTypeface(g0.o());
        this.f13994k0.setTextSize(g0.L(32.0f));
        this.f13994k0.setGravity(17);
        r6.Z(this.f13994k0, k6.G6, this.resourceProvider);
        this.f13993j0 = new SpannableStringBuilder("S");
        wp wpVar = new wp(2131231957, 0);
        wpVar.d = false;
        wpVar.H = 0.5f;
        wpVar.I = 0.5f;
        wpVar.f40055r = -g0.L(3.0f);
        wpVar.f40056s = 0.0f;
        this.f13993j0.setSpan(wpVar, 0, 1, 33);
        this.f13992i0.addView(this.f13994k0, ha.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        j6 j6Var2 = new j6(getParentActivity(), false, false, false);
        this.f13995l0 = j6Var2;
        j6Var2.setTextSize(g0.L(14.0f));
        this.f13995l0.setGravity(17);
        this.f13995l0.setText(hd.M0(2131742790, null));
        r6.Z(this.f13995l0, k6.f28258z6, this.resourceProvider);
        this.f13992i0.addView(this.f13995l0, ha.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        e5 e5Var = new e5(5, getParentActivity(), this);
        this.m0 = e5Var;
        frameLayout2.addView(e5Var);
        boolean z10 = this.f13991h0;
        if (z10) {
            fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f13996n0 = dVar;
            dVar.f();
            this.f13996n0.i(hd.M0(2131744031, null), false, true);
            this.f13996n0.setOnClickListener(new View.OnClickListener(this) {
                public final f f13978b;

                {
                    this.f13978b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i11 = r2;
                    f fVar = this.f13978b;
                    switch (i11) {
                        case 0:
                            vf.c.v(fVar.getParentActivity(), hd.M0(2131744029, null), false);
                            return;
                        case 1:
                            vf.c.v(fVar.getParentActivity(), hd.M0(2131744029, null), false);
                            return;
                        default:
                            fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.m0.addView(this.f13996n0, ha.e(-1, 48, 119));
        }
        c61 c61Var = new c61(4, getParentActivity(), this);
        this.f13997o0 = c61Var;
        frameLayout2.addView(c61Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f13998p0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(2131231977, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) hd.M0(2131744044, null));
        this.f13998p0.i(spannableStringBuilder, false, true);
        this.f13998p0.setOnClickListener(new View.OnClickListener(this) {
            public final f f13978b;

            {
                this.f13978b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i11 = r2;
                f fVar = this.f13978b;
                switch (i11) {
                    case 0:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744029, null), false);
                        return;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744029, null), false);
                        return;
                    default:
                        fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (z10) {
            this.f13997o0.addView(this.f13998p0, ha.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        fi.d dVar3 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f13999q0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(2131231973, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) hd.M0(2131744045, null));
        this.f13999q0.i(spannableStringBuilder2, false, true);
        this.f13999q0.setOnClickListener(new View.OnClickListener(this) {
            public final f f13978b;

            {
                this.f13978b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i11 = r2;
                f fVar = this.f13978b;
                switch (i11) {
                    case 0:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744029, null), false);
                        return;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), hd.M0(2131744029, null), false);
                        return;
                    default:
                        fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                        return;
                }
            }
        });
        this.f13997o0.addView(this.f13999q0, ha.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f13992i0.addView(frameLayout2, ha.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.m0.animate().cancel();
        this.f13997o0.animate().cancel();
        c61 c61Var2 = this.f13997o0;
        if (this.f14001s0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        c61Var2.setAlpha(f10);
        e5 e5Var2 = this.m0;
        if (!this.f14001s0) {
            f11 = 1.0f;
        }
        e5Var2.setAlpha(f11);
        c61 c61Var3 = this.f13997o0;
        int i11 = 8;
        if (this.f14001s0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        c61Var3.setVisibility(i7);
        e5 e5Var3 = this.m0;
        if (!this.f14001s0) {
            i11 = 0;
        }
        e5Var3.setVisibility(i11);
        F0();
        hc hcVar = this.f14002t0;
        if (hcVar != null) {
            hcVar.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25076v3) {
            u0();
            hc hcVar = this.f14002t0;
            if (hcVar != null) {
                hcVar.O(true);
            }
            h0();
        } else if (i7 == qs.f25104z3) {
            ea y10 = ea.y(this.currentAccount, true);
            if (this.f14000r0 != y10.N(0)) {
                this.f14000r0 = y10.N(0);
                u0();
                hc hcVar2 = this.f14002t0;
                if (hcVar2 != null) {
                    hcVar2.O(false);
                }
                h0();
            }
        } else if (i7 == qs.A3) {
            hc hcVar3 = this.f14002t0;
            if (hcVar3 != null) {
                hcVar3.O(true);
            }
        } else if (i7 == qs.f25097y3) {
            F0();
        } else if (i7 == qs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return k6.x0(null, k6.f27939i5, false);
    }

    @Override
    public final void h0() {
        ht0 ht0Var;
        super.h0();
        if (this.f13988e0 && (ht0Var = this.U) != null && this.f13984a0 != -1) {
            ht0Var.a();
        }
        this.f13988e0 = false;
    }

    @Override
    public final void i0() {
        this.f48170s.addView(this.U, ha.c(-1.0f, -1));
        this.U.u(this.f48165c, new a(this, 3));
        ht0 ht0Var = this.U;
        cd cdVar = this.T;
        p61 viewPager = cdVar.getViewPager();
        cd cdVar2 = this.T;
        Objects.requireNonNull(cdVar2);
        ht0Var.x(cdVar, viewPager, new di.q4(cdVar2, 17));
        this.U.y(this.T.getTabsContainer());
        this.T.getTabsContainer().setLayoutParams(ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        ht0 ht0Var = this.U;
        if (ht0Var == null || motionEvent == null || ht0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.getViewPager().f36904b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final v4.g0 k0() {
        hc hcVar = new hc(this, this.f48165c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 24), getResourceProvider(), 2);
        this.f14002t0 = hcVar;
        hcVar.f33473r = false;
        return hcVar;
    }

    @Override
    public final b0 l0(Context context) {
        ht0 ht0Var = this.U;
        ht0Var.getClass();
        return new jg.i0(5, ht0Var, false);
    }

    @Override
    public final q1 m0() {
        return new gc(getParentActivity(), 75, 1, 1);
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
        qs.f(this.currentAccount).c(this, qs.f25076v3);
        qs.f(this.currentAccount).c(this, qs.f25097y3);
        qs.f(this.currentAccount).c(this, qs.f25104z3);
        qs.f(this.currentAccount).c(this, qs.A3);
        qs.f(this.currentAccount).c(this, qs.C3);
        ea.y(this.currentAccount, true).S(true);
        ea.y(this.currentAccount, true).R();
        ea.y(this.currentAccount, true).z();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        pj0 pj0Var = this.f48165c;
        if (pj0Var != null) {
            pj0Var.removeCallbacks(this.f13989f0);
        }
        qs.f(this.currentAccount).n(this, qs.f25076v3);
        qs.f(this.currentAccount).n(this, qs.f25097y3);
        qs.f(this.currentAccount).n(this, qs.f25104z3);
        qs.f(this.currentAccount).n(this, qs.A3);
        qs.f(this.currentAccount).n(this, qs.C3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f13987d0 = true;
        this.f13985b0 = i10;
        this.f13986c0 = i12;
        D0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        w6 w6Var = this.S;
        if (w6Var != null) {
            w6Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        w6 w6Var = this.S;
        if (w6Var != null) {
            w6Var.setPaused(false);
        }
    }

    @Override
    public final float q0() {
        pj0 pj0Var = this.f48165c;
        if (pj0Var == null) {
            return 0.0f;
        }
        return pj0Var.getY();
    }

    @Override
    public final View r0() {
        return this.U;
    }

    @Override
    public final void s0(boolean z9) {
        te.a aVar = this.Z;
        if (aVar != null && aVar.f55371f != z9) {
            aVar.a(z9, true);
        }
    }

    @Override
    public final void t0(float f10) {
        w6 w6Var = this.S;
        if (w6Var != null) {
            w6Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override
    public final void u0() {
        boolean z9;
        super.u0();
        ht0 ht0Var = this.U;
        if (ht0Var != null && ht0Var.f34422e0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13988e0 = z9;
        pj0 pj0Var = this.f48165c;
        if (pj0Var != null && this.P >= 0) {
            this.Q -= pj0Var.getPaddingTop();
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
