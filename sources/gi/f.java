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
import fi.v9;
import hi.q3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.i0;
import org.telegram.messenger.id;
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
import org.telegram.ui.ActionBar.l;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.e61;
import org.telegram.ui.o00;
import org.telegram.ui.q00;
import org.telegram.ui.r00;
import ug.q1;
import v4.b0;
import v4.k;
import wg.f1;
public final class f extends r00 implements ls {
    public FrameLayout R;
    public x6 S;
    public cd T;
    public it0 U;
    public ec V;
    public View W;
    public te.a X;
    public te.a Y;
    public te.a Z;
    public int f13987b0;
    public int f13988c0;
    public boolean f13989d0;
    public boolean f13990e0;
    public ec f13992g0;
    public final boolean f13993h0;
    public LinearLayout f13994i0;
    public SpannableStringBuilder f13995j0;
    public i6 f13996k0;
    public i6 f13997l0;
    public e5 m0;
    public fi.d f13998n0;
    public e61 f13999o0;
    public fi.d f14000p0;
    public fi.d f14001q0;
    public boolean f14002r0;
    public boolean f14003s0;
    public hc f14004t0;
    public int f13986a0 = -1;
    public final v9 f13991f0 = new v9(this, 7);

    public f() {
        boolean z9;
        t0.u();
        if (!r2.a()) {
            t0.r();
            z9 = false;
        } else {
            z9 = true;
        }
        this.f13993h0 = z9;
        this.M = true;
    }

    public static void A0(f fVar, int i7) {
        x31 G;
        hc hcVar = fVar.f14004t0;
        if (hcVar != null && (G = hcVar.G(i7)) != null) {
            int i10 = G.d;
            if (i10 == -1) {
                fVar.f14004t0.O(true);
            } else if (i10 == -2) {
                ea.y(fVar.currentAccount, true).u();
                f1.l1(1, v1.a(fVar.currentAccount).b());
            } else if (i10 == -3) {
                ea.y(fVar.currentAccount, true).V();
                fVar.f14004t0.O(true);
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
        pj0 pj0Var = this.f49189c;
        if (pj0Var != null && this.U != null && pj0Var.getLayoutParams() != null) {
            int C = q.C(48.0f, this.f13987b0, -g0.L(8.0f));
            int C2 = q.C(48.0f, this.f13988c0, -g0.L(8.0f));
            g0.B3(this.f49189c, 0, C, 0, C2);
            pj0 pj0Var2 = this.f49189c;
            int i7 = -C;
            pj0Var2.setPadding(pj0Var2.getPaddingLeft(), i7, this.f49189c.getPaddingRight(), this.f13988c0 - C2);
            this.U.z(i7, -C2);
        }
    }

    public final void E0(ArrayList arrayList, m41 m41Var) {
        boolean z9;
        pj0 pj0Var;
        it0 it0Var = this.U;
        if (it0Var != null && it0Var.f34746e0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13986a0 = -1;
        if (getParentActivity() != null) {
            ea y10 = ea.y(this.currentAccount, true);
            x31 x31Var = new x31(-2);
            x31Var.f40149c = (o00) super.o0(getParentActivity());
            arrayList.add(x31Var);
            arrayList.add(x31.k(this.f13994i0));
            boolean z10 = this.f13993h0;
            if (z10) {
                arrayList.add(x31.C(id.M0(2131749514, null)));
            }
            boolean N = y10.N(0);
            this.f14002r0 = N;
            if (N) {
                if (!z10) {
                    arrayList.add(x31.C(null));
                }
                this.f13986a0 = arrayList.size();
                arrayList.add(x31.n(this.V, -2));
                if (z9 && (pj0Var = this.f49189c) != null) {
                    v9 v9Var = this.f13991f0;
                    pj0Var.removeCallbacks(v9Var);
                    this.f49189c.post(v9Var);
                    return;
                }
                return;
            }
            arrayList.add(x31.m(this.f13992g0));
        }
    }

    public final void F0() {
        int i7;
        final boolean z9;
        float f10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        ea y10 = ea.y(this.currentAccount, true);
        double d = ((i0) getMessagesController().f24946x7.f24453l.f14325b).f23005a;
        TL_stars.StarsAmount p10 = y10.p();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f13995j0);
        spannableStringBuilder.append((CharSequence) dd.M0(p10, 0.66f, ' '));
        this.f13996k0.setText(spannableStringBuilder);
        if (((int) ((p10.amount / 1.0E9d) * d * 100.0d)) > 0) {
            this.f13997l0.setText("≈" + r1.i().f(i7, "USD"));
        } else {
            this.f13997l0.setText(id.M0(2131742789, null));
        }
        TLRPC.TL_payments_starsRevenueStats j3 = n0.g(this.currentAccount).j(getUserConfig().e(), true);
        if (j3 != null && (tL_starsRevenueStatus = j3.status) != null && tL_starsRevenueStatus.overall_revenue.positive()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f14003s0 == z9) {
            return;
        }
        this.f14003s0 = z9;
        this.m0.setVisibility(0);
        this.f13999o0.setVisibility(0);
        ViewPropertyAnimator animate = this.m0.animate();
        float f11 = 1.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).withEndAction(new Runnable(this) {
            public final f f13982b;

            {
                this.f13982b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z9) {
                            this.f13982b.m0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z9) {
                            this.f13982b.f13999o0.setVisibility(8);
                            return;
                        }
                        return;
                }
            }
        }).start();
        ViewPropertyAnimator animate2 = this.f13999o0.animate();
        if (!z9) {
            f11 = 0.0f;
        }
        animate2.alpha(f11).withEndAction(new Runnable(this) {
            public final f f13982b;

            {
                this.f13982b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        if (z9) {
                            this.f13982b.m0.setVisibility(8);
                            return;
                        }
                        return;
                    default:
                        if (!z9) {
                            this.f13982b.f13999o0.setVisibility(8);
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
        int L = g0.L(44.0f) + l.getCurrentActionBarHeight() + this.f13987b0;
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
            f10 = aVar.f55498e;
        }
        te.a aVar2 = this.Y;
        if (aVar2 != null) {
            f11 = aVar2.f55498e;
        }
        view.setTranslationY(((-(1.0f - f10)) * l.getCurrentActionBarHeight()) - ((1.0f - f11) * g0.L(44.0f)));
    }

    @Override
    public final View createView(Context context) {
        boolean z9;
        float f10;
        int i7;
        int i10;
        this.G = false;
        this.E = g0.L(238.0f);
        it0 it0Var = new it0(context);
        this.U = it0Var;
        it0Var.setCommonInsetsManagedExternally(true);
        if (!this.f13989d0) {
            r4 r4Var = this.parentLayout;
            if (r4Var != null && ((ActionBarLayout) r4Var).S0) {
                i10 = 0;
            } else {
                i10 = g0.f22561m;
            }
            this.f13987b0 = i10;
            this.f13988c0 = g0.f22562n;
        }
        this.U.setGeometry(new n(this, 29));
        this.U.z(-q.C(48.0f, this.f13987b0, -g0.L(8.0f)), -q.C(48.0f, this.f13988c0, -g0.L(8.0f)));
        it0 it0Var2 = this.U;
        it0Var2.getClass();
        this.V = new ec(25, context, it0Var2);
        this.T = new cd(context, this.currentAccount, true, 0L, getClassGuid(), getResourceProvider(), this.U);
        this.f13992g0 = new ec(3, context, this);
        super.createView(context);
        q00 q00Var = this.f49194s;
        getBaseSimpleGlass().f(q00Var, this.f49189c, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.D.bringToFront();
        this.simpleActionBar.bringToFront();
        getBaseSimpleGlass().f21035n = this.U;
        this.f49189c.setCaptureSectionsDecoratorAllowed(true);
        this.T.setGlassEngine(this.glassEngine);
        getBaseSimpleGlass().f21036o = new g(2, this, new bi.f(2, q00Var));
        FrameLayout tabsContainer = this.T.getTabsContainer();
        View view = new View(getParentActivity());
        this.W = view;
        float f11 = 0.0f;
        view.setAlpha(0.0f);
        it0 it0Var3 = this.U;
        it0Var3.addView(this.W, it0Var3.indexOfChild(tabsContainer), ha.e(-1, 0, 48));
        this.W.setBackground(getBaseSimpleGlass().a(this.W));
        a aVar = new a(this, 0);
        wq wqVar = wq.h;
        te.a aVar2 = new te.a(0, aVar, wqVar, 380L, false);
        this.X = aVar2;
        this.Y = new te.a(1, new a(this, 1), wqVar, 380L, false);
        this.Z = new te.a(2, new a(this, 2), wqVar, 380L, false);
        if (!this.f49189c.canScrollVertically(-1) && !this.simpleActionBar.u()) {
            z9 = false;
        } else {
            z9 = true;
        }
        aVar2.a(z9, false);
        this.Y.a(this.U.f34746e0, false);
        this.f49189c.j(new ai.b(this, 13));
        G0();
        fh.g c10 = getBaseSimpleGlass().f21026c.c(tabsContainer, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(g0.L(9.66f));
        c10.r(g0.L(18.0f));
        tabsContainer.setBackground(c10);
        r4 r4Var2 = this.parentLayout;
        if (r4Var2 != null && ((ActionBarLayout) r4Var2).T0) {
            this.simpleActionBar.setBackButtonImage(2131231241);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.R = frameLayout;
        frameLayout.setClickable(true);
        x6 x6Var = new x6(170, context, false);
        this.S = x6Var;
        x6Var.setStarParticlesView(this.f49190e);
        this.R.addView(this.S, ha.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 12.0f));
        j0(id.M0(2131749512, null), g0.H2(g0.U2(id.M0(2131749513, null), new pa(context, 7)), true), this.R, null);
        this.f49189c.setOverScrollMode(2);
        k kVar = new k();
        kVar.f57079m = false;
        kVar.C = false;
        kVar.o(wqVar);
        kVar.n(350L);
        this.f49189c.setItemAnimator(kVar);
        this.f49189c.setOnItemClickListener(new ai.k(this, 11));
        this.f49194s.addView(new jz(getParentActivity()), ha.c(-1.0f, -1));
        ea.y(this.currentAccount, true);
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f13994i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f13994i0.setPadding(0, g0.L(20.0f), 0, g0.L(10.0f));
        i6 i6Var = new i6(getParentActivity(), false, true, false);
        this.f13996k0 = i6Var;
        i6Var.setTypeface(g0.o());
        this.f13996k0.setTextSize(g0.L(32.0f));
        this.f13996k0.setGravity(17);
        t6.Y(this.f13996k0, m6.G6, this.resourceProvider);
        this.f13995j0 = new SpannableStringBuilder("S");
        wp wpVar = new wp(2131231957, 0);
        wpVar.d = false;
        wpVar.H = 0.5f;
        wpVar.I = 0.5f;
        wpVar.f40038r = -g0.L(3.0f);
        wpVar.f40039s = 0.0f;
        this.f13995j0.setSpan(wpVar, 0, 1, 33);
        this.f13994i0.addView(this.f13996k0, ha.d(-1, 40.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
        i6 i6Var2 = new i6(getParentActivity(), false, false, false);
        this.f13997l0 = i6Var2;
        i6Var2.setTextSize(g0.L(14.0f));
        this.f13997l0.setGravity(17);
        this.f13997l0.setText(id.M0(2131742789, null));
        t6.Y(this.f13997l0, m6.f28300z6, this.resourceProvider);
        this.f13994i0.addView(this.f13997l0, ha.d(-1, 20.0f, 17, 24.0f, 0.0f, 24.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
        e5 e5Var = new e5(5, getParentActivity(), this);
        this.m0 = e5Var;
        frameLayout2.addView(e5Var);
        boolean z10 = this.f13993h0;
        if (z10) {
            fi.d dVar = new fi.d(getParentActivity(), this.resourceProvider, true);
            dVar.setRoundRadius(24);
            this.f13998n0 = dVar;
            dVar.f();
            this.f13998n0.i(id.M0(2131744030, null), false, true);
            this.f13998n0.setOnClickListener(new View.OnClickListener(this) {
                public final f f13980b;

                {
                    this.f13980b = this;
                }

                @Override
                public final void onClick(View view2) {
                    int i11 = r2;
                    f fVar = this.f13980b;
                    switch (i11) {
                        case 0:
                            vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                            return;
                        case 1:
                            vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                            return;
                        default:
                            fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                            return;
                    }
                }
            });
            this.m0.addView(this.f13998n0, ha.e(-1, 48, 119));
        }
        e61 e61Var = new e61(4, getParentActivity(), this);
        this.f13999o0 = e61Var;
        frameLayout2.addView(e61Var);
        fi.d dVar2 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f14000p0 = dVar2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  ");
        spannableStringBuilder.setSpan(new wp(2131231977, 2), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) id.M0(2131744043, null));
        this.f14000p0.i(spannableStringBuilder, false, true);
        this.f14000p0.setOnClickListener(new View.OnClickListener(this) {
            public final f f13980b;

            {
                this.f13980b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i11 = r2;
                f fVar = this.f13980b;
                switch (i11) {
                    case 0:
                        vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                        return;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                        return;
                    default:
                        fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                        return;
                }
            }
        });
        if (z10) {
            this.f13999o0.addView(this.f14000p0, ha.q(-1, 48, 17.0f, 1, 0, 0, 8, 0));
        }
        fi.d dVar3 = new fi.d(getParentActivity(), this.resourceProvider, true);
        dVar3.setRoundRadius(24);
        this.f14001q0 = dVar3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x  ");
        spannableStringBuilder2.setSpan(new wp(2131231973, 2), 0, 1, 33);
        spannableStringBuilder2.append((CharSequence) id.M0(2131744044, null));
        this.f14001q0.i(spannableStringBuilder2, false, true);
        this.f14001q0.setOnClickListener(new View.OnClickListener(this) {
            public final f f13980b;

            {
                this.f13980b = this;
            }

            @Override
            public final void onClick(View view2) {
                int i11 = r2;
                f fVar = this.f13980b;
                switch (i11) {
                    case 0:
                        vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                        return;
                    case 1:
                        vf.c.v(fVar.getParentActivity(), id.M0(2131744028, null), false);
                        return;
                    default:
                        fVar.presentFragment(new z(1, fVar.getUserConfig().e()));
                        return;
                }
            }
        });
        this.f13999o0.addView(this.f14001q0, ha.q(-1, 48, 17.0f, 1, 0, 0, 0, 0));
        this.f13994i0.addView(frameLayout2, ha.d(-1, 48.0f, 17, 20.0f, 6.0f, 20.0f, 4.0f));
        this.m0.animate().cancel();
        this.f13999o0.animate().cancel();
        e61 e61Var2 = this.f13999o0;
        if (this.f14003s0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e61Var2.setAlpha(f10);
        e5 e5Var2 = this.m0;
        if (!this.f14003s0) {
            f11 = 1.0f;
        }
        e5Var2.setAlpha(f11);
        e61 e61Var3 = this.f13999o0;
        int i11 = 8;
        if (this.f14003s0) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        e61Var3.setVisibility(i7);
        e5 e5Var3 = this.m0;
        if (!this.f14003s0) {
            i11 = 0;
        }
        e5Var3.setVisibility(i11);
        F0();
        hc hcVar = this.f14004t0;
        if (hcVar != null) {
            hcVar.O(false);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25097v3) {
            u0();
            hc hcVar = this.f14004t0;
            if (hcVar != null) {
                hcVar.O(true);
            }
            h0();
        } else if (i7 == qs.f25125z3) {
            ea y10 = ea.y(this.currentAccount, true);
            if (this.f14002r0 != y10.N(0)) {
                this.f14002r0 = y10.N(0);
                u0();
                hc hcVar2 = this.f14004t0;
                if (hcVar2 != null) {
                    hcVar2.O(false);
                }
                h0();
            }
        } else if (i7 == qs.A3) {
            hc hcVar3 = this.f14004t0;
            if (hcVar3 != null) {
                hcVar3.O(true);
            }
        } else if (i7 == qs.f25118y3) {
            F0();
        } else if (i7 == qs.C3 && getUserConfig().e() == ((Long) objArr[0]).longValue()) {
            F0();
        }
    }

    @Override
    public final int getNavigationBarColor() {
        return m6.x0(null, m6.f27981i5, false);
    }

    @Override
    public final void h0() {
        it0 it0Var;
        super.h0();
        if (this.f13990e0 && (it0Var = this.U) != null && this.f13986a0 != -1) {
            it0Var.a();
        }
        this.f13990e0 = false;
    }

    @Override
    public final void i0() {
        this.f49194s.addView(this.U, ha.c(-1.0f, -1));
        this.U.u(this.f49189c, new a(this, 3));
        it0 it0Var = this.U;
        cd cdVar = this.T;
        v61 viewPager = cdVar.getViewPager();
        cd cdVar2 = this.T;
        Objects.requireNonNull(cdVar2);
        it0Var.x(cdVar, viewPager, new di.r4(cdVar2, 17));
        this.U.y(this.T.getTabsContainer());
        this.T.getTabsContainer().setLayoutParams(ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        D0();
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        it0 it0Var = this.U;
        if (it0Var == null || motionEvent == null || it0Var.j(motionEvent.getX(), motionEvent.getY()) || !this.U.c() || this.T.getViewPager().f38891b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final v4.g0 k0() {
        hc hcVar = new hc(this, this.f49189c, getParentActivity(), this.currentAccount, this.classGuid, new ai.e(this, 24), getResourceProvider(), 2);
        this.f14004t0 = hcVar;
        hcVar.f35845r = false;
        return hcVar;
    }

    @Override
    public final b0 l0(Context context) {
        it0 it0Var = this.U;
        it0Var.getClass();
        return new jg.i0(5, it0Var, false);
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
        qs.f(this.currentAccount).c(this, qs.f25097v3);
        qs.f(this.currentAccount).c(this, qs.f25118y3);
        qs.f(this.currentAccount).c(this, qs.f25125z3);
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
        pj0 pj0Var = this.f49189c;
        if (pj0Var != null) {
            pj0Var.removeCallbacks(this.f13991f0);
        }
        qs.f(this.currentAccount).n(this, qs.f25097v3);
        qs.f(this.currentAccount).n(this, qs.f25118y3);
        qs.f(this.currentAccount).n(this, qs.f25125z3);
        qs.f(this.currentAccount).n(this, qs.A3);
        qs.f(this.currentAccount).n(this, qs.C3);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f13989d0 = true;
        this.f13987b0 = i10;
        this.f13988c0 = i12;
        D0();
    }

    @Override
    public final void onPause() {
        super.onPause();
        x6 x6Var = this.S;
        if (x6Var != null) {
            x6Var.setPaused(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        x6 x6Var = this.S;
        if (x6Var != null) {
            x6Var.setPaused(false);
        }
    }

    @Override
    public final float q0() {
        pj0 pj0Var = this.f49189c;
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
        if (aVar != null && aVar.f55499f != z9) {
            aVar.a(z9, true);
        }
    }

    @Override
    public final void t0(float f10) {
        x6 x6Var = this.S;
        if (x6Var != null) {
            x6Var.setHeaderTilt(f10 * 70.0f);
        }
    }

    @Override
    public final void u0() {
        boolean z9;
        super.u0();
        it0 it0Var = this.U;
        if (it0Var != null && it0Var.f34746e0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f13990e0 = z9;
        pj0 pj0Var = this.f49189c;
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
