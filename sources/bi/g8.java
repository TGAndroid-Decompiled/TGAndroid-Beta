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
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
public class g8 extends org.telegram.ui.ActionBar.h2 implements te.b {
    public static final ArrayList U = new ArrayList();
    public LinearLayout E;
    public l7 F;
    public l7 G;
    public l7 H;
    public l7 I;
    public uz J;
    public int K;
    public int L;
    public float M;
    public gh.e N;
    public final m7 O;
    public mp P;
    public boolean Q;
    public ValueAnimator R;
    public int S;
    public LinearLayout T;
    public final te.a f3624a;
    public final long f3625b;
    public final String f3626c;
    public final u7 d;
    public x10 f3627e;
    public f7 f3628f;
    public View h;
    public FrameLayout f3629n;
    public FrameLayout f3630r;
    public TextView f3631s;
    public p2 f3632w;
    public boolean f3633x;
    public HorizontalScrollView f3634y;

    public g8(long j3, String str, long j10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(null);
        this.f3624a = new te.a(0, this, lr.h, 380L, false);
        ?? obj = new Object();
        obj.f3862e = this;
        this.O = obj;
        boolean z10 = true;
        this.Q = true;
        this.f3625b = j3;
        this.f3626c = str;
        this.resourceProvider = i6Var;
        u7 u7Var = new u7(this.currentAccount, j10, new q6(this, 0));
        z10 = (j3 == 0 || j3 == j10.i(u7Var.f4087a).e()) ? false : z10;
        u7Var.v = z10;
        if (z10) {
            u7Var.j();
        }
        this.d = u7Var;
        u7Var.l(false);
    }

    public static void Z(g8 g8Var, Context context) {
        u7 u7Var = g8Var.d;
        if (!g8Var.Q || u7Var.f4091f.isEmpty()) {
            return;
        }
        y60 y60Var = new y60(g8Var, g8Var.G, false, false);
        y60Var.f42377t = false;
        y60Var.f42345b0 = true;
        y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        y60Var.U = true;
        y60Var.f42369p = new b6(y60Var, 3);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u7Var.f4091f);
        Collections.sort(arrayList, new u6(g8Var, 2));
        f7 f7Var = new f7(g8Var, new v6(g8Var, strArr, arrayList, 2), new w6(g8Var, r14, 2), null, 1);
        f7Var.f34607g3.f42809r = false;
        e51[] e51VarArr = {f7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, g8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, g8Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, g8Var.resourceProvider);
        org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.resourceProvider);
        mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(gd.M0(2131749993, null));
        org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, g8Var.resourceProvider);
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new v(strArr, f7Var, false, 1));
        if (arrayList.size() > 8) {
            y60Var.r(frameLayout, ma.o(-1, 44));
            y60Var.k();
        }
        if (!u7Var.f4094j.isEmpty()) {
            y60Var.c(2131232359, gd.M0(2131745475, null), new x6(g8Var, e51VarArr, y60Var, 2), false);
        }
        y60Var.q(f7Var);
        g8Var.i0(g8Var.G, y60Var);
    }

    public static void a0(g8 g8Var, Context context) {
        u7 u7Var = g8Var.d;
        if (!g8Var.Q || u7Var.f4092g.isEmpty()) {
            return;
        }
        y60 y60Var = new y60(g8Var, g8Var.H, false, false);
        y60Var.f42377t = false;
        y60Var.f42345b0 = true;
        y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        y60Var.U = true;
        y60Var.f42369p = new b6(y60Var, 2);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u7Var.f4092g);
        Collections.sort(arrayList, new u6(g8Var, 1));
        f7 f7Var = new f7(g8Var, new v6(g8Var, strArr, arrayList, 1), new w6(g8Var, r14, 1), null, 2);
        f7Var.f34607g3.f42809r = false;
        e51[] e51VarArr = {f7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, g8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, g8Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, g8Var.resourceProvider);
        org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.resourceProvider);
        mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(gd.M0(2131749993, null));
        org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, g8Var.resourceProvider);
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new v(strArr, f7Var, false, 2));
        if (arrayList.size() > 8) {
            y60Var.r(frameLayout, ma.o(-1, 44));
            y60Var.k();
        }
        if (!u7Var.f4095k.isEmpty()) {
            y60Var.c(2131232359, gd.M0(2131745475, null), new x6(g8Var, e51VarArr, y60Var, 1), false);
        }
        y60Var.q(f7Var);
        g8Var.i0(g8Var.H, y60Var);
    }

    public static void b0(g8 g8Var, Context context) {
        u7 u7Var = g8Var.d;
        if (!g8Var.Q || u7Var.h.isEmpty()) {
            return;
        }
        y60 y60Var = new y60(g8Var, g8Var.I, false, false);
        y60Var.f42377t = false;
        y60Var.f42345b0 = true;
        y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
        y60Var.U = true;
        y60Var.f42369p = new b6(y60Var, 1);
        String[] strArr = {""};
        ArrayList arrayList = new ArrayList(u7Var.h);
        Collections.sort(arrayList, new u6(g8Var, 0));
        f7 f7Var = new f7(g8Var, new v6(g8Var, strArr, arrayList, 0), new w6(g8Var, r13, 0), null, 3);
        f7Var.f34607g3.f42809r = false;
        e51[] e51VarArr = {f7Var};
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232739);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, g8Var.getResourceProvider(), PorterDuff.Mode.SRC_IN);
        frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        mt mtVar = new mt(context, g8Var.resourceProvider);
        mtVar.setTextSize(1, 16.0f);
        mtVar.setInputType(573441);
        mtVar.setRawInputType(573441);
        org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, g8Var.resourceProvider);
        org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, g8Var.resourceProvider);
        mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        mtVar.setCursorWidth(1.5f);
        mtVar.setHint(gd.M0(2131749993, null));
        org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, g8Var.resourceProvider);
        mtVar.setBackground(null);
        frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
        mtVar.addTextChangedListener(new v(strArr, f7Var, false, 3));
        if (arrayList.size() > 8) {
            y60Var.r(frameLayout, ma.o(-1, 44));
            y60Var.k();
        }
        if (!u7Var.f4096l.isEmpty()) {
            y60Var.c(2131232359, gd.M0(2131745475, null), new x6(g8Var, e51VarArr, y60Var, 0), false);
        }
        y60Var.q(f7Var);
        g8Var.i0(g8Var.I, y60Var);
    }

    public static void c0(g8 g8Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        if (j3 == j10.i(g8Var.currentAccount).e()) {
            g8Var.d.n(tL_starGiftUnique);
            if (j3 == j10.i(g8Var.currentAccount).e()) {
                lc b02 = lc.b0(g8Var);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = gd.M0(2131752876, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tL_starGiftUnique.title);
                sb2.append(" #");
                gc O = b02.O(document, M0, gd.a0(null, null, 2131752877, i5.c.l(tL_starGiftUnique.num, ',', sb2)));
                O.f35469r = false;
                O.j();
            } else {
                gc O2 = lc.b0(g8Var).O(tL_starGiftUnique.getDocument(), gd.M0(2131752874, null), gd.a0(null, null, 2131752875, org.telegram.messenger.n5.s(g8Var.currentAccount, j3)));
                O2.f35469r = false;
                O2.j();
            }
            g8Var.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        e7 e7Var = new e7(bundle, tL_starGiftUnique, j3);
        org.telegram.ui.ActionBar.s4 s4Var = g8Var.parentLayout;
        if (s4Var != null && ((ActionBarLayout) s4Var).f28680b) {
            Dialog dialog = g8Var.parentDialog;
            if ((dialog instanceof org.telegram.ui.ActionBar.x2) && z10) {
                ((org.telegram.ui.ActionBar.x2) dialog).O0 = true;
            }
            g8Var.finishFragment();
            org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
            if (T != null) {
                T.presentFragment(e7Var, false, z10);
            }
        } else {
            g8Var.presentFragment(e7Var, true, z10);
        }
        x10 x10Var = g8Var.f3627e;
        if (x10Var != null) {
            x10Var.a(Boolean.valueOf(z10));
        }
    }

    public static void e0(g8 g8Var, l41 l41Var) {
        Object obj = l41Var.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            di.f6 f6Var = new di.f6(g8Var.getParentActivity(), g8Var.currentAccount, g8Var.f3625b, g8Var.resourceProvider, null);
            f6Var.u2(tL_starGiftUnique.slug, tL_starGiftUnique, g8Var.d);
            f6Var.N2 = new a7(g8Var);
            g8Var.showDialog(f6Var);
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        if (i7 == 0) {
            this.f3630r.setTranslationY((-org.telegram.messenger.g0.L(52.0f)) * f10);
            a10.d(this.f3629n, f10);
        }
    }

    @Override
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r1(this, 2));
        this.simpleActionBar.setTitle(this.f3626c);
        l0();
        FrameLayout au0Var = new au0(context, null);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, au0Var, getResourceProvider());
        this.fragmentView = au0Var;
        ri.a baseSimpleGlass = getBaseSimpleGlass();
        f7 f7Var = new f7(this, new b(this, 9), new a7(this), new a3.l(this, 22), 0);
        this.f3628f = f7Var;
        f7Var.f34607g3.f42809r = false;
        f7Var.setSpanCount(3);
        this.f3628f.j(new q1(this, 1));
        au0Var.addView(this.f3628f, ma.e(-1, -1, 119));
        p2 p2Var = new p2(context, new View.OnClickListener(this) {
            public final g8 f4013b;

            {
                this.f4013b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z10;
                switch (r2) {
                    case 0:
                        u7 u7Var = this.f4013b.d;
                        u7Var.f4095k.clear();
                        u7Var.f4094j.clear();
                        u7Var.f4096l.clear();
                        u7Var.m();
                        return;
                    default:
                        g8 g8Var = this.f4013b;
                        u7 u7Var2 = g8Var.d;
                        HashSet hashSet = u7Var2.f4095k;
                        HashSet hashSet2 = u7Var2.f4096l;
                        HashSet hashSet3 = u7Var2.f4094j;
                        boolean z11 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z12 = u7Var2.f4102r;
                            boolean z13 = u7Var2.f4103s;
                            boolean z14 = u7Var2.f4104t;
                            u7Var2.j();
                            if (z12 == u7Var2.f4102r && z13 == u7Var2.f4103s && z14 == u7Var2.f4104t) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            u7Var2.f4102r = z12;
                            u7Var2.f4103s = z13;
                            u7Var2.f4104t = z14;
                            if (!z10) {
                                z11 = true;
                            }
                        }
                        u7Var2.f4095k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z11) {
                            u7Var2.f4102r = u7Var2.g();
                            u7Var2.f4103s = u7Var2.h();
                            u7Var2.f4104t = u7Var2.f();
                        } else {
                            u7Var2.j();
                        }
                        mp mpVar = g8Var.P;
                        if (mpVar != null) {
                            mpVar.a(u7Var2.k(), true);
                        }
                        u7Var2.m();
                        return;
                }
            }
        }, this.resourceProvider);
        this.f3632w = p2Var;
        this.f3633x = false;
        p2Var.setAlpha(0.0f);
        this.f3632w.setScaleX(0.95f);
        this.f3632w.setScaleY(0.95f);
        this.f3632w.setVisibility(8);
        au0Var.addView(this.f3632w, ma.e(-1, -1, 119));
        u7 u7Var = this.d;
        if (u7Var.d.isEmpty() && !u7Var.f4108y && u7Var.f4109z) {
            j0(true);
        }
        View view = new View(context);
        this.h = view;
        au0Var.addView(view, ma.e(-1, 0, 48));
        baseSimpleGlass.f(au0Var, this.f3628f, this.simpleActionBar, this.resourceProvider);
        dh.c cVar = baseSimpleGlass.f56616c;
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        i7 i7Var = new i7(this.currentAccount, context, this.resourceProvider);
        fh.g c10 = cVar.c(i7Var, null, false);
        c10.p(c8.i0.m(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(23.0f));
        c10.q(org.telegram.messenger.g0.L(6.0f));
        i7Var.setBackground(c10);
        ra.a(i7Var);
        i7Var.setOnClickListener(new ai.v2(6, this, i7Var));
        i7Var.setOnWidthChanged(new q6(this, 1));
        this.simpleActionBar.addView(i7Var, ma.e(-2, 58, 5));
        this.N = c8.i0.m(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        this.E.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.f3634y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.f3634y.setOverScrollMode(2);
        this.f3634y.addView(this.E);
        this.f3634y.setClipChildren(false);
        au0Var.addView(this.f3634y, ma.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final mp mpVar = new mp(24, context, this.resourceProvider);
        this.P = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.n6.h7, org.telegram.ui.ActionBar.n6.f29504j7, org.telegram.ui.ActionBar.n6.f29524k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(u7Var.k(), false);
        mpVar.setDrawBackgroundAsArc(10);
        mpVar.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        mpVar.setScaleX(0.8f);
        mpVar.setScaleY(0.8f);
        linearLayout2.addView(mpVar, ma.r(26, 26, 16));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, this.resourceProvider);
        i5.c.r(14.0f, 1, 2131749438, textView, null);
        linearLayout2.addView(textView, ma.t(-2, -2, 16, 9, 0, 0, 0));
        int L = org.telegram.messenger.g0.L(20.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(i7));
        linearLayout2.setBackground(org.telegram.ui.ActionBar.n6.k0(L, L, L, L, 0, r12, r12));
        this.T = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3630r = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view3 = this.f3630r;
        fh.g c11 = cVar.c(view3, null, false);
        c11.p(c8.i0.m(this.resourceProvider));
        c11.q(org.telegram.messenger.g0.L(8.0f));
        c11.r(org.telegram.messenger.g0.L(20.0f));
        view3.setBackground(c11);
        this.f3630r.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f4037b;

            {
                this.f4037b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        final g8 g8Var = this.f4037b;
                        u7 u7Var2 = g8Var.d;
                        if (g8Var.Q) {
                            y60 I = y60.I(g8Var, g8Var.F);
                            I.c(2131231891, gd.M0(2131745944, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            g8Var.d.p(t7.f4068a);
                                            return;
                                        case 1:
                                            g8Var.d.p(t7.f4069b);
                                            return;
                                        default:
                                            g8Var.d.p(t7.f4070c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231889, gd.M0(2131745948, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            g8Var.d.p(t7.f4068a);
                                            return;
                                        case 1:
                                            g8Var.d.p(t7.f4069b);
                                            return;
                                        default:
                                            g8Var.d.p(t7.f4070c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231890, gd.M0(2131745946, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            g8Var.d.p(t7.f4068a);
                                            return;
                                        case 1:
                                            g8Var.d.p(t7.f4069b);
                                            return;
                                        default:
                                            g8Var.d.p(t7.f4070c);
                                            return;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[4];
                            final ai.s sVar = new ai.s(g8Var, I, mpVar, z0VarArr, 3);
                            if (u7Var2.h()) {
                                boolean z10 = u7Var2.f4103s;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                u7 u7Var3 = g8Var.d;
                                                u7Var3.o(u7Var3.f4102r, !u7Var3.f4103s, u7Var3.f4104t);
                                                sVar.run();
                                                return;
                                            case 1:
                                                u7 u7Var4 = g8Var.d;
                                                u7Var4.o(!u7Var4.f4102r, u7Var4.f4103s, u7Var4.f4104t);
                                                sVar.run();
                                                return;
                                            default:
                                                u7 u7Var5 = g8Var.d;
                                                u7Var5.o(u7Var5.f4102r, u7Var5.f4103s, !u7Var5.f4104t);
                                                sVar.run();
                                                return;
                                        }
                                    }
                                }, gd.M0(2131749440, null), z10);
                                z0VarArr[2] = I.z();
                            }
                            if (u7Var2.g()) {
                                boolean z11 = u7Var2.f4102r;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                u7 u7Var3 = g8Var.d;
                                                u7Var3.o(u7Var3.f4102r, !u7Var3.f4103s, u7Var3.f4104t);
                                                sVar.run();
                                                return;
                                            case 1:
                                                u7 u7Var4 = g8Var.d;
                                                u7Var4.o(!u7Var4.f4102r, u7Var4.f4103s, u7Var4.f4104t);
                                                sVar.run();
                                                return;
                                            default:
                                                u7 u7Var5 = g8Var.d;
                                                u7Var5.o(u7Var5.f4102r, u7Var5.f4103s, !u7Var5.f4104t);
                                                sVar.run();
                                                return;
                                        }
                                    }
                                }, gd.M0(2131749442, null), z11);
                                z0VarArr[1] = I.z();
                            }
                            if (u7Var2.f()) {
                                boolean z12 = u7Var2.f4104t;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                u7 u7Var3 = g8Var.d;
                                                u7Var3.o(u7Var3.f4102r, !u7Var3.f4103s, u7Var3.f4104t);
                                                sVar.run();
                                                return;
                                            case 1:
                                                u7 u7Var4 = g8Var.d;
                                                u7Var4.o(!u7Var4.f4102r, u7Var4.f4103s, u7Var4.f4104t);
                                                sVar.run();
                                                return;
                                            default:
                                                u7 u7Var5 = g8Var.d;
                                                u7Var5.o(u7Var5.f4102r, u7Var5.f4103s, !u7Var5.f4104t);
                                                sVar.run();
                                                return;
                                        }
                                    }
                                }, gd.M0(2131749439, null), z12);
                                z0VarArr[3] = I.z();
                            }
                            I.f42377t = false;
                            I.f42345b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            g8Var.i0(g8Var.F, I);
                            return;
                        }
                        return;
                    default:
                        u7 u7Var3 = this.f4037b.d;
                        if (u7Var3 != null) {
                            if (u7Var3.k()) {
                                u7Var3.o(true, true, true);
                            } else {
                                u7Var3.o(true, false, false);
                            }
                            mpVar.a(u7Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        this.f3630r.addView(linearLayout2, ma.c(-1.0f, -2));
        ra.b(this.f3630r, 0.04f, 1.5f);
        au0Var.addView(this.f3630r, ma.e(-2, 56, 81));
        if (!u7Var.g() || (!u7Var.h() && !u7Var.f())) {
            this.f3630r.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f3629n = frameLayout2;
        frameLayout2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        View view4 = this.f3629n;
        fh.g c12 = cVar.c(view4, null, false);
        c12.p(c8.i0.m(this.resourceProvider));
        c12.q(org.telegram.messenger.g0.L(8.0f));
        c12.r(org.telegram.messenger.g0.L(22.0f));
        view4.setBackground(c12);
        au0Var.addView(this.f3629n, ma.e(-2, 60, 81));
        this.f3631s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new lq(2131232097, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.M0(2131749998, null));
        this.f3631s.setText(spannableStringBuilder);
        org.telegram.ui.ActionBar.u6.U(this.f3631s, i7, getResourceProvider());
        this.f3631s.setTypeface(org.telegram.messenger.g0.o());
        this.f3631s.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
        TextView textView2 = this.f3631s;
        int L2 = org.telegram.messenger.g0.L(22.0f);
        int r13 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(i7));
        textView2.setBackground(org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, r13, r13));
        this.f3631s.setGravity(17);
        this.f3629n.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f4013b;

            {
                this.f4013b = this;
            }

            @Override
            public final void onClick(View view5) {
                boolean z10;
                switch (r2) {
                    case 0:
                        u7 u7Var2 = this.f4013b.d;
                        u7Var2.f4095k.clear();
                        u7Var2.f4094j.clear();
                        u7Var2.f4096l.clear();
                        u7Var2.m();
                        return;
                    default:
                        g8 g8Var = this.f4013b;
                        u7 u7Var22 = g8Var.d;
                        HashSet hashSet = u7Var22.f4095k;
                        HashSet hashSet2 = u7Var22.f4096l;
                        HashSet hashSet3 = u7Var22.f4094j;
                        boolean z11 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z12 = u7Var22.f4102r;
                            boolean z13 = u7Var22.f4103s;
                            boolean z14 = u7Var22.f4104t;
                            u7Var22.j();
                            if (z12 == u7Var22.f4102r && z13 == u7Var22.f4103s && z14 == u7Var22.f4104t) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            u7Var22.f4102r = z12;
                            u7Var22.f4103s = z13;
                            u7Var22.f4104t = z14;
                            if (!z10) {
                                z11 = true;
                            }
                        }
                        u7Var22.f4095k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z11) {
                            u7Var22.f4102r = u7Var22.g();
                            u7Var22.f4103s = u7Var22.h();
                            u7Var22.f4104t = u7Var22.f();
                        } else {
                            u7Var22.j();
                        }
                        mp mpVar2 = g8Var.P;
                        if (mpVar2 != null) {
                            mpVar2.a(u7Var22.k(), true);
                        }
                        u7Var22.m();
                        return;
                }
            }
        });
        this.f3629n.addView(this.f3631s, ma.c(-1.0f, -2));
        this.f3629n.setVisibility(8);
        ra.b(this.f3629n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        l7 l7Var = new l7(context, this.resourceProvider, true);
        this.F = l7Var;
        l7Var.setSorting(u7Var.f4100p);
        g0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f4037b;

            {
                this.f4037b = this;
            }

            @Override
            public final void onClick(View view42) {
                switch (r3) {
                    case 0:
                        final g8 g8Var = this.f4037b;
                        u7 u7Var2 = g8Var.d;
                        if (g8Var.Q) {
                            y60 I = y60.I(g8Var, g8Var.F);
                            I.c(2131231891, gd.M0(2131745944, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            g8Var.d.p(t7.f4068a);
                                            return;
                                        case 1:
                                            g8Var.d.p(t7.f4069b);
                                            return;
                                        default:
                                            g8Var.d.p(t7.f4070c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231889, gd.M0(2131745948, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            g8Var.d.p(t7.f4068a);
                                            return;
                                        case 1:
                                            g8Var.d.p(t7.f4069b);
                                            return;
                                        default:
                                            g8Var.d.p(t7.f4070c);
                                            return;
                                    }
                                }
                            }, false);
                            I.c(2131231890, gd.M0(2131745946, null), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r2) {
                                        case 0:
                                            g8Var.d.p(t7.f4068a);
                                            return;
                                        case 1:
                                            g8Var.d.p(t7.f4069b);
                                            return;
                                        default:
                                            g8Var.d.p(t7.f4070c);
                                            return;
                                    }
                                }
                            }, false);
                            I.k();
                            org.telegram.ui.ActionBar.z0[] z0VarArr = new org.telegram.ui.ActionBar.z0[4];
                            final ai.s sVar = new ai.s(g8Var, I, mpVar, z0VarArr, 3);
                            if (u7Var2.h()) {
                                boolean z10 = u7Var2.f4103s;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                u7 u7Var3 = g8Var.d;
                                                u7Var3.o(u7Var3.f4102r, !u7Var3.f4103s, u7Var3.f4104t);
                                                sVar.run();
                                                return;
                                            case 1:
                                                u7 u7Var4 = g8Var.d;
                                                u7Var4.o(!u7Var4.f4102r, u7Var4.f4103s, u7Var4.f4104t);
                                                sVar.run();
                                                return;
                                            default:
                                                u7 u7Var5 = g8Var.d;
                                                u7Var5.o(u7Var5.f4102r, u7Var5.f4103s, !u7Var5.f4104t);
                                                sVar.run();
                                                return;
                                        }
                                    }
                                }, gd.M0(2131749440, null), z10);
                                z0VarArr[2] = I.z();
                            }
                            if (u7Var2.g()) {
                                boolean z11 = u7Var2.f4102r;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                u7 u7Var3 = g8Var.d;
                                                u7Var3.o(u7Var3.f4102r, !u7Var3.f4103s, u7Var3.f4104t);
                                                sVar.run();
                                                return;
                                            case 1:
                                                u7 u7Var4 = g8Var.d;
                                                u7Var4.o(!u7Var4.f4102r, u7Var4.f4103s, u7Var4.f4104t);
                                                sVar.run();
                                                return;
                                            default:
                                                u7 u7Var5 = g8Var.d;
                                                u7Var5.o(u7Var5.f4102r, u7Var5.f4103s, !u7Var5.f4104t);
                                                sVar.run();
                                                return;
                                        }
                                    }
                                }, gd.M0(2131749442, null), z11);
                                z0VarArr[1] = I.z();
                            }
                            if (u7Var2.f()) {
                                boolean z12 = u7Var2.f4104t;
                                I.i(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                u7 u7Var3 = g8Var.d;
                                                u7Var3.o(u7Var3.f4102r, !u7Var3.f4103s, u7Var3.f4104t);
                                                sVar.run();
                                                return;
                                            case 1:
                                                u7 u7Var4 = g8Var.d;
                                                u7Var4.o(!u7Var4.f4102r, u7Var4.f4103s, u7Var4.f4104t);
                                                sVar.run();
                                                return;
                                            default:
                                                u7 u7Var5 = g8Var.d;
                                                u7Var5.o(u7Var5.f4102r, u7Var5.f4103s, !u7Var5.f4104t);
                                                sVar.run();
                                                return;
                                        }
                                    }
                                }, gd.M0(2131749439, null), z12);
                                z0VarArr[3] = I.z();
                            }
                            I.f42377t = false;
                            I.f42345b0 = true;
                            I.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            g8Var.i0(g8Var.F, I);
                            return;
                        }
                        return;
                    default:
                        u7 u7Var3 = this.f4037b.d;
                        if (u7Var3 != null) {
                            if (u7Var3.k()) {
                                u7Var3.o(true, true, true);
                            } else {
                                u7Var3.o(true, false, false);
                            }
                            mpVar.a(u7Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        l7 l7Var2 = new l7(context, this.resourceProvider, true);
        this.G = l7Var2;
        l7Var2.setValue(gd.M0(2131750371, null));
        g0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f4066b;

            {
                this.f4066b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        g8.Z(this.f4066b, context);
                        return;
                    case 1:
                        g8.a0(this.f4066b, context);
                        return;
                    default:
                        g8.b0(this.f4066b, context);
                        return;
                }
            }
        });
        l7 l7Var3 = new l7(context, this.resourceProvider, true);
        this.H = l7Var3;
        l7Var3.setValue(gd.M0(2131750372, null));
        g0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f4066b;

            {
                this.f4066b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        g8.Z(this.f4066b, context);
                        return;
                    case 1:
                        g8.a0(this.f4066b, context);
                        return;
                    default:
                        g8.b0(this.f4066b, context);
                        return;
                }
            }
        });
        l7 l7Var4 = new l7(context, this.resourceProvider, true);
        this.I = l7Var4;
        l7Var4.setValue(gd.M0(2131750364, null));
        g0(this.I, true);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final g8 f4066b;

            {
                this.f4066b = this;
            }

            @Override
            public final void onClick(View view5) {
                switch (r3) {
                    case 0:
                        g8.Z(this.f4066b, context);
                        return;
                    case 1:
                        g8.a0(this.f4066b, context);
                        return;
                    default:
                        g8.b0(this.f4066b, context);
                        return;
                }
            }
        });
        uz uzVar = new uz(getParentActivity());
        this.J = uzVar;
        au0Var.addView(uzVar, ma.c(-1.0f, -1));
        h0(false, false);
        return au0Var;
    }

    public final void g0(l7 l7Var, boolean z10) {
        int L = org.telegram.messenger.g0.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i7 = 0;
        fh.g c10 = getBaseSimpleGlass().f56616c.c(frameLayout, null, false);
        c10.p(this.N);
        c10.r(org.telegram.messenger.g0.L(20.0f));
        c10.q(L);
        frameLayout.setBackground(c10);
        frameLayout.addView(l7Var, ma.c(40.0f, -2));
        frameLayout.setOnClickListener(new ah.d(l7Var, 8));
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
            this.R.setInterpolator(lr.h);
            this.R.setDuration(420L);
            this.R.start();
            return;
        }
        this.M = f10;
        k0();
    }

    public final void i0(l7 l7Var, y60 y60Var) {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.k5 simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null && (y60Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && (l7Var.getParent() instanceof FrameLayout)) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) y60Var.A;
            FrameLayout frameLayout2 = (FrameLayout) l7Var.getParent();
            m7 m7Var = this.O;
            if (m7Var.f3859a && (frameLayout = (FrameLayout) m7Var.f3860b) != null && frameLayout != frameLayout2) {
                frameLayout.setVisibility(0);
            }
            m7Var.f3860b = frameLayout2;
            m7Var.f3861c = l7Var;
            m7Var.d = simpleMenuOverlay;
            y60Var.f42369p = new b7(simpleMenuOverlay, 0);
            simpleMenuOverlay.setOnClosed(new c7(actionBarPopupWindow$ActionBarPopupWindowLayout, 0));
            simpleMenuOverlay.d(m7Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
            return;
        }
        y60Var.a0();
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().H0) && i0.a.h(getThemedColor(org.telegram.ui.ActionBar.n6.f29337a7)) > 0.699999988079071d) {
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
        p2 p2Var = this.f3632w;
        if (p2Var == null || this.f3633x == z10) {
            return;
        }
        this.f3633x = z10;
        p2Var.setVisibility(0);
        ViewPropertyAnimator animate = this.f3632w.animate();
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
        scaleX.scaleY(f12).setInterpolator(lr.h).setDuration(320L).setListener(new d7(0, this, z10)).start();
    }

    public final void k0() {
        int i7;
        if (this.f3634y == null) {
            return;
        }
        float f10 = this.M;
        float L = org.telegram.messenger.g0.L(47.0f) * f10;
        this.f3634y.setTranslationY((ri.a.d(this.K) - org.telegram.messenger.g0.L(6.0f)) - L);
        this.f3634y.setAlpha(1.0f - f10);
        HorizontalScrollView horizontalScrollView = this.f3634y;
        if (f10 >= 1.0f) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        horizontalScrollView.setVisibility(i7);
        float f11 = -L;
        this.f3628f.setTranslationY(f11);
        this.h.setTranslationY(f11);
    }

    public final void l0() {
        String H;
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var == null) {
            return;
        }
        int i7 = this.d.f4090e;
        if (i7 <= 0) {
            H = gd.M0(2131749991, null);
        } else {
            H = gd.H(',', "Gift2ListingsCount", i7);
        }
        a5Var.setSubtitle(H);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
        if (a5Var != null && a5Var.getOccupyStatusBar()) {
            i10 = Math.max(i10, org.telegram.messenger.g0.f24112m);
        }
        this.K = i10;
        this.L = Math.max(i12, org.telegram.messenger.g0.f24113n);
        if (this.f3628f == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(40.0f) + ri.a.d(this.K);
        int L2 = org.telegram.messenger.g0.L(47.0f);
        int i13 = -ri.a.c(this.K);
        int i14 = (-ri.a.c(this.L)) - L2;
        org.telegram.messenger.g0.z3(this.f3628f, org.telegram.messenger.g0.L(7.33f), i13, org.telegram.messenger.g0.L(7.33f), i14);
        this.f3628f.setPadding(0, (org.telegram.messenger.g0.L(4.0f) + L) - i13, 0, (org.telegram.messenger.g0.L(56.0f) + this.L) - i14);
        this.h.getLayoutParams().height = org.telegram.messenger.g0.L(6.0f) + L;
        this.h.requestLayout();
        org.telegram.messenger.g0.z3(this.f3632w, 0, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.f3630r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.f3629n.getLayoutParams()).bottomMargin = this.L;
        this.f3630r.requestLayout();
        this.f3629n.requestLayout();
        k0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f, getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
            if (r12 != this.S) {
                this.S = r12;
                TextView textView = this.f3631s;
                if (textView != null) {
                    org.telegram.ui.ActionBar.n6.H1(textView.getBackground(), r12, true);
                }
                LinearLayout linearLayout = this.T;
                if (linearLayout != null) {
                    org.telegram.ui.ActionBar.n6.H1(linearLayout.getBackground(), r12, true);
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
