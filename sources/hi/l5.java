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
import org.telegram.messenger.b20;
import org.telegram.messenger.c20;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.yg;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
public abstract class l5 extends bu0 implements tg.g1, tg.h, tg.c1, zt0, pa {
    public final r4 A0;
    public ArrayList A1;
    public final g5 B0;
    public int B1;
    public final FrameLayout C0;
    public int C1;
    public final h5 D0;
    public sg.q D1;
    public final r4 E0;
    public final boolean E1;
    public final FrameLayout F0;
    public final File F1;
    public x4 G0;
    public final boolean G1;
    public final View H0;
    public final boolean H1;
    public int I0;
    public boolean I1;
    public int J0;
    public vi0 J1;
    public float K0;
    public tg.q1 K1;
    public ValueAnimator L0;
    public float L1;
    public boolean M0;
    public boolean M1;
    public final tg.m1 N0;
    public boolean N1;
    public final w4 O0;
    public org.telegram.ui.Components.ca O1;
    public final int P0;
    public final v5 P1;
    public BigInteger Q0;
    public final w5 Q1;
    public TextView R0;
    public boolean R1;
    public TextView S0;
    public ObjectAnimator S1;
    public TextView T0;
    public final float[] T1;
    public final tg.h1 U0;
    public z4 U1;
    public final tg.e1 V0;
    public boolean V1;
    public final tg.j1 W0;
    public boolean W1;
    public final ImageView X0;
    public boolean X1;
    public final TextView Y0;
    public final int[] Y1;
    public final TextView Z0;
    public ry Z1;
    public final TextView f14896a1;
    public boolean f14897a2;
    public final Paint f14898b1;
    public boolean f14899b2;
    public final Paint f14900c1;
    public boolean f14901c2;
    public float f14902d1;
    public int d2;
    public boolean f14903e1;
    public boolean f14904e2;
    public r1.g f14905f1;
    public int f14906f2;
    public final s4 f14907g1;
    public int f14908g2;
    public final Paint f14909h1;
    public int f14910h2;
    public final Paint f14911i1;
    public boolean f14912i2;
    public final Paint f14913j1;
    public final tg.v0 f14914k0;
    public final sg.h1 f14915k1;
    public final tg.z0 f14916l0;
    public boolean l1;
    public final Bitmap m0;
    public r1.g f14917m1;
    public final sg.k1 f14918n0;
    public float n1;
    public final org.telegram.messenger.r5 f14919o0;
    public final Paint f14920o1;
    public final we f14921p0;
    public final int f14922p1;
    public boolean f14923q0;
    public final d5 f14924q1;
    public vt0 f14925r0;
    public org.telegram.ui.ActionBar.h1 f14926r1;
    public boolean f14927s0;
    public j5 f14928s1;
    public tg.j f14929t0;
    public Rect f14930t1;
    public boolean f14931u0;
    public Runnable f14932u1;
    public int f14933v0;
    public Runnable f14934v1;
    public boolean f14935w0;
    public final sa f14936w1;
    public final boolean f14937x0;
    public AnimatorSet f14938x1;
    public final f5 f14939y0;
    public final t4 f14940y1;
    public final bi.i3 f14941z0;
    public d7 f14942z1;

    public l5(Context context, boolean z10, File file, boolean z11, boolean z12, sa saVar, Activity activity, final int i7, Bitmap bitmap, Bitmap bitmap2, int i10, ArrayList arrayList, d7 d7Var, int i11, int i12, we weVar, org.telegram.ui.Components.ca caVar, org.telegram.ui.ActionBar.i6 i6Var, v5 v5Var, w5 w5Var) {
        super(context, activity);
        sg.h1 h1Var;
        org.telegram.ui.Components.ca caVar2;
        int i13;
        this.I0 = 0;
        this.J0 = -1;
        final v9 v9Var = (v9) this;
        w4 w4Var = new w4(v9Var, 0);
        this.O0 = w4Var;
        Paint paint = new Paint(1);
        this.f14898b1 = paint;
        Paint paint2 = new Paint(1);
        this.f14900c1 = paint2;
        this.f14909h1 = new Paint(1);
        this.f14911i1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f14913j1 = paint3;
        sg.h1 h1Var2 = new sg.h1(1.0f, 0.016773745f, -1);
        this.f14915k1 = h1Var2;
        this.f14920o1 = new Paint(1);
        this.T1 = new float[2];
        this.W1 = false;
        this.Y1 = new int[2];
        new a8.sa(v9Var, 27);
        setDelegate(this);
        this.O1 = caVar;
        this.P1 = v5Var;
        this.E1 = z10;
        this.F1 = file;
        this.G1 = z11;
        this.H1 = z12;
        this.f14936w1 = saVar;
        this.B1 = i11;
        this.C1 = i12;
        this.Q1 = w5Var;
        this.f14922p1 = i7;
        d5 d5Var = new d5(0, i6Var);
        this.f14924q1 = d5Var;
        this.f14921p0 = weVar;
        this.f14937x0 = context instanceof BubbleActivity;
        sg.k0 e10 = sg.k0.e(i7);
        e10.i(0, true);
        h1Var2.f57218a = e10.c();
        h1Var2.f57220c = e10.f57267i;
        org.telegram.messenger.r5 r5Var = new org.telegram.messenger.r5("Paint", true);
        this.f14919o0 = r5Var;
        this.m0 = bitmap;
        this.P0 = i10;
        sg.k1 k1Var = new sg.k1();
        this.f14918n0 = k1Var;
        k1Var.f57271a = new di.c7(v9Var, 20);
        View view = new View(context);
        this.H0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        sg.i0 i0Var = new sg.i0(getPaintingSize(), null, i10, caVar);
        if (d7Var == null || !d7Var.f14430u) {
            h1Var = h1Var2;
            caVar2 = caVar;
        } else {
            h1Var = h1Var2;
            caVar2 = null;
        }
        f5 f5Var = new f5(v9Var, context, i0Var, bitmap, bitmap2, caVar2);
        this.f14939y0 = f5Var;
        f5Var.setDelegate(new ob.c(v9Var, 29));
        f5Var.setUndoStore(k1Var);
        f5Var.setQueue(r5Var);
        f5Var.setVisibility(4);
        bi.i3 i3Var = new bi.i3(2, context, v9Var);
        this.f14941z0 = i3Var;
        i3Var.setVisibility(4);
        g5 g5Var = new g5(v9Var, context, new h9.g1(v9Var, 2));
        this.B0 = g5Var;
        this.f14942z1 = d7Var;
        this.A1 = arrayList;
        if (this.B1 > 0 && this.C1 > 0) {
            E0();
        }
        g5Var.setVisibility(4);
        this.A0 = new r4(v9Var, context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.C0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, c8.ma.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(2131232533);
        imageView.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.f14939y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.f57214a.get(0));
                            return;
                        }
                        v9Var2.f14918n0.c();
                        return;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.f14939y0;
                        sg.k1 k1Var2 = v9Var3.f14918n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.f57214a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.f57273c.clear();
                            k1Var2.f57272b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.f14929t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.f14897a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.f14929t0);
                        v9Var4.A0(null, true);
                        return;
                    case 3:
                        v9Var.A0(null, true);
                        return;
                    default:
                        v9 v9Var5 = v9Var;
                        if (v9Var5.l1) {
                            v9Var5.F0(false);
                            return;
                        } else if (v9Var5.f14897a2) {
                            v9Var5.s0(true);
                            return;
                        } else if (v9Var5.f14931u0) {
                            v9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = v9Var5.f14934v1;
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
        frameLayout.addView(imageView, c8.ma.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(gd.M0(2131747074, null));
        linearLayout.addView(n10.e(context, 2131232534), c8.ma.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c8.ma.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bi.o(8));
        frameLayout.addView(linearLayout, c8.ma.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.Y0 = textView2;
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        textView2.setText(gd.M0(2131747086, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.f14939y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.f57214a.get(0));
                            return;
                        }
                        v9Var2.f14918n0.c();
                        return;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.f14939y0;
                        sg.k1 k1Var2 = v9Var3.f14918n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.f57214a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.f57273c.clear();
                            k1Var2.f57272b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.f14929t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.f14897a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.f14929t0);
                        v9Var4.A0(null, true);
                        return;
                    case 3:
                        v9Var.A0(null, true);
                        return;
                    default:
                        v9 v9Var5 = v9Var;
                        if (v9Var5.l1) {
                            v9Var5.F0(false);
                            return;
                        } else if (v9Var5.f14897a2) {
                            v9Var5.s0(true);
                            return;
                        } else if (v9Var5.f14931u0) {
                            v9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = v9Var5.f14934v1;
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
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView2, c8.ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.Z0 = m10;
        m10.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        m10.setText(gd.M0(2131752090, null));
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
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.f14939y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.f57214a.get(0));
                            return;
                        }
                        v9Var2.f14918n0.c();
                        return;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.f14939y0;
                        sg.k1 k1Var2 = v9Var3.f14918n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.f57214a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.f57273c.clear();
                            k1Var2.f57272b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.f14929t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.f14897a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.f14929t0);
                        v9Var4.A0(null, true);
                        return;
                    case 3:
                        v9Var.A0(null, true);
                        return;
                    default:
                        v9 v9Var5 = v9Var;
                        if (v9Var5.l1) {
                            v9Var5.F0(false);
                            return;
                        } else if (v9Var5.f14897a2) {
                            v9Var5.s0(true);
                            return;
                        } else if (v9Var5.f14931u0) {
                            v9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = v9Var5.f14934v1;
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
        TextView m11 = org.telegram.ui.Cells.c0.m(frameLayout, m10, c8.ma.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f14896a1 = m11;
        m11.setBackground(org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
        m11.setText(gd.M0(2131751343, null));
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
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.f14939y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.f57214a.get(0));
                            return;
                        }
                        v9Var2.f14918n0.c();
                        return;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.f14939y0;
                        sg.k1 k1Var2 = v9Var3.f14918n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.f57214a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.f57273c.clear();
                            k1Var2.f57272b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.f14929t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.f14897a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.f14929t0);
                        v9Var4.A0(null, true);
                        return;
                    case 3:
                        v9Var.A0(null, true);
                        return;
                    default:
                        v9 v9Var5 = v9Var;
                        if (v9Var5.l1) {
                            v9Var5.F0(false);
                            return;
                        } else if (v9Var5.f14897a2) {
                            v9Var5.s0(true);
                            return;
                        } else if (v9Var5.f14931u0) {
                            v9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = v9Var5.f14934v1;
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
        frameLayout.addView(m11, c8.ma.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        h5 h5Var = new h5(v9Var, context, e10);
        this.D0 = h5Var;
        h5Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), 0);
        h5Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(h5Var, c8.ma.e(-1, 104, 80));
        tg.h1 h1Var3 = new tg.h1(context, (d7Var == null || d7Var.v() || d7Var.f14430u || caVar == null) ? false : true);
        this.U0 = h1Var3;
        h1Var3.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        h1Var3.setDelegate(this);
        h1Var3.setSelectedIndex(1);
        h5Var.addView(h1Var3, c8.ma.c(48.0f, -1));
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
                        v9 v9Var2 = v9Var;
                        sg.h1 h1Var4 = v9Var2.f14915k1;
                        v9Var2.C0(h1Var4);
                        sg.k0.e(i7).j(h1Var4.f57220c);
                        return;
                    default:
                        v9Var.V0.setTypeface(sg.k0.e(i7).f57268j);
                        return;
                }
            }
        });
        e1Var.setAlignment(sg.k0.e(i7).f57266g);
        h5Var.addView(e1Var, c8.ma.c(48.0f, -1));
        r4 r4Var = new r4(v9Var, context, 0);
        this.E0 = r4Var;
        addView(r4Var, c8.ma.c(-1.0f, -1));
        tg.j1 j1Var = new tg.j1(context);
        this.W0 = j1Var;
        j1Var.setVisibility(8);
        j1Var.setOnItemClickListener(new bi.i8(v9Var, 11));
        e1Var.setTypefaceListView(j1Var);
        r4Var.addView(j1Var, c8.ma.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, d5Var));
        s4 s4Var = new s4(v9Var, context);
        this.f14907g1 = s4Var;
        s4Var.setVisibility(8);
        s4Var.setColorPalette(sg.k0.e(i7));
        s4Var.setColorListener(new bi.p8(v9Var, 2));
        h5Var.addView(s4Var, c8.ma.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        tg.v0 v0Var = new tg.v0(context);
        this.f14914k0 = v0Var;
        v0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        v0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        h5Var.addView(v0Var, c8.ma.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        v0Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        f5 f5Var2 = v9Var2.f14939y0;
                        if (f5Var2 != null && (f5Var2.getCurrentBrush() instanceof sg.g)) {
                            f5Var2.b();
                            v9Var2.U0.setSelectedIndex(1);
                            v9Var2.w((sg.h) sg.h.f57214a.get(0));
                            return;
                        }
                        v9Var2.f14918n0.c();
                        return;
                    case 1:
                        v9 v9Var3 = v9Var;
                        f5 f5Var3 = v9Var3.f14939y0;
                        sg.k1 k1Var2 = v9Var3.f14918n0;
                        if (k1Var2.a()) {
                            if (f5Var3 != null && (f5Var3.getCurrentBrush() instanceof sg.g)) {
                                f5Var3.b();
                                v9Var3.U0.setSelectedIndex(1);
                                v9Var3.w((sg.h) sg.h.f57214a.get(0));
                            }
                            if (f5Var3 != null) {
                                f5Var3.a();
                            }
                            k1Var2.f57273c.clear();
                            k1Var2.f57272b.clear();
                            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var2, 14));
                            v9Var3.B0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        v9 v9Var4 = v9Var;
                        tg.j jVar = v9Var4.f14929t0;
                        if (jVar instanceof tg.m2) {
                            org.telegram.messenger.g0.v1(((tg.m2) jVar).getFocusedView());
                        }
                        if (v9Var4.f14897a2) {
                            v9Var4.s0(false);
                        }
                        v9Var4.z0(v9Var4.f14929t0);
                        v9Var4.A0(null, true);
                        return;
                    case 3:
                        v9Var.A0(null, true);
                        return;
                    default:
                        v9 v9Var5 = v9Var;
                        if (v9Var5.l1) {
                            v9Var5.F0(false);
                            return;
                        } else if (v9Var5.f14897a2) {
                            v9Var5.s0(true);
                            return;
                        } else if (v9Var5.f14931u0) {
                            v9Var5.A0(null, true);
                            return;
                        } else {
                            Runnable runnable = v9Var5.f14934v1;
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
        this.f14916l0 = z0Var;
        z0Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        z0Var.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        z0Var.setOnClickListener(new ah.h(v9Var, context, e10, 15));
        h5Var.addView(z0Var, c8.ma.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        tg.m1 m1Var = new tg.m1(context);
        this.N0 = m1Var;
        sg.h1 h1Var4 = h1Var;
        m1Var.setColorSwatch(h1Var4);
        m1Var.setRenderView(f5Var);
        m1Var.setValueOverride(w4Var);
        h1Var4.f57220c = w4Var.get();
        m1Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        v9 v9Var2 = v9Var;
                        sg.h1 h1Var42 = v9Var2.f14915k1;
                        v9Var2.C0(h1Var42);
                        sg.k0.e(i7).j(h1Var42.f57220c);
                        return;
                    default:
                        v9Var.V0.setTypeface(sg.k0.e(i7).f57268j);
                        return;
                }
            }
        });
        addView(m1Var, c8.ma.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F0 = frameLayout2;
        addView(frameLayout2, c8.ma.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        B0(h1Var4, null, false);
        w((sg.h) sg.h.f57214a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.g0.f24121q;
            i13 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.g0.L(100.0f), (int) (point.y * 0.65d))));
        } else {
            i13 = 1;
        }
        this.f14940y1 = new t4(v9Var, saVar, new ai.v1(16, v9Var, saVar));
        j2.C1 = i13;
    }

    public static void D0(tg.m2 m2Var, int i7) {
        int i10;
        m2Var.setAlign(i7);
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
        m2Var.getEditText().setGravity(i10);
        if (i7 != 1) {
            if (i7 == 2 ? !gd.f24216a0 : gd.f24216a0) {
                i11 = 3;
            }
        } else {
            i11 = 4;
        }
        m2Var.getEditText().setTextAlignment(i11);
    }

    public static void X(v9 v9Var, sg.k0 k0Var, Integer num) {
        k0Var.h(num.intValue(), true);
        k0Var.g();
        v9Var.setNewColor(num.intValue());
        v9Var.f14907g1.setSelectedColorIndex(k0Var.d());
        v9Var.D1 = null;
    }

    public static void Y(v9 v9Var, Integer num) {
        v9Var.setNewColor(num.intValue());
        v9Var.F0(false);
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

    private vt0 getPaintingSize() {
        vt0 vt0Var = this.f14925r0;
        if (vt0Var != null) {
            return vt0Var;
        }
        vt0 vt0Var2 = new vt0(1080.0f, 1920.0f);
        this.f14925r0 = vt0Var2;
        return vt0Var2;
    }

    private void setCoverPause(boolean z10) {
        int i7 = 0;
        while (true) {
            g5 g5Var = this.B0;
            if (i7 < g5Var.getChildCount()) {
                View childAt = g5Var.getChildAt(i7);
                if (childAt instanceof tg.f2) {
                    ImageReceiver imageReceiver = ((tg.f2) childAt).f57847y0;
                    mh0 B = imageReceiver.B();
                    org.telegram.ui.Components.b6 m10 = imageReceiver.m();
                    boolean z11 = !z10;
                    imageReceiver.f22669v0 = z11;
                    imageReceiver.f22667u0 = z11;
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
        sg.h1 h1Var = this.f14915k1;
        int i10 = h1Var.f57218a;
        h1Var.f57218a = i7;
        B0(h1Var, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new g4(this, i10, i7, 0));
        duration.start();
    }

    private void setTextType(int i7) {
        this.f14933v0 = i7;
        tg.j jVar = this.f14929t0;
        if (jVar instanceof tg.m2) {
            ((tg.m2) jVar).setType(i7);
        }
        sg.k0 e10 = sg.k0.e(this.f14922p1);
        e10.h = i7;
        e10.f57261a.edit().putInt("text_type", i7).apply();
        this.V0.e(i7, true);
    }

    private void setupTabsLayout(Context context) {
        x4 x4Var = new x4(this, context);
        this.G0 = x4Var;
        x4Var.setClipToPadding(false);
        this.G0.setOrientation(0);
        this.D0.addView(this.G0, c8.ma.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.R0 = textView;
        textView.setText(gd.M0(2131747084, null).toUpperCase());
        TextView textView2 = this.R0;
        int i7 = org.telegram.ui.ActionBar.n6.f29488i6;
        d5 d5Var = this.f14924q1;
        org.telegram.ui.ActionBar.u6.Q(textView2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, d5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i7), d5Var);
        this.R0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.R0.setTextColor(-1);
        this.R0.setTextSize(1, 14.0f);
        this.R0.setGravity(1);
        this.R0.setTypeface(org.telegram.messenger.g0.o());
        this.R0.setSingleLine();
        this.R0.setOnClickListener(new View.OnClickListener(this) {
            public final l5 f15811b;

            {
                this.f15811b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f15811b;
                        if (l5Var.f14931u0) {
                            l5Var.A0(null, true);
                            return;
                        } else {
                            l5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f15811b.x0();
                        return;
                    default:
                        l5 l5Var2 = this.f15811b;
                        l5Var2.O0(2);
                        if (!(l5Var2.f14929t0 instanceof tg.m2)) {
                            l5Var2.V1 = true;
                            l5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.G0.addView(this.R0, c8.ma.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.S0 = textView3;
        textView3.setText(gd.M0(2131747083, null).toUpperCase());
        org.telegram.ui.ActionBar.u6.Q(this.S0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, d5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i7), d5Var);
        this.S0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) {
            public final l5 f15811b;

            {
                this.f15811b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f15811b;
                        if (l5Var.f14931u0) {
                            l5Var.A0(null, true);
                            return;
                        } else {
                            l5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f15811b.x0();
                        return;
                    default:
                        l5 l5Var2 = this.f15811b;
                        l5Var2.O0(2);
                        if (!(l5Var2.f14929t0 instanceof tg.m2)) {
                            l5Var2.V1 = true;
                            l5Var2.l0(true);
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
        this.G0.addView(this.S0, c8.ma.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.T0 = textView4;
        textView4.setText(gd.M0(2131747082, null).toUpperCase());
        org.telegram.ui.ActionBar.u6.Q(this.T0, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i7, d5Var), 7, -1), null, org.telegram.ui.ActionBar.u6.M(i7), d5Var);
        this.T0.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        this.T0.setTextColor(-1);
        this.T0.setTextSize(1, 14.0f);
        this.T0.setGravity(1);
        this.T0.setTypeface(org.telegram.messenger.g0.o());
        this.T0.setAlpha(0.6f);
        this.T0.setSingleLine();
        this.T0.setOnClickListener(new View.OnClickListener(this) {
            public final l5 f15811b;

            {
                this.f15811b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f15811b;
                        if (l5Var.f14931u0) {
                            l5Var.A0(null, true);
                            return;
                        } else {
                            l5Var.O0(0);
                            return;
                        }
                    case 1:
                        this.f15811b.x0();
                        return;
                    default:
                        l5 l5Var2 = this.f15811b;
                        l5Var2.O0(2);
                        if (!(l5Var2.f14929t0 instanceof tg.m2)) {
                            l5Var2.V1 = true;
                            l5Var2.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.G0.addView(this.T0, c8.ma.l(1.0f, 0, -2));
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
        K0(new i4(this, 3), this, 53, 0, getHeight(), false);
    }

    public final boolean A0(tg.j jVar, boolean z10) {
        boolean z11;
        db dbVar;
        db dbVar2;
        vi0 vi0Var;
        int i7;
        boolean z12 = jVar instanceof tg.m2;
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
            tg.m2 m2Var = (tg.m2) jVar;
            int gravity = m2Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i10 = 0;
                }
            } else {
                i10 = 1;
            }
            tg.e1 e1Var = this.V0;
            e1Var.setAlignment(i10);
            sg.a0 typeface = m2Var.getTypeface();
            if (typeface != null) {
                e1Var.setTypeface(typeface.f57154a);
            }
            e1Var.e(m2Var.getType(), true);
            this.E0.invalidate();
        }
        tg.j jVar2 = this.f14929t0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!jVar.f57953e0) {
                    if (jVar instanceof tg.n0) {
                        tg.n0 n0Var = (tg.n0) jVar;
                        n0Var.setType((n0Var.getType() + 1) % n0Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof tg.n2) {
                        tg.n2 n2Var = (tg.n2) jVar;
                        n2Var.setType((n2Var.getType() + 1) % n2Var.getTypesCount());
                        return true;
                    } else if (jVar instanceof tg.k0) {
                        tg.k0 k0Var = (tg.k0) jVar;
                        tg.i0 i0Var = k0Var.f57979r0;
                        if (i0Var.e()) {
                            if (i0Var.getPreviewType() == 0) {
                                i11 = 1;
                            }
                            i0Var.setPreviewType(i11);
                            return true;
                        }
                        k0Var.setType(k0Var.getNextType());
                        return true;
                    } else if (!this.f14931u0) {
                        if (jVar instanceof tg.m2) {
                            this.f14935w0 = true;
                            o0();
                            return true;
                        } else if (jVar instanceof tg.q1) {
                            tg.q1 q1Var = (tg.q1) jVar;
                            if (this.M1 && this.K1 == jVar) {
                                q1Var.q(true);
                                return true;
                            }
                            tg.q1 q1Var2 = this.K1;
                            if (q1Var2 != null && q1Var2 != q1Var && (vi0Var = this.J1) != null) {
                                vi0Var.animate().alpha(0.0f).setListener(new ai.j0(vi0Var, 22));
                                this.J1 = null;
                                this.M1 = false;
                                this.L1 = 0.0f;
                            }
                            if (this.J1 == null) {
                                vi0 vi0Var2 = new vi0(2, this.f14922p1, getContext(), LaunchActivity.Q(), new fi.g2(6, new fi.b()));
                                this.J1 = vi0Var2;
                                org.telegram.ui.Components.ga gaVar = new org.telegram.ui.Components.ga(this.O1, vi0Var2, 0, false);
                                this.J1.setPadding(0, org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f));
                                this.f14936w1.addView(this.J1, c8.ma.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(i0.a.o(-16777216, 120));
                                this.J1.setDelegate(new a8.r7(this, gaVar, paint));
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
                    } else if (jVar2 instanceof tg.m2) {
                        org.telegram.messenger.g0.I3(((tg.m2) jVar2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            jVar2.l(jVar2.f57963n0, false);
            tg.j jVar3 = this.f14929t0;
            if (jVar3 instanceof tg.m2) {
                tg.m2 m2Var2 = (tg.m2) jVar3;
                tg.l2 l2Var = m2Var2.f58027r0;
                l2Var.clearFocus();
                l2Var.setEnabled(false);
                l2Var.setClickable(false);
                m2Var2.m();
                if (!z12) {
                    this.f14931u0 = false;
                    org.telegram.messenger.g0.v1(((tg.m2) this.f14929t0).getFocusedView());
                    s0(false);
                }
            } else if ((jVar3 instanceof tg.r1) && (dbVar2 = ((v9) this).f15617k2.f15425a1) != null) {
                dbVar2.l(false);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        tg.j jVar4 = this.f14929t0;
        this.f14929t0 = jVar;
        if ((jVar4 instanceof tg.m2) && TextUtils.isEmpty(((tg.m2) jVar4).getText())) {
            z0(jVar4);
        }
        tg.j jVar5 = this.f14929t0;
        if (jVar4 != jVar5 && (jVar5 instanceof tg.r1) && (dbVar = ((v9) this).f15617k2.f15425a1) != null) {
            dbVar.l(true);
        }
        tg.j jVar6 = this.f14929t0;
        w4 w4Var = this.O0;
        sg.h1 h1Var = this.f14915k1;
        tg.m1 m1Var = this.N0;
        if (jVar6 != null) {
            r4 r4Var = this.A0;
            jVar6.f57963n0 = r4Var;
            jVar6.l(r4Var, true);
            tg.j jVar7 = this.f14929t0;
            if (jVar7 instanceof tg.m2) {
                tg.m2 m2Var3 = (tg.m2) jVar7;
                m2Var3.getSwatch().f57220c = h1Var.f57220c;
                m2Var3.A0 = false;
                C0(m2Var3.getSwatch());
                m1Var.setValueOverride(new u4(m2Var3, (int) (this.f14925r0.f41433a / 9.0f), 0));
                m1Var.setShowPreview(false);
            } else {
                m1Var.setValueOverride(w4Var);
                m1Var.setShowPreview(true);
                h1Var.f57220c = w4Var.get();
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
            m1Var.setValueOverride(w4Var);
            m1Var.setShowPreview(true);
            h1Var.f57220c = w4Var.get();
            B0(h1Var, null, false);
            z13 = z11;
        }
        R0();
        return z13;
    }

    public final void B0(sg.h1 h1Var, Integer num, boolean z10) {
        sg.h1 h1Var2 = this.f14915k1;
        if (h1Var2 != h1Var) {
            h1Var2.f57218a = h1Var.f57218a;
            h1Var2.f57219b = h1Var.f57219b;
            h1Var2.f57220c = h1Var.f57220c;
            int i7 = this.f14922p1;
            sg.k0.e(i7).h(h1Var.f57218a, true);
            sg.k0.e(i7).j(h1Var.f57220c);
        }
        int i10 = h1Var.f57218a;
        f5 f5Var = this.f14939y0;
        f5Var.setColor(i10);
        f5Var.setBrushSize(h1Var.f57220c);
        int i11 = h1Var2.f57218a;
        if (num != null && num.intValue() != i11) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new a4(this, num, i11, 0));
            duration.start();
        } else {
            h5 h5Var = this.D0;
            if (h5Var != null) {
                h5Var.invalidate();
            }
        }
        tg.j jVar = this.f14929t0;
        if (jVar instanceof tg.m2) {
            ((tg.m2) jVar).setSwatch(new sg.h1(h1Var.f57219b, h1Var.f57220c, h1Var.f57218a));
        } else if (z10 && (jVar instanceof tg.n0)) {
            ((tg.n0) jVar).setColor(h1Var.f57218a);
            ((tg.n0) this.f14929t0).setType(3);
        } else if (z10 && (jVar instanceof tg.n2)) {
            ((tg.n2) jVar).setColor(h1Var.f57218a);
            ((tg.n2) this.f14929t0).setType(3);
        } else if (z10 && (jVar instanceof tg.k0)) {
            ((tg.k0) jVar).setColor(h1Var.f57218a);
            ((tg.k0) this.f14929t0).setType(0);
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
            d7 d7Var = this.f14942z1;
            this.f14942z1 = null;
            this.A1 = null;
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                ?? r14 = this.B0;
                if (i10 < size) {
                    c20 c20Var = (c20) arrayList.get(i10);
                    byte b10 = c20Var.f23232a;
                    if (b10 == 0) {
                        c5 k02 = k0(c20Var.C, c20Var.B);
                        if ((2 & c20Var.f23233b) != 0) {
                            k02.r(z10);
                        }
                        ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                        layoutParams.width = c20Var.f23246q;
                        layoutParams.height = c20Var.f23247r;
                        i7 = size;
                        jVar2 = k02;
                    } else if (b10 == 1) {
                        tg.m2 l02 = l0(z10);
                        l02.setType(c20Var.f23233b);
                        l02.setTypeface(c20Var.f23243n);
                        l02.setBaseFontSize(c20Var.f23242m);
                        SpannableString spannableString = new SpannableString(c20Var.f23239j);
                        ?? r42 = c20Var.f23240k;
                        int size2 = r42.size();
                        for (int i11 = z10; i11 < size2; i11++) {
                            b20 b20Var = (b20) r42.get(i11);
                            org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(b20Var.document_id, 1.0f, l02.getFontMetricsInt());
                            int i12 = b20Var.offset;
                            spannableString.setSpan(x5Var, i12, b20Var.length + i12, 33);
                            size = size;
                        }
                        i7 = size;
                        CharSequence m10 = org.telegram.messenger.j6.m(spannableString, l02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (g6VarArr = (org.telegram.messenger.g6[]) ((Spanned) m10).getSpans(0, m10.length(), org.telegram.messenger.g6.class)) != null) {
                            for (org.telegram.messenger.g6 g6Var : g6VarArr) {
                                g6Var.f24176b = 0.85f;
                            }
                        }
                        l02.setText(m10);
                        D0(l02, c20Var.f23245p);
                        sg.h1 swatch = l02.getSwatch();
                        swatch.f57218a = c20Var.f23241l;
                        l02.setSwatch(swatch);
                        jVar2 = l02;
                    } else {
                        i7 = size;
                        if (b10 == 2) {
                            tg.n1 h02 = h0(c20Var.f23239j, false);
                            h02.H0 = c20Var.f23250u;
                            h02.C0 = false;
                            if ((2 & c20Var.f23233b) != 0) {
                                h02.r(false);
                            }
                            if ((c20Var.f23233b & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = c20Var.f23246q;
                            layoutParams2.height = c20Var.f23247r;
                            jVar2 = h02;
                        } else {
                            if (b10 == 6) {
                                ArrayList arrayList2 = d7Var.v;
                                boolean z11 = d7Var.K;
                                this.V1 = true;
                                f10 = 1.0f;
                                tg.j b5Var = new b5(this, getContext(), c0(), arrayList2, this.O1, z11, this.P1);
                                b5Var.setDelegate(this);
                                r14.addView(b5Var);
                                d0();
                                jVar = b5Var;
                                if (c20Var.f23246q > 0) {
                                    jVar = b5Var;
                                    if (c20Var.f23247r > 0) {
                                        ViewGroup.LayoutParams layoutParams3 = b5Var.getLayoutParams();
                                        layoutParams3.width = c20Var.f23246q;
                                        layoutParams3.height = c20Var.f23247r;
                                        jVar = b5Var;
                                    }
                                }
                            } else {
                                f10 = 1.0f;
                                if (b10 == 3) {
                                    tg.n0 g02 = g0(c20Var.N, c20Var.M);
                                    int i13 = c20Var.f23241l;
                                    if (i13 != 0) {
                                        g02.setColor(i13);
                                    }
                                    g02.setType(c20Var.f23233b);
                                    jVar = g02;
                                } else if (b10 == 8) {
                                    qb qbVar = c20Var.O;
                                    if (qbVar != null) {
                                        tg.n2 m0 = m0(qbVar);
                                        int i14 = c20Var.f23241l;
                                        if (i14 != 0) {
                                            m0.setColor(i14);
                                        }
                                        m0.setType(c20Var.f23233b);
                                        jVar = m0;
                                    } else {
                                        i10++;
                                        size = i7;
                                        z10 = false;
                                    }
                                } else if (b10 == 7) {
                                    tg.k0 f02 = f0(c20Var.W);
                                    tg.i0 i0Var = f02.f57979r0;
                                    int i15 = c20Var.f23241l;
                                    if (i15 != 0) {
                                        f02.setColor(i15);
                                    }
                                    boolean e10 = i0Var.e();
                                    int i16 = i0Var.h;
                                    int i17 = i0Var.f57922f;
                                    if (e10) {
                                        i0Var.setPreviewType(c20Var.f23233b);
                                    }
                                    byte b11 = c20Var.f23233b;
                                    if (b11 == -1) {
                                        f02.setType(3);
                                        i0Var.d();
                                        c20Var.f23246q = ((int) Math.ceil(i0Var.f57916b0)) + i17 + i17;
                                        c20Var.f23247r = ((int) Math.ceil(i0Var.f57918c0)) + i16 + i16;
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
                                    i02.s(ch.p0.d(c20Var.M.reaction), false);
                                    if (c20Var.M.flipped) {
                                        i02.r(false);
                                    }
                                    jVar = i02;
                                    if (c20Var.M.dark) {
                                        i02.q(false);
                                        jVar = i02;
                                    }
                                } else {
                                    if (b10 == 5 && d7Var.f14419o0 != null) {
                                        tg.r1 j02 = j0(d7Var.f14421p0, false);
                                        ta taVar = ((v9) this).f15617k2;
                                        ha haVar = taVar.Y0;
                                        if (haVar != null) {
                                            haVar.f15677x = j02;
                                            f61 f61Var = haVar.f15679y;
                                            if (f61Var != null) {
                                                f61Var.A0(j02.f58110v0);
                                            }
                                        }
                                        ja jaVar = taVar.f15436d1;
                                        if (jaVar != null) {
                                            jaVar.setHasRoundVideo(true);
                                        }
                                        jVar = j02;
                                        if ((c20Var.f23233b & 2) != 0) {
                                            boolean z12 = !j02.f58107s0;
                                            j02.f58107s0 = z12;
                                            j02.f58108t0.f(z12, true);
                                            j02.invalidate();
                                            jVar = j02;
                                        }
                                    }
                                    i10++;
                                    size = i7;
                                    z10 = false;
                                }
                            }
                            jVar.setX((c20Var.f23234c * this.B1) - (((f10 - c20Var.v) * c20Var.f23246q) / 2.0f));
                            jVar.setY((c20Var.d * this.C1) - (((f10 - c20Var.v) * c20Var.f23247r) / 2.0f));
                            jVar.setPosition(new PointF((c20Var.f23246q / 2.0f) + jVar.getX(), (c20Var.f23247r / 2.0f) + jVar.getY()));
                            jVar.setScale(c20Var.v);
                            jVar.setRotation((float) (((-c20Var.f23235e) / 3.141592653589793d) * 180.0d));
                            i10++;
                            size = i7;
                            z10 = false;
                        }
                    }
                    f10 = 1.0f;
                    jVar = jVar2;
                    jVar.setX((c20Var.f23234c * this.B1) - (((f10 - c20Var.v) * c20Var.f23246q) / 2.0f));
                    jVar.setY((c20Var.d * this.C1) - (((f10 - c20Var.v) * c20Var.f23247r) / 2.0f));
                    jVar.setPosition(new PointF((c20Var.f23246q / 2.0f) + jVar.getX(), (c20Var.f23247r / 2.0f) + jVar.getY()));
                    jVar.setScale(c20Var.v);
                    jVar.setRotation((float) (((-c20Var.f23235e) / 3.141592653589793d) * 180.0d));
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
            r1.g gVar = this.f14917m1;
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
            this.f14917m1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f56331i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f56323m = hVar;
            if (!this.f14940y1.c() && this.d2 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.D0.getTranslationY();
            final float alpha = this.f14916l0.getAlpha();
            final ViewGroup barView = getBarView();
            this.f14917m1.b(new r1.d() {
                @Override
                public final void a(r1.g gVar3, float f12, float f13) {
                    float f14;
                    int i7;
                    l5 l5Var = l5.this;
                    h5 h5Var = l5Var.D0;
                    float f15 = f12 / 1000.0f;
                    l5Var.n1 = f15;
                    float f16 = 1.0f;
                    float f17 = ((1.0f - f15) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY((Math.min(l5Var.n1, 0.25f) * org.telegram.messenger.g0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(l5Var.n1, 0.25f) / 0.25f));
                    s4 s4Var = l5Var.f14907g1;
                    float f18 = l5Var.n1;
                    boolean z12 = z10;
                    s4Var.B1(z12, f18);
                    tg.z0 z0Var = l5Var.f14916l0;
                    z0Var.setProgress(l5Var.n1);
                    tg.v0 v0Var = l5Var.f14914k0;
                    v0Var.setProgress(l5Var.n1);
                    l5Var.G0.setTranslationY(org.telegram.messenger.g0.L(32.0f) * l5Var.n1);
                    AnimatorSet animatorSet = l5Var.f14938x1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f19 = l5Var.n1;
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
                        h5Var.setTranslationY(translationY - (L * i7));
                    }
                    h5Var.invalidate();
                    if (view == l5Var.V0) {
                        l5Var.E0.invalidate();
                    }
                }
            });
            this.f14917m1.a(new c4(this, z10, 0));
            this.f14917m1.h();
            if (z10) {
                s4 s4Var = this.f14907g1;
                s4Var.setVisibility(0);
                s4Var.setSelectedColorIndex(sg.k0.e(this.f14922p1).d());
            }
        }
    }

    public final void G0(int i7) {
        boolean z10;
        int i10;
        tg.e1 e1Var = this.V0;
        t4 t4Var = this.f14940y1;
        if (i7 == 1) {
            ry ryVar = this.Z1;
            if (ryVar != null && ryVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ry ryVar2 = this.Z1;
            sa saVar = this.f14936w1;
            if (ryVar2 != null && ryVar2.f39345d1 != j10.f24773t0) {
                saVar.removeView(ryVar2);
                this.Z1 = null;
            }
            if (this.Z1 == null) {
                ry ryVar3 = new ry(null, true, false, false, getContext(), false, null, null, true, this.f14924q1, false, false);
                this.Z1 = ryVar3;
                ryVar3.f39413y2 = false;
                ryVar3.V0 = true;
                ryVar3.setVisibility(8);
                if (org.telegram.messenger.g0.Q1()) {
                    this.Z1.setForseMultiwindowLayout(true);
                }
                this.Z1.setDelegate(new e5(this));
                saVar.addView(this.Z1);
            }
            this.Z1.setVisibility(0);
            this.f14897a2 = true;
            ry ryVar4 = this.Z1;
            if (this.f14906f2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f14906f2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f14906f2 = mp.f1().getInt("kbd_height", org.telegram.messenger.g0.L(200.0f));
                }
            }
            if (this.f14908g2 <= 0) {
                if (org.telegram.messenger.g0.Q1()) {
                    this.f14908g2 = org.telegram.messenger.g0.L(150.0f);
                } else {
                    this.f14908g2 = mp.f1().getInt("kbd_height_land3", org.telegram.messenger.g0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.g0.f24121q;
            if (point.x > point.y) {
                i10 = this.f14908g2;
            } else {
                i10 = this.f14906f2;
            }
            int paddingUnderContainer = saVar.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ryVar4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            ryVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                tg.j jVar = this.f14929t0;
                if (jVar instanceof tg.m2) {
                    org.telegram.messenger.g0.v1(((tg.m2) jVar).getEditText());
                }
            }
            this.d2 = paddingUnderContainer;
            t4Var.a();
            requestLayout();
            yg emojiButton = e1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(wg.d, true);
            }
            if (!z10) {
                if (this.f14899b2) {
                    this.f14904e2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d2, 0.0f);
                    ofFloat.addUpdateListener(new d4(this, 1));
                    ofFloat.addListener(new v4(this, 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
                    ofFloat.start();
                }
            }
        } else {
            yg emojiButton2 = e1Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(wg.f41711e, true);
            }
            ry ryVar5 = this.Z1;
            if (ryVar5 != null) {
                this.f14897a2 = false;
                if (org.telegram.messenger.g0.D || org.telegram.messenger.g0.E) {
                    ryVar5.setVisibility(8);
                }
            }
            if (i7 == 0) {
                this.d2 = 0;
                t4Var.a();
            }
            requestLayout();
        }
        P0();
    }

    public final void H0(tg.k0 k0Var) {
        l7 l7Var = new l7(getContext(), this.f14924q1, this.Q1, new ai.v1(18, this, k0Var));
        if (k0Var != null) {
            tg.h0 h0Var = k0Var.f57983v0;
            l7Var.Y1 = true;
            org.telegram.ui.Cells.k3 k3Var = l7Var.V1;
            org.telegram.ui.Cells.k3 k3Var2 = l7Var.U1;
            if (h0Var != null) {
                l7Var.f14946c2 = h0Var.d;
                l7Var.d2 = false;
                k3Var2.setText(h0Var.f57894c);
                k3Var.setText(h0Var.f57893b);
                l7Var.f14951i2 = !TextUtils.isEmpty(h0Var.f57893b);
                l7Var.f14952j2 = h0Var.f57896f;
                l7Var.f14953k2 = h0Var.f57895e;
            } else {
                k3Var2.setText("");
                k3Var.setText("");
                l7Var.f14952j2 = true;
                l7Var.f14953k2 = false;
            }
            String M0 = gd.M0(2131744406, null);
            d dVar = l7Var.X1;
            dVar.i(M0, false, true);
            di.f0 f0Var = l7Var.T1;
            if (f0Var != null) {
                f0Var.O(false);
            }
            dVar.setEnabled(l7Var.g1(k3Var2.getText().toString()));
            l7Var.Y1 = false;
        }
        l7Var.setOnDismissListener(new n4(this, 1));
        l7Var.show();
        w0(true);
    }

    public final void I0(tg.n0 n0Var, q10 q10Var) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        si siVar = new si(getContext(), new a5(this, q10Var), false, true, false, this.f14924q1);
        siVar.X3 = new w7.s(10);
        sh shVar = siVar.f39729v3;
        if (n0Var != null && (messageMedia = n0Var.f58042v0) != null && (geoPoint = messageMedia.geo) != null) {
            siVar.f39742y4 = new double[]{geoPoint.lat, geoPoint._long};
            siVar.J1 = true;
            shVar.setVisibility(8);
        } else if (this.E1) {
            siVar.f39734w4 = this.G1;
            siVar.f39738x4 = this.F1;
            siVar.J1 = true;
            shVar.setVisibility(8);
        } else {
            siVar.J1 = true;
            shVar.setVisibility(8);
        }
        siVar.setOnDismissListener(new n4(this, 0));
        siVar.f1();
        siVar.show();
    }

    public final void J0(tg.j jVar) {
        if (jVar instanceof tg.u0) {
            org.telegram.ui.ActionBar.h1 h1Var = this.f14926r1;
            if (h1Var != null && h1Var.isShowing()) {
                this.f14926r1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.Y1;
        jVar.getLocationInWindow(iArr);
        float scaleX = jVar.getScaleX() * jVar.getWidth();
        g5 g5Var = this.B0;
        float scaleX2 = g5Var.getScaleX() * scaleX;
        float scaleY = jVar.getScaleY();
        float scaleY2 = g5Var.getScaleY() * scaleY * jVar.getHeight();
        int i7 = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i7;
        int i10 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i10;
        K0(new h4(this, jVar, 1), this, 51, i7, i10 - org.telegram.messenger.g0.L(32.0f), true);
    }

    public final void K0(Runnable runnable, l5 l5Var, int i7, int i10, int i11, boolean z10) {
        org.telegram.ui.ActionBar.h1 h1Var = this.f14926r1;
        if (h1Var != null && h1Var.isShowing()) {
            this.f14926r1.d(true);
            return;
        }
        if (this.f14928s1 == null) {
            this.f14930t1 = new Rect();
            j5 j5Var = new j5(this, getContext());
            this.f14928s1 = j5Var;
            j5Var.setAnimationEnabled(true);
            this.f14928s1.setOnTouchListener(new j4(0, this));
            this.f14928s1.setDispatchKeyEventListener(new k4(this));
            this.f14928s1.setShownFromBottom(true);
        }
        j5 j5Var2 = this.f14928s1;
        j5Var2.f14812a0 = z10;
        j5Var2.d();
        runnable.run();
        if (this.f14926r1 == null) {
            org.telegram.ui.ActionBar.h1 h1Var2 = new org.telegram.ui.ActionBar.h1(this.f14928s1, -2, -2);
            this.f14926r1 = h1Var2;
            h1Var2.f28991b = true;
            h1Var2.setAnimationStyle(2131755191);
            this.f14926r1.setOutsideTouchable(true);
            this.f14926r1.setClippingEnabled(true);
            this.f14926r1.setInputMethodMode(2);
            this.f14926r1.setSoftInputMode(0);
            this.f14926r1.getContentView().setFocusableInTouchMode(true);
            this.f14926r1.setOnDismissListener(new l4(0, this));
        }
        this.f14928s1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10000.0f), Integer.MIN_VALUE));
        this.f14926r1.setFocusable(true);
        int measuredWidth = i10 - (this.f14928s1.getMeasuredWidth() / 2);
        int measuredHeight = i11 - this.f14928s1.getMeasuredHeight();
        this.f14926r1.showAtLocation(l5Var, i7, measuredWidth, measuredHeight);
        org.telegram.ui.ActionBar.h1.i(this.f14928s1);
        Drawable mutate = getContext().getResources().getDrawable(2131232568).mutate();
        if (z10) {
            j5 j5Var3 = this.f14928s1;
            j5Var3.setBackgroundDrawable(new org.telegram.ui.Components.fa(new org.telegram.ui.Components.ga(this.O1, j5Var3, 5, false), measuredWidth, measuredHeight, mutate, org.telegram.messenger.g0.N(8.3f)));
            return;
        }
        this.f14928s1.setBackgroundDrawable(mutate);
        this.f14928s1.setBackgroundColor(-14145495);
    }

    @Override
    public final void L(int i7, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        if (i7 > org.telegram.messenger.g0.L(50.0f) && this.f14899b2 && !org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
            if (z10) {
                this.f14908g2 = i7;
                mp.f1().edit().putInt("kbd_height_land3", this.f14908g2).commit();
            } else {
                this.f14906f2 = i7;
                mp.f1().edit().putInt("kbd_height", this.f14906f2).commit();
            }
        }
        boolean z13 = this.f14897a2;
        t4 t4Var = this.f14940y1;
        if (z13) {
            if (z10) {
                i10 = this.f14908g2;
            } else {
                i10 = this.f14906f2;
            }
            int paddingUnderContainer = this.f14936w1.getPaddingUnderContainer() + i10;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = org.telegram.messenger.g0.f24121q.x;
            if (i11 != i12 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i12;
                layoutParams.height = paddingUnderContainer;
                this.Z1.setLayoutParams(layoutParams);
                this.d2 = layoutParams.height;
                t4Var.a();
                requestLayout();
            }
        }
        if (this.f14910h2 == i7 && this.f14912i2 == z10) {
            return;
        }
        this.f14910h2 = i7;
        this.f14912i2 = z10;
        boolean z14 = this.f14899b2;
        tg.j jVar = this.f14929t0;
        if (jVar instanceof tg.m2) {
            if (((tg.m2) jVar).getEditText().isFocused() && t4Var.c()) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f14899b2 = z12;
        } else {
            this.f14899b2 = false;
        }
        if (this.f14899b2 && this.f14897a2) {
            G0(0);
        }
        if (this.d2 != 0 && !(z11 = this.f14899b2) && z11 != z14 && !this.f14897a2) {
            this.d2 = 0;
            t4Var.a();
            requestLayout();
        }
        R0();
        if (z14 && !this.f14899b2 && this.d2 > 0 && this.f14904e2) {
            this.f14904e2 = false;
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
                    this.f14936w1.invalidate();
                    float f11 = this.L1;
                    if (z10) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    this.J1.setTransitionProgress(this.L1);
                    ofFloat.addUpdateListener(new d4(this, 2));
                    ofFloat.addListener(new bi.e7(12, this, z10));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(lr.f37209g);
                    ofFloat.start();
                    return;
                }
                if (this.J1.getReactionsWindow() != null) {
                    this.J1.getReactionsWindow().e();
                }
                this.J1.animate().alpha(0.0f).setDuration(150L).setListener(new v4(this, 0)).start();
            }
        }
    }

    public final void M0(boolean z10) {
        float f10;
        if (this.f14903e1 != z10) {
            this.f14903e1 = z10;
            r1.g gVar = this.f14905f1;
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
            this.f14905f1 = gVar2;
            r1.h hVar = new r1.h();
            if (!z10) {
                f11 = 0.0f;
            }
            hVar.f56331i = f11;
            hVar.b(1250.0f);
            hVar.a(1.0f);
            gVar2.f56323m = hVar;
            if (z10) {
                tg.j1 j1Var = this.W0;
                j1Var.setAlpha(0.0f);
                j1Var.setVisibility(0);
            }
            this.f14905f1.b(new fi.q7(1, this));
            this.f14905f1.a(new c4(this, z10, 1));
            this.f14905f1.h();
        }
    }

    public final PointF N0(tg.j jVar) {
        float f10;
        float f11;
        float f12 = 200.0f;
        we weVar = this.f14921p0;
        if (weVar != null) {
            f12 = 200.0f / weVar.f27678c;
        }
        float f13 = 0.2f;
        if (jVar != null) {
            PointF position = jVar.getPosition();
            float min = Math.min(jVar.getHeight(), jVar.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f14 = 100.0f;
        if (weVar != null) {
            f14 = 100.0f / weVar.f27678c;
        }
        PointF c02 = c0();
        int i7 = 0;
        while (i7 < 10) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                g5 g5Var = this.B0;
                if (i10 >= g5Var.getChildCount()) {
                    break;
                }
                View childAt = g5Var.getChildAt(i10);
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
            int i11 = this.f14922p1;
            sg.k0 e10 = sg.k0.e(i11);
            if (i7 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f57270l != z10) {
                e10.f57270l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f57261a.getInt("brush", 0), false);
                }
            }
            int c10 = sg.k0.e(i11).c();
            sg.h1 h1Var = this.f14915k1;
            h1Var.f57218a = c10;
            B0(h1Var, null, false);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.L0 = duration;
            duration.setInterpolator(lr.f37208f);
            this.L0.addUpdateListener(new fi.z2(this, viewGroup, viewGroup2, 1));
            this.L0.addListener(new y4(this, viewGroup, viewGroup2, i7, 0));
            this.L0.start();
        }
    }

    public final void P0() {
        boolean z10;
        t4 t4Var = this.f14940y1;
        tg.e1 e1Var = this.V0;
        if (e1Var != null) {
            if (t4Var.c()) {
                e1Var.a(2131231513);
            } else if (this.f14897a2) {
                e1Var.a(2131231505);
            } else {
                e1Var.a(2131232044);
            }
        }
        if (!t4Var.c() && !this.f14897a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = !z10;
        org.telegram.messenger.g0.S3(1.0f, this.Y0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.X0, z11, false);
        org.telegram.messenger.g0.S3(1.0f, this.f14896a1, z10, false);
        org.telegram.messenger.g0.S3(1.0f, this.Z0, z10, false);
    }

    @Override
    public final int Q() {
        return this.f14940y1.f15227l - this.f14936w1.getBottomPadding2();
    }

    public final void Q0() {
        float f10;
        tg.j jVar;
        ObjectAnimator objectAnimator = this.S1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.f14939y0.getParent();
        if (view == null) {
            return;
        }
        t4 t4Var = this.f14940y1;
        if (((t4Var.c() && !t4Var.d) || this.d2 > 0) && (jVar = this.f14929t0) != null) {
            f10 = view.getScaleY() * (-(jVar.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f10);
        this.S1 = ofFloat;
        ofFloat.setDuration(350L);
        this.S1.setInterpolator(lr.h);
        this.S1.start();
    }

    public final void R0() {
        throw new UnsupportedOperationException("Method not decompiled: hi.l5.R0():void");
    }

    @Override
    public final void a() {
        F0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29469h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29504j5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29654r5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29816zf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Cf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Di));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29761wi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29742vi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29780xi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29799yi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29339a7));
    }

    @Override
    public final void b() {
        setTextType((this.f14933v0 + 1) % 4);
    }

    public final void b0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new r1(2, this, view)).start();
    }

    @Override
    public final void c(int i7) {
        tg.j jVar = this.f14929t0;
        if (jVar instanceof tg.m2) {
            D0((tg.m2) jVar, i7);
            sg.k0 e10 = sg.k0.e(this.f14922p1);
            e10.f57266g = i7;
            e10.f57261a.edit().putInt("text_alignment", i7).apply();
        }
    }

    public final PointF c0() {
        g5 g5Var = this.B0;
        int measuredWidth = g5Var.getMeasuredWidth();
        int measuredHeight = g5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.C1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    public final void d0() {
        org.telegram.ui.Components.x5[] x5VarArr;
        boolean z10 = this.G1;
        g5 g5Var = this.B0;
        boolean z11 = true;
        if (!z10 && !this.I1) {
            int i7 = 0;
            loop0: while (true) {
                if (i7 < g5Var.getChildCount()) {
                    View childAt = g5Var.getChildAt(i7);
                    boolean z12 = childAt instanceof tg.m2;
                    int i10 = this.f14922p1;
                    if (z12) {
                        CharSequence text = ((tg.m2) childAt).getText();
                        if (text instanceof Spanned) {
                            for (org.telegram.ui.Components.x5 x5Var : (org.telegram.ui.Components.x5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.x5.class)) {
                                TLRPC.Document document = x5Var.document;
                                if (document == null) {
                                    document = org.telegram.ui.Components.o5.e(i10, x5Var.getDocumentId());
                                }
                                if (document != null) {
                                    org.telegram.ui.Components.o5.g(i10).e(document);
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
                    } else if (childAt instanceof tg.f2) {
                        TLRPC.Document sticker = ((tg.f2) childAt).getSticker();
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
        for (int i11 = 0; i11 < g5Var.getChildCount(); i11++) {
            View childAt2 = g5Var.getChildAt(i11);
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
        we weVar;
        int i7 = 0;
        if ((view == this.f14939y0 || view == this.f14941z0 || view == this.B0 || view == this.A0) && (weVar = this.f14921p0) != null) {
            canvas.save();
            if (!this.f14937x0) {
                i7 = org.telegram.messenger.g0.f24115m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i10 = weVar.f27683k;
            if (i10 != 90 && i10 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * weVar.f27679e)) / weVar.f27678c);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * weVar.f27680f)) / weVar.f27678c);
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
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, this.f14924q1);
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
        g5 g5Var = this.B0;
        if (g5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = g5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.k0 k0Var = new tg.k0(getContext(), N0, this.f14922p1, h0Var, f10 / 360.0f, L);
        if (N0.x == g5Var.getMeasuredWidth() / 2.0f) {
            k0Var.setStickyX(2);
        }
        if (N0.y == g5Var.getMeasuredHeight() / 2.0f) {
            k0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.f14915k1;
        if (h1Var != null && (i7 = h1Var.f57218a) != -47814) {
            k0Var.setColor(i7);
        }
        k0Var.setDelegate(this);
        k0Var.setMaxWidth(L);
        g5Var.addView(k0Var, c8.ma.c(-2.0f, -2));
        d0();
        we weVar = this.f14921p0;
        if (weVar != null) {
            k0Var.j(1.0f / weVar.f27678c);
            k0Var.f(-(weVar.f27683k + weVar.d));
        }
        return k0Var;
    }

    public final tg.n0 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        g5 g5Var = this.B0;
        if (g5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = g5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.n0 n0Var = new tg.n0(getContext(), N0, this.f14922p1, messageMedia, mediaArea, f10 / 240.0f, L);
        if (N0.x == g5Var.getMeasuredWidth() / 2.0f) {
            n0Var.setStickyX(2);
        }
        if (N0.y == g5Var.getMeasuredHeight() / 2.0f) {
            n0Var.setStickyY(2);
        }
        sg.h1 h1Var = this.f14915k1;
        if (h1Var != null && (i7 = h1Var.f57218a) != -47814) {
            n0Var.setColor(i7);
        }
        n0Var.setDelegate(this);
        n0Var.setMaxWidth(L);
        g5Var.addView(n0Var, c8.ma.c(-2.0f, -2));
        d0();
        we weVar = this.f14921p0;
        if (weVar != null) {
            n0Var.j(1.0f / weVar.f27678c);
            n0Var.f(-(weVar.f27683k + weVar.d));
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
        return this.f14939y0.c(true, false);
    }

    public View getBottomLayout() {
        return this.D0;
    }

    public View getCancelView() {
        return this.f14914k0;
    }

    public float getCropRotation() {
        we weVar = this.f14921p0;
        if (weVar != null) {
            return weVar.d + weVar.f27683k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f14916l0;
    }

    public View getEntitiesView() {
        return this.B0;
    }

    public long getLcm() {
        return this.Q0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        org.telegram.ui.Components.x5[] x5VarArr;
        g5 g5Var = this.B0;
        int childCount = g5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = g5Var.getChildAt(i7);
            if (childAt instanceof tg.f2) {
                TLRPC.Document sticker = ((tg.f2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f28417id = sticker.f28411id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof tg.m2) {
                CharSequence text = ((tg.m2) childAt).getText();
                if ((text instanceof Spanned) && (x5VarArr = (org.telegram.ui.Components.x5[]) ((Spanned) text).getSpans(0, text.length(), org.telegram.ui.Components.x5.class)) != null) {
                    for (org.telegram.ui.Components.x5 x5Var : x5VarArr) {
                        if (x5Var != null) {
                            TLRPC.Document document = x5Var.document;
                            if (document == null) {
                                document = org.telegram.ui.Components.o5.e(this.f14922p1, x5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f28417id = document.f28411id;
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
        return Arrays.asList(this.f14939y0, this.f14941z0, this.B0, this.A0);
    }

    public View getRenderInputView() {
        return this.f14941z0;
    }

    public sg.u0 getRenderView() {
        return this.f14939y0;
    }

    public tg.j getSelectedEntity() {
        return this.f14929t0;
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
        vt0 vt0Var;
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
        g5 g5Var = this.B0;
        if (i7 > 0) {
            float floor = (float) Math.floor(Math.max(this.B1, g5Var.getMeasuredWidth()) * 0.5d);
            vt0Var = new vt0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.C1, g5Var.getMeasuredHeight()) * 0.5d);
            vt0Var = new vt0(f10 * floor2, floor2);
        }
        vt0 vt0Var2 = vt0Var;
        Pair N0 = org.telegram.messenger.g0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f11 = vt0Var2.f41433a;
            vt0Var2.f41433a = vt0Var2.f41434b;
            vt0Var2.f41434b = f11;
        }
        Context context = getContext();
        PointF c02 = c0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        tg.n1 n1Var = new tg.n1(context, c02, vt0Var2, str, intValue);
        n1Var.setDelegate(this);
        g5Var.addView(n1Var);
        d0();
        return n1Var;
    }

    @Override
    public final boolean i(MotionEvent motionEvent) {
        if (this.W1) {
            return false;
        }
        if (this.f14929t0 != null) {
            A0(null, true);
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x10, y10);
        this.f14939y0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final tg.q1 i0(boolean z10) {
        String str;
        vt0 vt0Var = new vt0(org.telegram.messenger.g0.L(106.0f), org.telegram.messenger.g0.L(106.0f));
        PointF c02 = c0();
        g5 g5Var = this.B0;
        if (g5Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i7 = 0; i7 < g5Var.getChildCount(); i7++) {
                    View childAt = g5Var.getChildAt(i7);
                    if (a8.w9.a(c02.x, c02.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < org.telegram.messenger.g0.L(6.0f)) {
                        break;
                    }
                }
                c02.x = (g5Var.getMeasuredWidth() * 0.05f) + c02.x;
                c02.y = (g5Var.getMeasuredHeight() * 0.05f) + c02.y;
                c02.x = Utilities.i(c02.x, g5Var.getMeasuredWidth(), 0.0f);
                c02.y = Utilities.i(c02.y, g5Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? jVar = new tg.j(getContext(), c02);
        jVar.f58094s0 = new fi.l8(jVar);
        jVar.f58095t0 = new fi.l8(jVar);
        jVar.f58096u0 = new ch.g0(jVar);
        jVar.f58097v0 = new ch.g0(jVar);
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6((View) jVar);
        jVar.f58099x0 = c6Var;
        org.telegram.ui.Components.c6 c6Var2 = new org.telegram.ui.Components.c6((View) jVar);
        jVar.f58100y0 = c6Var2;
        jVar.A0 = 1.0f;
        jVar.f58093r0 = vt0Var;
        c6Var2.e(true, 1.0f);
        c6Var.e(true, 1.0f);
        ArrayList arrayList = ri.d0(j10.f24773t0).h;
        ch.g0 g0Var = jVar.f58096u0;
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
        jVar.f58098w0 = b10;
        g0Var.e(b10);
        jVar.k();
        jVar.setDelegate(this);
        g5Var.addView(jVar);
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
        g5 g5Var = this.B0;
        int measuredWidth = g5Var.getMeasuredWidth();
        g5Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.B1;
        }
        float floor = (float) Math.floor(0.43f * f10);
        vt0 vt0Var = new vt0(floor, floor);
        tg.r1 r1Var = new tg.r1(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - org.telegram.messenger.g0.L(16.0f), (vt0Var.f41434b / 2.0f) + org.telegram.messenger.g0.L(72.0f)), vt0Var, str);
        r1Var.setDelegate(this);
        g5Var.addView(r1Var);
        d0();
        if (z10) {
            y0(r1Var);
            post(new y3(this, r1Var, 0));
        }
        this.X1 = false;
        return r1Var;
    }

    public final c5 k0(Object obj, TLRPC.Document document) {
        float f10;
        for (int i7 = 0; i7 < document.attributes.size() && !(document.attributes.get(i7) instanceof TLRPC.TL_documentAttributeSticker); i7++) {
        }
        float f11 = 0.75f;
        we weVar = this.f14921p0;
        if (weVar != null) {
            f10 = -(weVar.f27683k + weVar.d);
            f11 = 0.75f / weVar.f27678c;
        } else {
            f10 = 0.0f;
        }
        k5 k5Var = new k5(c0(), f11, f10);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().f41433a * 0.5d);
        c5 c5Var = new c5(this, context, k5Var.f14866a, k5Var.f14868c, k5Var.f14867b, new vt0(floor, floor), document, obj);
        boolean C4 = fj.C4(document);
        ImageReceiver imageReceiver = c5Var.f57847y0;
        if (C4) {
            imageReceiver.f22656p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.E0(12);
        c5Var.setDelegate(this);
        this.B0.addView(c5Var);
        d0();
        return c5Var;
    }

    public final tg.m2 l0(boolean z10) {
        vt0 paintingSize = getPaintingSize();
        PointF N0 = N0(null);
        tg.m2 m2Var = new tg.m2(getContext(), N0, (int) (paintingSize.f41433a / 9.0f), "", this.f14915k1, this.f14933v0);
        float f10 = paintingSize.f41433a / 9.0f;
        i4 i4Var = new i4(this, 0);
        m2Var.f58033x0 = (int) (0.5f * f10);
        m2Var.f58034y0 = (int) (f10 * 2.0f);
        m2Var.f58035z0 = i4Var;
        float f11 = N0.x;
        g5 g5Var = this.B0;
        if (f11 == g5Var.getMeasuredWidth() / 2.0f) {
            m2Var.setStickyX(2);
        }
        if (N0.y == g5Var.getMeasuredHeight() / 2.0f) {
            m2Var.setStickyY(2);
        }
        m2Var.setDelegate(this);
        m2Var.setMaxWidth(this.B1 - org.telegram.messenger.g0.L(32.0f));
        int i7 = this.f14922p1;
        m2Var.setTypeface(sg.k0.e(i7).f57268j);
        m2Var.setType(sg.k0.e(i7).h);
        g5Var.addView(m2Var, c8.ma.c(-2.0f, -2));
        d0();
        we weVar = this.f14921p0;
        if (weVar != null) {
            m2Var.j(1.0f / weVar.f27678c);
            m2Var.f(-(weVar.f27683k + weVar.d));
        }
        if (z10) {
            y0(m2Var);
            m2Var.q();
            A0(m2Var, false);
            m2Var.getFocusedView().requestFocus();
            org.telegram.messenger.g0.I3(m2Var.getFocusedView());
            this.f14931u0 = true;
            int i10 = sg.k0.e(i7).f57266g;
            tg.e1 e1Var = this.V0;
            e1Var.d(i10, true);
            e1Var.setOutlineType(sg.k0.e(i7).h);
        }
        return m2Var;
    }

    public final tg.n2 m0(qb qbVar) {
        int measuredWidth;
        int i7;
        this.V1 = true;
        getPaintingSize();
        PointF N0 = N0(null);
        g5 g5Var = this.B0;
        if (g5Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.B1;
        } else {
            measuredWidth = g5Var.getMeasuredWidth();
        }
        float f10 = measuredWidth;
        int L = ((int) f10) - org.telegram.messenger.g0.L(58.0f);
        tg.n2 n2Var = new tg.n2(getContext(), N0, this.f14922p1, qbVar, f10 / 240.0f, L);
        if (N0.x == g5Var.getMeasuredWidth() / 2.0f) {
            n2Var.setStickyX(2);
        }
        if (N0.y == g5Var.getMeasuredHeight() / 2.0f) {
            n2Var.setStickyY(2);
        }
        sg.h1 h1Var = this.f14915k1;
        if (h1Var != null && (i7 = h1Var.f57218a) != -47814) {
            n2Var.setColor(i7);
        }
        n2Var.setDelegate(this);
        n2Var.setMaxWidth(L);
        g5Var.addView(n2Var, c8.ma.c(-2.0f, -2));
        d0();
        we weVar = this.f14921p0;
        if (weVar != null) {
            n2Var.j(1.0f / weVar.f27678c);
            n2Var.f(-(weVar.f27683k + weVar.d));
        }
        return n2Var;
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
            g5 g5Var = this.B0;
            if (i7 < g5Var.getChildCount()) {
                View childAt = g5Var.getChildAt(i7);
                if (childAt instanceof tg.r1) {
                    if (this.f14929t0 == childAt) {
                        A0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(lr.h).withEndAction(new y3(this, (tg.r1) childAt, 1)).start();
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
        vi0 vi0Var = this.J1;
        if (vi0Var != null) {
            org.telegram.messenger.g0.E2(vi0Var);
            this.J1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float currentActionBarHeight;
        float f10;
        float f11;
        this.f14923q0 = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.g0.f24121q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.g0.L(48.0f);
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
        float f12 = this.f14925r0.f41433a;
        tg.j jVar = this.f14929t0;
        if (jVar != null) {
            jVar.m();
        }
        measureChild(this.D0, i7, i10);
        measureChild(this.N0, i7, i10);
        measureChild(this.F0, i7, i10);
        measureChild(this.E0, i7, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.d2 - this.f14936w1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.C0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.g0.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i7, i10);
        this.f14923q0 = false;
        if (org.telegram.messenger.g0.L(20.0f) >= 0 && !this.f14897a2 && !this.f14901c2) {
            this.f14923q0 = true;
            t0();
            this.f14923q0 = false;
        }
        if (org.telegram.messenger.g0.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override
    public final boolean p() {
        return !(this.f14929t0 instanceof tg.u0);
    }

    public final tg.u0 p0() {
        int i7 = 0;
        while (true) {
            g5 g5Var = this.B0;
            if (i7 < g5Var.getChildCount()) {
                View childAt = g5Var.getChildAt(i7);
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
        return !this.f14931u0;
    }

    public final android.graphics.Bitmap q0(java.util.ArrayList r39, boolean r40, boolean r41, boolean r42, boolean r43, hi.d7 r44) {
        throw new UnsupportedOperationException("Method not decompiled: hi.l5.q0(java.util.ArrayList, boolean, boolean, boolean, boolean, hi.d7):android.graphics.Bitmap");
    }

    public final boolean r0() {
        if (!this.f14918n0.a() && !this.V1) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.f14923q0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(boolean z10) {
        if (this.f14897a2) {
            G0(0);
        }
        if (z10) {
            ry ryVar = this.Z1;
            if (ryVar != null && ryVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Z1.getMeasuredHeight());
                ofFloat.addUpdateListener(new d4(this, 0));
                this.f14901c2 = true;
                ofFloat.addListener(new v4(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.j1.f29019w);
                ofFloat.start();
                return;
            }
            t0();
        }
    }

    public void setBlurManager(org.telegram.ui.Components.ca caVar) {
        this.O1 = caVar;
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
            g5 g5Var = this.B0;
            if (i7 < g5Var.getChildCount()) {
                View childAt = g5Var.getChildAt(i7);
                if (childAt instanceof tg.f2) {
                    ImageReceiver imageReceiver = ((tg.f2) childAt).f57847y0;
                    mh0 B = imageReceiver.B();
                    imageReceiver.m();
                    if (B != null) {
                        B.N(Math.round(((((float) j3) % ((float) B.r())) / ((float) B.r())) * B.f37486e[0]), true, false);
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
        this.f14934v1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.f14932u1 = runnable;
    }

    @Override
    public final void t() {
        if (!this.f14899b2 && !this.f14897a2) {
            this.V1 = true;
            l0(true);
            return;
        }
        if (this.f14897a2) {
            tg.j jVar = this.f14929t0;
            if (jVar instanceof tg.m2) {
                this.f14940y1.f15221e = true;
                org.telegram.messenger.g0.I3(((tg.m2) jVar).getEditText());
            }
        }
        G0(!this.f14897a2 ? 1 : 0);
    }

    public final void t0() {
        ry ryVar;
        if (!this.f14897a2 && (ryVar = this.Z1) != null && ryVar.getVisibility() != 8) {
            this.Z1.setVisibility(8);
        }
        int i7 = this.d2;
        this.d2 = 0;
        if (i7 != 0) {
            this.f14940y1.a();
        }
    }

    @Override
    public final boolean u(tg.j jVar) {
        return A0(jVar, true);
    }

    @Override
    public final void updateColors() {
        this.f14920o1.setColor(-15132391);
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        View view;
        View view2 = (View) this.f14939y0.getParent();
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
            if (this.J1.getReactionsWindow() != null && !this.J1.getReactionsWindow().f5311q) {
                this.J1.e();
                return true;
            }
            L0(false);
            return true;
        } else if (this.l1) {
            F0(false);
            return true;
        } else if (this.f14897a2) {
            s0(true);
            return true;
        } else if (!this.f14931u0) {
            return false;
        } else {
            if (this.f14935w0) {
                this.f14935w0 = false;
                this.f14940y1.b(true);
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
        f5 f5Var = this.f14939y0;
        if (f5Var.getCurrentBrush() instanceof sg.g) {
            this.M0 = true;
        }
        f5Var.setBrush(hVar);
        sg.h1 h1Var = this.f14915k1;
        int i7 = h1Var.f57218a;
        h1Var.f57218a = sg.k0.e(this.f14922p1).c();
        h1Var.f57220c = this.O0.get();
        B0(h1Var, Integer.valueOf(i7), false);
        this.f14941z0.invalidate();
    }

    public abstract void w0(boolean z10);

    @Override
    public final sg.k0 x() {
        return sg.k0.e(this.f14922p1);
    }

    public final void x0() {
        final int i7 = this.I0;
        O0(1);
        postDelayed(new ai.o(this, 18), 350L);
        z4 z4Var = new z4(this, getContext(), this.f14924q1, i7);
        this.U1 = z4Var;
        sa saVar = this.f14936w1;
        Objects.requireNonNull(saVar);
        z4Var.f14806x1 = new bi.b(saVar, 29);
        final boolean[] zArr = {true};
        z4Var.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                l5 l5Var = l5.this;
                l5Var.U1 = null;
                if (zArr[0]) {
                    l5Var.w0(false);
                }
                l5Var.O0(i7);
            }
        });
        z4Var.f14808z1 = new k4(this);
        z4Var.O0(new q4(this, zArr, z4Var, 0));
        z4Var.show();
        w0(true);
    }

    public final void y0(tg.j jVar) {
        this.f14918n0.b(jVar.getUUID(), new h4(this, jVar, 0));
    }

    public final void z0(tg.j jVar) {
        tg.j jVar2 = this.f14929t0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f57963n0, false);
            A0(null, true);
            if (jVar instanceof tg.m2) {
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
            sg.k1 k1Var = this.f14918n0;
            k1Var.f57272b.remove(uuid);
            k1Var.f57273c.remove(uuid);
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(k1Var, 14));
        }
        tg.m1 m1Var = this.N0;
        w4 w4Var = this.O0;
        m1Var.setValueOverride(w4Var);
        m1Var.setShowPreview(true);
        float f10 = w4Var.get();
        sg.h1 h1Var = this.f14915k1;
        h1Var.f57220c = f10;
        B0(h1Var, null, false);
        if (!this.X1 && (jVar instanceof tg.r1)) {
            ta taVar = ((v9) this).f15617k2;
            ha haVar = taVar.Y0;
            if (haVar != null) {
                haVar.s(null, null, true);
            }
            v9 v9Var = taVar.f15495w1;
            if (v9Var != null) {
                v9Var.n0();
            }
            ja jaVar = taVar.f15436d1;
            if (jaVar != null) {
                jaVar.setHasRoundVideo(false);
            }
            d7 d7Var = taVar.L1;
            if (d7Var != null) {
                File file = d7Var.f14419o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    taVar.L1.f14419o0 = null;
                }
                if (taVar.L1.f14421p0 != null) {
                    try {
                        new File(taVar.L1.f14421p0).delete();
                    } catch (Exception unused2) {
                    }
                    taVar.L1.f14421p0 = null;
                }
            }
        }
    }

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f10) {
    }
}
