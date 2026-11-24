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
public class z99 extends d implements x74 {
    public static final ArrayList U = new ArrayList();
    public LinearLayout E;
    public i99 F;
    public i99 G;
    public i99 H;
    public i99 I;
    public qh4 J;
    public int K;
    public int L;
    public float M;
    public nl0 N;
    public final h31 O;
    public wf2 P;
    public boolean Q;
    public ValueAnimator R;
    public int S;
    public LinearLayout T;
    public final fm0 a;
    public final long b;
    public final String c;
    public final q99 d;
    public p8c e;
    public i24 f;
    public View h;
    public FrameLayout n;
    public FrameLayout r;
    public TextView s;
    public ar8 w;
    public boolean x;
    public HorizontalScrollView y;

    public z99(long j, String str, long j2, wjb wjbVar) {
        super(null);
        this.a = new fm0(0, this, s33.h, 380L, false);
        ?? obj = new Object();
        obj.e = this;
        this.O = obj;
        boolean z = true;
        this.Q = true;
        this.b = j;
        this.c = str;
        this.resourceProvider = wjbVar;
        q99 q99Var = new q99(this.currentAccount, j2, new p89(this, (byte) 0));
        z = (j == 0 || j == y6c.h(q99Var.a).e()) ? false : z;
        q99Var.v = z;
        if (z) {
            q99Var.j();
        }
        this.d = q99Var;
        q99Var.l(false);
    }

    public final void Z(i99 i99Var, boolean z) {
        int L = gl.L(6.0f);
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        frameLayout.setPadding(L, L, L, L);
        int i = 0;
        il0 c = getBaseSimpleGlass().c.c(frameLayout, null, false);
        c.p(this.N);
        c.r(gl.L(20.0f));
        c.q(L);
        frameLayout.setBackground(c);
        frameLayout.addView(i99Var, nme.c(40.0f, -2));
        frameLayout.setOnClickListener(new ik8(i99Var, (byte) 7));
        ote.a(frameLayout);
        LinearLayout linearLayout = this.E;
        if (!z) {
            i = -4;
        }
        linearLayout.addView(frameLayout, nme.t(-2, -2, 16, 0, 0, i, 0));
    }

    public final void a0(Context context) {
        if (this.Q) {
            q99 q99Var = this.d;
            if (q99Var.f.isEmpty()) {
                return;
            }
            cs5 cs5Var = new cs5(this, this.G, false, false);
            cs5Var.t = false;
            cs5Var.b0 = true;
            cs5Var.b0(0.0f, gl.L(-8.0f));
            cs5Var.U = true;
            cs5Var.p = new en1(cs5Var, (byte) 5);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(q99Var.f);
            Collections.sort(arrayList, new t89(this, (byte) 2));
            i24 i24Var = new i24(this, new u89(this, strArr, arrayList, (byte) 2), new v89(this, r14, (byte) 2), null, (byte) 2);
            i24Var.g3.r = false;
            q5c[] q5cVarArr = {i24Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232742);
            zkb.s(imageView, bkb.E8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            gt3 gt3Var = new gt3(context, this.resourceProvider);
            gt3Var.setTextSize(1, 16.0f);
            gt3Var.setInputType(573441);
            gt3Var.setRawInputType(573441);
            zkb.D(gt3Var, bkb.z6, this.resourceProvider);
            zkb.l(gt3Var, 30, bkb.F6, this.resourceProvider);
            gt3Var.setCursorSize(gl.L(19.0f));
            gt3Var.setCursorWidth(1.5f);
            gt3Var.setHint(k96.M0(2131749993, null));
            zkb.X(gt3Var, bkb.D8, this.resourceProvider);
            gt3Var.setBackground(null);
            frameLayout.addView(gt3Var, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            gt3Var.addTextChangedListener(new qy(strArr, i24Var, false, (byte) 11));
            if (arrayList.size() > 8) {
                cs5Var.q(frameLayout, nme.o(-1, 44));
                cs5Var.j();
            }
            if (!q99Var.j.isEmpty()) {
                cs5Var.b(2131232362, k96.M0(2131745478, null), new w89(this, q5cVarArr, cs5Var, (byte) 2), false);
            }
            cs5Var.p(i24Var);
            h0(this.G, cs5Var);
        }
    }

    public final void b0(Integer num) {
        this.simpleActionBar.setTitleMinSideInset(gl.L(6.0f) + num.intValue());
    }

    public final void c0(Context context) {
        if (this.Q) {
            q99 q99Var = this.d;
            if (q99Var.g.isEmpty()) {
                return;
            }
            cs5 cs5Var = new cs5(this, this.H, false, false);
            cs5Var.t = false;
            cs5Var.b0 = true;
            cs5Var.b0(0.0f, gl.L(-8.0f));
            cs5Var.U = true;
            cs5Var.p = new en1(cs5Var, (byte) 4);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(q99Var.g);
            Collections.sort(arrayList, new t89(this, (byte) 1));
            i24 i24Var = new i24(this, new u89(this, strArr, arrayList, (byte) 1), new v89(this, r13, (byte) 1), null, (byte) 3);
            i24Var.g3.r = false;
            q5c[] q5cVarArr = {i24Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232742);
            zkb.s(imageView, bkb.E8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            gt3 gt3Var = new gt3(context, this.resourceProvider);
            gt3Var.setTextSize(1, 16.0f);
            gt3Var.setInputType(573441);
            gt3Var.setRawInputType(573441);
            zkb.D(gt3Var, bkb.z6, this.resourceProvider);
            zkb.l(gt3Var, 30, bkb.F6, this.resourceProvider);
            gt3Var.setCursorSize(gl.L(19.0f));
            gt3Var.setCursorWidth(1.5f);
            gt3Var.setHint(k96.M0(2131749993, null));
            zkb.X(gt3Var, bkb.D8, this.resourceProvider);
            gt3Var.setBackground(null);
            frameLayout.addView(gt3Var, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            gt3Var.addTextChangedListener(new qy(strArr, i24Var, false, (byte) 12));
            if (arrayList.size() > 8) {
                cs5Var.q(frameLayout, nme.o(-1, 44));
                cs5Var.j();
            }
            if (!q99Var.k.isEmpty()) {
                cs5Var.b(2131232362, k96.M0(2131745478, null), new w89(this, q5cVarArr, cs5Var, (byte) 1), false);
            }
            cs5Var.p(i24Var);
            h0(this.H, cs5Var);
        }
    }

    @Override
    public final View createView(final Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 7));
        this.simpleActionBar.setTitle(this.c);
        k0();
        FrameLayout cjaVar = new cja(context, null);
        zkb.h(bkb.Z6, getResourceProvider(), cjaVar);
        this.fragmentView = cjaVar;
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        i24 i24Var = new i24(this, new tf8(this, (byte) 8), new a99(this), new sc8(this, (byte) 17), (byte) 1);
        this.f = i24Var;
        i24Var.g3.r = false;
        i24Var.setSpanCount(3);
        this.f.j(new n58(this, (byte) 11));
        cjaVar.addView(this.f, nme.e(-1, -1, 119));
        ar8 ar8Var = new ar8(context, new View.OnClickListener(this) {
            public final z99 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z;
                byte b = r2;
                z99 z99Var = this.b;
                switch (b) {
                    case 0:
                        q99 q99Var = z99Var.d;
                        q99Var.k.clear();
                        q99Var.j.clear();
                        q99Var.l.clear();
                        q99Var.m();
                        return;
                    default:
                        q99 q99Var2 = z99Var.d;
                        HashSet hashSet = q99Var2.k;
                        HashSet hashSet2 = q99Var2.l;
                        HashSet hashSet3 = q99Var2.j;
                        boolean z2 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z3 = q99Var2.r;
                            boolean z4 = q99Var2.s;
                            boolean z5 = q99Var2.t;
                            q99Var2.j();
                            if (z3 == q99Var2.r && z4 == q99Var2.s && z5 == q99Var2.t) {
                                z = false;
                            } else {
                                z = true;
                            }
                            q99Var2.r = z3;
                            q99Var2.s = z4;
                            q99Var2.t = z5;
                            if (!z) {
                                z2 = true;
                            }
                        }
                        q99Var2.k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z2) {
                            q99Var2.r = q99Var2.g();
                            q99Var2.s = q99Var2.h();
                            q99Var2.t = q99Var2.f();
                        } else {
                            q99Var2.j();
                        }
                        wf2 wf2Var = z99Var.P;
                        if (wf2Var != null) {
                            wf2Var.a(q99Var2.k(), true);
                        }
                        q99Var2.m();
                        return;
                }
            }
        }, this.resourceProvider);
        this.w = ar8Var;
        this.x = false;
        ar8Var.setAlpha(0.0f);
        this.w.setScaleX(0.95f);
        this.w.setScaleY(0.95f);
        this.w.setVisibility(8);
        cjaVar.addView(this.w, nme.e(-1, -1, 119));
        q99 q99Var = this.d;
        if (q99Var.d.isEmpty() && !q99Var.y && q99Var.z) {
            i0(true);
        }
        View view = new View(context);
        this.h = view;
        cjaVar.addView(view, nme.e(-1, 0, 48));
        baseSimpleGlass.f(cjaVar, this.f, this.simpleActionBar, this.resourceProvider);
        kl0 kl0Var = baseSimpleGlass.c;
        View view2 = this.h;
        view2.setBackground(baseSimpleGlass.a(view2));
        this.simpleActionBar.setBackground(null);
        f99 f99Var = new f99(this.currentAccount, this.resourceProvider, context);
        il0 c = kl0Var.c(f99Var, null, false);
        c.p(nod.l(this.resourceProvider));
        c.r(gl.L(23.0f));
        c.q(gl.L(6.0f));
        f99Var.setBackground(c);
        ote.a(f99Var);
        f99Var.setOnClickListener(new b99(this, f99Var, (byte) 0));
        f99Var.setOnWidthChanged(new p89(this, (byte) 1));
        this.simpleActionBar.addView(f99Var, nme.e(-2, 58, 5));
        this.N = nod.l(this.resourceProvider);
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
        cjaVar.addView(this.y, nme.e(-1, 52, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(gl.L(4.0f), 0, gl.L(15.0f), 0);
        linearLayout2.setOrientation(0);
        final wf2 wf2Var = new wf2(24, this.resourceProvider, context);
        this.P = wf2Var;
        wf2Var.b(bkb.g7, bkb.i7, bkb.j7);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(q99Var.k(), false);
        wf2Var.setDrawBackgroundAsArc(10);
        wf2Var.setTranslationX(gl.L(4.0f));
        wf2Var.setScaleX(0.8f);
        wf2Var.setScaleY(0.8f);
        linearLayout2.addView(wf2Var, nme.r(26, 26, 16));
        TextView textView = new TextView(context);
        zkb.X(textView, bkb.F6, this.resourceProvider);
        ir2.r(14.0f, 1, 2131749438, textView, null);
        linearLayout2.addView(textView, nme.t(-2, -2, 16, 9, 0, 0, 0));
        int L = gl.L(20.0f);
        int i = bkb.Ei;
        int p1 = bkb.p1(0.1f, getThemedColor(i));
        linearLayout2.setBackground(bkb.i0(L, L, L, L, 0, p1, p1));
        this.T = linearLayout2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        View view3 = this.r;
        il0 c2 = kl0Var.c(view3, null, false);
        c2.p(nod.l(this.resourceProvider));
        c2.q(gl.L(8.0f));
        c2.r(gl.L(20.0f));
        view3.setBackground(c2);
        this.r.setOnClickListener(new View.OnClickListener(this) {
            public final z99 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        final z99 z99Var = this.b;
                        q99 q99Var2 = z99Var.d;
                        if (z99Var.Q) {
                            cs5 I = cs5.I(z99Var, z99Var.F);
                            I.b(2131231894, k96.M0(2131745946, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    z99 z99Var2 = z99Var;
                                    switch (b) {
                                        case 0:
                                            z99Var2.d.p(p99.a);
                                            return;
                                        case 1:
                                            z99Var2.d.p(p99.b);
                                            return;
                                        default:
                                            z99Var2.d.p(p99.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.b(2131231892, k96.M0(2131745950, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    z99 z99Var2 = z99Var;
                                    switch (b) {
                                        case 0:
                                            z99Var2.d.p(p99.a);
                                            return;
                                        case 1:
                                            z99Var2.d.p(p99.b);
                                            return;
                                        default:
                                            z99Var2.d.p(p99.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.b(2131231893, k96.M0(2131745948, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    z99 z99Var2 = z99Var;
                                    switch (b) {
                                        case 0:
                                            z99Var2.d.p(p99.a);
                                            return;
                                        case 1:
                                            z99Var2.d.p(p99.b);
                                            return;
                                        default:
                                            z99Var2.d.p(p99.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.j();
                            a8[] a8VarArr = new a8[4];
                            final bm8 bm8Var = new bm8(z99Var, I, wf2Var, a8VarArr, (byte) 9);
                            if (q99Var2.h()) {
                                boolean z = q99Var2.s;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        bm8 bm8Var2 = bm8Var;
                                        z99 z99Var2 = z99Var;
                                        switch (b) {
                                            case 0:
                                                q99 q99Var3 = z99Var2.d;
                                                q99Var3.o(q99Var3.r, !q99Var3.s, q99Var3.t);
                                                bm8Var2.run();
                                                return;
                                            case 1:
                                                q99 q99Var4 = z99Var2.d;
                                                q99Var4.o(!q99Var4.r, q99Var4.s, q99Var4.t);
                                                bm8Var2.run();
                                                return;
                                            default:
                                                q99 q99Var5 = z99Var2.d;
                                                q99Var5.o(q99Var5.r, q99Var5.s, !q99Var5.t);
                                                bm8Var2.run();
                                                return;
                                        }
                                    }
                                }, k96.M0(2131749440, null), z);
                                a8VarArr[2] = I.z();
                            }
                            if (q99Var2.g()) {
                                boolean z2 = q99Var2.r;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        bm8 bm8Var2 = bm8Var;
                                        z99 z99Var2 = z99Var;
                                        switch (b) {
                                            case 0:
                                                q99 q99Var3 = z99Var2.d;
                                                q99Var3.o(q99Var3.r, !q99Var3.s, q99Var3.t);
                                                bm8Var2.run();
                                                return;
                                            case 1:
                                                q99 q99Var4 = z99Var2.d;
                                                q99Var4.o(!q99Var4.r, q99Var4.s, q99Var4.t);
                                                bm8Var2.run();
                                                return;
                                            default:
                                                q99 q99Var5 = z99Var2.d;
                                                q99Var5.o(q99Var5.r, q99Var5.s, !q99Var5.t);
                                                bm8Var2.run();
                                                return;
                                        }
                                    }
                                }, k96.M0(2131749442, null), z2);
                                a8VarArr[1] = I.z();
                            }
                            if (q99Var2.f()) {
                                boolean z3 = q99Var2.t;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        bm8 bm8Var2 = bm8Var;
                                        z99 z99Var2 = z99Var;
                                        switch (b) {
                                            case 0:
                                                q99 q99Var3 = z99Var2.d;
                                                q99Var3.o(q99Var3.r, !q99Var3.s, q99Var3.t);
                                                bm8Var2.run();
                                                return;
                                            case 1:
                                                q99 q99Var4 = z99Var2.d;
                                                q99Var4.o(!q99Var4.r, q99Var4.s, q99Var4.t);
                                                bm8Var2.run();
                                                return;
                                            default:
                                                q99 q99Var5 = z99Var2.d;
                                                q99Var5.o(q99Var5.r, q99Var5.s, !q99Var5.t);
                                                bm8Var2.run();
                                                return;
                                        }
                                    }
                                }, k96.M0(2131749439, null), z3);
                                a8VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.b0 = true;
                            I.b0(0.0f, gl.L(-8.0f));
                            z99Var.h0(z99Var.F, I);
                            return;
                        }
                        return;
                    default:
                        q99 q99Var3 = this.b.d;
                        if (q99Var3 != null) {
                            if (q99Var3.k()) {
                                q99Var3.o(true, true, true);
                            } else {
                                q99Var3.o(true, false, false);
                            }
                            wf2Var.a(q99Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        this.r.addView(linearLayout2, nme.c(-1.0f, -2));
        ote.b(this.r, 0.04f, 1.5f);
        cjaVar.addView(this.r, nme.e(-2, 56, 81));
        if (!q99Var.g() || (!q99Var.h() && !q99Var.f())) {
            this.r.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        View view4 = this.n;
        il0 c3 = kl0Var.c(view4, null, false);
        c3.p(nod.l(this.resourceProvider));
        c3.q(gl.L(8.0f));
        c3.r(gl.L(22.0f));
        view4.setBackground(c3);
        cjaVar.addView(this.n, nme.e(-2, 60, 81));
        this.s = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new cm2(2131232100, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131749998, null));
        this.s.setText(spannableStringBuilder);
        zkb.X(this.s, i, getResourceProvider());
        this.s.setTypeface(gl.o());
        this.s.setPadding(gl.L(20.0f), 0, gl.L(20.0f), 0);
        TextView textView2 = this.s;
        int L2 = gl.L(22.0f);
        int p12 = bkb.p1(0.1f, getThemedColor(i));
        textView2.setBackground(bkb.i0(L2, L2, L2, L2, 0, p12, p12));
        this.s.setGravity(17);
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final z99 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                boolean z;
                byte b = r2;
                z99 z99Var = this.b;
                switch (b) {
                    case 0:
                        q99 q99Var2 = z99Var.d;
                        q99Var2.k.clear();
                        q99Var2.j.clear();
                        q99Var2.l.clear();
                        q99Var2.m();
                        return;
                    default:
                        q99 q99Var22 = z99Var.d;
                        HashSet hashSet = q99Var22.k;
                        HashSet hashSet2 = q99Var22.l;
                        HashSet hashSet3 = q99Var22.j;
                        boolean z2 = false;
                        if (hashSet.isEmpty() && hashSet3.isEmpty() && hashSet2.isEmpty()) {
                            boolean z3 = q99Var22.r;
                            boolean z4 = q99Var22.s;
                            boolean z5 = q99Var22.t;
                            q99Var22.j();
                            if (z3 == q99Var22.r && z4 == q99Var22.s && z5 == q99Var22.t) {
                                z = false;
                            } else {
                                z = true;
                            }
                            q99Var22.r = z3;
                            q99Var22.s = z4;
                            q99Var22.t = z5;
                            if (!z) {
                                z2 = true;
                            }
                        }
                        q99Var22.k.clear();
                        hashSet3.clear();
                        hashSet2.clear();
                        if (z2) {
                            q99Var22.r = q99Var22.g();
                            q99Var22.s = q99Var22.h();
                            q99Var22.t = q99Var22.f();
                        } else {
                            q99Var22.j();
                        }
                        wf2 wf2Var2 = z99Var.P;
                        if (wf2Var2 != null) {
                            wf2Var2.a(q99Var22.k(), true);
                        }
                        q99Var22.m();
                        return;
                }
            }
        });
        this.n.addView(this.s, nme.c(-1.0f, -2));
        this.n.setVisibility(8);
        ote.b(this.n, 0.05f, 1.5f);
        onInsets(0, 0, 0, 0);
        i99 i99Var = new i99(this.resourceProvider, context, true);
        this.F = i99Var;
        i99Var.setSorting(q99Var.p);
        Z(this.F, false);
        this.F.setOnClickListener(new View.OnClickListener(this) {
            public final z99 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view42) {
                switch (r3) {
                    case 0:
                        final z99 z99Var = this.b;
                        q99 q99Var2 = z99Var.d;
                        if (z99Var.Q) {
                            cs5 I = cs5.I(z99Var, z99Var.F);
                            I.b(2131231894, k96.M0(2131745946, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    z99 z99Var2 = z99Var;
                                    switch (b) {
                                        case 0:
                                            z99Var2.d.p(p99.a);
                                            return;
                                        case 1:
                                            z99Var2.d.p(p99.b);
                                            return;
                                        default:
                                            z99Var2.d.p(p99.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.b(2131231892, k96.M0(2131745950, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    z99 z99Var2 = z99Var;
                                    switch (b) {
                                        case 0:
                                            z99Var2.d.p(p99.a);
                                            return;
                                        case 1:
                                            z99Var2.d.p(p99.b);
                                            return;
                                        default:
                                            z99Var2.d.p(p99.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.b(2131231893, k96.M0(2131745948, null), new Runnable() {
                                @Override
                                public final void run() {
                                    byte b = r2;
                                    z99 z99Var2 = z99Var;
                                    switch (b) {
                                        case 0:
                                            z99Var2.d.p(p99.a);
                                            return;
                                        case 1:
                                            z99Var2.d.p(p99.b);
                                            return;
                                        default:
                                            z99Var2.d.p(p99.c);
                                            return;
                                    }
                                }
                            }, false);
                            I.j();
                            a8[] a8VarArr = new a8[4];
                            final bm8 bm8Var = new bm8(z99Var, I, wf2Var, a8VarArr, (byte) 9);
                            if (q99Var2.h()) {
                                boolean z = q99Var2.s;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        bm8 bm8Var2 = bm8Var;
                                        z99 z99Var2 = z99Var;
                                        switch (b) {
                                            case 0:
                                                q99 q99Var3 = z99Var2.d;
                                                q99Var3.o(q99Var3.r, !q99Var3.s, q99Var3.t);
                                                bm8Var2.run();
                                                return;
                                            case 1:
                                                q99 q99Var4 = z99Var2.d;
                                                q99Var4.o(!q99Var4.r, q99Var4.s, q99Var4.t);
                                                bm8Var2.run();
                                                return;
                                            default:
                                                q99 q99Var5 = z99Var2.d;
                                                q99Var5.o(q99Var5.r, q99Var5.s, !q99Var5.t);
                                                bm8Var2.run();
                                                return;
                                        }
                                    }
                                }, k96.M0(2131749440, null), z);
                                a8VarArr[2] = I.z();
                            }
                            if (q99Var2.g()) {
                                boolean z2 = q99Var2.r;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        bm8 bm8Var2 = bm8Var;
                                        z99 z99Var2 = z99Var;
                                        switch (b) {
                                            case 0:
                                                q99 q99Var3 = z99Var2.d;
                                                q99Var3.o(q99Var3.r, !q99Var3.s, q99Var3.t);
                                                bm8Var2.run();
                                                return;
                                            case 1:
                                                q99 q99Var4 = z99Var2.d;
                                                q99Var4.o(!q99Var4.r, q99Var4.s, q99Var4.t);
                                                bm8Var2.run();
                                                return;
                                            default:
                                                q99 q99Var5 = z99Var2.d;
                                                q99Var5.o(q99Var5.r, q99Var5.s, !q99Var5.t);
                                                bm8Var2.run();
                                                return;
                                        }
                                    }
                                }, k96.M0(2131749442, null), z2);
                                a8VarArr[1] = I.z();
                            }
                            if (q99Var2.f()) {
                                boolean z3 = q99Var2.t;
                                I.h(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r3;
                                        bm8 bm8Var2 = bm8Var;
                                        z99 z99Var2 = z99Var;
                                        switch (b) {
                                            case 0:
                                                q99 q99Var3 = z99Var2.d;
                                                q99Var3.o(q99Var3.r, !q99Var3.s, q99Var3.t);
                                                bm8Var2.run();
                                                return;
                                            case 1:
                                                q99 q99Var4 = z99Var2.d;
                                                q99Var4.o(!q99Var4.r, q99Var4.s, q99Var4.t);
                                                bm8Var2.run();
                                                return;
                                            default:
                                                q99 q99Var5 = z99Var2.d;
                                                q99Var5.o(q99Var5.r, q99Var5.s, !q99Var5.t);
                                                bm8Var2.run();
                                                return;
                                        }
                                    }
                                }, k96.M0(2131749439, null), z3);
                                a8VarArr[3] = I.z();
                            }
                            I.t = false;
                            I.b0 = true;
                            I.b0(0.0f, gl.L(-8.0f));
                            z99Var.h0(z99Var.F, I);
                            return;
                        }
                        return;
                    default:
                        q99 q99Var3 = this.b.d;
                        if (q99Var3 != null) {
                            if (q99Var3.k()) {
                                q99Var3.o(true, true, true);
                            } else {
                                q99Var3.o(true, false, false);
                            }
                            wf2Var.a(q99Var3.k(), true);
                            return;
                        }
                        return;
                }
            }
        });
        i99 i99Var2 = new i99(this.resourceProvider, context, true);
        this.G = i99Var2;
        i99Var2.setValue(k96.M0(2131750371, null));
        Z(this.G, false);
        this.G.setOnClickListener(new View.OnClickListener(this) {
            public final z99 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                z99 z99Var = this.b;
                switch (b) {
                    case 0:
                        z99Var.a0(context2);
                        return;
                    case 1:
                        z99Var.c0(context2);
                        return;
                    default:
                        z99Var.d0(context2);
                        return;
                }
            }
        });
        i99 i99Var3 = new i99(this.resourceProvider, context, true);
        this.H = i99Var3;
        i99Var3.setValue(k96.M0(2131750372, null));
        Z(this.H, false);
        this.H.setOnClickListener(new View.OnClickListener(this) {
            public final z99 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                z99 z99Var = this.b;
                switch (b) {
                    case 0:
                        z99Var.a0(context2);
                        return;
                    case 1:
                        z99Var.c0(context2);
                        return;
                    default:
                        z99Var.d0(context2);
                        return;
                }
            }
        });
        i99 i99Var4 = new i99(this.resourceProvider, context, true);
        this.I = i99Var4;
        i99Var4.setValue(k96.M0(2131750364, null));
        Z(this.I, true);
        this.I.setOnClickListener(new View.OnClickListener(this) {
            public final z99 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view5) {
                byte b = r3;
                Context context2 = context;
                z99 z99Var = this.b;
                switch (b) {
                    case 0:
                        z99Var.a0(context2);
                        return;
                    case 1:
                        z99Var.c0(context2);
                        return;
                    default:
                        z99Var.d0(context2);
                        return;
                }
            }
        });
        qh4 qh4Var = new qh4(getParentActivity());
        this.J = qh4Var;
        cjaVar.addView(qh4Var, nme.c(-1.0f, -1));
        g0(false, false);
        return cjaVar;
    }

    public final void d0(Context context) {
        if (this.Q) {
            q99 q99Var = this.d;
            if (q99Var.h.isEmpty()) {
                return;
            }
            cs5 cs5Var = new cs5(this, this.I, false, false);
            cs5Var.t = false;
            cs5Var.b0 = true;
            cs5Var.b0(0.0f, gl.L(-8.0f));
            cs5Var.U = true;
            cs5Var.p = new en1(cs5Var, (byte) 3);
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(q99Var.h);
            Collections.sort(arrayList, new t89(this, (byte) 0));
            i24 i24Var = new i24(this, new u89(this, strArr, arrayList, (byte) 0), new v89(this, r13, (byte) 0), null, (byte) 4);
            i24Var.g3.r = false;
            q5c[] q5cVarArr = {i24Var};
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131232742);
            zkb.s(imageView, bkb.E8, getResourceProvider(), PorterDuff.Mode.SRC_IN);
            frameLayout.addView(imageView, nme.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            gt3 gt3Var = new gt3(context, this.resourceProvider);
            gt3Var.setTextSize(1, 16.0f);
            gt3Var.setInputType(573441);
            gt3Var.setRawInputType(573441);
            zkb.D(gt3Var, bkb.z6, this.resourceProvider);
            zkb.l(gt3Var, 30, bkb.F6, this.resourceProvider);
            gt3Var.setCursorSize(gl.L(19.0f));
            gt3Var.setCursorWidth(1.5f);
            gt3Var.setHint(k96.M0(2131749993, null));
            zkb.X(gt3Var, bkb.D8, this.resourceProvider);
            gt3Var.setBackground(null);
            frameLayout.addView(gt3Var, nme.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            gt3Var.addTextChangedListener(new qy(strArr, i24Var, false, (byte) 13));
            if (arrayList.size() > 8) {
                cs5Var.q(frameLayout, nme.o(-1, 44));
                cs5Var.j();
            }
            if (!q99Var.l.isEmpty()) {
                cs5Var.b(2131232362, k96.M0(2131745478, null), new w89(this, q5cVarArr, cs5Var, (byte) 0), false);
            }
            cs5Var.p(i24Var);
            h0(this.I, cs5Var);
        }
    }

    public final void e0(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, boolean z) {
        if (j == y6c.h(this.currentAccount).e()) {
            this.d.n(tL_starGiftUnique);
            if (j == y6c.h(this.currentAccount).e()) {
                u21 b0 = u21.b0(this);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String M0 = k96.M0(2131752875, null);
                StringBuilder sb = new StringBuilder();
                sb.append(tL_starGiftUnique.title);
                sb.append(" #");
                m21 O = b0.O(document, M0, k96.a0(null, null, 2131752876, ls6.m(tL_starGiftUnique.num, ',', sb)));
                O.r = false;
                O.j();
            } else {
                m21 O2 = u21.b0(this).O(tL_starGiftUnique.getDocument(), k96.M0(2131752873, null), k96.a0(null, null, 2131752874, cf3.r(this.currentAccount, j)));
                O2.r = false;
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
        c99 c99Var = new c99(bundle, tL_starGiftUnique, j);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).b) {
            Dialog dialog = this.parentDialog;
            if ((dialog instanceof fx0) && z) {
                ((fx0) dialog).O0 = true;
            }
            finishFragment();
            d S = LaunchActivity.S();
            if (S != null) {
                S.presentFragment(c99Var, false, z);
            }
        } else {
            presentFragment(c99Var, true, z);
        }
        p8c p8cVar = this.e;
        if (p8cVar != null) {
            p8cVar.a(Boolean.valueOf(z));
        }
    }

    public final void f0(c4c c4cVar) {
        Object obj = c4cVar.H;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            vqa vqaVar = new vqa(getParentActivity(), this.currentAccount, this.b, this.resourceProvider, null);
            vqaVar.m2(tL_starGiftUnique.slug, tL_starGiftUnique, this.d);
            vqaVar.M2 = new a99(this);
            showDialog(vqaVar);
        }
    }

    public final void g0(boolean z, boolean z2) {
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
            ofFloat.addUpdateListener(new x89(this, (byte) 0));
            this.R.setInterpolator(s33.h);
            this.R.setDuration(420L);
            this.R.start();
            return;
        }
        this.M = f;
        j0();
    }

    public final void h0(i99 i99Var, cs5 cs5Var) {
        FrameLayout frameLayout;
        zha simpleMenuOverlay = getSimpleMenuOverlay();
        if (simpleMenuOverlay != null && (cs5Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && (i99Var.getParent() instanceof FrameLayout)) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) cs5Var.A;
            FrameLayout frameLayout2 = (FrameLayout) i99Var.getParent();
            h31 h31Var = this.O;
            if (h31Var.a && (frameLayout = (FrameLayout) h31Var.b) != null && frameLayout != frameLayout2) {
                frameLayout.setVisibility(0);
            }
            h31Var.b = frameLayout2;
            h31Var.c = i99Var;
            h31Var.d = simpleMenuOverlay;
            cs5Var.p = new uw0(simpleMenuOverlay, (byte) 1);
            simpleMenuOverlay.setOnClosed(new lv2(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 2));
            simpleMenuOverlay.d(h31Var, null, actionBarPopupWindow$ActionBarPopupWindowLayout);
            return;
        }
        cs5Var.a0();
    }

    public final void i0(boolean z) {
        float f;
        float f2;
        ar8 ar8Var = this.w;
        if (ar8Var == null || this.x == z) {
            return;
        }
        this.x = z;
        ar8Var.setVisibility(0);
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
        scaleX.scaleY(f3).setInterpolator(s33.h).setDuration(320L).setListener(new id4((byte) 28, this, z)).start();
    }

    @Override
    public final boolean isLightStatusBar() {
        if ((getLastStoryViewer() == null || getLastStoryViewer().H0) && bm2.h(getThemedColor(bkb.Z6)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        int i;
        if (this.y == null) {
            return;
        }
        float f = this.M;
        float L = gl.L(47.0f) * f;
        this.y.setTranslationY((dg0.d(this.K) - gl.L(6.0f)) - L);
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

    public final void k0() {
        String H;
        pha phaVar = this.simpleActionBar;
        if (phaVar == null) {
            return;
        }
        int i = this.d.e;
        if (i <= 0) {
            H = k96.M0(2131749991, null);
        } else {
            H = k96.H(',', "Gift2ListingsCount", i);
        }
        phaVar.setSubtitle(H);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        pha phaVar = this.simpleActionBar;
        if (phaVar != null && phaVar.getOccupyStatusBar()) {
            i2 = Math.max(i2, gl.m);
        }
        this.K = i2;
        this.L = Math.max(i4, gl.n);
        if (this.f == null) {
            return;
        }
        int L = gl.L(40.0f) + dg0.d(this.K);
        int L2 = gl.L(47.0f);
        int i5 = -dg0.c(this.K);
        int i6 = (-dg0.c(this.L)) - L2;
        gl.w3(this.f, gl.L(7.33f), i5, gl.L(7.33f), i6);
        this.f.setPadding(0, (gl.L(4.0f) + L) - i5, 0, (gl.L(56.0f) + this.L) - i6);
        this.h.getLayoutParams().height = gl.L(6.0f) + L;
        this.h.requestLayout();
        gl.w3(this.w, 0, a.getCurrentActionBarHeight() + this.K, 0, 0);
        ((FrameLayout.LayoutParams) this.r.getLayoutParams()).bottomMargin = this.L;
        ((FrameLayout.LayoutParams) this.n.getLayoutParams()).bottomMargin = this.L;
        this.r.requestLayout();
        this.n.requestLayout();
        j0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int p1 = bkb.p1(0.1f, getThemedColor(bkb.Ei));
            if (p1 != this.S) {
                this.S = p1;
                TextView textView = this.s;
                if (textView != null) {
                    bkb.F1(textView.getBackground(), p1, true);
                }
                LinearLayout linearLayout = this.T;
                if (linearLayout != null) {
                    bkb.F1(linearLayout.getBackground(), p1, true);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            this.r.setTranslationY((-gl.L(52.0f)) * f);
            un4.d(this.n, f);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void D(float f, int i) {
    }
}
