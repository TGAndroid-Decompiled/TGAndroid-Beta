package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class wy5 extends xma implements qv7, f44, lv7, vma, fn7 {
    public float A0;
    public final yx5 A1;
    public qma B0;
    public n8 B1;
    public h44 C0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout C1;
    public boolean D0;
    public Rect D1;
    public int E0;
    public Runnable E1;
    public final boolean F0;
    public final a78 F1;
    public final qy5 G0;
    public boolean G1;
    public final tb H0;
    public float H1;
    public final b6 I0;
    public boolean I1;
    public final ry5 J0;
    public final gc1 J1;
    public hnb K0;
    public ly5 K1;
    public final FrameLayout L0;
    public final aj3 L1;
    public final ty5 M0;
    public boolean M1;
    public final zc N0;
    public final mm N1;
    public final FrameLayout O0;
    public final Paint O1;
    public g7 P0;
    public final Paint P1;
    public int Q0;
    public jl0 Q1;
    public int R0;
    public final float[] R1;
    public float S0;
    public final int[] S1;
    public ValueAnimator T0;
    public o24 T1;
    public boolean U0;
    public boolean U1;
    public final gx7 V0;
    public boolean V1;
    public final v34 W0;
    public boolean W1;
    public ArrayList X0;
    public int X1;
    public final int Y0;
    public int Y1;
    public BigInteger Z0;
    public int Z1;
    public TextView a1;
    public int a2;
    public TextView b1;
    public boolean b2;
    public TextView c1;
    public final rv7 d1;
    public final nv7 e1;
    public final zv7 f1;
    public final ImageView g1;
    public final LinearLayout h1;
    public final TextView i1;
    public final TextView j1;
    public final dv7 k0;
    public final TextView k1;
    public final iv7 l0;
    public final Paint l1;
    public float m0;
    public final Paint m1;
    public final Bitmap n0;
    public float n1;
    public final Bitmap o0;
    public boolean o1;
    public final a9c p0;
    public vpa p1;
    public final uo3 q0;
    public final sy5 q1;
    public final fo6 r0;
    public final Paint r1;
    public float s0;
    public final Paint s1;
    public float t0;
    public final Paint t1;
    public float u0;
    public final igb u1;
    public float v0;
    public boolean v1;
    public float w0;
    public vpa w1;
    public float x0;
    public float x1;
    public float y0;
    public final Paint y1;
    public boolean z0;
    public final int z1;

    public wy5(Context context, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, fo6 fo6Var, y98 y98Var, final vnb vnbVar) {
        super(context, activity);
        gc1 gc1Var;
        boolean z;
        int i3;
        int i4;
        mv3[] mv3VarArr;
        kc1 kc1Var;
        ArrayList arrayList2 = arrayList;
        boolean z2 = false;
        this.Q0 = 0;
        this.R0 = -1;
        final hc8 hc8Var = (hc8) this;
        this.W0 = new v34(hc8Var, (byte) 10);
        byte b = 1;
        this.l1 = new Paint(1);
        this.m1 = new Paint(1);
        this.r1 = new Paint(1);
        this.s1 = new Paint(1);
        this.t1 = new Paint(1);
        igb igbVar = new igb(1.0f, 0.016773745f, -1);
        this.u1 = igbVar;
        this.y1 = new Paint(1);
        aj3 aj3Var = new aj3(hc8Var, (byte) 15);
        this.L1 = aj3Var;
        this.M1 = false;
        this.N1 = new mm(350L, (View) this, k43.h);
        this.O1 = new Paint(1);
        Paint paint = new Paint(1);
        this.P1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.R1 = new float[2];
        this.S1 = new int[2];
        new zz3(hc8Var, (byte) 18);
        setDelegate(this);
        this.z1 = i;
        File captionsVideoFile = getCaptionsVideoFile();
        if (captionsVideoFile != null && captionsVideoFile.exists() && DictationAsr.x(i) && qn3.h()) {
            gc1Var = new gc1(captionsVideoFile, aj3Var);
        } else {
            gc1Var = null;
        }
        this.J1 = gc1Var;
        if (gc1Var != null) {
            gc1Var.d = new ea5(hc8Var, (byte) 21);
        }
        this.A1 = new vnb() {
            @Override
            public final boolean a() {
                return aob.I.o();
            }

            @Override
            public final void b(float f, float f2, int i5, int i6) {
                aob.q(f, f2, i5, i6);
            }

            @Override
            public final ColorFilter c() {
                return aob.v3;
            }

            @Override
            public final Paint d(String str) {
                return aob.T0(str);
            }

            @Override
            public final boolean e() {
                return xea.D0;
            }

            @Override
            public final int f(int i5) {
                return h(i5);
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
            public final int h(int i5) {
                if (i5 == aob.G8) {
                    return -14145495;
                }
                if (i5 != aob.E8) {
                    if (i5 == aob.h5) {
                        return -14737633;
                    }
                    if (i5 == aob.j5) {
                        return -592138;
                    }
                    if (i5 == aob.r5) {
                        return -8553091;
                    }
                    if (i5 != aob.zf) {
                        if (i5 == aob.Cf) {
                            return -1610612736;
                        }
                        if (i5 == aob.Ff || i5 == aob.Jf || i5 == aob.Ef) {
                            return -9539985;
                        }
                        if (i5 != aob.G6) {
                            int i6 = aob.Di;
                            if (i5 == i6) {
                                return -11754001;
                            }
                            if (i5 == aob.i6) {
                                return 536870911;
                            }
                            if (i5 != aob.wi && i5 != aob.vi && i5 != aob.xi) {
                                if (i5 == aob.yi) {
                                    return 352321535;
                                }
                                if (i5 != aob.Bf && i5 != i6) {
                                    if (i5 == aob.Af) {
                                        return 780633991;
                                    }
                                    if (i5 == aob.a7) {
                                        return -15921907;
                                    }
                                    if (i5 == aob.m7) {
                                        return -12500671;
                                    }
                                    if (i5 == aob.l7) {
                                        return -13133079;
                                    }
                                    if (i5 == aob.n7) {
                                        return -1;
                                    }
                                    if (i5 == aob.d6) {
                                        return -15198183;
                                    }
                                    if (i5 == aob.d7) {
                                        return -16777216;
                                    }
                                    vnb vnbVar2 = vnb.this;
                                    if (vnbVar2 != null) {
                                        return vnbVar2.h(i5);
                                    }
                                    return aob.w0(null, i5, false);
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
            public final int j(int i5) {
                return h(i5);
            }

            @Override
            public final void i(int i5, int i6) {
            }
        };
        this.r0 = fo6Var;
        this.F0 = context instanceof BubbleActivity;
        a78 e = a78.e(i);
        this.F1 = e;
        e.i(0, true);
        igbVar.a = e.c();
        igbVar.c = e.i;
        uo3 uo3Var = new uo3("Paint", true);
        this.q0 = uo3Var;
        this.n0 = bitmap;
        this.o0 = bitmap2;
        this.Y0 = i2;
        a9c a9cVar = new a9c();
        this.p0 = a9cVar;
        byte b2 = 2;
        a9cVar.a = new e05(hc8Var, (byte) 16);
        qy5 qy5Var = new qy5(hc8Var, context, new nx7(getPaintingSize(), bitmap2, i2, null), bitmap, bitmap2);
        this.G0 = qy5Var;
        qy5Var.setDelegate(new um4(hc8Var, y98Var, false, (byte) 7));
        qy5Var.setUndoStore(a9cVar);
        qy5Var.setQueue(uo3Var);
        qy5Var.setVisibility(4);
        addView(qy5Var, tre.e(-1, -1, 51));
        tb tbVar = new tb((byte) 19, context, hc8Var);
        this.H0 = tbVar;
        tbVar.setVisibility(4);
        addView(tbVar, tre.e(-1, -1, 51));
        byte b3 = 11;
        ry5 ry5Var = new ry5(hc8Var, context, new kj4(hc8Var, (byte) 11));
        this.J0 = ry5Var;
        addView(ry5Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i5 = 0;
            kc1 kc1Var2 = null;
            while (i5 < size) {
                mec mecVar = (mec) arrayList2.get(i5);
                byte b4 = mecVar.a;
                if (b4 == 0) {
                    ?? e0 = e0(mecVar.C, mecVar.B, z2);
                    if ((mecVar.b & 2) != 0) {
                        e0.r(z2);
                    }
                    ViewGroup.LayoutParams layoutParams = e0.getLayoutParams();
                    layoutParams.width = mecVar.q;
                    layoutParams.height = mecVar.r;
                    i4 = size;
                    i3 = i5;
                    kc1Var = e0;
                } else if (b4 == b3) {
                    if (kc1Var2 != null) {
                        kc1Var2.u(mecVar.V, mecVar.W, mecVar.j, mecVar.X);
                        i3 = i5;
                        i4 = size;
                        i5 = i3 + 1;
                        arrayList2 = arrayList;
                        size = i4;
                        z2 = false;
                        b = 1;
                        b3 = 11;
                        b2 = 2;
                    } else {
                        kc1 c0 = c0();
                        c0.setType(mecVar.b);
                        c0.setTypeface(mecVar.n);
                        c0.setBaseFontSize(mecVar.m);
                        w0(c0, mecVar.p);
                        igb swatch = c0.getSwatch();
                        swatch.a = mecVar.l;
                        c0.setSwatch(swatch);
                        i3 = i5;
                        c0.u(mecVar.V, mecVar.W, mecVar.j, mecVar.X);
                        i4 = size;
                        kc1 kc1Var3 = c0;
                        kc1Var2 = kc1Var3;
                        kc1Var = kc1Var3;
                    }
                } else {
                    i3 = i5;
                    if (b4 == b) {
                        ?? f0 = f0(false);
                        f0.setType(mecVar.b);
                        f0.setTypeface(mecVar.n);
                        f0.setBaseFontSize(mecVar.m);
                        SpannableString spannableString = new SpannableString(mecVar.j);
                        ArrayList arrayList3 = mecVar.k;
                        int size2 = arrayList3.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj = arrayList3.get(i6);
                            i6++;
                            lec lecVar = (lec) obj;
                            hm hmVar = new hm(lecVar.document_id, f0.getFontMetricsInt());
                            int i7 = lecVar.offset;
                            spannableString.setSpan(hmVar, i7, lecVar.length + i7, 33);
                            size = size;
                        }
                        i4 = size;
                        CharSequence m = pv3.m(spannableString, f0.getFontMetricsInt(), false, null, 0);
                        if ((m instanceof Spanned) && (mv3VarArr = (mv3[]) ((Spanned) m).getSpans(0, m.length(), mv3.class)) != null) {
                            for (mv3 mv3Var : mv3VarArr) {
                                mv3Var.b = 0.85f;
                            }
                        }
                        f0.setText(m);
                        w0(f0, mecVar.p);
                        igb swatch2 = f0.getSwatch();
                        swatch2.a = mecVar.l;
                        f0.setSwatch(swatch2);
                        kc1Var = f0;
                    } else {
                        i4 = size;
                        byte b5 = b2;
                        if (b4 == b5) {
                            ?? d0 = d0(mecVar.j, false);
                            d0.D0 = false;
                            if ((mecVar.b & b5) != 0) {
                                d0.r(false);
                            }
                            if ((mecVar.b & 16) != 0) {
                                d0.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = d0.getLayoutParams();
                            layoutParams2.width = mecVar.q;
                            layoutParams2.height = mecVar.r;
                            kc1Var = d0;
                        } else {
                            i5 = i3 + 1;
                            arrayList2 = arrayList;
                            size = i4;
                            z2 = false;
                            b = 1;
                            b3 = 11;
                            b2 = 2;
                        }
                    }
                }
                kc1Var.setX((mecVar.c * this.B0.a) - (((1.0f - mecVar.v) * mecVar.q) / 2.0f));
                kc1Var.setY((mecVar.d * this.B0.b) - (((1.0f - mecVar.v) * mecVar.r) / 2.0f));
                kc1Var.setPosition(new PointF((mecVar.q / 2.0f) + kc1Var.getX(), (mecVar.r / 2.0f) + kc1Var.getY()));
                kc1Var.setScale(mecVar.v);
                kc1Var.setRotation((float) (((-mecVar.e) / 3.141592653589793d) * 180.0d));
                i5 = i3 + 1;
                arrayList2 = arrayList;
                size = i4;
                z2 = false;
                b = 1;
                b3 = 11;
                b2 = 2;
            }
        }
        this.J0.setVisibility(4);
        b6 b6Var = new b6(context, (byte) 18);
        this.I0 = b6Var;
        addView(b6Var);
        ?? frameLayout = new FrameLayout(context);
        this.L0 = frameLayout;
        frameLayout.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, tre.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.g1 = imageView;
        imageView.setImageResource(2131232547);
        imageView.setPadding(hl.L(3.0f), hl.L(3.0f), hl.L(3.0f), hl.L(3.0f));
        imageView.setBackground(aob.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b6 = r2;
                hc8 hc8Var2 = hc8Var;
                switch (b6) {
                    case 0:
                        qy5 qy5Var2 = hc8Var2.G0;
                        if (qy5Var2 != null && (qy5Var2.getCurrentBrush() instanceof u01)) {
                            qy5Var2.b();
                            hc8Var2.d1.setSelectedIndex(1);
                            hc8Var2.s((v01) v01.a.get(0));
                            return;
                        }
                        hc8Var2.p0.c();
                        return;
                    case 1:
                        qy5 qy5Var3 = hc8Var2.G0;
                        a9c a9cVar2 = hc8Var2.p0;
                        if (a9cVar2.a()) {
                            if (qy5Var3 != null && (qy5Var3.getCurrentBrush() instanceof u01)) {
                                qy5Var3.b();
                                hc8Var2.d1.setSelectedIndex(1);
                                hc8Var2.s((v01) v01.a.get(0));
                            }
                            qy5Var3.a();
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            hc8Var2.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h44 h44Var = hc8Var2.C0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (hc8Var2.U1) {
                            hc8Var2.i0(false);
                        }
                        hc8Var2.s0(hc8Var2.C0);
                        hc8Var2.t0(null, true);
                        return;
                    default:
                        hc8Var2.t0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, tre.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.h1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(aob.f0(822083583, 7, -1));
        linearLayout.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131746994, null));
        linearLayout.addView(qd4.k(context, 2131232548), tre.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, tre.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new y00((byte) 8));
        frameLayout.addView(linearLayout, tre.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.i1 = textView2;
        textView2.setBackground(aob.f0(822083583, 7, -1));
        textView2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        textView2.setText(ob6.M0(2131747006, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(hl.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b6 = r2;
                hc8 hc8Var2 = hc8Var;
                switch (b6) {
                    case 0:
                        qy5 qy5Var2 = hc8Var2.G0;
                        if (qy5Var2 != null && (qy5Var2.getCurrentBrush() instanceof u01)) {
                            qy5Var2.b();
                            hc8Var2.d1.setSelectedIndex(1);
                            hc8Var2.s((v01) v01.a.get(0));
                            return;
                        }
                        hc8Var2.p0.c();
                        return;
                    case 1:
                        qy5 qy5Var3 = hc8Var2.G0;
                        a9c a9cVar2 = hc8Var2.p0;
                        if (a9cVar2.a()) {
                            if (qy5Var3 != null && (qy5Var3.getCurrentBrush() instanceof u01)) {
                                qy5Var3.b();
                                hc8Var2.d1.setSelectedIndex(1);
                                hc8Var2.s((v01) v01.a.get(0));
                            }
                            qy5Var3.a();
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            hc8Var2.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h44 h44Var = hc8Var2.C0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (hc8Var2.U1) {
                            hc8Var2.i0(false);
                        }
                        hc8Var2.s0(hc8Var2.C0);
                        hc8Var2.t0(null, true);
                        return;
                    default:
                        hc8Var2.t0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l = ik8.l(frameLayout, textView2, tre.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.j1 = l;
        l.setBackground(aob.f0(822083583, 7, -1));
        l.setText(ob6.M0(2131752066, null));
        l.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        l.setGravity(16);
        l.setTextColor(-1);
        l.setTypeface(hl.o());
        l.setTextSize(1, 16.0f);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b6 = r2;
                hc8 hc8Var2 = hc8Var;
                switch (b6) {
                    case 0:
                        qy5 qy5Var2 = hc8Var2.G0;
                        if (qy5Var2 != null && (qy5Var2.getCurrentBrush() instanceof u01)) {
                            qy5Var2.b();
                            hc8Var2.d1.setSelectedIndex(1);
                            hc8Var2.s((v01) v01.a.get(0));
                            return;
                        }
                        hc8Var2.p0.c();
                        return;
                    case 1:
                        qy5 qy5Var3 = hc8Var2.G0;
                        a9c a9cVar2 = hc8Var2.p0;
                        if (a9cVar2.a()) {
                            if (qy5Var3 != null && (qy5Var3.getCurrentBrush() instanceof u01)) {
                                qy5Var3.b();
                                hc8Var2.d1.setSelectedIndex(1);
                                hc8Var2.s((v01) v01.a.get(0));
                            }
                            qy5Var3.a();
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            hc8Var2.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h44 h44Var = hc8Var2.C0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (hc8Var2.U1) {
                            hc8Var2.i0(false);
                        }
                        hc8Var2.s0(hc8Var2.C0);
                        hc8Var2.t0(null, true);
                        return;
                    default:
                        hc8Var2.t0(null, true);
                        return;
                }
            }
        });
        l.setAlpha(0.0f);
        l.setVisibility(8);
        TextView l2 = ik8.l(frameLayout, l, tre.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.k1 = l2;
        l2.setBackground(aob.f0(822083583, 7, -1));
        l2.setText(ob6.M0(2131751319, null));
        l2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        l2.setGravity(16);
        l2.setTextColor(-1);
        l2.setTypeface(hl.o());
        l2.setTextSize(1, 16.0f);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b6 = r2;
                hc8 hc8Var2 = hc8Var;
                switch (b6) {
                    case 0:
                        qy5 qy5Var2 = hc8Var2.G0;
                        if (qy5Var2 != null && (qy5Var2.getCurrentBrush() instanceof u01)) {
                            qy5Var2.b();
                            hc8Var2.d1.setSelectedIndex(1);
                            hc8Var2.s((v01) v01.a.get(0));
                            return;
                        }
                        hc8Var2.p0.c();
                        return;
                    case 1:
                        qy5 qy5Var3 = hc8Var2.G0;
                        a9c a9cVar2 = hc8Var2.p0;
                        if (a9cVar2.a()) {
                            if (qy5Var3 != null && (qy5Var3.getCurrentBrush() instanceof u01)) {
                                qy5Var3.b();
                                hc8Var2.d1.setSelectedIndex(1);
                                hc8Var2.s((v01) v01.a.get(0));
                            }
                            qy5Var3.a();
                            a9cVar2.c.clear();
                            a9cVar2.b.clear();
                            hl.c3(new azb(a9cVar2, (byte) 7));
                            hc8Var2.J0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        h44 h44Var = hc8Var2.C0;
                        if (h44Var instanceof rlb) {
                            hl.t1(((rlb) h44Var).getFocusedView());
                        }
                        if (hc8Var2.U1) {
                            hc8Var2.i0(false);
                        }
                        hc8Var2.s0(hc8Var2.C0);
                        hc8Var2.t0(null, true);
                        return;
                    default:
                        hc8Var2.t0(null, true);
                        return;
                }
            }
        });
        l2.setAlpha(0.0f);
        l2.setVisibility(8);
        frameLayout.addView(l2, tre.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ty5 ty5Var = new ty5(hc8Var, context);
        this.M0 = ty5Var;
        ty5Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), 0);
        ty5Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(ty5Var, tre.e(-1, 104, 80));
        if (bitmap2 != null) {
            z = true;
        } else {
            z = false;
        }
        rv7 rv7Var = new rv7(context, z);
        this.d1 = rv7Var;
        rv7Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        rv7Var.setDelegate(this);
        rv7Var.setSelectedIndex(1);
        ty5Var.addView(rv7Var, tre.c(48.0f, -1));
        nv7 nv7Var = new nv7(context);
        this.e1 = nv7Var;
        nv7Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        nv7Var.setVisibility(8);
        nv7Var.setDelegate(this);
        nv7Var.setAlignment(a78.e(i).g);
        ty5Var.addView(nv7Var, tre.c(48.0f, -1));
        zc zcVar = new zc(hc8Var, context);
        this.N0 = zcVar;
        addView(zcVar, tre.c(-1.0f, -1));
        zv7 zv7Var = new zv7(context);
        this.f1 = zv7Var;
        zv7Var.setVisibility(8);
        zv7Var.setOnItemClickListener(new zg4(hc8Var, (byte) 7));
        nv7Var.setTypefaceListView(zv7Var);
        zcVar.addView(zv7Var, tre.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.l1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.l1.setColor(1728053247);
        this.l1.setStrokeWidth(Math.max(2, hl.L(1.0f)));
        this.m1.setColor(aob.v0(aob.G8, this.A1));
        sy5 sy5Var = new sy5(hc8Var, context);
        this.q1 = sy5Var;
        sy5Var.setVisibility(8);
        sy5Var.setColorPalette(a78.e(i));
        sy5Var.setColorListener(new ay5(hc8Var, (byte) 0));
        ty5Var.addView(sy5Var, tre.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        dv7 dv7Var = new dv7(context);
        this.k0 = dv7Var;
        dv7Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        dv7Var.setBackground(aob.f0(1090519039, 1, -1));
        ty5Var.addView(dv7Var, tre.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        iv7 iv7Var = new iv7(context);
        this.l0 = iv7Var;
        iv7Var.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        iv7Var.setBackground(aob.f0(1090519039, 1, -1));
        iv7Var.setOnClickListener(new lw4(hc8Var, context, bitmap2, (byte) 5));
        ty5Var.addView(iv7Var, tre.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        gx7 gx7Var = new gx7(context);
        this.V0 = gx7Var;
        gx7Var.setColorSwatch(this.u1);
        gx7Var.setRenderView(this.G0);
        gx7Var.setValueOverride(this.W0);
        this.u1.c = this.W0.get();
        gx7Var.setOnUpdate(new hl3(hc8Var, i, (byte) 17));
        addView(gx7Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O0 = frameLayout2;
        addView(frameLayout2, tre.c(-1.0f, -1));
        this.t1.setStyle(style);
        this.t1.setStrokeWidth(hl.L(2.0f));
        u0(this.u1, null);
        s((v01) v01.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = hl.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), hl.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public ViewGroup getBarView() {
        if (this.Q0 == 2) {
            return this.e1;
        }
        return this.d1;
    }

    private int getFrameRotation() {
        int i = this.Y0;
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

    private qma getPaintingSize() {
        int i;
        qma qmaVar = this.B0;
        if (qmaVar != null) {
            return qmaVar;
        }
        Bitmap bitmap = this.n0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o = xea.o();
        if (o != 0) {
            if (o != 2) {
                i = 2560;
            } else {
                i = 3840;
            }
        } else {
            i = 1280;
        }
        qma qmaVar2 = new qma(width, height);
        float f = i;
        qmaVar2.a = f;
        float floor = (float) Math.floor((f * height) / width);
        qmaVar2.b = floor;
        if (floor > f) {
            qmaVar2.b = f;
            qmaVar2.a = (float) Math.floor((f * width) / height);
        }
        this.B0 = qmaVar2;
        return qmaVar2;
    }

    public void setNewColor(int i) {
        igb igbVar = this.u1;
        int i2 = igbVar.a;
        igbVar.a = i;
        u0(igbVar, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new cn(this, i2, i, (byte) 2));
        duration.start();
    }

    private void setTextType(int i) {
        this.E0 = i;
        h44 h44Var = this.C0;
        if (h44Var instanceof rlb) {
            ((rlb) h44Var).setType(i);
        }
        a78 e = a78.e(this.z1);
        e.h = i;
        e.a.edit().putInt("text_type", i).apply();
        this.e1.setOutlineType(i);
    }

    public void setTextWeightRange(h44 h44Var) {
        boolean z = h44Var instanceof kc1;
        gx7 gx7Var = this.V0;
        if (z) {
            gx7Var.b(0.3f, 1.1f);
        } else {
            gx7Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        g7 g7Var = new g7(this, context);
        this.P0 = g7Var;
        g7Var.setClipToPadding(false);
        this.P0.setOrientation(0);
        this.M0.addView(this.P0, tre.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a1 = textView;
        textView.setText(ob6.M0(2131747004, null).toUpperCase());
        TextView textView2 = this.a1;
        int i = aob.i6;
        yx5 yx5Var = this.A1;
        yob.R(textView2, aob.f0(aob.v0(i, yx5Var), 7, -1), null, yob.M(i), yx5Var);
        this.a1.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.a1.setTextColor(-1);
        this.a1.setTextSize(1, 14.0f);
        this.a1.setGravity(1);
        this.a1.setTypeface(hl.o());
        this.a1.setSingleLine();
        this.a1.setOnClickListener(new xx5(this, (byte) 0));
        this.P0.addView(this.a1, tre.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.b1 = textView3;
        textView3.setText(ob6.M0(2131747003, null).toUpperCase());
        yob.R(this.b1, aob.f0(aob.v0(i, yx5Var), 7, -1), null, yob.M(i), yx5Var);
        this.b1.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.b1.setOnClickListener(new xx5(this, (byte) 1));
        this.b1.setTextColor(-1);
        this.b1.setTextSize(1, 14.0f);
        this.b1.setGravity(1);
        this.b1.setTypeface(hl.o());
        this.b1.setAlpha(0.6f);
        this.b1.setSingleLine();
        this.P0.addView(this.b1, tre.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.c1 = textView4;
        textView4.setText(ob6.M0(2131747002, null).toUpperCase());
        yob.R(this.c1, aob.f0(aob.v0(i, yx5Var), 7, -1), null, yob.M(i), yx5Var);
        this.c1.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        this.c1.setTextColor(-1);
        this.c1.setTextSize(1, 14.0f);
        this.c1.setGravity(1);
        this.c1.setTypeface(hl.o());
        this.c1.setAlpha(0.6f);
        this.c1.setSingleLine();
        this.c1.setOnClickListener(new xx5(this, (byte) 4));
        this.P0.addView(this.c1, tre.l(1.0f, 0, -2));
    }

    public static void w0(rlb rlbVar, int i) {
        int i2;
        rlbVar.setAlign(i);
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
        rlbVar.getEditText().setGravity(i2);
        if (i != 1) {
            boolean z = ob6.a0;
            if (i == 2 ? !z : z) {
                i3 = 3;
            }
        } else {
            i3 = 4;
        }
        rlbVar.getEditText().setTextAlignment(i3);
    }

    @Override
    public final void A(h44 h44Var) {
        int[] h0 = h0(h44Var);
        A0(new iy5(this, h44Var, (byte) 2), this, 51, h0[0], h0[1] - hl.L(32.0f));
    }

    public final void A0(Runnable runnable, wy5 wy5Var, int i, int i2, int i3) {
        n8 n8Var = this.B1;
        if (n8Var != null && n8Var.isShowing()) {
            this.B1.d(true);
            return;
        }
        if (this.C1 == null) {
            this.D1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.A1);
            this.C1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.C1.setBackgroundColor(-14145495);
            this.C1.setOnTouchListener(new b7(this, (byte) 8));
            this.C1.setDispatchKeyEventListener(new ey5(this));
            this.C1.setShownFromBottom(true);
        }
        this.C1.d();
        runnable.run();
        if (this.B1 == null) {
            n8 n8Var2 = new n8(this.C1, -2, -2);
            this.B1 = n8Var2;
            n8Var2.b = true;
            n8Var2.setAnimationStyle(2131755191);
            this.B1.setOutsideTouchable(true);
            this.B1.setClippingEnabled(true);
            this.B1.setInputMethodMode(2);
            this.B1.setSoftInputMode(0);
            this.B1.getContentView().setFocusableInTouchMode(true);
            this.B1.setOnDismissListener(new y6(this, (byte) 5));
        }
        this.C1.measure(View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(1000.0f), Integer.MIN_VALUE));
        this.B1.setFocusable(true);
        this.B1.showAtLocation(wy5Var, i, i2 - (this.C1.getMeasuredWidth() / 2), i3 - this.C1.getMeasuredHeight());
        n8.i(this.C1);
    }

    public final void B0(boolean z) {
        float f;
        if (this.o1 != z) {
            this.o1 = z;
            vpa vpaVar = this.p1;
            if (vpaVar != null) {
                vpaVar.d();
            }
            float f2 = 1000.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            vpa vpaVar2 = new vpa(new xk4(f));
            this.p1 = vpaVar2;
            wpa wpaVar = new wpa();
            if (!z) {
                f2 = 0.0f;
            }
            wpaVar.i = f2;
            wpaVar.b(1250.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            if (z) {
                zv7 zv7Var = this.f1;
                zv7Var.setAlpha(0.0f);
                zv7Var.setVisibility(0);
            }
            this.p1.b(new i10(this, (byte) 6));
            this.p1.a(new fy5(this, z, (byte) 0));
            this.p1.h();
        }
    }

    public final void C0() {
        gc1 gc1Var = this.J1;
        if (gc1Var != null) {
            gc1Var.b.c();
            gd4 gd4Var = gc1Var.c;
            if (gd4Var != null) {
                gd4Var.f = null;
                v21 v21Var = (v21) gd4Var.g;
                if (v21Var != null) {
                    v21Var.b();
                    gd4Var.g = null;
                }
                gc1Var.c = null;
            }
        }
        this.G0.h();
        this.J0.setVisibility(8);
        this.I0.setVisibility(8);
        this.q0.postRunnable(new jm3((byte) 20));
    }

    @Override
    public final void D() {
        B0(true);
    }

    public final PointF D0(h44 h44Var) {
        float f = 200.0f;
        fo6 fo6Var = this.r0;
        if (fo6Var != null) {
            f = 200.0f / fo6Var.c;
        }
        if (h44Var != null) {
            PointF position = h44Var.getPosition();
            return new PointF(position.x + f, position.y + f);
        }
        float f2 = 100.0f;
        if (fo6Var != null) {
            f2 = 100.0f / fo6Var.c;
        }
        PointF b0 = b0();
        while (true) {
            int i = 0;
            boolean z = false;
            while (true) {
                ry5 ry5Var = this.J0;
                if (i >= ry5Var.getChildCount()) {
                    break;
                }
                View childAt = ry5Var.getChildAt(i);
                if (childAt instanceof h44) {
                    PointF position2 = ((h44) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - b0.y, 2.0d) + Math.pow(position2.x - b0.x, 2.0d))) < f2) {
                        z = true;
                    }
                }
                i++;
            }
            if (!z) {
                return b0;
            }
            b0 = new PointF(b0.x + f, b0.y + f);
        }
    }

    public final void E0(int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z;
        if (this.Q0 != i && this.R0 != i) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i2 = this.Q0;
            ViewGroup viewGroup3 = this.e1;
            ViewGroup viewGroup4 = this.d1;
            if (i2 == 0) {
                viewGroup = viewGroup4;
            } else if (i2 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.R0 = i;
            if (i == 0) {
                viewGroup2 = viewGroup4;
            } else if (i == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i3 = this.z1;
            a78 e = a78.e(i3);
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
            int c = a78.e(i3).c();
            igb igbVar = this.u1;
            igbVar.a = c;
            if (i == 2) {
                z2 = false;
            }
            this.I1 = z2;
            u0(igbVar, null);
            this.I1 = false;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.T0 = duration;
            duration.setInterpolator(k43.f);
            this.T0.addUpdateListener(new nk(this, viewGroup, viewGroup2, (byte) 2));
            this.T0.addListener(new eq1(this, viewGroup, viewGroup2, i, (byte) 3));
            this.T0.start();
        }
    }

    public final void F0() {
        int i = 0;
        while (true) {
            ry5 ry5Var = this.J0;
            if (i < ry5Var.getChildCount()) {
                View childAt = ry5Var.getChildAt(i);
                if (childAt != this.C0) {
                    if (childAt instanceof h44) {
                        h44 h44Var = (h44) childAt;
                        if (!h44Var.n0 && h44Var.l0 <= 0.0f) {
                        }
                    }
                    i++;
                }
                ((h44) childAt).m();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        if (i > hl.L(50.0f) && this.V1 && !hl.E && !hl.O1()) {
            if (z) {
                this.Z1 = i;
                uc7.d1().edit().putInt("kbd_height_land3", this.Z1).commit();
            } else {
                this.Y1 = i;
                uc7.d1().edit().putInt("kbd_height", this.Y1).commit();
            }
        }
        if (this.U1) {
            if (z) {
                i2 = this.Z1;
            } else {
                i2 = this.Y1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.T1.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = hl.q.x;
            if (i3 != i4 || layoutParams.height != i2) {
                layoutParams.width = i4;
                layoutParams.height = i2;
                this.T1.setLayoutParams(layoutParams);
                this.X1 = layoutParams.height;
                requestLayout();
                rx5 rx5Var = ((hc8) this).d2.L1;
                if (rx5Var != null) {
                    rx5Var.a();
                }
                getHeight();
            }
        }
        if (this.a2 == i && this.b2 == z) {
            getHeight();
            return;
        }
        this.a2 = i;
        this.b2 = z;
        boolean z4 = this.V1;
        h44 h44Var = this.C0;
        if (h44Var instanceof rlb) {
            if (((rlb) h44Var).getEditText().isFocused() && i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.V1 = z2;
        } else {
            this.V1 = false;
            z2 = false;
        }
        if (z2 && this.U1) {
            z0(0);
        }
        if (this.X1 != 0 && !(z3 = this.V1) && z3 != z4 && !this.U1) {
            this.X1 = 0;
            requestLayout();
            rx5 rx5Var2 = ((hc8) this).d2.L1;
            if (rx5Var2 != null) {
                rx5Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        y0(true);
    }

    public final void a0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new iy5(this, (h44) view, (byte) 1)).start();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G8));
        hashSet.add(Integer.valueOf(aob.h5));
        hashSet.add(Integer.valueOf(aob.j5));
        hashSet.add(Integer.valueOf(aob.r5));
        hashSet.add(Integer.valueOf(aob.zf));
        hashSet.add(Integer.valueOf(aob.Cf));
        hashSet.add(Integer.valueOf(aob.Ff));
        hashSet.add(Integer.valueOf(aob.Jf));
        hashSet.add(Integer.valueOf(aob.Ef));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.Di));
        hashSet.add(Integer.valueOf(aob.wi));
        hashSet.add(Integer.valueOf(aob.vi));
        hashSet.add(Integer.valueOf(aob.xi));
        hashSet.add(Integer.valueOf(aob.yi));
        hashSet.add(Integer.valueOf(aob.Bf));
        hashSet.add(Integer.valueOf(aob.Af));
        hashSet.add(Integer.valueOf(aob.a7));
        hashSet.add(Integer.valueOf(aob.m7));
        hashSet.add(Integer.valueOf(aob.l7));
        hashSet.add(Integer.valueOf(aob.n7));
        hashSet.add(Integer.valueOf(aob.d6));
        hashSet.add(Integer.valueOf(aob.d7));
    }

    @Override
    public final void b() {
        setTextType((this.E0 + 1) % 4);
    }

    public final PointF b0() {
        fo6 fo6Var;
        qma paintingSize = getPaintingSize();
        float f = paintingSize.a / 2.0f;
        float f2 = paintingSize.b / 2.0f;
        if (this.r0 != null) {
            double radians = (float) Math.toRadians(-(fo6Var.k + fo6Var.d));
            float cos = (float) ((Math.cos(radians) * fo6Var.a) - (Math.sin(radians) * fo6Var.b));
            float d = (float) ik8.d(radians, fo6Var.b, Math.sin(radians) * fo6Var.a);
            f -= cos * paintingSize.a;
            f2 -= d * paintingSize.b;
        }
        return new PointF(f, f2);
    }

    @Override
    public final void c(int i) {
        h44 h44Var = this.C0;
        if (h44Var instanceof rlb) {
            w0((rlb) h44Var, i);
            a78 e = a78.e(this.z1);
            e.g = i;
            e.a.edit().putInt("text_alignment", i).apply();
        }
    }

    public final kc1 c0() {
        ((hc8) this).d2.h0.isFocusable();
        qma paintingSize = getPaintingSize();
        PointF b0 = b0();
        b0.y *= 1.5f;
        kc1 kc1Var = new kc1(getContext(), b0, (int) ((paintingSize.a / 9.0f) * 0.5f), new igb(1.0f, this.u1.c, -1));
        float f = paintingSize.a / 9.0f;
        by5 by5Var = new by5(this, (byte) 2);
        kc1Var.y0 = (int) (0.5f * f);
        kc1Var.z0 = (int) (f * 2.0f);
        kc1Var.A0 = by5Var;
        kc1Var.B0 = true;
        kc1Var.setStickyX(2);
        kc1Var.setDelegate(this);
        kc1Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        kc1Var.setTypeface(a78.e(this.z1).j);
        kc1Var.setType(3);
        gc1 gc1Var = this.J1;
        if (gc1Var != null) {
            gc1Var.b(kc1Var);
        } else {
            final aj3 aj3Var = this.L1;
            Objects.requireNonNull(aj3Var);
            kc1Var.setPositionProvider(new e05(aj3Var, (byte) 18));
            kc1Var.setOnEditing(new pcc() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            aj3Var.i(((Boolean) obj).booleanValue());
                            return;
                        default:
                            aj3Var.M(((Long) obj).longValue());
                            return;
                    }
                }
            });
            kc1Var.setOnSeek(new pcc() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            aj3Var.i(((Boolean) obj).booleanValue());
                            return;
                        default:
                            aj3Var.M(((Long) obj).longValue());
                            return;
                    }
                }
            });
        }
        this.J0.addView(kc1Var, tre.c(-2.0f, -2));
        w0(kc1Var, 1);
        fo6 fo6Var = this.r0;
        if (fo6Var != null) {
            kc1Var.j(1.0f / fo6Var.c);
            kc1Var.f(-(fo6Var.k + fo6Var.d));
        }
        return kc1Var;
    }

    public final v98 d0(String str, boolean z) {
        float f;
        qma qmaVar;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            cc4.g(e, true);
            f = 1.0f;
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        ry5 ry5Var = this.J0;
        if (i > 0) {
            float floor = (float) Math.floor(ry5Var.getMeasuredWidth() * 0.5d);
            qmaVar = new qma(floor, floor / f);
        } else {
            float floor2 = (float) Math.floor(ry5Var.getMeasuredHeight() * 0.5d);
            qmaVar = new qma(f * floor2, floor2);
        }
        qma qmaVar2 = qmaVar;
        Pair N0 = hl.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f2 = qmaVar2.a;
            qmaVar2.a = qmaVar2.b;
            qmaVar2.b = f2;
        }
        Context context = getContext();
        PointF b0 = b0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        v98 v98Var = new v98(context, b0, qmaVar2, str, intValue);
        v98Var.setDelegate(this);
        ry5Var.addView(v98Var);
        if (z) {
            r0(v98Var);
            t0(v98Var, true);
        }
        return v98Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ry5 ry5Var;
        rlb rlbVar;
        String str;
        if (i == jn7.F5 && (ry5Var = this.J0) != null) {
            for (int i3 = 0; i3 < ry5Var.getChildCount(); i3++) {
                View childAt = ry5Var.getChildAt(i3);
                if ((childAt instanceof rlb) && (str = (rlbVar = (rlb) childAt).C0) != null) {
                    rlbVar.setTypeface(str);
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
    public final boolean drawChild(Canvas canvas, View view, long j) {
        fo6 fo6Var;
        b6 b6Var;
        int i = 0;
        ry5 ry5Var = this.J0;
        if (view == ry5Var) {
            float d = this.N1.d(this.G1);
            if (d > 0.0f) {
                int p1 = aob.p1(d, 1090519039);
                Paint paint = this.O1;
                paint.setShadowLayer(hl.L(24.0f * d), 0.0f, 0.0f, p1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(ry5Var.getX(), ry5Var.getY());
                canvas.scale(ry5Var.getScaleX(), ry5Var.getScaleY(), ry5Var.getWidth() / 2.0f, ry5Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, ry5Var.getWidth(), ry5Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, ry5Var.getWidth(), ry5Var.getHeight(), this.P1);
                canvas.restore();
            }
        }
        if ((view == this.G0 || view == this.H0 || ((view == ry5Var && ry5Var.getClipChildren()) || (view == (b6Var = this.I0) && b6Var.getClipChildren()))) && (fo6Var = this.r0) != null) {
            canvas.save();
            if (!this.F0) {
                i = hl.m;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = fo6Var.k;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * fo6Var.e)) / fo6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * fo6Var.f)) / fo6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.v0;
            float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.X1) - currentActionBarHeight) - hl.L(48.0f))) - scaleY) / 2.0f) + hl.L(8.0f) + i + this.w0;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final defpackage.ny5 e0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy5.e0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):ny5");
    }

    public final rlb f0(boolean z) {
        ((hc8) this).d2.h0.isFocusable();
        qma paintingSize = getPaintingSize();
        PointF D0 = D0(null);
        rlb rlbVar = new rlb(getContext(), D0, (int) (paintingSize.a / 9.0f), "", this.u1, this.E0);
        float f = paintingSize.a / 9.0f;
        by5 by5Var = new by5(this, (byte) 3);
        rlbVar.y0 = (int) (0.5f * f);
        rlbVar.z0 = (int) (f * 2.0f);
        rlbVar.A0 = by5Var;
        float f2 = D0.x;
        ry5 ry5Var = this.J0;
        if (f2 == ry5Var.getMeasuredWidth() / 2.0f) {
            rlbVar.setStickyX(2);
        }
        if (D0.y == ry5Var.getMeasuredHeight() / 2.0f) {
            rlbVar.setStickyY(2);
        }
        rlbVar.setDelegate(this);
        rlbVar.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i = this.z1;
        rlbVar.setTypeface(a78.e(i).j);
        rlbVar.setType(a78.e(i).h);
        ry5Var.addView(rlbVar, tre.c(-2.0f, -2));
        fo6 fo6Var = this.r0;
        if (fo6Var != null) {
            rlbVar.j(1.0f / fo6Var.c);
            rlbVar.f(-(fo6Var.k + fo6Var.d));
        }
        if (z) {
            r0(rlbVar);
            rlbVar.q();
            t0(rlbVar, false);
            rlbVar.getFocusedView().requestFocus();
            hl.E3(rlbVar.getFocusedView());
            this.D0 = true;
            int i2 = a78.e(i).g;
            nv7 nv7Var = this.e1;
            nv7Var.d(i2, true);
            nv7Var.setOutlineType(a78.e(i).h);
        }
        return rlbVar;
    }

    public final void g0() {
        h44 h44Var = this.C0;
        if ((h44Var instanceof rlb) && !this.D0) {
            rlb rlbVar = (rlb) h44Var;
            if (rlbVar instanceof kc1) {
                kc1 kc1Var = (kc1) rlbVar;
                kc1Var.z();
                if (kc1Var.E0 == null) {
                    return;
                }
            }
            this.D0 = true;
            rlbVar.q();
            View focusedView = rlbVar.getFocusedView();
            focusedView.requestFocus();
            hl.E3(focusedView);
        }
    }

    public int getAdditionalBottom() {
        return hl.L(24.0f);
    }

    public int getAdditionalTop() {
        return hl.L(48.0f);
    }

    public View getCancelView() {
        return this.k0;
    }

    public long getCaptionsTrimEnd() {
        return 0L;
    }

    public long getCaptionsTrimStart() {
        return 0L;
    }

    public File getCaptionsVideoFile() {
        return null;
    }

    public long getCaptionsVideoPosition() {
        return 0L;
    }

    public float getCropRotation() {
        fo6 fo6Var = this.r0;
        if (fo6Var != null) {
            return fo6Var.d + fo6Var.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.l0;
    }

    public long getLcm() {
        return this.Z0.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        hm[] hmVarArr;
        ry5 ry5Var = this.J0;
        int childCount = ry5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = ry5Var.getChildAt(i);
            if (childAt instanceof w3b) {
                TLRPC.Document sticker = ((w3b) childAt).getSticker();
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
            } else if (childAt instanceof rlb) {
                CharSequence text = ((rlb) childAt).getText();
                if ((text instanceof Spanned) && (hmVarArr = (hm[]) ((Spanned) text).getSpans(0, text.length(), hm.class)) != null) {
                    for (hm hmVar : hmVarArr) {
                        if (hmVar != null) {
                            TLRPC.Document document = hmVar.document;
                            if (document == null) {
                                document = wl.e(this.z1, hmVar.getDocumentId());
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
        return this.m0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public pa9 getRenderView() {
        return this.G0;
    }

    public float getSelectedEntityBottom() {
        h44 h44Var = this.C0;
        ry5 ry5Var = this.J0;
        if (h44Var == null) {
            return getY() + ry5Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        h44Var.getLocationInWindow(iArr);
        return (ry5Var.getScaleY() * this.C0.getHeight()) + iArr[1];
    }

    public hnb getThanosEffect() {
        if (!hnb.c()) {
            return null;
        }
        if (this.K0 == null) {
            hnb hnbVar = new hnb(getContext(), new by5(this, (byte) 0));
            this.K0 = hnbVar;
            addView(hnbVar);
        }
        return this.K0;
    }

    public final boolean h(MotionEvent motionEvent) {
        if (this.C0 != null) {
            t0(null, true);
        }
        float x = motionEvent.getX();
        qy5 qy5Var = this.G0;
        float translationX = ((x - qy5Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / qy5Var.getScaleX();
        float y = ((((motionEvent.getY() - qy5Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + hl.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / qy5Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-qy5Var.getRotation());
        double d2 = y;
        float measuredWidth = (qy5Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (qy5Var.getMeasuredHeight() / 2.0f) + ((float) ik8.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        qy5Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int[] h0(h44 h44Var) {
        float[] fArr = this.R1;
        fArr[0] = h44Var.getWidth() / 2.0f;
        fArr[1] = h44Var.getHeight() / 2.0f;
        h44Var.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + h44Var.getLeft();
        fArr[1] = fArr[1] + h44Var.getTop();
        ViewParent parent = h44Var.getParent();
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
        int[] iArr = this.S1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = hl.q;
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        iArr[1] = (point.y / 2) + ((int) ik8.d(radians, d2, Math.sin(radians) * d));
        return iArr;
    }

    @Override
    public final boolean i(h44 h44Var) {
        return t0(h44Var, true);
    }

    public final void i0(boolean z) {
        if (this.U1) {
            z0(0);
        }
        if (z) {
            o24 o24Var = this.T1;
            if (o24Var != null && o24Var.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.T1.getMeasuredHeight());
                ofFloat.addUpdateListener(new cy5(this, (byte) 0));
                this.W1 = true;
                ofFloat.addListener(new oy5(this, (byte) 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(hb.w);
                ofFloat.start();
                return;
            }
            j0();
        }
    }

    public final void j0() {
        o24 o24Var;
        rx5 rx5Var;
        if (this.X1 > 0 && (rx5Var = ((hc8) this).d2.L1) != null) {
            rx5Var.a();
        }
        if (!this.U1 && (o24Var = this.T1) != null && o24Var.getVisibility() != 8) {
            this.T1.setVisibility(8);
        }
        this.X1 = 0;
    }

    public final void k0() {
        boolean z;
        boolean z2;
        Bitmap bitmap = this.o0;
        e23 e23Var = null;
        try {
            try {
                j84 j84Var = new j84(getContext());
                j84Var.g(1);
                j84Var.f(1);
                j84Var.b = false;
                k84 a = j84Var.a();
                if (!a.c.k()) {
                    if (f11.a) {
                        cc4.d("face detection is not operational");
                    }
                } else {
                    pm3 pm3Var = new pm3((byte) 4);
                    rc0 rc0Var = (rc0) pm3Var.b;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    pm3Var.d = bitmap;
                    rc0Var.a = width;
                    rc0Var.b = height;
                    rc0Var.c = getFrameRotation();
                    if (((ByteBuffer) pm3Var.c) == null && ((Bitmap) pm3Var.d) == null) {
                        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                    }
                    try {
                        SparseArray h = a.h(pm3Var);
                        ArrayList arrayList = new ArrayList();
                        qma paintingSize = getPaintingSize();
                        for (int i = 0; i < h.size(); i++) {
                            i84 i84Var = (i84) h.get(h.keyAt(i));
                            int i2 = this.Y0;
                            if (i2 % 360 != 90 && i2 % 360 != 270) {
                                z = false;
                            } else {
                                z = true;
                            }
                            r88 r88Var = new r88(i84Var, bitmap, paintingSize, z);
                            if (r88Var.d != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                arrayList.add(r88Var);
                            }
                        }
                        this.X0 = arrayList;
                    } catch (Throwable th) {
                        cc4.g(th, true);
                    }
                }
                a.d();
            } catch (Exception e) {
                cc4.g(e, true);
                if (0 != 0) {
                    e23Var.d();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                e23Var.d();
            }
            throw th2;
        }
    }

    public final void l0(Integer num) {
        int intValue = num.intValue();
        a78 a78Var = this.F1;
        a78Var.h(intValue, true);
        a78Var.g();
        setNewColor(num.intValue());
        int d = a78Var.d();
        sy5 sy5Var = this.q1;
        sy5Var.setSelectedColorIndex(d);
        sy5Var.getAdapter().f();
    }

    public final void m0(Integer num) {
        setNewColor(num.intValue());
        y0(false);
    }

    public final void n0() {
        w3b w3bVar;
        h44 h44Var = this.C0;
        if (h44Var != null) {
            PointF D0 = D0(h44Var);
            h44 h44Var2 = this.C0;
            boolean z = h44Var2 instanceof w3b;
            ry5 ry5Var = this.J0;
            if (z) {
                w3b w3bVar2 = new w3b(getContext(), (w3b) this.C0, D0);
                w3bVar2.setDelegate(this);
                ry5Var.addView(w3bVar2);
                w3bVar = w3bVar2;
            } else if (h44Var2 instanceof rlb) {
                rlb rlbVar = new rlb(getContext(), (rlb) this.C0, D0);
                rlbVar.setDelegate(this);
                rlbVar.setMaxWidth((int) (getPaintingSize().a - 20.0f));
                ry5Var.addView(rlbVar, tre.c(-2.0f, -2));
                w3bVar = rlbVar;
            } else {
                w3bVar = null;
            }
            r0(w3bVar);
            t0(w3bVar, true);
        }
        n8 n8Var = this.B1;
        if (n8Var != null && n8Var.isShowing()) {
            this.B1.d(true);
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    public final void o0(boolean z) {
        int i;
        int i2;
        if (this.Q0 == 0) {
            int i3 = 0;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            this.V0.setLayerType(i, null);
            if (z) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            this.M0.setLayerType(i2, null);
            if (z) {
                i3 = 2;
            }
            this.L0.setLayerType(i3, null);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.F5);
    }

    @Override
    public final void onDetachedFromWindow() {
        gc1 gc1Var = this.J1;
        if (gc1Var != null) {
            gc1Var.f(null);
            gd4 gd4Var = gc1Var.c;
            if (gd4Var != null) {
                gd4Var.f = null;
                v21 v21Var = (v21) gd4Var.g;
                if (v21Var != null) {
                    v21Var.b();
                    gd4Var.g = null;
                }
                gc1Var.c = null;
            }
            gc1Var.a.i(false);
        }
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.F5);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int Q;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        if (this.T1 != null) {
            if (hl.O1()) {
                Q = i6 - this.T1.getMeasuredHeight();
            } else {
                Q = (Q() + i6) - this.T1.getMeasuredHeight();
            }
            o24 o24Var = this.T1;
            o24Var.layout(0, Q, o24Var.getMeasuredWidth(), this.T1.getMeasuredHeight() + Q);
        }
        if (!this.F0) {
            i7 = hl.m;
        }
        qy5 qy5Var = this.G0;
        int ceil = (int) Math.ceil((i5 - qy5Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + uh9.w(8.0f, (((i6 - (a.getCurrentActionBarHeight() + i7)) - hl.L(48.0f)) - qy5Var.getMeasuredHeight()) / 2, i7);
        qy5Var.layout(ceil, additionalTop, qy5Var.getMeasuredWidth() + ceil, qy5Var.getMeasuredHeight() + additionalTop);
        tb tbVar = this.H0;
        tbVar.layout(ceil, additionalTop, tbVar.getMeasuredWidth() + ceil, tbVar.getMeasuredHeight() + additionalTop);
        int measuredWidth = qy5Var.getMeasuredWidth();
        ry5 ry5Var = this.J0;
        int measuredWidth2 = ((measuredWidth - ry5Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((qy5Var.getMeasuredHeight() - ry5Var.getMeasuredHeight()) / 2) + additionalTop;
        ry5Var.layout(measuredWidth2, measuredHeight, ry5Var.getMeasuredWidth() + measuredWidth2, ry5Var.getMeasuredHeight() + measuredHeight);
        hnb hnbVar = this.K0;
        if (hnbVar != null) {
            hnbVar.layout(measuredWidth2, measuredHeight, ry5Var.getMeasuredWidth() + measuredWidth2, ry5Var.getMeasuredHeight() + measuredHeight);
        }
        b6 b6Var = this.I0;
        b6Var.layout(ceil, additionalTop, b6Var.getMeasuredWidth() + ceil, b6Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float currentActionBarHeight;
        float f;
        bc1 bc1Var;
        this.z0 = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((hl.q.y - a.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - hl.L(48.0f);
        Bitmap bitmap = this.n0;
        if (bitmap != null) {
            f = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - a.getCurrentActionBarHeight()) - hl.L(48.0f);
            f = size;
        }
        float f2 = size;
        float floor = (float) Math.floor((f2 * currentActionBarHeight) / f);
        float f3 = currentActionBarHeight2;
        if (floor > f3) {
            f2 = (float) Math.floor((f * f3) / currentActionBarHeight);
            floor = f3;
        }
        int i3 = (int) f2;
        int i4 = (int) floor;
        this.G0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.H0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        float f4 = f2 / this.B0.a;
        this.A0 = f4;
        ry5 ry5Var = this.J0;
        ry5Var.setScaleX(f4);
        ry5Var.setScaleY(this.A0);
        ry5Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.b, 1073741824));
        hnb hnbVar = this.K0;
        if (hnbVar != null) {
            hnbVar.measure(View.MeasureSpec.makeMeasureSpec((int) this.B0.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.B0.b, 1073741824));
            this.K0.setScaleX(this.A0);
            this.K0.setScaleY(this.A0);
        }
        F0();
        this.I0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        measureChild(this.M0, i, i2);
        measureChild(this.V0, i, i2);
        gc1 gc1Var = this.J1;
        if (gc1Var != null && (bc1Var = gc1Var.e) != null) {
            bc1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        measureChild(this.O0, i, i2);
        measureChild(this.N0, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.X1), 1073741824));
        FrameLayout frameLayout = this.L0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), hl.L(12.0f) + hl.m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.z0 = false;
        if (hl.L(20.0f) >= 0 && !this.U1 && !this.W1) {
            this.z0 = true;
            j0();
            this.z0 = false;
        }
        if (hl.L(20.0f) < 0) {
            j0();
        }
        o24 o24Var = this.T1;
        if (o24Var != null) {
            measureChild(o24Var, i, i2);
        }
    }

    @Override
    public final boolean p() {
        return !this.D0;
    }

    public final boolean p0() {
        if (this.v1) {
            y0(false);
            return true;
        } else if (this.U1) {
            i0(true);
            return true;
        } else if (!this.D0) {
            return false;
        } else {
            t0(null, true);
            return true;
        }
    }

    public abstract void q0(boolean z);

    public final void r0(h44 h44Var) {
        if (h44Var == null) {
            return;
        }
        this.p0.b(h44Var.getUUID(), new iy5(this, h44Var, (byte) 0));
    }

    @Override
    public final void requestLayout() {
        if (this.z0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(v01 v01Var) {
        boolean z = v01Var instanceof p01;
        gx7 gx7Var = this.V0;
        if (!z && !(v01Var instanceof r01)) {
            gx7Var.b(0.05f, 1.0f);
        } else {
            gx7Var.b(0.4f, 1.75f);
        }
        gx7Var.setDrawCenter(!(v01Var instanceof u01));
        qy5 qy5Var = this.G0;
        if (qy5Var.getCurrentBrush() instanceof u01) {
            this.U0 = true;
        }
        qy5Var.setBrush(v01Var);
        igb igbVar = this.u1;
        int i = igbVar.a;
        igbVar.a = a78.e(this.z1).c();
        igbVar.c = this.W0.get();
        u0(igbVar, Integer.valueOf(i));
        this.H0.invalidate();
    }

    public final void s0(h44 h44Var) {
        h44 h44Var2 = this.C0;
        if (h44Var == h44Var2 && h44Var2 != null) {
            h44Var2.l(h44Var2.o0, false);
            this.C0 = null;
            if (h44Var instanceof rlb) {
                ValueAnimator valueAnimator = this.T0;
                if (valueAnimator != null && this.R0 != 0) {
                    valueAnimator.cancel();
                }
                E0(0);
            }
        }
        this.J0.removeView(h44Var);
        if (h44Var != null) {
            UUID uuid = h44Var.getUUID();
            a9c a9cVar = this.p0;
            a9cVar.b.remove(uuid);
            a9cVar.c.remove(uuid);
            hl.c3(new azb(a9cVar, (byte) 7));
        }
        gx7 gx7Var = this.V0;
        v34 v34Var = this.W0;
        gx7Var.setValueOverride(v34Var);
        gx7Var.setShowPreview(true);
        float f = v34Var.get();
        igb igbVar = this.u1;
        igbVar.c = f;
        u0(igbVar, null);
    }

    public void setBlurredBackgroundDrawableForTools(jl0 jl0Var) {
        jl0Var.q(hl.L(4.0f));
        this.Q1 = jl0Var;
    }

    public void setDrawShadow(boolean z) {
        this.G1 = z;
        invalidate();
        setClipChildren(!z);
    }

    public void setOffsetTranslationX(float f) {
        if (this.Q0 == 0) {
            this.V0.setTranslationX(f);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.E1 = runnable;
    }

    @Override
    public final void t() {
        rx5 rx5Var;
        if (!this.V1 && !this.U1) {
            f0(true);
            return;
        }
        boolean z = this.U1;
        if (z && (rx5Var = ((hc8) this).d2.L1) != null) {
            rx5Var.e = true;
        }
        z0(!z ? 1 : 0);
        if (z) {
            h44 h44Var = this.C0;
            if (h44Var instanceof rlb) {
                hl.E3(((rlb) h44Var).getEditText());
            }
        }
    }

    public final boolean t0(h44 h44Var, boolean z) {
        wy5 wy5Var;
        boolean z2;
        int i;
        int i2;
        boolean z3 = h44Var instanceof rlb;
        if (z3 && ((i2 = this.R0) != -1 ? i2 != 2 : this.Q0 != 2)) {
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null && i2 != 2) {
                valueAnimator.cancel();
            }
            if (this.v1) {
                y0(false);
            }
            E0(2);
        }
        if (z3 && z) {
            rlb rlbVar = (rlb) h44Var;
            int gravity = rlbVar.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i = 0;
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
            nv7 nv7Var = this.e1;
            nv7Var.setAlignment(i);
            nv7Var.setTypeface(rlbVar.getTypeface().a);
            nv7Var.e(rlbVar.getType(), true);
            this.N0.invalidate();
        }
        h44 h44Var2 = this.C0;
        if (h44Var2 != null) {
            if (h44Var2 == h44Var) {
                boolean z4 = this.D0;
                if (!z4 && (h44Var2 instanceof kc1) && !h44Var.f0) {
                    g0();
                    return true;
                } else if (!z4) {
                    int[] h0 = h0(h44Var2);
                    A0(new iy5(this, h44Var2, (byte) 2), this, 51, h0[0], h0[1] - hl.L(32.0f));
                    return true;
                } else {
                    if (h44Var2 instanceof rlb) {
                        hl.E3(((rlb) h44Var2).getFocusedView());
                        i0(false);
                    }
                    return true;
                }
            }
            wy5Var = this;
            h44Var2.l(h44Var2.o0, false);
            h44 h44Var3 = wy5Var.C0;
            if (h44Var3 instanceof rlb) {
                ((rlb) h44Var3).r();
                if (!z3) {
                    wy5Var.D0 = false;
                    hl.t1(((rlb) wy5Var.C0).getFocusedView());
                    wy5Var.i0(false);
                }
            }
            z2 = true;
        } else {
            wy5Var = this;
            z2 = false;
        }
        h44 h44Var4 = wy5Var.C0;
        wy5Var.C0 = h44Var;
        if ((h44Var4 instanceof rlb) && TextUtils.isEmpty(((rlb) h44Var4).getText()) && !(h44Var4 instanceof kc1)) {
            wy5Var.s0(h44Var4);
        }
        h44 h44Var5 = wy5Var.C0;
        v34 v34Var = wy5Var.W0;
        igb igbVar = wy5Var.u1;
        gx7 gx7Var = wy5Var.V0;
        if (h44Var5 != null) {
            b6 b6Var = wy5Var.I0;
            h44Var5.o0 = b6Var;
            h44Var5.l(b6Var, true);
            wy5Var.J0.bringChildToFront(wy5Var.C0);
            h44 h44Var6 = wy5Var.C0;
            if (h44Var6 instanceof rlb) {
                rlb rlbVar2 = (rlb) h44Var6;
                rlbVar2.B0 = false;
                rlbVar2.getSwatch().c = igbVar.c;
                wy5Var.u0(rlbVar2.getSwatch(), null);
                wy5Var.setTextWeightRange(rlbVar2);
                gx7Var.setValueOverride(new ky5(rlbVar2, (int) (wy5Var.B0.a / 9.0f), (byte) 0));
                gx7Var.setShowPreview(false);
                return true;
            }
            gx7Var.setValueOverride(v34Var);
            gx7Var.setShowPreview(true);
            igbVar.c = v34Var.get();
            wy5Var.u0(igbVar, null);
            return true;
        }
        ValueAnimator valueAnimator2 = wy5Var.T0;
        if (valueAnimator2 != null && wy5Var.R0 != 0) {
            valueAnimator2.cancel();
        }
        if (wy5Var.v1) {
            wy5Var.y0(false);
        }
        wy5Var.E0(0);
        gx7Var.setValueOverride(v34Var);
        gx7Var.setShowPreview(true);
        igbVar.c = v34Var.get();
        wy5Var.u0(igbVar, null);
        return z2;
    }

    @Override
    public final void u(float f, float f2, float[] fArr) {
        Point point = hl.q;
        double d = f - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.J0.getRotation());
        double d2 = f2 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (point.y / 2.0f) + ((float) ik8.d(radians, d2, Math.sin(radians) * d));
    }

    public final void u0(igb igbVar, Integer num) {
        igb igbVar2 = this.u1;
        if (igbVar2 != igbVar) {
            igbVar2.a = igbVar.a;
            igbVar2.b = igbVar.b;
            igbVar2.c = igbVar.c;
            int i = this.z1;
            a78.e(i).h(igbVar.a, true);
            a78.e(i).j(igbVar.c);
        }
        int i2 = igbVar.a;
        qy5 qy5Var = this.G0;
        qy5Var.setColor(i2);
        qy5Var.setBrushSize(igbVar.c);
        int i3 = igbVar2.a;
        if (num != null && num.intValue() != i3) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new e34(this, num, i3, (byte) 1));
            duration.start();
        } else {
            ty5 ty5Var = this.M0;
            if (ty5Var != null) {
                ty5Var.invalidate();
            }
        }
        h44 h44Var = this.C0;
        if ((h44Var instanceof rlb) && !this.I1) {
            ((rlb) h44Var).setSwatch(new igb(igbVar.b, igbVar.c, igbVar.a));
        }
    }

    @Override
    public final void updateColors() {
        this.y1.setColor(-15132391);
    }

    @Override
    public final int[] v(h44 h44Var) {
        return h0(h44Var);
    }

    public final void v0(float f) {
        this.m0 = f;
        this.L0.setTranslationY(-f);
        this.M0.setTranslationY(f);
    }

    @Override
    public final a78 w() {
        return a78.e(this.z1);
    }

    public final void x0(float f, float f2, float f3, float f4, float f5) {
        View view;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        this.s0 = f;
        this.x0 = f4;
        this.y0 = f5;
        this.t0 = f2;
        this.u0 = f3;
        this.v0 = f2;
        float f13 = f3 + 0.0f;
        this.w0 = f13;
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                view = this.J0;
            } else if (i == 1) {
                view = this.I0;
            } else if (i == 2) {
                view = this.G0;
            } else {
                view = this.H0;
            }
            fo6 fo6Var = this.r0;
            if (fo6Var != null) {
                float f14 = fo6Var.c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i2 = fo6Var.k;
                    if (i2 == 90 || i2 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f4 / ((int) (fo6Var.e * f11)), f5 / ((int) (fo6Var.f * f12)));
                    f7 = f14 * max;
                    float C = xnb.C(fo6Var.a, measuredWidth, f, max);
                    float f15 = fo6Var.c;
                    f8 = (C * f15) + f2;
                    f6 = 1.0f;
                    f9 = (fo6Var.b * measuredHeight * f * max * f15) + f13;
                    f10 = fo6Var.d + i2;
                } else {
                    return;
                }
            } else {
                f6 = 1.0f;
                if (i == 0) {
                    f7 = this.A0 * 1.0f;
                } else {
                    f7 = 1.0f;
                }
                f8 = f2;
                f9 = f13;
                f10 = 0.0f;
            }
            float f16 = ((-this.X1) / 2.0f) + f9;
            float f17 = f * f7;
            if (Float.isNaN(f17)) {
                f17 = f6;
            }
            view.setScaleX(f17);
            view.setScaleY(f17);
            view.setTranslationX(f8);
            view.setTranslationY(f16);
            view.setRotation(f10);
            view.invalidate();
        }
        F0();
        invalidate();
    }

    public final void y0(final boolean z) {
        float f;
        boolean z2;
        if (this.v1 != z) {
            this.v1 = z;
            vpa vpaVar = this.w1;
            if (vpaVar != null) {
                vpaVar.d();
            }
            float f2 = 1000.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            vpa vpaVar2 = new vpa(new xk4(f));
            this.w1 = vpaVar2;
            wpa wpaVar = new wpa();
            if (!z) {
                f2 = 0.0f;
            }
            wpaVar.i = f2;
            wpaVar.b(1250.0f);
            wpaVar.a(1.0f);
            vpaVar2.m = wpaVar;
            if (!this.V1 && !this.U1) {
                z2 = false;
            } else {
                z2 = true;
            }
            final boolean[] zArr = {z2};
            final float translationY = this.M0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.w1.b(new qs3() {
                @Override
                public final void a(vpa vpaVar3, float f3, float f4) {
                    int i;
                    wy5 wy5Var = wy5.this;
                    ty5 ty5Var = wy5Var.M0;
                    float f5 = f3 / 1000.0f;
                    wy5Var.x1 = f5;
                    float f6 = ((1.0f - f5) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f6);
                    viewGroup.setScaleY(f6);
                    viewGroup.setTranslationY((Math.min(wy5Var.x1, 0.25f) * hl.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(wy5Var.x1, 0.25f) / 0.25f));
                    sy5 sy5Var = wy5Var.q1;
                    float f7 = wy5Var.x1;
                    boolean z3 = z;
                    sy5Var.C1(z3, f7);
                    wy5Var.l0.setProgress(wy5Var.x1);
                    wy5Var.k0.setProgress(wy5Var.x1);
                    wy5Var.P0.setTranslationY(hl.L(32.0f) * wy5Var.x1);
                    if (zArr[0]) {
                        float f8 = wy5Var.x1;
                        if (!z3) {
                            f8 = 1.0f - f8;
                        }
                        float L = hl.L(40.0f) * f8;
                        if (z3) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        ty5Var.setTranslationY(translationY - (L * i));
                    }
                    ty5Var.invalidate();
                    if (viewGroup == wy5Var.e1) {
                        wy5Var.N0.invalidate();
                    }
                }
            });
            this.w1.a(new fy5(this, z, (byte) 1));
            this.w1.h();
            if (z) {
                sy5 sy5Var = this.q1;
                sy5Var.setVisibility(0);
                sy5Var.setSelectedColorIndex(a78.e(this.z1).d());
            }
        }
    }

    @Override
    public final void z() {
        A0(new by5(this, (byte) 5), this, 53, 0, getHeight());
    }

    public final void z0(int i) {
        boolean z;
        nv7 nv7Var = this.e1;
        if (i == 1) {
            o24 o24Var = this.T1;
            if (o24Var != null && o24Var.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            o24 o24Var2 = this.T1;
            if (o24Var2 != null && o24Var2.d1 != yac.t0) {
                removeView(o24Var2);
                o24Var2 = null;
                this.T1 = null;
            }
            if (o24Var2 == null) {
                o24 o24Var3 = new o24(null, true, false, false, getContext(), false, null, null, true, this.A1, false, false);
                this.T1 = o24Var3;
                o24Var3.V0 = true;
                o24Var3.setVisibility(8);
                if (hl.O1()) {
                    this.T1.setForseMultiwindowLayout(true);
                }
                this.T1.setDelegate(new py5(this));
                addView(this.T1);
            }
            this.T1.setVisibility(0);
            this.U1 = true;
            o24 o24Var4 = this.T1;
            if (this.Y1 <= 0) {
                if (hl.O1()) {
                    this.Y1 = hl.L(150.0f);
                } else {
                    this.Y1 = uc7.d1().getInt("kbd_height", hl.L(200.0f));
                }
            }
            int i2 = this.Z1;
            if (i2 <= 0) {
                if (hl.O1()) {
                    i2 = hl.L(150.0f);
                    this.Z1 = i2;
                } else {
                    i2 = uc7.d1().getInt("kbd_height_land3", hl.L(200.0f));
                    this.Z1 = i2;
                }
            }
            Point point = hl.q;
            if (point.x <= point.y) {
                i2 = this.Y1;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o24Var4.getLayoutParams();
            layoutParams.height = i2;
            o24Var4.setLayoutParams(layoutParams);
            if (!hl.E && !hl.O1()) {
                h44 h44Var = this.C0;
                if (h44Var instanceof rlb) {
                    hl.t1(((rlb) h44Var).getEditText());
                }
            }
            this.X1 = i2;
            requestLayout();
            rx5 rx5Var = ((hc8) this).d2.L1;
            if (rx5Var != null) {
                rx5Var.a();
            }
            iz1 emojiButton = nv7Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(gz1.d, true);
            }
            getHeight();
            if (!z && !this.V1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X1, 0.0f);
                ofFloat.addUpdateListener(new cy5(this, (byte) 1));
                ofFloat.addListener(new oy5(this, (byte) 0));
                ofFloat.start();
                return;
            }
            return;
        }
        iz1 emojiButton2 = nv7Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(gz1.e, true);
        }
        o24 o24Var5 = this.T1;
        if (o24Var5 != null) {
            this.U1 = false;
            if (hl.D || hl.E) {
                o24Var5.setVisibility(8);
            }
        }
        if (i == 0) {
            this.X1 = 0;
        }
        rx5 rx5Var2 = ((hc8) this).d2.L1;
        if (rx5Var2 != null) {
            rx5Var2.a();
        }
        requestLayout();
        getHeight();
    }

    @Override
    public final void C() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g() {
    }

    public FrameLayout getCaptionsBulletinContainer() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override
    public final void x() {
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void d(boolean z) {
    }

    @Override
    public final void e(boolean z) {
    }

    @Override
    public final void j(boolean z) {
    }
}
