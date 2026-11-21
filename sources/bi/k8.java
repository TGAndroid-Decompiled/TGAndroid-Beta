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
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
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
public class k8 extends org.telegram.ui.ActionBar.g2 implements te.b {
    public static final ArrayList U = new ArrayList();
    public LinearLayout E;
    public p7 F;
    public p7 G;
    public p7 H;
    public p7 I;
    public wz J;
    public int K;
    public int L;
    public float M;
    public gh.e N;
    public final q7 O;
    public op P;
    public boolean Q;
    public ValueAnimator R;
    public int S;
    public LinearLayout T;
    public final te.a f3796a;
    public final long f3797b;
    public final String f3798c;
    public final y7 d;
    public x10 f3799e;
    public j7 f3800f;
    public View h;
    public FrameLayout f3801n;
    public FrameLayout f3802r;
    public TextView f3803s;
    public t2 f3804w;
    public boolean f3805x;
    public HorizontalScrollView f3806y;

    public k8(long j3, String str, long j10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null);
        this.f3796a = new te.a(0, this, nr.h, 380L, false);
        ?? obj = new Object();
        obj.f4038e = this;
        this.O = obj;
        boolean z10 = true;
        this.Q = true;
        this.f3797b = j3;
        this.f3798c = str;
        this.resourceProvider = h6Var;
        y7 y7Var = new y7(this.currentAccount, j10, new u6(this, 0));
        z10 = (j3 == 0 || j3 == j10.i(y7Var.f4293a).e()) ? false : z10;
        y7Var.v = z10;
        if (z10) {
            y7Var.j();
        }
        this.d = y7Var;
        y7Var.l(false);
    }

    public static void Z(k8 k8Var, Context context) {
        y7 y7Var = k8Var.d;
        if (!k8Var.Q || y7Var.f4297f.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(k8Var, k8Var.G, false, false);
        a70Var.f33386t = false;
        a70Var.f33354b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33378p = new f6(a70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(y7Var.f4297f);
        Collections.sort(arrayList, new y6(k8Var, 2));
        j7 j7Var = new j7(k8Var, new z6(k8Var, strArr, arrayList, 2), new a7(k8Var, r14, 2), null, 1);
        j7Var.f35796g3.f34068r = false;
        h51[] h51VarArr = {j7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, k8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, k8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, k8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, k8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(gd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, k8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, j7Var, false, 1));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, ma.o(-1, 44));
            a70Var.k();
        }
        if (!y7Var.f4300j.isEmpty()) {
            a70Var.c(2131232359, gd.N0(2131745474, null), new b7(k8Var, h51VarArr, a70Var, 2), false);
        }
        a70Var.q(j7Var);
        k8Var.i0(k8Var.G, a70Var);
    }

    public static void a0(k8 k8Var, Context context) {
        y7 y7Var = k8Var.d;
        if (!k8Var.Q || y7Var.f4298g.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(k8Var, k8Var.H, false, false);
        a70Var.f33386t = false;
        a70Var.f33354b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33378p = new f6(a70Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(y7Var.f4298g);
        Collections.sort(arrayList, new y6(k8Var, 1));
        j7 j7Var = new j7(k8Var, new z6(k8Var, strArr, arrayList, 1), new a7(k8Var, r14, 1), null, 2);
        j7Var.f35796g3.f34068r = false;
        h51[] h51VarArr = {j7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, k8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, k8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, k8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, k8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(gd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, k8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, j7Var, false, 2));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, ma.o(-1, 44));
            a70Var.k();
        }
        if (!y7Var.f4301k.isEmpty()) {
            a70Var.c(2131232359, gd.N0(2131745474, null), new b7(k8Var, h51VarArr, a70Var, 1), false);
        }
        a70Var.q(j7Var);
        k8Var.i0(k8Var.H, a70Var);
    }

    public static void b0(k8 k8Var, Context context) {
        y7 y7Var = k8Var.d;
        if (!k8Var.Q || y7Var.h.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(k8Var, k8Var.I, false, false);
        a70Var.f33386t = false;
        a70Var.f33354b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33378p = new f6(a70Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(y7Var.h);
        Collections.sort(arrayList, new y6(k8Var, 0));
        j7 j7Var = new j7(k8Var, new z6(k8Var, strArr, arrayList, 0), new a7(k8Var, r13, 0), null, 3);
        j7Var.f35796g3.f34068r = false;
        h51[] h51VarArr = {j7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, k8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, k8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, k8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, k8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(gd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, k8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, j7Var, false, 3));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, ma.o(-1, 44));
            a70Var.k();
        }
        if (!y7Var.f4302l.isEmpty()) {
            a70Var.c(2131232359, gd.N0(2131745474, null), new b7(k8Var, h51VarArr, a70Var, 0), false);
        }
        a70Var.q(j7Var);
        k8Var.i0(k8Var.I, a70Var);
    }

    public static void c0(k8 k8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == j10.i(k8Var.currentAccount).e()) {
            k8Var.d.n(tL_starGiftUnique);
            if (j3 == j10.i(k8Var.currentAccount).e()) {
                lc b02 = lc.b0(k8Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String N0 = gd.N0(2131752875, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                gc O = b02.O(document, N0, gd.a0(null, null, 2131752876, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
                O.f35516r = false;
                O.j();
            } else {
                gc O2 = lc.b0(k8Var).O(tL_starGiftUnique.getDocument(), gd.N0(2131752873, null), gd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(k8Var.currentAccount, j3)));
                O2.f35516r = false;
                O2.j();
            }
            k8Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        i7 i7Var = new i7(bundle, tL_starGiftUnique, j3);
        org.telegram.ui.ActionBar.r4 r4Var = k8Var.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).f28710b) {
            Dialog dialog = k8Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.w2) && z10) {
                ((org.telegram.ui.ActionBar.w2) dialog).O0 = true;
            }
            k8Var.finishFragment();
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(i7Var, false, z10);
            }
        } else {
            k8Var.presentFragment(i7Var, true, z10);
        }
        x10 x10Var = k8Var.f3799e;
        if (x10Var != null) {
            x10Var.a(Boolean.valueOf(z10));
        }
    }

    public static void e0(k8 k8Var, o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            di.f6 f6Var = new di.f6(k8Var.getParentActivity(), k8Var.currentAccount, k8Var.f3797b, k8Var.resourceProvider, null);
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, k8Var.d);
            f6Var.N2 = new e7(k8Var);
            k8Var.showDialog(f6Var);
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f3802r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            c10.d(this.f3801n, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new v1(this, 2));
        this.simpleActionBar.setTitle(this.f3798c);
        l0();
        FrameLayout du0Var = new du0(context, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29321a7, du0Var, getResourceProvider());
        this.fragmentView = du0Var;
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        j7 j7Var = new j7(this, new b(this, 9), new e7(this), new a3.l(this, 22), 0);
        this.f3800f = j7Var;
        j7Var.f35796g3.f34068r = false;
        j7Var.setSpanCount(3);
        this.f3800f.j(new u1(this, 1));
        du0Var.addView(this.f3800f, ma.e(-1, -1, 119));
        t2 t2Var = new t2(context, new View.OnClickListener(this) {
            public final k8 f4191b;

            {
                this.f4191b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        y7 y7Var = this.f4191b.d;
                        y7Var.f4301k.clear();
                        y7Var.f4300j.clear();
                        y7Var.f4302l.clear();
                        y7Var.m();
                        return;
                    default:
                        k8 k8Var = this.f4191b;
                        y7 y7Var2 = k8Var.d;
                        HashSet hashSet = y7Var2.f4301k;
                        HashSet hashSet2 = y7Var2.f4302l;
                        HashSet hashSet3 = y7Var2.f4300j;
                        boolean z11 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z12 = y7Var2.f4308r;
                            boolean z13 = y7Var2.f4309s;
                            boolean z14 = y7Var2.f4310t;
                            y7Var2.j();
                            if (z12 == y7Var2.f4308r && z13 == y7Var2.f4309s && z14 == y7Var2.f4310t) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            y7Var2.f4308r = z12;
                            y7Var2.f4309s = z13;
                            y7Var2.f4310t = z14;
                            if (!z10) {
                                z11 = true;
                            }
                        }
                        y7Var2.f4301k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z11) {
                            y7Var2.f4308r = y7Var2.g();
                            y7Var2.f4309s = y7Var2.h();
                            y7Var2.f4310t = y7Var2.f();
                        } else {
                            y7Var2.j();
                        }
                        op opVar = k8Var.P;
                        if (opVar != null) {
                            opVar.a(y7Var2.k(), true);
                        }
                        y7Var2.m();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f3804w = t2Var;
        this.f3805x = false;
        t2Var.setAlpha(0.0f);
        this.f3804w.setScaleX(0.95f);
        this.f3804w.setScaleY(0.95f);
        this.f3804w.setVisibility(8);
        du0Var.addView(this.f3804w, ma.e(-1, -1, 119));
        y7 y7Var = this.d;
        if (y7Var.d.isEmpty() && !y7Var.f4314y && y7Var.f4315z) {
            j0(true);
        }
        View view = new View(context);
        this.h = view;
        du0Var.addView(view, ma.e(-1, 0, 48));
        baseSimpleGlass.f(du0Var, this.f3800f, this.simpleActionBar, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.f56657c;
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        m7 m7Var = new m7(this.currentAccount, context, this.resourceProvider);
        fh.g c10 = cVar.c(m7Var, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        m7Var.setBackground(c10);
        ra.a(m7Var);
        m7Var.setOnClickListener(new ai.x2(5, this, m7Var));
        m7Var.setOnWidthChanged(new u6(this, 1));
        this.simpleActionBar.addView(m7Var, ma.e(-2, 58, 5));
        this.N = c8.i0.m(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        this.E.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f3806y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f3806y.setOverScrollMode(2);
        this.f3806y.addView(this.E);
        this.f3806y.setClipChildren(false);
        du0Var.addView(this.f3806y, ma.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final op opVar = new op(24, context, this.resourceProvider);
        this.P = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f29488j7, org.telegram.ui.ActionBar.m6.f29508k7);
        opVar.setDrawUnchecked(true);
        opVar.a(y7Var.k(), false);
        opVar.setDrawBackgroundAsArc(10);
        opVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        opVar.setScaleX(0.8f);
        opVar.setScaleY(0.8f);
        linearLayout2.addView(opVar, ma.r(26, 26, 16));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, this.resourceProvider);
        i5.c.r(14.0f, 1, 2131749437, textView, null);
        linearLayout2.addView(textView, ma.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.m6.k0(L, L, L, L, 0, r12, r12));
        this.T = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3802r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.f3802r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.i0.m(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.f3802r.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f4221b;

            {
                this.f4221b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        final k8 k8Var = this.f4221b;
                        y7 y7Var2 = k8Var.d;
                        if (k8Var.Q) {
                            a70 I = a70.I(k8Var, k8Var.F);
                            I.c(2131231891, gd.N0(2131745943, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            k8Var.d.p(x7.f4253a);
                                            return;
                                        case 1:
                                            k8Var.d.p(x7.f4254b);
                                            return;
                                        default:
                                            k8Var.d.p(x7.f4255c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231889, gd.N0(2131745947, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            k8Var.d.p(x7.f4253a);
                                            return;
                                        case 1:
                                            k8Var.d.p(x7.f4254b);
                                            return;
                                        default:
                                            k8Var.d.p(x7.f4255c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231890, gd.N0(2131745945, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            k8Var.d.p(x7.f4253a);
                                            return;
                                        case 1:
                                            k8Var.d.p(x7.f4254b);
                                            return;
                                        default:
                                            k8Var.d.p(x7.f4255c);
                                            return;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.r rVar = new ai.r(k8Var, I, opVar, y0VarArr, 3);
                            if (y7Var2.h()) {
                                boolean z10 = y7Var2.f4309s;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                y7 y7Var3 = k8Var.d;
                                                y7Var3.o(y7Var3.f4308r, !y7Var3.f4309s, y7Var3.f4310t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                y7 y7Var4 = k8Var.d;
                                                y7Var4.o(!y7Var4.f4308r, y7Var4.f4309s, y7Var4.f4310t);
                                                rVar.run();
                                                return;
                                            default:
                                                y7 y7Var5 = k8Var.d;
                                                y7Var5.o(y7Var5.f4308r, y7Var5.f4309s, !y7Var5.f4310t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, gd.N0(2131749439, null), z10);
                                y0VarArr[2] = I.z();
                            }
                            if (y7Var2.g()) {
                                boolean z11 = y7Var2.f4308r;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                y7 y7Var3 = k8Var.d;
                                                y7Var3.o(y7Var3.f4308r, !y7Var3.f4309s, y7Var3.f4310t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                y7 y7Var4 = k8Var.d;
                                                y7Var4.o(!y7Var4.f4308r, y7Var4.f4309s, y7Var4.f4310t);
                                                rVar.run();
                                                return;
                                            default:
                                                y7 y7Var5 = k8Var.d;
                                                y7Var5.o(y7Var5.f4308r, y7Var5.f4309s, !y7Var5.f4310t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, gd.N0(2131749441, null), z11);
                                y0VarArr[1] = I.z();
                            }
                            if (y7Var2.f()) {
                                boolean z12 = y7Var2.f4310t;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                y7 y7Var3 = k8Var.d;
                                                y7Var3.o(y7Var3.f4308r, !y7Var3.f4309s, y7Var3.f4310t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                y7 y7Var4 = k8Var.d;
                                                y7Var4.o(!y7Var4.f4308r, y7Var4.f4309s, y7Var4.f4310t);
                                                rVar.run();
                                                return;
                                            default:
                                                y7 y7Var5 = k8Var.d;
                                                y7Var5.o(y7Var5.f4308r, y7Var5.f4309s, !y7Var5.f4310t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, gd.N0(2131749438, null), z12);
                                y0VarArr[3] = I.z();
                            }
                            I.f33386t = false;
                            I.f33354b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k8Var.i0(k8Var.F, I);
                            return;
                        }
                        return;
                    default:
                        y7 y7Var3 = this.f4221b.d;
                        if (y7Var3 != null) {
                            if (y7Var3.k()) {
                                y7Var3.o(true, true, true);
                            } else {
                                y7Var3.o(true, false, false);
                            }
                            opVar.a(y7Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f3802r.addView(linearLayout2, ma.c(-1.0f, -2));
        ra.b(this.f3802r, 0.04f, 1.5f);
        du0Var.addView(this.f3802r, ma.e(-2, 56, 81));
        if (!y7Var.g() || (!y7Var.h() && !y7Var.f())) {
            this.f3802r.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3801n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.f3801n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.i0.m(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        du0Var.addView(this.f3801n, ma.e(-2, 60, 81));
        this.f3803s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new nq(2131232097, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131749997, null));
        this.f3803s.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.t6.U(this.f3803s, i7, getResourceProvider());
        this.f3803s.setTypeface(org.telegram.messenger.g0.o());
        this.f3803s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f3803s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
        textView2.setBackground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.f3803s.setGravity(17);
        this.f3801n.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f4191b;

            {
                this.f4191b = this;
            }

            @Override
            public final void onClick(View view5) {
                boolean z10;
                switch (r2) {
                    case 0:
                        y7 y7Var2 = this.f4191b.d;
                        y7Var2.f4301k.clear();
                        y7Var2.f4300j.clear();
                        y7Var2.f4302l.clear();
                        y7Var2.m();
                        return;
                    default:
                        k8 k8Var = this.f4191b;
                        y7 y7Var22 = k8Var.d;
                        HashSet hashSet = y7Var22.f4301k;
                        HashSet hashSet2 = y7Var22.f4302l;
                        HashSet hashSet3 = y7Var22.f4300j;
                        boolean z11 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z12 = y7Var22.f4308r;
                            boolean z13 = y7Var22.f4309s;
                            boolean z14 = y7Var22.f4310t;
                            y7Var22.j();
                            if (z12 == y7Var22.f4308r && z13 == y7Var22.f4309s && z14 == y7Var22.f4310t) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            y7Var22.f4308r = z12;
                            y7Var22.f4309s = z13;
                            y7Var22.f4310t = z14;
                            if (!z10) {
                                z11 = true;
                            }
                        }
                        y7Var22.f4301k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z11) {
                            y7Var22.f4308r = y7Var22.g();
                            y7Var22.f4309s = y7Var22.h();
                            y7Var22.f4310t = y7Var22.f();
                        } else {
                            y7Var22.j();
                        }
                        op opVar2 = k8Var.P;
                        if (opVar2 != null) {
                            opVar2.a(y7Var22.k(), true);
                        }
                        y7Var22.m();
                        return;
                }
            }
        });
        this.f3801n.addView(this.f3803s, ma.c(-1.0f, -2));
        this.f3801n.setVisibility(8);
        ra.b(this.f3801n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        p7 p7Var = new p7(context, this.resourceProvider, true);
        this.F = p7Var;
        p7Var.setSorting(y7Var.f4306p);
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f4221b;

            {
                this.f4221b = this;
            }

            @Override
            public final void onClick(View view42) {
                switch (r3) {
                    case 0:
                        final k8 k8Var = this.f4221b;
                        y7 y7Var2 = k8Var.d;
                        if (k8Var.Q) {
                            a70 I = a70.I(k8Var, k8Var.F);
                            I.c(2131231891, gd.N0(2131745943, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            k8Var.d.p(x7.f4253a);
                                            return;
                                        case 1:
                                            k8Var.d.p(x7.f4254b);
                                            return;
                                        default:
                                            k8Var.d.p(x7.f4255c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231889, gd.N0(2131745947, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            k8Var.d.p(x7.f4253a);
                                            return;
                                        case 1:
                                            k8Var.d.p(x7.f4254b);
                                            return;
                                        default:
                                            k8Var.d.p(x7.f4255c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231890, gd.N0(2131745945, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            k8Var.d.p(x7.f4253a);
                                            return;
                                        case 1:
                                            k8Var.d.p(x7.f4254b);
                                            return;
                                        default:
                                            k8Var.d.p(x7.f4255c);
                                            return;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.r rVar = new ai.r(k8Var, I, opVar, y0VarArr, 3);
                            if (y7Var2.h()) {
                                boolean z10 = y7Var2.f4309s;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                y7 y7Var3 = k8Var.d;
                                                y7Var3.o(y7Var3.f4308r, !y7Var3.f4309s, y7Var3.f4310t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                y7 y7Var4 = k8Var.d;
                                                y7Var4.o(!y7Var4.f4308r, y7Var4.f4309s, y7Var4.f4310t);
                                                rVar.run();
                                                return;
                                            default:
                                                y7 y7Var5 = k8Var.d;
                                                y7Var5.o(y7Var5.f4308r, y7Var5.f4309s, !y7Var5.f4310t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, gd.N0(2131749439, null), z10);
                                y0VarArr[2] = I.z();
                            }
                            if (y7Var2.g()) {
                                boolean z11 = y7Var2.f4308r;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                y7 y7Var3 = k8Var.d;
                                                y7Var3.o(y7Var3.f4308r, !y7Var3.f4309s, y7Var3.f4310t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                y7 y7Var4 = k8Var.d;
                                                y7Var4.o(!y7Var4.f4308r, y7Var4.f4309s, y7Var4.f4310t);
                                                rVar.run();
                                                return;
                                            default:
                                                y7 y7Var5 = k8Var.d;
                                                y7Var5.o(y7Var5.f4308r, y7Var5.f4309s, !y7Var5.f4310t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, gd.N0(2131749441, null), z11);
                                y0VarArr[1] = I.z();
                            }
                            if (y7Var2.f()) {
                                boolean z12 = y7Var2.f4310t;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                y7 y7Var3 = k8Var.d;
                                                y7Var3.o(y7Var3.f4308r, !y7Var3.f4309s, y7Var3.f4310t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                y7 y7Var4 = k8Var.d;
                                                y7Var4.o(!y7Var4.f4308r, y7Var4.f4309s, y7Var4.f4310t);
                                                rVar.run();
                                                return;
                                            default:
                                                y7 y7Var5 = k8Var.d;
                                                y7Var5.o(y7Var5.f4308r, y7Var5.f4309s, !y7Var5.f4310t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, gd.N0(2131749438, null), z12);
                                y0VarArr[3] = I.z();
                            }
                            I.f33386t = false;
                            I.f33354b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            k8Var.i0(k8Var.F, I);
                            return;
                        }
                        return;
                    default:
                        y7 y7Var3 = this.f4221b.d;
                        if (y7Var3 != null) {
                            if (y7Var3.k()) {
                                y7Var3.o(true, true, true);
                            } else {
                                y7Var3.o(true, false, false);
                            }
                            opVar.a(y7Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        p7 p7Var2 = new p7(context, this.resourceProvider, true);
        this.G = p7Var2;
        p7Var2.setValue(gd.N0(2131750370, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f4251b;

            {
                this.f4251b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        k8.Z(this.f4251b, context);
                        return;
                    case 1:
                        k8.a0(this.f4251b, context);
                        return;
                    default:
                        k8.b0(this.f4251b, context);
                        return;
                }
            }
        });
        p7 p7Var3 = new p7(context, this.resourceProvider, true);
        this.H = p7Var3;
        p7Var3.setValue(gd.N0(2131750371, null));
        g0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f4251b;

            {
                this.f4251b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        k8.Z(this.f4251b, context);
                        return;
                    case 1:
                        k8.a0(this.f4251b, context);
                        return;
                    default:
                        k8.b0(this.f4251b, context);
                        return;
                }
            }
        });
        p7 p7Var4 = new p7(context, this.resourceProvider, true);
        this.I = p7Var4;
        p7Var4.setValue(gd.N0(2131750363, null));
        g0(this.I, true);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final k8 f4251b;

            {
                this.f4251b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        k8.Z(this.f4251b, context);
                        return;
                    case 1:
                        k8.a0(this.f4251b, context);
                        return;
                    default:
                        k8.b0(this.f4251b, context);
                        return;
                }
            }
        });
        wz wzVar = new wz(getParentActivity());
        this.J = wzVar;
        du0Var.addView(wzVar, ma.c(-1.0f, -1));
        h0(false, false);
        return du0Var;
    }

    public final void g0(p7 p7Var, boolean z10) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i7 = 0;
        fh.g c10 = getBaseSimpleGlass().f56657c.c(frameLayout, null, false);
        c10.p(this.N);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(p7Var, ma.c(40.0f, -2));
        frameLayout.setOnClickListener(new ah.d(p7Var, 7));
        ra.a(frameLayout);
        LinearLayout linearLayout = this.E;
        if (!z10) {
            i7 = -4;
        }
        linearLayout.addView(frameLayout, ma.t(-2, -2, 16, 0, 0, i7, 0));
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

    public final void i0(p7 p7Var, a70 a70Var) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.j5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null && (a70Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && (p7Var.getParent() instanceof FrameLayout)) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) a70Var.A;
            FrameLayout frameLayout2 = (FrameLayout) p7Var.getParent();
            q7 q7Var = this.O;
            if (q7Var.f4035a && (frameLayout = (FrameLayout) q7Var.f4036b) != null && frameLayout != frameLayout2) {
                frameLayout.setVisibility(0);
            }
            q7Var.f4036b = frameLayout2;
            q7Var.f4037c = p7Var;
            q7Var.d = simpleMenuOverlay;
            a70Var.f33378p = new f7(simpleMenuOverlay, 0);
            simpleMenuOverlay.setOnClosed(new g7(actionBarPopupWindow$ActionBarPopupWindowLayout, 0));
            simpleMenuOverlay.d(q7Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
            return;
        }
        a70Var.a0();
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().H0) && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.m6.f29321a7)) > 0.699999988079071d) {
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
        t2 t2Var = this.f3804w;
        if (t2Var == null || this.f3805x == z10) {
            return;
        }
        this.f3805x = z10;
        t2Var.setVisibility(0);
        ViewPropertyAnimator animate = this.f3804w.animate();
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
        scaleX.scaleY(f12).setInterpolator(nr.h).setDuration(320L).setListener(new h7(0, this, z10)).start();
    }

    public final void k0() {
        int i7;
        if (this.f3806y == null) {
            return;
        }
        float f10 = this.M;
        float L = org.telegram.messenger.g0.L(47.0f) * f10;
        this.f3806y.setTranslationY((ri.a.d(this.K) - org.telegram.messenger.g0.L(6.0f)) - L);
        this.f3806y.setAlpha(1.0f - f10);
        HorizontalScrollView horizontalScrollView = this.f3806y;
        if (f10 >= 1.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        horizontalScrollView.setVisibility(i7);
        float f11 = -L;
        this.f3800f.setTranslationY(f11);
        this.h.setTranslationY(f11);
    }

    public final void l0() {
        String H;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var == null) {
            return;
        }
        int i7 = this.d.f4296e;
        if (i7 <= 0) {
            H = gd.N0(2131749990, null);
        } else {
            H = gd.H(',', "Gift2ListingsCount", i7);
        }
        z4Var.setSubtitle(H);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var != null && z4Var.getOccupyStatusBar()) {
            i10 = Math.max(i10, org.telegram.messenger.g0.f24140m);
        }
        this.K = i10;
        this.L = Math.max(i12, org.telegram.messenger.g0.f24141n);
        if (this.f3800f == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(40.0f) + ri.a.d(this.K);
        int L2 = org.telegram.messenger.g0.L(47.0f);
        int i13 = -ri.a.c(this.K);
        int i14 = (-ri.a.c(this.L)) - L2;
        org.telegram.messenger.g0.z3(this.f3800f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f3800f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.L) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.z3(this.f3804w, 0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.f3802r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.f3801n.getLayoutParams()).bottomMargin = this.L;
        this.f3802r.requestLayout();
        this.f3801n.requestLayout();
        k0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
            if (r12 != this.S) {
                this.S = r12;
                TextView textView = this.f3803s;
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
