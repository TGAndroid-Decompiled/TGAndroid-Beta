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
public abstract class ry5 extends fla implements ku7, u44, gu7, dla, jm7 {
    public float A0;
    public final oeb A1;
    public float B0;
    public boolean B1;
    public float C0;
    public zna C1;
    public float D0;
    public float D1;
    public float E0;
    public final Paint E1;
    public boolean F0;
    public final int F1;
    public float G0;
    public final tx5 G1;
    public xka H0;
    public m8 H1;
    public w44 I0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout I1;
    public boolean J0;
    public Rect J1;
    public int K0;
    public Runnable K1;
    public final boolean L0;
    public final m58 L1;
    public final ly5 M0;
    public boolean M1;
    public final sb N0;
    public float N1;
    public final a6 O0;
    public boolean O1;
    public final my5 P0;
    public final gd1 P1;
    public jlb Q0;
    public gy5 Q1;
    public final FrameLayout R0;
    public final fk3 R1;
    public final oy5 S0;
    public boolean S1;
    public final yd T0;
    public final ln T1;
    public final FrameLayout U0;
    public final Paint U1;
    public f7 V0;
    public final Paint V1;
    public int W0;
    public im0 W1;
    public int X0;
    public final float[] X1;
    public float Y0;
    public final int[] Y1;
    public ValueAnimator Z0;
    public e34 Z1;
    public boolean a1;
    public boolean a2;
    public final aw7 b1;
    public boolean b2;
    public final k44 c1;
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
    public final lu7 j1;
    public final iu7 k1;
    public final tu7 l1;
    public final ImageView m1;
    public final LinearLayout n1;
    public final TextView o1;
    public final TextView p1;
    public final yt7 q0;
    public final TextView q1;
    public final du7 r0;
    public final Paint r1;
    public float s0;
    public final Paint s1;
    public final Bitmap t0;
    public float t1;
    public final Bitmap u0;
    public boolean u1;
    public final b7c v0;
    public zna v1;
    public final np3 w0;
    public final ny5 w1;
    public final ao6 x0;
    public final Paint x1;
    public float y0;
    public final Paint y1;
    public float z0;
    public final Paint z1;

    public ry5(Context context, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, ao6 ao6Var, n88 n88Var, final ylb ylbVar) {
        super(context, activity);
        gd1 gd1Var;
        boolean z;
        int i3;
        dw3[] dw3VarArr;
        kd1 kd1Var;
        ArrayList arrayList2 = arrayList;
        boolean z2 = false;
        this.W0 = 0;
        this.X0 = -1;
        final sa8 sa8Var = (sa8) this;
        this.c1 = new k44(sa8Var, (byte) 11);
        byte b = 1;
        this.r1 = new Paint(1);
        this.s1 = new Paint(1);
        this.x1 = new Paint(1);
        this.y1 = new Paint(1);
        this.z1 = new Paint(1);
        oeb oebVar = new oeb(1.0f, 0.016773745f, -1);
        this.A1 = oebVar;
        this.E1 = new Paint(1);
        fk3 fk3Var = new fk3(sa8Var);
        this.R1 = fk3Var;
        this.S1 = false;
        this.T1 = new ln(350L, (View) this, d53.h);
        this.U1 = new Paint(1);
        Paint paint = new Paint(1);
        this.V1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        byte b2 = 2;
        this.X1 = new float[2];
        this.Y1 = new int[2];
        new o04(sa8Var, (byte) 18);
        setDelegate(this);
        this.F1 = i;
        File captionsVideoFile = getCaptionsVideoFile();
        if (captionsVideoFile != null && captionsVideoFile.exists() && DictationAsr.C(i)) {
            gd1Var = new gd1(captionsVideoFile, fk3Var);
        } else {
            gd1Var = null;
        }
        this.P1 = gd1Var;
        if (gd1Var != null) {
            gd1Var.d = new kg5(sa8Var, (byte) 13);
        }
        this.G1 = new ylb() {
            @Override
            public final boolean a() {
                return cmb.I.o();
            }

            @Override
            public final void b(float f, float f2, int i4, int i5) {
                cmb.q(f, f2, i4, i5);
            }

            @Override
            public final ColorFilter c() {
                return cmb.u3;
            }

            @Override
            public final Paint d(String str) {
                return cmb.T0(str);
            }

            @Override
            public final boolean e() {
                return gda.D0;
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
                if (i4 == cmb.F8) {
                    return -14145495;
                }
                if (i4 != cmb.D8) {
                    if (i4 == cmb.g5) {
                        return -14737633;
                    }
                    if (i4 == cmb.i5) {
                        return -592138;
                    }
                    if (i4 == cmb.q5) {
                        return -8553091;
                    }
                    if (i4 != cmb.yf) {
                        if (i4 == cmb.Bf) {
                            return -1610612736;
                        }
                        if (i4 == cmb.Ef || i4 == cmb.If || i4 == cmb.Df) {
                            return -9539985;
                        }
                        if (i4 != cmb.F6) {
                            int i5 = cmb.Ci;
                            if (i4 == i5) {
                                return -11754001;
                            }
                            if (i4 == cmb.h6) {
                                return 536870911;
                            }
                            if (i4 != cmb.vi && i4 != cmb.ui && i4 != cmb.wi) {
                                if (i4 == cmb.xi) {
                                    return 352321535;
                                }
                                if (i4 != cmb.Af && i4 != i5) {
                                    if (i4 == cmb.zf) {
                                        return 780633991;
                                    }
                                    if (i4 == cmb.Z6) {
                                        return -15921907;
                                    }
                                    if (i4 == cmb.l7) {
                                        return -12500671;
                                    }
                                    if (i4 == cmb.k7) {
                                        return -13133079;
                                    }
                                    if (i4 == cmb.m7) {
                                        return -1;
                                    }
                                    if (i4 == cmb.c6) {
                                        return -15198183;
                                    }
                                    if (i4 == cmb.c7) {
                                        return -16777216;
                                    }
                                    ylb ylbVar2 = ylb.this;
                                    if (ylbVar2 != null) {
                                        return ylbVar2.h(i4);
                                    }
                                    return cmb.w0(null, i4, false);
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
        this.x0 = ao6Var;
        this.L0 = context instanceof BubbleActivity;
        m58 e = m58.e(i);
        this.L1 = e;
        e.i(0, true);
        oebVar.a = e.c();
        oebVar.c = e.i;
        np3 np3Var = new np3("Paint", true);
        this.w0 = np3Var;
        this.t0 = bitmap;
        this.u0 = bitmap2;
        this.e1 = i2;
        b7c b7cVar = new b7c();
        this.v0 = b7cVar;
        b7cVar.a = new wx4(sa8Var, (byte) 17);
        ly5 ly5Var = new ly5(sa8Var, context, new hw7(getPaintingSize(), bitmap2, i2, null), bitmap, bitmap2);
        this.M0 = ly5Var;
        ly5Var.setDelegate(new wm4(sa8Var, n88Var, false, (byte) 6));
        ly5Var.setUndoStore(b7cVar);
        ly5Var.setQueue(np3Var);
        ly5Var.setVisibility(4);
        addView(ly5Var, qoe.e(-1, -1, 51));
        sb sbVar = new sb((byte) 19, context, sa8Var);
        this.N0 = sbVar;
        sbVar.setVisibility(4);
        addView(sbVar, qoe.e(-1, -1, 51));
        my5 my5Var = new my5(sa8Var, context, new lj4(sa8Var));
        this.P0 = my5Var;
        addView(my5Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i4 = 0;
            kd1 kd1Var2 = null;
            while (i4 < size) {
                pcc pccVar = (pcc) arrayList2.get(i4);
                byte b3 = pccVar.a;
                if (b3 == 0) {
                    ?? e0 = e0(pccVar.C, pccVar.B, z2);
                    if ((pccVar.b & b2) != 0) {
                        e0.r(z2);
                    }
                    ViewGroup.LayoutParams layoutParams = e0.getLayoutParams();
                    layoutParams.width = pccVar.q;
                    layoutParams.height = pccVar.r;
                    i3 = size;
                    kd1Var = e0;
                } else if (b3 == 11) {
                    if (kd1Var2 != null) {
                        i3 = size;
                        kd1Var2.u(pccVar.V, pccVar.W, pccVar.j, pccVar.X);
                        i4++;
                        arrayList2 = arrayList;
                        size = i3;
                        z2 = false;
                        b2 = 2;
                        b = 1;
                    } else {
                        i3 = size;
                        kd1 c0 = c0();
                        c0.setType(pccVar.b);
                        c0.setTypeface(pccVar.n);
                        c0.setBaseFontSize(pccVar.m);
                        w0(c0, pccVar.p);
                        oeb swatch = c0.getSwatch();
                        swatch.a = pccVar.l;
                        c0.setSwatch(swatch);
                        c0.u(pccVar.V, pccVar.W, pccVar.j, pccVar.X);
                        kd1Var2 = c0;
                        kd1Var = c0;
                    }
                } else {
                    i3 = size;
                    if (b3 == b) {
                        ?? f0 = f0(false);
                        f0.setType(pccVar.b);
                        f0.setTypeface(pccVar.n);
                        f0.setBaseFontSize(pccVar.m);
                        SpannableString spannableString = new SpannableString(pccVar.j);
                        ArrayList arrayList3 = pccVar.k;
                        int i5 = 0;
                        for (int size2 = arrayList3.size(); i5 < size2; size2 = size2) {
                            Object obj = arrayList3.get(i5);
                            i5++;
                            occ occVar = (occ) obj;
                            gn gnVar = new gn(occVar.document_id, f0.getFontMetricsInt());
                            int i6 = occVar.offset;
                            spannableString.setSpan(gnVar, i6, occVar.length + i6, 33);
                        }
                        CharSequence m = gw3.m(spannableString, f0.getFontMetricsInt(), false, null, 0);
                        if ((m instanceof Spanned) && (dw3VarArr = (dw3[]) ((Spanned) m).getSpans(0, m.length(), dw3.class)) != null) {
                            for (dw3 dw3Var : dw3VarArr) {
                                dw3Var.b = 0.85f;
                            }
                        }
                        f0.setText(m);
                        w0(f0, pccVar.p);
                        oeb swatch2 = f0.getSwatch();
                        swatch2.a = pccVar.l;
                        f0.setSwatch(swatch2);
                        kd1Var = f0;
                    } else if (b3 == 2) {
                        ?? d0 = d0(pccVar.j, false);
                        d0.D0 = false;
                        if ((pccVar.b & 2) != 0) {
                            d0.r(false);
                        }
                        if ((pccVar.b & 16) != 0) {
                            d0.t(false);
                        }
                        ViewGroup.LayoutParams layoutParams2 = d0.getLayoutParams();
                        layoutParams2.width = pccVar.q;
                        layoutParams2.height = pccVar.r;
                        kd1Var = d0;
                    } else {
                        i4++;
                        arrayList2 = arrayList;
                        size = i3;
                        z2 = false;
                        b2 = 2;
                        b = 1;
                    }
                }
                kd1Var.setX((pccVar.c * this.H0.a) - (((1.0f - pccVar.v) * pccVar.q) / 2.0f));
                kd1Var.setY((pccVar.d * this.H0.b) - (((1.0f - pccVar.v) * pccVar.r) / 2.0f));
                kd1Var.setPosition(new PointF((pccVar.q / 2.0f) + kd1Var.getX(), (pccVar.r / 2.0f) + kd1Var.getY()));
                kd1Var.setScale(pccVar.v);
                kd1Var.setRotation((float) (((-pccVar.e) / 3.141592653589793d) * 180.0d));
                i4++;
                arrayList2 = arrayList;
                size = i3;
                z2 = false;
                b2 = 2;
                b = 1;
            }
        }
        this.P0.setVisibility(4);
        a6 a6Var = new a6(context, (byte) 17);
        this.O0 = a6Var;
        addView(a6Var);
        ?? frameLayout = new FrameLayout(context);
        this.R0 = frameLayout;
        frameLayout.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout, qoe.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.m1 = imageView;
        imageView.setImageResource(2131232548);
        imageView.setPadding(gm.L(3.0f), gm.L(3.0f), gm.L(3.0f), gm.L(3.0f));
        imageView.setBackground(cmb.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b4 = r2;
                sa8 sa8Var2 = sa8Var;
                switch (b4) {
                    case 0:
                        ly5 ly5Var2 = sa8Var2.M0;
                        if (ly5Var2 != null && (ly5Var2.getCurrentBrush() instanceof t11)) {
                            ly5Var2.b();
                            sa8Var2.j1.setSelectedIndex(1);
                            sa8Var2.s((u11) u11.a.get(0));
                            return;
                        }
                        sa8Var2.v0.c();
                        return;
                    case 1:
                        ly5 ly5Var3 = sa8Var2.M0;
                        b7c b7cVar2 = sa8Var2.v0;
                        if (b7cVar2.a()) {
                            if (ly5Var3 != null && (ly5Var3.getCurrentBrush() instanceof t11)) {
                                ly5Var3.b();
                                sa8Var2.j1.setSelectedIndex(1);
                                sa8Var2.s((u11) u11.a.get(0));
                            }
                            ly5Var3.a();
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            sa8Var2.P0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        w44 w44Var = sa8Var2.I0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (sa8Var2.a2) {
                            sa8Var2.i0(false);
                        }
                        sa8Var2.s0(sa8Var2.I0);
                        sa8Var2.t0(null, true);
                        return;
                    default:
                        sa8Var2.t0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout.addView(imageView, qoe.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(cmb.f0(822083583, 7, -1));
        linearLayout.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131747000, null));
        linearLayout.addView(td4.k(context, 2131232549), qoe.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, qoe.r(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new x10((byte) 8));
        frameLayout.addView(linearLayout, qoe.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.o1 = textView2;
        textView2.setBackground(cmb.f0(822083583, 7, -1));
        textView2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        textView2.setText(jb6.M0(2131747012, null));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(gm.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b4 = r2;
                sa8 sa8Var2 = sa8Var;
                switch (b4) {
                    case 0:
                        ly5 ly5Var2 = sa8Var2.M0;
                        if (ly5Var2 != null && (ly5Var2.getCurrentBrush() instanceof t11)) {
                            ly5Var2.b();
                            sa8Var2.j1.setSelectedIndex(1);
                            sa8Var2.s((u11) u11.a.get(0));
                            return;
                        }
                        sa8Var2.v0.c();
                        return;
                    case 1:
                        ly5 ly5Var3 = sa8Var2.M0;
                        b7c b7cVar2 = sa8Var2.v0;
                        if (b7cVar2.a()) {
                            if (ly5Var3 != null && (ly5Var3.getCurrentBrush() instanceof t11)) {
                                ly5Var3.b();
                                sa8Var2.j1.setSelectedIndex(1);
                                sa8Var2.s((u11) u11.a.get(0));
                            }
                            ly5Var3.a();
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            sa8Var2.P0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        w44 w44Var = sa8Var2.I0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (sa8Var2.a2) {
                            sa8Var2.i0(false);
                        }
                        sa8Var2.s0(sa8Var2.I0);
                        sa8Var2.t0(null, true);
                        return;
                    default:
                        sa8Var2.t0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView l = wi8.l(frameLayout, textView2, qoe.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.p1 = l;
        l.setBackground(cmb.f0(822083583, 7, -1));
        l.setText(jb6.M0(2131752038, null));
        l.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        l.setGravity(16);
        l.setTextColor(-1);
        l.setTypeface(gm.o());
        l.setTextSize(1, 16.0f);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b4 = r2;
                sa8 sa8Var2 = sa8Var;
                switch (b4) {
                    case 0:
                        ly5 ly5Var2 = sa8Var2.M0;
                        if (ly5Var2 != null && (ly5Var2.getCurrentBrush() instanceof t11)) {
                            ly5Var2.b();
                            sa8Var2.j1.setSelectedIndex(1);
                            sa8Var2.s((u11) u11.a.get(0));
                            return;
                        }
                        sa8Var2.v0.c();
                        return;
                    case 1:
                        ly5 ly5Var3 = sa8Var2.M0;
                        b7c b7cVar2 = sa8Var2.v0;
                        if (b7cVar2.a()) {
                            if (ly5Var3 != null && (ly5Var3.getCurrentBrush() instanceof t11)) {
                                ly5Var3.b();
                                sa8Var2.j1.setSelectedIndex(1);
                                sa8Var2.s((u11) u11.a.get(0));
                            }
                            ly5Var3.a();
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            sa8Var2.P0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        w44 w44Var = sa8Var2.I0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (sa8Var2.a2) {
                            sa8Var2.i0(false);
                        }
                        sa8Var2.s0(sa8Var2.I0);
                        sa8Var2.t0(null, true);
                        return;
                    default:
                        sa8Var2.t0(null, true);
                        return;
                }
            }
        });
        l.setAlpha(0.0f);
        l.setVisibility(8);
        TextView l2 = wi8.l(frameLayout, l, qoe.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.q1 = l2;
        l2.setBackground(cmb.f0(822083583, 7, -1));
        l2.setText(jb6.M0(2131751291, null));
        l2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        l2.setGravity(16);
        l2.setTextColor(-1);
        l2.setTypeface(gm.o());
        l2.setTextSize(1, 16.0f);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b4 = r2;
                sa8 sa8Var2 = sa8Var;
                switch (b4) {
                    case 0:
                        ly5 ly5Var2 = sa8Var2.M0;
                        if (ly5Var2 != null && (ly5Var2.getCurrentBrush() instanceof t11)) {
                            ly5Var2.b();
                            sa8Var2.j1.setSelectedIndex(1);
                            sa8Var2.s((u11) u11.a.get(0));
                            return;
                        }
                        sa8Var2.v0.c();
                        return;
                    case 1:
                        ly5 ly5Var3 = sa8Var2.M0;
                        b7c b7cVar2 = sa8Var2.v0;
                        if (b7cVar2.a()) {
                            if (ly5Var3 != null && (ly5Var3.getCurrentBrush() instanceof t11)) {
                                ly5Var3.b();
                                sa8Var2.j1.setSelectedIndex(1);
                                sa8Var2.s((u11) u11.a.get(0));
                            }
                            ly5Var3.a();
                            b7cVar2.c.clear();
                            b7cVar2.b.clear();
                            gm.c3(new zcb(b7cVar2, (byte) 28));
                            sa8Var2.P0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        w44 w44Var = sa8Var2.I0;
                        if (w44Var instanceof xjb) {
                            gm.t1(((xjb) w44Var).getFocusedView());
                        }
                        if (sa8Var2.a2) {
                            sa8Var2.i0(false);
                        }
                        sa8Var2.s0(sa8Var2.I0);
                        sa8Var2.t0(null, true);
                        return;
                    default:
                        sa8Var2.t0(null, true);
                        return;
                }
            }
        });
        l2.setAlpha(0.0f);
        l2.setVisibility(8);
        frameLayout.addView(l2, qoe.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        oy5 oy5Var = new oy5(sa8Var, context);
        this.S0 = oy5Var;
        oy5Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), 0);
        oy5Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(oy5Var, qoe.e(-1, 104, 80));
        if (bitmap2 != null) {
            z = true;
        } else {
            z = false;
        }
        lu7 lu7Var = new lu7(context, z);
        this.j1 = lu7Var;
        lu7Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        lu7Var.setDelegate(this);
        lu7Var.setSelectedIndex(1);
        oy5Var.addView(lu7Var, qoe.c(48.0f, -1));
        iu7 iu7Var = new iu7(context);
        this.k1 = iu7Var;
        iu7Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        iu7Var.setVisibility(8);
        iu7Var.setDelegate(this);
        iu7Var.setAlignment(m58.e(i).g);
        oy5Var.addView(iu7Var, qoe.c(48.0f, -1));
        yd ydVar = new yd(sa8Var, context);
        this.T0 = ydVar;
        addView(ydVar, qoe.c(-1.0f, -1));
        tu7 tu7Var = new tu7(context);
        this.l1 = tu7Var;
        tu7Var.setVisibility(8);
        tu7Var.setOnItemClickListener(new kg4(sa8Var, (byte) 8));
        iu7Var.setTypefaceListView(tu7Var);
        ydVar.addView(tu7Var, qoe.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.r1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.r1.setColor(1728053247);
        this.r1.setStrokeWidth(Math.max(2, gm.L(1.0f)));
        this.s1.setColor(cmb.v0(cmb.F8, this.G1));
        ny5 ny5Var = new ny5(sa8Var, context);
        this.w1 = ny5Var;
        ny5Var.setVisibility(8);
        ny5Var.setColorPalette(m58.e(i));
        ny5Var.setColorListener(new vx5(sa8Var, (byte) 0));
        oy5Var.addView(ny5Var, qoe.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        yt7 yt7Var = new yt7(context);
        this.q0 = yt7Var;
        yt7Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        yt7Var.setBackground(cmb.f0(1090519039, 1, -1));
        oy5Var.addView(yt7Var, qoe.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        du7 du7Var = new du7(context);
        this.r0 = du7Var;
        du7Var.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        du7Var.setBackground(cmb.f0(1090519039, 1, -1));
        du7Var.setOnClickListener(new jw4(sa8Var, context, bitmap2, (byte) 4));
        oy5Var.addView(du7Var, qoe.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        aw7 aw7Var = new aw7(context);
        this.b1 = aw7Var;
        aw7Var.setColorSwatch(this.A1);
        aw7Var.setRenderView(this.M0);
        aw7Var.setValueOverride(this.c1);
        this.A1.c = this.c1.get();
        aw7Var.setOnUpdate(new bm3(sa8Var, i, (byte) 17));
        addView(aw7Var, qoe.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U0 = frameLayout2;
        addView(frameLayout2, qoe.c(-1.0f, -1));
        this.z1.setStyle(style);
        this.z1.setStrokeWidth(gm.L(2.0f));
        u0(this.A1, null);
        s((u11) u11.a.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            Point point = gm.q;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (point.y * 0.35f), gm.L(100.0f), (int) (point.y * 0.65d))));
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

    private xka getPaintingSize() {
        int i;
        xka xkaVar = this.H0;
        if (xkaVar != null) {
            return xkaVar;
        }
        Bitmap bitmap = this.t0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int o = gda.o();
        if (o != 0) {
            if (o != 2) {
                i = 2560;
            } else {
                i = 3840;
            }
        } else {
            i = 1280;
        }
        xka xkaVar2 = new xka(width, height);
        float f = i;
        xkaVar2.a = f;
        float floor = (float) Math.floor((f * height) / width);
        xkaVar2.b = floor;
        if (floor > f) {
            xkaVar2.b = f;
            xkaVar2.a = (float) Math.floor((f * width) / height);
        }
        this.H0 = xkaVar2;
        return xkaVar2;
    }

    public void setNewColor(int i) {
        oeb oebVar = this.A1;
        int i2 = oebVar.a;
        oebVar.a = i;
        u0(oebVar, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new bo(this, i2, i, (byte) 2));
        duration.start();
    }

    private void setTextType(int i) {
        this.K0 = i;
        w44 w44Var = this.I0;
        if (w44Var instanceof xjb) {
            ((xjb) w44Var).setType(i);
        }
        m58 e = m58.e(this.F1);
        e.h = i;
        e.a.edit().putInt("text_type", i).apply();
        this.k1.setOutlineType(i);
    }

    public void setTextWeightRange(w44 w44Var) {
        boolean z = w44Var instanceof kd1;
        aw7 aw7Var = this.b1;
        if (z) {
            aw7Var.b(0.3f, 1.1f);
        } else {
            aw7Var.b(0.5f, 2.0f);
        }
    }

    private void setupTabsLayout(Context context) {
        f7 f7Var = new f7(this, context);
        this.V0 = f7Var;
        f7Var.setClipToPadding(false);
        this.V0.setOrientation(0);
        this.S0.addView(this.V0, qoe.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.g1 = textView;
        textView.setText(jb6.M0(2131747010, null).toUpperCase());
        TextView textView2 = this.g1;
        int i = cmb.h6;
        tx5 tx5Var = this.G1;
        anb.R(textView2, cmb.f0(cmb.v0(i, tx5Var), 7, -1), null, anb.M(i), tx5Var);
        this.g1.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        this.g1.setTextColor(-1);
        this.g1.setTextSize(1, 14.0f);
        this.g1.setGravity(1);
        this.g1.setTypeface(gm.o());
        this.g1.setSingleLine();
        this.g1.setOnClickListener(new sx5(this, (byte) 0));
        this.V0.addView(this.g1, qoe.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.h1 = textView3;
        textView3.setText(jb6.M0(2131747009, null).toUpperCase());
        anb.R(this.h1, cmb.f0(cmb.v0(i, tx5Var), 7, -1), null, anb.M(i), tx5Var);
        this.h1.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        this.h1.setOnClickListener(new sx5(this, (byte) 1));
        this.h1.setTextColor(-1);
        this.h1.setTextSize(1, 14.0f);
        this.h1.setGravity(1);
        this.h1.setTypeface(gm.o());
        this.h1.setAlpha(0.6f);
        this.h1.setSingleLine();
        this.V0.addView(this.h1, qoe.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.i1 = textView4;
        textView4.setText(jb6.M0(2131747008, null).toUpperCase());
        anb.R(this.i1, cmb.f0(cmb.v0(i, tx5Var), 7, -1), null, anb.M(i), tx5Var);
        this.i1.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        this.i1.setTextColor(-1);
        this.i1.setTextSize(1, 14.0f);
        this.i1.setGravity(1);
        this.i1.setTypeface(gm.o());
        this.i1.setAlpha(0.6f);
        this.i1.setSingleLine();
        this.i1.setOnClickListener(new sx5(this, (byte) 4));
        this.V0.addView(this.i1, qoe.l(1.0f, 0, -2));
    }

    public static void w0(xjb xjbVar, int i) {
        int i2;
        xjbVar.setAlign(i);
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
        xjbVar.getEditText().setGravity(i2);
        if (i != 1) {
            boolean z = jb6.a0;
            if (i == 2 ? !z : z) {
                i3 = 3;
            }
        } else {
            i3 = 4;
        }
        xjbVar.getEditText().setTextAlignment(i3);
    }

    @Override
    public final void A(w44 w44Var) {
        int[] h0 = h0(w44Var);
        A0(new dy5(this, w44Var, (byte) 2), this, 51, h0[0], h0[1] - gm.L(32.0f));
    }

    public final void A0(Runnable runnable, ry5 ry5Var, int i, int i2, int i3) {
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
            this.I1.setDispatchKeyEventListener(new zx5(this));
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
        this.I1.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE));
        this.H1.setFocusable(true);
        this.H1.showAtLocation(ry5Var, i, i2 - (this.I1.getMeasuredWidth() / 2), i3 - this.I1.getMeasuredHeight());
        m8.i(this.I1);
    }

    public final void B0(boolean z) {
        float f;
        if (this.u1 != z) {
            this.u1 = z;
            zna znaVar = this.v1;
            if (znaVar != null) {
                znaVar.d();
            }
            float f2 = 1000.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            zna znaVar2 = new zna(new xk4(f));
            this.v1 = znaVar2;
            aoa aoaVar = new aoa();
            if (!z) {
                f2 = 0.0f;
            }
            aoaVar.i = f2;
            aoaVar.b(1250.0f);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            if (z) {
                tu7 tu7Var = this.l1;
                tu7Var.setAlpha(0.0f);
                tu7Var.setVisibility(0);
            }
            this.v1.b(new h20(this, (byte) 6));
            this.v1.a(new ay5(this, z, (byte) 0));
            this.v1.h();
        }
    }

    public final void C0() {
        gd1 gd1Var = this.P1;
        if (gd1Var != null) {
            gd1Var.b.c();
            jd4 jd4Var = gd1Var.c;
            if (jd4Var != null) {
                jd4Var.f = null;
                u31 u31Var = (u31) jd4Var.g;
                if (u31Var != null) {
                    u31Var.b();
                    jd4Var.g = null;
                }
                gd1Var.c = null;
            }
        }
        this.M0.h();
        this.P0.setVisibility(8);
        this.O0.setVisibility(8);
        this.w0.postRunnable(new bn3((byte) 18));
    }

    @Override
    public final void D() {
        B0(true);
    }

    public final PointF D0(w44 w44Var) {
        float f = 200.0f;
        ao6 ao6Var = this.x0;
        if (ao6Var != null) {
            f = 200.0f / ao6Var.c;
        }
        if (w44Var != null) {
            PointF position = w44Var.getPosition();
            return new PointF(position.x + f, position.y + f);
        }
        float f2 = 100.0f;
        if (ao6Var != null) {
            f2 = 100.0f / ao6Var.c;
        }
        PointF b0 = b0();
        while (true) {
            int i = 0;
            boolean z = false;
            while (true) {
                my5 my5Var = this.P0;
                if (i >= my5Var.getChildCount()) {
                    break;
                }
                View childAt = my5Var.getChildAt(i);
                if (childAt instanceof w44) {
                    PointF position2 = ((w44) childAt).getPosition();
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
            m58 e = m58.e(i3);
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
            int c = m58.e(i3).c();
            oeb oebVar = this.A1;
            oebVar.a = c;
            if (i == 2) {
                z2 = false;
            }
            this.O1 = z2;
            u0(oebVar, null);
            this.O1 = false;
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.Z0 = duration;
            duration.setInterpolator(d53.f);
            this.Z0.addUpdateListener(new nl(this, viewGroup, viewGroup2, (byte) 2));
            this.Z0.addListener(new dr1(this, viewGroup, viewGroup2, i, (byte) 3));
            this.Z0.start();
        }
    }

    public final void F0() {
        int i = 0;
        while (true) {
            my5 my5Var = this.P0;
            if (i < my5Var.getChildCount()) {
                View childAt = my5Var.getChildAt(i);
                if (childAt != this.I0) {
                    if (childAt instanceof w44) {
                        w44 w44Var = (w44) childAt;
                        if (!w44Var.n0 && w44Var.l0 <= 0.0f) {
                        }
                    }
                    i++;
                }
                ((w44) childAt).m();
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
        if (i > gm.L(50.0f) && this.b2 && !gm.E && !gm.O1()) {
            if (z) {
                this.f2 = i;
                oc7.c1().edit().putInt("kbd_height_land3", this.f2).commit();
            } else {
                this.e2 = i;
                oc7.c1().edit().putInt("kbd_height", this.e2).commit();
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
            int i4 = gm.q.x;
            if (i3 != i4 || layoutParams.height != i2) {
                layoutParams.width = i4;
                layoutParams.height = i2;
                this.Z1.setLayoutParams(layoutParams);
                this.d2 = layoutParams.height;
                requestLayout();
                mx5 mx5Var = ((sa8) this).j2.L1;
                if (mx5Var != null) {
                    mx5Var.a();
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
        w44 w44Var = this.I0;
        if (w44Var instanceof xjb) {
            if (((xjb) w44Var).getEditText().isFocused() && i > 0) {
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
            mx5 mx5Var2 = ((sa8) this).j2.L1;
            if (mx5Var2 != null) {
                mx5Var2.a();
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
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new dy5(this, (w44) view, (byte) 1)).start();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F8));
        hashSet.add(Integer.valueOf(cmb.g5));
        hashSet.add(Integer.valueOf(cmb.i5));
        hashSet.add(Integer.valueOf(cmb.q5));
        hashSet.add(Integer.valueOf(cmb.yf));
        hashSet.add(Integer.valueOf(cmb.Bf));
        hashSet.add(Integer.valueOf(cmb.Ef));
        hashSet.add(Integer.valueOf(cmb.If));
        hashSet.add(Integer.valueOf(cmb.Df));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.Ci));
        hashSet.add(Integer.valueOf(cmb.vi));
        hashSet.add(Integer.valueOf(cmb.ui));
        hashSet.add(Integer.valueOf(cmb.wi));
        hashSet.add(Integer.valueOf(cmb.xi));
        hashSet.add(Integer.valueOf(cmb.Af));
        hashSet.add(Integer.valueOf(cmb.zf));
        hashSet.add(Integer.valueOf(cmb.Z6));
        hashSet.add(Integer.valueOf(cmb.l7));
        hashSet.add(Integer.valueOf(cmb.k7));
        hashSet.add(Integer.valueOf(cmb.m7));
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.c7));
    }

    @Override
    public final void b() {
        setTextType((this.K0 + 1) % 4);
    }

    public final PointF b0() {
        ao6 ao6Var;
        xka paintingSize = getPaintingSize();
        float f = paintingSize.a / 2.0f;
        float f2 = paintingSize.b / 2.0f;
        if (this.x0 != null) {
            double radians = (float) Math.toRadians(-(ao6Var.k + ao6Var.d));
            float cos = (float) ((Math.cos(radians) * ao6Var.a) - (Math.sin(radians) * ao6Var.b));
            float d = (float) wi8.d(radians, ao6Var.b, Math.sin(radians) * ao6Var.a);
            f -= cos * paintingSize.a;
            f2 -= d * paintingSize.b;
        }
        return new PointF(f, f2);
    }

    @Override
    public final void c(int i) {
        w44 w44Var = this.I0;
        if (w44Var instanceof xjb) {
            w0((xjb) w44Var, i);
            m58 e = m58.e(this.F1);
            e.g = i;
            e.a.edit().putInt("text_alignment", i).apply();
        }
    }

    public final kd1 c0() {
        ((sa8) this).j2.h0.isFocusable();
        xka paintingSize = getPaintingSize();
        PointF b0 = b0();
        b0.y *= 1.5f;
        kd1 kd1Var = new kd1(getContext(), b0, (int) ((paintingSize.a / 9.0f) * 0.5f), new oeb(1.0f, this.A1.c, -1));
        float f = paintingSize.a / 9.0f;
        wx5 wx5Var = new wx5(this, (byte) 2);
        kd1Var.y0 = (int) (0.5f * f);
        kd1Var.z0 = (int) (f * 2.0f);
        kd1Var.A0 = wx5Var;
        kd1Var.B0 = true;
        kd1Var.setStickyX(2);
        kd1Var.setDelegate(this);
        kd1Var.setMaxWidth((int) (paintingSize.a - 20.0f));
        kd1Var.setTypeface(m58.e(this.F1).j);
        kd1Var.setType(3);
        gd1 gd1Var = this.P1;
        if (gd1Var != null) {
            gd1Var.b(kd1Var);
        } else {
            final fk3 fk3Var = this.R1;
            Objects.requireNonNull(fk3Var);
            kd1Var.setPositionProvider(new wx4(fk3Var, (byte) 19));
            kd1Var.setOnEditing(new qac() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            fk3Var.o(((Boolean) obj).booleanValue());
                            return;
                        default:
                            fk3Var.R(((Long) obj).longValue());
                            return;
                    }
                }
            });
            kd1Var.setOnSeek(new qac() {
                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            fk3Var.o(((Boolean) obj).booleanValue());
                            return;
                        default:
                            fk3Var.R(((Long) obj).longValue());
                            return;
                    }
                }
            });
        }
        this.P0.addView(kd1Var, qoe.c(-2.0f, -2));
        w0(kd1Var, 1);
        ao6 ao6Var = this.x0;
        if (ao6Var != null) {
            kd1Var.j(1.0f / ao6Var.c);
            kd1Var.f(-(ao6Var.k + ao6Var.d));
        }
        return kd1Var;
    }

    public final g88 d0(String str, boolean z) {
        float f;
        xka xkaVar;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            fc4.g(e, true);
            f = 1.0f;
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        my5 my5Var = this.P0;
        if (i > 0) {
            float floor = (float) Math.floor(my5Var.getMeasuredWidth() * 0.5d);
            xkaVar = new xka(floor, floor / f);
        } else {
            float floor2 = (float) Math.floor(my5Var.getMeasuredHeight() * 0.5d);
            xkaVar = new xka(f * floor2, floor2);
        }
        xka xkaVar2 = xkaVar;
        Pair N0 = gm.N0(str);
        if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
            float f2 = xkaVar2.a;
            xkaVar2.a = xkaVar2.b;
            xkaVar2.b = f2;
        }
        Context context = getContext();
        PointF b0 = b0();
        int intValue = ((Integer) N0.first).intValue();
        ((Integer) N0.second).getClass();
        g88 g88Var = new g88(context, b0, xkaVar2, str, intValue);
        g88Var.setDelegate(this);
        my5Var.addView(g88Var);
        if (z) {
            r0(g88Var);
            t0(g88Var, true);
        }
        return g88Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        my5 my5Var;
        xjb xjbVar;
        String str;
        if (i == nm7.G5 && (my5Var = this.P0) != null) {
            for (int i3 = 0; i3 < my5Var.getChildCount(); i3++) {
                View childAt = my5Var.getChildAt(i3);
                if ((childAt instanceof xjb) && (str = (xjbVar = (xjb) childAt).C0) != null) {
                    xjbVar.setTypeface(str);
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
        ao6 ao6Var;
        a6 a6Var;
        int i = 0;
        my5 my5Var = this.P0;
        if (view == my5Var) {
            float d = this.T1.d(this.M1);
            if (d > 0.0f) {
                int p1 = cmb.p1(d, 1090519039);
                Paint paint = this.U1;
                paint.setShadowLayer(gm.L(24.0f * d), 0.0f, 0.0f, p1);
                paint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(my5Var.getX(), my5Var.getY());
                canvas.scale(my5Var.getScaleX(), my5Var.getScaleY(), my5Var.getWidth() / 2.0f, my5Var.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, my5Var.getWidth(), my5Var.getHeight(), paint);
                canvas.drawRect(0.0f, 0.0f, my5Var.getWidth(), my5Var.getHeight(), this.V1);
                canvas.restore();
            }
        }
        if ((view == this.M0 || view == this.N0 || ((view == my5Var && my5Var.getClipChildren()) || (view == (a6Var = this.O0) && a6Var.getClipChildren()))) && (ao6Var = this.x0) != null) {
            canvas.save();
            if (!this.L0) {
                i = gm.m;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = ao6Var.k;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * ao6Var.e)) / ao6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * ao6Var.f)) / ao6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.B0;
            float additionalBottom = (((getAdditionalBottom() + (((getMeasuredHeight() - this.d2) - currentActionBarHeight) - gm.L(48.0f))) - scaleY) / 2.0f) + gm.L(8.0f) + i + this.C0;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public final defpackage.iy5 e0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry5.e0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):iy5");
    }

    public final xjb f0(boolean z) {
        ((sa8) this).j2.h0.isFocusable();
        xka paintingSize = getPaintingSize();
        PointF D0 = D0(null);
        xjb xjbVar = new xjb(getContext(), D0, (int) (paintingSize.a / 9.0f), "", this.A1, this.K0);
        float f = paintingSize.a / 9.0f;
        wx5 wx5Var = new wx5(this, (byte) 3);
        xjbVar.y0 = (int) (0.5f * f);
        xjbVar.z0 = (int) (f * 2.0f);
        xjbVar.A0 = wx5Var;
        float f2 = D0.x;
        my5 my5Var = this.P0;
        if (f2 == my5Var.getMeasuredWidth() / 2.0f) {
            xjbVar.setStickyX(2);
        }
        if (D0.y == my5Var.getMeasuredHeight() / 2.0f) {
            xjbVar.setStickyY(2);
        }
        xjbVar.setDelegate(this);
        xjbVar.setMaxWidth((int) (paintingSize.a - 20.0f));
        int i = this.F1;
        xjbVar.setTypeface(m58.e(i).j);
        xjbVar.setType(m58.e(i).h);
        my5Var.addView(xjbVar, qoe.c(-2.0f, -2));
        ao6 ao6Var = this.x0;
        if (ao6Var != null) {
            xjbVar.j(1.0f / ao6Var.c);
            xjbVar.f(-(ao6Var.k + ao6Var.d));
        }
        if (z) {
            r0(xjbVar);
            xjbVar.q();
            t0(xjbVar, false);
            xjbVar.getFocusedView().requestFocus();
            gm.E3(xjbVar.getFocusedView());
            this.J0 = true;
            int i2 = m58.e(i).g;
            iu7 iu7Var = this.k1;
            iu7Var.d(i2, true);
            iu7Var.setOutlineType(m58.e(i).h);
        }
        return xjbVar;
    }

    public final void g0() {
        w44 w44Var = this.I0;
        if ((w44Var instanceof xjb) && !this.J0) {
            xjb xjbVar = (xjb) w44Var;
            if (xjbVar instanceof kd1) {
                kd1 kd1Var = (kd1) xjbVar;
                kd1Var.z();
                if (kd1Var.E0 == null) {
                    return;
                }
            }
            this.J0 = true;
            xjbVar.q();
            View focusedView = xjbVar.getFocusedView();
            focusedView.requestFocus();
            gm.E3(focusedView);
        }
    }

    public int getAdditionalBottom() {
        return gm.L(24.0f);
    }

    public int getAdditionalTop() {
        return gm.L(48.0f);
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
        ao6 ao6Var = this.x0;
        if (ao6Var != null) {
            return ao6Var.d + ao6Var.k;
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
        gn[] gnVarArr;
        my5 my5Var = this.P0;
        int childCount = my5Var.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = my5Var.getChildAt(i);
            if (childAt instanceof z1b) {
                TLRPC.Document sticker = ((z1b) childAt).getSticker();
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
            } else if (childAt instanceof xjb) {
                CharSequence text = ((xjb) childAt).getText();
                if ((text instanceof Spanned) && (gnVarArr = (gn[]) ((Spanned) text).getSpans(0, text.length(), gn.class)) != null) {
                    for (gn gnVar : gnVarArr) {
                        if (gnVar != null) {
                            TLRPC.Document document = gnVar.document;
                            if (document == null) {
                                document = vm.e(this.F1, gnVar.getDocumentId());
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

    public e99 getRenderView() {
        return this.M0;
    }

    public float getSelectedEntityBottom() {
        w44 w44Var = this.I0;
        my5 my5Var = this.P0;
        if (w44Var == null) {
            return getY() + my5Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        w44Var.getLocationInWindow(iArr);
        return (my5Var.getScaleY() * this.I0.getHeight()) + iArr[1];
    }

    public jlb getThanosEffect() {
        if (!jlb.c()) {
            return null;
        }
        if (this.Q0 == null) {
            jlb jlbVar = new jlb(getContext(), new wx5(this, (byte) 0));
            this.Q0 = jlbVar;
            addView(jlbVar);
        }
        return this.Q0;
    }

    public final boolean h(MotionEvent motionEvent) {
        if (this.I0 != null) {
            t0(null, true);
        }
        float x = motionEvent.getX();
        ly5 ly5Var = this.M0;
        float translationX = ((x - ly5Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / ly5Var.getScaleX();
        float y = ((((motionEvent.getY() - ly5Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + gm.L(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / ly5Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-ly5Var.getRotation());
        double d2 = y;
        float measuredWidth = (ly5Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (ly5Var.getMeasuredHeight() / 2.0f) + ((float) wi8.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        ly5Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final int[] h0(w44 w44Var) {
        float[] fArr = this.X1;
        fArr[0] = w44Var.getWidth() / 2.0f;
        fArr[1] = w44Var.getHeight() / 2.0f;
        w44Var.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + w44Var.getLeft();
        fArr[1] = fArr[1] + w44Var.getTop();
        ViewParent parent = w44Var.getParent();
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
        Point point = gm.q;
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.P0.getRotation());
        double d2 = round2 - (point.y / 2.0f);
        iArr[0] = (point.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        iArr[1] = (point.y / 2) + ((int) wi8.d(radians, d2, Math.sin(radians) * d));
        return iArr;
    }

    @Override
    public final boolean i(w44 w44Var) {
        return t0(w44Var, true);
    }

    public final void i0(boolean z) {
        if (this.a2) {
            z0(0);
        }
        if (z) {
            e34 e34Var = this.Z1;
            if (e34Var != null && e34Var.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.Z1.getMeasuredHeight());
                ofFloat.addUpdateListener(new xx5(this, (byte) 0));
                this.c2 = true;
                ofFloat.addListener(new jy5(this, (byte) 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(gb.w);
                ofFloat.start();
                return;
            }
            j0();
        }
    }

    public final void j0() {
        e34 e34Var;
        mx5 mx5Var;
        if (this.d2 > 0 && (mx5Var = ((sa8) this).j2.L1) != null) {
            mx5Var.a();
        }
        if (!this.a2 && (e34Var = this.Z1) != null && e34Var.getVisibility() != 8) {
            this.Z1.setVisibility(8);
        }
        this.d2 = 0;
    }

    public final void k0() {
        boolean z;
        boolean z2;
        Bitmap bitmap = this.u0;
        x23 x23Var = null;
        try {
            try {
                x84 x84Var = new x84(getContext());
                x84Var.g(1);
                x84Var.f(1);
                x84Var.b = false;
                y84 a = x84Var.a();
                if (!a.c.k()) {
                    if (e21.a) {
                        fc4.d("face detection is not operational");
                    }
                } else {
                    in3 in3Var = new in3((byte) 4);
                    pd0 pd0Var = (pd0) in3Var.b;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    in3Var.d = bitmap;
                    pd0Var.a = width;
                    pd0Var.b = height;
                    pd0Var.c = getFrameRotation();
                    if (((ByteBuffer) in3Var.c) == null && ((Bitmap) in3Var.d) == null) {
                        throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
                    }
                    try {
                        SparseArray h = a.h(in3Var);
                        ArrayList arrayList = new ArrayList();
                        xka paintingSize = getPaintingSize();
                        for (int i = 0; i < h.size(); i++) {
                            w84 w84Var = (w84) h.get(h.keyAt(i));
                            int i2 = this.e1;
                            if (i2 % 360 != 90 && i2 % 360 != 270) {
                                z = false;
                            } else {
                                z = true;
                            }
                            c78 c78Var = new c78(w84Var, bitmap, paintingSize, z);
                            if (c78Var.d != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                arrayList.add(c78Var);
                            }
                        }
                        this.d1 = arrayList;
                    } catch (Throwable th) {
                        fc4.g(th, true);
                    }
                }
                a.d();
            } catch (Exception e) {
                fc4.g(e, true);
                if (0 != 0) {
                    x23Var.d();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                x23Var.d();
            }
            throw th2;
        }
    }

    public final void l0(Integer num) {
        int intValue = num.intValue();
        m58 m58Var = this.L1;
        m58Var.h(intValue, true);
        m58Var.g();
        setNewColor(num.intValue());
        int d = m58Var.d();
        ny5 ny5Var = this.w1;
        ny5Var.setSelectedColorIndex(d);
        ny5Var.getAdapter().f();
    }

    public final void m0(Integer num) {
        setNewColor(num.intValue());
        y0(false);
    }

    public final void n0() {
        z1b z1bVar;
        w44 w44Var = this.I0;
        if (w44Var != null) {
            PointF D0 = D0(w44Var);
            w44 w44Var2 = this.I0;
            boolean z = w44Var2 instanceof z1b;
            my5 my5Var = this.P0;
            if (z) {
                z1b z1bVar2 = new z1b(getContext(), (z1b) this.I0, D0);
                z1bVar2.setDelegate(this);
                my5Var.addView(z1bVar2);
                z1bVar = z1bVar2;
            } else if (w44Var2 instanceof xjb) {
                xjb xjbVar = new xjb(getContext(), (xjb) this.I0, D0);
                xjbVar.setDelegate(this);
                xjbVar.setMaxWidth((int) (getPaintingSize().a - 20.0f));
                my5Var.addView(xjbVar, qoe.c(-2.0f, -2));
                z1bVar = xjbVar;
            } else {
                z1bVar = null;
            }
            r0(z1bVar);
            t0(z1bVar, true);
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
        nm7.e().b(this, nm7.G5);
    }

    @Override
    public final void onDetachedFromWindow() {
        gd1 gd1Var = this.P1;
        if (gd1Var != null) {
            gd1Var.f(null);
            jd4 jd4Var = gd1Var.c;
            if (jd4Var != null) {
                jd4Var.f = null;
                u31 u31Var = (u31) jd4Var.g;
                if (u31Var != null) {
                    u31Var.b();
                    jd4Var.g = null;
                }
                gd1Var.c = null;
            }
            gd1Var.a.o(false);
        }
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.G5);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int Q;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        if (this.Z1 != null) {
            if (gm.O1()) {
                Q = i6 - this.Z1.getMeasuredHeight();
            } else {
                Q = (Q() + i6) - this.Z1.getMeasuredHeight();
            }
            e34 e34Var = this.Z1;
            e34Var.layout(0, Q, e34Var.getMeasuredWidth(), this.Z1.getMeasuredHeight() + Q);
        }
        if (!this.L0) {
            i7 = gm.m;
        }
        ly5 ly5Var = this.M0;
        int ceil = (int) Math.ceil((i5 - ly5Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + hg9.v(8.0f, (((i6 - (a.getCurrentActionBarHeight() + i7)) - gm.L(48.0f)) - ly5Var.getMeasuredHeight()) / 2, i7);
        ly5Var.layout(ceil, additionalTop, ly5Var.getMeasuredWidth() + ceil, ly5Var.getMeasuredHeight() + additionalTop);
        sb sbVar = this.N0;
        sbVar.layout(ceil, additionalTop, sbVar.getMeasuredWidth() + ceil, sbVar.getMeasuredHeight() + additionalTop);
        int measuredWidth = ly5Var.getMeasuredWidth();
        my5 my5Var = this.P0;
        int measuredWidth2 = ((measuredWidth - my5Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((ly5Var.getMeasuredHeight() - my5Var.getMeasuredHeight()) / 2) + additionalTop;
        my5Var.layout(measuredWidth2, measuredHeight, my5Var.getMeasuredWidth() + measuredWidth2, my5Var.getMeasuredHeight() + measuredHeight);
        jlb jlbVar = this.Q0;
        if (jlbVar != null) {
            jlbVar.layout(measuredWidth2, measuredHeight, my5Var.getMeasuredWidth() + measuredWidth2, my5Var.getMeasuredHeight() + measuredHeight);
        }
        a6 a6Var = this.O0;
        a6Var.layout(ceil, additionalTop, a6Var.getMeasuredWidth() + ceil, a6Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float currentActionBarHeight;
        float f;
        ad1 ad1Var;
        this.F0 = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((gm.q.y - a.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - gm.L(48.0f);
        Bitmap bitmap = this.t0;
        if (bitmap != null) {
            f = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - a.getCurrentActionBarHeight()) - gm.L(48.0f);
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
        my5 my5Var = this.P0;
        my5Var.setScaleX(f4);
        my5Var.setScaleY(this.G0);
        my5Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.H0.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.H0.b, 1073741824));
        jlb jlbVar = this.Q0;
        if (jlbVar != null) {
            jlbVar.measure(View.MeasureSpec.makeMeasureSpec((int) this.H0.a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.H0.b, 1073741824));
            this.Q0.setScaleX(this.G0);
            this.Q0.setScaleY(this.G0);
        }
        F0();
        this.O0.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        measureChild(this.S0, i, i2);
        measureChild(this.b1, i, i2);
        gd1 gd1Var = this.P1;
        if (gd1Var != null && (ad1Var = gd1Var.e) != null) {
            ad1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        measureChild(this.U0, i, i2);
        measureChild(this.T0, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.d2), 1073741824));
        FrameLayout frameLayout = this.R0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), gm.L(12.0f) + gm.m, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i, i2);
        this.F0 = false;
        if (gm.L(20.0f) >= 0 && !this.a2 && !this.c2) {
            this.F0 = true;
            j0();
            this.F0 = false;
        }
        if (gm.L(20.0f) < 0) {
            j0();
        }
        e34 e34Var = this.Z1;
        if (e34Var != null) {
            measureChild(e34Var, i, i2);
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

    public final void r0(w44 w44Var) {
        if (w44Var == null) {
            return;
        }
        this.v0.b(w44Var.getUUID(), new dy5(this, w44Var, (byte) 0));
    }

    @Override
    public final void requestLayout() {
        if (this.F0) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void s(u11 u11Var) {
        boolean z = u11Var instanceof o11;
        aw7 aw7Var = this.b1;
        if (!z && !(u11Var instanceof q11)) {
            aw7Var.b(0.05f, 1.0f);
        } else {
            aw7Var.b(0.4f, 1.75f);
        }
        aw7Var.setDrawCenter(!(u11Var instanceof t11));
        ly5 ly5Var = this.M0;
        if (ly5Var.getCurrentBrush() instanceof t11) {
            this.a1 = true;
        }
        ly5Var.setBrush(u11Var);
        oeb oebVar = this.A1;
        int i = oebVar.a;
        oebVar.a = m58.e(this.F1).c();
        oebVar.c = this.c1.get();
        u0(oebVar, Integer.valueOf(i));
        this.N0.invalidate();
    }

    public final void s0(w44 w44Var) {
        w44 w44Var2 = this.I0;
        if (w44Var == w44Var2 && w44Var2 != null) {
            w44Var2.l(w44Var2.o0, false);
            this.I0 = null;
            if (w44Var instanceof xjb) {
                ValueAnimator valueAnimator = this.Z0;
                if (valueAnimator != null && this.X0 != 0) {
                    valueAnimator.cancel();
                }
                E0(0);
            }
        }
        this.P0.removeView(w44Var);
        if (w44Var != null) {
            UUID uuid = w44Var.getUUID();
            b7c b7cVar = this.v0;
            b7cVar.b.remove(uuid);
            b7cVar.c.remove(uuid);
            gm.c3(new zcb(b7cVar, (byte) 28));
        }
        aw7 aw7Var = this.b1;
        k44 k44Var = this.c1;
        aw7Var.setValueOverride(k44Var);
        aw7Var.setShowPreview(true);
        float f = k44Var.get();
        oeb oebVar = this.A1;
        oebVar.c = f;
        u0(oebVar, null);
    }

    public void setBlurredBackgroundDrawableForTools(im0 im0Var) {
        im0Var.q(gm.L(4.0f));
        this.W1 = im0Var;
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
        mx5 mx5Var;
        if (!this.b2 && !this.a2) {
            f0(true);
            return;
        }
        boolean z = this.a2;
        if (z && (mx5Var = ((sa8) this).j2.L1) != null) {
            mx5Var.e = true;
        }
        z0(!z ? 1 : 0);
        if (z) {
            w44 w44Var = this.I0;
            if (w44Var instanceof xjb) {
                gm.E3(((xjb) w44Var).getEditText());
            }
        }
    }

    public final boolean t0(w44 w44Var, boolean z) {
        ry5 ry5Var;
        boolean z2;
        int i;
        int i2;
        boolean z3 = w44Var instanceof xjb;
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
            xjb xjbVar = (xjb) w44Var;
            int gravity = xjbVar.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i = 0;
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
            iu7 iu7Var = this.k1;
            iu7Var.setAlignment(i);
            iu7Var.setTypeface(xjbVar.getTypeface().a);
            iu7Var.e(xjbVar.getType(), true);
            this.T0.invalidate();
        }
        w44 w44Var2 = this.I0;
        if (w44Var2 != null) {
            if (w44Var2 == w44Var) {
                boolean z4 = this.J0;
                if (!z4 && (w44Var2 instanceof kd1) && !w44Var.f0) {
                    g0();
                    return true;
                } else if (!z4) {
                    int[] h0 = h0(w44Var2);
                    A0(new dy5(this, w44Var2, (byte) 2), this, 51, h0[0], h0[1] - gm.L(32.0f));
                    return true;
                } else {
                    if (w44Var2 instanceof xjb) {
                        gm.E3(((xjb) w44Var2).getFocusedView());
                        i0(false);
                    }
                    return true;
                }
            }
            ry5Var = this;
            w44Var2.l(w44Var2.o0, false);
            w44 w44Var3 = ry5Var.I0;
            if (w44Var3 instanceof xjb) {
                ((xjb) w44Var3).r();
                if (!z3) {
                    ry5Var.J0 = false;
                    gm.t1(((xjb) ry5Var.I0).getFocusedView());
                    ry5Var.i0(false);
                }
            }
            z2 = true;
        } else {
            ry5Var = this;
            z2 = false;
        }
        w44 w44Var4 = ry5Var.I0;
        ry5Var.I0 = w44Var;
        if ((w44Var4 instanceof xjb) && TextUtils.isEmpty(((xjb) w44Var4).getText()) && !(w44Var4 instanceof kd1)) {
            ry5Var.s0(w44Var4);
        }
        w44 w44Var5 = ry5Var.I0;
        k44 k44Var = ry5Var.c1;
        oeb oebVar = ry5Var.A1;
        aw7 aw7Var = ry5Var.b1;
        if (w44Var5 != null) {
            a6 a6Var = ry5Var.O0;
            w44Var5.o0 = a6Var;
            w44Var5.l(a6Var, true);
            ry5Var.P0.bringChildToFront(ry5Var.I0);
            w44 w44Var6 = ry5Var.I0;
            if (w44Var6 instanceof xjb) {
                xjb xjbVar2 = (xjb) w44Var6;
                xjbVar2.B0 = false;
                xjbVar2.getSwatch().c = oebVar.c;
                ry5Var.u0(xjbVar2.getSwatch(), null);
                ry5Var.setTextWeightRange(xjbVar2);
                aw7Var.setValueOverride(new fy5(xjbVar2, (int) (ry5Var.H0.a / 9.0f), (byte) 0));
                aw7Var.setShowPreview(false);
                return true;
            }
            aw7Var.setValueOverride(k44Var);
            aw7Var.setShowPreview(true);
            oebVar.c = k44Var.get();
            ry5Var.u0(oebVar, null);
            return true;
        }
        ValueAnimator valueAnimator2 = ry5Var.Z0;
        if (valueAnimator2 != null && ry5Var.X0 != 0) {
            valueAnimator2.cancel();
        }
        if (ry5Var.B1) {
            ry5Var.y0(false);
        }
        ry5Var.E0(0);
        aw7Var.setValueOverride(k44Var);
        aw7Var.setShowPreview(true);
        oebVar.c = k44Var.get();
        ry5Var.u0(oebVar, null);
        return z2;
    }

    @Override
    public final void u(float f, float f2, float[] fArr) {
        Point point = gm.q;
        double d = f - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.P0.getRotation());
        double d2 = f2 - (point.y / 2.0f);
        fArr[0] = (point.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        fArr[1] = (point.y / 2.0f) + ((float) wi8.d(radians, d2, Math.sin(radians) * d));
    }

    public final void u0(oeb oebVar, Integer num) {
        oeb oebVar2 = this.A1;
        if (oebVar2 != oebVar) {
            oebVar2.a = oebVar.a;
            oebVar2.b = oebVar.b;
            oebVar2.c = oebVar.c;
            int i = this.F1;
            m58.e(i).h(oebVar.a, true);
            m58.e(i).j(oebVar.c);
        }
        int i2 = oebVar.a;
        ly5 ly5Var = this.M0;
        ly5Var.setColor(i2);
        ly5Var.setBrushSize(oebVar.c);
        int i3 = oebVar2.a;
        if (num != null && num.intValue() != i3) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new u34(this, num, i3, (byte) 1));
            duration.start();
        } else {
            oy5 oy5Var = this.S0;
            if (oy5Var != null) {
                oy5Var.invalidate();
            }
        }
        w44 w44Var = this.I0;
        if ((w44Var instanceof xjb) && !this.O1) {
            ((xjb) w44Var).setSwatch(new oeb(oebVar.b, oebVar.c, oebVar.a));
        }
    }

    @Override
    public final void updateColors() {
        this.E1.setColor(-15132391);
    }

    @Override
    public final int[] v(w44 w44Var) {
        return h0(w44Var);
    }

    public final void v0(float f) {
        this.s0 = f;
        this.R0.setTranslationY(-f);
        this.S0.setTranslationY(f);
    }

    @Override
    public final m58 w() {
        return m58.e(this.F1);
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
            ao6 ao6Var = this.x0;
            if (ao6Var != null) {
                float f14 = ao6Var.c * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i2 = ao6Var.k;
                    if (i2 == 90 || i2 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f4 / ((int) (ao6Var.e * f11)), f5 / ((int) (ao6Var.f * f12)));
                    f7 = f14 * max;
                    float C = mlb.C(ao6Var.a, measuredWidth, f, max);
                    float f15 = ao6Var.c;
                    f8 = (C * f15) + f2;
                    f6 = 1.0f;
                    f9 = (ao6Var.b * measuredHeight * f * max * f15) + f13;
                    f10 = ao6Var.d + i2;
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
            zna znaVar = this.C1;
            if (znaVar != null) {
                znaVar.d();
            }
            float f2 = 1000.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1000.0f;
            }
            zna znaVar2 = new zna(new xk4(f));
            this.C1 = znaVar2;
            aoa aoaVar = new aoa();
            if (!z) {
                f2 = 0.0f;
            }
            aoaVar.i = f2;
            aoaVar.b(1250.0f);
            aoaVar.a(1.0f);
            znaVar2.m = aoaVar;
            if (!this.b2 && !this.a2) {
                z2 = false;
            } else {
                z2 = true;
            }
            final boolean[] zArr = {z2};
            final float translationY = this.S0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.C1.b(new it3() {
                @Override
                public final void a(zna znaVar3, float f3, float f4) {
                    int i;
                    ry5 ry5Var = ry5.this;
                    oy5 oy5Var = ry5Var.S0;
                    float f5 = f3 / 1000.0f;
                    ry5Var.D1 = f5;
                    float f6 = ((1.0f - f5) * 0.4f) + 0.6f;
                    ViewGroup viewGroup = barView;
                    viewGroup.setScaleX(f6);
                    viewGroup.setScaleY(f6);
                    viewGroup.setTranslationY((Math.min(ry5Var.D1, 0.25f) * gm.L(16.0f)) / 0.25f);
                    viewGroup.setAlpha(1.0f - (Math.min(ry5Var.D1, 0.25f) / 0.25f));
                    ny5 ny5Var = ry5Var.w1;
                    float f7 = ry5Var.D1;
                    boolean z3 = z;
                    ny5Var.B1(z3, f7);
                    ry5Var.r0.setProgress(ry5Var.D1);
                    ry5Var.q0.setProgress(ry5Var.D1);
                    ry5Var.V0.setTranslationY(gm.L(32.0f) * ry5Var.D1);
                    if (zArr[0]) {
                        float f8 = ry5Var.D1;
                        if (!z3) {
                            f8 = 1.0f - f8;
                        }
                        float L = gm.L(40.0f) * f8;
                        if (z3) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        oy5Var.setTranslationY(translationY - (L * i));
                    }
                    oy5Var.invalidate();
                    if (viewGroup == ry5Var.k1) {
                        ry5Var.T0.invalidate();
                    }
                }
            });
            this.C1.a(new ay5(this, z, (byte) 1));
            this.C1.h();
            if (z) {
                ny5 ny5Var = this.w1;
                ny5Var.setVisibility(0);
                ny5Var.setSelectedColorIndex(m58.e(this.F1).d());
            }
        }
    }

    @Override
    public final void z() {
        A0(new wx5(this, (byte) 5), this, 53, 0, getHeight());
    }

    public final void z0(int i) {
        boolean z;
        iu7 iu7Var = this.k1;
        if (i == 1) {
            e34 e34Var = this.Z1;
            if (e34Var != null && e34Var.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            e34 e34Var2 = this.Z1;
            if (e34Var2 != null && e34Var2.d1 != z8c.t0) {
                removeView(e34Var2);
                e34Var2 = null;
                this.Z1 = null;
            }
            if (e34Var2 == null) {
                e34 e34Var3 = new e34(null, true, false, false, getContext(), false, null, null, true, this.G1, false, false);
                this.Z1 = e34Var3;
                e34Var3.V0 = true;
                e34Var3.setVisibility(8);
                if (gm.O1()) {
                    this.Z1.setForseMultiwindowLayout(true);
                }
                this.Z1.setDelegate(new ky5(this));
                addView(this.Z1);
            }
            this.Z1.setVisibility(0);
            this.a2 = true;
            e34 e34Var4 = this.Z1;
            if (this.e2 <= 0) {
                if (gm.O1()) {
                    this.e2 = gm.L(150.0f);
                } else {
                    this.e2 = oc7.c1().getInt("kbd_height", gm.L(200.0f));
                }
            }
            int i2 = this.f2;
            if (i2 <= 0) {
                if (gm.O1()) {
                    i2 = gm.L(150.0f);
                    this.f2 = i2;
                } else {
                    i2 = oc7.c1().getInt("kbd_height_land3", gm.L(200.0f));
                    this.f2 = i2;
                }
            }
            Point point = gm.q;
            if (point.x <= point.y) {
                i2 = this.e2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e34Var4.getLayoutParams();
            layoutParams.height = i2;
            e34Var4.setLayoutParams(layoutParams);
            if (!gm.E && !gm.O1()) {
                w44 w44Var = this.I0;
                if (w44Var instanceof xjb) {
                    gm.t1(((xjb) w44Var).getEditText());
                }
            }
            this.d2 = i2;
            requestLayout();
            mx5 mx5Var = ((sa8) this).j2.L1;
            if (mx5Var != null) {
                mx5Var.a();
            }
            d02 emojiButton = iu7Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(b02.d, true);
            }
            getHeight();
            if (!z && !this.b2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.d2, 0.0f);
                ofFloat.addUpdateListener(new xx5(this, (byte) 1));
                ofFloat.addListener(new jy5(this, (byte) 0));
                ofFloat.start();
                return;
            }
            return;
        }
        d02 emojiButton2 = iu7Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(b02.e, true);
        }
        e34 e34Var5 = this.Z1;
        if (e34Var5 != null) {
            this.a2 = false;
            if (gm.D || gm.E) {
                e34Var5.setVisibility(8);
            }
        }
        if (i == 0) {
            this.d2 = 0;
        }
        mx5 mx5Var2 = ((sa8) this).j2.L1;
        if (mx5Var2 != null) {
            mx5Var2.a();
        }
        requestLayout();
        getHeight();
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void d(boolean z) {
    }

    @Override
    public final void e(boolean z) {
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
    public final void j(boolean z) {
    }

    @Override
    public final void x() {
    }
}
