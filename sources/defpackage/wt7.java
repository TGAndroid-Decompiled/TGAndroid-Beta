package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
public abstract class wt7 extends dja implements js7, j34, fs7, bja, p7b {
    public boolean A0;
    public Runnable A1;
    public int B0;
    public Runnable B1;
    public boolean C0;
    public final s7b C1;
    public final boolean D0;
    public AnimatorSet D1;
    public final rt7 E0;
    public final jt7 E1;
    public final sb F0;
    public f4b F1;
    public final ht7 G0;
    public ArrayList G1;
    public final st7 H0;
    public int H1;
    public final FrameLayout I0;
    public int I1;
    public final tt7 J0;
    public yl2 J1;
    public final ht7 K0;
    public final boolean K1;
    public final FrameLayout L0;
    public final File L1;
    public f7 M0;
    public final boolean M1;
    public final View N0;
    public final boolean N1;
    public int O0;
    public boolean O1;
    public int P0;
    public t09 P1;
    public float Q0;
    public e09 Q1;
    public ValueAnimator R0;
    public float R1;
    public boolean S0;
    public boolean S1;
    public final zt7 T0;
    public boolean T1;
    public final gi3 U0;
    public sl0 U1;
    public final int V0;
    public final n00 V1;
    public BigInteger W0;
    public final i7b W1;
    public TextView X0;
    public boolean X1;
    public TextView Y0;
    public ObjectAnimator Y1;
    public TextView Z0;
    public boolean Z1;
    public final ks7 a1;
    public final yb1 a2;
    public final hs7 b1;
    public final f4b b2;
    public final ss7 c1;
    public final pj4 c2;
    public final ImageView d1;
    public final float[] d2;
    public final TextView e1;
    public mt7 e2;
    public final TextView f1;
    public boolean f2;
    public final TextView g1;
    public boolean g2;
    public final Paint h1;
    public boolean h2;
    public final Paint i1;
    public final int[] i2;
    public float j1;
    public t14 j2;
    public boolean k1;
    public boolean k2;
    public yla l1;
    public boolean l2;
    public final it7 m1;
    public boolean m2;
    public final Paint n1;
    public int n2;
    public final Paint o1;
    public boolean o2;
    public final Paint p1;
    public int p2;
    public final xr7 q0;
    public final mcb q1;
    public int q2;
    public final cs7 r0;
    public boolean r1;
    public int r2;
    public final Bitmap s0;
    public yla s1;
    public boolean s2;
    public final b5c t0;
    public float t1;
    public final do3 u0;
    public final Paint u1;
    public final zl6 v0;
    public final int v1;
    public boolean w0;
    public final si5 w1;
    public via x0;
    public m8 x1;
    public boolean y0;
    public vt7 y1;
    public l34 z0;
    public Rect z1;

    public wt7(Context context, boolean z, File file, boolean z2, boolean z3, s7b s7bVar, Activity activity, final int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, f4b f4bVar, int i3, int i4, zl6 zl6Var, sl0 sl0Var, f53 f53Var, n00 n00Var, i7b i7bVar) {
        super(context, activity);
        gu7 gu7Var;
        sl0 sl0Var2;
        this.O0 = 0;
        this.P0 = -1;
        final x6b x6bVar = (x6b) this;
        gi3 gi3Var = new gi3(x6bVar);
        this.U0 = gi3Var;
        Paint paint = new Paint(1);
        this.h1 = paint;
        Paint paint2 = new Paint(1);
        this.i1 = paint2;
        this.n1 = new Paint(1);
        this.o1 = new Paint(1);
        Paint paint3 = new Paint(1);
        this.p1 = paint3;
        mcb mcbVar = new mcb(1.0f, 0.016773745f, -1);
        this.q1 = mcbVar;
        this.u1 = new Paint(1);
        pj4 pj4Var = new pj4(x6bVar, (byte) 20);
        this.c2 = pj4Var;
        this.d2 = new float[2];
        this.g2 = false;
        this.i2 = new int[2];
        new bg7(x6bVar, (byte) 3);
        setDelegate(this);
        this.U1 = sl0Var;
        this.V1 = n00Var;
        this.K1 = z;
        this.L1 = file;
        this.M1 = z2;
        this.N1 = z3;
        this.C1 = s7bVar;
        this.H1 = i3;
        this.I1 = i4;
        this.W1 = i7bVar;
        this.v1 = i;
        if (z2 && !z3 && f4bVar != null && f4bVar.L != null && !f4bVar.v()) {
            this.b2 = f4bVar;
            File file2 = f4bVar.L;
            yb1 yb1Var = (file2 != null && file2.exists() && DictationAsr.C(i)) ? new yb1(file2, pj4Var) : null;
            this.a2 = yb1Var;
            if (yb1Var != null) {
                yb1Var.d = new xs7(x6bVar, (byte) 0);
            }
        }
        si5 si5Var = new si5(f53Var);
        this.w1 = si5Var;
        this.v0 = zl6Var;
        this.D0 = context instanceof BubbleActivity;
        k38 e = k38.e(i);
        e.i(0, true);
        mcbVar.a = e.c();
        mcbVar.c = e.i;
        do3 do3Var = new do3("Paint", true);
        this.u0 = do3Var;
        this.s0 = bitmap;
        this.V0 = i2;
        b5c b5cVar = new b5c();
        this.t0 = b5cVar;
        b5cVar.a = new im6(x6bVar, (byte) 20);
        View view = new View(context);
        this.N0 = view;
        view.setVisibility(8);
        view.setBackgroundColor(1291845632);
        view.setAlpha(0.0f);
        gu7 gu7Var2 = new gu7(getPaintingSize(), null, i2, sl0Var);
        if (f4bVar == null || !f4bVar.u) {
            gu7Var = gu7Var2;
            sl0Var2 = sl0Var;
        } else {
            gu7Var = gu7Var2;
            sl0Var2 = null;
        }
        rt7 rt7Var = new rt7(x6bVar, context, gu7Var, bitmap, bitmap2, sl0Var2);
        this.E0 = rt7Var;
        rt7Var.setDelegate(new z24(x6bVar, (byte) 21));
        rt7Var.setUndoStore(b5cVar);
        rt7Var.setQueue(do3Var);
        rt7Var.setVisibility(4);
        sb sbVar = new sb((byte) 22, context, x6bVar);
        this.F0 = sbVar;
        sbVar.setVisibility(4);
        st7 st7Var = new st7(x6bVar, context, new s34(x6bVar, (byte) 20));
        this.H0 = st7Var;
        this.F1 = f4bVar;
        this.G1 = arrayList;
        if (this.H1 > 0 && this.I1 > 0) {
            H0();
        }
        st7Var.setVisibility(4);
        this.G0 = new ht7(x6bVar, context, (byte) 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.I0 = frameLayout;
        frameLayout.setPadding(gl.L(4.0f), gl.L(12.0f), gl.L(4.0f), gl.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(frameLayout, nme.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.d1 = imageView;
        imageView.setImageResource(2131232536);
        imageView.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
        imageView.setBackground(bkb.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                x6b x6bVar2 = x6bVar;
                switch (b) {
                    case 0:
                        if (x6bVar2.r1) {
                            x6bVar2.I0(false);
                            return;
                        } else if (x6bVar2.k2) {
                            x6bVar2.s0(true);
                            return;
                        } else if (x6bVar2.A0) {
                            x6bVar2.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = x6bVar2.B1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        rt7 rt7Var2 = x6bVar2.E0;
                        if (rt7Var2 != null && (rt7Var2.getCurrentBrush() instanceof l01)) {
                            rt7Var2.b();
                            x6bVar2.a1.setSelectedIndex(1);
                            x6bVar2.s((m01) m01.a.get(0));
                            return;
                        }
                        x6bVar2.t0.c();
                        return;
                    case 2:
                        rt7 rt7Var3 = x6bVar2.E0;
                        b5c b5cVar2 = x6bVar2.t0;
                        if (b5cVar2.a()) {
                            if (rt7Var3 != null && (rt7Var3.getCurrentBrush() instanceof l01)) {
                                rt7Var3.b();
                                x6bVar2.a1.setSelectedIndex(1);
                                x6bVar2.s((m01) m01.a.get(0));
                            }
                            if (rt7Var3 != null) {
                                rt7Var3.a();
                            }
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            x6bVar2.H0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        l34 l34Var = x6bVar2.z0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (x6bVar2.k2) {
                            x6bVar2.s0(false);
                        }
                        x6bVar2.B0(x6bVar2.z0);
                        x6bVar2.D0(null, true);
                        return;
                    default:
                        x6bVar2.D0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, nme.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(bkb.f0(822083583, 7, -1));
        linearLayout.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(k96.M0(2131747074, null));
        linearLayout.addView(tb4.k(context, 2131232537), nme.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, nme.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new x00((byte) 12));
        frameLayout.addView(linearLayout, nme.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.e1 = textView2;
        textView2.setBackground(bkb.f0(822083583, 7, -1));
        textView2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        textView2.setText(k96.M0(2131747086, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(gl.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                x6b x6bVar2 = x6bVar;
                switch (b) {
                    case 0:
                        if (x6bVar2.r1) {
                            x6bVar2.I0(false);
                            return;
                        } else if (x6bVar2.k2) {
                            x6bVar2.s0(true);
                            return;
                        } else if (x6bVar2.A0) {
                            x6bVar2.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = x6bVar2.B1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        rt7 rt7Var2 = x6bVar2.E0;
                        if (rt7Var2 != null && (rt7Var2.getCurrentBrush() instanceof l01)) {
                            rt7Var2.b();
                            x6bVar2.a1.setSelectedIndex(1);
                            x6bVar2.s((m01) m01.a.get(0));
                            return;
                        }
                        x6bVar2.t0.c();
                        return;
                    case 2:
                        rt7 rt7Var3 = x6bVar2.E0;
                        b5c b5cVar2 = x6bVar2.t0;
                        if (b5cVar2.a()) {
                            if (rt7Var3 != null && (rt7Var3.getCurrentBrush() instanceof l01)) {
                                rt7Var3.b();
                                x6bVar2.a1.setSelectedIndex(1);
                                x6bVar2.s((m01) m01.a.get(0));
                            }
                            if (rt7Var3 != null) {
                                rt7Var3.a();
                            }
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            x6bVar2.H0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        l34 l34Var = x6bVar2.z0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (x6bVar2.k2) {
                            x6bVar2.s0(false);
                        }
                        x6bVar2.B0(x6bVar2.z0);
                        x6bVar2.D0(null, true);
                        return;
                    default:
                        x6bVar2.D0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l = ug8.l(frameLayout, textView2, nme.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f1 = l;
        l.setBackground(bkb.f0(822083583, 7, -1));
        l.setText(k96.M0(2131752089, null));
        l.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        l.setGravity(16);
        l.setTextColor(-1);
        l.setTypeface(gl.o());
        l.setTextSize(1, 16.0f);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                x6b x6bVar2 = x6bVar;
                switch (b) {
                    case 0:
                        if (x6bVar2.r1) {
                            x6bVar2.I0(false);
                            return;
                        } else if (x6bVar2.k2) {
                            x6bVar2.s0(true);
                            return;
                        } else if (x6bVar2.A0) {
                            x6bVar2.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = x6bVar2.B1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        rt7 rt7Var2 = x6bVar2.E0;
                        if (rt7Var2 != null && (rt7Var2.getCurrentBrush() instanceof l01)) {
                            rt7Var2.b();
                            x6bVar2.a1.setSelectedIndex(1);
                            x6bVar2.s((m01) m01.a.get(0));
                            return;
                        }
                        x6bVar2.t0.c();
                        return;
                    case 2:
                        rt7 rt7Var3 = x6bVar2.E0;
                        b5c b5cVar2 = x6bVar2.t0;
                        if (b5cVar2.a()) {
                            if (rt7Var3 != null && (rt7Var3.getCurrentBrush() instanceof l01)) {
                                rt7Var3.b();
                                x6bVar2.a1.setSelectedIndex(1);
                                x6bVar2.s((m01) m01.a.get(0));
                            }
                            if (rt7Var3 != null) {
                                rt7Var3.a();
                            }
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            x6bVar2.H0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        l34 l34Var = x6bVar2.z0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (x6bVar2.k2) {
                            x6bVar2.s0(false);
                        }
                        x6bVar2.B0(x6bVar2.z0);
                        x6bVar2.D0(null, true);
                        return;
                    default:
                        x6bVar2.D0(null, true);
                        return;
                }
            }
        });
        l.setAlpha(0.0f);
        l.setVisibility(8);
        TextView l2 = ug8.l(frameLayout, l, nme.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.g1 = l2;
        l2.setBackground(bkb.f0(822083583, 7, -1));
        l2.setText(k96.M0(2131751342, null));
        l2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        l2.setGravity(16);
        l2.setTextColor(-1);
        l2.setTypeface(gl.o());
        l2.setTextSize(1, 16.0f);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                x6b x6bVar2 = x6bVar;
                switch (b) {
                    case 0:
                        if (x6bVar2.r1) {
                            x6bVar2.I0(false);
                            return;
                        } else if (x6bVar2.k2) {
                            x6bVar2.s0(true);
                            return;
                        } else if (x6bVar2.A0) {
                            x6bVar2.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = x6bVar2.B1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        rt7 rt7Var2 = x6bVar2.E0;
                        if (rt7Var2 != null && (rt7Var2.getCurrentBrush() instanceof l01)) {
                            rt7Var2.b();
                            x6bVar2.a1.setSelectedIndex(1);
                            x6bVar2.s((m01) m01.a.get(0));
                            return;
                        }
                        x6bVar2.t0.c();
                        return;
                    case 2:
                        rt7 rt7Var3 = x6bVar2.E0;
                        b5c b5cVar2 = x6bVar2.t0;
                        if (b5cVar2.a()) {
                            if (rt7Var3 != null && (rt7Var3.getCurrentBrush() instanceof l01)) {
                                rt7Var3.b();
                                x6bVar2.a1.setSelectedIndex(1);
                                x6bVar2.s((m01) m01.a.get(0));
                            }
                            if (rt7Var3 != null) {
                                rt7Var3.a();
                            }
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            x6bVar2.H0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        l34 l34Var = x6bVar2.z0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (x6bVar2.k2) {
                            x6bVar2.s0(false);
                        }
                        x6bVar2.B0(x6bVar2.z0);
                        x6bVar2.D0(null, true);
                        return;
                    default:
                        x6bVar2.D0(null, true);
                        return;
                }
            }
        });
        l2.setAlpha(0.0f);
        l2.setVisibility(8);
        frameLayout.addView(l2, nme.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        tt7 tt7Var = new tt7(x6bVar, context, e);
        this.J0 = tt7Var;
        tt7Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), 0);
        tt7Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(tt7Var, nme.e(-1, 104, 80));
        ks7 ks7Var = new ks7(context, (f4bVar == null || f4bVar.v() || f4bVar.u || sl0Var == null) ? false : true);
        this.a1 = ks7Var;
        ks7Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        ks7Var.setDelegate(this);
        ks7Var.setSelectedIndex(1);
        tt7Var.addView(ks7Var, nme.c(48.0f, -1));
        hs7 hs7Var = new hs7(context);
        this.b1 = hs7Var;
        hs7Var.setPadding(gl.L(16.0f), 0, gl.L(8.0f), 0);
        hs7Var.setVisibility(8);
        hs7Var.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                int i5 = i;
                x6b x6bVar2 = x6bVar;
                switch (b) {
                    case 0:
                        mcb mcbVar2 = x6bVar2.q1;
                        x6bVar2.F0(mcbVar2);
                        k38.e(i5).j(mcbVar2.c);
                        return;
                    default:
                        x6bVar2.b1.setTypeface(k38.e(i5).j);
                        return;
                }
            }
        });
        hs7Var.setAlignment(k38.e(i).g);
        tt7Var.addView(hs7Var, nme.c(48.0f, -1));
        ht7 ht7Var = new ht7(x6bVar, context, (byte) 0);
        this.K0 = ht7Var;
        addView(ht7Var, nme.c(-1.0f, -1));
        ss7 ss7Var = new ss7(context);
        this.c1 = ss7Var;
        ss7Var.setVisibility(8);
        ss7Var.setOnItemClickListener(new bf4(x6bVar, (byte) 15));
        hs7Var.setTypefaceListView(ss7Var);
        ht7Var.addView(ss7Var, nme.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(352321535);
        paint2.setColor(bkb.v0(bkb.F8, si5Var));
        it7 it7Var = new it7(x6bVar, context);
        this.m1 = it7Var;
        it7Var.setVisibility(8);
        it7Var.setColorPalette(k38.e(i));
        it7Var.setColorListener(new gw(x6bVar, (byte) 11));
        tt7Var.addView(it7Var, nme.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        xr7 xr7Var = new xr7(context);
        this.q0 = xr7Var;
        xr7Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        xr7Var.setBackground(bkb.f0(1090519039, 1, -1));
        tt7Var.addView(xr7Var, nme.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        xr7Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b = r2;
                x6b x6bVar2 = x6bVar;
                switch (b) {
                    case 0:
                        if (x6bVar2.r1) {
                            x6bVar2.I0(false);
                            return;
                        } else if (x6bVar2.k2) {
                            x6bVar2.s0(true);
                            return;
                        } else if (x6bVar2.A0) {
                            x6bVar2.D0(null, true);
                            return;
                        } else {
                            Runnable runnable = x6bVar2.B1;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    case 1:
                        rt7 rt7Var2 = x6bVar2.E0;
                        if (rt7Var2 != null && (rt7Var2.getCurrentBrush() instanceof l01)) {
                            rt7Var2.b();
                            x6bVar2.a1.setSelectedIndex(1);
                            x6bVar2.s((m01) m01.a.get(0));
                            return;
                        }
                        x6bVar2.t0.c();
                        return;
                    case 2:
                        rt7 rt7Var3 = x6bVar2.E0;
                        b5c b5cVar2 = x6bVar2.t0;
                        if (b5cVar2.a()) {
                            if (rt7Var3 != null && (rt7Var3.getCurrentBrush() instanceof l01)) {
                                rt7Var3.b();
                                x6bVar2.a1.setSelectedIndex(1);
                                x6bVar2.s((m01) m01.a.get(0));
                            }
                            if (rt7Var3 != null) {
                                rt7Var3.a();
                            }
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            x6bVar2.H0.removeAllViews();
                            return;
                        }
                        return;
                    case 3:
                        l34 l34Var = x6bVar2.z0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (x6bVar2.k2) {
                            x6bVar2.s0(false);
                        }
                        x6bVar2.B0(x6bVar2.z0);
                        x6bVar2.D0(null, true);
                        return;
                    default:
                        x6bVar2.D0(null, true);
                        return;
                }
            }
        });
        cs7 cs7Var = new cs7(context);
        this.r0 = cs7Var;
        cs7Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        cs7Var.setBackground(bkb.f0(1090519039, 1, -1));
        cs7Var.setOnClickListener(new hu4(x6bVar, context, e, (byte) 11));
        tt7Var.addView(cs7Var, nme.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        zt7 zt7Var = new zt7(context);
        this.T0 = zt7Var;
        zt7Var.setColorSwatch(mcbVar);
        zt7Var.setRenderView(rt7Var);
        zt7Var.setValueOverride(gi3Var);
        mcbVar.c = gi3Var.get();
        zt7Var.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                byte b = r3;
                int i5 = i;
                x6b x6bVar2 = x6bVar;
                switch (b) {
                    case 0:
                        mcb mcbVar2 = x6bVar2.q1;
                        x6bVar2.F0(mcbVar2);
                        k38.e(i5).j(mcbVar2.c);
                        return;
                    default:
                        x6bVar2.b1.setTypeface(k38.e(i5).j);
                        return;
                }
            }
        });
        addView(zt7Var, nme.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L0 = frameLayout2;
        addView(frameLayout2, nme.c(-1.0f, -1));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(gl.L(2.0f));
        E0(mcbVar, null, false);
        s((m01) m01.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = gl.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), gl.L(100.0f), (int) (point.y * 0.65d))));
        }
        this.E1 = new jt7(x6bVar, s7bVar, new x15(x6bVar, s7bVar, (byte) 14));
        ew3.C1 = 1;
    }

    public static void G0(vhb vhbVar, int i) {
        int i2;
        vhbVar.setAlign(i);
        int i3 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 19;
            } else {
                i2 = 21;
            }
        } else {
            i2 = 17;
        }
        vhbVar.getEditText().setGravity(i2);
        if (i != 1) {
            boolean z = k96.a0;
            if (i == 2 ? !z : z) {
                i3 = 3;
            }
        } else {
            i3 = 4;
        }
        vhbVar.getEditText().setTextAlignment(i3);
    }

    public static void Y(wt7 wt7Var, l34 l34Var) {
        wt7Var.setTextWeightRange(l34Var);
    }

    public ViewGroup getBarView() {
        if (this.O0 == 2) {
            return this.b1;
        }
        return this.a1;
    }

    private int getFrameRotation() {
        int i = this.V0;
        if (i != 90) {
            if (i != 180) {
                if (i != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private via getPaintingSize() {
        via viaVar = this.x0;
        if (viaVar != null) {
            return viaVar;
        }
        via viaVar2 = new via(1080.0f, 1920.0f);
        this.x0 = viaVar2;
        return viaVar2;
    }

    private void setCoverPause(boolean z) {
        int i = 0;
        while (true) {
            st7 st7Var = this.H0;
            if (i < st7Var.getChildCount()) {
                View childAt = st7Var.getChildAt(i);
                if (childAt instanceof yza) {
                    ImageReceiver imageReceiver = ((yza) childAt).z0;
                    oy8 y = imageReceiver.y();
                    km m = imageReceiver.m();
                    boolean z2 = !z;
                    imageReceiver.v0 = z2;
                    imageReceiver.u0 = z2;
                    if (y != null) {
                        if (z) {
                            y.stop();
                        } else {
                            y.start();
                        }
                    } else if (m != null) {
                        m.E = z;
                        if (z) {
                            m.x(false);
                            m.stop();
                        } else {
                            m.start();
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setNewColor(int i) {
        mcb mcbVar = this.q1;
        int i2 = mcbVar.a;
        mcbVar.a = i;
        E0(mcbVar, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new bn(this, i2, i, (byte) 3));
        duration.start();
    }

    private void setTextType(int i) {
        this.B0 = i;
        l34 l34Var = this.z0;
        if (l34Var instanceof vhb) {
            ((vhb) l34Var).setType(i);
        }
        k38 e = k38.e(this.v1);
        e.h = i;
        e.a.edit().putInt("text_type", i).apply();
        this.b1.e(i, true);
    }

    public void setTextWeightRange(l34 l34Var) {
        boolean z = l34Var instanceof cc1;
        zt7 zt7Var = this.T0;
        if (z) {
            zt7Var.b(0.3f, 1.1f);
        } else {
            zt7Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        f7 f7Var = new f7(this, context);
        this.M0 = f7Var;
        f7Var.setClipToPadding(false);
        this.M0.setOrientation(0);
        this.J0.addView(this.M0, nme.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.X0 = textView;
        textView.setText(k96.M0(2131747084, null).toUpperCase());
        TextView textView2 = this.X0;
        int i = bkb.h6;
        si5 si5Var = this.w1;
        zkb.R(textView2, bkb.f0(bkb.v0(i, si5Var), 7, -1), null, zkb.M(i), si5Var);
        this.X0.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        this.X0.setTextColor(-1);
        this.X0.setTextSize(1, 14.0f);
        this.X0.setGravity(1);
        this.X0.setTypeface(gl.o());
        this.X0.setSingleLine();
        this.X0.setOnClickListener(new View.OnClickListener(this) {
            public final wt7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wt7 wt7Var = this.b;
                switch (b) {
                    case 0:
                        if (wt7Var.A0) {
                            wt7Var.D0(null, true);
                            return;
                        } else {
                            wt7Var.R0(0);
                            return;
                        }
                    case 1:
                        wt7Var.z0();
                        return;
                    default:
                        wt7Var.R0(2);
                        if (!(wt7Var.z0 instanceof vhb)) {
                            wt7Var.f2 = true;
                            wt7Var.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.M0.addView(this.X0, nme.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.Y0 = textView3;
        textView3.setText(k96.M0(2131747083, null).toUpperCase());
        zkb.R(this.Y0, bkb.f0(bkb.v0(i, si5Var), 7, -1), null, zkb.M(i), si5Var);
        this.Y0.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        this.Y0.setOnClickListener(new View.OnClickListener(this) {
            public final wt7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wt7 wt7Var = this.b;
                switch (b) {
                    case 0:
                        if (wt7Var.A0) {
                            wt7Var.D0(null, true);
                            return;
                        } else {
                            wt7Var.R0(0);
                            return;
                        }
                    case 1:
                        wt7Var.z0();
                        return;
                    default:
                        wt7Var.R0(2);
                        if (!(wt7Var.z0 instanceof vhb)) {
                            wt7Var.f2 = true;
                            wt7Var.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.Y0.setTextColor(-1);
        this.Y0.setTextSize(1, 14.0f);
        this.Y0.setGravity(1);
        this.Y0.setTypeface(gl.o());
        this.Y0.setAlpha(0.6f);
        this.Y0.setSingleLine();
        this.M0.addView(this.Y0, nme.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.Z0 = textView4;
        textView4.setText(k96.M0(2131747082, null).toUpperCase());
        zkb.R(this.Z0, bkb.f0(bkb.v0(i, si5Var), 7, -1), null, zkb.M(i), si5Var);
        this.Z0.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        this.Z0.setTextColor(-1);
        this.Z0.setTextSize(1, 14.0f);
        this.Z0.setGravity(1);
        this.Z0.setTypeface(gl.o());
        this.Z0.setAlpha(0.6f);
        this.Z0.setSingleLine();
        this.Z0.setOnClickListener(new View.OnClickListener(this) {
            public final wt7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wt7 wt7Var = this.b;
                switch (b) {
                    case 0:
                        if (wt7Var.A0) {
                            wt7Var.D0(null, true);
                            return;
                        } else {
                            wt7Var.R0(0);
                            return;
                        }
                    case 1:
                        wt7Var.z0();
                        return;
                    default:
                        wt7Var.R0(2);
                        if (!(wt7Var.z0 instanceof vhb)) {
                            wt7Var.f2 = true;
                            wt7Var.l0(true);
                            return;
                        }
                        return;
                }
            }
        });
        this.M0.addView(this.Z0, nme.l(1.0f, 0, -2));
    }

    public static boolean u0(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
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
    public final void A(l34 l34Var) {
        O0(false);
        M0(l34Var);
    }

    public final void A0(l34 l34Var) {
        this.t0.b(l34Var.getUUID(), new bt7(this, l34Var, (byte) 0));
    }

    public final void B0(l34 l34Var) {
        l34 l34Var2 = this.z0;
        if (l34Var == l34Var2 && l34Var2 != null) {
            l34Var2.l(l34Var2.o0, false);
            D0(null, true);
            if (l34Var instanceof vhb) {
                ValueAnimator valueAnimator = this.R0;
                if (valueAnimator != null && this.P0 != 0) {
                    valueAnimator.cancel();
                }
                R0(0);
            }
        }
        this.H0.removeView(l34Var);
        c0();
        if (l34Var != null) {
            UUID uuid = l34Var.getUUID();
            b5c b5cVar = this.t0;
            b5cVar.b.remove(uuid);
            b5cVar.c.remove(uuid);
            gl.d3(new cib(b5cVar, (byte) 20));
        }
        zt7 zt7Var = this.T0;
        gi3 gi3Var = this.U0;
        zt7Var.setValueOverride(gi3Var);
        zt7Var.setShowPreview(true);
        float f = gi3Var.get();
        mcb mcbVar = this.q1;
        mcbVar.c = f;
        E0(mcbVar, null, false);
        if (!this.h2 && (l34Var instanceof am9)) {
            t7b t7bVar = ((x6b) this).u2;
            i7b i7bVar = t7bVar.Y0;
            if (i7bVar != null) {
                i7bVar.s(null, null, true);
            }
            x6b x6bVar = t7bVar.w1;
            if (x6bVar != null) {
                x6bVar.n0();
            }
            j7b j7bVar = t7bVar.d1;
            if (j7bVar != null) {
                j7bVar.setHasRoundVideo(false);
            }
            f4b f4bVar = t7bVar.L1;
            if (f4bVar != null) {
                File file = f4bVar.o0;
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                    f4bVar = t7bVar.L1;
                    f4bVar.o0 = null;
                }
                if (f4bVar.p0 != null) {
                    try {
                        new File(t7bVar.L1.p0).delete();
                    } catch (Exception unused2) {
                    }
                    t7bVar.L1.p0 = null;
                }
            }
        }
    }

    public final void C0(l34 l34Var) {
        D0(l34Var, true);
    }

    @Override
    public final void D() {
        P0(true);
    }

    public final boolean D0(l34 l34Var, boolean z) {
        boolean z2;
        kob kobVar;
        kob kobVar2;
        t09 t09Var;
        int i;
        int i2;
        boolean z3 = l34Var instanceof vhb;
        int i3 = 0;
        if (z3 && ((i2 = this.P0) != -1 ? i2 != 2 : this.O0 != 2)) {
            ValueAnimator valueAnimator = this.R0;
            if (valueAnimator != null && i2 != 2) {
                valueAnimator.cancel();
            }
            if (this.r1) {
                I0(false);
            }
            R0(2);
        }
        boolean z4 = true;
        if (z3 && z) {
            vhb vhbVar = (vhb) l34Var;
            int gravity = vhbVar.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i = 0;
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
            hs7 hs7Var = this.b1;
            hs7Var.setAlignment(i);
            qs7 typeface = vhbVar.getTypeface();
            if (typeface != null) {
                hs7Var.setTypeface(typeface.a);
            }
            hs7Var.e(vhbVar.getType(), true);
            this.K0.invalidate();
        }
        l34 l34Var2 = this.z0;
        if (l34Var2 != null) {
            if (l34Var2 == l34Var) {
                if (!l34Var.f0) {
                    if (l34Var instanceof ob6) {
                        ob6 ob6Var = (ob6) l34Var;
                        ob6Var.setType((ob6Var.getType() + 1) % ob6Var.getTypesCount());
                        return true;
                    } else if (l34Var instanceof hsc) {
                        hsc hscVar = (hsc) l34Var;
                        hscVar.setType((hscVar.getType() + 1) % hscVar.getTypesCount());
                        return true;
                    } else if (l34Var instanceof o46) {
                        o46 o46Var = (o46) l34Var;
                        d46 d46Var = o46Var.s0;
                        if (d46Var.e()) {
                            if (d46Var.getPreviewType() == 0) {
                                i3 = 1;
                            }
                            d46Var.setPreviewType(i3);
                            return true;
                        }
                        o46Var.setType(o46Var.getNextType());
                        return true;
                    } else if (!this.A0) {
                        if (l34Var instanceof vhb) {
                            this.C0 = true;
                            o0();
                            return true;
                        } else if (l34Var instanceof e09) {
                            e09 e09Var = (e09) l34Var;
                            if (this.S1 && this.Q1 == l34Var) {
                                e09Var.q(true);
                                return true;
                            }
                            e09 e09Var2 = this.Q1;
                            if (e09Var2 != null && e09Var2 != e09Var && (t09Var = this.P1) != null) {
                                t09Var.animate().alpha(0.0f).setListener(new kt7(t09Var, (byte) 0));
                                this.P1 = null;
                                this.S1 = false;
                                this.R1 = 0.0f;
                            }
                            if (this.P1 == null) {
                                t09 t09Var2 = new t09(2, this.v1, new gu0(new f53(), (byte) 2), getContext(), LaunchActivity.Q());
                                this.P1 = t09Var2;
                                wl0 wl0Var = new wl0(this.U1, t09Var2, 0, false);
                                this.P1.setPadding(0, gl.L(22.0f), 0, gl.L(22.0f));
                                this.C1.addView(this.P1, nme.d(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                                Paint paint = new Paint(1);
                                paint.setColor(bm2.o(-16777216, 120));
                                this.P1.setDelegate(new gl2(this, wl0Var, paint));
                                this.P1.m(null, null, true);
                            }
                            this.P1.setFragment(LaunchActivity.Q());
                            this.Q1 = e09Var;
                            O0(true);
                            return true;
                        } else {
                            M0(l34Var2);
                            return true;
                        }
                    } else if (l34Var2 instanceof vhb) {
                        gl.F3(((vhb) l34Var2).getFocusedView());
                        s0(false);
                    }
                }
                return true;
            }
            l34Var2.l(l34Var2.o0, false);
            l34 l34Var3 = this.z0;
            if (l34Var3 instanceof vhb) {
                ((vhb) l34Var3).r();
                if (!z3) {
                    this.A0 = false;
                    gl.t1(((vhb) this.z0).getFocusedView());
                    s0(false);
                }
            } else if ((l34Var3 instanceof am9) && (kobVar2 = ((x6b) this).u2.a1) != null) {
                kobVar2.l(false);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        l34 l34Var4 = this.z0;
        this.z0 = l34Var;
        if ((l34Var4 instanceof vhb) && TextUtils.isEmpty(((vhb) l34Var4).getText()) && !(l34Var4 instanceof cc1)) {
            B0(l34Var4);
        }
        l34 l34Var5 = this.z0;
        if (l34Var4 != l34Var5 && (l34Var5 instanceof am9) && (kobVar = ((x6b) this).u2.a1) != null) {
            kobVar.l(true);
        }
        l34 l34Var6 = this.z0;
        gi3 gi3Var = this.U0;
        mcb mcbVar = this.q1;
        zt7 zt7Var = this.T0;
        if (l34Var6 != null) {
            ht7 ht7Var = this.G0;
            l34Var6.o0 = ht7Var;
            l34Var6.l(ht7Var, true);
            l34 l34Var7 = this.z0;
            if (l34Var7 instanceof vhb) {
                vhb vhbVar2 = (vhb) l34Var7;
                vhbVar2.getSwatch().c = mcbVar.c;
                vhbVar2.B0 = false;
                F0(vhbVar2.getSwatch());
                setTextWeightRange(vhbVar2);
                zt7Var.setValueOverride(new fw5(vhbVar2, (int) (this.x0.a / 9.0f), (byte) 1));
                zt7Var.setShowPreview(false);
            } else {
                zt7Var.setValueOverride(gi3Var);
                zt7Var.setShowPreview(true);
                mcbVar.c = gi3Var.get();
                E0(mcbVar, null, false);
            }
        } else {
            ValueAnimator valueAnimator2 = this.R0;
            if (valueAnimator2 != null && this.P0 != 0) {
                valueAnimator2.cancel();
            }
            if (this.r1) {
                I0(false);
            }
            R0(0);
            zt7Var.setValueOverride(gi3Var);
            zt7Var.setShowPreview(true);
            mcbVar.c = gi3Var.get();
            E0(mcbVar, null, false);
            z4 = z2;
        }
        U0();
        return z4;
    }

    public final void E0(mcb mcbVar, Integer num, boolean z) {
        mcb mcbVar2 = this.q1;
        if (mcbVar2 != mcbVar) {
            mcbVar2.a = mcbVar.a;
            mcbVar2.b = mcbVar.b;
            mcbVar2.c = mcbVar.c;
            int i = this.v1;
            k38.e(i).h(mcbVar.a, true);
            k38.e(i).j(mcbVar.c);
        }
        int i2 = mcbVar.a;
        rt7 rt7Var = this.E0;
        rt7Var.setColor(i2);
        rt7Var.setBrushSize(mcbVar.c);
        int i3 = mcbVar2.a;
        if (num != null && num.intValue() != i3) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new j24(this, num, i3, (byte) 2));
            duration.start();
        } else {
            tt7 tt7Var = this.J0;
            if (tt7Var != null) {
                tt7Var.invalidate();
            }
        }
        l34 l34Var = this.z0;
        if (l34Var instanceof vhb) {
            if (!this.Z1) {
                ((vhb) l34Var).setSwatch(new mcb(mcbVar.b, mcbVar.c, mcbVar.a));
            }
        } else if (z) {
            if (l34Var instanceof ob6) {
                ((ob6) l34Var).setColor(mcbVar.a);
                ((ob6) this.z0).setType(3);
            } else if (l34Var instanceof hsc) {
                ((hsc) l34Var).setColor(mcbVar.a);
                ((hsc) this.z0).setType(3);
            } else if (l34Var instanceof o46) {
                ((o46) l34Var).setColor(mcbVar.a);
                ((o46) this.z0).setType(0);
            }
        }
    }

    public final void F0(mcb mcbVar) {
        E0(mcbVar, null, false);
    }

    public final void H0() {
        int i;
        mac macVar;
        float f;
        l34 l34Var;
        l34 l34Var2;
        su3[] su3VarArr;
        l34 l34Var3;
        ArrayList arrayList = this.G1;
        if (arrayList != null) {
            f4b f4bVar = this.F1;
            this.F1 = null;
            this.G1 = null;
            int size = arrayList.size();
            boolean z = false;
            cc1 cc1Var = null;
            int i2 = 0;
            while (true) {
                ?? r15 = this.H0;
                if (i2 < size) {
                    mac macVar2 = (mac) arrayList.get(i2);
                    byte b = macVar2.a;
                    if (b == 11) {
                        if (cc1Var != null) {
                            cc1Var.u(macVar2.V, macVar2.W, macVar2.j, macVar2.X);
                            i = i2;
                            i2 = i + 1;
                            z = false;
                        } else {
                            cc1 e0 = e0();
                            e0.setType(macVar2.b);
                            e0.setTypeface(macVar2.n);
                            e0.setBaseFontSize(macVar2.m);
                            G0(e0, macVar2.p);
                            mcb swatch = e0.getSwatch();
                            swatch.a = macVar2.l;
                            e0.setSwatch(swatch);
                            e0.u(macVar2.V, macVar2.W, macVar2.j, macVar2.X);
                            f = 1.0f;
                            i = i2;
                            cc1Var = e0;
                            l34Var3 = e0;
                            macVar = macVar2;
                            l34Var = l34Var3;
                        }
                    } else if (b == 0) {
                        pt7 k0 = k0(macVar2.C, macVar2.B);
                        if ((macVar2.b & 2) != 0) {
                            k0.r(z);
                        }
                        ViewGroup.LayoutParams layoutParams = k0.getLayoutParams();
                        layoutParams.width = macVar2.q;
                        layoutParams.height = macVar2.r;
                        f = 1.0f;
                        i = i2;
                        l34Var3 = k0;
                        macVar = macVar2;
                        l34Var = l34Var3;
                    } else {
                        if (b == 1) {
                            vhb l0 = l0(z);
                            l0.setType(macVar2.b);
                            l0.setTypeface(macVar2.n);
                            l0.setBaseFontSize(macVar2.m);
                            SpannableString spannableString = new SpannableString(macVar2.j);
                            ArrayList arrayList2 = macVar2.k;
                            int size2 = arrayList2.size();
                            ArrayList arrayList3 = arrayList2;
                            for (int i3 = z; i3 < size2; i3++) {
                                lac lacVar = (lac) arrayList3.get(i3);
                                ArrayList arrayList4 = arrayList3;
                                gm gmVar = new gm(lacVar.document_id, 1.0f, l0.getFontMetricsInt());
                                int i4 = lacVar.offset;
                                spannableString.setSpan(gmVar, i4, lacVar.length + i4, 33);
                                i2 = i2;
                                arrayList3 = arrayList4;
                            }
                            i = i2;
                            CharSequence m = vu3.m(spannableString, l0.getFontMetricsInt(), false, null, 0);
                            if ((m instanceof Spanned) && (su3VarArr = (su3[]) ((Spanned) m).getSpans(0, m.length(), su3.class)) != null) {
                                for (su3 su3Var : su3VarArr) {
                                    su3Var.b = 0.85f;
                                }
                            }
                            l0.setText(m);
                            G0(l0, macVar2.p);
                            mcb swatch2 = l0.getSwatch();
                            swatch2.a = macVar2.l;
                            l0.setSwatch(swatch2);
                            l34Var2 = l0;
                        } else {
                            i = i2;
                            if (b == 2) {
                                e68 h0 = h0(macVar2.j, false);
                                h0.I0 = macVar2.u;
                                h0.D0 = false;
                                if ((macVar2.b & 2) != 0) {
                                    h0.r(false);
                                }
                                if ((macVar2.b & 16) != 0) {
                                    h0.t(false);
                                }
                                ViewGroup.LayoutParams layoutParams2 = h0.getLayoutParams();
                                layoutParams2.width = macVar2.q;
                                layoutParams2.height = macVar2.r;
                                l34Var2 = h0;
                            } else if (b == 6) {
                                ArrayList arrayList5 = f4bVar.v;
                                boolean z2 = f4bVar.K;
                                this.f2 = true;
                                f = 1.0f;
                                macVar = macVar2;
                                l34 ot7Var = new ot7(this, getContext(), b0(), arrayList5, this.U1, z2, this.V1);
                                ot7Var.setDelegate(this);
                                r15.addView(ot7Var);
                                c0();
                                if (macVar.q > 0 && macVar.r > 0) {
                                    ViewGroup.LayoutParams layoutParams3 = ot7Var.getLayoutParams();
                                    layoutParams3.width = macVar.q;
                                    layoutParams3.height = macVar.r;
                                }
                                l34Var = ot7Var;
                            } else {
                                macVar = macVar2;
                                f = 1.0f;
                                if (b == 3) {
                                    ob6 g0 = g0(macVar.O, macVar.N);
                                    int i5 = macVar.l;
                                    if (i5 != 0) {
                                        g0.setColor(i5);
                                    }
                                    g0.setType(macVar.b);
                                    l34Var = g0;
                                } else {
                                    if (b == 8) {
                                        fsc fscVar = macVar.P;
                                        if (fscVar != null) {
                                            hsc m0 = m0(fscVar);
                                            int i6 = macVar.l;
                                            if (i6 != 0) {
                                                m0.setColor(i6);
                                            }
                                            m0.setType(macVar.b);
                                            l34Var = m0;
                                        }
                                    } else if (b == 7) {
                                        o46 f0 = f0(macVar.a0);
                                        d46 d46Var = f0.s0;
                                        int i7 = macVar.l;
                                        if (i7 != 0) {
                                            f0.setColor(i7);
                                        }
                                        boolean e = d46Var.e();
                                        int i8 = d46Var.h;
                                        int i9 = d46Var.f;
                                        if (e) {
                                            d46Var.setPreviewType(macVar.b);
                                        }
                                        byte b2 = macVar.b;
                                        if (b2 == -1) {
                                            f0.setType(3);
                                            d46Var.d();
                                            macVar.q = ((int) Math.ceil(d46Var.b0)) + i9 + i9;
                                            macVar.r = ((int) Math.ceil(d46Var.c0)) + i8 + i8;
                                            PointF position = f0.getPosition();
                                            position.y = (this.I1 * 0.3f) + position.y;
                                            f0.setPosition(position);
                                        } else {
                                            f0.setType(b2);
                                            l34Var = f0;
                                        }
                                    } else if (b == 4) {
                                        e09 i0 = i0(false);
                                        i0.s(h19.d(macVar.N.reaction), false);
                                        if (macVar.N.flipped) {
                                            i0.r(false);
                                        }
                                        l34Var = i0;
                                        if (macVar.N.dark) {
                                            i0.q(false);
                                            l34Var = i0;
                                        }
                                    } else if (b == 5 && f4bVar.o0 != null) {
                                        am9 j0 = j0(f4bVar.p0, false);
                                        t7b t7bVar = ((x6b) this).u2;
                                        i7b i7bVar = t7bVar.Y0;
                                        if (i7bVar != null) {
                                            i7bVar.x = j0;
                                            lbc lbcVar = i7bVar.y;
                                            if (lbcVar != null) {
                                                lbcVar.z0(j0.w0);
                                            }
                                        }
                                        j7b j7bVar = t7bVar.d1;
                                        if (j7bVar != null) {
                                            j7bVar.setHasRoundVideo(true);
                                        }
                                        l34Var = j0;
                                        if ((macVar.b & 2) != 0) {
                                            boolean z3 = !j0.t0;
                                            j0.t0 = z3;
                                            j0.u0.f(z3, true);
                                            j0.invalidate();
                                            l34Var = j0;
                                        }
                                    }
                                    i2 = i + 1;
                                    z = false;
                                }
                            }
                        }
                        macVar = macVar2;
                        f = 1.0f;
                        l34Var = l34Var2;
                    }
                    l34Var.setX((macVar.c * this.H1) - (((f - macVar.v) * macVar.q) / 2.0f));
                    l34Var.setY((macVar.d * this.I1) - (((f - macVar.v) * macVar.r) / 2.0f));
                    l34Var.setPosition(new PointF((macVar.q / 2.0f) + l34Var.getX(), (macVar.r / 2.0f) + l34Var.getY()));
                    l34Var.setScale(macVar.v);
                    l34Var.setRotation((float) (((-macVar.e) / 3.141592653589793d) * 180.0d));
                    i2 = i + 1;
                    z = false;
                } else {
                    r15.setVisibility(z ? 1 : 0);
                    return;
                }
            }
        }
    }

    public final void I0(final boolean z) {
        float f;
        boolean z2;
        if (this.r1 != z) {
            this.r1 = z;
            yla ylaVar = this.s1;
            if (ylaVar != null) {
                ylaVar.d();
            }
            float f2 = 1000.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            yla ylaVar2 = new yla(new ti4(f));
            this.s1 = ylaVar2;
            zla zlaVar = new zla();
            if (!z) {
                f2 = 0.0f;
            }
            zlaVar.i = f2;
            zlaVar.b(1250.0f);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            if (!this.E1.c() && this.n2 <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            final boolean[] zArr = {z2};
            final float translationY = this.J0.getTranslationY();
            final float alpha = this.r0.getAlpha();
            final ViewGroup barView = getBarView();
            this.s1.b(new yr3() {
                @Override
                public final void a(yla ylaVar3, float f3, float f4) {
                    float f5;
                    int i;
                    wt7 wt7Var = wt7.this;
                    tt7 tt7Var = wt7Var.J0;
                    float f6 = f3 / 1000.0f;
                    wt7Var.t1 = f6;
                    float f7 = 1.0f;
                    float f8 = ((1.0f - f6) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f8);
                    viewGroup.setScaleY(f8);
                    viewGroup.setTranslationY((Math.min(wt7Var.t1, 0.25f) * gl.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(wt7Var.t1, 0.25f) / 0.25f));
                    it7 it7Var = wt7Var.m1;
                    float f9 = wt7Var.t1;
                    boolean z3 = z;
                    it7Var.B1(z3, f9);
                    cs7 cs7Var = wt7Var.r0;
                    cs7Var.setProgress(wt7Var.t1);
                    xr7 xr7Var = wt7Var.q0;
                    xr7Var.setProgress(wt7Var.t1);
                    wt7Var.M0.setTranslationY(gl.L(32.0f) * wt7Var.t1);
                    AnimatorSet animatorSet = wt7Var.D1;
                    boolean[] zArr2 = zArr;
                    if (animatorSet != null && animatorSet.isRunning()) {
                        zArr2[0] = false;
                    }
                    if (zArr2[0]) {
                        float f10 = wt7Var.t1;
                        if (z3) {
                            f5 = 1.0f;
                        } else {
                            f10 = 1.0f - f10;
                            f5 = 0.0f;
                        }
                        float f11 = alpha;
                        cs7Var.setAlpha(gl.R1(f11, f5, f10));
                        if (!z3) {
                            f7 = 0.0f;
                        }
                        xr7Var.setAlpha(gl.R1(f11, f7, f10));
                        float L = gl.L(39.0f) * f10;
                        if (z3) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        tt7Var.setTranslationY(translationY - (L * i));
                    }
                    tt7Var.invalidate();
                    if (viewGroup == wt7Var.b1) {
                        wt7Var.K0.invalidate();
                    }
                }
            });
            this.s1.a(new ws7(this, z, (byte) 0));
            this.s1.h();
            if (z) {
                it7 it7Var = this.m1;
                it7Var.setVisibility(0);
                it7Var.setSelectedColorIndex(k38.e(this.v1).d());
            }
        }
    }

    public final void J0(int i) {
        boolean z;
        hs7 hs7Var = this.b1;
        jt7 jt7Var = this.E1;
        if (i == 1) {
            t14 t14Var = this.j2;
            if (t14Var != null && t14Var.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            t14 t14Var2 = this.j2;
            s7b s7bVar = this.C1;
            if (t14Var2 != null && t14Var2.d1 != y6c.t0) {
                s7bVar.removeView(t14Var2);
                t14Var2 = null;
                this.j2 = null;
            }
            if (t14Var2 == null) {
                t14 t14Var3 = new t14(null, true, false, false, getContext(), false, null, null, true, this.w1, false, false);
                this.j2 = t14Var3;
                t14Var3.x2 = false;
                t14Var3.V0 = true;
                t14Var3.setVisibility(8);
                if (gl.O1()) {
                    this.j2.setForseMultiwindowLayout(true);
                }
                this.j2.setDelegate(new qt7(this));
                s7bVar.addView(this.j2);
            }
            this.j2.setVisibility(0);
            this.k2 = true;
            t14 t14Var4 = this.j2;
            if (this.p2 <= 0) {
                if (gl.O1()) {
                    this.p2 = gl.L(150.0f);
                } else {
                    this.p2 = na7.b1().getInt("kbd_height", gl.L(200.0f));
                }
            }
            int i2 = this.q2;
            if (i2 <= 0) {
                if (gl.O1()) {
                    i2 = gl.L(150.0f);
                    this.q2 = i2;
                } else {
                    i2 = na7.b1().getInt("kbd_height_land3", gl.L(200.0f));
                    this.q2 = i2;
                }
            }
            Point point = gl.q;
            if (point.x <= point.y) {
                i2 = this.p2;
            }
            int paddingUnderContainer = s7bVar.getPaddingUnderContainer() + i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t14Var4.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            t14Var4.setLayoutParams(layoutParams);
            if (!gl.E && !gl.O1()) {
                l34 l34Var = this.z0;
                if (l34Var instanceof vhb) {
                    gl.t1(((vhb) l34Var).getEditText());
                }
            }
            this.n2 = paddingUnderContainer;
            jt7Var.a();
            requestLayout();
            qy1 emojiButton = hs7Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(oy1.d, true);
            }
            if (!z) {
                if (this.l2) {
                    this.o2 = true;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n2, 0.0f);
                    ofFloat.addUpdateListener(new ys7(this, (byte) 1));
                    ofFloat.addListener(new lt7(this, (byte) 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(gb.w);
                    ofFloat.start();
                }
            }
        } else {
            qy1 emojiButton2 = hs7Var.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(oy1.e, true);
            }
            t14 t14Var5 = this.j2;
            if (t14Var5 != null) {
                this.k2 = false;
                if (gl.D || gl.E) {
                    t14Var5.setVisibility(8);
                }
            }
            if (i == 0) {
                this.n2 = 0;
                jt7Var.a();
            }
            requestLayout();
        }
        S0();
    }

    public final void K0(o46 o46Var) {
        t4b t4bVar = new t4b(getContext(), this.w1, this.W1, new x15(this, o46Var, (byte) 16));
        if (o46Var != null) {
            c46 c46Var = o46Var.w0;
            t4bVar.X1 = true;
            it3 it3Var = t4bVar.U1;
            it3 it3Var2 = t4bVar.T1;
            if (c46Var != null) {
                t4bVar.b2 = c46Var.d;
                t4bVar.c2 = false;
                it3Var2.setText(c46Var.c);
                it3Var.setText(c46Var.b);
                t4bVar.h2 = !TextUtils.isEmpty(c46Var.b);
                t4bVar.i2 = c46Var.f;
                t4bVar.j2 = c46Var.e;
            } else {
                it3Var2.setText("");
                it3Var.setText("");
                t4bVar.i2 = true;
                t4bVar.j2 = false;
            }
            String M0 = k96.M0(2131744401, null);
            u41 u41Var = t4bVar.W1;
            u41Var.i(M0, false, true);
            o64 o64Var = t4bVar.S1;
            if (o64Var != null) {
                o64Var.O(false);
            }
            u41Var.setEnabled(t4bVar.a1(it3Var2.getText().toString()));
            t4bVar.X1 = false;
        }
        t4bVar.setOnDismissListener(new gt7(this, (byte) 1));
        t4bVar.show();
        y0(true);
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        if (i > gl.L(50.0f) && this.l2 && !gl.E && !gl.O1()) {
            if (z) {
                this.q2 = i;
                na7.b1().edit().putInt("kbd_height_land3", this.q2).commit();
            } else {
                this.p2 = i;
                na7.b1().edit().putInt("kbd_height", this.p2).commit();
            }
        }
        boolean z4 = this.k2;
        jt7 jt7Var = this.E1;
        if (z4) {
            if (z) {
                i2 = this.q2;
            } else {
                i2 = this.p2;
            }
            int paddingUnderContainer = this.C1.getPaddingUnderContainer() + i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.j2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = gl.q.x;
            if (i3 != i4 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i4;
                layoutParams.height = paddingUnderContainer;
                this.j2.setLayoutParams(layoutParams);
                this.n2 = layoutParams.height;
                jt7Var.a();
                requestLayout();
            }
        }
        if (this.r2 == i && this.s2 == z) {
            return;
        }
        this.r2 = i;
        this.s2 = z;
        boolean z5 = this.l2;
        l34 l34Var = this.z0;
        if (l34Var instanceof vhb) {
            if (((vhb) l34Var).getEditText().isFocused() && jt7Var.c()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.l2 = z2;
        } else {
            this.l2 = false;
            z2 = false;
        }
        if (z2 && this.k2) {
            J0(0);
        }
        if (this.n2 != 0 && !(z3 = this.l2) && z3 != z5 && !this.k2) {
            this.n2 = 0;
            jt7Var.a();
            requestLayout();
        }
        U0();
        if (z5 && !this.l2 && this.n2 > 0 && this.o2) {
            this.o2 = false;
        }
        S0();
    }

    public final void L0(ob6 ob6Var, i8c i8cVar) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        x02 x02Var = new x02(getContext(), new nt7(this, i8cVar), false, true, false, this.w1);
        x02Var.W3 = new cff((byte) 22);
        wz1 wz1Var = x02Var.u3;
        if (ob6Var != null && (messageMedia = ob6Var.w0) != null && (geoPoint = messageMedia.geo) != null) {
            x02Var.x4 = new double[]{geoPoint.lat, geoPoint._long};
            x02Var.I1 = true;
            wz1Var.setVisibility(8);
        } else if (this.K1) {
            x02Var.v4 = this.M1;
            x02Var.w4 = this.L1;
            x02Var.I1 = true;
            wz1Var.setVisibility(8);
        } else {
            x02Var.I1 = true;
            wz1Var.setVisibility(8);
        }
        x02Var.setOnDismissListener(new gt7(this, (byte) 0));
        x02Var.Z0();
        x02Var.show();
    }

    public final void M0(l34 l34Var) {
        if (l34Var instanceof u17) {
            m8 m8Var = this.x1;
            if (m8Var != null && m8Var.isShowing()) {
                this.x1.d(true);
                return;
            }
            return;
        }
        int[] iArr = this.i2;
        l34Var.getLocationInWindow(iArr);
        float scaleX = l34Var.getScaleX() * l34Var.getWidth();
        st7 st7Var = this.H0;
        float scaleX2 = st7Var.getScaleX() * scaleX;
        float scaleY = l34Var.getScaleY();
        float scaleY2 = st7Var.getScaleY() * scaleY * l34Var.getHeight();
        int i = (int) ((scaleX2 / 2.0f) + iArr[0]);
        iArr[0] = i;
        int i2 = (int) ((scaleY2 / 2.0f) + iArr[1]);
        iArr[1] = i2;
        N0(new bt7(this, l34Var, (byte) 1), this, 51, i, i2 - gl.L(32.0f), true);
    }

    public final void N0(Runnable runnable, wt7 wt7Var, int i, int i2, int i3, boolean z) {
        m8 m8Var = this.x1;
        if (m8Var != null && m8Var.isShowing()) {
            this.x1.d(true);
            return;
        }
        if (this.y1 == null) {
            this.z1 = new Rect();
            vt7 vt7Var = new vt7(this, getContext());
            this.y1 = vt7Var;
            vt7Var.setAnimationEnabled(true);
            this.y1.setOnTouchListener(new a7(this, (byte) 12));
            this.y1.setDispatchKeyEventListener(new dt7(this));
            this.y1.setShownFromBottom(true);
        }
        vt7 vt7Var2 = this.y1;
        vt7Var2.a0 = z;
        vt7Var2.d();
        runnable.run();
        if (this.x1 == null) {
            m8 m8Var2 = new m8(this.y1, -2, -2);
            this.x1 = m8Var2;
            m8Var2.b = true;
            m8Var2.setAnimationStyle(2131755191);
            this.x1.setOutsideTouchable(true);
            this.x1.setClippingEnabled(true);
            this.x1.setInputMethodMode(2);
            this.x1.setSoftInputMode(0);
            this.x1.getContentView().setFocusableInTouchMode(true);
            this.x1.setOnDismissListener(new x6(this, (byte) 6));
        }
        this.y1.measure(View.MeasureSpec.makeMeasureSpec(gl.L(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(10000.0f), Integer.MIN_VALUE));
        this.x1.setFocusable(true);
        int measuredWidth = i2 - (this.y1.getMeasuredWidth() / 2);
        int measuredHeight = i3 - this.y1.getMeasuredHeight();
        this.x1.showAtLocation(wt7Var, i, measuredWidth, measuredHeight);
        m8.i(this.y1);
        Drawable mutate = getContext().getResources().getDrawable(2131232571).mutate();
        vt7 vt7Var3 = this.y1;
        if (z) {
            vt7Var3.setBackgroundDrawable(new vl0(new wl0(this.U1, vt7Var3, 5, false), measuredWidth, measuredHeight, mutate, gl.N(8.3f)));
            return;
        }
        vt7Var3.setBackgroundDrawable(mutate);
        this.y1.setBackgroundColor(-14145495);
    }

    public final void O0(boolean z) {
        if (this.S1 != z) {
            if (z || this.P1 != null) {
                this.S1 = z;
                float f = 0.0f;
                if (z) {
                    this.P1.k();
                    this.P1.setVisibility(0);
                    this.P1.setSelectedReaction(this.Q1.getCurrentReaction());
                    this.P1.getParent().bringChildToFront(this.P1);
                    this.T1 = true;
                    this.C1.invalidate();
                    float f2 = this.R1;
                    if (z) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    this.P1.setTransitionProgress(this.R1);
                    ofFloat.addUpdateListener(new ys7(this, (byte) 2));
                    ofFloat.addListener(new id4((byte) 17, this, z));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(s33.g);
                    ofFloat.start();
                    return;
                }
                this.Q1 = null;
                if (this.P1.getReactionsWindow() != null) {
                    this.P1.getReactionsWindow().e();
                }
                this.P1.animate().alpha(0.0f).setDuration(150L).setListener(new lt7(this, (byte) 0)).start();
            }
        }
    }

    public final void P0(boolean z) {
        float f;
        if (this.k1 != z) {
            this.k1 = z;
            yla ylaVar = this.l1;
            if (ylaVar != null) {
                ylaVar.d();
            }
            float f2 = 1000.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            yla ylaVar2 = new yla(new ti4(f));
            this.l1 = ylaVar2;
            zla zlaVar = new zla();
            if (!z) {
                f2 = 0.0f;
            }
            zlaVar.i = f2;
            zlaVar.b(1250.0f);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            if (z) {
                ss7 ss7Var = this.c1;
                ss7Var.setAlpha(0.0f);
                ss7Var.setVisibility(0);
            }
            this.l1.b(new h10(this, (byte) 8));
            this.l1.a(new ws7(this, z, (byte) 1));
            this.l1.h();
        }
    }

    @Override
    public final int Q() {
        return this.E1.l - this.C1.getBottomPadding2();
    }

    public final PointF Q0(l34 l34Var) {
        float f;
        float f2;
        float f3 = 200.0f;
        zl6 zl6Var = this.v0;
        if (zl6Var != null) {
            f3 = 200.0f / zl6Var.c;
        }
        float f4 = 0.2f;
        if (l34Var != null) {
            PointF position = l34Var.getPosition();
            float min = Math.min(l34Var.getHeight(), l34Var.getWidth()) * 0.2f;
            return new PointF(position.x + min, position.y + min);
        }
        float f5 = 100.0f;
        if (zl6Var != null) {
            f5 = 100.0f / zl6Var.c;
        }
        PointF b0 = b0();
        int i = 0;
        while (i < 10) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                st7 st7Var = this.H0;
                if (i2 >= st7Var.getChildCount()) {
                    break;
                }
                View childAt = st7Var.getChildAt(i2);
                if ((childAt instanceof l34) && !(childAt instanceof u17)) {
                    PointF position2 = ((l34) childAt).getPosition();
                    f = f4;
                    f2 = f5;
                    if (((float) Math.sqrt(Math.pow(position2.y - b0.y, 2.0d) + Math.pow(position2.x - b0.x, 2.0d))) < f2) {
                        f3 = Math.min(childAt.getHeight(), childAt.getWidth()) * f;
                        z = true;
                    }
                } else {
                    f = f4;
                    f2 = f5;
                }
                i2++;
                f5 = f2;
                f4 = f;
            }
            float f6 = f4;
            float f7 = f5;
            if (!z) {
                break;
            }
            i++;
            b0 = new PointF(b0.x + f3, b0.y + f3);
            f4 = f6;
            f5 = f7;
        }
        return b0;
    }

    public final void R0(int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z;
        if (this.O0 != i && this.P0 != i) {
            ValueAnimator valueAnimator = this.R0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i2 = this.O0;
            ViewGroup viewGroup3 = this.b1;
            ViewGroup viewGroup4 = this.a1;
            if (i2 == 0) {
                viewGroup = viewGroup4;
            } else if (i2 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.P0 = i;
            if (i == 0) {
                viewGroup2 = viewGroup4;
            } else if (i == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i3 = this.v1;
            k38 e = k38.e(i3);
            boolean z2 = true;
            if (i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e.l != z) {
                e.l = z;
                if (z) {
                    e.i(-1, false);
                } else {
                    e.i(e.a.getInt("brush", 0), false);
                }
            }
            int c = k38.e(i3).c();
            mcb mcbVar = this.q1;
            mcbVar.a = c;
            if (i == 2) {
                z2 = false;
            }
            this.Z1 = z2;
            E0(mcbVar, null, false);
            this.Z1 = false;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.R0 = duration;
            duration.setInterpolator(s33.f);
            this.R0.addUpdateListener(new nk(this, viewGroup, viewGroup2, (byte) 3));
            this.R0.addListener(new qp1(this, viewGroup, viewGroup2, i, (byte) 4));
            this.R0.start();
        }
    }

    public final void S0() {
        boolean z;
        jt7 jt7Var = this.E1;
        hs7 hs7Var = this.b1;
        if (hs7Var != null) {
            if (jt7Var.c()) {
                hs7Var.a(2131231516);
            } else if (this.k2) {
                hs7Var.a(2131231508);
            } else {
                hs7Var.a(2131232047);
            }
        }
        if (!jt7Var.c() && !this.k2) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        gl.P3(1.0f, this.e1, z2, false);
        gl.P3(1.0f, this.d1, z2, false);
        gl.P3(1.0f, this.g1, z, false);
        gl.P3(1.0f, this.f1, z, false);
    }

    public final void T0() {
        float f;
        l34 l34Var;
        ObjectAnimator objectAnimator = this.Y1;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.E0.getParent();
        if (view == null) {
            return;
        }
        jt7 jt7Var = this.E1;
        if (((jt7Var.c() && !jt7Var.d) || this.n2 > 0) && (l34Var = this.z0) != null) {
            f = view.getScaleY() * (-(l34Var.getPosition().y - (view.getMeasuredHeight() * 0.3f)));
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, f);
        this.Y1 = ofFloat;
        ofFloat.setDuration(350L);
        this.Y1.setInterpolator(s33.h);
        this.Y1.start();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt7.U0():void");
    }

    @Override
    public final void a() {
        I0(true);
    }

    public final void a0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new bj7(this, view, (byte) 14)).start();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F8));
        hashSet.add(Integer.valueOf(bkb.g5));
        hashSet.add(Integer.valueOf(bkb.i5));
        hashSet.add(Integer.valueOf(bkb.q5));
        hashSet.add(Integer.valueOf(bkb.yf));
        hashSet.add(Integer.valueOf(bkb.Bf));
        hashSet.add(Integer.valueOf(bkb.Ef));
        hashSet.add(Integer.valueOf(bkb.If));
        hashSet.add(Integer.valueOf(bkb.Df));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.Ci));
        hashSet.add(Integer.valueOf(bkb.vi));
        hashSet.add(Integer.valueOf(bkb.ui));
        hashSet.add(Integer.valueOf(bkb.wi));
        hashSet.add(Integer.valueOf(bkb.xi));
        hashSet.add(Integer.valueOf(bkb.Af));
        hashSet.add(Integer.valueOf(bkb.zf));
        hashSet.add(Integer.valueOf(bkb.Z6));
    }

    @Override
    public final void b() {
        setTextType((this.B0 + 1) % 4);
    }

    public final PointF b0() {
        st7 st7Var = this.H0;
        int measuredWidth = st7Var.getMeasuredWidth();
        int measuredHeight = st7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.H1;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.I1;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
    }

    @Override
    public final void c(int i) {
        l34 l34Var = this.z0;
        if (l34Var instanceof vhb) {
            G0((vhb) l34Var, i);
            k38 e = k38.e(this.v1);
            e.g = i;
            e.a.edit().putInt("text_alignment", i).apply();
        }
    }

    public final void c0() {
        gm[] gmVarArr;
        boolean z = this.M1;
        st7 st7Var = this.H0;
        boolean z2 = true;
        if (!z && !this.O1) {
            int i = 0;
            loop0: while (true) {
                if (i < st7Var.getChildCount()) {
                    View childAt = st7Var.getChildAt(i);
                    boolean z3 = childAt instanceof vhb;
                    int i2 = this.v1;
                    if (z3) {
                        CharSequence text = ((vhb) childAt).getText();
                        if (text instanceof Spanned) {
                            for (gm gmVar : (gm[]) ((Spanned) text).getSpans(0, text.length(), gm.class)) {
                                TLRPC.Document document = gmVar.document;
                                if (document == null) {
                                    document = vl.e(i2, gmVar.getDocumentId());
                                }
                                if (document != null) {
                                    vl.g(i2).e(document);
                                }
                                ba4.G(i2);
                                if (f4b.u(document, ba4.J(document, null, true, true).getAbsolutePath())) {
                                    break loop0;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                        i++;
                    } else if (childAt instanceof yza) {
                        TLRPC.Document sticker = ((yza) childAt).getSticker();
                        ba4.G(i2);
                        if (f4b.u(sticker, ba4.J(sticker, null, true, true).getAbsolutePath())) {
                            break;
                        }
                        i++;
                    } else if (childAt instanceof am9) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        }
        for (int i3 = 0; i3 < st7Var.getChildCount(); i3++) {
            View childAt2 = st7Var.getChildAt(i3);
            if (childAt2 instanceof l34) {
                ((l34) childAt2).setIsVideo(z2);
            }
        }
    }

    public final TextView d0(int i, String str) {
        TextView textView = new TextView(getContext());
        zkb.X(textView, bkb.D8, this.w1);
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gl.o());
        textView.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        return textView;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.g2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        zl6 zl6Var;
        int i = 0;
        if ((view == this.E0 || view == this.F0 || view == this.H0 || view == this.G0) && (zl6Var = this.v0) != null) {
            canvas.save();
            if (!this.D0) {
                i = gl.m;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = zl6Var.k;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * zl6Var.e)) / zl6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * zl6Var.f)) / zl6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + 0.0f;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - gl.L(48.0f))) - scaleY) / 2.0f) + gl.L(8.0f) + i + 0.0f;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final cc1 e0() {
        via paintingSize = getPaintingSize();
        PointF b0 = b0();
        b0.y *= 1.5f;
        cc1 cc1Var = new cc1(getContext(), b0, (int) ((paintingSize.a / 9.0f) * 0.5f), new mcb(1.0f, this.q1.c, -1));
        float f = paintingSize.a / 9.0f;
        ct7 ct7Var = new ct7(this, (byte) 2);
        cc1Var.y0 = (int) (0.5f * f);
        cc1Var.z0 = (int) (f * 2.0f);
        cc1Var.A0 = ct7Var;
        cc1Var.B0 = true;
        cc1Var.setStickyX(2);
        cc1Var.setDelegate(this);
        cc1Var.setMaxWidth(this.H1 - gl.L(32.0f));
        cc1Var.setTypeface(k38.e(this.v1).j);
        cc1Var.setType(3);
        yb1 yb1Var = this.a2;
        if (yb1Var != null) {
            yb1Var.b(cc1Var);
        } else {
            final pj4 pj4Var = this.c2;
            Objects.requireNonNull(pj4Var);
            cc1Var.setPositionProvider(new im6(pj4Var, (byte) 21));
            cc1Var.setOnEditing(new p8c() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            pj4Var.l(((Boolean) obj).booleanValue());
                            return;
                        default:
                            pj4Var.O(((Long) obj).longValue());
                            return;
                    }
                }
            });
            cc1Var.setOnSeek(new p8c() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            pj4Var.l(((Boolean) obj).booleanValue());
                            return;
                        default:
                            pj4Var.O(((Long) obj).longValue());
                            return;
                    }
                }
            });
        }
        this.H0.addView(cc1Var, nme.c(-2.0f, -2));
        G0(cc1Var, 1);
        c0();
        zl6 zl6Var = this.v0;
        if (zl6Var != null) {
            cc1Var.j(1.0f / zl6Var.c);
            cc1Var.f(-(zl6Var.k + zl6Var.d));
        }
        return cc1Var;
    }

    public final o46 f0(c46 c46Var) {
        int measuredWidth;
        int i;
        this.f2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        st7 st7Var = this.H0;
        if (st7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.H1;
        } else {
            measuredWidth = st7Var.getMeasuredWidth();
        }
        float f = measuredWidth;
        int L = ((int) f) - gl.L(58.0f);
        o46 o46Var = new o46(getContext(), Q0, this.v1, c46Var, f / 360.0f, L);
        if (Q0.x == st7Var.getMeasuredWidth() / 2.0f) {
            o46Var.setStickyX(2);
        }
        if (Q0.y == st7Var.getMeasuredHeight() / 2.0f) {
            o46Var.setStickyY(2);
        }
        mcb mcbVar = this.q1;
        if (mcbVar != null && (i = mcbVar.a) != -47814) {
            o46Var.setColor(i);
        }
        o46Var.setDelegate(this);
        o46Var.setMaxWidth(L);
        st7Var.addView(o46Var, nme.c(-2.0f, -2));
        c0();
        zl6 zl6Var = this.v0;
        if (zl6Var != null) {
            o46Var.j(1.0f / zl6Var.c);
            o46Var.f(-(zl6Var.k + zl6Var.d));
        }
        return o46Var;
    }

    public final ob6 g0(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        int measuredWidth;
        int i;
        this.f2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        st7 st7Var = this.H0;
        if (st7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.H1;
        } else {
            measuredWidth = st7Var.getMeasuredWidth();
        }
        float f = measuredWidth;
        int L = ((int) f) - gl.L(58.0f);
        ob6 ob6Var = new ob6(getContext(), Q0, this.v1, messageMedia, mediaArea, f / 240.0f, L);
        if (Q0.x == st7Var.getMeasuredWidth() / 2.0f) {
            ob6Var.setStickyX(2);
        }
        if (Q0.y == st7Var.getMeasuredHeight() / 2.0f) {
            ob6Var.setStickyY(2);
        }
        mcb mcbVar = this.q1;
        if (mcbVar != null && (i = mcbVar.a) != -47814) {
            ob6Var.setColor(i);
        }
        ob6Var.setDelegate(this);
        ob6Var.setMaxWidth(L);
        st7Var.addView(ob6Var, nme.c(-2.0f, -2));
        c0();
        zl6 zl6Var = this.v0;
        if (zl6Var != null) {
            ob6Var.j(1.0f / zl6Var.c);
            ob6Var.f(-(zl6Var.k + zl6Var.d));
        }
        return ob6Var;
    }

    public int getAdditionalBottom() {
        return gl.L(24.0f);
    }

    public int getAdditionalTop() {
        return gl.L(48.0f);
    }

    public Bitmap getBlurBitmap() {
        return this.E0.c(true, false);
    }

    public View getBottomLayout() {
        return this.J0;
    }

    public View getCancelView() {
        return this.q0;
    }

    public float getCropRotation() {
        zl6 zl6Var = this.v0;
        if (zl6Var != null) {
            return zl6Var.d + zl6Var.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.r0;
    }

    public View getEntitiesView() {
        return this.H0;
    }

    public long getLcm() {
        return this.W0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        gm[] gmVarArr;
        st7 st7Var = this.H0;
        int childCount = st7Var.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = st7Var.getChildAt(i);
            if (childAt instanceof yza) {
                TLRPC.Document sticker = ((yza) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof vhb) {
                CharSequence text = ((vhb) childAt).getText();
                if ((text instanceof Spanned) && (gmVarArr = (gm[]) ((Spanned) text).getSpans(0, text.length(), gm.class)) != null) {
                    for (gm gmVar : gmVarArr) {
                        if (gmVar != null) {
                            TLRPC.Document document = gmVar.document;
                            if (document == null) {
                                document = vl.e(this.v1, gmVar.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = document.id;
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
        return Arrays.asList(this.E0, this.F0, this.H0, this.G0);
    }

    public View getRenderInputView() {
        return this.F0;
    }

    public c79 getRenderView() {
        return this.E0;
    }

    public l34 getSelectedEntity() {
        return this.z0;
    }

    public View getSelectionEntitiesView() {
        return this.G0;
    }

    public View getTextDimView() {
        return this.N0;
    }

    public View getTopLayout() {
        return this.I0;
    }

    public View getWeightChooserView() {
        return this.T0;
    }

    @Override
    public final boolean h(MotionEvent motionEvent) {
        if (this.g2) {
            return false;
        }
        if (this.z0 != null) {
            D0(null, true);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(x, y);
        this.E0.e(obtain);
        obtain.recycle();
        return true;
    }

    public final e68 h0(String str, boolean z) {
        float f;
        via viaVar;
        this.f2 = true;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            fa4.g(e, true);
            f = 1.0f;
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        st7 st7Var = this.H0;
        if (i > 0) {
            float floor = (float) Math.floor(Math.max(this.H1, st7Var.getMeasuredWidth()) * 0.5d);
            viaVar = new via(floor, floor / f);
        } else {
            float floor2 = (float) Math.floor(Math.max(this.I1, st7Var.getMeasuredHeight()) * 0.5d);
            viaVar = new via(f * floor2, floor2);
        }
        via viaVar2 = viaVar;
        Pair N0 = gl.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f2 = viaVar2.a;
            viaVar2.a = viaVar2.b;
            viaVar2.b = f2;
        }
        Context context = getContext();
        PointF b0 = b0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        e68 e68Var = new e68(context, b0, viaVar2, str, intValue);
        e68Var.setDelegate(this);
        st7Var.addView(e68Var);
        c0();
        return e68Var;
    }

    @Override
    public final boolean i(l34 l34Var) {
        return D0(l34Var, true);
    }

    public final e09 i0(boolean z) {
        String str;
        via viaVar = new via(gl.L(106.0f), gl.L(106.0f));
        PointF b0 = b0();
        st7 st7Var = this.H0;
        if (st7Var.getMeasuredHeight() > 0) {
            loop0: while (true) {
                for (int i = 0; i < st7Var.getChildCount(); i++) {
                    View childAt = st7Var.getChildAt(i);
                    if (loe.a(b0.x, b0.y, (childAt.getMeasuredWidth() / 2.0f) + childAt.getX(), (childAt.getMeasuredHeight() / 2.0f) + childAt.getY()) < gl.L(6.0f)) {
                        break;
                    }
                }
                b0.x = (st7Var.getMeasuredWidth() * 0.05f) + b0.x;
                b0.y = (st7Var.getMeasuredHeight() * 0.05f) + b0.y;
                b0.x = Utilities.i(b0.x, st7Var.getMeasuredWidth(), 0.0f);
                b0.y = Utilities.i(b0.y, st7Var.getMeasuredHeight(), 0.0f);
            }
        }
        ?? l34Var = new l34(getContext(), b0);
        l34Var.t0 = new b6b(l34Var);
        l34Var.u0 = new b6b(l34Var);
        l34Var.v0 = new b09(l34Var);
        l34Var.w0 = new b09(l34Var);
        lm lmVar = new lm((View) l34Var);
        l34Var.y0 = lmVar;
        lm lmVar2 = new lm((View) l34Var);
        l34Var.z0 = lmVar2;
        l34Var.B0 = 1.0f;
        l34Var.s0 = viaVar;
        lmVar2.e(true, 1.0f);
        lmVar.e(true, 1.0f);
        ArrayList arrayList = hq6.d0(y6c.t0).h;
        b09 b09Var = l34Var.v0;
        int i2 = 0;
        while (true) {
            if (i2 < arrayList.size()) {
                if (((TLRPC.TL_availableReaction) arrayList.get(i2)).title.equals("Red Heart")) {
                    str = ((TLRPC.TL_availableReaction) arrayList.get(i2)).reaction;
                    break;
                }
                i2++;
            } else {
                str = ((TLRPC.TL_availableReaction) arrayList.get(0)).reaction;
                break;
            }
        }
        h19 b = h19.b(str);
        l34Var.x0 = b;
        b09Var.e(b);
        l34Var.k();
        l34Var.setDelegate(this);
        st7Var.addView(l34Var);
        c0();
        if (z) {
            A0(l34Var);
            C0(l34Var);
        }
        return l34Var;
    }

    public final am9 j0(String str, boolean z) {
        float f;
        this.f2 = true;
        this.h2 = true;
        n0();
        st7 st7Var = this.H0;
        int measuredWidth = st7Var.getMeasuredWidth();
        st7Var.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.H1;
        }
        float floor = (float) Math.floor(0.43f * f);
        via viaVar = new via(floor, floor);
        am9 am9Var = new am9(getContext(), new PointF((measuredWidth - (floor / 2.0f)) - gl.L(16.0f), (viaVar.b / 2.0f) + gl.L(72.0f)), viaVar, str);
        am9Var.setDelegate(this);
        st7Var.addView(am9Var);
        c0();
        if (z) {
            A0(am9Var);
            post(new ts7(this, am9Var, (byte) 0));
        }
        this.h2 = false;
        return am9Var;
    }

    public final pt7 k0(Object obj, TLRPC.Document document) {
        float f;
        for (int i = 0; i < document.attributes.size() && !(document.attributes.get(i) instanceof TLRPC.TL_documentAttributeSticker); i++) {
        }
        float f2 = 0.75f;
        zl6 zl6Var = this.v0;
        if (zl6Var != null) {
            f = -(zl6Var.k + zl6Var.d);
            f2 = 0.75f / zl6Var.c;
        } else {
            f = 0.0f;
        }
        qw5 qw5Var = new qw5(b0(), f2, f);
        Context context = getContext();
        float floor = (float) Math.floor(getPaintingSize().a * 0.5d);
        ?? yzaVar = new yza(context, qw5Var.a, qw5Var.c, qw5Var.b, new via(floor, floor), document, obj);
        boolean B4 = k27.B4(document);
        ImageReceiver imageReceiver = yzaVar.z0;
        if (B4) {
            imageReceiver.p1 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        }
        imageReceiver.m0(12);
        yzaVar.setDelegate(this);
        this.H0.addView(yzaVar);
        c0();
        return yzaVar;
    }

    public final vhb l0(boolean z) {
        via paintingSize = getPaintingSize();
        PointF Q0 = Q0(null);
        vhb vhbVar = new vhb(getContext(), Q0, (int) (paintingSize.a / 9.0f), "", this.q1, this.B0);
        float f = paintingSize.a / 9.0f;
        ct7 ct7Var = new ct7(this, (byte) 0);
        vhbVar.y0 = (int) (0.5f * f);
        vhbVar.z0 = (int) (f * 2.0f);
        vhbVar.A0 = ct7Var;
        float f2 = Q0.x;
        st7 st7Var = this.H0;
        if (f2 == st7Var.getMeasuredWidth() / 2.0f) {
            vhbVar.setStickyX(2);
        }
        if (Q0.y == st7Var.getMeasuredHeight() / 2.0f) {
            vhbVar.setStickyY(2);
        }
        vhbVar.setDelegate(this);
        vhbVar.setMaxWidth(this.H1 - gl.L(32.0f));
        int i = this.v1;
        vhbVar.setTypeface(k38.e(i).j);
        vhbVar.setType(k38.e(i).h);
        st7Var.addView(vhbVar, nme.c(-2.0f, -2));
        c0();
        zl6 zl6Var = this.v0;
        if (zl6Var != null) {
            vhbVar.j(1.0f / zl6Var.c);
            vhbVar.f(-(zl6Var.k + zl6Var.d));
        }
        if (z) {
            A0(vhbVar);
            vhbVar.q();
            D0(vhbVar, false);
            vhbVar.getFocusedView().requestFocus();
            gl.F3(vhbVar.getFocusedView());
            this.A0 = true;
            int i2 = k38.e(i).g;
            hs7 hs7Var = this.b1;
            hs7Var.d(i2, true);
            hs7Var.setOutlineType(k38.e(i).h);
        }
        return vhbVar;
    }

    public final hsc m0(fsc fscVar) {
        int measuredWidth;
        int i;
        this.f2 = true;
        getPaintingSize();
        PointF Q0 = Q0(null);
        st7 st7Var = this.H0;
        if (st7Var.getMeasuredWidth() <= 0) {
            measuredWidth = this.H1;
        } else {
            measuredWidth = st7Var.getMeasuredWidth();
        }
        float f = measuredWidth;
        int L = ((int) f) - gl.L(58.0f);
        hsc hscVar = new hsc(getContext(), Q0, this.v1, fscVar, f / 240.0f, L);
        if (Q0.x == st7Var.getMeasuredWidth() / 2.0f) {
            hscVar.setStickyX(2);
        }
        if (Q0.y == st7Var.getMeasuredHeight() / 2.0f) {
            hscVar.setStickyY(2);
        }
        mcb mcbVar = this.q1;
        if (mcbVar != null && (i = mcbVar.a) != -47814) {
            hscVar.setColor(i);
        }
        hscVar.setDelegate(this);
        hscVar.setMaxWidth(L);
        st7Var.addView(hscVar, nme.c(-2.0f, -2));
        c0();
        zl6 zl6Var = this.v0;
        if (zl6Var != null) {
            hscVar.j(1.0f / zl6Var.c);
            hscVar.f(-(zl6Var.k + zl6Var.d));
        }
        return hscVar;
    }

    public final void n0() {
        int i = 0;
        while (true) {
            st7 st7Var = this.H0;
            if (i < st7Var.getChildCount()) {
                View childAt = st7Var.getChildAt(i);
                if (childAt instanceof am9) {
                    if (this.z0 == childAt) {
                        D0(null, true);
                    }
                    childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(s33.h).withEndAction(new ts7(this, (am9) childAt, (byte) 1)).start();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean o() {
        return !(this.z0 instanceof u17);
    }

    public abstract void o0();

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        yb1 yb1Var = this.a2;
        if (yb1Var != null) {
            yb1Var.f(null);
            jb4 jb4Var = yb1Var.c;
            if (jb4Var != null) {
                jb4Var.f = null;
                m21 m21Var = (m21) jb4Var.g;
                if (m21Var != null) {
                    m21Var.b();
                    jb4Var.g = null;
                }
                yb1Var.c = null;
            }
            yb1Var.a.l(false);
        }
        this.c2.l(false);
        t09 t09Var = this.P1;
        if (t09Var != null) {
            gl.B2(t09Var);
            this.P1 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        tb1 tb1Var;
        this.w0 = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int i3 = gl.q.y;
        a.getCurrentActionBarHeight();
        getAdditionalTop();
        getAdditionalBottom();
        Bitmap bitmap = this.s0;
        if (bitmap != null) {
            bitmap.getWidth();
            bitmap.getHeight();
        } else {
            a.getCurrentActionBarHeight();
        }
        float f = this.x0.a;
        l34 l34Var = this.z0;
        if (l34Var != null) {
            l34Var.m();
        }
        measureChild(this.J0, i, i2);
        measureChild(this.T0, i, i2);
        measureChild(this.L0, i, i2);
        yb1 yb1Var = this.a2;
        if (yb1Var != null && (tb1Var = yb1Var.e) != null) {
            tb1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        measureChild(this.K0, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.n2 - this.C1.getPaddingUnderContainer(), Q()), 1073741824));
        FrameLayout frameLayout = this.I0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), gl.L(12.0f), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.w0 = false;
        if (gl.L(20.0f) >= 0 && !this.k2 && !this.m2) {
            this.w0 = true;
            t0();
            this.w0 = false;
        }
        if (gl.L(20.0f) >= 0) {
            return;
        }
        t0();
    }

    @Override
    public final boolean p() {
        return !this.A0;
    }

    public final u17 p0() {
        int i = 0;
        while (true) {
            st7 st7Var = this.H0;
            if (i < st7Var.getChildCount()) {
                View childAt = st7Var.getChildAt(i);
                if (childAt instanceof u17) {
                    return (u17) childAt;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final android.graphics.Bitmap q0(java.util.ArrayList r38, boolean r39, boolean r40, boolean r41, boolean r42, defpackage.f4b r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wt7.q0(java.util.ArrayList, boolean, boolean, boolean, boolean, f4b):android.graphics.Bitmap");
    }

    public final boolean r0() {
        if (!this.t0.a() && !this.f2) {
            return false;
        }
        return true;
    }

    @Override
    public final void requestLayout() {
        if (this.w0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(m01 m01Var) {
        boolean z = m01Var instanceof g01;
        zt7 zt7Var = this.T0;
        if (!z && !(m01Var instanceof i01)) {
            zt7Var.b(0.05f, 1.0f);
        } else {
            zt7Var.b(0.4f, 1.75f);
        }
        zt7Var.setDrawCenter(!(m01Var instanceof l01));
        rt7 rt7Var = this.E0;
        if (rt7Var.getCurrentBrush() instanceof l01) {
            this.S0 = true;
        }
        rt7Var.setBrush(m01Var);
        mcb mcbVar = this.q1;
        int i = mcbVar.a;
        mcbVar.a = k38.e(this.v1).c();
        mcbVar.c = this.U0.get();
        E0(mcbVar, Integer.valueOf(i), false);
        this.F0.invalidate();
    }

    public final void s0(boolean z) {
        if (this.k2) {
            J0(0);
        }
        if (z) {
            t14 t14Var = this.j2;
            if (t14Var != null && t14Var.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.j2.getMeasuredHeight());
                ofFloat.addUpdateListener(new ys7(this, (byte) 0));
                this.m2 = true;
                ofFloat.addListener(new lt7(this, (byte) 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(gb.w);
                ofFloat.start();
                return;
            }
            t0();
        }
    }

    public void setBlurManager(sl0 sl0Var) {
        this.U1 = sl0Var;
    }

    public void setCoverPreview(boolean z) {
        if (this.g2 != z) {
            this.g2 = z;
            if (z) {
                D0(null, true);
            }
            setCoverPause(z);
        }
    }

    public void setCoverTime(long j) {
        int i = 0;
        while (true) {
            st7 st7Var = this.H0;
            if (i < st7Var.getChildCount()) {
                View childAt = st7Var.getChildAt(i);
                if (childAt instanceof yza) {
                    ImageReceiver imageReceiver = ((yza) childAt).z0;
                    oy8 y = imageReceiver.y();
                    imageReceiver.m();
                    if (y != null) {
                        y.I(Math.round(((((float) j) % ((float) y.m())) / ((float) y.m())) * y.e[0]), true, false);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setHasAudio(boolean z) {
        if (z != this.O1) {
            this.O1 = z;
            c0();
        }
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.B1 = runnable;
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.A1 = runnable;
    }

    @Override
    public final void t() {
        if (!this.l2 && !this.k2) {
            this.f2 = true;
            l0(true);
            return;
        }
        if (this.k2) {
            l34 l34Var = this.z0;
            if (l34Var instanceof vhb) {
                this.E1.e = true;
                gl.F3(((vhb) l34Var).getEditText());
            }
        }
        J0(!this.k2 ? 1 : 0);
    }

    public final void t0() {
        t14 t14Var;
        if (!this.k2 && (t14Var = this.j2) != null && t14Var.getVisibility() != 8) {
            this.j2.setVisibility(8);
        }
        int i = this.n2;
        this.n2 = 0;
        if (i != 0) {
            this.E1.a();
        }
    }

    @Override
    public final void u(float f, float f2, float[] fArr) {
        View view;
        View view2 = (View) this.E0.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x = (f - view2.getX()) - view.getLeft();
        float y = (f2 - view2.getY()) - view.getTop();
        float pivotX = ((x - view2.getPivotX()) / view2.getScaleX()) + view2.getPivotX();
        float pivotY = view2.getPivotY();
        fArr[0] = pivotX;
        fArr[1] = ((y - view2.getPivotY()) / view2.getScaleY()) + pivotY;
    }

    @Override
    public final void updateColors() {
        this.u1.setColor(-15132391);
    }

    @Override
    public final int[] v(l34 l34Var) {
        int[] iArr = this.i2;
        iArr[0] = (int) l34Var.getPosition().x;
        iArr[1] = (int) l34Var.getPosition().y;
        return iArr;
    }

    public final void v0(k38 k38Var, Integer num) {
        k38Var.h(num.intValue(), true);
        k38Var.g();
        setNewColor(num.intValue());
        this.m1.setSelectedColorIndex(k38Var.d());
        this.J1 = null;
    }

    @Override
    public final k38 w() {
        return k38.e(this.v1);
    }

    public final void w0(Integer num) {
        setNewColor(num.intValue());
        I0(false);
    }

    public final boolean x0() {
        if (this.S1) {
            if (this.P1.getReactionsWindow() != null && !this.P1.getReactionsWindow().q) {
                this.P1.b();
                return true;
            }
            O0(false);
            return true;
        } else if (this.r1) {
            I0(false);
            return true;
        } else if (this.k2) {
            s0(true);
            return true;
        } else if (!this.A0) {
            return false;
        } else {
            if (this.C0) {
                this.C0 = false;
                this.E1.b(true);
                return false;
            }
            D0(null, true);
            return true;
        }
    }

    public abstract void y0(boolean z);

    @Override
    public final void z() {
        N0(new ct7(this, (byte) 4), this, 53, 0, getHeight(), false);
    }

    public final void z0() {
        int i = this.O0;
        R0(1);
        postDelayed(new am6(this, (byte) 10), 350L);
        mt7 mt7Var = new mt7(this, getContext(), this.w1, i);
        this.e2 = mt7Var;
        s7b s7bVar = this.C1;
        Objects.requireNonNull(s7bVar);
        mt7Var.w1 = new ur4(s7bVar, (byte) 26);
        boolean[] zArr = {true};
        mt7Var.setOnDismissListener(new bw5(this, zArr, i, (byte) 1));
        mt7Var.y1 = new dt7(this);
        mt7Var.J0(new r(this, zArr, mt7Var, (byte) 2));
        mt7Var.show();
        y0(true);
    }

    public View getView() {
        return this;
    }

    public void setOffsetTranslationX(float f) {
    }
}
