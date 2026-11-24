package defpackage;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public class zb9 extends d implements g94 {
    public static final ArrayList U = new ArrayList();
    public LinearLayout E;
    public ib9 F;
    public ib9 G;
    public ib9 H;
    public ib9 I;
    public uj4 J;
    public int K;
    public int L;
    public float M;
    public nm0 N;
    public final p41 O;
    public jh2 P;
    public boolean Q;
    public ValueAnimator R;
    public int S;
    public LinearLayout T;
    public final fn0 a;
    public final long b;
    public final String c;
    public final qb9 d;
    public qac e;
    public t34 f;
    public View h;
    public FrameLayout n;
    public FrameLayout r;
    public TextView s;
    public ct8 w;
    public boolean x;
    public HorizontalScrollView y;

    public zb9(long j, String str, long j2, ylb ylbVar) {
        super(null);
        this.a = new fn0(0, this, d53.h, 380L, false);
        ?? obj = new Object();
        obj.e = this;
        this.O = obj;
        boolean z = true;
        this.Q = true;
        this.b = j;
        this.c = str;
        this.resourceProvider = ylbVar;
        qb9 qb9Var = new qb9(this.currentAccount, j2, new ra9(this, (byte) 0));
        z = (j == 0 || j == z8c.h(qb9Var.a).e()) ? false : z;
        qb9Var.v = z;
        if (z) {
            qb9Var.j();
        }
        this.d = qb9Var;
        qb9Var.l(false);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            this.r.setTranslationY((-gm.L(52.0f)) * f);
            wp4.d(this.n, f);
        }
    }

    public final void a0(ib9 ib9Var, boolean z) {
        int L = gm.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i = 0;
        im0 c = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c.p(this.N);
        c.r(gm.L(20.0f));
        c.q(L);
        frameLayout.setBackground(c);
        frameLayout.addView(ib9Var, qoe.c(40.0f, -2));
        frameLayout.setOnClickListener(new wk8(ib9Var, (byte) 10));
        rve.a(frameLayout);
        LinearLayout linearLayout = this.E;
        if (!z) {
            i = -4;
        }
        linearLayout.addView(frameLayout, qoe.t(-2, -2, 16, 0, 0, i, 0));
    }

    public final void b0(Context context) {
        if (this.Q) {
            qb9 qb9Var = this.d;
            if (qb9Var.f.isEmpty()) {
                return;
            }
            bu5 bu5Var = new bu5(this, this.G, false, false);
            bu5Var.t = false;
            bu5Var.b0 = true;
            bu5Var.b0(0.0f, gm.L(-8.0f));
            bu5Var.U = true;
            bu5Var.p = new bo1(bu5Var, (byte) 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(qb9Var.f);
            Collections.sort(arrayList, new va9(this, (byte) 2));
            t34 t34Var = new t34(this, new wa9(this, strArr, arrayList, (byte) 2), new xa9(this, r14, (byte) 2), null, (byte) 2);
            t34Var.g3.r = false;
            q7c[] q7cVarArr = {t34Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232754);
            anb.s(imageView, cmb.E8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            qu3 qu3Var = new qu3(context, this.resourceProvider);
            qu3Var.setTextSize(1, 16.0f);
            qu3Var.setInputType(573441);
            qu3Var.setRawInputType(573441);
            anb.D(qu3Var, cmb.z6, this.resourceProvider);
            anb.l(qu3Var, 30, cmb.F6, this.resourceProvider);
            qu3Var.setCursorSize(gm.L(19.0f));
            qu3Var.setCursorWidth(1.5f);
            qu3Var.setHint(jb6.M0(2131749942, null));
            anb.X(qu3Var, cmb.D8, this.resourceProvider);
            qu3Var.setBackground(null);
            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 11));
            if (arrayList.size() > 8) {
                bu5Var.q(frameLayout, qoe.o(-1, 44));
                bu5Var.j();
            }
            if (!qb9Var.j.isEmpty()) {
                bu5Var.b(2131232363, jb6.M0(2131745404, null), new ya9(this, q7cVarArr, bu5Var, (byte) 2), false);
            }
            bu5Var.p(t34Var);
            i0(this.G, bu5Var);
        }
    }

    public final void c0(Integer num) {
        this.simpleActionBar.setTitleMinSideInset(gm.L(6.0f) + num.intValue());
    }

    @Override
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 8));
        this.simpleActionBar.setTitle(this.c);
        l0();
        FrameLayout elaVar = new ela(context, null);
        anb.h(cmb.Z6, getResourceProvider(), elaVar);
        this.fragmentView = elaVar;
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        t34 t34Var = new t34(this, new vh8(this, (byte) 8), new bb9(this), new i98(this, (byte) 18), (byte) 1);
        this.f = t34Var;
        t34Var.g3.r = false;
        t34Var.setSpanCount(3);
        this.f.j(new so7(this, (byte) 12));
        elaVar.addView(this.f, qoe.e(-1, -1, 119));
        ct8 ct8Var = new ct8(context, new View.OnClickListener(this) {
            public final zb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z;
                byte b = r2;
                zb9 zb9Var = this.b;
                switch (b) {
                    case 0:
                        qb9 qb9Var = zb9Var.d;
                        qb9Var.k.clear();
                        qb9Var.j.clear();
                        qb9Var.l.clear();
                        qb9Var.m();
                        return;
                    default:
                        qb9 qb9Var2 = zb9Var.d;
                        HashSet hashSet = qb9Var2.k;
                        HashSet hashSet2 = qb9Var2.l;
                        HashSet hashSet3 = qb9Var2.j;
                        boolean z2 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z3 = qb9Var2.r;
                            boolean z4 = qb9Var2.s;
                            boolean z5 = qb9Var2.t;
                            qb9Var2.j();
                            if (z3 == qb9Var2.r && z4 == qb9Var2.s && z5 == qb9Var2.t) {
                                z = false;
                            } else {
                                z = true;
                            }
                            qb9Var2.r = z3;
                            qb9Var2.s = z4;
                            qb9Var2.t = z5;
                            if (!z) {
                                z2 = true;
                            }
                        }
                        qb9Var2.k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z2) {
                            qb9Var2.r = qb9Var2.g();
                            qb9Var2.s = qb9Var2.h();
                            qb9Var2.t = qb9Var2.f();
                        } else {
                            qb9Var2.j();
                        }
                        jh2 jh2Var = zb9Var.P;
                        if (jh2Var != null) {
                            jh2Var.a(qb9Var2.k(), true);
                        }
                        qb9Var2.m();
                        return;
                }
            }
        }, this.resourceProvider);
        this.w = ct8Var;
        this.x = false;
        ct8Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        elaVar.addView(this.w, qoe.e(-1, -1, 119));
        qb9 qb9Var = this.d;
        if (qb9Var.d.isEmpty() && !qb9Var.y && qb9Var.z) {
            j0(true);
        }
        View view = new View(context);
        this.h = view;
        elaVar.addView(view, qoe.e(-1, 0, 48));
        baseSimpleGlass.f(elaVar, this.f, this.simpleActionBar, this.resourceProvider);
        km0 km0Var = baseSimpleGlass.c;
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        fb9 fb9Var = new fb9(this.currentAccount, this.resourceProvider, context);
        im0 c = km0Var.c(fb9Var, null, false);
        c.p(qqd.l(this.resourceProvider));
        c.r(gm.L(23.0f));
        c.q(gm.L(6.0f));
        fb9Var.setBackground(c);
        rve.a(fb9Var);
        fb9Var.setOnClickListener(new r39(this, fb9Var, (byte) 1));
        fb9Var.setOnWidthChanged(new ra9(this, (byte) 1));
        this.simpleActionBar.addView(fb9Var, qoe.e(-2, 58, 5));
        this.N = qqd.l(this.resourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(0);
        this.E.setClipChildren(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.y.setOverScrollMode(2);
        this.y.addView(this.E);
        this.y.setClipChildren(false);
        elaVar.addView(this.y, qoe.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(gm.L(4.0f), 0, gm.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final jh2 jh2Var = new jh2(24, this.resourceProvider, context);
        this.P = jh2Var;
        jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(qb9Var.k(), false);
        jh2Var.setDrawBackgroundAsArc(10);
        jh2Var.setTranslationX(gm.L(4.0f));
        jh2Var.setScaleX(0.8f);
        jh2Var.setScaleY(0.8f);
        linearLayout2.addView(jh2Var, qoe.r(26, 26, 16));
        TextView textView = new TextView(context);
        anb.X(textView, cmb.F6, this.resourceProvider);
        ts2.q(14.0f, 1, 2131749387, textView, null);
        linearLayout2.addView(textView, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        int L = gm.L(20.0f);
        int i = cmb.Ei;
        int p1 = cmb.p1(0.1f, getThemedColor(i));
        linearLayout2.setBackground(cmb.i0(L, L, L, L, 0, p1, p1));
        this.T = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        View view3 = this.r;
        im0 c2 = km0Var.c(view3, null, false);
        c2.p(qqd.l(this.resourceProvider));
        c2.q(gm.L(8.0f));
        c2.r(gm.L(20.0f));
        view3.setBackground(c2);
        this.r.setOnClickListener(new View.OnClickListener(this) {
            public final zb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        final zb9 zb9Var = this.b;
                        qb9 qb9Var2 = zb9Var.d;
                        if (zb9Var.Q) {
                            bu5 I = bu5.I(zb9Var, zb9Var.F);
                            I.b(2131231895, jb6.M0(2131745872, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    zb9 zb9Var2 = zb9Var;
                                    switch (b) {
                                        case 0:
                                            zb9Var2.d.p(pb9.a);
                                            return;
                                        case 1:
                                            zb9Var2.d.p(pb9.b);
                                            return;
                                        default:
                                            zb9Var2.d.p(pb9.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.b(2131231893, jb6.M0(2131745876, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    zb9 zb9Var2 = zb9Var;
                                    switch (b) {
                                        case 0:
                                            zb9Var2.d.p(pb9.a);
                                            return;
                                        case 1:
                                            zb9Var2.d.p(pb9.b);
                                            return;
                                        default:
                                            zb9Var2.d.p(pb9.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.b(2131231894, jb6.M0(2131745874, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    zb9 zb9Var2 = zb9Var;
                                    switch (b) {
                                        case 0:
                                            zb9Var2.d.p(pb9.a);
                                            return;
                                        case 1:
                                            zb9Var2.d.p(pb9.b);
                                            return;
                                        default:
                                            zb9Var2.d.p(pb9.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.j();
                            a8[] a8VarArr = new a8[4];
                            final no8 no8Var = new no8(zb9Var, I, jh2Var, a8VarArr, (byte) 9);
                            if (qb9Var2.h()) {
                                boolean z = qb9Var2.s;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        no8 no8Var2 = no8Var;
                                        zb9 zb9Var2 = zb9Var;
                                        switch (b) {
                                            case 0:
                                                qb9 qb9Var3 = zb9Var2.d;
                                                qb9Var3.o(qb9Var3.r, !qb9Var3.s, qb9Var3.t);
                                                no8Var2.run();
                                                return;
                                            case 1:
                                                qb9 qb9Var4 = zb9Var2.d;
                                                qb9Var4.o(!qb9Var4.r, qb9Var4.s, qb9Var4.t);
                                                no8Var2.run();
                                                return;
                                            default:
                                                qb9 qb9Var5 = zb9Var2.d;
                                                qb9Var5.o(qb9Var5.r, qb9Var5.s, !qb9Var5.t);
                                                no8Var2.run();
                                                return;
                                        }
                                    }
                                }, jb6.M0(2131749389, null), z);
                                a8VarArr[2] = I.z();
                            }
                            if (qb9Var2.g()) {
                                boolean z2 = qb9Var2.r;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        no8 no8Var2 = no8Var;
                                        zb9 zb9Var2 = zb9Var;
                                        switch (b) {
                                            case 0:
                                                qb9 qb9Var3 = zb9Var2.d;
                                                qb9Var3.o(qb9Var3.r, !qb9Var3.s, qb9Var3.t);
                                                no8Var2.run();
                                                return;
                                            case 1:
                                                qb9 qb9Var4 = zb9Var2.d;
                                                qb9Var4.o(!qb9Var4.r, qb9Var4.s, qb9Var4.t);
                                                no8Var2.run();
                                                return;
                                            default:
                                                qb9 qb9Var5 = zb9Var2.d;
                                                qb9Var5.o(qb9Var5.r, qb9Var5.s, !qb9Var5.t);
                                                no8Var2.run();
                                                return;
                                        }
                                    }
                                }, jb6.M0(2131749391, null), z2);
                                a8VarArr[1] = I.z();
                            }
                            if (qb9Var2.f()) {
                                boolean z3 = qb9Var2.t;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        no8 no8Var2 = no8Var;
                                        zb9 zb9Var2 = zb9Var;
                                        switch (b) {
                                            case 0:
                                                qb9 qb9Var3 = zb9Var2.d;
                                                qb9Var3.o(qb9Var3.r, !qb9Var3.s, qb9Var3.t);
                                                no8Var2.run();
                                                return;
                                            case 1:
                                                qb9 qb9Var4 = zb9Var2.d;
                                                qb9Var4.o(!qb9Var4.r, qb9Var4.s, qb9Var4.t);
                                                no8Var2.run();
                                                return;
                                            default:
                                                qb9 qb9Var5 = zb9Var2.d;
                                                qb9Var5.o(qb9Var5.r, qb9Var5.s, !qb9Var5.t);
                                                no8Var2.run();
                                                return;
                                        }
                                    }
                                }, jb6.M0(2131749388, null), z3);
                                a8VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.b0 = true;
                            I.b0(0.0f, gm.L(-8.0f));
                            zb9Var.i0(zb9Var.F, I);
                            return;
                        }
                        return;
                    default:
                        qb9 qb9Var3 = this.b.d;
                        if (qb9Var3 != null) {
                            if (qb9Var3.k()) {
                                qb9Var3.o(true, true, true);
                            } else {
                                qb9Var3.o(true, false, false);
                            }
                            jh2Var.a(qb9Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        this.r.addView(linearLayout2, qoe.c(-1.0f, -2));
        rve.b(this.r, 0.04f, 1.5f);
        elaVar.addView(this.r, qoe.e(-2, 56, 81));
        if (!qb9Var.g() || (!qb9Var.h() && !qb9Var.f())) {
            this.r.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        View view4 = this.n;
        im0 c3 = km0Var.c(view4, null, false);
        c3.p(qqd.l(this.resourceProvider));
        c3.q(gm.L(8.0f));
        c3.r(gm.L(22.0f));
        view4.setBackground(c3);
        elaVar.addView(this.n, qoe.e(-2, 60, 81));
        this.s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new pn2(2131232101, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131749947, null));
        this.s.setText(spannableStringBuilder);
        anb.X(this.s, i, getResourceProvider());
        this.s.setTypeface(gm.o());
        this.s.setPadding(gm.L(20.0f), 0, gm.L(20.0f), 0);
        TextView textView2 = this.s;
        int L2 = gm.L(22.0f);
        int p12 = cmb.p1(0.1f, getThemedColor(i));
        textView2.setBackground(cmb.i0(L2, L2, L2, L2, 0, p12, p12));
        this.s.setGravity(17);
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final zb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                boolean z;
                byte b = r2;
                zb9 zb9Var = this.b;
                switch (b) {
                    case 0:
                        qb9 qb9Var2 = zb9Var.d;
                        qb9Var2.k.clear();
                        qb9Var2.j.clear();
                        qb9Var2.l.clear();
                        qb9Var2.m();
                        return;
                    default:
                        qb9 qb9Var22 = zb9Var.d;
                        HashSet hashSet = qb9Var22.k;
                        HashSet hashSet2 = qb9Var22.l;
                        HashSet hashSet3 = qb9Var22.j;
                        boolean z2 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z3 = qb9Var22.r;
                            boolean z4 = qb9Var22.s;
                            boolean z5 = qb9Var22.t;
                            qb9Var22.j();
                            if (z3 == qb9Var22.r && z4 == qb9Var22.s && z5 == qb9Var22.t) {
                                z = false;
                            } else {
                                z = true;
                            }
                            qb9Var22.r = z3;
                            qb9Var22.s = z4;
                            qb9Var22.t = z5;
                            if (!z) {
                                z2 = true;
                            }
                        }
                        qb9Var22.k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z2) {
                            qb9Var22.r = qb9Var22.g();
                            qb9Var22.s = qb9Var22.h();
                            qb9Var22.t = qb9Var22.f();
                        } else {
                            qb9Var22.j();
                        }
                        jh2 jh2Var2 = zb9Var.P;
                        if (jh2Var2 != null) {
                            jh2Var2.a(qb9Var22.k(), true);
                        }
                        qb9Var22.m();
                        return;
                }
            }
        });
        this.n.addView(this.s, qoe.c(-1.0f, -2));
        this.n.setVisibility(8);
        rve.b(this.n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        ib9 ib9Var = new ib9(this.resourceProvider, context, true);
        this.F = ib9Var;
        ib9Var.setSorting(qb9Var.p);
        a0(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final zb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view42) {
                switch (r3) {
                    case 0:
                        final zb9 zb9Var = this.b;
                        qb9 qb9Var2 = zb9Var.d;
                        if (zb9Var.Q) {
                            bu5 I = bu5.I(zb9Var, zb9Var.F);
                            I.b(2131231895, jb6.M0(2131745872, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    zb9 zb9Var2 = zb9Var;
                                    switch (b) {
                                        case 0:
                                            zb9Var2.d.p(pb9.a);
                                            return;
                                        case 1:
                                            zb9Var2.d.p(pb9.b);
                                            return;
                                        default:
                                            zb9Var2.d.p(pb9.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.b(2131231893, jb6.M0(2131745876, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    zb9 zb9Var2 = zb9Var;
                                    switch (b) {
                                        case 0:
                                            zb9Var2.d.p(pb9.a);
                                            return;
                                        case 1:
                                            zb9Var2.d.p(pb9.b);
                                            return;
                                        default:
                                            zb9Var2.d.p(pb9.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.b(2131231894, jb6.M0(2131745874, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    zb9 zb9Var2 = zb9Var;
                                    switch (b) {
                                        case 0:
                                            zb9Var2.d.p(pb9.a);
                                            return;
                                        case 1:
                                            zb9Var2.d.p(pb9.b);
                                            return;
                                        default:
                                            zb9Var2.d.p(pb9.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.j();
                            a8[] a8VarArr = new a8[4];
                            final no8 no8Var = new no8(zb9Var, I, jh2Var, a8VarArr, (byte) 9);
                            if (qb9Var2.h()) {
                                boolean z = qb9Var2.s;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        no8 no8Var2 = no8Var;
                                        zb9 zb9Var2 = zb9Var;
                                        switch (b) {
                                            case 0:
                                                qb9 qb9Var3 = zb9Var2.d;
                                                qb9Var3.o(qb9Var3.r, !qb9Var3.s, qb9Var3.t);
                                                no8Var2.run();
                                                return;
                                            case 1:
                                                qb9 qb9Var4 = zb9Var2.d;
                                                qb9Var4.o(!qb9Var4.r, qb9Var4.s, qb9Var4.t);
                                                no8Var2.run();
                                                return;
                                            default:
                                                qb9 qb9Var5 = zb9Var2.d;
                                                qb9Var5.o(qb9Var5.r, qb9Var5.s, !qb9Var5.t);
                                                no8Var2.run();
                                                return;
                                        }
                                    }
                                }, jb6.M0(2131749389, null), z);
                                a8VarArr[2] = I.z();
                            }
                            if (qb9Var2.g()) {
                                boolean z2 = qb9Var2.r;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        no8 no8Var2 = no8Var;
                                        zb9 zb9Var2 = zb9Var;
                                        switch (b) {
                                            case 0:
                                                qb9 qb9Var3 = zb9Var2.d;
                                                qb9Var3.o(qb9Var3.r, !qb9Var3.s, qb9Var3.t);
                                                no8Var2.run();
                                                return;
                                            case 1:
                                                qb9 qb9Var4 = zb9Var2.d;
                                                qb9Var4.o(!qb9Var4.r, qb9Var4.s, qb9Var4.t);
                                                no8Var2.run();
                                                return;
                                            default:
                                                qb9 qb9Var5 = zb9Var2.d;
                                                qb9Var5.o(qb9Var5.r, qb9Var5.s, !qb9Var5.t);
                                                no8Var2.run();
                                                return;
                                        }
                                    }
                                }, jb6.M0(2131749391, null), z2);
                                a8VarArr[1] = I.z();
                            }
                            if (qb9Var2.f()) {
                                boolean z3 = qb9Var2.t;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        no8 no8Var2 = no8Var;
                                        zb9 zb9Var2 = zb9Var;
                                        switch (b) {
                                            case 0:
                                                qb9 qb9Var3 = zb9Var2.d;
                                                qb9Var3.o(qb9Var3.r, !qb9Var3.s, qb9Var3.t);
                                                no8Var2.run();
                                                return;
                                            case 1:
                                                qb9 qb9Var4 = zb9Var2.d;
                                                qb9Var4.o(!qb9Var4.r, qb9Var4.s, qb9Var4.t);
                                                no8Var2.run();
                                                return;
                                            default:
                                                qb9 qb9Var5 = zb9Var2.d;
                                                qb9Var5.o(qb9Var5.r, qb9Var5.s, !qb9Var5.t);
                                                no8Var2.run();
                                                return;
                                        }
                                    }
                                }, jb6.M0(2131749388, null), z3);
                                a8VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.b0 = true;
                            I.b0(0.0f, gm.L(-8.0f));
                            zb9Var.i0(zb9Var.F, I);
                            return;
                        }
                        return;
                    default:
                        qb9 qb9Var3 = this.b.d;
                        if (qb9Var3 != null) {
                            if (qb9Var3.k()) {
                                qb9Var3.o(true, true, true);
                            } else {
                                qb9Var3.o(true, false, false);
                            }
                            jh2Var.a(qb9Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        ib9 ib9Var2 = new ib9(this.resourceProvider, context, true);
        this.G = ib9Var2;
        ib9Var2.setValue(jb6.M0(2131750320, null));
        a0(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final zb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                zb9 zb9Var = this.b;
                switch (b) {
                    case 0:
                        zb9Var.b0(context2);
                        return;
                    case 1:
                        zb9Var.d0(context2);
                        return;
                    default:
                        zb9Var.e0(context2);
                        return;
                }
            }
        });
        ib9 ib9Var3 = new ib9(this.resourceProvider, context, true);
        this.H = ib9Var3;
        ib9Var3.setValue(jb6.M0(2131750321, null));
        a0(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final zb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                zb9 zb9Var = this.b;
                switch (b) {
                    case 0:
                        zb9Var.b0(context2);
                        return;
                    case 1:
                        zb9Var.d0(context2);
                        return;
                    default:
                        zb9Var.e0(context2);
                        return;
                }
            }
        });
        ib9 ib9Var4 = new ib9(this.resourceProvider, context, true);
        this.I = ib9Var4;
        ib9Var4.setValue(jb6.M0(2131750313, null));
        a0(this.I, true);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final zb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                zb9 zb9Var = this.b;
                switch (b) {
                    case 0:
                        zb9Var.b0(context2);
                        return;
                    case 1:
                        zb9Var.d0(context2);
                        return;
                    default:
                        zb9Var.e0(context2);
                        return;
                }
            }
        });
        uj4 uj4Var = new uj4(getParentActivity());
        this.J = uj4Var;
        elaVar.addView(uj4Var, qoe.c(-1.0f, -1));
        h0(false, false);
        return elaVar;
    }

    public final void d0(Context context) {
        if (this.Q) {
            qb9 qb9Var = this.d;
            if (qb9Var.g.isEmpty()) {
                return;
            }
            bu5 bu5Var = new bu5(this, this.H, false, false);
            bu5Var.t = false;
            bu5Var.b0 = true;
            bu5Var.b0(0.0f, gm.L(-8.0f));
            bu5Var.U = true;
            bu5Var.p = new bo1(bu5Var, (byte) 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(qb9Var.g);
            Collections.sort(arrayList, new va9(this, (byte) 1));
            t34 t34Var = new t34(this, new wa9(this, strArr, arrayList, (byte) 1), new xa9(this, r13, (byte) 1), null, (byte) 3);
            t34Var.g3.r = false;
            q7c[] q7cVarArr = {t34Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232754);
            anb.s(imageView, cmb.E8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            qu3 qu3Var = new qu3(context, this.resourceProvider);
            qu3Var.setTextSize(1, 16.0f);
            qu3Var.setInputType(573441);
            qu3Var.setRawInputType(573441);
            anb.D(qu3Var, cmb.z6, this.resourceProvider);
            anb.l(qu3Var, 30, cmb.F6, this.resourceProvider);
            qu3Var.setCursorSize(gm.L(19.0f));
            qu3Var.setCursorWidth(1.5f);
            qu3Var.setHint(jb6.M0(2131749942, null));
            anb.X(qu3Var, cmb.D8, this.resourceProvider);
            qu3Var.setBackground(null);
            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 12));
            if (arrayList.size() > 8) {
                bu5Var.q(frameLayout, qoe.o(-1, 44));
                bu5Var.j();
            }
            if (!qb9Var.k.isEmpty()) {
                bu5Var.b(2131232363, jb6.M0(2131745404, null), new ya9(this, q7cVarArr, bu5Var, (byte) 1), false);
            }
            bu5Var.p(t34Var);
            i0(this.H, bu5Var);
        }
    }

    public final void e0(Context context) {
        if (this.Q) {
            qb9 qb9Var = this.d;
            if (qb9Var.h.isEmpty()) {
                return;
            }
            bu5 bu5Var = new bu5(this, this.I, false, false);
            bu5Var.t = false;
            bu5Var.b0 = true;
            bu5Var.b0(0.0f, gm.L(-8.0f));
            bu5Var.U = true;
            bu5Var.p = new bo1(bu5Var, (byte) 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(qb9Var.h);
            Collections.sort(arrayList, new va9(this, (byte) 0));
            t34 t34Var = new t34(this, new wa9(this, strArr, arrayList, (byte) 0), new xa9(this, r13, (byte) 0), null, (byte) 4);
            t34Var.g3.r = false;
            q7c[] q7cVarArr = {t34Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232754);
            anb.s(imageView, cmb.E8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            qu3 qu3Var = new qu3(context, this.resourceProvider);
            qu3Var.setTextSize(1, 16.0f);
            qu3Var.setInputType(573441);
            qu3Var.setRawInputType(573441);
            anb.D(qu3Var, cmb.z6, this.resourceProvider);
            anb.l(qu3Var, 30, cmb.F6, this.resourceProvider);
            qu3Var.setCursorSize(gm.L(19.0f));
            qu3Var.setCursorWidth(1.5f);
            qu3Var.setHint(jb6.M0(2131749942, null));
            anb.X(qu3Var, cmb.D8, this.resourceProvider);
            qu3Var.setBackground(null);
            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 13));
            if (arrayList.size() > 8) {
                bu5Var.q(frameLayout, qoe.o(-1, 44));
                bu5Var.j();
            }
            if (!qb9Var.l.isEmpty()) {
                bu5Var.b(2131232363, jb6.M0(2131745404, null), new ya9(this, q7cVarArr, bu5Var, (byte) 0), false);
            }
            bu5Var.p(t34Var);
            i0(this.I, bu5Var);
        }
    }

    public final void f0(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        if (j == z8c.h(this.currentAccount).e()) {
            this.d.n(tL_starGiftUnique);
            if (j == z8c.h(this.currentAccount).e()) {
                c41 b0 = c41.b0(this);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = jb6.M0(2131752840, null);
                StringBuilder sb = new StringBuilder();
                sb.append(tL_starGiftUnique.title);
                sb.append(" #");
                u31 O = b0.O(document, M0, jb6.a0(null, null, 2131752841, kt6.m(tL_starGiftUnique.num, ',', sb)));
                O.s = false;
                O.j();
            } else {
                u31 O2 = c41.b0(this).O(tL_starGiftUnique.getDocument(), jb6.M0(2131752838, null), jb6.a0(null, null, 2131752839, pg3.r(this.currentAccount, j)));
                O2.s = false;
                O2.j();
            }
            this.J.c(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        cb9 cb9Var = new cb9(bundle, tL_starGiftUnique, j);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).b) {
            Dialog dialog = this.parentDialog;
            if ((dialog instanceof my0) && z) {
                ((my0) dialog).O0 = true;
            }
            finishFragment();
            d S = LaunchActivity.S();
            if (S != null) {
                S.presentFragment(cb9Var, false, z);
            }
        } else {
            presentFragment(cb9Var, true, z);
        }
        qac qacVar = this.e;
        if (qacVar != null) {
            qacVar.a(Boolean.valueOf(z));
        }
    }

    public final void g0(c6c c6cVar) {
        Object obj = c6cVar.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            wsa wsaVar = new wsa(getParentActivity(), this.currentAccount, this.b, this.resourceProvider, null);
            wsaVar.m2(tL_starGiftUnique.slug, tL_starGiftUnique, this.d);
            wsaVar.M2 = new bb9(this);
            showDialog(wsaVar);
        }
    }

    public final void h0(boolean z, boolean z2) {
        float f;
        if (this.Q == z) {
            return;
        }
        this.Q = z;
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.R = null;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f);
            this.R = ofFloat;
            ofFloat.addUpdateListener(new p29(this, (byte) 2));
            this.R.setInterpolator(d53.h);
            this.R.setDuration(420L);
            this.R.start();
            return;
        }
        this.M = f;
        k0();
    }

    public final void i0(ib9 ib9Var, bu5 bu5Var) {
        FrameLayout frameLayout;
        bka simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null && (bu5Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && (ib9Var.getParent() instanceof FrameLayout)) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) bu5Var.A;
            FrameLayout frameLayout2 = (FrameLayout) ib9Var.getParent();
            p41 p41Var = this.O;
            if (p41Var.a && (frameLayout = (FrameLayout) p41Var.b) != null && frameLayout != frameLayout2) {
                frameLayout.setVisibility(0);
            }
            p41Var.b = frameLayout2;
            p41Var.c = ib9Var;
            p41Var.d = simpleMenuOverlay;
            bu5Var.p = new cy0(simpleMenuOverlay, (byte) 1);
            simpleMenuOverlay.setOnClosed(new vw2(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 2));
            simpleMenuOverlay.e(p41Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
            return;
        }
        bu5Var.a0();
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().H0) && on2.h(getThemedColor(cmb.Z6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z) {
        float f;
        float f2;
        ct8 ct8Var = this.w;
        if (ct8Var == null || this.x == z) {
            return;
        }
        this.x = z;
        ct8Var.setVisibility(0);
        ViewPropertyAnimator animate = this.w.animate();
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
        scaleX.scaleY(f3).setInterpolator(d53.h).setDuration(320L).setListener(new jf4((byte) 28, this, z)).start();
    }

    public final void k0() {
        int i;
        if (this.y == null) {
            return;
        }
        float f = this.M;
        float L = gm.L(47.0f) * f;
        this.y.setTranslationY((eh0.d(this.K) - gm.L(6.0f)) - L);
        this.y.setAlpha(1.0f - f);
        HorizontalScrollView horizontalScrollView = this.y;
        if (f >= 1.0f) {
            i = 8;
        } else {
            i = 0;
        }
        horizontalScrollView.setVisibility(i);
        float f2 = -L;
        this.f.setTranslationY(f2);
        this.h.setTranslationY(f2);
    }

    public final void l0() {
        String H;
        rja rjaVar = this.simpleActionBar;
        if (rjaVar == null) {
            return;
        }
        int i = this.d.e;
        if (i <= 0) {
            H = jb6.M0(2131749940, null);
        } else {
            H = jb6.H(',', "Gift2ListingsCount", i);
        }
        rjaVar.setSubtitle(H);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null && rjaVar.getOccupyStatusBar()) {
            i2 = Math.max(i2, gm.m);
        }
        this.K = i2;
        this.L = Math.max(i4, gm.n);
        if (this.f == null) {
            return;
        }
        int L = gm.L(40.0f) + eh0.d(this.K);
        int L2 = gm.L(47.0f);
        int i5 = -eh0.c(this.K);
        int i6 = (-eh0.c(this.L)) - L2;
        gm.v3(this.f, gm.L(7.33f), i5, gm.L(7.33f), i6);
        this.f.setPadding(0, (gm.L(4.0f) + L) - i5, 0, (gm.L(56.0f) + this.L) - i6);
        this.h.getLayoutParams().height = gm.L(6.0f) + L;
        this.h.requestLayout();
        gm.v3(this.w, 0, a.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.n.getLayoutParams()).bottomMargin = this.L;
        this.r.requestLayout();
        this.n.requestLayout();
        k0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int p1 = cmb.p1(0.1f, getThemedColor(cmb.Ei));
            if (p1 != this.S) {
                this.S = p1;
                TextView textView = this.s;
                if (textView != null) {
                    cmb.F1(textView.getBackground(), p1, true);
                }
                LinearLayout linearLayout = this.T;
                if (linearLayout != null) {
                    cmb.F1(linearLayout.getBackground(), p1, true);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void V(float f, int i) {
    }
}
