package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;
public final class yic extends View {
    public static int A3;
    public static float B3;
    public static int u3;
    public static long y3;
    public static int z3;
    public long A0;
    public final RectF A1;
    public final Path A2;
    public float B0;
    public final RectF B1;
    public final kra B2;
    public long C0;
    public final RectF C1;
    public boolean C2;
    public float D0;
    public Drawable D1;
    public boolean D2;
    public final Matrix E;
    public float E0;
    public Drawable E1;
    public boolean E2;
    public LinearGradient F;
    public long F0;
    public Drawable F1;
    public long F2;
    public final gc G;
    public float G0;
    public final int G1;
    public long G2;
    public final Drawable H;
    public float H0;
    public LinearGradient H1;
    public float H2;
    public il0 I;
    public float I0;
    public LinearGradient I1;
    public float I2;
    public il0 J;
    public float J0;
    public final Matrix J1;
    public float J2;
    public float K;
    public boolean K0;
    public final TextPaint K1;
    public float K2;
    public float L;
    public final int L0;
    public final Matrix L1;
    public float L2;
    public boolean M;
    public LinearGradient M0;
    public final TextPaint M1;
    public float M2;
    public int N;
    public final Matrix N0;
    public il0 N1;
    public float N2;
    public int O;
    public String O0;
    public il0 O1;
    public float O2;
    public int P;
    public StaticLayout P0;
    public il0 P1;
    public float P2;
    public int Q;
    public StaticLayout Q0;
    public float Q1;
    public float Q2;
    public boolean R;
    public StaticLayout R0;
    public long R1;
    public float R2;
    public boolean S;
    public StaticLayout S0;
    public LinearGradient S1;
    public Bitmap S2;
    public boolean T;
    public float T0;
    public RadialGradient T1;
    public float[] T2;
    public float U;
    public LinearGradient U0;
    public LinearGradient U1;
    public float[] U2;
    public float V;
    public float V0;
    public final Paint V1;
    public int V2;
    public float W;
    public final Matrix W0;
    public final Paint W1;
    public int W2;
    public final Paint X0;
    public final Paint X1;
    public int X2;
    public long Y0;
    public final Paint Y1;
    public int Y2;
    public int Z0;
    public final Matrix Z1;
    public float Z2;
    public final c5a a;
    public float a0;
    public final ArrayList a1;
    public final RectF a2;
    public float a3;
    public final wjb b;
    public float b0;
    public int[] b1;
    public boolean b2;
    public float b3;
    public final om3 c;
    public float c0;
    public final ArrayList c1;
    public boolean c2;
    public float c3;
    public final TextPaint d;
    public float d0;
    public final Paint d1;
    public long d2;
    public boolean d3;
    public final TextPaint e;
    public float e0;
    public float e1;
    public float e2;
    public final Paint e3;
    public final TextPaint f;
    public int f0;
    public boolean f1;
    public float f2;
    public final Paint f3;
    public long g0;
    public final Path g1;
    public float g2;
    public final Paint g3;
    public int h;
    public long h0;
    public final Paint h1;
    public final RectF h2;
    public LinearGradient h3;
    public final RectF i0;
    public final Paint i1;
    public Drawable i2;
    public LinearGradient i3;
    public final RectF j0;
    public float j1;
    public il0 j2;
    public LinearGradient j3;
    public final RectF k0;
    public boolean k1;
    public boolean k2;
    public final Matrix k3;
    public final RectF l0;
    public float l1;
    public boolean l2;
    public LinearGradient l3;
    public final RectF m0;
    public float m1;
    public long m2;
    public final Matrix m3;
    public final TextPaint n;
    public boolean n0;
    public final String n1;
    public float n2;
    public float n3;
    public float o0;
    public String o1;
    public float[] o2;
    public final uic o3;
    public float p0;
    public String p1;
    public int p2;
    public boolean p3;
    public float q0;
    public String q1;
    public int q2;
    public boolean q3;
    public final Paint r;
    public float r0;
    public String r1;
    public float r2;
    public final int[] r3;
    public final Paint s;
    public float s0;
    public float s1;
    public float s2;
    public float t0;
    public float t1;
    public float t2;
    public float u0;
    public float u1;
    public float u2;
    public float v0;
    public float v1;
    public final ArrayList v2;
    public final Paint w;
    public float w0;
    public float w1;
    public final Paint w2;
    public final Paint x;
    public float x0;
    public float x1;
    public final RectF x2;
    public final Paint y;
    public float y0;
    public float y1;
    public final s33 y2;
    public float z0;
    public boolean z1;
    public final float[] z2;
    public static final float s3 = gl.L(19.0f);
    public static final float t3 = gl.L(3.0f);
    public static final float v3 = gl.L(3.0f);
    public static final float w3 = gl.N(0.5f);
    public static final float x3 = gl.L(6.0f);
    public static final s33 C3 = new s33(0.3d, 0.0d, 0.2d, 1.0d);
    public static final s33 D3 = bn3.J;

    public yic(Context context, wjb wjbVar, c5a c5aVar) {
        super(context);
        this.c = new om3();
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        this.h = 255;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        this.w = new Paint(1);
        this.x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        this.E = new Matrix();
        this.K = -1.0f;
        this.L = -1.0f;
        this.Q = 255;
        this.f0 = -1;
        this.i0 = new RectF();
        this.j0 = new RectF();
        this.k0 = new RectF();
        this.l0 = new RectF();
        this.m0 = new RectF();
        this.B0 = -1.0f;
        this.E0 = -1.0f;
        this.G0 = Float.NaN;
        this.L0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.N0 = new Matrix();
        this.O0 = "";
        this.W0 = new Matrix();
        Paint paint3 = new Paint(1);
        this.X0 = paint3;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(gl.N(1.0f));
        this.a1 = new ArrayList();
        this.b1 = new int[0];
        this.c1 = new ArrayList();
        this.d1 = new Paint(1);
        this.f1 = true;
        this.g1 = new Path();
        this.h1 = new Paint(1);
        this.i1 = new Paint(1);
        this.l1 = Float.NaN;
        this.n1 = k96.M0(2131745069, null);
        this.A1 = new RectF();
        this.B1 = new RectF();
        this.C1 = new RectF();
        this.G1 = gl.L(36.0f);
        this.J1 = new Matrix();
        this.K1 = new TextPaint(1);
        this.L1 = new Matrix();
        this.M1 = new TextPaint(1);
        this.V1 = new Paint(1);
        this.W1 = new Paint(1);
        this.X1 = new Paint(1);
        this.Y1 = new Paint(1);
        this.Z1 = new Matrix();
        this.a2 = new RectF();
        this.h2 = new RectF();
        this.o2 = new float[0];
        this.v2 = new ArrayList();
        this.w2 = new Paint(1);
        this.x2 = new RectF();
        this.y2 = s33.h;
        this.z2 = new float[2];
        this.A2 = new Path();
        this.B2 = new kra(2200);
        this.G2 = 900L;
        this.T2 = new float[0];
        this.U2 = new float[0];
        this.e3 = new Paint();
        this.f3 = new Paint();
        this.g3 = new Paint();
        this.k3 = new Matrix();
        this.m3 = new Matrix();
        this.o3 = new uic(this, (byte) 1);
        this.r3 = new int[2];
        this.b = wjbVar;
        this.a = c5aVar;
        gc gcVar = new gc(context);
        this.G = gcVar;
        gcVar.setCallback(this);
        this.H = context.getResources().getDrawable(2131232699).mutate();
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setTypeface(gl.o());
        paint.setStyle(style);
        paint.setStrokeWidth(gl.N(0.66f));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        E();
    }

    public static void B(xic xicVar, float f, float[] fArr) {
        float max = Math.max(0.0f, Math.min(1.0f, (f - xicVar.j) / 0.12f));
        float f2 = xicVar.l;
        float f3 = xicVar.d;
        float f4 = f2 - f3;
        if (xicVar.m) {
            fArr[0] = f3;
            fArr[1] = f2 - (f4 * max);
            return;
        }
        fArr[0] = (f4 * max) + f3;
        fArr[1] = f2;
    }

    public static ArrayList D(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str.length()) {
            while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
            if (i >= str.length()) {
                break;
            }
            int i2 = i;
            while (i2 < str.length() && !Character.isWhitespace(str.charAt(i2))) {
                i2++;
            }
            arrayList.add(new int[]{i, i2});
            i = i2;
        }
        return arrayList;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return tb4.A(1.0f, (float) Math.exp((-f3) / f4), f2 - f, f);
    }

    public final void A(float f, float f2, float f3, long j, Canvas canvas) {
        kra kraVar;
        float f4;
        float f5;
        int i;
        xic xicVar;
        float f6;
        char c;
        xic xicVar2;
        int i2;
        float f7;
        int i3;
        float f8;
        Canvas canvas2 = canvas;
        float f9 = ((float) (j - this.m2)) / 1000.0f;
        float f10 = 0.4f;
        float f11 = 1.0f;
        float f12 = 0.0f;
        float interpolation = this.y2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f9 - 0.08f) / 0.4f)));
        int i4 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i4);
        ArrayList arrayList = this.v2;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            xic xicVar3 = (xic) arrayList.get(i5);
            if (xicVar3.c) {
                float max = Math.max(f12, Math.min(f11, ((f9 - xicVar3.j) - 0.26f) / 0.12f));
                if (max <= f12) {
                    i5 = i6;
                } else {
                    float f13 = xicVar3.h;
                    float f14 = xicVar3.k;
                    float L = (gl.L(10.0f) + f14) * max;
                    float f15 = L + f13;
                    f4 = f10;
                    if (xicVar3.m) {
                        f13 += f14;
                    } else {
                        L = gl.L(4.0f);
                    }
                    float f16 = f13 - L;
                    float max2 = Math.max(f12, Math.min(f11, (((f9 - xicVar3.j) - 0.26f) - 0.12f) / 0.45f));
                    int i7 = this.O;
                    if (xicVar3.q) {
                        i3 = u3;
                    } else {
                        i3 = this.N;
                    }
                    f5 = f11;
                    textPaint.setColor(bm2.f(yjb.B(max2, 2.0f, 3.0f, max2 * max2), i7, i3));
                    textPaint.setAlpha((int) (255.0f * f3 * f5));
                    canvas2.save();
                    float f17 = f + f16;
                    float L2 = (f2 + xicVar3.i) - gl.L(40.0f);
                    if (xicVar3.m) {
                        f8 = f + xicVar3.h + xicVar3.k + gl.L(4.0f);
                    } else {
                        f8 = f + f15;
                    }
                    canvas2.clipRect(f17, L2, f8, f2 + xicVar3.i + gl.L(20.0f));
                    canvas2.drawText(xicVar3.a, f + xicVar3.h, f2 + xicVar3.i, textPaint);
                    canvas2.restore();
                    textPaint.setColor(this.N);
                    xicVar3.n = f + xicVar3.h;
                    xicVar3.o = f2 + xicVar3.i;
                }
            } else {
                f4 = f10;
                f5 = f11;
                if (xicVar3.b) {
                    boolean n = n(xicVar3);
                    float[] fArr = this.z2;
                    if (n) {
                        int indexOf = arrayList.indexOf(xicVar3);
                        int i8 = indexOf;
                        while (!m((xic) arrayList.get(i8))) {
                            i8++;
                        }
                        float f18 = this.s2;
                        float f19 = w3;
                        float f20 = xicVar3.f + f18 + f19;
                        f6 = 0.5f;
                        float f21 = (f18 + xicVar3.g) - f19;
                        float f22 = this.r2;
                        c = 1;
                        float f23 = v3;
                        RectF rectF = this.x2;
                        rectF.set((xicVar3.d + f22) - f23, f20, f22 + ((xic) arrayList.get(i8)).l + f23, f21);
                        Path path = this.A2;
                        path.rewind();
                        float f24 = x3;
                        xic xicVar4 = xicVar3;
                        path.addRoundRect(rectF, f24, f24, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i9 = this.P;
                        float f25 = f20;
                        Paint paint = this.w2;
                        paint.setColor(i9);
                        paint.setAlpha((int) (Color.alpha(this.P) * f3));
                        int i10 = indexOf;
                        while (i10 <= i8) {
                            xic xicVar5 = (xic) arrayList.get(i10);
                            B(xicVar5, f9, fArr);
                            float f26 = fArr[1];
                            float f27 = fArr[0];
                            if (f26 - f27 < 0.5f) {
                                xicVar2 = xicVar4;
                                i2 = i8;
                                f7 = f25;
                            } else {
                                if (f27 <= xicVar5.d + 0.5f && i10 == indexOf) {
                                    f27 -= f23;
                                }
                                if (f26 >= xicVar5.l - 0.5f && i10 == i8) {
                                    f26 += f23;
                                }
                                float f28 = this.r2;
                                float f29 = f28 + f27;
                                float f30 = f28 + f26;
                                xicVar2 = xicVar4;
                                i2 = i8;
                                f7 = f25;
                                canvas2 = canvas;
                                canvas2.drawRect(f29, f7, f30, f21, paint);
                            }
                            i10++;
                            f25 = f7;
                            i8 = i2;
                            xicVar4 = xicVar2;
                        }
                        xicVar = xicVar4;
                        canvas2.restore();
                    } else {
                        xicVar = xicVar3;
                        f6 = 0.5f;
                        c = 1;
                    }
                    B(xicVar, f9, fArr);
                    if (Math.min(fArr[c], (xicVar.d + xicVar.k) + gl.L(4.0f)) - Math.max(fArr[0], xicVar.d - gl.L(4.0f)) >= f6) {
                        canvas2.save();
                        float f31 = this.r2;
                        float f32 = fArr[0];
                        float f33 = xicVar.d;
                        if (f32 <= f33 + f6) {
                            f32 = f33 - gl.L(4.0f);
                        }
                        float f34 = f31 + f32;
                        float L3 = (this.s2 + xicVar.f) - gl.L(4.0f);
                        float f35 = this.r2;
                        float f36 = fArr[c];
                        if (f36 >= xicVar.l - f6) {
                            f36 = xicVar.d + xicVar.k + gl.L(4.0f);
                        }
                        canvas2.clipRect(f34, L3, f35 + f36, this.s2 + xicVar.g + gl.L(4.0f));
                        textPaint.setColor(u3);
                        textPaint.setAlpha((int) (f3 * 255.0f));
                        canvas2.drawText(xicVar.a, this.r2 + xicVar.d, this.s2 + xicVar.e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                    }
                } else {
                    float f37 = this.r2;
                    float f38 = xicVar3.d;
                    float f39 = ((((f + xicVar3.h) - f37) - f38) * interpolation) + f37 + f38;
                    float f40 = this.s2;
                    float f41 = xicVar3.e;
                    float f42 = ((((f2 + xicVar3.i) - f40) - f41) * interpolation) + f40 + f41;
                    if (!this.l2 && xicVar3.q) {
                        i = u3;
                    } else {
                        i = this.N;
                    }
                    textPaint.setColor(i);
                    textPaint.setAlpha((int) (255.0f * f3 * f5));
                    canvas2.drawText(xicVar3.a, f39, f42, textPaint);
                    textPaint.setColor(this.N);
                    xicVar3.n = f39;
                    xicVar3.o = f42;
                }
            }
            f11 = f5;
            i5 = i6;
            f10 = f4;
            f12 = 0.0f;
        }
        float f43 = f10;
        textPaint.setAlpha(255);
        float f44 = gl.p;
        while (true) {
            int i11 = this.q2;
            int i12 = this.p2;
            kraVar = this.B2;
            if (i11 >= i12) {
                break;
            }
            float[] fArr2 = this.o2;
            int i13 = i11 * 3;
            if (fArr2[i13 + 2] > f9) {
                break;
            }
            this.q2 = i11 + 1;
            float f45 = f + fArr2[i13];
            float f46 = f2 + fArr2[i13 + 1];
            RectF rectF2 = this.j0;
            if (f46 >= rectF2.top && f46 <= rectF2.bottom) {
                double d = kraVar.d() * 3.141592653589793d * 2.0d;
                float d2 = ((kraVar.d() * 18.0f) + 8.0f) * f44;
                this.B2.h((((float) Math.cos(d)) * d2) + f45, b00.w((float) Math.sin(d), d2, 0.7f, f46), f45, f46, ((kraVar.d() * f43) + 0.8f) * 0.26f);
            }
        }
        if (f9 >= this.n2) {
            this.k2 = false;
            arrayList.clear();
            kraVar.Q = gl.L(10.0f);
        }
    }

    public final boolean C(xic xicVar, boolean z) {
        float L;
        float L2;
        if (z) {
            L = xicVar.f;
            L2 = xicVar.g;
        } else {
            L = xicVar.i - gl.L(14.0f);
            L2 = xicVar.i + gl.L(4.0f);
        }
        if (L2 >= this.Q2 - gl.L(2.0f)) {
            if (L <= Math.max(1.0f, this.R2) + this.Q2 + gl.L(2.0f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E() {
        int v;
        float f;
        float f2;
        int i;
        int i2;
        int i3 = bkb.c6;
        wjb wjbVar = this.b;
        int v0 = bkb.v0(i3, wjbVar);
        boolean c = om3.c(v0);
        this.M = c;
        om3 om3Var = this.c;
        if (om3Var.h != c) {
            om3Var.h = c;
        }
        int v02 = bkb.v0(bkb.Oe, wjbVar) | (-16777216);
        om3.h(v02);
        om3Var.g(-6440822, v02);
        this.N = bkb.v0(bkb.Ke, wjbVar) | (-16777216);
        boolean z = this.M;
        if (z) {
            v = bm2.f(0.12f, v02, -1);
        } else {
            v = jm3.v(v02, v0, z);
        }
        this.O = v;
        if (this.M) {
            f = gl.L(7.0f);
        } else {
            f = 0.0f;
        }
        B3 = f;
        int i4 = this.O;
        if (this.M) {
            f2 = 0.18f;
        } else {
            f2 = 0.14f;
        }
        this.P = bkb.p1(f2, i4);
        u3 = this.O;
        this.d.setColor(this.N);
        int v03 = bkb.v0(bkb.Le, wjbVar);
        TextPaint textPaint = this.e;
        textPaint.setColor(v03);
        this.Q = Color.alpha(textPaint.getColor());
        int v04 = bkb.v0(bkb.F6, wjbVar);
        TextPaint textPaint2 = this.n;
        textPaint2.setColor(v04);
        int color = textPaint2.getColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.G.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.x.setColor(v02);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.w.setColor(this.O);
        if (this.M) {
            i = -651810255;
        } else {
            i = -335544321;
        }
        this.r.setColor(i);
        if (this.M) {
            i2 = 654311423;
        } else {
            i2 = 335544320;
        }
        this.s.setColor(i2);
        il0 il0Var = this.I;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        il0 il0Var2 = this.J;
        if (il0Var2 != null) {
            il0Var2.updateColors();
        }
        this.R0 = null;
        this.M0 = null;
        this.l3 = null;
        this.S1 = null;
        this.I1 = null;
        textPaint.setShader(null);
        invalidate();
    }

    public final void F() {
        float f;
        int i;
        int v0;
        int f2;
        int f3;
        int f4;
        int[] iArr;
        if (this.M0 == null) {
            int[] iArr2 = this.c.B;
            boolean z = this.M;
            wjb wjbVar = this.b;
            if (z) {
                i = bkb.Le;
                v0 = om3.d(bkb.v0(i, wjbVar));
            } else {
                i = bkb.Le;
                v0 = bkb.v0(i, wjbVar);
            }
            int i2 = v0 | (-16777216);
            if (this.M) {
                f2 = om3.e(-7359233);
            } else {
                f2 = bm2.f(0.55f, iArr2[0], iArr2[4]);
            }
            if (this.M) {
                f3 = om3.e(-7411982);
            } else {
                f3 = bm2.f(0.55f, iArr2[1], iArr2[4]);
            }
            if (this.M) {
                f4 = om3.e(-4940545);
            } else {
                f4 = bm2.f(0.55f, iArr2[2], iArr2[4]);
            }
            if (this.M) {
                int e = om3.e(-7359233);
                int e2 = om3.e(-5650177);
                iArr = new int[]{bm2.f(0.4f, i2, e), bm2.f(0.3f, i2, e2), bm2.f(0.4f, i2, e), bm2.f(0.3f, i2, e2)};
            } else {
                int v02 = bkb.v0(i, wjbVar);
                int alpha = Color.alpha(v02);
                int[] iArr3 = new int[4];
                iArr3[0] = f2;
                iArr3[1] = f3;
                iArr3[2] = f4;
                iArr3[3] = f2;
                for (int i3 = 0; i3 < 4; i3++) {
                    iArr3[i3] = bm2.o(bm2.f(0.12f, v02 | (-16777216), iArr3[i3]), alpha);
                }
                iArr = iArr3;
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.MIRROR);
            this.M0 = linearGradient;
            TextPaint textPaint = this.e;
            textPaint.setShader(linearGradient);
            textPaint.setColor(-1);
            this.Q = 148;
        }
        if (this.M) {
            f = 260.0f;
        } else {
            f = 160.0f;
        }
        float L = gl.L(f);
        Matrix matrix = this.N0;
        matrix.setScale(L, 1.0f);
        matrix.postTranslate((((float) (SystemClock.uptimeMillis() % 6000)) / 6000.0f) * 2.0f * L, 0.0f);
        this.M0.setLocalMatrix(matrix);
    }

    public final StaticLayout b(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.max(1, this.Z0)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public final void c(Canvas canvas, float f, float f2, float f3, float f4, long j) {
        if (!this.M) {
            return;
        }
        LinearGradient linearGradient = this.S1;
        Paint paint = this.W1;
        Paint paint2 = this.V1;
        Paint paint3 = this.X1;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{om3.e(-7447553), om3.e(-13649665), om3.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
            this.S1 = linearGradient2;
            paint2.setShader(linearGradient2);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
            this.T1 = radialGradient;
            paint.setShader(radialGradient);
            LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
            this.U1 = linearGradient3;
            paint3.setShader(linearGradient3);
            paint3.setStyle(Paint.Style.STROKE);
        }
        float f5 = ((float) (j % 5000)) / 5000.0f;
        Matrix matrix = this.Z1;
        matrix.setTranslate(4.0f * f5, 0.0f);
        float f6 = 2.6f * f3;
        matrix.postScale(f6, f6);
        matrix.postRotate(35.0f);
        matrix.postTranslate(f, f2);
        this.S1.setLocalMatrix(matrix);
        int i = (int) (255.0f * f4);
        paint2.setAlpha(i);
        canvas.drawCircle(f, f2, f3, paint2);
        float sin = 0.06f * f3 * ((float) Math.sin(f5 * 3.141592653589793d * 2.0d));
        float f7 = 0.62f * f3;
        matrix.setScale(1.35f * f3, f7);
        matrix.postTranslate(f + sin, f2 - f7);
        this.T1.setLocalMatrix(matrix);
        paint.setAlpha(i);
        canvas.drawCircle(f, f2, f3, paint);
        matrix.setScale(f3, f3);
        matrix.postTranslate(f, f2);
        this.U1.setLocalMatrix(matrix);
        paint3.setStrokeWidth(Math.max(1.0f, gl.N(0.8f)));
        paint3.setAlpha(i);
        canvas.drawCircle(f, f2, f3 - gl.N(0.4f), paint3);
    }

    public final void d(Canvas canvas, il0 il0Var, RectF rectF, float f) {
        int i;
        float height = rectF.height() / 2.0f;
        if (il0Var != null) {
            il0Var.r(height);
            il0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            il0Var.setAlpha((int) (f * 255.0f));
            il0Var.draw(canvas);
            return;
        }
        if (this.M) {
            i = 217;
        } else {
            i = 235;
        }
        Paint paint = this.r;
        paint.setAlpha((int) (i * f));
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    public final void e(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float f4;
        float f5;
        float f6;
        RectF rectF;
        float f7;
        PorterDuff.Mode mode;
        c5a c5aVar;
        float f8;
        float f9;
        float f10;
        boolean z2;
        int i;
        this.y1 = a(this.y1, this.o1 != null ? 1.0f : 0.0f, f2, 0.09f);
        this.r1 = this.o1;
        String str = this.q1;
        int i2 = this.G1;
        RectF rectF2 = this.j0;
        TextPaint textPaint = this.n;
        if (str != null) {
            f3 = 18.0f;
            f4 = 6.0f;
            if (textPaint.measureText(this.o1) + gl.L(6.0f) + gl.L(18.0f) + gl.L(12.0f) + gl.L(8.0f) + gl.L(8.0f) + gl.L(13.0f) > (rectF2.right - (((rectF2.left + gl.L(2.0f)) + i2) + gl.L(8.0f))) - ((this.T || !z) ? 0.0f : (textPaint.measureText(k96.M0(2131745448, null)) + (gl.L(8.0f) + (gl.L(22.0f) + (gl.L(12.0f) + gl.L(8.0f))))) + gl.L(16.0f))) {
                this.r1 = this.q1;
            }
        } else {
            f3 = 18.0f;
            f4 = 6.0f;
        }
        String str2 = this.r1;
        String str3 = this.n1;
        if (str2 == null) {
            str2 = str3;
        }
        float measureText = textPaint.measureText(str2);
        float f11 = this.x1;
        if (f11 <= 0.0f) {
            f5 = 22.0f;
        } else {
            f5 = 22.0f;
            measureText = a(f11, measureText, f2, 0.11f);
        }
        this.x1 = measureText;
        float L = rectF2.top - gl.L(8.0f);
        float f12 = this.s1;
        float B = yjb.B(f12, 2.0f, 3.0f, f12 * f12);
        int color = textPaint.getColor();
        float L2 = rectF2.left + gl.L(2.0f);
        float L3 = L - gl.L(36.0f);
        RectF rectF3 = this.B1;
        rectF3.set(L2, L3, i2 + L2, L);
        il0 il0Var = this.O1;
        c5a c5aVar2 = this.a;
        if (il0Var == null) {
            this.O1 = c5aVar2.h(this);
        }
        canvas.save();
        float f13 = 1.0f - B;
        canvas.translate(0.0f, gl.L(f4) * f13);
        float f14 = (B * 0.1f) + 0.9f;
        float B2 = yjb.B(this.u1, 0.06f, 1.0f, f14);
        canvas.scale(B2, B2, rectF3.centerX(), rectF3.centerY());
        d(canvas, this.O1, rectF3, f);
        Drawable drawable = this.E1;
        if (drawable == null) {
            drawable = getContext().getResources().getDrawable(2131232365).mutate();
            this.E1 = drawable;
        }
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
        this.E1.setAlpha((int) (f * 255.0f));
        int L4 = gl.L(18.5f);
        float f15 = L4 / 2.0f;
        float centerX = ((int) rectF3.centerX()) - f15;
        float centerY = ((int) rectF3.centerY()) - f15;
        this.E1.setBounds(Math.round(centerX), Math.round(centerY), Math.round(centerX) + L4, Math.round(centerY) + L4);
        this.E1.draw(canvas);
        canvas.restore();
        float L5 = rectF3.right + gl.L(8.0f);
        float f16 = this.x1;
        if (f16 <= 0.0f) {
            String str4 = this.r1;
            if (str4 == null) {
                str4 = str3;
            }
            f16 = textPaint.measureText(str4);
        }
        int L6 = gl.L(f3) + gl.L(12.0f);
        RectF rectF4 = this.A1;
        rectF4.set(L5, L3, gl.L(f4) + L6 + f16 + gl.L(8.0f) + gl.L(8.0f) + gl.L(13.0f) + L5, L);
        float max = Math.max(0.0f, 1.0f - (this.a0 * 2.0f));
        if (max < 0.01f && !this.z1) {
            rectF4.setEmpty();
        }
        if (this.z1 || max < 0.01f) {
            f6 = L3;
            rectF = rectF4;
            f7 = 0.01f;
            mode = mode2;
            c5aVar = c5aVar2;
            f8 = L;
            f9 = 0.0f;
        } else {
            float f17 = max * f;
            if (this.N1 == null) {
                this.N1 = c5aVar2.h(this);
            }
            canvas.save();
            canvas.translate(0.0f, gl.L(f4) * f13);
            float B4 = yjb.B(this.t1, 0.04f, 1.0f, f14);
            canvas.scale(B4, B4, rectF4.left + gl.L(f3), rectF4.bottom);
            d(canvas, this.N1, rectF4, f17);
            if (this.D1 == null) {
                this.D1 = getContext().getResources().getDrawable(2131232199).mutate();
            }
            int color2 = textPaint.getColor();
            float centerY2 = rectF4.centerY();
            f7 = 0.01f;
            this.D1.setColorFilter(new PorterDuffColorFilter(color2, mode2));
            float f18 = f17 * 255.0f;
            int i3 = (int) f18;
            this.D1.setAlpha(i3);
            int L7 = (int) (rectF4.left + gl.L(12.0f));
            int L8 = (int) (centerY2 - gl.L(9.0f));
            mode = mode2;
            c5aVar = c5aVar2;
            f6 = L3;
            this.D1.setBounds(L7, L8, gl.L(f3) + L7, gl.L(f3) + L8);
            this.D1.draw(canvas);
            float L9 = (rectF4.right - gl.L(13.0f)) - gl.L(4.0f);
            canvas.save();
            canvas.clipRect(rectF4.left, rectF4.top, L9 - gl.L(8.0f), rectF4.bottom);
            int alpha = textPaint.getAlpha();
            float L10 = rectF4.left + gl.L(12.0f) + gl.L(f3) + gl.L(f4);
            boolean z4 = this.o1 == null && this.y1 < 0.99f;
            TextPaint textPaint2 = this.M1;
            if (z4) {
                z2 = z4;
                if (this.H1 == null) {
                    f8 = L;
                    this.H1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                    textPaint2.setTypeface(textPaint.getTypeface());
                } else {
                    f8 = L;
                }
                textPaint2.setTextSize(textPaint.getTextSize());
                float measureText2 = textPaint.measureText(str3);
                float L11 = gl.L(36.0f);
                f10 = L9;
                rectF = rectF4;
                Matrix matrix = this.L1;
                matrix.setScale(L11, 1.0f);
                matrix.postTranslate(((Math.min(1.0f, ((float) (SystemClock.uptimeMillis() % 2200)) / 1100.0f) * ((L11 * 2.0f) + measureText2)) + (L10 - L11)) - (L11 / 2.0f), 0.0f);
                this.H1.setLocalMatrix(matrix);
                postInvalidateOnAnimation();
            } else {
                f10 = L9;
                rectF = rectF4;
                z2 = z4;
                f8 = L;
            }
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f19 = centerY2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            if (z2 && this.M) {
                if (this.I1 == null) {
                    int color3 = textPaint.getColor() | (-16777216);
                    int f20 = bm2.f(0.4f, color3, om3.e(-7359233));
                    this.I1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f20, bm2.f(0.28f, color3, om3.e(-5650177)), f20}, (float[]) null, Shader.TileMode.MIRROR);
                }
                float L12 = gl.L(200.0f);
                Matrix matrix2 = this.J1;
                matrix2.setScale(L12, 1.0f);
                i = i3;
                matrix2.postTranslate(((((float) (SystemClock.uptimeMillis() % 6000)) / 6000.0f) * 2.0f * L12) + L10, 0.0f);
                this.I1.setLocalMatrix(matrix2);
                Typeface typeface = textPaint.getTypeface();
                TextPaint textPaint3 = this.K1;
                textPaint3.setTypeface(typeface);
                textPaint3.setTextSize(textPaint.getTextSize());
                textPaint3.setShader(this.I1);
                textPaint3.setAlpha((int) ((1.0f - this.y1) * 0.62f * f18));
                canvas.drawText(str3, L10, f19, textPaint3);
                float f21 = this.y1;
                if (f21 > 0.01f && this.o1 != null) {
                    textPaint.setAlpha((int) (f21 * f18));
                    canvas.drawText(this.r1, L10, f19, textPaint);
                }
            } else {
                i = i3;
                textPaint.setAlpha((int) yjb.z(this.y1, 0.5f, 0.5f, f18));
                String str5 = this.r1;
                if (str5 == null) {
                    str5 = str3;
                }
                canvas.drawText(str5, L10, f19, textPaint);
            }
            if (z2 && SystemClock.uptimeMillis() % 2200 < 1100) {
                textPaint2.setShader(this.H1);
                textPaint2.setAlpha((int) ((1.0f - this.y1) * f18 * 0.55f));
                canvas.drawText(str3, L10, f19, textPaint2);
            }
            textPaint.setAlpha(alpha);
            canvas.restore();
            Path path = this.g1;
            boolean isEmpty = path.isEmpty();
            Paint paint = this.h1;
            if (isEmpty) {
                path.moveTo(-gl.N(3.8f), gl.N(1.9f));
                f9 = 0.0f;
                path.lineTo(0.0f, -gl.N(1.9f));
                path.lineTo(gl.N(3.8f), gl.N(1.9f));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(gl.N(1.75f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else {
                f9 = 0.0f;
            }
            paint.setColor(color2);
            paint.setAlpha(i);
            canvas.save();
            canvas.translate(f10, centerY2);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        }
        float a = a(this.w1, (this.T || !z) ? f9 : 1.0f, f2, 0.1f);
        this.w1 = a;
        int i4 = (a > f7 ? 1 : (a == f7 ? 0 : -1));
        RectF rectF5 = this.C1;
        if (i4 > 0) {
            String M0 = k96.M0(2131745448, null);
            float L13 = rectF.right + gl.L(8.0f);
            rectF5.set(L13, f6, textPaint.measureText(M0) + gl.L(12.0f) + L13 + gl.L(f5) + gl.L(8.0f) + gl.L(16.0f), f8);
            if (this.P1 == null) {
                this.P1 = c5aVar.h(this);
            }
            float f22 = this.w1;
            float B5 = yjb.B(f22, 2.0f, 3.0f, f22 * f22);
            float f23 = f22 * f;
            canvas.save();
            float B6 = yjb.B(this.v1, 0.04f, 1.0f, (B5 * 0.15f) + 0.85f);
            canvas.scale(B6, B6, rectF5.left, rectF5.centerY());
            d(canvas, this.P1, rectF5, f23);
            Drawable drawable2 = this.F1;
            if (drawable2 == null) {
                drawable2 = getContext().getResources().getDrawable(2131232805).mutate();
                this.F1 = drawable2;
            }
            drawable2.setColorFilter(new PorterDuffColorFilter(color, mode));
            int i5 = (int) (f23 * 255.0f);
            this.F1.setAlpha(i5);
            int L14 = (int) (rectF5.left + gl.L(12.0f));
            int centerY3 = (int) (rectF5.centerY() - gl.L(11.0f));
            this.F1.setBounds(L14, centerY3, gl.L(f5) + L14, gl.L(f5) + centerY3);
            this.F1.draw(canvas);
            int alpha2 = textPaint.getAlpha();
            textPaint.setAlpha(i5);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            canvas.drawText(M0, rectF5.left + gl.L(12.0f) + gl.L(f5) + gl.L(8.0f), rectF5.centerY() - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f), textPaint);
            textPaint.setAlpha(alpha2);
            canvas.restore();
            return;
        }
        rectF5.setEmpty();
    }

    public final void f(Canvas canvas, float f) {
        int i;
        float f2;
        float f3;
        int i2;
        int i3;
        Canvas canvas2;
        int i4;
        float L;
        float f4 = this.a0;
        float L2 = gl.L(36.0f);
        if (this.b2) {
            i = 2131745063;
        } else {
            i = 2131745064;
        }
        String M0 = k96.M0(i, null);
        float i5 = i();
        RectF rectF = this.j0;
        float L3 = rectF.left + gl.L(2.0f);
        float L4 = rectF.top - gl.L(8.0f);
        if (this.a.y()) {
            f2 = 2.0f;
            float L5 = this.G1 + L3 + gl.L(8.0f);
            float i6 = i();
            f3 = 8.0f;
            if (this.c2 && !this.b2) {
                i4 = gl.L(36.0f) + gl.L(6.0f);
            } else {
                i4 = 0;
            }
            if (i6 + i4 + L5 <= rectF.right - gl.L(56.0f)) {
                L = 0.0f;
                L3 = L5;
            } else {
                L = gl.L(8.0f) + L2;
            }
            if (Float.isNaN(this.l1)) {
                this.l1 = L3;
                this.m1 = L;
            } else {
                this.l1 = a(this.l1, L3, 0.016f, 0.07f);
                this.m1 = a(this.m1, L, 0.016f, 0.07f);
                if (Math.abs(this.l1 - L3) > 0.5f || Math.abs(this.m1 - L) > 0.5f) {
                    postInvalidateOnAnimation();
                }
            }
            if (this.a0 < 0.01f) {
                this.l1 = Float.NaN;
            }
            if (!Float.isNaN(this.l1)) {
                L3 = this.l1;
            }
            if (!Float.isNaN(this.l1)) {
                L = this.m1;
            }
            L4 -= L;
        } else {
            f2 = 2.0f;
            f3 = 8.0f;
        }
        RectF rectF2 = this.k0;
        rectF2.set(L3, L4 - L2, i5 + L3, L4);
        float f5 = 1.0f - f4;
        float min = 1.0f - Math.min(1.0f, f4 / 0.55f);
        float sin = ((((float) Math.sin(Math.min(1.0f, f4 / 0.8f) * 3.141592653589793d)) * 0.07f * f5) + ((1.0f - (min * min)) * 0.38f) + 0.62f) * L2;
        float f6 = L2 * 0.62f;
        float max = Math.max(sin, ((rectF2.width() - f6) * (1.0f - ((float) Math.pow(f5, 3.0d)))) + f6);
        float f7 = rectF2.left;
        float f8 = rectF2.bottom;
        RectF rectF3 = this.m0;
        rectF3.set(f7, f8 - sin, max + f7, f8);
        float min2 = Math.min(1.0f, 3.0f * f4) * f;
        float max2 = Math.max(0.0f, Math.min(1.0f, (f4 - 0.62f) / 0.38f)) * f;
        float f9 = 1.0f - (this.d0 * 0.04f);
        canvas.save();
        canvas.scale(f9, f9, rectF2.left + gl.L(18.0f), rectF2.bottom);
        float height = rectF3.height() / f2;
        if (this.J != null) {
            if (Math.abs(this.L - height) > 0.5f) {
                this.L = height;
                this.J.r(height);
            }
            this.J.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
            this.J.setAlpha((int) (min2 * 255.0f));
            this.J.draw(canvas);
        } else {
            if (this.M) {
                i2 = 217;
            } else {
                i2 = 235;
            }
            Paint paint = this.r;
            paint.setAlpha((int) (i2 * min2));
            canvas.drawRoundRect(rectF3, height, height, paint);
            if (this.M) {
                i3 = 38;
            } else {
                i3 = 20;
            }
            int i7 = (int) (i3 * min2);
            Paint paint2 = this.s;
            paint2.setAlpha(i7);
            canvas.drawRoundRect(rectF3, height, height, paint2);
        }
        if (max2 > 0.0f) {
            float centerY = rectF2.centerY();
            float L6 = rectF2.left + gl.L(12.0f);
            int i8 = (int) L6;
            gc gcVar = this.G;
            gcVar.setBounds(i8, (int) (centerY - gl.L(12.0f)), gl.L(24.0f) + i8, (int) (gl.L(12.0f) + centerY));
            int i9 = (int) (255.0f * max2);
            gcVar.setAlpha(i9);
            gcVar.draw(canvas);
            TextPaint textPaint = this.n;
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha(i9);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(M0, L6 + gl.L(6.0f) + gl.L(24.0f), centerY - ((fontMetrics.ascent + fontMetrics.descent) / f2), textPaint);
            textPaint.setAlpha(alpha);
            Path path = this.g1;
            boolean isEmpty = path.isEmpty();
            Paint paint3 = this.h1;
            if (isEmpty) {
                path.moveTo(-gl.N(3.8f), gl.N(1.9f));
                path.lineTo(0.0f, -gl.N(1.9f));
                path.lineTo(gl.N(3.8f), gl.N(1.9f));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(gl.N(1.75f));
                paint3.setStrokeCap(Paint.Cap.ROUND);
                paint3.setStrokeJoin(Paint.Join.ROUND);
            }
            float L7 = (((rectF2.right - gl.L(10.0f)) - gl.L(14.0f)) - gl.L(f3)) - gl.L(1.0f);
            this.j1 = L7;
            int p1 = bkb.p1(max2 * 0.14f, textPaint.getColor());
            Paint paint4 = this.i1;
            paint4.setColor(p1);
            canvas2 = canvas;
            canvas2.drawRect(L7, rectF2.centerY() - gl.L(10.0f), gl.L(1.0f) + L7, rectF2.centerY() + gl.L(10.0f), paint4);
            paint3.setColor(textPaint.getColor());
            paint3.setAlpha(i9);
            canvas2.save();
            canvas2.translate((rectF2.right - gl.L(10.0f)) - gl.L(7.0f), rectF2.centerY());
            canvas2.drawPath(path, paint3);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void g(Canvas canvas, float f) {
        float f2;
        int i;
        int color;
        float f3 = this.f2;
        if (this.c2 && !this.b2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        float a = a(f3, f2, 0.016f, 0.06f);
        this.f2 = a;
        int i2 = (a > 0.01f ? 1 : (a == 0.01f ? 0 : -1));
        RectF rectF = this.h2;
        if (i2 < 0) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.i2;
        c5a c5aVar = this.a;
        if (drawable == null) {
            this.i2 = getContext().getResources().getDrawable(2131231003).mutate();
            il0 h = c5aVar.h(this);
            this.j2 = h;
            if (h != null) {
                h.r(gl.L(18.0f));
            }
        }
        float L = gl.L(36.0f);
        RectF rectF2 = this.k0;
        rectF.set(rectF2.right + gl.L(6.0f), rectF2.top, rectF2.right + gl.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.a0 - 0.62f) / 0.38f));
        float f4 = this.f2;
        float f5 = f * f4 * max;
        if (f5 >= 0.01f) {
            float w = (1.0f - (this.g2 * 0.06f)) * b00.w(f4, 0.3f, max, 0.7f);
            canvas.save();
            canvas.scale(w, w, rectF.centerX(), rectF.centerY());
            il0 il0Var = this.j2;
            if (il0Var != null) {
                il0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.j2.setAlpha((int) (255.0f * f5));
                this.j2.draw(canvas);
            } else {
                if (this.M) {
                    i = 217;
                } else {
                    i = 235;
                }
                Paint paint = this.r;
                paint.setAlpha((int) (i * f5));
                float f6 = L / 2.0f;
                canvas.drawRoundRect(rectF, f6, f6, paint);
            }
            ((gjc) c5aVar.e).b.getClass();
            this.i2.setColorFilter(new PorterDuffColorFilter((-16777216) | this.n.getColor(), PorterDuff.Mode.SRC_IN));
            float L2 = gl.L(24.0f) / 2.0f;
            this.i2.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
            this.i2.setAlpha((int) (Color.alpha(color) * f5));
            this.i2.draw(canvas);
            canvas.restore();
            float f7 = this.f2;
            if (f7 > 0.01f && f7 < 0.99f) {
                postInvalidateOnAnimation();
            }
        }
    }

    public String getShownText() {
        return this.O0;
    }

    public final void h(Canvas canvas, float f, float f2, float f3, float f4, long j) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.Y1;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f3 * 255.0f));
        float z = yjb.z(f4, 0.3f, 0.7f, gl.N(8.5f));
        RectF rectF = this.a2;
        rectF.set(f - z, f2 - z, f + z, f2 + z);
        long j2 = j - this.R1;
        float f5 = (((float) (j2 % 1400)) / 1400.0f) * 2.0f;
        float min = Math.min(1.0f, f5);
        float B = yjb.B(min, 2.0f, 3.0f, min * min);
        float max = Math.max(0.0f, f5 - 1.0f);
        float f6 = ((float) ((j2 / 1400) % 18)) * 220.0f;
        float B2 = (yjb.B(max, 2.0f, 3.0f, max * max) * 220.0f) + f6;
        canvas.drawArc(rectF, ((((((float) (j2 % 6000)) / 6000.0f) * 360.0f) * 5.0f) + B2) % 360.0f, (((B * 220.0f) + f6) + 30.0f) - B2, false, paint);
    }

    public final float i() {
        int i;
        boolean z = this.b2;
        float L = gl.L(6.0f) + gl.L(24.0f) + gl.L(12.0f);
        if (z) {
            i = 2131745063;
        } else {
            i = 2131745064;
        }
        return this.n.measureText(k96.M0(i, null)) + L + gl.L(12.0f) + gl.L(1.0f) + gl.L(8.0f) + gl.L(14.0f) + gl.L(10.0f);
    }

    public final boolean j() {
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (uptimeMillis - ((wic) obj).c < 1520) {
                return true;
            }
        }
        return false;
    }

    public final void k(xic xicVar, ArrayList arrayList, int i) {
        if (arrayList != null && i < arrayList.size()) {
            float[] fArr = (float[]) arrayList.get(i);
            if (!Float.isNaN(fArr[0])) {
                float f = fArr[1] - this.P2;
                float f2 = xicVar.e;
                float f3 = f - f2;
                xicVar.d = fArr[0] - this.O2;
                xicVar.e = f2 + f3;
                xicVar.f += f3;
                xicVar.g += f3;
            }
        }
    }

    public final int l(float f, float f2) {
        if (this.R && this.W >= 0.6f && this.n3 <= 0.3f) {
            float L = gl.L(6.0f);
            if (this.s1 > 0.7f) {
                RectF rectF = this.B1;
                if (!rectF.isEmpty() && f >= rectF.left - L && f < rectF.right + gl.L(4.0f) && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
                    return 7;
                }
                if (!this.T) {
                    RectF rectF2 = this.A1;
                    if (!rectF2.isEmpty() && !this.z1 && f >= rectF2.left - gl.L(4.0f) && f < rectF2.right + gl.L(4.0f) && f2 >= rectF2.top - L && f2 <= rectF2.bottom + L) {
                        return 6;
                    }
                }
                if (this.w1 > 0.7f && !this.T) {
                    RectF rectF3 = this.C1;
                    if (!rectF3.isEmpty() && f >= rectF3.left - gl.L(4.0f) && f <= rectF3.right + L && f2 >= rectF3.top - L && f2 <= rectF3.bottom + L) {
                        return 8;
                    }
                }
            }
            if (this.a0 > 0.7f && this.T0 > 0.7f && !this.b2) {
                RectF rectF4 = this.l0;
                if (!rectF4.isEmpty() && f >= rectF4.left - L && f <= rectF4.right + L && f2 >= rectF4.top - L && f2 <= rectF4.bottom + L) {
                    return 0;
                }
            }
            RectF rectF5 = this.h2;
            if (!rectF5.isEmpty() && this.f2 > 0.7f && f >= rectF5.left - L && f <= rectF5.right + L && f2 >= rectF5.top - L && f2 <= rectF5.bottom + L) {
                return 5;
            }
            boolean z = this.b2;
            RectF rectF6 = this.k0;
            if (!z || rectF6.isEmpty() || !rectF6.contains(f, f2)) {
                if (this.a0 > 0.7f && !rectF6.isEmpty() && f >= rectF6.left - L && f <= rectF6.right + L && f2 >= rectF6.top - L && f2 <= rectF6.bottom + L) {
                    if (f >= this.j1) {
                        return 4;
                    }
                    return 1;
                } else if (this.j0.contains(f, f2)) {
                    return 2;
                } else {
                    return -1;
                }
            }
            return -1;
        }
        return -1;
    }

    public final boolean m(xic xicVar) {
        xic xicVar2;
        ArrayList arrayList = this.v2;
        int indexOf = arrayList.indexOf(xicVar) + 1;
        if (indexOf < arrayList.size()) {
            xicVar2 = (xic) arrayList.get(indexOf);
        } else {
            xicVar2 = null;
        }
        if (xicVar2 == null || !xicVar2.b || Math.abs(xicVar2.f - xicVar.f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean n(xic xicVar) {
        xic xicVar2;
        ArrayList arrayList = this.v2;
        int indexOf = arrayList.indexOf(xicVar);
        if (indexOf > 0) {
            xicVar2 = (xic) arrayList.get(indexOf - 1);
        } else {
            xicVar2 = null;
        }
        if (xicVar2 == null || !xicVar2.b || Math.abs(xicVar2.f - xicVar.f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void o(boolean r11, float r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yic.o(boolean, float):void");
    }

    @Override
    public final void onDraw(android.graphics.Canvas r63) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yic.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float L;
        int childCount;
        String str;
        byte b;
        int i;
        Object obj;
        int actionMasked = motionEvent.getActionMasked();
        uic uicVar = this.o3;
        int i2 = 3;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        removeCallbacks(uicVar);
                        this.f0 = -1;
                        this.K0 = false;
                        invalidate();
                        return true;
                    }
                } else {
                    int i3 = this.f0;
                    if ((i3 == 2 || i3 == 3 || this.K0) && this.J0 > 0.0f) {
                        float y = motionEvent.getY() - this.H0;
                        if (!this.K0 && Math.abs(y) > this.L0) {
                            this.K0 = true;
                            this.H0 = motionEvent.getY();
                            this.I0 = this.s0;
                            this.f0 = -1;
                        }
                        if (this.K0) {
                            this.G0 = Math.max(0.0f, Math.min(this.J0, this.I0 - (motionEvent.getY() - this.H0)));
                            invalidate();
                            return true;
                        }
                    }
                    int i4 = this.f0;
                    if (i4 >= 0 && i4 != 3 && l(motionEvent.getX(), motionEvent.getY()) != this.f0) {
                        removeCallbacks(uicVar);
                        this.f0 = -1;
                        invalidate();
                        return true;
                    }
                }
            } else {
                removeCallbacks(uicVar);
                int i5 = this.f0;
                if (i5 == 3) {
                    i5 = 2;
                }
                this.f0 = -1;
                if (this.K0) {
                    this.K0 = false;
                    invalidate();
                    return true;
                }
                invalidate();
                if (i5 >= 0 && l(motionEvent.getX(), motionEvent.getY()) == i5) {
                    performHapticFeedback(3);
                    c5a c5aVar = this.a;
                    if (i5 == 0) {
                        c5aVar.I();
                        return true;
                    } else if (i5 == 1) {
                        gjc gjcVar = (gjc) c5aVar.e;
                        ChatActivityEnterView chatActivityEnterView = gjcVar.b.a;
                        int i6 = ChatActivityEnterView.r7;
                        ArrayList J = chatActivityEnterView.z0().J();
                        if (J.isEmpty()) {
                            obj = ll3.c;
                        } else {
                            obj = J.get(0);
                        }
                        gjcVar.l(obj);
                        return true;
                    } else if (i5 == 4) {
                        gjc gjcVar2 = (gjc) c5aVar.e;
                        if (gjcVar2.K != null && !gjcVar2.n.trim().isEmpty()) {
                            c cVar = gjcVar2.b;
                            yic yicVar = gjcVar2.K;
                            ae9 ae9Var = new ae9(c5aVar, (byte) 26);
                            ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                            cja cjaVar = chatActivityEnterView2.c2;
                            RectF rectF = new RectF();
                            rectF.set(yicVar.k0);
                            if (!rectF.isEmpty() && cjaVar != null) {
                                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                                cjaVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                View view = new View(chatActivityEnterView2.getContext());
                                frameLayout.addView(view, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                frameLayout.post(new e57(cVar, yicVar, frameLayout, view, rectF, ae9Var, (byte) 8));
                                return true;
                            }
                        }
                    } else if (i5 == 5) {
                        gjc gjcVar3 = (gjc) c5aVar.e;
                        if (gjcVar3.g0 != null && !gjcVar3.i0) {
                            Log.d("VoiceLive", "field: back to the text before the style");
                            if (gjcVar3.h0) {
                                gjcVar3.e0 = gjcVar3.g0;
                                gjcVar3.f0 = gjcVar3.b().size();
                            } else {
                                gjcVar3.e0 = null;
                            }
                            gjcVar3.g0 = null;
                            yic yicVar2 = gjcVar3.K;
                            if (yicVar2 != null) {
                                yicVar2.setRevertShown(false);
                                gjcVar3.K.setRebuildNext(true);
                            }
                            gjcVar3.p();
                            yic yicVar3 = gjcVar3.K;
                            if (yicVar3 != null) {
                                yicVar3.setRebuildNext(false);
                                return true;
                            }
                        }
                    } else if (i5 == 6) {
                        gjc gjcVar4 = (gjc) c5aVar.e;
                        if (gjcVar4.K != null && ((b = gjcVar4.c) == 2 || b == 4)) {
                            String[] G = DictationAsr.G();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(k96.M0(2131745072, null));
                            boolean x = DictationAsr.x();
                            if (x) {
                                i = 0;
                            } else {
                                i = -1;
                            }
                            int i7 = i;
                            for (int i8 = 0; i8 < G.length; i8++) {
                                arrayList.add(jm3.r(G[i8]));
                                if (!x && i7 < 0 && DictationAsr.z(G[i8])) {
                                    i7 = i8 + 1;
                                }
                            }
                            zic zicVar = new zic(gjcVar4, G, (byte) 1);
                            c cVar2 = gjcVar4.b;
                            yic yicVar4 = gjcVar4.K;
                            ArrayList w = gjc.w(G, x, zicVar);
                            ChatActivityEnterView chatActivityEnterView3 = cVar2.a;
                            cja cjaVar2 = chatActivityEnterView3.c2;
                            RectF rectF2 = new RectF();
                            rectF2.set(yicVar4.A1);
                            if (!rectF2.isEmpty() && cjaVar2 != null) {
                                FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView3.getContext());
                                cjaVar2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                View view2 = new View(chatActivityEnterView3.getContext());
                                frameLayout2.addView(view2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                frameLayout2.post(new nx1(cVar2, yicVar4, frameLayout2, view2, rectF2, arrayList, w, i7, zicVar));
                                return true;
                            }
                        }
                    } else if (i5 == 7) {
                        gjc gjcVar5 = (gjc) c5aVar.e;
                        c cVar3 = gjcVar5.b;
                        byte b2 = gjcVar5.c;
                        if (b2 == 4) {
                            gjcVar5.t();
                            mu1 mu1Var = cVar3.a.F3;
                            if (mu1Var != null) {
                                mu1Var.presentFragment(new zka());
                                return true;
                            }
                        } else if (b2 == 2) {
                            cVar3.e();
                            gl.e3(new bjc(gjcVar5, (byte) 2), 300L);
                            return true;
                        }
                    } else if (i5 == 8) {
                        c5aVar.I();
                        return true;
                    } else {
                        gjc gjcVar6 = (gjc) c5aVar.e;
                        c cVar4 = gjcVar6.b;
                        if (gjcVar6.K != null && gjcVar6.c != 0) {
                            ChatActivityEnterView chatActivityEnterView4 = cVar4.a;
                            ChatActivityEnterView chatActivityEnterView5 = cVar4.a;
                            cja cjaVar3 = chatActivityEnterView4.c2;
                            if (cjaVar3 != null) {
                                EditTextBoldCursor editTextBoldCursor = gjcVar6.X;
                                if (editTextBoldCursor != null) {
                                    editTextBoldCursor.requestFocus();
                                    gl.F3(gjcVar6.X);
                                    return true;
                                }
                                wjb wjbVar = chatActivityEnterView4.L4;
                                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(gjcVar6.a);
                                editTextBoldCursor2.setBackground(null);
                                editTextBoldCursor2.setPadding(0, 0, 0, 0);
                                editTextBoldCursor2.setIncludeFontPadding(false);
                                ex1 ex1Var = chatActivityEnterView5.F0;
                                if (ex1Var != null) {
                                    L = ex1Var.getTextSize();
                                } else {
                                    L = gl.L(18.0f);
                                }
                                editTextBoldCursor2.setTextSize(0, L);
                                editTextBoldCursor2.setTextColor(bkb.v0(bkb.Ke, wjbVar));
                                int i9 = bkb.Oe;
                                int i10 = ChatActivityEnterView.r7;
                                editTextBoldCursor2.setCursorColor(chatActivityEnterView5.F0(i9) | (-16777216));
                                zkb.C(editTextBoldCursor2, bkb.kg, wjbVar);
                                zkb.l(editTextBoldCursor2, 36, bkb.lg, wjbVar);
                                editTextBoldCursor2.setCursorSize(gl.L(20.0f));
                                editTextBoldCursor2.setCursorWidth(2.0f);
                                editTextBoldCursor2.setGravity(51);
                                editTextBoldCursor2.setInputType(147457);
                                editTextBoldCursor2.setImeOptions(268435456);
                                editTextBoldCursor2.setText(gjcVar6.n);
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                                int size = gjcVar6.b().size();
                                gjcVar6.b0 = size;
                                gjcVar6.Y = size;
                                gjcVar6.Z = editTextBoldCursor2.length();
                                gjcVar6.a0 = "";
                                editTextBoldCursor2.addTextChangedListener(new jf6(gjcVar6, (byte) 23));
                                if (gjcVar6.K.getParent() == cjaVar3) {
                                    childCount = cjaVar3.indexOfChild(gjcVar6.K) + 1;
                                } else {
                                    childCount = cjaVar3.getChildCount();
                                }
                                cjaVar3.addView(editTextBoldCursor2, childCount, new FrameLayout.LayoutParams(1, 1, 51));
                                gjcVar6.X = editTextBoldCursor2;
                                editTextBoldCursor2.requestFocus();
                                gl.e3(new mhc(gjcVar6, editTextBoldCursor2, (byte) 4), 50L);
                                StringBuilder sb = new StringBuilder("field: editing in place (");
                                sb.append(gjcVar6.n.length());
                                sb.append(" chars, recording ");
                                if (gjcVar6.c == 2) {
                                    str = "on";
                                } else {
                                    str = "paused";
                                }
                                sb.append(str);
                                sb.append(")");
                                Log.d("VoiceLive", sb.toString());
                                gjcVar6.K.invalidate();
                            }
                        }
                    }
                }
            }
            return true;
        }
        this.K0 = false;
        int l = l(motionEvent.getX(), motionEvent.getY());
        this.f0 = l;
        if (l >= 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.H0 = motionEvent.getY();
            this.I0 = this.s0;
            int i11 = this.f0;
            if (i11 == 2 && !this.T) {
                this.f0 = 3;
            } else {
                i2 = i11;
            }
            if (i2 == 0) {
                postDelayed(uicVar, ViewConfiguration.getLongPressTimeout());
            }
            invalidate();
            return true;
        }
        return false;
    }

    public final void p(android.text.StaticLayout r14, android.text.StaticLayout r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yic.p(android.text.StaticLayout, android.text.StaticLayout):void");
    }

    public final void q(Canvas canvas, long j, float f, float f2, float f3, float f4, float f5) {
        float f6;
        kra kraVar;
        float f7 = ((float) (j - this.F2)) / 1000.0f;
        float r = r(f7);
        float r2 = r(f7 - 0.06f);
        float L = gl.L(22.0f);
        float f8 = -gl.L(8.0f);
        float L2 = gl.L(8.0f) + this.P0.getWidth();
        float f9 = -gl.L(40.0f);
        float L3 = gl.L(40.0f) + this.P0.getHeight();
        canvas.save();
        canvas.translate(f, f2);
        int saveLayer = canvas.saveLayer(f8, f9, L2, L3, null);
        int i = (int) (255.0f * f3);
        this.d.setAlpha(i);
        this.P0.draw(canvas);
        s(this.j3, r2 - gl.L(48.0f), r2);
        LinearGradient linearGradient = this.j3;
        Paint paint = this.g3;
        paint.setShader(linearGradient);
        canvas.drawRect(f8, f9, L2, L3, paint);
        s(this.i3, r2 - L, r2);
        LinearGradient linearGradient2 = this.i3;
        Paint paint2 = this.f3;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f8, f9, L2, L3, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.S2 != null && r - L < this.J2) {
            canvas.save();
            canvas.translate(this.K2, this.L2);
            float max = Math.max(L2, this.S2.getWidth());
            f6 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f8, this.M2 - gl.L(2.0f), max, this.M2 + this.N2 + gl.L(2.0f), null);
            Paint paint3 = this.e3;
            paint3.setAlpha(i);
            canvas.drawBitmap(this.S2, -this.Z2, -this.a3, paint3);
            s(this.h3, r, L + r);
            paint2.setShader(this.h3);
            canvas.drawRect(f8, f9, max, Math.max(L3, gl.L(40.0f) + this.S2.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        } else {
            f6 = 2.0f;
        }
        float f10 = gl.p;
        long j2 = this.G2;
        float max2 = Math.max(0.05f, ((float) Math.min(j2, j2 - (j - this.F2))) / 1000.0f);
        while (true) {
            int i2 = this.X2;
            int i3 = this.V2;
            kraVar = this.B2;
            if (i2 >= i3) {
                break;
            }
            float[] fArr = this.T2;
            int i4 = i2 * 3;
            if (fArr[i4 + 2] > r) {
                break;
            }
            kraVar.g(this.K2 + fArr[i4], this.L2 + fArr[i4 + 1], ((kraVar.d() * 34.0f) + 10.0f) * f10, (-((kraVar.d() * 20.0f) + 6.0f)) * f10, Math.min(max2, (kraVar.d() * 0.3f) + 0.26f), 0.0f);
            this.X2++;
        }
        float f11 = f4 - f2;
        while (true) {
            int i5 = this.Y2;
            if (i5 >= this.W2) {
                break;
            }
            float[] fArr2 = this.U2;
            int i6 = i5 * 3;
            if (fArr2[i6 + 2] > r) {
                break;
            }
            this.Y2 = i5 + 1;
            float f12 = fArr2[i6 + 1];
            if (f12 >= f11 - gl.L(f6) && f12 <= f11 + f5 + gl.L(f6)) {
                float f13 = f + this.U2[i6];
                float f14 = f2 + f12;
                kraVar.h((((kraVar.d() * 16.0f) + 6.0f) * f10) + f13, ((kraVar.d() - 0.5f) * 14.0f * f10) + f14, f13, f14, Math.min(max2, (kraVar.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f7 * 1000.0f >= ((float) this.G2)) {
            this.D2 = false;
            Bitmap bitmap = this.S2;
            if (bitmap != null) {
                bitmap.recycle();
                this.S2 = null;
            }
        }
    }

    public final float r(float f) {
        float interpolation = D3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f * 1000.0f) / (((float) this.G2) - 60.0f))));
        float f2 = this.I2;
        return tb4.A(this.J2, f2, interpolation, f2);
    }

    public final void s(LinearGradient linearGradient, float f, float f2) {
        float f3 = f / 1.3453624f;
        Matrix matrix = this.k3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, (f2 / 1.3453624f) - f3), 1.0f);
        matrix.postRotate(41.987213f);
        matrix.postTranslate(0.7432941f * f3, f3 * 0.6689647f);
        linearGradient.setLocalMatrix(matrix);
    }

    public void setBusy(boolean z) {
        if (this.b2 == z) {
            return;
        }
        this.b2 = z;
        if (z) {
            this.d2 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2;
        int i;
        String str = null;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        this.o1 = charSequence2;
        if (charSequence2 != null && charSequence2.endsWith(")")) {
            i = this.o1.lastIndexOf(" (");
        } else {
            i = -1;
        }
        if (i > 0) {
            str = this.o1.substring(0, i);
        }
        this.q1 = str;
        this.r1 = this.o1;
        invalidate();
    }

    public void setLanguagePillHidden(boolean z) {
        this.z1 = z;
        invalidate();
    }

    public void setLevel(float f) {
        this.U = Math.max(0.0f, Math.min(1.0f, f));
    }

    public void setListening(boolean z) {
        this.S = z;
        invalidate();
    }

    public void setPaused(boolean z) {
        if (this.T != z) {
            this.C0 = SystemClock.uptimeMillis();
        }
        this.T = z;
        invalidate();
    }

    public void setPillHidden(boolean z) {
        this.k1 = z;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.p1)) {
            return;
        }
        this.p1 = str;
        this.R0 = null;
        invalidate();
    }

    public void setRebuildNext(boolean z) {
        this.C2 = z;
    }

    public void setRevertShown(boolean z) {
        this.c2 = z;
        invalidate();
    }

    public final int t(int i, Bitmap bitmap, boolean z) {
        int i2;
        float f;
        float[] fArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(gl.p * 0.8f));
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = 90;
            if (i3 >= height) {
                break;
            }
            if (z) {
                float f2 = i3;
                float f3 = this.M2;
                float f4 = max;
                if (f2 >= f3 - f4) {
                    if (f2 > f3 + this.N2 + f4) {
                    }
                }
                i3 += max;
            }
            for (int i5 = 0; i5 < width; i5 += max) {
                if ((iArr[(i3 * width) + i5] >>> 24) > 90) {
                    i4++;
                }
            }
            i3 += max;
        }
        if (i4 > i) {
            f = i / i4;
        } else {
            f = 1.0f;
        }
        int min = Math.min(i4, i + 32) * 3;
        if (z) {
            fArr = this.T2;
        } else {
            fArr = this.U2;
        }
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < height) {
            if (z) {
                float f5 = i6;
                float f6 = this.M2;
                float f7 = max;
                if (f5 >= f6 - f7) {
                    if (f5 > f6 + this.N2 + f7) {
                    }
                }
                i6 += max;
                i2 = 90;
            }
            int i8 = 0;
            while (i8 < width) {
                if ((iArr[(i6 * width) + i8] >>> 24) > i2) {
                    kra kraVar = this.B2;
                    if (kraVar.d() <= f) {
                        int i9 = i7 + 1;
                        if (i9 * 3 <= fArr.length) {
                            float f8 = max;
                            float d = ((kraVar.d() - 0.5f) * f8) + i8;
                            float d2 = ((kraVar.d() - 0.5f) * f8) + i6;
                            int i10 = i7 * 3;
                            fArr[i10] = d;
                            fArr[i10 + 1] = d2;
                            fArr[i10 + 2] = (d2 * 0.9f) + d;
                            i7 = i9;
                        }
                    }
                }
                i8 += max;
                i2 = 90;
            }
            i6 += max;
            i2 = 90;
        }
        Integer[] numArr = new Integer[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            numArr[i11] = Integer.valueOf(i11);
        }
        Arrays.sort(numArr, new ml3(fArr, (byte) 3));
        float[] copyOf = Arrays.copyOf(fArr, i7 * 3);
        for (int i12 = 0; i12 < i7; i12++) {
            int i13 = i12 * 3;
            int intValue = numArr[i12].intValue() * 3;
            fArr[i13] = copyOf[intValue];
            fArr[i13 + 1] = copyOf[intValue + 1];
            fArr[i13 + 2] = copyOf[intValue + 2];
        }
        if (z) {
            this.T2 = fArr;
            return i7;
        }
        this.U2 = fArr;
        return i7;
    }

    public final float u(long j) {
        return D3.getInterpolation(Math.max(0.0f, Math.min(1.0f, ((float) (j - this.F2)) / ((float) this.G2))));
    }

    public final float v(float f) {
        float f2 = 0.0f;
        if (this.J2 <= this.I2) {
            return 0.0f;
        }
        float f3 = ((float) this.G2) / 1000.0f;
        for (int i = 0; i < 24; i++) {
            float f4 = (f2 + f3) / 2.0f;
            if (r(f4) < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
        return Math.min(f3, ((float) this.G2) / 1000.0f);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.G && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w() {
        float lineLeft;
        float lineRight;
        if (this.Z0 > 0) {
            if (this.O0.isEmpty()) {
                this.P0 = null;
                return;
            }
            SpannableString spannableString = new SpannableString(this.O0);
            ArrayList arrayList = this.a1;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                wic wicVar = (wic) obj;
                int i2 = wicVar.b;
                if (i2 > wicVar.a && i2 <= spannableString.length()) {
                    spannableString.setSpan(new pn3(wicVar, (byte) 1), wicVar.a, wicVar.b, 33);
                }
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int[] iArr = this.b1;
                if (i4 >= iArr.length) {
                    break;
                }
                int max = Math.max(0, iArr[i3]);
                int min = Math.min(spannableString.length(), this.b1[i4]);
                if (min > max) {
                    spannableString.setSpan(new vic((byte) 0), max, min, 33);
                }
                i3 += 2;
            }
            this.P0 = b(spannableString, this.d);
            ArrayList arrayList2 = this.c1;
            arrayList2.clear();
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                int[] iArr2 = this.b1;
                if (i6 < iArr2.length) {
                    int max2 = Math.max(0, iArr2[i5]);
                    int min2 = Math.min(spannableString.length(), this.b1[i6]);
                    if (min2 > max2) {
                        int lineForOffset = this.P0.getLineForOffset(max2);
                        int lineForOffset2 = this.P0.getLineForOffset(min2);
                        for (int i7 = lineForOffset; i7 <= lineForOffset2; i7++) {
                            StaticLayout staticLayout = this.P0;
                            if (i7 == lineForOffset) {
                                lineLeft = staticLayout.getPrimaryHorizontal(max2);
                            } else {
                                lineLeft = staticLayout.getLineLeft(i7);
                            }
                            StaticLayout staticLayout2 = this.P0;
                            if (i7 == lineForOffset2) {
                                lineRight = staticLayout2.getPrimaryHorizontal(min2);
                            } else {
                                lineRight = staticLayout2.getLineRight(i7);
                            }
                            if ((i7 != lineForOffset2 || min2 <= 0 || min2 != this.P0.getLineStart(i7)) && lineRight - lineLeft >= 1.0f) {
                                float f = v3;
                                float f2 = w3;
                                arrayList2.add(new RectF(lineLeft - f, this.P0.getLineTop(i7) + f2, lineRight + f, this.P0.getLineBottom(i7) - f2));
                            }
                        }
                    }
                    i5 += 2;
                } else {
                    return;
                }
            }
        }
    }

    public final void x(java.util.ArrayList r42, boolean[] r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yic.x(java.util.ArrayList, boolean[], boolean):void");
    }

    public final void y(long j) {
        int i;
        int i2;
        float f;
        if (!this.b2) {
            return;
        }
        if (this.l3 == null) {
            if (this.M) {
                i = -10777345;
            } else {
                i = -15374904;
            }
            int e = om3.e(i);
            if (this.M) {
                i2 = -6128385;
            } else {
                i2 = -15823740;
            }
            int e2 = om3.e(i2);
            if (this.M) {
                f = 0.6f;
            } else {
                f = 0.75f;
            }
            int f2 = bm2.f(f, this.N, e);
            int f3 = bm2.f(f, this.N, e2);
            this.l3 = new LinearGradient(0.0f, 0.0f, gl.L(150.0f), 0.0f, new int[]{this.N, f2, bm2.f(0.5f, f2, f3), f3, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
        }
        float f4 = ((float) (j - this.d2)) / 1000.0f;
        float sin = (((float) Math.sin((0.23f * f4) + 1.3f)) * 12.0f) + (((float) Math.sin(0.45f * f4)) * 28.0f);
        Matrix matrix = this.m3;
        matrix.reset();
        matrix.setRotate(sin);
        matrix.postTranslate(gl.L(46.0f) * f4, gl.L(10.0f) * ((float) Math.sin(f4 * 0.7f)));
        this.l3.setLocalMatrix(matrix);
        this.d.setShader(this.l3);
    }

    public final void z() {
        if (this.I == null) {
            c5a c5aVar = this.a;
            this.I = c5aVar.h(this);
            this.J = c5aVar.h(this);
        }
        if (!this.R) {
            this.R = true;
            this.h0 = SystemClock.uptimeMillis();
            this.n0 = false;
            this.c.f();
            this.D2 = false;
            Bitmap bitmap = this.S2;
            if (bitmap != null) {
                bitmap.recycle();
                this.S2 = null;
            }
            this.k2 = false;
            this.B2.a();
            this.c2 = false;
            this.f2 = 0.0f;
            this.r1 = null;
            this.q1 = null;
            this.o1 = null;
            this.p1 = null;
            this.R0 = null;
            this.s1 = 0.0f;
            this.b2 = false;
            this.e2 = 0.0f;
            this.Q1 = 0.0f;
            this.C2 = false;
            this.p3 = false;
            this.q3 = false;
        }
        setVisibility(0);
        invalidate();
    }
}
