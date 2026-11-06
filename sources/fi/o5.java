package fi;

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
import bi.ec;
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
import org.telegram.messenger.g20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
public abstract class o5 extends st0 implements tg.g1, tg.h, tg.c1, qt0, ra {
    public final j5 A0;
    public int A1;
    public final FrameLayout B0;
    public int B1;
    public final k5 C0;
    public sg.q C1;
    public final v4 D0;
    public final boolean D1;
    public final FrameLayout E0;
    public final File E1;
    public a5 F0;
    public final boolean F1;
    public final View G0;
    public final boolean G1;
    public int H0;
    public boolean H1;
    public int I0;
    public ii0 I1;
    public float J0;
    public tg.q1 J1;
    public ValueAnimator K0;
    public float K1;
    public boolean L0;
    public boolean L1;
    public final tg.m1 M0;
    public boolean M1;
    public final cb.c N0;
    public org.telegram.ui.Components.y9 N1;
    public final int O0;
    public final x5 O1;
    public BigInteger P0;
    public final y5 P1;
    public TextView Q0;
    public boolean Q1;
    public TextView R0;
    public ObjectAnimator R1;
    public TextView S0;
    public final float[] S1;
    public final tg.h1 T0;
    public c5 T1;
    public final tg.e1 U0;
    public boolean U1;
    public final tg.j1 V0;
    public boolean V1;
    public final ImageView W0;
    public boolean W1;
    public final TextView X0;
    public final int[] X1;
    public final TextView Y0;
    public gy Y1;
    public final TextView Z0;
    public boolean Z1;
    public final Paint f12514a1;
    public boolean f12515a2;
    public final Paint f12516b1;
    public boolean f12517b2;
    public float f12518c1;
    public int f12519c2;
    public boolean f12520d1;
    public boolean d2;
    public r1.g f12521e1;
    public int f12522e2;
    public final w4 f12523f1;
    public int f12524f2;
    public final Paint f12525g1;
    public int f12526g2;
    public final Paint f12527h1;
    public boolean f12528h2;
    public final Paint f12529i1;
    public final tg.v0 f12530j0;
    public final sg.j1 f12531j1;
    public final tg.z0 f12532k0;
    public boolean f12533k1;
    public final Bitmap f12534l0;
    public r1.g l1;
    public final sg.m1 m0;
    public float f12535m1;
    public final org.telegram.messenger.q5 f12536n0;
    public final Paint n1;
    public final ye f12537o0;
    public final int f12538o1;
    public boolean f12539p0;
    public final g5 f12540p1;
    public mt0 f12541q0;
    public org.telegram.ui.ActionBar.g1 f12542q1;
    public boolean f12543r0;
    public m5 f12544r1;
    public tg.j f12545s0;
    public Rect f12546s1;
    public boolean f12547t0;
    public Runnable f12548t1;
    public int f12549u0;
    public Runnable f12550u1;
    public boolean f12551v0;
    public final ua f12552v1;
    public final boolean f12553w0;
    public AnimatorSet f12554w1;
    public final i5 f12555x0;
    public final x4 f12556x1;
    public final ec f12557y0;
    public e7 f12558y1;
    public final v4 f12559z0;
    public ArrayList f12560z1;

    public o5(Context context, boolean z9, File file, boolean z10, boolean z11, ua uaVar, Activity activity, final int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, e7 e7Var, int i11, int i12, ye yeVar, org.telegram.ui.Components.y9 y9Var, org.telegram.ui.ActionBar.f6 f6Var, x5 x5Var, y5 y5Var) {
        super(context, activity);
        Paint paint;
        org.telegram.ui.Components.y9 y9Var2;
        this.H0 = 0;
        this.I0 = -1;
        final x9 x9Var = (x9) this;
        cb.c cVar = new cb.c(x9Var, 25);
        this.N0 = cVar;
        Paint paint2 = new Paint(1);
        this.f12514a1 = paint2;
        Paint paint3 = new Paint(1);
        this.f12516b1 = paint3;
        this.f12525g1 = new Paint(1);
        this.f12527h1 = new Paint(1);
        Paint paint4 = new Paint(1);
        this.f12529i1 = paint4;
        sg.j1 j1Var = new sg.j1(1.0f, 0.016773745f, -1);
        this.f12531j1 = j1Var;
        this.n1 = new Paint(1);
        this.S1 = new float[2];
        this.V1 = false;
        this.X1 = new int[2];
        new a8.ra(x9Var, 24);
        setDelegate(this);
        this.N1 = y9Var;
        this.O1 = x5Var;
        this.D1 = z9;
        this.E1 = file;
        this.F1 = z10;
        this.G1 = z11;
        this.f12552v1 = uaVar;
        this.A1 = i11;
        this.B1 = i12;
        this.P1 = y5Var;
        this.f12538o1 = i7;
        g5 g5Var = new g5(0, f6Var);
        this.f12540p1 = g5Var;
        this.f12537o0 = yeVar;
        this.f12553w0 = context instanceof BubbleActivity;
        sg.l0 e10 = sg.l0.e(i7);
        e10.i(0, true);
        j1Var.f54992a = e10.c();
        j1Var.f54994c = e10.f55016i;
        org.telegram.messenger.q5 q5Var = new org.telegram.messenger.q5("Paint", true);
        this.f12536n0 = q5Var;
        this.f12534l0 = bitmap;
        this.O0 = i10;
        sg.m1 m1Var = new sg.m1();
        this.m0 = m1Var;
        m1Var.f55030a = new di.q4(x9Var, 13);
        View view = new View(context);
        this.G0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        sg.j0 j0Var = new sg.j0(getPaintingSize(), null, i10, y9Var);
        if (e7Var == null || !e7Var.f11918u) {
            paint = paint4;
            y9Var2 = y9Var;
        } else {
            paint = paint4;
            y9Var2 = null;
        }
        i5 i5Var = new i5(x9Var, context, j0Var, bitmap, bitmap2, y9Var2);
        this.f12555x0 = i5Var;
        i5Var.setDelegate(new d6.i(x9Var, 25));
        i5Var.setUndoStore(m1Var);
        i5Var.setQueue(q5Var);
        i5Var.setVisibility(4);
        ec ecVar = new ec(1, context, x9Var);
        this.f12557y0 = ecVar;
        ecVar.setVisibility(4);
        j5 j5Var = new j5(x9Var, context, new aa.n(x9Var, 22));
        this.A0 = j5Var;
        this.f12558y1 = e7Var;
        this.f12560z1 = arrayList;
        if (this.A1 > 0 && this.B1 > 0) {
            E0();
        }
        j5Var.setVisibility(4);
        this.f12559z0 = new v4(x9Var, context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.B0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, c8.ha.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(2131232531);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.f12555x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.f54943a.get(0));
                            return;
                        }
                        x9Var2.m0.c();
                        return;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.f12555x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.f54943a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.f55032c.clear();
                            m1Var2.f55031b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.f12545s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.f12545s0);
                        x9Var4.A0(null, true);
                        return;
                    case 3:
                        x9Var.A0(null, true);
                        return;
                    default:
                        x9 x9Var5 = x9Var;
                        if (x9Var5.f12533k1) {
                            x9Var5.F0(false);
                            return;
                        } else if (x9Var5.Z1) {
                            x9Var5.s0(true);
                            return;
                        } else if (x9Var5.f12547t0) {
                            x9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var5.f12550u1;
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
        frameLayout.addView(imageView, c8.ha.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(hd.M0(2131747266, null));
        linearLayout.addView(org.telegram.messenger.camera.q.e(context, 2131232532), c8.ha.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c8.ha.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.l1(3));
        frameLayout.addView(linearLayout, c8.ha.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.X0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(hd.M0(2131747278, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.f12555x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.f54943a.get(0));
                            return;
                        }
                        x9Var2.m0.c();
                        return;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.f12555x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.f54943a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.f55032c.clear();
                            m1Var2.f55031b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.f12545s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.f12545s0);
                        x9Var4.A0(null, true);
                        return;
                    case 3:
                        x9Var.A0(null, true);
                        return;
                    default:
                        x9 x9Var5 = x9Var;
                        if (x9Var5.f12533k1) {
                            x9Var5.F0(false);
                            return;
                        } else if (x9Var5.Z1) {
                            x9Var5.s0(true);
                            return;
                        } else if (x9Var5.f12547t0) {
                            x9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var5.f12550u1;
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
        TextView i13 = org.telegram.ui.Cells.f1.i(frameLayout, textView2, c8.ha.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Y0 = i13;
        i13.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        i13.setText(hd.M0(2131752101, null));
        i13.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i13.setGravity(16);
        i13.setTextColor(-1);
        i13.setTypeface(org.telegram.messenger.g0.o());
        i13.setTextSize(1, 16.0f);
        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.f12555x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.f54943a.get(0));
                            return;
                        }
                        x9Var2.m0.c();
                        return;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.f12555x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.f54943a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.f55032c.clear();
                            m1Var2.f55031b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.f12545s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.f12545s0);
                        x9Var4.A0(null, true);
                        return;
                    case 3:
                        x9Var.A0(null, true);
                        return;
                    default:
                        x9 x9Var5 = x9Var;
                        if (x9Var5.f12533k1) {
                            x9Var5.F0(false);
                            return;
                        } else if (x9Var5.Z1) {
                            x9Var5.s0(true);
                            return;
                        } else if (x9Var5.f12547t0) {
                            x9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var5.f12550u1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        i13.setAlpha(0.0f);
        i13.setVisibility(8);
        TextView i14 = org.telegram.ui.Cells.f1.i(frameLayout, i13, c8.ha.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.Z0 = i14;
        i14.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        i14.setText(hd.M0(2131751355, null));
        i14.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        i14.setGravity(16);
        i14.setTextColor(-1);
        i14.setTypeface(org.telegram.messenger.g0.o());
        i14.setTextSize(1, 16.0f);
        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.f12555x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.f54943a.get(0));
                            return;
                        }
                        x9Var2.m0.c();
                        return;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.f12555x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.f54943a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.f55032c.clear();
                            m1Var2.f55031b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.f12545s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.f12545s0);
                        x9Var4.A0(null, true);
                        return;
                    case 3:
                        x9Var.A0(null, true);
                        return;
                    default:
                        x9 x9Var5 = x9Var;
                        if (x9Var5.f12533k1) {
                            x9Var5.F0(false);
                            return;
                        } else if (x9Var5.Z1) {
                            x9Var5.s0(true);
                            return;
                        } else if (x9Var5.f12547t0) {
                            x9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var5.f12550u1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        i14.setAlpha(0.0f);
        i14.setVisibility(8);
        frameLayout.addView(i14, c8.ha.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        k5 k5Var = new k5(x9Var, context, e10);
        this.C0 = k5Var;
        k5Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        k5Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(k5Var, c8.ha.e(-1, 104, 80));
        tg.h1 h1Var = new tg.h1(context, (e7Var == null || e7Var.v() || e7Var.f11918u || y9Var == null) ? false : true);
        this.T0 = h1Var;
        h1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var.setDelegate(this);
        h1Var.setSelectedIndex(1);
        k5Var.addView(h1Var, c8.ha.c(48.0f, -1));
        tg.e1 e1Var = new tg.e1(context);
        this.U0 = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        e1Var.setVisibility(8);
        e1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        sg.j1 j1Var2 = x9Var2.f12531j1;
                        x9Var2.C0(j1Var2);
                        sg.l0.e(i7).j(j1Var2.f54994c);
                        return;
                    default:
                        x9Var.U0.setTypeface(sg.l0.e(i7).f55017j);
                        return;
                }
            }
        });
        e1Var.setAlignment(sg.l0.e(i7).f55015g);
        k5Var.addView(e1Var, c8.ha.c(48.0f, -1));
        v4 v4Var = new v4(x9Var, context, 0);
        this.D0 = v4Var;
        addView(v4Var, c8.ha.c(-1.0f, -1));
        tg.j1 j1Var2 = new tg.j1(context);
        this.V0 = j1Var2;
        j1Var2.setVisibility(8);
        j1Var2.setOnItemClickListener(new ai.k(x9Var, 10));
        e1Var.setTypefaceListView(j1Var2);
        v4Var.addView(j1Var2, c8.ha.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(352321535);
        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, g5Var));
        w4 w4Var = new w4(x9Var, context);
        this.f12523f1 = w4Var;
        w4Var.setVisibility(8);
        w4Var.setColorPalette(sg.l0.e(i7));
        w4Var.setColorListener(new bi.q9(x9Var, 1));
        k5Var.addView(w4Var, c8.ha.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        tg.v0 v0Var = new tg.v0(context);
        this.f12530j0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        k5Var.addView(v0Var, c8.ha.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        v0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        i5 i5Var2 = x9Var2.f12555x0;
                        if (i5Var2 != null && (i5Var2.getCurrentBrush() instanceof sg.g)) {
                            i5Var2.b();
                            x9Var2.T0.setSelectedIndex(1);
                            x9Var2.w((sg.h) sg.h.f54943a.get(0));
                            return;
                        }
                        x9Var2.m0.c();
                        return;
                    case 1:
                        x9 x9Var3 = x9Var;
                        i5 i5Var3 = x9Var3.f12555x0;
                        sg.m1 m1Var2 = x9Var3.m0;
                        if (m1Var2.a()) {
                            if (i5Var3 != null && (i5Var3.getCurrentBrush() instanceof sg.g)) {
                                i5Var3.b();
                                x9Var3.T0.setSelectedIndex(1);
                                x9Var3.w((sg.h) sg.h.f54943a.get(0));
                            }
                            if (i5Var3 != null) {
                                i5Var3.a();
                            }
                            m1Var2.f55032c.clear();
                            m1Var2.f55031b.clear();
                            org.telegram.messenger.g0.h3(new sg.t0(m1Var2, 1));
                            x9Var3.A0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var4 = x9Var;
                        tg.j jVar = x9Var4.f12545s0;
                        if (jVar instanceof tg.k2) {
                            org.telegram.messenger.g0.v1(((tg.k2) jVar).getFocusedView());
                        }
                        if (x9Var4.Z1) {
                            x9Var4.s0(false);
                        }
                        x9Var4.z0(x9Var4.f12545s0);
                        x9Var4.A0(null, true);
                        return;
                    case 3:
                        x9Var.A0(null, true);
                        return;
                    default:
                        x9 x9Var5 = x9Var;
                        if (x9Var5.f12533k1) {
                            x9Var5.F0(false);
                            return;
                        } else if (x9Var5.Z1) {
                            x9Var5.s0(true);
                            return;
                        } else if (x9Var5.f12547t0) {
                            x9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var5.f12550u1;
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
        this.f12532k0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new ah.g(x9Var, context, e10, 10));
        k5Var.addView(z0Var, c8.ha.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        tg.m1 m1Var2 = new tg.m1(context);
        this.M0 = m1Var2;
        m1Var2.setColorSwatch(j1Var);
        m1Var2.setRenderView(i5Var);
        m1Var2.setValueOverride(cVar);
        j1Var.f54994c = cVar.get();
        m1Var2.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x9 x9Var2 = x9Var;
                        sg.j1 j1Var22 = x9Var2.f12531j1;
                        x9Var2.C0(j1Var22);
                        sg.l0.e(i7).j(j1Var22.f54994c);
                        return;
                    default:
                        x9Var.U0.setTypeface(sg.l0.e(i7).f55017j);
                        return;
                }
            }
        });
        addView(m1Var2, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.E0 = frameLayout2;
        addView(frameLayout2, c8.ha.c(-1.0f, -1));
        Paint paint5 = paint;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        B0(j1Var, null, false);
        w((sg.h) sg.h.f54943a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f22537q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
        this.f12556x1 = new x4(x9Var, uaVar, new ai.f1(9, x9Var, uaVar));
        k2.f12251y1 = 1;
    }

    public static void D0(tg.k2 k2Var, int i7) {
        int i10;
        k2Var.setAlign(i7);
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
        k2Var.getEditText().setGravity(i10);
        if (i7 != 1) {
            if (i7 == 2 ? !hd.f22871a0 : hd.f22871a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        k2Var.getEditText().setTextAlignment(i11);
    }

    public static void X(x9 x9Var, sg.l0 l0Var, Integer num) {
        l0Var.h(num.intValue(), true);
        l0Var.g();
        x9Var.setNewColor(num.intValue());
        x9Var.f12523f1.setSelectedColorIndex(l0Var.d());
        x9Var.C1 = null;
    }

    public static void Y(x9 x9Var, Integer num) {
        x9Var.setNewColor(num.intValue());
        x9Var.F0(false);
    }

    public ViewGroup getBarView() {
        if (this.H0 == 2) {
            return this.U0;
        }
        return this.T0;
    }

    private int getFrameRotation() {
        int i7 = this.O0;
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

    private mt0 getPaintingSize() {
        mt0 mt0Var = this.f12541q0;
        if (mt0Var != null) {
            return mt0Var;
        }
        mt0 mt0Var2 = new mt0(1080.0f, 1920.0f);
        this.f12541q0 = mt0Var2;
        return mt0Var2;
    }

    private void setCoverPause(boolean z9) {
        int i7 = 0;
        while (true) {
            j5 j5Var = this.A0;
            if (i7 < j5Var.getChildCount()) {
                View childAt = j5Var.getChildAt(i7);
                if (childAt instanceof tg.d2) {
                    ImageReceiver imageReceiver = ((tg.d2) childAt).f55515x0;
                    zg0 B = imageReceiver.B();
                    org.telegram.ui.Components.v5 m10 = imageReceiver.m();
                    boolean z10 = !z9;
                    imageReceiver.f21219u0 = z10;
                    imageReceiver.f21217t0 = z10;
                    if (B != null) {
                        if (z9) {
                            B.stop();
                        } else {
                            B.start();
                        }
                    } else if (m10 != null) {
                        m10.D = z9;
                        if (z9) {
                            m10.x(false);
                        }
                        if (z9) {
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
        sg.j1 j1Var = this.f12531j1;
        int i10 = j1Var.f54992a;
        j1Var.f54992a = i7;
        B0(j1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new k4(this, i10, i7, 0));
        duration.start();
    }

    private void setTextType(int i7) {
        this.f12549u0 = i7;
        tg.j jVar = this.f12545s0;
        if (jVar instanceof tg.k2) {
            ((tg.k2) jVar).setType(i7);
        }
        sg.l0 e10 = sg.l0.e(this.f12538o1);
        e10.h = i7;
        e10.f55010a.edit().putInt("text_type", i7).apply();
        this.U0.e(i7, true);
    }

    private void setupTabsLayout(Context context) {
        a5 a5Var = new a5(this, context);
        this.F0 = a5Var;
        a5Var.setClipToPadding(false);
        this.F0.setOrientation(0);
        this.C0.addView(this.F0, c8.ha.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Q0 = textView;
        textView.setText(hd.M0(2131747276, null).toUpperCase());
        TextView textView2 = this.Q0;
        int i7 = org.telegram.ui.ActionBar.k6.f27940i6;
        g5 g5Var = this.f12540p1;
        org.telegram.ui.ActionBar.r6.R(textView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i7, g5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i7), g5Var);
        this.Q0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.Q0.setTextColor(-1);
        this.Q0.setTextSize(1, 14.0f);
        this.Q0.setGravity(1);
        this.Q0.setTypeface(org.telegram.messenger.g0.o());
        this.Q0.setSingleLine();
        this.Q0.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f11787b;

            {
                this.f11787b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o5 o5Var = this.f11787b;
                        if (o5Var.f12547t0) {
                            o5Var.A0(null, true);
                            return;
                        } else {
                            o5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f11787b.x0();
                        return;
                    default:
                        o5 o5Var2 = this.f11787b;
                        o5Var2.O0(2);
                        if (!(o5Var2.f12545s0 instanceof tg.k2)) {
                            o5Var2.U1 = true;
                            o5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.F0.addView(this.Q0, c8.ha.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.R0 = textView3;
        textView3.setText(hd.M0(2131747275, null).toUpperCase());
        org.telegram.ui.ActionBar.r6.R(this.R0, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i7, g5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i7), g5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f11787b;

            {
                this.f11787b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o5 o5Var = this.f11787b;
                        if (o5Var.f12547t0) {
                            o5Var.A0(null, true);
                            return;
                        } else {
                            o5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f11787b.x0();
                        return;
                    default:
                        o5 o5Var2 = this.f11787b;
                        o5Var2.O0(2);
                        if (!(o5Var2.f12545s0 instanceof tg.k2)) {
                            o5Var2.U1 = true;
                            o5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setAlpha(0.6f);
        this.R0.setSingleLine();
        this.F0.addView(this.R0, c8.ha.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.S0 = textView4;
        textView4.setText(hd.M0(2131747274, null).toUpperCase());
        org.telegram.ui.ActionBar.r6.R(this.S0, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i7, g5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i7), g5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setTextColor(-1);
        this.S0.setTextSize(1, 14.0f);
        this.S0.setGravity(1);
        this.S0.setTypeface(org.telegram.messenger.g0.o());
        this.S0.setAlpha(0.6f);
        this.S0.setSingleLine();
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final o5 f11787b;

            {
                this.f11787b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o5 o5Var = this.f11787b;
                        if (o5Var.f12547t0) {
                            o5Var.A0(null, true);
                            return;
                        } else {
                            o5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f11787b.x0();
                        return;
                    default:
                        o5 o5Var2 = this.f11787b;
                        o5Var2.O0(2);
                        if (!(o5Var2.f12545s0 instanceof tg.k2)) {
                            o5Var2.U1 = true;
                            o5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.F0.addView(this.S0, c8.ha.l(1.0f, 0, -2));
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
        K0(new m4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(tg.j jVar, boolean z9) {
        boolean z10;
        fb fbVar;
        fb fbVar2;
        ii0 ii0Var;
        int i7;
        boolean z11 = jVar instanceof tg.k2;
        int i10 = 2;
        int i11 = 0;
        if (z11 && (((i7 = this.I0) == -1 && this.H0 != 2) || (i7 != -1 && i7 != 2))) {
            ValueAnimator valueAnimator = this.K0;
            if (valueAnimator != null && i7 != 2) {
                valueAnimator.cancel();
            }
            if (this.f12533k1) {
                F0(false);
            }
            O0(2);
        }
        boolean z12 = true;
        if (z11 && z9) {
            tg.k2 k2Var = (tg.k2) jVar;
            int gravity = k2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            tg.e1 e1Var = this.U0;
            e1Var.setAlignment(i10);
            sg.b0 typeface = k2Var.getTypeface();
            if (typeface != null) {
                e1Var.setTypeface(typeface.f54901a);
            }
            e1Var.e(k2Var.getType(), true);
            this.D0.invalidate();
        }
        tg.j jVar2 = this.f12545s0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f55657d0) {
                    if (jVar instanceof tg.n0) {
                        tg.n0 n0Var = (tg.n0) jVar;
                        n0Var.setType((n0Var.getType() + 1) % n0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof tg.l2) {
                        tg.l2 l2Var = (tg.l2) jVar;
                        l2Var.setType((l2Var.getType() + 1) % l2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof tg.k0) {
                        tg.k0 k0Var = (tg.k0) jVar;
                        tg.i0 i0Var = k0Var.f55683q0;
                        if (i0Var.e()) {
                            if (i0Var.getPreviewType() == 0) {
                                i11 = 1;
                            }
                            i0Var.setPreviewType(i11);
                            return true;
                        }
                        k0Var.setType(k0Var.getNextType());
                        return true;
                    } else if (!this.f12547t0) {
                        if (jVar instanceof tg.k2) {
                            this.f12551v0 = true;
                            o0();
                            return true;
                        } else if (jVar instanceof tg.q1) {
                            tg.q1 q1Var = (tg.q1) jVar;
                            if (this.L1 && this.J1 == jVar) {
                                q1Var.q(true);
                                return true;
                            }
                            tg.q1 q1Var2 = this.J1;
                            if (q1Var2 != null && q1Var2 != q1Var && (ii0Var = this.I1) != null) {
                                ii0Var.animate().alpha(0.0f).setListener(new bi.t5(ii0Var, 20));
                                this.I1 = null;
                                this.L1 = false;
                                this.K1 = 0.0f;
                            }
                            if (this.I1 == null) {
                                ii0 ii0Var2 = new ii0(2, this.f12538o1, getContext(), LaunchActivity.Q(), new di.m2(6, new di.b()));
                                this.I1 = ii0Var2;
                                org.telegram.ui.Components.ca caVar = new org.telegram.ui.Components.ca(this.N1, ii0Var2, 0, false);
                                this.I1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                                this.f12552v1.addView(this.I1, c8.ha.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.o(-16777216, 120));
                                this.I1.setDelegate(new a8.r7(this, caVar, paint));
                                this.I1.p(null, null, true);
                            }
                            this.I1.setFragment(LaunchActivity.Q());
                            this.J1 = q1Var;
                            L0(true);
                            return true;
                        } else {
                            J0(jVar2);
                            return true;
                        }
                    } else if (jVar2 instanceof tg.k2) {
                        org.telegram.messenger.g0.K3(((tg.k2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.m0, false);
            tg.j jVar3 = this.f12545s0;
            if (jVar3 instanceof tg.k2) {
                tg.k2 k2Var2 = (tg.k2) jVar3;
                tg.j2 j2Var = k2Var2.f55691q0;
                j2Var.clearFocus();
                j2Var.setEnabled(false);
                j2Var.setClickable(false);
                k2Var2.m();
                if (!z11) {
                    this.f12547t0 = false;
                    org.telegram.messenger.g0.v1(((tg.k2) this.f12545s0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof tg.r1) && (fbVar2 = ((x9) this).f13102j2.Z0) != null) {
                fbVar2.l(false);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        tg.j jVar4 = this.f12545s0;
        this.f12545s0 = jVar;
        if ((jVar4 instanceof tg.k2) && TextUtils.isEmpty(((tg.k2) jVar4).getText())) {
            z0(jVar4);
        }
        tg.j jVar5 = this.f12545s0;
        if (jVar4 != jVar5 && (jVar5 instanceof tg.r1) && (fbVar = ((x9) this).f13102j2.Z0) != null) {
            fbVar.l(true);
        }
        tg.j jVar6 = this.f12545s0;
        cb.c cVar = this.N0;
        sg.j1 j1Var = this.f12531j1;
        tg.m1 m1Var = this.M0;
        if (jVar6 != null) {
            v4 v4Var = this.f12559z0;
            jVar6.m0 = v4Var;
            jVar6.l(v4Var, true);
            tg.j jVar7 = this.f12545s0;
            if (jVar7 instanceof tg.k2) {
                tg.k2 k2Var3 = (tg.k2) jVar7;
                k2Var3.getSwatch().f54994c = j1Var.f54994c;
                k2Var3.f55700z0 = false;
                C0(k2Var3.getSwatch());
                m1Var.setValueOverride(new y4(k2Var3, (int) (this.f12541q0.f36132a / 9.0f), 0));
                m1Var.setShowPreview(false);
            } else {
                m1Var.setValueOverride(cVar);
                m1Var.setShowPreview(true);
                j1Var.f54994c = cVar.get();
                B0(j1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.K0;
            if (valueAnimator2 != null && this.I0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f12533k1) {
                F0(false);
            }
            O0(0);
            m1Var.setValueOverride(cVar);
            m1Var.setShowPreview(true);
            j1Var.f54994c = cVar.get();
            B0(j1Var, null, false);
            z12 = z10;
        }
        R0();
        return z12;
    }

    public final void B0(sg.j1 j1Var, Integer num, boolean z9) {
        sg.j1 j1Var2 = this.f12531j1;
        if (j1Var2 != j1Var) {
            j1Var2.f54992a = j1Var.f54992a;
            j1Var2.f54993b = j1Var.f54993b;
            j1Var2.f54994c = j1Var.f54994c;
            int i7 = this.f12538o1;
            sg.l0.e(i7).h(j1Var.f54992a, true);
            sg.l0.e(i7).j(j1Var.f54994c);
        }
        int i10 = j1Var.f54992a;
        i5 i5Var = this.f12555x0;
        i5Var.setColor(i10);
        i5Var.setBrushSize(j1Var.f54994c);
        int i11 = j1Var2.f54992a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new e4(this, num, i11, 0));
            duration.start();
        } else {
            k5 k5Var = this.C0;
            if (k5Var != null) {
                k5Var.invalidate();
            }
        }
        tg.j jVar = this.f12545s0;
        if (jVar instanceof tg.k2) {
            ((tg.k2) jVar).setSwatch(new sg.j1(j1Var.f54993b, j1Var.f54994c, j1Var.f54992a));
        } else if (z9 && (jVar instanceof tg.n0)) {
            ((tg.n0) jVar).setColor(j1Var.f54992a);
            ((tg.n0) this.f12545s0).setType(3);
        } else if (z9 && (jVar instanceof tg.l2)) {
            ((tg.l2) jVar).setColor(j1Var.f54992a);
            ((tg.l2) this.f12545s0).setType(3);
        } else if (z9 && (jVar instanceof tg.k0)) {
            ((tg.k0) jVar).setColor(j1Var.f54992a);
            ((tg.k0) this.f12545s0).setType(0);
        }
    }

    public final void C0(sg.j1 j1Var) {
        B0(j1Var, null, false);
    }

    @Override
    public final void D() {
        M0(true);
    }

    public final void E0() {
        int i7;
        float f10;
        org.telegram.messenger.f6[] f6VarArr;
        tg.j jVar;
        tg.j jVar2;
        ArrayList arrayList = this.f12560z1;
        if (arrayList != null) {
            e7 e7Var = this.f12558y1;
            this.f12558y1 = null;
            this.f12560z1 = null;
            int size = arrayList.size();
            boolean z9 = false;
            int i10 = 0;
            while (true) {
                ?? r14 = this.A0;
                if (i10 < size) {
                    h20 h20Var = (h20) arrayList.get(i10);
                    byte b10 = h20Var.f22800a;
                    if (b10 == 0) {
                        f5 k02 = k0(h20Var.C, h20Var.B);
                        if ((2 & h20Var.f22801b) != 0) {
                            k02.r(z9);
                        }
                        ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                        layoutParams.width = h20Var.f22814q;
                        layoutParams.height = h20Var.f22815r;
                        i7 = size;
                        jVar2 = k02;
                    } else if (b10 == 1) {
                        tg.k2 l02 = l0(z9);
                        l02.setType(h20Var.f22801b);
                        l02.setTypeface(h20Var.f22811n);
                        l02.setBaseFontSize(h20Var.f22810m);
                        SpannableString spannableString = new SpannableString(h20Var.f22807j);
                        ?? r42 = h20Var.f22808k;
                        int size2 = r42.size();
                        for (int i11 = z9; i11 < size2; i11++) {
                            g20 g20Var = (g20) r42.get(i11);
                            org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(g20Var.document_id, 1.0f, l02.getFontMetricsInt());
                            int i12 = g20Var.offset;
                            spannableString.setSpan(r5Var, i12, g20Var.length + i12, 33);
                            size = size;
                        }
                        i7 = size;
                        CharSequence m10 = org.telegram.messenger.i6.m(spannableString, l02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (f6VarArr = (org.telegram.messenger.f6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.f6.class)) != null) {
                            for (org.telegram.messenger.f6 f6Var : f6VarArr) {
                                f6Var.f22344b = 0.85f;
                            }
                        }
                        l02.setText(m10);
                        D0(l02, h20Var.f22813p);
                        sg.j1 swatch = l02.getSwatch();
                        swatch.f54992a = h20Var.f22809l;
                        l02.setSwatch(swatch);
                        jVar2 = l02;
                    } else {
                        i7 = size;
                        if (b10 == 2) {
                            tg.n1 h02 = h0(h20Var.f22807j, false);
                            h02.G0 = h20Var.f22818u;
                            h02.B0 = false;
                            if ((2 & h20Var.f22801b) != 0) {
                                h02.r(false);
                            }
                            if ((h20Var.f22801b & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = h20Var.f22814q;
                            layoutParams2.height = h20Var.f22815r;
                            jVar2 = h02;
                        } else {
                            if (b10 == 6) {
                                ArrayList arrayList2 = e7Var.v;
                                boolean z10 = e7Var.K;
                                this.U1 = true;
                                f10 = 1.0f;
                                tg.j e5Var = new e5(this, getContext(), c0(), arrayList2, this.N1, z10, this.O1);
                                e5Var.setDelegate(this);
                                r14.addView(e5Var);
                                d0();
                                jVar = e5Var;
                                if (h20Var.f22814q > 0) {
                                    jVar = e5Var;
                                    if (h20Var.f22815r > 0) {
                                        ViewGroup.LayoutParams layoutParams3 = e5Var.getLayoutParams();
                                        layoutParams3.width = h20Var.f22814q;
                                        layoutParams3.height = h20Var.f22815r;
                                        jVar = e5Var;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                                if (b10 == 3) {
                                    tg.n0 g02 = g0(h20Var.N, h20Var.M);
                                    int i13 = h20Var.f22809l;
                                    if (i13 != 0) {
                                        g02.setColor(i13);
                                    }
                                    g02.setType(h20Var.f22801b);
                                    jVar = g02;
                                } else if (b10 == 8) {
                                    sb sbVar = h20Var.O;
                                    if (sbVar != null) {
                                        tg.l2 m0 = m0(sbVar);
                                        int i14 = h20Var.f22809l;
                                        if (i14 != 0) {
                                            m0.setColor(i14);
                                        }
                                        m0.setType(h20Var.f22801b);
                                        jVar = m0;
                                    } else {
                                        i10++;
                                        size = i7;
                                        z9 = false;
                                    }
                                } else if (b10 == 7) {
                                    tg.k0 f02 = f0(h20Var.W);
                                    tg.i0 i0Var = f02.f55683q0;
                                    int i15 = h20Var.f22809l;
                                    if (i15 != 0) {
                                        f02.setColor(i15);
                                    }
                                    boolean e10 = i0Var.e();
                                    int i16 = i0Var.h;
                                    int i17 = i0Var.f55619f;
                                    if (e10) {
                                        i0Var.setPreviewType(h20Var.f22801b);
                                    }
                                    byte b11 = h20Var.f22801b;
                                    if (b11 == -1) {
                                        f02.setType(3);
                                        i0Var.d();
                                        h20Var.f22814q = ((int) Math.ceil(i0Var.f55611a0)) + i17 + i17;
                                        h20Var.f22815r = ((int) Math.ceil(i0Var.f55613b0)) + i16 + i16;
                                        PointF position = f02.getPosition();
                                        position.y = (this.B1 * 0.3f) + position.y;
                                        f02.setPosition(position);
                                        i10++;
                                        size = i7;
                                        z9 = false;
                                    } else {
                                        f02.setType(b11);
                                        jVar = f02;
                                    }
                                } else if (b10 == 4) {
                                    tg.q1 i02 = i0(false);
                                    i02.s(ch.o0.d(h20Var.M.reaction), false);
                                    if (h20Var.M.flipped) {
                                        i02.r(false);
                                    }
                                    jVar = i02;
                                    if (h20Var.M.dark) {
                                        i02.q(false);
                                        jVar = i02;
                                    }
                                } else {
                                    if (b10 == 5 && e7Var.f11907o0 != null) {
                                        tg.r1 j02 = j0(e7Var.f11909p0, false);
                                        va vaVar = ((x9) this).f13102j2;
                                        ja jaVar = vaVar.X0;
                                        if (jaVar != null) {
                                            jaVar.f13193x = j02;
                                            n51 n51Var = jaVar.f13195y;
                                            if (n51Var != null) {
                                                n51Var.A0(j02.f55815u0);
                                            }
                                        }
                                        la laVar = vaVar.f12944c1;
                                        if (laVar != null) {
                                            laVar.setHasRoundVideo(true);
                                        }
                                        jVar = j02;
                                        if ((h20Var.f22801b & 2) != 0) {
                                            boolean z11 = !j02.f55812r0;
                                            j02.f55812r0 = z11;
                                            j02.f55813s0.f(z11, true);
                                            j02.invalidate();
                                            jVar = j02;
                                        }
                                    }
                                    i10++;
                                    size = i7;
                                    z9 = false;
                                }
                            }
                            jVar.setX((h20Var.f22802c * this.A1) - (((f10 - h20Var.v) * h20Var.f22814q) / 2.0f));
                            jVar.setY((h20Var.d * this.B1) - (((f10 - h20Var.v) * h20Var.f22815r) / 2.0f));
                            jVar.setPosition(new PointF((h20Var.f22814q / 2.0f) + jVar.getX(), (h20Var.f22815r / 2.0f) + jVar.getY()));
                            jVar.setScale(h20Var.v);
                            jVar.setRotation((float) (((-h20Var.f22803e) / 3.141592653589793d) * 180.0d));
                            i10++;
                            size = i7;
                            z9 = false;
                        }
                    }
                    f10 = 1.0f;
                    jVar = jVar2;
                    jVar.setX((h20Var.f22802c * this.A1) - (((f10 - h20Var.v) * h20Var.f22814q) / 2.0f));
                    jVar.setY((h20Var.d * this.B1) - (((f10 - h20Var.v) * h20Var.f22815r) / 2.0f));
                    jVar.setPosition(new PointF((h20Var.f22814q / 2.0f) + jVar.getX(), (h20Var.f22815r / 2.0f) + jVar.getY()));
                    jVar.setScale(h20Var.v);
                    jVar.setRotation((float) (((-h20Var.f22803e) / 3.141592653589793d) * 180.0d));
                    i10++;
                    size = i7;
                    z9 = false;
                } else {
                    r14.setVisibility(z9 ? 1 : 0);
                    return;
                }
            }
        }
    }

    public final void F0(final boolean z9) {
        float f10;
        boolean z10;
        if (this.f12533k1 != z9) {
            this.f12533k1 = z9;
            r1.g gVar = this.l1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.l1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z9) {
                f11 = 0.0f;
            }
            hVar.f54158i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f54150m = hVar;
            if (!this.f12556x1.c() && this.f12519c2 <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            final boolean[] zArr = {z10};
            final float translationY = this.C0.getTranslationY();
            final float alpha = this.f12532k0.getAlpha();
            final ViewGroup barView = getBarView();
            this.l1.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14;
                    int i7;
                    o5 o5Var = o5.this;
                    k5 k5Var = o5Var.C0;
                    float f15 = f12 / 1000.0f;
                    o5Var.f12535m1 = f15;
                    float f16 = 1.0f;
                    float f17 = ((1.0f - f15) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY((Math.min(o5Var.f12535m1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(o5Var.f12535m1, 0.25f) / 0.25f));
                    w4 w4Var = o5Var.f12523f1;
                    float f18 = o5Var.f12535m1;
                    boolean z11 = z9;
                    w4Var.B1(z11, f18);
                    tg.z0 z0Var = o5Var.f12532k0;
                    z0Var.setProgress(o5Var.f12535m1);
                    tg.v0 v0Var = o5Var.f12530j0;
                    v0Var.setProgress(o5Var.f12535m1);
                    o5Var.F0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * o5Var.f12535m1);
                    AnimatorSet animatorSet = o5Var.f12554w1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f19 = o5Var.f12535m1;
                        if (!z11) {
                            f19 = 1.0f - f19;
                        }
                        if (z11) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        float f20 = alpha;
                        z0Var.setAlpha(org.telegram.messenger.g0.T1(f20, f14, f19));
                        if (!z11) {
                            f16 = 0.0f;
                        }
                        v0Var.setAlpha(org.telegram.messenger.g0.T1(f20, f16, f19));
                        float L = org.telegram.messenger.g0.L(39.0f) * f19;
                        if (z11) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                        k5Var.setTranslationY(translationY - (L * i7));
                    }
                    k5Var.invalidate();
                    if (view == o5Var.U0) {
                        o5Var.D0.invalidate();
                    }
                }
            });
            this.l1.a(new g4(this, z9, 0));
            this.l1.h();
            if (z9) {
                w4 w4Var = this.f12523f1;
                w4Var.setVisibility(0);
                w4Var.setSelectedColorIndex(sg.l0.e(this.f12538o1).d());
            }
        }
    }

    public final void G0(int i7) {
        boolean z9;
        int i10;
        tg.e1 e1Var = this.U0;
        x4 x4Var = this.f12556x1;
        if (i7 == 1) {
            gy gyVar = this.Y1;
            if (gyVar != null && gyVar.getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            gy gyVar2 = this.Y1;
            ua uaVar = this.f12552v1;
            if (gyVar2 != null && gyVar2.f34076c1 != p10.f24459s0) {
                uaVar.removeView(gyVar2);
                this.Y1 = null;
            }
            if (this.Y1 == null) {
                gy gyVar3 = new gy(null, true, false, false, getContext(), false, null, null, true, this.f12540p1, false, false);
                this.Y1 = gyVar3;
                gyVar3.f34143x2 = false;
                gyVar3.U0 = true;
                gyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.Y1.setForseMultiwindowLayout(true);
                }
                this.Y1.setDelegate(new h5(this));
                uaVar.addView(this.Y1);
            }
            this.Y1.setVisibility(0);
            this.Z1 = true;
            gy gyVar4 = this.Y1;
            if (this.f12522e2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f12522e2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f12522e2 = qp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f12524f2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f12524f2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f12524f2 = qp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f22537q;
            if (point.x > point.y) {
                i10 = this.f12524f2;
            } else {
                i10 = this.f12522e2;
            }
            int paddingUnderContainer = uaVar.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            gyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.j jVar = this.f12545s0;
                if (jVar instanceof tg.k2) {
                    org.telegram.messenger.g0.v1(((tg.k2) jVar).getEditText());
                }
            }
            this.f12519c2 = paddingUnderContainer;
            x4Var.a();
            requestLayout();
            jg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(hg.d, true);
            }
            if (!z9) {
                if (this.f12515a2) {
                    this.d2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12519c2, 0.0f);
                    ofFloat.addUpdateListener(new h4(this, 1));
                    ofFloat.addListener(new z4(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27540w);
                    ofFloat.start();
                }
            }
        } else {
            jg emojiButton2 = e1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(hg.f34326e, true);
            }
            gy gyVar5 = this.Y1;
            if (gyVar5 != null) {
                this.Z1 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    gyVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.f12519c2 = 0;
                x4Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(tg.k0 k0Var) {
        m7 m7Var = new m7(getContext(), this.f12540p1, this.P1, new ai.f1(11, this, k0Var));
        if (k0Var != null) {
            tg.h0 h0Var = k0Var.f55687u0;
            m7Var.U1 = true;
            org.telegram.ui.Cells.k3 k3Var = m7Var.R1;
            org.telegram.ui.Cells.k3 k3Var2 = m7Var.Q1;
            if (h0Var != null) {
                m7Var.Y1 = h0Var.d;
                m7Var.Z1 = false;
                k3Var2.setText(h0Var.f55593c);
                k3Var.setText(h0Var.f55592b);
                m7Var.f12458e2 = !TextUtils.isEmpty(h0Var.f55592b);
                m7Var.f12459f2 = h0Var.f55595f;
                m7Var.f12460g2 = h0Var.f55594e;
            } else {
                k3Var2.setText("");
                k3Var.setText("");
                m7Var.f12459f2 = true;
                m7Var.f12460g2 = false;
            }
            String M0 = hd.M0(2131744642, null);
            d dVar = m7Var.T1;
            dVar.i(M0, false, true);
            bi.o0 o0Var = m7Var.P1;
            if (o0Var != null) {
                o0Var.O(false);
            }
            dVar.setEnabled(m7Var.f1(k3Var2.getText().toString()));
            m7Var.U1 = false;
        }
        m7Var.setOnDismissListener(new r4(this, 1));
        m7Var.show();
        w0(true);
    }

    public final void I0(tg.n0 n0Var, v10 v10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        di diVar = new di(getContext(), new d5(this, v10Var), false, true, false, this.f12540p1);
        diVar.T3 = new pb.b(10);
        dh dhVar = diVar.f32939r3;
        if (n0Var != null && (messageMedia = n0Var.f55741u0) != null && (geoPoint = messageMedia.geo) != null) {
            diVar.f32952u4 = new double[]{geoPoint.lat, geoPoint._long};
            diVar.F1 = true;
            dhVar.setVisibility(8);
        } else if (this.D1) {
            diVar.f32944s4 = this.F1;
            diVar.f32948t4 = this.E1;
            diVar.F1 = true;
            dhVar.setVisibility(8);
        } else {
            diVar.F1 = true;
            dhVar.setVisibility(8);
        }
        diVar.setOnDismissListener(new r4(this, 0));
        diVar.e1();
        diVar.show();
    }

    public final void J0(tg.j jVar) {
        if (jVar instanceof tg.u0) {
            org.telegram.ui.ActionBar.g1 g1Var = this.f12542q1;
            if (g1Var != null && g1Var.isShowing()) {
                this.f12542q1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.X1;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        j5 j5Var = this.A0;
        float scaleX2 = j5Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = j5Var.getScaleY() * scaleY * jVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i10;
        K0(new l4(this, jVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    @Override
    public final void K(int i7, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f12515a2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z9) {
                this.f12524f2 = i7;
                qp.d1().edit().putInt("kbd_height_land3", this.f12524f2).commit();
            } else {
                this.f12522e2 = i7;
                qp.d1().edit().putInt("kbd_height", this.f12522e2).commit();
            }
        }
        boolean z12 = this.Z1;
        x4 x4Var = this.f12556x1;
        if (z12) {
            if (z9) {
                i10 = this.f12524f2;
            } else {
                i10 = this.f12522e2;
            }
            int paddingUnderContainer = this.f12552v1.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Y1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.f22537q.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.Y1.setLayoutParams(layoutParams);
                this.f12519c2 = layoutParams.height;
                x4Var.a();
                requestLayout();
            }
        }
        if (this.f12526g2 == i7 && this.f12528h2 == z9) {
            return;
        }
        this.f12526g2 = i7;
        this.f12528h2 = z9;
        boolean z13 = this.f12515a2;
        tg.j jVar = this.f12545s0;
        if (jVar instanceof tg.k2) {
            if (((tg.k2) jVar).getEditText().isFocused() && x4Var.c()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f12515a2 = z11;
        } else {
            this.f12515a2 = false;
        }
        if (this.f12515a2 && this.Z1) {
            G0(0);
        }
        if (this.f12519c2 != 0 && !(z10 = this.f12515a2) && z10 != z13 && !this.Z1) {
            this.f12519c2 = 0;
            x4Var.a();
            requestLayout();
        }
        R0();
        if (z13 && !this.f12515a2 && this.f12519c2 > 0 && this.d2) {
            this.d2 = false;
        }
        P0();
    }

    public final void K0(Runnable runnable, o5 o5Var, int i7, int i10, int i11, boolean z9) {
        org.telegram.ui.ActionBar.g1 g1Var = this.f12542q1;
        if (g1Var != null && g1Var.isShowing()) {
            this.f12542q1.d(true);
            return;
        }
        if (this.f12544r1 == null) {
            this.f12546s1 = new Rect();
            m5 m5Var = new m5(this, getContext());
            this.f12544r1 = m5Var;
            m5Var.setAnimationEnabled(true);
            this.f12544r1.setOnTouchListener(new n4(0, this));
            this.f12544r1.setDispatchKeyEventListener(new o4(this));
            this.f12544r1.setShownFromBottom(true);
        }
        m5 m5Var2 = this.f12544r1;
        m5Var2.W = z9;
        m5Var2.d();
        runnable.run();
        if (this.f12542q1 == null) {
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(this.f12544r1, -2, -2);
            this.f12542q1 = g1Var2;
            g1Var2.f27479b = true;
            g1Var2.setAnimationStyle(2131755191);
            this.f12542q1.setOutsideTouchable(true);
            this.f12542q1.setClippingEnabled(true);
            this.f12542q1.setInputMethodMode(2);
            this.f12542q1.setSoftInputMode(0);
            this.f12542q1.getContentView().setFocusableInTouchMode(true);
            this.f12542q1.setOnDismissListener(new p4(0, this));
        }
        this.f12544r1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE));
        this.f12542q1.setFocusable(true);
        int measuredWidth = i10 - (this.f12544r1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.f12544r1.getMeasuredHeight();
        this.f12542q1.showAtLocation(o5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.g1.i(this.f12544r1);
        Drawable mutate = getContext().getResources().getDrawable(2131232566).mutate();
        if (z9) {
            m5 m5Var3 = this.f12544r1;
            m5Var3.setBackgroundDrawable(new org.telegram.ui.Components.ba(new org.telegram.ui.Components.ca(this.N1, m5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
            return;
        }
        this.f12544r1.setBackgroundDrawable(mutate);
        this.f12544r1.setBackgroundColor(-14145495);
    }

    public final void L0(boolean z9) {
        if (this.L1 != z9) {
            if (z9 || this.I1 != null) {
                this.L1 = z9;
                if (z9) {
                    this.I1.n();
                    this.I1.setVisibility(0);
                    this.I1.setSelectedReaction(this.J1.getCurrentReaction());
                    this.I1.getParent().bringChildToFront(this.I1);
                } else {
                    this.J1 = null;
                }
                float f10 = 0.0f;
                if (z9) {
                    this.M1 = true;
                    this.f12552v1.invalidate();
                    float f11 = this.K1;
                    if (z9) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.I1.setTransitionProgress(this.K1);
                    ofFloat.addUpdateListener(new h4(this, 2));
                    ofFloat.addListener(new ch.y(11, this, z9));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(xq.f40311g);
                    ofFloat.start();
                    return;
                }
                if (this.I1.getReactionsWindow() != null) {
                    this.I1.getReactionsWindow().e();
                }
                this.I1.animate().alpha(0.0f).setDuration(150L).setListener(new z4(this, 0)).start();
            }
        }
    }

    public final void M0(boolean z9) {
        float f10;
        if (this.f12520d1 != z9) {
            this.f12520d1 = z9;
            r1.g gVar = this.f12521e1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z9) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            r1.g gVar2 = new r1.g(new r1.f(f10));
            this.f12521e1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z9) {
                f11 = 0.0f;
            }
            hVar.f54158i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f54150m = hVar;
            if (z9) {
                tg.j1 j1Var = this.V0;
                j1Var.setAlpha(0.0f);
                j1Var.setVisibility(0);
            }
            this.f12521e1.b(new di.a8(1, this));
            this.f12521e1.a(new g4(this, z9, 1));
            this.f12521e1.h();
        }
    }

    public final PointF N0(tg.j jVar) {
        float f10;
        float f11;
        float f12 = 200.0f;
        ye yeVar = this.f12537o0;
        if (yeVar != null) {
            f12 = 200.0f / yeVar.f26620c;
        }
        float f13 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = 100.0f;
        if (yeVar != null) {
            f14 = 100.0f / yeVar.f26620c;
        }
        PointF c02 = c0();
        int i7 = 0;
        while (i7 < 10) {
            int i10 = 0;
            boolean z9 = false;
            while (true) {
                j5 j5Var = this.A0;
                if (i10 >= j5Var.getChildCount()) {
                    break;
                }
                View childAt = j5Var.getChildAt(i10);
                if (!(childAt instanceof tg.j) || (childAt instanceof tg.u0)) {
                    f10 = f13;
                    f11 = f14;
                } else {
                    PointF position2 = ((tg.j) childAt).getPosition();
                    f10 = f13;
                    f11 = f14;
                    if (((float) Math.sqrt(Math.pow(position2.y - c02.y, 2.0d) + Math.pow(position2.x - c02.x, 2.0d))) < f11) {
                        f12 = Math.min(childAt.getHeight(), childAt.getWidth()) * f10;
                        z9 = true;
                    }
                }
                i10++;
                f14 = f11;
                f13 = f10;
            }
            float f15 = f13;
            float f16 = f14;
            if (!z9) {
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
        boolean z9;
        if (this.H0 != i7 && this.I0 != i7) {
            ValueAnimator valueAnimator = this.K0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = this.H0;
            ViewGroup viewGroup3 = this.U0;
            ViewGroup viewGroup4 = this.T0;
            if (i10 == 0) {
                viewGroup = viewGroup4;
            } else if (i10 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.I0 = i7;
            if (i7 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i7 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.f12538o1;
            sg.l0 e10 = sg.l0.e(i11);
            if (i7 == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (e10.f55019l != z9) {
                e10.f55019l = z9;
                if (z9) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f55010a.getInt("brush", 0), false);
                }
            }
            int c10 = sg.l0.e(i11).c();
            sg.j1 j1Var = this.f12531j1;
            j1Var.f54992a = c10;
            B0(j1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.K0 = duration;
            duration.setInterpolator(xq.f40310f);
            this.K0.addUpdateListener(new di.g3(this, viewGroup, viewGroup2, 1));
            this.K0.addListener(new b5(this, viewGroup, viewGroup2, i7, 0));
            this.K0.start();
        }
    }

    public final void P0() {
        boolean z9;
        x4 x4Var = this.f12556x1;
        tg.e1 e1Var = this.U0;
        if (e1Var != null) {
            if (x4Var.c()) {
                e1Var.a(2131231512);
            } else if (this.Z1) {
                e1Var.a(2131231504);
            } else {
                e1Var.a(2131232042);
            }
        }
        if (!x4Var.c() && !this.Z1) {
            z9 = false;
        } else {
            z9 = true;
        }
        boolean z10 = !z9;
        org.telegram.messenger.g0.U3(1.0f, this.X0, z10, false);
        org.telegram.messenger.g0.U3(1.0f, this.W0, z10, false);
        org.telegram.messenger.g0.U3(1.0f, this.Z0, z9, false);
        org.telegram.messenger.g0.U3(1.0f, this.Y0, z9, false);
    }

    @Override
    public final int Q() {
        return this.f12556x1.f12658l - this.f12552v1.getBottomPadding2();
    }

    public final void Q0() {
        float f10;
        tg.j jVar;
        ObjectAnimator objectAnimator = this.R1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.f12555x0.getParent();
        if (view == null) {
            return;
        }
        x4 x4Var = this.f12556x1;
        if (((x4Var.c() && !x4Var.d) || this.f12519c2 > 0) && (jVar = this.f12545s0) != null) {
            f10 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f10);
        this.R1 = ofFloat;
        ofFloat.setDuration(350L);
        this.R1.setInterpolator(xq.h);
        this.R1.start();
    }

    public final void R0() {
        throw new UnsupportedOperationException("Method not decompiled: fi.o5.R0():void");
    }

    @Override
    public final void a() {
        F0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27921h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27956j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28106r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28210wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28266zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28156ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28137si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28176ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28194vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28248yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28229xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27792a7));
    }

    @Override
    public final void b() {
        setTextType((this.f12549u0 + 1) % 4);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new f2.h(5, this, view)).start();
    }

    @Override
    public final void c(int i7) {
        tg.j jVar = this.f12545s0;
        if (jVar instanceof tg.k2) {
            D0((tg.k2) jVar, i7);
            sg.l0 e10 = sg.l0.e(this.f12538o1);
            e10.f55015g = i7;
            e10.f55010a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final PointF c0() {
        j5 j5Var = this.A0;
        int measuredWidth = j5Var.getMeasuredWidth();
        int measuredHeight = j5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.A1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.B1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void d0() {
        org.telegram.ui.Components.r5[] r5VarArr;
        boolean z9 = this.F1;
        j5 j5Var = this.A0;
        boolean z10 = true;
        if (!z9 && !this.H1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 < j5Var.getChildCount()) {
                    View childAt = j5Var.getChildAt(i7);
                    boolean z11 = childAt instanceof tg.k2;
                    int i10 = this.f12538o1;
                    if (z11) {
                        CharSequence text = ((tg.k2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.r5 r5Var : (org.telegram.ui.Components.r5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.r5.class)) {
                                TLRPC.Document document = r5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.i5.e(i10, r5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.i5.g(i10).e(document);
                                }
                                org.telegram.messenger.w7.G(i10);
                                if (e7.u(document, org.telegram.messenger.w7.K(document, null, true, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i7++;
                    } else if (childAt instanceof tg.d2) {
                        TLRPC.Document sticker = ((tg.d2) childAt).getSticker();
                        org.telegram.messenger.w7.G(i10);
                        if (e7.u(sticker, org.telegram.messenger.w7.K(sticker, null, true, true).getAbsolutePath())) {
                            break;
                        }
                        i7++;
                    } else if (childAt instanceof tg.r1) {
                        break;
                    } else {
                        i7++;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
        }
        for (int i11 = 0; i11 < j5Var.getChildCount(); i11++) {
            View childAt2 = j5Var.getChildAt(i11);
            if (childAt2 instanceof tg.j) {
                ((tg.j) childAt2).setIsVideo(z10);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ye yeVar;
        int i7 = 0;
        if ((view == this.f12555x0 || view == this.f12557y0 || view == this.A0 || view == this.f12559z0) && (yeVar = this.f12537o0) != null) {
            canvas.save();
            if (!this.f12553w0) {
                i7 = org.telegram.messenger.g0.f22531m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = yeVar.f26625k;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * yeVar.f26621e)) / yeVar.f26620c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * yeVar.f26622f)) / yeVar.f26620c);
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
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, this.f12540p1);
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
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        j5 j5Var = this.A0;
        if (j5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.A1;
        } else {
            measuredWidth = j5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.k0 k0Var = new tg.k0(getContext(), N0, this.f12538o1, h0Var, f10 / 360.0f, L);
        if (N0.x == j5Var.getMeasuredWidth() / 2.0f) {
            k0Var.setStickyX(2);
        }
        if (N0.y == j5Var.getMeasuredHeight() / 2.0f) {
            k0Var.setStickyY(2);
        }
        sg.j1 j1Var = this.f12531j1;
        if (j1Var != null && (i7 = j1Var.f54992a) != -47814) {
            k0Var.setColor(i7);
        }
        k0Var.setDelegate(this);
        k0Var.setMaxWidth(L);
        j5Var.addView(k0Var, c8.ha.c(-2.0f, -2));
        d0();
        ye yeVar = this.f12537o0;
        if (yeVar != null) {
            k0Var.j(1.0f / yeVar.f26620c);
            k0Var.f(-(yeVar.f26625k + yeVar.d));
        }
        return k0Var;
    }

    public final tg.n0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i7;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        j5 j5Var = this.A0;
        if (j5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.A1;
        } else {
            measuredWidth = j5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.n0 n0Var = new tg.n0(getContext(), N0, this.f12538o1, messageMedia, mediaArea, f10 / 240.0f, L);
        if (N0.x == j5Var.getMeasuredWidth() / 2.0f) {
            n0Var.setStickyX(2);
        }
        if (N0.y == j5Var.getMeasuredHeight() / 2.0f) {
            n0Var.setStickyY(2);
        }
        sg.j1 j1Var = this.f12531j1;
        if (j1Var != null && (i7 = j1Var.f54992a) != -47814) {
            n0Var.setColor(i7);
        }
        n0Var.setDelegate(this);
        n0Var.setMaxWidth(L);
        j5Var.addView(n0Var, c8.ha.c(-2.0f, -2));
        d0();
        ye yeVar = this.f12537o0;
        if (yeVar != null) {
            n0Var.j(1.0f / yeVar.f26620c);
            n0Var.f(-(yeVar.f26625k + yeVar.d));
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
        return this.f12555x0.c(true, false);
    }

    public View getBottomLayout() {
        return this.C0;
    }

    public View getCancelView() {
        return this.f12530j0;
    }

    public float getCropRotation() {
        ye yeVar = this.f12537o0;
        if (yeVar != null) {
            return yeVar.d + yeVar.f26625k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f12532k0;
    }

    public View getEntitiesView() {
        return this.A0;
    }

    public long getLcm() {
        return this.P0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.r5[] r5VarArr;
        j5 j5Var = this.A0;
        int childCount = j5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = j5Var.getChildAt(i7);
            if (childAt instanceof tg.d2) {
                TLRPC.Document sticker = ((tg.d2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f26964id = sticker.f26958id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof tg.k2) {
                CharSequence text = ((tg.k2) childAt).getText();
                if ((text instanceof Spanned) && (r5VarArr = (org.telegram.ui.Components.r5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.r5.class)) != null) {
                    for (org.telegram.ui.Components.r5 r5Var : r5VarArr) {
                        if (r5Var != null) {
                            TLRPC.Document document = r5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.i5.e(this.f12538o1, r5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f26964id = document.f26958id;
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
        return Arrays.asList(this.f12555x0, this.f12557y0, this.A0, this.f12559z0);
    }

    public View getRenderInputView() {
        return this.f12557y0;
    }

    public sg.w0 getRenderView() {
        return this.f12555x0;
    }

    public tg.j getSelectedEntity() {
        return this.f12545s0;
    }

    public View getSelectionEntitiesView() {
        return this.f12559z0;
    }

    public View getTextDimView() {
        return this.G0;
    }

    public View getTopLayout() {
        return this.B0;
    }

    public View getWeightChooserView() {
        return this.M0;
    }

    public final tg.n1 h0(String str, boolean z9) {
        float f10;
        mt0 mt0Var;
        this.U1 = true;
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
        j5 j5Var = this.A0;
        if (i7 > 0) {
            float floor = (float) Math.floor(Math.max(this.A1, j5Var.getMeasuredWidth()) * 0.5d);
            mt0Var = new mt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.B1, j5Var.getMeasuredHeight()) * 0.5d);
            mt0Var = new mt0(f10 * floor2, floor2);
        }
        mt0 mt0Var2 = mt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = mt0Var2.f36132a;
            mt0Var2.f36132a = mt0Var2.f36133b;
            mt0Var2.f36133b = f11;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.n1 n1Var = new tg.n1(context, c02, mt0Var2, str, intValue);
        n1Var.setDelegate(this);
        j5Var.addView(n1Var);
        d0();
        return n1Var;
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.V1) {
            return false;
        }
        if (this.f12545s0 != null) {
            A0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.f12555x0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final tg.q1 i0(boolean z9) {
        String str;
        mt0 mt0Var = new mt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF c02 = c0();
        j5 j5Var = this.A0;
        if (j5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < j5Var.getChildCount(); i7++) {
                    View childAt = j5Var.getChildAt(i7);
                    if (a8.r9.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (j5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (j5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, j5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, j5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new tg.j(getContext(), c02);
        jVar.f55792r0 = new di.v8(jVar);
        jVar.f55793s0 = new di.v8(jVar);
        jVar.f55794t0 = new ch.f0(jVar);
        jVar.f55795u0 = new ch.f0(jVar);
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5((View) jVar);
        jVar.f55797w0 = w5Var;
        org.telegram.ui.Components.w5 w5Var2 = new org.telegram.ui.Components.w5((View) jVar);
        jVar.f55798x0 = w5Var2;
        jVar.f55800z0 = 1.0f;
        jVar.f55791q0 = mt0Var;
        w5Var2.e(true, 1.0f);
        w5Var.e(true, 1.0f);
        ArrayList arrayList = ui.b0(p10.f24459s0).h;
        ch.f0 f0Var = jVar.f55794t0;
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
        ch.o0 b10 = ch.o0.b(str);
        jVar.f55796v0 = b10;
        f0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        j5Var.addView(jVar);
        d0();
        if (z9) {
            y0(jVar);
            A0(jVar, true);
        }
        return jVar;
    }

    public final tg.r1 j0(String str, boolean z9) {
        float f10;
        this.U1 = true;
        this.W1 = true;
        n0();
        j5 j5Var = this.A0;
        int measuredWidth = j5Var.getMeasuredWidth();
        j5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.A1;
        }
        float floor = (float) Math.floor(0.43f * f10);
        mt0 mt0Var = new mt0(floor, floor);
        tg.r1 r1Var = new tg.r1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (mt0Var.f36133b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), mt0Var, str);
        r1Var.setDelegate(this);
        j5Var.addView(r1Var);
        d0();
        if (z9) {
            y0(r1Var);
            post(new c4(this, r1Var, 0));
        }
        this.W1 = false;
        return r1Var;
    }

    public final f5 k0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i7 = 0; i7 < document.attributes.size() && !(document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeSticker); i7++) {
        }
        float f11 = 0.75f;
        ye yeVar = this.f12537o0;
        if (yeVar != null) {
            f10 = -(yeVar.f26625k + yeVar.d);
            f11 = 0.75f / yeVar.f26620c;
        } else {
            f10 = 0.0f;
        }
        n5 n5Var = new n5(c0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f36132a * 0.5d);
        f5 f5Var = new f5(this, context, n5Var.f12479a, n5Var.f12481c, n5Var.f12480b, new mt0(floor, floor), document, obj);
        boolean D4 = ij.D4(document);
        ImageReceiver imageReceiver = f5Var.f55515x0;
        if (D4) {
            imageReceiver.f21206o1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        f5Var.setDelegate(this);
        this.A0.addView(f5Var);
        d0();
        return f5Var;
    }

    public final tg.k2 l0(boolean z9) {
        mt0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        tg.k2 k2Var = new tg.k2(getContext(), N0, (int) (paintingSize.f36132a / 9.0f), "", this.f12531j1, this.f12549u0);
        float f10 = paintingSize.f36132a / 9.0f;
        m4 m4Var = new m4(this, 0);
        k2Var.f55697w0 = (int) (0.5f * f10);
        k2Var.f55698x0 = (int) (f10 * 2.0f);
        k2Var.f55699y0 = m4Var;
        float f11 = N0.x;
        j5 j5Var = this.A0;
        if (f11 == j5Var.getMeasuredWidth() / 2.0f) {
            k2Var.setStickyX(2);
        }
        if (N0.y == j5Var.getMeasuredHeight() / 2.0f) {
            k2Var.setStickyY(2);
        }
        k2Var.setDelegate(this);
        k2Var.setMaxWidth(this.A1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.f12538o1;
        k2Var.setTypeface(sg.l0.e(i7).f55017j);
        k2Var.setType(sg.l0.e(i7).h);
        j5Var.addView(k2Var, c8.ha.c(-2.0f, -2));
        d0();
        ye yeVar = this.f12537o0;
        if (yeVar != null) {
            k2Var.j(1.0f / yeVar.f26620c);
            k2Var.f(-(yeVar.f26625k + yeVar.d));
        }
        if (z9) {
            y0(k2Var);
            k2Var.q();
            A0(k2Var, false);
            k2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.K3(k2Var.getFocusedView());
            this.f12547t0 = true;
            int i10 = sg.l0.e(i7).f55015g;
            tg.e1 e1Var = this.U0;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.l0.e(i7).h);
        }
        return k2Var;
    }

    public final tg.l2 m0(sb sbVar) {
        int measuredWidth;
        int i7;
        this.U1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        j5 j5Var = this.A0;
        if (j5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.A1;
        } else {
            measuredWidth = j5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.l2 l2Var = new tg.l2(getContext(), N0, this.f12538o1, sbVar, f10 / 240.0f, L);
        if (N0.x == j5Var.getMeasuredWidth() / 2.0f) {
            l2Var.setStickyX(2);
        }
        if (N0.y == j5Var.getMeasuredHeight() / 2.0f) {
            l2Var.setStickyY(2);
        }
        sg.j1 j1Var = this.f12531j1;
        if (j1Var != null && (i7 = j1Var.f54992a) != -47814) {
            l2Var.setColor(i7);
        }
        l2Var.setDelegate(this);
        l2Var.setMaxWidth(L);
        j5Var.addView(l2Var, c8.ha.c(-2.0f, -2));
        d0();
        ye yeVar = this.f12537o0;
        if (yeVar != null) {
            l2Var.j(1.0f / yeVar.f26620c);
            l2Var.f(-(yeVar.f26625k + yeVar.d));
        }
        return l2Var;
    }

    @Override
    public final int[] n(tg.j jVar) {
        int[] iArr = this.X1;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final void n0() {
        int i7 = 0;
        while (true) {
            j5 j5Var = this.A0;
            if (i7 < j5Var.getChildCount()) {
                View childAt = j5Var.getChildAt(i7);
                if (childAt instanceof tg.r1) {
                    if (this.f12545s0 == childAt) {
                        A0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(xq.h).withEndAction(new c4(this, (tg.r1) childAt, 1)).start();
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
        ii0 ii0Var = this.I1;
        if (ii0Var != null) {
            org.telegram.messenger.g0.E2(ii0Var);
            this.I1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        float f11;
        this.f12539p0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f22537q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
        Bitmap bitmap = this.f12534l0;
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
        float f12 = this.f12541q0.f36132a;
        tg.j jVar = this.f12545s0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.C0, i7, i10);
        measureChild(this.M0, i7, i10);
        measureChild(this.E0, i7, i10);
        measureChild(this.D0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f12519c2 - this.f12552v1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.B0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.f12539p0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.Z1 && !this.f12517b2) {
            this.f12539p0 = true;
            t0();
            this.f12539p0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override
    public final boolean p() {
        return !(this.f12545s0 instanceof tg.u0);
    }

    public final tg.u0 p0() {
        int i7 = 0;
        while (true) {
            j5 j5Var = this.A0;
            if (i7 < j5Var.getChildCount()) {
                View childAt = j5Var.getChildAt(i7);
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
        return !this.f12547t0;
    }

    public final android.graphics.Bitmap q0(java.util.ArrayList r39, boolean r40, boolean r41, boolean r42, boolean r43, fi.e7 r44) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o5.q0(java.util.ArrayList, boolean, boolean, boolean, boolean, fi.e7):android.graphics.Bitmap");
    }

    public final boolean r0() {
        if (!this.m0.a() && !this.U1) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f12539p0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z9) {
        if (this.Z1) {
            G0(0);
        }
        if (z9) {
            gy gyVar = this.Y1;
            if (gyVar != null && gyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Y1.getMeasuredHeight());
                ofFloat.addUpdateListener(new h4(this, 0));
                this.f12517b2 = true;
                ofFloat.addListener(new z4(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.i1.f27540w);
                ofFloat.start();
                return;
            }
            t0();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.y9 y9Var) {
        this.N1 = y9Var;
    }

    public void setCoverPreview(boolean z9) {
        if (this.V1 != z9) {
            this.V1 = z9;
            if (z9) {
                A0(null, true);
            }
            setCoverPause(z9);
        }
    }

    public void setCoverTime(long j3) {
        int i7 = 0;
        while (true) {
            j5 j5Var = this.A0;
            if (i7 < j5Var.getChildCount()) {
                View childAt = j5Var.getChildAt(i7);
                if (childAt instanceof tg.d2) {
                    ImageReceiver imageReceiver = ((tg.d2) childAt).f55515x0;
                    zg0 B = imageReceiver.B();
                    imageReceiver.m();
                    if (B != null) {
                        B.N(Math.round(((((float) j3) % ((float) B.r())) / ((float) B.r())) * B.f40931e[0]), true, false);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z9) {
        if (z9 != this.H1) {
            this.H1 = z9;
            d0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.f12550u1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.f12548t1 = runnable;
    }

    @Override
    public final void t() {
        if (!this.f12515a2 && !this.Z1) {
            this.U1 = true;
            l0(true);
            return;
        }
        if (this.Z1) {
            tg.j jVar = this.f12545s0;
            if (jVar instanceof tg.k2) {
                this.f12556x1.f12652e = true;
                org.telegram.messenger.g0.K3(((tg.k2) jVar).getEditText());
            }
        }
        G0(!this.Z1 ? 1 : 0);
    }

    public final void t0() {
        gy gyVar;
        if (!this.Z1 && (gyVar = this.Y1) != null && gyVar.getVisibility() != 8) {
            this.Y1.setVisibility(8);
        }
        int i7 = this.f12519c2;
        this.f12519c2 = 0;
        if (i7 != 0) {
            this.f12556x1.a();
        }
    }

    @Override
    public final boolean u(tg.j jVar) {
        return A0(jVar, true);
    }

    @Override
    public final void updateColors() {
        this.n1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.f12555x0.getParent();
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
        if (this.L1) {
            if (this.I1.getReactionsWindow() != null && !this.I1.getReactionsWindow().f6197q) {
                this.I1.e();
                return true;
            }
            L0(false);
            return true;
        } else if (this.f12533k1) {
            F0(false);
            return true;
        } else if (this.Z1) {
            s0(true);
            return true;
        } else if (!this.f12547t0) {
            return false;
        } else {
            if (this.f12551v0) {
                this.f12551v0 = false;
                this.f12556x1.b(true);
                return false;
            }
            A0(null, true);
            return true;
        }
    }

    @Override
    public final void w(sg.h hVar) {
        boolean z9 = hVar instanceof sg.b;
        tg.m1 m1Var = this.M0;
        if (!z9 && !(hVar instanceof sg.d)) {
            m1Var.b(0.05f, 1.0f);
        } else {
            m1Var.b(0.4f, 1.75f);
        }
        m1Var.setDrawCenter(!(hVar instanceof sg.g));
        i5 i5Var = this.f12555x0;
        if (i5Var.getCurrentBrush() instanceof sg.g) {
            this.L0 = true;
        }
        i5Var.setBrush(hVar);
        sg.j1 j1Var = this.f12531j1;
        int i7 = j1Var.f54992a;
        j1Var.f54992a = sg.l0.e(this.f12538o1).c();
        j1Var.f54994c = this.N0.get();
        B0(j1Var, Integer.valueOf(i7), false);
        this.f12557y0.invalidate();
    }

    public abstract void w0(boolean z9);

    @Override
    public final sg.l0 x() {
        return sg.l0.e(this.f12538o1);
    }

    public final void x0() {
        final int i7 = this.H0;
        O0(1);
        postDelayed(new ai.m0(this, 12), 350L);
        c5 c5Var = new c5(this, getContext(), this.f12540p1, i7);
        this.T1 = c5Var;
        ua uaVar = this.f12552v1;
        Objects.requireNonNull(uaVar);
        c5Var.f12261t1 = new ai.e(uaVar, 20);
        final boolean[] zArr = {true};
        c5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                o5 o5Var = o5.this;
                o5Var.T1 = null;
                if (zArr[0]) {
                    o5Var.w0(false);
                }
                o5Var.O0(i7);
            }
        });
        c5Var.f12263v1 = new o4(this);
        c5Var.N0(new u4(this, zArr, c5Var, 0));
        c5Var.show();
        w0(true);
    }

    public final void y0(tg.j jVar) {
        this.m0.b(jVar.getUUID(), new l4(this, jVar, 0));
    }

    public final void z0(tg.j jVar) {
        tg.j jVar2 = this.f12545s0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            A0(null, true);
            if (jVar instanceof tg.k2) {
                ValueAnimator valueAnimator = this.K0;
                if (valueAnimator != null && this.I0 != 0) {
                    valueAnimator.cancel();
                }
                O0(0);
            }
        }
        this.A0.removeView(jVar);
        d0();
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            sg.m1 m1Var = this.m0;
            m1Var.f55031b.remove(uuid);
            m1Var.f55032c.remove(uuid);
            org.telegram.messenger.g0.h3(new sg.t0(m1Var, 1));
        }
        tg.m1 m1Var2 = this.M0;
        cb.c cVar = this.N0;
        m1Var2.setValueOverride(cVar);
        m1Var2.setShowPreview(true);
        float f10 = cVar.get();
        sg.j1 j1Var = this.f12531j1;
        j1Var.f54994c = f10;
        B0(j1Var, null, false);
        if (!this.W1 && (jVar instanceof tg.r1)) {
            va vaVar = ((x9) this).f13102j2;
            ja jaVar = vaVar.X0;
            if (jaVar != null) {
                jaVar.s(null, null, true);
            }
            x9 x9Var = vaVar.f13002v1;
            if (x9Var != null) {
                x9Var.n0();
            }
            la laVar = vaVar.f12944c1;
            if (laVar != null) {
                laVar.setHasRoundVideo(false);
            }
            e7 e7Var = vaVar.K1;
            if (e7Var != null) {
                File file = e7Var.f11907o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    vaVar.K1.f11907o0 = null;
                }
                if (vaVar.K1.f11909p0 != null) {
                    try {
                        new File(vaVar.K1.f11909p0).delete();
                    } catch (Exception unused2) {
                    }
                    vaVar.K1.f11909p0 = null;
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
