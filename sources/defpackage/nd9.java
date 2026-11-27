package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public class nd9 extends e implements s84 {
    public static final ArrayList c0 = new ArrayList();
    public HorizontalScrollView E;
    public LinearLayout F;
    public wc9 G;
    public wc9 H;
    public wc9 I;
    public sla J;
    public String K;
    public final bc9 L;
    public wc9 M;
    public wc9 N;
    public tj4 O;
    public int P;
    public int Q;
    public float R;
    public FrameLayout S;
    public ValueAnimator T;
    public float U;
    public ol0 V;
    public ez4 W;
    public og2 X;
    public boolean Y;
    public ValueAnimator Z;
    public final fm0 a;
    public int a0;
    public final long b;
    public LinearLayout b0;
    public final long c;
    public final String d;
    public final ed9 e;
    public pcc f;
    public d34 h;
    public View n;
    public FrameLayout r;
    public FrameLayout s;
    public TextView w;
    public ir8 x;
    public boolean y;

    public nd9(long j, String str, long j2, vnb vnbVar) {
        super(null);
        this.a = new fm0(0, this, k43.h, 380L, false);
        this.L = new bc9(this, (byte) 0);
        this.U = 1.0f;
        boolean z = true;
        this.Y = true;
        this.b = j;
        this.d = str;
        this.c = j2;
        this.resourceProvider = vnbVar;
        ed9 ed9Var = new ed9(this.currentAccount, j2, new cc9(this, (byte) 1));
        z = (j == 0 || j == yac.h(ed9Var.a).e()) ? false : z;
        ed9Var.w = z;
        if (z) {
            ed9Var.j();
        }
        this.e = ed9Var;
        ed9Var.o(false);
    }

    public static void n0(q9c q9cVar) {
        q9cVar.setVerticalFadingEdgeEnabled(true);
        q9cVar.setFadingEdgeLength(hl.L(24.0f));
    }

    public final void Y(wc9 wc9Var, boolean z) {
        int L = hl.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i = 0;
        jl0 c = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c.p(this.V);
        c.r(hl.L(20.0f));
        c.q(L);
        frameLayout.setBackground(c);
        frameLayout.addView(wc9Var, tre.c(40.0f, -2));
        frameLayout.setOnClickListener(new jn8(wc9Var, (byte) 9));
        iye.a(frameLayout);
        LinearLayout linearLayout = this.F;
        if (!z) {
            i = -4;
        }
        linearLayout.addView(frameLayout, tre.t(-2, -2, 16, 0, 0, i, 0));
    }

    public final ArrayList Z() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        ArrayList arrayList3 = jxa.v(this.currentAccount, false).H;
        int size = arrayList3.size();
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            if (starGift instanceof TL_stars.TL_starGift) {
                if (this.e.b.contains(Long.valueOf(starGift.id))) {
                    arrayList.add(starGift);
                } else if (starGift.availability_resale > 0) {
                    arrayList2.add(starGift);
                }
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean a0() {
        int M0;
        ed9 ed9Var = this.e;
        if (!ed9Var.z && !ed9Var.A && (this.h.getLayoutManager() instanceof x46) && (M0 = ((x46) this.h.getLayoutManager()).M0()) != -1 && M0 >= ed9Var.e.size() - 1) {
            return true;
        }
        return false;
    }

    public final void b0() {
        if (!this.Y) {
            return;
        }
        this.simpleActionBar.F(true, true);
    }

    public final void c0() {
        boolean z;
        ed9 ed9Var = this.e;
        HashSet hashSet = ed9Var.l;
        HashSet hashSet2 = ed9Var.m;
        HashSet hashSet3 = ed9Var.k;
        boolean z2 = false;
        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
            boolean z3 = ed9Var.s;
            boolean z4 = ed9Var.t;
            boolean z5 = ed9Var.u;
            ed9Var.j();
            if (z3 == ed9Var.s && z4 == ed9Var.t && z5 == ed9Var.u) {
                z = false;
            } else {
                z = true;
            }
            ed9Var.s = z3;
            ed9Var.t = z4;
            ed9Var.u = z5;
            if (!z && TextUtils.isEmpty(ed9Var.c)) {
                z2 = true;
            }
        }
        if (this.simpleActionBar.L) {
            hl.r(this.L);
            this.K = null;
            this.simpleActionBar.o(true);
        }
        ed9Var.s(null);
        ed9Var.l.clear();
        hashSet3.clear();
        hashSet2.clear();
        if (z2) {
            ed9Var.s = ed9Var.g();
            ed9Var.t = ed9Var.h();
            ed9Var.u = ed9Var.f();
        } else {
            ed9Var.j();
        }
        og2 og2Var = this.X;
        if (og2Var != null) {
            og2Var.a(ed9Var.m(), true);
        }
        ed9Var.p();
    }

    @Override
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 9));
        w0();
        u0();
        jxa.v(this.currentAccount, false).U();
        sla a = this.simpleActionBar.v().a(0, 2131232502);
        this.J = a;
        a.setVisibility(8);
        sla slaVar = this.J;
        slaVar.N();
        slaVar.C0 = new r10(this, (byte) 20);
        this.J.setSearchFieldHint(ob6.M0(2131749953, null));
        FrameLayout wmaVar = new wma(context, null);
        yob.h(aob.a7, getResourceProvider(), wmaVar);
        this.fragmentView = wmaVar;
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        d34 d34Var = new d34(this, new hj8(this, (byte) 8), new lc9(this), new iy8(this, (byte) 8), (byte) 2);
        this.h = d34Var;
        d34Var.g3.r = false;
        d34Var.setSpanCount(3);
        this.h.j(new e98(this, (byte) 11));
        wmaVar.addView(this.h, tre.e(-1, -1, 119));
        ir8 ir8Var = new ir8(context, new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                nd9 nd9Var = this.b;
                switch (b) {
                    case 0:
                        ed9 ed9Var = nd9Var.e;
                        ed9Var.l.clear();
                        ed9Var.k.clear();
                        ed9Var.m.clear();
                        ed9Var.p();
                        return;
                    case 1:
                        nd9Var.i0();
                        return;
                    case 2:
                        nd9Var.b0();
                        return;
                    default:
                        nd9Var.c0();
                        return;
                }
            }
        }, this.resourceProvider);
        this.x = ir8Var;
        this.y = false;
        ir8Var.setAlpha(0.0f);
        this.x.setScaleX(0.95f);
        this.x.setScaleY(0.95f);
        this.x.setVisibility(8);
        wmaVar.addView(this.x, tre.e(-1, -1, 119));
        ed9 ed9Var = this.e;
        if (ed9Var.e.isEmpty() && !ed9Var.z && ed9Var.A) {
            s0(true);
        }
        View view = new View(context);
        this.n = view;
        wmaVar.addView(view, tre.e(-1, 0, 48));
        baseSimpleGlass.h(wmaVar, this.h, this.simpleActionBar, this.resourceProvider);
        ll0 ll0Var = baseSimpleGlass.c;
        View view2 = this.n;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        qc9 qc9Var = new qc9(this.currentAccount, this.resourceProvider, context);
        jl0 c = ll0Var.c(qc9Var, null, false);
        c.p(dtd.l(this.resourceProvider));
        c.r(hl.L(23.0f));
        c.q(hl.L(6.0f));
        qc9Var.setBackground(c);
        iye.a(qc9Var);
        qc9Var.setOnClickListener(new jy8(this, qc9Var, (byte) 3));
        qc9Var.setOnWidthChanged(new cc9(this, (byte) 0));
        this.simpleActionBar.addView(qc9Var, tre.e(-2, 58, 5));
        this.simpleActionBar.setSearchCloseAnchor(qc9Var);
        this.V = dtd.l(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.F = linearLayout;
        linearLayout.setOrientation(0);
        this.F.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.E = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.E.setOverScrollMode(2);
        this.E.addView(this.F);
        this.E.setClipChildren(false);
        wmaVar.addView(this.E, tre.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(hl.L(4.0f), 0, hl.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final og2 og2Var = new og2(24, this.resourceProvider, context);
        this.X = og2Var;
        og2Var.b(aob.h7, aob.j7, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(ed9Var.m(), false);
        og2Var.setDrawBackgroundAsArc(10);
        og2Var.setTranslationX(hl.L(4.0f));
        og2Var.setScaleX(0.8f);
        og2Var.setScaleY(0.8f);
        linearLayout2.addView(og2Var, tre.r(26, 26, 16));
        TextView textView = new TextView(context);
        int i = aob.G6;
        yob.X(textView, i, this.resourceProvider);
        bs2.r(14.0f, 1, 2131749399, textView, null);
        linearLayout2.addView(textView, tre.t(-2, -2, 16, 9, 0, 0, 0));
        int L = hl.L(20.0f);
        int i2 = aob.Fi;
        int p1 = aob.p1(0.1f, getThemedColor(i2));
        linearLayout2.setBackground(aob.i0(L, L, L, L, 0, p1, p1));
        this.b0 = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.s = frameLayout;
        frameLayout.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        View view3 = this.s;
        jl0 c2 = ll0Var.c(view3, null, false);
        c2.p(dtd.l(this.resourceProvider));
        c2.q(hl.L(8.0f));
        c2.r(hl.L(20.0f));
        view3.setBackground(c2);
        this.s.setOnClickListener(new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        ed9 ed9Var2 = this.b.e;
                        if (ed9Var2 != null) {
                            if (ed9Var2.m()) {
                                ed9Var2.r(true, true, true);
                            } else {
                                ed9Var2.r(true, false, false);
                            }
                            og2Var.a(ed9Var2.m(), true);
                            return;
                        }
                        return;
                    default:
                        final nd9 nd9Var = this.b;
                        ed9 ed9Var3 = nd9Var.e;
                        if (nd9Var.Y) {
                            fu5 I = fu5.I(nd9Var, nd9Var.H);
                            I.b(2131231894, ob6.M0(2131745866, null), new bc9(nd9Var, (byte) 1), false);
                            I.b(2131231892, ob6.M0(2131745870, null), new bc9(nd9Var, (byte) 2), false);
                            I.b(2131231893, ob6.M0(2131745868, null), new bc9(nd9Var, (byte) 3), false);
                            boolean h = ed9Var3.h();
                            boolean g = ed9Var3.g();
                            int i3 = (ed9Var3.f() ? 1 : 0) + (g ? 1 : 0) + (h ? 1 : 0);
                            if (i3 > 1) {
                                I.j();
                            }
                            b8[] b8VarArr = new b8[4];
                            final vp8 vp8Var = new vp8(nd9Var, I, og2Var, b8VarArr, (byte) 10);
                            if (i3 > 1 && ed9Var3.h()) {
                                boolean z = ed9Var3.t;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vp8 vp8Var2 = vp8Var;
                                        nd9 nd9Var2 = nd9Var;
                                        switch (b) {
                                            case 0:
                                                ed9 ed9Var4 = nd9Var2.e;
                                                ed9Var4.r(ed9Var4.s, !ed9Var4.t, ed9Var4.u);
                                                vp8Var2.run();
                                                return;
                                            case 1:
                                                ed9 ed9Var5 = nd9Var2.e;
                                                ed9Var5.r(!ed9Var5.s, ed9Var5.t, ed9Var5.u);
                                                vp8Var2.run();
                                                return;
                                            default:
                                                ed9 ed9Var6 = nd9Var2.e;
                                                ed9Var6.r(ed9Var6.s, ed9Var6.t, !ed9Var6.u);
                                                vp8Var2.run();
                                                return;
                                        }
                                    }
                                }, ob6.M0(2131749401, null), z);
                                b8VarArr[2] = I.z();
                            }
                            if (i3 > 1 && ed9Var3.g()) {
                                boolean z2 = ed9Var3.s;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vp8 vp8Var2 = vp8Var;
                                        nd9 nd9Var2 = nd9Var;
                                        switch (b) {
                                            case 0:
                                                ed9 ed9Var4 = nd9Var2.e;
                                                ed9Var4.r(ed9Var4.s, !ed9Var4.t, ed9Var4.u);
                                                vp8Var2.run();
                                                return;
                                            case 1:
                                                ed9 ed9Var5 = nd9Var2.e;
                                                ed9Var5.r(!ed9Var5.s, ed9Var5.t, ed9Var5.u);
                                                vp8Var2.run();
                                                return;
                                            default:
                                                ed9 ed9Var6 = nd9Var2.e;
                                                ed9Var6.r(ed9Var6.s, ed9Var6.t, !ed9Var6.u);
                                                vp8Var2.run();
                                                return;
                                        }
                                    }
                                }, ob6.M0(2131749403, null), z2);
                                b8VarArr[1] = I.z();
                            }
                            if (i3 > 1 && ed9Var3.f()) {
                                boolean z3 = ed9Var3.u;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vp8 vp8Var2 = vp8Var;
                                        nd9 nd9Var2 = nd9Var;
                                        switch (b) {
                                            case 0:
                                                ed9 ed9Var4 = nd9Var2.e;
                                                ed9Var4.r(ed9Var4.s, !ed9Var4.t, ed9Var4.u);
                                                vp8Var2.run();
                                                return;
                                            case 1:
                                                ed9 ed9Var5 = nd9Var2.e;
                                                ed9Var5.r(!ed9Var5.s, ed9Var5.t, ed9Var5.u);
                                                vp8Var2.run();
                                                return;
                                            default:
                                                ed9 ed9Var6 = nd9Var2.e;
                                                ed9Var6.r(ed9Var6.s, ed9Var6.t, !ed9Var6.u);
                                                vp8Var2.run();
                                                return;
                                        }
                                    }
                                }, ob6.M0(2131749400, null), z3);
                                b8VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.e0 = true;
                            I.b0(0.0f, hl.L(-8.0f));
                            nd9Var.p0(nd9Var.H, I);
                            return;
                        }
                        return;
                }
            }
        });
        this.s.addView(linearLayout2, tre.c(-1.0f, -2));
        iye.b(this.s, 0.04f, 1.5f);
        wmaVar.addView(this.s, tre.e(-2, 56, 81));
        if (!ed9Var.g() || (!ed9Var.h() && !ed9Var.f())) {
            this.s.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        View view4 = this.r;
        jl0 c3 = ll0Var.c(view4, null, false);
        c3.p(dtd.l(this.resourceProvider));
        c3.q(hl.L(8.0f));
        c3.r(hl.L(22.0f));
        view4.setBackground(c3);
        wmaVar.addView(this.r, tre.e(-2, 60, 81));
        this.w = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new wm2(2131232100, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131749962, null));
        this.w.setText(spannableStringBuilder);
        yob.X(this.w, i2, getResourceProvider());
        this.w.setTypeface(hl.o());
        this.w.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
        TextView textView2 = this.w;
        int L2 = hl.L(22.0f);
        int p12 = aob.p1(0.1f, getThemedColor(i2));
        textView2.setBackground(aob.i0(L2, L2, L2, L2, 0, p12, p12));
        this.w.setGravity(17);
        this.r.setOnClickListener(new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r2;
                nd9 nd9Var = this.b;
                switch (b) {
                    case 0:
                        ed9 ed9Var2 = nd9Var.e;
                        ed9Var2.l.clear();
                        ed9Var2.k.clear();
                        ed9Var2.m.clear();
                        ed9Var2.p();
                        return;
                    case 1:
                        nd9Var.i0();
                        return;
                    case 2:
                        nd9Var.b0();
                        return;
                    default:
                        nd9Var.c0();
                        return;
                }
            }
        });
        this.r.addView(this.w, tre.c(-1.0f, -2));
        this.r.setVisibility(8);
        iye.b(this.r, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        int L3 = hl.L(6.0f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setPadding(L3, L3, L3, L3);
        jl0 c4 = getBaseSimpleGlass().c.c(frameLayout3, null, false);
        c4.p(this.V);
        c4.r(hl.L(20.0f));
        c4.q(L3);
        frameLayout3.setBackground(c4);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232502);
        yob.s(imageView, i, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        frameLayout3.addView(imageView, tre.c(40.0f, 40));
        frameLayout3.setContentDescription(ob6.M0(2131745564, null));
        frameLayout3.setOnClickListener(new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r2;
                nd9 nd9Var = this.b;
                switch (b) {
                    case 0:
                        ed9 ed9Var2 = nd9Var.e;
                        ed9Var2.l.clear();
                        ed9Var2.k.clear();
                        ed9Var2.m.clear();
                        ed9Var2.p();
                        return;
                    case 1:
                        nd9Var.i0();
                        return;
                    case 2:
                        nd9Var.b0();
                        return;
                    default:
                        nd9Var.c0();
                        return;
                }
            }
        });
        iye.a(frameLayout3);
        this.F.addView(frameLayout3, tre.t(-2, -2, 16, 0, 0, -4, 0));
        this.S = frameLayout3;
        wc9 wc9Var = new wc9(this.resourceProvider, context, true);
        this.G = wc9Var;
        Y(wc9Var, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r2;
                nd9 nd9Var = this.b;
                switch (b) {
                    case 0:
                        ed9 ed9Var2 = nd9Var.e;
                        ed9Var2.l.clear();
                        ed9Var2.k.clear();
                        ed9Var2.m.clear();
                        ed9Var2.p();
                        return;
                    case 1:
                        nd9Var.i0();
                        return;
                    case 2:
                        nd9Var.b0();
                        return;
                    default:
                        nd9Var.c0();
                        return;
                }
            }
        });
        r0();
        wc9 wc9Var2 = new wc9(this.resourceProvider, context, true);
        this.H = wc9Var2;
        wc9Var2.setSorting(ed9Var.q);
        Y(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view42) {
                switch (r3) {
                    case 0:
                        ed9 ed9Var2 = this.b.e;
                        if (ed9Var2 != null) {
                            if (ed9Var2.m()) {
                                ed9Var2.r(true, true, true);
                            } else {
                                ed9Var2.r(true, false, false);
                            }
                            og2Var.a(ed9Var2.m(), true);
                            return;
                        }
                        return;
                    default:
                        final nd9 nd9Var = this.b;
                        ed9 ed9Var3 = nd9Var.e;
                        if (nd9Var.Y) {
                            fu5 I = fu5.I(nd9Var, nd9Var.H);
                            I.b(2131231894, ob6.M0(2131745866, null), new bc9(nd9Var, (byte) 1), false);
                            I.b(2131231892, ob6.M0(2131745870, null), new bc9(nd9Var, (byte) 2), false);
                            I.b(2131231893, ob6.M0(2131745868, null), new bc9(nd9Var, (byte) 3), false);
                            boolean h = ed9Var3.h();
                            boolean g = ed9Var3.g();
                            int i3 = (ed9Var3.f() ? 1 : 0) + (g ? 1 : 0) + (h ? 1 : 0);
                            if (i3 > 1) {
                                I.j();
                            }
                            b8[] b8VarArr = new b8[4];
                            final vp8 vp8Var = new vp8(nd9Var, I, og2Var, b8VarArr, (byte) 10);
                            if (i3 > 1 && ed9Var3.h()) {
                                boolean z = ed9Var3.t;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vp8 vp8Var2 = vp8Var;
                                        nd9 nd9Var2 = nd9Var;
                                        switch (b) {
                                            case 0:
                                                ed9 ed9Var4 = nd9Var2.e;
                                                ed9Var4.r(ed9Var4.s, !ed9Var4.t, ed9Var4.u);
                                                vp8Var2.run();
                                                return;
                                            case 1:
                                                ed9 ed9Var5 = nd9Var2.e;
                                                ed9Var5.r(!ed9Var5.s, ed9Var5.t, ed9Var5.u);
                                                vp8Var2.run();
                                                return;
                                            default:
                                                ed9 ed9Var6 = nd9Var2.e;
                                                ed9Var6.r(ed9Var6.s, ed9Var6.t, !ed9Var6.u);
                                                vp8Var2.run();
                                                return;
                                        }
                                    }
                                }, ob6.M0(2131749401, null), z);
                                b8VarArr[2] = I.z();
                            }
                            if (i3 > 1 && ed9Var3.g()) {
                                boolean z2 = ed9Var3.s;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vp8 vp8Var2 = vp8Var;
                                        nd9 nd9Var2 = nd9Var;
                                        switch (b) {
                                            case 0:
                                                ed9 ed9Var4 = nd9Var2.e;
                                                ed9Var4.r(ed9Var4.s, !ed9Var4.t, ed9Var4.u);
                                                vp8Var2.run();
                                                return;
                                            case 1:
                                                ed9 ed9Var5 = nd9Var2.e;
                                                ed9Var5.r(!ed9Var5.s, ed9Var5.t, ed9Var5.u);
                                                vp8Var2.run();
                                                return;
                                            default:
                                                ed9 ed9Var6 = nd9Var2.e;
                                                ed9Var6.r(ed9Var6.s, ed9Var6.t, !ed9Var6.u);
                                                vp8Var2.run();
                                                return;
                                        }
                                    }
                                }, ob6.M0(2131749403, null), z2);
                                b8VarArr[1] = I.z();
                            }
                            if (i3 > 1 && ed9Var3.f()) {
                                boolean z3 = ed9Var3.u;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        vp8 vp8Var2 = vp8Var;
                                        nd9 nd9Var2 = nd9Var;
                                        switch (b) {
                                            case 0:
                                                ed9 ed9Var4 = nd9Var2.e;
                                                ed9Var4.r(ed9Var4.s, !ed9Var4.t, ed9Var4.u);
                                                vp8Var2.run();
                                                return;
                                            case 1:
                                                ed9 ed9Var5 = nd9Var2.e;
                                                ed9Var5.r(!ed9Var5.s, ed9Var5.t, ed9Var5.u);
                                                vp8Var2.run();
                                                return;
                                            default:
                                                ed9 ed9Var6 = nd9Var2.e;
                                                ed9Var6.r(ed9Var6.s, ed9Var6.t, !ed9Var6.u);
                                                vp8Var2.run();
                                                return;
                                        }
                                    }
                                }, ob6.M0(2131749400, null), z3);
                                b8VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.e0 = true;
                            I.b0(0.0f, hl.L(-8.0f));
                            nd9Var.p0(nd9Var.H, I);
                            return;
                        }
                        return;
                }
            }
        });
        wc9 wc9Var3 = new wc9(this.resourceProvider, context, true);
        this.I = wc9Var3;
        wc9Var3.setValue(ob6.M0(2131750348, null));
        Y(this.I, false);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                nd9 nd9Var = this.b;
                switch (b) {
                    case 0:
                        nd9Var.d0(context2);
                        return;
                    case 1:
                        nd9Var.e0(context2);
                        return;
                    default:
                        nd9Var.g0(context2);
                        return;
                }
            }
        });
        wc9 wc9Var4 = new wc9(this.resourceProvider, context, true);
        this.M = wc9Var4;
        wc9Var4.setValue(ob6.M0(2131750349, null));
        Y(this.M, false);
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                nd9 nd9Var = this.b;
                switch (b) {
                    case 0:
                        nd9Var.d0(context2);
                        return;
                    case 1:
                        nd9Var.e0(context2);
                        return;
                    default:
                        nd9Var.g0(context2);
                        return;
                }
            }
        });
        wc9 wc9Var5 = new wc9(this.resourceProvider, context, true);
        this.N = wc9Var5;
        wc9Var5.setValue(ob6.M0(2131750341, null));
        Y(this.N, true);
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final nd9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                nd9 nd9Var = this.b;
                switch (b) {
                    case 0:
                        nd9Var.d0(context2);
                        return;
                    case 1:
                        nd9Var.e0(context2);
                        return;
                    default:
                        nd9Var.g0(context2);
                        return;
                }
            }
        });
        tj4 tj4Var = new tj4(getParentActivity());
        this.O = tj4Var;
        wmaVar.addView(tj4Var, tre.c(-1.0f, -1));
        m0(false, false);
        return wmaVar;
    }

    public final void d0(Context context) {
        if (this.Y) {
            ed9 ed9Var = this.e;
            if (ed9Var.g.isEmpty()) {
                return;
            }
            fu5 fu5Var = new fu5(this, this.I, false, false);
            fu5Var.t = false;
            fu5Var.e0 = true;
            fu5Var.b0(0.0f, hl.L(-8.0f));
            fu5Var.X = true;
            fu5Var.p = new vn1(fu5Var, (byte) 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(ed9Var.g);
            Collections.sort(arrayList, new fc9(this, (byte) 1));
            d34 d34Var = new d34(this, new gc9(this, strArr, arrayList, (byte) 1), new hc9(this, r13, (byte) 1), null, (byte) 3);
            d34Var.g3.r = false;
            q9c[] q9cVarArr = {d34Var};
            n0(d34Var);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232753);
            yob.s(imageView, aob.F8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            xt3 xt3Var = new xt3(context, this.resourceProvider);
            xt3Var.setTextSize(1, 16.0f);
            xt3Var.setInputType(573441);
            xt3Var.setRawInputType(573441);
            yob.D(xt3Var, aob.A6, this.resourceProvider);
            yob.l(xt3Var, 30, aob.G6, this.resourceProvider);
            xt3Var.setCursorSize(hl.L(19.0f));
            xt3Var.setCursorWidth(1.5f);
            xt3Var.setHint(ob6.M0(2131749956, null));
            yob.X(xt3Var, aob.E8, this.resourceProvider);
            xt3Var.setBackground(null);
            frameLayout.addView(xt3Var, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            xt3Var.addTextChangedListener(new ry(strArr, d34Var, false, (byte) 13));
            if (arrayList.size() > 8) {
                fu5Var.q(frameLayout, tre.o(-1, 44));
                fu5Var.j();
            }
            if (!ed9Var.k.isEmpty()) {
                fu5Var.b(2131232362, ob6.M0(2131745398, null), new ic9(this, q9cVarArr, fu5Var, (byte) 1), false);
            }
            fu5Var.p(d34Var);
            p0(this.I, fu5Var);
        }
    }

    public final void e0(Context context) {
        if (this.Y) {
            ed9 ed9Var = this.e;
            if (ed9Var.h.isEmpty()) {
                return;
            }
            fu5 fu5Var = new fu5(this, this.M, false, false);
            fu5Var.t = false;
            fu5Var.e0 = true;
            fu5Var.b0(0.0f, hl.L(-8.0f));
            fu5Var.X = true;
            fu5Var.p = new vn1(fu5Var, (byte) 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(ed9Var.h);
            Collections.sort(arrayList, new fc9(this, (byte) 0));
            d34 d34Var = new d34(this, new gc9(this, strArr, arrayList, (byte) 0), new hc9(this, r13, (byte) 0), null, (byte) 4);
            d34Var.g3.r = false;
            q9c[] q9cVarArr = {d34Var};
            n0(d34Var);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232753);
            yob.s(imageView, aob.F8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            xt3 xt3Var = new xt3(context, this.resourceProvider);
            xt3Var.setTextSize(1, 16.0f);
            xt3Var.setInputType(573441);
            xt3Var.setRawInputType(573441);
            yob.D(xt3Var, aob.A6, this.resourceProvider);
            yob.l(xt3Var, 30, aob.G6, this.resourceProvider);
            xt3Var.setCursorSize(hl.L(19.0f));
            xt3Var.setCursorWidth(1.5f);
            xt3Var.setHint(ob6.M0(2131749956, null));
            yob.X(xt3Var, aob.E8, this.resourceProvider);
            xt3Var.setBackground(null);
            frameLayout.addView(xt3Var, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            xt3Var.addTextChangedListener(new ry(strArr, d34Var, false, (byte) 14));
            if (arrayList.size() > 8) {
                fu5Var.q(frameLayout, tre.o(-1, 44));
                fu5Var.j();
            }
            if (!ed9Var.l.isEmpty()) {
                fu5Var.b(2131232362, ob6.M0(2131745398, null), new ic9(this, q9cVarArr, fu5Var, (byte) 0), false);
            }
            fu5Var.p(d34Var);
            p0(this.M, fu5Var);
        }
    }

    public final void f0(qc9 qc9Var) {
        if (this.simpleActionBar.L) {
            return;
        }
        fu5 I = fu5.I(this, qc9Var);
        qc9Var.b(I, new cc9(this, (byte) 2), new sa8(this, qc9Var, I, (byte) 18));
    }

    public final void g0(Context context) {
        if (this.Y) {
            ed9 ed9Var = this.e;
            if (ed9Var.i.isEmpty()) {
                return;
            }
            fu5 fu5Var = new fu5(this, this.N, false, false);
            fu5Var.t = false;
            fu5Var.e0 = true;
            fu5Var.b0(0.0f, hl.L(-8.0f));
            fu5Var.X = true;
            fu5Var.p = new vn1(fu5Var, (byte) 6);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(ed9Var.i);
            Collections.sort(arrayList, new fc9(this, (byte) 2));
            d34 d34Var = new d34(this, new gc9(this, strArr, arrayList, (byte) 3), new hc9(this, r14, (byte) 3), null, (byte) 5);
            d34Var.g3.r = false;
            q9c[] q9cVarArr = {d34Var};
            n0(d34Var);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232753);
            yob.s(imageView, aob.F8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            xt3 xt3Var = new xt3(context, this.resourceProvider);
            xt3Var.setTextSize(1, 16.0f);
            xt3Var.setInputType(573441);
            xt3Var.setRawInputType(573441);
            yob.D(xt3Var, aob.A6, this.resourceProvider);
            yob.l(xt3Var, 30, aob.G6, this.resourceProvider);
            xt3Var.setCursorSize(hl.L(19.0f));
            xt3Var.setCursorWidth(1.5f);
            xt3Var.setHint(ob6.M0(2131749956, null));
            yob.X(xt3Var, aob.E8, this.resourceProvider);
            xt3Var.setBackground(null);
            frameLayout.addView(xt3Var, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            xt3Var.addTextChangedListener(new ry(strArr, d34Var, false, (byte) 11));
            if (arrayList.size() > 8) {
                fu5Var.q(frameLayout, tre.o(-1, 44));
                fu5Var.j();
            }
            if (!ed9Var.m.isEmpty()) {
                fu5Var.b(2131232362, ob6.M0(2131745398, null), new ic9(this, q9cVarArr, fu5Var, (byte) 2), false);
            }
            fu5Var.p(d34Var);
            p0(this.N, fu5Var);
        }
    }

    public final void h0(Integer num) {
        this.simpleActionBar.setTitleMinSideInset(hl.L(6.0f) + num.intValue());
    }

    public final void i0() {
        if (this.Y) {
            ArrayList Z = Z();
            if (Z.size() <= 1 && this.e.b.size() <= 1) {
                return;
            }
            Activity parentActivity = getParentActivity();
            fu5 fu5Var = new fu5(this, this.G, false, false);
            fu5Var.t = false;
            fu5Var.e0 = true;
            fu5Var.b0(0.0f, hl.L(-8.0f));
            fu5Var.X = true;
            fu5Var.p = new vn1(fu5Var, (byte) 5);
            String[] strArr = {""};
            d34 d34Var = new d34(this, new gc9(this, strArr, Z, (byte) 2), new hc9(this, r12, (byte) 2), null, (byte) 1);
            d34Var.g3.r = false;
            q9c[] q9cVarArr = {d34Var};
            n0(d34Var);
            if (Z.size() > 8) {
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(2131232753);
                yob.s(imageView, aob.F8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
                frameLayout.addView(imageView, tre.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                xt3 xt3Var = new xt3(parentActivity, this.resourceProvider);
                xt3Var.setTextSize(1, 16.0f);
                xt3Var.setInputType(573441);
                xt3Var.setRawInputType(573441);
                yob.D(xt3Var, aob.A6, this.resourceProvider);
                yob.l(xt3Var, 30, aob.G6, this.resourceProvider);
                xt3Var.setCursorSize(hl.L(19.0f));
                xt3Var.setCursorWidth(1.5f);
                xt3Var.setHint(ob6.M0(2131749956, null));
                yob.X(xt3Var, aob.E8, this.resourceProvider);
                xt3Var.setBackground(null);
                frameLayout.addView(xt3Var, tre.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                xt3Var.addTextChangedListener(new ry(strArr, d34Var, false, (byte) 12));
                fu5Var.q(frameLayout, tre.o(-1, 44));
                fu5Var.j();
            }
            fu5Var.p(d34Var);
            p0(this.G, fu5Var);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().H0) && vm2.h(getThemedColor(aob.a7)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        if (j == yac.h(this.currentAccount).e()) {
            this.e.q(tL_starGiftUnique);
            if (j == yac.h(this.currentAccount).e()) {
                d31 b0 = d31.b0(this);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = ob6.M0(2131752868, null);
                StringBuilder sb = new StringBuilder();
                sb.append(tL_starGiftUnique.title);
                sb.append(" #");
                v21 O = b0.O(document, M0, ob6.a0(null, null, 2131752869, qu6.m(tL_starGiftUnique.num, ',', sb)));
                O.s = false;
                O.j();
            } else {
                v21 O2 = d31.b0(this).O(tL_starGiftUnique.getDocument(), ob6.M0(2131752866, null), ob6.a0(null, null, 2131752867, wf3.r(this.currentAccount, j)));
                O2.s = false;
                O2.j();
            }
            this.O.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        nc9 nc9Var = new nc9(bundle, tL_starGiftUnique, j);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).b) {
            Dialog dialog = this.parentDialog;
            if ((dialog instanceof nx0) && z) {
                ((nx0) dialog).O0 = true;
            }
            finishFragment();
            e S = LaunchActivity.S();
            if (S != null) {
                S.presentFragment(nc9Var, false, z);
            }
        } else {
            presentFragment(nc9Var, true, z);
        }
        pcc pccVar = this.f;
        if (pccVar != null) {
            pccVar.a(Boolean.valueOf(z));
        }
    }

    public final void k0(q9c[] q9cVarArr, b8c b8cVar, View view) {
        Object obj = b8cVar.H;
        if (obj instanceof TL_stars.StarGift) {
            long j = ((TL_stars.StarGift) obj).id;
            ed9 ed9Var = this.e;
            ArrayList arrayList = new ArrayList(ed9Var.b);
            if (arrayList.contains(Long.valueOf(j))) {
                if (arrayList.size() <= 1) {
                    hl.A3(-3.0f, view, null);
                    return;
                }
                arrayList.remove(Long.valueOf(j));
            } else {
                int f = uc7.s1(this.currentAccount).l4.w.f();
                if (arrayList.size() >= f) {
                    hl.A3(-3.0f, view, null);
                    d31.b0(this).Q(2131623982, 36, ob6.H(',', "Gift2ResaleCollectionsLimit", f)).j();
                    return;
                }
                arrayList.add(Long.valueOf(j));
            }
            ArrayList arrayList2 = ed9Var.b;
            if (!arrayList.isEmpty() && !arrayList.equals(arrayList2)) {
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                ed9Var.g.clear();
                ed9Var.h.clear();
                ed9Var.i.clear();
                ed9Var.k.clear();
                ed9Var.l.clear();
                ed9Var.m.clear();
                ed9Var.j = 0L;
                ed9Var.n();
                ed9Var.p();
            }
            w0();
            r0();
            q9c q9cVar = q9cVarArr[0];
            if (q9cVar != null) {
                q9cVar.g3.O(true);
            }
        }
    }

    public final void l0(b8c b8cVar) {
        Object obj = b8cVar.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            wua wuaVar = new wua(getParentActivity(), this.currentAccount, this.b, this.resourceProvider, null);
            wuaVar.n2(tL_starGiftUnique.slug, tL_starGiftUnique, this.e);
            wuaVar.M2 = new lc9(this);
            showDialog(wuaVar);
        }
    }

    public final void m0(boolean z, boolean z2) {
        float f;
        if (this.Y == z) {
            return;
        }
        this.Y = z;
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.R, f);
            this.Z = ofFloat;
            ofFloat.addUpdateListener(new jc9(this, (byte) 0));
            this.Z.setInterpolator(k43.h);
            this.Z.setDuration(420L);
            this.Z.start();
            return;
        }
        this.R = f;
        t0();
    }

    public final void o0(boolean z) {
        float f;
        if (this.S == null) {
            return;
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.U;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new jc9(this, (byte) 1));
        this.T.setDuration(220L);
        this.T.setInterpolator(k43.f);
        this.T.start();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null && jlaVar.getOccupyStatusBar()) {
            i2 = Math.max(i2, hl.m);
        }
        this.P = i2;
        this.Q = Math.max(i4, hl.n);
        if (this.h == null) {
            return;
        }
        int L = hl.L(40.0f) + eg0.f(this.P);
        int L2 = hl.L(47.0f);
        int i5 = -eg0.e(this.P);
        int i6 = (-eg0.e(this.Q)) - L2;
        hl.v3(this.h, hl.L(7.33f), i5, hl.L(7.33f), i6);
        this.h.setPadding(0, (hl.L(4.0f) + L) - i5, 0, (hl.L(56.0f) + this.Q) - i6);
        this.n.getLayoutParams().height = hl.L(6.0f) + L;
        this.n.requestLayout();
        hl.v3(this.x, 0, a.getCurrentActionBarHeight() + this.P, 0, 0);
        ((FrameLayout.LayoutParams) this.s.getLayoutParams()).bottomMargin = this.Q;
        ((FrameLayout.LayoutParams) this.r.getLayoutParams()).bottomMargin = this.Q;
        this.s.requestLayout();
        this.r.requestLayout();
        t0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int p1 = aob.p1(0.1f, getThemedColor(aob.Fi));
            if (p1 != this.a0) {
                this.a0 = p1;
                TextView textView = this.w;
                if (textView != null) {
                    aob.F1(textView.getBackground(), p1, true);
                }
                LinearLayout linearLayout = this.b0;
                if (linearLayout != null) {
                    aob.F1(linearLayout.getBackground(), p1, true);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void p0(wc9 wc9Var, fu5 fu5Var) {
        if (!(wc9Var.getParent() instanceof FrameLayout)) {
            fu5Var.a0();
        } else {
            q0((FrameLayout) wc9Var.getParent(), wc9Var, true, fu5Var);
        }
    }

    public final void q0(FrameLayout frameLayout, View view, boolean z, fu5 fu5Var) {
        ula simpleMenuOverlay = getSimpleMenuOverlay();
        ez4 ez4Var = this.W;
        if (ez4Var == null) {
            ez4Var = new ez4(getBaseSimpleGlass(), this.V, this.resourceProvider, hl.L(6.0f));
            this.W = ez4Var;
        }
        if (!ez4Var.e(frameLayout, view, z, simpleMenuOverlay, fu5Var)) {
            fu5Var.a0();
        } else {
            simpleMenuOverlay.setOnClosed(new vc(fu5Var.A, (byte) 5));
        }
    }

    public final void r0() {
        String H;
        if (this.G == null) {
            return;
        }
        int size = this.e.b.size();
        wc9 wc9Var = this.G;
        if (size <= 1) {
            H = ob6.M0(2131749975, null);
        } else {
            H = ob6.H(',', "Gift2ResaleFilterCollections", size);
        }
        wc9Var.setValue(H);
    }

    public final void s0(boolean z) {
        float f;
        float f2;
        ir8 ir8Var = this.x;
        if (ir8Var == null || this.y == z) {
            return;
        }
        this.y = z;
        ir8Var.setVisibility(0);
        ViewPropertyAnimator animate = this.x.animate();
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.95f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f2);
        if (!z) {
            f3 = 0.95f;
        }
        scaleX.scaleY(f3).setInterpolator(k43.h).setDuration(320L).setListener(new gf4((byte) 27, this, z)).start();
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            this.s.setTranslationY((-hl.L(52.0f)) * f);
            zp4.d(this.r, f);
        }
    }

    public final void t0() {
        int i;
        if (this.E == null) {
            return;
        }
        float f = this.R;
        float L = hl.L(47.0f) * f;
        this.E.setTranslationY((eg0.f(this.P) - hl.L(6.0f)) - L);
        this.E.setAlpha(1.0f - f);
        HorizontalScrollView horizontalScrollView = this.E;
        if (f >= 1.0f) {
            i = 8;
        } else {
            i = 0;
        }
        horizontalScrollView.setVisibility(i);
        float f2 = -L;
        this.h.setTranslationY(f2);
        this.n.setTranslationY(f2);
    }

    public final void u0() {
        String H;
        jla jlaVar = this.simpleActionBar;
        if (jlaVar == null) {
            return;
        }
        int i = this.e.f;
        if (i <= 0) {
            H = ob6.M0(2131749954, null);
        } else {
            H = ob6.H(',', "Gift2ListingsCount", i);
        }
        jlaVar.setSubtitle(H);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        if (this.simpleActionBar == null) {
            return;
        }
        ArrayList arrayList = this.e.b;
        int size = arrayList.size();
        String str = null;
        String str2 = this.d;
        if (size == 1) {
            int i = 0;
            long longValue = ((Long) arrayList.get(0)).longValue();
            ArrayList arrayList2 = jxa.v(this.currentAccount, false).H;
            int size2 = arrayList2.size();
            while (true) {
                if (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    if (starGift.id == longValue && !TextUtils.isEmpty(starGift.title)) {
                        str = starGift.title;
                        break;
                    }
                } else if (longValue == this.c) {
                    str = str2;
                }
            }
        }
        if (str == null) {
            if (arrayList.size() != 1) {
                str2 = ob6.H(',', "Gift2ResaleCollectionsTitle", arrayList.size());
            }
            str = str2;
        }
        this.simpleActionBar.setTitle(str);
    }

    @Override
    public final void v0(float f, int i) {
    }
}
