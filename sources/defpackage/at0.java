package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;
public final class at0 extends e implements fn7 {
    public final fj1 E;
    public final fj1 F;
    public final fj1 G;
    public final fj1 H;
    public final fj1 I;
    public final fj1 J;
    public final SpannableStringBuilder K;
    public mza L;
    public FrameLayout M;
    public FrameLayout N;
    public vic O;
    public boolean P;
    public int Q;
    public u1 R;
    public LinearLayout S;
    public RelativeSizeSpan T;
    public in U;
    public in V;
    public ws0 W;
    public boolean X;
    public boolean Y;
    public long Z;
    public final boolean a;
    public xs0 a0;
    public final long b;
    public ub b0;
    public final boolean c;
    public c51 c0;
    public f82 d;
    public final wm2[] d0;
    public q9c e;
    public u1 e0;
    public wka f;
    public RelativeSizeSpan f0;
    public in g0;
    public nf9 h;
    public in h0;
    public c51 i0;
    public double j0;
    public v21 k0;
    public SpannableStringBuilder l0;
    public SpannableStringBuilder m0;
    public int n;
    public SpannableStringBuilder n0;
    public boolean o0;
    public i1b p0;
    public i1b q0;
    public View r;
    public DecimalFormat r0;
    public fm0 s;
    public SpannableStringBuilder s0;
    public final ms0 t0;
    public final int u0;
    public TLRPC.TL_payments_starsRevenueStats w;
    public TLRPC.TL_starsRevenueStatus x;
    public i1b y;

    public at0(int i, long j) {
        super(null);
        boolean z;
        boolean z2;
        String M0;
        this.n = -1;
        this.E = fj1.a("XTR", ob6.M0(2131752942, null));
        this.F = fj1.a("XTR", ob6.M0(2131752940, null));
        this.G = fj1.a("XTR", ob6.M0(2131752939, null));
        this.H = fj1.a("TON", ob6.M0(2131753017, null));
        this.I = fj1.a("TON", ob6.M0(2131753016, null));
        this.J = fj1.a("TON", ob6.M0(2131753015, null));
        this.X = false;
        this.Y = true;
        this.d0 = new wm2[1];
        this.t0 = new ms0(this, (byte) 0);
        this.u0 = -1;
        this.a = i;
        this.b = j;
        if (j == getUserConfig().e()) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (i == 0) {
            kt0.g(this.currentAccount).r(j);
            if (!z) {
                kt0.g(this.currentAccount).l(j);
            }
        } else if (i == 1) {
            kt0 g = kt0.g(this.currentAccount);
            Long l = (Long) g.d.get(Long.valueOf(j));
            if (l != null && System.currentTimeMillis() - l.longValue() <= 30000) {
                z2 = false;
            } else {
                z2 = true;
            }
            g.j(j, z2);
        }
        if (z) {
            M0 = ob6.H(',', "SelfStarsWithdrawInfo", (int) getMessagesController().k4.y2.f());
        } else {
            M0 = ob6.M0(2131752938, null);
        }
        this.K = hl.D2(hl.N2(M0, -1, 0, new ms0(this, (byte) 2), null), true);
    }

    public static int a0(at0 at0Var) {
        return at0Var.currentAccount;
    }

    public static int b0(at0 at0Var) {
        return at0Var.currentAccount;
    }

    public static vnb c0(at0 at0Var) {
        return at0Var.resourceProvider;
    }

    public static int d0(at0 at0Var) {
        return at0Var.currentAccount;
    }

    public static int k0(at0 at0Var) {
        return at0Var.currentAccount;
    }

    public static String x0(int i) {
        int i2 = i / 86400;
        int i3 = i - (86400 * i2);
        int i4 = i3 / 3600;
        int i5 = i3 - (i4 * 3600);
        int i6 = i5 / 60;
        int i7 = i5 - (i6 * 60);
        if (i2 == 0) {
            if (i4 == 0) {
                return String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf(i6), Integer.valueOf(i7));
            }
            return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7));
        }
        Locale locale = Locale.ENGLISH;
        return ob6.a0(null, null, 2131747049, String.format(locale, "%02d", Integer.valueOf(i2)), String.format(locale, "%02d", Integer.valueOf(i4)), String.format(locale, "%02d", Integer.valueOf(i6)));
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        mza mzaVar;
        int i;
        int i2;
        View view;
        boolean z;
        View view2;
        if (!this.a && this.c) {
            this.f = null;
            this.h = null;
            frameLayout = new FrameLayout(context);
        } else {
            wka wkaVar = new wka(context);
            this.f = wkaVar;
            wkaVar.setCommonInsetsManagedExternally(true);
            this.f.setGeometry(new wz4(this));
            wka wkaVar2 = this.f;
            wkaVar2.getClass();
            this.h = new nf9((byte) 7, context, wkaVar2);
            frameLayout = this.f;
        }
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(getThemedColor(aob.a7));
        this.d = new f82(context, null, false, getResourceProvider());
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.b));
        this.d.k(X1, true);
        this.simpleActionBar.setTitle(lbc.r(X1));
        boolean z2 = this.a;
        jla jlaVar = this.simpleActionBar;
        if (!z2) {
            jlaVar.setSubtitle(ob6.M0(2131752930, null));
        } else {
            jlaVar.setSubtitle(ob6.M0(2131752929, null));
        }
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 10));
        this.simpleActionBar.setBackground(null);
        if (!this.a && this.f != null) {
            mzaVar = new mza(context, this.currentAccount, false, this.b, getClassGuid(), getResourceProvider(), this.f);
        } else {
            mzaVar = null;
        }
        this.L = mzaVar;
        if (this.a) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.M = frameLayout3;
            frameLayout3.setClipChildren(false);
            this.M.setClipToPadding(false);
            h79 h79Var = new h79(context, this.resourceProvider, this.f);
            this.O = h79Var;
            h79Var.setAdapter(new ys0(this, context, h79Var));
            FrameLayout frameLayout4 = new FrameLayout(context);
            this.N = frameLayout4;
            frameLayout4.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
            this.N.addView(h79Var.l(-2, true), tre.e(-1, 48, 48));
            this.M.addView(h79Var, tre.c(-1.0f, -1));
        } else if (mzaVar != null) {
            this.O = mzaVar.getViewPager();
            this.N = this.L.getTabsContainer();
        }
        u1 u1Var = new u1((byte) 1, context, false);
        this.R = u1Var;
        u1Var.setOrientation(1);
        u1 u1Var2 = this.R;
        int i3 = aob.d6;
        yob.h(i3, getResourceProvider(), u1Var2);
        this.R.setPadding(0, 0, 0, hl.L(17.0f));
        in inVar = new in(context, false, true, true);
        this.U = inVar;
        inVar.setTypeface(hl.o());
        in inVar2 = this.U;
        int i4 = aob.G6;
        yob.U(inVar2, i4, getResourceProvider());
        this.U.setTextSize(hl.L(32.0f));
        this.U.setGravity(17);
        this.T = new RelativeSizeSpan(0.6770833f);
        this.R.addView(this.U, tre.t(-1, 38, 49, 22, 15, 22, 0));
        in inVar3 = new in(context, true, true, true);
        this.V = inVar3;
        inVar3.setGravity(17);
        in inVar4 = this.V;
        int i5 = aob.y6;
        yob.U(inVar4, i5, getResourceProvider());
        this.V.setTextSize(hl.L(14.0f));
        this.R.addView(this.V, tre.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ws0 ws0Var = new ws0((byte) 0, context, this);
        this.W = ws0Var;
        ws0Var.setText(ob6.M0(2131752934, null));
        this.W.setLeftPadding(hl.L(36.0f));
        xs0 xs0Var = new xs0(context, (byte) 0);
        this.a0 = xs0Var;
        xs0Var.setFocusable(false);
        yob.X(this.a0, i4, getResourceProvider());
        this.a0.setCursorSize(hl.L(20.0f));
        this.a0.setCursorWidth(1.5f);
        this.a0.setBackground(null);
        this.a0.setTextSize(1, 18.0f);
        this.a0.setMaxLines(1);
        int L = hl.L(16.0f);
        this.a0.setPadding(hl.L(6.0f), L, L, L);
        this.a0.setInputType(2);
        this.a0.setTypeface(Typeface.DEFAULT);
        yob.C(this.a0, aob.lg, getResourceProvider());
        yob.y(this.a0, aob.mg, getResourceProvider());
        xs0 xs0Var2 = this.a0;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        xs0Var2.setGravity(i);
        this.a0.setOnFocusChangeListener(new ts0(this, (byte) 0));
        this.a0.addTextChangedListener(new c7(this, (byte) 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131232775);
        linearLayout.addView(imageView, tre.q(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(this.a0, tre.p(-1, -2, 1.0f, 119));
        this.W.e(this.a0);
        this.W.addView(linearLayout, tre.e(-1, -2, 48));
        this.a0.setOnEditorActionListener(new j(this, (byte) 3));
        this.R.addView(this.W, tre.t(-1, -2, 1, 18, 14, 18, 2));
        this.W.setVisibility(8);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.S = linearLayout2;
        linearLayout2.setOrientation(0);
        ub ubVar = new ub(context, true, getResourceProvider(), (byte) 3);
        ubVar.setRoundRadius(24);
        this.b0 = ubVar;
        ubVar.setEnabled(uc7.s1(this.currentAccount).k4.b3.f);
        this.b0.i(ob6.M0(2131752950, null), false, true);
        this.b0.setOnClickListener(new View.OnClickListener(this) {
            public final at0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b = r2;
                at0 at0Var = this.b;
                switch (b) {
                    case 0:
                        at0Var.z0();
                        return;
                    default:
                        at0Var.p0(view3);
                        return;
                }
            }
        });
        c51 c51Var = new c51(getResourceProvider(), context, true);
        c51Var.setRoundRadius(24);
        this.c0 = c51Var;
        c51Var.setEnabled(true);
        this.c0.i(ob6.M0(2131748128, null), false, true);
        this.c0.setOnClickListener(new t(this, context, (byte) 24));
        this.S.addView(this.b0, tre.p(-1, 48, 1.0f, 119));
        if (!this.c) {
            this.S.addView(new Space(context), tre.p(8, 48, 0.0f, 119));
            this.S.addView(this.c0, tre.p(-1, 48, 1.0f, 119));
        }
        this.R.addView(this.S, tre.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        u1 u1Var3 = new u1((byte) 2, context, false);
        this.e0 = u1Var3;
        u1Var3.setOrientation(1);
        yob.h(i3, this.resourceProvider, this.e0);
        this.e0.setPadding(0, 0, 0, hl.L(17.0f));
        in inVar5 = new in(context, false, true, true);
        this.g0 = inVar5;
        inVar5.setTypeface(hl.o());
        yob.U(this.g0, i4, this.resourceProvider);
        this.g0.setTextSize(hl.L(32.0f));
        this.g0.setGravity(17);
        this.f0 = new RelativeSizeSpan(0.6770833f);
        this.e0.addView(this.g0, tre.t(-1, 38, 49, 22, 15, 22, 0));
        in inVar6 = new in(context, true, true, true);
        this.h0 = inVar6;
        inVar6.setGravity(17);
        yob.U(this.h0, i5, this.resourceProvider);
        this.h0.setTextSize(hl.L(14.0f));
        this.e0.addView(this.h0, tre.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        c51 c51Var2 = new c51(this.resourceProvider, context, true);
        c51Var2.setRoundRadius(24);
        this.i0 = c51Var2;
        c51Var2.setEnabled(uc7.s1(this.currentAccount).k4.b3.f);
        c51 c51Var3 = this.i0;
        if (this.c) {
            i2 = 2131748129;
        } else {
            i2 = 2131748105;
        }
        c51Var3.i(ob6.M0(i2, null), false, true);
        this.i0.setVisibility(8);
        this.i0.setOnClickListener(new View.OnClickListener(this) {
            public final at0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view3) {
                byte b = r2;
                at0 at0Var = this.b;
                switch (b) {
                    case 0:
                        at0Var.z0();
                        return;
                    default:
                        at0Var.p0(view3);
                        return;
                }
            }
        });
        this.e0.addView(this.i0, tre.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        q9c q9cVar = new q9c(this, new qs0(this, (byte) 1), new ns0(this), new rm0(this, (byte) 5));
        this.e = q9cVar;
        q9cVar.s1();
        q9c q9cVar2 = this.e;
        q9cVar2.g3.r = false;
        q9cVar2.setCaptureSectionsDecoratorAllowed(true);
        this.e.setClipToPadding(false);
        this.e.setOverScrollMode(0);
        wka wkaVar3 = this.f;
        q9c q9cVar3 = this.e;
        if (wkaVar3 != null) {
            getParentActivity();
            of2 of2Var = new of2((Object) wkaVar3, (byte) 5);
            q9cVar3.f3 = of2Var;
            q9cVar3.setLayoutManager(of2Var);
            this.f.v(this.e, new ns0(this));
            if (this.a) {
                view2 = this.M;
            } else {
                view2 = this.L;
            }
            this.f.y(view2, this.O, new ns0(this));
            FrameLayout frameLayout5 = this.N;
            this.f.z(frameLayout5);
            frameLayout5.setLayoutParams(tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        } else {
            frameLayout2.addView(q9cVar3, tre.c(-1.0f, -1));
        }
        this.fragmentView = frameLayout2;
        getBaseSimpleGlass().h(frameLayout2, this.e, this.simpleActionBar, this.resourceProvider);
        this.simpleActionBar.setBackground(null);
        this.r = new View(getParentActivity());
        if (this.f != null) {
            view = this.N;
        } else {
            view = this.simpleActionBar;
        }
        frameLayout2.addView(this.r, frameLayout2.indexOfChild(view), tre.e(-1, 0, 48));
        this.r.setBackground(getBaseSimpleGlass().a(this.r));
        fm0 fm0Var = new fm0(0, new ns0(this), k43.h, 380L, false);
        this.s = fm0Var;
        wka wkaVar4 = this.f;
        if (wkaVar4 != null && wkaVar4.f0) {
            z = true;
        } else {
            z = false;
        }
        fm0Var.a(z, false);
        if (this.f != null) {
            getBaseSimpleGlass().n = this.f;
            mza mzaVar2 = this.L;
            vy4 vy4Var = this.glassEngine;
            if (mzaVar2 != null) {
                mzaVar2.setGlassEngine(vy4Var);
            } else {
                vy4Var.c(this.O);
            }
            getBaseSimpleGlass().o = new dg0(this, new kd(frameLayout2, (byte) 1), (byte) 2);
            FrameLayout frameLayout6 = this.N;
            jl0 c = getBaseSimpleGlass().c.c(frameLayout6, null, false);
            c.p(dtd.l(this.resourceProvider));
            c.q(hl.L(9.66f));
            c.r(hl.L(18.0f));
            frameLayout6.setBackground(c);
        }
        hl.B2(this.d.e);
        frameLayout2.addView(this.d.e, tre.e(42, 42, 53));
        l0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.E3 && ((Long) objArr[0]).longValue() == this.b) {
            m0();
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (hl.B(aob.w0(null, aob.d6, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        vic vicVar = this.O;
        if (vicVar != null && vicVar.canScrollHorizontally(-1)) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    public final void l0() {
        if (this.e != null) {
            int i = 0;
            hl.v3(this.d.e, 0, ((a.getCurrentActionBarHeight() - hl.L(42.0f)) / 2) + this.mSystemInsets.b, hl.L(6.0f), 0);
            q9c q9cVar = this.e;
            mq5 mq5Var = this.mSystemInsets;
            eg0.g(q9cVar, mq5Var.b, mq5Var.d, a.getCurrentActionBarHeight(), 0);
            if (this.f != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                this.f.A(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                wka wkaVar = this.f;
                wkaVar.C();
                wkaVar.requestLayout();
                wkaVar.invalidate();
            }
            if (this.r != null) {
                int currentActionBarHeight = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
                if (this.f != null) {
                    i = hl.L(44.0f);
                }
                int i2 = currentActionBarHeight + i;
                ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
                if (layoutParams.height != i2) {
                    layoutParams.height = i2;
                    this.r.setLayoutParams(layoutParams);
                }
                y0();
            }
        }
    }

    public final void m0() {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        boolean z;
        ok1 ok1Var;
        ArrayList arrayList;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        boolean z2 = false;
        TLRPC.TL_payments_starsRevenueStats h = kt0.g(this.currentAccount).h(this.b, false);
        if (h == this.w) {
            if (h == null) {
                tL_starsRevenueStatus2 = null;
            } else {
                tL_starsRevenueStatus2 = h.status;
            }
            if (tL_starsRevenueStatus2 == this.x) {
                return;
            }
        }
        this.w = h;
        if (h == null) {
            tL_starsRevenueStatus = null;
        } else {
            tL_starsRevenueStatus = h.status;
        }
        this.x = tL_starsRevenueStatus;
        if (h != null) {
            this.j0 = h.usd_rate;
            i1b f0 = w1b.f0(h.revenue_graph, ob6.M0(2131752944, null), 2, false);
            this.y = f0;
            if (f0 != null && (ok1Var = f0.d) != null && (arrayList = ok1Var.d) != null && !arrayList.isEmpty() && this.y.d.d.get(0) != null) {
                i1b i1bVar = this.y;
                i1bVar.h = true;
                ((nk1) i1bVar.d.d.get(0)).g = aob.pk;
                this.y.d.h = (float) ((1.0d / this.j0) / 100.0d);
            }
            TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = h.status;
            w0(tL_starsRevenueStatus3.available_balance, tL_starsRevenueStatus3.next_withdrawal_at);
            q9c q9cVar = this.e;
            if (q9cVar != null) {
                wka wkaVar = this.f;
                if (wkaVar != null && wkaVar.f0) {
                    z = true;
                } else {
                    z = false;
                }
                l9c l9cVar = q9cVar.g3;
                if (wkaVar == null) {
                    z2 = true;
                }
                l9cVar.O(z2);
                if (z) {
                    this.f.a();
                }
            }
        }
    }

    public final void n0(ArrayList arrayList) {
        int i;
        int i2;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        long j;
        int i3;
        int i4;
        int i5;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus2;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i6;
        this.n = -1;
        kt0 g = kt0.g(this.currentAccount);
        boolean z = this.a;
        if (!z) {
            arrayList.add(b8c.h(2, this.u0, this.y));
            arrayList.add(b8c.B(-1, null));
            arrayList.add(b8c.b(ob6.M0(2131752943, null)));
            TLRPC.TL_payments_starsRevenueStats h = g.h(this.b, false);
            if (h != null && (tL_starsRevenueStatus2 = h.status) != null) {
                fj1 fj1Var = this.E;
                fj1Var.a = false;
                fj1Var.g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus2.available_balance;
                fj1Var.i = starsAmount3;
                fj1Var.h = "XTR";
                fj1Var.f = "USD";
                double d = this.j0;
                fj1Var.j = (long) (starsAmount3.amount * d * 100.0d);
                fj1 fj1Var2 = this.F;
                fj1Var2.a = false;
                fj1Var2.g = true;
                fj1Var2.i = tL_starsRevenueStatus2.current_balance;
                fj1Var2.h = "XTR";
                fj1Var2.j = (long) (starsAmount.amount * d * 100.0d);
                fj1Var2.f = "USD";
                fj1 fj1Var3 = this.G;
                fj1Var3.a = false;
                fj1Var3.g = true;
                fj1Var3.i = tL_starsRevenueStatus2.overall_revenue;
                fj1Var3.h = "XTR";
                fj1Var3.j = (long) (starsAmount2.amount * d * 100.0d);
                fj1Var3.f = "USD";
                w0(starsAmount3, tL_starsRevenueStatus2.next_withdrawal_at);
                LinearLayout linearLayout = this.S;
                if (h.status.withdrawal_enabled) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                linearLayout.setVisibility(i6);
            }
            arrayList.add(b8c.v(this.E));
            arrayList.add(b8c.v(this.F));
            arrayList.add(b8c.v(this.G));
            if (this.c) {
                i5 = 2131745373;
            } else {
                i5 = 2131752941;
            }
            arrayList.add(b8c.B(-2, ob6.M0(i5, null)));
            arrayList.add(b8c.b(ob6.M0(2131752953, null)));
            arrayList.add(b8c.j(1, this.R));
            arrayList.add(b8c.B(-3, this.K));
            if (!this.c) {
                if (getMessagesController().k4.K2.f) {
                    arrayList.add(yb.i(2, aob.v0(aob.lk, this.resourceProvider), g92.a0(ob6.M0(2131753138, null)), ob6.M0(2131753139, null)));
                    arrayList.add(b8c.B(-4, null));
                }
                this.n = arrayList.size();
                arrayList.add(b8c.n(this.h, -2));
            }
        } else if (z) {
            TLRPC.TL_payments_starsRevenueStats j2 = g.j(this.b, true);
            if (!this.c) {
                SpannableStringBuilder spannableStringBuilder = this.l0;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = hl.D2(hl.N2(ob6.a0(null, null, 2131753029, 50), -1, 3, new ms0(this, (byte) 3), this.resourceProvider), true);
                    this.l0 = spannableStringBuilder;
                }
                arrayList.add(b8c.g(spannableStringBuilder));
            }
            i1b i1bVar = this.p0;
            if (i1bVar == null && j2 != null) {
                i1bVar = w1b.f0(j2.top_hours_graph, ob6.M0(2131753031, null), 0, false);
                this.p0 = i1bVar;
                if (i1bVar != null) {
                    i1bVar.n = true;
                }
            }
            if (i1bVar != null && !i1bVar.l) {
                arrayList.add(b8c.h(5, this.u0, i1bVar));
                arrayList.add(b8c.B(-1, null));
            }
            i1b i1bVar2 = this.q0;
            if (i1bVar2 == null && j2 != null) {
                TL_stats.StatsGraph statsGraph = j2.revenue_graph;
                if (statsGraph != null) {
                    statsGraph.rate = (float) (1.0E7d / j2.usd_rate);
                }
                i = 2;
                i1bVar2 = w1b.f0(statsGraph, ob6.M0(2131753030, null), 2, false);
                this.q0 = i1bVar2;
            } else {
                i = 2;
            }
            if (i1bVar2 != null && !i1bVar2.l) {
                arrayList.add(b8c.h(i, this.u0, i1bVar2));
                arrayList.add(b8c.B(-2, null));
            }
            if (!this.o0 && j2 != null && (tL_starsRevenueStatus = j2.status) != null) {
                double d2 = j2.usd_rate;
                fj1 fj1Var4 = this.H;
                long j3 = tL_starsRevenueStatus.available_balance.amount;
                fj1Var4.d = j3;
                double d3 = j3 / 1.0E9d;
                fj1Var4.e = (long) (d3 * d2 * 100.0d);
                if (this.r0 == null) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                    decimalFormatSymbols.setDecimalSeparator('.');
                    DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                    this.r0 = decimalFormat;
                    i3 = 2;
                    decimalFormat.setMinimumFractionDigits(2);
                    this.r0.setMaximumFractionDigits(6);
                    this.r0.setGroupingUsed(false);
                } else {
                    i3 = 2;
                }
                DecimalFormat decimalFormat2 = this.r0;
                if (d3 <= 1.5d) {
                    i3 = 6;
                }
                decimalFormat2.setMaximumFractionDigits(i3);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ij1.L("TON " + this.r0.format(d3), this.g0.getPaint(), 0.9f, 0.0f, true));
                int indexOf = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (indexOf >= 0) {
                    spannableStringBuilder2.setSpan(this.f0, indexOf, spannableStringBuilder2.length(), 33);
                }
                this.g0.setText(spannableStringBuilder2);
                this.h0.setText("≈" + di0.h().e(j, "USD"));
                this.H.f = "USD";
                fj1 fj1Var5 = this.I;
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus3 = j2.status;
                long j4 = tL_starsRevenueStatus3.current_balance.amount;
                fj1Var5.d = j4;
                fj1Var5.e = (long) ((j4 / 1.0E9d) * d2 * 100.0d);
                fj1Var5.f = "USD";
                fj1 fj1Var6 = this.J;
                fj1Var6.a = true;
                long j5 = tL_starsRevenueStatus3.overall_revenue.amount;
                fj1Var6.d = j5;
                fj1Var6.e = (long) ((j5 / 1.0E9d) * d2 * 100.0d);
                fj1Var6.f = "USD";
                this.o0 = true;
                c51 c51Var = this.i0;
                if (tL_starsRevenueStatus3.available_balance.amount > 0 && tL_starsRevenueStatus3.withdrawal_enabled) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                c51Var.setVisibility(i4);
            }
            if (this.o0) {
                arrayList.add(b8c.b(ob6.M0(2131753018, null)));
                arrayList.add(b8c.v(this.H));
                arrayList.add(b8c.v(this.I));
                arrayList.add(b8c.v(this.J));
                SpannableStringBuilder spannableStringBuilder3 = this.m0;
                if (spannableStringBuilder3 == null) {
                    spannableStringBuilder3 = hl.D2(hl.N2(ob6.M0(2131753014, null), -1, 3, new ms0(this, (byte) 4), this.resourceProvider), true);
                    this.m0 = spannableStringBuilder3;
                }
                arrayList.add(b8c.B(-4, spannableStringBuilder3));
            }
            arrayList.add(b8c.b(ob6.M0(2131753035, null)));
            arrayList.add(b8c.k(this.e0));
            SpannableStringBuilder spannableStringBuilder4 = this.n0;
            if (spannableStringBuilder4 == null) {
                if (uc7.s1(this.currentAccount).k4.b3.f) {
                    i2 = 2131753034;
                } else {
                    i2 = 2131753032;
                }
                spannableStringBuilder4 = hl.D2(hl.N2(ob6.M0(i2, null), -1, 3, new ms0(this, (byte) 5), null), true);
                this.n0 = spannableStringBuilder4;
            }
            arrayList.add(b8c.B(-5, spannableStringBuilder4));
            this.n = arrayList.size();
            arrayList.add(b8c.n(this.h, -2));
        }
    }

    public final void o0(boolean z, long j, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        Activity parentActivity = getParentActivity();
        TLRPC.User f = yac.h(this.currentAccount).f();
        if (parentActivity != null && f != null) {
            long j2 = this.b;
            if (z) {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = uc7.s1(this.currentAccount).j1(j2);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                tL_payments_getStarsRevenueWithdrawalUrl.amount = j;
            } else {
                tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                tL_payments_getStarsRevenueWithdrawalUrl.peer = uc7.s1(this.currentAccount).j1(j2);
                if (inputCheckPasswordSRP == null) {
                    inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                }
                tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new rs0(this, twoStepVerificationActivity, parentActivity, z, j));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        jn7.f(this.currentAccount).b(this, jn7.E3);
        m0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.P = true;
        jn7.f(this.currentAccount).n(this, jn7.E3);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        l0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f82 f82Var = this.d;
            if (f82Var != null) {
                f82Var.i(aob.w0(null, aob.Fj, false), aob.w0(null, aob.Gj, false));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0(View view) {
        if (view.isEnabled() && !this.i0.R) {
            if (this.c && z15.c(this.currentAccount)) {
                z15.g(this, this.H.d, new qs0(this, (byte) 0));
                return;
            }
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            o oVar = new o(this, twoStepVerificationActivity, (byte) 24);
            twoStepVerificationActivity.a0 = (byte) 1;
            twoStepVerificationActivity.c0 = oVar;
            this.i0.setLoading(true);
            twoStepVerificationActivity.x0(new os0(this, twoStepVerificationActivity, (byte) 0));
        }
    }

    public final void q0(Context context, View view) {
        if (view.isEnabled()) {
            c51 c51Var = this.c0;
            if (!c51Var.R) {
                c51Var.setLoading(true);
                TLRPC.TL_payments_getStarsRevenueAdsAccountUrl tL_payments_getStarsRevenueAdsAccountUrl = new TLRPC.TL_payments_getStarsRevenueAdsAccountUrl();
                tL_payments_getStarsRevenueAdsAccountUrl.peer = uc7.s1(this.currentAccount).j1(this.b);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getStarsRevenueAdsAccountUrl, new ql(this, context, (byte) 5));
            }
        }
    }

    public final void r0() {
        showDialog(ij1.J(this.resourceProvider, getParentActivity(), true));
    }

    public final void s0(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        int i;
        int i2;
        int L;
        int i3;
        int i4;
        int L2;
        int i5;
        int i6;
        int i7;
        if (tL_error != null) {
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new e87((byte) 1, j, this, twoStepVerificationActivity, z), 8);
                    return;
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.s0();
                    twoStepVerificationActivity.finishFragment();
                }
                d31.e0(tL_error);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.s0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String M0 = ob6.M0(2131751262, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setPadding(hl.L(24.0f), hl.L(2.0f), hl.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.n(linearLayout);
            TextView textView = new TextView(activity);
            int i8 = aob.j5;
            yob.X(textView, i8, null);
            textView.setTextSize(1, 16.0f);
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i | 48);
            textView.setText(hl.S2(ob6.M0(2131742495, null)));
            linearLayout.addView(textView, tre.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(2131231627);
            if (ob6.a0) {
                i2 = hl.L(11.0f);
            } else {
                i2 = 0;
            }
            int L3 = hl.L(9.0f);
            if (ob6.a0) {
                L = 0;
            } else {
                L = hl.L(11.0f);
            }
            imageView.setPadding(i2, L3, L, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            yob.s(imageView, i8, null, mode);
            TextView textView2 = new TextView(activity);
            yob.X(textView2, i8, null);
            textView2.setTextSize(1, 16.0f);
            if (ob6.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            textView2.setGravity(i3 | 48);
            textView2.setText(hl.S2(ob6.M0(2131751265, null)));
            if (ob6.a0) {
                linearLayout2.addView(textView2, tre.o(-1, -2));
                linearLayout2.addView(imageView, tre.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, tre.o(-2, -2));
                linearLayout2.addView(textView2, tre.o(-1, -2));
            }
            LinearLayout m = bs2.m(activity, 0);
            linearLayout.addView(m, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(activity);
            imageView2.setImageResource(2131231627);
            if (ob6.a0) {
                i4 = hl.L(11.0f);
            } else {
                i4 = 0;
            }
            int L4 = hl.L(9.0f);
            if (ob6.a0) {
                L2 = 0;
            } else {
                L2 = hl.L(11.0f);
            }
            imageView2.setPadding(i4, L4, L2, 0);
            yob.s(imageView2, i8, null, mode);
            TextView textView3 = new TextView(activity);
            yob.X(textView3, i8, null);
            textView3.setTextSize(1, 16.0f);
            if (ob6.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            textView3.setGravity(i5 | 48);
            textView3.setText(hl.S2(ob6.M0(2131751264, null)));
            if (ob6.a0) {
                m.addView(textView3, tre.o(-1, -2));
                i6 = 5;
                m.addView(imageView2, tre.r(-2, -2, 5));
            } else {
                i6 = 5;
                m.addView(imageView2, tre.o(-2, -2));
                m.addView(textView3, tre.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.j(ob6.M0(2131751256, null), new ns0(this));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            } else {
                TextView textView4 = new TextView(activity);
                yob.X(textView4, i8, null);
                textView4.setTextSize(1, 16.0f);
                if (ob6.a0) {
                    i7 = i6;
                } else {
                    i7 = 3;
                }
                uh9.q(textView4, i7 | 48, null, 2131751263);
                linearLayout.addView(textView4, tre.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.g(ob6.M0(2131747558, null), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(idVar);
                return;
            } else {
                showDialog(idVar);
                return;
            }
        }
        twoStepVerificationActivity.s0();
        twoStepVerificationActivity.finishFragment();
        if (tLObject instanceof TL_stats.TL_broadcastRevenueWithdrawalUrl) {
            m01.w(getParentActivity(), ((TL_stats.TL_broadcastRevenueWithdrawalUrl) tLObject).url, false);
        } else if (tLObject instanceof TLRPC.TL_payments_starsRevenueWithdrawalUrl) {
            this.Y = true;
            m01.w(getParentActivity(), ((TLRPC.TL_payments_starsRevenueWithdrawalUrl) tLObject).url, false);
        }
    }

    public final void t0() {
        long j;
        v21.e();
        TLRPC.TL_payments_starsRevenueStats h = kt0.g(this.currentAccount).h(this.b, false);
        if (h == null) {
            j = 0;
        } else {
            j = h.status.available_balance.amount;
        }
        if (j < getMessagesController().k4.y2.f()) {
            this.Y = true;
            this.Z = j;
        } else {
            this.Y = false;
            j = getMessagesController().k4.y2.f();
            this.Z = j;
        }
        this.X = true;
        this.a0.setText(Long.toString(j));
        xs0 xs0Var = this.a0;
        xs0Var.setSelection(xs0Var.getText().length());
        this.X = false;
        ms0 ms0Var = this.t0;
        hl.r(ms0Var);
        ms0Var.run();
    }

    public final void u0(b8c b8cVar) {
        boolean H = b8cVar.H(hza.class);
        Object obj = b8cVar.H;
        if (H) {
            Activity parentActivity = getParentActivity();
            int i = this.currentAccount;
            vnb resourceProvider = getResourceProvider();
            nza.l1(parentActivity, true, this.b, i, (TL_stars.StarsTransaction) obj, resourceProvider);
        } else if (obj instanceof TL_stats.BroadcastRevenueTransaction) {
            ij1.N(getParentActivity(), this.currentAccount, (TL_stats.BroadcastRevenueTransaction) b8cVar.H, this.b, this.resourceProvider);
        } else if (b8cVar.d == 2) {
            presentFragment(new ng1(this.b));
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0(TL_stars.StarsAmount starsAmount, int i) {
        int i2;
        if (this.U != null && this.V != null) {
            long j = (long) (this.j0 * starsAmount.amount * 100.0d);
            boolean z = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nza.b1(false, TextUtils.concat("XTR ", nza.H0(starsAmount, 0.8f, ' ')), 1.0f, null));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(this.T, indexOf, spannableStringBuilder.length(), 33);
            }
            this.U.setText(spannableStringBuilder);
            this.V.setText("≈" + di0.h().e(j, "USD"));
            ws0 ws0Var = this.W;
            if (j > 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            ws0Var.setVisibility(i2);
            if (this.Y) {
                this.X = true;
                xs0 xs0Var = this.a0;
                long j2 = starsAmount.amount;
                this.Z = j2;
                xs0Var.setText(Long.toString(j2));
                xs0 xs0Var2 = this.a0;
                xs0Var2.setSelection(xs0Var2.getText().length());
                this.X = false;
                ub ubVar = this.b0;
                if (this.Z > 0) {
                    z = true;
                }
                ubVar.setEnabled(z);
            }
            this.Q = i;
            ms0 ms0Var = this.t0;
            hl.r(ms0Var);
            ms0Var.run();
        }
    }

    public final void y0() {
        float f;
        View view = this.r;
        if (view == null) {
            return;
        }
        fm0 fm0Var = this.s;
        float f2 = 0.0f;
        if (fm0Var == null) {
            f = 0.0f;
        } else {
            f = fm0Var.e;
        }
        if (this.f != null) {
            f2 = (-(1.0f - f)) * hl.L(44.0f);
        }
        view.setTranslationY(f2);
    }

    public final void z0() {
        ub ubVar = this.b0;
        if (ubVar.e0 && !ubVar.R) {
            int currentTime = getConnectionsManager().getCurrentTime();
            if (this.Q > currentTime) {
                this.k0 = d31.b0(this).Q(2131624287, 36, hl.S2(ob6.a0(null, null, 2131752933, x0(this.Q - currentTime)))).j();
            } else if (this.Z < getMessagesController().k4.y2.f()) {
                d31.b0(this).M(getParentActivity().getResources().getDrawable(2131232775).mutate(), hl.N2(ob6.G((int) getMessagesController().k4.y2.f(), "BotStarsWithdrawMinLimit", new Object[0]), -1, 0, new ms0(this, (byte) 1), null)).j();
            } else {
                long j = this.Z;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                ps0 ps0Var = new ps0(this, j, twoStepVerificationActivity, (byte) 0);
                twoStepVerificationActivity.a0 = (byte) 1;
                twoStepVerificationActivity.c0 = ps0Var;
                this.b0.setLoading(true);
                twoStepVerificationActivity.x0(new os0(this, twoStepVerificationActivity, (byte) 1));
            }
        }
    }
}
