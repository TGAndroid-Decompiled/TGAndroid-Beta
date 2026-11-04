package gi;

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
import b8.ke;
import b8.mf;
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
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.n10;
import org.telegram.messenger.re;
import org.telegram.messenger.y10;
import org.telegram.messenger.z10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public abstract class m5 extends rt0 implements ug.f1, ug.h, ug.b1, pt0, ra {
    public final t4 A0;
    public ArrayList A1;
    public final h5 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final i5 D0;
    public tg.q D1;
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
    public li0 J1;
    public float K0;
    public ug.q1 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final ug.l1 N0;
    public boolean N1;
    public final c6.i O0;
    public org.telegram.ui.Components.x9 O1;
    public final int P0;
    public final x5 P1;
    public BigInteger Q0;
    public final y5 Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public final float[] T1;
    public final ug.g1 U0;
    public a5 U1;
    public final ug.d1 V0;
    public boolean V1;
    public final ug.i1 W0;
    public boolean W1;
    public final ImageView X0;
    public boolean X1;
    public final TextView Y0;
    public final int[] Y1;
    public final TextView Z0;
    public ey Z1;
    public final TextView f13196a1;
    public boolean f13197a2;
    public final Paint f13198b1;
    public boolean f13199b2;
    public final Paint f13200c1;
    public boolean c2;
    public float f13201d1;
    public int f13202d2;
    public boolean f13203e1;
    public boolean f13204e2;
    public q1.g f13205f1;
    public int f13206f2;
    public final u4 f13207g1;
    public int f13208g2;
    public final Paint f13209h1;
    public int f13210h2;
    public final Paint f13211i1;
    public boolean f13212i2;
    public final Paint f13213j1;
    public final ug.u0 f13214k0;
    public final tg.h1 k1;
    public final ug.y0 f13215l0;
    public boolean f13216l1;
    public final Bitmap m0;
    public q1.g m1;
    public final tg.k1 f13217n0;
    public float f13218n1;
    public final org.telegram.messenger.q5 f13219o0;
    public final Paint f13220o1;
    public final re f13221p0;
    public final int f13222p1;
    public boolean f13223q0;
    public final e5 f13224q1;
    public lt0 f13225r0;
    public org.telegram.ui.ActionBar.f1 f13226r1;
    public boolean f13227s0;
    public k5 f13228s1;
    public ug.j f13229t0;
    public Rect f13230t1;
    public boolean f13231u0;
    public Runnable f13232u1;
    public int f13233v0;
    public Runnable f13234v1;
    public boolean f13235w0;
    public final ua f13236w1;
    public final boolean f13237x0;
    public AnimatorSet f13238x1;
    public final g5 f13239y0;
    public final v4 f13240y1;
    public final ai.x2 f13241z0;
    public f7 f13242z1;

    public m5(Context context, boolean z10, File file, boolean z11, boolean z12, ua uaVar, Activity activity, final int i3, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, f7 f7Var, int i11, int i12, re reVar, org.telegram.ui.Components.x9 x9Var, org.telegram.ui.ActionBar.e6 e6Var, x5 x5Var, y5 y5Var) {
        super(context, activity);
        Paint paint;
        org.telegram.ui.Components.x9 x9Var2;
        this.I0 = 0;
        this.J0 = -1;
        final x9 x9Var3 = (x9) this;
        c6.i iVar = new c6.i(x9Var3, 29);
        this.O0 = iVar;
        Paint paint2 = new Paint(1);
        this.f13198b1 = paint2;
        Paint paint3 = new Paint(1);
        this.f13200c1 = paint3;
        this.f13209h1 = new Paint(1);
        this.f13211i1 = new Paint(1);
        Paint paint4 = new Paint(1);
        this.f13213j1 = paint4;
        tg.h1 h1Var = new tg.h1(1.0f, 0.016773745f, -1);
        this.k1 = h1Var;
        this.f13220o1 = new Paint(1);
        this.T1 = new float[2];
        this.W1 = false;
        this.Y1 = new int[2];
        new a3.o(x9Var3, 23);
        setDelegate(this);
        this.O1 = x9Var;
        this.P1 = x5Var;
        this.E1 = z10;
        this.F1 = file;
        this.G1 = z11;
        this.H1 = z12;
        this.f13236w1 = uaVar;
        this.B1 = i11;
        this.C1 = i12;
        this.Q1 = y5Var;
        this.f13222p1 = i3;
        e5 e5Var = new e5(0, e6Var);
        this.f13224q1 = e5Var;
        this.f13221p0 = reVar;
        this.f13237x0 = context instanceof BubbleActivity;
        tg.k0 e10 = tg.k0.e(i3);
        e10.i(0, true);
        h1Var.f55186a = e10.c();
        h1Var.f55188c = e10.f55235i;
        org.telegram.messenger.q5 q5Var = new org.telegram.messenger.q5("Paint", true);
        this.f13219o0 = q5Var;
        this.m0 = bitmap;
        this.P0 = i10;
        tg.k1 k1Var = new tg.k1();
        this.f13217n0 = k1Var;
        k1Var.f55239a = new ei.y8(x9Var3, 9);
        View view = new View(context);
        this.H0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        tg.i0 i0Var = new tg.i0(getPaintingSize(), null, i10, x9Var);
        if (f7Var == null || !f7Var.f12744u) {
            paint = paint4;
            x9Var2 = x9Var;
        } else {
            paint = paint4;
            x9Var2 = null;
        }
        g5 g5Var = new g5(x9Var3, context, i0Var, bitmap, bitmap2, x9Var2);
        this.f13239y0 = g5Var;
        g5Var.setDelegate(new android.support.v4.media.c(x9Var3, 27));
        g5Var.setUndoStore(k1Var);
        g5Var.setQueue(q5Var);
        g5Var.setVisibility(4);
        ai.x2 x2Var = new ai.x2(2, context, x9Var3);
        this.f13241z0 = x2Var;
        x2Var.setVisibility(4);
        h5 h5Var = new h5(x9Var3, context, new bb.c(x9Var3, 29));
        this.B0 = h5Var;
        this.f13242z1 = f7Var;
        this.A1 = arrayList;
        if (this.B1 > 0 && this.C1 > 0) {
            E0();
        }
        h5Var.setVisibility(4);
        this.A0 = new t4(x9Var3, context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.C0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, mf.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131232531);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var4 = x9Var3;
                        g5 g5Var2 = x9Var4.f13239y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof tg.g)) {
                            g5Var2.b();
                            x9Var4.U0.setSelectedIndex(1);
                            x9Var4.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        x9Var4.f13217n0.c();
                        return;
                    case 1:
                        x9 x9Var5 = x9Var3;
                        g5 g5Var3 = x9Var5.f13239y0;
                        tg.k1 k1Var2 = x9Var5.f13217n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof tg.g)) {
                                g5Var3.b();
                                x9Var5.U0.setSelectedIndex(1);
                                x9Var5.C((tg.h) tg.h.f55183a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            x9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var6 = x9Var3;
                        ug.j jVar = x9Var6.f13229t0;
                        if (jVar instanceof ug.l2) {
                            org.telegram.messenger.g0.v1(((ug.l2) jVar).getFocusedView());
                        }
                        if (x9Var6.f13197a2) {
                            x9Var6.s0(false);
                        }
                        x9Var6.z0(x9Var6.f13229t0);
                        x9Var6.A0(null, true);
                        return;
                    case 3:
                        x9Var3.A0(null, true);
                        return;
                    default:
                        x9 x9Var7 = x9Var3;
                        if (x9Var7.f13216l1) {
                            x9Var7.F0(false);
                            return;
                        } else if (x9Var7.f13197a2) {
                            x9Var7.s0(true);
                            return;
                        } else if (x9Var7.f13231u0) {
                            x9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var7.f13234v1;
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
        frameLayout.addView(imageView, mf.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(bd.M0(2131747275, null));
        linearLayout.addView(org.telegram.messenger.camera.q.e(context, 2131232532), mf.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, mf.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new ai.t(7));
        frameLayout.addView(linearLayout, mf.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.Y0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(bd.M0(2131747287, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var4 = x9Var3;
                        g5 g5Var2 = x9Var4.f13239y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof tg.g)) {
                            g5Var2.b();
                            x9Var4.U0.setSelectedIndex(1);
                            x9Var4.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        x9Var4.f13217n0.c();
                        return;
                    case 1:
                        x9 x9Var5 = x9Var3;
                        g5 g5Var3 = x9Var5.f13239y0;
                        tg.k1 k1Var2 = x9Var5.f13217n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof tg.g)) {
                                g5Var3.b();
                                x9Var5.U0.setSelectedIndex(1);
                                x9Var5.C((tg.h) tg.h.f55183a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            x9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var6 = x9Var3;
                        ug.j jVar = x9Var6.f13229t0;
                        if (jVar instanceof ug.l2) {
                            org.telegram.messenger.g0.v1(((ug.l2) jVar).getFocusedView());
                        }
                        if (x9Var6.f13197a2) {
                            x9Var6.s0(false);
                        }
                        x9Var6.z0(x9Var6.f13229t0);
                        x9Var6.A0(null, true);
                        return;
                    case 3:
                        x9Var3.A0(null, true);
                        return;
                    default:
                        x9 x9Var7 = x9Var3;
                        if (x9Var7.f13216l1) {
                            x9Var7.F0(false);
                            return;
                        } else if (x9Var7.f13197a2) {
                            x9Var7.s0(true);
                            return;
                        } else if (x9Var7.f13231u0) {
                            x9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var7.f13234v1;
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
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView2, mf.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = m10;
        m10.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        m10.setText(bd.M0(2131752101, null));
        m10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m10.setGravity(16);
        m10.setTextColor(-1);
        m10.setTypeface(org.telegram.messenger.g0.o());
        m10.setTextSize(1, 16.0f);
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var4 = x9Var3;
                        g5 g5Var2 = x9Var4.f13239y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof tg.g)) {
                            g5Var2.b();
                            x9Var4.U0.setSelectedIndex(1);
                            x9Var4.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        x9Var4.f13217n0.c();
                        return;
                    case 1:
                        x9 x9Var5 = x9Var3;
                        g5 g5Var3 = x9Var5.f13239y0;
                        tg.k1 k1Var2 = x9Var5.f13217n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof tg.g)) {
                                g5Var3.b();
                                x9Var5.U0.setSelectedIndex(1);
                                x9Var5.C((tg.h) tg.h.f55183a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            x9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var6 = x9Var3;
                        ug.j jVar = x9Var6.f13229t0;
                        if (jVar instanceof ug.l2) {
                            org.telegram.messenger.g0.v1(((ug.l2) jVar).getFocusedView());
                        }
                        if (x9Var6.f13197a2) {
                            x9Var6.s0(false);
                        }
                        x9Var6.z0(x9Var6.f13229t0);
                        x9Var6.A0(null, true);
                        return;
                    case 3:
                        x9Var3.A0(null, true);
                        return;
                    default:
                        x9 x9Var7 = x9Var3;
                        if (x9Var7.f13216l1) {
                            x9Var7.F0(false);
                            return;
                        } else if (x9Var7.f13197a2) {
                            x9Var7.s0(true);
                            return;
                        } else if (x9Var7.f13231u0) {
                            x9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var7.f13234v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        m10.setAlpha(0.0f);
        m10.setVisibility(8);
        TextView m11 = org.telegram.ui.Cells.f1.m(frameLayout, m10, mf.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f13196a1 = m11;
        m11.setBackground(org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
        m11.setText(bd.M0(2131751355, null));
        m11.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        m11.setGravity(16);
        m11.setTextColor(-1);
        m11.setTypeface(org.telegram.messenger.g0.o());
        m11.setTextSize(1, 16.0f);
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var4 = x9Var3;
                        g5 g5Var2 = x9Var4.f13239y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof tg.g)) {
                            g5Var2.b();
                            x9Var4.U0.setSelectedIndex(1);
                            x9Var4.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        x9Var4.f13217n0.c();
                        return;
                    case 1:
                        x9 x9Var5 = x9Var3;
                        g5 g5Var3 = x9Var5.f13239y0;
                        tg.k1 k1Var2 = x9Var5.f13217n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof tg.g)) {
                                g5Var3.b();
                                x9Var5.U0.setSelectedIndex(1);
                                x9Var5.C((tg.h) tg.h.f55183a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            x9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var6 = x9Var3;
                        ug.j jVar = x9Var6.f13229t0;
                        if (jVar instanceof ug.l2) {
                            org.telegram.messenger.g0.v1(((ug.l2) jVar).getFocusedView());
                        }
                        if (x9Var6.f13197a2) {
                            x9Var6.s0(false);
                        }
                        x9Var6.z0(x9Var6.f13229t0);
                        x9Var6.A0(null, true);
                        return;
                    case 3:
                        x9Var3.A0(null, true);
                        return;
                    default:
                        x9 x9Var7 = x9Var3;
                        if (x9Var7.f13216l1) {
                            x9Var7.F0(false);
                            return;
                        } else if (x9Var7.f13197a2) {
                            x9Var7.s0(true);
                            return;
                        } else if (x9Var7.f13231u0) {
                            x9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var7.f13234v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        m11.setAlpha(0.0f);
        m11.setVisibility(8);
        frameLayout.addView(m11, mf.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        i5 i5Var = new i5(x9Var3, context, e10);
        this.D0 = i5Var;
        i5Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        i5Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(i5Var, mf.e(-1, 104, 80));
        ug.g1 g1Var = new ug.g1(context, (f7Var == null || f7Var.v() || f7Var.f12744u || x9Var == null) ? false : true);
        this.U0 = g1Var;
        g1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        g1Var.setDelegate(this);
        g1Var.setSelectedIndex(1);
        i5Var.addView(g1Var, mf.c(48.0f, -1));
        ug.d1 d1Var = new ug.d1(context);
        this.V0 = d1Var;
        d1Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        d1Var.setVisibility(8);
        d1Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x9 x9Var4 = x9Var3;
                        tg.h1 h1Var2 = x9Var4.k1;
                        x9Var4.C0(h1Var2);
                        tg.k0.e(i3).j(h1Var2.f55188c);
                        return;
                    default:
                        x9Var3.V0.setTypeface(tg.k0.e(i3).f55236j);
                        return;
                }
            }
        });
        d1Var.setAlignment(tg.k0.e(i3).f55234g);
        i5Var.addView(d1Var, mf.c(48.0f, -1));
        t4 t4Var = new t4(x9Var3, context, 0);
        this.E0 = t4Var;
        addView(t4Var, mf.c(-1.0f, -1));
        ug.i1 i1Var = new ug.i1(context);
        this.W0 = i1Var;
        i1Var.setVisibility(8);
        i1Var.setOnItemClickListener(new ai.j6(x9Var3, 11));
        d1Var.setTypefaceListView(i1Var);
        t4Var.addView(i1Var, mf.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(352321535);
        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, e5Var));
        u4 u4Var = new u4(x9Var3, context);
        this.f13207g1 = u4Var;
        u4Var.setVisibility(8);
        u4Var.setColorPalette(tg.k0.e(i3));
        u4Var.setColorListener(new ai.q6(x9Var3, 2));
        i5Var.addView(u4Var, mf.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        ug.u0 u0Var = new ug.u0(context);
        this.f13214k0 = u0Var;
        u0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        u0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        i5Var.addView(u0Var, mf.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        u0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        x9 x9Var4 = x9Var3;
                        g5 g5Var2 = x9Var4.f13239y0;
                        if (g5Var2 != null && (g5Var2.getCurrentBrush() instanceof tg.g)) {
                            g5Var2.b();
                            x9Var4.U0.setSelectedIndex(1);
                            x9Var4.C((tg.h) tg.h.f55183a.get(0));
                            return;
                        }
                        x9Var4.f13217n0.c();
                        return;
                    case 1:
                        x9 x9Var5 = x9Var3;
                        g5 g5Var3 = x9Var5.f13239y0;
                        tg.k1 k1Var2 = x9Var5.f13217n0;
                        if (k1Var2.a()) {
                            if (g5Var3 != null && (g5Var3.getCurrentBrush() instanceof tg.g)) {
                                g5Var3.b();
                                x9Var5.U0.setSelectedIndex(1);
                                x9Var5.C((tg.h) tg.h.f55183a.get(0));
                            }
                            if (g5Var3 != null) {
                                g5Var3.a();
                            }
                            k1Var2.f55241c.clear();
                            k1Var2.f55240b.clear();
                            org.telegram.messenger.g0.h3(new r4.u(k1Var2, 8));
                            x9Var5.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        x9 x9Var6 = x9Var3;
                        ug.j jVar = x9Var6.f13229t0;
                        if (jVar instanceof ug.l2) {
                            org.telegram.messenger.g0.v1(((ug.l2) jVar).getFocusedView());
                        }
                        if (x9Var6.f13197a2) {
                            x9Var6.s0(false);
                        }
                        x9Var6.z0(x9Var6.f13229t0);
                        x9Var6.A0(null, true);
                        return;
                    case 3:
                        x9Var3.A0(null, true);
                        return;
                    default:
                        x9 x9Var7 = x9Var3;
                        if (x9Var7.f13216l1) {
                            x9Var7.F0(false);
                            return;
                        } else if (x9Var7.f13197a2) {
                            x9Var7.s0(true);
                            return;
                        } else if (x9Var7.f13231u0) {
                            x9Var7.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = x9Var7.f13234v1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        ug.y0 y0Var = new ug.y0(context);
        this.f13215l0 = y0Var;
        y0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        y0Var.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        y0Var.setOnClickListener(new ai.h(x9Var3, context, e10, 15));
        i5Var.addView(y0Var, mf.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        ug.l1 l1Var = new ug.l1(context);
        this.N0 = l1Var;
        l1Var.setColorSwatch(h1Var);
        l1Var.setRenderView(g5Var);
        l1Var.setValueOverride(iVar);
        h1Var.f55188c = iVar.get();
        l1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x9 x9Var4 = x9Var3;
                        tg.h1 h1Var2 = x9Var4.k1;
                        x9Var4.C0(h1Var2);
                        tg.k0.e(i3).j(h1Var2.f55188c);
                        return;
                    default:
                        x9Var3.V0.setTypeface(tg.k0.e(i3).f55236j);
                        return;
                }
            }
        });
        addView(l1Var, mf.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F0 = frameLayout2;
        addView(frameLayout2, mf.c(-1.0f, -1));
        Paint paint5 = paint;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        B0(h1Var, null, false);
        C((tg.h) tg.h.f55183a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f22608q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        }
        this.f13240y1 = new v4(x9Var3, uaVar, new ai.o1(13, x9Var3, uaVar));
        i2.f12950z1 = 1;
    }

    public static void D0(ug.l2 l2Var, int i3) {
        int i10;
        l2Var.setAlign(i3);
        int i11 = 2;
        if (i3 != 1) {
            if (i3 != 2) {
                i10 = 19;
            } else {
                i10 = 21;
            }
        } else {
            i10 = 17;
        }
        l2Var.getEditText().setGravity(i10);
        if (i3 != 1) {
            if (i3 == 2 ? !bd.f21784a0 : bd.f21784a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        l2Var.getEditText().setTextAlignment(i11);
    }

    public static void X(x9 x9Var, tg.k0 k0Var, Integer num) {
        k0Var.h(num.intValue(), true);
        k0Var.g();
        x9Var.setNewColor(num.intValue());
        x9Var.f13207g1.setSelectedColorIndex(k0Var.d());
        x9Var.D1 = null;
    }

    public static void Y(x9 x9Var, Integer num) {
        x9Var.setNewColor(num.intValue());
        x9Var.F0(false);
    }

    public ViewGroup getBarView() {
        if (this.I0 == 2) {
            return this.V0;
        }
        return this.U0;
    }

    private int getFrameRotation() {
        int i3 = this.P0;
        if (i3 != 90) {
            if (i3 != 180) {
                if (i3 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private lt0 getPaintingSize() {
        lt0 lt0Var = this.f13225r0;
        if (lt0Var != null) {
            return lt0Var;
        }
        lt0 lt0Var2 = new lt0(1080.0f, 1920.0f);
        this.f13225r0 = lt0Var2;
        return lt0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i3 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i3 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i3);
                if (childAt instanceof ug.d2) {
                    ImageReceiver imageReceiver = ((ug.d2) childAt).f55948y0;
                    ch0 B = imageReceiver.B();
                    org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                    boolean z11 = !z10;
                    imageReceiver.f21274v0 = z11;
                    imageReceiver.f21272u0 = z11;
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
                i3++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i3) {
        tg.h1 h1Var = this.k1;
        int i10 = h1Var.f55186a;
        h1Var.f55186a = i3;
        B0(h1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new h4(this, i10, i3, 0));
        duration.start();
    }

    private void setTextType(int i3) {
        this.f13233v0 = i3;
        ug.j jVar = this.f13229t0;
        if (jVar instanceof ug.l2) {
            ((ug.l2) jVar).setType(i3);
        }
        tg.k0 e10 = tg.k0.e(this.f13222p1);
        e10.h = i3;
        e10.f55229a.edit().putInt("text_type", i3).apply();
        this.V0.e(i3, true);
    }

    private void setupTabsLayout(Context context) {
        y4 y4Var = new y4(this, context);
        this.G0 = y4Var;
        y4Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, mf.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(bd.M0(2131747285, null).toUpperCase());
        TextView textView2 = this.R0;
        int i3 = org.telegram.ui.ActionBar.k6.f27972i6;
        e5 e5Var = this.f13224q1;
        org.telegram.ui.ActionBar.r6.R(textView2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i3, e5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i3), e5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f12389b;

            {
                this.f12389b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f12389b;
                        if (m5Var.f13231u0) {
                            m5Var.A0(null, true);
                            return;
                        } else {
                            m5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f12389b.x0();
                        return;
                    default:
                        m5 m5Var2 = this.f12389b;
                        m5Var2.O0(2);
                        if (!(m5Var2.f13229t0 instanceof ug.l2)) {
                            m5Var2.V1 = true;
                            m5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.G0.addView(this.R0, mf.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(bd.M0(2131747284, null).toUpperCase());
        org.telegram.ui.ActionBar.r6.R(this.S0, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i3, e5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i3), e5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f12389b;

            {
                this.f12389b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f12389b;
                        if (m5Var.f13231u0) {
                            m5Var.A0(null, true);
                            return;
                        } else {
                            m5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f12389b.x0();
                        return;
                    default:
                        m5 m5Var2 = this.f12389b;
                        m5Var2.O0(2);
                        if (!(m5Var2.f13229t0 instanceof ug.l2)) {
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
        this.G0.addView(this.S0, mf.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(bd.M0(2131747283, null).toUpperCase());
        org.telegram.ui.ActionBar.r6.R(this.T0, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i3, e5Var), 7, -1), null, org.telegram.ui.ActionBar.r6.N(i3), e5Var);
        this.T0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(org.telegram.messenger.g0.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        this.T0.setOnClickListener(new View.OnClickListener(this) {
            public final m5 f12389b;

            {
                this.f12389b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m5 m5Var = this.f12389b;
                        if (m5Var.f13231u0) {
                            m5Var.A0(null, true);
                            return;
                        } else {
                            m5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f12389b.x0();
                        return;
                    default:
                        m5 m5Var2 = this.f12389b;
                        m5Var2.O0(2);
                        if (!(m5Var2.f13229t0 instanceof ug.l2)) {
                            m5Var2.V1 = true;
                            m5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.G0.addView(this.T0, mf.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
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

    public final boolean A0(ug.j jVar, boolean z10) {
        boolean z11;
        fb fbVar;
        fb fbVar2;
        li0 li0Var;
        int i3;
        boolean z12 = jVar instanceof ug.l2;
        int i10 = 2;
        int i11 = 0;
        if (z12 && (((i3 = this.J0) == -1 && this.I0 != 2) || (i3 != -1 && i3 != 2))) {
            ValueAnimator valueAnimator = this.L0;
            if (valueAnimator != null && i3 != 2) {
                valueAnimator.cancel();
            }
            if (this.f13216l1) {
                F0(false);
            }
            O0(2);
        }
        boolean z13 = true;
        if (z12 && z10) {
            ug.l2 l2Var = (ug.l2) jVar;
            int gravity = l2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            ug.d1 d1Var = this.V0;
            d1Var.setAlignment(i10);
            tg.b0 typeface = l2Var.getTypeface();
            if (typeface != null) {
                d1Var.setTypeface(typeface.f55128a);
            }
            d1Var.e(l2Var.getType(), true);
            this.E0.invalidate();
        }
        ug.j jVar2 = this.f13229t0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f56075e0) {
                    if (jVar instanceof ug.m0) {
                        ug.m0 m0Var = (ug.m0) jVar;
                        m0Var.setType((m0Var.getType() + 1) % m0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof ug.m2) {
                        ug.m2 m2Var = (ug.m2) jVar;
                        m2Var.setType((m2Var.getType() + 1) % m2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof ug.j0) {
                        ug.j0 j0Var = (ug.j0) jVar;
                        ug.h0 h0Var = j0Var.f56093r0;
                        if (h0Var.e()) {
                            if (h0Var.getPreviewType() == 0) {
                                i11 = 1;
                            }
                            h0Var.setPreviewType(i11);
                            return true;
                        }
                        j0Var.setType(j0Var.getNextType());
                        return true;
                    } else if (!this.f13231u0) {
                        if (jVar instanceof ug.l2) {
                            this.f13235w0 = true;
                            o0();
                            return true;
                        } else if (jVar instanceof ug.q1) {
                            ug.q1 q1Var = (ug.q1) jVar;
                            if (this.M1 && this.K1 == jVar) {
                                q1Var.q(true);
                                return true;
                            }
                            ug.q1 q1Var2 = this.K1;
                            if (q1Var2 != null && q1Var2 != q1Var && (li0Var = this.J1) != null) {
                                li0Var.animate().alpha(0.0f).setListener(new ai.e1(li0Var, 22));
                                this.J1 = null;
                                this.M1 = false;
                                this.L1 = 0.0f;
                            }
                            if (this.J1 == null) {
                                li0 li0Var2 = new li0(2, this.f13222p1, getContext(), LaunchActivity.Q(), new ei.q2(6, new ei.b()));
                                this.J1 = li0Var2;
                                org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(this.O1, li0Var2, 0, false);
                                this.J1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                                this.f13236w1.addView(this.J1, mf.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.o(-16777216, 120));
                                this.J1.setDelegate(new ke(this, baVar, paint));
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
                    } else if (jVar2 instanceof ug.l2) {
                        org.telegram.messenger.g0.K3(((ug.l2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.f56085n0, false);
            ug.j jVar3 = this.f13229t0;
            if (jVar3 instanceof ug.l2) {
                ug.l2 l2Var2 = (ug.l2) jVar3;
                ug.k2 k2Var = l2Var2.f56141r0;
                k2Var.clearFocus();
                k2Var.setEnabled(false);
                k2Var.setClickable(false);
                l2Var2.m();
                if (!z12) {
                    this.f13231u0 = false;
                    org.telegram.messenger.g0.v1(((ug.l2) this.f13229t0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof ug.r1) && (fbVar2 = ((x9) this).f13872k2.f13700a1) != null) {
                fbVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        ug.j jVar4 = this.f13229t0;
        this.f13229t0 = jVar;
        if ((jVar4 instanceof ug.l2) && TextUtils.isEmpty(((ug.l2) jVar4).getText())) {
            z0(jVar4);
        }
        ug.j jVar5 = this.f13229t0;
        if (jVar4 != jVar5 && (jVar5 instanceof ug.r1) && (fbVar = ((x9) this).f13872k2.f13700a1) != null) {
            fbVar.l(true);
        }
        ug.j jVar6 = this.f13229t0;
        c6.i iVar = this.O0;
        tg.h1 h1Var = this.k1;
        ug.l1 l1Var = this.N0;
        if (jVar6 != null) {
            t4 t4Var = this.A0;
            jVar6.f56085n0 = t4Var;
            jVar6.l(t4Var, true);
            ug.j jVar7 = this.f13229t0;
            if (jVar7 instanceof ug.l2) {
                ug.l2 l2Var3 = (ug.l2) jVar7;
                l2Var3.getSwatch().f55188c = h1Var.f55188c;
                l2Var3.A0 = false;
                C0(l2Var3.getSwatch());
                l1Var.setValueOverride(new w4(l2Var3, (int) (this.f13225r0.f35877a / 9.0f), 0));
                l1Var.setShowPreview(false);
            } else {
                l1Var.setValueOverride(iVar);
                l1Var.setShowPreview(true);
                h1Var.f55188c = iVar.get();
                B0(h1Var, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.L0;
            if (valueAnimator2 != null && this.J0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.f13216l1) {
                F0(false);
            }
            O0(0);
            l1Var.setValueOverride(iVar);
            l1Var.setShowPreview(true);
            h1Var.f55188c = iVar.get();
            B0(h1Var, null, false);
            z13 = z11;
        }
        R0();
        return z13;
    }

    public final void B0(tg.h1 h1Var, Integer num, boolean z10) {
        tg.h1 h1Var2 = this.k1;
        if (h1Var2 != h1Var) {
            h1Var2.f55186a = h1Var.f55186a;
            h1Var2.f55187b = h1Var.f55187b;
            h1Var2.f55188c = h1Var.f55188c;
            int i3 = this.f13222p1;
            tg.k0.e(i3).h(h1Var.f55186a, true);
            tg.k0.e(i3).j(h1Var.f55188c);
        }
        int i10 = h1Var.f55186a;
        g5 g5Var = this.f13239y0;
        g5Var.setColor(i10);
        g5Var.setBrushSize(h1Var.f55188c);
        int i11 = h1Var2.f55186a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new b4(this, num, i11, 0));
            duration.start();
        } else {
            i5 i5Var = this.D0;
            if (i5Var != null) {
                i5Var.invalidate();
            }
        }
        ug.j jVar = this.f13229t0;
        if (jVar instanceof ug.l2) {
            ((ug.l2) jVar).setSwatch(new tg.h1(h1Var.f55187b, h1Var.f55188c, h1Var.f55186a));
        } else if (z10 && (jVar instanceof ug.m0)) {
            ((ug.m0) jVar).setColor(h1Var.f55186a);
            ((ug.m0) this.f13229t0).setType(3);
        } else if (z10 && (jVar instanceof ug.m2)) {
            ((ug.m2) jVar).setColor(h1Var.f55186a);
            ((ug.m2) this.f13229t0).setType(3);
        } else if (z10 && (jVar instanceof ug.j0)) {
            ((ug.j0) jVar).setColor(h1Var.f55186a);
            ((ug.j0) this.f13229t0).setType(0);
        }
    }

    @Override
    public final void C(tg.h hVar) {
        boolean z10 = hVar instanceof tg.b;
        ug.l1 l1Var = this.N0;
        if (!z10 && !(hVar instanceof tg.d)) {
            l1Var.b(0.05f, 1.0f);
        } else {
            l1Var.b(0.4f, 1.75f);
        }
        l1Var.setDrawCenter(!(hVar instanceof tg.g));
        g5 g5Var = this.f13239y0;
        if (g5Var.getCurrentBrush() instanceof tg.g) {
            this.M0 = true;
        }
        g5Var.setBrush(hVar);
        tg.h1 h1Var = this.k1;
        int i3 = h1Var.f55186a;
        h1Var.f55186a = tg.k0.e(this.f13222p1).c();
        h1Var.f55188c = this.O0.get();
        B0(h1Var, Integer.valueOf(i3), false);
        this.f13241z0.invalidate();
    }

    public final void C0(tg.h1 h1Var) {
        B0(h1Var, null, false);
    }

    @Override
    public final void D() {
        M0(true);
    }

    public final void E0() {
        int i3;
        float f10;
        org.telegram.messenger.f6[] f6VarArr;
        ug.j jVar;
        ug.j jVar2;
        ArrayList arrayList = this.A1;
        if (arrayList != null) {
            f7 f7Var = this.f13242z1;
            this.f13242z1 = null;
            this.A1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                ?? r14 = this.B0;
                if (i10 < size) {
                    z10 z10Var = (z10) arrayList.get(i10);
                    byte b10 = z10Var.f26703a;
                    if (b10 == 0) {
                        d5 k02 = k0(z10Var.C, z10Var.B);
                        if ((2 & z10Var.f26704b) != 0) {
                            k02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                        layoutParams.width = z10Var.f26717q;
                        layoutParams.height = z10Var.f26718r;
                        i3 = size;
                        jVar2 = k02;
                    } else if (b10 == 1) {
                        ug.l2 l02 = l0(z10);
                        l02.setType(z10Var.f26704b);
                        l02.setTypeface(z10Var.f26714n);
                        l02.setBaseFontSize(z10Var.f26713m);
                        SpannableString spannableString = new SpannableString(z10Var.f26710j);
                        ?? r42 = z10Var.f26711k;
                        int size2 = r42.size();
                        for (int i11 = z10; i11 < size2; i11++) {
                            y10 y10Var = (y10) r42.get(i11);
                            org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(y10Var.document_id, 1.0f, l02.getFontMetricsInt());
                            int i12 = y10Var.offset;
                            spannableString.setSpan(p5Var, i12, y10Var.length + i12, 33);
                            size = size;
                        }
                        i3 = size;
                        CharSequence m10 = org.telegram.messenger.i6.m(spannableString, l02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (f6VarArr = (org.telegram.messenger.f6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.f6.class)) != null) {
                            for (org.telegram.messenger.f6 f6Var : f6VarArr) {
                                f6Var.f22453b = 0.85f;
                            }
                        }
                        l02.setText(m10);
                        D0(l02, z10Var.f26716p);
                        tg.h1 swatch = l02.getSwatch();
                        swatch.f55186a = z10Var.f26712l;
                        l02.setSwatch(swatch);
                        jVar2 = l02;
                    } else {
                        i3 = size;
                        if (b10 == 2) {
                            ug.n1 h02 = h0(z10Var.f26710j, false);
                            h02.H0 = z10Var.f26721u;
                            h02.C0 = false;
                            if ((2 & z10Var.f26704b) != 0) {
                                h02.r(false);
                            }
                            if ((z10Var.f26704b & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = z10Var.f26717q;
                            layoutParams2.height = z10Var.f26718r;
                            jVar2 = h02;
                        } else {
                            if (b10 == 6) {
                                ArrayList arrayList2 = f7Var.v;
                                boolean z11 = f7Var.K;
                                this.V1 = true;
                                f10 = 1.0f;
                                ug.j c5Var = new c5(this, getContext(), c0(), arrayList2, this.O1, z11, this.P1);
                                c5Var.setDelegate(this);
                                r14.addView(c5Var);
                                d0();
                                jVar = c5Var;
                                if (z10Var.f26717q > 0) {
                                    jVar = c5Var;
                                    if (z10Var.f26718r > 0) {
                                        ViewGroup.LayoutParams layoutParams3 = c5Var.getLayoutParams();
                                        layoutParams3.width = z10Var.f26717q;
                                        layoutParams3.height = z10Var.f26718r;
                                        jVar = c5Var;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                                if (b10 == 3) {
                                    ug.m0 g02 = g0(z10Var.N, z10Var.M);
                                    int i13 = z10Var.f26712l;
                                    if (i13 != 0) {
                                        g02.setColor(i13);
                                    }
                                    g02.setType(z10Var.f26704b);
                                    jVar = g02;
                                } else if (b10 == 8) {
                                    sb sbVar = z10Var.O;
                                    if (sbVar != null) {
                                        ug.m2 m0 = m0(sbVar);
                                        int i14 = z10Var.f26712l;
                                        if (i14 != 0) {
                                            m0.setColor(i14);
                                        }
                                        m0.setType(z10Var.f26704b);
                                        jVar = m0;
                                    } else {
                                        i10++;
                                        size = i3;
                                        z10 = false;
                                    }
                                } else if (b10 == 7) {
                                    ug.j0 f02 = f0(z10Var.W);
                                    ug.h0 h0Var = f02.f56093r0;
                                    int i15 = z10Var.f26712l;
                                    if (i15 != 0) {
                                        f02.setColor(i15);
                                    }
                                    boolean e10 = h0Var.e();
                                    int i16 = h0Var.h;
                                    int i17 = h0Var.f56033f;
                                    if (e10) {
                                        h0Var.setPreviewType(z10Var.f26704b);
                                    }
                                    byte b11 = z10Var.f26704b;
                                    if (b11 == -1) {
                                        f02.setType(3);
                                        h0Var.d();
                                        z10Var.f26717q = ((int) Math.ceil(h0Var.f56027b0)) + i17 + i17;
                                        z10Var.f26718r = ((int) Math.ceil(h0Var.f56029c0)) + i16 + i16;
                                        PointF position = f02.getPosition();
                                        position.y = (this.C1 * 0.3f) + position.y;
                                        f02.setPosition(position);
                                        i10++;
                                        size = i3;
                                        z10 = false;
                                    } else {
                                        f02.setType(b11);
                                        jVar = f02;
                                    }
                                } else if (b10 == 4) {
                                    ug.q1 i02 = i0(false);
                                    i02.s(dh.n0.d(z10Var.M.reaction), false);
                                    if (z10Var.M.flipped) {
                                        i02.r(false);
                                    }
                                    jVar = i02;
                                    if (z10Var.M.dark) {
                                        i02.q(false);
                                        jVar = i02;
                                    }
                                } else {
                                    if (b10 == 5 && f7Var.f12733o0 != null) {
                                        ug.r1 j02 = j0(f7Var.f12735p0, false);
                                        va vaVar = ((x9) this).f13872k2;
                                        ja jaVar = vaVar.Y0;
                                        if (jaVar != null) {
                                            jaVar.f13967x = j02;
                                            m51 m51Var = jaVar.f13969y;
                                            if (m51Var != null) {
                                                m51Var.A0(j02.f56240v0);
                                            }
                                        }
                                        la laVar = vaVar.f13710d1;
                                        if (laVar != null) {
                                            laVar.setHasRoundVideo(true);
                                        }
                                        jVar = j02;
                                        if ((z10Var.f26704b & 2) != 0) {
                                            boolean z12 = !j02.f56237s0;
                                            j02.f56237s0 = z12;
                                            j02.f56238t0.f(z12, true);
                                            j02.invalidate();
                                            jVar = j02;
                                        }
                                    }
                                    i10++;
                                    size = i3;
                                    z10 = false;
                                }
                            }
                            jVar.setX((z10Var.f26705c * this.B1) - (((f10 - z10Var.v) * z10Var.f26717q) / 2.0f));
                            jVar.setY((z10Var.d * this.C1) - (((f10 - z10Var.v) * z10Var.f26718r) / 2.0f));
                            jVar.setPosition(new PointF((z10Var.f26717q / 2.0f) + jVar.getX(), (z10Var.f26718r / 2.0f) + jVar.getY()));
                            jVar.setScale(z10Var.v);
                            jVar.setRotation((float) (((-z10Var.f26706e) / 3.141592653589793d) * 180.0d));
                            i10++;
                            size = i3;
                            z10 = false;
                        }
                    }
                    f10 = 1.0f;
                    jVar = jVar2;
                    jVar.setX((z10Var.f26705c * this.B1) - (((f10 - z10Var.v) * z10Var.f26717q) / 2.0f));
                    jVar.setY((z10Var.d * this.C1) - (((f10 - z10Var.v) * z10Var.f26718r) / 2.0f));
                    jVar.setPosition(new PointF((z10Var.f26717q / 2.0f) + jVar.getX(), (z10Var.f26718r / 2.0f) + jVar.getY()));
                    jVar.setScale(z10Var.v);
                    jVar.setRotation((float) (((-z10Var.f26706e) / 3.141592653589793d) * 180.0d));
                    i10++;
                    size = i3;
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
        if (this.f13216l1 != z10) {
            this.f13216l1 = z10;
            q1.g gVar = this.m1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            q1.g gVar2 = new q1.g(new q1.f(f10));
            this.m1 = gVar2;
            q1.h hVar = new q1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f53661i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f53653m = hVar;
            if (!this.f13240y1.c() && this.f13202d2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.D0.getTranslationY();
            final float alpha = this.f13215l0.getAlpha();
            final ViewGroup barView = getBarView();
            this.m1.b(new q1.d() {
                @Override
                public final void a(q1.g gVar3, float f12, float f13) {
                    float f14;
                    int i3;
                    m5 m5Var = m5.this;
                    i5 i5Var = m5Var.D0;
                    float f15 = f12 / 1000.0f;
                    m5Var.f13218n1 = f15;
                    float f16 = 1.0f;
                    float f17 = ((1.0f - f15) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY((Math.min(m5Var.f13218n1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(m5Var.f13218n1, 0.25f) / 0.25f));
                    u4 u4Var = m5Var.f13207g1;
                    float f18 = m5Var.f13218n1;
                    boolean z12 = z10;
                    u4Var.B1(z12, f18);
                    ug.y0 y0Var = m5Var.f13215l0;
                    y0Var.setProgress(m5Var.f13218n1);
                    ug.u0 u0Var = m5Var.f13214k0;
                    u0Var.setProgress(m5Var.f13218n1);
                    m5Var.G0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * m5Var.f13218n1);
                    AnimatorSet animatorSet = m5Var.f13238x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f19 = m5Var.f13218n1;
                        if (!z12) {
                            f19 = 1.0f - f19;
                        }
                        if (z12) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        float f20 = alpha;
                        y0Var.setAlpha(org.telegram.messenger.g0.T1(f20, f14, f19));
                        if (!z12) {
                            f16 = 0.0f;
                        }
                        u0Var.setAlpha(org.telegram.messenger.g0.T1(f20, f16, f19));
                        float L = org.telegram.messenger.g0.L(39.0f) * f19;
                        if (z12) {
                            i3 = 1;
                        } else {
                            i3 = -1;
                        }
                        i5Var.setTranslationY(translationY - (L * i3));
                    }
                    i5Var.invalidate();
                    if (view == m5Var.V0) {
                        m5Var.E0.invalidate();
                    }
                }
            });
            this.m1.a(new d4(this, z10, 0));
            this.m1.h();
            if (z10) {
                u4 u4Var = this.f13207g1;
                u4Var.setVisibility(0);
                u4Var.setSelectedColorIndex(tg.k0.e(this.f13222p1).d());
            }
        }
    }

    public final void G0(int i3) {
        boolean z10;
        int i10;
        ug.d1 d1Var = this.V0;
        v4 v4Var = this.f13240y1;
        if (i3 == 1) {
            ey eyVar = this.Z1;
            if (eyVar != null && eyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ey eyVar2 = this.Z1;
            ua uaVar = this.f13236w1;
            if (eyVar2 != null && eyVar2.f33529d1 != h10.f22829t0) {
                uaVar.removeView(eyVar2);
                this.Z1 = null;
            }
            if (this.Z1 == null) {
                ey eyVar3 = new ey(null, true, false, false, getContext(), false, null, null, true, this.f13224q1, false, false);
                this.Z1 = eyVar3;
                eyVar3.f33598y2 = false;
                eyVar3.V0 = true;
                eyVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.Z1.setForseMultiwindowLayout(true);
                }
                this.Z1.setDelegate(new f5(this));
                uaVar.addView(this.Z1);
            }
            this.Z1.setVisibility(0);
            this.f13197a2 = true;
            ey eyVar4 = this.Z1;
            if (this.f13206f2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f13206f2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f13206f2 = hp.d1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f13208g2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f13208g2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f13208g2 = hp.d1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                i10 = this.f13208g2;
            } else {
                i10 = this.f13206f2;
            }
            int paddingUnderContainer = uaVar.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) eyVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            eyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                ug.j jVar = this.f13229t0;
                if (jVar instanceof ug.l2) {
                    org.telegram.messenger.g0.v1(((ug.l2) jVar).getEditText());
                }
            }
            this.f13202d2 = paddingUnderContainer;
            v4Var.a();
            requestLayout();
            hg emojiButton = d1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(fg.d, true);
            }
            if (!z10) {
                if (this.f13199b2) {
                    this.f13204e2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f13202d2, 0.0f);
                    ofFloat.addUpdateListener(new e4(this, 1));
                    ofFloat.addListener(new x4(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                    ofFloat.start();
                }
            }
        } else {
            hg emojiButton2 = d1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(fg.f33793e, true);
            }
            ey eyVar5 = this.Z1;
            if (eyVar5 != null) {
                this.f13197a2 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    eyVar5.setVisibility(8);
                }
            }
            if (i3 == 0) {
                this.f13202d2 = 0;
                v4Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(ug.j0 j0Var) {
        m7 m7Var = new m7(getContext(), this.f13224q1, this.Q1, new ai.o1(15, this, j0Var));
        if (j0Var != null) {
            ug.g0 g0Var = j0Var.f56097v0;
            m7Var.V1 = true;
            org.telegram.ui.Cells.k3 k3Var = m7Var.S1;
            org.telegram.ui.Cells.k3 k3Var2 = m7Var.R1;
            if (g0Var != null) {
                m7Var.Z1 = g0Var.d;
                m7Var.f13254a2 = false;
                k3Var2.setText(g0Var.f56010c);
                k3Var.setText(g0Var.f56009b);
                m7Var.f13258f2 = !TextUtils.isEmpty(g0Var.f56009b);
                m7Var.f13259g2 = g0Var.f56012f;
                m7Var.f13260h2 = g0Var.f56011e;
            } else {
                k3Var2.setText("");
                k3Var.setText("");
                m7Var.f13259g2 = true;
                m7Var.f13260h2 = false;
            }
            String M0 = bd.M0(2131744651, null);
            d dVar = m7Var.U1;
            dVar.i(M0, false, true);
            ci.j0 j0Var2 = m7Var.Q1;
            if (j0Var2 != null) {
                j0Var2.O(false);
            }
            dVar.setEnabled(m7Var.f1(k3Var2.getText().toString()));
            m7Var.V1 = false;
        }
        m7Var.setOnDismissListener(new o4(this, 1));
        m7Var.show();
        w0(true);
    }

    public final void I0(ug.m0 m0Var, n10 n10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        bi biVar = new bi(getContext(), new b5(this, n10Var), false, true, false, this.f13224q1);
        biVar.U3 = new nb.a(9);
        ah ahVar = biVar.f32272s3;
        if (m0Var != null && (messageMedia = m0Var.f56156v0) != null && (geoPoint = messageMedia.geo) != null) {
            biVar.f32285v4 = new double[]{geoPoint.lat, geoPoint._long};
            biVar.G1 = true;
            ahVar.setVisibility(8);
        } else if (this.E1) {
            biVar.f32277t4 = this.G1;
            biVar.f32281u4 = this.F1;
            biVar.G1 = true;
            ahVar.setVisibility(8);
        } else {
            biVar.G1 = true;
            ahVar.setVisibility(8);
        }
        biVar.setOnDismissListener(new o4(this, 0));
        biVar.e1();
        biVar.show();
    }

    public final void J0(ug.j jVar) {
        if (jVar instanceof ug.t0) {
            org.telegram.ui.ActionBar.f1 f1Var = this.f13226r1;
            if (f1Var != null && f1Var.isShowing()) {
                this.f13226r1.d(true);
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
        int i3 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i3;
        int i10 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i10;
        K0(new i4(this, jVar, 1), this, 51, i3, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    @Override
    public final void K(int i3, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i3 > org.telegram.messenger.g0.L(50.0f) && this.f13199b2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.f13208g2 = i3;
                hp.d1().edit().putInt("kbd_height_land3", this.f13208g2).commit();
            } else {
                this.f13206f2 = i3;
                hp.d1().edit().putInt("kbd_height", this.f13206f2).commit();
            }
        }
        boolean z13 = this.f13197a2;
        v4 v4Var = this.f13240y1;
        if (z13) {
            if (z10) {
                i10 = this.f13208g2;
            } else {
                i10 = this.f13206f2;
            }
            int paddingUnderContainer = this.f13236w1.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.f22608q.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.Z1.setLayoutParams(layoutParams);
                this.f13202d2 = layoutParams.height;
                v4Var.a();
                requestLayout();
            }
        }
        if (this.f13210h2 == i3 && this.f13212i2 == z10) {
            return;
        }
        this.f13210h2 = i3;
        this.f13212i2 = z10;
        boolean z14 = this.f13199b2;
        ug.j jVar = this.f13229t0;
        if (jVar instanceof ug.l2) {
            if (((ug.l2) jVar).getEditText().isFocused() && v4Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f13199b2 = z12;
        } else {
            this.f13199b2 = false;
        }
        if (this.f13199b2 && this.f13197a2) {
            G0(0);
        }
        if (this.f13202d2 != 0 && !(z11 = this.f13199b2) && z11 != z14 && !this.f13197a2) {
            this.f13202d2 = 0;
            v4Var.a();
            requestLayout();
        }
        R0();
        if (z14 && !this.f13199b2 && this.f13202d2 > 0 && this.f13204e2) {
            this.f13204e2 = false;
        }
        P0();
    }

    public final void K0(Runnable runnable, m5 m5Var, int i3, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.f1 f1Var = this.f13226r1;
        if (f1Var != null && f1Var.isShowing()) {
            this.f13226r1.d(true);
            return;
        }
        if (this.f13228s1 == null) {
            this.f13230t1 = new Rect();
            k5 k5Var = new k5(this, getContext());
            this.f13228s1 = k5Var;
            k5Var.setAnimationEnabled(true);
            this.f13228s1.setOnTouchListener(new k4(0, this));
            this.f13228s1.setDispatchKeyEventListener(new l4(this));
            this.f13228s1.setShownFromBottom(true);
        }
        k5 k5Var2 = this.f13228s1;
        k5Var2.f13034a0 = z10;
        k5Var2.d();
        runnable.run();
        if (this.f13226r1 == null) {
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(this.f13228s1, -2, -2);
            this.f13226r1 = f1Var2;
            f1Var2.f27493b = true;
            f1Var2.setAnimationStyle(2131755191);
            this.f13226r1.setOutsideTouchable(true);
            this.f13226r1.setClippingEnabled(true);
            this.f13226r1.setInputMethodMode(2);
            this.f13226r1.setSoftInputMode(0);
            this.f13226r1.getContentView().setFocusableInTouchMode(true);
            this.f13226r1.setOnDismissListener(new m4(0, this));
        }
        this.f13228s1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE));
        this.f13226r1.setFocusable(true);
        int measuredWidth = i10 - (this.f13228s1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.f13228s1.getMeasuredHeight();
        this.f13226r1.showAtLocation(m5Var, i3, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.f1.i(this.f13228s1);
        Drawable mutate = getContext().getResources().getDrawable(2131232564).mutate();
        if (z10) {
            k5 k5Var3 = this.f13228s1;
            k5Var3.setBackgroundDrawable(new org.telegram.ui.Components.aa(new org.telegram.ui.Components.ba(this.O1, k5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
            return;
        }
        this.f13228s1.setBackgroundDrawable(mutate);
        this.f13228s1.setBackgroundColor(-14145495);
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
                    this.f13236w1.invalidate();
                    float f11 = this.L1;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.J1.setTransitionProgress(this.L1);
                    ofFloat.addUpdateListener(new e4(this, 2));
                    ofFloat.addListener(new dh.x(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(xq.f40453g);
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
        if (this.f13203e1 != z10) {
            this.f13203e1 = z10;
            q1.g gVar = this.f13205f1;
            if (gVar != null) {
                gVar.d();
            }
            float f11 = 1000.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            q1.g gVar2 = new q1.g(new q1.f(f10));
            this.f13205f1 = gVar2;
            q1.h hVar = new q1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f53661i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f53653m = hVar;
            if (z10) {
                ug.i1 i1Var = this.W0;
                i1Var.setAlpha(0.0f);
                i1Var.setVisibility(0);
            }
            this.f13205f1.b(new ei.a8(1, this));
            this.f13205f1.a(new d4(this, z10, 1));
            this.f13205f1.h();
        }
    }

    public final PointF N0(ug.j jVar) {
        float f10;
        float f11;
        float f12 = 200.0f;
        re reVar = this.f13221p0;
        if (reVar != null) {
            f12 = 200.0f / reVar.f25112c;
        }
        float f13 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = 100.0f;
        if (reVar != null) {
            f14 = 100.0f / reVar.f25112c;
        }
        PointF c02 = c0();
        int i3 = 0;
        while (i3 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                h5 h5Var = this.B0;
                if (i10 >= h5Var.getChildCount()) {
                    break;
                }
                View childAt = h5Var.getChildAt(i10);
                if (!(childAt instanceof ug.j) || (childAt instanceof ug.t0)) {
                    f10 = f13;
                    f11 = f14;
                } else {
                    PointF position2 = ((ug.j) childAt).getPosition();
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
            i3++;
            c02 = new PointF(c02.x + f12, c02.y + f12);
            f13 = f15;
            f14 = f16;
        }
        return c02;
    }

    public final void O0(int i3) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.I0 != i3 && this.J0 != i3) {
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
            this.J0 = i3;
            if (i3 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i3 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i11 = this.f13222p1;
            tg.k0 e10 = tg.k0.e(i11);
            if (i3 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f55238l != z10) {
                e10.f55238l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f55229a.getInt("brush", 0), false);
                }
            }
            int c2 = tg.k0.e(i11).c();
            tg.h1 h1Var = this.k1;
            h1Var.f55186a = c2;
            B0(h1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.L0 = duration;
            duration.setInterpolator(xq.f40452f);
            this.L0.addUpdateListener(new ei.j3(this, viewGroup, viewGroup2, 1));
            this.L0.addListener(new z4(this, viewGroup, viewGroup2, i3, 0));
            this.L0.start();
        }
    }

    public final void P0() {
        boolean z10;
        v4 v4Var = this.f13240y1;
        ug.d1 d1Var = this.V0;
        if (d1Var != null) {
            if (v4Var.c()) {
                d1Var.a(2131231512);
            } else if (this.f13197a2) {
                d1Var.a(2131231504);
            } else {
                d1Var.a(2131232042);
            }
        }
        if (!v4Var.c() && !this.f13197a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        org.telegram.messenger.g0.U3(1.0f, this.Y0, z11, false);
        org.telegram.messenger.g0.U3(1.0f, this.X0, z11, false);
        org.telegram.messenger.g0.U3(1.0f, this.f13196a1, z10, false);
        org.telegram.messenger.g0.U3(1.0f, this.Z0, z10, false);
    }

    @Override
    public final int Q() {
        return this.f13240y1.f13367l - this.f13236w1.getBottomPadding2();
    }

    public final void Q0() {
        float f10;
        ug.j jVar;
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.f13239y0.getParent();
        if (view == null) {
            return;
        }
        v4 v4Var = this.f13240y1;
        if (((v4Var.c() && !v4Var.d) || this.f13202d2 > 0) && (jVar = this.f13229t0) != null) {
            f10 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f10);
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(xq.h);
        this.S1.start();
    }

    public final void R0() {
        throw new UnsupportedOperationException("Method not decompiled: gi.m5.R0():void");
    }

    @Override
    public final void a() {
        F0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27954h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27988j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28243wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28299zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ai));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28188ti));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28169si));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28207ui));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28226vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28280yf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28262xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27824a7));
    }

    @Override
    public final void b() {
        setTextType((this.f13233v0 + 1) % 4);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new g2.c(11, this, view)).start();
    }

    @Override
    public final void c(int i3) {
        ug.j jVar = this.f13229t0;
        if (jVar instanceof ug.l2) {
            D0((ug.l2) jVar, i3);
            tg.k0 e10 = tg.k0.e(this.f13222p1);
            e10.f55234g = i3;
            e10.f55229a.edit().putInt("text_alignment", i3).apply();
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
            int i3 = 0;
            loop0: while (true) {
                if (i3 < h5Var.getChildCount()) {
                    View childAt = h5Var.getChildAt(i3);
                    boolean z12 = childAt instanceof ug.l2;
                    int i10 = this.f13222p1;
                    if (z12) {
                        CharSequence text = ((ug.l2) childAt).getText();
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
                                if (f7.u(document, org.telegram.messenger.w7.K(document, null, true, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i3++;
                    } else if (childAt instanceof ug.d2) {
                        TLRPC.Document sticker = ((ug.d2) childAt).getSticker();
                        org.telegram.messenger.w7.G(i10);
                        if (f7.u(sticker, org.telegram.messenger.w7.K(sticker, null, true, true).getAbsolutePath())) {
                            break;
                        }
                        i3++;
                    } else if (childAt instanceof ug.r1) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
        }
        for (int i11 = 0; i11 < h5Var.getChildCount(); i11++) {
            View childAt2 = h5Var.getChildAt(i11);
            if (childAt2 instanceof ug.j) {
                ((ug.j) childAt2).setIsVideo(z11);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        re reVar;
        int i3 = 0;
        if ((view == this.f13239y0 || view == this.f13241z0 || view == this.B0 || view == this.A0) && (reVar = this.f13221p0) != null) {
            canvas.save();
            if (!this.f13237x0) {
                i3 = org.telegram.messenger.g0.f22602m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = reVar.f25117k;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * reVar.f25113e)) / reVar.f25112c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * reVar.f25114f)) / reVar.f25112c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.g0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + i3 + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i3 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i3 != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final TextView e0(int i3, String str) {
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, this.f13224q1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i3));
        textView.setText(str);
        return textView;
    }

    @Override
    public final boolean f(ug.j jVar) {
        return A0(jVar, true);
    }

    public final ug.j0 f0(ug.g0 g0Var) {
        int measuredWidth;
        int i3;
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
        ug.j0 j0Var = new ug.j0(getContext(), N0, this.f13222p1, g0Var, f10 / 360.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            j0Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            j0Var.setStickyY(2);
        }
        tg.h1 h1Var = this.k1;
        if (h1Var != null && (i3 = h1Var.f55186a) != -47814) {
            j0Var.setColor(i3);
        }
        j0Var.setDelegate(this);
        j0Var.setMaxWidth(L);
        h5Var.addView(j0Var, mf.c(-2.0f, -2));
        d0();
        re reVar = this.f13221p0;
        if (reVar != null) {
            j0Var.j(1.0f / reVar.f25112c);
            j0Var.f(-(reVar.f25117k + reVar.d));
        }
        return j0Var;
    }

    public final ug.m0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i3;
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
        ug.m0 m0Var = new ug.m0(getContext(), N0, this.f13222p1, messageMedia, mediaArea, f10 / 240.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            m0Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            m0Var.setStickyY(2);
        }
        tg.h1 h1Var = this.k1;
        if (h1Var != null && (i3 = h1Var.f55186a) != -47814) {
            m0Var.setColor(i3);
        }
        m0Var.setDelegate(this);
        m0Var.setMaxWidth(L);
        h5Var.addView(m0Var, mf.c(-2.0f, -2));
        d0();
        re reVar = this.f13221p0;
        if (reVar != null) {
            m0Var.j(1.0f / reVar.f25112c);
            m0Var.f(-(reVar.f25117k + reVar.d));
        }
        return m0Var;
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.f13239y0.c(true, false);
    }

    public View getBottomLayout() {
        return this.D0;
    }

    public View getCancelView() {
        return this.f13214k0;
    }

    public float getCropRotation() {
        re reVar = this.f13221p0;
        if (reVar != null) {
            return reVar.d + reVar.f25117k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f13215l0;
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
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = h5Var.getChildAt(i3);
            if (childAt instanceof ug.d2) {
                TLRPC.Document sticker = ((ug.d2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f27013id = sticker.f27007id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof ug.l2) {
                CharSequence text = ((ug.l2) childAt).getText();
                if ((text instanceof Spanned) && (p5VarArr = (org.telegram.ui.Components.p5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.p5.class)) != null) {
                    for (org.telegram.ui.Components.p5 p5Var : p5VarArr) {
                        if (p5Var != null) {
                            TLRPC.Document document = p5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.g5.e(this.f13222p1, p5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f27013id = document.f27007id;
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
        return Arrays.asList(this.f13239y0, this.f13241z0, this.B0, this.A0);
    }

    public View getRenderInputView() {
        return this.f13241z0;
    }

    public tg.u0 getRenderView() {
        return this.f13239y0;
    }

    public ug.j getSelectedEntity() {
        return this.f13229t0;
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

    public final ug.n1 h0(String str, boolean z10) {
        float f10;
        lt0 lt0Var;
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
        int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        h5 h5Var = this.B0;
        if (i3 > 0) {
            float floor = (float) Math.floor(Math.max(this.B1, h5Var.getMeasuredWidth()) * 0.5d);
            lt0Var = new lt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, h5Var.getMeasuredHeight()) * 0.5d);
            lt0Var = new lt0(f10 * floor2, floor2);
        }
        lt0 lt0Var2 = lt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = lt0Var2.f35877a;
            lt0Var2.f35877a = lt0Var2.f35878b;
            lt0Var2.f35878b = f11;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        ug.n1 n1Var = new ug.n1(context, c02, lt0Var2, str, intValue);
        n1Var.setDelegate(this);
        h5Var.addView(n1Var);
        d0();
        return n1Var;
    }

    @Override
    public final int[] i(ug.j jVar) {
        int[] iArr = this.Y1;
        iArr[0] = (int) jVar.getPosition().x;
        iArr[1] = (int) jVar.getPosition().y;
        return iArr;
    }

    public final ug.q1 i0(boolean z10) {
        String str;
        lt0 lt0Var = new lt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF c02 = c0();
        h5 h5Var = this.B0;
        if (h5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i3 = 0; i3 < h5Var.getChildCount(); i3++) {
                    View childAt = h5Var.getChildAt(i3);
                    if (a7.h.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (h5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (h5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, h5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, h5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new ug.j(getContext(), c02);
        jVar.f56222s0 = new ei.v8(jVar);
        jVar.f56223t0 = new ei.v8(jVar);
        jVar.f56224u0 = new dh.e0(jVar);
        jVar.f56225v0 = new dh.e0(jVar);
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5((View) jVar);
        jVar.f56227x0 = u5Var;
        org.telegram.ui.Components.u5 u5Var2 = new org.telegram.ui.Components.u5((View) jVar);
        jVar.f56228y0 = u5Var2;
        jVar.A0 = 1.0f;
        jVar.f56221r0 = lt0Var;
        u5Var2.e(true, 1.0f);
        u5Var.e(true, 1.0f);
        ArrayList arrayList = li.b0(h10.f22829t0).h;
        dh.e0 e0Var = jVar.f56224u0;
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
        dh.n0 b10 = dh.n0.b(str);
        jVar.f56226w0 = b10;
        e0Var.e(b10);
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

    @Override
    public final boolean j(MotionEvent motionEvent) {
        if (this.W1) {
            return false;
        }
        if (this.f13229t0 != null) {
            A0(null, true);
        }
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y9);
        this.f13239y0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final ug.r1 j0(String str, boolean z10) {
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
        lt0 lt0Var = new lt0(floor, floor);
        ug.r1 r1Var = new ug.r1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (lt0Var.f35878b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), lt0Var, str);
        r1Var.setDelegate(this);
        h5Var.addView(r1Var);
        d0();
        if (z10) {
            y0(r1Var);
            post(new z3(this, r1Var, 0));
        }
        this.X1 = false;
        return r1Var;
    }

    @Override
    public final void k(ug.j jVar) {
        L0(false);
        J0(jVar);
    }

    public final d5 k0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i3 = 0; i3 < document.attributes.size() && !(document.attributes.get(i3) instanceof TLRPC.TL_documentAttributeSticker); i3++) {
        }
        float f11 = 0.75f;
        re reVar = this.f13221p0;
        if (reVar != null) {
            f10 = -(reVar.f25117k + reVar.d);
            f11 = 0.75f / reVar.f25112c;
        } else {
            f10 = 0.0f;
        }
        l5 l5Var = new l5(c0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f35877a * 0.5d);
        d5 d5Var = new d5(this, context, l5Var.f13114a, l5Var.f13116c, l5Var.f13115b, new lt0(floor, floor), document, obj);
        boolean D4 = zi.D4(document);
        ImageReceiver imageReceiver = d5Var.f55948y0;
        if (D4) {
            imageReceiver.f21261p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        d5Var.setDelegate(this);
        this.B0.addView(d5Var);
        d0();
        return d5Var;
    }

    public final ug.l2 l0(boolean z10) {
        lt0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        ug.l2 l2Var = new ug.l2(getContext(), N0, (int) (paintingSize.f35877a / 9.0f), "", this.k1, this.f13233v0);
        float f10 = paintingSize.f35877a / 9.0f;
        j4 j4Var = new j4(this, 0);
        l2Var.f56147x0 = (int) (0.5f * f10);
        l2Var.f56148y0 = (int) (f10 * 2.0f);
        l2Var.f56149z0 = j4Var;
        float f11 = N0.x;
        h5 h5Var = this.B0;
        if (f11 == h5Var.getMeasuredWidth() / 2.0f) {
            l2Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            l2Var.setStickyY(2);
        }
        l2Var.setDelegate(this);
        l2Var.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        int i3 = this.f13222p1;
        l2Var.setTypeface(tg.k0.e(i3).f55236j);
        l2Var.setType(tg.k0.e(i3).h);
        h5Var.addView(l2Var, mf.c(-2.0f, -2));
        d0();
        re reVar = this.f13221p0;
        if (reVar != null) {
            l2Var.j(1.0f / reVar.f25112c);
            l2Var.f(-(reVar.f25117k + reVar.d));
        }
        if (z10) {
            y0(l2Var);
            l2Var.q();
            A0(l2Var, false);
            l2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.K3(l2Var.getFocusedView());
            this.f13231u0 = true;
            int i10 = tg.k0.e(i3).f55234g;
            ug.d1 d1Var = this.V0;
            d1Var.d(i10, true);
            d1Var.setOutlineType(tg.k0.e(i3).h);
        }
        return l2Var;
    }

    public final ug.m2 m0(sb sbVar) {
        int measuredWidth;
        int i3;
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
        ug.m2 m2Var = new ug.m2(getContext(), N0, this.f13222p1, sbVar, f10 / 240.0f, L);
        if (N0.x == h5Var.getMeasuredWidth() / 2.0f) {
            m2Var.setStickyX(2);
        }
        if (N0.y == h5Var.getMeasuredHeight() / 2.0f) {
            m2Var.setStickyY(2);
        }
        tg.h1 h1Var = this.k1;
        if (h1Var != null && (i3 = h1Var.f55186a) != -47814) {
            m2Var.setColor(i3);
        }
        m2Var.setDelegate(this);
        m2Var.setMaxWidth(L);
        h5Var.addView(m2Var, mf.c(-2.0f, -2));
        d0();
        re reVar = this.f13221p0;
        if (reVar != null) {
            m2Var.j(1.0f / reVar.f25112c);
            m2Var.f(-(reVar.f25117k + reVar.d));
        }
        return m2Var;
    }

    public final void n0() {
        int i3 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i3 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i3);
                if (childAt instanceof ug.r1) {
                    if (this.f13229t0 == childAt) {
                        A0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(xq.h).withEndAction(new z3(this, (ug.r1) childAt, 1)).start();
                }
                i3++;
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
        li0 li0Var = this.J1;
        if (li0Var != null) {
            org.telegram.messenger.g0.E2(li0Var);
            this.J1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float currentActionBarHeight;
        float f10;
        float f11;
        this.f13223q0 = true;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f22608q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
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
        float f12 = this.f13225r0.f35877a;
        ug.j jVar = this.f13229t0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.D0, i3, i10);
        measureChild(this.N0, i3, i10);
        measureChild(this.F0, i3, i10);
        measureChild(this.E0, i3, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.f13202d2 - this.f13236w1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.C0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i3, i10);
        this.f13223q0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.f13197a2 && !this.c2) {
            this.f13223q0 = true;
            t0();
            this.f13223q0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    public final ug.t0 p0() {
        int i3 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i3 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i3);
                if (childAt instanceof ug.t0) {
                    return (ug.t0) childAt;
                }
                i3++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final boolean q() {
        return !(this.f13229t0 instanceof ug.t0);
    }

    public final android.graphics.Bitmap q0(java.util.ArrayList r39, boolean r40, boolean r41, boolean r42, boolean r43, gi.f7 r44) {
        throw new UnsupportedOperationException("Method not decompiled: gi.m5.q0(java.util.ArrayList, boolean, boolean, boolean, boolean, gi.f7):android.graphics.Bitmap");
    }

    @Override
    public final boolean r() {
        return !this.f13231u0;
    }

    public final boolean r0() {
        if (!this.f13217n0.a() && !this.V1) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f13223q0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z10) {
        if (this.f13197a2) {
            G0(0);
        }
        if (z10) {
            ey eyVar = this.Z1;
            if (eyVar != null && eyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Z1.getMeasuredHeight());
                ofFloat.addUpdateListener(new e4(this, 0));
                this.c2 = true;
                ofFloat.addListener(new x4(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                ofFloat.start();
                return;
            }
            t0();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.x9 x9Var) {
        this.O1 = x9Var;
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

    public void setCoverTime(long j10) {
        int i3 = 0;
        while (true) {
            h5 h5Var = this.B0;
            if (i3 < h5Var.getChildCount()) {
                View childAt = h5Var.getChildAt(i3);
                if (childAt instanceof ug.d2) {
                    ImageReceiver imageReceiver = ((ug.d2) childAt).f55948y0;
                    ch0 B = imageReceiver.B();
                    imageReceiver.m();
                    if (B != null) {
                        B.N(Math.round(((((float) j10) % ((float) B.r())) / ((float) B.r())) * B.f32725e[0]), true, false);
                    }
                }
                i3++;
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
        this.f13234v1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.f13232u1 = runnable;
    }

    public final void t0() {
        ey eyVar;
        if (!this.f13197a2 && (eyVar = this.Z1) != null && eyVar.getVisibility() != 8) {
            this.Z1.setVisibility(8);
        }
        int i3 = this.f13202d2;
        this.f13202d2 = 0;
        if (i3 != 0) {
            this.f13240y1.a();
        }
    }

    @Override
    public final void u() {
        if (!this.f13199b2 && !this.f13197a2) {
            this.V1 = true;
            l0(true);
            return;
        }
        if (this.f13197a2) {
            ug.j jVar = this.f13229t0;
            if (jVar instanceof ug.l2) {
                this.f13240y1.f13361e = true;
                org.telegram.messenger.g0.K3(((ug.l2) jVar).getEditText());
            }
        }
        G0(!this.f13197a2 ? 1 : 0);
    }

    @Override
    public final void updateColors() {
        this.f13220o1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.f13239y0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x10 = (f10 - view2.getX()) - view.getLeft();
        float y9 = (f11 - view2.getY()) - view.getTop();
        float pivotX = ((x10 - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y9 - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    public final boolean v0() {
        if (this.M1) {
            if (this.J1.getReactionsWindow() != null && !this.J1.getReactionsWindow().f8945q) {
                this.J1.e();
                return true;
            }
            L0(false);
            return true;
        } else if (this.f13216l1) {
            F0(false);
            return true;
        } else if (this.f13197a2) {
            s0(true);
            return true;
        } else if (!this.f13231u0) {
            return false;
        } else {
            if (this.f13235w0) {
                this.f13235w0 = false;
                this.f13240y1.b(true);
                return false;
            }
            A0(null, true);
            return true;
        }
    }

    @Override
    public final tg.k0 w() {
        return tg.k0.e(this.f13222p1);
    }

    public abstract void w0(boolean z10);

    public final void x0() {
        final int i3 = this.I0;
        O0(1);
        postDelayed(new ai.y1(this, 16), 350L);
        a5 a5Var = new a5(this, getContext(), this.f13224q1, i3);
        this.U1 = a5Var;
        ua uaVar = this.f13236w1;
        Objects.requireNonNull(uaVar);
        a5Var.f12960u1 = new q4(uaVar, 0);
        final boolean[] zArr = {true};
        a5Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                m5 m5Var = m5.this;
                m5Var.U1 = null;
                if (zArr[0]) {
                    m5Var.w0(false);
                }
                m5Var.O0(i3);
            }
        });
        a5Var.f12962w1 = new l4(this);
        a5Var.N0(new s4(this, zArr, a5Var, 0));
        a5Var.show();
        w0(true);
    }

    public final void y0(ug.j jVar) {
        this.f13217n0.b(jVar.getUUID(), new i4(this, jVar, 0));
    }

    @Override
    public final void z() {
        K0(new j4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final void z0(ug.j jVar) {
        ug.j jVar2 = this.f13229t0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f56085n0, false);
            A0(null, true);
            if (jVar instanceof ug.l2) {
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
            tg.k1 k1Var = this.f13217n0;
            k1Var.f55240b.remove(uuid);
            k1Var.f55241c.remove(uuid);
            org.telegram.messenger.g0.h3(new r4.u(k1Var, 8));
        }
        ug.l1 l1Var = this.N0;
        c6.i iVar = this.O0;
        l1Var.setValueOverride(iVar);
        l1Var.setShowPreview(true);
        float f10 = iVar.get();
        tg.h1 h1Var = this.k1;
        h1Var.f55188c = f10;
        B0(h1Var, null, false);
        if (!this.X1 && (jVar instanceof ug.r1)) {
            va vaVar = ((x9) this).f13872k2;
            ja jaVar = vaVar.Y0;
            if (jaVar != null) {
                jaVar.s(null, null, true);
            }
            x9 x9Var = vaVar.f13770w1;
            if (x9Var != null) {
                x9Var.n0();
            }
            la laVar = vaVar.f13710d1;
            if (laVar != null) {
                laVar.setHasRoundVideo(false);
            }
            f7 f7Var = vaVar.L1;
            if (f7Var != null) {
                File file = f7Var.f12733o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    vaVar.L1.f12733o0 = null;
                }
                if (vaVar.L1.f12735p0 != null) {
                    try {
                        new File(vaVar.L1.f12735p0).delete();
                    } catch (Exception unused2) {
                    }
                    vaVar.L1.f12735p0 = null;
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
