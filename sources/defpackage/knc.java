package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
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
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;
public final class knc extends View {
    public static int L3;
    public static long P3;
    public static int Q3;
    public static int R3;
    public static float S3;
    public float A0;
    public final String A1;
    public boolean A2;
    public final Matrix A3;
    public long B0;
    public String B1;
    public boolean B2;
    public LinearGradient B3;
    public float C0;
    public String C1;
    public long C2;
    public LinearGradient C3;
    public long D0;
    public rx D1;
    public float D2;
    public final Matrix D3;
    public final Matrix E;
    public float E0;
    public String E1;
    public float[] E2;
    public float E3;
    public LinearGradient F;
    public float F0;
    public String F1;
    public int F2;
    public final gnc F3;
    public final hc G;
    public long G0;
    public float G1;
    public int G2;
    public boolean G3;
    public final Drawable H;
    public float H0;
    public float H1;
    public float H2;
    public boolean H3;
    public jl0 I;
    public float I0;
    public float I1;
    public float I2;
    public final int[] I3;
    public jl0 J;
    public float J0;
    public float J1;
    public float J2;
    public float K;
    public float K0;
    public float K1;
    public float K2;
    public float L;
    public boolean L0;
    public float L1;
    public final ArrayList L2;
    public boolean M;
    public final int M0;
    public float M1;
    public final Paint M2;
    public int N;
    public LinearGradient N0;
    public boolean N1;
    public final RectF N2;
    public int O;
    public final Matrix O0;
    public final RectF O1;
    public final k43 O2;
    public int P;
    public String P0;
    public final RectF P1;
    public final float[] P2;
    public int Q;
    public StaticLayout Q0;
    public final RectF Q1;
    public final Path Q2;
    public boolean R;
    public StaticLayout R0;
    public Drawable R1;
    public final mva R2;
    public boolean S;
    public StaticLayout S0;
    public Drawable S1;
    public boolean S2;
    public boolean T;
    public StaticLayout T0;
    public Drawable T1;
    public boolean T2;
    public float U;
    public float U0;
    public final int U1;
    public boolean U2;
    public float V;
    public LinearGradient V0;
    public LinearGradient V1;
    public long V2;
    public float W;
    public float W0;
    public LinearGradient W1;
    public long W2;
    public final Matrix X0;
    public final Matrix X1;
    public float X2;
    public final Paint Y0;
    public final TextPaint Y1;
    public float Y2;
    public long Z0;
    public final Matrix Z1;
    public float Z2;
    public final lyc a;
    public float a0;
    public int a1;
    public final TextPaint a2;
    public float a3;
    public final vnb b;
    public float b0;
    public float b1;
    public jl0 b2;
    public float b3;
    public final gn3 c;
    public float c0;
    public long c1;
    public jl0 c2;
    public float c3;
    public final TextPaint d;
    public float d0;
    public final ArrayList d1;
    public jl0 d2;
    public float d3;
    public final TextPaint e;
    public float e0;
    public boolean e1;
    public String[] e2;
    public float e3;
    public final TextPaint f;
    public int f0;
    public int[] f1;
    public float f2;
    public float f3;
    public long g0;
    public final ArrayList g1;
    public long g2;
    public float g3;
    public int h;
    public long h0;
    public final Paint h1;
    public LinearGradient h2;
    public float h3;
    public final RectF i0;
    public float i1;
    public RadialGradient i2;
    public Bitmap i3;
    public final RectF j0;
    public boolean j1;
    public LinearGradient j2;
    public float[] j3;
    public final RectF k0;
    public float k1;
    public final Paint k2;
    public float[] k3;
    public final RectF l0;
    public float l1;
    public final Paint l2;
    public int l3;
    public final RectF m0;
    public boolean m1;
    public final Paint m2;
    public int m3;
    public final TextPaint n;
    public boolean n0;
    public int n1;
    public final Paint n2;
    public int n3;
    public float o0;
    public boolean o1;
    public final Matrix o2;
    public int o3;
    public float p0;
    public float p1;
    public final RectF p2;
    public float p3;
    public float q0;
    public boolean q1;
    public boolean q2;
    public float q3;
    public final Paint r;
    public float r0;
    public final RectF r1;
    public boolean r2;
    public float r3;
    public final Paint s;
    public float s0;
    public final Path s1;
    public long s2;
    public float s3;
    public float t0;
    public final Path t1;
    public float t2;
    public boolean t3;
    public float u0;
    public final Paint u1;
    public float u2;
    public final Paint u3;
    public float v0;
    public final Paint v1;
    public float v2;
    public final Paint v3;
    public final Paint w;
    public float w0;
    public float w1;
    public final RectF w2;
    public final Paint w3;
    public final Paint x;
    public float x0;
    public boolean x1;
    public Drawable x2;
    public LinearGradient x3;
    public final Paint y;
    public float y0;
    public float y1;
    public jl0 y2;
    public LinearGradient y3;
    public float z0;
    public float z1;
    public boolean z2;
    public LinearGradient z3;
    public static final float J3 = hl.L(19.0f);
    public static final float K3 = hl.L(3.0f);
    public static final float M3 = hl.L(3.0f);
    public static final float N3 = hl.N(0.5f);
    public static final float O3 = hl.L(6.0f);
    public static final k43 T3 = new k43(0.3d, 0.0d, 0.2d, 1.0d);
    public static final k43 U3 = sn3.J;

    public knc(Context context, vnb vnbVar, lyc lycVar) {
        super(context);
        this.c = new gn3();
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
        this.t0 = -1.0f;
        this.C0 = -1.0f;
        this.F0 = -1.0f;
        this.H0 = Float.NaN;
        this.M0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.O0 = new Matrix();
        this.P0 = "";
        this.X0 = new Matrix();
        Paint paint3 = new Paint(1);
        this.Y0 = paint3;
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(hl.N(1.0f));
        this.b1 = -1.0f;
        this.d1 = new ArrayList();
        this.f1 = new int[0];
        this.g1 = new ArrayList();
        this.h1 = new Paint(1);
        this.j1 = true;
        this.k1 = 1.0f;
        this.l1 = 1.0f;
        this.r1 = new RectF();
        this.s1 = new Path();
        this.t1 = new Path();
        this.u1 = new Paint(1);
        this.v1 = new Paint(1);
        this.y1 = Float.NaN;
        this.A1 = ob6.M0(2131744986, null);
        this.O1 = new RectF();
        this.P1 = new RectF();
        this.Q1 = new RectF();
        this.U1 = hl.L(36.0f);
        this.X1 = new Matrix();
        this.Y1 = new TextPaint(1);
        this.Z1 = new Matrix();
        this.a2 = new TextPaint(1);
        this.k2 = new Paint(1);
        this.l2 = new Paint(1);
        this.m2 = new Paint(1);
        this.n2 = new Paint(1);
        this.o2 = new Matrix();
        this.p2 = new RectF();
        this.w2 = new RectF();
        this.E2 = new float[0];
        this.L2 = new ArrayList();
        this.M2 = new Paint(1);
        this.N2 = new RectF();
        this.O2 = k43.h;
        this.P2 = new float[2];
        this.Q2 = new Path();
        this.R2 = new mva(2200);
        this.W2 = 900L;
        this.j3 = new float[0];
        this.k3 = new float[0];
        this.u3 = new Paint();
        this.v3 = new Paint();
        this.w3 = new Paint();
        this.A3 = new Matrix();
        this.D3 = new Matrix();
        this.F3 = new gnc(this, (byte) 1);
        this.I3 = new int[2];
        this.b = vnbVar;
        this.a = lycVar;
        hc hcVar = new hc(context);
        this.G = hcVar;
        hcVar.setCallback(this);
        this.H = context.getResources().getDrawable(2131232710).mutate();
        textPaint.setTextSize(hl.L(15.0f));
        textPaint.setTypeface(hl.o());
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(0.66f));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        K();
    }

    public static void H(jnc jncVar, float f, float[] fArr) {
        float max = Math.max(0.0f, Math.min(1.0f, (f - jncVar.j) / 0.12f));
        float f2 = jncVar.l;
        float f3 = jncVar.d;
        float f4 = f2 - f3;
        if (jncVar.m) {
            fArr[0] = f3;
            fArr[1] = f2 - (f4 * max);
            return;
        }
        fArr[0] = (f4 * max) + f3;
        fArr[1] = f2;
    }

    public static ArrayList J(String str) {
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
        return qd4.A(1.0f, (float) Math.exp((-f3) / f4), f2 - f, f);
    }

    public static int d(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        int i = 0;
        while (i < min && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        while (i > 0 && !Character.isWhitespace(str2.charAt(i - 1))) {
            i--;
        }
        return i;
    }

    public static int t(int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < iArr.length) {
                i2 += Math.max(0, iArr[i3] - iArr[i]);
                i += 2;
            } else {
                return i2;
            }
        }
    }

    public final float A(long j) {
        return U3.getInterpolation(Math.max(0.0f, Math.min(1.0f, ((float) (j - this.V2)) / ((float) this.W2))));
    }

    public final float B(float f) {
        float f2 = 0.0f;
        if (this.Z2 <= this.Y2) {
            return 0.0f;
        }
        float f3 = ((float) this.W2) / 1000.0f;
        for (int i = 0; i < 24; i++) {
            float f4 = (f2 + f3) / 2.0f;
            if (x(f4) < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
        return Math.min(f3, ((float) this.W2) / 1000.0f);
    }

    public final void C() {
        float lineLeft;
        float lineRight;
        if (this.a1 > 0) {
            if (this.P0.isEmpty()) {
                this.Q0 = null;
                return;
            }
            SpannableString spannableString = new SpannableString(this.P0);
            ArrayList arrayList = this.d1;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                inc incVar = (inc) obj;
                int i2 = incVar.b;
                if (i2 > incVar.a && i2 <= spannableString.length()) {
                    spannableString.setSpan(new go3(incVar, (byte) 1), incVar.a, incVar.b, 33);
                }
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int[] iArr = this.f1;
                if (i4 >= iArr.length) {
                    break;
                }
                int max = Math.max(0, iArr[i3]);
                int min = Math.min(spannableString.length(), this.f1[i4]);
                if (min > max) {
                    spannableString.setSpan(new hnc((byte) 0), max, min, 33);
                }
                i3 += 2;
            }
            this.Q0 = b(spannableString, this.d);
            ArrayList arrayList2 = this.g1;
            arrayList2.clear();
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                int[] iArr2 = this.f1;
                if (i6 < iArr2.length) {
                    int max2 = Math.max(0, iArr2[i5]);
                    int min2 = Math.min(spannableString.length(), this.f1[i6]);
                    if (min2 > max2) {
                        int lineForOffset = this.Q0.getLineForOffset(max2);
                        int lineForOffset2 = this.Q0.getLineForOffset(min2);
                        for (int i7 = lineForOffset; i7 <= lineForOffset2; i7++) {
                            StaticLayout staticLayout = this.Q0;
                            if (i7 == lineForOffset) {
                                lineLeft = staticLayout.getPrimaryHorizontal(max2);
                            } else {
                                lineLeft = staticLayout.getLineLeft(i7);
                            }
                            StaticLayout staticLayout2 = this.Q0;
                            if (i7 == lineForOffset2) {
                                lineRight = staticLayout2.getPrimaryHorizontal(min2);
                            } else {
                                lineRight = staticLayout2.getLineRight(i7);
                            }
                            if ((i7 != lineForOffset2 || min2 <= 0 || min2 != this.Q0.getLineStart(i7)) && lineRight - lineLeft >= 1.0f) {
                                float f = M3;
                                float f2 = N3;
                                arrayList2.add(new RectF(lineLeft - f, this.Q0.getLineTop(i7) + f2, lineRight + f, this.Q0.getLineBottom(i7) - f2));
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

    public final void D(java.util.ArrayList r41, boolean[] r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knc.D(java.util.ArrayList, boolean[], boolean):void");
    }

    public final void E(long j) {
        int i;
        int f;
        int i2;
        int f2;
        float f3;
        if (!this.q2) {
            return;
        }
        if (this.B3 == null) {
            if (this.M) {
                i2 = gn3.e(-10777345);
            } else {
                i2 = this.O | (-16777216);
            }
            if (this.M) {
                f2 = gn3.e(-6128385);
            } else {
                f2 = vm2.f(0.3f, this.O | (-16777216), -1);
            }
            if (this.M) {
                f3 = 0.6f;
            } else {
                f3 = 0.95f;
            }
            int f4 = vm2.f(f3, this.N, i2);
            int f5 = vm2.f(f3, this.N, f2);
            this.B3 = new LinearGradient(0.0f, 0.0f, hl.L(150.0f), 0.0f, new int[]{this.N, f4, vm2.f(0.5f, f4, f5), f5, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
        }
        float f6 = ((float) (j - this.s2)) / 1000.0f;
        if (this.C3 == null) {
            if (this.M) {
                i = gn3.e(-10777345);
            } else {
                i = this.O | (-16777216);
            }
            if (this.M) {
                f = gn3.e(-6128385);
            } else {
                f = vm2.f(0.3f, i, -1);
            }
            float L = hl.L(140.0f);
            int i3 = this.N;
            this.C3 = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{i3, i, f, i, i3}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
        }
        float f7 = (f6 % 1.4f) / 1.4f;
        float f8 = f7 * f7;
        Matrix matrix = this.D3;
        matrix.reset();
        matrix.setRotate(12.0f);
        matrix.postTranslate(uh9.v(Math.max(hl.L(140.0f), this.a1), hl.L(140.0f), (3.0f - (f7 * 2.0f)) * f8, -hl.L(140.0f)), 0.0f);
        this.C3.setLocalMatrix(matrix);
        this.d.setShader(this.C3);
    }

    public final void F() {
        if (this.I == null) {
            lyc lycVar = this.a;
            this.I = lycVar.g(this);
            this.J = lycVar.g(this);
        }
        if (!this.R) {
            this.R = true;
            this.h0 = SystemClock.uptimeMillis();
            this.n0 = false;
            this.c.f();
            this.T2 = false;
            Bitmap bitmap = this.i3;
            if (bitmap != null) {
                bitmap.recycle();
                this.i3 = null;
            }
            this.z2 = false;
            this.R2.a();
            this.r2 = false;
            this.u2 = 0.0f;
            this.F1 = null;
            this.E1 = null;
            this.B1 = null;
            this.C1 = null;
            rx rxVar = this.D1;
            if (rxVar != null) {
                rxVar.i(null, false);
            }
            this.S0 = null;
            this.G1 = 0.0f;
            this.q2 = false;
            this.t2 = 0.0f;
            this.f2 = 0.0f;
            this.S2 = false;
            this.G3 = false;
            this.H3 = false;
        }
        setVisibility(0);
        invalidate();
    }

    public final void G(float f, float f2, float f3, long j, Canvas canvas) {
        mva mvaVar;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        jnc jncVar;
        float f9;
        char c;
        jnc jncVar2;
        int i;
        float f10;
        Canvas canvas2 = canvas;
        float f11 = ((float) (j - this.C2)) / 1000.0f;
        float f12 = 0.4f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        float interpolation = this.O2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f11 - 0.08f) / 0.4f)));
        int i2 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i2);
        ArrayList arrayList = this.L2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            jnc jncVar3 = (jnc) arrayList.get(i3);
            if (jncVar3.c) {
                float max = Math.max(f14, Math.min(f13, ((f11 - jncVar3.j) - 0.26f) / 0.12f));
                if (max <= f14) {
                    i3 = i4;
                } else {
                    float f15 = jncVar3.h;
                    float f16 = jncVar3.k;
                    float L = (hl.L(10.0f) + f16) * max;
                    float f17 = L + f15;
                    f4 = f12;
                    if (jncVar3.m) {
                        f15 += f16;
                    } else {
                        L = hl.L(4.0f);
                    }
                    float f18 = f15 - L;
                    float max2 = Math.max(f14, Math.min(f13, (((f11 - jncVar3.j) - 0.26f) - 0.12f) / 0.45f));
                    f5 = f13;
                    textPaint.setColor(vm2.f(xnb.B(max2, 2.0f, 3.0f, max2 * max2), this.O, jncVar3.q ? L3 : this.N));
                    textPaint.setAlpha((int) (255.0f * f3 * f5));
                    canvas2.save();
                    canvas2.clipRect(f + f18, (f2 + jncVar3.i) - hl.L(40.0f), jncVar3.m ? f + jncVar3.h + jncVar3.k + hl.L(4.0f) : f + f17, f2 + jncVar3.i + hl.L(20.0f));
                    canvas2.drawText(jncVar3.a, f + jncVar3.h, f2 + jncVar3.i, textPaint);
                    canvas2.restore();
                    textPaint.setColor(this.N);
                    jncVar3.n = f + jncVar3.h;
                    jncVar3.o = f2 + jncVar3.i;
                    i3 = i4;
                    f12 = f4;
                    f13 = f5;
                    f14 = 0.0f;
                }
            } else {
                f4 = f12;
                f5 = f13;
                if (jncVar3.b) {
                    boolean r = r(jncVar3);
                    float[] fArr = this.P2;
                    if (r) {
                        int indexOf = arrayList.indexOf(jncVar3);
                        int i5 = indexOf;
                        while (!q((jnc) arrayList.get(i5))) {
                            i5++;
                        }
                        float f19 = this.I2;
                        float f20 = N3;
                        float f21 = jncVar3.f + f19 + f20;
                        f9 = 0.5f;
                        float f22 = (f19 + jncVar3.g) - f20;
                        float f23 = this.H2;
                        c = 1;
                        float f24 = M3;
                        RectF rectF = this.N2;
                        rectF.set((jncVar3.d + f23) - f24, f21, f23 + ((jnc) arrayList.get(i5)).l + f24, f22);
                        Path path = this.Q2;
                        path.rewind();
                        float f25 = O3;
                        jnc jncVar4 = jncVar3;
                        path.addRoundRect(rectF, f25, f25, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i6 = this.P;
                        float f26 = f21;
                        Paint paint = this.M2;
                        paint.setColor(i6);
                        paint.setAlpha((int) (Color.alpha(this.P) * f3));
                        int i7 = indexOf;
                        while (i7 <= i5) {
                            jnc jncVar5 = (jnc) arrayList.get(i7);
                            H(jncVar5, f11, fArr);
                            float f27 = fArr[1];
                            float f28 = fArr[0];
                            if (f27 - f28 < 0.5f) {
                                jncVar2 = jncVar4;
                                i = i5;
                                f10 = f26;
                            } else {
                                if (f28 <= jncVar5.d + 0.5f && i7 == indexOf) {
                                    f28 -= f24;
                                }
                                if (f27 >= jncVar5.l - 0.5f && i7 == i5) {
                                    f27 += f24;
                                }
                                float f29 = this.H2;
                                float f30 = f29 + f28;
                                float f31 = f29 + f27;
                                jncVar2 = jncVar4;
                                i = i5;
                                f10 = f26;
                                canvas2 = canvas;
                                canvas2.drawRect(f30, f10, f31, f22, paint);
                            }
                            i7++;
                            f26 = f10;
                            i5 = i;
                            jncVar4 = jncVar2;
                        }
                        jncVar = jncVar4;
                        canvas2.restore();
                    } else {
                        jncVar = jncVar3;
                        f9 = 0.5f;
                        c = 1;
                    }
                    H(jncVar, f11, fArr);
                    if (Math.min(fArr[c], (jncVar.d + jncVar.k) + hl.L(4.0f)) - Math.max(fArr[0], jncVar.d - hl.L(4.0f)) >= f9) {
                        canvas2.save();
                        float f32 = this.H2;
                        float f33 = fArr[0];
                        float f34 = jncVar.d;
                        if (f33 <= f34 + f9) {
                            f33 = f34 - hl.L(4.0f);
                        }
                        float f35 = f32 + f33;
                        float L2 = (this.I2 + jncVar.f) - hl.L(4.0f);
                        float f36 = this.H2;
                        float f37 = fArr[c];
                        if (f37 >= jncVar.l - f9) {
                            f37 = jncVar.d + jncVar.k + hl.L(4.0f);
                        }
                        canvas2.clipRect(f35, L2, f36 + f37, this.I2 + jncVar.g + hl.L(4.0f));
                        textPaint.setColor(L3);
                        textPaint.setAlpha((int) (f3 * 255.0f));
                        canvas2.drawText(jncVar.a, this.H2 + jncVar.d, this.I2 + jncVar.e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                        f6 = f11;
                        f7 = f5;
                        f8 = 0.0f;
                    } else {
                        i3 = i4;
                        f12 = f4;
                        f13 = f5;
                        f14 = 0.0f;
                    }
                } else {
                    float f38 = this.H2 + jncVar3.d;
                    float f39 = this.I2 + jncVar3.e;
                    float f40 = f + jncVar3.h;
                    float f41 = f2 + jncVar3.i;
                    textPaint.setColor((this.A2 || !jncVar3.q) ? this.N : L3);
                    float f42 = 255.0f * f3 * f5;
                    float f43 = f41 - f39;
                    if (Math.abs(f43) > textPaint.getTextSize() * 1.9f) {
                        f8 = 0.0f;
                        float max3 = Math.max(0.0f, f5 - (2.2f * interpolation));
                        f6 = f11;
                        f7 = f5;
                        float max4 = Math.max(0.0f, Math.min(f7, (interpolation - 0.25f) / 0.55f));
                        if (max3 > 0.0f) {
                            textPaint.setAlpha((int) (max3 * f42));
                            canvas2.drawText(jncVar3.a, f38, f39, textPaint);
                        }
                        if (max4 > 0.0f) {
                            textPaint.setAlpha((int) (f42 * max4));
                            canvas2.drawText(jncVar3.a, f40, f41, textPaint);
                        }
                        textPaint.setColor(this.N);
                        jncVar3.n = f40;
                        jncVar3.o = f41;
                    } else {
                        f6 = f11;
                        f7 = f5;
                        f8 = 0.0f;
                        float A = qd4.A(f40, f38, interpolation, f38);
                        float f44 = (f43 * interpolation) + f39;
                        textPaint.setAlpha((int) f42);
                        canvas2.drawText(jncVar3.a, A, f44, textPaint);
                        textPaint.setColor(this.N);
                        jncVar3.n = A;
                        jncVar3.o = f44;
                    }
                }
                f13 = f7;
                f14 = f8;
                i3 = i4;
                f11 = f6;
                f12 = f4;
            }
        }
        float f45 = f11;
        float f46 = f12;
        textPaint.setAlpha(255);
        float f47 = hl.p;
        while (true) {
            int i8 = this.G2;
            int i9 = this.F2;
            mvaVar = this.R2;
            if (i8 >= i9) {
                break;
            }
            float[] fArr2 = this.E2;
            int i10 = i8 * 3;
            if (fArr2[i10 + 2] > f45) {
                break;
            }
            this.G2 = i8 + 1;
            float f48 = f + fArr2[i10];
            float f49 = f2 + fArr2[i10 + 1];
            RectF rectF2 = this.j0;
            if (f49 >= rectF2.top && f49 <= rectF2.bottom) {
                double d = mvaVar.d() * 3.141592653589793d * 2.0d;
                float d2 = ((mvaVar.d() * 18.0f) + 8.0f) * f47;
                this.R2.i((((float) Math.cos(d)) * d2) + f48, c00.x((float) Math.sin(d), d2, 0.7f, f49), f48, f49, ((mvaVar.d() * f46) + 0.8f) * 0.26f);
            }
        }
        if (f45 >= this.D2) {
            this.z2 = false;
            arrayList.clear();
            mvaVar.R = hl.L(10.0f);
        }
    }

    public final boolean I(jnc jncVar, boolean z) {
        float L;
        float L2;
        if (z) {
            L = jncVar.f;
            L2 = jncVar.g;
        } else {
            L = jncVar.i - hl.L(14.0f);
            L2 = jncVar.i + hl.L(4.0f);
        }
        if (L2 >= this.g3 - hl.L(2.0f)) {
            if (L <= Math.max(1.0f, this.h3) + this.g3 + hl.L(2.0f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knc.K():void");
    }

    public final void L() {
        float f;
        int i;
        int v0;
        int f2;
        int f3;
        int f4;
        int[] iArr;
        if (this.N0 == null) {
            int[] iArr2 = this.c.B;
            boolean z = this.M;
            vnb vnbVar = this.b;
            if (z) {
                i = aob.Me;
                v0 = gn3.d(aob.v0(i, vnbVar));
            } else {
                i = aob.Me;
                v0 = aob.v0(i, vnbVar);
            }
            int i2 = v0 | (-16777216);
            if (this.M) {
                f2 = gn3.e(-7359233);
            } else {
                f2 = vm2.f(0.55f, iArr2[0], iArr2[4]);
            }
            if (this.M) {
                f3 = gn3.e(-7411982);
            } else {
                f3 = vm2.f(0.55f, iArr2[1], iArr2[4]);
            }
            if (this.M) {
                f4 = gn3.e(-4940545);
            } else {
                f4 = vm2.f(0.55f, iArr2[2], iArr2[4]);
            }
            if (this.M) {
                int e = gn3.e(-7359233);
                int e2 = gn3.e(-5650177);
                iArr = new int[]{vm2.f(0.58f, i2, e), vm2.f(0.45f, i2, e2), vm2.f(0.58f, i2, e), vm2.f(0.45f, i2, e2)};
            } else {
                int v02 = aob.v0(i, vnbVar);
                int alpha = Color.alpha(v02);
                int[] iArr3 = new int[4];
                iArr3[0] = f2;
                iArr3[1] = f3;
                iArr3[2] = f4;
                iArr3[3] = f2;
                for (int i3 = 0; i3 < 4; i3++) {
                    iArr3[i3] = vm2.o(vm2.f(0.12f, v02 | (-16777216), iArr3[i3]), alpha);
                }
                iArr = iArr3;
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.MIRROR);
            this.N0 = linearGradient;
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
        float L = hl.L(f);
        Matrix matrix = this.O0;
        matrix.setScale(L, 1.0f);
        matrix.postTranslate((((float) (SystemClock.uptimeMillis() % 6000)) / 6000.0f) * 2.0f * L, 0.0f);
        this.N0.setLocalMatrix(matrix);
    }

    public final StaticLayout b(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.max(1, this.a1)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public final void c() {
        int v0 = aob.v0(aob.Pe, this.b);
        if (v0 != this.n1) {
            this.n1 = v0;
            K();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f;
        lyc lycVar = this.a;
        if (lycVar != null) {
            f = lycVar.w();
        } else {
            f = 0.0f;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f));
        this.p1 = max;
        if (lycVar != null) {
            snc sncVar = (snc) lycVar.e;
            if (sncVar.Y != null && Math.abs(max - sncVar.b0) >= 0.002f) {
                sncVar.b0 = max;
                if (max <= 0.002f) {
                    sncVar.Y.setLayerType(0, null);
                } else {
                    int round = Math.round((1.0f - max) * 255.0f);
                    Paint paint = new Paint();
                    paint.setColorFilter(new LightingColorFilter(Color.rgb(round, round, round), 0));
                    sncVar.Y.setLayerType(2, paint);
                }
            }
        }
        if (max <= 0.002f) {
            super.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.draw(canvas);
        canvas.drawColor(Color.argb(Math.round(max * 255.0f), 0, 0, 0), PorterDuff.Mode.SRC_ATOP);
        canvas.restoreToCount(saveLayer);
    }

    public final void e(Canvas canvas, String str, float f) {
        RectF rectF = this.k0;
        float centerY = rectF.centerY();
        float L = rectF.left + hl.L(12.0f);
        int i = (int) L;
        hc hcVar = this.G;
        hcVar.setBounds(i, (int) (centerY - hl.L(12.0f)), hl.L(24.0f) + i, (int) (hl.L(12.0f) + centerY));
        int i2 = (int) (255.0f * f);
        hcVar.setAlpha(i2);
        hcVar.draw(canvas);
        float L2 = L + hl.L(6.0f) + hl.L(24.0f);
        TextPaint textPaint = this.n;
        int alpha = textPaint.getAlpha();
        textPaint.setAlpha(i2);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, L2, centerY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
        textPaint.setAlpha(alpha);
        Path path = this.t1;
        boolean isEmpty = path.isEmpty();
        Paint paint = this.u1;
        if (isEmpty) {
            path.moveTo(-hl.N(3.8f), hl.N(1.9f));
            path.lineTo(0.0f, -hl.N(1.9f));
            path.lineTo(hl.N(3.8f), hl.N(1.9f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.N(1.75f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        float L4 = (((rectF.right - hl.L(10.0f)) - hl.L(14.0f)) - hl.L(8.0f)) - hl.L(1.0f);
        this.w1 = L4;
        int p1 = aob.p1(0.14f * f, textPaint.getColor());
        Paint paint2 = this.v1;
        paint2.setColor(p1);
        canvas.drawRect(L4, rectF.centerY() - hl.L(10.0f), hl.L(1.0f) + L4, rectF.centerY() + hl.L(10.0f), paint2);
        paint.setColor(textPaint.getColor());
        paint.setAlpha(i2);
        canvas.save();
        canvas.translate((rectF.right - hl.L(10.0f)) - hl.L(7.0f), rectF.centerY());
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public final void f(Canvas canvas, float f, float f2, float f3, float f4, long j) {
        if (!this.M) {
            return;
        }
        LinearGradient linearGradient = this.h2;
        Paint paint = this.l2;
        Paint paint2 = this.k2;
        Paint paint3 = this.m2;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{gn3.e(-7447553), gn3.e(-13649665), gn3.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
            this.h2 = linearGradient2;
            paint2.setShader(linearGradient2);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
            this.i2 = radialGradient;
            paint.setShader(radialGradient);
            LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
            this.j2 = linearGradient3;
            paint3.setShader(linearGradient3);
            paint3.setStyle(Paint.Style.STROKE);
        }
        float f5 = ((float) (j % 5000)) / 5000.0f;
        Matrix matrix = this.o2;
        matrix.setTranslate(4.0f * f5, 0.0f);
        float f6 = 2.6f * f3;
        matrix.postScale(f6, f6);
        matrix.postRotate(35.0f);
        matrix.postTranslate(f, f2);
        this.h2.setLocalMatrix(matrix);
        int i = (int) (255.0f * f4);
        paint2.setAlpha(i);
        canvas.drawCircle(f, f2, f3, paint2);
        float sin = 0.06f * f3 * ((float) Math.sin(f5 * 3.141592653589793d * 2.0d));
        float f7 = 0.62f * f3;
        matrix.setScale(1.35f * f3, f7);
        matrix.postTranslate(f + sin, f2 - f7);
        this.i2.setLocalMatrix(matrix);
        paint.setAlpha(i);
        canvas.drawCircle(f, f2, f3, paint);
        matrix.setScale(f3, f3);
        matrix.postTranslate(f, f2);
        this.j2.setLocalMatrix(matrix);
        paint3.setStrokeWidth(Math.max(1.0f, hl.N(0.8f)));
        paint3.setAlpha(i);
        canvas.drawCircle(f, f2, f3 - hl.N(0.4f), paint3);
    }

    public final void g(Canvas canvas, jl0 jl0Var, RectF rectF, float f) {
        int i;
        float height = rectF.height() / 2.0f;
        if (jl0Var != null) {
            jl0Var.r(height);
            jl0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            jl0Var.setAlpha((int) (f * 255.0f));
            jl0Var.draw(canvas);
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

    public float getFieldBottomInWindow() {
        if (getVisibility() == 0 && getAlpha() >= 0.05f) {
            RectF rectF = this.j0;
            if (!rectF.isEmpty() && getParent() != null) {
                int[] iArr = new int[2];
                getLocationInWindow(iArr);
                return iArr[1] + rectF.bottom;
            }
            return Float.NaN;
        }
        return Float.NaN;
    }

    public float getMaxTextHeight() {
        return this.t0;
    }

    public String getShownText() {
        return this.P0;
    }

    public final void h(Canvas canvas, RectF rectF, float f) {
        boolean z;
        TextPaint textPaint;
        float f2;
        boolean z2;
        if (this.R1 == null) {
            this.R1 = getContext().getResources().getDrawable(2131232199).mutate();
        }
        TextPaint textPaint2 = this.n;
        int color = textPaint2.getColor();
        float centerY = rectF.centerY();
        this.R1.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        float f3 = 255.0f * f;
        int i = (int) f3;
        this.R1.setAlpha(i);
        int L = (int) (rectF.left + hl.L(12.0f));
        int L2 = (int) (centerY - hl.L(9.0f));
        this.R1.setBounds(L, L2, hl.L(18.0f) + L, hl.L(18.0f) + L2);
        this.R1.draw(canvas);
        float L4 = (rectF.right - hl.L(13.0f)) - hl.L(4.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L4 - hl.L(8.0f), rectF.bottom);
        int alpha = textPaint2.getAlpha();
        float L5 = rectF.left + hl.L(12.0f) + hl.L(18.0f) + hl.L(6.0f);
        if (this.B1 == null && this.M1 < 0.99f) {
            z = true;
        } else {
            z = false;
        }
        String str = this.A1;
        TextPaint textPaint3 = this.a2;
        if (z) {
            f2 = 2.0f;
            if (this.V1 == null) {
                this.V1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                textPaint3.setTypeface(textPaint2.getTypeface());
            }
            textPaint3.setTextSize(textPaint2.getTextSize());
            float measureText = textPaint2.measureText(str);
            float L6 = hl.L(36.0f);
            textPaint = textPaint3;
            Matrix matrix = this.Z1;
            matrix.setScale(L6, 1.0f);
            matrix.postTranslate(((Math.min(1.0f, ((float) (SystemClock.uptimeMillis() % 2200)) / 1100.0f) * ((L6 * 2.0f) + measureText)) + (L5 - L6)) - (L6 / 2.0f), 0.0f);
            this.V1.setLocalMatrix(matrix);
            postInvalidateOnAnimation();
        } else {
            textPaint = textPaint3;
            f2 = 2.0f;
        }
        Paint.FontMetrics fontMetrics = textPaint2.getFontMetrics();
        float f4 = centerY - ((fontMetrics.ascent + fontMetrics.descent) / f2);
        if (z && this.M) {
            if (this.W1 == null) {
                int color2 = textPaint2.getColor() | (-16777216);
                int f5 = vm2.f(0.4f, color2, gn3.e(-7359233));
                z2 = z;
                this.W1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f5, vm2.f(0.28f, color2, gn3.e(-5650177)), f5}, (float[]) null, Shader.TileMode.MIRROR);
            } else {
                z2 = z;
            }
            float L7 = hl.L(200.0f);
            Matrix matrix2 = this.X1;
            matrix2.setScale(L7, 1.0f);
            matrix2.postTranslate(((((float) (SystemClock.uptimeMillis() % 6000)) / 6000.0f) * f2 * L7) + L5, 0.0f);
            this.W1.setLocalMatrix(matrix2);
            Typeface typeface = textPaint2.getTypeface();
            TextPaint textPaint4 = this.Y1;
            textPaint4.setTypeface(typeface);
            textPaint4.setTextSize(textPaint2.getTextSize());
            textPaint4.setShader(this.W1);
            textPaint4.setAlpha((int) ((1.0f - this.M1) * 0.62f * f3));
            canvas.drawText(str, L5, f4, textPaint4);
            float f6 = this.M1;
            if (f6 > 0.01f && this.B1 != null) {
                textPaint2.setAlpha((int) (f6 * f3));
                canvas.drawText(this.F1, L5, f4, textPaint2);
            }
        } else {
            z2 = z;
            textPaint2.setAlpha((int) xnb.z(this.M1, 0.5f, 0.5f, f3));
            String str2 = this.F1;
            if (str2 == null) {
                str2 = str;
            }
            canvas.drawText(str2, L5, f4, textPaint2);
        }
        if (z2 && SystemClock.uptimeMillis() % 2200 < 1100) {
            TextPaint textPaint5 = textPaint;
            textPaint5.setShader(this.V1);
            textPaint5.setAlpha((int) ((1.0f - this.M1) * f3 * 0.55f));
            canvas.drawText(str, L5, f4, textPaint5);
        }
        textPaint2.setAlpha(alpha);
        canvas.restore();
        Path path = this.t1;
        boolean isEmpty = path.isEmpty();
        Paint paint = this.u1;
        if (isEmpty) {
            path.moveTo(-hl.N(3.8f), hl.N(1.9f));
            path.lineTo(0.0f, -hl.N(1.9f));
            path.lineTo(hl.N(3.8f), hl.N(1.9f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(hl.N(1.75f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
        }
        paint.setColor(color);
        paint.setAlpha(i);
        canvas.save();
        canvas.translate(L4, centerY);
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public final void i(Canvas canvas, float f, float f2, boolean z) {
        float f3;
        float f4;
        float f5;
        this.M1 = a(this.M1, this.B1 != null ? 1.0f : 0.0f, f2, 0.09f);
        this.F1 = this.B1;
        String str = this.E1;
        int i = this.U1;
        RectF rectF = this.j0;
        TextPaint textPaint = this.n;
        if (str != null) {
            f3 = 6.0f;
            f4 = 22.0f;
            if (textPaint.measureText(this.B1) + hl.L(6.0f) + hl.L(18.0f) + hl.L(12.0f) + hl.L(8.0f) + hl.L(8.0f) + hl.L(13.0f) > (rectF.right - (((rectF.left + hl.L(2.0f)) + i) + hl.L(8.0f))) - ((this.T || !z) ? 0.0f : (textPaint.measureText(ob6.M0(2131745368, null)) + (hl.L(8.0f) + (hl.L(22.0f) + (hl.L(12.0f) + hl.L(8.0f))))) + hl.L(16.0f))) {
                this.F1 = this.E1;
            }
        } else {
            f3 = 6.0f;
            f4 = 22.0f;
        }
        String str2 = this.F1;
        if (str2 == null) {
            str2 = this.A1;
        }
        float measureText = textPaint.measureText(str2);
        float f6 = this.L1;
        if (f6 > 0.0f) {
            measureText = a(f6, measureText, f2, 0.11f);
        }
        this.L1 = measureText;
        float L = rectF.top - hl.L(8.0f);
        float f7 = this.G1;
        float B = xnb.B(f7, 2.0f, 3.0f, f7 * f7);
        int color = textPaint.getColor();
        float L2 = rectF.left + hl.L(2.0f);
        float L4 = L - hl.L(36.0f);
        RectF rectF2 = this.P1;
        rectF2.set(L2, L4, i + L2, L);
        jl0 jl0Var = this.c2;
        lyc lycVar = this.a;
        if (jl0Var == null) {
            this.c2 = lycVar.g(this);
        }
        canvas.save();
        float f8 = 1.0f - B;
        canvas.translate(0.0f, hl.L(f3) * f8);
        float f9 = (B * 0.1f) + 0.9f;
        float B2 = xnb.B(this.I1, 0.06f, 1.0f, f9);
        canvas.scale(B2, B2, rectF2.centerX(), rectF2.centerY());
        g(canvas, this.c2, rectF2, f);
        Drawable drawable = this.S1;
        if (drawable == null) {
            drawable = getContext().getResources().getDrawable(2131232365).mutate();
            this.S1 = drawable;
        }
        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        this.S1.setAlpha((int) (f * 255.0f));
        int L5 = hl.L(18.5f);
        float f10 = L5 / 2.0f;
        float centerX = ((int) rectF2.centerX()) - f10;
        float centerY = ((int) rectF2.centerY()) - f10;
        this.S1.setBounds(Math.round(centerX), Math.round(centerY), Math.round(centerX) + L5, Math.round(centerY) + L5);
        float N = hl.N(0.05f);
        int i2 = 0;
        while (i2 < 4) {
            canvas.save();
            canvas.translate(i2 == 0 ? -N : i2 == 1 ? N : 0.0f, i2 == 2 ? -N : i2 == 3 ? N : 0.0f);
            this.S1.draw(canvas);
            canvas.restore();
            i2++;
        }
        canvas.restore();
        float L6 = rectF2.right + hl.L(8.0f);
        float s = s() + L6;
        RectF rectF3 = this.O1;
        rectF3.set(L6, L4, s, L);
        if (this.N1) {
            s = rectF2.right;
        } else if (this.q1) {
            s = Math.max(s, this.r1.right);
        }
        float max = Math.max(0.0f, 1.0f - (this.a0 * 2.0f));
        if (max < 0.01f && !this.N1) {
            rectF3.setEmpty();
        }
        if (this.q1 && !this.N1) {
            f5 = 0.01f;
            float x = bp1.x(this.a0, 0.5f, 1.0f, 0.0f);
            if (x > 0.0f) {
                canvas.save();
                canvas.clipPath(this.s1);
                h(canvas, rectF3, xnb.B(x, 2.0f, 3.0f, f * x * x));
                canvas.restore();
            }
        } else {
            f5 = 0.01f;
            if (!this.N1 && max >= 0.01f) {
                float f11 = f * max;
                if (this.b2 == null) {
                    this.b2 = lycVar.g(this);
                }
                canvas.save();
                canvas.translate(0.0f, hl.L(f3) * f8);
                float B3 = xnb.B(this.H1, 0.04f, 1.0f, f9);
                canvas.scale(B3, B3, rectF3.left + hl.L(18.0f), rectF3.bottom);
                if (!this.m1) {
                    g(canvas, this.b2, rectF3, f11);
                    h(canvas, rectF3, f11);
                }
                canvas.restore();
            }
        }
        float a = a(this.K1, (this.T || !z) ? 0.0f : 1.0f, f2, 0.06f);
        this.K1 = a;
        int i3 = (a > f5 ? 1 : (a == f5 ? 0 : -1));
        RectF rectF4 = this.Q1;
        if (i3 > 0) {
            String M0 = ob6.M0(2131745368, null);
            float L7 = s + hl.L(8.0f);
            rectF4.set(L7, L4, textPaint.measureText(M0) + hl.L(12.0f) + L7 + hl.L(f4) + hl.L(8.0f) + hl.L(16.0f), L);
            if (this.d2 == null) {
                this.d2 = lycVar.g(this);
            }
            float f12 = this.K1;
            float B4 = xnb.B(f12, 2.0f, 3.0f, f12 * f12);
            float f13 = f12 * f * max;
            canvas.save();
            float B5 = xnb.B(this.J1, 0.04f, 1.0f, (B4 * 0.4f) + 0.6f);
            canvas.scale(B5, B5, rectF4.left, rectF4.centerY());
            g(canvas, this.d2, rectF4, f13);
            Drawable drawable2 = this.T1;
            if (drawable2 == null) {
                drawable2 = getContext().getResources().getDrawable(2131232824).mutate();
                this.T1 = drawable2;
            }
            drawable2.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            int i4 = (int) (f13 * 255.0f);
            this.T1.setAlpha(i4);
            int L8 = (int) (rectF4.left + hl.L(12.0f));
            int centerY2 = (int) (rectF4.centerY() - hl.L(11.0f));
            this.T1.setBounds(L8, centerY2, hl.L(f4) + L8, hl.L(f4) + centerY2);
            this.T1.draw(canvas);
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha(i4);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(M0, rectF4.left + hl.L(12.0f) + hl.L(f4) + hl.L(8.0f), rectF4.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
            textPaint.setAlpha(alpha);
            canvas.restore();
            return;
        }
        rectF4.setEmpty();
    }

    public final void j(Canvas canvas, float f) {
        int i;
        float f2;
        float f3;
        int i2;
        int i3;
        int i4;
        float L;
        float f4 = this.a0;
        float L2 = hl.L(36.0f);
        if (this.q2) {
            i = 2131744978;
        } else {
            i = 2131744979;
        }
        String M0 = ob6.M0(i, null);
        float m = m();
        RectF rectF = this.j0;
        float L4 = rectF.left + hl.L(2.0f);
        float L5 = rectF.top - hl.L(8.0f);
        lyc lycVar = this.a;
        boolean z = lycVar.z();
        int i5 = this.U1;
        if (z) {
            float L6 = i5 + L4 + hl.L(8.0f);
            float m2 = m();
            f2 = 2.0f;
            if (this.r2 && !this.q2) {
                i4 = hl.L(36.0f) + hl.L(6.0f);
            } else {
                i4 = 0;
            }
            if (m2 + i4 + L6 <= rectF.right - hl.L(56.0f)) {
                L4 = L6;
                L = 0.0f;
            } else {
                L = hl.L(8.0f) + L2;
            }
            if (Float.isNaN(this.y1)) {
                this.y1 = L4;
                this.z1 = L;
            } else if (this.T) {
                this.y1 = a(this.y1, L4, 0.016f, 0.07f);
                this.z1 = a(this.z1, L, 0.016f, 0.07f);
                if (Math.abs(this.y1 - L4) > 0.5f || Math.abs(this.z1 - L) > 0.5f) {
                    postInvalidateOnAnimation();
                }
            }
            if (this.a0 < 0.01f) {
                this.y1 = Float.NaN;
            }
            if (!Float.isNaN(this.y1)) {
                L4 = this.y1;
            }
            if (!Float.isNaN(this.y1)) {
                L = this.z1;
            }
            L5 -= L;
        } else {
            f2 = 2.0f;
        }
        RectF rectF2 = this.k0;
        rectF2.set(L4, L5 - L2, L4 + m, L5);
        if (lycVar.z() && !this.N1 && !this.m1) {
            f3 = 0.04f;
            if (Math.abs(rectF2.left - (((rectF.left + hl.L(f2)) + i5) + hl.L(8.0f))) < 1.0f && Math.abs(L5 - (rectF.top - hl.L(8.0f))) < 1.0f) {
                this.q1 = true;
                float B = xnb.B(f4, f2, 3.0f, f4 * f4);
                float f5 = rectF2.left;
                float f6 = rectF2.top;
                float s = ((m - s()) * B) + s() + f5;
                float f7 = rectF2.bottom;
                RectF rectF3 = this.r1;
                rectF3.set(f5, f6, s, f7);
                float f8 = 1.0f - (this.d0 * 0.04f);
                canvas.save();
                canvas.scale(f8, f8, rectF2.left + hl.L(18.0f), rectF2.bottom);
                jl0 jl0Var = this.J;
                if (jl0Var == null) {
                    jl0Var = lycVar.g(this);
                    this.J = jl0Var;
                }
                g(canvas, jl0Var, rectF3, f);
                float max = Math.max(0.0f, Math.min(1.0f, (f4 - 0.35f) / 0.55f));
                if (max > 0.0f) {
                    canvas.save();
                    Path path = this.s1;
                    path.rewind();
                    path.addRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    e(canvas, M0, xnb.B(max, 2.0f, 3.0f, f * max * max));
                    canvas.restore();
                }
                canvas.restore();
                return;
            }
        } else {
            f3 = 0.04f;
        }
        float f9 = 1.0f - f4;
        float min = 1.0f - Math.min(1.0f, f4 / 0.55f);
        float sin = ((((float) Math.sin(Math.min(1.0f, f4 / 0.8f) * 3.141592653589793d)) * 0.07f * f9) + ((1.0f - (min * min)) * 0.38f) + 0.62f) * L2;
        float f10 = L2 * 0.62f;
        float max2 = Math.max(sin, ((rectF2.width() - f10) * (1.0f - ((float) Math.pow(f9, 3.0d)))) + f10);
        float min2 = Math.min(1.0f, f4 * 3.0f) * f;
        float max3 = Math.max(0.0f, Math.min(1.0f, (f4 - 0.62f) / 0.38f)) * f;
        boolean z2 = this.T;
        RectF rectF4 = this.m0;
        if (!z2) {
            float width = rectF2.width();
            float B2 = xnb.B(f4, 2.0f, 3.0f, f4 * f4);
            float f11 = f * B2;
            float f12 = (B2 * 0.1f) + 0.9f;
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            float f13 = (width * f12) / 2.0f;
            float f14 = (L2 * f12) / 2.0f;
            rectF4.set(centerX - f13, centerY - f14, centerX + f13, centerY + f14);
            min2 = f11;
            max3 = min2;
        } else {
            float f15 = rectF2.left;
            float f16 = rectF2.bottom;
            rectF4.set(f15, f16 - sin, max2 + f15, f16);
        }
        float f17 = 1.0f - (this.d0 * f3);
        canvas.save();
        canvas.scale(f17, f17, rectF2.left + hl.L(18.0f), rectF2.bottom);
        float height = rectF4.height() / 2.0f;
        if (this.J != null) {
            if (Math.abs(this.L - height) > 0.5f) {
                this.L = height;
                this.J.r(height);
            }
            this.J.setBounds((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
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
            canvas.drawRoundRect(rectF4, height, height, paint);
            if (this.M) {
                i3 = 38;
            } else {
                i3 = 20;
            }
            Paint paint2 = this.s;
            paint2.setAlpha((int) (i3 * min2));
            canvas.drawRoundRect(rectF4, height, height, paint2);
        }
        if (max3 > 0.0f) {
            e(canvas, M0, max3);
        }
        canvas.restore();
    }

    public final void k(Canvas canvas, float f) {
        float f2;
        int i;
        int color;
        float f3 = this.u2;
        if (this.r2 && !this.q2) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        float a = a(f3, f2, 0.016f, 0.06f);
        this.u2 = a;
        int i2 = (a > 0.01f ? 1 : (a == 0.01f ? 0 : -1));
        RectF rectF = this.w2;
        if (i2 < 0) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.x2;
        lyc lycVar = this.a;
        if (drawable == null) {
            this.x2 = getContext().getResources().getDrawable(2131231003).mutate();
            jl0 g = lycVar.g(this);
            this.y2 = g;
            if (g != null) {
                g.r(hl.L(18.0f));
            }
        }
        float L = hl.L(36.0f);
        RectF rectF2 = this.k0;
        rectF.set(rectF2.right + hl.L(6.0f), rectF2.top, rectF2.right + hl.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.a0 - 0.62f) / 0.38f));
        float f4 = this.u2;
        float f5 = f * f4 * max;
        if (f5 >= 0.01f) {
            float x = (1.0f - (this.v2 * 0.06f)) * c00.x(f4, 0.3f, max, 0.7f);
            canvas.save();
            canvas.scale(x, x, rectF.centerX(), rectF.centerY());
            jl0 jl0Var = this.y2;
            if (jl0Var != null) {
                jl0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.y2.setAlpha((int) (255.0f * f5));
                this.y2.draw(canvas);
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
            ((snc) lycVar.e).b.getClass();
            this.x2.setColorFilter(new PorterDuffColorFilter((-16777216) | this.n.getColor(), PorterDuff.Mode.SRC_IN));
            float L2 = hl.L(24.0f) / 2.0f;
            this.x2.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
            this.x2.setAlpha((int) (Color.alpha(color) * f5));
            this.x2.draw(canvas);
            canvas.restore();
            float f7 = this.u2;
            if (f7 > 0.01f && f7 < 0.99f) {
                postInvalidateOnAnimation();
            }
        }
    }

    public final void l(Canvas canvas, float f, float f2, float f3, float f4, long j) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.n2;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f3 * 255.0f));
        float z = xnb.z(f4, 0.3f, 0.7f, hl.N(8.5f));
        RectF rectF = this.p2;
        rectF.set(f - z, f2 - z, f + z, f2 + z);
        long j2 = j - this.g2;
        float f5 = (((float) (j2 % 1400)) / 1400.0f) * 2.0f;
        float min = Math.min(1.0f, f5);
        float B = xnb.B(min, 2.0f, 3.0f, min * min);
        float max = Math.max(0.0f, f5 - 1.0f);
        float f6 = ((float) ((j2 / 1400) % 18)) * 220.0f;
        float B2 = (xnb.B(max, 2.0f, 3.0f, max * max) * 220.0f) + f6;
        canvas.drawArc(rectF, ((((((float) (j2 % 6000)) / 6000.0f) * 360.0f) * 5.0f) + B2) % 360.0f, (((B * 220.0f) + f6) + 30.0f) - B2, false, paint);
    }

    public final float m() {
        int i;
        boolean z = this.q2;
        float L = hl.L(6.0f) + hl.L(24.0f) + hl.L(12.0f);
        if (z) {
            i = 2131744978;
        } else {
            i = 2131744979;
        }
        return this.n.measureText(ob6.M0(i, null)) + L + hl.L(12.0f) + hl.L(1.0f) + hl.L(8.0f) + hl.L(14.0f) + hl.L(10.0f);
    }

    public final boolean n() {
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.d1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (uptimeMillis - ((inc) obj).c < 1520) {
                return true;
            }
        }
        return false;
    }

    public final void o(jnc jncVar, ArrayList arrayList, int i) {
        if (arrayList != null && i < arrayList.size()) {
            float[] fArr = (float[]) arrayList.get(i);
            if (!Float.isNaN(fArr[0])) {
                float f = fArr[1] - this.f3;
                float f2 = jncVar.e;
                float f3 = f - f2;
                jncVar.d = fArr[0] - this.e3;
                jncVar.e = f2 + f3;
                jncVar.f += f3;
                jncVar.g += f3;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r70) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knc.onDraw(android.graphics.Canvas):void");
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
        gnc gncVar = this.F3;
        int i2 = 3;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        removeCallbacks(gncVar);
                        this.f0 = -1;
                        this.L0 = false;
                        invalidate();
                        return true;
                    }
                } else {
                    int i3 = this.f0;
                    if ((i3 == 2 || i3 == 3 || this.L0) && this.K0 > 0.0f) {
                        float y = motionEvent.getY() - this.I0;
                        if (!this.L0 && Math.abs(y) > this.M0) {
                            this.L0 = true;
                            this.I0 = motionEvent.getY();
                            this.J0 = this.s0;
                            this.f0 = -1;
                        }
                        if (this.L0) {
                            this.H0 = Math.max(0.0f, Math.min(this.K0, this.J0 - (motionEvent.getY() - this.I0)));
                            invalidate();
                            return true;
                        }
                    }
                    int i4 = this.f0;
                    if (i4 >= 0 && i4 != 3 && p(motionEvent.getX(), motionEvent.getY()) != this.f0) {
                        removeCallbacks(gncVar);
                        this.f0 = -1;
                        invalidate();
                        return true;
                    }
                }
            } else {
                removeCallbacks(gncVar);
                int i5 = this.f0;
                if (i5 == 3) {
                    i5 = 2;
                }
                this.f0 = -1;
                if (this.L0) {
                    this.L0 = false;
                    invalidate();
                    return true;
                }
                invalidate();
                if (i5 >= 0 && p(motionEvent.getX(), motionEvent.getY()) == i5) {
                    performHapticFeedback(3);
                    lyc lycVar = this.a;
                    if (i5 == 0) {
                        lycVar.I();
                        return true;
                    } else if (i5 == 1) {
                        snc sncVar = (snc) lycVar.e;
                        c cVar = sncVar.b;
                        zu1 zu1Var = cVar.a.E3;
                        if (zu1Var != null && zu1Var.y()) {
                            return true;
                        }
                        ChatActivityEnterView chatActivityEnterView = cVar.a;
                        int i6 = ChatActivityEnterView.X7;
                        ArrayList N = chatActivityEnterView.D0().N();
                        if (N.isEmpty()) {
                            obj = dm3.c;
                        } else {
                            obj = N.get(0);
                        }
                        sncVar.m(obj);
                        return true;
                    } else if (i5 == 4) {
                        snc sncVar2 = (snc) lycVar.e;
                        if (sncVar2.L != null && !sncVar2.n.trim().isEmpty()) {
                            c cVar2 = sncVar2.b;
                            knc kncVar = sncVar2.L;
                            sh9 sh9Var = new sh9(lycVar, (byte) 26);
                            ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                            wma wmaVar = chatActivityEnterView2.b2;
                            RectF rectF = new RectF();
                            rectF.set(kncVar.k0);
                            if (!rectF.isEmpty() && wmaVar != null) {
                                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                                wmaVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                ey1 ey1Var = new ey1(chatActivityEnterView2.getContext(), kncVar, (byte) 1);
                                frameLayout.addView(ey1Var, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                frameLayout.post(new z87(cVar2, kncVar, frameLayout, ey1Var, rectF, sh9Var, (byte) 8));
                                return true;
                            }
                        }
                    } else if (i5 == 5) {
                        snc sncVar3 = (snc) lycVar.e;
                        if (sncVar3.i0 != null && !sncVar3.k0) {
                            Log.d("VoiceLive", "field: back to the text before the style");
                            if (sncVar3.j0) {
                                sncVar3.g0 = sncVar3.i0;
                                sncVar3.h0 = sncVar3.b().size();
                            } else {
                                sncVar3.g0 = null;
                            }
                            sncVar3.i0 = null;
                            knc kncVar2 = sncVar3.L;
                            if (kncVar2 != null) {
                                kncVar2.setRevertShown(false);
                                sncVar3.L.setRebuildNext(true);
                            }
                            sncVar3.q();
                            knc kncVar3 = sncVar3.L;
                            if (kncVar3 != null) {
                                kncVar3.setRebuildNext(false);
                                return true;
                            }
                        }
                    } else if (i5 == 6) {
                        snc sncVar4 = (snc) lycVar.e;
                        if (sncVar4.L != null && ((b = sncVar4.c) == 2 || b == 4)) {
                            String[] I = DictationAsr.I();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ob6.M0(2131744990, null));
                            boolean y2 = DictationAsr.y();
                            if (y2) {
                                i = 0;
                            } else {
                                i = -1;
                            }
                            int i7 = i;
                            for (int i8 = 0; i8 < I.length; i8++) {
                                arrayList.add(bn3.t(I[i8]));
                                if (!y2 && i7 < 0 && DictationAsr.A(I[i8])) {
                                    i7 = i8 + 1;
                                }
                            }
                            nnc nncVar = new nnc(sncVar4, I, (byte) 0);
                            c cVar3 = sncVar4.b;
                            knc kncVar4 = sncVar4.L;
                            ArrayList x = snc.x(I, y2, nncVar);
                            ChatActivityEnterView chatActivityEnterView3 = cVar3.a;
                            wma wmaVar2 = chatActivityEnterView3.b2;
                            RectF rectF2 = new RectF();
                            rectF2.set(kncVar4.O1);
                            if (!rectF2.isEmpty() && wmaVar2 != null) {
                                FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView3.getContext());
                                wmaVar2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                ey1 ey1Var2 = new ey1(chatActivityEnterView3.getContext(), kncVar4, (byte) 0);
                                frameLayout2.addView(ey1Var2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                frameLayout2.post(new zx1(cVar3, kncVar4, frameLayout2, ey1Var2, rectF2, arrayList, x, i7, nncVar));
                                return true;
                            }
                        }
                    } else if (i5 == 7) {
                        snc sncVar5 = (snc) lycVar.e;
                        c cVar4 = sncVar5.b;
                        byte b2 = sncVar5.c;
                        if (b2 == 4) {
                            sncVar5.u();
                            zu1 zu1Var2 = cVar4.a.E3;
                            if (zu1Var2 != null) {
                                zu1Var2.presentFragment(new woa());
                                return true;
                            }
                        } else if (b2 == 2) {
                            cVar4.e();
                            hl.d3(new lnc(sncVar5, (byte) 3), 300L);
                            return true;
                        }
                    } else if (i5 == 8) {
                        lycVar.I();
                        return true;
                    } else {
                        snc sncVar6 = (snc) lycVar.e;
                        c cVar5 = sncVar6.b;
                        if (sncVar6.L != null && sncVar6.c != 0) {
                            ChatActivityEnterView chatActivityEnterView4 = cVar5.a;
                            ChatActivityEnterView chatActivityEnterView5 = cVar5.a;
                            wma wmaVar3 = chatActivityEnterView4.b2;
                            if (wmaVar3 != null) {
                                m7 m7Var = sncVar6.Y;
                                if (m7Var != null) {
                                    m7Var.requestFocus();
                                    hl.E3(sncVar6.Y);
                                    return true;
                                }
                                vnb vnbVar = chatActivityEnterView4.K4;
                                m7 m7Var2 = new m7((byte) 10, sncVar6.a, sncVar6);
                                m7Var2.setBackground(null);
                                m7Var2.setPadding(0, 0, 0, 0);
                                m7Var2.setIncludeFontPadding(false);
                                tx1 tx1Var = chatActivityEnterView5.F0;
                                if (tx1Var != null) {
                                    L = tx1Var.getTextSize();
                                } else {
                                    L = hl.L(18.0f);
                                }
                                m7Var2.setTextSize(0, L);
                                m7Var2.setTextColor(aob.v0(aob.Le, vnbVar));
                                int i9 = aob.Ne;
                                int i10 = ChatActivityEnterView.X7;
                                m7Var2.setCursorColor(chatActivityEnterView5.J0(i9) | (-16777216));
                                yob.C(m7Var2, aob.lg, vnbVar);
                                yob.l(m7Var2, 36, aob.mg, vnbVar);
                                m7Var2.setCursorSize(hl.L(20.0f));
                                m7Var2.setCursorWidth(2.0f);
                                m7Var2.setGravity(51);
                                m7Var2.setVerticalFadingEdgeEnabled(true);
                                m7Var2.setFadingEdgeLength(hl.L(18.0f));
                                m7Var2.setInputType(147457);
                                m7Var2.setImeOptions(268435456);
                                m7Var2.setText(sncVar6.n);
                                m7Var2.setSelection(m7Var2.length());
                                int size = sncVar6.b().size();
                                sncVar6.d0 = size;
                                sncVar6.Z = size;
                                sncVar6.a0 = m7Var2.length();
                                sncVar6.c0 = "";
                                m7Var2.addTextChangedListener(new nh6(sncVar6, (byte) 24));
                                if (sncVar6.L.getParent() == wmaVar3) {
                                    childCount = wmaVar3.indexOfChild(sncVar6.L) + 1;
                                } else {
                                    childCount = wmaVar3.getChildCount();
                                }
                                wmaVar3.addView(m7Var2, childCount, new FrameLayout.LayoutParams(1, 1, 51));
                                sncVar6.Y = m7Var2;
                                m7Var2.requestFocus();
                                hl.d3(new slc(sncVar6, m7Var2, (byte) 4), 50L);
                                StringBuilder sb = new StringBuilder("field: editing in place (");
                                sb.append(sncVar6.n.length());
                                sb.append(" chars, recording ");
                                if (sncVar6.c == 2) {
                                    str = "on";
                                } else {
                                    str = "paused";
                                }
                                sb.append(str);
                                sb.append(")");
                                Log.d("VoiceLive", sb.toString());
                                sncVar6.L.invalidate();
                            }
                        }
                    }
                }
            }
            return true;
        }
        this.L0 = false;
        int p = p(motionEvent.getX(), motionEvent.getY());
        this.f0 = p;
        if (p >= 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.I0 = motionEvent.getY();
            this.J0 = this.s0;
            int i11 = this.f0;
            if (i11 == 2 && !this.T) {
                this.f0 = 3;
            } else {
                i2 = i11;
            }
            if (i2 == 0) {
                postDelayed(gncVar, ViewConfiguration.getLongPressTimeout());
            }
            invalidate();
            return true;
        }
        return false;
    }

    public final int p(float f, float f2) {
        if (this.R && this.W >= 0.6f && this.E3 <= 0.3f) {
            float L = hl.L(6.0f);
            if (this.G1 > 0.7f) {
                RectF rectF = this.P1;
                if (!rectF.isEmpty() && f >= rectF.left - L && f < rectF.right + hl.L(4.0f) && f2 >= rectF.top - L && f2 <= rectF.bottom + L) {
                    return 7;
                }
                if (!this.T) {
                    RectF rectF2 = this.O1;
                    if (!rectF2.isEmpty() && !this.N1 && f >= rectF2.left - hl.L(4.0f) && f < rectF2.right + hl.L(4.0f) && f2 >= rectF2.top - L && f2 <= rectF2.bottom + L) {
                        return 6;
                    }
                }
                if (this.K1 > 0.7f && !this.T) {
                    RectF rectF3 = this.Q1;
                    if (!rectF3.isEmpty() && f >= rectF3.left - hl.L(4.0f) && f <= rectF3.right + L && f2 >= rectF3.top - L && f2 <= rectF3.bottom + L) {
                        return 8;
                    }
                }
            }
            if (this.a0 > 0.7f && this.U0 > 0.7f && !this.q2) {
                RectF rectF4 = this.l0;
                if (!rectF4.isEmpty() && f >= rectF4.left - L && f <= rectF4.right + L && f2 >= rectF4.top - L && f2 <= rectF4.bottom + L) {
                    return 0;
                }
            }
            RectF rectF5 = this.w2;
            if (!rectF5.isEmpty() && this.u2 > 0.7f && f >= rectF5.left - L && f <= rectF5.right + L && f2 >= rectF5.top - L && f2 <= rectF5.bottom + L) {
                return 5;
            }
            boolean z = this.q2;
            RectF rectF6 = this.k0;
            if (!z || rectF6.isEmpty() || !rectF6.contains(f, f2)) {
                if (this.a0 > 0.7f && !rectF6.isEmpty() && f >= rectF6.left - L && f <= rectF6.right + L && f2 >= rectF6.top - L && f2 <= rectF6.bottom + L) {
                    if (f >= this.w1) {
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

    public final boolean q(jnc jncVar) {
        jnc jncVar2;
        ArrayList arrayList = this.L2;
        int indexOf = arrayList.indexOf(jncVar) + 1;
        if (indexOf < arrayList.size()) {
            jncVar2 = (jnc) arrayList.get(indexOf);
        } else {
            jncVar2 = null;
        }
        if (jncVar2 == null || !jncVar2.b || Math.abs(jncVar2.f - jncVar.f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean r(jnc jncVar) {
        jnc jncVar2;
        ArrayList arrayList = this.L2;
        int indexOf = arrayList.indexOf(jncVar);
        if (indexOf > 0) {
            jncVar2 = (jnc) arrayList.get(indexOf - 1);
        } else {
            jncVar2 = null;
        }
        if (jncVar2 == null || !jncVar2.b || Math.abs(jncVar2.f - jncVar.f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final float s() {
        float f = this.L1;
        if (f <= 0.0f) {
            String str = this.F1;
            if (str == null) {
                str = this.A1;
            }
            f = this.n.measureText(str);
        }
        return hl.L(6.0f) + hl.L(18.0f) + hl.L(12.0f) + f + hl.L(8.0f) + hl.L(8.0f) + hl.L(13.0f);
    }

    public void setBusy(boolean z) {
        if (this.q2 == z) {
            return;
        }
        this.q2 = z;
        if (z) {
            this.s2 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    public void setDetected(String[] strArr) {
        this.e2 = strArr;
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
        this.B1 = charSequence2;
        if (charSequence2 != null && charSequence2.endsWith(")")) {
            i = this.B1.lastIndexOf(" (");
        } else {
            i = -1;
        }
        if (i > 0) {
            str = this.B1.substring(0, i);
        }
        this.E1 = str;
        this.F1 = this.B1;
        invalidate();
    }

    public void setLanguageMenuUp(boolean z) {
        if (this.m1 == z) {
            return;
        }
        this.m1 = z;
        invalidate();
    }

    public void setLanguagePillAlpha(float f) {
        if (this.k1 == f) {
            return;
        }
        this.k1 = f;
        invalidate();
    }

    public void setLanguagePillHidden(boolean z) {
        this.N1 = z;
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
            this.D0 = SystemClock.uptimeMillis();
        }
        this.T = z;
        invalidate();
    }

    public void setPillAlpha(float f) {
        if (this.l1 == f) {
            return;
        }
        this.l1 = f;
        invalidate();
    }

    public void setPillHidden(boolean z) {
        this.x1 = z;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (!Objects.equals(str, this.C1)) {
            this.C1 = str;
            rx rxVar = this.D1;
            if (rxVar == null) {
                if (str == null) {
                    return;
                }
                rxVar = new rx((View) this);
                this.D1 = rxVar;
            }
            rxVar.i(str, true);
            invalidate();
        }
    }

    public void setRebuildNext(boolean z) {
        this.S2 = z;
    }

    public void setRevertShown(boolean z) {
        this.r2 = z;
        invalidate();
    }

    public final void u(boolean r11, float r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knc.u(boolean, float):void");
    }

    public final void v(android.text.StaticLayout r14, android.text.StaticLayout r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knc.v(android.text.StaticLayout, android.text.StaticLayout):void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.G && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(Canvas canvas, long j, float f, float f2, float f3, float f4, float f5) {
        float f6;
        mva mvaVar;
        float f7 = ((float) (j - this.V2)) / 1000.0f;
        float x = x(f7);
        float x2 = x(f7 - 0.06f);
        float L = hl.L(22.0f);
        float f8 = -hl.L(8.0f);
        float L2 = hl.L(8.0f) + this.Q0.getWidth();
        float f9 = -hl.L(40.0f);
        float L4 = hl.L(40.0f) + this.Q0.getHeight();
        canvas.save();
        canvas.translate(f, f2);
        int saveLayer = canvas.saveLayer(f8, f9, L2, L4, null);
        int i = (int) (255.0f * f3);
        this.d.setAlpha(i);
        this.Q0.draw(canvas);
        y(this.z3, x2 - hl.L(48.0f), x2);
        LinearGradient linearGradient = this.z3;
        Paint paint = this.w3;
        paint.setShader(linearGradient);
        canvas.drawRect(f8, f9, L2, L4, paint);
        y(this.y3, x2 - L, x2);
        LinearGradient linearGradient2 = this.y3;
        Paint paint2 = this.v3;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f8, f9, L2, L4, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.i3 != null && x - L < this.Z2) {
            canvas.save();
            canvas.translate(this.a3, this.b3);
            float max = Math.max(L2, this.i3.getWidth());
            f6 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f8, this.c3 - hl.L(2.0f), max, this.c3 + this.d3 + hl.L(2.0f), null);
            Paint paint3 = this.u3;
            paint3.setAlpha(i);
            canvas.drawBitmap(this.i3, -this.p3, -this.q3, paint3);
            y(this.x3, x, L + x);
            paint2.setShader(this.x3);
            canvas.drawRect(f8, f9, max, Math.max(L4, hl.L(40.0f) + this.i3.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        } else {
            f6 = 2.0f;
        }
        float f10 = hl.p;
        long j2 = this.W2;
        float max2 = Math.max(0.05f, ((float) Math.min(j2, j2 - (j - this.V2))) / 1000.0f);
        while (true) {
            int i2 = this.n3;
            int i3 = this.l3;
            mvaVar = this.R2;
            if (i2 >= i3) {
                break;
            }
            float[] fArr = this.j3;
            int i4 = i2 * 3;
            if (fArr[i4 + 2] > x) {
                break;
            }
            mvaVar.h(this.a3 + fArr[i4], this.b3 + fArr[i4 + 1], ((mvaVar.d() * 34.0f) + 10.0f) * f10, (-((mvaVar.d() * 20.0f) + 6.0f)) * f10, Math.min(max2, (mvaVar.d() * 0.3f) + 0.26f), 0.0f);
            this.n3++;
        }
        float f11 = f4 - f2;
        while (true) {
            int i5 = this.o3;
            if (i5 >= this.m3) {
                break;
            }
            float[] fArr2 = this.k3;
            int i6 = i5 * 3;
            if (fArr2[i6 + 2] > x) {
                break;
            }
            this.o3 = i5 + 1;
            float f12 = fArr2[i6 + 1];
            if (f12 >= f11 - hl.L(f6) && f12 <= f11 + f5 + hl.L(f6)) {
                float f13 = f + this.k3[i6];
                float f14 = f2 + f12;
                mvaVar.i((((mvaVar.d() * 16.0f) + 6.0f) * f10) + f13, ((mvaVar.d() - 0.5f) * 14.0f * f10) + f14, f13, f14, Math.min(max2, (mvaVar.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f7 * 1000.0f >= ((float) this.W2)) {
            this.T2 = false;
            Bitmap bitmap = this.i3;
            if (bitmap != null) {
                bitmap.recycle();
                this.i3 = null;
            }
        }
    }

    public final float x(float f) {
        float interpolation = U3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f * 1000.0f) / (((float) this.W2) - 60.0f))));
        float f2 = this.Y2;
        return qd4.A(this.Z2, f2, interpolation, f2);
    }

    public final void y(LinearGradient linearGradient, float f, float f2) {
        float f3 = f / 1.3453624f;
        Matrix matrix = this.A3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, (f2 / 1.3453624f) - f3), 1.0f);
        matrix.postRotate(41.987213f);
        matrix.postTranslate(0.7432941f * f3, f3 * 0.6689647f);
        linearGradient.setLocalMatrix(matrix);
    }

    public final int z(int i, Bitmap bitmap, boolean z) {
        float f;
        float[] fArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(hl.p * 0.8f));
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3 += max) {
            if (z) {
                float f2 = i3;
                float f3 = this.c3;
                float f4 = max;
                if (f2 >= f3 - f4) {
                    if (f2 > f3 + this.d3 + f4) {
                    }
                }
            }
            for (int i4 = 0; i4 < width; i4 += max) {
                if ((iArr[(i3 * width) + i4] >>> 24) > 90) {
                    i2++;
                }
            }
        }
        if (i2 > i) {
            f = i / i2;
        } else {
            f = 1.0f;
        }
        int min = Math.min(i2, i + 32) * 3;
        if (z) {
            fArr = this.j3;
        } else {
            fArr = this.k3;
        }
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < height; i6 += max) {
            if (z) {
                float f5 = i6;
                float f6 = this.c3;
                float f7 = max;
                if (f5 >= f6 - f7) {
                    if (f5 > f6 + this.d3 + f7) {
                    }
                }
            }
            for (int i7 = 0; i7 < width; i7 += max) {
                if ((iArr[(i6 * width) + i7] >>> 24) > 90) {
                    mva mvaVar = this.R2;
                    if (mvaVar.d() <= f) {
                        int i8 = i5 + 1;
                        if (i8 * 3 <= fArr.length) {
                            float f8 = max;
                            float d = ((mvaVar.d() - 0.5f) * f8) + i7;
                            float d2 = ((mvaVar.d() - 0.5f) * f8) + i6;
                            int i9 = i5 * 3;
                            fArr[i9] = d;
                            fArr[i9 + 1] = d2;
                            fArr[i9 + 2] = (d2 * 0.9f) + d;
                            i5 = i8;
                        }
                    }
                }
            }
        }
        Integer[] numArr = new Integer[i5];
        for (int i10 = 0; i10 < i5; i10++) {
            numArr[i10] = Integer.valueOf(i10);
        }
        Arrays.sort(numArr, new gm3(fArr, (byte) 4));
        float[] copyOf = Arrays.copyOf(fArr, i5 * 3);
        for (int i11 = 0; i11 < i5; i11++) {
            int i12 = i11 * 3;
            int intValue = numArr[i11].intValue() * 3;
            fArr[i12] = copyOf[intValue];
            fArr[i12 + 1] = copyOf[intValue + 1];
            fArr[i12 + 2] = copyOf[intValue + 2];
        }
        if (z) {
            this.j3 = fArr;
            return i5;
        }
        this.k3 = fArr;
        return i5;
    }
}
