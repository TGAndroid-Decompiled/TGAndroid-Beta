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
import bi.h2;
import com.google.android.gms.internal.vision.e2;
import di.j8;
import hi.r1;
import hi.t6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Dictation.DictationAsr;
public final class e extends View {
    public static int f17830s3;
    public static long f17834w3;
    public static int f17835x3;
    public static int f17836y3;
    public static float f17837z3;
    public long A0;
    public final RectF A1;
    public boolean A2;
    public float B0;
    public Drawable B1;
    public boolean B2;
    public long C0;
    public Drawable C1;
    public boolean C2;
    public float D0;
    public Drawable D1;
    public long D2;
    public final Matrix E;
    public float E0;
    public final int E1;
    public long E2;
    public LinearGradient F;
    public long F0;
    public LinearGradient F1;
    public float F2;
    public final w2 G;
    public float G0;
    public LinearGradient G1;
    public float G2;
    public final Drawable H;
    public float H0;
    public final Matrix H1;
    public float H2;
    public fh.g I;
    public float I0;
    public final TextPaint I1;
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
    public fh.g L1;
    public float L2;
    public boolean M;
    public LinearGradient M0;
    public fh.g M1;
    public float M2;
    public int N;
    public final Matrix N0;
    public fh.g N1;
    public float N2;
    public int O;
    public String O0;
    public float O1;
    public float O2;
    public int P;
    public StaticLayout P0;
    public long P1;
    public float P2;
    public int Q;
    public StaticLayout Q0;
    public LinearGradient Q1;
    public Bitmap Q2;
    public boolean R;
    public StaticLayout R0;
    public RadialGradient R1;
    public float[] R2;
    public boolean S;
    public StaticLayout S0;
    public LinearGradient S1;
    public float[] S2;
    public boolean T;
    public float T0;
    public final Paint T1;
    public int T2;
    public float U;
    public LinearGradient U0;
    public final Paint U1;
    public int U2;
    public float V;
    public float V0;
    public final Paint V1;
    public int V2;
    public float W;
    public final Matrix W0;
    public final Paint W1;
    public int W2;
    public final Paint X0;
    public final Matrix X1;
    public float X2;
    public long Y0;
    public final RectF Y1;
    public float Y2;
    public int Z0;
    public boolean Z1;
    public float Z2;
    public final xi.e f17838a;
    public float f17839a0;
    public final ArrayList f17840a1;
    public boolean f17841a2;
    public float f17842a3;
    public final i6 f17843b;
    public float f17844b0;
    public int[] f17845b1;
    public long f17846b2;
    public boolean f17847b3;
    public final s0 f17848c;
    public float f17849c0;
    public final ArrayList f17850c1;
    public float f17851c2;
    public final Paint f17852c3;
    public final TextPaint d;
    public float f17853d0;
    public final Paint f17854d1;
    public float d2;
    public final Paint f17855d3;
    public final TextPaint f17856e;
    public float f17857e0;
    public float f17858e1;
    public float f17859e2;
    public final Paint f17860e3;
    public final TextPaint f17861f;
    public int f17862f0;
    public boolean f17863f1;
    public final RectF f17864f2;
    public LinearGradient f17865f3;
    public long f17866g0;
    public final Path f17867g1;
    public Drawable f17868g2;
    public LinearGradient f17869g3;
    public int h;
    public long f17870h0;
    public final Paint f17871h1;
    public fh.g f17872h2;
    public LinearGradient f17873h3;
    public final RectF f17874i0;
    public final Paint f17875i1;
    public boolean f17876i2;
    public final Matrix f17877i3;
    public final RectF f17878j0;
    public float f17879j1;
    public boolean f17880j2;
    public LinearGradient j3;
    public final RectF f17881k0;
    public boolean f17882k1;
    public long f17883k2;
    public final Matrix f17884k3;
    public final RectF f17885l0;
    public float l1;
    public float f17886l2;
    public float f17887l3;
    public final RectF m0;
    public float f17888m1;
    public float[] f17889m2;
    public final a f17890m3;
    public final TextPaint f17891n;
    public boolean f17892n0;
    public final String n1;
    public int f17893n2;
    public boolean f17894n3;
    public float f17895o0;
    public String f17896o1;
    public int f17897o2;
    public boolean f17898o3;
    public float f17899p0;
    public String f17900p1;
    public float f17901p2;
    public final int[] f17902p3;
    public float f17903q0;
    public float f17904q1;
    public float f17905q2;
    public final Paint f17906r;
    public float f17907r0;
    public float f17908r1;
    public float f17909r2;
    public final Paint f17910s;
    public float f17911s0;
    public float f17912s1;
    public float f17913s2;
    public float f17914t0;
    public float f17915t1;
    public final ArrayList f17916t2;
    public float f17917u0;
    public float f17918u1;
    public final Paint f17919u2;
    public float f17920v0;
    public float f17921v1;
    public final RectF f17922v2;
    public final Paint f17923w;
    public float f17924w0;
    public float f17925w1;
    public final lr f17926w2;
    public final Paint f17927x;
    public float f17928x0;
    public boolean f17929x1;
    public final float[] f17930x2;
    public final Paint f17931y;
    public float f17932y0;
    public final RectF f17933y1;
    public final Path f17934y2;
    public float f17935z0;
    public final RectF f17936z1;
    public final vu0 f17937z2;
    public static final float f17828q3 = g0.L(19.0f);
    public static final float f17829r3 = g0.L(3.0f);
    public static final float f17831t3 = g0.L(3.0f);
    public static final float f17832u3 = g0.N(0.5f);
    public static final float f17833v3 = g0.L(6.0f);
    public static final lr A3 = new lr(0.3d, 0.0d, 0.2d, 1.0d);
    public static final lr B3 = l1.J;

    public e(Context context, i6 i6Var, xi.e eVar) {
        super(context);
        this.f17848c = new s0();
        this.d = new TextPaint(1);
        this.f17856e = new TextPaint(1);
        this.f17861f = new TextPaint(1);
        this.h = 255;
        TextPaint textPaint = new TextPaint(1);
        this.f17891n = textPaint;
        this.f17906r = new Paint(1);
        Paint paint = new Paint(1);
        this.f17910s = paint;
        this.f17923w = new Paint(1);
        this.f17927x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f17931y = paint2;
        this.E = new Matrix();
        this.K = -1.0f;
        this.L = -1.0f;
        this.Q = 255;
        this.f17862f0 = -1;
        this.f17874i0 = new RectF();
        this.f17878j0 = new RectF();
        this.f17881k0 = new RectF();
        this.f17885l0 = new RectF();
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
        this.f17840a1 = new ArrayList();
        this.f17845b1 = new int[0];
        this.f17850c1 = new ArrayList();
        this.f17854d1 = new Paint(1);
        this.f17863f1 = true;
        this.f17867g1 = new Path();
        this.f17871h1 = new Paint(1);
        this.f17875i1 = new Paint(1);
        this.l1 = Float.NaN;
        this.n1 = gd.M0(2131745071, null);
        this.f17933y1 = new RectF();
        this.f17936z1 = new RectF();
        this.A1 = new RectF();
        this.E1 = g0.L(36.0f);
        this.H1 = new Matrix();
        this.I1 = new TextPaint(1);
        this.J1 = new Matrix();
        this.K1 = new TextPaint(1);
        this.T1 = new Paint(1);
        this.U1 = new Paint(1);
        this.V1 = new Paint(1);
        this.W1 = new Paint(1);
        this.X1 = new Matrix();
        this.Y1 = new RectF();
        this.f17864f2 = new RectF();
        this.f17889m2 = new float[0];
        this.f17916t2 = new ArrayList();
        this.f17919u2 = new Paint(1);
        this.f17922v2 = new RectF();
        this.f17926w2 = lr.h;
        this.f17930x2 = new float[2];
        this.f17934y2 = new Path();
        this.f17937z2 = new vu0(2200);
        this.E2 = 900L;
        this.R2 = new float[0];
        this.S2 = new float[0];
        this.f17852c3 = new Paint();
        this.f17855d3 = new Paint();
        this.f17860e3 = new Paint();
        this.f17877i3 = new Matrix();
        this.f17884k3 = new Matrix();
        this.f17890m3 = new a(this, 1);
        this.f17902p3 = new int[2];
        this.f17843b = i6Var;
        this.f17838a = eVar;
        w2 w2Var = new w2(context);
        this.G = w2Var;
        w2Var.setCallback(this);
        this.H = context.getResources().getDrawable(2131232696).mutate();
        textPaint.setTextSize(g0.L(15.0f));
        textPaint.setTypeface(g0.o());
        paint.setStyle(style);
        paint.setStrokeWidth(g0.N(0.66f));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        E();
    }

    public static void B(d dVar, float f10, float[] fArr) {
        float max = Math.max(0.0f, Math.min(1.0f, (f10 - dVar.f17820j) / 0.12f));
        float f11 = dVar.f17822l;
        float f12 = dVar.d;
        float f13 = f11 - f12;
        if (dVar.f17823m) {
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
        vu0 vu0Var;
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
        float f18 = ((float) (j3 - this.f17883k2)) / 1000.0f;
        float f19 = 0.4f;
        float f20 = 1.0f;
        float f21 = 0.0f;
        float interpolation = this.f17926w2.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f18 - 0.08f) / 0.4f)));
        int i12 = this.N;
        TextPaint textPaint = this.d;
        textPaint.setColor(i12);
        ArrayList arrayList = this.f17916t2;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            d dVar3 = (d) arrayList.get(i13);
            if (dVar3.f17815c) {
                float max = Math.max(f21, Math.min(f20, ((f18 - dVar3.f17820j) - 0.26f) / 0.12f));
                if (max <= f21) {
                    i13 = i14;
                } else {
                    float f22 = dVar3.h;
                    float f23 = dVar3.f17821k;
                    float L = (g0.L(10.0f) + f23) * max;
                    float f24 = L + f22;
                    f13 = f19;
                    if (dVar3.f17823m) {
                        f22 += f23;
                    } else {
                        L = g0.L(4.0f);
                    }
                    float f25 = f22 - L;
                    float max2 = Math.max(f21, Math.min(f20, (((f18 - dVar3.f17820j) - 0.26f) - 0.12f) / 0.45f));
                    int i15 = this.O;
                    if (dVar3.f17827q) {
                        i11 = f17830s3;
                    } else {
                        i11 = this.N;
                    }
                    f14 = f20;
                    textPaint.setColor(i0.a.f(e2.C(max2, 2.0f, 3.0f, max2 * max2), i15, i11));
                    textPaint.setAlpha((int) (255.0f * f12 * f14));
                    canvas2.save();
                    float f26 = f10 + f25;
                    float L2 = (f11 + dVar3.f17819i) - g0.L(40.0f);
                    if (dVar3.f17823m) {
                        f17 = f10 + dVar3.h + dVar3.f17821k + g0.L(4.0f);
                    } else {
                        f17 = f10 + f24;
                    }
                    canvas2.clipRect(f26, L2, f17, f11 + dVar3.f17819i + g0.L(20.0f));
                    canvas2.drawText(dVar3.f17813a, f10 + dVar3.h, f11 + dVar3.f17819i, textPaint);
                    canvas2.restore();
                    textPaint.setColor(this.N);
                    dVar3.f17824n = f10 + dVar3.h;
                    dVar3.f17825o = f11 + dVar3.f17819i;
                }
            } else {
                f13 = f19;
                f14 = f20;
                if (dVar3.f17814b) {
                    boolean n10 = n(dVar3);
                    float[] fArr = this.f17930x2;
                    if (n10) {
                        int indexOf = arrayList.indexOf(dVar3);
                        int i16 = indexOf;
                        while (!m((d) arrayList.get(i16))) {
                            i16++;
                        }
                        float f27 = this.f17905q2;
                        float f28 = f17832u3;
                        float f29 = dVar3.f17817f + f27 + f28;
                        f15 = 0.5f;
                        float f30 = (f27 + dVar3.f17818g) - f28;
                        float f31 = this.f17901p2;
                        c10 = 1;
                        float f32 = f17831t3;
                        RectF rectF = this.f17922v2;
                        rectF.set((dVar3.d + f31) - f32, f29, f31 + ((d) arrayList.get(i16)).f17822l + f32, f30);
                        Path path = this.f17934y2;
                        path.rewind();
                        float f33 = f17833v3;
                        d dVar4 = dVar3;
                        path.addRoundRect(rectF, f33, f33, Path.Direction.CW);
                        canvas2.save();
                        canvas2.clipPath(path);
                        int i17 = this.P;
                        float f34 = f29;
                        Paint paint = this.f17919u2;
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
                                if (f35 >= dVar5.f17822l - 0.5f && i18 == i16) {
                                    f35 += f32;
                                }
                                float f37 = this.f17901p2;
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
                    if (Math.min(fArr[c10], (dVar.d + dVar.f17821k) + g0.L(4.0f)) - Math.max(fArr[0], dVar.d - g0.L(4.0f)) >= f15) {
                        canvas2.save();
                        float f40 = this.f17901p2;
                        float f41 = fArr[0];
                        float f42 = dVar.d;
                        if (f41 <= f42 + f15) {
                            f41 = f42 - g0.L(4.0f);
                        }
                        float f43 = f40 + f41;
                        float L3 = (this.f17905q2 + dVar.f17817f) - g0.L(4.0f);
                        float f44 = this.f17901p2;
                        float f45 = fArr[c10];
                        if (f45 >= dVar.f17822l - f15) {
                            f45 = dVar.d + dVar.f17821k + g0.L(4.0f);
                        }
                        canvas2.clipRect(f43, L3, f44 + f45, this.f17905q2 + dVar.f17818g + g0.L(4.0f));
                        textPaint.setColor(f17830s3);
                        textPaint.setAlpha((int) (f12 * 255.0f));
                        canvas2.drawText(dVar.f17813a, this.f17901p2 + dVar.d, this.f17905q2 + dVar.f17816e, textPaint);
                        textPaint.setColor(this.N);
                        canvas2.restore();
                    }
                } else {
                    float f46 = this.f17901p2;
                    float f47 = dVar3.d;
                    float f48 = ((((f10 + dVar3.h) - f46) - f47) * interpolation) + f46 + f47;
                    float f49 = this.f17905q2;
                    float f50 = dVar3.f17816e;
                    float f51 = ((((f11 + dVar3.f17819i) - f49) - f50) * interpolation) + f49 + f50;
                    if (!this.f17880j2 && dVar3.f17827q) {
                        i7 = f17830s3;
                    } else {
                        i7 = this.N;
                    }
                    textPaint.setColor(i7);
                    textPaint.setAlpha((int) (255.0f * f12 * f14));
                    canvas2.drawText(dVar3.f17813a, f48, f51, textPaint);
                    textPaint.setColor(this.N);
                    dVar3.f17824n = f48;
                    dVar3.f17825o = f51;
                }
            }
            f20 = f14;
            i13 = i14;
            f19 = f13;
            f21 = 0.0f;
        }
        float f52 = f19;
        textPaint.setAlpha(255);
        float f53 = g0.f24120p;
        while (true) {
            int i19 = this.f17897o2;
            int i20 = this.f17893n2;
            vu0Var = this.f17937z2;
            if (i19 >= i20) {
                break;
            }
            float[] fArr2 = this.f17889m2;
            int i21 = i19 * 3;
            if (fArr2[i21 + 2] > f18) {
                break;
            }
            this.f17897o2 = i19 + 1;
            float f54 = f10 + fArr2[i21];
            float f55 = f11 + fArr2[i21 + 1];
            RectF rectF2 = this.f17878j0;
            if (f55 >= rectF2.top && f55 <= rectF2.bottom) {
                double d = vu0Var.d() * 3.141592653589793d * 2.0d;
                float d2 = ((vu0Var.d() * 18.0f) + 8.0f) * f53;
                this.f17937z2.h((((float) Math.cos(d)) * d2) + f54, e2.x((float) Math.sin(d), d2, 0.7f, f55), f54, f55, ((vu0Var.d() * f52) + 0.8f) * 0.26f);
            }
        }
        if (f18 >= this.f17886l2) {
            this.f17876i2 = false;
            arrayList.clear();
            vu0Var.Q = g0.L(10.0f);
        }
    }

    public final boolean C(d dVar, boolean z10) {
        float L;
        float L2;
        if (z10) {
            L = dVar.f17817f;
        } else {
            L = dVar.f17819i - g0.L(14.0f);
        }
        if (z10) {
            L2 = dVar.f17818g;
        } else {
            L2 = dVar.f17819i + g0.L(4.0f);
        }
        if (L2 >= this.O2 - g0.L(2.0f)) {
            if (L <= Math.max(1.0f, this.P2) + this.O2 + g0.L(2.0f)) {
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
        int i11 = n6.f29396d6;
        i6 i6Var = this.f17843b;
        int w02 = n6.w0(i11, i6Var);
        boolean c10 = s0.c(w02);
        this.M = c10;
        s0 s0Var = this.f17848c;
        if (s0Var.h != c10) {
            s0Var.h = c10;
        }
        int w03 = n6.w0(n6.Pe, i6Var) | (-16777216);
        s0.h(w03);
        s0Var.g(-6440822, w03);
        this.N = n6.w0(n6.Le, i6Var) | (-16777216);
        boolean z10 = this.M;
        if (z10) {
            t6 = i0.a.f(0.12f, w03, -1);
        } else {
            t6 = n0.t(w03, w02, z10);
        }
        this.O = t6;
        if (this.M) {
            f10 = g0.L(7.0f);
        } else {
            f10 = 0.0f;
        }
        f17837z3 = f10;
        int i12 = this.O;
        if (this.M) {
            f11 = 0.18f;
        } else {
            f11 = 0.14f;
        }
        this.P = n6.r1(f11, i12);
        f17830s3 = this.O;
        this.d.setColor(this.N);
        int w04 = n6.w0(n6.Me, i6Var);
        TextPaint textPaint = this.f17856e;
        textPaint.setColor(w04);
        this.Q = Color.alpha(textPaint.getColor());
        int w05 = n6.w0(n6.G6, i6Var);
        TextPaint textPaint2 = this.f17891n;
        textPaint2.setColor(w05);
        int color = textPaint2.getColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.G.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.f17927x.setColor(w03);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f17923w.setColor(this.O);
        if (this.M) {
            i7 = -651810255;
        } else {
            i7 = -335544321;
        }
        this.f17906r.setColor(i7);
        if (this.M) {
            i10 = 654311423;
        } else {
            i10 = 335544320;
        }
        this.f17910s.setColor(i10);
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
        this.j3 = null;
        this.Q1 = null;
        this.G1 = null;
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
            int[] iArr2 = this.f17848c.B;
            boolean z10 = this.M;
            i6 i6Var = this.f17843b;
            if (z10) {
                w02 = s0.d(n6.w0(n6.Me, i6Var));
            } else {
                w02 = n6.w0(n6.Me, i6Var);
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
            TextPaint textPaint = this.f17856e;
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
        LinearGradient linearGradient = this.Q1;
        Paint paint = this.U1;
        Paint paint2 = this.T1;
        Paint paint3 = this.V1;
        if (linearGradient == null) {
            LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{s0.e(-7447553), s0.e(-13649665), s0.e(-13665281)}, (float[]) null, Shader.TileMode.MIRROR);
            this.Q1 = linearGradient2;
            paint2.setShader(linearGradient2);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
            this.R1 = radialGradient;
            paint.setShader(radialGradient);
            LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
            this.S1 = linearGradient3;
            paint3.setShader(linearGradient3);
            paint3.setStyle(Paint.Style.STROKE);
        }
        float f14 = ((float) (j3 % 5000)) / 5000.0f;
        Matrix matrix = this.X1;
        matrix.setTranslate(4.0f * f14, 0.0f);
        float f15 = 2.6f * f12;
        matrix.postScale(f15, f15);
        matrix.postRotate(35.0f);
        matrix.postTranslate(f10, f11);
        this.Q1.setLocalMatrix(matrix);
        int i7 = (int) (255.0f * f13);
        paint2.setAlpha(i7);
        canvas.drawCircle(f10, f11, f12, paint2);
        float sin = 0.06f * f12 * ((float) Math.sin(f14 * 3.141592653589793d * 2.0d));
        float f16 = 0.62f * f12;
        matrix.setScale(1.35f * f12, f16);
        matrix.postTranslate(f10 + sin, f11 - f16);
        this.R1.setLocalMatrix(matrix);
        paint.setAlpha(i7);
        canvas.drawCircle(f10, f11, f12, paint);
        matrix.setScale(f12, f12);
        matrix.postTranslate(f10, f11);
        this.S1.setLocalMatrix(matrix);
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
        Paint paint = this.f17906r;
        paint.setAlpha((int) (i7 * f10));
        canvas.drawRoundRect(rectF, height, height, paint);
    }

    public final void e(Canvas canvas, float f10, float f11, boolean z10) {
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        xi.e eVar;
        RectF rectF;
        PorterDuff.Mode mode;
        float f17;
        float f18;
        boolean z11;
        float f19;
        boolean z12;
        int i7;
        float f20 = this.f17925w1;
        if (this.f17896o1 != null) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        this.f17925w1 = a(f20, f12, f11, 0.09f);
        String str = this.f17896o1;
        String str2 = this.n1;
        if (str == null) {
            str = str2;
        }
        TextPaint textPaint = this.f17891n;
        float measureText = textPaint.measureText(str);
        float f21 = this.f17921v1;
        if (f21 > 0.0f) {
            measureText = a(f21, measureText, f11, 0.11f);
        }
        this.f17921v1 = measureText;
        RectF rectF2 = this.f17878j0;
        float L = rectF2.top - g0.L(8.0f);
        float f22 = this.f17904q1;
        float C = e2.C(f22, 2.0f, 3.0f, f22 * f22);
        int color = textPaint.getColor();
        float L2 = rectF2.left + g0.L(2.0f);
        float L3 = L - g0.L(36.0f);
        RectF rectF3 = this.f17936z1;
        rectF3.set(L2, L3, this.E1 + L2, L);
        fh.g gVar = this.M1;
        xi.e eVar2 = this.f17838a;
        if (gVar == null) {
            this.M1 = eVar2.k(this);
        }
        canvas.save();
        float f23 = 1.0f - C;
        canvas.translate(0.0f, g0.L(6.0f) * f23);
        float f24 = (C * 0.1f) + 0.9f;
        float C2 = e2.C(this.f17912s1, 0.06f, 1.0f, f24);
        canvas.scale(C2, C2, rectF3.centerX(), rectF3.centerY());
        d(canvas, this.M1, rectF3, f10);
        if (this.C1 == null) {
            this.C1 = getContext().getResources().getDrawable(2131232362).mutate();
        }
        Drawable drawable = this.C1;
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(color, mode2));
        this.C1.setAlpha((int) (f10 * 255.0f));
        int L4 = g0.L(18.5f);
        float f25 = L4 / 2.0f;
        float centerX = ((int) rectF3.centerX()) - f25;
        float centerY = ((int) rectF3.centerY()) - f25;
        this.C1.setBounds(Math.round(centerX), Math.round(centerY), Math.round(centerX) + L4, Math.round(centerY) + L4);
        this.C1.draw(canvas);
        canvas.restore();
        float L5 = rectF3.right + g0.L(8.0f);
        float f26 = this.f17921v1;
        if (f26 <= 0.0f) {
            String str3 = this.f17896o1;
            if (str3 == null) {
                str3 = str2;
            }
            f26 = textPaint.measureText(str3);
        }
        int L6 = g0.L(18.0f) + g0.L(12.0f);
        RectF rectF4 = this.f17933y1;
        rectF4.set(L5, L3, g0.L(6.0f) + L6 + f26 + g0.L(8.0f) + g0.L(8.0f) + g0.L(13.0f) + L5, L);
        float max = Math.max(0.0f, 1.0f - (this.f17839a0 * 2.0f));
        if (max < 0.01f) {
            f13 = 0.01f;
            if (!this.f17929x1) {
                rectF4.setEmpty();
            }
        } else {
            f13 = 0.01f;
        }
        if (!this.f17929x1 && max >= f13) {
            float f27 = f10 * max;
            if (this.L1 == null) {
                this.L1 = eVar2.k(this);
            }
            canvas.save();
            float L7 = g0.L(6.0f) * f23;
            f14 = 12.0f;
            canvas.translate(0.0f, L7);
            float C3 = e2.C(this.f17908r1, 0.04f, 1.0f, f24);
            canvas.scale(C3, C3, rectF4.left + g0.L(18.0f), rectF4.bottom);
            d(canvas, this.L1, rectF4, f27);
            if (this.B1 == null) {
                this.B1 = getContext().getResources().getDrawable(2131232196).mutate();
            }
            int color2 = textPaint.getColor();
            float centerY2 = rectF4.centerY();
            this.B1.setColorFilter(new PorterDuffColorFilter(color2, mode2));
            float f28 = f27 * 255.0f;
            int i10 = (int) f28;
            this.B1.setAlpha(i10);
            int L8 = (int) (rectF4.left + g0.L(12.0f));
            int L9 = (int) (centerY2 - g0.L(9.0f));
            mode = mode2;
            eVar = eVar2;
            f15 = L3;
            this.B1.setBounds(L8, L9, g0.L(18.0f) + L8, g0.L(18.0f) + L9);
            this.B1.draw(canvas);
            float L10 = (rectF4.right - g0.L(13.0f)) - g0.L(4.0f);
            canvas.save();
            canvas.clipRect(rectF4.left, rectF4.top, L10 - g0.L(8.0f), rectF4.bottom);
            int alpha = textPaint.getAlpha();
            float L11 = rectF4.left + g0.L(12.0f) + g0.L(18.0f) + g0.L(6.0f);
            if (this.f17896o1 == null && this.f17925w1 < 0.99f) {
                z11 = true;
            } else {
                z11 = false;
            }
            TextPaint textPaint2 = this.K1;
            if (z11) {
                z12 = z11;
                if (this.F1 == null) {
                    f16 = L;
                    this.F1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{16777215, -1, 16777215}, (float[]) null, Shader.TileMode.CLAMP);
                    textPaint2.setTypeface(textPaint.getTypeface());
                } else {
                    f16 = L;
                }
                textPaint2.setTextSize(textPaint.getTextSize());
                float measureText2 = textPaint.measureText(str2);
                float L12 = g0.L(36.0f);
                f19 = L10;
                Matrix matrix = this.J1;
                matrix.setScale(L12, 1.0f);
                matrix.postTranslate(((Math.min(1.0f, ((float) (SystemClock.uptimeMillis() % 2200)) / 1100.0f) * ((L12 * 2.0f) + measureText2)) + (L11 - L12)) - (L12 / 2.0f), 0.0f);
                this.F1.setLocalMatrix(matrix);
                postInvalidateOnAnimation();
            } else {
                f19 = L10;
                f16 = L;
                z12 = z11;
            }
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f29 = centerY2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
            if (z12 && this.M) {
                if (this.G1 == null) {
                    int color3 = textPaint.getColor() | (-16777216);
                    int f30 = i0.a.f(0.4f, color3, s0.e(-7359233));
                    rectF = rectF4;
                    this.G1 = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, new int[]{f30, i0.a.f(0.28f, color3, s0.e(-5650177)), f30}, (float[]) null, Shader.TileMode.MIRROR);
                } else {
                    rectF = rectF4;
                }
                float L13 = g0.L(200.0f);
                Matrix matrix2 = this.H1;
                matrix2.setScale(L13, 1.0f);
                i7 = i10;
                matrix2.postTranslate(((((float) (SystemClock.uptimeMillis() % 6000)) / 6000.0f) * 2.0f * L13) + L11, 0.0f);
                this.G1.setLocalMatrix(matrix2);
                Typeface typeface = textPaint.getTypeface();
                TextPaint textPaint3 = this.I1;
                textPaint3.setTypeface(typeface);
                textPaint3.setTextSize(textPaint.getTextSize());
                textPaint3.setShader(this.G1);
                textPaint3.setAlpha((int) ((1.0f - this.f17925w1) * 0.62f * f28));
                canvas.drawText(str2, L11, f29, textPaint3);
                float f31 = this.f17925w1;
                if (f31 > f13 && this.f17896o1 != null) {
                    textPaint.setAlpha((int) (f31 * f28));
                    canvas.drawText(this.f17896o1, L11, f29, textPaint);
                }
            } else {
                rectF = rectF4;
                i7 = i10;
                textPaint.setAlpha((int) e2.B(this.f17925w1, 0.5f, 0.5f, f28));
                String str4 = this.f17896o1;
                if (str4 == null) {
                    str4 = str2;
                }
                canvas.drawText(str4, L11, f29, textPaint);
            }
            if (z12 && SystemClock.uptimeMillis() % 2200 < 1100) {
                textPaint2.setShader(this.F1);
                textPaint2.setAlpha((int) ((1.0f - this.f17925w1) * f28 * 0.55f));
                canvas.drawText(str2, L11, f29, textPaint2);
            }
            textPaint.setAlpha(alpha);
            canvas.restore();
            Path path = this.f17867g1;
            boolean isEmpty = path.isEmpty();
            Paint paint = this.f17871h1;
            if (isEmpty) {
                path.moveTo(-g0.N(3.8f), g0.N(1.9f));
                f17 = 0.0f;
                path.lineTo(0.0f, -g0.N(1.9f));
                path.lineTo(g0.N(3.8f), g0.N(1.9f));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(g0.N(1.75f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
            } else {
                f17 = 0.0f;
            }
            paint.setColor(color2);
            paint.setAlpha(i7);
            canvas.save();
            canvas.translate(f19, centerY2);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        } else {
            f14 = 12.0f;
            f15 = L3;
            f16 = L;
            eVar = eVar2;
            rectF = rectF4;
            mode = mode2;
            f17 = 0.0f;
        }
        float f32 = this.f17918u1;
        if (!this.T && z10) {
            f18 = 1.0f;
        } else {
            f18 = f17;
        }
        float a10 = a(f32, f18, f11, 0.1f);
        this.f17918u1 = a10;
        int i11 = (a10 > f13 ? 1 : (a10 == f13 ? 0 : -1));
        RectF rectF5 = this.A1;
        if (i11 > 0) {
            String M0 = gd.M0(2131745445, null);
            float L14 = rectF.right + g0.L(8.0f);
            rectF5.set(L14, f15, textPaint.measureText(M0) + g0.L(f14) + L14 + g0.L(22.0f) + g0.L(8.0f) + g0.L(16.0f), f16);
            if (this.N1 == null) {
                this.N1 = eVar.k(this);
            }
            float f33 = this.f17918u1;
            float C4 = e2.C(f33, 2.0f, 3.0f, f33 * f33);
            float f34 = f33 * f10;
            canvas.save();
            float C5 = e2.C(this.f17915t1, 0.04f, 1.0f, (C4 * 0.15f) + 0.85f);
            canvas.scale(C5, C5, rectF5.left, rectF5.centerY());
            d(canvas, this.N1, rectF5, f34);
            if (this.D1 == null) {
                this.D1 = getContext().getResources().getDrawable(2131232802).mutate();
            }
            this.D1.setColorFilter(new PorterDuffColorFilter(color, mode));
            int i12 = (int) (f34 * 255.0f);
            this.D1.setAlpha(i12);
            int L15 = (int) (rectF5.left + g0.L(f14));
            int centerY3 = (int) (rectF5.centerY() - g0.L(11.0f));
            this.D1.setBounds(L15, centerY3, g0.L(22.0f) + L15, g0.L(22.0f) + centerY3);
            this.D1.draw(canvas);
            int alpha2 = textPaint.getAlpha();
            textPaint.setAlpha(i12);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            canvas.drawText(M0, rectF5.left + g0.L(f14) + g0.L(22.0f) + g0.L(8.0f), rectF5.centerY() - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f), textPaint);
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
        float f13 = this.f17839a0;
        float L2 = g0.L(36.0f);
        if (this.Z1) {
            i7 = 2131745065;
        } else {
            i7 = 2131745066;
        }
        String M0 = gd.M0(i7, null);
        float i13 = i();
        RectF rectF = this.f17878j0;
        float L3 = rectF.left + g0.L(2.0f);
        float L4 = rectF.top - g0.L(8.0f);
        if (this.f17838a.z()) {
            f11 = 2.0f;
            float L5 = this.E1 + L3 + g0.L(8.0f);
            float i14 = i();
            f12 = 8.0f;
            boolean z10 = false;
            if (this.f17841a2 && !this.Z1) {
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
                this.f17888m1 = L;
            } else {
                this.l1 = a(this.l1, L3, 0.016f, 0.07f);
                this.f17888m1 = a(this.f17888m1, L, 0.016f, 0.07f);
                if (Math.abs(this.l1 - L3) > 0.5f || Math.abs(this.f17888m1 - L) > 0.5f) {
                    postInvalidateOnAnimation();
                }
            }
            if (this.f17839a0 < 0.01f) {
                this.l1 = Float.NaN;
            }
            if (!Float.isNaN(this.l1)) {
                L3 = this.l1;
            }
            if (!Float.isNaN(this.l1)) {
                L = this.f17888m1;
            }
            L4 -= L;
        } else {
            f11 = 2.0f;
            f12 = 8.0f;
        }
        RectF rectF2 = this.f17881k0;
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
        float f18 = 1.0f - (this.f17853d0 * 0.04f);
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
            Paint paint = this.f17906r;
            paint.setAlpha((int) (i10 * min2));
            canvas.drawRoundRect(rectF3, height, height, paint);
            if (this.M) {
                i11 = 38;
            } else {
                i11 = 20;
            }
            int i15 = (int) (i11 * min2);
            Paint paint2 = this.f17910s;
            paint2.setAlpha(i15);
            canvas.drawRoundRect(rectF3, height, height, paint2);
        }
        if (max2 > 0.0f) {
            float centerY = rectF2.centerY();
            float L6 = rectF2.left + g0.L(12.0f);
            int i16 = (int) L6;
            w2 w2Var = this.G;
            w2Var.setBounds(i16, (int) (centerY - g0.L(12.0f)), g0.L(24.0f) + i16, (int) (g0.L(12.0f) + centerY));
            int i17 = (int) (255.0f * max2);
            w2Var.setAlpha(i17);
            w2Var.draw(canvas);
            TextPaint textPaint = this.f17891n;
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha(i17);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas.drawText(M0, L6 + g0.L(6.0f) + g0.L(24.0f), centerY - ((fontMetrics.ascent + fontMetrics.descent) / f11), textPaint);
            textPaint.setAlpha(alpha);
            Path path = this.f17867g1;
            boolean isEmpty = path.isEmpty();
            Paint paint3 = this.f17871h1;
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
            this.f17879j1 = L7;
            int r12 = n6.r1(max2 * 0.14f, textPaint.getColor());
            Paint paint4 = this.f17875i1;
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
        float f12 = this.d2;
        if (this.f17841a2 && !this.Z1) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        float a10 = a(f12, f11, 0.016f, 0.06f);
        this.d2 = a10;
        int i10 = (a10 > 0.01f ? 1 : (a10 == 0.01f ? 0 : -1));
        RectF rectF = this.f17864f2;
        if (i10 < 0) {
            rectF.setEmpty();
            return;
        }
        Drawable drawable = this.f17868g2;
        xi.e eVar = this.f17838a;
        if (drawable == null) {
            this.f17868g2 = getContext().getResources().getDrawable(2131231001).mutate();
            fh.g k10 = eVar.k(this);
            this.f17872h2 = k10;
            if (k10 != null) {
                k10.r(g0.L(18.0f));
            }
        }
        float L = g0.L(36.0f);
        RectF rectF2 = this.f17881k0;
        rectF.set(rectF2.right + g0.L(6.0f), rectF2.top, rectF2.right + g0.L(6.0f) + L, rectF2.top + L);
        float max = Math.max(0.0f, Math.min(1.0f, (this.f17839a0 - 0.62f) / 0.38f));
        float f13 = this.d2;
        float f14 = f10 * f13 * max;
        if (f14 >= 0.01f) {
            float x10 = (1.0f - (this.f17859e2 * 0.06f)) * e2.x(f13, 0.3f, max, 0.7f);
            canvas.save();
            canvas.scale(x10, x10, rectF.centerX(), rectF.centerY());
            fh.g gVar = this.f17872h2;
            if (gVar != null) {
                gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.f17872h2.setAlpha((int) (255.0f * f14));
                this.f17872h2.draw(canvas);
            } else {
                if (this.M) {
                    i7 = 217;
                } else {
                    i7 = 235;
                }
                Paint paint = this.f17906r;
                paint.setAlpha((int) (i7 * f14));
                float f15 = L / 2.0f;
                canvas.drawRoundRect(rectF, f15, f15, paint);
            }
            ((m) eVar.d).f17964b.getClass();
            this.f17868g2.setColorFilter(new PorterDuffColorFilter((-16777216) | this.f17891n.getColor(), PorterDuff.Mode.SRC_IN));
            float L2 = g0.L(24.0f) / 2.0f;
            this.f17868g2.setBounds((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
            this.f17868g2.setAlpha((int) (Color.alpha(color) * f14));
            this.f17868g2.draw(canvas);
            canvas.restore();
            float f16 = this.d2;
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
        Paint paint = this.W1;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(g0.N(2.0f));
        paint.setColor(-1);
        paint.setAlpha((int) (f12 * 255.0f));
        float B = e2.B(f13, 0.3f, 0.7f, g0.N(8.5f));
        RectF rectF = this.Y1;
        rectF.set(f10 - B, f11 - B, f10 + B, f11 + B);
        long j10 = j3 - this.P1;
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
        boolean z10 = this.Z1;
        float L = g0.L(6.0f) + g0.L(24.0f) + g0.L(12.0f);
        if (z10) {
            i7 = 2131745065;
        } else {
            i7 = 2131745066;
        }
        return this.f17891n.measureText(gd.M0(i7, null)) + L + g0.L(12.0f) + g0.L(1.0f) + g0.L(8.0f) + g0.L(14.0f) + g0.L(10.0f);
    }

    public final boolean j() {
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f17840a1;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (uptimeMillis - ((c) obj).f17812c < 1520) {
                return true;
            }
        }
        return false;
    }

    public final void k(d dVar, ArrayList arrayList, int i7) {
        if (arrayList != null && i7 < arrayList.size()) {
            float[] fArr = (float[]) arrayList.get(i7);
            if (!Float.isNaN(fArr[0])) {
                float f10 = fArr[1] - this.N2;
                float f11 = dVar.f17816e;
                float f12 = f10 - f11;
                dVar.d = fArr[0] - this.M2;
                dVar.f17816e = f11 + f12;
                dVar.f17817f += f12;
                dVar.f17818g += f12;
            }
        }
    }

    public final int l(float f10, float f11) {
        if (this.R && this.W >= 0.6f && this.f17887l3 <= 0.3f) {
            float L = g0.L(6.0f);
            if (this.f17904q1 > 0.7f) {
                RectF rectF = this.f17936z1;
                if (!rectF.isEmpty() && f10 >= rectF.left - L && f10 < rectF.right + g0.L(4.0f) && f11 >= rectF.top - L && f11 <= rectF.bottom + L) {
                    return 7;
                }
                if (!this.T) {
                    RectF rectF2 = this.f17933y1;
                    if (!rectF2.isEmpty() && !this.f17929x1 && f10 >= rectF2.left - g0.L(4.0f) && f10 < rectF2.right + g0.L(4.0f) && f11 >= rectF2.top - L && f11 <= rectF2.bottom + L) {
                        return 6;
                    }
                }
                if (this.f17918u1 > 0.7f && !this.T) {
                    RectF rectF3 = this.A1;
                    if (!rectF3.isEmpty() && f10 >= rectF3.left - g0.L(4.0f) && f10 <= rectF3.right + L && f11 >= rectF3.top - L && f11 <= rectF3.bottom + L) {
                        return 8;
                    }
                }
            }
            if (this.f17839a0 > 0.7f && this.T0 > 0.7f && !this.Z1) {
                RectF rectF4 = this.f17885l0;
                if (!rectF4.isEmpty() && f10 >= rectF4.left - L && f10 <= rectF4.right + L && f11 >= rectF4.top - L && f11 <= rectF4.bottom + L) {
                    return 0;
                }
            }
            RectF rectF5 = this.f17864f2;
            if (!rectF5.isEmpty() && this.d2 > 0.7f && f10 >= rectF5.left - L && f10 <= rectF5.right + L && f11 >= rectF5.top - L && f11 <= rectF5.bottom + L) {
                return 5;
            }
            boolean z10 = this.Z1;
            RectF rectF6 = this.f17881k0;
            if (!z10 || rectF6.isEmpty() || !rectF6.contains(f10, f11)) {
                if (this.f17839a0 > 0.7f && !rectF6.isEmpty() && f10 >= rectF6.left - L && f10 <= rectF6.right + L && f11 >= rectF6.top - L && f11 <= rectF6.bottom + L) {
                    if (f10 >= this.f17879j1) {
                        return 4;
                    }
                    return 1;
                } else if (this.f17878j0.contains(f10, f11)) {
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
        ArrayList arrayList = this.f17916t2;
        int indexOf = arrayList.indexOf(dVar) + 1;
        if (indexOf < arrayList.size()) {
            dVar2 = (d) arrayList.get(indexOf);
        } else {
            dVar2 = null;
        }
        if (dVar2 == null || !dVar2.f17814b || Math.abs(dVar2.f17817f - dVar.f17817f) >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean n(d dVar) {
        d dVar2;
        ArrayList arrayList = this.f17916t2;
        int indexOf = arrayList.indexOf(dVar);
        if (indexOf > 0) {
            dVar2 = (d) arrayList.get(indexOf - 1);
        } else {
            dVar2 = null;
        }
        if (dVar2 == null || !dVar2.f17814b || Math.abs(dVar2.f17817f - dVar.f17817f) >= 1.0f) {
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
        a aVar = this.f17890m3;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        removeCallbacks(aVar);
                        this.f17862f0 = -1;
                        this.K0 = false;
                        invalidate();
                        return true;
                    }
                } else {
                    int i11 = this.f17862f0;
                    if ((i11 == 2 || i11 == 3 || this.K0) && this.J0 > 0.0f) {
                        float y10 = motionEvent.getY() - this.H0;
                        if (!this.K0 && Math.abs(y10) > this.L0) {
                            this.K0 = true;
                            this.H0 = motionEvent.getY();
                            this.I0 = this.f17911s0;
                            this.f17862f0 = -1;
                        }
                        if (this.K0) {
                            this.G0 = Math.max(0.0f, Math.min(this.J0, this.I0 - (motionEvent.getY() - this.H0)));
                            invalidate();
                            return true;
                        }
                    }
                    int i12 = this.f17862f0;
                    if (i12 >= 0 && i12 != 3 && l(motionEvent.getX(), motionEvent.getY()) != this.f17862f0) {
                        removeCallbacks(aVar);
                        this.f17862f0 = -1;
                        invalidate();
                        return true;
                    }
                }
            } else {
                removeCallbacks(aVar);
                int i13 = this.f17862f0;
                if (i13 == 3) {
                    i13 = 2;
                }
                this.f17862f0 = -1;
                if (this.K0) {
                    this.K0 = false;
                    invalidate();
                    return true;
                }
                invalidate();
                if (i13 >= 0 && l(motionEvent.getX(), motionEvent.getY()) == i13) {
                    performHapticFeedback(3);
                    xi.e eVar = this.f17838a;
                    if (i13 == 0) {
                        eVar.G();
                        return true;
                    } else if (i13 == 1) {
                        m mVar = (m) eVar.d;
                        ChatActivityEnterView chatActivityEnterView = mVar.f17964b.f38384a;
                        int i14 = ChatActivityEnterView.f32538n7;
                        ArrayList G = chatActivityEnterView.w0().G();
                        if (G.isEmpty()) {
                            obj = ai.h.f1211c;
                        } else {
                            obj = G.get(0);
                        }
                        mVar.k(obj);
                        return true;
                    } else if (i13 == 4) {
                        m mVar2 = (m) eVar.d;
                        if (mVar2.K != null && !mVar2.f17979n.trim().isEmpty()) {
                            pf pfVar = mVar2.f17964b;
                            e eVar2 = mVar2.K;
                            t6 t6Var = new t6(eVar, 6);
                            ChatActivityEnterView chatActivityEnterView2 = pfVar.f38384a;
                            au0 au0Var = chatActivityEnterView2.f32542a2;
                            RectF rectF = new RectF();
                            rectF.set(eVar2.f17881k0);
                            if (!rectF.isEmpty() && au0Var != null) {
                                FrameLayout frameLayout = new FrameLayout(chatActivityEnterView2.getContext());
                                au0Var.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                                View view = new View(chatActivityEnterView2.getContext());
                                frameLayout.addView(view, new FrameLayout.LayoutParams((int) rectF.width(), (int) rectF.height(), 51));
                                frameLayout.post(new h2(pfVar, eVar2, frameLayout, view, rectF, t6Var, 14));
                                return true;
                            }
                        }
                    } else if (i13 == 5) {
                        m mVar3 = (m) eVar.d;
                        if (mVar3.f17973g0 != null && !mVar3.f17975i0) {
                            Log.d("VoiceLive", "field: back to the text before the style");
                            if (mVar3.f17974h0) {
                                mVar3.f17970e0 = mVar3.f17973g0;
                                mVar3.f17972f0 = mVar3.c().size();
                            } else {
                                mVar3.f17970e0 = null;
                            }
                            mVar3.f17973g0 = null;
                            e eVar3 = mVar3.K;
                            if (eVar3 != null) {
                                eVar3.setRevertShown(false);
                                mVar3.K.setRebuildNext(true);
                            }
                            mVar3.p();
                            e eVar4 = mVar3.K;
                            if (eVar4 != null) {
                                eVar4.setRebuildNext(false);
                                return true;
                            }
                        }
                    } else if (i13 == 6) {
                        m mVar4 = (m) eVar.d;
                        if (mVar4.K != null && ((i7 = mVar4.f17966c) == 2 || i7 == 4)) {
                            String[] C = DictationAsr.C();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(gd.M0(2131745074, null));
                            boolean v = DictationAsr.v();
                            if (v) {
                                i10 = 0;
                            } else {
                                i10 = -1;
                            }
                            int i15 = i10;
                            for (int i16 = 0; i16 < C.length; i16++) {
                                arrayList.add(n0.p(C[i16]));
                                if (!v && i15 < 0 && DictationAsr.y(C[i16])) {
                                    i15 = i16 + 1;
                                }
                            }
                            pf pfVar2 = mVar4.f17964b;
                            e eVar5 = mVar4.K;
                            g gVar = new g(mVar4, C, 1);
                            f fVar = new f(mVar4, 3);
                            ChatActivityEnterView chatActivityEnterView3 = pfVar2.f38384a;
                            au0 au0Var2 = chatActivityEnterView3.f32542a2;
                            RectF rectF2 = new RectF();
                            rectF2.set(eVar5.f17933y1);
                            if (!rectF2.isEmpty() && au0Var2 != null) {
                                FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView3.getContext());
                                au0Var2.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                                View view2 = new View(chatActivityEnterView3.getContext());
                                frameLayout2.addView(view2, new FrameLayout.LayoutParams((int) rectF2.width(), (int) rectF2.height(), 51));
                                frameLayout2.post(new j8(pfVar2, eVar5, frameLayout2, view2, rectF2, arrayList, i15, gVar, fVar));
                                return true;
                            }
                        }
                    } else if (i13 == 7) {
                        ((m) eVar.d).m();
                        return true;
                    } else if (i13 == 8) {
                        eVar.G();
                        return true;
                    } else {
                        m mVar5 = (m) eVar.d;
                        pf pfVar3 = mVar5.f17964b;
                        if (mVar5.K != null && mVar5.f17966c != 0) {
                            ChatActivityEnterView chatActivityEnterView4 = pfVar3.f38384a;
                            ChatActivityEnterView chatActivityEnterView5 = pfVar3.f38384a;
                            au0 au0Var3 = chatActivityEnterView4.f32542a2;
                            if (au0Var3 != null) {
                                EditTextBoldCursor editTextBoldCursor = mVar5.X;
                                if (editTextBoldCursor != null) {
                                    editTextBoldCursor.requestFocus();
                                    g0.I3(mVar5.X);
                                    return true;
                                }
                                i6 i6Var = chatActivityEnterView4.K4;
                                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(mVar5.f17962a);
                                editTextBoldCursor2.setBackground(null);
                                editTextBoldCursor2.setPadding(0, 0, 0, 0);
                                editTextBoldCursor2.setIncludeFontPadding(false);
                                gf gfVar = chatActivityEnterView5.F0;
                                if (gfVar != null) {
                                    L = gfVar.getTextSize();
                                } else {
                                    L = g0.L(18.0f);
                                }
                                editTextBoldCursor2.setTextSize(0, L);
                                editTextBoldCursor2.setTextColor(n6.w0(n6.Le, i6Var));
                                int i17 = n6.Pe;
                                int i18 = ChatActivityEnterView.f32538n7;
                                editTextBoldCursor2.setCursorColor(chatActivityEnterView5.C0(i17) | (-16777216));
                                u6.C(editTextBoldCursor2, n6.f29552lg, i6Var);
                                u6.l(editTextBoldCursor2, 36, n6.f29569mg, i6Var);
                                editTextBoldCursor2.setCursorSize(g0.L(20.0f));
                                editTextBoldCursor2.setCursorWidth(2.0f);
                                editTextBoldCursor2.setGravity(51);
                                editTextBoldCursor2.setInputType(147457);
                                editTextBoldCursor2.setImeOptions(268435456);
                                editTextBoldCursor2.setText(mVar5.f17979n);
                                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                                int size = mVar5.c().size();
                                mVar5.f17965b0 = size;
                                mVar5.Y = size;
                                mVar5.Z = editTextBoldCursor2.length();
                                mVar5.f17963a0 = "";
                                editTextBoldCursor2.addTextChangedListener(new ah.j(mVar5, 9));
                                if (mVar5.K.getParent() == au0Var3) {
                                    childCount = au0Var3.indexOfChild(mVar5.K) + 1;
                                } else {
                                    childCount = au0Var3.getChildCount();
                                }
                                au0Var3.addView(editTextBoldCursor2, childCount, new FrameLayout.LayoutParams(1, 1, 51));
                                mVar5.X = editTextBoldCursor2;
                                editTextBoldCursor2.requestFocus();
                                g0.h3(new r1(27, mVar5, editTextBoldCursor2), 50L);
                                StringBuilder sb2 = new StringBuilder("field: editing in place (");
                                sb2.append(mVar5.f17979n.length());
                                sb2.append(" chars, recording ");
                                if (mVar5.f17966c == 2) {
                                    str = "on";
                                } else {
                                    str = "paused";
                                }
                                sb2.append(str);
                                sb2.append(")");
                                Log.d("VoiceLive", sb2.toString());
                                mVar5.K.invalidate();
                            }
                        }
                    }
                }
            }
            return true;
        }
        this.K0 = false;
        int l10 = l(motionEvent.getX(), motionEvent.getY());
        this.f17862f0 = l10;
        if (l10 >= 0) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.H0 = motionEvent.getY();
            this.I0 = this.f17911s0;
            if (this.f17862f0 == 2 && !this.T) {
                this.f17862f0 = 3;
            }
            if (this.f17862f0 == 0) {
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
        vu0 vu0Var;
        float f16 = ((float) (j3 - this.D2)) / 1000.0f;
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
        s(this.f17873h3, r11 - g0.L(48.0f), r11);
        LinearGradient linearGradient = this.f17873h3;
        Paint paint = this.f17860e3;
        paint.setShader(linearGradient);
        canvas.drawRect(f17, f18, L2, L3, paint);
        s(this.f17869g3, r11 - L, r11);
        LinearGradient linearGradient2 = this.f17869g3;
        Paint paint2 = this.f17855d3;
        paint2.setShader(linearGradient2);
        canvas.drawRect(f17, f18, L2, L3, paint2);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
        if (this.Q2 != null && r10 - L < this.H2) {
            canvas.save();
            canvas.translate(this.I2, this.J2);
            float max = Math.max(L2, this.Q2.getWidth());
            f15 = 2.0f;
            int saveLayer2 = canvas.saveLayer(f17, this.K2 - g0.L(2.0f), max, this.K2 + this.L2 + g0.L(2.0f), null);
            Paint paint3 = this.f17852c3;
            paint3.setAlpha(i7);
            canvas.drawBitmap(this.Q2, -this.X2, -this.Y2, paint3);
            s(this.f17865f3, r10, L + r10);
            paint2.setShader(this.f17865f3);
            canvas.drawRect(f17, f18, max, Math.max(L3, g0.L(40.0f) + this.Q2.getHeight()), paint2);
            canvas.restoreToCount(saveLayer2);
            canvas.restore();
        } else {
            f15 = 2.0f;
        }
        float f19 = g0.f24120p;
        long j10 = this.E2;
        float max2 = Math.max(0.05f, ((float) Math.min(j10, j10 - (j3 - this.D2))) / 1000.0f);
        while (true) {
            int i10 = this.V2;
            int i11 = this.T2;
            vu0Var = this.f17937z2;
            if (i10 >= i11) {
                break;
            }
            float[] fArr = this.R2;
            int i12 = i10 * 3;
            if (fArr[i12 + 2] > r10) {
                break;
            }
            vu0Var.g(this.I2 + fArr[i12], this.J2 + fArr[i12 + 1], ((vu0Var.d() * 34.0f) + 10.0f) * f19, (-((vu0Var.d() * 20.0f) + 6.0f)) * f19, Math.min(max2, (vu0Var.d() * 0.3f) + 0.26f), 0.0f);
            this.V2++;
        }
        float f20 = f13 - f11;
        while (true) {
            int i13 = this.W2;
            if (i13 >= this.U2) {
                break;
            }
            float[] fArr2 = this.S2;
            int i14 = i13 * 3;
            if (fArr2[i14 + 2] > r10) {
                break;
            }
            this.W2 = i13 + 1;
            float f21 = fArr2[i14 + 1];
            if (f21 >= f20 - g0.L(f15) && f21 <= f20 + f14 + g0.L(f15)) {
                float f22 = f10 + this.S2[i14];
                float f23 = f11 + f21;
                vu0Var.h((((vu0Var.d() * 16.0f) + 6.0f) * f19) + f22, ((vu0Var.d() - 0.5f) * 14.0f * f19) + f23, f22, f23, Math.min(max2, (vu0Var.d() * 0.08f) + 0.099999994f));
            }
        }
        if (f16 * 1000.0f >= ((float) this.E2)) {
            this.B2 = false;
            Bitmap bitmap = this.Q2;
            if (bitmap != null) {
                bitmap.recycle();
                this.Q2 = null;
            }
        }
    }

    public final float r(float f10) {
        float interpolation = B3.getInterpolation(Math.max(0.0f, Math.min(1.0f, (f10 * 1000.0f) / (((float) this.E2) - 60.0f))));
        float f11 = this.G2;
        return e2.z(this.H2, f11, interpolation, f11);
    }

    public final void s(LinearGradient linearGradient, float f10, float f11) {
        float sqrt = (float) Math.sqrt(1.809999942779541d);
        float f12 = 1.0f / sqrt;
        float f13 = 0.9f / sqrt;
        float f14 = f10 / sqrt;
        float f15 = f11 / sqrt;
        Matrix matrix = this.f17877i3;
        matrix.reset();
        matrix.setScale(Math.max(0.01f, f15 - f14), 1.0f);
        matrix.postRotate((float) Math.toDegrees(Math.atan2(f13, f12)));
        matrix.postTranslate(f12 * f14, f14 * f13);
        linearGradient.setLocalMatrix(matrix);
    }

    public void setBusy(boolean z10) {
        if (this.Z1 == z10) {
            return;
        }
        this.Z1 = z10;
        if (z10) {
            this.f17846b2 = SystemClock.uptimeMillis();
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
        this.f17896o1 = charSequence2;
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.f17929x1 = z10;
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
        this.f17882k1 = z10;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.f17900p1)) {
            return;
        }
        this.f17900p1 = str;
        this.R0 = null;
        invalidate();
    }

    public void setRebuildNext(boolean z10) {
        this.A2 = z10;
    }

    public void setRevertShown(boolean z10) {
        this.f17841a2 = z10;
        invalidate();
    }

    public final int t(int i7, Bitmap bitmap, boolean z10) {
        float f10;
        float[] fArr;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int max = Math.max(1, Math.round(g0.f24120p * 0.8f));
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11 += max) {
            if (z10) {
                float f11 = i11;
                float f12 = this.K2;
                float f13 = max;
                if (f11 >= f12 - f13) {
                    if (f11 > f12 + this.L2 + f13) {
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
            fArr = this.R2;
        } else {
            fArr = this.S2;
        }
        if (fArr.length < min) {
            fArr = new float[min];
        }
        int i13 = 0;
        for (int i14 = 0; i14 < height; i14 += max) {
            if (z10) {
                float f14 = i14;
                float f15 = this.K2;
                float f16 = max;
                if (f14 >= f15 - f16) {
                    if (f14 > f15 + this.L2 + f16) {
                    }
                }
            }
            for (int i15 = 0; i15 < width; i15 += max) {
                if ((iArr[(i14 * width) + i15] >>> 24) > 90) {
                    vu0 vu0Var = this.f17937z2;
                    if (vu0Var.d() <= f10) {
                        int i16 = i13 + 1;
                        if (i16 * 3 <= fArr.length) {
                            float f17 = max;
                            float d = ((vu0Var.d() - 0.5f) * f17) + i15;
                            float d2 = ((vu0Var.d() - 0.5f) * f17) + i14;
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
        Arrays.sort(numArr, new ai.l(2, fArr));
        float[] copyOf = Arrays.copyOf(fArr, i13 * 3);
        for (int i19 = 0; i19 < i13; i19++) {
            int i20 = i19 * 3;
            int intValue = numArr[i19].intValue() * 3;
            fArr[i20] = copyOf[intValue];
            fArr[i20 + 1] = copyOf[intValue + 1];
            fArr[i20 + 2] = copyOf[intValue + 2];
        }
        if (z10) {
            this.R2 = fArr;
            return i13;
        }
        this.S2 = fArr;
        return i13;
    }

    public final float u(long j3) {
        return B3.getInterpolation(Math.max(0.0f, Math.min(1.0f, ((float) (j3 - this.D2)) / ((float) this.E2))));
    }

    public final float v(float f10) {
        float f11 = 0.0f;
        if (this.H2 <= this.G2) {
            return 0.0f;
        }
        float f12 = ((float) this.E2) / 1000.0f;
        for (int i7 = 0; i7 < 24; i7++) {
            float f13 = (f11 + f12) / 2.0f;
            if (r(f13) < f10) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
        return Math.min(f12, ((float) this.E2) / 1000.0f);
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
            ArrayList arrayList = this.f17840a1;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                c cVar = (c) obj;
                int i10 = cVar.f17811b;
                if (i10 > cVar.f17810a && i10 <= spannableString.length()) {
                    spannableString.setSpan(new g2(cVar, 1), cVar.f17810a, cVar.f17811b, 33);
                }
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                int[] iArr = this.f17845b1;
                if (i12 >= iArr.length) {
                    break;
                }
                int max = Math.max(0, iArr[i11]);
                int min = Math.min(spannableString.length(), this.f17845b1[i12]);
                if (min > max) {
                    spannableString.setSpan(new b(0), max, min, 33);
                }
                i11 += 2;
            }
            this.P0 = b(spannableString, this.d);
            ArrayList arrayList2 = this.f17850c1;
            arrayList2.clear();
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                int[] iArr2 = this.f17845b1;
                if (i14 < iArr2.length) {
                    int max2 = Math.max(0, iArr2[i13]);
                    int min2 = Math.min(spannableString.length(), this.f17845b1[i14]);
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
                                float f10 = f17831t3;
                                float f11 = f17832u3;
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
        if (!this.Z1) {
            return;
        }
        if (this.j3 == null) {
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
            this.j3 = new LinearGradient(0.0f, 0.0f, g0.L(150.0f), 0.0f, new int[]{this.N, f11, i0.a.f(0.5f, f11, f12), f12, this.N}, new float[]{0.0f, 0.3f, 0.5f, 0.7f, 1.0f}, Shader.TileMode.MIRROR);
        }
        float f13 = ((float) (j3 - this.f17846b2)) / 1000.0f;
        float sin = (((float) Math.sin((0.23f * f13) + 1.3f)) * 12.0f) + (((float) Math.sin(0.45f * f13)) * 28.0f);
        Matrix matrix = this.f17884k3;
        matrix.reset();
        matrix.setRotate(sin);
        matrix.postTranslate(g0.L(46.0f) * f13, g0.L(10.0f) * ((float) Math.sin(f13 * 0.7f)));
        this.j3.setLocalMatrix(matrix);
        this.d.setShader(this.j3);
    }

    public final void z() {
        if (this.I == null) {
            xi.e eVar = this.f17838a;
            this.I = eVar.k(this);
            this.J = eVar.k(this);
        }
        if (!this.R) {
            this.R = true;
            this.f17870h0 = SystemClock.uptimeMillis();
            this.f17892n0 = false;
            this.f17848c.f();
            this.B2 = false;
            Bitmap bitmap = this.Q2;
            if (bitmap != null) {
                bitmap.recycle();
                this.Q2 = null;
            }
            this.f17876i2 = false;
            this.f17937z2.a();
            this.f17841a2 = false;
            this.d2 = 0.0f;
            this.f17896o1 = null;
            this.f17900p1 = null;
            this.R0 = null;
            this.f17904q1 = 0.0f;
            this.Z1 = false;
            this.f17851c2 = 0.0f;
            this.O1 = 0.0f;
            this.A2 = false;
            this.f17894n3 = false;
            this.f17898o3 = false;
        }
        setVisibility(0);
        invalidate();
    }
}
