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
public class j8 extends org.telegram.ui.ActionBar.g2 implements te.b {
    public static final ArrayList U = new ArrayList();
    public LinearLayout E;
    public o7 F;
    public o7 G;
    public o7 H;
    public o7 I;
    public wz J;
    public int K;
    public int L;
    public float M;
    public gh.e N;
    public final p7 O;
    public op P;
    public boolean Q;
    public ValueAnimator R;
    public int S;
    public LinearLayout T;
    public final te.a f3757a;
    public final long f3758b;
    public final String f3759c;
    public final x7 d;
    public y10 f3760e;
    public i7 f3761f;
    public View h;
    public FrameLayout f3762n;
    public FrameLayout f3763r;
    public TextView f3764s;
    public t2 f3765w;
    public boolean f3766x;
    public HorizontalScrollView f3767y;

    public j8(long j3, String str, long j10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(null);
        this.f3757a = new te.a(0, this, nr.h, 380L, false);
        ?? obj = new Object();
        obj.f4014e = this;
        this.O = obj;
        boolean z10 = true;
        this.Q = true;
        this.f3758b = j3;
        this.f3759c = str;
        this.resourceProvider = h6Var;
        x7 x7Var = new x7(this.currentAccount, j10, new t6(this, 0));
        z10 = (j3 == 0 || j3 == k10.i(x7Var.f4254a).e()) ? false : z10;
        x7Var.v = z10;
        if (z10) {
            x7Var.j();
        }
        this.d = x7Var;
        x7Var.l(false);
    }

    public static void Z(j8 j8Var, Context context) {
        x7 x7Var = j8Var.d;
        if (!j8Var.Q || x7Var.f4258f.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(j8Var, j8Var.G, false, false);
        a70Var.f33399t = false;
        a70Var.f33367b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33391p = new e6(a70Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(x7Var.f4258f);
        Collections.sort(arrayList, new x6(j8Var, 2));
        i7 i7Var = new i7(j8Var, new y6(j8Var, strArr, arrayList, 2), new z6(j8Var, r14, 2), null, 1);
        i7Var.f35789g3.f34062r = false;
        h51[] h51VarArr = {i7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, j8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(hd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, i7Var, false, 1));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, ma.o(-1, 44));
            a70Var.k();
        }
        if (!x7Var.f4261j.isEmpty()) {
            a70Var.c(2131232359, hd.N0(2131745474, null), new a7(j8Var, h51VarArr, a70Var, 2), false);
        }
        a70Var.q(i7Var);
        j8Var.i0(j8Var.G, a70Var);
    }

    public static void a0(j8 j8Var, Context context) {
        x7 x7Var = j8Var.d;
        if (!j8Var.Q || x7Var.f4259g.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(j8Var, j8Var.H, false, false);
        a70Var.f33399t = false;
        a70Var.f33367b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33391p = new e6(a70Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(x7Var.f4259g);
        Collections.sort(arrayList, new x6(j8Var, 1));
        i7 i7Var = new i7(j8Var, new y6(j8Var, strArr, arrayList, 1), new z6(j8Var, r14, 1), null, 2);
        i7Var.f35789g3.f34062r = false;
        h51[] h51VarArr = {i7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, j8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(hd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, i7Var, false, 2));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, ma.o(-1, 44));
            a70Var.k();
        }
        if (!x7Var.f4262k.isEmpty()) {
            a70Var.c(2131232359, hd.N0(2131745474, null), new a7(j8Var, h51VarArr, a70Var, 1), false);
        }
        a70Var.q(i7Var);
        j8Var.i0(j8Var.H, a70Var);
    }

    public static void b0(j8 j8Var, Context context) {
        x7 x7Var = j8Var.d;
        if (!j8Var.Q || x7Var.h.isEmpty()) {
            return;
        }
        a70 a70Var = new a70(j8Var, j8Var.I, false, false);
        a70Var.f33399t = false;
        a70Var.f33367b0 = true;
        a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        a70Var.U = true;
        a70Var.f33391p = new e6(a70Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(x7Var.h);
        Collections.sort(arrayList, new x6(j8Var, 0));
        i7 i7Var = new i7(j8Var, new y6(j8Var, strArr, arrayList, 0), new z6(j8Var, r13, 0), null, 3);
        i7Var.f35789g3.f34062r = false;
        h51[] h51VarArr = {i7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        ot otVar = new ot(context, j8Var.resourceProvider);
        otVar.setTextSize(1, 16.0f);
        otVar.setInputType(573441);
        otVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.resourceProvider);
        org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.resourceProvider);
        otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        otVar.setCursorWidth(1.5f);
        otVar.setHint(hd.N0(2131749992, null));
        org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.resourceProvider);
        otVar.setBackground(null);
        frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        otVar.addTextChangedListener(new v(strArr, i7Var, false, 3));
        if (arrayList.size() > 8) {
            a70Var.r(frameLayout, ma.o(-1, 44));
            a70Var.k();
        }
        if (!x7Var.f4263l.isEmpty()) {
            a70Var.c(2131232359, hd.N0(2131745474, null), new a7(j8Var, h51VarArr, a70Var, 0), false);
        }
        a70Var.q(i7Var);
        j8Var.i0(j8Var.I, a70Var);
    }

    public static void c0(j8 j8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == k10.i(j8Var.currentAccount).e()) {
            j8Var.d.n(tL_starGiftUnique);
            if (j3 == k10.i(j8Var.currentAccount).e()) {
                lc b02 = lc.b0(j8Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String N0 = hd.N0(2131752875, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                gc O = b02.O(document, N0, hd.a0(null, null, 2131752876, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
                O.f35535r = false;
                O.j();
            } else {
                gc O2 = lc.b0(j8Var).O(tL_starGiftUnique.getDocument(), hd.N0(2131752873, null), hd.a0(null, null, 2131752874, org.telegram.messenger.n5.s(j8Var.currentAccount, j3)));
                O2.f35535r = false;
                O2.j();
            }
            j8Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        h7 h7Var = new h7(bundle, tL_starGiftUnique, j3);
        org.telegram.ui.ActionBar.r4 r4Var = j8Var.parentLayout;
        if (r4Var != null && ((ActionBarLayout) r4Var).f28713b) {
            Dialog dialog = j8Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.w2) && z10) {
                ((org.telegram.ui.ActionBar.w2) dialog).O0 = true;
            }
            j8Var.finishFragment();
            org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(h7Var, false, z10);
            }
        } else {
            j8Var.presentFragment(h7Var, true, z10);
        }
        y10 y10Var = j8Var.f3760e;
        if (y10Var != null) {
            y10Var.a(Boolean.valueOf(z10));
        }
    }

    public static void e0(j8 j8Var, o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            di.f6 f6Var = new di.f6(j8Var.getParentActivity(), j8Var.currentAccount, j8Var.f3758b, j8Var.resourceProvider, null);
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, j8Var.d);
            f6Var.N2 = new d7(j8Var);
            j8Var.showDialog(f6Var);
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f3763r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            c10.d(this.f3762n, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new v1(this, 2));
        this.simpleActionBar.setTitle(this.f3759c);
        l0();
        FrameLayout du0Var = new du0(context, null);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29324a7, du0Var, getResourceProvider());
        this.fragmentView = du0Var;
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        i7 i7Var = new i7(this, new b(this, 9), new d7(this), new a3.l(this, 22), 0);
        this.f3761f = i7Var;
        i7Var.f35789g3.f34062r = false;
        i7Var.setSpanCount(3);
        this.f3761f.j(new u1(this, 1));
        du0Var.addView(this.f3761f, ma.e(-1, -1, 119));
        t2 t2Var = new t2(context, new View.OnClickListener(this) {
            public final j8 f4163b;

            {
                this.f4163b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        x7 x7Var = this.f4163b.d;
                        x7Var.f4262k.clear();
                        x7Var.f4261j.clear();
                        x7Var.f4263l.clear();
                        x7Var.m();
                        return;
                    default:
                        j8 j8Var = this.f4163b;
                        x7 x7Var2 = j8Var.d;
                        HashSet hashSet = x7Var2.f4262k;
                        HashSet hashSet2 = x7Var2.f4263l;
                        HashSet hashSet3 = x7Var2.f4261j;
                        boolean z11 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z12 = x7Var2.f4269r;
                            boolean z13 = x7Var2.f4270s;
                            boolean z14 = x7Var2.f4271t;
                            x7Var2.j();
                            if (z12 == x7Var2.f4269r && z13 == x7Var2.f4270s && z14 == x7Var2.f4271t) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            x7Var2.f4269r = z12;
                            x7Var2.f4270s = z13;
                            x7Var2.f4271t = z14;
                            if (!z10) {
                                z11 = true;
                            }
                        }
                        x7Var2.f4262k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z11) {
                            x7Var2.f4269r = x7Var2.g();
                            x7Var2.f4270s = x7Var2.h();
                            x7Var2.f4271t = x7Var2.f();
                        } else {
                            x7Var2.j();
                        }
                        op opVar = j8Var.P;
                        if (opVar != null) {
                            opVar.a(x7Var2.k(), true);
                        }
                        x7Var2.m();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f3765w = t2Var;
        this.f3766x = false;
        t2Var.setAlpha(0.0f);
        this.f3765w.setScaleX(0.95f);
        this.f3765w.setScaleY(0.95f);
        this.f3765w.setVisibility(8);
        du0Var.addView(this.f3765w, ma.e(-1, -1, 119));
        x7 x7Var = this.d;
        if (x7Var.d.isEmpty() && !x7Var.f4275y && x7Var.f4276z) {
            j0(true);
        }
        View view = new View(context);
        this.h = view;
        du0Var.addView(view, ma.e(-1, 0, 48));
        baseSimpleGlass.f(du0Var, this.f3761f, this.simpleActionBar, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.f56661c;
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        l7 l7Var = new l7(this.currentAccount, context, this.resourceProvider);
        fh.g c10 = cVar.c(l7Var, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        l7Var.setBackground(c10);
        ra.a(l7Var);
        l7Var.setOnClickListener(new ai.y2(5, this, l7Var));
        l7Var.setOnWidthChanged(new t6(this, 1));
        this.simpleActionBar.addView(l7Var, ma.e(-2, 58, 5));
        this.N = c8.i0.m(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        this.E.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f3767y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f3767y.setOverScrollMode(2);
        this.f3767y.addView(this.E);
        this.f3767y.setClipChildren(false);
        du0Var.addView(this.f3767y, ma.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final op opVar = new op(24, context, this.resourceProvider);
        this.P = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.h7, org.telegram.ui.ActionBar.m6.f29491j7, org.telegram.ui.ActionBar.m6.f29511k7);
        opVar.setDrawUnchecked(true);
        opVar.a(x7Var.k(), false);
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
        this.f3763r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.f3763r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.i0.m(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.f3763r.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f4192b;

            {
                this.f4192b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        final j8 j8Var = this.f4192b;
                        x7 x7Var2 = j8Var.d;
                        if (j8Var.Q) {
                            a70 I = a70.I(j8Var, j8Var.F);
                            I.c(2131231891, hd.N0(2131745943, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            j8Var.d.p(w7.f4230a);
                                            return;
                                        case 1:
                                            j8Var.d.p(w7.f4231b);
                                            return;
                                        default:
                                            j8Var.d.p(w7.f4232c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231889, hd.N0(2131745947, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            j8Var.d.p(w7.f4230a);
                                            return;
                                        case 1:
                                            j8Var.d.p(w7.f4231b);
                                            return;
                                        default:
                                            j8Var.d.p(w7.f4232c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231890, hd.N0(2131745945, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            j8Var.d.p(w7.f4230a);
                                            return;
                                        case 1:
                                            j8Var.d.p(w7.f4231b);
                                            return;
                                        default:
                                            j8Var.d.p(w7.f4232c);
                                            return;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.r rVar = new ai.r(j8Var, I, opVar, y0VarArr, 3);
                            if (x7Var2.h()) {
                                boolean z10 = x7Var2.f4270s;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.f4269r, !x7Var3.f4270s, x7Var3.f4271t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.f4269r, x7Var4.f4270s, x7Var4.f4271t);
                                                rVar.run();
                                                return;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.f4269r, x7Var5.f4270s, !x7Var5.f4271t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749439, null), z10);
                                y0VarArr[2] = I.z();
                            }
                            if (x7Var2.g()) {
                                boolean z11 = x7Var2.f4269r;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.f4269r, !x7Var3.f4270s, x7Var3.f4271t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.f4269r, x7Var4.f4270s, x7Var4.f4271t);
                                                rVar.run();
                                                return;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.f4269r, x7Var5.f4270s, !x7Var5.f4271t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749441, null), z11);
                                y0VarArr[1] = I.z();
                            }
                            if (x7Var2.f()) {
                                boolean z12 = x7Var2.f4271t;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.f4269r, !x7Var3.f4270s, x7Var3.f4271t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.f4269r, x7Var4.f4270s, x7Var4.f4271t);
                                                rVar.run();
                                                return;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.f4269r, x7Var5.f4270s, !x7Var5.f4271t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749438, null), z12);
                                y0VarArr[3] = I.z();
                            }
                            I.f33399t = false;
                            I.f33367b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            j8Var.i0(j8Var.F, I);
                            return;
                        }
                        return;
                    default:
                        x7 x7Var3 = this.f4192b.d;
                        if (x7Var3 != null) {
                            if (x7Var3.k()) {
                                x7Var3.o(true, true, true);
                            } else {
                                x7Var3.o(true, false, false);
                            }
                            opVar.a(x7Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f3763r.addView(linearLayout2, ma.c(-1.0f, -2));
        ra.b(this.f3763r, 0.04f, 1.5f);
        du0Var.addView(this.f3763r, ma.e(-2, 56, 81));
        if (!x7Var.g() || (!x7Var.h() && !x7Var.f())) {
            this.f3763r.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3762n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.f3762n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.i0.m(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        du0Var.addView(this.f3762n, ma.e(-2, 60, 81));
        this.f3764s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new nq(2131232097, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131749997, null));
        this.f3764s.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.t6.U(this.f3764s, i7, getResourceProvider());
        this.f3764s.setTypeface(org.telegram.messenger.g0.o());
        this.f3764s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f3764s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i7));
        textView2.setBackground(org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.f3764s.setGravity(17);
        this.f3762n.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f4163b;

            {
                this.f4163b = this;
            }

            @Override
            public final void onClick(View view5) {
                boolean z10;
                switch (r2) {
                    case 0:
                        x7 x7Var2 = this.f4163b.d;
                        x7Var2.f4262k.clear();
                        x7Var2.f4261j.clear();
                        x7Var2.f4263l.clear();
                        x7Var2.m();
                        return;
                    default:
                        j8 j8Var = this.f4163b;
                        x7 x7Var22 = j8Var.d;
                        HashSet hashSet = x7Var22.f4262k;
                        HashSet hashSet2 = x7Var22.f4263l;
                        HashSet hashSet3 = x7Var22.f4261j;
                        boolean z11 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z12 = x7Var22.f4269r;
                            boolean z13 = x7Var22.f4270s;
                            boolean z14 = x7Var22.f4271t;
                            x7Var22.j();
                            if (z12 == x7Var22.f4269r && z13 == x7Var22.f4270s && z14 == x7Var22.f4271t) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            x7Var22.f4269r = z12;
                            x7Var22.f4270s = z13;
                            x7Var22.f4271t = z14;
                            if (!z10) {
                                z11 = true;
                            }
                        }
                        x7Var22.f4262k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z11) {
                            x7Var22.f4269r = x7Var22.g();
                            x7Var22.f4270s = x7Var22.h();
                            x7Var22.f4271t = x7Var22.f();
                        } else {
                            x7Var22.j();
                        }
                        op opVar2 = j8Var.P;
                        if (opVar2 != null) {
                            opVar2.a(x7Var22.k(), true);
                        }
                        x7Var22.m();
                        return;
                }
            }
        });
        this.f3762n.addView(this.f3764s, ma.c(-1.0f, -2));
        this.f3762n.setVisibility(8);
        ra.b(this.f3762n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        o7 o7Var = new o7(context, this.resourceProvider, true);
        this.F = o7Var;
        o7Var.setSorting(x7Var.f4267p);
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f4192b;

            {
                this.f4192b = this;
            }

            @Override
            public final void onClick(View view42) {
                switch (r3) {
                    case 0:
                        final j8 j8Var = this.f4192b;
                        x7 x7Var2 = j8Var.d;
                        if (j8Var.Q) {
                            a70 I = a70.I(j8Var, j8Var.F);
                            I.c(2131231891, hd.N0(2131745943, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            j8Var.d.p(w7.f4230a);
                                            return;
                                        case 1:
                                            j8Var.d.p(w7.f4231b);
                                            return;
                                        default:
                                            j8Var.d.p(w7.f4232c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231889, hd.N0(2131745947, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            j8Var.d.p(w7.f4230a);
                                            return;
                                        case 1:
                                            j8Var.d.p(w7.f4231b);
                                            return;
                                        default:
                                            j8Var.d.p(w7.f4232c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231890, hd.N0(2131745945, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            j8Var.d.p(w7.f4230a);
                                            return;
                                        case 1:
                                            j8Var.d.p(w7.f4231b);
                                            return;
                                        default:
                                            j8Var.d.p(w7.f4232c);
                                            return;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.y0[] y0VarArr = new org.telegram.ui.ActionBar.y0[4];
                            final ai.r rVar = new ai.r(j8Var, I, opVar, y0VarArr, 3);
                            if (x7Var2.h()) {
                                boolean z10 = x7Var2.f4270s;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.f4269r, !x7Var3.f4270s, x7Var3.f4271t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.f4269r, x7Var4.f4270s, x7Var4.f4271t);
                                                rVar.run();
                                                return;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.f4269r, x7Var5.f4270s, !x7Var5.f4271t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749439, null), z10);
                                y0VarArr[2] = I.z();
                            }
                            if (x7Var2.g()) {
                                boolean z11 = x7Var2.f4269r;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.f4269r, !x7Var3.f4270s, x7Var3.f4271t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.f4269r, x7Var4.f4270s, x7Var4.f4271t);
                                                rVar.run();
                                                return;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.f4269r, x7Var5.f4270s, !x7Var5.f4271t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749441, null), z11);
                                y0VarArr[1] = I.z();
                            }
                            if (x7Var2.f()) {
                                boolean z12 = x7Var2.f4271t;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x7 x7Var3 = j8Var.d;
                                                x7Var3.o(x7Var3.f4269r, !x7Var3.f4270s, x7Var3.f4271t);
                                                rVar.run();
                                                return;
                                            case 1:
                                                x7 x7Var4 = j8Var.d;
                                                x7Var4.o(!x7Var4.f4269r, x7Var4.f4270s, x7Var4.f4271t);
                                                rVar.run();
                                                return;
                                            default:
                                                x7 x7Var5 = j8Var.d;
                                                x7Var5.o(x7Var5.f4269r, x7Var5.f4270s, !x7Var5.f4271t);
                                                rVar.run();
                                                return;
                                        }
                                    }
                                }, hd.N0(2131749438, null), z12);
                                y0VarArr[3] = I.z();
                            }
                            I.f33399t = false;
                            I.f33367b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            j8Var.i0(j8Var.F, I);
                            return;
                        }
                        return;
                    default:
                        x7 x7Var3 = this.f4192b.d;
                        if (x7Var3 != null) {
                            if (x7Var3.k()) {
                                x7Var3.o(true, true, true);
                            } else {
                                x7Var3.o(true, false, false);
                            }
                            opVar.a(x7Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        o7 o7Var2 = new o7(context, this.resourceProvider, true);
        this.G = o7Var2;
        o7Var2.setValue(hd.N0(2131750370, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f4228b;

            {
                this.f4228b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        j8.Z(this.f4228b, context);
                        return;
                    case 1:
                        j8.a0(this.f4228b, context);
                        return;
                    default:
                        j8.b0(this.f4228b, context);
                        return;
                }
            }
        });
        o7 o7Var3 = new o7(context, this.resourceProvider, true);
        this.H = o7Var3;
        o7Var3.setValue(hd.N0(2131750371, null));
        g0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f4228b;

            {
                this.f4228b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        j8.Z(this.f4228b, context);
                        return;
                    case 1:
                        j8.a0(this.f4228b, context);
                        return;
                    default:
                        j8.b0(this.f4228b, context);
                        return;
                }
            }
        });
        o7 o7Var4 = new o7(context, this.resourceProvider, true);
        this.I = o7Var4;
        o7Var4.setValue(hd.N0(2131750363, null));
        g0(this.I, true);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f4228b;

            {
                this.f4228b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        j8.Z(this.f4228b, context);
                        return;
                    case 1:
                        j8.a0(this.f4228b, context);
                        return;
                    default:
                        j8.b0(this.f4228b, context);
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

    public final void g0(o7 o7Var, boolean z10) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i7 = 0;
        fh.g c10 = getBaseSimpleGlass().f56661c.c(frameLayout, null, false);
        c10.p(this.N);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(o7Var, ma.c(40.0f, -2));
        frameLayout.setOnClickListener(new ah.d(o7Var, 7));
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

    public final void i0(o7 o7Var, a70 a70Var) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.j5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null && (a70Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && (o7Var.getParent() instanceof FrameLayout)) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) a70Var.A;
            FrameLayout frameLayout2 = (FrameLayout) o7Var.getParent();
            p7 p7Var = this.O;
            if (p7Var.f4011a && (frameLayout = (FrameLayout) p7Var.f4012b) != null && frameLayout != frameLayout2) {
                frameLayout.setVisibility(0);
            }
            p7Var.f4012b = frameLayout2;
            p7Var.f4013c = o7Var;
            p7Var.d = simpleMenuOverlay;
            a70Var.f33391p = new e7(simpleMenuOverlay, 0);
            simpleMenuOverlay.setOnClosed(new f7(actionBarPopupWindow$ActionBarPopupWindowLayout, 0));
            simpleMenuOverlay.d(p7Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
            return;
        }
        a70Var.a0();
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().H0) && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.m6.f29324a7)) > 0.699999988079071d) {
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
        t2 t2Var = this.f3765w;
        if (t2Var == null || this.f3766x == z10) {
            return;
        }
        this.f3766x = z10;
        t2Var.setVisibility(0);
        ViewPropertyAnimator animate = this.f3765w.animate();
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
        scaleX.scaleY(f12).setInterpolator(nr.h).setDuration(320L).setListener(new g7(0, this, z10)).start();
    }

    public final void k0() {
        int i7;
        if (this.f3767y == null) {
            return;
        }
        float f10 = this.M;
        float L = org.telegram.messenger.g0.L(47.0f) * f10;
        this.f3767y.setTranslationY((ri.a.d(this.K) - org.telegram.messenger.g0.L(6.0f)) - L);
        this.f3767y.setAlpha(1.0f - f10);
        HorizontalScrollView horizontalScrollView = this.f3767y;
        if (f10 >= 1.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        horizontalScrollView.setVisibility(i7);
        float f11 = -L;
        this.f3761f.setTranslationY(f11);
        this.h.setTranslationY(f11);
    }

    public final void l0() {
        String H;
        org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
        if (z4Var == null) {
            return;
        }
        int i7 = this.d.f4257e;
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
            i10 = Math.max(i10, org.telegram.messenger.g0.f24040m);
        }
        this.K = i10;
        this.L = Math.max(i12, org.telegram.messenger.g0.f24041n);
        if (this.f3761f == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(40.0f) + ri.a.d(this.K);
        int L2 = org.telegram.messenger.g0.L(47.0f);
        int i13 = -ri.a.c(this.K);
        int i14 = (-ri.a.c(this.L)) - L2;
        org.telegram.messenger.g0.z3(this.f3761f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f3761f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.L) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.z3(this.f3765w, 0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.f3763r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.f3762n.getLayoutParams()).bottomMargin = this.L;
        this.f3763r.requestLayout();
        this.f3762n.requestLayout();
        k0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
            if (r12 != this.S) {
                this.S = r12;
                TextView textView = this.f3764s;
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
