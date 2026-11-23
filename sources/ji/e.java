package ji;

import ai.a2;
import ai.j1;
import ai.l0;
import ai.q0;
import ai.r2;
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
import bi.n2;
import com.google.android.gms.internal.vision.e2;
import di.k8;
import hi.c7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bn;
public final class e extends View {
    public static int A3;
    public static float B3;
    public static int f17923u3;
    public static long f17927y3;
    public static int f17928z3;
    public long A0;
    public final RectF A1;
    public final Path A2;
    public float B0;
    public final RectF B1;
    public final xu0 B2;
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
    public final v2 G;
    public float G0;
    public final int G1;
    public long G2;
    public final Drawable H;
    public float H0;
    public LinearGradient H1;
    public float H2;
    public fh.g I;
    public float I0;
    public LinearGradient I1;
    public float I2;
    public fh.g J;
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
    public fh.g N1;
    public float N2;
    public int O;
    public String O0;
    public fh.g O1;
    public float O2;
    public int P;
    public StaticLayout P0;
    public fh.g P1;
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
    public final xi.e f17929a;
    public float f17930a0;
    public final ArrayList f17931a1;
    public final RectF f17932a2;
    public float f17933a3;
    public final i6 f17934b;
    public float f17935b0;
    public int[] f17936b1;
    public boolean f17937b2;
    public float f17938b3;
    public final q0 f17939c;
    public float f17940c0;
    public final ArrayList f17941c1;
    public boolean f17942c2;
    public float f17943c3;
    public final TextPaint d;
    public float f17944d0;
    public final Paint f17945d1;
    public long d2;
    public boolean f17946d3;
    public final TextPaint f17947e;
    public float f17948e0;
    public float f17949e1;
    public float f17950e2;
    public final Paint f17951e3;
    public final TextPaint f17952f;
    public int f17953f0;
    public boolean f17954f1;
    public float f17955f2;
    public final Paint f17956f3;
    public long f17957g0;
    public final Path f17958g1;
    public float f17959g2;
    public final Paint f17960g3;
    public int h;
    public long f17961h0;
    public final Paint f17962h1;
    public final RectF f17963h2;
    public LinearGradient f17964h3;
    public final RectF f17965i0;
    public final Paint f17966i1;
    public Drawable f17967i2;
    public LinearGradient f17968i3;
    public final RectF f17969j0;
    public float f17970j1;
    public fh.g f17971j2;
    public LinearGradient j3;
    public final RectF f17972k0;
    public boolean f17973k1;
    public boolean f17974k2;
    public final Matrix f17975k3;
    public final RectF f17976l0;
    public float l1;
    public boolean f17977l2;
    public LinearGradient f17978l3;
    public final RectF m0;
    public float f17979m1;
    public long f17980m2;
    public final Matrix f17981m3;
    public final TextPaint f17982n;
    public boolean f17983n0;
    public final String n1;
    public float f17984n2;
    public float f17985n3;
    public float f17986o0;
    public String f17987o1;
    public float[] f17988o2;
    public final a f17989o3;
    public float f17990p0;
    public String f17991p1;
    public int f17992p2;
    public boolean f17993p3;
    public float f17994q0;
    public String f17995q1;
    public int f17996q2;
    public boolean f17997q3;
    public final Paint f17998r;
    public float f17999r0;
    public String f18000r1;
    public float f18001r2;
    public final int[] f18002r3;
    public final Paint f18003s;
    public float f18004s0;
    public float f18005s1;
    public float f18006s2;
    public float f18007t0;
    public float f18008t1;
    public float f18009t2;
    public float f18010u0;
    public float f18011u1;
    public float f18012u2;
    public float f18013v0;
    public float f18014v1;
    public final ArrayList f18015v2;
    public final Paint f18016w;
    public float f18017w0;
    public float f18018w1;
    public final Paint f18019w2;
    public final Paint f18020x;
    public float f18021x0;
    public float f18022x1;
    public final RectF f18023x2;
    public final Paint f18024y;
    public float f18025y0;
    public float f18026y1;
    public final kr f18027y2;
    public float f18028z0;
    public boolean f18029z1;
    public final float[] f18030z2;
    public static final float f17921s3 = g0.L(19.0f);
    public static final float f17922t3 = g0.L(3.0f);
    public static final float f17924v3 = g0.L(3.0f);
    public static final float f17925w3 = g0.N(0.5f);
    public static final float f17926x3 = g0.L(6.0f);
    public static final kr C3 = new kr(0.3d, 0.0d, 0.2d, 1.0d);
    public static final kr D3 = j1.J;

    public e(Context context, i6 i6Var, xi.e eVar) {
        super(context);
        this.f17939c = new q0();
        this.d = new TextPaint(1);
        this.f17947e = new TextPaint(1);
        this.f17952f = new TextPaint(1);
        this.h = 255;
        TextPaint textPaint = new TextPaint(1);
        this.f17982n = textPaint;
        this.f17998r = new Paint(1);
        Paint paint = new Paint(1);
        this.f18003s = paint;
        this.f18016w = new Paint(1);
        this.f18020x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f18024y = paint2;
        this.E = new Matrix();
        this.K = -1.0f;
        this.L = -1.0f;
        this.Q = 255;
        this.f17953f0 = -1;
        this.f17965i0 = new RectF();
        this.f17969j0 = new RectF();
        this.f17972k0 = new RectF();
        this.f17976l0 = new RectF();
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
        this.f17931a1 = new ArrayList();
        this.f17936b1 = new int[0];
        this.f17941c1 = new ArrayList();
        this.f17945d1 = new Paint(1);
        this.f17954f1 = true;
        this.f17958g1 = new Path();
        this.f17962h1 = new Paint(1);
        this.f17966i1 = new Paint(1);
        this.l1 = Float.NaN;
        this.n1 = gd.N0(2131745065, null);
        this.A1 = new RectF();
        this.B1 = new RectF();
        this.C1 = new RectF();
        this.G1 = g0.L(36.0f);
        this.J1 = new Matrix();
        this.K1 = new TextPaint(1);
        this.L1 = new Matrix();
        this.M1 = new TextPaint(1);
        this.V1 = new Paint(1);
        this.W1 = new Paint(1);
        this.X1 = new Paint(1);
        this.Y1 = new Paint(1);
        this.Z1 = new Matrix();
        this.f17932a2 = new RectF();
        this.f17963h2 = new RectF();
        this.f17988o2 = new float[0];
        this.f18015v2 = new ArrayList();
        this.f18019w2 = new Paint(1);
        this.f18023x2 = new RectF();
        this.f18027y2 = kr.h;
        this.f18030z2 = new float[2];
        this.A2 = new Path();
        this.B2 = new xu0(2200);
        this.G2 = 900L;
        this.T2 = new float[0];
        this.U2 = new float[0];
        this.f17951e3 = new Paint();
        this.f17956f3 = new Paint();
        this.f17960g3 = new Paint();
        this.f17975k3 = new Matrix();
        this.f17981m3 = new Matrix();
        this.f17989o3 = new a(this, 1);
        this.f18002r3 = new int[2];
        this.f17934b = i6Var;
        this.f17929a = eVar;
        v2 v2Var = new v2(context);
        this.G = v2Var;
        v2Var.setCallback(this);
        this.H = context.getResources().getDrawable(2131232699).mutate();
        textPaint.setTextSize(g0.L(15.0f));
        textPaint.setTypeface(g0.o());
        paint.setStyle(style);
        paint.setStrokeWidth(g0.N(0.66f));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        E();
    }

    public static void B(d dVar, float f10, float[] fArr) {
        float max = Math.max(0.0f, Math.min(1.0f, (f10 - dVar.f17913j) / 0.12f));
        float f11 = dVar.f17915l;
        float f12 = dVar.d;
        float f13 = f11 - f12;
        if (dVar.f17916m) {
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

    public final void A(float f10, float f11, float f12, long j3, Canvas canvas) {
        xu0 xu0Var;
        float f13;
        float f14;
        d dVar;
        float f15;
        char c10;
        d dVar2;
        int i7;
        float f16;
        Canvas canvas2 = canvas;
        float f17 = ((float) (j3 - this.f17980m2)) / 1000.0f;
        float f18 = 0.4f;
        float f19 = 1.0f;
        float f20 = 0.0f;
        float interpolation = this.f18027y2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f17 - 0.08f) / 0.4f)));
        int i10 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i10);
        ArrayList arrayList = this.f18015v2;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            d dVar3 = (d) arrayList.get(i11);
            if (dVar3.f17908c) {
                float max = Math.max(f20, Math.min(f19, ((f17 - dVar3.f17913j) - 0.26f) / 0.12f));
                if (max <= f20) {
                    i11 = i12;
                } else {
                    float f21 = dVar3.h;
                    float f22 = dVar3.f17914k;
                    float L = (g0.L(10.0f) + f22) * max;
                    float f23 = L + f21;
                    f13 = f18;
                    if (dVar3.f17916m) {
                        f21 += f22;
                    } else {
                        L = g0.L(4.0f);
                    }
                    float f24 = f21 - L;
                    float max2 = Math.max(f20, Math.min(f19, (((f17 - dVar3.f17913j) - 0.26f) - 0.12f) / 0.45f));
                    f14 = f19;
                    textPaint.setColor(i0.a.f(e2.C(max2, 2.0f, 3.0f, max2 * max2), this.O, dVar3.f17920q ? f17923u3 : this.N));
                    textPaint.setAlpha((int) (255.0f * f12 * f14));
                    canvas2.save();
                    canvas2.clipRect(f10 + f24, (f11 + dVar3.f17912i) - g0.L(40.0f), dVar3.f17916m ? f10 + dVar3.h + dVar3.f17914k + g0.L(4.0f) : f10 + f23, f11 + dVar3.f17912i + g0.L(20.0f));
                    canvas2.drawText(dVar3.f17906a, f10 + dVar3.h, f11 + dVar3.f17912i, textPaint);
                    canvas2.restore();
                    textPaint.setColor(this.N);
                    dVar3.f17917n = f10 + dVar3.h;
                    dVar3.f17918o = f11 + dVar3.f17912i;
                }
            } else {
                f13 = f18;
                f14 = f19;
                if (dVar3.f17907b) {
                    boolean n10 = n(dVar3);
                    float[] fArr = this.f18030z2;
                    if (n10) {
                        int indexOf = arrayList.indexOf(dVar3);
                        int i13 = indexOf;
                        while (!m((d) arrayList.get(i13))) {
                            i13++;
                        }
                        float f25 = this.f18006s2;
                        float f26 = f17925w3;
                        float f27 = dVar3.f17910f + f25 + f26;
                        f15 = 0.5f;
                        float f28 = (f25 + dVar3.f17911g) - f26;
                        float f29 = this.f18001r2;
                        c10 = 1;
                        float f30 = f17924v3;
                        RectF rectF = this.f18023x2;
                        rectF.set((dVar3.d + f29) - f30, f27, f29 + ((d) arrayList.get(i13)).f17915l + f30, f28);
                        Path path = this.A2;
                        path.rewind();
                        float f31 = f17926x3;
                        d dVar4 = dVar3;
                        path.addRoundRect(rectF, f31, f31, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i14 = this.P;
                        float f32 = f27;
                        Paint paint = this.f18019w2;
                        paint.setColor(i14);
                        paint.setAlpha((int) (Color.alpha(this.P) * f12));
                        int i15 = indexOf;
                        while (i15 <= i13) {
                            d dVar5 = (d) arrayList.get(i15);
                            B(dVar5, f17, fArr);
                            float f33 = fArr[1];
                            float f34 = fArr[0];
                            if (f33 - f34 < 0.5f) {
                                dVar2 = dVar4;
                                i7 = i13;
                                f16 = f32;
                            } else {
                                if (f34 <= dVar5.d + 0.5f && i15 == indexOf) {
                                    f34 -= f30;
                                }
                                if (f33 >= dVar5.f17915l - 0.5f && i15 == i13) {
                                    f33 += f30;
                                }
                                float f35 = this.f18001r2;
                                float f36 = f35 + f34;
                                float f37 = f35 + f33;
                                dVar2 = dVar4;
                                i7 = i13;
                                f16 = f32;
                                canvas2 = canvas;
                                canvas2.drawRect(f36, f16, f37, f28, paint);
                            }
                            i15++;
                            f32 = f16;
                            i13 = i7;
                            dVar4 = dVar2;
                        }
                        dVar = dVar4;
                        canvas2.restore();
                    } else {
                        dVar = dVar3;
                        f15 = 0.5f;
                        c10 = 1;
                    }
                    B(dVar, f17, fArr);
                    if (Math.min(fArr[c10], (dVar.d + dVar.f17914k) + g0.L(4.0f)) - Math.max(fArr[0], dVar.d - g0.L(4.0f)) >= f15) {
                        canvas2.save();
                        float f38 = this.f18001r2;
                        float f39 = fArr[0];
                        float f40 = dVar.d;
                        if (f39 <= f40 + f15) {
                            f39 = f40 - g0.L(4.0f);
                        }
                        float f41 = f38 + f39;
                        float L2 = (this.f18006s2 + dVar.f17910f) - g0.L(4.0f);
                        float f42 = this.f18001r2;
                        float f43 = fArr[c10];
                        if (f43 >= dVar.f17915l - f15) {
                            f43 = dVar.d + dVar.f17914k + g0.L(4.0f);
                        }
                        canvas2.clipRect(f41, L2, f42 + f43, this.f18006s2 + dVar.f17911g + g0.L(4.0f));
                        textPaint.setColor(f17923u3);
                        textPaint.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawText(dVar.f17906a, this.f18001r2 + dVar.d, this.f18006s2 + dVar.f17909e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                    }
                } else {
                    float f44 = this.f18001r2;
                    float f45 = dVar3.d;
                    float f46 = ((((f10 + dVar3.h) - f44) - f45) * interpolation) + f44 + f45;
                    float f47 = this.f18006s2;
                    float f48 = dVar3.f17909e;
                    float f49 = ((((f11 + dVar3.f17912i) - f47) - f48) * interpolation) + f47 + f48;
                    textPaint.setColor((this.f17977l2 || !dVar3.f17920q) ? this.N : f17923u3);
                    textPaint.setAlpha((int) (255.0f * f12 * f14));
                    canvas2.drawText(dVar3.f17906a, f46, f49, textPaint);
                    textPaint.setColor(this.N);
                    dVar3.f17917n = f46;
                    dVar3.f17918o = f49;
                }
            }
            f19 = f14;
            i11 = i12;
            f18 = f13;
            f20 = 0.0f;
        }
        float f50 = f18;
        textPaint.setAlpha(255);
        float f51 = g0.f24225p;
        while (true) {
            int i16 = this.f17996q2;
            int i17 = this.f17992p2;
            xu0Var = this.B2;
            if (i16 >= i17) {
                break;
            }
            float[] fArr2 = this.f17988o2;
            int i18 = i16 * 3;
            if (fArr2[i18 + 2] > f17) {
                break;
            }
            this.f17996q2 = i16 + 1;
            float f52 = f10 + fArr2[i18];
            float f53 = f11 + fArr2[i18 + 1];
            RectF rectF2 = this.f17969j0;
            if (f53 >= rectF2.top && f53 <= rectF2.bottom) {
                double d = xu0Var.d() * 3.141592653589793d * 2.0d;
                float d2 = ((xu0Var.d() * 18.0f) + 8.0f) * f51;
                this.B2.h((((float) Math.cos(d)) * d2) + f52, e2.x((float) Math.sin(d), d2, 0.7f, f53), f52, f53, ((xu0Var.d() * f50) + 0.8f) * 0.26f);
            }
        }
        if (f17 >= this.f17984n2) {
            this.f17974k2 = false;
            arrayList.clear();
            xu0Var.Q = g0.L(10.0f);
        }
    }

    public final boolean C(d dVar, boolean z10) {
        float L;
        float L2;
        if (z10) {
            L = dVar.f17910f;
        } else {
            L = dVar.f17912i - g0.L(14.0f);
        }
        if (z10) {
            L2 = dVar.f17911g;
        } else {
            L2 = dVar.f17912i + g0.L(4.0f);
        }
        if (L2 >= this.Q2 - g0.L(2.0f)) {
            if (L <= Math.max(1.0f, this.R2) + this.Q2 + g0.L(2.0f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E() {
        int t6;
        float f10;
        float f11;
        int i7;
        int i10;
        int i11 = n6.f29451d6;
        i6 i6Var = this.f17934b;
        int w02 = n6.w0(i11, i6Var);
        boolean c10 = q0.c(w02);
        this.M = c10;
        q0 q0Var = this.f17939c;
        if (q0Var.h != c10) {
            q0Var.h = c10;
        }
        int w03 = n6.w0(n6.Pe, i6Var) | (-16777216);
        q0.h(w03);
        q0Var.g(-6440822, w03);
        this.N = n6.w0(n6.Le, i6Var) | (-16777216);
        boolean z10 = this.M;
        if (z10) {
            t6 = i0.a.f(0.12f, w03, -1);
        } else {
            t6 = l0.t(w03, w02, z10);
        }
        this.O = t6;
        if (this.M) {
            f10 = g0.L(7.0f);
        } else {
            f10 = 0.0f;
        }
        B3 = f10;
        int i12 = this.O;
        if (this.M) {
            f11 = 0.18f;
        } else {
            f11 = 0.14f;
        }
        this.P = n6.r1(f11, i12);
        f17923u3 = this.O;
        this.d.setColor(this.N);
        int w04 = n6.w0(n6.Me, i6Var);
        TextPaint textPaint = this.f17947e;
        textPaint.setColor(w04);
        this.Q = Color.alpha(textPaint.getColor());
        int w05 = n6.w0(n6.G6, i6Var);
        TextPaint textPaint2 = this.f17982n;
        textPaint2.setColor(w05);
        int color = textPaint2.getColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.G.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.f18020x.setColor(w03);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f18016w.setColor(this.O);
        if (this.M) {
            i7 = -651810255;
        } else {
            i7 = -335544321;
        }
        this.f17998r.setColor(i7);
        if (this.M) {
            i10 = 654311423;
        } else {
            i10 = 335544320;
        }
        this.f18003s.setColor(i10);
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
        this.f17978l3 = null;
        this.S1 = null;
        this.I1 = null;
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
            int[] iArr2 = this.f17939c.B;
            boolean z10 = this.M;
            i6 i6Var = this.f17934b;
            if (z10) {
                w02 = q0.d(n6.w0(n6.Me, i6Var));
            } else {
                w02 = n6.w0(n6.Me, i6Var);
            }
            int i7 = w02 | (-16777216);
            if (this.M) {
                f11 = q0.e(-7359233);
            } else {
                f11 = i0.a.f(0.55f, iArr2[0], iArr2[4]);
            }
            if (this.M) {
                f12 = q0.e(-7411982);
            } else {
                f12 = i0.a.f(0.55f, iArr2[1], iArr2[4]);
            }
            if (this.M) {
                f13 = q0.e(-4940545);
            } else {
                f13 = i0.a.f(0.55f, iArr2[2], iArr2[4]);
            }
            if (this.M) {
                int e10 = q0.e(-7359233);
                int e11 = q0.e(-5650177);
                iArr = new int[]{i0.a.f(0.4f, i7, e10), i0.a.f(0.3f, i7, e11), i0.a.f(0.4f, i7, e10), i0.a.f(0.3f, i7, e11)};
            } else {
                int w03 = n6.w0(n6.Me, i6Var);
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
            TextPaint textPaint = this.f17947e;
            textPaint.setShader(linearGradient);
            textPaint.setColor(-1);
            this.Q = Math.round(147.9f);
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

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, long j3) {
        if (!this.M) {
            return;
        }
        LinearGradient linearGradient = this.S1;
        Paint paint = this.W1;
        Paint paint2 = this.V1;
        Paint paint3 = this.X1;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{q0.e(-7447553), q0.e(-13649665), q0.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
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
        float f14 = ((float) (j3 % 5000)) / 5000.0f;
        Matrix matrix = this.Z1;
        matrix.setTranslate(4.0f * f14, 0.0f);
        float f15 = 2.6f * f12;
        matrix.postScale(f15, f15);
        matrix.postRotate(35.0f);
        matrix.postTranslate(f10, f11);
        this.S1.setLocalMatrix(matrix);
        int i7 = (int) (255.0f * f13);
        paint2.setAlpha(i7);
        canvas.drawCircle(f10, f11, f12, paint2);
        float sin = 0.06f * f12 * ((float) Math.sin(f14 * 3.141592653589793d * 2.0d));
        float f16 = 0.62f * f12;
        matrix.setScale(1.35f * f12, f16);
        matrix.postTranslate(f10 + sin, f11 - f16);
        this.T1.setLocalMatrix(matrix);
        paint.setAlpha(i7);
        canvas.drawCircle(f10, f11, f12, paint);
        matrix.setScale(f12, f12);
        matrix.postTranslate(f10, f11);
        this.U1.setLocalMatrix(matrix);
        paint3.setStrokeWidth(Math.max(1.0f, g0.N(0.8f)));
        paint3.setAlpha(i7);
        canvas.drawCircle(f10, f11, f12 - g0.N(0.4f), paint3);
    }

    public final void d(Canvas canvas, fh.g gVar, RectF rectF, float f10) {
        int i7;
        float height = rectF.height() / 2.0f;
        if (gVar != null) {
            gVar.r(height);
            gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            gVar.setAlpha((int) (f10 * 255.0f));
            gVar.draw(canvas);
            return;
        }
        if (this.M) {
            i7 = 217;
        } else {
            i7 = 235;
        }
        Paint paint = this.f17998r;
        paint.setAlpha((int) (i7 * f10));
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    public final void e(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        RectF rectF;
        float f17;
        PorterDuff.Mode mode;
        xi.e eVar;
        float f18;
        float f19;
        float f20;
        boolean z11;
        float f21;
        boolean z12;
        int i7;
        float f22;
        float f23 = this.f18026y1;
        if (this.f17987o1 != null) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        this.f18026y1 = a(f23, f12, f11, 0.09f);
        this.f18000r1 = this.f17987o1;
        String str = this.f17995q1;
        int i10 = this.G1;
        RectF rectF2 = this.f17969j0;
        TextPaint textPaint = this.f17982n;
        if (str != null) {
            f13 = 18.0f;
            f14 = 6.0f;
            float L = rectF2.right - (((rectF2.left + g0.L(2.0f)) + i10) + g0.L(8.0f));
            if (!this.T && z10) {
                f22 = textPaint.measureText(gd.N0(2131745444, null)) + g0.L(8.0f) + g0.L(22.0f) + g0.L(12.0f) + g0.L(8.0f) + g0.L(16.0f);
            } else {
                f22 = 0.0f;
            }
            float f24 = L - f22;
            int L2 = g0.L(18.0f) + g0.L(12.0f);
            if (textPaint.measureText(this.f17987o1) + g0.L(6.0f) + L2 + g0.L(8.0f) + g0.L(8.0f) + g0.L(13.0f) > f24) {
                this.f18000r1 = this.f17995q1;
            }
        } else {
            f13 = 18.0f;
            f14 = 6.0f;
        }
        String str2 = this.f18000r1;
        String str3 = this.n1;
        if (str2 == null) {
            str2 = str3;
        }
        float measureText = textPaint.measureText(str2);
        float f25 = this.f18022x1;
        if (f25 <= 0.0f) {
            f15 = 22.0f;
        } else {
            f15 = 22.0f;
            measureText = a(f25, measureText, f11, 0.11f);
        }
        this.f18022x1 = measureText;
        float L3 = rectF2.top - g0.L(8.0f);
        float f26 = this.f18005s1;
        float C = e2.C(f26, 2.0f, 3.0f, f26 * f26);
        int color = textPaint.getColor();
        float L4 = rectF2.left + g0.L(2.0f);
        float L5 = L3 - g0.L(36.0f);
        RectF rectF3 = this.B1;
        rectF3.set(L4, L5, i10 + L4, L3);
        fh.g gVar = this.O1;
        xi.e eVar2 = this.f17929a;
        if (gVar == null) {
            this.O1 = eVar2.k(this);
        }
        canvas.save();
        float f27 = 1.0f - C;
        canvas.translate(0.0f, g0.L(f14) * f27);
        float f28 = (C * 0.1f) + 0.9f;
        float C2 = e2.C(this.f18011u1, 0.06f, 1.0f, f28);
        canvas.scale(C2, C2, rectF3.centerX(), rectF3.centerY());
        d(canvas, this.O1, rectF3, f10);
        if (this.E1 == null) {
            this.E1 = getContext().getResources().getDrawable(2131232365).mutate();
        }
        Drawable drawable = this.E1;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
        this.E1.setAlpha((int) (f10 * 255.0f));
        int L6 = g0.L(18.5f);
        float f29 = L6 / 2.0f;
        float centerX = ((int) rectF3.centerX()) - f29;
        float centerY = ((int) rectF3.centerY()) - f29;
        this.E1.setBounds(Math.round(centerX), Math.round(centerY), Math.round(centerX) + L6, Math.round(centerY) + L6);
        this.E1.draw(canvas);
        canvas.restore();
        float L7 = rectF3.right + g0.L(8.0f);
        float f30 = this.f18022x1;
        if (f30 <= 0.0f) {
            String str4 = this.f18000r1;
            if (str4 == null) {
                str4 = str3;
            }
            f30 = textPaint.measureText(str4);
        }
        int L8 = g0.L(f13) + g0.L(12.0f);
        RectF rectF4 = this.A1;
        rectF4.set(L7, L5, g0.L(f14) + L8 + f30 + g0.L(8.0f) + g0.L(8.0f) + g0.L(13.0f) + L7, L3);
        float max = Math.max(0.0f, 1.0f - (this.f17930a0 * 2.0f));
        if (max < 0.01f && !this.f18029z1) {
            rectF4.setEmpty();
        }
        if (!this.f18029z1 && max >= 0.01f) {
            float f31 = max * f10;
            if (this.N1 == null) {
                this.N1 = eVar2.k(this);
            }
            canvas.save();
            canvas.translate(0.0f, g0.L(f14) * f27);
            float C4 = e2.C(this.f18008t1, 0.04f, 1.0f, f28);
            canvas.scale(C4, C4, rectF4.left + g0.L(f13), rectF4.bottom);
            d(canvas, this.N1, rectF4, f31);
            if (this.D1 == null) {
                this.D1 = getContext().getResources().getDrawable(2131232199).mutate();
            }
            int color2 = textPaint.getColor();
            float centerY2 = rectF4.centerY();
            f17 = 0.01f;
            this.D1.setColorFilter(new PorterDuffColorFilter(color2, mode2));
            float f32 = f31 * 255.0f;
            int i11 = (int) f32;
            this.D1.setAlpha(i11);
            int L9 = (int) (rectF4.left + g0.L(12.0f));
            int L10 = (int) (centerY2 - g0.L(9.0f));
            mode = mode2;
            eVar = eVar2;
            f16 = L5;
            this.D1.setBounds(L9, L10, g0.L(f13) + L9, g0.L(f13) + L10);
            this.D1.draw(canvas);
            float L11 = (rectF4.right - g0.L(13.0f)) - g0.L(4.0f);
            canvas.save();
            canvas.clipRect(rectF4.left, rectF4.top, L11 - g0.L(8.0f), rectF4.bottom);
            int alpha = textPaint.getAlpha();
            float L12 = rectF4.left + g0.L(12.0f) + g0.L(f13) + g0.L(f14);
            if (this.f17987o1 == null && this.f18026y1 < 0.99f) {
                z11 = true;
            } else {
                z11 = false;
            }
            TextPaint textPaint2 = this.M1;
            if (z11) {
                z12 = z11;
                if (this.H1 == null) {
                    f18 = L3;
                    this.H1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                    textPaint2.setTypeface(textPaint.getTypeface());
                } else {
                    f18 = L3;
                }
                textPaint2.setTextSize(textPaint.getTextSize());
                float measureText2 = textPaint.measureText(str3);
                float L13 = g0.L(36.0f);
                f21 = L11;
                rectF = rectF4;
                Matrix matrix = this.L1;
                matrix.setScale(L13, 1.0f);
                matrix.postTranslate(((Math.min(1.0f, ((float) (SystemClock.uptimeMillis() % 2200)) / 1100.0f) * ((L13 * 2.0f) + measureText2)) + (L12 - L13)) - (L13 / 2.0f), 0.0f);
                this.H1.setLocalMatrix(matrix);
                postInvalidateOnAnimation();
            } else {
                f21 = L11;
                rectF = rectF4;
                z12 = z11;
                f18 = L3;
            }
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f33 = centerY2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            if (z12 && this.M) {
                if (this.I1 == null) {
                    int color3 = textPaint.getColor() | (-16777216);
                    int f34 = i0.a.f(0.4f, color3, q0.e(-7359233));
                    this.I1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f34, i0.a.f(0.28f, color3, q0.e(-5650177)), f34}, (float[]) null, Shader.TileMode.MIRROR);
                }
                float L14 = g0.L(200.0f);
                Matrix matrix2 = this.J1;
                matrix2.setScale(L14, 1.0f);
                i7 = i11;
                matrix2.postTranslate(((((float) (SystemClock.uptimeMillis() % 6000)) / 6000.0f) * 2.0f * L14) + L12, 0.0f);
                this.I1.setLocalMatrix(matrix2);
                Typeface typeface = textPaint.getTypeface();
                TextPaint textPaint3 = this.K1;
                textPaint3.setTypeface(typeface);
                textPaint3.setTextSize(textPaint.getTextSize());
                textPaint3.setShader(this.I1);
                textPaint3.setAlpha((int) ((1.0f - this.f18026y1) * 0.62f * f32));
                canvas.drawText(str3, L12, f33, textPaint3);
                float f35 = this.f18026y1;
                if (f35 > 0.01f && this.f17987o1 != null) {
                    textPaint.setAlpha((int) (f35 * f32));
                    canvas.drawText(this.f18000r1, L12, f33, textPaint);
                }
            } else {
                i7 = i11;
                textPaint.setAlpha((int) e2.B(this.f18026y1, 0.5f, 0.5f, f32));
                String str5 = this.f18000r1;
                if (str5 == null) {
                    str5 = str3;
                }
                canvas.drawText(str5, L12, f33, textPaint);
            }
            if (z12 && SystemClock.uptimeMillis() % 2200 < 1100) {
                textPaint2.setShader(this.H1);
                textPaint2.setAlpha((int) ((1.0f - this.f18026y1) * f32 * 0.55f));
                canvas.drawText(str3, L12, f33, textPaint2);
            }
            textPaint.setAlpha(alpha);
            canvas.restore();
            Path path = this.f17958g1;
            boolean isEmpty = path.isEmpty();
            Paint paint = this.f17962h1;
            if (isEmpty) {
                path.moveTo(-g0.N(3.8f), g0.N(1.9f));
                f19 = 0.0f;
                path.lineTo(0.0f, -g0.N(1.9f));
                path.lineTo(g0.N(3.8f), g0.N(1.9f));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(g0.N(1.75f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else {
                f19 = 0.0f;
            }
            paint.setColor(color2);
            paint.setAlpha(i7);
            canvas.save();
            canvas.translate(f21, centerY2);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        } else {
            f16 = L5;
            rectF = rectF4;
            f17 = 0.01f;
            mode = mode2;
            eVar = eVar2;
            f18 = L3;
            f19 = 0.0f;
        }
        float f36 = this.f18018w1;
        if (!this.T && z10) {
            f20 = 1.0f;
        } else {
            f20 = f19;
        }
        float a10 = a(f36, f20, f11, 0.1f);
        this.f18018w1 = a10;
        int i12 = (a10 > f17 ? 1 : (a10 == f17 ? 0 : -1));
        RectF rectF5 = this.C1;
        if (i12 > 0) {
            String N0 = gd.N0(2131745444, null);
            float L15 = rectF.right + g0.L(8.0f);
            rectF5.set(L15, f16, textPaint.measureText(N0) + g0.L(12.0f) + L15 + g0.L(f15) + g0.L(8.0f) + g0.L(16.0f), f18);
            if (this.P1 == null) {
                this.P1 = eVar.k(this);
            }
            float f37 = this.f18018w1;
            float C5 = e2.C(f37, 2.0f, 3.0f, f37 * f37);
            float f38 = f37 * f10;
            canvas.save();
            float C6 = e2.C(this.f18014v1, 0.04f, 1.0f, (C5 * 0.15f) + 0.85f);
            canvas.scale(C6, C6, rectF5.left, rectF5.centerY());
            d(canvas, this.P1, rectF5, f38);
            if (this.F1 == null) {
                this.F1 = getContext().getResources().getDrawable(2131232805).mutate();
            }
            this.F1.setColorFilter(new PorterDuffColorFilter(color, mode));
            int i13 = (int) (f38 * 255.0f);
            this.F1.setAlpha(i13);
            int L16 = (int) (rectF5.left + g0.L(12.0f));
            int centerY3 = (int) (rectF5.centerY() - g0.L(11.0f));
            this.F1.setBounds(L16, centerY3, g0.L(f15) + L16, g0.L(f15) + centerY3);
            this.F1.draw(canvas);
            int alpha2 = textPaint.getAlpha();
            textPaint.setAlpha(i13);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            canvas.drawText(N0, rectF5.left + g0.L(12.0f) + g0.L(f15) + g0.L(8.0f), rectF5.centerY() - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f), textPaint);
            textPaint.setAlpha(alpha2);
            canvas.restore();
            return;
        }
        rectF5.setEmpty();
    }

    public final void f(Canvas canvas, float f10) {
        int i7;
        float f11;
        float f12;
        int i10;
        int i11;
        int i12;
        float L;
        float f13 = this.f17930a0;
        float L2 = g0.L(36.0f);
        if (this.f17937b2) {
            i7 = 2131745059;
        } else {
            i7 = 2131745060;
        }
        String N0 = gd.N0(i7, null);
        float i13 = i();
        RectF rectF = this.f17969j0;
        float L3 = rectF.left + g0.L(2.0f);
        float L4 = rectF.top - g0.L(8.0f);
        if (this.f17929a.x()) {
            f11 = 2.0f;
            float L5 = this.G1 + L3 + g0.L(8.0f);
            float i14 = i();
            f12 = 8.0f;
            boolean z10 = false;
            if (this.f17942c2 && !this.f17937b2) {
                i12 = g0.L(36.0f) + g0.L(6.0f);
            } else {
                i12 = 0;
            }
            if (i14 + i12 + L5 <= rectF.right - g0.L(56.0f)) {
                z10 = true;
            }
            if (z10) {
                L3 = L5;
            }
            if (z10) {
                L = 0.0f;
            } else {
                L = g0.L(8.0f) + L2;
            }
            if (Float.isNaN(this.l1)) {
                this.l1 = L3;
                this.f17979m1 = L;
            } else {
                this.l1 = a(this.l1, L3, 0.016f, 0.07f);
                this.f17979m1 = a(this.f17979m1, L, 0.016f, 0.07f);
                if (Math.abs(this.l1 - L3) > 0.5f || Math.abs(this.f17979m1 - L) > 0.5f) {
                    postInvalidateOnAnimation();
                }
            }
            if (this.f17930a0 < 0.01f) {
                this.l1 = Float.NaN;
            }
            if (!Float.isNaN(this.l1)) {
                L3 = this.l1;
            }
            if (!Float.isNaN(this.l1)) {
                L = this.f17979m1;
            }
            L4 -= L;
        } else {
            f11 = 2.0f;
            f12 = 8.0f;
        }
        RectF rectF2 = this.f17972k0;
        rectF2.set(L3, L4 - L2, i13 + L3, L4);
        float f14 = 1.0f - f13;
        float min = 1.0f - Math.min(1.0f, f13 / 0.55f);
        float sin = ((((float) Math.sin(Math.min(1.0f, f13 / 0.8f) * 3.141592653589793d)) * 0.07f * f14) + ((1.0f - (min * min)) * 0.38f) + 0.62f) * L2;
        float f15 = L2 * 0.62f;
        float max = Math.max(sin, ((rectF2.width() - f15) * (1.0f - ((float) Math.pow(f14, 3.0d)))) + f15);
        float f16 = rectF2.left;
        float f17 = rectF2.bottom;
        RectF rectF3 = this.m0;
        rectF3.set(f16, f17 - sin, max + f16, f17);
        float min2 = Math.min(1.0f, 3.0f * f13) * f10;
        float max2 = Math.max(0.0f, Math.min(1.0f, (f13 - 0.62f) / 0.38f)) * f10;
        float f18 = 1.0f - (this.f17944d0 * 0.04f);
        canvas.save();
        canvas.scale(f18, f18, rectF2.left + g0.L(18.0f), rectF2.bottom);
        float height = rectF3.height() / f11;
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
                i10 = 217;
            } else {
                i10 = 235;
            }
            Paint paint = this.f17998r;
            paint.setAlpha((int) (i10 * min2));
            canvas.drawRoundRect(rectF3, height, height, paint);
            if (this.M) {
                i11 = 38;
            } else {
                i11 = 20;
            }
            int i15 = (int) (i11 * min2);
            Paint paint2 = this.f18003s;
            paint2.setAlpha(i15);
            canvas.drawRoundRect(rectF3, height, height, paint2);
        }
        if (max2 > 0.0f) {
            float centerY = rectF2.centerY();
            float L6 = rectF2.left + g0.L(12.0f);
            int i16 = (int) L6;
            v2 v2Var = this.G;
            v2Var.setBounds(i16, (int) (centerY - g0.L(12.0f)), g0.L(24.0f) + i16, (int) (g0.L(12.0f) + centerY));
            int i17 = (int) (255.0f * max2);
            v2Var.setAlpha(i17);
            v2Var.draw(canvas);
            TextPaint textPaint = this.f17982n;
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha(i17);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(N0, L6 + g0.L(6.0f) + g0.L(24.0f), centerY - ((fontMetrics.ascent + fontMetrics.descent) / f11), textPaint);
            textPaint.setAlpha(alpha);
            Path path = this.f17958g1;
            boolean isEmpty = path.isEmpty();
            Paint paint3 = this.f17962h1;
            if (isEmpty) {
                path.moveTo(-g0.N(3.8f), g0.N(1.9f));
                path.lineTo(0.0f, -g0.N(1.9f));
                path.lineTo(g0.N(3.8f), g0.N(1.9f));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(g0.N(1.75f));
                paint3.setStrokeCap(Paint.Cap.ROUND);
                paint3.setStrokeJoin(Paint.Join.ROUND);
            }
            float L7 = (((rectF2.right - g0.L(10.0f)) - g0.L(14.0f)) - g0.L(f12)) - g0.L(1.0f);
            this.f17970j1 = L7;
            int r12 = n6.r1(max2 * 0.14f, textPaint.getColor());
            Paint paint4 = this.f17966i1;
            paint4.setColor(r12);
            canvas.drawRect(L7, rectF2.centerY() - g0.L(10.0f), g0.L(1.0f) + L7, rectF2.centerY() + g0.L(10.0f), paint4);
            paint3.setColor(textPaint.getColor());
            paint3.setAlpha(i17);
            canvas.save();
            canvas.translate((rectF2.right - g0.L(10.0f)) - g0.L(7.0f), rectF2.centerY());
            canvas.drawPath(path, paint3);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void g(Canvas canvas, float f10) {
        float f11;
        int i7;
        int color;
        float f12 = this.f17955f2;
        if (this.f17942c2 && !this.f17937b2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float a10 = a(f12, f11, 0.016f, 0.06f);
        this.f17955f2 = a10;
        int i10 = (a10 > 0.01f ? 1 : (a10 == 0.01f ? 0 : -1));
        RectF rectF = this.f17963h2;
        if (i10 < 0) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.f17967i2;
        xi.e eVar = this.f17929a;
        if (drawable == null) {
            this.f17967i2 = getContext().getResources().getDrawable(2131231003).mutate();
            fh.g k10 = eVar.k(this);
            this.f17971j2 = k10;
            if (k10 != null) {
                k10.r(g0.L(18.0f));
            }
        }
        float L = g0.L(36.0f);
        RectF rectF2 = this.f17972k0;
        rectF.set(rectF2.right + g0.L(6.0f), rectF2.top, rectF2.right + g0.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.f17930a0 - 0.62f) / 0.38f));
        float f13 = this.f17955f2;
        float f14 = f10 * f13 * max;
        if (f14 >= 0.01f) {
            float x10 = (1.0f - (this.f17959g2 * 0.06f)) * e2.x(f13, 0.3f, max, 0.7f);
            canvas.save();
            canvas.scale(x10, x10, rectF.centerX(), rectF.centerY());
            fh.g gVar = this.f17971j2;
            if (gVar != null) {
                gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.f17971j2.setAlpha((int) (255.0f * f14));
                this.f17971j2.draw(canvas);
            } else {
                if (this.M) {
                    i7 = 217;
                } else {
                    i7 = 235;
                }
                Paint paint = this.f17998r;
                paint.setAlpha((int) (i7 * f14));
                float f15 = L / 2.0f;
                canvas.drawRoundRect(rectF, f15, f15, paint);
            }
            ((n) eVar.d).f18060b.getClass();
            this.f17967i2.setColorFilter(new PorterDuffColorFilter((-16777216) | this.f17982n.getColor(), PorterDuff.Mode.SRC_IN));
            float L2 = g0.L(24.0f) / 2.0f;
            this.f17967i2.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
            this.f17967i2.setAlpha((int) (Color.alpha(color) * f14));
            this.f17967i2.draw(canvas);
            canvas.restore();
            float f16 = this.f17955f2;
            if (f16 > 0.01f && f16 < 0.99f) {
                postInvalidateOnAnimation();
            }
        }
    }

    public String getShownText() {
        return this.O0;
    }

    public final void h(Canvas canvas, float f10, float f11, float f12, float f13, long j3) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.Y1;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(g0.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f12 * 255.0f));
        float B = e2.B(f13, 0.3f, 0.7f, g0.N(8.5f));
        RectF rectF = this.f17932a2;
        rectF.set(f10 - B, f11 - B, f10 + B, f11 + B);
        long j10 = j3 - this.R1;
        float f14 = (((float) (j10 % 1400)) / 1400.0f) * 2.0f;
        float min = Math.min(1.0f, f14);
        float C = e2.C(min, 2.0f, 3.0f, min * min);
        float max = Math.max(0.0f, f14 - 1.0f);
        float f15 = ((float) ((j10 / 1400) % 18)) * 220.0f;
        float C2 = (e2.C(max, 2.0f, 3.0f, max * max) * 220.0f) + f15;
        canvas.drawArc(rectF, ((((((float) (j10 % 6000)) / 6000.0f) * 360.0f) * 5.0f) + C2) % 360.0f, (((C * 220.0f) + f15) + 30.0f) - C2, false, paint);
    }

    public final float i() {
        int i7;
        boolean z10 = this.f17937b2;
        float L = g0.L(6.0f) + g0.L(24.0f) + g0.L(12.0f);
        if (z10) {
            i7 = 2131745059;
        } else {
            i7 = 2131745060;
        }
        return this.f17982n.measureText(gd.N0(i7, null)) + L + g0.L(12.0f) + g0.L(1.0f) + g0.L(8.0f) + g0.L(14.0f) + g0.L(10.0f);
    }

    public final boolean j() {
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f17931a1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (uptimeMillis - ((c) obj).f17905c < 1520) {
                return true;
            }
        }
        return false;
    }

    public final void k(d dVar, ArrayList arrayList, int i7) {
        if (arrayList != null && i7 < arrayList.size()) {
            float[] fArr = (float[]) arrayList.get(i7);
            if (!Float.isNaN(fArr[0])) {
                float f10 = fArr[1] - this.P2;
                float f11 = dVar.f17909e;
                float f12 = f10 - f11;
                dVar.d = fArr[0] - this.O2;
                dVar.f17909e = f11 + f12;
                dVar.f17910f += f12;
                dVar.f17911g += f12;
            }
        }
    }

    public final int l(float f10, float f11) {
        if (this.R && this.W >= 0.6f && this.f17985n3 <= 0.3f) {
            float L = g0.L(6.0f);
            if (this.f18005s1 > 0.7f) {
                RectF rectF = this.B1;
                if (!rectF.isEmpty() && f10 >= rectF.left - L && f10 < rectF.right + g0.L(4.0f) && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
                    return 7;
                }
                if (!this.T) {
                    RectF rectF2 = this.A1;
                    if (!rectF2.isEmpty() && !this.f18029z1 && f10 >= rectF2.left - g0.L(4.0f) && f10 < rectF2.right + g0.L(4.0f) && f11 >= rectF2.top - L && f11 <= rectF2.bottom + L) {
                        return 6;
                    }
                }
                if (this.f18018w1 > 0.7f && !this.T) {
                    RectF rectF3 = this.C1;
                    if (!rectF3.isEmpty() && f10 >= rectF3.left - g0.L(4.0f) && f10 <= rectF3.right + L && f11 >= rectF3.top - L && f11 <= rectF3.bottom + L) {
                        return 8;
                    }
                }
            }
            if (this.f17930a0 > 0.7f && this.T0 > 0.7f && !this.f17937b2) {
                RectF rectF4 = this.f17976l0;
                if (!rectF4.isEmpty() && f10 >= rectF4.left - L && f10 <= rectF4.right + L && f11 >= rectF4.top - L && f11 <= rectF4.bottom + L) {
                    return 0;
                }
            }
            RectF rectF5 = this.f17963h2;
            if (!rectF5.isEmpty() && this.f17955f2 > 0.7f && f10 >= rectF5.left - L && f10 <= rectF5.right + L && f11 >= rectF5.top - L && f11 <= rectF5.bottom + L) {
                return 5;
            }
            boolean z10 = this.f17937b2;
            RectF rectF6 = this.f17972k0;
            if (!z10 || rectF6.isEmpty() || !rectF6.contains(f10, f11)) {
                if (this.f17930a0 > 0.7f && !rectF6.isEmpty() && f10 >= rectF6.left - L && f10 <= rectF6.right + L && f11 >= rectF6.top - L && f11 <= rectF6.bottom + L) {
                    if (f10 >= this.f17970j1) {
                        return 4;
                    }
                    return 1;
                } else if (this.f17969j0.contains(f10, f11)) {
                    return 2;
                } else {
                    return -1;
                }
            }
            return -1;
        }
        return -1;
    }

    public final boolean m(d dVar) {
        d dVar2;
        ArrayList arrayList = this.f18015v2;
        int indexOf = arrayList.indexOf(dVar) + 1;
        if (indexOf < arrayList.size()) {
            dVar2 = (d) arrayList.get(indexOf);
        } else {
            dVar2 = null;
        }
        if (dVar2 == null || !dVar2.f17907b || Math.abs(dVar2.f17910f - dVar.f17910f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean n(d dVar) {
        d dVar2;
        ArrayList arrayList = this.f18015v2;
        int indexOf = arrayList.indexOf(dVar);
        if (indexOf > 0) {
            dVar2 = (d) arrayList.get(indexOf - 1);
        } else {
            dVar2 = null;
        }
        if (dVar2 == null || !dVar2.f17907b || Math.abs(dVar2.f17910f - dVar.f17910f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final void o(boolean r11, float r12) {
        throw new UnsupportedOperationException("Method not decompiled: ji.e.o(boolean, float):void");
    }

    @Override
    public final void onDraw(android.graphics.Canvas r64) {
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
        a aVar = this.f17989o3;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        removeCallbacks(aVar);
                        this.f17953f0 = -1;
                        this.K0 = false;
                        invalidate();
                        return true;
                    }
                } else {
                    int i11 = this.f17953f0;
                    if ((i11 == 2 || i11 == 3 || this.K0) && this.J0 > 0.0f) {
                        float y10 = motionEvent.getY() - this.H0;
                        if (!this.K0 && Math.abs(y10) > this.L0) {
                            this.K0 = true;
                            this.H0 = motionEvent.getY();
                            this.I0 = this.f18004s0;
                            this.f17953f0 = -1;
                        }
                        if (this.K0) {
                            this.G0 = Math.max(0.0f, Math.min(this.J0, this.I0 - (motionEvent.getY() - this.H0)));
                            invalidate();
                            return true;
                        }
                    }
                    int i12 = this.f17953f0;
                    if (i12 >= 0 && i12 != 3 && l(motionEvent.getX(), motionEvent.getY()) != this.f17953f0) {
                        removeCallbacks(aVar);
                        this.f17953f0 = -1;
                        invalidate();
                        return true;
                    }
                }
            } else {
                removeCallbacks(aVar);
                int i13 = this.f17953f0;
                if (i13 == 3) {
                    i13 = 2;
                }
                this.f17953f0 = -1;
                if (this.K0) {
                    this.K0 = false;
                    invalidate();
                    return true;
                }
                invalidate();
                if (i13 >= 0 && l(motionEvent.getX(), motionEvent.getY()) == i13) {
                    performHapticFeedback(3);
                    xi.e eVar = this.f17929a;
                    if (i13 == 0) {
                        eVar.F();
                        return true;
                    } else if (i13 == 1) {
                        n nVar = (n) eVar.d;
                        ChatActivityEnterView chatActivityEnterView = nVar.f18060b.f38823a;
                        int i14 = ChatActivityEnterView.f32633s7;
                        ArrayList H = chatActivityEnterView.A0().H();
                        if (H.isEmpty()) {
                            obj = ai.d.f1156c;
                        } else {
                            obj = H.get(0);
                        }
                        nVar.j(obj);
                        return true;
                    } else if (i13 == 4) {
                        n nVar2 = (n) eVar.d;
                        if (nVar2.K != null && !nVar2.f18075n.trim().isEmpty()) {
                            qf qfVar = nVar2.f18060b;
                            e eVar2 = nVar2.K;
                            c7 c7Var = new c7(eVar, 6);
                            ChatActivityEnterView chatActivityEnterView2 = qfVar.f38823a;
                            cu0 cu0Var = chatActivityEnterView2.f32655c2;
                            RectF rectF = new RectF();
                            rectF.set(eVar2.f17972k0);
                            if (!rectF.isEmpty() && cu0Var != null) {
                                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                                cu0Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                View view = new View(chatActivityEnterView2.getContext());
                                frameLayout.addView(view, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                frameLayout.post(new n2(qfVar, eVar2, frameLayout, view, rectF, c7Var, 14));
                                return true;
                            }
                        }
                    } else if (i13 == 5) {
                        n nVar3 = (n) eVar.d;
                        if (nVar3.f18069g0 != null && !nVar3.f18071i0) {
                            Log.d("VoiceLive", "field: back to the text before the style");
                            if (nVar3.f18070h0) {
                                nVar3.f18066e0 = nVar3.f18069g0;
                                nVar3.f18068f0 = nVar3.c().size();
                            } else {
                                nVar3.f18066e0 = null;
                            }
                            nVar3.f18069g0 = null;
                            e eVar3 = nVar3.K;
                            if (eVar3 != null) {
                                eVar3.setRevertShown(false);
                                nVar3.K.setRebuildNext(true);
                            }
                            nVar3.m();
                            e eVar4 = nVar3.K;
                            if (eVar4 != null) {
                                eVar4.setRebuildNext(false);
                                return true;
                            }
                        }
                    } else if (i13 == 6) {
                        n nVar4 = (n) eVar.d;
                        if (nVar4.K != null && ((i7 = nVar4.f18062c) == 2 || i7 == 4)) {
                            String[] H2 = DictationAsr.H();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(gd.N0(2131745068, null));
                            boolean z10 = DictationAsr.z();
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = -1;
                            }
                            int i15 = i10;
                            for (int i16 = 0; i16 < H2.length; i16++) {
                                arrayList.add(l0.o(H2[i16]));
                                if (!z10 && i15 < 0 && DictationAsr.B(H2[i16])) {
                                    i15 = i16 + 1;
                                }
                            }
                            g gVar = new g(nVar4, H2, 1);
                            qf qfVar2 = nVar4.f18060b;
                            e eVar5 = nVar4.K;
                            ArrayList u10 = n.u(H2, z10, gVar);
                            ChatActivityEnterView chatActivityEnterView3 = qfVar2.f38823a;
                            cu0 cu0Var2 = chatActivityEnterView3.f32655c2;
                            RectF rectF2 = new RectF();
                            rectF2.set(eVar5.A1);
                            if (!rectF2.isEmpty() && cu0Var2 != null) {
                                FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView3.getContext());
                                cu0Var2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                View view2 = new View(chatActivityEnterView3.getContext());
                                frameLayout2.addView(view2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                frameLayout2.post(new k8(qfVar2, eVar5, frameLayout2, view2, rectF2, arrayList, u10, i15, gVar));
                                return true;
                            }
                        }
                    } else if (i13 == 7) {
                        n nVar5 = (n) eVar.d;
                        qf qfVar3 = nVar5.f18060b;
                        int i17 = nVar5.f18062c;
                        if (i17 == 4) {
                            nVar5.q();
                            bn bnVar = qfVar3.f38823a.F3;
                            if (bnVar != null) {
                                bnVar.presentFragment(new r2());
                                return true;
                            }
                        } else if (i17 == 2) {
                            qfVar3.e();
                            g0.h3(new i(nVar5, 2), 300L);
                            return true;
                        }
                    } else if (i13 == 8) {
                        eVar.F();
                        return true;
                    } else {
                        n nVar6 = (n) eVar.d;
                        qf qfVar4 = nVar6.f18060b;
                        if (nVar6.K != null && nVar6.f18062c != 0) {
                            ChatActivityEnterView chatActivityEnterView4 = qfVar4.f38823a;
                            ChatActivityEnterView chatActivityEnterView5 = qfVar4.f38823a;
                            cu0 cu0Var3 = chatActivityEnterView4.f32655c2;
                            if (cu0Var3 != null) {
                                EditTextBoldCursor editTextBoldCursor = nVar6.X;
                                if (editTextBoldCursor != null) {
                                    editTextBoldCursor.requestFocus();
                                    g0.I3(nVar6.X);
                                    return true;
                                }
                                i6 i6Var = chatActivityEnterView4.M4;
                                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(nVar6.f18058a);
                                editTextBoldCursor2.setBackground(null);
                                editTextBoldCursor2.setPadding(0, 0, 0, 0);
                                editTextBoldCursor2.setIncludeFontPadding(false);
                                hf hfVar = chatActivityEnterView5.F0;
                                if (hfVar != null) {
                                    L = hfVar.getTextSize();
                                } else {
                                    L = g0.L(18.0f);
                                }
                                editTextBoldCursor2.setTextSize(0, L);
                                editTextBoldCursor2.setTextColor(n6.w0(n6.Le, i6Var));
                                int i18 = n6.Pe;
                                int i19 = ChatActivityEnterView.f32633s7;
                                editTextBoldCursor2.setCursorColor(chatActivityEnterView5.G0(i18) | (-16777216));
                                u6.C(editTextBoldCursor2, n6.f29607lg, i6Var);
                                u6.l(editTextBoldCursor2, 36, n6.f29624mg, i6Var);
                                editTextBoldCursor2.setCursorSize(g0.L(20.0f));
                                editTextBoldCursor2.setCursorWidth(2.0f);
                                editTextBoldCursor2.setGravity(51);
                                editTextBoldCursor2.setInputType(147457);
                                editTextBoldCursor2.setImeOptions(268435456);
                                editTextBoldCursor2.setText(nVar6.f18075n);
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                                int size = nVar6.c().size();
                                nVar6.f18061b0 = size;
                                nVar6.Y = size;
                                nVar6.Z = editTextBoldCursor2.length();
                                nVar6.f18059a0 = "";
                                editTextBoldCursor2.addTextChangedListener(new ah.j(nVar6, 9));
                                if (nVar6.K.getParent() == cu0Var3) {
                                    childCount = cu0Var3.indexOfChild(nVar6.K) + 1;
                                } else {
                                    childCount = cu0Var3.getChildCount();
                                }
                                cu0Var3.addView(editTextBoldCursor2, childCount, new FrameLayout.LayoutParams(1, 1, 51));
                                nVar6.X = editTextBoldCursor2;
                                editTextBoldCursor2.requestFocus();
                                g0.h3(new f(1, nVar6, editTextBoldCursor2), 50L);
                                StringBuilder sb2 = new StringBuilder("field: editing in place (");
                                sb2.append(nVar6.f18075n.length());
                                sb2.append(" chars, recording ");
                                if (nVar6.f18062c == 2) {
                                    str = "on";
                                } else {
                                    str = "paused";
                                }
                                sb2.append(str);
                                sb2.append(")");
                                Log.d("VoiceLive", sb2.toString());
                                nVar6.K.invalidate();
                            }
                        }
                    }
                }
            }
            return true;
        }
        this.K0 = false;
        int l10 = l(motionEvent.getX(), motionEvent.getY());
        this.f17953f0 = l10;
        if (l10 >= 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.H0 = motionEvent.getY();
            this.I0 = this.f18004s0;
            if (this.f17953f0 == 2 && !this.T) {
                this.f17953f0 = 3;
            }
            if (this.f17953f0 == 0) {
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

    public final void q(Canvas canvas, long j3, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        xu0 xu0Var;
        float f16 = ((float) (j3 - this.F2)) / 1000.0f;
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
        s(this.j3, r11 - g0.L(48.0f), r11);
        LinearGradient linearGradient = this.j3;
        Paint paint = this.f17960g3;
        paint.setShader(linearGradient);
        canvas.drawRect(f17, f18, L2, L3, paint);
        s(this.f17968i3, r11 - L, r11);
        LinearGradient linearGradient2 = this.f17968i3;
        Paint paint2 = this.f17956f3;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f17, f18, L2, L3, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.S2 != null && r10 - L < this.J2) {
            canvas.save();
            canvas.translate(this.K2, this.L2);
            float max = Math.max(L2, this.S2.getWidth());
            f15 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f17, this.M2 - g0.L(2.0f), max, this.M2 + this.N2 + g0.L(2.0f), null);
            Paint paint3 = this.f17951e3;
            paint3.setAlpha(i7);
            canvas.drawBitmap(this.S2, -this.Z2, -this.f17933a3, paint3);
            s(this.f17964h3, r10, L + r10);
            paint2.setShader(this.f17964h3);
            canvas.drawRect(f17, f18, max, Math.max(L3, g0.L(40.0f) + this.S2.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        } else {
            f15 = 2.0f;
        }
        float f19 = g0.f24225p;
        long j10 = this.G2;
        float max2 = Math.max(0.05f, ((float) Math.min(j10, j10 - (j3 - this.F2))) / 1000.0f);
        while (true) {
            int i10 = this.X2;
            int i11 = this.V2;
            xu0Var = this.B2;
            if (i10 >= i11) {
                break;
            }
            float[] fArr = this.T2;
            int i12 = i10 * 3;
            if (fArr[i12 + 2] > r10) {
                break;
            }
            xu0Var.g(this.K2 + fArr[i12], this.L2 + fArr[i12 + 1], ((xu0Var.d() * 34.0f) + 10.0f) * f19, (-((xu0Var.d() * 20.0f) + 6.0f)) * f19, Math.min(max2, (xu0Var.d() * 0.3f) + 0.26f), 0.0f);
            this.X2++;
        }
        float f20 = f13 - f11;
        while (true) {
            int i13 = this.Y2;
            if (i13 >= this.W2) {
                break;
            }
            float[] fArr2 = this.U2;
            int i14 = i13 * 3;
            if (fArr2[i14 + 2] > r10) {
                break;
            }
            this.Y2 = i13 + 1;
            float f21 = fArr2[i14 + 1];
            if (f21 >= f20 - g0.L(f15) && f21 <= f20 + f14 + g0.L(f15)) {
                float f22 = f10 + this.U2[i14];
                float f23 = f11 + f21;
                xu0Var.h((((xu0Var.d() * 16.0f) + 6.0f) * f19) + f22, ((xu0Var.d() - 0.5f) * 14.0f * f19) + f23, f22, f23, Math.min(max2, (xu0Var.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f16 * 1000.0f >= ((float) this.G2)) {
            this.D2 = false;
            Bitmap bitmap = this.S2;
            if (bitmap != null) {
                bitmap.recycle();
                this.S2 = null;
            }
        }
    }

    public final float r(float f10) {
        float interpolation = D3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f10 * 1000.0f) / (((float) this.G2) - 60.0f))));
        float f11 = this.I2;
        return e2.z(this.J2, f11, interpolation, f11);
    }

    public final void s(LinearGradient linearGradient, float f10, float f11) {
        float sqrt = (float) Math.sqrt(1.809999942779541d);
        float f12 = 1.0f / sqrt;
        float f13 = 0.9f / sqrt;
        float f14 = f10 / sqrt;
        float f15 = f11 / sqrt;
        Matrix matrix = this.f17975k3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, f15 - f14), 1.0f);
        matrix.postRotate((float) Math.toDegrees(Math.atan2(f13, f12)));
        matrix.postTranslate(f12 * f14, f14 * f13);
        linearGradient.setLocalMatrix(matrix);
    }

    public void setBusy(boolean z10) {
        if (this.f17937b2 == z10) {
            return;
        }
        this.f17937b2 = z10;
        if (z10) {
            this.d2 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2;
        int i7;
        String str = null;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        this.f17987o1 = charSequence2;
        if (charSequence2 != null && charSequence2.endsWith(")")) {
            i7 = this.f17987o1.lastIndexOf(" (");
        } else {
            i7 = -1;
        }
        if (i7 > 0) {
            str = this.f17987o1.substring(0, i7);
        }
        this.f17995q1 = str;
        this.f18000r1 = this.f17987o1;
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.f18029z1 = z10;
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
        this.f17973k1 = z10;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.f17991p1)) {
            return;
        }
        this.f17991p1 = str;
        this.R0 = null;
        invalidate();
    }

    public void setRebuildNext(boolean z10) {
        this.C2 = z10;
    }

    public void setRevertShown(boolean z10) {
        this.f17942c2 = z10;
        invalidate();
    }

    public final int t(int i7, Bitmap bitmap, boolean z10) {
        float f10;
        float[] fArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(g0.f24225p * 0.8f));
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11 += max) {
            if (z10) {
                float f11 = i11;
                float f12 = this.M2;
                float f13 = max;
                if (f11 >= f12 - f13) {
                    if (f11 > f12 + this.N2 + f13) {
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
            fArr = this.T2;
        } else {
            fArr = this.U2;
        }
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14 += max) {
            if (z10) {
                float f14 = i14;
                float f15 = this.M2;
                float f16 = max;
                if (f14 >= f15 - f16) {
                    if (f14 > f15 + this.N2 + f16) {
                    }
                }
            }
            for (int i15 = 0; i15 < width; i15 += max) {
                if ((iArr[(i14 * width) + i15] >>> 24) > 90) {
                    xu0 xu0Var = this.B2;
                    if (xu0Var.d() <= f10) {
                        int i16 = i13 + 1;
                        if (i16 * 3 <= fArr.length) {
                            float f17 = max;
                            float d = ((xu0Var.d() - 0.5f) * f17) + i15;
                            float d2 = ((xu0Var.d() - 0.5f) * f17) + i14;
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
        Arrays.sort(numArr, new ai.o(2, fArr));
        float[] copyOf = Arrays.copyOf(fArr, i13 * 3);
        for (int i19 = 0; i19 < i13; i19++) {
            int i20 = i19 * 3;
            int intValue = numArr[i19].intValue() * 3;
            fArr[i20] = copyOf[intValue];
            fArr[i20 + 1] = copyOf[intValue + 1];
            fArr[i20 + 2] = copyOf[intValue + 2];
        }
        if (z10) {
            this.T2 = fArr;
            return i13;
        }
        this.U2 = fArr;
        return i13;
    }

    public final float u(long j3) {
        return D3.getInterpolation(Math.max(0.0f, Math.min(1.0f, ((float) (j3 - this.F2)) / ((float) this.G2))));
    }

    public final float v(float f10) {
        float f11 = 0.0f;
        if (this.J2 <= this.I2) {
            return 0.0f;
        }
        float f12 = ((float) this.G2) / 1000.0f;
        for (int i7 = 0; i7 < 24; i7++) {
            float f13 = (f11 + f12) / 2.0f;
            if (r(f13) < f10) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
        return Math.min(f12, ((float) this.G2) / 1000.0f);
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
            ArrayList arrayList = this.f17931a1;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                c cVar = (c) obj;
                int i10 = cVar.f17904b;
                if (i10 > cVar.f17903a && i10 <= spannableString.length()) {
                    spannableString.setSpan(new a2(cVar, 1), cVar.f17903a, cVar.f17904b, 33);
                }
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                int[] iArr = this.f17936b1;
                if (i12 >= iArr.length) {
                    break;
                }
                int max = Math.max(0, iArr[i11]);
                int min = Math.min(spannableString.length(), this.f17936b1[i12]);
                if (min > max) {
                    spannableString.setSpan(new b(0), max, min, 33);
                }
                i11 += 2;
            }
            this.P0 = b(spannableString, this.d);
            ArrayList arrayList2 = this.f17941c1;
            arrayList2.clear();
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                int[] iArr2 = this.f17936b1;
                if (i14 < iArr2.length) {
                    int max2 = Math.max(0, iArr2[i13]);
                    int min2 = Math.min(spannableString.length(), this.f17936b1[i14]);
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
                                float f10 = f17924v3;
                                float f11 = f17925w3;
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

    public final void y(long j3) {
        int i7;
        int i10;
        float f10;
        if (!this.f17937b2) {
            return;
        }
        if (this.f17978l3 == null) {
            if (this.M) {
                i7 = -10777345;
            } else {
                i7 = -15374904;
            }
            int e10 = q0.e(i7);
            if (this.M) {
                i10 = -6128385;
            } else {
                i10 = -15823740;
            }
            int e11 = q0.e(i10);
            if (this.M) {
                f10 = 0.6f;
            } else {
                f10 = 0.75f;
            }
            int f11 = i0.a.f(f10, this.N, e10);
            int f12 = i0.a.f(f10, this.N, e11);
            this.f17978l3 = new LinearGradient(0.0f, 0.0f, g0.L(150.0f), 0.0f, new int[]{this.N, f11, i0.a.f(0.5f, f11, f12), f12, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
        }
        float f13 = ((float) (j3 - this.d2)) / 1000.0f;
        float sin = (((float) Math.sin((0.23f * f13) + 1.3f)) * 12.0f) + (((float) Math.sin(0.45f * f13)) * 28.0f);
        Matrix matrix = this.f17981m3;
        matrix.reset();
        matrix.setRotate(sin);
        matrix.postTranslate(g0.L(46.0f) * f13, g0.L(10.0f) * ((float) Math.sin(f13 * 0.7f)));
        this.f17978l3.setLocalMatrix(matrix);
        this.d.setShader(this.f17978l3);
    }

    public final void z() {
        if (this.I == null) {
            xi.e eVar = this.f17929a;
            this.I = eVar.k(this);
            this.J = eVar.k(this);
        }
        if (!this.R) {
            this.R = true;
            this.f17961h0 = SystemClock.uptimeMillis();
            this.f17983n0 = false;
            this.f17939c.f();
            this.D2 = false;
            Bitmap bitmap = this.S2;
            if (bitmap != null) {
                bitmap.recycle();
                this.S2 = null;
            }
            this.f17974k2 = false;
            this.B2.a();
            this.f17942c2 = false;
            this.f17955f2 = 0.0f;
            this.f18000r1 = null;
            this.f17995q1 = null;
            this.f17987o1 = null;
            this.f17991p1 = null;
            this.R0 = null;
            this.f18005s1 = 0.0f;
            this.f17937b2 = false;
            this.f17950e2 = 0.0f;
            this.Q1 = 0.0f;
            this.C2 = false;
            this.f17993p3 = false;
            this.f17997q3 = false;
        }
        setVisibility(0);
        invalidate();
    }
}
