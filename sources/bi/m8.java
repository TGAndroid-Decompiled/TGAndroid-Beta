package bi;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import c8.sa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.wz;
import org.telegram.ui.LaunchActivity;
public class m8 extends org.telegram.ui.ActionBar.g2 implements te.b {
    public static final ArrayList U = new ArrayList();
    public LinearLayout E;
    public r7 F;
    public r7 G;
    public r7 H;
    public r7 I;
    public wz J;
    public int K;
    public int L;
    public float M;
    public gh.e N;
    public final s7 O;
    public op P;
    public boolean Q;
    public ValueAnimator R;
    public int S;
    public LinearLayout T;
    public final te.a f3849a;
    public final long f3850b;
    public final String f3851c;
    public final a8 d;
    public y10 f3852e;
    public l7 f3853f;
    public View h;
    public FrameLayout f3854n;
    public FrameLayout f3855r;
    public TextView f3856s;
    public v2 f3857w;
    public boolean f3858x;
    public HorizontalScrollView f3859y;

    public m8(long j3, String str, long j10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null);
        this.f3849a = new te.a(0, this, nr.h, 380L, false);
        ?? obj = new Object();
        obj.f4063e = this;
        this.O = obj;
        boolean z10 = true;
        this.Q = true;
        this.f3850b = j3;
        this.f3851c = str;
        this.resourceProvider = h6Var;
        a8 a8Var = new a8(this.currentAccount, j10, new w6(this, 0));
        z10 = (j3 == 0 || j3 == k10.i(a8Var.f3361a).e()) ? false : z10;
        a8Var.v = z10;
        if (z10) {
            a8Var.j();
        }
        this.d = a8Var;
        a8Var.l(false);
    }

    public static void Z(m8 m8Var, Context context) {
        a8 a8Var = m8Var.d;
        if (!m8Var.Q || a8Var.f3365f.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(m8Var, m8Var.G, false, false);
        a70Var.f33365t = false;
        a70Var.f33333b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33357p = new h6(a70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(a8Var.f3365f);
        Collections.sort(arrayList, new a7(m8Var, 2));
        l7 l7Var = new l7(m8Var, new b7(m8Var, strArr, arrayList, 2), new c7(m8Var, r14, 2), null, 1);
        l7Var.f35742g3.f34026r = false;
        h51[] h51VarArr = {l7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, m8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, m8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, m8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, m8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(hd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, m8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, l7Var, false, 1));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, na.o(-1, 44));
            a70Var.k();
        }
        if (!a8Var.f3368j.isEmpty()) {
            a70Var.c(2131232359, hd.N0(2131745474, null), new d7(m8Var, h51VarArr, a70Var, 2), false);
        }
        a70Var.q(l7Var);
        m8Var.i0(m8Var.G, a70Var);
    }

    public static void a0(m8 m8Var, Context context) {
        a8 a8Var = m8Var.d;
        if (!m8Var.Q || a8Var.f3366g.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(m8Var, m8Var.H, false, false);
        a70Var.f33365t = false;
        a70Var.f33333b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33357p = new h6(a70Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(a8Var.f3366g);
        Collections.sort(arrayList, new a7(m8Var, 1));
        l7 l7Var = new l7(m8Var, new b7(m8Var, strArr, arrayList, 1), new c7(m8Var, r14, 1), null, 2);
        l7Var.f35742g3.f34026r = false;
        h51[] h51VarArr = {l7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, m8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, m8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, m8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, m8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(hd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, m8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, l7Var, false, 2));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, na.o(-1, 44));
            a70Var.k();
        }
        if (!a8Var.f3369k.isEmpty()) {
            a70Var.c(2131232359, hd.N0(2131745474, null), new d7(m8Var, h51VarArr, a70Var, 1), false);
        }
        a70Var.q(l7Var);
        m8Var.i0(m8Var.H, a70Var);
    }

    public static void b0(m8 m8Var, Context context) {
        a8 a8Var = m8Var.d;
        if (!m8Var.Q || a8Var.h.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(m8Var, m8Var.I, false, false);
        a70Var.f33365t = false;
        a70Var.f33333b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33357p = new h6(a70Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(a8Var.h);
        Collections.sort(arrayList, new a7(m8Var, 0));
        l7 l7Var = new l7(m8Var, new b7(m8Var, strArr, arrayList, 0), new c7(m8Var, r13, 0), null, 3);
        l7Var.f35742g3.f34026r = false;
        h51[] h51VarArr = {l7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, m8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, na.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, m8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, m8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, m8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(hd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, m8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, na.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, l7Var, false, 3));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, na.o(-1, 44));
            a70Var.k();
        }
        if (!a8Var.f3370l.isEmpty()) {
            a70Var.c(2131232359, hd.N0(2131745474, null), new d7(m8Var, h51VarArr, a70Var, 0), false);
        }
        a70Var.q(l7Var);
        m8Var.i0(m8Var.I, a70Var);
    }

    public static void c0(m8 m8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == k10.i(m8Var.currentAccount).e()) {
            m8Var.d.n(tL_starGiftUnique);
            if (j3 == k10.i(m8Var.currentAccount).e()) {
                lc b02 = lc.b0(m8Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String N0 = hd.N0(2131752875, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                gc O = b02.O(document, N0, hd.a0(null, null, 2131752876, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
                O.f35497r = false;
                O.j();
            } else {
                gc O2 = lc.b0(m8Var).O(tL_starGiftUnique.getDocument(), hd.N0(2131752873, null), hd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(m8Var.currentAccount, j3)));
                O2.f35497r = false;
                O2.j();
            }
            m8Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        k7 k7Var = new k7(bundle, tL_starGiftUnique, j3);
        org.telegram.ui.ActionBar.r4 r4Var = m8Var.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).f28679b) {
            Dialog dialog = m8Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.w2) && z10) {
                ((org.telegram.ui.ActionBar.w2) dialog).O0 = true;
            }
            m8Var.finishFragment();
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(k7Var, false, z10);
            }
        } else {
            m8Var.presentFragment(k7Var, true, z10);
        }
        y10 y10Var = m8Var.f3852e;
        if (y10Var != null) {
            y10Var.a(Boolean.valueOf(z10));
        }
    }

    public static void e0(m8 m8Var, o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            di.f6 f6Var = new di.f6(m8Var.getParentActivity(), m8Var.currentAccount, m8Var.f3850b, m8Var.resourceProvider, null);
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, m8Var.d);
            f6Var.N2 = new g7(m8Var);
            m8Var.showDialog(f6Var);
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f3855r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            c10.d(this.f3854n, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w1(this, 2));
        this.simpleActionBar.setTitle(this.f3851c);
        l0();
        FrameLayout du0Var = new du0(context, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29290a7, du0Var, getResourceProvider());
        this.fragmentView = du0Var;
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        l7 l7Var = new l7(this, new b(this, 9), new g7(this), new a3.l(this, 22), 0);
        this.f3853f = l7Var;
        l7Var.f35742g3.f34026r = false;
        l7Var.setSpanCount(3);
        this.f3853f.j(new v1(this, 1));
        du0Var.addView(this.f3853f, na.e(-1, -1, 119));
        v2 v2Var = new v2(context, new View.OnClickListener(this) {
            public final m8 f4220b;

            {
                this.f4220b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        a8 a8Var = this.f4220b.d;
                        a8Var.f3369k.clear();
                        a8Var.f3368j.clear();
                        a8Var.f3370l.clear();
                        a8Var.m();
                        return;
                    default:
                        m8 m8Var = this.f4220b;
                        a8 a8Var2 = m8Var.d;
                        HashSet hashSet = a8Var2.f3369k;
                        HashSet hashSet2 = a8Var2.f3370l;
                        HashSet hashSet3 = a8Var2.f3368j;
                        boolean z11 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z12 = a8Var2.f3376r;
                            boolean z13 = a8Var2.f3377s;
                            boolean z14 = a8Var2.f3378t;
                            a8Var2.j();
                            if (z12 == a8Var2.f3376r && z13 == a8Var2.f3377s && z14 == a8Var2.f3378t) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            a8Var2.f3376r = z12;
                            a8Var2.f3377s = z13;
                            a8Var2.f3378t = z14;
                            if (!z10) {
                                z11 = true;
                            }
                        }
                        a8Var2.f3369k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z11) {
                            a8Var2.f3376r = a8Var2.g();
                            a8Var2.f3377s = a8Var2.h();
                            a8Var2.f3378t = a8Var2.f();
                        } else {
                            a8Var2.j();
                        }
                        op opVar = m8Var.P;
                        if (opVar != null) {
                            opVar.a(a8Var2.k(), true);
                        }
                        a8Var2.m();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f3857w = v2Var;
        this.f3858x = false;
        v2Var.setAlpha(0.0f);
        this.f3857w.setScaleX(0.95f);
        this.f3857w.setScaleY(0.95f);
        this.f3857w.setVisibility(8);
        du0Var.addView(this.f3857w, na.e(-1, -1, 119));
        a8 a8Var = this.d;
        if (a8Var.d.isEmpty() && !a8Var.f3382y && a8Var.f3383z) {
            j0(true);
        }
        View view = new View(context);
        this.h = view;
        du0Var.addView(view, na.e(-1, 0, 48));
        baseSimpleGlass.f(du0Var, this.f3853f, this.simpleActionBar, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.f56626c;
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        o7 o7Var = new o7(this.currentAccount, context, this.resourceProvider);
        fh.g c10 = cVar.c(o7Var, null, false);
        c10.p(c8.j0.m(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        o7Var.setBackground(c10);
        sa.a(o7Var);
        o7Var.setOnClickListener(new ai.o2(5, this, o7Var));
        o7Var.setOnWidthChanged(new w6(this, 1));
        this.simpleActionBar.addView(o7Var, na.e(-2, 58, 5));
        this.N = c8.j0.m(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        this.E.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f3859y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f3859y.setOverScrollMode(2);
        this.f3859y.addView(this.E);
        this.f3859y.setClipChildren(false);
        du0Var.addView(this.f3859y, na.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final op opVar = new op(24, context, this.resourceProvider);
        this.P = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f29457j7, org.telegram.ui.ActionBar.m6.f29477k7);
        opVar.setDrawUnchecked(true);
        opVar.a(a8Var.k(), false);
        opVar.setDrawBackgroundAsArc(10);
        opVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        opVar.setScaleX(0.8f);
        opVar.setScaleY(0.8f);
        linearLayout2.addView(opVar, na.r(26, 26, 16));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, this.resourceProvider);
        i5.c.r(14.0f, 1, 2131749437, textView, null);
        linearLayout2.addView(textView, na.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, r12, r12));
        this.T = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3855r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.f3855r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.j0.m(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.f3855r.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f4268b;

            {
                this.f4268b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        final m8 m8Var = this.f4268b;
                        a8 a8Var2 = m8Var.d;
                        if (m8Var.Q) {
                            a70 I = a70.I(m8Var, m8Var.F);
                            I.c(2131231891, hd.N0(2131745943, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            m8Var.d.p(z7.f4308a);
                                            return;
                                        case 1:
                                            m8Var.d.p(z7.f4309b);
                                            return;
                                        default:
                                            m8Var.d.p(z7.f4310c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231889, hd.N0(2131745947, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            m8Var.d.p(z7.f4308a);
                                            return;
                                        case 1:
                                            m8Var.d.p(z7.f4309b);
                                            return;
                                        default:
                                            m8Var.d.p(z7.f4310c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231890, hd.N0(2131745945, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            m8Var.d.p(z7.f4308a);
                                            return;
                                        case 1:
                                            m8Var.d.p(z7.f4309b);
                                            return;
                                        default:
                                            m8Var.d.p(z7.f4310c);
                                            return;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.m mVar = new ai.m(m8Var, I, opVar, y0VarArr, 3);
                            if (a8Var2.h()) {
                                boolean z10 = a8Var2.f3377s;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.f3376r, !a8Var3.f3377s, a8Var3.f3378t);
                                                mVar.run();
                                                return;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.f3376r, a8Var4.f3377s, a8Var4.f3378t);
                                                mVar.run();
                                                return;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.f3376r, a8Var5.f3377s, !a8Var5.f3378t);
                                                mVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749439, null), z10);
                                y0VarArr[2] = I.z();
                            }
                            if (a8Var2.g()) {
                                boolean z11 = a8Var2.f3376r;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.f3376r, !a8Var3.f3377s, a8Var3.f3378t);
                                                mVar.run();
                                                return;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.f3376r, a8Var4.f3377s, a8Var4.f3378t);
                                                mVar.run();
                                                return;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.f3376r, a8Var5.f3377s, !a8Var5.f3378t);
                                                mVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749441, null), z11);
                                y0VarArr[1] = I.z();
                            }
                            if (a8Var2.f()) {
                                boolean z12 = a8Var2.f3378t;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.f3376r, !a8Var3.f3377s, a8Var3.f3378t);
                                                mVar.run();
                                                return;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.f3376r, a8Var4.f3377s, a8Var4.f3378t);
                                                mVar.run();
                                                return;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.f3376r, a8Var5.f3377s, !a8Var5.f3378t);
                                                mVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749438, null), z12);
                                y0VarArr[3] = I.z();
                            }
                            I.f33365t = false;
                            I.f33333b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m8Var.i0(m8Var.F, I);
                            return;
                        }
                        return;
                    default:
                        a8 a8Var3 = this.f4268b.d;
                        if (a8Var3 != null) {
                            if (a8Var3.k()) {
                                a8Var3.o(true, true, true);
                            } else {
                                a8Var3.o(true, false, false);
                            }
                            opVar.a(a8Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f3855r.addView(linearLayout2, na.c(-1.0f, -2));
        sa.b(this.f3855r, 0.04f, 1.5f);
        du0Var.addView(this.f3855r, na.e(-2, 56, 81));
        if (!a8Var.g() || (!a8Var.h() && !a8Var.f())) {
            this.f3855r.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3854n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.f3854n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.j0.m(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        du0Var.addView(this.f3854n, na.e(-2, 60, 81));
        this.f3856s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new nq(2131232097, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131749997, null));
        this.f3856s.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.t6.U(this.f3856s, i7, getResourceProvider());
        this.f3856s.setTypeface(org.telegram.messenger.g0.o());
        this.f3856s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f3856s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
        textView2.setBackground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.f3856s.setGravity(17);
        this.f3854n.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f4220b;

            {
                this.f4220b = this;
            }

            @Override
            public final void onClick(View view5) {
                boolean z10;
                switch (r2) {
                    case 0:
                        a8 a8Var2 = this.f4220b.d;
                        a8Var2.f3369k.clear();
                        a8Var2.f3368j.clear();
                        a8Var2.f3370l.clear();
                        a8Var2.m();
                        return;
                    default:
                        m8 m8Var = this.f4220b;
                        a8 a8Var22 = m8Var.d;
                        HashSet hashSet = a8Var22.f3369k;
                        HashSet hashSet2 = a8Var22.f3370l;
                        HashSet hashSet3 = a8Var22.f3368j;
                        boolean z11 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z12 = a8Var22.f3376r;
                            boolean z13 = a8Var22.f3377s;
                            boolean z14 = a8Var22.f3378t;
                            a8Var22.j();
                            if (z12 == a8Var22.f3376r && z13 == a8Var22.f3377s && z14 == a8Var22.f3378t) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            a8Var22.f3376r = z12;
                            a8Var22.f3377s = z13;
                            a8Var22.f3378t = z14;
                            if (!z10) {
                                z11 = true;
                            }
                        }
                        a8Var22.f3369k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z11) {
                            a8Var22.f3376r = a8Var22.g();
                            a8Var22.f3377s = a8Var22.h();
                            a8Var22.f3378t = a8Var22.f();
                        } else {
                            a8Var22.j();
                        }
                        op opVar2 = m8Var.P;
                        if (opVar2 != null) {
                            opVar2.a(a8Var22.k(), true);
                        }
                        a8Var22.m();
                        return;
                }
            }
        });
        this.f3854n.addView(this.f3856s, na.c(-1.0f, -2));
        this.f3854n.setVisibility(8);
        sa.b(this.f3854n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        r7 r7Var = new r7(context, this.resourceProvider, true);
        this.F = r7Var;
        r7Var.setSorting(a8Var.f3374p);
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f4268b;

            {
                this.f4268b = this;
            }

            @Override
            public final void onClick(View view42) {
                switch (r3) {
                    case 0:
                        final m8 m8Var = this.f4268b;
                        a8 a8Var2 = m8Var.d;
                        if (m8Var.Q) {
                            a70 I = a70.I(m8Var, m8Var.F);
                            I.c(2131231891, hd.N0(2131745943, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            m8Var.d.p(z7.f4308a);
                                            return;
                                        case 1:
                                            m8Var.d.p(z7.f4309b);
                                            return;
                                        default:
                                            m8Var.d.p(z7.f4310c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231889, hd.N0(2131745947, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            m8Var.d.p(z7.f4308a);
                                            return;
                                        case 1:
                                            m8Var.d.p(z7.f4309b);
                                            return;
                                        default:
                                            m8Var.d.p(z7.f4310c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231890, hd.N0(2131745945, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            m8Var.d.p(z7.f4308a);
                                            return;
                                        case 1:
                                            m8Var.d.p(z7.f4309b);
                                            return;
                                        default:
                                            m8Var.d.p(z7.f4310c);
                                            return;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.m mVar = new ai.m(m8Var, I, opVar, y0VarArr, 3);
                            if (a8Var2.h()) {
                                boolean z10 = a8Var2.f3377s;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.f3376r, !a8Var3.f3377s, a8Var3.f3378t);
                                                mVar.run();
                                                return;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.f3376r, a8Var4.f3377s, a8Var4.f3378t);
                                                mVar.run();
                                                return;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.f3376r, a8Var5.f3377s, !a8Var5.f3378t);
                                                mVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749439, null), z10);
                                y0VarArr[2] = I.z();
                            }
                            if (a8Var2.g()) {
                                boolean z11 = a8Var2.f3376r;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.f3376r, !a8Var3.f3377s, a8Var3.f3378t);
                                                mVar.run();
                                                return;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.f3376r, a8Var4.f3377s, a8Var4.f3378t);
                                                mVar.run();
                                                return;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.f3376r, a8Var5.f3377s, !a8Var5.f3378t);
                                                mVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749441, null), z11);
                                y0VarArr[1] = I.z();
                            }
                            if (a8Var2.f()) {
                                boolean z12 = a8Var2.f3378t;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a8 a8Var3 = m8Var.d;
                                                a8Var3.o(a8Var3.f3376r, !a8Var3.f3377s, a8Var3.f3378t);
                                                mVar.run();
                                                return;
                                            case 1:
                                                a8 a8Var4 = m8Var.d;
                                                a8Var4.o(!a8Var4.f3376r, a8Var4.f3377s, a8Var4.f3378t);
                                                mVar.run();
                                                return;
                                            default:
                                                a8 a8Var5 = m8Var.d;
                                                a8Var5.o(a8Var5.f3376r, a8Var5.f3377s, !a8Var5.f3378t);
                                                mVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749438, null), z12);
                                y0VarArr[3] = I.z();
                            }
                            I.f33365t = false;
                            I.f33333b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m8Var.i0(m8Var.F, I);
                            return;
                        }
                        return;
                    default:
                        a8 a8Var3 = this.f4268b.d;
                        if (a8Var3 != null) {
                            if (a8Var3.k()) {
                                a8Var3.o(true, true, true);
                            } else {
                                a8Var3.o(true, false, false);
                            }
                            opVar.a(a8Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        r7 r7Var2 = new r7(context, this.resourceProvider, true);
        this.G = r7Var2;
        r7Var2.setValue(hd.N0(2131750370, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f4306b;

            {
                this.f4306b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        m8.Z(this.f4306b, context);
                        return;
                    case 1:
                        m8.a0(this.f4306b, context);
                        return;
                    default:
                        m8.b0(this.f4306b, context);
                        return;
                }
            }
        });
        r7 r7Var3 = new r7(context, this.resourceProvider, true);
        this.H = r7Var3;
        r7Var3.setValue(hd.N0(2131750371, null));
        g0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f4306b;

            {
                this.f4306b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        m8.Z(this.f4306b, context);
                        return;
                    case 1:
                        m8.a0(this.f4306b, context);
                        return;
                    default:
                        m8.b0(this.f4306b, context);
                        return;
                }
            }
        });
        r7 r7Var4 = new r7(context, this.resourceProvider, true);
        this.I = r7Var4;
        r7Var4.setValue(hd.N0(2131750363, null));
        g0(this.I, true);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final m8 f4306b;

            {
                this.f4306b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        m8.Z(this.f4306b, context);
                        return;
                    case 1:
                        m8.a0(this.f4306b, context);
                        return;
                    default:
                        m8.b0(this.f4306b, context);
                        return;
                }
            }
        });
        wz wzVar = new wz(getParentActivity());
        this.J = wzVar;
        du0Var.addView(wzVar, na.c(-1.0f, -1));
        h0(false, false);
        return du0Var;
    }

    public final void g0(r7 r7Var, boolean z10) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i7 = 0;
        fh.g c10 = getBaseSimpleGlass().f56626c.c(frameLayout, null, false);
        c10.p(this.N);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(r7Var, na.c(40.0f, -2));
        frameLayout.setOnClickListener(new ah.d(r7Var, 7));
        sa.a(frameLayout);
        LinearLayout linearLayout = this.E;
        if (!z10) {
            i7 = -4;
        }
        linearLayout.addView(frameLayout, na.t(-2, -2, 16, 0, 0, i7, 0));
    }

    public final void h0(boolean z10, boolean z11) {
        float f10;
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.R = null;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f10);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 1));
            this.R.setInterpolator(nr.h);
            this.R.setDuration(420L);
            this.R.start();
            return;
        }
        this.M = f10;
        k0();
    }

    public final void i0(r7 r7Var, a70 a70Var) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.j5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null && (a70Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && (r7Var.getParent() instanceof FrameLayout)) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) a70Var.A;
            FrameLayout frameLayout2 = (FrameLayout) r7Var.getParent();
            s7 s7Var = this.O;
            if (s7Var.f4060a && (frameLayout = (FrameLayout) s7Var.f4061b) != null && frameLayout != frameLayout2) {
                frameLayout.setVisibility(0);
            }
            s7Var.f4061b = frameLayout2;
            s7Var.f4062c = r7Var;
            s7Var.d = simpleMenuOverlay;
            a70Var.f33357p = new h7(simpleMenuOverlay, 0);
            simpleMenuOverlay.setOnClosed(new i7(actionBarPopupWindow$ActionBarPopupWindowLayout, 0));
            simpleMenuOverlay.d(s7Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
            return;
        }
        a70Var.a0();
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().H0) && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.m6.f29290a7)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        float f10;
        float f11;
        v2 v2Var = this.f3857w;
        if (v2Var == null || this.f3858x == z10) {
            return;
        }
        this.f3858x = z10;
        v2Var.setVisibility(0);
        ViewPropertyAnimator animate = this.f3857w.animate();
        float f12 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.95f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (!z10) {
            f12 = 0.95f;
        }
        scaleX.scaleY(f12).setInterpolator(nr.h).setDuration(320L).setListener(new j7(0, this, z10)).start();
    }

    public final void k0() {
        int i7;
        if (this.f3859y == null) {
            return;
        }
        float f10 = this.M;
        float L = org.telegram.messenger.g0.L(47.0f) * f10;
        this.f3859y.setTranslationY((ri.a.d(this.K) - org.telegram.messenger.g0.L(6.0f)) - L);
        this.f3859y.setAlpha(1.0f - f10);
        HorizontalScrollView horizontalScrollView = this.f3859y;
        if (f10 >= 1.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        horizontalScrollView.setVisibility(i7);
        float f11 = -L;
        this.f3853f.setTranslationY(f11);
        this.h.setTranslationY(f11);
    }

    public final void l0() {
        String H;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var == null) {
            return;
        }
        int i7 = this.d.f3364e;
        if (i7 <= 0) {
            H = hd.N0(2131749990, null);
        } else {
            H = hd.H(',', "Gift2ListingsCount", i7);
        }
        z4Var.setSubtitle(H);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null && z4Var.getOccupyStatusBar()) {
            i10 = Math.max(i10, org.telegram.messenger.g0.f24004m);
        }
        this.K = i10;
        this.L = Math.max(i12, org.telegram.messenger.g0.f24005n);
        if (this.f3853f == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(40.0f) + ri.a.d(this.K);
        int L2 = org.telegram.messenger.g0.L(47.0f);
        int i13 = -ri.a.c(this.K);
        int i14 = (-ri.a.c(this.L)) - L2;
        org.telegram.messenger.g0.z3(this.f3853f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f3853f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.L) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.z3(this.f3857w, 0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.f3855r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.f3854n.getLayoutParams()).bottomMargin = this.L;
        this.f3855r.requestLayout();
        this.f3854n.requestLayout();
        k0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
            if (r12 != this.S) {
                this.S = r12;
                TextView textView = this.f3856s;
                if (textView != null) {
                    org.telegram.ui.ActionBar.m6.H1(textView.getBackground(), r12, true);
                }
                LinearLayout linearLayout = this.T;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.m6.H1(linearLayout.getBackground(), r12, true);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
