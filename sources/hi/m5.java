package hi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.kh;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.LaunchActivity;
public abstract class m5 extends tt0 implements tg.g1, tg.h, tg.c1, rt0, oa {
    public final t4 A0;
    public ArrayList A1;
    public final h5 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final i5 D0;
    public sg.q D1;
    public final t4 E0;
    public final boolean E1;
    public final FrameLayout F0;
    public final File F1;
    public y4 G0;
    public final boolean G1;
    public final View H0;
    public final boolean H1;
    public int I0;
    public boolean I1;
    public int J0;
    public mi0 J1;
    public float K0;
    public tg.q1 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final tg.m1 N0;
    public boolean N1;
    public final gc.b O0;
    public org.telegram.ui.Components.u9 O1;
    public final int P0;
    public final w5 P1;
    public BigInteger Q0;
    public final x5 Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public final float[] T1;
    public final tg.h1 U0;
    public a5 U1;
    public final tg.e1 V0;
    public boolean V1;
    public final tg.j1 W0;
    public boolean W1;
    public final ImageView X0;
    public boolean X1;
    public final TextView Y0;
    public final int[] Y1;
    public final TextView Z0;
    public ly Z1;
    public final TextView f14657a1;
    public boolean f14658a2;
    public final Paint f14659b1;
    public boolean f14660b2;
    public final Paint f14661c1;
    public boolean f14662c2;
    public float f14663d1;
    public int d2;
    public boolean f14664e1;
    public boolean f14665e2;
    public r1.g f14666f1;
    public int f14667f2;
    public final u4 f14668g1;
    public int f14669g2;
    public final Paint f14670h1;
    public int f14671h2;
    public final Paint f14672i1;
    public boolean f14673i2;
    public final Paint f14674j1;
    public final tg.v0 f14675k0;
    public final sg.h1 f14676k1;
    public final tg.z0 f14677l0;
    public boolean l1;
    public final Bitmap m0;
    public r1.g f14678m1;
    public final sg.k1 f14679n0;
    public float n1;
    public final org.telegram.messenger.q5 f14680o0;
    public final Paint f14681o1;
    public final xe f14682p0;
    public final int f14683p1;
    public boolean f14684q0;
    public final e5 f14685q1;
    public nt0 f14686r0;
    public org.telegram.ui.ActionBar.g1 f14687r1;
    public boolean f14688s0;
    public k5 f14689s1;
    public tg.j f14690t0;
    public Rect f14691t1;
    public boolean f14692u0;
    public Runnable f14693u1;
    public int f14694v0;
    public Runnable f14695v1;
    public boolean f14696w0;
    public final ra f14697w1;
    public final boolean f14698x0;
    public AnimatorSet f14699x1;
    public final g5 f14700y0;
    public final v4 f14701y1;
    public final bi.o2 f14702z0;
    public d7 f14703z1;

    public m5(Context context, boolean z10, File file, boolean z11, boolean z12, ra raVar, Activity activity, final int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, d7 d7Var, int i11, int i12, xe xeVar, org.telegram.ui.Components.u9 u9Var, org.telegram.ui.ActionBar.e6 e6Var, w5 w5Var, x5 x5Var) {
        super(context, activity);
        Paint paint;
        org.telegram.ui.Components.u9 u9Var2;
        this.I0 = 0;
        this.J0 = -1;
        final u9 u9Var3 = (u9) this;
        gc.b bVar = new gc.b(u9Var3, 4);
        this.O0 = bVar;
        Paint paint2 = new Paint(1);
        this.f14659b1 = paint2;
        Paint paint3 = new Paint(1);
        this.f14661c1 = paint3;
        this.f14670h1 = new Paint(1);
        this.f14672i1 = new Paint(1);
        Paint paint4 = new Paint(1);
        this.f14674j1 = paint4;
        sg.h1 h1Var = new sg.h1(1.0f, 0.016773745f, -1);
        this.f14676k1 = h1Var;
        this.f14681o1 = new Paint(1);
        this.T1 = new float[2];
        this.W1 = false;
        this.Y1 = new int[2];
        new a8.sa(u9Var3, 27);
        setDelegate(this);
        this.O1 = u9Var;
        this.P1 = w5Var;
        this.E1 = z10;
        this.F1 = file;
        this.G1 = z11;
        this.H1 = z12;
        this.f14697w1 = raVar;
        this.B1 = i11;
        this.C1 = i12;
        this.Q1 = x5Var;
        this.f14683p1 = i7;
        e5 e5Var = new e5(0, e6Var);
        this.f14685q1 = e5Var;
        this.f14682p0 = xeVar;
        this.f14698x0 = context instanceof BubbleActivity;
        sg.k0 e10 = sg.k0.e(i7);
        e10.i(0, true);
        h1Var.f56644a = e10.c();
        h1Var.f56646c = e10.f56693i;
        org.telegram.messenger.q5 q5Var = new org.telegram.messenger.q5("Paint", true);
        this.f14680o0 = q5Var;
        this.m0 = bitmap;
        this.P0 = i10;
        sg.k1 k1Var = new sg.k1();
        this.f14679n0 = k1Var;
        k1Var.f56697a = new di.z6(u9Var3, 20);
        View view = new View(context);
        this.H0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        sg.i0 i0Var = new sg.i0(getPaintingSize(), null, i10, u9Var);
        if (d7Var == null || !d7Var.f14165u) {
            paint = paint4;
            u9Var2 = u9Var;
        } else {
            paint = paint4;
            u9Var2 = null;
        }
        g5 g5Var = new g5(u9Var3, context, i0Var, bitmap, bitmap2, u9Var2);
        this.f14700y0 = g5Var;
        g5Var.setDelegate(new d6.i(u9Var3, 26));
        g5Var.setUndoStore(k1Var);
        g5Var.setQueue(q5Var);
        g5Var.setVisibility(4);
        bi.o2 o2Var = new bi.o2(2, context, u9Var3);
        this.f14702z0 = o2Var;
        o2Var.setVisibility(4);
        h5 h5Var = new h5(u9Var3, context, new l0(u9Var3, 1));
        this.B0 = h5Var;
        this.f14703z1 = d7Var;
        this.A1 = arrayList;
        if (this.B1 > 0 && this.C1 > 0) {
            E0();
        }
        h5Var.setVisibility(4);
        this.A0 = new t4(u9Var3, context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.C0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, c8.ja.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131232532);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.f14700y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        u9Var4.f14679n0.c();
                        return;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.f14700y0;
                        sg.k1 k1Var2 = u9Var5.f14679n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.f56640a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.f14690t0;
                        if (jVar instanceof tg.o2) {
                            org.telegram.messenger.g0.v1(((tg.o2) jVar).getFocusedView());
                        }
                        if (u9Var6.f14658a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.f14690t0);
                        u9Var6.A0(null, true);
                        return;
                    case 3:
                        u9Var3.A0(null, true);
                        return;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (u9Var7.l1) {
                            u9Var7.F0(false);
                            return;
                        } else if (u9Var7.f14658a2) {
                            u9Var7.s0(true);
                            return;
                        } else if (u9Var7.f14692u0) {
                            u9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = u9Var7.f14695v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, c8.ja.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0(2131747267, null));
        linearLayout.addView(i20.e(context, 2131232533), c8.ja.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c8.ja.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(6));
        frameLayout.addView(linearLayout, c8.ja.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.Y0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(hd.M0(2131747279, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.f14700y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        u9Var4.f14679n0.c();
                        return;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.f14700y0;
                        sg.k1 k1Var2 = u9Var5.f14679n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.f56640a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.f14690t0;
                        if (jVar instanceof tg.o2) {
                            org.telegram.messenger.g0.v1(((tg.o2) jVar).getFocusedView());
                        }
                        if (u9Var6.f14658a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.f14690t0);
                        u9Var6.A0(null, true);
                        return;
                    case 3:
                        u9Var3.A0(null, true);
                        return;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (u9Var7.l1) {
                            u9Var7.F0(false);
                            return;
                        } else if (u9Var7.f14658a2) {
                            u9Var7.s0(true);
                            return;
                        } else if (u9Var7.f14692u0) {
                            u9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = u9Var7.f14695v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView2, c8.ja.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = k10;
        k10.setBackground(org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1));
        k10.setText(hd.M0(2131752101, null));
        k10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        k10.setGravity(16);
        k10.setTextColor(-1);
        k10.setTypeface(org.telegram.messenger.g0.o());
        k10.setTextSize(1, 16.0f);
        k10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.f14700y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        u9Var4.f14679n0.c();
                        return;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.f14700y0;
                        sg.k1 k1Var2 = u9Var5.f14679n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.f56640a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.f14690t0;
                        if (jVar instanceof tg.o2) {
                            org.telegram.messenger.g0.v1(((tg.o2) jVar).getFocusedView());
                        }
                        if (u9Var6.f14658a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.f14690t0);
                        u9Var6.A0(null, true);
                        return;
                    case 3:
                        u9Var3.A0(null, true);
                        return;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (u9Var7.l1) {
                            u9Var7.F0(false);
                            return;
                        } else if (u9Var7.f14658a2) {
                            u9Var7.s0(true);
                            return;
                        } else if (u9Var7.f14692u0) {
                            u9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = u9Var7.f14695v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        k10.setAlpha(0.0f);
        k10.setVisibility(8);
        TextView k11 = org.telegram.ui.Cells.y0.k(frameLayout, k10, c8.ja.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f14657a1 = k11;
        k11.setBackground(org.telegram.ui.ActionBar.j6.h0(822083583, 7, -1));
        k11.setText(hd.M0(2131751354, null));
        k11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        k11.setGravity(16);
        k11.setTextColor(-1);
        k11.setTypeface(org.telegram.messenger.g0.o());
        k11.setTextSize(1, 16.0f);
        k11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.f14700y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        u9Var4.f14679n0.c();
                        return;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.f14700y0;
                        sg.k1 k1Var2 = u9Var5.f14679n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.f56640a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.f14690t0;
                        if (jVar instanceof tg.o2) {
                            org.telegram.messenger.g0.v1(((tg.o2) jVar).getFocusedView());
                        }
                        if (u9Var6.f14658a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.f14690t0);
                        u9Var6.A0(null, true);
                        return;
                    case 3:
                        u9Var3.A0(null, true);
                        return;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (u9Var7.l1) {
                            u9Var7.F0(false);
                            return;
                        } else if (u9Var7.f14658a2) {
                            u9Var7.s0(true);
                            return;
                        } else if (u9Var7.f14692u0) {
                            u9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = u9Var7.f14695v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        k11.setAlpha(0.0f);
        k11.setVisibility(8);
        frameLayout.addView(k11, c8.ja.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        i5 i5Var = new i5(u9Var3, context, e10);
        this.D0 = i5Var;
        i5Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        i5Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(i5Var, c8.ja.e(-1, 104, 80));
        tg.h1 h1Var2 = new tg.h1(context, (d7Var == null || d7Var.v() || d7Var.f14165u || u9Var == null) ? false : true);
        this.U0 = h1Var2;
        h1Var2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var2.setDelegate(this);
        h1Var2.setSelectedIndex(1);
        i5Var.addView(h1Var2, c8.ja.c(48.0f, -1));
        tg.e1 e1Var = new tg.e1(context);
        this.V0 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        e1Var.setVisibility(8);
        e1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        sg.h1 h1Var3 = u9Var4.f14676k1;
                        u9Var4.C0(h1Var3);
                        sg.k0.e(i7).j(h1Var3.f56646c);
                        return;
                    default:
                        u9Var3.V0.setTypeface(sg.k0.e(i7).f56694j);
                        return;
                }
            }
        });
        e1Var.setAlignment(sg.k0.e(i7).f56692g);
        i5Var.addView(e1Var, c8.ja.c(48.0f, -1));
        t4 t4Var = new t4(u9Var3, context, 0);
        this.E0 = t4Var;
        addView(t4Var, c8.ja.c(-1.0f, -1));
        tg.j1 j1Var = new tg.j1(context);
        this.W0 = j1Var;
        j1Var.setVisibility(8);
        j1Var.setOnItemClickListener(new bi.b6(u9Var3, 11));
        e1Var.setTypefaceListView(j1Var);
        t4Var.addView(j1Var, c8.ja.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(352321535);
        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, e5Var));
        u4 u4Var = new u4(u9Var3, context);
        this.f14668g1 = u4Var;
        u4Var.setVisibility(8);
        u4Var.setColorPalette(sg.k0.e(i7));
        u4Var.setColorListener(new bi.i6(u9Var3, 2));
        i5Var.addView(u4Var, c8.ja.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        tg.v0 v0Var = new tg.v0(context);
        this.f14675k0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        i5Var.addView(v0Var, c8.ja.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        v0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        g5 g5Var2 = u9Var4.f14700y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof sg.g)) {
                            g5Var2.b();
                            u9Var4.U0.setSelectedIndex(1);
                            u9Var4.w((sg.h) sg.h.f56640a.get(0));
                            return;
                        }
                        u9Var4.f14679n0.c();
                        return;
                    case 1:
                        u9 u9Var5 = u9Var3;
                        g5 g5Var3 = u9Var5.f14700y0;
                        sg.k1 k1Var2 = u9Var5.f14679n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof sg.g)) {
                                g5Var3.b();
                                u9Var5.U0.setSelectedIndex(1);
                                u9Var5.w((sg.h) sg.h.f56640a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f56699c.clear();
                            k1Var2.f56698b.clear();
                            org.telegram.messenger.g0.h3(new q2.d(k1Var2, 11));
                            u9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        u9 u9Var6 = u9Var3;
                        tg.j jVar = u9Var6.f14690t0;
                        if (jVar instanceof tg.o2) {
                            org.telegram.messenger.g0.v1(((tg.o2) jVar).getFocusedView());
                        }
                        if (u9Var6.f14658a2) {
                            u9Var6.s0(false);
                        }
                        u9Var6.z0(u9Var6.f14690t0);
                        u9Var6.A0(null, true);
                        return;
                    case 3:
                        u9Var3.A0(null, true);
                        return;
                    default:
                        u9 u9Var7 = u9Var3;
                        if (u9Var7.l1) {
                            u9Var7.F0(false);
                            return;
                        } else if (u9Var7.f14658a2) {
                            u9Var7.s0(true);
                            return;
                        } else if (u9Var7.f14692u0) {
                            u9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = u9Var7.f14695v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        tg.z0 z0Var = new tg.z0(context);
        this.f14677l0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new ah.g(u9Var3, context, e10, 15));
        i5Var.addView(z0Var, c8.ja.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        tg.m1 m1Var = new tg.m1(context);
        this.N0 = m1Var;
        m1Var.setColorSwatch(h1Var);
        m1Var.setRenderView(g5Var);
        m1Var.setValueOverride(bVar);
        h1Var.f56646c = bVar.get();
        m1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        u9 u9Var4 = u9Var3;
                        sg.h1 h1Var3 = u9Var4.f14676k1;
                        u9Var4.C0(h1Var3);
                        sg.k0.e(i7).j(h1Var3.f56646c);
                        return;
                    default:
                        u9Var3.V0.setTypeface(sg.k0.e(i7).f56694j);
                        return;
                }
            }
        });
        addView(m1Var, c8.ja.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F0 = frameLayout2;
        addView(frameLayout2, c8.ja.c(-1.0f, -1));
        Paint paint5 = paint;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        B0(h1Var, null, false);
        w((sg.h) sg.h.f56640a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f23609q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
        this.f14701y1 = new v4(u9Var3, raVar, new ai.u1(14, u9Var3, raVar));
        i2.C1 = 1;
    }

    public static void D0(tg.o2 o2Var, int i7) {
        int i10;
        o2Var.setAlign(i7);
        int i11 = 2;
        if (i7 != 1) {
            if (i7 != 2) {
                i10 = 19;
            } else {
                i10 = 21;
            }
        } else {
            i10 = 17;
        }
        o2Var.getEditText().setGravity(i10);
        if (i7 != 1) {
            if (i7 == 2 ? !hd.f24101a0 : hd.f24101a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        o2Var.getEditText().setTextAlignment(i11);
    }

    public static void X(u9 u9Var, sg.k0 k0Var, Integer num) {
        k0Var.h(num.intValue(), true);
        k0Var.g();
        u9Var.setNewColor(num.intValue());
        u9Var.f14668g1.setSelectedColorIndex(k0Var.d());
        u9Var.D1 = null;
    }

    public static void Y(u9 u9Var, Integer num) {
        u9Var.setNewColor(num.intValue());
        u9Var.F0(false);
    }

    public ViewGroup getBarView() {
        if (this.I0 == 2) {
            return this.V0;
        }
        return this.U0;
    }

    private int getFrameRotation() {
        int i7 = this.P0;
        if (i7 != 90) {
            if (i7 != 180) {
                if (i7 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private nt0 getPaintingSize() {
        nt0 nt0Var = this.f14686r0;
        if (nt0Var != null) {
            return nt0Var;
        }
        nt0 nt0Var2 = new nt0(1080.0f, 1920.0f);
        this.f14686r0 = nt0Var2;
        return nt0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i7 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i7 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i7);
                if (childAt instanceof tg.g2) {
                    ImageReceiver imageReceiver = ((tg.g2) childAt).f57314y0;
                    ch0 B = imageReceiver.B();
                    org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                    boolean z11 = !z10;
                    imageReceiver.f22303v0 = z11;
                    imageReceiver.f22301u0 = z11;
                    if (B != null) {
                        if (z10) {
                            B.stop();
                        } else {
                            B.start();
                        }
                    } else if (m10 != null) {
                        m10.E = z10;
                        if (z10) {
                            m10.x(false);
                        }
                        if (z10) {
                            m10.stop();
                        } else {
                            m10.start();
                        }
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i7) {
        sg.h1 h1Var = this.f14676k1;
        int i10 = h1Var.f56644a;
        h1Var.f56644a = i7;
        B0(h1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new g4(this, i10, i7, 0));
        duration.start();
    }

    private void setTextType(int i7) {
        this.f14694v0 = i7;
        tg.j jVar = this.f14690t0;
        if (jVar instanceof tg.o2) {
            ((tg.o2) jVar).setType(i7);
        }
        sg.k0 e10 = sg.k0.e(this.f14683p1);
        e10.h = i7;
        e10.f56687a.edit().putInt("text_type", i7).apply();
        this.V0.e(i7, true);
    }

    private void setupTabsLayout(Context context) {
        y4 y4Var = new y4(this, context);
        this.G0 = y4Var;
        y4Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, c8.ja.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(hd.M0(2131747277, null).toUpperCase());
        TextView textView2 = this.R0;
        int i7 = org.telegram.ui.ActionBar.j6.f28941i6;
        e5 e5Var = this.f14685q1;
        org.telegram.ui.ActionBar.q6.Q(textView2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i7, e5Var), 7, -1), null, org.telegram.ui.ActionBar.q6.M(i7), e5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f15498b;

            {
                this.f15498b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f15498b;
                        if (m5Var.f14692u0) {
                            m5Var.A0(null, true);
                            return;
                        } else {
                            m5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f15498b.x0();
                        return;
                    default:
                        m5 m5Var2 = this.f15498b;
                        m5Var2.O0(2);
                        if (!(m5Var2.f14690t0 instanceof tg.o2)) {
                            m5Var2.V1 = true;
                            m5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.G0.addView(this.R0, c8.ja.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(hd.M0(2131747276, null).toUpperCase());
        org.telegram.ui.ActionBar.q6.Q(this.S0, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i7, e5Var), 7, -1), null, org.telegram.ui.ActionBar.q6.M(i7), e5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f15498b;

            {
                this.f15498b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f15498b;
                        if (m5Var.f14692u0) {
                            m5Var.A0(null, true);
                            return;
                        } else {
                            m5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f15498b.x0();
                        return;
                    default:
                        m5 m5Var2 = this.f15498b;
                        m5Var2.O0(2);
                        if (!(m5Var2.f14690t0 instanceof tg.o2)) {
                            m5Var2.V1 = true;
                            m5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(org.telegram.messenger.g0.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        this.G0.addView(this.S0, c8.ja.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(hd.M0(2131747275, null).toUpperCase());
        org.telegram.ui.ActionBar.q6.Q(this.T0, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i7, e5Var), 7, -1), null, org.telegram.ui.ActionBar.q6.M(i7), e5Var);
        this.T0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(org.telegram.messenger.g0.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        this.T0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f15498b;

            {
                this.f15498b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f15498b;
                        if (m5Var.f14692u0) {
                            m5Var.A0(null, true);
                            return;
                        } else {
                            m5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f15498b.x0();
                        return;
                    default:
                        m5 m5Var2 = this.f15498b;
                        m5Var2.O0(2);
                        if (!(m5Var2.f14690t0 instanceof tg.o2)) {
                            m5Var2.V1 = true;
                            m5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.G0.addView(this.T0, c8.ja.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void A() {
        K0(new j4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(tg.j jVar, boolean z10) {
        boolean z11;
        cb cbVar;
        cb cbVar2;
        mi0 mi0Var;
        int i7;
        boolean z12 = jVar instanceof tg.o2;
        int i10 = 2;
        int i11 = 0;
        if (z12 && (((i7 = this.J0) == -1 && this.I0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.l1) {
                F0(false);
            }
            O0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            tg.o2 o2Var = (tg.o2) jVar;
            int gravity = o2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            tg.e1 e1Var = this.V0;
            e1Var.setAlignment(i10);
            sg.a0 typeface = o2Var.getTypeface();
            if (typeface != null) {
                e1Var.setTypeface(typeface.f56580a);
            }
            e1Var.e(o2Var.getType(), true);
            this.E0.invalidate();
        }
        tg.j jVar2 = this.f14690t0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f57377e0) {
                    if (jVar instanceof tg.n0) {
                        tg.n0 n0Var = (tg.n0) jVar;
                        n0Var.setType((n0Var.getType() + 1) % n0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof tg.p2) {
                        tg.p2 p2Var = (tg.p2) jVar;
                        p2Var.setType((p2Var.getType() + 1) % p2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof tg.k0) {
                        tg.k0 k0Var = (tg.k0) jVar;
                        tg.i0 i0Var = k0Var.f57405r0;
                        if (i0Var.e()) {
                            if (i0Var.getPreviewType() == 0) {
                                i11 = 1;
                            }
                            i0Var.setPreviewType(i11);
                            return true;
                        }
                        k0Var.setType(k0Var.getNextType());
                        return true;
                    } else if (!this.f14692u0) {
                        if (jVar instanceof tg.o2) {
                            this.f14696w0 = true;
                            o0();
                            return true;
                        } else if (jVar instanceof tg.q1) {
                            tg.q1 q1Var = (tg.q1) jVar;
                            if (this.M1 && this.K1 == jVar) {
                                q1Var.q(true);
                                return true;
                            }
                            tg.q1 q1Var2 = this.K1;
                            if (q1Var2 != null && q1Var2 != q1Var && (mi0Var = this.J1) != null) {
                                mi0Var.animate().alpha(0.0f).setListener(new ai.i0(mi0Var, 22));
                                this.J1 = null;
                                this.M1 = false;
                                this.L1 = 0.0f;
                            }
                            if (this.J1 == null) {
                                mi0 mi0Var2 = new mi0(2, this.f14683p1, getContext(), LaunchActivity.Q(), new fi.i2(6, new fi.b()));
                                this.J1 = mi0Var2;
                                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(this.O1, mi0Var2, 0, false);
                                this.J1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                                this.f14697w1.addView(this.J1, c8.ja.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.o(-16777216, 120));
                                this.J1.setDelegate(new a8.r7(this, y9Var, paint));
                                this.J1.p(null, null, true);
                            }
                            this.J1.setFragment(LaunchActivity.Q());
                            this.K1 = q1Var;
                            L0(true);
                            return true;
                        } else {
                            J0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof tg.o2) {
                        org.telegram.messenger.g0.J3(((tg.o2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.f57387n0, false);
            tg.j jVar3 = this.f14690t0;
            if (jVar3 instanceof tg.o2) {
                tg.o2 o2Var2 = (tg.o2) jVar3;
                tg.n2 n2Var = o2Var2.f57496r0;
                n2Var.clearFocus();
                n2Var.setEnabled(false);
                n2Var.setClickable(false);
                o2Var2.m();
                if (!z12) {
                    this.f14692u0 = false;
                    org.telegram.messenger.g0.v1(((tg.o2) this.f14690t0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof tg.r1) && (cbVar2 = ((u9) this).f15200k2.f15037a1) != null) {
                cbVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        tg.j jVar4 = this.f14690t0;
        this.f14690t0 = jVar;
        if ((jVar4 instanceof tg.o2) && TextUtils.isEmpty(((tg.o2) jVar4).getText())) {
            z0(jVar4);
        }
        tg.j jVar5 = this.f14690t0;
        if (jVar4 != jVar5 && (jVar5 instanceof tg.r1) && (cbVar = ((u9) this).f15200k2.f15037a1) != null) {
            cbVar.l(true);
        }
        tg.j jVar6 = this.f14690t0;
        gc.b bVar = this.O0;
        sg.h1 h1Var = this.f14676k1;
        tg.m1 m1Var = this.N0;
        if (jVar6 != null) {
            t4 t4Var = this.A0;
            jVar6.f57387n0 = t4Var;
            jVar6.l(t4Var, true);
            tg.j jVar7 = this.f14690t0;
            if (jVar7 instanceof tg.o2) {
                tg.o2 o2Var3 = (tg.o2) jVar7;
                o2Var3.getSwatch().f56646c = h1Var.f56646c;
                o2Var3.A0 = false;
                C0(o2Var3.getSwatch());
                m1Var.setValueOverride(new w4(o2Var3, (int) (this.f14686r0.f37713a / 9.0f), 0));
                m1Var.setShowPreview(false);
            } else {
                m1Var.setValueOverride(bVar);
                m1Var.setShowPreview(true);
                h1Var.f56646c = bVar.get();
                B0(h1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.L0;
            if (valueAnimator2 != null && this.J0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.l1) {
                F0(false);
            }
            O0(0);
            m1Var.setValueOverride(bVar);
            m1Var.setShowPreview(true);
            h1Var.f56646c = bVar.get();
            B0(h1Var, null, false);
            z13 = z11;
        }
        R0();
        return z13;
    }

    public final void B0(sg.h1 h1Var, Integer num, boolean z10) {
        sg.h1 h1Var2 = this.f14676k1;
        if (h1Var2 != h1Var) {
            h1Var2.f56644a = h1Var.f56644a;
            h1Var2.f56645b = h1Var.f56645b;
            h1Var2.f56646c = h1Var.f56646c;
            int i7 = this.f14683p1;
            sg.k0.e(i7).h(h1Var.f56644a, true);
            sg.k0.e(i7).j(h1Var.f56646c);
        }
        int i10 = h1Var.f56644a;
        g5 g5Var = this.f14700y0;
        g5Var.setColor(i10);
        g5Var.setBrushSize(h1Var.f56646c);
        int i11 = h1Var2.f56644a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new a4(this, num, i11, 0));
            duration.start();
        } else {
            i5 i5Var = this.D0;
            if (i5Var != null) {
                i5Var.invalidate();
            }
        }
        tg.j jVar = this.f14690t0;
        if (jVar instanceof tg.o2) {
            ((tg.o2) jVar).setSwatch(new sg.h1(h1Var.f56645b, h1Var.f56646c, h1Var.f56644a));
        } else if (z10 && (jVar instanceof tg.n0)) {
            ((tg.n0) jVar).setColor(h1Var.f56644a);
            ((tg.n0) this.f14690t0).setType(3);
        } else if (z10 && (jVar instanceof tg.p2)) {
            ((tg.p2) jVar).setColor(h1Var.f56644a);
            ((tg.p2) this.f14690t0).setType(3);
        } else if (z10 && (jVar instanceof tg.k0)) {
            ((tg.k0) jVar).setColor(h1Var.f56644a);
            ((tg.k0) this.f14690t0).setType(0);
        }
    }

    public final void C0(sg.h1 h1Var) {
        B0(h1Var, null, false);
    }

    @Override
    public final void D() {
        M0(true);
    }

    public final void E0() {
        int i7;
        float f10;
        org.telegram.messenger.g6[] g6VarArr;
        tg.j jVar;
        tg.j jVar2;
        ArrayList arrayList = this.A1;
        if (arrayList != null) {
            d7 d7Var = this.f14703z1;
            this.f14703z1 = null;
            this.A1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                ?? r14 = this.B0;
                if (i10 < size) {
                    e20 e20Var = (e20) arrayList.get(i10);
                    byte b10 = e20Var.f23224a;
                    if (b10 == 0) {
                        d5 k02 = k0(e20Var.C, e20Var.B);
                        if ((2 & e20Var.f23225b) != 0) {
                            k02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                        layoutParams.width = e20Var.f23238q;
                        layoutParams.height = e20Var.f23239r;
                        i7 = size;
                        jVar2 = k02;
                    } else if (b10 == 1) {
                        tg.o2 l02 = l0(z10);
                        l02.setType(e20Var.f23225b);
                        l02.setTypeface(e20Var.f23235n);
                        l02.setBaseFontSize(e20Var.f23234m);
                        SpannableString spannableString = new SpannableString(e20Var.f23231j);
                        ?? r42 = e20Var.f23232k;
                        int size2 = r42.size();
                        for (int i11 = z10; i11 < size2; i11++) {
                            d20 d20Var = (d20) r42.get(i11);
                            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(d20Var.document_id, 1.0f, l02.getFontMetricsInt());
                            int i12 = d20Var.offset;
                            spannableString.setSpan(p5Var, i12, d20Var.length + i12, 33);
                            size = size;
                        }
                        i7 = size;
                        CharSequence m10 = org.telegram.messenger.j6.m(spannableString, l02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.g6.class)) != null) {
                            for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                                g6Var.f23694b = 0.85f;
                            }
                        }
                        l02.setText(m10);
                        D0(l02, e20Var.f23237p);
                        sg.h1 swatch = l02.getSwatch();
                        swatch.f56644a = e20Var.f23233l;
                        l02.setSwatch(swatch);
                        jVar2 = l02;
                    } else {
                        i7 = size;
                        if (b10 == 2) {
                            tg.n1 h02 = h0(e20Var.f23231j, false);
                            h02.H0 = e20Var.f23242u;
                            h02.C0 = false;
                            if ((2 & e20Var.f23225b) != 0) {
                                h02.r(false);
                            }
                            if ((e20Var.f23225b & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = e20Var.f23238q;
                            layoutParams2.height = e20Var.f23239r;
                            jVar2 = h02;
                        } else {
                            if (b10 == 6) {
                                ArrayList arrayList2 = d7Var.v;
                                boolean z11 = d7Var.K;
                                this.V1 = true;
                                f10 = 1.0f;
                                tg.j c5Var = new c5(this, getContext(), c0(), arrayList2, this.O1, z11, this.P1);
                                c5Var.setDelegate(this);
                                r14.addView(c5Var);
                                d0();
                                jVar = c5Var;
                                if (e20Var.f23238q > 0) {
                                    jVar = c5Var;
                                    if (e20Var.f23239r > 0) {
                                        ViewGroup.LayoutParams layoutParams3 = c5Var.getLayoutParams();
                                        layoutParams3.width = e20Var.f23238q;
                                        layoutParams3.height = e20Var.f23239r;
                                        jVar = c5Var;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                                if (b10 == 3) {
                                    tg.n0 g02 = g0(e20Var.N, e20Var.M);
                                    int i13 = e20Var.f23233l;
                                    if (i13 != 0) {
                                        g02.setColor(i13);
                                    }
                                    g02.setType(e20Var.f23225b);
                                    jVar = g02;
                                } else if (b10 == 8) {
                                    pb pbVar = e20Var.O;
                                    if (pbVar != null) {
                                        tg.p2 m0 = m0(pbVar);
                                        int i14 = e20Var.f23233l;
                                        if (i14 != 0) {
                                            m0.setColor(i14);
                                        }
                                        m0.setType(e20Var.f23225b);
                                        jVar = m0;
                                    } else {
                                        i10++;
                                        size = i7;
                                        z10 = false;
                                    }
                                } else if (b10 == 7) {
                                    tg.k0 f02 = f0(e20Var.W);
                                    tg.i0 i0Var = f02.f57405r0;
                                    int i15 = e20Var.f23233l;
                                    if (i15 != 0) {
                                        f02.setColor(i15);
                                    }
                                    boolean e10 = i0Var.e();
                                    int i16 = i0Var.h;
                                    int i17 = i0Var.f57345f;
                                    if (e10) {
                                        i0Var.setPreviewType(e20Var.f23225b);
                                    }
                                    byte b11 = e20Var.f23225b;
                                    if (b11 == -1) {
                                        f02.setType(3);
                                        i0Var.d();
                                        e20Var.f23238q = ((int) Math.ceil(i0Var.f57339b0)) + i17 + i17;
                                        e20Var.f23239r = ((int) Math.ceil(i0Var.f57341c0)) + i16 + i16;
                                        PointF position = f02.getPosition();
                                        position.y = (this.C1 * 0.3f) + position.y;
                                        f02.setPosition(position);
                                        i10++;
                                        size = i7;
                                        z10 = false;
                                    } else {
                                        f02.setType(b11);
                                        jVar = f02;
                                    }
                                } else if (b10 == 4) {
                                    tg.q1 i02 = i0(false);
                                    i02.s(ch.p0.d(e20Var.M.reaction), false);
                                    if (e20Var.M.flipped) {
                                        i02.r(false);
                                    }
                                    jVar = i02;
                                    if (e20Var.M.dark) {
                                        i02.q(false);
                                        jVar = i02;
                                    }
                                } else {
                                    if (b10 == 5 && d7Var.f14154o0 != null) {
                                        tg.r1 j02 = j0(d7Var.f14156p0, false);
                                        sa saVar = ((u9) this).f15200k2;
                                        ga gaVar = saVar.Y0;
                                        if (gaVar != null) {
                                            gaVar.f15369x = j02;
                                            u51 u51Var = gaVar.f15371y;
                                            if (u51Var != null) {
                                                u51Var.A0(j02.f57541v0);
                                            }
                                        }
                                        ia iaVar = saVar.f15048d1;
                                        if (iaVar != null) {
                                            iaVar.setHasRoundVideo(true);
                                        }
                                        jVar = j02;
                                        if ((e20Var.f23225b & 2) != 0) {
                                            boolean z12 = !j02.f57538s0;
                                            j02.f57538s0 = z12;
                                            j02.f57539t0.f(z12, true);
                                            j02.invalidate();
                                            jVar = j02;
                                        }
                                    }
                                    i10++;
                                    size = i7;
                                    z10 = false;
                                }
                            }
                            jVar.setX((e20Var.f23226c * this.B1) - (((f10 - e20Var.v) * e20Var.f23238q) / 2.0f));
                            jVar.setY((e20Var.d * this.C1) - (((f10 - e20Var.v) * e20Var.f23239r) / 2.0f));
                            jVar.setPosition(new PointF((e20Var.f23238q / 2.0f) + jVar.getX(), (e20Var.f23239r / 2.0f) + jVar.getY()));
                            jVar.setScale(e20Var.v);
                            jVar.setRotation((float) (((-e20Var.f23227e) / 3.141592653589793d) * 180.0d));
                            i10++;
                            size = i7;
                            z10 = false;
                        }
                    }
                    f10 = 1.0f;
                    jVar = jVar2;
                    jVar.setX((e20Var.f23226c * this.B1) - (((f10 - e20Var.v) * e20Var.f23238q) / 2.0f));
                    jVar.setY((e20Var.d * this.C1) - (((f10 - e20Var.v) * e20Var.f23239r) / 2.0f));
                    jVar.setPosition(new PointF((e20Var.f23238q / 2.0f) + jVar.getX(), (e20Var.f23239r / 2.0f) + jVar.getY()));
                    jVar.setScale(e20Var.v);
                    jVar.setRotation((float) (((-e20Var.f23227e) / 3.141592653589793d) * 180.0d));
                    i10++;
                    size = i7;
                    z10 = false;
                } else {
                    r14.setVisibility(z10 ? 1 : 0);
                    return;
                }
            }
        }
    }

    public final void F0(final boolean z10) {
        float f10;
        boolean z11;
        if (this.l1 != z10) {
            this.l1 = z10;
            r1.g gVar = this.f14678m1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f14678m1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f55756i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f55748m = hVar;
            if (!this.f14701y1.c() && this.d2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.D0.getTranslationY();
            final float alpha = this.f14677l0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f14678m1.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14;
                    int i7;
                    m5 m5Var = m5.this;
                    i5 i5Var = m5Var.D0;
                    float f15 = f12 / 1000.0f;
                    m5Var.n1 = f15;
                    float f16 = 1.0f;
                    float f17 = ((1.0f - f15) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY((Math.min(m5Var.n1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(m5Var.n1, 0.25f) / 0.25f));
                    u4 u4Var = m5Var.f14668g1;
                    float f18 = m5Var.n1;
                    boolean z12 = z10;
                    u4Var.B1(z12, f18);
                    tg.z0 z0Var = m5Var.f14677l0;
                    z0Var.setProgress(m5Var.n1);
                    tg.v0 v0Var = m5Var.f14675k0;
                    v0Var.setProgress(m5Var.n1);
                    m5Var.G0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * m5Var.n1);
                    AnimatorSet animatorSet = m5Var.f14699x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f19 = m5Var.n1;
                        if (!z12) {
                            f19 = 1.0f - f19;
                        }
                        if (z12) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        float f20 = alpha;
                        z0Var.setAlpha(org.telegram.messenger.g0.T1(f20, f14, f19));
                        if (!z12) {
                            f16 = 0.0f;
                        }
                        v0Var.setAlpha(org.telegram.messenger.g0.T1(f20, f16, f19));
                        float L = org.telegram.messenger.g0.L(39.0f) * f19;
                        if (z12) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        i5Var.setTranslationY(translationY - (L * i7));
                    }
                    i5Var.invalidate();
                    if (view == m5Var.V0) {
                        m5Var.E0.invalidate();
                    }
                }
            });
            this.f14678m1.a(new c4(this, z10, 0));
            this.f14678m1.h();
            if (z10) {
                u4 u4Var = this.f14668g1;
                u4Var.setVisibility(0);
                u4Var.setSelectedColorIndex(sg.k0.e(this.f14683p1).d());
            }
        }
    }

    public final void G0(int i7) {
        boolean z10;
        int i10;
        tg.e1 e1Var = this.V0;
        v4 v4Var = this.f14701y1;
        if (i7 == 1) {
            ly lyVar = this.Z1;
            if (lyVar != null && lyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ly lyVar2 = this.Z1;
            ra raVar = this.f14697w1;
            if (lyVar2 != null && lyVar2.f36941d1 != m10.f24934t0) {
                raVar.removeView(lyVar2);
                this.Z1 = null;
            }
            if (this.Z1 == null) {
                ly lyVar3 = new ly(null, true, false, false, getContext(), false, null, null, true, this.f14685q1, false, false);
                this.Z1 = lyVar3;
                lyVar3.f37009y2 = false;
                lyVar3.V0 = true;
                lyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.Z1.setForseMultiwindowLayout(true);
                }
                this.Z1.setDelegate(new f5(this));
                raVar.addView(this.Z1);
            }
            this.Z1.setVisibility(0);
            this.f14658a2 = true;
            ly lyVar4 = this.Z1;
            if (this.f14667f2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f14667f2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f14667f2 = np.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f14669g2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f14669g2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f14669g2 = np.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x > point.y) {
                i10 = this.f14669g2;
            } else {
                i10 = this.f14667f2;
            }
            int paddingUnderContainer = raVar.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            lyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.j jVar = this.f14690t0;
                if (jVar instanceof tg.o2) {
                    org.telegram.messenger.g0.v1(((tg.o2) jVar).getEditText());
                }
            }
            this.d2 = paddingUnderContainer;
            v4Var.a();
            requestLayout();
            pg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(ng.d, true);
            }
            if (!z10) {
                if (this.f14660b2) {
                    this.f14665e2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d2, 0.0f);
                    ofFloat.addUpdateListener(new d4(this, 1));
                    ofFloat.addListener(new x4(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                    ofFloat.start();
                }
            }
        } else {
            pg emojiButton2 = e1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(ng.f37583e, true);
            }
            ly lyVar5 = this.Z1;
            if (lyVar5 != null) {
                this.f14658a2 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    lyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.d2 = 0;
                v4Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(tg.k0 k0Var) {
        l7 l7Var = new l7(getContext(), this.f14685q1, this.Q1, new ai.u1(16, this, k0Var));
        if (k0Var != null) {
            tg.h0 h0Var = k0Var.f57409v0;
            l7Var.Y1 = true;
            org.telegram.ui.Cells.k3 k3Var = l7Var.V1;
            org.telegram.ui.Cells.k3 k3Var2 = l7Var.U1;
            if (h0Var != null) {
                l7Var.f14591c2 = h0Var.d;
                l7Var.d2 = false;
                k3Var2.setText(h0Var.f57318c);
                k3Var.setText(h0Var.f57317b);
                l7Var.f14596i2 = !TextUtils.isEmpty(h0Var.f57317b);
                l7Var.f14597j2 = h0Var.f57320f;
                l7Var.f14598k2 = h0Var.f57319e;
            } else {
                k3Var2.setText("");
                k3Var.setText("");
                l7Var.f14597j2 = true;
                l7Var.f14598k2 = false;
            }
            String M0 = hd.M0(2131744641, null);
            d dVar = l7Var.X1;
            dVar.i(M0, false, true);
            di.f0 f0Var = l7Var.T1;
            if (f0Var != null) {
                f0Var.O(false);
            }
            dVar.setEnabled(l7Var.f1(k3Var2.getText().toString()));
            l7Var.Y1 = false;
        }
        l7Var.setOnDismissListener(new o4(this, 1));
        l7Var.show();
        w0(true);
    }

    public final void I0(tg.n0 n0Var, s10 s10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ki kiVar = new ki(getContext(), new b5(this, s10Var), false, true, false, this.f14685q1);
        kiVar.X3 = new w7.s(10);
        kh khVar = kiVar.f36506v3;
        if (n0Var != null && (messageMedia = n0Var.f57461v0) != null && (geoPoint = messageMedia.geo) != null) {
            kiVar.f36519y4 = new double[]{geoPoint.lat, geoPoint._long};
            kiVar.J1 = true;
            khVar.setVisibility(8);
        } else if (this.E1) {
            kiVar.f36511w4 = this.G1;
            kiVar.f36515x4 = this.F1;
            kiVar.J1 = true;
            khVar.setVisibility(8);
        } else {
            kiVar.J1 = true;
            khVar.setVisibility(8);
        }
        kiVar.setOnDismissListener(new o4(this, 0));
        kiVar.e1();
        kiVar.show();
    }

    public final void J0(tg.j jVar) {
        if (jVar instanceof tg.u0) {
            org.telegram.ui.ActionBar.g1 g1Var = this.f14687r1;
            if (g1Var != null && g1Var.isShowing()) {
                this.f14687r1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.Y1;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        h5 h5Var = this.B0;
        float scaleX2 = h5Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = h5Var.getScaleY() * scaleY * jVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i10;
        K0(new i4(this, jVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    public final void K0(Runnable runnable, m5 m5Var, int i7, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = this.f14687r1;
        if (g1Var != null && g1Var.isShowing()) {
            this.f14687r1.d(true);
            return;
        }
        if (this.f14689s1 == null) {
            this.f14691t1 = new Rect();
            k5 k5Var = new k5(this, getContext());
            this.f14689s1 = k5Var;
            k5Var.setAnimationEnabled(true);
            this.f14689s1.setOnTouchListener(new k4(0, this));
            this.f14689s1.setDispatchKeyEventListener(new l4(this));
            this.f14689s1.setShownFromBottom(true);
        }
        k5 k5Var2 = this.f14689s1;
        k5Var2.f14503a0 = z10;
        k5Var2.d();
        runnable.run();
        if (this.f14687r1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.f14689s1, -2, -2);
            this.f14687r1 = g1Var2;
            g1Var2.f28553b = true;
            g1Var2.setAnimationStyle(2131755191);
            this.f14687r1.setOutsideTouchable(true);
            this.f14687r1.setClippingEnabled(true);
            this.f14687r1.setInputMethodMode(2);
            this.f14687r1.setSoftInputMode(0);
            this.f14687r1.getContentView().setFocusableInTouchMode(true);
            this.f14687r1.setOnDismissListener(new m4(0, this));
        }
        this.f14689s1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE));
        this.f14687r1.setFocusable(true);
        int measuredWidth = i10 - (this.f14689s1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.f14689s1.getMeasuredHeight();
        this.f14687r1.showAtLocation(m5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.g1.i(this.f14689s1);
        Drawable mutate = getContext().getResources().getDrawable(2131232567).mutate();
        if (z10) {
            k5 k5Var3 = this.f14689s1;
            k5Var3.setBackgroundDrawable(new org.telegram.ui.Components.x9(new org.telegram.ui.Components.y9(this.O1, k5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
            return;
        }
        this.f14689s1.setBackgroundDrawable(mutate);
        this.f14689s1.setBackgroundColor(-14145495);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f14660b2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.f14669g2 = i7;
                np.d1().edit().putInt("kbd_height_land3", this.f14669g2).commit();
            } else {
                this.f14667f2 = i7;
                np.d1().edit().putInt("kbd_height", this.f14667f2).commit();
            }
        }
        boolean z13 = this.f14658a2;
        v4 v4Var = this.f14701y1;
        if (z13) {
            if (z10) {
                i10 = this.f14669g2;
            } else {
                i10 = this.f14667f2;
            }
            int paddingUnderContainer = this.f14697w1.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.f23609q.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.Z1.setLayoutParams(layoutParams);
                this.d2 = layoutParams.height;
                v4Var.a();
                requestLayout();
            }
        }
        if (this.f14671h2 == i7 && this.f14673i2 == z10) {
            return;
        }
        this.f14671h2 = i7;
        this.f14673i2 = z10;
        boolean z14 = this.f14660b2;
        tg.j jVar = this.f14690t0;
        if (jVar instanceof tg.o2) {
            if (((tg.o2) jVar).getEditText().isFocused() && v4Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f14660b2 = z12;
        } else {
            this.f14660b2 = false;
        }
        if (this.f14660b2 && this.f14658a2) {
            G0(0);
        }
        if (this.d2 != 0 && !(z11 = this.f14660b2) && z11 != z14 && !this.f14658a2) {
            this.d2 = 0;
            v4Var.a();
            requestLayout();
        }
        R0();
        if (z14 && !this.f14660b2 && this.d2 > 0 && this.f14665e2) {
            this.f14665e2 = false;
        }
        P0();
    }

    public final void L0(boolean z10) {
        if (this.M1 != z10) {
            if (z10 || this.J1 != null) {
                this.M1 = z10;
                if (z10) {
                    this.J1.n();
                    this.J1.setVisibility(0);
                    this.J1.setSelectedReaction(this.K1.getCurrentReaction());
                    this.J1.getParent().bringChildToFront(this.J1);
                } else {
                    this.K1 = null;
                }
                float f10 = 0.0f;
                if (z10) {
                    this.N1 = true;
                    this.f14697w1.invalidate();
                    float f11 = this.L1;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.J1.setTransitionProgress(this.L1);
                    ofFloat.addUpdateListener(new d4(this, 2));
                    ofFloat.addListener(new bi.v4(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(er.f34421g);
                    ofFloat.start();
                    return;
                }
                if (this.J1.getReactionsWindow() != null) {
                    this.J1.getReactionsWindow().e();
                }
                this.J1.animate().alpha(0.0f).setDuration(150L).setListener(new x4(this, 0)).start();
            }
        }
    }

    public final void M0(boolean z10) {
        float f10;
        if (this.f14664e1 != z10) {
            this.f14664e1 = z10;
            r1.g gVar = this.f14666f1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f14666f1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f55756i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f55748m = hVar;
            if (z10) {
                tg.j1 j1Var = this.W0;
                j1Var.setAlpha(0.0f);
                j1Var.setVisibility(0);
            }
            this.f14666f1.b(new fi.t7(1, this));
            this.f14666f1.a(new c4(this, z10, 1));
            this.f14666f1.h();
        }
    }

    public final PointF N0(tg.j jVar) {
        float f10;
        float f11;
        float f12 = 200.0f;
        xe xeVar = this.f14682p0;
        if (xeVar != null) {
            f12 = 200.0f / xeVar.f27490c;
        }
        float f13 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = 100.0f;
        if (xeVar != null) {
            f14 = 100.0f / xeVar.f27490c;
        }
        PointF c02 = c0();
        int i7 = 0;
        while (i7 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                h5 h5Var = this.B0;
                if (i10 >= h5Var.getChildCount()) {
                    break;
                }
                View childAt = h5Var.getChildAt(i10);
                if (!(childAt instanceof tg.j) || (childAt instanceof tg.u0)) {
                    f10 = f13;
                    f11 = f14;
                } else {
                    PointF position2 = ((tg.j) childAt).getPosition();
                    f10 = f13;
                    f11 = f14;
                    if (((float) Math.sqrt(Math.pow(position2.y - c02.y, 2.0d) + Math.pow(position2.x - c02.x, 2.0d))) < f11) {
                        f12 = Math.min(childAt.getHeight(), childAt.getWidth()) * f10;
                        z10 = true;
                    }
                }
                i10++;
                f14 = f11;
                f13 = f10;
            }
            float f15 = f13;
            float f16 = f14;
            if (!z10) {
                break;
            }
            i7++;
            c02 = new PointF(c02.x + f12, c02.y + f12);
            f13 = f15;
            f14 = f16;
        }
        return c02;
    }

    public final void O0(int i7) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.I0 != i7 && this.J0 != i7) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.I0;
            ViewGroup viewGroup3 = this.V0;
            ViewGroup viewGroup4 = this.U0;
            if (i10 == 0) {
                viewGroup = viewGroup4;
            } else if (i10 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.J0 = i7;
            if (i7 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i7 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.f14683p1;
            sg.k0 e10 = sg.k0.e(i11);
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f56696l != z10) {
                e10.f56696l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f56687a.getInt("brush", 0), false);
                }
            }
            int c10 = sg.k0.e(i11).c();
            sg.h1 h1Var = this.f14676k1;
            h1Var.f56644a = c10;
            B0(h1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.L0 = duration;
            duration.setInterpolator(er.f34420f);
            this.L0.addUpdateListener(new fi.b3(this, viewGroup, viewGroup2, 1));
            this.L0.addListener(new z4(this, viewGroup, viewGroup2, i7, 0));
            this.L0.start();
        }
    }

    public final void P0() {
        boolean z10;
        v4 v4Var = this.f14701y1;
        tg.e1 e1Var = this.V0;
        if (e1Var != null) {
            if (v4Var.c()) {
                e1Var.a(2131231512);
            } else if (this.f14658a2) {
                e1Var.a(2131231504);
            } else {
                e1Var.a(2131232043);
            }
        }
        if (!v4Var.c() && !this.f14658a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        org.telegram.messenger.g0.T3(1.0f, this.Y0, z11, false);
        org.telegram.messenger.g0.T3(1.0f, this.X0, z11, false);
        org.telegram.messenger.g0.T3(1.0f, this.f14657a1, z10, false);
        org.telegram.messenger.g0.T3(1.0f, this.Z0, z10, false);
    }

    @Override
    public final int Q() {
        return this.f14701y1.f14851l - this.f14697w1.getBottomPadding2();
    }

    public final void Q0() {
        float f10;
        tg.j jVar;
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.f14700y0.getParent();
        if (view == null) {
            return;
        }
        v4 v4Var = this.f14701y1;
        if (((v4Var.c() && !v4Var.d) || this.d2 > 0) && (jVar = this.f14690t0) != null) {
            f10 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f10);
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(er.h);
        this.S1.start();
    }

    public final void R0() {
        throw new UnsupportedOperationException("Method not decompiled: hi.m5.R0():void");
    }

    @Override
    public final void a() {
        F0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28922h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28957j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29107r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29269zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29214wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29195vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29233xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29252yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28792a7));
    }

    @Override
    public final void b() {
        setTextType((this.f14694v0 + 1) % 4);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new h4(0, this, view)).start();
    }

    @Override
    public final void c(int i7) {
        tg.j jVar = this.f14690t0;
        if (jVar instanceof tg.o2) {
            D0((tg.o2) jVar, i7);
            sg.k0 e10 = sg.k0.e(this.f14683p1);
            e10.f56692g = i7;
            e10.f56687a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final PointF c0() {
        h5 h5Var = this.B0;
        int measuredWidth = h5Var.getMeasuredWidth();
        int measuredHeight = h5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.C1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void d0() {
        org.telegram.ui.Components.p5[] p5VarArr;
        boolean z10 = this.G1;
        h5 h5Var = this.B0;
        boolean z11 = true;
        if (!z10 && !this.I1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 < h5Var.getChildCount()) {
                    View childAt = h5Var.getChildAt(i7);
                    boolean z12 = childAt instanceof tg.o2;
                    int i10 = this.f14683p1;
                    if (z12) {
                        CharSequence text = ((tg.o2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.p5.class)) {
                                TLRPC.Document document = p5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.g5.e(i10, p5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.g5.g(i10).e(document);
                                }
                                org.telegram.messenger.w7.G(i10);
                                if (d7.u(document, org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i7++;
                    } else if (childAt instanceof tg.g2) {
                        TLRPC.Document sticker = ((tg.g2) childAt).getSticker();
                        org.telegram.messenger.w7.G(i10);
                        if (d7.u(sticker, org.telegram.messenger.w7.J(sticker, null, true, true).getAbsolutePath())) {
                            break;
                        }
                        i7++;
                    } else if (childAt instanceof tg.r1) {
                        break;
                    } else {
                        i7++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
        }
        for (int i11 = 0; i11 < h5Var.getChildCount(); i11++) {
            View childAt2 = h5Var.getChildAt(i11);
            if (childAt2 instanceof tg.j) {
                ((tg.j) childAt2).setIsVideo(z11);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.W1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        xe xeVar;
        int i7 = 0;
        if ((view == this.f14700y0 || view == this.f14702z0 || view == this.B0 || view == this.A0) && (xeVar = this.f14682p0) != null) {
            canvas.save();
            if (!this.f14698x0) {
                i7 = org.telegram.messenger.g0.f23603m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = xeVar.f27495k;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * xeVar.f27491e)) / xeVar.f27490c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * xeVar.f27492f)) / xeVar.f27490c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + i7 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i7 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i7 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final TextView e0(int i7, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.E8, this.f14685q1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i7));
        textView.setText(str);
        return textView;
    }

    @Override
    public final void f(tg.j jVar) {
        L0(false);
        J0(jVar);
    }

    public final tg.k0 f0(tg.h0 h0Var) {
        int measuredWidth;
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        h5 h5Var = this.B0;
        if (h5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = h5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.k0 k0Var = new tg.k0(getContext(), N0, this.f14683p1, h0Var, f10 / 360.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            k0Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            k0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.f14676k1;
        if (h1Var != null && (i7 = h1Var.f56644a) != -47814) {
            k0Var.setColor(i7);
        }
        k0Var.setDelegate(this);
        k0Var.setMaxWidth(L);
        h5Var.addView(k0Var, c8.ja.c(-2.0f, -2));
        d0();
        xe xeVar = this.f14682p0;
        if (xeVar != null) {
            k0Var.j(1.0f / xeVar.f27490c);
            k0Var.f(-(xeVar.f27495k + xeVar.d));
        }
        return k0Var;
    }

    public final tg.n0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        h5 h5Var = this.B0;
        if (h5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = h5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.n0 n0Var = new tg.n0(getContext(), N0, this.f14683p1, messageMedia, mediaArea, f10 / 240.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            n0Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            n0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.f14676k1;
        if (h1Var != null && (i7 = h1Var.f56644a) != -47814) {
            n0Var.setColor(i7);
        }
        n0Var.setDelegate(this);
        n0Var.setMaxWidth(L);
        h5Var.addView(n0Var, c8.ja.c(-2.0f, -2));
        d0();
        xe xeVar = this.f14682p0;
        if (xeVar != null) {
            n0Var.j(1.0f / xeVar.f27490c);
            n0Var.f(-(xeVar.f27495k + xeVar.d));
        }
        return n0Var;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.f14700y0.c(true, false);
    }

    public View getBottomLayout() {
        return this.D0;
    }

    public View getCancelView() {
        return this.f14675k0;
    }

    public float getCropRotation() {
        xe xeVar = this.f14682p0;
        if (xeVar != null) {
            return xeVar.d + xeVar.f27495k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f14677l0;
    }

    public View getEntitiesView() {
        return this.B0;
    }

    public long getLcm() {
        return this.Q0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.p5[] p5VarArr;
        h5 h5Var = this.B0;
        int childCount = h5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = h5Var.getChildAt(i7);
            if (childAt instanceof tg.g2) {
                TLRPC.Document sticker = ((tg.g2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28063id = sticker.f28057id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof tg.o2) {
                CharSequence text = ((tg.o2) childAt).getText();
                if ((text instanceof Spanned) && (p5VarArr = (org.telegram.ui.Components.p5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.p5.class)) != null) {
                    for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                        if (p5Var != null) {
                            TLRPC.Document document = p5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.g5.e(this.f14683p1, p5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f28063id = document.f28057id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return 0.0f;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.f14700y0, this.f14702z0, this.B0, this.A0);
    }

    public View getRenderInputView() {
        return this.f14702z0;
    }

    public sg.u0 getRenderView() {
        return this.f14700y0;
    }

    public tg.j getSelectedEntity() {
        return this.f14690t0;
    }

    public View getSelectionEntitiesView() {
        return this.A0;
    }

    public View getTextDimView() {
        return this.H0;
    }

    public View getTopLayout() {
        return this.C0;
    }

    public View getWeightChooserView() {
        return this.N0;
    }

    public final tg.n1 h0(String str, boolean z10) {
        float f10;
        nt0 nt0Var;
        this.V1 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            f10 = 1.0f;
        }
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        h5 h5Var = this.B0;
        if (i7 > 0) {
            float floor = (float) Math.floor(Math.max(this.B1, h5Var.getMeasuredWidth()) * 0.5d);
            nt0Var = new nt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, h5Var.getMeasuredHeight()) * 0.5d);
            nt0Var = new nt0(f10 * floor2, floor2);
        }
        nt0 nt0Var2 = nt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = nt0Var2.f37713a;
            nt0Var2.f37713a = nt0Var2.f37714b;
            nt0Var2.f37714b = f11;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.n1 n1Var = new tg.n1(context, c02, nt0Var2, str, intValue);
        n1Var.setDelegate(this);
        h5Var.addView(n1Var);
        d0();
        return n1Var;
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.W1) {
            return false;
        }
        if (this.f14690t0 != null) {
            A0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.f14700y0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final tg.q1 i0(boolean z10) {
        String str;
        nt0 nt0Var = new nt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF c02 = c0();
        h5 h5Var = this.B0;
        if (h5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < h5Var.getChildCount(); i7++) {
                    View childAt = h5Var.getChildAt(i7);
                    if (a8.t9.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (h5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (h5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, h5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, h5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new tg.j(getContext(), c02);
        jVar.f57525s0 = new fi.o8(jVar);
        jVar.f57526t0 = new fi.o8(jVar);
        jVar.f57527u0 = new ch.g0(jVar);
        jVar.f57528v0 = new ch.g0(jVar);
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5((View) jVar);
        jVar.f57530x0 = u5Var;
        org.telegram.ui.Components.u5 u5Var2 = new org.telegram.ui.Components.u5((View) jVar);
        jVar.f57531y0 = u5Var2;
        jVar.A0 = 1.0f;
        jVar.f57524r0 = nt0Var;
        u5Var2.e(true, 1.0f);
        u5Var.e(true, 1.0f);
        ArrayList arrayList = si.b0(m10.f24934t0).h;
        ch.g0 g0Var = jVar.f57527u0;
        int i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                if (((TLRPC.TL_availableReaction) arrayList.get(i10)).title.equals("Red Heart")) {
                    str = ((TLRPC.TL_availableReaction) arrayList.get(i10)).reaction;
                    break;
                }
                i10++;
            } else {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
        }
        ch.p0 b10 = ch.p0.b(str);
        jVar.f57529w0 = b10;
        g0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        h5Var.addView(jVar);
        d0();
        if (z10) {
            y0(jVar);
            A0(jVar, true);
        }
        return jVar;
    }

    public final tg.r1 j0(String str, boolean z10) {
        float f10;
        this.V1 = true;
        this.X1 = true;
        n0();
        h5 h5Var = this.B0;
        int measuredWidth = h5Var.getMeasuredWidth();
        h5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * f10);
        nt0 nt0Var = new nt0(floor, floor);
        tg.r1 r1Var = new tg.r1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (nt0Var.f37714b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), nt0Var, str);
        r1Var.setDelegate(this);
        h5Var.addView(r1Var);
        d0();
        if (z10) {
            y0(r1Var);
            post(new y3(this, r1Var, 0));
        }
        this.X1 = false;
        return r1Var;
    }

    public final d5 k0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i7 = 0; i7 < document.attributes.size() && !(document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeSticker); i7++) {
        }
        float f11 = 0.75f;
        xe xeVar = this.f14682p0;
        if (xeVar != null) {
            f10 = -(xeVar.f27495k + xeVar.d);
            f11 = 0.75f / xeVar.f27490c;
        } else {
            f10 = 0.0f;
        }
        l5 l5Var = new l5(c0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f37713a * 0.5d);
        d5 d5Var = new d5(this, context, l5Var.f14584a, l5Var.f14586c, l5Var.f14585b, new nt0(floor, floor), document, obj);
        boolean C4 = gj.C4(document);
        ImageReceiver imageReceiver = d5Var.f57314y0;
        if (C4) {
            imageReceiver.f22290p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        d5Var.setDelegate(this);
        this.B0.addView(d5Var);
        d0();
        return d5Var;
    }

    public final tg.o2 l0(boolean z10) {
        nt0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        tg.o2 o2Var = new tg.o2(getContext(), N0, (int) (paintingSize.f37713a / 9.0f), "", this.f14676k1, this.f14694v0);
        float f10 = paintingSize.f37713a / 9.0f;
        j4 j4Var = new j4(this, 0);
        o2Var.f57502x0 = (int) (0.5f * f10);
        o2Var.f57503y0 = (int) (f10 * 2.0f);
        o2Var.f57504z0 = j4Var;
        float f11 = N0.x;
        h5 h5Var = this.B0;
        if (f11 == h5Var.getMeasuredWidth() / 2.0f) {
            o2Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            o2Var.setStickyY(2);
        }
        o2Var.setDelegate(this);
        o2Var.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.f14683p1;
        o2Var.setTypeface(sg.k0.e(i7).f56694j);
        o2Var.setType(sg.k0.e(i7).h);
        h5Var.addView(o2Var, c8.ja.c(-2.0f, -2));
        d0();
        xe xeVar = this.f14682p0;
        if (xeVar != null) {
            o2Var.j(1.0f / xeVar.f27490c);
            o2Var.f(-(xeVar.f27495k + xeVar.d));
        }
        if (z10) {
            y0(o2Var);
            o2Var.q();
            A0(o2Var, false);
            o2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.J3(o2Var.getFocusedView());
            this.f14692u0 = true;
            int i10 = sg.k0.e(i7).f56692g;
            tg.e1 e1Var = this.V0;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.k0.e(i7).h);
        }
        return o2Var;
    }

    public final tg.p2 m0(pb pbVar) {
        int measuredWidth;
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        h5 h5Var = this.B0;
        if (h5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = h5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.p2 p2Var = new tg.p2(getContext(), N0, this.f14683p1, pbVar, f10 / 240.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            p2Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            p2Var.setStickyY(2);
        }
        sg.h1 h1Var = this.f14676k1;
        if (h1Var != null && (i7 = h1Var.f56644a) != -47814) {
            p2Var.setColor(i7);
        }
        p2Var.setDelegate(this);
        p2Var.setMaxWidth(L);
        h5Var.addView(p2Var, c8.ja.c(-2.0f, -2));
        d0();
        xe xeVar = this.f14682p0;
        if (xeVar != null) {
            p2Var.j(1.0f / xeVar.f27490c);
            p2Var.f(-(xeVar.f27495k + xeVar.d));
        }
        return p2Var;
    }

    @Override
    public final int[] n(tg.j jVar) {
        int[] iArr = this.Y1;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void n0() {
        int i7 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i7 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i7);
                if (childAt instanceof tg.r1) {
                    if (this.f14690t0 == childAt) {
                        A0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(er.h).withEndAction(new y3(this, (tg.r1) childAt, 1)).start();
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public abstract void o0();

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        mi0 mi0Var = this.J1;
        if (mi0Var != null) {
            org.telegram.messenger.g0.E2(mi0Var);
            this.J1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        float f11;
        this.f14684q0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f23609q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.m0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(48.0f);
            f10 = size;
        }
        if (((float) Math.floor((size * currentActionBarHeight) / f10)) > currentActionBarHeight2) {
            Math.floor((f11 * f10) / currentActionBarHeight);
        }
        float f12 = this.f14686r0.f37713a;
        tg.j jVar = this.f14690t0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.D0, i7, i10);
        measureChild(this.N0, i7, i10);
        measureChild(this.F0, i7, i10);
        measureChild(this.E0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.d2 - this.f14697w1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.C0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.f14684q0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.f14658a2 && !this.f14662c2) {
            this.f14684q0 = true;
            t0();
            this.f14684q0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override
    public final boolean p() {
        return !(this.f14690t0 instanceof tg.u0);
    }

    public final tg.u0 p0() {
        int i7 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i7 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i7);
                if (childAt instanceof tg.u0) {
                    return (tg.u0) childAt;
                }
                i7++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final boolean q() {
        return !this.f14692u0;
    }

    public final android.graphics.Bitmap q0(java.util.ArrayList r39, boolean r40, boolean r41, boolean r42, boolean r43, hi.d7 r44) {
        throw new UnsupportedOperationException("Method not decompiled: hi.m5.q0(java.util.ArrayList, boolean, boolean, boolean, boolean, hi.d7):android.graphics.Bitmap");
    }

    public final boolean r0() {
        if (!this.f14679n0.a() && !this.V1) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f14684q0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z10) {
        if (this.f14658a2) {
            G0(0);
        }
        if (z10) {
            ly lyVar = this.Z1;
            if (lyVar != null && lyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Z1.getMeasuredHeight());
                ofFloat.addUpdateListener(new d4(this, 0));
                this.f14662c2 = true;
                ofFloat.addListener(new x4(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f28644w);
                ofFloat.start();
                return;
            }
            t0();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.u9 u9Var) {
        this.O1 = u9Var;
    }

    public void setCoverPreview(boolean z10) {
        if (this.W1 != z10) {
            this.W1 = z10;
            if (z10) {
                A0(null, true);
            }
            setCoverPause(z10);
        }
    }

    public void setCoverTime(long j3) {
        int i7 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i7 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i7);
                if (childAt instanceof tg.g2) {
                    ImageReceiver imageReceiver = ((tg.g2) childAt).f57314y0;
                    ch0 B = imageReceiver.B();
                    imageReceiver.m();
                    if (B != null) {
                        B.N(Math.round(((((float) j3) % ((float) B.r())) / ((float) B.r())) * B.f33577e[0]), true, false);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z10) {
        if (z10 != this.I1) {
            this.I1 = z10;
            d0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.f14695v1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.f14693u1 = runnable;
    }

    @Override
    public final void t() {
        if (!this.f14660b2 && !this.f14658a2) {
            this.V1 = true;
            l0(true);
            return;
        }
        if (this.f14658a2) {
            tg.j jVar = this.f14690t0;
            if (jVar instanceof tg.o2) {
                this.f14701y1.f14845e = true;
                org.telegram.messenger.g0.J3(((tg.o2) jVar).getEditText());
            }
        }
        G0(!this.f14658a2 ? 1 : 0);
    }

    public final void t0() {
        ly lyVar;
        if (!this.f14658a2 && (lyVar = this.Z1) != null && lyVar.getVisibility() != 8) {
            this.Z1.setVisibility(8);
        }
        int i7 = this.d2;
        this.d2 = 0;
        if (i7 != 0) {
            this.f14701y1.a();
        }
    }

    @Override
    public final boolean u(tg.j jVar) {
        return A0(jVar, true);
    }

    @Override
    public final void updateColors() {
        this.f14681o1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.f14700y0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f10 - view2.getX()) - view.getLeft();
        float y10 = (f11 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y10 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    public final boolean v0() {
        if (this.M1) {
            if (this.J1.getReactionsWindow() != null && !this.J1.getReactionsWindow().f5022q) {
                this.J1.e();
                return true;
            }
            L0(false);
            return true;
        } else if (this.l1) {
            F0(false);
            return true;
        } else if (this.f14658a2) {
            s0(true);
            return true;
        } else if (!this.f14692u0) {
            return false;
        } else {
            if (this.f14696w0) {
                this.f14696w0 = false;
                this.f14701y1.b(true);
                return false;
            }
            A0(null, true);
            return true;
        }
    }

    @Override
    public final void w(sg.h hVar) {
        boolean z10 = hVar instanceof sg.b;
        tg.m1 m1Var = this.N0;
        if (!z10 && !(hVar instanceof sg.d)) {
            m1Var.b(0.05f, 1.0f);
        } else {
            m1Var.b(0.4f, 1.75f);
        }
        m1Var.setDrawCenter(!(hVar instanceof sg.g));
        g5 g5Var = this.f14700y0;
        if (g5Var.getCurrentBrush() instanceof sg.g) {
            this.M0 = true;
        }
        g5Var.setBrush(hVar);
        sg.h1 h1Var = this.f14676k1;
        int i7 = h1Var.f56644a;
        h1Var.f56644a = sg.k0.e(this.f14683p1).c();
        h1Var.f56646c = this.O0.get();
        B0(h1Var, Integer.valueOf(i7), false);
        this.f14702z0.invalidate();
    }

    public abstract void w0(boolean z10);

    @Override
    public final sg.k0 x() {
        return sg.k0.e(this.f14683p1);
    }

    public final void x0() {
        final int i7 = this.I0;
        O0(1);
        postDelayed(new ai.o(this, 16), 350L);
        a5 a5Var = new a5(this, getContext(), this.f14685q1, i7);
        this.U1 = a5Var;
        ra raVar = this.f14697w1;
        Objects.requireNonNull(raVar);
        a5Var.f14413x1 = new q4(raVar, 0);
        final boolean[] zArr = {true};
        a5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                m5 m5Var = m5.this;
                m5Var.U1 = null;
                if (zArr[0]) {
                    m5Var.w0(false);
                }
                m5Var.O0(i7);
            }
        });
        a5Var.f14415z1 = new l4(this);
        a5Var.N0(new s4(this, zArr, a5Var, 0));
        a5Var.show();
        w0(true);
    }

    public final void y0(tg.j jVar) {
        this.f14679n0.b(jVar.getUUID(), new i4(this, jVar, 0));
    }

    public final void z0(tg.j jVar) {
        tg.j jVar2 = this.f14690t0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f57387n0, false);
            A0(null, true);
            if (jVar instanceof tg.o2) {
                ValueAnimator valueAnimator = this.L0;
                if (valueAnimator != null && this.J0 != 0) {
                    valueAnimator.cancel();
                }
                O0(0);
            }
        }
        this.B0.removeView(jVar);
        d0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            sg.k1 k1Var = this.f14679n0;
            k1Var.f56698b.remove(uuid);
            k1Var.f56699c.remove(uuid);
            org.telegram.messenger.g0.h3(new q2.d(k1Var, 11));
        }
        tg.m1 m1Var = this.N0;
        gc.b bVar = this.O0;
        m1Var.setValueOverride(bVar);
        m1Var.setShowPreview(true);
        float f10 = bVar.get();
        sg.h1 h1Var = this.f14676k1;
        h1Var.f56646c = f10;
        B0(h1Var, null, false);
        if (!this.X1 && (jVar instanceof tg.r1)) {
            sa saVar = ((u9) this).f15200k2;
            ga gaVar = saVar.Y0;
            if (gaVar != null) {
                gaVar.s(null, null, true);
            }
            u9 u9Var = saVar.f15107w1;
            if (u9Var != null) {
                u9Var.n0();
            }
            ia iaVar = saVar.f15048d1;
            if (iaVar != null) {
                iaVar.setHasRoundVideo(false);
            }
            d7 d7Var = saVar.L1;
            if (d7Var != null) {
                File file = d7Var.f14154o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    saVar.L1.f14154o0 = null;
                }
                if (saVar.L1.f14156p0 != null) {
                    try {
                        new File(saVar.L1.f14156p0).delete();
                    } catch (Exception unused2) {
                    }
                    saVar.L1.f14156p0 = null;
                }
            }
        }
    }

    public void setOffsetTranslationX(float f10) {
    }

    public View getView() {
        return this;
    }
}
