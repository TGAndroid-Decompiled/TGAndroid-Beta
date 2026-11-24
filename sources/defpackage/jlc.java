package defpackage;

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
import java.util.ArrayList;
import java.util.Random;
public final class jlc extends View {
    public static int X1;
    public static int Y1;
    public static float Z1;
    public static long b2;
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
    public final glc a;
    public boolean a0;
    public float a1;
    public final ylb b;
    public Paint b0;
    public float b1;
    public final TextPaint c;
    public Object c0;
    public int c1;
    public final TextPaint d;
    public Object d0;
    public final RectF d1;
    public final TextPaint e;
    public float e0;
    public final RectF e1;
    public final Paint f;
    public long f0;
    public final RectF f1;
    public boolean g0;
    public final RectF g1;
    public final Paint h;
    public int h0;
    public final RectF h1;
    public int i0;
    public final RectF i1;
    public boolean j0;
    public float j1;
    public String k0;
    public float k1;
    public StaticLayout l0;
    public int l1;
    public StaticLayout m0;
    public final float[] m1;
    public final Paint n;
    public int n0;
    public final RectF n1;
    public final ArrayList o0;
    public float o1;
    public boolean p0;
    public Drawable p1;
    public boolean q0;
    public float q1;
    public int r;
    public long r0;
    public float r1;
    public final Paint s;
    public long s0;
    public float s1;
    public long t0;
    public boolean t1;
    public float u0;
    public boolean u1;
    public float v0;
    public VelocityTracker v1;
    public final Paint w;
    public float w0;
    public final int w1;
    public final Paint x;
    public float x0;
    public String x1;
    public final Paint y;
    public float y0;
    public int y1;
    public float z0;
    public boolean z1;
    public static final d53 U1 = new d53(0.4d, 0.0d, 0.2d, 1.0d);
    public static final d53 V1 = d53.h;
    public static final d53 W1 = new d53(0.4d, 0.0d, 1.0d, 1.0d);
    public static final OvershootInterpolator a2 = new OvershootInterpolator(1.3f);

    static {
        new d53(0.3d, 0.0d, 0.1d, 1.0d);
    }

    public jlc(Context context, ylb ylbVar, glc glcVar) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.e = textPaint3;
        this.f = new Paint();
        this.h = new Paint(1);
        this.n = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        this.w = new Paint(1);
        this.x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-603979776, -1073741824, Integer.MIN_VALUE, 939524096, 201326592, 0}, new float[]{0.0f, 0.18f, 0.42f, 0.66f, 0.86f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        String M0 = jb6.M0(2131744986, null);
        this.L = M0;
        this.M = M0;
        this.N = jb6.M0(2131744995, null);
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.e0 = -1.0f;
        this.i0 = -12939291;
        this.k0 = "";
        this.o0 = new ArrayList();
        this.A0 = true;
        this.G0 = -1.0f;
        this.H0 = -1.0f;
        this.J0 = -1.0f;
        this.Q0 = -1.0f;
        this.U0 = true;
        this.Z0 = true;
        this.a1 = 1.0f;
        this.c1 = -1;
        this.d1 = new RectF();
        this.e1 = new RectF();
        this.f1 = new RectF();
        this.g1 = new RectF();
        this.h1 = new RectF();
        this.i1 = new RectF();
        this.k1 = 1.0f;
        this.l1 = -1;
        this.m1 = new float[6];
        this.n1 = new RectF();
        this.y1 = -1;
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
        this.b = ylbVar;
        this.a = glcVar;
        this.w1 = ViewConfiguration.get(context).getScaledTouchSlop();
        textPaint.setTextSize(gm.L(21.0f));
        textPaint2.setTextSize(gm.L(21.0f));
        hg9.o(textPaint3, gm.L(14.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.N(0.66f));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.G = context.getResources().getDrawable(2131232122).mutate();
        this.H = b10.d(context, 2131232711);
        this.I = jb6.M0(2131751272, null);
        this.J = jb6.M0(2131744968, null);
        setVisibility(8);
    }

    public static float b(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static float c(int i) {
        return Math.max(gm.L(28.0f), (i - gm.L(560.0f)) / 2.0f);
    }

    public static float k(float f, float f2, float f3, float f4) {
        return td4.A(1.0f, (float) Math.exp((-f2) / f4), f3 - f, f);
    }

    public static String p(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isLetterOrDigit(charAt)) {
                sb.append(Character.toLowerCase(charAt));
            }
        }
        return sb.toString();
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, this.n0).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(gm.L(4.0f), 1.0f).setIncludePad(false).build();
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
        int i = 0;
        while (i < indexOfChild) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.01f && childAt.getWidth() > 0 && childAt.getHeight() > 0 && !(childAt instanceof SurfaceView)) {
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
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                canvas2.restoreToCount(save);
            } else {
                canvas2 = canvas;
            }
            i++;
            canvas = canvas2;
        }
        canvas.restore();
    }

    public final void e(Canvas canvas, RectF rectF, int i, float f) {
        i(canvas, this.I, rectF.left + gm.L(14.0f), rectF.centerY(), i, f);
        float centerY = rectF.centerY();
        float f2 = rectF.right;
        int L = gm.L(8.0f) + gm.L(1.0f);
        float L2 = f2 - (gm.L(10.0f) + (gm.L(14.0f) + L));
        Paint paint = this.w;
        paint.setColor(i);
        paint.setAlpha((int) (35.7f * f));
        canvas.drawRect(L2, centerY - gm.L(9.0f), gm.N(1.0f) + L2, centerY + gm.L(9.0f), paint);
        Path path = this.H1;
        if (path.isEmpty()) {
            path.moveTo(-gm.N(3.8f), gm.N(3.8f));
            path.lineTo(0.0f, 0.0f);
            path.lineTo(gm.N(3.8f), gm.N(3.8f));
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.I1;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gm.N(1.75f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setColor(i);
        float f3 = f * 255.0f;
        int i2 = (int) f3;
        paint2.setAlpha(i2);
        float L3 = L2 + gm.L(1.0f) + gm.L(8.0f) + gm.L(7.0f);
        if (this.z1) {
            float L4 = gm.L(6.5f);
            Paint paint3 = this.N1;
            paint3.setStyle(style);
            paint3.setStrokeWidth(gm.N(1.75f));
            paint3.setStrokeCap(cap);
            paint3.setColor(i);
            paint3.setAlpha((int) (f3 * 0.9f));
            RectF rectF2 = gm.P;
            rectF2.set(L3 - L4, centerY - L4, L3 + L4, centerY + L4);
            canvas.drawArc(rectF2, (((float) (SystemClock.uptimeMillis() % 900)) / 900.0f) * 360.0f, 270.0f, false, paint3);
        } else if (this.K != null) {
            int L5 = gm.L(20.0f);
            Drawable drawable = this.K;
            float f4 = L5 / 2.0f;
            drawable.setBounds((int) (L3 - f4), (int) (centerY - f4), (int) (L3 + f4), (int) (centerY + f4));
            this.K.setAlpha(i2);
            this.K.draw(canvas);
        } else {
            canvas.save();
            canvas.translate(L3, (centerY - gm.N(1.9f)) - gm.N(0.4f));
            canvas.drawPath(path, paint2);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, float f, float f2, float f3, float f4, boolean z, float f5) {
        Matrix matrix = this.F;
        matrix.reset();
        if (z) {
            matrix.setScale(1.0f, -(f4 - f2));
            matrix.postTranslate(0.0f, f4);
        } else {
            matrix.setScale(1.0f, f4 - f2);
            matrix.postTranslate(0.0f, f2);
        }
        this.E.setLocalMatrix(matrix);
        Paint paint = this.y;
        paint.setAlpha((int) (f5 * 255.0f));
        canvas.drawRect(f, f2, f3, f4, paint);
    }

    public final void g(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        canvas.save();
        float height = rectF.height() / 2.0f;
        boolean z = this.g0;
        RectF rectF2 = this.e1;
        int i = -16777216;
        Path path = this.L1;
        Paint paint = this.K1;
        Paint paint2 = this.n;
        if (z) {
            paint2.clearShadowLayer();
            if (this.d0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.R1 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.7f);
                    colorMatrix.postConcat(new ColorMatrix(new float[]{0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint3 = new Paint();
                    this.R1 = paint3;
                    paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
                this.R1.setAlpha((int) (f2 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f4 = 1.0f / f3;
                canvas.scale(f4, f4, rectF.centerX(), rectF.centerY());
                float f5 = 1.0f / this.T1;
                canvas.scale(f5, f5, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.j1);
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.R1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(qn0.c(this.d0));
                canvas.restoreToCount(saveLayer);
                canvas.restore();
            }
            paint2.setColor(cmb.p1(f2 * 0.55f, -14276047));
            canvas.drawRoundRect(rectF, height, height, paint2);
            paint.setShader(null);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setStrokeWidth(gm.N(0.66f));
            paint.setColor(cmb.p1(0.12f * f2, -1));
            RectF rectF3 = gm.P;
            rectF3.set(rectF);
            rectF3.inset(gm.N(0.33f), gm.N(0.33f));
            canvas.drawRoundRect(rectF3, height, height, paint);
            Paint paint4 = this.M1;
            paint4.setStyle(style);
            paint4.setStrokeWidth(gm.N(1.0f));
            int p1 = cmb.p1(0.19f * f2, -16777216);
            int i2 = 16777215 & p1;
            paint4.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, new int[]{p1, i2, i2, p1}, new float[]{0.0f, Math.min(0.45f, (height / rectF.width()) * 1.1f), Math.max(0.55f, 1.0f - ((height / rectF.width()) * 1.1f)), 1.0f}, Shader.TileMode.CLAMP));
            rectF3.set(rectF);
            rectF3.inset(-gm.N(0.5f), -gm.N(0.5f));
            canvas.drawRoundRect(rectF3, gm.N(0.5f) + height, gm.N(0.5f) + height, paint4);
        } else {
            paint2.clearShadowLayer();
            if (this.d0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.S1 == null) {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setSaturation(1.3f);
                    colorMatrix2.postConcat(new ColorMatrix(new float[]{1.04f, 0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 1.04f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, 1.04f, 0.0f, 14.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint5 = new Paint();
                    this.S1 = paint5;
                    paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                }
                this.S1.setAlpha((int) (f2 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f6 = 1.0f / f3;
                canvas.scale(f6, f6, rectF.centerX(), rectF.centerY());
                float f7 = 1.0f / this.T1;
                canvas.scale(f7, f7, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.j1);
                int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.S1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(qn0.c(this.d0));
                canvas.restoreToCount(saveLayer2);
                canvas.restore();
            }
            paint2.setColor(cmb.p1(0.62f * f2, -1));
            canvas.drawRoundRect(rectF, height, height, paint2);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(gm.N(1.0f));
            paint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, new int[]{cmb.p1(0.95f * f2, -1), cmb.p1(0.25f * f2, -1), cmb.p1(f2 * 0.55f, -1)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            RectF rectF4 = gm.P;
            rectF4.set(rectF);
            rectF4.inset(gm.N(0.5f), gm.N(0.5f));
            canvas.drawRoundRect(rectF4, height, height, paint);
            paint.setShader(null);
            paint.setStrokeWidth(gm.N(0.66f));
            paint.setColor(cmb.p1(0.07f * f2, -16777216));
            rectF4.set(rectF);
            rectF4.inset(-gm.N(0.33f), -gm.N(0.33f));
            canvas.drawRoundRect(rectF4, gm.N(0.33f) + height, gm.N(0.33f) + height, paint);
        }
        if (f > 0.01f) {
            if (this.g0) {
                i = -1;
            }
            Paint paint6 = this.w;
            paint6.setColor(i);
            paint6.setAlpha((int) (20.4f * f * f2));
            canvas.drawRoundRect(rectF, height, height, paint6);
        }
        canvas.restore();
    }

    public final void h(float f, float f2, float f3, int i, Canvas canvas, boolean z) {
        float[] fArr;
        float f4;
        int i2;
        char c;
        float f5;
        float b;
        float interpolation;
        int i3;
        float f6;
        Canvas canvas2;
        float f7;
        float f8;
        int i4 = 0;
        while (true) {
            fArr = this.m1;
            float f9 = 1.0f;
            if (i4 >= fArr.length) {
                break;
            }
            float f10 = fArr[i4];
            if (this.l1 == i4) {
                f8 = 40.0f;
            } else {
                f9 = 0.0f;
                f8 = 70.0f;
            }
            fArr[i4] = k(f10, f3, f9, f8);
            i4++;
        }
        float f11 = this.o1;
        if (this.K != null && !this.z1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        this.o1 = k(f11, f3, f4, 90.0f);
        String str = this.I;
        TextPaint textPaint = this.e;
        float measureText = textPaint.measureText(str);
        float measureText2 = textPaint.measureText(this.J);
        float c2 = c(i) - gm.L(2.0f);
        int L = gm.L(10.0f) + gm.L(14.0f) + gm.L(8.0f) + gm.L(1.0f);
        if (this.K != null) {
            i2 = gm.L(4.0f);
        } else {
            i2 = 0;
        }
        float f12 = L + i2;
        float L2 = gm.L(14.0f) + measureText + gm.L(12.0f);
        float f13 = this.O1;
        if (f13 > 0.0f) {
            L2 = k(f13, f3, L2, 110.0f);
        }
        this.O1 = L2;
        float f14 = f + f2;
        RectF rectF = this.h1;
        rectF.set(c2, f, L2 + c2, f14);
        float f15 = rectF.right;
        RectF rectF2 = this.i1;
        rectF2.set(f15, f, f12 + f15, f14);
        float f16 = rectF.left;
        float f17 = rectF2.right;
        RectF rectF3 = this.f1;
        rectF3.set(f16, f, f17, f14);
        RectF rectF4 = this.n1;
        rectF4.set(rectF3.right + gm.L(8.0f), f, rectF3.right + gm.L(8.0f) + f2, f14);
        float L3 = (((this.o1 * f2) + gm.L(8.0f)) * this.o1) + rectF3.right + gm.L(8.0f);
        RectF rectF5 = this.g1;
        rectF5.set(L3, f, measureText2 + L3 + gm.L(32.0f), f14);
        float f18 = rectF3.left;
        float f19 = rectF5.right;
        RectF rectF6 = this.e1;
        rectF6.set(f18, f, f19, f14);
        if (this.z0 > 0.001f) {
            if (z && this.S0 == 0) {
                this.S0 = SystemClock.uptimeMillis();
            }
            if (this.S0 == 0) {
                c = 0;
                f5 = 0.001f;
                b = 0.0f;
            } else {
                c = 0;
                f5 = 0.001f;
                b = b(((float) (SystemClock.uptimeMillis() - this.S0)) / 460.0f);
            }
            if (!this.p0) {
                interpolation = this.T0;
            } else {
                interpolation = a2.getInterpolation(b);
            }
            this.T0 = interpolation;
            if (interpolation <= f5) {
                return;
            }
            boolean z2 = this.p0;
            float f20 = this.z0;
            if (z2) {
                f20 = b(f20 * 1.6f);
            }
            float b3 = b(this.T0 * 1.8f) * f20;
            float R1 = gm.R1(0.6f, 1.0f, this.b1) * b3;
            canvas.save();
            canvas.translate(0.0f, this.j1);
            float R12 = gm.R1(0.6f, 1.0f, this.T0) * this.k1;
            canvas.scale(R12, R12, rectF6.left, rectF6.centerY());
            this.T1 = R12;
            if (this.g0) {
                i3 = -1;
            } else {
                i3 = this.h0;
            }
            int i5 = i3;
            float max = Math.max(fArr[c], fArr[2]);
            if (this.P1) {
                float b4 = b(1.0f - (this.Q1 / 0.35f));
                if (b4 > 0.01f) {
                    e(canvas, rectF3, i5, b4 * R1);
                }
                canvas2 = canvas;
                f6 = 2.0f;
                f7 = b3;
            } else {
                canvas.save();
                float f21 = 1.0f - (max * 0.05f);
                f6 = 2.0f;
                canvas.scale(f21, f21, rectF3.centerX(), rectF3.centerY());
                canvas2 = canvas;
                g(canvas2, rectF3, max, b3, f21);
                f7 = b3;
                e(canvas2, rectF3, i5, R1);
                canvas2.restore();
            }
            if (this.o1 > 0.01f) {
                canvas2.save();
                float R13 = gm.R1(0.6f, 1.0f, this.o1) * (1.0f - (fArr[3] * 0.05f));
                canvas2.scale(R13, R13, rectF4.centerX(), rectF4.centerY());
                g(canvas2, rectF4, fArr[3], f7 * this.o1, R13);
                Drawable drawable = this.p1;
                if (drawable == null) {
                    drawable = getContext().getResources().getDrawable(2131231004).mutate();
                    this.p1 = drawable;
                }
                drawable.setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
                this.p1.setAlpha((int) (255.0f * R1 * this.o1));
                float L4 = gm.L(22.0f) / f6;
                this.p1.setBounds((int) (rectF4.centerX() - L4), (int) (rectF4.centerY() - L4), (int) (rectF4.centerX() + L4), (int) (rectF4.centerY() + L4));
                this.p1.draw(canvas2);
                canvas2.restore();
            }
            canvas2.save();
            float f22 = 1.0f - (fArr[1] * 0.05f);
            canvas2.scale(f22, f22, rectF5.centerX(), rectF5.centerY());
            g(canvas2, rectF5, fArr[1], f7 * 1.0f, f22);
            i(canvas, this.J, gm.L(16.0f) + rectF5.left, rectF5.centerY(), i5, R1 * 1.0f);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void i(Canvas canvas, String str, float f, float f2, int i, float f3) {
        TextPaint textPaint = this.e;
        textPaint.setColor(i);
        textPaint.setAlpha((int) (f3 * 255.0f));
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, f, f2 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    public final void j(Canvas canvas, RectF rectF, int i, float f) {
        if (this.U == null) {
            this.U = getContext().getResources().getDrawable(2131232200).mutate();
            this.V = getContext().getResources().getDrawable(2131232366).mutate();
        }
        float centerY = rectF.centerY();
        Drawable drawable = this.U;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
        int i2 = (int) (255.0f * f);
        this.U.setAlpha(i2);
        int L = (int) (rectF.left + gm.L(10.0f));
        int L2 = (int) (centerY - gm.L(10.0f));
        this.U.setBounds(L, L2, gm.L(20.0f) + L, gm.L(20.0f) + L2);
        this.U.draw(canvas);
        float L3 = (((rectF.right - gm.L(9.0f)) - gm.L(20.0f)) - gm.L(8.0f)) - gm.L(1.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L3 - gm.L(4.0f), rectF.bottom);
        String str = this.O;
        if (str == null) {
            str = this.N;
        }
        i(canvas, str, rectF.left + gm.L(10.0f) + gm.L(20.0f) + gm.L(6.0f), centerY, i, gm.R1(0.5f, 1.0f, this.P) * f);
        canvas.restore();
        Paint paint = this.w;
        paint.setColor(i);
        paint.setAlpha((int) (35.7f * f));
        canvas.drawRect(L3, centerY - gm.L(9.0f), gm.N(1.0f) + L3, centerY + gm.L(9.0f), paint);
        this.V.setColorFilter(new PorterDuffColorFilter(i, mode));
        this.V.setAlpha(i2);
        int L4 = (int) ((rectF.right - gm.L(9.0f)) - gm.L(10.0f));
        int i3 = (int) centerY;
        this.V.setBounds(L4 - gm.L(10.0f), i3 - gm.L(10.0f), gm.L(10.0f) + L4, gm.L(10.0f) + i3);
        this.V.draw(canvas);
    }

    public final void l(RectF rectF) {
        float f = this.T1;
        RectF rectF2 = this.e1;
        float centerY = rectF2.centerY();
        float f2 = rectF2.left;
        RectF rectF3 = this.f1;
        float A = td4.A(rectF3.left, f2, f, f2);
        float A2 = td4.A(rectF3.top, centerY, f, centerY);
        float f3 = this.j1;
        rectF.set(A, A2 + f3, td4.A(rectF3.right, f2, f, f2), ((rectF3.bottom - centerY) * f) + centerY + f3);
    }

    public final void m() {
        jlc jlcVar;
        if (!this.p0) {
            if (getVisibility() != 0 && (jlcVar = this.a.h) != null) {
                gm.B2(jlcVar);
                Log.d("VoiceLive", "overlay removed");
                return;
            }
            return;
        }
        this.p0 = false;
        this.q0 = false;
        this.s0 = SystemClock.uptimeMillis();
        this.u0 = this.x0;
        this.v0 = this.y0;
        this.w0 = this.z0;
        this.l1 = -1;
        invalidate();
    }

    public final int n(float f, float f2) {
        float f3;
        float f4 = 0.7f;
        if (this.z0 >= 0.7f && this.T0 >= 0.7f) {
            float L = gm.L(4.0f);
            float f5 = f2 - this.j1;
            int i = 0;
            RectF[] rectFArr = {this.h1, this.g1, this.i1, this.n1};
            while (i < 4) {
                if (i != 3 || this.o1 >= f4) {
                    RectF rectF = rectFArr[i];
                    RectF rectF2 = this.e1;
                    float f6 = rectF2.left;
                    float f7 = this.k1;
                    float f8 = ((rectF.left - f6) * f7) + f6;
                    float A = td4.A(rectF.right, f6, f7, f6);
                    float centerY = ((rectF.top - rectF2.centerY()) * this.k1) + rectF2.centerY();
                    float centerY2 = ((rectF.bottom - rectF2.centerY()) * this.k1) + rectF2.centerY();
                    float f9 = 0.0f;
                    if (i == 2) {
                        f3 = 0.0f;
                    } else {
                        f3 = L;
                    }
                    if (f < f8 - f3) {
                        continue;
                    } else {
                        if (i != 0) {
                            f9 = L;
                        }
                        if (f <= A + f9 && f5 >= centerY - L && f5 <= centerY2 + L) {
                            return i;
                        }
                    }
                }
                i++;
                f4 = 0.7f;
            }
        }
        return -1;
    }

    public final int o(float f, float f2) {
        if (this.y0 >= 0.7f) {
            RectF rectF = this.R;
            if (!rectF.isEmpty() && !this.W) {
                float L = gm.L(4.0f);
                if (f2 >= rectF.top - L && f2 <= rectF.bottom + L && f >= rectF.left - L && f <= rectF.right + L) {
                    if (f >= this.T.left - gm.L(4.0f)) {
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
        VelocityTracker velocityTracker = this.v1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.v1 = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r70) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlc.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        String str;
        super.onSizeChanged(i, i2, i3, i4);
        int c = (int) ((i - (c(i) * 2.0f)) - gm.L(28.0f));
        if (c != this.n0 && c > 0) {
            this.n0 = c;
            this.O0 = 0.0f;
            this.N0 = 0.0f;
            this.m0 = a(this.M, this.d);
            q();
        }
        this.c1 = -1;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            StringBuilder sb = new StringBuilder("overlay bounds top=");
            sb.append(getTop());
            sb.append(" h=");
            sb.append(i2);
            sb.append(" parent h=");
            sb.append(view.getHeight());
            if (getTop() == 0 && i2 == view.getHeight()) {
                str = " (full-screen ok)";
            } else {
                str = "  ← NOT full-screen: a strip stays unblurred";
            }
            ts2.w(sb, str, "VoiceLive");
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z = false;
        if (!this.p0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i = -1;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return true;
                    }
                    this.l1 = -1;
                    this.u1 = false;
                    this.t1 = false;
                    invalidate();
                    return true;
                }
                int i2 = this.l1;
                int i3 = this.w1;
                if (i2 >= 0) {
                    int o = o(x, y);
                    if (o < 0) {
                        o = n(x, y);
                    }
                    if (o != this.l1 && Math.hypot(x - this.q1, y - this.r1) > i3) {
                        this.l1 = -1;
                    }
                }
                if (this.t1) {
                    this.v1.addMovement(motionEvent);
                    if (!this.u1 && Math.abs(y - this.r1) > i3) {
                        this.u1 = true;
                        this.U0 = false;
                        this.s1 = y;
                    }
                    if (this.u1) {
                        this.C0 -= y - this.s1;
                        this.s1 = y;
                    }
                }
                invalidate();
                return true;
            }
            int i4 = this.l1;
            this.l1 = -1;
            if (i4 >= 0) {
                int o2 = o(x, y);
                if (o2 < 0) {
                    o2 = n(x, y);
                }
                if (o2 == i4) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    post(new ge7(this, i4, (byte) 26));
                }
            }
            if (this.t1 && this.u1 && (velocityTracker = this.v1) != null) {
                velocityTracker.addMovement(motionEvent);
                this.v1.computeCurrentVelocity(1);
                this.D0 = -this.v1.getYVelocity();
            }
            this.u1 = false;
            this.t1 = false;
            invalidate();
            return true;
        }
        this.q1 = x;
        this.s1 = y;
        this.r1 = y;
        this.u1 = false;
        boolean isEmpty = this.k0.trim().isEmpty();
        int o3 = o(x, y);
        this.l1 = o3;
        if (o3 < 0) {
            if (!isEmpty) {
                i = n(x, y);
            }
            this.l1 = i;
            o3 = i;
        }
        if (o3 < 0 && this.d1.contains(x, y)) {
            z = true;
        }
        this.t1 = z;
        if (z) {
            VelocityTracker velocityTracker2 = this.v1;
            if (velocityTracker2 == null) {
                velocityTracker2 = VelocityTracker.obtain();
                this.v1 = velocityTracker2;
            }
            velocityTracker2.clear();
            this.v1.addMovement(motionEvent);
            this.D0 = 0.0f;
        }
        invalidate();
        return true;
    }

    public final void q() {
        if (this.n0 <= 0) {
            return;
        }
        if (this.k0.isEmpty()) {
            this.l0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.k0);
        ArrayList arrayList = this.o0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ilc ilcVar = (ilc) obj;
            int i2 = ilcVar.b;
            if (i2 > ilcVar.a && i2 <= spannableString.length()) {
                spannableString.setSpan(new zo3(ilcVar, (byte) 2), ilcVar.a, ilcVar.b, 65569);
            }
        }
        int i3 = this.y1;
        if (i3 >= 0 && i3 < spannableString.length()) {
            spannableString.setSpan(new vkc((byte) 1), this.y1, spannableString.length(), 33);
        }
        this.l0 = a(spannableString, this.c);
    }

    public final void r(String str) {
        if (str == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StaticLayout staticLayout = this.l0;
        this.D1 = staticLayout;
        this.C1 = uptimeMillis;
        int i = 1;
        if (this.P0) {
            this.M0 = true;
        }
        float f = this.H0;
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.I0 = f - this.C0;
        this.H0 = -1.0f;
        this.G0 = -1.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.U0 = true;
        this.D0 = 0.0f;
        this.K0 = true;
        if (staticLayout != null) {
            Random random = new Random();
            int i2 = X1;
            float f2 = 0.45f;
            float f3 = 0.5f;
            int[] iArr = {i2, on2.f(0.45f, i2, -1), on2.f(0.5f, X1, -10493697), -1};
            int i3 = 0;
            while (i3 < this.D1.getLineCount()) {
                float lineLeft = this.D1.getLineLeft(i3);
                float lineRight = this.D1.getLineRight(i3);
                float lineTop = this.D1.getLineTop(i3);
                float lineBottom = this.D1.getLineBottom(i3);
                float f4 = lineRight - lineLeft;
                float f5 = f2;
                float f6 = f3;
                int min = (int) Math.min(140.0f, f4 / gm.L(2.6f));
                int i4 = 0;
                while (i4 < min) {
                    float e = wi8.e(random, f4, lineLeft);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.2f;
                    int i5 = i;
                    float A = b10.A(e, Math.max(i, this.n0), 520.0f, (float) uptimeMillis);
                    long j = uptimeMillis;
                    float f7 = (-((random.nextFloat() * gm.L(34.0f)) + gm.L(10.0f))) / 1000.0f;
                    float e2 = wi8.e(random, 380.0f, 480.0f);
                    float e3 = aq1.e(0.75f, random.nextFloat(), gm.N(f5));
                    float[] fArr = new float[8];
                    fArr[0] = e;
                    fArr[i5] = (nextFloat * (lineBottom - lineTop)) + lineTop;
                    fArr[2] = ((random.nextFloat() - f6) * gm.L(36.0f)) / 1000.0f;
                    fArr[3] = f7;
                    fArr[4] = A;
                    fArr[5] = e2;
                    fArr[6] = iArr[random.nextInt(4)];
                    fArr[7] = e3;
                    this.E1.add(fArr);
                    i4++;
                    i = i5;
                    uptimeMillis = j;
                    random = random;
                }
                i3++;
                f3 = f6;
                f2 = f5;
            }
        }
        long j2 = uptimeMillis;
        this.k0 = "";
        ArrayList arrayList = this.o0;
        arrayList.clear();
        this.A1 = i;
        setText(str);
        this.A1 = false;
        if (this.l0 != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList.get(i6);
                i6++;
                ilc ilcVar = (ilc) obj;
                if (ilcVar.a < this.k0.length()) {
                    ilcVar.c = j2 + (b((this.l0.getPrimaryHorizontal(Math.max(ilcVar.a, Math.min(ilcVar.b, this.k0.length()) - 1)) + gm.L(60.0f)) / kt6.e(120.0f, this.n0, 1)) * 520.0f) + 60;
                    ilcVar.d = 0.0f;
                }
            }
        }
        invalidate();
    }

    public final void s() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29 && (obj = this.d0) != null) {
            qn0.c(obj).discardDisplayList();
        }
        this.d0 = null;
        this.e0 = -1.0f;
    }

    public void setAccent(int i) {
        this.i0 = i | (-16777216);
    }

    public void setBusy(boolean z) {
        if (this.z1 == z) {
            return;
        }
        this.z1 = z;
        this.B1 = SystemClock.uptimeMillis();
        if (!z) {
            this.c.setShader(null);
        }
        invalidate();
    }

    public void setEditMenuProgress(float f) {
        this.Q1 = f;
        invalidate();
    }

    public void setEditPillHidden(boolean z) {
        this.P1 = z;
        if (!z) {
            this.Q1 = 0.0f;
            if (this.P0) {
                this.x1 = null;
            }
            String str = this.x1;
            if (str != null) {
                this.x1 = null;
                setText(str);
            }
        }
        invalidate();
    }

    public void setLanguage(CharSequence charSequence) {
        String charSequence2;
        float f;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        this.O = charSequence2;
        if (this.y0 < 0.01f) {
            if (charSequence2 != null) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.P = f;
            this.Q = 0.0f;
        }
        invalidate();
    }

    public void setLanguagePillHidden(boolean z) {
        this.W = z;
        invalidate();
    }

    public void setLevel(float f) {
        this.X0 = Math.max(0.0f, Math.min(1.0f, f));
    }

    public void setListening(boolean z) {
        this.Z0 = z;
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
        if (this.n0 > 0) {
            this.m0 = a(str, this.d);
        }
        invalidate();
    }

    public void setReview(boolean z) {
        this.P0 = z;
        invalidate();
    }

    public void setStyleIcon(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 instanceof vm) {
            ((vm) drawable2).o(this);
        }
        this.K = drawable;
        if (drawable instanceof vm) {
            ((vm) drawable).b(this);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlc.t(int, java.lang.String):void");
    }
}
