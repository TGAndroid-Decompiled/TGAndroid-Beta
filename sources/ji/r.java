package ji;

import ai.c1;
import ai.j2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Random;
import n2.a0;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
public final class r extends View {
    public static int X1;
    public static int Y1;
    public static float Z1;
    public static long f18022b2;
    public boolean A0;
    public boolean A1;
    public float B0;
    public long B1;
    public float C0;
    public long C1;
    public float D0;
    public StaticLayout D1;
    public final LinearGradient E;
    public float E0;
    public final ArrayList E1;
    public final Matrix F;
    public float F0;
    public final Paint F1;
    public final Drawable G;
    public float G0;
    public final Paint G1;
    public final Drawable H;
    public float H0;
    public final Path H1;
    public final String I;
    public float I0;
    public final Paint I1;
    public final String J;
    public float J0;
    public final RectF J1;
    public Drawable K;
    public boolean K0;
    public final Paint K1;
    public final String L;
    public boolean L0;
    public final Path L1;
    public String M;
    public boolean M0;
    public final Paint M1;
    public final String N;
    public float N0;
    public final Paint N1;
    public String O;
    public float O0;
    public float O1;
    public float P;
    public boolean P0;
    public boolean P1;
    public float Q;
    public float Q0;
    public float Q1;
    public final RectF R;
    public long R0;
    public Paint R1;
    public final RectF S;
    public long S0;
    public Paint S1;
    public final RectF T;
    public float T0;
    public float T1;
    public Drawable U;
    public boolean U0;
    public Drawable V;
    public float V0;
    public boolean W;
    public float W0;
    public float X0;
    public float Y0;
    public boolean Z0;
    public final o f18023a;
    public boolean f18024a0;
    public float f18025a1;
    public final h6 f18026b;
    public Paint f18027b0;
    public float f18028b1;
    public final TextPaint f18029c;
    public Object f18030c0;
    public int f18031c1;
    public final TextPaint d;
    public Object f18032d0;
    public final RectF f18033d1;
    public final TextPaint f18034e;
    public float f18035e0;
    public final RectF f18036e1;
    public final Paint f18037f;
    public long f18038f0;
    public final RectF f18039f1;
    public boolean f18040g0;
    public final RectF f18041g1;
    public final Paint h;
    public int f18042h0;
    public final RectF f18043h1;
    public int f18044i0;
    public final RectF f18045i1;
    public boolean f18046j0;
    public float f18047j1;
    public String f18048k0;
    public float f18049k1;
    public StaticLayout f18050l0;
    public int l1;
    public StaticLayout m0;
    public final float[] f18051m1;
    public final Paint f18052n;
    public int f18053n0;
    public final RectF n1;
    public final ArrayList f18054o0;
    public float f18055o1;
    public boolean f18056p0;
    public Drawable f18057p1;
    public boolean f18058q0;
    public float f18059q1;
    public int f18060r;
    public long f18061r0;
    public float f18062r1;
    public final Paint f18063s;
    public long f18064s0;
    public float f18065s1;
    public long f18066t0;
    public boolean f18067t1;
    public float f18068u0;
    public boolean f18069u1;
    public float f18070v0;
    public VelocityTracker f18071v1;
    public final Paint f18072w;
    public float f18073w0;
    public final int f18074w1;
    public final Paint f18075x;
    public float f18076x0;
    public String f18077x1;
    public final Paint f18078y;
    public float f18079y0;
    public int f18080y1;
    public float f18081z0;
    public boolean f18082z1;
    public static final nr U1 = new nr(0.4d, 0.0d, 0.2d, 1.0d);
    public static final nr V1 = nr.h;
    public static final nr W1 = new nr(0.4d, 0.0d, 1.0d, 1.0d);
    public static final OvershootInterpolator f18021a2 = new OvershootInterpolator(1.3f);

    static {
        new nr(0.3d, 0.0d, 0.1d, 1.0d);
    }

    public r(Context context, h6 h6Var, o oVar) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f18029c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f18034e = textPaint3;
        this.f18037f = new Paint();
        this.h = new Paint(1);
        this.f18052n = new Paint(1);
        Paint paint = new Paint(1);
        this.f18063s = paint;
        this.f18072w = new Paint(1);
        this.f18075x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f18078y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-603979776, -1073741824, Integer.MIN_VALUE, 939524096, 201326592, 0}, new float[]{0.0f, 0.18f, 0.42f, 0.66f, 0.86f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        String N0 = hd.N0(2131745054, null);
        this.L = N0;
        this.M = N0;
        this.N = hd.N0(2131745065, null);
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        new Matrix();
        this.f18035e0 = -1.0f;
        this.f18044i0 = -12939291;
        this.f18048k0 = "";
        this.f18054o0 = new ArrayList();
        this.A0 = true;
        this.G0 = -1.0f;
        this.H0 = -1.0f;
        this.J0 = -1.0f;
        this.Q0 = -1.0f;
        this.U0 = true;
        this.Z0 = true;
        this.f18025a1 = 1.0f;
        this.f18031c1 = -1;
        this.f18033d1 = new RectF();
        this.f18036e1 = new RectF();
        this.f18039f1 = new RectF();
        this.f18041g1 = new RectF();
        this.f18043h1 = new RectF();
        this.f18045i1 = new RectF();
        this.f18049k1 = 1.0f;
        this.l1 = -1;
        this.f18051m1 = new float[6];
        this.n1 = new RectF();
        this.f18080y1 = -1;
        new RectF();
        this.E1 = new ArrayList();
        this.F1 = new Paint(1);
        this.G1 = new Paint();
        this.H1 = new Path();
        this.I1 = new Paint(1);
        this.J1 = new RectF();
        this.K1 = new Paint(1);
        new Paint(1);
        this.L1 = new Path();
        this.M1 = new Paint(1);
        this.N1 = new Paint(1);
        this.T1 = 1.0f;
        this.f18026b = h6Var;
        this.f18023a = oVar;
        this.f18074w1 = ViewConfiguration.get(context).getScaledTouchSlop();
        textPaint.setTextSize(g0.L(21.0f));
        textPaint2.setTextSize(g0.L(21.0f));
        textPaint3.setTextSize(g0.L(14.0f));
        textPaint3.setTypeface(g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(g0.N(0.66f));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.G = context.getResources().getDrawable(2131232118).mutate();
        this.H = i5.c.g(context, 2131232696);
        this.I = hd.N0(2131751323, null);
        this.J = hd.N0(2131745036, null);
        setVisibility(8);
    }

    public static float b(float f10) {
        if (f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public static float c(int i7) {
        return Math.max(g0.L(28.0f), (i7 - g0.L(560.0f)) / 2.0f);
    }

    public static float k(float f10, float f11, float f12, float f13) {
        return e2.z(1.0f, (float) Math.exp((-f11) / f13), f12 - f10, f10);
    }

    public static String p(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isLetterOrDigit(charAt)) {
                sb2.append(Character.toLowerCase(charAt));
            }
        }
        return sb2.toString();
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, this.f18053n0).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(g0.L(4.0f), 1.0f).setIncludePad(false).build();
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (!(getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        int i7 = 0;
        while (i7 < indexOfChild) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt == null || childAt.getVisibility() != 0 || childAt.getAlpha() <= 0.01f || childAt.getWidth() <= 0 || childAt.getHeight() <= 0 || (childAt instanceof SurfaceView)) {
                canvas2 = canvas;
            } else {
                int save = canvas.save();
                canvas.translate(childAt.getLeft(), childAt.getTop());
                Matrix matrix = childAt.getMatrix();
                if (!matrix.isIdentity()) {
                    canvas.concat(matrix);
                }
                if (childAt.getAlpha() < 0.99f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getWidth(), childAt.getHeight(), (int) (childAt.getAlpha() * 255.0f));
                } else {
                    canvas2 = canvas;
                }
                try {
                    childAt.draw(canvas2);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
                canvas2.restoreToCount(save);
            }
            i7++;
            canvas = canvas2;
        }
        canvas.restore();
    }

    public final void e(Canvas canvas, RectF rectF, int i7, float f10) {
        i(canvas, this.I, rectF.left + g0.L(14.0f), rectF.centerY(), i7, f10);
        float centerY = rectF.centerY();
        float f11 = rectF.right;
        int L = g0.L(1.0f);
        int L2 = g0.L(14.0f);
        float L3 = f11 - (g0.L(10.0f) + (L2 + (g0.L(8.0f) + L)));
        Paint paint = this.f18072w;
        paint.setColor(i7);
        paint.setAlpha((int) (35.7f * f10));
        canvas.drawRect(L3, centerY - g0.L(9.0f), g0.N(1.0f) + L3, centerY + g0.L(9.0f), paint);
        Path path = this.H1;
        if (path.isEmpty()) {
            path.moveTo(-g0.N(3.8f), g0.N(3.8f));
            path.lineTo(0.0f, 0.0f);
            path.lineTo(g0.N(3.8f), g0.N(3.8f));
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.I1;
        paint2.setStyle(style);
        paint2.setStrokeWidth(g0.N(1.75f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setColor(i7);
        float f12 = f10 * 255.0f;
        int i10 = (int) f12;
        paint2.setAlpha(i10);
        float L4 = L3 + g0.L(1.0f) + g0.L(8.0f) + g0.L(7.0f);
        if (this.f18082z1) {
            float L5 = g0.L(6.5f);
            Paint paint3 = this.N1;
            paint3.setStyle(style);
            paint3.setStrokeWidth(g0.N(1.75f));
            paint3.setStrokeCap(cap);
            paint3.setColor(i7);
            paint3.setAlpha((int) (f12 * 0.9f));
            float uptimeMillis = (((float) (SystemClock.uptimeMillis() % 900)) / 900.0f) * 360.0f;
            RectF rectF2 = g0.P;
            rectF2.set(L4 - L5, centerY - L5, L4 + L5, centerY + L5);
            canvas.drawArc(rectF2, uptimeMillis, 270.0f, false, paint3);
        } else if (this.K != null) {
            float L6 = g0.L(20.0f) / 2.0f;
            this.K.setBounds((int) (L4 - L6), (int) (centerY - L6), (int) (L4 + L6), (int) (centerY + L6));
            this.K.setAlpha(i10);
            this.K.draw(canvas);
        } else {
            canvas.save();
            canvas.translate(L4, (centerY - g0.N(1.9f)) - g0.N(0.4f));
            canvas.drawPath(path, paint2);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, float f14) {
        Matrix matrix = this.F;
        matrix.reset();
        if (z10) {
            matrix.setScale(1.0f, -(f13 - f11));
            matrix.postTranslate(0.0f, f13);
        } else {
            matrix.setScale(1.0f, f13 - f11);
            matrix.postTranslate(0.0f, f11);
        }
        this.E.setLocalMatrix(matrix);
        Paint paint = this.f18078y;
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawRect(f10, f11, f12, f13, paint);
    }

    public final void g(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        canvas.save();
        float height = rectF.height() / 2.0f;
        boolean z10 = this.f18040g0;
        RectF rectF2 = this.f18036e1;
        int i7 = -16777216;
        Path path = this.L1;
        Paint paint = this.f18052n;
        Paint paint2 = this.K1;
        if (z10) {
            paint.clearShadowLayer();
            if (this.f18032d0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.R1 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.7f);
                    colorMatrix.postConcat(new ColorMatrix(new float[]{0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint3 = new Paint();
                    this.R1 = paint3;
                    paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
                this.R1.setAlpha((int) (f11 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f13 = 1.0f / f12;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                float f14 = 1.0f / this.T1;
                canvas.scale(f14, f14, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.f18047j1);
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.R1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(a0.d(this.f18032d0));
                canvas.restoreToCount(saveLayer);
                canvas.restore();
            }
            paint.setColor(m6.r1(f11 * 0.55f, -14276047));
            canvas.drawRoundRect(rectF, height, height, paint);
            paint2.setShader(null);
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setStrokeWidth(g0.N(0.66f));
            paint2.setColor(m6.r1(0.12f * f11, -1));
            RectF rectF3 = g0.P;
            rectF3.set(rectF);
            rectF3.inset(g0.N(0.33f), g0.N(0.33f));
            canvas.drawRoundRect(rectF3, height, height, paint2);
            Paint paint4 = this.M1;
            paint4.setStyle(style);
            paint4.setStrokeWidth(g0.N(1.0f));
            int r12 = m6.r1(0.19f * f11, -16777216);
            int i10 = 16777215 & r12;
            paint4.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, new int[]{r12, i10, i10, r12}, new float[]{0.0f, Math.min(0.45f, (height / rectF.width()) * 1.1f), Math.max(0.55f, 1.0f - ((height / rectF.width()) * 1.1f)), 1.0f}, Shader.TileMode.CLAMP));
            rectF3.set(rectF);
            rectF3.inset(-g0.N(0.5f), -g0.N(0.5f));
            canvas.drawRoundRect(rectF3, g0.N(0.5f) + height, g0.N(0.5f) + height, paint4);
        } else {
            paint.clearShadowLayer();
            if (this.f18032d0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.S1 == null) {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setSaturation(1.3f);
                    colorMatrix2.postConcat(new ColorMatrix(new float[]{1.04f, 0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 1.04f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, 1.04f, 0.0f, 14.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint5 = new Paint();
                    this.S1 = paint5;
                    paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                }
                this.S1.setAlpha((int) (f11 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f15 = 1.0f / f12;
                canvas.scale(f15, f15, rectF.centerX(), rectF.centerY());
                float f16 = 1.0f / this.T1;
                canvas.scale(f16, f16, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.f18047j1);
                int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.S1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(a0.d(this.f18032d0));
                canvas.restoreToCount(saveLayer2);
                canvas.restore();
            }
            paint.setColor(m6.r1(0.62f * f11, -1));
            canvas.drawRoundRect(rectF, height, height, paint);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(g0.N(1.0f));
            paint2.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, new int[]{m6.r1(0.95f * f11, -1), m6.r1(0.25f * f11, -1), m6.r1(f11 * 0.55f, -1)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            RectF rectF4 = g0.P;
            rectF4.set(rectF);
            rectF4.inset(g0.N(0.5f), g0.N(0.5f));
            canvas.drawRoundRect(rectF4, height, height, paint2);
            paint2.setShader(null);
            paint2.setStrokeWidth(g0.N(0.66f));
            paint2.setColor(m6.r1(0.07f * f11, -16777216));
            rectF4.set(rectF);
            rectF4.inset(-g0.N(0.33f), -g0.N(0.33f));
            canvas.drawRoundRect(rectF4, g0.N(0.33f) + height, g0.N(0.33f) + height, paint2);
        }
        if (f10 > 0.01f) {
            if (this.f18040g0) {
                i7 = -1;
            }
            Paint paint6 = this.f18072w;
            paint6.setColor(i7);
            paint6.setAlpha((int) (20.4f * f10 * f11));
            canvas.drawRoundRect(rectF, height, height, paint6);
        }
        canvas.restore();
    }

    public final void h(float f10, float f11, float f12, int i7, Canvas canvas, boolean z10) {
        float[] fArr;
        float f13;
        int i10;
        char c10;
        float f14;
        float b10;
        float interpolation;
        float f15;
        int i11;
        float f16;
        Canvas canvas2;
        float f17;
        float f18;
        int i12 = 0;
        while (true) {
            fArr = this.f18051m1;
            float f19 = 0.0f;
            if (i12 >= fArr.length) {
                break;
            }
            float f20 = fArr[i12];
            int i13 = this.l1;
            if (i13 == i12) {
                f19 = 1.0f;
            }
            if (i13 == i12) {
                f18 = 40.0f;
            } else {
                f18 = 70.0f;
            }
            fArr[i12] = k(f20, f12, f19, f18);
            i12++;
        }
        float f21 = this.f18055o1;
        if (this.K != null && !this.f18082z1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        this.f18055o1 = k(f21, f12, f13, 90.0f);
        String str = this.I;
        TextPaint textPaint = this.f18034e;
        float measureText = textPaint.measureText(str);
        float measureText2 = textPaint.measureText(this.J);
        float c11 = c(i7) - g0.L(2.0f);
        int L = g0.L(10.0f) + g0.L(14.0f) + g0.L(8.0f) + g0.L(1.0f);
        if (this.K != null) {
            i10 = g0.L(4.0f);
        } else {
            i10 = 0;
        }
        float f22 = L + i10;
        float L2 = g0.L(14.0f) + measureText + g0.L(12.0f);
        float f23 = this.O1;
        if (f23 > 0.0f) {
            L2 = k(f23, f12, L2, 110.0f);
        }
        this.O1 = L2;
        float f24 = f10 + f11;
        RectF rectF = this.f18043h1;
        rectF.set(c11, f10, L2 + c11, f24);
        float f25 = rectF.right;
        RectF rectF2 = this.f18045i1;
        rectF2.set(f25, f10, f22 + f25, f24);
        float f26 = rectF.left;
        float f27 = rectF2.right;
        RectF rectF3 = this.f18039f1;
        rectF3.set(f26, f10, f27, f24);
        RectF rectF4 = this.n1;
        rectF4.set(rectF3.right + g0.L(8.0f), f10, rectF3.right + g0.L(8.0f) + f11, f24);
        float L3 = (((this.f18055o1 * f11) + g0.L(8.0f)) * this.f18055o1) + rectF3.right + g0.L(8.0f);
        RectF rectF5 = this.f18041g1;
        rectF5.set(L3, f10, measureText2 + L3 + g0.L(32.0f), f24);
        float f28 = rectF3.left;
        float f29 = rectF5.right;
        RectF rectF6 = this.f18036e1;
        rectF6.set(f28, f10, f29, f24);
        if (this.f18081z0 > 0.001f) {
            if (z10 && this.S0 == 0) {
                this.S0 = SystemClock.uptimeMillis();
            }
            if (this.S0 == 0) {
                c10 = 0;
                f14 = 0.001f;
                b10 = 0.0f;
            } else {
                c10 = 0;
                f14 = 0.001f;
                b10 = b(((float) (SystemClock.uptimeMillis() - this.S0)) / 460.0f);
            }
            if (!this.f18056p0) {
                interpolation = this.T0;
            } else {
                interpolation = f18021a2.getInterpolation(b10);
            }
            this.T0 = interpolation;
            if (interpolation <= f14) {
                return;
            }
            if (this.f18056p0) {
                f15 = b(this.f18081z0 * 1.6f);
            } else {
                f15 = this.f18081z0;
            }
            float b11 = b(this.T0 * 1.8f) * f15;
            float T1 = g0.T1(0.6f, 1.0f, this.f18028b1) * b11;
            canvas.save();
            canvas.translate(0.0f, this.f18047j1);
            float T12 = g0.T1(0.6f, 1.0f, this.T0) * this.f18049k1;
            canvas.scale(T12, T12, rectF6.left, rectF6.centerY());
            this.T1 = T12;
            if (this.f18040g0) {
                i11 = -1;
            } else {
                i11 = this.f18042h0;
            }
            int i14 = i11;
            float max = Math.max(fArr[c10], fArr[2]);
            if (this.P1) {
                float b12 = b(1.0f - (this.Q1 / 0.35f));
                if (b12 > 0.01f) {
                    e(canvas, rectF3, i14, b12 * T1);
                }
                canvas2 = canvas;
                f16 = 2.0f;
                f17 = b11;
            } else {
                canvas.save();
                float f30 = 1.0f - (max * 0.05f);
                f16 = 2.0f;
                canvas.scale(f30, f30, rectF3.centerX(), rectF3.centerY());
                canvas2 = canvas;
                g(canvas2, rectF3, max, b11, f30);
                f17 = b11;
                e(canvas2, rectF3, i14, T1);
                canvas2.restore();
            }
            if (this.f18055o1 > 0.01f) {
                canvas2.save();
                float T13 = g0.T1(0.6f, 1.0f, this.f18055o1) * (1.0f - (fArr[3] * 0.05f));
                canvas2.scale(T13, T13, rectF4.centerX(), rectF4.centerY());
                g(canvas2, rectF4, fArr[3], f17 * this.f18055o1, T13);
                if (this.f18057p1 == null) {
                    this.f18057p1 = getContext().getResources().getDrawable(2131231001).mutate();
                }
                this.f18057p1.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
                this.f18057p1.setAlpha((int) (255.0f * T1 * this.f18055o1));
                float L4 = g0.L(22.0f) / f16;
                this.f18057p1.setBounds((int) (rectF4.centerX() - L4), (int) (rectF4.centerY() - L4), (int) (rectF4.centerX() + L4), (int) (rectF4.centerY() + L4));
                this.f18057p1.draw(canvas2);
                canvas2.restore();
            }
            canvas2.save();
            float f31 = 1.0f - (fArr[1] * 0.05f);
            canvas2.scale(f31, f31, rectF5.centerX(), rectF5.centerY());
            g(canvas2, rectF5, fArr[1], f17 * 1.0f, f31);
            i(canvas, this.J, g0.L(16.0f) + rectF5.left, rectF5.centerY(), i14, T1 * 1.0f);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void i(Canvas canvas, String str, float f10, float f11, int i7, float f12) {
        TextPaint textPaint = this.f18034e;
        textPaint.setColor(i7);
        textPaint.setAlpha((int) (f12 * 255.0f));
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, f10, f11 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    public final void j(Canvas canvas, RectF rectF, int i7, float f10) {
        if (this.U == null) {
            this.U = getContext().getResources().getDrawable(2131232196).mutate();
            this.V = getContext().getResources().getDrawable(2131232362).mutate();
        }
        float centerY = rectF.centerY();
        Drawable drawable = this.U;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(i7, mode));
        int i10 = (int) (255.0f * f10);
        this.U.setAlpha(i10);
        int L = (int) (rectF.left + g0.L(10.0f));
        int L2 = (int) (centerY - g0.L(10.0f));
        this.U.setBounds(L, L2, g0.L(20.0f) + L, g0.L(20.0f) + L2);
        this.U.draw(canvas);
        float L3 = (((rectF.right - g0.L(9.0f)) - g0.L(20.0f)) - g0.L(8.0f)) - g0.L(1.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L3 - g0.L(4.0f), rectF.bottom);
        String str = this.O;
        if (str == null) {
            str = this.N;
        }
        i(canvas, str, rectF.left + g0.L(10.0f) + g0.L(20.0f) + g0.L(6.0f), centerY, i7, g0.T1(0.5f, 1.0f, this.P) * f10);
        canvas.restore();
        Paint paint = this.f18072w;
        paint.setColor(i7);
        paint.setAlpha((int) (35.7f * f10));
        canvas.drawRect(L3, centerY - g0.L(9.0f), g0.N(1.0f) + L3, centerY + g0.L(9.0f), paint);
        this.V.setColorFilter(new PorterDuffColorFilter(i7, mode));
        this.V.setAlpha(i10);
        int L4 = (int) ((rectF.right - g0.L(9.0f)) - g0.L(10.0f));
        int i11 = (int) centerY;
        this.V.setBounds(L4 - g0.L(10.0f), i11 - g0.L(10.0f), g0.L(10.0f) + L4, g0.L(10.0f) + i11);
        this.V.draw(canvas);
    }

    public final void l(RectF rectF) {
        float f10 = this.T1;
        RectF rectF2 = this.f18036e1;
        float centerY = rectF2.centerY();
        float f11 = rectF2.left;
        RectF rectF3 = this.f18039f1;
        float z10 = e2.z(rectF3.left, f11, f10, f11);
        float z11 = e2.z(rectF3.top, centerY, f10, centerY);
        float f12 = this.f18047j1;
        rectF.set(z10, z11 + f12, e2.z(rectF3.right, f11, f10, f11), ((rectF3.bottom - centerY) * f10) + centerY + f12);
    }

    public final void m() {
        r rVar;
        if (!this.f18056p0) {
            if (getVisibility() != 0 && (rVar = this.f18023a.h) != null) {
                g0.E2(rVar);
                Log.d("VoiceLive", "overlay removed");
                return;
            }
            return;
        }
        this.f18056p0 = false;
        this.f18058q0 = false;
        this.f18064s0 = SystemClock.uptimeMillis();
        this.f18068u0 = this.f18076x0;
        this.f18070v0 = this.f18079y0;
        this.f18073w0 = this.f18081z0;
        this.l1 = -1;
        invalidate();
    }

    public final int n(float f10, float f11) {
        float f12;
        float f13 = 0.7f;
        if (this.f18081z0 >= 0.7f && this.T0 >= 0.7f) {
            float L = g0.L(4.0f);
            float f14 = f11 - this.f18047j1;
            int i7 = 0;
            RectF[] rectFArr = {this.f18043h1, this.f18041g1, this.f18045i1, this.n1};
            while (i7 < 4) {
                if (i7 != 3 || this.f18055o1 >= f13) {
                    RectF rectF = rectFArr[i7];
                    RectF rectF2 = this.f18036e1;
                    float f15 = rectF2.left;
                    float f16 = this.f18049k1;
                    float f17 = ((rectF.left - f15) * f16) + f15;
                    float z10 = e2.z(rectF.right, f15, f16, f15);
                    float centerY = ((rectF.top - rectF2.centerY()) * this.f18049k1) + rectF2.centerY();
                    float centerY2 = ((rectF.bottom - rectF2.centerY()) * this.f18049k1) + rectF2.centerY();
                    float f18 = 0.0f;
                    if (i7 == 2) {
                        f12 = 0.0f;
                    } else {
                        f12 = L;
                    }
                    if (f10 < f17 - f12) {
                        continue;
                    } else {
                        if (i7 != 0) {
                            f18 = L;
                        }
                        if (f10 <= z10 + f18 && f14 >= centerY - L && f14 <= centerY2 + L) {
                            return i7;
                        }
                    }
                }
                i7++;
                f13 = 0.7f;
            }
        }
        return -1;
    }

    public final int o(float f10, float f11) {
        if (this.f18079y0 >= 0.7f) {
            RectF rectF = this.R;
            if (!rectF.isEmpty() && !this.W) {
                float L = g0.L(4.0f);
                if (f11 >= rectF.top - L && f11 <= rectF.bottom + L && f10 >= rectF.left - L && f10 <= rectF.right + L) {
                    if (f10 >= this.T.left - g0.L(4.0f)) {
                        return 5;
                    }
                    return 4;
                }
            }
        }
        return -1;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
        VelocityTracker velocityTracker = this.f18071v1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f18071v1 = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r70) {
        throw new UnsupportedOperationException("Method not decompiled: ji.r.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        String str;
        super.onSizeChanged(i7, i10, i11, i12);
        int c10 = (int) ((i7 - (c(i7) * 2.0f)) - g0.L(28.0f));
        if (c10 != this.f18053n0 && c10 > 0) {
            this.f18053n0 = c10;
            this.O0 = 0.0f;
            this.N0 = 0.0f;
            this.m0 = a(this.M, this.d);
            q();
        }
        this.f18031c1 = -1;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            StringBuilder sb2 = new StringBuilder("overlay bounds top=");
            sb2.append(getTop());
            sb2.append(" h=");
            sb2.append(i10);
            sb2.append(" parent h=");
            sb2.append(view.getHeight());
            if (getTop() == 0 && i10 == view.getHeight()) {
                str = " (full-screen ok)";
            } else {
                str = "  ← NOT full-screen: a strip stays unblurred";
            }
            p5.c.t(sb2, str, "VoiceLive");
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z10 = false;
        if (!this.f18056p0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i7 = -1;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return true;
                    }
                    this.l1 = -1;
                    this.f18069u1 = false;
                    this.f18067t1 = false;
                    invalidate();
                    return true;
                }
                int i10 = this.l1;
                int i11 = this.f18074w1;
                if (i10 >= 0) {
                    int o4 = o(x10, y10);
                    if (o4 < 0) {
                        o4 = n(x10, y10);
                    }
                    if (o4 != this.l1 && Math.hypot(x10 - this.f18059q1, y10 - this.f18062r1) > i11) {
                        this.l1 = -1;
                    }
                }
                if (this.f18067t1) {
                    this.f18071v1.addMovement(motionEvent);
                    if (!this.f18069u1 && Math.abs(y10 - this.f18062r1) > i11) {
                        this.f18069u1 = true;
                        this.U0 = false;
                        this.f18065s1 = y10;
                    }
                    if (this.f18069u1) {
                        this.C0 -= y10 - this.f18065s1;
                        this.f18065s1 = y10;
                    }
                }
                invalidate();
                return true;
            }
            int i12 = this.l1;
            this.l1 = -1;
            if (i12 >= 0) {
                int o10 = o(x10, y10);
                if (o10 < 0) {
                    o10 = n(x10, y10);
                }
                if (o10 == i12) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    post(new c1(this, i12, 15));
                }
            }
            if (this.f18067t1 && this.f18069u1 && (velocityTracker = this.f18071v1) != null) {
                velocityTracker.addMovement(motionEvent);
                this.f18071v1.computeCurrentVelocity(1);
                this.D0 = -this.f18071v1.getYVelocity();
            }
            this.f18069u1 = false;
            this.f18067t1 = false;
            invalidate();
            return true;
        }
        this.f18059q1 = x10;
        this.f18065s1 = y10;
        this.f18062r1 = y10;
        this.f18069u1 = false;
        boolean isEmpty = this.f18048k0.trim().isEmpty();
        int o11 = o(x10, y10);
        this.l1 = o11;
        if (o11 < 0) {
            if (!isEmpty) {
                i7 = n(x10, y10);
            }
            this.l1 = i7;
        }
        if (this.l1 < 0 && this.f18033d1.contains(x10, y10)) {
            z10 = true;
        }
        this.f18067t1 = z10;
        if (z10) {
            if (this.f18071v1 == null) {
                this.f18071v1 = VelocityTracker.obtain();
            }
            this.f18071v1.clear();
            this.f18071v1.addMovement(motionEvent);
            this.D0 = 0.0f;
        }
        invalidate();
        return true;
    }

    public final void q() {
        if (this.f18053n0 <= 0) {
            return;
        }
        if (this.f18048k0.isEmpty()) {
            this.f18050l0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.f18048k0);
        ArrayList arrayList = this.f18054o0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            q qVar = (q) obj;
            int i10 = qVar.f18019b;
            if (i10 > qVar.f18018a && i10 <= spannableString.length()) {
                spannableString.setSpan(new j2(qVar, 2), qVar.f18018a, qVar.f18019b, 65569);
            }
        }
        int i11 = this.f18080y1;
        if (i11 >= 0 && i11 < spannableString.length()) {
            spannableString.setSpan(new b(1), this.f18080y1, spannableString.length(), 33);
        }
        this.f18050l0 = a(spannableString, this.f18029c);
    }

    public final void r(String str) {
        if (str == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StaticLayout staticLayout = this.f18050l0;
        this.D1 = staticLayout;
        this.C1 = uptimeMillis;
        int i7 = 1;
        if (this.P0) {
            this.M0 = true;
        }
        float f10 = this.H0;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.I0 = f10 - this.C0;
        this.H0 = -1.0f;
        this.G0 = -1.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.U0 = true;
        this.D0 = 0.0f;
        this.K0 = true;
        if (staticLayout != null) {
            Random random = new Random();
            int i10 = X1;
            float f11 = 0.45f;
            float f12 = 0.5f;
            int[] iArr = {i10, i0.a.f(0.45f, i10, -1), i0.a.f(0.5f, X1, -10493697), -1};
            int i11 = 0;
            while (i11 < this.D1.getLineCount()) {
                float lineLeft = this.D1.getLineLeft(i11);
                float lineRight = this.D1.getLineRight(i11);
                float lineTop = this.D1.getLineTop(i11);
                float lineBottom = this.D1.getLineBottom(i11);
                float f13 = lineRight - lineLeft;
                float f14 = f11;
                float f15 = f12;
                int min = (int) Math.min(140.0f, f13 / g0.L(2.6f));
                int i12 = 0;
                while (i12 < min) {
                    float h = c0.h(random, f13, lineLeft);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.2f;
                    int i13 = i7;
                    float c10 = e2.c(h, Math.max(i7, this.f18053n0), 520.0f, (float) uptimeMillis);
                    long j3 = uptimeMillis;
                    float f16 = (-((random.nextFloat() * g0.L(34.0f)) + g0.L(10.0f))) / 1000.0f;
                    float h7 = c0.h(random, 380.0f, 480.0f);
                    float e10 = c0.e(0.75f, random.nextFloat(), g0.N(f14));
                    float[] fArr = new float[8];
                    fArr[0] = h;
                    fArr[i13] = (nextFloat * (lineBottom - lineTop)) + lineTop;
                    fArr[2] = ((random.nextFloat() - f15) * g0.L(36.0f)) / 1000.0f;
                    fArr[3] = f16;
                    fArr[4] = c10;
                    fArr[5] = h7;
                    fArr[6] = iArr[random.nextInt(4)];
                    fArr[7] = e10;
                    this.E1.add(fArr);
                    i12++;
                    i7 = i13;
                    uptimeMillis = j3;
                    random = random;
                }
                i11++;
                f12 = f15;
                f11 = f14;
            }
        }
        long j10 = uptimeMillis;
        this.f18048k0 = "";
        ArrayList arrayList = this.f18054o0;
        arrayList.clear();
        this.A1 = i7;
        setText(str);
        this.A1 = false;
        if (this.f18050l0 != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                q qVar = (q) obj;
                if (qVar.f18018a < this.f18048k0.length()) {
                    qVar.f18020c = j10 + (b((this.f18050l0.getPrimaryHorizontal(Math.max(qVar.f18018a, Math.min(qVar.f18019b, this.f18048k0.length()) - 1)) + g0.L(60.0f)) / f3.b(120.0f, this.f18053n0, 1)) * 520.0f) + 60;
                    qVar.d = 0.0f;
                }
            }
        }
        invalidate();
    }

    public final void s() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29 && (obj = this.f18032d0) != null) {
            a0.d(obj).discardDisplayList();
        }
        this.f18032d0 = null;
        this.f18035e0 = -1.0f;
    }

    public void setAccent(int i7) {
        this.f18044i0 = i7 | (-16777216);
    }

    public void setBusy(boolean z10) {
        if (this.f18082z1 == z10) {
            return;
        }
        this.f18082z1 = z10;
        this.B1 = SystemClock.uptimeMillis();
        if (!z10) {
            this.f18029c.setShader(null);
        }
        invalidate();
    }

    public void setEditMenuProgress(float f10) {
        this.Q1 = f10;
        invalidate();
    }

    public void setEditPillHidden(boolean z10) {
        this.P1 = z10;
        if (!z10) {
            this.Q1 = 0.0f;
            if (this.P0) {
                this.f18077x1 = null;
            }
            String str = this.f18077x1;
            if (str != null) {
                this.f18077x1 = null;
                setText(str);
            }
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2;
        float f10;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        this.O = charSequence2;
        if (this.f18079y0 < 0.01f) {
            if (charSequence2 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.P = f10;
            this.Q = 0.0f;
        }
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.W = z10;
        invalidate();
    }

    public void setLevel(float f10) {
        this.X0 = Math.max(0.0f, Math.min(1.0f, f10));
    }

    public void setListening(boolean z10) {
        this.Z0 = z10;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (str == null) {
            str = this.L;
        }
        if (str.equals(this.M)) {
            return;
        }
        this.M = str;
        if (this.f18053n0 > 0) {
            this.m0 = a(str, this.d);
        }
        invalidate();
    }

    public void setReview(boolean z10) {
        this.P0 = z10;
        invalidate();
    }

    public void setStyleIcon(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 instanceof p5) {
            ((p5) drawable2).n(this);
        }
        this.K = drawable;
        if (drawable instanceof p5) {
            ((p5) drawable).a(this);
        }
        invalidate();
    }

    public void setStyleLabel(String str) {
        invalidate();
    }

    public void setText(String str) {
        t(-1, str);
    }

    public final void t(int r21, java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: ji.r.t(int, java.lang.String):void");
    }
}
