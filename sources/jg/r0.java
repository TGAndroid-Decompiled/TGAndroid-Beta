package jg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
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
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h6;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.s5;
import org.telegram.messenger.uz;
import org.telegram.messenger.v20;
import org.telegram.messenger.vs;
import org.telegram.messenger.w20;
import org.telegram.messenger.wp;
import org.telegram.messenger.ze;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wu0;
import org.telegram.ui.cr0;
import org.telegram.ui.oo0;
import w7.b6;
public abstract class r0 extends wu0 implements x1, h, r1, uu0, vs {
    public qu0 A0;
    public org.telegram.ui.ActionBar.k1 A1;
    public j B0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout B1;
    public boolean C0;
    public Rect C1;
    public int D0;
    public Runnable D1;
    public final boolean E0;
    public final ig.s0 E1;
    public final j0 F0;
    public boolean F1;
    public final bi.t0 G0;
    public float G1;
    public final a5 H0;
    public boolean H1;
    public final k0 I0;
    public final t5 I1;
    public i01 J0;
    public final Paint J1;
    public final FrameLayout K0;
    public final Paint K1;
    public final n0 L0;
    public vg.f L1;
    public final l0 M0;
    public final float[] M1;
    public final FrameLayout N0;
    public final int[] N1;
    public d0 O0;
    public vy O1;
    public int P0;
    public boolean P1;
    public int Q0;
    public boolean Q1;
    public float R0;
    public boolean R1;
    public ValueAnimator S0;
    public int S1;
    public boolean T0;
    public int T1;
    public final d2 U0;
    public int U1;
    public final za.c V0;
    public int V1;
    public ArrayList W0;
    public boolean W1;
    public final int X0;
    public BigInteger Y0;
    public TextView Z0;
    public TextView f10164a1;
    public TextView f10165b1;
    public final y1 f10166c1;
    public final t1 f10167d1;
    public final a2 f10168e1;
    public final ImageView f10169f1;
    public final LinearLayout f10170g1;
    public final TextView f10171h1;
    public final TextView f10172i1;
    public final k1 f10173j0;
    public final TextView f10174j1;
    public final o1 f10175k0;
    public final Paint f10176k1;
    public float f10177l0;
    public final Paint l1;
    public final Bitmap m0;
    public float f10178m1;
    public final Bitmap f10179n0;
    public boolean f10180n1;
    public final ig.t1 f10181o0;
    public o1.j f10182o1;
    public final s5 f10183p0;
    public final m0 f10184p1;
    public final ze f10185q0;
    public final Paint f10186q1;
    public float f10187r0;
    public final Paint f10188r1;
    public float f10189s0;
    public final Paint f10190s1;
    public float f10191t0;
    public final ig.q1 f10192t1;
    public float f10193u0;
    public boolean f10194u1;
    public float f10195v0;
    public o1.j f10196v1;
    public float f10197w0;
    public float f10198w1;
    public float f10199x0;
    public final Paint f10200x1;
    public boolean f10201y0;
    public final int f10202y1;
    public float f10203z0;
    public final b0 f10204z1;

    public r0(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, ze zeVar, oo0 oo0Var, final p6 p6Var) {
        super(context, activity);
        boolean z10;
        float f7;
        int i12;
        h6[] h6VarArr;
        e2 e2Var;
        boolean z11 = false;
        this.P0 = 0;
        this.Q0 = -1;
        final cr0 cr0Var = (cr0) this;
        this.V0 = new za.c(cr0Var, 25);
        this.f10176k1 = new Paint(1);
        this.l1 = new Paint(1);
        this.f10186q1 = new Paint(1);
        this.f10188r1 = new Paint(1);
        this.f10190s1 = new Paint(1);
        ig.q1 q1Var = new ig.q1(1.0f, 0.016773745f, -1);
        this.f10192t1 = q1Var;
        this.f10200x1 = new Paint(1);
        this.H1 = false;
        this.I1 = new t5((View) this, 350L, gr.h);
        this.J1 = new Paint(1);
        Paint paint = new Paint(1);
        this.K1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.M1 = new float[2];
        this.N1 = new int[2];
        new androidx.activity.i(cr0Var, 23);
        setDelegate(this);
        this.f10202y1 = i10;
        this.f10204z1 = new p6() {
            @Override
            public final boolean a() {
                return t6.I.q();
            }

            @Override
            public final void b(float f10, float f11, int i13, int i14) {
                t6.r(f10, f11, i13, i14);
            }

            @Override
            public final ColorFilter c() {
                return t6.f21257v3;
            }

            @Override
            public final Paint d(String str) {
                return t6.V0(str);
            }

            @Override
            public final boolean e() {
                return uz.H0;
            }

            @Override
            public final int f(int i13) {
                return h(i13);
            }

            @Override
            public final boolean g() {
                return false;
            }

            @Override
            public final Drawable getDrawable(String str) {
                return null;
            }

            @Override
            public final int h(int i13) {
                if (i13 == t6.G8) {
                    return -14145495;
                }
                if (i13 != t6.E8) {
                    if (i13 == t6.f21002h5) {
                        return -14737633;
                    }
                    if (i13 == t6.f21038j5) {
                        return -592138;
                    }
                    if (i13 == t6.f21186r5) {
                        return -8553091;
                    }
                    if (i13 != t6.f21286wf) {
                        if (i13 == t6.f21338zf) {
                            return -1610612736;
                        }
                        if (i13 == t6.Cf || i13 == t6.Gf || i13 == t6.Bf) {
                            return -9539985;
                        }
                        if (i13 != t6.G6) {
                            int i14 = t6.Ai;
                            if (i13 == i14) {
                                return -11754001;
                            }
                            if (i13 == t6.f21021i6) {
                                return 536870911;
                            }
                            if (i13 != t6.ti && i13 != t6.si && i13 != t6.ui) {
                                if (i13 == t6.vi) {
                                    return 352321535;
                                }
                                if (i13 != t6.f21321yf && i13 != i14) {
                                    if (i13 == t6.xf) {
                                        return 780633991;
                                    }
                                    if (i13 == t6.f20873a7) {
                                        return -15921907;
                                    }
                                    if (i13 == t6.f21097m7) {
                                        return -12500671;
                                    }
                                    if (i13 == t6.f21078l7) {
                                        return -13133079;
                                    }
                                    if (i13 == t6.f21117n7) {
                                        return -1;
                                    }
                                    if (i13 == t6.f20930d6) {
                                        return -15198183;
                                    }
                                    if (i13 == t6.f20931d7) {
                                        return -16777216;
                                    }
                                    p6 p6Var2 = p6.this;
                                    if (p6Var2 != null) {
                                        return p6Var2.h(i13);
                                    }
                                    return t6.v0(i13);
                                }
                                return -7895161;
                            }
                            return -1;
                        }
                        return -1;
                    }
                    return -16777216;
                }
                return -1;
            }

            @Override
            public final int j(int i13) {
                return h(i13);
            }

            @Override
            public final void i(int i13, int i14) {
            }
        };
        this.f10185q0 = zeVar;
        this.E0 = context instanceof BubbleActivity;
        ig.s0 e = ig.s0.e(i10);
        this.E1 = e;
        e.i(0, true);
        q1Var.f8433a = e.c();
        q1Var.f8435c = e.f8457i;
        s5 s5Var = new s5("Paint", true);
        this.f10183p0 = s5Var;
        this.m0 = bitmap;
        this.f10179n0 = bitmap2;
        this.X0 = i11;
        ig.t1 t1Var = new ig.t1();
        this.f10181o0 = t1Var;
        t1Var.f8470a = new ig.c0(cr0Var, 9);
        j0 j0Var = new j0(cr0Var, context, new ig.q0(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.F0 = j0Var;
        j0Var.setDelegate(new n4.q(cr0Var, oo0Var, false));
        j0Var.setUndoStore(t1Var);
        j0Var.setQueue(s5Var);
        j0Var.setVisibility(4);
        addView(j0Var, b6.e(-1, -1, 51));
        bi.t0 t0Var = new bi.t0(cr0Var, context, 2);
        this.G0 = t0Var;
        t0Var.setVisibility(4);
        addView(t0Var, b6.e(-1, -1, 51));
        k0 k0Var = new k0(cr0Var, context, new a6.i(cr0Var, 28));
        this.I0 = k0Var;
        addView(k0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                w20 w20Var = (w20) arrayList.get(i13);
                byte b10 = w20Var.f18970a;
                if (b10 == 0) {
                    f7 = 2.0f;
                    ?? g02 = g0(w20Var.C, w20Var.B, z11);
                    if ((w20Var.f18971b & 2) != 0) {
                        g02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = g02.getLayoutParams();
                    layoutParams.width = w20Var.f18983q;
                    layoutParams.height = w20Var.f18984r;
                    i12 = size;
                    e2Var = g02;
                } else {
                    f7 = 2.0f;
                    if (b10 == 1) {
                        ?? h02 = h0(z11);
                        h02.setType(w20Var.f18971b);
                        h02.setTypeface(w20Var.f18980n);
                        h02.setBaseFontSize(w20Var.f18979m);
                        SpannableString spannableString = new SpannableString(w20Var.f18976j);
                        ?? r15 = w20Var.f18977k;
                        int size2 = r15.size();
                        int i14 = z11;
                        while (i14 < size2) {
                            Object obj = r15.get(i14);
                            int i15 = i14 + 1;
                            v20 v20Var = (v20) obj;
                            o5 o5Var = new o5(v20Var.document_id, h02.getFontMetricsInt());
                            int i16 = v20Var.offset;
                            spannableString.setSpan(o5Var, i16, v20Var.length + i16, 33);
                            size = size;
                            size2 = size2;
                            i14 = i15;
                        }
                        i12 = size;
                        CharSequence m10 = k6.m(spannableString, h02.getFontMetricsInt(), false, null, 0);
                        if ((m10 instanceof Spanned) && (h6VarArr = (h6[]) ((Spanned) m10).getSpans(0, m10.length(), h6.class)) != null) {
                            for (h6 h6Var : h6VarArr) {
                                h6Var.f16025b = 0.85f;
                            }
                        }
                        h02.setText(m10);
                        t0(h02, w20Var.f18982p);
                        ig.q1 swatch = h02.getSwatch();
                        swatch.f8433a = w20Var.f18978l;
                        h02.setSwatch(swatch);
                        e2Var = h02;
                    } else {
                        i12 = size;
                        if (b10 == 2) {
                            e2 f02 = f0(w20Var.f18976j, false);
                            f02.B0 = false;
                            if ((w20Var.f18971b & 2) != 0) {
                                f02.r(false);
                            }
                            if ((w20Var.f18971b & 16) != 0) {
                                f02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = f02.getLayoutParams();
                            layoutParams2.width = w20Var.f18983q;
                            layoutParams2.height = w20Var.f18984r;
                            e2Var = f02;
                        } else {
                            i13++;
                            size = i12;
                            z11 = false;
                        }
                    }
                }
                e2Var.setX((w20Var.f18972c * this.A0.f29808a) - (((1.0f - w20Var.v) * w20Var.f18983q) / f7));
                e2Var.setY((w20Var.d * this.A0.f29809b) - (((1.0f - w20Var.v) * w20Var.f18984r) / f7));
                e2Var.setPosition(new PointF((w20Var.f18983q / f7) + e2Var.getX(), (w20Var.f18984r / f7) + e2Var.getY()));
                e2Var.setScale(w20Var.v);
                e2Var.setRotation((float) (((-w20Var.e) / 3.141592653589793d) * 180.0d));
                i13++;
                size = i12;
                z11 = false;
            }
        }
        this.I0.setVisibility(4);
        a5 a5Var = new a5(context, 5);
        this.H0 = a5Var;
        addView(a5Var);
        ?? frameLayout = new FrameLayout(context);
        this.K0 = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, b6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f10169f1 = imageView;
        imageView.setImageResource(2131232530);
        imageView.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        imageView.setBackground(t6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        cr0 cr0Var2 = cr0Var;
                        j0 j0Var2 = cr0Var2.F0;
                        if (j0Var2 != null && (j0Var2.getCurrentBrush() instanceof ig.g)) {
                            j0Var2.b();
                            cr0Var2.f10166c1.setSelectedIndex(1);
                            cr0Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        cr0Var2.f10181o0.c();
                        return;
                    case 1:
                        cr0 cr0Var3 = cr0Var;
                        j0 j0Var3 = cr0Var3.F0;
                        ig.t1 t1Var2 = cr0Var3.f10181o0;
                        if (t1Var2.a()) {
                            if (j0Var3 != null && (j0Var3.getCurrentBrush() instanceof ig.g)) {
                                j0Var3.b();
                                cr0Var3.f10166c1.setSelectedIndex(1);
                                cr0Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            j0Var3.a();
                            t1Var2.f8472c.clear();
                            t1Var2.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            cr0Var3.I0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        cr0 cr0Var4 = cr0Var;
                        j jVar = cr0Var4.B0;
                        if (jVar instanceof g3) {
                            org.telegram.messenger.i0.v1(((g3) jVar).getFocusedView());
                        }
                        if (cr0Var4.P1) {
                            cr0Var4.k0(false);
                        }
                        cr0Var4.p0(cr0Var4.B0);
                        cr0Var4.q0(null, true);
                        return;
                    default:
                        cr0Var.q0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, b6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10170g1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(t6.h0(822083583, 7, -1));
        linearLayout.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(dd.L0(2131747283, null));
        linearLayout.addView(a30.e(context, 2131232531), b6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, b6.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new bh.c(2));
        frameLayout.addView(linearLayout, b6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f10171h1 = textView2;
        textView2.setBackground(t6.h0(822083583, 7, -1));
        textView2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        textView2.setText(dd.L0(2131747295, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        cr0 cr0Var2 = cr0Var;
                        j0 j0Var2 = cr0Var2.F0;
                        if (j0Var2 != null && (j0Var2.getCurrentBrush() instanceof ig.g)) {
                            j0Var2.b();
                            cr0Var2.f10166c1.setSelectedIndex(1);
                            cr0Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        cr0Var2.f10181o0.c();
                        return;
                    case 1:
                        cr0 cr0Var3 = cr0Var;
                        j0 j0Var3 = cr0Var3.F0;
                        ig.t1 t1Var2 = cr0Var3.f10181o0;
                        if (t1Var2.a()) {
                            if (j0Var3 != null && (j0Var3.getCurrentBrush() instanceof ig.g)) {
                                j0Var3.b();
                                cr0Var3.f10166c1.setSelectedIndex(1);
                                cr0Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            j0Var3.a();
                            t1Var2.f8472c.clear();
                            t1Var2.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            cr0Var3.I0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        cr0 cr0Var4 = cr0Var;
                        j jVar = cr0Var4.B0;
                        if (jVar instanceof g3) {
                            org.telegram.messenger.i0.v1(((g3) jVar).getFocusedView());
                        }
                        if (cr0Var4.P1) {
                            cr0Var4.k0(false);
                        }
                        cr0Var4.p0(cr0Var4.B0);
                        cr0Var4.q0(null, true);
                        return;
                    default:
                        cr0Var.q0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView2, b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f10172i1 = l4;
        l4.setBackground(t6.h0(822083583, 7, -1));
        l4.setText(dd.L0(2131752101, null));
        l4.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        l4.setGravity(16);
        l4.setTextColor(-1);
        l4.setTypeface(org.telegram.messenger.i0.o());
        l4.setTextSize(1, 16.0f);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        cr0 cr0Var2 = cr0Var;
                        j0 j0Var2 = cr0Var2.F0;
                        if (j0Var2 != null && (j0Var2.getCurrentBrush() instanceof ig.g)) {
                            j0Var2.b();
                            cr0Var2.f10166c1.setSelectedIndex(1);
                            cr0Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        cr0Var2.f10181o0.c();
                        return;
                    case 1:
                        cr0 cr0Var3 = cr0Var;
                        j0 j0Var3 = cr0Var3.F0;
                        ig.t1 t1Var2 = cr0Var3.f10181o0;
                        if (t1Var2.a()) {
                            if (j0Var3 != null && (j0Var3.getCurrentBrush() instanceof ig.g)) {
                                j0Var3.b();
                                cr0Var3.f10166c1.setSelectedIndex(1);
                                cr0Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            j0Var3.a();
                            t1Var2.f8472c.clear();
                            t1Var2.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            cr0Var3.I0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        cr0 cr0Var4 = cr0Var;
                        j jVar = cr0Var4.B0;
                        if (jVar instanceof g3) {
                            org.telegram.messenger.i0.v1(((g3) jVar).getFocusedView());
                        }
                        if (cr0Var4.P1) {
                            cr0Var4.k0(false);
                        }
                        cr0Var4.p0(cr0Var4.B0);
                        cr0Var4.q0(null, true);
                        return;
                    default:
                        cr0Var.q0(null, true);
                        return;
                }
            }
        });
        l4.setAlpha(0.0f);
        l4.setVisibility(8);
        TextView l10 = org.telegram.ui.Cells.f1.l(frameLayout, l4, b6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f10174j1 = l10;
        l10.setBackground(t6.h0(822083583, 7, -1));
        l10.setText(dd.L0(2131751355, null));
        l10.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        l10.setGravity(16);
        l10.setTextColor(-1);
        l10.setTypeface(org.telegram.messenger.i0.o());
        l10.setTextSize(1, 16.0f);
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        cr0 cr0Var2 = cr0Var;
                        j0 j0Var2 = cr0Var2.F0;
                        if (j0Var2 != null && (j0Var2.getCurrentBrush() instanceof ig.g)) {
                            j0Var2.b();
                            cr0Var2.f10166c1.setSelectedIndex(1);
                            cr0Var2.z((ig.h) ig.h.f8316a.get(0));
                            return;
                        }
                        cr0Var2.f10181o0.c();
                        return;
                    case 1:
                        cr0 cr0Var3 = cr0Var;
                        j0 j0Var3 = cr0Var3.F0;
                        ig.t1 t1Var2 = cr0Var3.f10181o0;
                        if (t1Var2.a()) {
                            if (j0Var3 != null && (j0Var3.getCurrentBrush() instanceof ig.g)) {
                                j0Var3.b();
                                cr0Var3.f10166c1.setSelectedIndex(1);
                                cr0Var3.z((ig.h) ig.h.f8316a.get(0));
                            }
                            j0Var3.a();
                            t1Var2.f8472c.clear();
                            t1Var2.f8471b.clear();
                            org.telegram.messenger.i0.g3(new gg.c(t1Var2, 9));
                            cr0Var3.I0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        cr0 cr0Var4 = cr0Var;
                        j jVar = cr0Var4.B0;
                        if (jVar instanceof g3) {
                            org.telegram.messenger.i0.v1(((g3) jVar).getFocusedView());
                        }
                        if (cr0Var4.P1) {
                            cr0Var4.k0(false);
                        }
                        cr0Var4.p0(cr0Var4.B0);
                        cr0Var4.q0(null, true);
                        return;
                    default:
                        cr0Var.q0(null, true);
                        return;
                }
            }
        });
        l10.setAlpha(0.0f);
        l10.setVisibility(8);
        frameLayout.addView(l10, b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        n0 n0Var = new n0(cr0Var, context);
        this.L0 = n0Var;
        n0Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), 0);
        n0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(n0Var, b6.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y1 y1Var = new y1(context, z10);
        this.f10166c1 = y1Var;
        y1Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        y1Var.setDelegate(this);
        y1Var.setSelectedIndex(1);
        n0Var.addView(y1Var, b6.c(48.0f, -1));
        t1 t1Var2 = new t1(context);
        this.f10167d1 = t1Var2;
        t1Var2.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        t1Var2.setVisibility(8);
        t1Var2.setDelegate(this);
        t1Var2.setAlignment(ig.s0.e(i10).f8456g);
        n0Var.addView(t1Var2, b6.c(48.0f, -1));
        l0 l0Var = new l0(cr0Var, context);
        this.M0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        a2 a2Var = new a2(context);
        this.f10168e1 = a2Var;
        a2Var.setVisibility(8);
        a2Var.setOnItemClickListener(new ag.y0(cr0Var, 4));
        t1Var2.setTypefaceListView(a2Var);
        l0Var.addView(a2Var, b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f10176k1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f10176k1.setColor(1728053247);
        this.f10176k1.setStrokeWidth(Math.max(2, org.telegram.messenger.i0.L(1.0f)));
        this.l1.setColor(t6.w0(t6.G8, this.f10204z1));
        m0 m0Var = new m0(cr0Var, context);
        this.f10184p1 = m0Var;
        m0Var.setVisibility(8);
        m0Var.setColorPalette(ig.s0.e(i10));
        m0Var.setColorListener(new m(cr0Var, 0));
        n0Var.addView(m0Var, b6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        k1 k1Var = new k1(context);
        this.f10173j0 = k1Var;
        k1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        k1Var.setBackground(t6.h0(1090519039, 1, -1));
        n0Var.addView(k1Var, b6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        o1 o1Var = new o1(context);
        this.f10175k0 = o1Var;
        o1Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        o1Var.setBackground(t6.h0(1090519039, 1, -1));
        o1Var.setOnClickListener(new ag.i(cr0Var, context, bitmap2, 4));
        n0Var.addView(o1Var, b6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        d2 d2Var = new d2(context);
        this.U0 = d2Var;
        d2Var.setColorSwatch(this.f10192t1);
        d2Var.setRenderView(this.F0);
        d2Var.setValueOverride(this.V0);
        this.f10192t1.f8435c = this.V0.get();
        d2Var.setOnUpdate(new ag.d3(cr0Var, i10, 7));
        addView(d2Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.N0 = frameLayout2;
        addView(frameLayout2, b6.c(-1.0f, -1));
        this.f10190s1.setStyle(style);
        this.f10190s1.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        r0(this.f10192t1, null);
        z((ig.h) ig.h.f8316a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = org.telegram.messenger.i0.f16172q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), org.telegram.messenger.i0.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public static void X(cr0 cr0Var, Integer num) {
        cr0Var.setNewColor(num.intValue());
        cr0Var.v0(false);
    }

    public static void Y(jg.r0 r13) {
        throw new UnsupportedOperationException("Method not decompiled: jg.r0.Y(jg.r0):void");
    }

    public static void Z(r0 r0Var) {
        w2 w2Var;
        k0 k0Var = r0Var.I0;
        j jVar = r0Var.B0;
        if (jVar != null) {
            PointF z02 = r0Var.z0(jVar);
            j jVar2 = r0Var.B0;
            if (jVar2 instanceof w2) {
                w2 w2Var2 = new w2(r0Var.getContext(), (w2) r0Var.B0, z02);
                w2Var2.setDelegate(r0Var);
                k0Var.addView(w2Var2);
                w2Var = w2Var2;
            } else if (jVar2 instanceof g3) {
                g3 g3Var = new g3(r0Var.getContext(), (g3) r0Var.B0, z02);
                g3Var.setDelegate(r0Var);
                g3Var.setMaxWidth((int) (r0Var.getPaintingSize().f29808a - 20.0f));
                k0Var.addView(g3Var, b6.c(-2.0f, -2));
                w2Var = g3Var;
            } else {
                w2Var = null;
            }
            r0Var.o0(w2Var);
            r0Var.q0(w2Var, true);
        }
        org.telegram.ui.ActionBar.k1 k1Var = r0Var.A1;
        if (k1Var != null && k1Var.isShowing()) {
            r0Var.A1.d(true);
        }
    }

    public static void a0(cr0 cr0Var, Integer num) {
        ig.s0 s0Var = cr0Var.E1;
        s0Var.h(num.intValue(), true);
        s0Var.g();
        cr0Var.setNewColor(num.intValue());
        m0 m0Var = cr0Var.f10184p1;
        m0Var.setSelectedColorIndex(s0Var.d());
        m0Var.getAdapter().f();
    }

    public ViewGroup getBarView() {
        if (this.P0 == 2) {
            return this.f10167d1;
        }
        return this.f10166c1;
    }

    private int getFrameRotation() {
        int i10 = this.X0;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private qu0 getPaintingSize() {
        int i10;
        qu0 qu0Var = this.A0;
        if (qu0Var != null) {
            return qu0Var;
        }
        Bitmap bitmap = this.m0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o10 = uz.o();
        if (o10 != 0) {
            if (o10 != 2) {
                i10 = 2560;
            } else {
                i10 = 3840;
            }
        } else {
            i10 = 1280;
        }
        qu0 qu0Var2 = new qu0(width, height);
        float f7 = i10;
        qu0Var2.f29808a = f7;
        float floor = (float) Math.floor((f7 * height) / width);
        qu0Var2.f29809b = floor;
        if (floor > f7) {
            qu0Var2.f29809b = f7;
            qu0Var2.f29808a = (float) Math.floor((f7 * width) / height);
        }
        this.A0 = qu0Var2;
        return qu0Var2;
    }

    public void setNewColor(int i10) {
        ig.q1 q1Var = this.f10192t1;
        int i11 = q1Var.f8433a;
        q1Var.f8433a = i10;
        r0(q1Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new a0(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.D0 = i10;
        j jVar = this.B0;
        if (jVar instanceof g3) {
            ((g3) jVar).setType(i10);
        }
        ig.s0 e = ig.s0.e(this.f10202y1);
        e.h = i10;
        e.f8452a.edit().putInt("text_type", i10).apply();
        this.f10167d1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        d0 d0Var = new d0(this, context);
        this.O0 = d0Var;
        d0Var.setClipToPadding(false);
        this.O0.setOrientation(0);
        this.L0.addView(this.O0, b6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.Z0 = textView;
        textView.setText(dd.L0(2131747293, null).toUpperCase());
        TextView textView2 = this.Z0;
        int i10 = t6.f21021i6;
        b0 b0Var = this.f10204z1;
        a7.R(textView2, t6.h0(t6.w0(i10, b0Var), 7, -1), null, a7.N(i10), b0Var);
        this.Z0.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.Z0.setTextColor(-1);
        this.Z0.setTextSize(1, 14.0f);
        this.Z0.setGravity(1);
        this.Z0.setTypeface(org.telegram.messenger.i0.o());
        this.Z0.setSingleLine();
        this.Z0.setOnClickListener(new k(this, 0));
        this.O0.addView(this.Z0, b6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f10164a1 = textView3;
        textView3.setText(dd.L0(2131747292, null).toUpperCase());
        a7.R(this.f10164a1, t6.h0(t6.w0(i10, b0Var), 7, -1), null, a7.N(i10), b0Var);
        this.f10164a1.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.f10164a1.setOnClickListener(new k(this, 1));
        this.f10164a1.setTextColor(-1);
        this.f10164a1.setTextSize(1, 14.0f);
        this.f10164a1.setGravity(1);
        this.f10164a1.setTypeface(org.telegram.messenger.i0.o());
        this.f10164a1.setAlpha(0.6f);
        this.f10164a1.setSingleLine();
        this.O0.addView(this.f10164a1, b6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f10165b1 = textView4;
        textView4.setText(dd.L0(2131747291, null).toUpperCase());
        a7.R(this.f10165b1, t6.h0(t6.w0(i10, b0Var), 7, -1), null, a7.N(i10), b0Var);
        this.f10165b1.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        this.f10165b1.setTextColor(-1);
        this.f10165b1.setTextSize(1, 14.0f);
        this.f10165b1.setGravity(1);
        this.f10165b1.setTypeface(org.telegram.messenger.i0.o());
        this.f10165b1.setAlpha(0.6f);
        this.f10165b1.setSingleLine();
        this.f10165b1.setOnClickListener(new k(this, 4));
        this.O0.addView(this.f10165b1, b6.l(1.0f, 0, -2));
    }

    public static void t0(g3 g3Var, int i10) {
        int i11;
        g3Var.setAlign(i10);
        int i12 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 19;
            } else {
                i11 = 21;
            }
        } else {
            i11 = 17;
        }
        g3Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !dd.X : dd.X) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        g3Var.getEditText().setTextAlignment(i12);
    }

    @Override
    public final void A() {
        x0(new n(this, 4), this, 53, 0, getHeight());
    }

    public final void A0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.P0 != i10 && this.Q0 != i10) {
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.P0;
            ViewGroup viewGroup3 = this.f10167d1;
            ViewGroup viewGroup4 = this.f10166c1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.Q0 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.f10202y1;
            ig.s0 e = ig.s0.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e.f8460l != z10) {
                e.f8460l = z10;
                if (z10) {
                    e.i(-1, false);
                } else {
                    e.i(e.f8452a.getInt("brush", 0), false);
                }
            }
            int c10 = ig.s0.e(i12).c();
            ig.q1 q1Var = this.f10192t1;
            q1Var.f8433a = c10;
            r0(q1Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.S0 = duration;
            duration.setInterpolator(gr.f26523f);
            this.S0.addUpdateListener(new ci.b(this, viewGroup, viewGroup2, 1));
            this.S0.addListener(new ci.k(this, viewGroup, viewGroup2, i10, 1));
            this.S0.start();
        }
    }

    public final void B0() {
        int i10 = 0;
        while (true) {
            k0 k0Var = this.I0;
            if (i10 < k0Var.getChildCount()) {
                View childAt = k0Var.getChildAt(i10);
                if (childAt != this.B0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f10047l0 && jVar.f10045j0 <= 0.0f) {
                        }
                    }
                    i10++;
                }
                ((j) childAt).m();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void D() {
        y0(true);
    }

    @Override
    public final void L(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > org.telegram.messenger.i0.L(50.0f) && this.Q1 && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
            if (z10) {
                this.U1 = i10;
                wp.c1().edit().putInt("kbd_height_land3", this.U1).commit();
            } else {
                this.T1 = i10;
                wp.c1().edit().putInt("kbd_height", this.T1).commit();
            }
        }
        if (this.P1) {
            if (z10) {
                i11 = this.U1;
            } else {
                i11 = this.T1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O1.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = org.telegram.messenger.i0.f16172q.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.O1.setLayoutParams(layoutParams);
                this.S1 = layoutParams.height;
                requestLayout();
                vh.r2 r2Var = ((cr0) this).X1.K1;
                if (r2Var != null) {
                    r2Var.a();
                }
                getHeight();
            }
        }
        if (this.V1 == i10 && this.W1 == z10) {
            getHeight();
            return;
        }
        this.V1 = i10;
        this.W1 = z10;
        boolean z13 = this.Q1;
        j jVar = this.B0;
        if (jVar instanceof g3) {
            if (((g3) jVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.Q1 = z12;
        } else {
            this.Q1 = false;
        }
        if (this.Q1 && this.P1) {
            w0(0);
        }
        if (this.S1 != 0 && !(z11 = this.Q1) && z11 != z13 && !this.P1) {
            this.S1 = 0;
            requestLayout();
            vh.r2 r2Var2 = ((cr0) this).X1.K1;
            if (r2Var2 != null) {
                r2Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        v0(true);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.G8));
        hashSet.add(Integer.valueOf(t6.f21002h5));
        hashSet.add(Integer.valueOf(t6.f21038j5));
        hashSet.add(Integer.valueOf(t6.f21186r5));
        hashSet.add(Integer.valueOf(t6.f21286wf));
        hashSet.add(Integer.valueOf(t6.f21338zf));
        hashSet.add(Integer.valueOf(t6.Cf));
        hashSet.add(Integer.valueOf(t6.Gf));
        hashSet.add(Integer.valueOf(t6.Bf));
        hashSet.add(Integer.valueOf(t6.G6));
        hashSet.add(Integer.valueOf(t6.Ai));
        hashSet.add(Integer.valueOf(t6.ti));
        hashSet.add(Integer.valueOf(t6.si));
        hashSet.add(Integer.valueOf(t6.ui));
        hashSet.add(Integer.valueOf(t6.vi));
        hashSet.add(Integer.valueOf(t6.f21321yf));
        hashSet.add(Integer.valueOf(t6.xf));
        hashSet.add(Integer.valueOf(t6.f20873a7));
        hashSet.add(Integer.valueOf(t6.f21097m7));
        hashSet.add(Integer.valueOf(t6.f21078l7));
        hashSet.add(Integer.valueOf(t6.f21117n7));
        hashSet.add(Integer.valueOf(t6.f20930d6));
        hashSet.add(Integer.valueOf(t6.f20931d7));
    }

    @Override
    public final void b(j jVar) {
        int[] i02 = i0(jVar);
        x0(new x(this, jVar, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.i0.L(32.0f));
    }

    @Override
    public final void c() {
        setTextType((this.D0 + 1) % 4);
    }

    @Override
    public final void d(int i10) {
        j jVar = this.B0;
        if (jVar instanceof g3) {
            t0((g3) jVar, i10);
            ig.s0 e = ig.s0.e(this.f10202y1);
            e.f8456g = i10;
            e.f8452a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void d0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new d1.e(24, this, (e2) view)).start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k0 k0Var;
        g3 g3Var;
        String str;
        if (i10 == at.C5 && (k0Var = this.I0) != null) {
            for (int i12 = 0; i12 < k0Var.getChildCount(); i12++) {
                View childAt = k0Var.getChildAt(i12);
                if ((childAt instanceof g3) && (str = (g3Var = (g3) childAt).A0) != null) {
                    g3Var.setTypeface(str);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r15, android.view.View r16, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: jg.r0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public final PointF e0() {
        ze zeVar;
        qu0 paintingSize = getPaintingSize();
        float f7 = paintingSize.f29808a / 2.0f;
        float f10 = paintingSize.f29809b / 2.0f;
        if (this.f10185q0 != null) {
            double radians = (float) Math.toRadians(-(zeVar.f19698k + zeVar.d));
            float cos = (float) ((Math.cos(radians) * zeVar.f19692a) - (Math.sin(radians) * zeVar.f19693b));
            float c10 = (float) i0.a.c(radians, zeVar.f19693b, Math.sin(radians) * zeVar.f19692a);
            f7 -= cos * paintingSize.f29808a;
            f10 -= c10 * paintingSize.f29809b;
        }
        return new PointF(f7, f10);
    }

    public final e2 f0(String str, boolean z10) {
        float f7;
        qu0 qu0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f7 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            f8.g(e, true);
            f7 = 1.0f;
        }
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        k0 k0Var = this.I0;
        if (i10 > 0) {
            float floor = (float) Math.floor(k0Var.getMeasuredWidth() * 0.5d);
            qu0Var = new qu0(floor, floor / f7);
        } else {
            float floor2 = (float) Math.floor(k0Var.getMeasuredHeight() * 0.5d);
            qu0Var = new qu0(f7 * floor2, floor2);
        }
        qu0 qu0Var2 = qu0Var;
        Pair N0 = org.telegram.messenger.i0.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f10 = qu0Var2.f29808a;
            qu0Var2.f29808a = qu0Var2.f29809b;
            qu0Var2.f29809b = f10;
        }
        Context context = getContext();
        PointF e02 = e0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        e2 e2Var = new e2(context, e02, qu0Var2, str, intValue);
        e2Var.setDelegate(this);
        k0Var.addView(e2Var);
        if (z10) {
            o0(e2Var);
            q0(e2Var, true);
        }
        return e2Var;
    }

    public final jg.g0 g0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: jg.r0.g0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):jg.g0");
    }

    public int getAdditionalBottom() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    public int getAdditionalTop() {
        return org.telegram.messenger.i0.L(48.0f);
    }

    public View getCancelView() {
        return this.f10173j0;
    }

    public float getCropRotation() {
        ze zeVar = this.f10185q0;
        if (zeVar != null) {
            return zeVar.d + zeVar.f19698k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f10175k0;
    }

    public long getLcm() {
        return this.Y0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        o5[] o5VarArr;
        k0 k0Var = this.I0;
        int childCount = k0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = k0Var.getChildAt(i10);
            if (childAt instanceof w2) {
                TLRPC.Document sticker = ((w2) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f19806id = sticker.f19800id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof g3) {
                CharSequence text = ((g3) childAt).getText();
                if ((text instanceof Spanned) && (o5VarArr = (o5[]) ((Spanned) text).getSpans(0, text.length(), o5.class)) != null) {
                    for (o5 o5Var : o5VarArr) {
                        if (o5Var != null) {
                            TLRPC.Document document = o5Var.document;
                            if (document == null) {
                                document = f5.e(this.f10202y1, o5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f19806id = document.f19800id;
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
        return this.f10177l0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public ig.c1 getRenderView() {
        return this.F0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.B0;
        k0 k0Var = this.I0;
        if (jVar == null) {
            return getY() + k0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (k0Var.getScaleY() * this.B0.getHeight()) + iArr[1];
    }

    public i01 getThanosEffect() {
        if (!i01.c()) {
            return null;
        }
        if (this.J0 == null) {
            i01 i01Var = new i01(getContext(), new n(this, 0));
            this.J0 = i01Var;
            addView(i01Var);
        }
        return this.J0;
    }

    public final g3 h0(boolean z10) {
        ((cr0) this).X1.f33494g0.isFocusable();
        qu0 paintingSize = getPaintingSize();
        PointF z02 = z0(null);
        g3 g3Var = new g3(getContext(), z02, (int) (paintingSize.f29808a / 9.0f), "", this.f10192t1, this.D0);
        float f7 = paintingSize.f29808a / 9.0f;
        n nVar = new n(this, 2);
        g3Var.f9990w0 = (int) (0.5f * f7);
        g3Var.f9991x0 = (int) (f7 * 2.0f);
        g3Var.f9992y0 = nVar;
        float f10 = z02.x;
        k0 k0Var = this.I0;
        if (f10 == k0Var.getMeasuredWidth() / 2.0f) {
            g3Var.setStickyX(2);
        }
        if (z02.y == k0Var.getMeasuredHeight() / 2.0f) {
            g3Var.setStickyY(2);
        }
        g3Var.setDelegate(this);
        g3Var.setMaxWidth((int) (paintingSize.f29808a - 20.0f));
        int i10 = this.f10202y1;
        g3Var.setTypeface(ig.s0.e(i10).f8458j);
        g3Var.setType(ig.s0.e(i10).h);
        k0Var.addView(g3Var, b6.c(-2.0f, -2));
        ze zeVar = this.f10185q0;
        if (zeVar != null) {
            g3Var.j(1.0f / zeVar.f19694c);
            g3Var.f(-(zeVar.f19698k + zeVar.d));
        }
        if (z10) {
            o0(g3Var);
            g3Var.q();
            q0(g3Var, false);
            g3Var.getFocusedView().requestFocus();
            org.telegram.messenger.i0.J3(g3Var.getFocusedView());
            this.C0 = true;
            int i11 = ig.s0.e(i10).f8456g;
            t1 t1Var = this.f10167d1;
            t1Var.d(i11, true);
            t1Var.setOutlineType(ig.s0.e(i10).h);
        }
        return g3Var;
    }

    public final boolean i(MotionEvent motionEvent) {
        if (this.B0 != null) {
            q0(null, true);
        }
        float x10 = motionEvent.getX();
        j0 j0Var = this.F0;
        float translationX = ((x10 - j0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / j0Var.getScaleX();
        float y3 = ((((motionEvent.getY() - j0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + org.telegram.messenger.i0.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / j0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-j0Var.getRotation());
        double d10 = y3;
        float measuredWidth = (j0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (j0Var.getMeasuredHeight() / 2.0f) + ((float) i0.a.c(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        j0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int[] i0(j jVar) {
        float[] fArr = this.M1;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        ViewParent parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.N1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = org.telegram.messenger.i0.f16172q;
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.I0.getRotation());
        double d10 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (point.y / 2) + ((int) i0.a.c(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final int j0(boolean z10) {
        return this.S1;
    }

    public final void k0(boolean z10) {
        if (this.P1) {
            w0(0);
        }
        if (z10) {
            vy vyVar = this.O1;
            if (vyVar != null && vyVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.O1.getMeasuredHeight());
                ofFloat.addUpdateListener(new o(this, 0));
                this.R1 = true;
                ofFloat.addListener(new h0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.f20562w);
                ofFloat.start();
                return;
            }
            l0();
        }
    }

    public final void l0() {
        vy vyVar;
        vh.r2 r2Var;
        if (this.S1 > 0 && (r2Var = ((cr0) this).X1.K1) != null) {
            r2Var.a();
        }
        if (!this.P1 && (vyVar = this.O1) != null && vyVar.getVisibility() != 8) {
            this.O1.setVisibility(8);
        }
        this.S1 = 0;
    }

    public final void m0(boolean z10) {
        int i10;
        int i11;
        if (this.P0 == 0) {
            int i12 = 0;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.U0.setLayerType(i10, null);
            if (z10) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.L0.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.K0.setLayerType(i12, null);
        }
    }

    public final boolean n0() {
        if (this.f10194u1) {
            v0(false);
            return true;
        } else if (this.P1) {
            k0(true);
            return true;
        } else if (!this.C0) {
            return false;
        } else {
            q0(null, true);
            return true;
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    public final void o0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.f10181o0.b(jVar.getUUID(), new x(this, jVar, 0));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.e().c(this, at.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.e().n(this, at.C5);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int Q;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        if (this.O1 != null) {
            if (org.telegram.messenger.i0.Q1()) {
                Q = i15 - this.O1.getMeasuredHeight();
            } else {
                Q = (Q() + i15) - this.O1.getMeasuredHeight();
            }
            vy vyVar = this.O1;
            vyVar.layout(0, Q, vyVar.getMeasuredWidth(), this.O1.getMeasuredHeight() + Q);
        }
        if (!this.E0) {
            i16 = org.telegram.messenger.i0.f16166m;
        }
        j0 j0Var = this.F0;
        int ceil = (int) Math.ceil((i14 - j0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + m5.C(8.0f, (((i15 - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i16)) - org.telegram.messenger.i0.L(48.0f)) - j0Var.getMeasuredHeight()) / 2, i16);
        j0Var.layout(ceil, additionalTop, j0Var.getMeasuredWidth() + ceil, j0Var.getMeasuredHeight() + additionalTop);
        bi.t0 t0Var = this.G0;
        t0Var.layout(ceil, additionalTop, t0Var.getMeasuredWidth() + ceil, t0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = j0Var.getMeasuredWidth();
        k0 k0Var = this.I0;
        int measuredWidth2 = ((measuredWidth - k0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((j0Var.getMeasuredHeight() - k0Var.getMeasuredHeight()) / 2) + additionalTop;
        k0Var.layout(measuredWidth2, measuredHeight, k0Var.getMeasuredWidth() + measuredWidth2, k0Var.getMeasuredHeight() + measuredHeight);
        i01 i01Var = this.J0;
        if (i01Var != null) {
            i01Var.layout(measuredWidth2, measuredHeight, k0Var.getMeasuredWidth() + measuredWidth2, k0Var.getMeasuredHeight() + measuredHeight);
        }
        a5 a5Var = this.H0;
        a5Var.layout(ceil, additionalTop, a5Var.getMeasuredWidth() + ceil, a5Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f7;
        this.f10201y0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((org.telegram.messenger.i0.f16172q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - org.telegram.messenger.i0.L(48.0f);
        Bitmap bitmap = this.m0;
        if (bitmap != null) {
            f7 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(48.0f);
            f7 = size;
        }
        float f10 = size;
        float floor = (float) Math.floor((f10 * currentActionBarHeight) / f7);
        float f11 = currentActionBarHeight2;
        if (floor > f11) {
            f10 = (float) Math.floor((f7 * f11) / currentActionBarHeight);
            floor = f11;
        }
        int i12 = (int) f10;
        int i13 = (int) floor;
        this.F0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        this.G0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        float f12 = f10 / this.A0.f29808a;
        this.f10203z0 = f12;
        k0 k0Var = this.I0;
        k0Var.setScaleX(f12);
        k0Var.setScaleY(this.f10203z0);
        k0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.A0.f29808a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.A0.f29809b, 1073741824));
        i01 i01Var = this.J0;
        if (i01Var != null) {
            i01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.A0.f29808a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.A0.f29809b, 1073741824));
            this.J0.setScaleX(this.f10203z0);
            this.J0.setScaleY(this.f10203z0);
        }
        B0();
        this.H0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.L0, i10, i11);
        measureChild(this.U0, i10, i11);
        measureChild(this.N0, i10, i11);
        measureChild(this.M0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.S1), 1073741824));
        FrameLayout frameLayout = this.K0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.f16166m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.f10201y0 = false;
        if (org.telegram.messenger.i0.L(20.0f) >= 0 && !this.P1 && !this.R1) {
            this.f10201y0 = true;
            l0();
            this.f10201y0 = false;
        }
        if (org.telegram.messenger.i0.L(20.0f) < 0) {
            l0();
        }
        vy vyVar = this.O1;
        if (vyVar != null) {
            measureChild(vyVar, i10, i11);
        }
    }

    @Override
    public final boolean p() {
        return !this.C0;
    }

    public final void p0(j jVar) {
        j jVar2 = this.B0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.m0, false);
            this.B0 = null;
            if (jVar instanceof g3) {
                ValueAnimator valueAnimator = this.S0;
                if (valueAnimator != null && this.Q0 != 0) {
                    valueAnimator.cancel();
                }
                A0(0);
            }
        }
        this.I0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            ig.t1 t1Var = this.f10181o0;
            t1Var.f8471b.remove(uuid);
            t1Var.f8472c.remove(uuid);
            org.telegram.messenger.i0.g3(new gg.c(t1Var, 9));
        }
        d2 d2Var = this.U0;
        za.c cVar = this.V0;
        d2Var.setValueOverride(cVar);
        d2Var.setShowPreview(true);
        float f7 = cVar.get();
        ig.q1 q1Var = this.f10192t1;
        q1Var.f8435c = f7;
        r0(q1Var, null);
    }

    public final boolean q0(j jVar, boolean z10) {
        r0 r0Var;
        boolean z11;
        int i10;
        boolean z12 = jVar instanceof g3;
        int i11 = 2;
        if (z12 && (((i10 = this.Q0) == -1 && this.P0 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.f10194u1) {
                v0(false);
            }
            A0(2);
        }
        if (z12 && z10) {
            g3 g3Var = (g3) jVar;
            int gravity = g3Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            t1 t1Var = this.f10167d1;
            t1Var.setAlignment(i11);
            t1Var.setTypeface(g3Var.getTypeface().f8320a);
            t1Var.e(g3Var.getType(), true);
            this.M0.invalidate();
        }
        j jVar2 = this.B0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.C0) {
                    int[] i02 = i0(jVar2);
                    x0(new x(this, jVar2, 1), this, 51, i02[0], i02[1] - org.telegram.messenger.i0.L(32.0f));
                    return true;
                }
                if (jVar2 instanceof g3) {
                    org.telegram.messenger.i0.J3(((g3) jVar2).getFocusedView());
                    k0(false);
                }
                return true;
            }
            r0Var = this;
            jVar2.l(jVar2.m0, false);
            j jVar3 = r0Var.B0;
            if (jVar3 instanceof g3) {
                g3 g3Var2 = (g3) jVar3;
                e3 e3Var = g3Var2.f9984q0;
                e3Var.clearFocus();
                e3Var.setEnabled(false);
                e3Var.setClickable(false);
                g3Var2.m();
                if (!z12) {
                    r0Var.C0 = false;
                    org.telegram.messenger.i0.v1(((g3) r0Var.B0).getFocusedView());
                    k0(false);
                }
            }
            z11 = true;
        } else {
            r0Var = this;
            z11 = false;
        }
        j jVar4 = r0Var.B0;
        r0Var.B0 = jVar;
        if ((jVar4 instanceof g3) && TextUtils.isEmpty(((g3) jVar4).getText())) {
            p0(jVar4);
        }
        j jVar5 = r0Var.B0;
        za.c cVar = r0Var.V0;
        ig.q1 q1Var = r0Var.f10192t1;
        d2 d2Var = r0Var.U0;
        if (jVar5 != null) {
            a5 a5Var = r0Var.H0;
            jVar5.m0 = a5Var;
            jVar5.l(a5Var, true);
            r0Var.I0.bringChildToFront(r0Var.B0);
            j jVar6 = r0Var.B0;
            if (jVar6 instanceof g3) {
                g3 g3Var3 = (g3) jVar6;
                g3Var3.f9993z0 = false;
                g3Var3.getSwatch().f8435c = q1Var.f8435c;
                r0(g3Var3.getSwatch(), null);
                d2Var.setValueOverride(new c0(g3Var3, (int) (r0Var.A0.f29808a / 9.0f), 0));
                d2Var.setShowPreview(false);
                return true;
            }
            d2Var.setValueOverride(cVar);
            d2Var.setShowPreview(true);
            q1Var.f8435c = cVar.get();
            r0(q1Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = r0Var.S0;
        if (valueAnimator2 != null && r0Var.Q0 != 0) {
            valueAnimator2.cancel();
        }
        if (r0Var.f10194u1) {
            v0(false);
        }
        A0(0);
        d2Var.setValueOverride(cVar);
        d2Var.setShowPreview(true);
        q1Var.f8435c = cVar.get();
        r0(q1Var, null);
        return z11;
    }

    @Override
    public final int[] r(j jVar) {
        return i0(jVar);
    }

    public final void r0(ig.q1 q1Var, Integer num) {
        ig.q1 q1Var2 = this.f10192t1;
        if (q1Var2 != q1Var) {
            q1Var2.f8433a = q1Var.f8433a;
            q1Var2.f8434b = q1Var.f8434b;
            q1Var2.f8435c = q1Var.f8435c;
            int i10 = this.f10202y1;
            ig.s0.e(i10).h(q1Var.f8433a, true);
            ig.s0.e(i10).j(q1Var.f8435c);
        }
        int i11 = q1Var.f8433a;
        j0 j0Var = this.F0;
        j0Var.setColor(i11);
        j0Var.setBrushSize(q1Var.f8435c);
        int i12 = q1Var2.f8433a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new p(this, num, i12, 0));
            duration.start();
        } else {
            n0 n0Var = this.L0;
            if (n0Var != null) {
                n0Var.invalidate();
            }
        }
        j jVar = this.B0;
        if (jVar instanceof g3) {
            ((g3) jVar).setSwatch(new ig.q1(q1Var.f8434b, q1Var.f8435c, q1Var.f8433a));
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f10201y0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(float f7) {
        this.f10177l0 = f7;
        this.K0.setTranslationY(-f7);
        this.L0.setTranslationY(f7);
    }

    public void setBlurredBackgroundDrawableForTools(vg.f fVar) {
        fVar.p(org.telegram.messenger.i0.L(4.0f));
        this.L1 = fVar;
    }

    public void setDrawShadow(boolean z10) {
        this.F1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f7) {
        if (this.P0 == 0) {
            this.U0.setTranslationX(f7);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.D1 = runnable;
    }

    @Override
    public final void t() {
        vh.r2 r2Var;
        if (!this.Q1 && !this.P1) {
            h0(true);
            return;
        }
        boolean z10 = this.P1;
        if (z10 && (r2Var = ((cr0) this).X1.K1) != null) {
            r2Var.e = true;
        }
        w0(!z10 ? 1 : 0);
        if (z10) {
            j jVar = this.B0;
            if (jVar instanceof g3) {
                org.telegram.messenger.i0.J3(((g3) jVar).getEditText());
            }
        }
    }

    @Override
    public final void u(float f7, float f10, float[] fArr) {
        Point point = org.telegram.messenger.i0.f16172q;
        double d = f7 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.I0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (point.y / 2.0f) + ((float) i0.a.c(radians, d10, Math.sin(radians) * d));
    }

    public final void u0(float f7, float f10, float f11, float f12, float f13) {
        View view;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        this.f10187r0 = f7;
        this.f10197w0 = f12;
        this.f10199x0 = f13;
        this.f10189s0 = f10;
        this.f10191t0 = f11;
        this.f10193u0 = f10;
        float f21 = f11 + 0.0f;
        this.f10195v0 = f21;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                view = this.I0;
            } else if (i10 == 1) {
                view = this.H0;
            } else if (i10 == 2) {
                view = this.F0;
            } else {
                view = this.G0;
            }
            ze zeVar = this.f10185q0;
            if (zeVar != null) {
                float f22 = zeVar.f19694c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i11 = zeVar.f19698k;
                    if (i11 == 90 || i11 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f12 / ((int) (zeVar.e * f19)), f13 / ((int) (zeVar.f19695f * f20)));
                    f15 = f22 * max;
                    float E = c3.i0.E(zeVar.f19692a, measuredWidth, f7, max);
                    float f23 = zeVar.f19694c;
                    f16 = (E * f23) + f10;
                    f14 = 1.0f;
                    f17 = (zeVar.f19693b * measuredHeight * f7 * max * f23) + f21;
                    f18 = zeVar.d + i11;
                } else {
                    return;
                }
            } else {
                f14 = 1.0f;
                if (i10 == 0) {
                    f15 = this.f10203z0 * 1.0f;
                } else {
                    f15 = 1.0f;
                }
                f16 = f10;
                f17 = f21;
                f18 = 0.0f;
            }
            float f24 = ((-this.S1) / 2.0f) + f17;
            float f25 = f7 * f15;
            if (Float.isNaN(f25)) {
                f25 = f14;
            }
            view.setScaleX(f25);
            view.setScaleY(f25);
            view.setTranslationX(f16);
            view.setTranslationY(f24);
            view.setRotation(f18);
            view.invalidate();
        }
        B0();
        invalidate();
    }

    @Override
    public final void updateColors() {
        this.f10200x1.setColor(-15132391);
    }

    @Override
    public final ig.s0 v() {
        return ig.s0.e(this.f10202y1);
    }

    public final void v0(final boolean z10) {
        float f7;
        boolean z11;
        if (this.f10194u1 != z10) {
            this.f10194u1 = z10;
            o1.j jVar = this.f10196v1;
            if (jVar != null) {
                jVar.d();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new o1.i(f7));
            this.f10196v1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f13965i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f13958m = kVar;
            if (!this.Q1 && !this.P1) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.L0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.f10196v1.b(new o1.g() {
                @Override
                public final void a(o1.j jVar3, float f11, float f12) {
                    int i10;
                    r0 r0Var = r0.this;
                    n0 n0Var = r0Var.L0;
                    float f13 = f11 / 1000.0f;
                    r0Var.f10198w1 = f13;
                    float f14 = ((1.0f - f13) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f14);
                    view.setScaleY(f14);
                    view.setTranslationY((Math.min(r0Var.f10198w1, 0.25f) * org.telegram.messenger.i0.L(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(r0Var.f10198w1, 0.25f) / 0.25f));
                    m0 m0Var = r0Var.f10184p1;
                    float f15 = r0Var.f10198w1;
                    boolean z12 = z10;
                    m0Var.B1(z12, f15);
                    r0Var.f10175k0.setProgress(r0Var.f10198w1);
                    r0Var.f10173j0.setProgress(r0Var.f10198w1);
                    r0Var.O0.setTranslationY(org.telegram.messenger.i0.L(32.0f) * r0Var.f10198w1);
                    if (zArr[0]) {
                        float f16 = r0Var.f10198w1;
                        if (!z12) {
                            f16 = 1.0f - f16;
                        }
                        float L = org.telegram.messenger.i0.L(40.0f) * f16;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        n0Var.setTranslationY(translationY - (L * i10));
                    }
                    n0Var.invalidate();
                    if (view == r0Var.f10167d1) {
                        r0Var.M0.invalidate();
                    }
                }
            });
            this.f10196v1.a(new u(this, z10, 1));
            this.f10196v1.h();
            if (z10) {
                m0 m0Var = this.f10184p1;
                m0Var.setVisibility(0);
                m0Var.setSelectedColorIndex(ig.s0.e(this.f10202y1).d());
            }
        }
    }

    public final void w0(int i10) {
        boolean z10;
        int i11;
        t1 t1Var = this.f10167d1;
        if (i10 == 1) {
            vy vyVar = this.O1;
            if (vyVar != null && vyVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            vy vyVar2 = this.O1;
            if (vyVar2 != null && vyVar2.f31943c1 != e20.f15506s0) {
                removeView(vyVar2);
                this.O1 = null;
            }
            if (this.O1 == null) {
                vy vyVar3 = new vy(null, true, false, false, getContext(), false, null, null, true, this.f10204z1, false, false);
                this.O1 = vyVar3;
                vyVar3.U0 = true;
                vyVar3.setVisibility(8);
                if (org.telegram.messenger.i0.Q1()) {
                    this.O1.setForseMultiwindowLayout(true);
                }
                this.O1.setDelegate(new i0(this));
                addView(this.O1);
            }
            this.O1.setVisibility(0);
            this.P1 = true;
            vy vyVar4 = this.O1;
            if (this.T1 <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.T1 = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.T1 = wp.c1().getInt("kbd_height", org.telegram.messenger.i0.L(200.0f));
                }
            }
            if (this.U1 <= 0) {
                if (org.telegram.messenger.i0.Q1()) {
                    this.U1 = org.telegram.messenger.i0.L(150.0f);
                } else {
                    this.U1 = wp.c1().getInt("kbd_height_land3", org.telegram.messenger.i0.L(200.0f));
                }
            }
            Point point = org.telegram.messenger.i0.f16172q;
            if (point.x > point.y) {
                i11 = this.U1;
            } else {
                i11 = this.T1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vyVar4.getLayoutParams();
            layoutParams.height = i11;
            vyVar4.setLayoutParams(layoutParams);
            if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                j jVar = this.B0;
                if (jVar instanceof g3) {
                    org.telegram.messenger.i0.v1(((g3) jVar).getEditText());
                }
            }
            this.S1 = i11;
            requestLayout();
            vh.r2 r2Var = ((cr0) this).X1.K1;
            if (r2Var != null) {
                r2Var.a();
            }
            fg emojiButton = t1Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(dg.d, true);
            }
            getHeight();
            if (!z10 && !this.Q1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S1, 0.0f);
                ofFloat.addUpdateListener(new o(this, 1));
                ofFloat.addListener(new h0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        fg emojiButton2 = t1Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(dg.e, true);
        }
        vy vyVar5 = this.O1;
        if (vyVar5 != null) {
            this.P1 = false;
            if (org.telegram.messenger.i0.D || org.telegram.messenger.i0.E) {
                vyVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.S1 = 0;
        }
        vh.r2 r2Var2 = ((cr0) this).X1.K1;
        if (r2Var2 != null) {
            r2Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void x0(Runnable runnable, r0 r0Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.k1 k1Var = this.A1;
        if (k1Var != null && k1Var.isShowing()) {
            this.A1.d(true);
            return;
        }
        if (this.B1 == null) {
            this.C1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.f10204z1);
            this.B1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.B1.setBackgroundColor(-14145495);
            this.B1.setOnTouchListener(new r(0, this));
            this.B1.setDispatchKeyEventListener(new s(this));
            this.B1.setShownFromBottom(true);
        }
        this.B1.d();
        runnable.run();
        if (this.A1 == null) {
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1(this.B1, -2, -2);
            this.A1 = k1Var2;
            k1Var2.f20456b = true;
            k1Var2.setAnimationStyle(2131755191);
            this.A1.setOutsideTouchable(true);
            this.A1.setClippingEnabled(true);
            this.A1.setInputMethodMode(2);
            this.A1.setSoftInputMode(0);
            this.A1.getContentView().setFocusableInTouchMode(true);
            this.A1.setOnDismissListener(new t(0, this));
        }
        this.B1.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), Integer.MIN_VALUE));
        this.A1.setFocusable(true);
        this.A1.showAtLocation(r0Var, i10, i11 - (this.B1.getMeasuredWidth() / 2), i12 - this.B1.getMeasuredHeight());
        org.telegram.ui.ActionBar.k1.i(this.B1);
    }

    @Override
    public final boolean y(j jVar) {
        return q0(jVar, true);
    }

    public final void y0(boolean z10) {
        float f7;
        if (this.f10180n1 != z10) {
            this.f10180n1 = z10;
            o1.j jVar = this.f10182o1;
            if (jVar != null) {
                jVar.d();
            }
            float f10 = 1000.0f;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new o1.i(f7));
            this.f10182o1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z10) {
                f10 = 0.0f;
            }
            kVar.f13965i = f10;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f13958m = kVar;
            if (z10) {
                a2 a2Var = this.f10168e1;
                a2Var.setAlpha(0.0f);
                a2Var.setVisibility(0);
            }
            this.f10182o1.b(new fg.c(1, this));
            this.f10182o1.a(new u(this, z10, 0));
            this.f10182o1.h();
        }
    }

    @Override
    public final void z(ig.h hVar) {
        boolean z10 = hVar instanceof ig.b;
        d2 d2Var = this.U0;
        if (!z10 && !(hVar instanceof ig.d)) {
            d2Var.b(0.05f, 1.0f);
        } else {
            d2Var.b(0.4f, 1.75f);
        }
        d2Var.setDrawCenter(!(hVar instanceof ig.g));
        j0 j0Var = this.F0;
        if (j0Var.getCurrentBrush() instanceof ig.g) {
            this.T0 = true;
        }
        j0Var.setBrush(hVar);
        ig.q1 q1Var = this.f10192t1;
        int i10 = q1Var.f8433a;
        q1Var.f8433a = ig.s0.e(this.f10202y1).c();
        q1Var.f8435c = this.V0.get();
        r0(q1Var, Integer.valueOf(i10));
        this.G0.invalidate();
    }

    public final PointF z0(j jVar) {
        float f7 = 200.0f;
        ze zeVar = this.f10185q0;
        if (zeVar != null) {
            f7 = 200.0f / zeVar.f19694c;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f7, position.y + f7);
        }
        float f10 = 100.0f;
        if (zeVar != null) {
            f10 = 100.0f / zeVar.f19694c;
        }
        PointF e02 = e0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                k0 k0Var = this.I0;
                if (i10 >= k0Var.getChildCount()) {
                    break;
                }
                View childAt = k0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - e02.y, 2.0d) + Math.pow(position2.x - e02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return e02;
            }
            e02 = new PointF(e02.x + f7, e02.y + f7);
        }
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void e(boolean z10) {
    }

    @Override
    public final void f(boolean z10) {
    }

    @Override
    public final void j(boolean z10) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void g() {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void w() {
    }
}
