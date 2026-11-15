package ji;

import ai.f2;
import ai.v0;
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
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
public final class p extends View {
    public static int V1;
    public static int W1;
    public static float X1;
    public static long Z1;
    public float A0;
    public long A1;
    public float B0;
    public StaticLayout B1;
    public float C0;
    public final ArrayList C1;
    public float D0;
    public final Paint D1;
    public final LinearGradient E;
    public float E0;
    public final Paint E1;
    public final Matrix F;
    public float F0;
    public final Path F1;
    public final Drawable G;
    public float G0;
    public final Paint G1;
    public final Drawable H;
    public float H0;
    public final RectF H1;
    public final String I;
    public boolean I0;
    public final Paint I1;
    public final String J;
    public boolean J0;
    public final Path J1;
    public Drawable K;
    public boolean K0;
    public final Paint K1;
    public String L;
    public float L0;
    public final Paint L1;
    public String M;
    public float M0;
    public float M1;
    public float N;
    public boolean N0;
    public boolean N1;
    public float O;
    public float O0;
    public float O1;
    public final RectF P;
    public long P0;
    public Paint P1;
    public final RectF Q;
    public long Q0;
    public Paint Q1;
    public final RectF R;
    public float R0;
    public float R1;
    public Drawable S;
    public boolean S0;
    public Drawable T;
    public float T0;
    public boolean U;
    public float U0;
    public boolean V;
    public float V0;
    public Paint W;
    public float W0;
    public boolean X0;
    public float Y0;
    public float Z0;
    public final m f17597a;
    public Object f17598a0;
    public int f17599a1;
    public final e6 f17600b;
    public Object f17601b0;
    public final RectF f17602b1;
    public final TextPaint f17603c;
    public float f17604c0;
    public final RectF f17605c1;
    public final TextPaint d;
    public long f17606d0;
    public final RectF f17607d1;
    public final TextPaint f17608e;
    public boolean f17609e0;
    public final RectF f17610e1;
    public final Paint f17611f;
    public int f17612f0;
    public final RectF f17613f1;
    public int f17614g0;
    public final RectF f17615g1;
    public final Paint h;
    public boolean f17616h0;
    public float f17617h1;
    public String f17618i0;
    public float f17619i1;
    public StaticLayout f17620j0;
    public int f17621j1;
    public StaticLayout f17622k0;
    public final float[] f17623k1;
    public int f17624l0;
    public final RectF l1;
    public final ArrayList m0;
    public float f17625m1;
    public final Paint f17626n;
    public boolean f17627n0;
    public Drawable n1;
    public boolean f17628o0;
    public float f17629o1;
    public long f17630p0;
    public float f17631p1;
    public long f17632q0;
    public float f17633q1;
    public int f17634r;
    public long f17635r0;
    public boolean f17636r1;
    public final Paint f17637s;
    public float f17638s0;
    public boolean f17639s1;
    public float f17640t0;
    public VelocityTracker f17641t1;
    public float f17642u0;
    public final int f17643u1;
    public float f17644v0;
    public String f17645v1;
    public final Paint f17646w;
    public float f17647w0;
    public int f17648w1;
    public final Paint f17649x;
    public float f17650x0;
    public boolean f17651x1;
    public final Paint f17652y;
    public boolean f17653y0;
    public boolean f17654y1;
    public float f17655z0;
    public long f17656z1;
    public static final er S1 = new er(0.4d, 0.0d, 0.2d, 1.0d);
    public static final er T1 = er.h;
    public static final er U1 = new er(0.4d, 0.0d, 1.0d, 1.0d);
    public static final OvershootInterpolator Y1 = new OvershootInterpolator(1.3f);

    static {
        new er(0.3d, 0.0d, 0.1d, 1.0d);
    }

    public p(Context context, e6 e6Var, m mVar) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f17603c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f17608e = textPaint3;
        this.f17611f = new Paint();
        this.h = new Paint(1);
        this.f17626n = new Paint(1);
        Paint paint = new Paint(1);
        this.f17637s = paint;
        this.f17646w = new Paint(1);
        this.f17649x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f17652y = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-603979776, -1073741824, Integer.MIN_VALUE, 939524096, 201326592, 0}, new float[]{0.0f, 0.18f, 0.42f, 0.66f, 0.86f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        this.L = "Listening…";
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        new Matrix();
        this.f17604c0 = -1.0f;
        this.f17614g0 = -12939291;
        this.f17618i0 = "";
        this.m0 = new ArrayList();
        this.f17653y0 = true;
        this.E0 = -1.0f;
        this.F0 = -1.0f;
        this.H0 = -1.0f;
        this.O0 = -1.0f;
        this.S0 = true;
        this.X0 = true;
        this.Y0 = 1.0f;
        this.f17599a1 = -1;
        this.f17602b1 = new RectF();
        this.f17605c1 = new RectF();
        this.f17607d1 = new RectF();
        this.f17610e1 = new RectF();
        this.f17613f1 = new RectF();
        this.f17615g1 = new RectF();
        this.f17619i1 = 1.0f;
        this.f17621j1 = -1;
        this.f17623k1 = new float[6];
        this.l1 = new RectF();
        this.f17648w1 = -1;
        new RectF();
        this.C1 = new ArrayList();
        this.D1 = new Paint(1);
        this.E1 = new Paint();
        this.F1 = new Path();
        this.G1 = new Paint(1);
        this.H1 = new RectF();
        this.I1 = new Paint(1);
        new Paint(1);
        this.J1 = new Path();
        this.K1 = new Paint(1);
        this.L1 = new Paint(1);
        this.R1 = 1.0f;
        this.f17600b = e6Var;
        this.f17597a = mVar;
        this.f17643u1 = ViewConfiguration.get(context).getScaledTouchSlop();
        textPaint.setTextSize(g0.L(21.0f));
        textPaint2.setTextSize(g0.L(21.0f));
        textPaint3.setTextSize(g0.L(14.0f));
        textPaint3.setTypeface(g0.o());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(g0.N(0.66f));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.G = context.getResources().getDrawable(2131232117).mutate();
        this.H = i5.c.g(context, 2131232695);
        this.I = hd.M0(2131751335, null);
        this.J = "Send as text";
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
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, this.f17624l0).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(g0.L(4.0f), 1.0f).setIncludePad(false).build();
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
        Paint paint = this.f17646w;
        paint.setColor(i7);
        paint.setAlpha((int) (35.7f * f10));
        canvas.drawRect(L3, centerY - g0.L(9.0f), g0.N(1.0f) + L3, centerY + g0.L(9.0f), paint);
        Path path = this.F1;
        if (path.isEmpty()) {
            path.moveTo(-g0.N(3.8f), g0.N(3.8f));
            path.lineTo(0.0f, 0.0f);
            path.lineTo(g0.N(3.8f), g0.N(3.8f));
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint2 = this.G1;
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
        if (this.f17651x1) {
            float L5 = g0.L(6.5f);
            Paint paint3 = this.L1;
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
        Paint paint = this.f17652y;
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawRect(f10, f11, f12, f13, paint);
    }

    public final void g(Canvas canvas, RectF rectF, float f10, float f11, float f12) {
        canvas.save();
        float height = rectF.height() / 2.0f;
        boolean z10 = this.f17609e0;
        RectF rectF2 = this.f17605c1;
        int i7 = -16777216;
        Path path = this.J1;
        Paint paint = this.f17626n;
        Paint paint2 = this.I1;
        if (z10) {
            paint.clearShadowLayer();
            if (this.f17601b0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.P1 == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(1.7f);
                    colorMatrix.postConcat(new ColorMatrix(new float[]{0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint3 = new Paint();
                    this.P1 = paint3;
                    paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                }
                this.P1.setAlpha((int) (f11 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f13 = 1.0f / f12;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                float f14 = 1.0f / this.R1;
                canvas.scale(f14, f14, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.f17617h1);
                int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.P1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(a0.d(this.f17601b0));
                canvas.restoreToCount(saveLayer);
                canvas.restore();
            }
            paint.setColor(j6.r1(f11 * 0.55f, -14276047));
            canvas.drawRoundRect(rectF, height, height, paint);
            paint2.setShader(null);
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setStrokeWidth(g0.N(0.66f));
            paint2.setColor(j6.r1(0.12f * f11, -1));
            RectF rectF3 = g0.P;
            rectF3.set(rectF);
            rectF3.inset(g0.N(0.33f), g0.N(0.33f));
            canvas.drawRoundRect(rectF3, height, height, paint2);
            Paint paint4 = this.K1;
            paint4.setStyle(style);
            paint4.setStrokeWidth(g0.N(1.0f));
            int r12 = j6.r1(0.19f * f11, -16777216);
            int i10 = 16777215 & r12;
            paint4.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, new int[]{r12, i10, i10, r12}, new float[]{0.0f, Math.min(0.45f, (height / rectF.width()) * 1.1f), Math.max(0.55f, 1.0f - ((height / rectF.width()) * 1.1f)), 1.0f}, Shader.TileMode.CLAMP));
            rectF3.set(rectF);
            rectF3.inset(-g0.N(0.5f), -g0.N(0.5f));
            canvas.drawRoundRect(rectF3, g0.N(0.5f) + height, g0.N(0.5f) + height, paint4);
        } else {
            paint.clearShadowLayer();
            if (this.f17601b0 != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
                if (this.Q1 == null) {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setSaturation(1.3f);
                    colorMatrix2.postConcat(new ColorMatrix(new float[]{1.04f, 0.0f, 0.0f, 0.0f, 14.0f, 0.0f, 1.04f, 0.0f, 0.0f, 14.0f, 0.0f, 0.0f, 1.04f, 0.0f, 14.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    Paint paint5 = new Paint();
                    this.Q1 = paint5;
                    paint5.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                }
                this.Q1.setAlpha((int) (f11 * 255.0f));
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, height, height, Path.Direction.CW);
                canvas.clipPath(path);
                float f15 = 1.0f / f12;
                canvas.scale(f15, f15, rectF.centerX(), rectF.centerY());
                float f16 = 1.0f / this.R1;
                canvas.scale(f16, f16, rectF2.left, rectF2.centerY());
                canvas.translate(0.0f, -this.f17617h1);
                int saveLayer2 = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), this.Q1);
                canvas.scale(4.0f, 4.0f);
                canvas.drawRenderNode(a0.d(this.f17601b0));
                canvas.restoreToCount(saveLayer2);
                canvas.restore();
            }
            paint.setColor(j6.r1(0.62f * f11, -1));
            canvas.drawRoundRect(rectF, height, height, paint);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(g0.N(1.0f));
            paint2.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, new int[]{j6.r1(0.95f * f11, -1), j6.r1(0.25f * f11, -1), j6.r1(f11 * 0.55f, -1)}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            RectF rectF4 = g0.P;
            rectF4.set(rectF);
            rectF4.inset(g0.N(0.5f), g0.N(0.5f));
            canvas.drawRoundRect(rectF4, height, height, paint2);
            paint2.setShader(null);
            paint2.setStrokeWidth(g0.N(0.66f));
            paint2.setColor(j6.r1(0.07f * f11, -16777216));
            rectF4.set(rectF);
            rectF4.inset(-g0.N(0.33f), -g0.N(0.33f));
            canvas.drawRoundRect(rectF4, g0.N(0.33f) + height, g0.N(0.33f) + height, paint2);
        }
        if (f10 > 0.01f) {
            if (this.f17609e0) {
                i7 = -1;
            }
            Paint paint6 = this.f17646w;
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
            fArr = this.f17623k1;
            float f19 = 0.0f;
            if (i12 >= fArr.length) {
                break;
            }
            float f20 = fArr[i12];
            int i13 = this.f17621j1;
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
        float f21 = this.f17625m1;
        if (this.K != null && !this.f17651x1) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        this.f17625m1 = k(f21, f12, f13, 90.0f);
        String str = this.I;
        TextPaint textPaint = this.f17608e;
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
        float f23 = this.M1;
        if (f23 > 0.0f) {
            L2 = k(f23, f12, L2, 110.0f);
        }
        this.M1 = L2;
        float f24 = f10 + f11;
        RectF rectF = this.f17613f1;
        rectF.set(c11, f10, L2 + c11, f24);
        float f25 = rectF.right;
        RectF rectF2 = this.f17615g1;
        rectF2.set(f25, f10, f22 + f25, f24);
        float f26 = rectF.left;
        float f27 = rectF2.right;
        RectF rectF3 = this.f17607d1;
        rectF3.set(f26, f10, f27, f24);
        RectF rectF4 = this.l1;
        rectF4.set(rectF3.right + g0.L(8.0f), f10, rectF3.right + g0.L(8.0f) + f11, f24);
        float L3 = (((this.f17625m1 * f11) + g0.L(8.0f)) * this.f17625m1) + rectF3.right + g0.L(8.0f);
        RectF rectF5 = this.f17610e1;
        rectF5.set(L3, f10, measureText2 + L3 + g0.L(32.0f), f24);
        float f28 = rectF3.left;
        float f29 = rectF5.right;
        RectF rectF6 = this.f17605c1;
        rectF6.set(f28, f10, f29, f24);
        if (this.f17650x0 > 0.001f) {
            if (z10 && this.Q0 == 0) {
                this.Q0 = SystemClock.uptimeMillis();
            }
            if (this.Q0 == 0) {
                c10 = 0;
                f14 = 0.001f;
                b10 = 0.0f;
            } else {
                c10 = 0;
                f14 = 0.001f;
                b10 = b(((float) (SystemClock.uptimeMillis() - this.Q0)) / 460.0f);
            }
            if (!this.f17627n0) {
                interpolation = this.R0;
            } else {
                interpolation = Y1.getInterpolation(b10);
            }
            this.R0 = interpolation;
            if (interpolation <= f14) {
                return;
            }
            if (this.f17627n0) {
                f15 = b(this.f17650x0 * 1.6f);
            } else {
                f15 = this.f17650x0;
            }
            float b11 = b(this.R0 * 1.8f) * f15;
            float T12 = g0.T1(0.6f, 1.0f, this.Z0) * b11;
            canvas.save();
            canvas.translate(0.0f, this.f17617h1);
            float T13 = g0.T1(0.6f, 1.0f, this.R0) * this.f17619i1;
            canvas.scale(T13, T13, rectF6.left, rectF6.centerY());
            this.R1 = T13;
            if (this.f17609e0) {
                i11 = -1;
            } else {
                i11 = this.f17612f0;
            }
            int i14 = i11;
            float max = Math.max(fArr[c10], fArr[2]);
            if (this.N1) {
                float b12 = b(1.0f - (this.O1 / 0.35f));
                if (b12 > 0.01f) {
                    e(canvas, rectF3, i14, b12 * T12);
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
                e(canvas2, rectF3, i14, T12);
                canvas2.restore();
            }
            if (this.f17625m1 > 0.01f) {
                canvas2.save();
                float T14 = g0.T1(0.6f, 1.0f, this.f17625m1) * (1.0f - (fArr[3] * 0.05f));
                canvas2.scale(T14, T14, rectF4.centerX(), rectF4.centerY());
                g(canvas2, rectF4, fArr[3], f17 * this.f17625m1, T14);
                if (this.n1 == null) {
                    this.n1 = getContext().getResources().getDrawable(2131231001).mutate();
                }
                this.n1.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
                this.n1.setAlpha((int) (255.0f * T12 * this.f17625m1));
                float L4 = g0.L(22.0f) / f16;
                this.n1.setBounds((int) (rectF4.centerX() - L4), (int) (rectF4.centerY() - L4), (int) (rectF4.centerX() + L4), (int) (rectF4.centerY() + L4));
                this.n1.draw(canvas2);
                canvas2.restore();
            }
            canvas2.save();
            float f31 = 1.0f - (fArr[1] * 0.05f);
            canvas2.scale(f31, f31, rectF5.centerX(), rectF5.centerY());
            g(canvas2, rectF5, fArr[1], f17 * 1.0f, f31);
            i(canvas, this.J, g0.L(16.0f) + rectF5.left, rectF5.centerY(), i14, T12 * 1.0f);
            canvas.restore();
            canvas.restore();
        }
    }

    public final void i(Canvas canvas, String str, float f10, float f11, int i7, float f12) {
        TextPaint textPaint = this.f17608e;
        textPaint.setColor(i7);
        textPaint.setAlpha((int) (f12 * 255.0f));
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas.drawText(str, f10, f11 - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), textPaint);
    }

    public final void j(Canvas canvas, RectF rectF, int i7, float f10) {
        if (this.S == null) {
            this.S = getContext().getResources().getDrawable(2131232195).mutate();
            this.T = getContext().getResources().getDrawable(2131232361).mutate();
        }
        float centerY = rectF.centerY();
        Drawable drawable = this.S;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(i7, mode));
        int i10 = (int) (255.0f * f10);
        this.S.setAlpha(i10);
        int L = (int) (rectF.left + g0.L(10.0f));
        int L2 = (int) (centerY - g0.L(10.0f));
        this.S.setBounds(L, L2, g0.L(20.0f) + L, g0.L(20.0f) + L2);
        this.S.draw(canvas);
        float L3 = (((rectF.right - g0.L(9.0f)) - g0.L(20.0f)) - g0.L(8.0f)) - g0.L(1.0f);
        canvas.save();
        canvas.clipRect(rectF.left, rectF.top, L3 - g0.L(4.0f), rectF.bottom);
        String str = this.M;
        if (str == null) {
            str = "Detecting…";
        }
        i(canvas, str, rectF.left + g0.L(10.0f) + g0.L(20.0f) + g0.L(6.0f), centerY, i7, g0.T1(0.5f, 1.0f, this.N) * f10);
        canvas.restore();
        Paint paint = this.f17646w;
        paint.setColor(i7);
        paint.setAlpha((int) (35.7f * f10));
        canvas.drawRect(L3, centerY - g0.L(9.0f), g0.N(1.0f) + L3, centerY + g0.L(9.0f), paint);
        this.T.setColorFilter(new PorterDuffColorFilter(i7, mode));
        this.T.setAlpha(i10);
        int L4 = (int) ((rectF.right - g0.L(9.0f)) - g0.L(10.0f));
        int i11 = (int) centerY;
        this.T.setBounds(L4 - g0.L(10.0f), i11 - g0.L(10.0f), g0.L(10.0f) + L4, g0.L(10.0f) + i11);
        this.T.draw(canvas);
    }

    public final void l(RectF rectF) {
        float f10 = this.R1;
        RectF rectF2 = this.f17605c1;
        float centerY = rectF2.centerY();
        float f11 = rectF2.left;
        RectF rectF3 = this.f17607d1;
        float z10 = e2.z(rectF3.left, f11, f10, f11);
        float z11 = e2.z(rectF3.top, centerY, f10, centerY);
        float f12 = this.f17617h1;
        rectF.set(z10, z11 + f12, e2.z(rectF3.right, f11, f10, f11), ((rectF3.bottom - centerY) * f10) + centerY + f12);
    }

    public final void m() {
        p pVar;
        if (!this.f17627n0) {
            if (getVisibility() != 0 && (pVar = this.f17597a.h) != null) {
                g0.E2(pVar);
                Log.d("VoiceLive", "overlay removed");
                return;
            }
            return;
        }
        this.f17627n0 = false;
        this.f17628o0 = false;
        this.f17632q0 = SystemClock.uptimeMillis();
        this.f17638s0 = this.f17644v0;
        this.f17640t0 = this.f17647w0;
        this.f17642u0 = this.f17650x0;
        this.f17621j1 = -1;
        invalidate();
    }

    public final int n(float f10, float f11) {
        float f12;
        float f13 = 0.7f;
        if (this.f17650x0 >= 0.7f && this.R0 >= 0.7f) {
            float L = g0.L(4.0f);
            float f14 = f11 - this.f17617h1;
            int i7 = 0;
            RectF[] rectFArr = {this.f17613f1, this.f17610e1, this.f17615g1, this.l1};
            while (i7 < 4) {
                if (i7 != 3 || this.f17625m1 >= f13) {
                    RectF rectF = rectFArr[i7];
                    RectF rectF2 = this.f17605c1;
                    float f15 = rectF2.left;
                    float f16 = this.f17619i1;
                    float f17 = ((rectF.left - f15) * f16) + f15;
                    float z10 = e2.z(rectF.right, f15, f16, f15);
                    float centerY = ((rectF.top - rectF2.centerY()) * this.f17619i1) + rectF2.centerY();
                    float centerY2 = ((rectF.bottom - rectF2.centerY()) * this.f17619i1) + rectF2.centerY();
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
        if (this.f17647w0 >= 0.7f) {
            RectF rectF = this.P;
            if (!rectF.isEmpty() && !this.U) {
                float L = g0.L(4.0f);
                if (f11 >= rectF.top - L && f11 <= rectF.bottom + L && f10 >= rectF.left - L && f10 <= rectF.right + L) {
                    if (f10 >= this.R.left - g0.L(4.0f)) {
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
        VelocityTracker velocityTracker = this.f17641t1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f17641t1 = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r70) {
        throw new UnsupportedOperationException("Method not decompiled: ji.p.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        String str;
        super.onSizeChanged(i7, i10, i11, i12);
        int c10 = (int) ((i7 - (c(i7) * 2.0f)) - g0.L(28.0f));
        if (c10 != this.f17624l0 && c10 > 0) {
            this.f17624l0 = c10;
            this.M0 = 0.0f;
            this.L0 = 0.0f;
            this.f17622k0 = a(this.L, this.d);
            q();
        }
        this.f17599a1 = -1;
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
            r.b.t(sb2, str, "VoiceLive");
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        boolean z10 = false;
        if (!this.f17627n0) {
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
                    this.f17621j1 = -1;
                    this.f17639s1 = false;
                    this.f17636r1 = false;
                    invalidate();
                    return true;
                }
                int i10 = this.f17621j1;
                int i11 = this.f17643u1;
                if (i10 >= 0) {
                    int o4 = o(x10, y10);
                    if (o4 < 0) {
                        o4 = n(x10, y10);
                    }
                    if (o4 != this.f17621j1 && Math.hypot(x10 - this.f17629o1, y10 - this.f17631p1) > i11) {
                        this.f17621j1 = -1;
                    }
                }
                if (this.f17636r1) {
                    this.f17641t1.addMovement(motionEvent);
                    if (!this.f17639s1 && Math.abs(y10 - this.f17631p1) > i11) {
                        this.f17639s1 = true;
                        this.S0 = false;
                        this.f17633q1 = y10;
                    }
                    if (this.f17639s1) {
                        this.A0 -= y10 - this.f17633q1;
                        this.f17633q1 = y10;
                    }
                }
                invalidate();
                return true;
            }
            int i12 = this.f17621j1;
            this.f17621j1 = -1;
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
                    post(new v0(this, i12, 12));
                }
            }
            if (this.f17636r1 && this.f17639s1 && (velocityTracker = this.f17641t1) != null) {
                velocityTracker.addMovement(motionEvent);
                this.f17641t1.computeCurrentVelocity(1);
                this.B0 = -this.f17641t1.getYVelocity();
            }
            this.f17639s1 = false;
            this.f17636r1 = false;
            invalidate();
            return true;
        }
        this.f17629o1 = x10;
        this.f17633q1 = y10;
        this.f17631p1 = y10;
        this.f17639s1 = false;
        boolean isEmpty = this.f17618i0.trim().isEmpty();
        int o11 = o(x10, y10);
        this.f17621j1 = o11;
        if (o11 < 0) {
            if (!isEmpty) {
                i7 = n(x10, y10);
            }
            this.f17621j1 = i7;
        }
        if (this.f17621j1 < 0 && this.f17602b1.contains(x10, y10)) {
            z10 = true;
        }
        this.f17636r1 = z10;
        if (z10) {
            if (this.f17641t1 == null) {
                this.f17641t1 = VelocityTracker.obtain();
            }
            this.f17641t1.clear();
            this.f17641t1.addMovement(motionEvent);
            this.B0 = 0.0f;
        }
        invalidate();
        return true;
    }

    public final void q() {
        if (this.f17624l0 <= 0) {
            return;
        }
        if (this.f17618i0.isEmpty()) {
            this.f17620j0 = null;
            return;
        }
        SpannableString spannableString = new SpannableString(this.f17618i0);
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            o oVar = (o) obj;
            int i10 = oVar.f17595b;
            if (i10 > oVar.f17594a && i10 <= spannableString.length()) {
                spannableString.setSpan(new f2(oVar, 2), oVar.f17594a, oVar.f17595b, 65569);
            }
        }
        int i11 = this.f17648w1;
        if (i11 >= 0 && i11 < spannableString.length()) {
            spannableString.setSpan(new b(1), this.f17648w1, spannableString.length(), 33);
        }
        this.f17620j0 = a(spannableString, this.f17603c);
    }

    public final void r(String str) {
        if (str == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StaticLayout staticLayout = this.f17620j0;
        this.B1 = staticLayout;
        this.A1 = uptimeMillis;
        int i7 = 1;
        if (this.N0) {
            this.K0 = true;
        }
        float f10 = this.F0;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        this.G0 = f10 - this.A0;
        this.F0 = -1.0f;
        this.E0 = -1.0f;
        this.C0 = 0.0f;
        this.D0 = 0.0f;
        this.S0 = true;
        this.B0 = 0.0f;
        this.I0 = true;
        if (staticLayout != null) {
            Random random = new Random();
            int i10 = V1;
            float f11 = 0.45f;
            float f12 = 0.5f;
            int[] iArr = {i10, i0.a.f(0.45f, i10, -1), i0.a.f(0.5f, V1, -10493697), -1};
            int i11 = 0;
            while (i11 < this.B1.getLineCount()) {
                float lineLeft = this.B1.getLineLeft(i11);
                float lineRight = this.B1.getLineRight(i11);
                float lineTop = this.B1.getLineTop(i11);
                float lineBottom = this.B1.getLineBottom(i11);
                float f13 = lineRight - lineLeft;
                float f14 = f11;
                float f15 = f12;
                int min = (int) Math.min(140.0f, f13 / g0.L(2.6f));
                int i12 = 0;
                while (i12 < min) {
                    float g10 = y0.g(random, f13, lineLeft);
                    float nextFloat = (random.nextFloat() * 0.6f) + 0.2f;
                    int i13 = i7;
                    float c10 = e2.c(g10, Math.max(i7, this.f17624l0), 520.0f, (float) uptimeMillis);
                    long j3 = uptimeMillis;
                    float f16 = (-((random.nextFloat() * g0.L(34.0f)) + g0.L(10.0f))) / 1000.0f;
                    float g11 = y0.g(random, 380.0f, 480.0f);
                    float d = y0.d(0.75f, random.nextFloat(), g0.N(f14));
                    float[] fArr = new float[8];
                    fArr[0] = g10;
                    fArr[i13] = (nextFloat * (lineBottom - lineTop)) + lineTop;
                    fArr[2] = ((random.nextFloat() - f15) * g0.L(36.0f)) / 1000.0f;
                    fArr[3] = f16;
                    fArr[4] = c10;
                    fArr[5] = g11;
                    fArr[6] = iArr[random.nextInt(4)];
                    fArr[7] = d;
                    this.C1.add(fArr);
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
        this.f17618i0 = "";
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.f17654y1 = i7;
        setText(str);
        this.f17654y1 = false;
        if (this.f17620j0 != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                o oVar = (o) obj;
                if (oVar.f17594a < this.f17618i0.length()) {
                    oVar.f17596c = j10 + (b((this.f17620j0.getPrimaryHorizontal(Math.max(oVar.f17594a, Math.min(oVar.f17595b, this.f17618i0.length()) - 1)) + g0.L(60.0f)) / k5.b(120.0f, this.f17624l0, 1)) * 520.0f) + 60;
                    oVar.d = 0.0f;
                }
            }
        }
        invalidate();
    }

    public final void s() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 29 && (obj = this.f17601b0) != null) {
            a0.d(obj).discardDisplayList();
        }
        this.f17601b0 = null;
        this.f17604c0 = -1.0f;
    }

    public void setAccent(int i7) {
        this.f17614g0 = i7 | (-16777216);
    }

    public void setBusy(boolean z10) {
        if (this.f17651x1 == z10) {
            return;
        }
        this.f17651x1 = z10;
        this.f17656z1 = SystemClock.uptimeMillis();
        if (!z10) {
            this.f17603c.setShader(null);
        }
        invalidate();
    }

    public void setEditMenuProgress(float f10) {
        this.O1 = f10;
        invalidate();
    }

    public void setEditPillHidden(boolean z10) {
        this.N1 = z10;
        if (!z10) {
            this.O1 = 0.0f;
            if (this.N0) {
                this.f17645v1 = null;
            }
            String str = this.f17645v1;
            if (str != null) {
                this.f17645v1 = null;
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
        this.M = charSequence2;
        if (this.f17647w0 < 0.01f) {
            if (charSequence2 != null) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.N = f10;
            this.O = 0.0f;
        }
        invalidate();
    }

    public void setLanguagePillHidden(boolean z10) {
        this.U = z10;
        invalidate();
    }

    public void setLevel(float f10) {
        this.V0 = Math.max(0.0f, Math.min(1.0f, f10));
    }

    public void setListening(boolean z10) {
        this.X0 = z10;
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (str == null) {
            str = "Listening…";
        }
        if (str.equals(this.L)) {
            return;
        }
        this.L = str;
        if (this.f17624l0 > 0) {
            this.f17622k0 = a(str, this.d);
        }
        invalidate();
    }

    public void setReview(boolean z10) {
        this.N0 = z10;
        invalidate();
    }

    public void setStyleIcon(Drawable drawable) {
        Drawable drawable2 = this.K;
        if (drawable2 instanceof g5) {
            ((g5) drawable2).n(this);
        }
        this.K = drawable;
        if (drawable instanceof g5) {
            ((g5) drawable).a(this);
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
        throw new UnsupportedOperationException("Method not decompiled: ji.p.t(int, java.lang.String):void");
    }
}
