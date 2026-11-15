package ji;

import ai.g2;
import ai.l1;
import ai.n0;
import ai.s0;
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
import bi.p1;
import com.google.android.gms.internal.vision.e2;
import di.g8;
import hi.g7;
import hi.h4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Dictation.DictationAsr;
public final class e extends View {
    public static int j3;
    public static long f17447n3;
    public static int f17448o3;
    public static int f17449p3;
    public static float f17450q3;
    public long A0;
    public final TextPaint A1;
    public float A2;
    public float B0;
    public final Matrix B1;
    public float B2;
    public long C0;
    public final TextPaint C1;
    public float C2;
    public float D0;
    public fh.g D1;
    public float D2;
    public final Matrix E;
    public float E0;
    public float E1;
    public float E2;
    public LinearGradient F;
    public long F0;
    public float F1;
    public float F2;
    public final t2 G;
    public float G0;
    public float G1;
    public float G2;
    public final Drawable H;
    public float H0;
    public long H1;
    public float H2;
    public fh.g I;
    public float I0;
    public LinearGradient I1;
    public Bitmap I2;
    public fh.g J;
    public float J0;
    public RadialGradient J1;
    public float[] J2;
    public float K;
    public boolean K0;
    public LinearGradient K1;
    public float[] K2;
    public float L;
    public final int L0;
    public final Paint L1;
    public int L2;
    public boolean M;
    public LinearGradient M0;
    public final Paint M1;
    public int M2;
    public int N;
    public final Matrix N0;
    public final Paint N1;
    public int N2;
    public int O;
    public String O0;
    public final Paint O1;
    public int O2;
    public int P;
    public StaticLayout P0;
    public final Matrix P1;
    public float P2;
    public int Q;
    public StaticLayout Q0;
    public final RectF Q1;
    public float Q2;
    public boolean R;
    public StaticLayout R0;
    public boolean R1;
    public float R2;
    public boolean S;
    public StaticLayout S0;
    public boolean S1;
    public float S2;
    public boolean T;
    public float T0;
    public long T1;
    public boolean T2;
    public float U;
    public LinearGradient U0;
    public float U1;
    public final Paint U2;
    public float V;
    public float V0;
    public float V1;
    public final Paint V2;
    public float W;
    public final Matrix W0;
    public float W1;
    public final Paint W2;
    public final Paint X0;
    public final RectF X1;
    public LinearGradient X2;
    public long Y0;
    public Drawable Y1;
    public LinearGradient Y2;
    public int Z0;
    public fh.g Z1;
    public LinearGradient Z2;
    public final xi.e f17453a;
    public float f17454a0;
    public final ArrayList f17455a1;
    public boolean f17456a2;
    public final Matrix f17457a3;
    public final e6 f17458b;
    public float f17459b0;
    public int[] f17460b1;
    public boolean f17461b2;
    public LinearGradient f17462b3;
    public final s0 f17463c;
    public float f17464c0;
    public final ArrayList f17465c1;
    public long f17466c2;
    public final Matrix f17467c3;
    public final TextPaint d;
    public float f17468d0;
    public final Paint f17469d1;
    public float d2;
    public final a f17470d3;
    public final TextPaint f17471e;
    public float f17472e0;
    public float f17473e1;
    public float[] f17474e2;
    public boolean f17475e3;
    public final TextPaint f17476f;
    public int f17477f0;
    public boolean f17478f1;
    public int f17479f2;
    public boolean f17480f3;
    public long f17481g0;
    public final Path f17482g1;
    public int f17483g2;
    public final int[] f17484g3;
    public int h;
    public long f17485h0;
    public final Paint f17486h1;
    public float f17487h2;
    public final RectF f17488i0;
    public final Paint f17489i1;
    public float f17490i2;
    public final RectF f17491j0;
    public float f17492j1;
    public float f17493j2;
    public final RectF f17494k0;
    public boolean f17495k1;
    public float f17496k2;
    public final RectF f17497l0;
    public String l1;
    public final ArrayList f17498l2;
    public final RectF m0;
    public String f17499m1;
    public final Paint f17500m2;
    public final TextPaint f17501n;
    public boolean f17502n0;
    public float n1;
    public final RectF f17503n2;
    public float f17504o0;
    public float f17505o1;
    public final er f17506o2;
    public float f17507p0;
    public float f17508p1;
    public final float[] f17509p2;
    public float f17510q0;
    public float f17511q1;
    public final Path f17512q2;
    public final Paint f17513r;
    public float f17514r0;
    public float f17515r1;
    public final nu0 f17516r2;
    public final Paint f17517s;
    public float f17518s0;
    public boolean f17519s1;
    public boolean f17520s2;
    public float f17521t0;
    public final RectF f17522t1;
    public boolean f17523t2;
    public float f17524u0;
    public Drawable f17525u1;
    public boolean f17526u2;
    public float f17527v0;
    public Drawable f17528v1;
    public long f17529v2;
    public final Paint f17530w;
    public float f17531w0;
    public final int f17532w1;
    public long f17533w2;
    public final Paint f17534x;
    public float f17535x0;
    public LinearGradient f17536x1;
    public float f17537x2;
    public final Paint f17538y;
    public float f17539y0;
    public LinearGradient f17540y1;
    public float f17541y2;
    public float f17542z0;
    public final Matrix f17543z1;
    public float f17544z2;
    public static final float f17442h3 = g0.L(19.0f);
    public static final float f17443i3 = g0.L(3.0f);
    public static final float f17444k3 = g0.L(3.0f);
    public static final float f17445l3 = g0.N(0.5f);
    public static final float f17446m3 = g0.L(6.0f);
    public static final er f17451r3 = new er(0.3d, 0.0d, 0.2d, 1.0d);
    public static final er f17452s3 = l1.E;

    public e(Context context, e6 e6Var, xi.e eVar) {
        super(context);
        this.f17463c = new s0();
        this.d = new TextPaint(1);
        this.f17471e = new TextPaint(1);
        this.f17476f = new TextPaint(1);
        this.h = 255;
        TextPaint textPaint = new TextPaint(1);
        this.f17501n = textPaint;
        this.f17513r = new Paint(1);
        Paint paint = new Paint(1);
        this.f17517s = paint;
        this.f17530w = new Paint(1);
        this.f17534x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f17538y = paint2;
        this.E = new Matrix();
        this.K = -1.0f;
        this.L = -1.0f;
        this.Q = 255;
        this.f17477f0 = -1;
        this.f17488i0 = new RectF();
        this.f17491j0 = new RectF();
        this.f17494k0 = new RectF();
        this.f17497l0 = new RectF();
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
        paint3.setStrokeWidth(g0.N(1.0f));
        this.f17455a1 = new ArrayList();
        this.f17460b1 = new int[0];
        this.f17465c1 = new ArrayList();
        this.f17469d1 = new Paint(1);
        this.f17478f1 = true;
        this.f17482g1 = new Path();
        this.f17486h1 = new Paint(1);
        this.f17489i1 = new Paint(1);
        this.f17522t1 = new RectF();
        this.f17532w1 = g0.L(10.0f) + g0.L(20.0f) + g0.L(8.0f) + g0.L(1.0f);
        this.f17543z1 = new Matrix();
        this.A1 = new TextPaint(1);
        this.B1 = new Matrix();
        this.C1 = new TextPaint(1);
        this.E1 = -1.0f;
        this.L1 = new Paint(1);
        this.M1 = new Paint(1);
        this.N1 = new Paint(1);
        this.O1 = new Paint(1);
        this.P1 = new Matrix();
        this.Q1 = new RectF();
        this.X1 = new RectF();
        this.f17474e2 = new float[0];
        this.f17498l2 = new ArrayList();
        this.f17500m2 = new Paint(1);
        this.f17503n2 = new RectF();
        this.f17506o2 = er.h;
        this.f17509p2 = new float[2];
        this.f17512q2 = new Path();
        this.f17516r2 = new nu0(2200);
        this.f17533w2 = 900L;
        this.J2 = new float[0];
        this.K2 = new float[0];
        this.U2 = new Paint();
        this.V2 = new Paint();
        this.W2 = new Paint();
        this.f17457a3 = new Matrix();
        this.f17467c3 = new Matrix();
        this.f17470d3 = new a(this, 1);
        this.f17484g3 = new int[2];
        this.f17458b = e6Var;
        this.f17453a = eVar;
        t2 t2Var = new t2(context);
        this.G = t2Var;
        t2Var.setCallback(this);
        this.H = context.getResources().getDrawable(2131232695).mutate();
        textPaint.setTextSize(g0.L(15.0f));
        textPaint.setTypeface(g0.o());
        paint.setStyle(style);
        paint.setStrokeWidth(g0.N(0.66f));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        E();
    }

    public static void B(d dVar, float f10, float[] fArr) {
        float max = Math.max(0.0f, Math.min(1.0f, (f10 - dVar.f17434j) / 0.12f));
        float f11 = dVar.f17436l;
        float f12 = dVar.d;
        float f13 = f11 - f12;
        if (dVar.f17437m) {
            fArr[0] = f12;
            fArr[1] = f11 - (f13 * max);
            return;
        }
        fArr[0] = (f13 * max) + f12;
        fArr[1] = f11;
    }

    public static ArrayList D(String str) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 < str.length()) {
            while (i7 < str.length() && Character.isWhitespace(str.charAt(i7))) {
                i7++;
            }
            if (i7 >= str.length()) {
                break;
            }
            int i10 = i7;
            while (i10 < str.length() && !Character.isWhitespace(str.charAt(i10))) {
                i10++;
            }
            arrayList.add(new int[]{i7, i10});
            i7 = i10;
        }
        return arrayList;
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return e2.z(1.0f, (float) Math.exp((-f12) / f13), f11 - f10, f10);
    }

    public final void A(float f10, float f11, float f12, long j10, Canvas canvas) {
        nu0 nu0Var;
        float f13;
        float f14;
        int i7;
        d dVar;
        float f15;
        char c10;
        d dVar2;
        int i10;
        float f16;
        int i11;
        float f17;
        Canvas canvas2 = canvas;
        float f18 = ((float) (j10 - this.f17466c2)) / 1000.0f;
        float f19 = 0.4f;
        float f20 = 1.0f;
        float f21 = 0.0f;
        float interpolation = this.f17506o2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f18 - 0.08f) / 0.4f)));
        int i12 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i12);
        ArrayList arrayList = this.f17498l2;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            d dVar3 = (d) arrayList.get(i13);
            if (dVar3.f17429c) {
                float max = Math.max(f21, Math.min(f20, ((f18 - dVar3.f17434j) - 0.26f) / 0.12f));
                if (max <= f21) {
                    i13 = i14;
                } else {
                    float f22 = dVar3.h;
                    float f23 = dVar3.f17435k;
                    float L = (g0.L(10.0f) + f23) * max;
                    float f24 = L + f22;
                    f13 = f19;
                    if (dVar3.f17437m) {
                        f22 += f23;
                    } else {
                        L = g0.L(4.0f);
                    }
                    float f25 = f22 - L;
                    float max2 = Math.max(f21, Math.min(f20, (((f18 - dVar3.f17434j) - 0.26f) - 0.12f) / 0.45f));
                    int i15 = this.O;
                    if (dVar3.f17441q) {
                        i11 = j3;
                    } else {
                        i11 = this.N;
                    }
                    f14 = f20;
                    textPaint.setColor(i0.a.f(e2.C(max2, 2.0f, 3.0f, max2 * max2), i15, i11));
                    textPaint.setAlpha((int) (255.0f * f12 * f14));
                    canvas2.save();
                    float f26 = f10 + f25;
                    float L2 = (f11 + dVar3.f17433i) - g0.L(40.0f);
                    if (dVar3.f17437m) {
                        f17 = f10 + dVar3.h + dVar3.f17435k + g0.L(4.0f);
                    } else {
                        f17 = f10 + f24;
                    }
                    canvas2.clipRect(f26, L2, f17, f11 + dVar3.f17433i + g0.L(20.0f));
                    canvas2.drawText(dVar3.f17427a, f10 + dVar3.h, f11 + dVar3.f17433i, textPaint);
                    canvas2.restore();
                    textPaint.setColor(this.N);
                    dVar3.f17438n = f10 + dVar3.h;
                    dVar3.f17439o = f11 + dVar3.f17433i;
                }
            } else {
                f13 = f19;
                f14 = f20;
                if (dVar3.f17428b) {
                    boolean m10 = m(dVar3);
                    float[] fArr = this.f17509p2;
                    if (m10) {
                        int indexOf = arrayList.indexOf(dVar3);
                        int i16 = indexOf;
                        while (!l((d) arrayList.get(i16))) {
                            i16++;
                        }
                        float f27 = this.f17490i2;
                        float f28 = f17445l3;
                        float f29 = dVar3.f17431f + f27 + f28;
                        f15 = 0.5f;
                        float f30 = (f27 + dVar3.f17432g) - f28;
                        float f31 = this.f17487h2;
                        c10 = 1;
                        float f32 = f17444k3;
                        RectF rectF = this.f17503n2;
                        rectF.set((dVar3.d + f31) - f32, f29, f31 + ((d) arrayList.get(i16)).f17436l + f32, f30);
                        Path path = this.f17512q2;
                        path.rewind();
                        float f33 = f17446m3;
                        d dVar4 = dVar3;
                        path.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i17 = this.P;
                        float f34 = f29;
                        Paint paint = this.f17500m2;
                        paint.setColor(i17);
                        paint.setAlpha((int) (Color.alpha(this.P) * f12));
                        int i18 = indexOf;
                        while (i18 <= i16) {
                            d dVar5 = (d) arrayList.get(i18);
                            B(dVar5, f18, fArr);
                            float f35 = fArr[1];
                            float f36 = fArr[0];
                            if (f35 - f36 < 0.5f) {
                                dVar2 = dVar4;
                                i10 = i16;
                                f16 = f34;
                            } else {
                                if (f36 <= dVar5.d + 0.5f && i18 == indexOf) {
                                    f36 -= f32;
                                }
                                if (f35 >= dVar5.f17436l - 0.5f && i18 == i16) {
                                    f35 += f32;
                                }
                                float f37 = this.f17487h2;
                                float f38 = f37 + f36;
                                float f39 = f37 + f35;
                                dVar2 = dVar4;
                                i10 = i16;
                                f16 = f34;
                                canvas2 = canvas;
                                canvas2.drawRect(f38, f16, f39, f30, paint);
                            }
                            i18++;
                            f34 = f16;
                            i16 = i10;
                            dVar4 = dVar2;
                        }
                        dVar = dVar4;
                        canvas2.restore();
                    } else {
                        dVar = dVar3;
                        f15 = 0.5f;
                        c10 = 1;
                    }
                    B(dVar, f18, fArr);
                    if (Math.min(fArr[c10], (dVar.d + dVar.f17435k) + g0.L(4.0f)) - Math.max(fArr[0], dVar.d - g0.L(4.0f)) >= f15) {
                        canvas2.save();
                        float f40 = this.f17487h2;
                        float f41 = fArr[0];
                        float f42 = dVar.d;
                        if (f41 <= f42 + f15) {
                            f41 = f42 - g0.L(4.0f);
                        }
                        float f43 = f40 + f41;
                        float L3 = (this.f17490i2 + dVar.f17431f) - g0.L(4.0f);
                        float f44 = this.f17487h2;
                        float f45 = fArr[c10];
                        if (f45 >= dVar.f17436l - f15) {
                            f45 = dVar.d + dVar.f17435k + g0.L(4.0f);
                        }
                        canvas2.clipRect(f43, L3, f44 + f45, this.f17490i2 + dVar.f17432g + g0.L(4.0f));
                        textPaint.setColor(j3);
                        textPaint.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawText(dVar.f17427a, this.f17487h2 + dVar.d, this.f17490i2 + dVar.f17430e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                    }
                } else {
                    float f46 = this.f17487h2;
                    float f47 = dVar3.d;
                    float f48 = ((((f10 + dVar3.h) - f46) - f47) * interpolation) + f46 + f47;
                    float f49 = this.f17490i2;
                    float f50 = dVar3.f17430e;
                    float f51 = ((((f11 + dVar3.f17433i) - f49) - f50) * interpolation) + f49 + f50;
                    if (!this.f17461b2 && dVar3.f17441q) {
                        i7 = j3;
                    } else {
                        i7 = this.N;
                    }
                    textPaint.setColor(i7);
                    textPaint.setAlpha((int) (255.0f * f12 * f14));
                    canvas2.drawText(dVar3.f17427a, f48, f51, textPaint);
                    textPaint.setColor(this.N);
                    dVar3.f17438n = f48;
                    dVar3.f17439o = f51;
                }
            }
            f20 = f14;
            i13 = i14;
            f19 = f13;
            f21 = 0.0f;
        }
        float f52 = f19;
        textPaint.setAlpha(255);
        float f53 = g0.f23610p;
        while (true) {
            int i19 = this.f17483g2;
            int i20 = this.f17479f2;
            nu0Var = this.f17516r2;
            if (i19 >= i20) {
                break;
            }
            float[] fArr2 = this.f17474e2;
            int i21 = i19 * 3;
            if (fArr2[i21 + 2] > f18) {
                break;
            }
            this.f17483g2 = i19 + 1;
            float f54 = f10 + fArr2[i21];
            float f55 = f11 + fArr2[i21 + 1];
            RectF rectF2 = this.f17491j0;
            if (f55 >= rectF2.top && f55 <= rectF2.bottom) {
                double d = nu0Var.d() * 3.141592653589793d * 2.0d;
                float d2 = ((nu0Var.d() * 18.0f) + 8.0f) * f53;
                this.f17516r2.h((((float) Math.cos(d)) * d2) + f54, e2.x((float) Math.sin(d), d2, 0.7f, f55), f54, f55, ((nu0Var.d() * f52) + 0.8f) * 0.26f);
            }
        }
        if (f18 >= this.d2) {
            this.f17456a2 = false;
            arrayList.clear();
            nu0Var.Q = g0.L(10.0f);
        }
    }

    public final boolean C(d dVar, boolean z10) {
        float L;
        float L2;
        if (z10) {
            L = dVar.f17431f;
        } else {
            L = dVar.f17433i - g0.L(14.0f);
        }
        if (z10) {
            L2 = dVar.f17432g;
        } else {
            L2 = dVar.f17433i + g0.L(4.0f);
        }
        if (L2 >= this.G2 - g0.L(2.0f)) {
            if (L <= Math.max(1.0f, this.H2) + this.G2 + g0.L(2.0f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E() {
        int o4;
        float f10;
        float f11;
        int i7;
        int i10;
        int i11 = j6.f28849d6;
        e6 e6Var = this.f17458b;
        int w02 = j6.w0(i11, e6Var);
        boolean c10 = s0.c(w02);
        this.M = c10;
        s0 s0Var = this.f17463c;
        if (s0Var.h != c10) {
            s0Var.h = c10;
        }
        int w03 = j6.w0(j6.Pe, e6Var) | (-16777216);
        s0.h(w03);
        s0Var.g(-6440822, w03);
        this.N = j6.w0(j6.Le, e6Var) | (-16777216);
        boolean z10 = this.M;
        if (z10) {
            o4 = i0.a.f(0.12f, w03, -1);
        } else {
            o4 = n0.o(w03, w02, z10);
        }
        this.O = o4;
        if (this.M) {
            f10 = g0.L(7.0f);
        } else {
            f10 = 0.0f;
        }
        f17450q3 = f10;
        int i12 = this.O;
        if (this.M) {
            f11 = 0.18f;
        } else {
            f11 = 0.14f;
        }
        this.P = j6.r1(f11, i12);
        j3 = this.O;
        this.d.setColor(this.N);
        int w04 = j6.w0(j6.Me, e6Var);
        TextPaint textPaint = this.f17471e;
        textPaint.setColor(w04);
        this.Q = Color.alpha(textPaint.getColor());
        int w05 = j6.w0(j6.G6, e6Var);
        TextPaint textPaint2 = this.f17501n;
        textPaint2.setColor(w05);
        int color = textPaint2.getColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.G.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.f17534x.setColor(w03);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f17530w.setColor(this.O);
        if (this.M) {
            i7 = -651810255;
        } else {
            i7 = -335544321;
        }
        this.f17513r.setColor(i7);
        if (this.M) {
            i10 = 654311423;
        } else {
            i10 = 335544320;
        }
        this.f17517s.setColor(i10);
        fh.g gVar = this.I;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.J;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        this.R0 = null;
        this.M0 = null;
        this.f17462b3 = null;
        this.I1 = null;
        this.f17540y1 = null;
        textPaint.setShader(null);
        invalidate();
    }

    public final void F() {
        float f10;
        int w02;
        int f11;
        int f12;
        int f13;
        int[] iArr;
        if (this.M0 == null) {
            int[] iArr2 = this.f17463c.B;
            boolean z10 = this.M;
            e6 e6Var = this.f17458b;
            if (z10) {
                w02 = s0.d(j6.w0(j6.Me, e6Var));
            } else {
                w02 = j6.w0(j6.Me, e6Var);
            }
            int i7 = w02 | (-16777216);
            if (this.M) {
                f11 = s0.e(-7359233);
            } else {
                f11 = i0.a.f(0.55f, iArr2[0], iArr2[4]);
            }
            if (this.M) {
                f12 = s0.e(-7411982);
            } else {
                f12 = i0.a.f(0.55f, iArr2[1], iArr2[4]);
            }
            if (this.M) {
                f13 = s0.e(-4940545);
            } else {
                f13 = i0.a.f(0.55f, iArr2[2], iArr2[4]);
            }
            if (this.M) {
                int e10 = s0.e(-7359233);
                int e11 = s0.e(-5650177);
                iArr = new int[]{i0.a.f(0.4f, i7, e10), i0.a.f(0.3f, i7, e11), i0.a.f(0.4f, i7, e10), i0.a.f(0.3f, i7, e11)};
            } else {
                int w03 = j6.w0(j6.Me, e6Var);
                int alpha = Color.alpha(w03);
                int[] iArr3 = new int[4];
                iArr3[0] = f11;
                iArr3[1] = f12;
                iArr3[2] = f13;
                iArr3[3] = f11;
                for (int i10 = 0; i10 < 4; i10++) {
                    iArr3[i10] = i0.a.o(i0.a.f(0.12f, w03 | (-16777216), iArr3[i10]), alpha);
                }
                iArr = iArr3;
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.MIRROR);
            this.M0 = linearGradient;
            TextPaint textPaint = this.f17471e;
            textPaint.setShader(linearGradient);
            textPaint.setColor(-1);
            this.Q = 255;
        }
        if (this.M) {
            f10 = 260.0f;
        } else {
            f10 = 160.0f;
        }
        float L = g0.L(f10);
        Matrix matrix = this.N0;
        matrix.setScale(L, 1.0f);
        matrix.postTranslate((((float) (SystemClock.uptimeMillis() % 6000)) / 6000.0f) * 2.0f * L, 0.0f);
        this.M0.setLocalMatrix(matrix);
    }

    public final StaticLayout b(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.max(1, this.Z0)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, long j10) {
        if (!this.M) {
            return;
        }
        LinearGradient linearGradient = this.I1;
        Paint paint = this.M1;
        Paint paint2 = this.L1;
        Paint paint3 = this.N1;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{s0.e(-7447553), s0.e(-13649665), s0.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
            this.I1 = linearGradient2;
            paint2.setShader(linearGradient2);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
            this.J1 = radialGradient;
            paint.setShader(radialGradient);
            LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
            this.K1 = linearGradient3;
            paint3.setShader(linearGradient3);
            paint3.setStyle(Paint.Style.STROKE);
        }
        float f14 = ((float) (j10 % 5000)) / 5000.0f;
        Matrix matrix = this.P1;
        matrix.setTranslate(4.0f * f14, 0.0f);
        float f15 = 2.6f * f12;
        matrix.postScale(f15, f15);
        matrix.postRotate(35.0f);
        matrix.postTranslate(f10, f11);
        this.I1.setLocalMatrix(matrix);
        int i7 = (int) (255.0f * f13);
        paint2.setAlpha(i7);
        canvas.drawCircle(f10, f11, f12, paint2);
        float sin = 0.06f * f12 * ((float) Math.sin(f14 * 3.141592653589793d * 2.0d));
        float f16 = 0.62f * f12;
        matrix.setScale(1.35f * f12, f16);
        matrix.postTranslate(f10 + sin, f11 - f16);
        this.J1.setLocalMatrix(matrix);
        paint.setAlpha(i7);
        canvas.drawCircle(f10, f11, f12, paint);
        matrix.setScale(f12, f12);
        matrix.postTranslate(f10, f11);
        this.K1.setLocalMatrix(matrix);
        paint3.setStrokeWidth(Math.max(1.0f, g0.N(0.8f)));
        paint3.setAlpha(i7);
        canvas.drawCircle(f10, f11, f12 - g0.N(0.4f), paint3);
    }

    public final void d(Canvas canvas, float f10, float f11) {
        float f12;
        float f13;
        float f14;
        int i7;
        boolean z10;
        float f15;
        boolean z11;
        PorterDuff.Mode mode;
        float f16;
        float f17;
        int i10;
        float f18 = this.f17511q1;
        if (this.l1 != null) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        this.f17511q1 = a(f18, f12, f11, 0.09f);
        String str = this.l1;
        if (str == null) {
            str = "Detecting…";
        }
        TextPaint textPaint = this.f17501n;
        float measureText = textPaint.measureText(str);
        float f19 = this.f17508p1;
        if (f19 > 0.0f) {
            measureText = a(f19, measureText, f11, 0.11f);
        }
        this.f17508p1 = measureText;
        float L = g0.L(36.0f);
        float n10 = n();
        RectF rectF = this.f17491j0;
        float L2 = rectF.left + g0.L(2.0f);
        float L3 = rectF.top - g0.L(8.0f);
        RectF rectF2 = this.f17522t1;
        rectF2.set(L2, L3 - L, n10 + L2, L3);
        float f20 = rectF2.right;
        float f21 = this.f17532w1;
        this.f17515r1 = f20 - f21;
        if (this.D1 == null) {
            this.D1 = this.f17453a.k(this);
        }
        float f22 = this.n1;
        float f23 = (3.0f - (f22 * 2.0f)) * f22 * f22;
        canvas.save();
        canvas.translate(0.0f, (1.0f - f23) * g0.L(6.0f));
        float C = e2.C(this.f17505o1, 0.04f, 1.0f, (f23 * 0.1f) + 0.9f);
        canvas.scale(C, C, rectF2.left + g0.L(18.0f), rectF2.bottom);
        fh.g gVar = this.D1;
        if (gVar != null) {
            gVar.r(L / 2.0f);
            f13 = 6.0f;
            f14 = 255.0f;
            this.D1.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            this.D1.setAlpha((int) (f10 * 255.0f));
            this.D1.draw(canvas);
        } else {
            f13 = 6.0f;
            f14 = 255.0f;
            if (this.M) {
                i7 = 217;
            } else {
                i7 = 235;
            }
            Paint paint = this.f17513r;
            paint.setAlpha((int) (i7 * f10));
            float f24 = L / 2.0f;
            canvas.drawRoundRect(rectF2, f24, f24, paint);
        }
        if (this.f17525u1 == null) {
            this.f17525u1 = getContext().getResources().getDrawable(2131232195).mutate();
        }
        int color = textPaint.getColor();
        float centerY = rectF2.centerY();
        Drawable drawable = this.f17525u1;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
        float f25 = f10 * f14;
        int i11 = (int) f25;
        this.f17525u1.setAlpha(i11);
        int L4 = (int) (rectF2.left + g0.L(12.0f));
        int L5 = (int) (centerY - g0.L(9.0f));
        this.f17525u1.setBounds(L4, L5, g0.L(18.0f) + L4, g0.L(18.0f) + L5);
        this.f17525u1.draw(canvas);
        float f26 = rectF2.right - f21;
        float L6 = (f26 - g0.L(13.0f)) - g0.L(4.0f);
        canvas.save();
        canvas.clipRect(rectF2.left, rectF2.top, L6 - g0.L(8.0f), rectF2.bottom);
        int alpha = textPaint.getAlpha();
        float L7 = rectF2.left + g0.L(12.0f) + g0.L(18.0f) + g0.L(f13);
        if (this.l1 == null && this.f17511q1 < 0.99f) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextPaint textPaint2 = this.C1;
        if (z10) {
            if (this.f17536x1 == null) {
                f15 = f26;
                this.f17536x1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                textPaint2.setTypeface(textPaint.getTypeface());
            } else {
                f15 = f26;
            }
            textPaint2.setTextSize(textPaint.getTextSize());
            float measureText2 = textPaint.measureText("Detecting…");
            float L8 = g0.L(36.0f);
            z11 = z10;
            mode = mode2;
            Matrix matrix = this.B1;
            matrix.setScale(L8, 1.0f);
            matrix.postTranslate(((Math.min(1.0f, ((float) (SystemClock.uptimeMillis() % 2200)) / 1100.0f) * ((L8 * 2.0f) + measureText2)) + (L7 - L8)) - (L8 / 2.0f), 0.0f);
            this.f17536x1.setLocalMatrix(matrix);
            postInvalidateOnAnimation();
        } else {
            f15 = f26;
            z11 = z10;
            mode = mode2;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f27 = centerY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        if (z11 && this.M) {
            if (this.f17540y1 == null) {
                int color2 = textPaint.getColor() | (-16777216);
                int f28 = i0.a.f(0.4f, color2, s0.e(-7359233));
                f16 = L6;
                this.f17540y1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f28, i0.a.f(0.28f, color2, s0.e(-5650177)), f28}, (float[]) null, Shader.TileMode.MIRROR);
            } else {
                f16 = L6;
            }
            float L9 = g0.L(200.0f);
            Matrix matrix2 = this.f17543z1;
            matrix2.setScale(L9, 1.0f);
            f17 = centerY;
            i10 = i11;
            matrix2.postTranslate(((((float) (SystemClock.uptimeMillis() % 6000)) / 6000.0f) * 2.0f * L9) + L7, 0.0f);
            this.f17540y1.setLocalMatrix(matrix2);
            Typeface typeface = textPaint.getTypeface();
            TextPaint textPaint3 = this.A1;
            textPaint3.setTypeface(typeface);
            textPaint3.setTextSize(textPaint.getTextSize());
            textPaint3.setShader(this.f17540y1);
            textPaint3.setAlpha((int) ((1.0f - this.f17511q1) * 0.62f * f25));
            canvas.drawText("Detecting…", L7, f27, textPaint3);
            float f29 = this.f17511q1;
            if (f29 > 0.01f && this.l1 != null) {
                textPaint.setAlpha((int) (f29 * f25));
                canvas.drawText(this.l1, L7, f27, textPaint);
            }
        } else {
            f16 = L6;
            f17 = centerY;
            i10 = i11;
            textPaint.setAlpha((int) e2.B(this.f17511q1, 0.5f, 0.5f, f25));
            String str2 = this.l1;
            if (str2 == null) {
                str2 = "Detecting…";
            }
            canvas.drawText(str2, L7, f27, textPaint);
        }
        if (z11 && SystemClock.uptimeMillis() % 2200 < 1100) {
            textPaint2.setShader(this.f17536x1);
            textPaint2.setAlpha((int) ((1.0f - this.f17511q1) * f25 * 0.55f));
            canvas.drawText("Detecting…", L7, f27, textPaint2);
        }
        textPaint.setAlpha(alpha);
        canvas.restore();
        Path path = this.f17482g1;
        boolean isEmpty = path.isEmpty();
        Paint paint2 = this.f17486h1;
        if (isEmpty) {
            path.moveTo(-g0.N(3.8f), g0.N(1.9f));
            path.lineTo(0.0f, -g0.N(1.9f));
            path.lineTo(g0.N(3.8f), g0.N(1.9f));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(g0.N(1.75f));
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(color);
        paint2.setAlpha(i10);
        canvas.save();
        canvas.translate(f16, f17);
        canvas.drawPath(path, paint2);
        canvas.restore();
        int r12 = j6.r1(0.14f * f10, color);
        Paint paint3 = this.f17489i1;
        paint3.setColor(r12);
        canvas.drawRect(f15, f17 - g0.L(10.0f), f15 + g0.L(1.0f), f17 + g0.L(10.0f), paint3);
        if (this.f17528v1 == null) {
            this.f17528v1 = getContext().getResources().getDrawable(2131232361).mutate();
        }
        this.f17528v1.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.f17528v1.setAlpha(i10);
        int L10 = (int) (f15 + g0.L(1.0f) + g0.L(8.0f) + g0.L(10.0f));
        int i12 = (int) f17;
        this.f17528v1.setBounds(L10 - g0.L(10.0f), i12 - g0.L(10.0f), g0.L(10.0f) + L10, g0.L(10.0f) + i12);
        this.f17528v1.draw(canvas);
        canvas.restore();
    }

    public final void e(Canvas canvas, float f10) {
        String str;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7;
        int i10;
        float f15 = this.f17454a0;
        float L = g0.L(36.0f);
        boolean z10 = this.R1;
        if (z10) {
            str = "Enhancing…";
        } else {
            str = "Enhance";
        }
        float h = h(z10);
        RectF rectF = this.f17491j0;
        float L2 = rectF.left + g0.L(2.0f);
        float L3 = rectF.top - g0.L(8.0f);
        boolean w10 = this.f17453a.w();
        TextPaint textPaint = this.f17501n;
        if (w10) {
            f11 = 8.0f;
            float max = Math.max(h(false), h(true)) + g0.L(6.0f) + g0.L(36.0f);
            if (this.E1 >= 0.0f && this.F1 == textPaint.getTextSize()) {
                f12 = 6.0f;
                f13 = 18.0f;
                f14 = 12.0f;
            } else {
                this.F1 = textPaint.getTextSize();
                float measureText = textPaint.measureText("Detecting…");
                f13 = 18.0f;
                f12 = 6.0f;
                float f16 = measureText;
                f14 = 12.0f;
                for (String str2 : DictationAsr.C()) {
                    String l10 = n0.l(str2);
                    if (l10 != null) {
                        f16 = Math.max(f16, textPaint.measureText(l10));
                    }
                }
                String str3 = this.l1;
                if (str3 != null) {
                    f16 = Math.max(f16, textPaint.measureText(str3));
                }
                this.E1 = f16;
            }
            if (g0.L(f12) + g0.L(f13) + g0.L(f14) + this.E1 + g0.L(8.0f) + g0.L(8.0f) + g0.L(13.0f) + this.f17532w1 + L2 + g0.L(8.0f) + max <= rectF.right - g0.L(56.0f)) {
                L2 += n() + g0.L(8.0f);
            } else {
                L3 -= g0.L(8.0f) + L;
            }
        } else {
            f11 = 8.0f;
            f12 = 6.0f;
            f13 = 18.0f;
            f14 = 12.0f;
        }
        RectF rectF2 = this.f17494k0;
        rectF2.set(L2, L3 - L, h + L2, L3);
        float f17 = 1.0f - f15;
        float min = 1.0f - Math.min(1.0f, f15 / 0.55f);
        float sin = ((((float) Math.sin(Math.min(1.0f, f15 / 0.8f) * 3.141592653589793d)) * 0.07f * f17) + ((1.0f - (min * min)) * 0.38f) + 0.62f) * L;
        float f18 = L * 0.62f;
        float max2 = Math.max(sin, ((rectF2.width() - f18) * (1.0f - ((float) Math.pow(f17, 3.0d)))) + f18);
        float f19 = rectF2.left;
        float f20 = rectF2.bottom;
        RectF rectF3 = this.m0;
        rectF3.set(f19, f20 - sin, max2 + f19, f20);
        float min2 = Math.min(1.0f, 3.0f * f15) * f10;
        float max3 = Math.max(0.0f, Math.min(1.0f, (f15 - 0.62f) / 0.38f)) * f10;
        float f21 = 1.0f - (this.f17468d0 * 0.04f);
        canvas.save();
        canvas.scale(f21, f21, rectF2.left + g0.L(f13), rectF2.bottom);
        float height = rectF3.height() / 2.0f;
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
                i7 = 217;
            } else {
                i7 = 235;
            }
            Paint paint = this.f17513r;
            paint.setAlpha((int) (i7 * min2));
            canvas.drawRoundRect(rectF3, height, height, paint);
            if (this.M) {
                i10 = 38;
            } else {
                i10 = 20;
            }
            int i11 = (int) (i10 * min2);
            Paint paint2 = this.f17517s;
            paint2.setAlpha(i11);
            canvas.drawRoundRect(rectF3, height, height, paint2);
        }
        if (max3 > 0.0f) {
            float centerY = rectF2.centerY();
            float L4 = rectF2.left + g0.L(f14);
            int i12 = (int) L4;
            t2 t2Var = this.G;
            t2Var.setBounds(i12, (int) (centerY - g0.L(f14)), g0.L(24.0f) + i12, (int) (g0.L(f14) + centerY));
            int i13 = (int) (255.0f * max3);
            t2Var.setAlpha(i13);
            t2Var.draw(canvas);
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha(i13);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(str, L4 + g0.L(f12) + g0.L(24.0f), centerY - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
            textPaint.setAlpha(alpha);
            Path path = this.f17482g1;
            boolean isEmpty = path.isEmpty();
            Paint paint3 = this.f17486h1;
            if (isEmpty) {
                path.moveTo(-g0.N(3.8f), g0.N(1.9f));
                path.lineTo(0.0f, -g0.N(1.9f));
                path.lineTo(g0.N(3.8f), g0.N(1.9f));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(g0.N(1.75f));
                paint3.setStrokeCap(Paint.Cap.ROUND);
                paint3.setStrokeJoin(Paint.Join.ROUND);
            }
            float L5 = (((rectF2.right - g0.L(10.0f)) - g0.L(14.0f)) - g0.L(f11)) - g0.L(1.0f);
            this.f17492j1 = L5;
            int r12 = j6.r1(max3 * 0.14f, textPaint.getColor());
            Paint paint4 = this.f17489i1;
            paint4.setColor(r12);
            canvas.drawRect(L5, rectF2.centerY() - g0.L(10.0f), g0.L(1.0f) + L5, rectF2.centerY() + g0.L(10.0f), paint4);
            paint3.setColor(textPaint.getColor());
            paint3.setAlpha(i13);
            canvas.save();
            canvas.translate((rectF2.right - g0.L(10.0f)) - g0.L(7.0f), rectF2.centerY());
            canvas.drawPath(path, paint3);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void f(Canvas canvas, float f10) {
        float f11;
        int i7;
        int color;
        float f12 = this.V1;
        if (this.S1 && !this.R1) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float a10 = a(f12, f11, 0.016f, 0.06f);
        this.V1 = a10;
        int i10 = (a10 > 0.01f ? 1 : (a10 == 0.01f ? 0 : -1));
        RectF rectF = this.X1;
        if (i10 < 0) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.Y1;
        xi.e eVar = this.f17453a;
        if (drawable == null) {
            this.Y1 = getContext().getResources().getDrawable(2131231001).mutate();
            fh.g k10 = eVar.k(this);
            this.Z1 = k10;
            if (k10 != null) {
                k10.r(g0.L(18.0f));
            }
        }
        float L = g0.L(36.0f);
        RectF rectF2 = this.f17494k0;
        rectF.set(rectF2.right + g0.L(6.0f), rectF2.top, rectF2.right + g0.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.f17454a0 - 0.62f) / 0.38f));
        float f13 = this.V1;
        float f14 = f10 * f13 * max;
        if (f14 >= 0.01f) {
            float x10 = (1.0f - (this.W1 * 0.06f)) * e2.x(f13, 0.3f, max, 0.7f);
            canvas.save();
            canvas.scale(x10, x10, rectF.centerX(), rectF.centerY());
            fh.g gVar = this.Z1;
            if (gVar != null) {
                gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.Z1.setAlpha((int) (255.0f * f14));
                this.Z1.draw(canvas);
            } else {
                if (this.M) {
                    i7 = 217;
                } else {
                    i7 = 235;
                }
                Paint paint = this.f17513r;
                paint.setAlpha((int) (i7 * f14));
                float f15 = L / 2.0f;
                canvas.drawRoundRect(rectF, f15, f15, paint);
            }
            ((m) eVar.d).f17571b.getClass();
            this.Y1.setColorFilter(new PorterDuffColorFilter((-16777216) | this.f17501n.getColor(), PorterDuff.Mode.SRC_IN));
            float L2 = g0.L(24.0f) / 2.0f;
            this.Y1.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
            this.Y1.setAlpha((int) (Color.alpha(color) * f14));
            this.Y1.draw(canvas);
            canvas.restore();
            float f16 = this.V1;
            if (f16 > 0.01f && f16 < 0.99f) {
                postInvalidateOnAnimation();
            }
        }
    }

    public final void g(Canvas canvas, float f10, float f11, float f12, float f13, long j10) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.O1;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(g0.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f12 * 255.0f));
        float B = e2.B(f13, 0.3f, 0.7f, g0.N(8.5f));
        RectF rectF = this.Q1;
        rectF.set(f10 - B, f11 - B, f10 + B, f11 + B);
        long j11 = j10 - this.H1;
        float f14 = (((float) (j11 % 1400)) / 1400.0f) * 2.0f;
        float min = Math.min(1.0f, f14);
        float C = e2.C(min, 2.0f, 3.0f, min * min);
        float max = Math.max(0.0f, f14 - 1.0f);
        float f15 = ((float) ((j11 / 1400) % 18)) * 220.0f;
        float C2 = (e2.C(max, 2.0f, 3.0f, max * max) * 220.0f) + f15;
        canvas.drawArc(rectF, ((((((float) (j11 % 6000)) / 6000.0f) * 360.0f) * 5.0f) + C2) % 360.0f, (((C * 220.0f) + f15) + 30.0f) - C2, false, paint);
    }

    public String getShownText() {
        return this.O0;
    }

    public final float h(boolean z10) {
        String str;
        float L = g0.L(6.0f) + g0.L(24.0f) + g0.L(12.0f);
        if (z10) {
            str = "Enhancing…";
        } else {
            str = "Enhance";
        }
        return this.f17501n.measureText(str) + L + g0.L(12.0f) + g0.L(1.0f) + g0.L(8.0f) + g0.L(14.0f) + g0.L(10.0f);
    }

    public final boolean i() {
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f17455a1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (uptimeMillis - ((c) obj).f17426c < 1520) {
                return true;
            }
        }
        return false;
    }

    public final void j(d dVar, ArrayList arrayList, int i7) {
        if (arrayList != null && i7 < arrayList.size()) {
            float[] fArr = (float[]) arrayList.get(i7);
            if (!Float.isNaN(fArr[0])) {
                float f10 = fArr[1] - this.F2;
                float f11 = dVar.f17430e;
                float f12 = f10 - f11;
                dVar.d = fArr[0] - this.E2;
                dVar.f17430e = f11 + f12;
                dVar.f17431f += f12;
                dVar.f17432g += f12;
            }
        }
    }

    public final int k(float f10, float f11) {
        if (this.R && this.W >= 0.6f) {
            float L = g0.L(6.0f);
            if (this.n1 > 0.7f) {
                RectF rectF = this.f17522t1;
                if (!rectF.isEmpty() && !this.f17519s1 && f10 >= rectF.left - L && f10 <= rectF.right + L && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
                    if (f10 >= this.f17515r1 - g0.L(4.0f)) {
                        return 7;
                    }
                    return 6;
                }
            }
            if (this.f17454a0 > 0.7f && this.T0 > 0.7f && !this.R1) {
                RectF rectF2 = this.f17497l0;
                if (!rectF2.isEmpty() && f10 >= rectF2.left - L && f10 <= rectF2.right + L && f11 >= rectF2.top - L && f11 <= rectF2.bottom + L) {
                    return 0;
                }
            }
            RectF rectF3 = this.X1;
            if (!rectF3.isEmpty() && this.V1 > 0.7f && f10 >= rectF3.left - L && f10 <= rectF3.right + L && f11 >= rectF3.top - L && f11 <= rectF3.bottom + L) {
                return 5;
            }
            boolean z10 = this.R1;
            RectF rectF4 = this.f17494k0;
            if (!z10 || rectF4.isEmpty() || !rectF4.contains(f10, f11)) {
                if (this.f17454a0 > 0.7f && !rectF4.isEmpty() && f10 >= rectF4.left - L && f10 <= rectF4.right + L && f11 >= rectF4.top - L && f11 <= rectF4.bottom + L) {
                    if (f10 >= this.f17492j1) {
                        return 4;
                    }
                    return 1;
                } else if (this.f17491j0.contains(f10, f11)) {
                    return 2;
                } else {
                    return -1;
                }
            }
            return -1;
        }
        return -1;
    }

    public final boolean l(d dVar) {
        d dVar2;
        ArrayList arrayList = this.f17498l2;
        int indexOf = arrayList.indexOf(dVar) + 1;
        if (indexOf < arrayList.size()) {
            dVar2 = (d) arrayList.get(indexOf);
        } else {
            dVar2 = null;
        }
        if (dVar2 == null || !dVar2.f17428b || Math.abs(dVar2.f17431f - dVar.f17431f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean m(d dVar) {
        d dVar2;
        ArrayList arrayList = this.f17498l2;
        int indexOf = arrayList.indexOf(dVar);
        if (indexOf > 0) {
            dVar2 = (d) arrayList.get(indexOf - 1);
        } else {
            dVar2 = null;
        }
        if (dVar2 == null || !dVar2.f17428b || Math.abs(dVar2.f17431f - dVar.f17431f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final float n() {
        float f10 = this.f17508p1;
        if (f10 <= 0.0f) {
            String str = this.l1;
            if (str == null) {
                str = "Detecting…";
            }
            f10 = this.f17501n.measureText(str);
        }
        return g0.L(6.0f) + g0.L(18.0f) + g0.L(12.0f) + f10 + g0.L(8.0f) + g0.L(8.0f) + g0.L(13.0f) + this.f17532w1;
    }

    public final void o(boolean r11, float r12) {
        throw new UnsupportedOperationException("Method not decompiled: ji.e.o(boolean, float):void");
    }

    @Override
    public final void onDraw(android.graphics.Canvas r63) {
        throw new UnsupportedOperationException("Method not decompiled: ji.e.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float L;
        int childCount;
        String str;
        int i7;
        int i10;
        Object obj;
        int actionMasked = motionEvent.getActionMasked();
        a aVar = this.f17470d3;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        removeCallbacks(aVar);
                        this.f17477f0 = -1;
                        this.K0 = false;
                        invalidate();
                        return true;
                    }
                } else {
                    int i11 = this.f17477f0;
                    if ((i11 == 2 || i11 == 3 || this.K0) && this.J0 > 0.0f) {
                        float y10 = motionEvent.getY() - this.H0;
                        if (!this.K0 && Math.abs(y10) > this.L0) {
                            this.K0 = true;
                            this.H0 = motionEvent.getY();
                            this.I0 = this.f17518s0;
                            this.f17477f0 = -1;
                        }
                        if (this.K0) {
                            this.G0 = Math.max(0.0f, Math.min(this.J0, this.I0 - (motionEvent.getY() - this.H0)));
                            invalidate();
                            return true;
                        }
                    }
                    int i12 = this.f17477f0;
                    if (i12 >= 0 && i12 != 3 && k(motionEvent.getX(), motionEvent.getY()) != this.f17477f0) {
                        removeCallbacks(aVar);
                        this.f17477f0 = -1;
                        invalidate();
                        return true;
                    }
                }
            } else {
                removeCallbacks(aVar);
                int i13 = this.f17477f0;
                if (i13 == 3) {
                    i13 = 2;
                }
                this.f17477f0 = -1;
                if (this.K0) {
                    this.K0 = false;
                    invalidate();
                    return true;
                }
                invalidate();
                if (i13 >= 0 && k(motionEvent.getX(), motionEvent.getY()) == i13) {
                    performHapticFeedback(3);
                    xi.e eVar = this.f17453a;
                    if (i13 == 0) {
                        m mVar = (m) eVar.d;
                        String trim = mVar.f17586n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "field: send " + trim.length() + " chars as text");
                            mVar.l("field send");
                            ChatActivityEnterView chatActivityEnterView = mVar.f17571b.f34928a;
                            int i14 = ChatActivityEnterView.N6;
                            chatActivityEnterView.n2(trim, new uc(chatActivityEnterView, 13));
                            return true;
                        }
                    } else if (i13 == 1) {
                        m mVar2 = (m) eVar.d;
                        ChatActivityEnterView chatActivityEnterView2 = mVar2.f17571b.f34928a;
                        int i15 = ChatActivityEnterView.N6;
                        ArrayList y11 = chatActivityEnterView2.o0().y();
                        if (y11.isEmpty()) {
                            obj = ai.i.f1241c;
                        } else {
                            obj = y11.get(0);
                        }
                        mVar2.j(obj);
                        return true;
                    } else if (i13 == 4) {
                        m mVar3 = (m) eVar.d;
                        if (mVar3.K != null && !mVar3.f17586n.trim().isEmpty()) {
                            gf gfVar = mVar3.f17571b;
                            e eVar2 = mVar3.K;
                            g7 g7Var = new g7(eVar, 5);
                            ChatActivityEnterView chatActivityEnterView3 = gfVar.f34928a;
                            st0 st0Var = chatActivityEnterView3.U1;
                            RectF rectF = new RectF();
                            rectF.set(eVar2.f17494k0);
                            if (!rectF.isEmpty() && st0Var != null) {
                                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView3.getContext());
                                st0Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                View view = new View(chatActivityEnterView3.getContext());
                                frameLayout.addView(view, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                frameLayout.post(new p1(gfVar, eVar2, frameLayout, view, rectF, g7Var, 14));
                                return true;
                            }
                        }
                    } else if (i13 == 5) {
                        m mVar4 = (m) eVar.d;
                        if (mVar4.f17580g0 != null && !mVar4.f17582i0) {
                            Log.d("VoiceLive", "field: back to the text before the style");
                            if (mVar4.f17581h0) {
                                mVar4.f17577e0 = mVar4.f17580g0;
                                mVar4.f17579f0 = mVar4.c().size();
                            } else {
                                mVar4.f17577e0 = null;
                            }
                            mVar4.f17580g0 = null;
                            e eVar3 = mVar4.K;
                            if (eVar3 != null) {
                                eVar3.setRevertShown(false);
                                mVar4.K.setRebuildNext(true);
                            }
                            mVar4.n();
                            e eVar4 = mVar4.K;
                            if (eVar4 != null) {
                                eVar4.setRebuildNext(false);
                                return true;
                            }
                        }
                    } else if (i13 == 6) {
                        m mVar5 = (m) eVar.d;
                        if (mVar5.K != null && ((i7 = mVar5.f17573c) == 2 || i7 == 4)) {
                            String[] C = DictationAsr.C();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add("Auto-Detect");
                            boolean v = DictationAsr.v();
                            if (v) {
                                i10 = 0;
                            } else {
                                i10 = -1;
                            }
                            int i16 = i10;
                            for (int i17 = 0; i17 < C.length; i17++) {
                                arrayList.add(n0.l(C[i17]));
                                if (!v && i16 < 0 && DictationAsr.y(C[i17])) {
                                    i16 = i17 + 1;
                                }
                            }
                            gf gfVar2 = mVar5.f17571b;
                            e eVar5 = mVar5.K;
                            g gVar = new g(mVar5, C, 1);
                            f fVar = new f(mVar5, 3);
                            ChatActivityEnterView chatActivityEnterView4 = gfVar2.f34928a;
                            st0 st0Var2 = chatActivityEnterView4.U1;
                            RectF rectF2 = new RectF();
                            rectF2.set(eVar5.f17522t1);
                            if (!rectF2.isEmpty() && st0Var2 != null) {
                                FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView4.getContext());
                                st0Var2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                View view2 = new View(chatActivityEnterView4.getContext());
                                frameLayout2.addView(view2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                frameLayout2.post(new g8(gfVar2, eVar5, frameLayout2, view2, rectF2, arrayList, i16, gVar, fVar));
                                return true;
                            }
                        }
                    } else if (i13 == 7) {
                        ((m) eVar.d).k();
                        return true;
                    } else {
                        m mVar6 = (m) eVar.d;
                        gf gfVar3 = mVar6.f17571b;
                        if (mVar6.K != null && mVar6.f17573c != 0) {
                            ChatActivityEnterView chatActivityEnterView5 = gfVar3.f34928a;
                            ChatActivityEnterView chatActivityEnterView6 = gfVar3.f34928a;
                            st0 st0Var3 = chatActivityEnterView5.U1;
                            if (st0Var3 != null) {
                                EditTextBoldCursor editTextBoldCursor = mVar6.X;
                                if (editTextBoldCursor != null) {
                                    editTextBoldCursor.requestFocus();
                                    g0.J3(mVar6.X);
                                    return true;
                                }
                                e6 e6Var = chatActivityEnterView5.E4;
                                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(mVar6.f17569a);
                                editTextBoldCursor2.setBackground(null);
                                editTextBoldCursor2.setPadding(0, 0, 0, 0);
                                editTextBoldCursor2.setIncludeFontPadding(false);
                                xe xeVar = chatActivityEnterView6.F0;
                                if (xeVar != null) {
                                    L = xeVar.getTextSize();
                                } else {
                                    L = g0.L(18.0f);
                                }
                                editTextBoldCursor2.setTextSize(0, L);
                                editTextBoldCursor2.setTextColor(j6.w0(j6.Le, e6Var));
                                int i18 = j6.Pe;
                                int i19 = ChatActivityEnterView.N6;
                                editTextBoldCursor2.setCursorColor(chatActivityEnterView6.u0(i18) | (-16777216));
                                editTextBoldCursor2.setCursorSize(g0.L(20.0f));
                                editTextBoldCursor2.setCursorWidth(2.0f);
                                editTextBoldCursor2.setGravity(51);
                                editTextBoldCursor2.setInputType(147457);
                                editTextBoldCursor2.setImeOptions(268435456);
                                editTextBoldCursor2.setText(mVar6.f17586n);
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                                int size = mVar6.c().size();
                                mVar6.f17572b0 = size;
                                mVar6.Y = size;
                                mVar6.Z = editTextBoldCursor2.length();
                                mVar6.f17570a0 = "";
                                editTextBoldCursor2.addTextChangedListener(new ah.j(mVar6, 8));
                                if (mVar6.K.getParent() == st0Var3) {
                                    childCount = st0Var3.indexOfChild(mVar6.K) + 1;
                                } else {
                                    childCount = st0Var3.getChildCount();
                                }
                                st0Var3.addView(editTextBoldCursor2, childCount, new FrameLayout.LayoutParams(1, 1, 51));
                                mVar6.X = editTextBoldCursor2;
                                editTextBoldCursor2.requestFocus();
                                g0.i3(new h4(24, mVar6, editTextBoldCursor2), 50L);
                                StringBuilder sb2 = new StringBuilder("field: editing in place (");
                                sb2.append(mVar6.f17586n.length());
                                sb2.append(" chars, recording ");
                                if (mVar6.f17573c == 2) {
                                    str = "on";
                                } else {
                                    str = "paused";
                                }
                                sb2.append(str);
                                sb2.append(")");
                                Log.d("VoiceLive", sb2.toString());
                                mVar6.K.invalidate();
                            }
                        }
                    }
                }
            }
            return true;
        }
        this.K0 = false;
        int k10 = k(motionEvent.getX(), motionEvent.getY());
        this.f17477f0 = k10;
        if (k10 >= 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.H0 = motionEvent.getY();
            this.I0 = this.f17518s0;
            if (this.f17477f0 == 2 && !this.T) {
                this.f17477f0 = 3;
            }
            if (this.f17477f0 == 0) {
                postDelayed(aVar, ViewConfiguration.getLongPressTimeout());
            }
            invalidate();
            return true;
        }
        return false;
    }

    public final void p(android.text.StaticLayout r14, android.text.StaticLayout r15) {
        throw new UnsupportedOperationException("Method not decompiled: ji.e.p(android.text.StaticLayout, android.text.StaticLayout):void");
    }

    public final void q(Canvas canvas, long j10, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        nu0 nu0Var;
        float f16 = ((float) (j10 - this.f17529v2)) / 1000.0f;
        float r10 = r(f16);
        float r11 = r(f16 - 0.06f);
        float L = g0.L(22.0f);
        float f17 = -g0.L(8.0f);
        float L2 = g0.L(8.0f) + this.P0.getWidth();
        float f18 = -g0.L(40.0f);
        float L3 = g0.L(40.0f) + this.P0.getHeight();
        canvas.save();
        canvas.translate(f10, f11);
        int saveLayer = canvas.saveLayer(f17, f18, L2, L3, null);
        int i7 = (int) (255.0f * f12);
        this.d.setAlpha(i7);
        this.P0.draw(canvas);
        s(this.Z2, r11 - g0.L(48.0f), r11);
        LinearGradient linearGradient = this.Z2;
        Paint paint = this.W2;
        paint.setShader(linearGradient);
        canvas.drawRect(f17, f18, L2, L3, paint);
        s(this.Y2, r11 - L, r11);
        LinearGradient linearGradient2 = this.Y2;
        Paint paint2 = this.V2;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f17, f18, L2, L3, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.I2 != null && r10 - L < this.f17544z2) {
            canvas.save();
            canvas.translate(this.A2, this.B2);
            float max = Math.max(L2, this.I2.getWidth());
            f15 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f17, this.C2 - g0.L(2.0f), max, this.C2 + this.D2 + g0.L(2.0f), null);
            Paint paint3 = this.U2;
            paint3.setAlpha(i7);
            canvas.drawBitmap(this.I2, -this.P2, -this.Q2, paint3);
            s(this.X2, r10, L + r10);
            paint2.setShader(this.X2);
            canvas.drawRect(f17, f18, max, Math.max(L3, g0.L(40.0f) + this.I2.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        } else {
            f15 = 2.0f;
        }
        float f19 = g0.f23610p;
        long j11 = this.f17533w2;
        float max2 = Math.max(0.05f, ((float) Math.min(j11, j11 - (j10 - this.f17529v2))) / 1000.0f);
        while (true) {
            int i10 = this.N2;
            int i11 = this.L2;
            nu0Var = this.f17516r2;
            if (i10 >= i11) {
                break;
            }
            float[] fArr = this.J2;
            int i12 = i10 * 3;
            if (fArr[i12 + 2] > r10) {
                break;
            }
            nu0Var.g(this.A2 + fArr[i12], this.B2 + fArr[i12 + 1], ((nu0Var.d() * 34.0f) + 10.0f) * f19, (-((nu0Var.d() * 20.0f) + 6.0f)) * f19, Math.min(max2, (nu0Var.d() * 0.3f) + 0.26f), 0.0f);
            this.N2++;
        }
        float f20 = f13 - f11;
        while (true) {
            int i13 = this.O2;
            if (i13 >= this.M2) {
                break;
            }
            float[] fArr2 = this.K2;
            int i14 = i13 * 3;
            if (fArr2[i14 + 2] > r10) {
                break;
            }
            this.O2 = i13 + 1;
            float f21 = fArr2[i14 + 1];
            if (f21 >= f20 - g0.L(f15) && f21 <= f20 + f14 + g0.L(f15)) {
                float f22 = f10 + this.K2[i14];
                float f23 = f11 + f21;
                nu0Var.h((((nu0Var.d() * 16.0f) + 6.0f) * f19) + f22, ((nu0Var.d() - 0.5f) * 14.0f * f19) + f23, f22, f23, Math.min(max2, (nu0Var.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f16 * 1000.0f >= ((float) this.f17533w2)) {
            this.f17523t2 = false;
            Bitmap bitmap = this.I2;
            if (bitmap != null) {
                bitmap.recycle();
                this.I2 = null;
            }
        }
    }

    public final float r(float f10) {
        float interpolation = f17452s3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f10 * 1000.0f) / (((float) this.f17533w2) - 60.0f))));
        float f11 = this.f17541y2;
        return e2.z(this.f17544z2, f11, interpolation, f11);
    }

    public final void s(LinearGradient linearGradient, float f10, float f11) {
        float sqrt = (float) Math.sqrt(1.809999942779541d);
        float f12 = 1.0f / sqrt;
        float f13 = 0.9f / sqrt;
        float f14 = f10 / sqrt;
        float f15 = f11 / sqrt;
        Matrix matrix = this.f17457a3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, f15 - f14), 1.0f);
        matrix.postRotate((float) Math.toDegrees(Math.atan2(f13, f12)));
        matrix.postTranslate(f12 * f14, f14 * f13);
        linearGradient.setLocalMatrix(matrix);
    }

    public void setBusy(boolean z10) {
        if (this.R1 == z10) {
            return;
        }
        this.R1 = z10;
        if (z10) {
            this.T1 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        this.l1 = charSequence2;
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.f17519s1 = z10;
        invalidate();
    }

    public void setLevel(float f10) {
        this.U = Math.max(0.0f, Math.min(1.0f, f10));
    }

    public void setListening(boolean z10) {
        this.S = z10;
        invalidate();
    }

    public void setPaused(boolean z10) {
        if (this.T != z10) {
            this.C0 = SystemClock.uptimeMillis();
        }
        this.T = z10;
        invalidate();
    }

    public void setPillHidden(boolean z10) {
        this.f17495k1 = z10;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.f17499m1)) {
            return;
        }
        this.f17499m1 = str;
        this.R0 = null;
        invalidate();
    }

    public void setRebuildNext(boolean z10) {
        this.f17520s2 = z10;
    }

    public void setRevertShown(boolean z10) {
        this.S1 = z10;
        invalidate();
    }

    public final int t(int i7, Bitmap bitmap, boolean z10) {
        float f10;
        float[] fArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(g0.f23610p * 0.8f));
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11 += max) {
            if (z10) {
                float f11 = i11;
                float f12 = this.C2;
                float f13 = max;
                if (f11 >= f12 - f13) {
                    if (f11 > f12 + this.D2 + f13) {
                    }
                }
            }
            for (int i12 = 0; i12 < width; i12 += max) {
                if ((iArr[(i11 * width) + i12] >>> 24) > 90) {
                    i10++;
                }
            }
        }
        if (i10 > i7) {
            f10 = i7 / i10;
        } else {
            f10 = 1.0f;
        }
        int min = Math.min(i10, i7 + 32) * 3;
        if (z10) {
            fArr = this.J2;
        } else {
            fArr = this.K2;
        }
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14 += max) {
            if (z10) {
                float f14 = i14;
                float f15 = this.C2;
                float f16 = max;
                if (f14 >= f15 - f16) {
                    if (f14 > f15 + this.D2 + f16) {
                    }
                }
            }
            for (int i15 = 0; i15 < width; i15 += max) {
                if ((iArr[(i14 * width) + i15] >>> 24) > 90) {
                    nu0 nu0Var = this.f17516r2;
                    if (nu0Var.d() <= f10) {
                        int i16 = i13 + 1;
                        if (i16 * 3 <= fArr.length) {
                            float f17 = max;
                            float d = ((nu0Var.d() - 0.5f) * f17) + i15;
                            float d2 = ((nu0Var.d() - 0.5f) * f17) + i14;
                            int i17 = i13 * 3;
                            fArr[i17] = d;
                            fArr[i17 + 1] = d2;
                            fArr[i17 + 2] = (d2 * 0.9f) + d;
                            i13 = i16;
                        }
                    }
                }
            }
        }
        Integer[] numArr = new Integer[i13];
        for (int i18 = 0; i18 < i13; i18++) {
            numArr[i18] = Integer.valueOf(i18);
        }
        Arrays.sort(numArr, new ai.k(2, fArr));
        float[] copyOf = Arrays.copyOf(fArr, i13 * 3);
        for (int i19 = 0; i19 < i13; i19++) {
            int i20 = i19 * 3;
            int intValue = numArr[i19].intValue() * 3;
            fArr[i20] = copyOf[intValue];
            fArr[i20 + 1] = copyOf[intValue + 1];
            fArr[i20 + 2] = copyOf[intValue + 2];
        }
        if (z10) {
            this.J2 = fArr;
            return i13;
        }
        this.K2 = fArr;
        return i13;
    }

    public final float u(long j10) {
        return f17452s3.getInterpolation(Math.max(0.0f, Math.min(1.0f, ((float) (j10 - this.f17529v2)) / ((float) this.f17533w2))));
    }

    public final float v(float f10) {
        float f11 = 0.0f;
        if (this.f17544z2 <= this.f17541y2) {
            return 0.0f;
        }
        float f12 = ((float) this.f17533w2) / 1000.0f;
        for (int i7 = 0; i7 < 24; i7++) {
            float f13 = (f11 + f12) / 2.0f;
            if (r(f13) < f10) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
        return Math.min(f12, ((float) this.f17533w2) / 1000.0f);
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
            ArrayList arrayList = this.f17455a1;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                c cVar = (c) obj;
                int i10 = cVar.f17425b;
                if (i10 > cVar.f17424a && i10 <= spannableString.length()) {
                    spannableString.setSpan(new g2(cVar, 1), cVar.f17424a, cVar.f17425b, 33);
                }
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                int[] iArr = this.f17460b1;
                if (i12 >= iArr.length) {
                    break;
                }
                int max = Math.max(0, iArr[i11]);
                int min = Math.min(spannableString.length(), this.f17460b1[i12]);
                if (min > max) {
                    spannableString.setSpan(new b(0), max, min, 33);
                }
                i11 += 2;
            }
            this.P0 = b(spannableString, this.d);
            ArrayList arrayList2 = this.f17465c1;
            arrayList2.clear();
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                int[] iArr2 = this.f17460b1;
                if (i14 < iArr2.length) {
                    int max2 = Math.max(0, iArr2[i13]);
                    int min2 = Math.min(spannableString.length(), this.f17460b1[i14]);
                    if (min2 > max2) {
                        int lineForOffset = this.P0.getLineForOffset(max2);
                        int lineForOffset2 = this.P0.getLineForOffset(min2);
                        for (int i15 = lineForOffset; i15 <= lineForOffset2; i15++) {
                            StaticLayout staticLayout = this.P0;
                            if (i15 == lineForOffset) {
                                lineLeft = staticLayout.getPrimaryHorizontal(max2);
                            } else {
                                lineLeft = staticLayout.getLineLeft(i15);
                            }
                            StaticLayout staticLayout2 = this.P0;
                            if (i15 == lineForOffset2) {
                                lineRight = staticLayout2.getPrimaryHorizontal(min2);
                            } else {
                                lineRight = staticLayout2.getLineRight(i15);
                            }
                            if ((i15 != lineForOffset2 || min2 <= 0 || min2 != this.P0.getLineStart(i15)) && lineRight - lineLeft >= 1.0f) {
                                float f10 = f17444k3;
                                float f11 = f17445l3;
                                arrayList2.add(new RectF(lineLeft - f10, this.P0.getLineTop(i15) + f11, lineRight + f10, this.P0.getLineBottom(i15) - f11));
                            }
                        }
                    }
                    i13 += 2;
                } else {
                    return;
                }
            }
        }
    }

    public final void x(java.util.ArrayList r42, boolean[] r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: ji.e.x(java.util.ArrayList, boolean[], boolean):void");
    }

    public final void y(long j10) {
        int i7;
        int i10;
        float f10;
        if (!this.R1) {
            return;
        }
        if (this.f17462b3 == null) {
            if (this.M) {
                i7 = -10777345;
            } else {
                i7 = -15374904;
            }
            int e10 = s0.e(i7);
            if (this.M) {
                i10 = -6128385;
            } else {
                i10 = -15823740;
            }
            int e11 = s0.e(i10);
            if (this.M) {
                f10 = 0.6f;
            } else {
                f10 = 0.75f;
            }
            int f11 = i0.a.f(f10, this.N, e10);
            int f12 = i0.a.f(f10, this.N, e11);
            this.f17462b3 = new LinearGradient(0.0f, 0.0f, g0.L(150.0f), 0.0f, new int[]{this.N, f11, i0.a.f(0.5f, f11, f12), f12, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
        }
        float f13 = ((float) (j10 - this.T1)) / 1000.0f;
        float sin = (((float) Math.sin((0.23f * f13) + 1.3f)) * 12.0f) + (((float) Math.sin(0.45f * f13)) * 28.0f);
        Matrix matrix = this.f17467c3;
        matrix.reset();
        matrix.setRotate(sin);
        matrix.postTranslate(g0.L(46.0f) * f13, g0.L(10.0f) * ((float) Math.sin(f13 * 0.7f)));
        this.f17462b3.setLocalMatrix(matrix);
        this.d.setShader(this.f17462b3);
    }

    public final void z() {
        if (this.I == null) {
            xi.e eVar = this.f17453a;
            this.I = eVar.k(this);
            this.J = eVar.k(this);
        }
        if (!this.R) {
            this.R = true;
            this.f17485h0 = SystemClock.uptimeMillis();
            this.f17502n0 = false;
            this.f17463c.f();
            this.f17523t2 = false;
            Bitmap bitmap = this.I2;
            if (bitmap != null) {
                bitmap.recycle();
                this.I2 = null;
            }
            this.f17456a2 = false;
            this.f17516r2.a();
            this.S1 = false;
            this.V1 = 0.0f;
            this.l1 = null;
            this.f17499m1 = null;
            this.R0 = null;
            this.n1 = 0.0f;
            this.R1 = false;
            this.U1 = 0.0f;
            this.G1 = 0.0f;
            this.f17520s2 = false;
            this.f17475e3 = false;
            this.f17480f3 = false;
        }
        setVisibility(0);
        invalidate();
    }
}
