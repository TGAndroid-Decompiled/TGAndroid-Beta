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
public abstract class rw5 extends dja implements js7, j34, fs7, bja, gk7 {
    public float A0;
    public final mcb A1;
    public float B0;
    public boolean B1;
    public float C0;
    public yla C1;
    public float D0;
    public float D1;
    public float E0;
    public final Paint E1;
    public boolean F0;
    public final int F1;
    public float G0;
    public final tv5 G1;
    public via H0;
    public m8 H1;
    public l34 I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout I1;
    public boolean J0;
    public Rect J1;
    public int K0;
    public Runnable K1;
    public final boolean L0;
    public final k38 L1;
    public final lw5 M0;
    public boolean M1;
    public final sb N0;
    public float N1;
    public final a6 O0;
    public boolean O1;
    public final mw5 P0;
    public final yb1 P1;
    public ijb Q0;
    public gw5 Q1;
    public final FrameLayout R0;
    public final s34 R1;
    public final ow5 S0;
    public boolean S1;
    public final yc T0;
    public final lm T1;
    public final FrameLayout U0;
    public final Paint U1;
    public f7 V0;
    public final Paint V1;
    public int W0;
    public il0 W1;
    public int X0;
    public final float[] X1;
    public float Y0;
    public final int[] Y1;
    public ValueAnimator Z0;
    public t14 Z1;
    public boolean a1;
    public boolean a2;
    public final zt7 b1;
    public boolean b2;
    public final pj4 c1;
    public boolean c2;
    public ArrayList d1;
    public int d2;
    public final int e1;
    public int e2;
    public BigInteger f1;
    public int f2;
    public TextView g1;
    public int g2;
    public TextView h1;
    public boolean h2;
    public TextView i1;
    public final ks7 j1;
    public final hs7 k1;
    public final ss7 l1;
    public final ImageView m1;
    public final LinearLayout n1;
    public final TextView o1;
    public final TextView p1;
    public final xr7 q0;
    public final TextView q1;
    public final cs7 r0;
    public final Paint r1;
    public float s0;
    public final Paint s1;
    public final Bitmap t0;
    public float t1;
    public final Bitmap u0;
    public boolean u1;
    public final b5c v0;
    public yla v1;
    public final do3 w0;
    public final nw5 w1;
    public final zl6 x0;
    public final Paint x1;
    public float y0;
    public final Paint y1;
    public float z0;
    public final Paint z1;

    public rw5(Context context, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, zl6 zl6Var, l68 l68Var, final wjb wjbVar) {
        super(context, activity);
        byte b;
        yb1 yb1Var;
        boolean z;
        float f;
        int i3;
        su3[] su3VarArr;
        cc1 cc1Var;
        boolean z2 = false;
        this.W0 = 0;
        this.X0 = -1;
        final q88 q88Var = (q88) this;
        this.c1 = new pj4(q88Var, (byte) 9);
        this.r1 = new Paint(1);
        this.s1 = new Paint(1);
        this.x1 = new Paint(1);
        this.y1 = new Paint(1);
        this.z1 = new Paint(1);
        mcb mcbVar = new mcb(1.0f, 0.016773745f, -1);
        this.A1 = mcbVar;
        this.E1 = new Paint(1);
        s34 s34Var = new s34(q88Var, (byte) 10);
        this.R1 = s34Var;
        this.S1 = false;
        this.T1 = new lm(350L, (View) this, s33.h);
        this.U1 = new Paint(1);
        Paint paint = new Paint(1);
        this.V1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.X1 = new float[2];
        this.Y1 = new int[2];
        new ez3(q88Var, (byte) 18);
        setDelegate(this);
        this.F1 = i;
        File captionsVideoFile = getCaptionsVideoFile();
        if (captionsVideoFile != null && captionsVideoFile.exists() && DictationAsr.C(i)) {
            b = 2;
            yb1Var = new yb1(captionsVideoFile, s34Var);
        } else {
            b = 2;
            yb1Var = null;
        }
        this.P1 = yb1Var;
        if (yb1Var != null) {
            yb1Var.d = new tp5(q88Var, (byte) 6);
        }
        this.G1 = new wjb() {
            @Override
            public final boolean a() {
                return bkb.I.o();
            }

            @Override
            public final void b(float f2, float f3, int i4, int i5) {
                bkb.q(f2, f3, i4, i5);
            }

            @Override
            public final ColorFilter c() {
                return bkb.u3;
            }

            @Override
            public final Paint d(String str) {
                return bkb.T0(str);
            }

            @Override
            public final boolean e() {
                return gba.D0;
            }

            @Override
            public final int f(int i4) {
                return h(i4);
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
            public final int h(int i4) {
                if (i4 == bkb.F8) {
                    return -14145495;
                }
                if (i4 != bkb.D8) {
                    if (i4 == bkb.g5) {
                        return -14737633;
                    }
                    if (i4 == bkb.i5) {
                        return -592138;
                    }
                    if (i4 == bkb.q5) {
                        return -8553091;
                    }
                    if (i4 != bkb.yf) {
                        if (i4 == bkb.Bf) {
                            return -1610612736;
                        }
                        if (i4 == bkb.Ef || i4 == bkb.If || i4 == bkb.Df) {
                            return -9539985;
                        }
                        if (i4 != bkb.F6) {
                            int i5 = bkb.Ci;
                            if (i4 == i5) {
                                return -11754001;
                            }
                            if (i4 == bkb.h6) {
                                return 536870911;
                            }
                            if (i4 != bkb.vi && i4 != bkb.ui && i4 != bkb.wi) {
                                if (i4 == bkb.xi) {
                                    return 352321535;
                                }
                                if (i4 != bkb.Af && i4 != i5) {
                                    if (i4 == bkb.zf) {
                                        return 780633991;
                                    }
                                    if (i4 == bkb.Z6) {
                                        return -15921907;
                                    }
                                    if (i4 == bkb.l7) {
                                        return -12500671;
                                    }
                                    if (i4 == bkb.k7) {
                                        return -13133079;
                                    }
                                    if (i4 == bkb.m7) {
                                        return -1;
                                    }
                                    if (i4 == bkb.c6) {
                                        return -15198183;
                                    }
                                    if (i4 == bkb.c7) {
                                        return -16777216;
                                    }
                                    wjb wjbVar2 = wjb.this;
                                    if (wjbVar2 != null) {
                                        return wjbVar2.h(i4);
                                    }
                                    return bkb.w0(null, i4, false);
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
            public final int j(int i4) {
                return h(i4);
            }

            @Override
            public final void i(int i4, int i5) {
            }
        };
        this.x0 = zl6Var;
        this.L0 = context instanceof BubbleActivity;
        k38 e = k38.e(i);
        this.L1 = e;
        e.i(0, true);
        mcbVar.a = e.c();
        mcbVar.c = e.i;
        do3 do3Var = new do3("Paint", true);
        this.w0 = do3Var;
        this.t0 = bitmap;
        this.u0 = bitmap2;
        this.e1 = i2;
        b5c b5cVar = new b5c();
        this.v0 = b5cVar;
        b5cVar.a = new ry4(q88Var, (byte) 14);
        lw5 lw5Var = new lw5(q88Var, context, new gu7(getPaintingSize(), bitmap2, i2, null), bitmap, bitmap2);
        this.M0 = lw5Var;
        lw5Var.setDelegate(new wk4(q88Var, l68Var, false, (byte) 6));
        lw5Var.setUndoStore(b5cVar);
        lw5Var.setQueue(do3Var);
        lw5Var.setVisibility(4);
        addView(lw5Var, nme.e(-1, -1, 51));
        sb sbVar = new sb((byte) 18, context, q88Var);
        this.N0 = sbVar;
        sbVar.setVisibility(4);
        addView(sbVar, nme.e(-1, -1, 51));
        mw5 mw5Var = new mw5(q88Var, context, new gi3(q88Var));
        this.P0 = mw5Var;
        addView(mw5Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i4 = 0;
            cc1 cc1Var2 = null;
            while (i4 < size) {
                mac macVar = (mac) arrayList.get(i4);
                byte b2 = macVar.a;
                if (b2 == 0) {
                    ?? e0 = e0(macVar.C, macVar.B, z2);
                    if ((macVar.b & 2) != 0) {
                        e0.r(z2);
                    }
                    ViewGroup.LayoutParams layoutParams = e0.getLayoutParams();
                    f = 2.0f;
                    layoutParams.width = macVar.q;
                    layoutParams.height = macVar.r;
                    i3 = size;
                    cc1Var = e0;
                } else {
                    f = 2.0f;
                    if (b2 == 11) {
                        if (cc1Var2 != null) {
                            cc1Var2.u(macVar.V, macVar.W, macVar.j, macVar.X);
                            i3 = size;
                            i4++;
                            size = i3;
                            z2 = false;
                            b = 2;
                        } else {
                            cc1 c0 = c0();
                            c0.setType(macVar.b);
                            c0.setTypeface(macVar.n);
                            c0.setBaseFontSize(macVar.m);
                            w0(c0, macVar.p);
                            mcb swatch = c0.getSwatch();
                            swatch.a = macVar.l;
                            c0.setSwatch(swatch);
                            c0.u(macVar.V, macVar.W, macVar.j, macVar.X);
                            i3 = size;
                            cc1 cc1Var3 = c0;
                            cc1Var2 = cc1Var3;
                            cc1Var = cc1Var3;
                        }
                    } else if (b2 == 1) {
                        ?? f0 = f0(z2);
                        f0.setType(macVar.b);
                        f0.setTypeface(macVar.n);
                        f0.setBaseFontSize(macVar.m);
                        SpannableString spannableString = new SpannableString(macVar.j);
                        ArrayList arrayList2 = macVar.k;
                        int size2 = arrayList2.size();
                        ArrayList arrayList3 = arrayList2;
                        for (int i5 = z2; i5 < size2; i5++) {
                            lac lacVar = (lac) arrayList3.get(i5);
                            ArrayList arrayList4 = arrayList3;
                            gm gmVar = new gm(lacVar.document_id, f0.getFontMetricsInt());
                            int i6 = lacVar.offset;
                            spannableString.setSpan(gmVar, i6, lacVar.length + i6, 33);
                            size = size;
                            arrayList3 = arrayList4;
                        }
                        i3 = size;
                        CharSequence m = vu3.m(spannableString, f0.getFontMetricsInt(), false, null, 0);
                        if ((m instanceof Spanned) && (su3VarArr = (su3[]) ((Spanned) m).getSpans(0, m.length(), su3.class)) != null) {
                            for (su3 su3Var : su3VarArr) {
                                su3Var.b = 0.85f;
                            }
                        }
                        f0.setText(m);
                        w0(f0, macVar.p);
                        mcb swatch2 = f0.getSwatch();
                        swatch2.a = macVar.l;
                        f0.setSwatch(swatch2);
                        cc1Var = f0;
                    } else {
                        i3 = size;
                        byte b3 = b;
                        if (b2 == b3) {
                            ?? d0 = d0(macVar.j, false);
                            d0.D0 = false;
                            if ((macVar.b & b3) != 0) {
                                d0.r(false);
                            }
                            if ((macVar.b & 16) != 0) {
                                d0.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = d0.getLayoutParams();
                            layoutParams2.width = macVar.q;
                            layoutParams2.height = macVar.r;
                            cc1Var = d0;
                        } else {
                            i4++;
                            size = i3;
                            z2 = false;
                            b = 2;
                        }
                    }
                }
                cc1Var.setX((macVar.c * this.H0.a) - (((1.0f - macVar.v) * macVar.q) / f));
                cc1Var.setY((macVar.d * this.H0.b) - (((1.0f - macVar.v) * macVar.r) / f));
                cc1Var.setPosition(new PointF((macVar.q / f) + cc1Var.getX(), (macVar.r / f) + cc1Var.getY()));
                cc1Var.setScale(macVar.v);
                cc1Var.setRotation((float) (((-macVar.e) / 3.141592653589793d) * 180.0d));
                i4++;
                size = i3;
                z2 = false;
                b = 2;
            }
        }
        this.P0.setVisibility(4);
        a6 a6Var = new a6(context, (byte) 17);
        this.O0 = a6Var;
        addView(a6Var);
        ?? frameLayout = new FrameLayout(context);
        this.R0 = frameLayout;
        frameLayout.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, nme.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.m1 = imageView;
        imageView.setImageResource(2131232536);
        imageView.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
        imageView.setBackground(bkb.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b4 = r2;
                q88 q88Var2 = q88Var;
                switch (b4) {
                    case 0:
                        lw5 lw5Var2 = q88Var2.M0;
                        if (lw5Var2 != null && (lw5Var2.getCurrentBrush() instanceof l01)) {
                            lw5Var2.b();
                            q88Var2.j1.setSelectedIndex(1);
                            q88Var2.s((m01) m01.a.get(0));
                            return;
                        }
                        q88Var2.v0.c();
                        return;
                    case 1:
                        lw5 lw5Var3 = q88Var2.M0;
                        b5c b5cVar2 = q88Var2.v0;
                        if (b5cVar2.a()) {
                            if (lw5Var3 != null && (lw5Var3.getCurrentBrush() instanceof l01)) {
                                lw5Var3.b();
                                q88Var2.j1.setSelectedIndex(1);
                                q88Var2.s((m01) m01.a.get(0));
                            }
                            lw5Var3.a();
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            q88Var2.P0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        l34 l34Var = q88Var2.I0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (q88Var2.a2) {
                            q88Var2.i0(false);
                        }
                        q88Var2.s0(q88Var2.I0);
                        q88Var2.t0(null, true);
                        return;
                    default:
                        q88Var2.t0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, nme.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n1 = linearLayout;
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
        linearLayout.setOnClickListener(new x00((byte) 8));
        frameLayout.addView(linearLayout, nme.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.o1 = textView2;
        textView2.setBackground(bkb.f0(822083583, 7, -1));
        textView2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        textView2.setText(k96.M0(2131747086, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(gl.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b4 = r2;
                q88 q88Var2 = q88Var;
                switch (b4) {
                    case 0:
                        lw5 lw5Var2 = q88Var2.M0;
                        if (lw5Var2 != null && (lw5Var2.getCurrentBrush() instanceof l01)) {
                            lw5Var2.b();
                            q88Var2.j1.setSelectedIndex(1);
                            q88Var2.s((m01) m01.a.get(0));
                            return;
                        }
                        q88Var2.v0.c();
                        return;
                    case 1:
                        lw5 lw5Var3 = q88Var2.M0;
                        b5c b5cVar2 = q88Var2.v0;
                        if (b5cVar2.a()) {
                            if (lw5Var3 != null && (lw5Var3.getCurrentBrush() instanceof l01)) {
                                lw5Var3.b();
                                q88Var2.j1.setSelectedIndex(1);
                                q88Var2.s((m01) m01.a.get(0));
                            }
                            lw5Var3.a();
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            q88Var2.P0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        l34 l34Var = q88Var2.I0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (q88Var2.a2) {
                            q88Var2.i0(false);
                        }
                        q88Var2.s0(q88Var2.I0);
                        q88Var2.t0(null, true);
                        return;
                    default:
                        q88Var2.t0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l = ug8.l(frameLayout, textView2, nme.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.p1 = l;
        l.setBackground(bkb.f0(822083583, 7, -1));
        l.setText(k96.M0(2131752089, null));
        l.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        l.setGravity(16);
        l.setTextColor(-1);
        l.setTypeface(gl.o());
        l.setTextSize(1, 16.0f);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b4 = r2;
                q88 q88Var2 = q88Var;
                switch (b4) {
                    case 0:
                        lw5 lw5Var2 = q88Var2.M0;
                        if (lw5Var2 != null && (lw5Var2.getCurrentBrush() instanceof l01)) {
                            lw5Var2.b();
                            q88Var2.j1.setSelectedIndex(1);
                            q88Var2.s((m01) m01.a.get(0));
                            return;
                        }
                        q88Var2.v0.c();
                        return;
                    case 1:
                        lw5 lw5Var3 = q88Var2.M0;
                        b5c b5cVar2 = q88Var2.v0;
                        if (b5cVar2.a()) {
                            if (lw5Var3 != null && (lw5Var3.getCurrentBrush() instanceof l01)) {
                                lw5Var3.b();
                                q88Var2.j1.setSelectedIndex(1);
                                q88Var2.s((m01) m01.a.get(0));
                            }
                            lw5Var3.a();
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            q88Var2.P0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        l34 l34Var = q88Var2.I0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (q88Var2.a2) {
                            q88Var2.i0(false);
                        }
                        q88Var2.s0(q88Var2.I0);
                        q88Var2.t0(null, true);
                        return;
                    default:
                        q88Var2.t0(null, true);
                        return;
                }
            }
        });
        l.setAlpha(0.0f);
        l.setVisibility(8);
        TextView l2 = ug8.l(frameLayout, l, nme.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.q1 = l2;
        l2.setBackground(bkb.f0(822083583, 7, -1));
        l2.setText(k96.M0(2131751342, null));
        l2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        l2.setGravity(16);
        l2.setTextColor(-1);
        l2.setTypeface(gl.o());
        l2.setTextSize(1, 16.0f);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b4 = r2;
                q88 q88Var2 = q88Var;
                switch (b4) {
                    case 0:
                        lw5 lw5Var2 = q88Var2.M0;
                        if (lw5Var2 != null && (lw5Var2.getCurrentBrush() instanceof l01)) {
                            lw5Var2.b();
                            q88Var2.j1.setSelectedIndex(1);
                            q88Var2.s((m01) m01.a.get(0));
                            return;
                        }
                        q88Var2.v0.c();
                        return;
                    case 1:
                        lw5 lw5Var3 = q88Var2.M0;
                        b5c b5cVar2 = q88Var2.v0;
                        if (b5cVar2.a()) {
                            if (lw5Var3 != null && (lw5Var3.getCurrentBrush() instanceof l01)) {
                                lw5Var3.b();
                                q88Var2.j1.setSelectedIndex(1);
                                q88Var2.s((m01) m01.a.get(0));
                            }
                            lw5Var3.a();
                            b5cVar2.c.clear();
                            b5cVar2.b.clear();
                            gl.d3(new cib(b5cVar2, (byte) 20));
                            q88Var2.P0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        l34 l34Var = q88Var2.I0;
                        if (l34Var instanceof vhb) {
                            gl.t1(((vhb) l34Var).getFocusedView());
                        }
                        if (q88Var2.a2) {
                            q88Var2.i0(false);
                        }
                        q88Var2.s0(q88Var2.I0);
                        q88Var2.t0(null, true);
                        return;
                    default:
                        q88Var2.t0(null, true);
                        return;
                }
            }
        });
        l2.setAlpha(0.0f);
        l2.setVisibility(8);
        frameLayout.addView(l2, nme.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ow5 ow5Var = new ow5(q88Var, context);
        this.S0 = ow5Var;
        ow5Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), 0);
        ow5Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(ow5Var, nme.e(-1, 104, 80));
        if (bitmap2 != null) {
            z = true;
        } else {
            z = false;
        }
        ks7 ks7Var = new ks7(context, z);
        this.j1 = ks7Var;
        ks7Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        ks7Var.setDelegate(this);
        ks7Var.setSelectedIndex(1);
        ow5Var.addView(ks7Var, nme.c(48.0f, -1));
        hs7 hs7Var = new hs7(context);
        this.k1 = hs7Var;
        hs7Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        hs7Var.setVisibility(8);
        hs7Var.setDelegate(this);
        hs7Var.setAlignment(k38.e(i).g);
        ow5Var.addView(hs7Var, nme.c(48.0f, -1));
        yc ycVar = new yc(q88Var, context);
        this.T0 = ycVar;
        addView(ycVar, nme.c(-1.0f, -1));
        ss7 ss7Var = new ss7(context);
        this.l1 = ss7Var;
        ss7Var.setVisibility(8);
        ss7Var.setOnItemClickListener(new bf4(q88Var, (byte) 7));
        hs7Var.setTypefaceListView(ss7Var);
        ycVar.addView(ss7Var, nme.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.r1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.r1.setColor(1728053247);
        this.r1.setStrokeWidth(Math.max(2, gl.L(1.0f)));
        this.s1.setColor(bkb.v0(bkb.F8, this.G1));
        nw5 nw5Var = new nw5(q88Var, context);
        this.w1 = nw5Var;
        nw5Var.setVisibility(8);
        nw5Var.setColorPalette(k38.e(i));
        nw5Var.setColorListener(new vv5(q88Var, (byte) 0));
        ow5Var.addView(nw5Var, nme.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        xr7 xr7Var = new xr7(context);
        this.q0 = xr7Var;
        xr7Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        xr7Var.setBackground(bkb.f0(1090519039, 1, -1));
        ow5Var.addView(xr7Var, nme.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        cs7 cs7Var = new cs7(context);
        this.r0 = cs7Var;
        cs7Var.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        cs7Var.setBackground(bkb.f0(1090519039, 1, -1));
        cs7Var.setOnClickListener(new hu4(q88Var, context, bitmap2, (byte) 4));
        ow5Var.addView(cs7Var, nme.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        zt7 zt7Var = new zt7(context);
        this.b1 = zt7Var;
        zt7Var.setColorSwatch(this.A1);
        zt7Var.setRenderView(this.M0);
        zt7Var.setValueOverride(this.c1);
        this.A1.c = this.c1.get();
        zt7Var.setOnUpdate(new sm3(q88Var, i, (byte) 15));
        addView(zt7Var, nme.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U0 = frameLayout2;
        addView(frameLayout2, nme.c(-1.0f, -1));
        this.z1.setStyle(style);
        this.z1.setStrokeWidth(gl.L(2.0f));
        u0(this.A1, null);
        s((m01) m01.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = gl.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), gl.L(100.0f), (int) (point.y * 0.65d))));
        }
    }

    public ViewGroup getBarView() {
        if (this.W0 == 2) {
            return this.k1;
        }
        return this.j1;
    }

    private int getFrameRotation() {
        int i = this.e1;
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
        int i;
        via viaVar = this.H0;
        if (viaVar != null) {
            return viaVar;
        }
        Bitmap bitmap = this.t0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o = gba.o();
        if (o != 0) {
            if (o != 2) {
                i = 2560;
            } else {
                i = 3840;
            }
        } else {
            i = 1280;
        }
        via viaVar2 = new via(width, height);
        float f = i;
        viaVar2.a = f;
        float floor = (float) Math.floor((f * height) / width);
        viaVar2.b = floor;
        if (floor > f) {
            viaVar2.b = f;
            viaVar2.a = (float) Math.floor((f * width) / height);
        }
        this.H0 = viaVar2;
        return viaVar2;
    }

    public void setNewColor(int i) {
        mcb mcbVar = this.A1;
        int i2 = mcbVar.a;
        mcbVar.a = i;
        u0(mcbVar, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new bn(this, i2, i, (byte) 2));
        duration.start();
    }

    private void setTextType(int i) {
        this.K0 = i;
        l34 l34Var = this.I0;
        if (l34Var instanceof vhb) {
            ((vhb) l34Var).setType(i);
        }
        k38 e = k38.e(this.F1);
        e.h = i;
        e.a.edit().putInt("text_type", i).apply();
        this.k1.setOutlineType(i);
    }

    public void setTextWeightRange(l34 l34Var) {
        boolean z = l34Var instanceof cc1;
        zt7 zt7Var = this.b1;
        if (z) {
            zt7Var.b(0.3f, 1.1f);
        } else {
            zt7Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        f7 f7Var = new f7(this, context);
        this.V0 = f7Var;
        f7Var.setClipToPadding(false);
        this.V0.setOrientation(0);
        this.S0.addView(this.V0, nme.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.g1 = textView;
        textView.setText(k96.M0(2131747084, null).toUpperCase());
        TextView textView2 = this.g1;
        int i = bkb.h6;
        tv5 tv5Var = this.G1;
        zkb.R(textView2, bkb.f0(bkb.v0(i, tv5Var), 7, -1), null, zkb.M(i), tv5Var);
        this.g1.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        this.g1.setTextColor(-1);
        this.g1.setTextSize(1, 14.0f);
        this.g1.setGravity(1);
        this.g1.setTypeface(gl.o());
        this.g1.setSingleLine();
        this.g1.setOnClickListener(new sv5(this, (byte) 0));
        this.V0.addView(this.g1, nme.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.h1 = textView3;
        textView3.setText(k96.M0(2131747083, null).toUpperCase());
        zkb.R(this.h1, bkb.f0(bkb.v0(i, tv5Var), 7, -1), null, zkb.M(i), tv5Var);
        this.h1.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        this.h1.setOnClickListener(new sv5(this, (byte) 1));
        this.h1.setTextColor(-1);
        this.h1.setTextSize(1, 14.0f);
        this.h1.setGravity(1);
        this.h1.setTypeface(gl.o());
        this.h1.setAlpha(0.6f);
        this.h1.setSingleLine();
        this.V0.addView(this.h1, nme.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.i1 = textView4;
        textView4.setText(k96.M0(2131747082, null).toUpperCase());
        zkb.R(this.i1, bkb.f0(bkb.v0(i, tv5Var), 7, -1), null, zkb.M(i), tv5Var);
        this.i1.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        this.i1.setTextColor(-1);
        this.i1.setTextSize(1, 14.0f);
        this.i1.setGravity(1);
        this.i1.setTypeface(gl.o());
        this.i1.setAlpha(0.6f);
        this.i1.setSingleLine();
        this.i1.setOnClickListener(new sv5(this, (byte) 4));
        this.V0.addView(this.i1, nme.l(1.0f, 0, -2));
    }

    public static void w0(vhb vhbVar, int i) {
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

    @Override
    public final void A(l34 l34Var) {
        int[] h0 = h0(l34Var);
        A0(new dw5(this, l34Var, (byte) 2), this, 51, h0[0], h0[1] - gl.L(32.0f));
    }

    public final void A0(Runnable runnable, rw5 rw5Var, int i, int i2, int i3) {
        m8 m8Var = this.H1;
        if (m8Var != null && m8Var.isShowing()) {
            this.H1.d(true);
            return;
        }
        if (this.I1 == null) {
            this.J1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.G1);
            this.I1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.I1.setBackgroundColor(-14145495);
            this.I1.setOnTouchListener(new a7(this, (byte) 8));
            this.I1.setDispatchKeyEventListener(new zv5(this));
            this.I1.setShownFromBottom(true);
        }
        this.I1.d();
        runnable.run();
        if (this.H1 == null) {
            m8 m8Var2 = new m8(this.I1, -2, -2);
            this.H1 = m8Var2;
            m8Var2.b = true;
            m8Var2.setAnimationStyle(2131755191);
            this.H1.setOutsideTouchable(true);
            this.H1.setClippingEnabled(true);
            this.H1.setInputMethodMode(2);
            this.H1.setSoftInputMode(0);
            this.H1.getContentView().setFocusableInTouchMode(true);
            this.H1.setOnDismissListener(new x6(this, (byte) 5));
        }
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE));
        this.H1.setFocusable(true);
        this.H1.showAtLocation(rw5Var, i, i2 - (this.I1.getMeasuredWidth() / 2), i3 - this.I1.getMeasuredHeight());
        m8.i(this.I1);
    }

    public final void B0(boolean z) {
        float f;
        if (this.u1 != z) {
            this.u1 = z;
            yla ylaVar = this.v1;
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
            this.v1 = ylaVar2;
            zla zlaVar = new zla();
            if (!z) {
                f2 = 0.0f;
            }
            zlaVar.i = f2;
            zlaVar.b(1250.0f);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            if (z) {
                ss7 ss7Var = this.l1;
                ss7Var.setAlpha(0.0f);
                ss7Var.setVisibility(0);
            }
            this.v1.b(new h10(this, (byte) 6));
            this.v1.a(new aw5(this, z, (byte) 0));
            this.v1.h();
        }
    }

    public final void C0() {
        yb1 yb1Var = this.P1;
        if (yb1Var != null) {
            yb1Var.b.c();
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
        }
        this.M0.h();
        this.P0.setVisibility(8);
        this.O0.setVisibility(8);
        this.w0.postRunnable(new ql3((byte) 18));
    }

    @Override
    public final void D() {
        B0(true);
    }

    public final PointF D0(l34 l34Var) {
        float f = 200.0f;
        zl6 zl6Var = this.x0;
        if (zl6Var != null) {
            f = 200.0f / zl6Var.c;
        }
        if (l34Var != null) {
            PointF position = l34Var.getPosition();
            return new PointF(position.x + f, position.y + f);
        }
        float f2 = 100.0f;
        if (zl6Var != null) {
            f2 = 100.0f / zl6Var.c;
        }
        PointF b0 = b0();
        while (true) {
            int i = 0;
            boolean z = false;
            while (true) {
                mw5 mw5Var = this.P0;
                if (i >= mw5Var.getChildCount()) {
                    break;
                }
                View childAt = mw5Var.getChildAt(i);
                if (childAt instanceof l34) {
                    PointF position2 = ((l34) childAt).getPosition();
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
        if (this.W0 != i && this.X0 != i) {
            ValueAnimator valueAnimator = this.Z0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i2 = this.W0;
            ViewGroup viewGroup3 = this.k1;
            ViewGroup viewGroup4 = this.j1;
            if (i2 == 0) {
                viewGroup = viewGroup4;
            } else if (i2 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.X0 = i;
            if (i == 0) {
                viewGroup2 = viewGroup4;
            } else if (i == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i3 = this.F1;
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
            mcb mcbVar = this.A1;
            mcbVar.a = c;
            if (i == 2) {
                z2 = false;
            }
            this.O1 = z2;
            u0(mcbVar, null);
            this.O1 = false;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.Z0 = duration;
            duration.setInterpolator(s33.f);
            this.Z0.addUpdateListener(new nk(this, viewGroup, viewGroup2, (byte) 2));
            this.Z0.addListener(new qp1(this, viewGroup, viewGroup2, i, (byte) 3));
            this.Z0.start();
        }
    }

    public final void F0() {
        int i = 0;
        while (true) {
            mw5 mw5Var = this.P0;
            if (i < mw5Var.getChildCount()) {
                View childAt = mw5Var.getChildAt(i);
                if (childAt != this.I0) {
                    if (childAt instanceof l34) {
                        l34 l34Var = (l34) childAt;
                        if (!l34Var.n0 && l34Var.l0 <= 0.0f) {
                        }
                    }
                    i++;
                }
                ((l34) childAt).m();
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
        if (i > gl.L(50.0f) && this.b2 && !gl.E && !gl.O1()) {
            if (z) {
                this.f2 = i;
                na7.b1().edit().putInt("kbd_height_land3", this.f2).commit();
            } else {
                this.e2 = i;
                na7.b1().edit().putInt("kbd_height", this.e2).commit();
            }
        }
        if (this.a2) {
            if (z) {
                i2 = this.f2;
            } else {
                i2 = this.e2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Z1.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = gl.q.x;
            if (i3 != i4 || layoutParams.height != i2) {
                layoutParams.width = i4;
                layoutParams.height = i2;
                this.Z1.setLayoutParams(layoutParams);
                this.d2 = layoutParams.height;
                requestLayout();
                mv5 mv5Var = ((q88) this).j2.L1;
                if (mv5Var != null) {
                    mv5Var.a();
                }
                getHeight();
            }
        }
        if (this.g2 == i && this.h2 == z) {
            getHeight();
            return;
        }
        this.g2 = i;
        this.h2 = z;
        boolean z4 = this.b2;
        l34 l34Var = this.I0;
        if (l34Var instanceof vhb) {
            if (((vhb) l34Var).getEditText().isFocused() && i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.b2 = z2;
        } else {
            this.b2 = false;
            z2 = false;
        }
        if (z2 && this.a2) {
            z0(0);
        }
        if (this.d2 != 0 && !(z3 = this.b2) && z3 != z4 && !this.a2) {
            this.d2 = 0;
            requestLayout();
            mv5 mv5Var2 = ((q88) this).j2.L1;
            if (mv5Var2 != null) {
                mv5Var2.a();
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
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new dw5(this, (l34) view, (byte) 1)).start();
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
        hashSet.add(Integer.valueOf(bkb.l7));
        hashSet.add(Integer.valueOf(bkb.k7));
        hashSet.add(Integer.valueOf(bkb.m7));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.c7));
    }

    @Override
    public final void b() {
        setTextType((this.K0 + 1) % 4);
    }

    public final PointF b0() {
        zl6 zl6Var;
        via paintingSize = getPaintingSize();
        float f = paintingSize.a / 2.0f;
        float f2 = paintingSize.b / 2.0f;
        if (this.x0 != null) {
            double radians = (float) Math.toRadians(-(zl6Var.k + zl6Var.d));
            float cos = (float) ((Math.cos(radians) * zl6Var.a) - (Math.sin(radians) * zl6Var.b));
            float d = (float) ug8.d(radians, zl6Var.b, Math.sin(radians) * zl6Var.a);
            f -= cos * paintingSize.a;
            f2 -= d * paintingSize.b;
        }
        return new PointF(f, f2);
    }

    @Override
    public final void c(int i) {
        l34 l34Var = this.I0;
        if (l34Var instanceof vhb) {
            w0((vhb) l34Var, i);
            k38 e = k38.e(this.F1);
            e.g = i;
            e.a.edit().putInt("text_alignment", i).apply();
        }
    }

    public final cc1 c0() {
        ((q88) this).j2.h0.isFocusable();
        via paintingSize = getPaintingSize();
        PointF b0 = b0();
        b0.y *= 1.5f;
        cc1 cc1Var = new cc1(getContext(), b0, (int) ((paintingSize.a / 9.0f) * 0.5f), new mcb(1.0f, this.A1.c, -1));
        float f = paintingSize.a / 9.0f;
        wv5 wv5Var = new wv5(this, (byte) 2);
        cc1Var.y0 = (int) (0.5f * f);
        cc1Var.z0 = (int) (f * 2.0f);
        cc1Var.A0 = wv5Var;
        cc1Var.B0 = true;
        cc1Var.setStickyX(2);
        cc1Var.setDelegate(this);
        cc1Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        cc1Var.setTypeface(k38.e(this.F1).j);
        cc1Var.setType(3);
        yb1 yb1Var = this.P1;
        if (yb1Var != null) {
            yb1Var.b(cc1Var);
        } else {
            final s34 s34Var = this.R1;
            Objects.requireNonNull(s34Var);
            cc1Var.setPositionProvider(new ry4(s34Var, (byte) 16));
            cc1Var.setOnEditing(new p8c() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            s34Var.l(((Boolean) obj).booleanValue());
                            return;
                        default:
                            s34Var.O(((Long) obj).longValue());
                            return;
                    }
                }
            });
            cc1Var.setOnSeek(new p8c() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            s34Var.l(((Boolean) obj).booleanValue());
                            return;
                        default:
                            s34Var.O(((Long) obj).longValue());
                            return;
                    }
                }
            });
        }
        this.P0.addView(cc1Var, nme.c(-2.0f, -2));
        w0(cc1Var, 1);
        zl6 zl6Var = this.x0;
        if (zl6Var != null) {
            cc1Var.j(1.0f / zl6Var.c);
            cc1Var.f(-(zl6Var.k + zl6Var.d));
        }
        return cc1Var;
    }

    public final e68 d0(String str, boolean z) {
        float f;
        via viaVar;
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
        mw5 mw5Var = this.P0;
        if (i > 0) {
            float floor = (float) Math.floor(mw5Var.getMeasuredWidth() * 0.5d);
            viaVar = new via(floor, floor / f);
        } else {
            float floor2 = (float) Math.floor(mw5Var.getMeasuredHeight() * 0.5d);
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
        mw5Var.addView(e68Var);
        if (z) {
            r0(e68Var);
            t0(e68Var, true);
        }
        return e68Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        mw5 mw5Var;
        vhb vhbVar;
        String str;
        if (i == kk7.E5 && (mw5Var = this.P0) != null) {
            for (int i3 = 0; i3 < mw5Var.getChildCount(); i3++) {
                View childAt = mw5Var.getChildAt(i3);
                if ((childAt instanceof vhb) && (str = (vhbVar = (vhb) childAt).C0) != null) {
                    vhbVar.setTypeface(str);
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
        zl6 zl6Var;
        a6 a6Var;
        int i = 0;
        mw5 mw5Var = this.P0;
        if (view == mw5Var) {
            float d = this.T1.d(this.M1);
            if (d > 0.0f) {
                int p1 = bkb.p1(d, 1090519039);
                Paint paint = this.U1;
                paint.setShadowLayer(gl.L(24.0f * d), 0.0f, 0.0f, p1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(mw5Var.getX(), mw5Var.getY());
                canvas.scale(mw5Var.getScaleX(), mw5Var.getScaleY(), mw5Var.getWidth() / 2.0f, mw5Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, mw5Var.getWidth(), mw5Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, mw5Var.getWidth(), mw5Var.getHeight(), this.V1);
                canvas.restore();
            }
        }
        if ((view == this.M0 || view == this.N0 || ((view == mw5Var && mw5Var.getClipChildren()) || (view == (a6Var = this.O0) && a6Var.getClipChildren()))) && (zl6Var = this.x0) != null) {
            canvas.save();
            if (!this.L0) {
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
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.B0;
            float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.d2) - currentActionBarHeight) - gl.L(48.0f))) - scaleY) / 2.0f) + gl.L(8.0f) + i + this.C0;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final defpackage.iw5 e0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw5.e0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):iw5");
    }

    public final vhb f0(boolean z) {
        ((q88) this).j2.h0.isFocusable();
        via paintingSize = getPaintingSize();
        PointF D0 = D0(null);
        vhb vhbVar = new vhb(getContext(), D0, (int) (paintingSize.a / 9.0f), "", this.A1, this.K0);
        float f = paintingSize.a / 9.0f;
        wv5 wv5Var = new wv5(this, (byte) 3);
        vhbVar.y0 = (int) (0.5f * f);
        vhbVar.z0 = (int) (f * 2.0f);
        vhbVar.A0 = wv5Var;
        float f2 = D0.x;
        mw5 mw5Var = this.P0;
        if (f2 == mw5Var.getMeasuredWidth() / 2.0f) {
            vhbVar.setStickyX(2);
        }
        if (D0.y == mw5Var.getMeasuredHeight() / 2.0f) {
            vhbVar.setStickyY(2);
        }
        vhbVar.setDelegate(this);
        vhbVar.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i = this.F1;
        vhbVar.setTypeface(k38.e(i).j);
        vhbVar.setType(k38.e(i).h);
        mw5Var.addView(vhbVar, nme.c(-2.0f, -2));
        zl6 zl6Var = this.x0;
        if (zl6Var != null) {
            vhbVar.j(1.0f / zl6Var.c);
            vhbVar.f(-(zl6Var.k + zl6Var.d));
        }
        if (z) {
            r0(vhbVar);
            vhbVar.q();
            t0(vhbVar, false);
            vhbVar.getFocusedView().requestFocus();
            gl.F3(vhbVar.getFocusedView());
            this.J0 = true;
            int i2 = k38.e(i).g;
            hs7 hs7Var = this.k1;
            hs7Var.d(i2, true);
            hs7Var.setOutlineType(k38.e(i).h);
        }
        return vhbVar;
    }

    public final void g0() {
        l34 l34Var = this.I0;
        if ((l34Var instanceof vhb) && !this.J0) {
            vhb vhbVar = (vhb) l34Var;
            if (vhbVar instanceof cc1) {
                cc1 cc1Var = (cc1) vhbVar;
                cc1Var.z();
                if (cc1Var.E0 == null) {
                    return;
                }
            }
            this.J0 = true;
            vhbVar.q();
            View focusedView = vhbVar.getFocusedView();
            focusedView.requestFocus();
            gl.F3(focusedView);
        }
    }

    public int getAdditionalBottom() {
        return gl.L(24.0f);
    }

    public int getAdditionalTop() {
        return gl.L(48.0f);
    }

    public View getCancelView() {
        return this.q0;
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
        zl6 zl6Var = this.x0;
        if (zl6Var != null) {
            return zl6Var.d + zl6Var.k;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.r0;
    }

    public long getLcm() {
        return this.f1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        gm[] gmVarArr;
        mw5 mw5Var = this.P0;
        int childCount = mw5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = mw5Var.getChildAt(i);
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
                                document = vl.e(this.F1, gmVar.getDocumentId());
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
        return this.s0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public c79 getRenderView() {
        return this.M0;
    }

    public float getSelectedEntityBottom() {
        l34 l34Var = this.I0;
        mw5 mw5Var = this.P0;
        if (l34Var == null) {
            return getY() + mw5Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        l34Var.getLocationInWindow(iArr);
        return (mw5Var.getScaleY() * this.I0.getHeight()) + iArr[1];
    }

    public ijb getThanosEffect() {
        if (!ijb.c()) {
            return null;
        }
        if (this.Q0 == null) {
            ijb ijbVar = new ijb(getContext(), new wv5(this, (byte) 0));
            this.Q0 = ijbVar;
            addView(ijbVar);
        }
        return this.Q0;
    }

    public final boolean h(MotionEvent motionEvent) {
        if (this.I0 != null) {
            t0(null, true);
        }
        float x = motionEvent.getX();
        lw5 lw5Var = this.M0;
        float translationX = ((x - lw5Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / lw5Var.getScaleX();
        float y = ((((motionEvent.getY() - lw5Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + gl.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / lw5Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-lw5Var.getRotation());
        double d2 = y;
        float measuredWidth = (lw5Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (lw5Var.getMeasuredHeight() / 2.0f) + ((float) ug8.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        lw5Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int[] h0(l34 l34Var) {
        float[] fArr = this.X1;
        fArr[0] = l34Var.getWidth() / 2.0f;
        fArr[1] = l34Var.getHeight() / 2.0f;
        l34Var.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + l34Var.getLeft();
        fArr[1] = fArr[1] + l34Var.getTop();
        ViewParent parent = l34Var.getParent();
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
        int[] iArr = this.Y1;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = gl.q;
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.P0.getRotation());
        double d2 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        iArr[1] = (point.y / 2) + ((int) ug8.d(radians, d2, Math.sin(radians) * d));
        return iArr;
    }

    @Override
    public final boolean i(l34 l34Var) {
        return t0(l34Var, true);
    }

    public final void i0(boolean z) {
        if (this.a2) {
            z0(0);
        }
        if (z) {
            t14 t14Var = this.Z1;
            if (t14Var != null && t14Var.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Z1.getMeasuredHeight());
                ofFloat.addUpdateListener(new xv5(this, (byte) 0));
                this.c2 = true;
                ofFloat.addListener(new jw5(this, (byte) 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(gb.w);
                ofFloat.start();
                return;
            }
            j0();
        }
    }

    public final void j0() {
        t14 t14Var;
        mv5 mv5Var;
        if (this.d2 > 0 && (mv5Var = ((q88) this).j2.L1) != null) {
            mv5Var.a();
        }
        if (!this.a2 && (t14Var = this.Z1) != null && t14Var.getVisibility() != 8) {
            this.Z1.setVisibility(8);
        }
        this.d2 = 0;
    }

    public final void k0() {
        boolean z;
        boolean z2;
        Bitmap bitmap = this.u0;
        l13 l13Var = null;
        try {
            try {
                o74 o74Var = new o74(getContext());
                o74Var.g(1);
                o74Var.f(1);
                o74Var.b = false;
                p74 a = o74Var.a();
                if (!a.c.k()) {
                    if (w01.a) {
                        fa4.d("face detection is not operational");
                    }
                } else {
                    xl3 xl3Var = new xl3((byte) 4);
                    pc0 pc0Var = (pc0) xl3Var.b;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    xl3Var.d = bitmap;
                    pc0Var.a = width;
                    pc0Var.b = height;
                    pc0Var.c = getFrameRotation();
                    if (((ByteBuffer) xl3Var.c) == null && ((Bitmap) xl3Var.d) == null) {
                        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                    }
                    try {
                        SparseArray h = a.h(xl3Var);
                        ArrayList arrayList = new ArrayList();
                        via paintingSize = getPaintingSize();
                        for (int i = 0; i < h.size(); i++) {
                            n74 n74Var = (n74) h.get(h.keyAt(i));
                            int i2 = this.e1;
                            if (i2 % 360 != 90 && i2 % 360 != 270) {
                                z = false;
                            } else {
                                z = true;
                            }
                            a58 a58Var = new a58(n74Var, bitmap, paintingSize, z);
                            if (a58Var.d != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                arrayList.add(a58Var);
                            }
                        }
                        this.d1 = arrayList;
                    } catch (Throwable th) {
                        fa4.g(th, true);
                    }
                }
                a.d();
            } catch (Exception e) {
                fa4.g(e, true);
                if (0 != 0) {
                    l13Var.d();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                l13Var.d();
            }
            throw th2;
        }
    }

    public final void l0(Integer num) {
        int intValue = num.intValue();
        k38 k38Var = this.L1;
        k38Var.h(intValue, true);
        k38Var.g();
        setNewColor(num.intValue());
        int d = k38Var.d();
        nw5 nw5Var = this.w1;
        nw5Var.setSelectedColorIndex(d);
        nw5Var.getAdapter().f();
    }

    public final void m0(Integer num) {
        setNewColor(num.intValue());
        y0(false);
    }

    public final void n0() {
        yza yzaVar;
        l34 l34Var = this.I0;
        if (l34Var != null) {
            PointF D0 = D0(l34Var);
            l34 l34Var2 = this.I0;
            boolean z = l34Var2 instanceof yza;
            mw5 mw5Var = this.P0;
            if (z) {
                yza yzaVar2 = new yza(getContext(), (yza) this.I0, D0);
                yzaVar2.setDelegate(this);
                mw5Var.addView(yzaVar2);
                yzaVar = yzaVar2;
            } else if (l34Var2 instanceof vhb) {
                vhb vhbVar = new vhb(getContext(), (vhb) this.I0, D0);
                vhbVar.setDelegate(this);
                vhbVar.setMaxWidth((int) (getPaintingSize().a - 20.0f));
                mw5Var.addView(vhbVar, nme.c(-2.0f, -2));
                yzaVar = vhbVar;
            } else {
                yzaVar = null;
            }
            r0(yzaVar);
            t0(yzaVar, true);
        }
        m8 m8Var = this.H1;
        if (m8Var != null && m8Var.isShowing()) {
            this.H1.d(true);
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    public final void o0(boolean z) {
        int i;
        int i2;
        if (this.W0 == 0) {
            int i3 = 0;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            this.b1.setLayerType(i, null);
            if (z) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            this.S0.setLayerType(i2, null);
            if (z) {
                i3 = 2;
            }
            this.R0.setLayerType(i3, null);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.E5);
    }

    @Override
    public final void onDetachedFromWindow() {
        yb1 yb1Var = this.P1;
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
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.E5);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int Q;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        if (this.Z1 != null) {
            if (gl.O1()) {
                Q = i6 - this.Z1.getMeasuredHeight();
            } else {
                Q = (Q() + i6) - this.Z1.getMeasuredHeight();
            }
            t14 t14Var = this.Z1;
            t14Var.layout(0, Q, t14Var.getMeasuredWidth(), this.Z1.getMeasuredHeight() + Q);
        }
        if (!this.L0) {
            i7 = gl.m;
        }
        lw5 lw5Var = this.M0;
        int ceil = (int) Math.ceil((i5 - lw5Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + de9.w(8.0f, (((i6 - (a.getCurrentActionBarHeight() + i7)) - gl.L(48.0f)) - lw5Var.getMeasuredHeight()) / 2, i7);
        lw5Var.layout(ceil, additionalTop, lw5Var.getMeasuredWidth() + ceil, lw5Var.getMeasuredHeight() + additionalTop);
        sb sbVar = this.N0;
        sbVar.layout(ceil, additionalTop, sbVar.getMeasuredWidth() + ceil, sbVar.getMeasuredHeight() + additionalTop);
        int measuredWidth = lw5Var.getMeasuredWidth();
        mw5 mw5Var = this.P0;
        int measuredWidth2 = ((measuredWidth - mw5Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((lw5Var.getMeasuredHeight() - mw5Var.getMeasuredHeight()) / 2) + additionalTop;
        mw5Var.layout(measuredWidth2, measuredHeight, mw5Var.getMeasuredWidth() + measuredWidth2, mw5Var.getMeasuredHeight() + measuredHeight);
        ijb ijbVar = this.Q0;
        if (ijbVar != null) {
            ijbVar.layout(measuredWidth2, measuredHeight, mw5Var.getMeasuredWidth() + measuredWidth2, mw5Var.getMeasuredHeight() + measuredHeight);
        }
        a6 a6Var = this.O0;
        a6Var.layout(ceil, additionalTop, a6Var.getMeasuredWidth() + ceil, a6Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float currentActionBarHeight;
        float f;
        tb1 tb1Var;
        this.F0 = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((gl.q.y - a.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - gl.L(48.0f);
        Bitmap bitmap = this.t0;
        if (bitmap != null) {
            f = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - a.getCurrentActionBarHeight()) - gl.L(48.0f);
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
        this.M0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.N0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        float f4 = f2 / this.H0.a;
        this.G0 = f4;
        mw5 mw5Var = this.P0;
        mw5Var.setScaleX(f4);
        mw5Var.setScaleY(this.G0);
        mw5Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.H0.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.H0.b, 1073741824));
        ijb ijbVar = this.Q0;
        if (ijbVar != null) {
            ijbVar.measure(View.MeasureSpec.makeMeasureSpec((int) this.H0.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.H0.b, 1073741824));
            this.Q0.setScaleX(this.G0);
            this.Q0.setScaleY(this.G0);
        }
        F0();
        this.O0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        measureChild(this.S0, i, i2);
        measureChild(this.b1, i, i2);
        yb1 yb1Var = this.P1;
        if (yb1Var != null && (tb1Var = yb1Var.e) != null) {
            tb1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        measureChild(this.U0, i, i2);
        measureChild(this.T0, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.d2), 1073741824));
        FrameLayout frameLayout = this.R0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), gl.L(12.0f) + gl.m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.F0 = false;
        if (gl.L(20.0f) >= 0 && !this.a2 && !this.c2) {
            this.F0 = true;
            j0();
            this.F0 = false;
        }
        if (gl.L(20.0f) < 0) {
            j0();
        }
        t14 t14Var = this.Z1;
        if (t14Var != null) {
            measureChild(t14Var, i, i2);
        }
    }

    @Override
    public final boolean p() {
        return !this.J0;
    }

    public final boolean p0() {
        if (this.B1) {
            y0(false);
            return true;
        } else if (this.a2) {
            i0(true);
            return true;
        } else if (!this.J0) {
            return false;
        } else {
            t0(null, true);
            return true;
        }
    }

    public abstract void q0(boolean z);

    public final void r0(l34 l34Var) {
        if (l34Var == null) {
            return;
        }
        this.v0.b(l34Var.getUUID(), new dw5(this, l34Var, (byte) 0));
    }

    @Override
    public final void requestLayout() {
        if (this.F0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(m01 m01Var) {
        boolean z = m01Var instanceof g01;
        zt7 zt7Var = this.b1;
        if (!z && !(m01Var instanceof i01)) {
            zt7Var.b(0.05f, 1.0f);
        } else {
            zt7Var.b(0.4f, 1.75f);
        }
        zt7Var.setDrawCenter(!(m01Var instanceof l01));
        lw5 lw5Var = this.M0;
        if (lw5Var.getCurrentBrush() instanceof l01) {
            this.a1 = true;
        }
        lw5Var.setBrush(m01Var);
        mcb mcbVar = this.A1;
        int i = mcbVar.a;
        mcbVar.a = k38.e(this.F1).c();
        mcbVar.c = this.c1.get();
        u0(mcbVar, Integer.valueOf(i));
        this.N0.invalidate();
    }

    public final void s0(l34 l34Var) {
        l34 l34Var2 = this.I0;
        if (l34Var == l34Var2 && l34Var2 != null) {
            l34Var2.l(l34Var2.o0, false);
            this.I0 = null;
            if (l34Var instanceof vhb) {
                ValueAnimator valueAnimator = this.Z0;
                if (valueAnimator != null && this.X0 != 0) {
                    valueAnimator.cancel();
                }
                E0(0);
            }
        }
        this.P0.removeView(l34Var);
        if (l34Var != null) {
            UUID uuid = l34Var.getUUID();
            b5c b5cVar = this.v0;
            b5cVar.b.remove(uuid);
            b5cVar.c.remove(uuid);
            gl.d3(new cib(b5cVar, (byte) 20));
        }
        zt7 zt7Var = this.b1;
        pj4 pj4Var = this.c1;
        zt7Var.setValueOverride(pj4Var);
        zt7Var.setShowPreview(true);
        float f = pj4Var.get();
        mcb mcbVar = this.A1;
        mcbVar.c = f;
        u0(mcbVar, null);
    }

    public void setBlurredBackgroundDrawableForTools(il0 il0Var) {
        il0Var.q(gl.L(4.0f));
        this.W1 = il0Var;
    }

    public void setDrawShadow(boolean z) {
        this.M1 = z;
        invalidate();
        setClipChildren(!z);
    }

    public void setOffsetTranslationX(float f) {
        if (this.W0 == 0) {
            this.b1.setTranslationX(f);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.K1 = runnable;
    }

    @Override
    public final void t() {
        mv5 mv5Var;
        if (!this.b2 && !this.a2) {
            f0(true);
            return;
        }
        boolean z = this.a2;
        if (z && (mv5Var = ((q88) this).j2.L1) != null) {
            mv5Var.e = true;
        }
        z0(!z ? 1 : 0);
        if (z) {
            l34 l34Var = this.I0;
            if (l34Var instanceof vhb) {
                gl.F3(((vhb) l34Var).getEditText());
            }
        }
    }

    public final boolean t0(l34 l34Var, boolean z) {
        rw5 rw5Var;
        boolean z2;
        int i;
        int i2;
        boolean z3 = l34Var instanceof vhb;
        if (z3 && ((i2 = this.X0) != -1 ? i2 != 2 : this.W0 != 2)) {
            ValueAnimator valueAnimator = this.Z0;
            if (valueAnimator != null && i2 != 2) {
                valueAnimator.cancel();
            }
            if (this.B1) {
                y0(false);
            }
            E0(2);
        }
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
            hs7 hs7Var = this.k1;
            hs7Var.setAlignment(i);
            hs7Var.setTypeface(vhbVar.getTypeface().a);
            hs7Var.e(vhbVar.getType(), true);
            this.T0.invalidate();
        }
        l34 l34Var2 = this.I0;
        if (l34Var2 != null) {
            if (l34Var2 == l34Var) {
                boolean z4 = this.J0;
                if (!z4 && (l34Var2 instanceof cc1) && !l34Var.f0) {
                    g0();
                    return true;
                } else if (!z4) {
                    int[] h0 = h0(l34Var2);
                    A0(new dw5(this, l34Var2, (byte) 2), this, 51, h0[0], h0[1] - gl.L(32.0f));
                    return true;
                } else {
                    if (l34Var2 instanceof vhb) {
                        gl.F3(((vhb) l34Var2).getFocusedView());
                        i0(false);
                    }
                    return true;
                }
            }
            rw5Var = this;
            l34Var2.l(l34Var2.o0, false);
            l34 l34Var3 = rw5Var.I0;
            if (l34Var3 instanceof vhb) {
                ((vhb) l34Var3).r();
                if (!z3) {
                    rw5Var.J0 = false;
                    gl.t1(((vhb) rw5Var.I0).getFocusedView());
                    rw5Var.i0(false);
                }
            }
            z2 = true;
        } else {
            rw5Var = this;
            z2 = false;
        }
        l34 l34Var4 = rw5Var.I0;
        rw5Var.I0 = l34Var;
        if ((l34Var4 instanceof vhb) && TextUtils.isEmpty(((vhb) l34Var4).getText()) && !(l34Var4 instanceof cc1)) {
            rw5Var.s0(l34Var4);
        }
        l34 l34Var5 = rw5Var.I0;
        pj4 pj4Var = rw5Var.c1;
        mcb mcbVar = rw5Var.A1;
        zt7 zt7Var = rw5Var.b1;
        if (l34Var5 != null) {
            a6 a6Var = rw5Var.O0;
            l34Var5.o0 = a6Var;
            l34Var5.l(a6Var, true);
            rw5Var.P0.bringChildToFront(rw5Var.I0);
            l34 l34Var6 = rw5Var.I0;
            if (l34Var6 instanceof vhb) {
                vhb vhbVar2 = (vhb) l34Var6;
                vhbVar2.B0 = false;
                vhbVar2.getSwatch().c = mcbVar.c;
                rw5Var.u0(vhbVar2.getSwatch(), null);
                rw5Var.setTextWeightRange(vhbVar2);
                zt7Var.setValueOverride(new fw5(vhbVar2, (int) (rw5Var.H0.a / 9.0f), (byte) 0));
                zt7Var.setShowPreview(false);
                return true;
            }
            zt7Var.setValueOverride(pj4Var);
            zt7Var.setShowPreview(true);
            mcbVar.c = pj4Var.get();
            rw5Var.u0(mcbVar, null);
            return true;
        }
        ValueAnimator valueAnimator2 = rw5Var.Z0;
        if (valueAnimator2 != null && rw5Var.X0 != 0) {
            valueAnimator2.cancel();
        }
        if (rw5Var.B1) {
            rw5Var.y0(false);
        }
        rw5Var.E0(0);
        zt7Var.setValueOverride(pj4Var);
        zt7Var.setShowPreview(true);
        mcbVar.c = pj4Var.get();
        rw5Var.u0(mcbVar, null);
        return z2;
    }

    @Override
    public final void u(float f, float f2, float[] fArr) {
        Point point = gl.q;
        double d = f - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.P0.getRotation());
        double d2 = f2 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (point.y / 2.0f) + ((float) ug8.d(radians, d2, Math.sin(radians) * d));
    }

    public final void u0(mcb mcbVar, Integer num) {
        mcb mcbVar2 = this.A1;
        if (mcbVar2 != mcbVar) {
            mcbVar2.a = mcbVar.a;
            mcbVar2.b = mcbVar.b;
            mcbVar2.c = mcbVar.c;
            int i = this.F1;
            k38.e(i).h(mcbVar.a, true);
            k38.e(i).j(mcbVar.c);
        }
        int i2 = mcbVar.a;
        lw5 lw5Var = this.M0;
        lw5Var.setColor(i2);
        lw5Var.setBrushSize(mcbVar.c);
        int i3 = mcbVar2.a;
        if (num != null && num.intValue() != i3) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new j24(this, num, i3, (byte) 1));
            duration.start();
        } else {
            ow5 ow5Var = this.S0;
            if (ow5Var != null) {
                ow5Var.invalidate();
            }
        }
        l34 l34Var = this.I0;
        if ((l34Var instanceof vhb) && !this.O1) {
            ((vhb) l34Var).setSwatch(new mcb(mcbVar.b, mcbVar.c, mcbVar.a));
        }
    }

    @Override
    public final void updateColors() {
        this.E1.setColor(-15132391);
    }

    @Override
    public final int[] v(l34 l34Var) {
        return h0(l34Var);
    }

    public final void v0(float f) {
        this.s0 = f;
        this.R0.setTranslationY(-f);
        this.S0.setTranslationY(f);
    }

    @Override
    public final k38 w() {
        return k38.e(this.F1);
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
        this.y0 = f;
        this.D0 = f4;
        this.E0 = f5;
        this.z0 = f2;
        this.A0 = f3;
        this.B0 = f2;
        float f13 = f3 + 0.0f;
        this.C0 = f13;
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                view = this.P0;
            } else if (i == 1) {
                view = this.O0;
            } else if (i == 2) {
                view = this.M0;
            } else {
                view = this.N0;
            }
            zl6 zl6Var = this.x0;
            if (zl6Var != null) {
                float f14 = zl6Var.c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i2 = zl6Var.k;
                    if (i2 == 90 || i2 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f4 / ((int) (zl6Var.e * f11)), f5 / ((int) (zl6Var.f * f12)));
                    f7 = f14 * max;
                    float C = yjb.C(zl6Var.a, measuredWidth, f, max);
                    float f15 = zl6Var.c;
                    f8 = (C * f15) + f2;
                    f6 = 1.0f;
                    f9 = (zl6Var.b * measuredHeight * f * max * f15) + f13;
                    f10 = zl6Var.d + i2;
                } else {
                    return;
                }
            } else {
                f6 = 1.0f;
                if (i == 0) {
                    f7 = this.G0 * 1.0f;
                } else {
                    f7 = 1.0f;
                }
                f8 = f2;
                f9 = f13;
                f10 = 0.0f;
            }
            float f16 = ((-this.d2) / 2.0f) + f9;
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
        if (this.B1 != z) {
            this.B1 = z;
            yla ylaVar = this.C1;
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
            this.C1 = ylaVar2;
            zla zlaVar = new zla();
            if (!z) {
                f2 = 0.0f;
            }
            zlaVar.i = f2;
            zlaVar.b(1250.0f);
            zlaVar.a(1.0f);
            ylaVar2.m = zlaVar;
            if (!this.b2 && !this.a2) {
                z2 = false;
            } else {
                z2 = true;
            }
            final boolean[] zArr = {z2};
            final float translationY = this.S0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.C1.b(new yr3() {
                @Override
                public final void a(yla ylaVar3, float f3, float f4) {
                    int i;
                    rw5 rw5Var = rw5.this;
                    ow5 ow5Var = rw5Var.S0;
                    float f5 = f3 / 1000.0f;
                    rw5Var.D1 = f5;
                    float f6 = ((1.0f - f5) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f6);
                    viewGroup.setScaleY(f6);
                    viewGroup.setTranslationY((Math.min(rw5Var.D1, 0.25f) * gl.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(rw5Var.D1, 0.25f) / 0.25f));
                    nw5 nw5Var = rw5Var.w1;
                    float f7 = rw5Var.D1;
                    boolean z3 = z;
                    nw5Var.B1(z3, f7);
                    rw5Var.r0.setProgress(rw5Var.D1);
                    rw5Var.q0.setProgress(rw5Var.D1);
                    rw5Var.V0.setTranslationY(gl.L(32.0f) * rw5Var.D1);
                    if (zArr[0]) {
                        float f8 = rw5Var.D1;
                        if (!z3) {
                            f8 = 1.0f - f8;
                        }
                        float L = gl.L(40.0f) * f8;
                        if (z3) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        ow5Var.setTranslationY(translationY - (L * i));
                    }
                    ow5Var.invalidate();
                    if (viewGroup == rw5Var.k1) {
                        rw5Var.T0.invalidate();
                    }
                }
            });
            this.C1.a(new aw5(this, z, (byte) 1));
            this.C1.h();
            if (z) {
                nw5 nw5Var = this.w1;
                nw5Var.setVisibility(0);
                nw5Var.setSelectedColorIndex(k38.e(this.F1).d());
            }
        }
    }

    @Override
    public final void z() {
        A0(new wv5(this, (byte) 5), this, 53, 0, getHeight());
    }

    public final void z0(int i) {
        boolean z;
        hs7 hs7Var = this.k1;
        if (i == 1) {
            t14 t14Var = this.Z1;
            if (t14Var != null && t14Var.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            t14 t14Var2 = this.Z1;
            if (t14Var2 != null && t14Var2.d1 != y6c.t0) {
                removeView(t14Var2);
                t14Var2 = null;
                this.Z1 = null;
            }
            if (t14Var2 == null) {
                t14 t14Var3 = new t14(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.Z1 = t14Var3;
                t14Var3.V0 = true;
                t14Var3.setVisibility(8);
                if (gl.O1()) {
                    this.Z1.setForseMultiwindowLayout(true);
                }
                this.Z1.setDelegate(new kw5(this));
                addView(this.Z1);
            }
            this.Z1.setVisibility(0);
            this.a2 = true;
            t14 t14Var4 = this.Z1;
            if (this.e2 <= 0) {
                if (gl.O1()) {
                    this.e2 = gl.L(150.0f);
                } else {
                    this.e2 = na7.b1().getInt("kbd_height", gl.L(200.0f));
                }
            }
            int i2 = this.f2;
            if (i2 <= 0) {
                if (gl.O1()) {
                    i2 = gl.L(150.0f);
                    this.f2 = i2;
                } else {
                    i2 = na7.b1().getInt("kbd_height_land3", gl.L(200.0f));
                    this.f2 = i2;
                }
            }
            Point point = gl.q;
            if (point.x <= point.y) {
                i2 = this.e2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t14Var4.getLayoutParams();
            layoutParams.height = i2;
            t14Var4.setLayoutParams(layoutParams);
            if (!gl.E && !gl.O1()) {
                l34 l34Var = this.I0;
                if (l34Var instanceof vhb) {
                    gl.t1(((vhb) l34Var).getEditText());
                }
            }
            this.d2 = i2;
            requestLayout();
            mv5 mv5Var = ((q88) this).j2.L1;
            if (mv5Var != null) {
                mv5Var.a();
            }
            qy1 emojiButton = hs7Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(oy1.d, true);
            }
            getHeight();
            if (!z && !this.b2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d2, 0.0f);
                ofFloat.addUpdateListener(new xv5(this, (byte) 1));
                ofFloat.addListener(new jw5(this, (byte) 0));
                ofFloat.start();
                return;
            }
            return;
        }
        qy1 emojiButton2 = hs7Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(oy1.e, true);
        }
        t14 t14Var5 = this.Z1;
        if (t14Var5 != null) {
            this.a2 = false;
            if (gl.D || gl.E) {
                t14Var5.setVisibility(8);
            }
        }
        if (i == 0) {
            this.d2 = 0;
        }
        mv5 mv5Var2 = ((q88) this).j2.L1;
        if (mv5Var2 != null) {
            mv5Var2.a();
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
