package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.view.View;
import java.util.HashSet;
public abstract class y61 extends View implements vlb {
    public static final int[] a0;
    public static final int[] b0;
    public static long c0;
    public static Long d0;
    public static Long e0;
    public final Paint E;
    public RectF F;
    public final Path G;
    public final Paint H;
    public final Paint I;
    public final LinearGradient J;
    public final LinearGradient K;
    public final Matrix L;
    public final Matrix M;
    public final ho N;
    public final ho O;
    public final ho P;
    public final ho Q;
    public cta R;
    public boolean S;
    public boolean T;
    public int U;
    public int[] V;
    public float[] W;
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final boolean d;
    public final boolean e;
    public final int[] f;
    public boolean h;
    public final ln n;
    public boolean r;
    public final ln s;
    public final w61[] w;
    public final float[] x;
    public final RectF y;

    static {
        int i = cmb.bk;
        int i2 = cmb.Xj;
        int i3 = cmb.Yj;
        int i4 = cmb.fk;
        int i5 = cmb.ck;
        int i6 = cmb.Zj;
        int i7 = cmb.dk;
        int i8 = cmb.gk;
        int i9 = cmb.ak;
        a0 = new int[]{i, i2, i3, i4, i5, i6, i7, i8, i4, i9, i9};
        b0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        c0 = -1L;
    }

    public y61(Context context, int i, int[] iArr, int i2, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        d53 d53Var = d53.h;
        this.n = new ln(750L, this, d53Var);
        this.r = false;
        this.s = new ln(650L, this, d53Var);
        this.x = new float[2];
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        this.G = new Path();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        ho hoVar = new ho(false, true, true);
        this.N = hoVar;
        ho hoVar2 = new ho(false, true, true);
        this.O = hoVar2;
        ho hoVar3 = new ho(false, true, true);
        this.P = hoVar3;
        ho hoVar4 = new ho(false, true, true);
        this.Q = hoVar4;
        this.S = true;
        this.U = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i2;
        this.e = i2 == 0;
        this.w = new w61[i];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(cmb.w0(null, cmb.h6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.K = linearGradient2;
        this.L = new Matrix();
        this.M = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        hoVar.n(0.2f, 450L, d53Var);
        hoVar.B = 0.6f;
        hoVar.u(cmb.w0(null, cmb.F6, false));
        hoVar.x(gm.o());
        hoVar.w(gm.L(32.0f));
        hoVar.b = 17;
        hoVar2.n(0.6f, 450L, d53Var);
        hoVar2.B = 0.6f;
        hoVar2.u(cmb.w0(null, cmb.x6, false));
        hoVar2.w(gm.L(12.0f));
        hoVar2.b = 17;
        hoVar3.n(0.2f, 450L, d53Var);
        hoVar3.B = 0.6f;
        hoVar3.a.setShader(linearGradient2);
        hoVar3.x(gm.o());
        hoVar3.w(gm.L(32.0f));
        hoVar3.b = 17;
        hoVar4.n(0.6f, 450L, d53Var);
        hoVar4.B = 0.6f;
        hoVar4.a.setShader(linearGradient2);
        hoVar4.x(gm.o());
        hoVar4.w(gm.L(12.0f));
        hoVar4.b = 17;
        int i3 = 0;
        while (true) {
            w61[] w61VarArr = this.w;
            if (i3 < w61VarArr.length) {
                w61 w61Var = new w61(this);
                w61VarArr[i3] = w61Var;
                int v = cmb.v(cmb.w0(null, iArr[i3], false), 50331648);
                int v2 = cmb.v(cmb.w0(null, iArr[i3], false), 822083583);
                Typeface typeface = gm.a;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gm.L(86.0f), new int[]{v2, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                w61Var.v = radialGradient;
                Matrix matrix = new Matrix();
                w61Var.w = matrix;
                radialGradient.setLocalMatrix(matrix);
                w61Var.q.setShader(w61Var.v);
                i3++;
            } else {
                return;
            }
        }
    }

    public static void a(Canvas canvas, ho hoVar, float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return;
        }
        hoVar.C = (int) (f4 * 255.0f);
        hoVar.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        hoVar.draw(canvas);
        canvas.restore();
        hoVar.h();
    }

    public static float f(float f) {
        return (float) ((f / 180.0f) * 3.141592653589793d);
    }

    public int b() {
        return 200;
    }

    public abstract void c(int i, boolean z);

    public int d() {
        return 0;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r66) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y61.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y61.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e(long r30, boolean r32, defpackage.x61... r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y61.e(long, boolean, x61[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        int i = 0;
        while (true) {
            w61[] w61VarArr = this.w;
            if (i < w61VarArr.length) {
                w61 w61Var = w61VarArr[i];
                if (w61Var.b == null) {
                    boolean z = this.e;
                    int[] iArr = this.f;
                    if (z) {
                        w61Var.b = neb.d(iArr[i], gm.L(16.0f), gm.L(16.0f), -1);
                    } else {
                        w61Var.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i]);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.T = false;
        while (true) {
            w61[] w61VarArr = this.w;
            if (i < w61VarArr.length) {
                Bitmap bitmap = w61VarArr[i].b;
                if (bitmap != null) {
                    bitmap.recycle();
                    w61VarArr[i].b = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(b());
        int L2 = gm.L(172.0f);
        RectF rectF = this.a;
        rectF.set((size - L2) / 2.0f, (L - L2) / 2.0f, (size + L2) / 2.0f, (L2 + L) / 2.0f);
        Matrix matrix = this.L;
        matrix.reset();
        matrix.setTranslate(rectF.left, 0.0f);
        this.J.setLocalMatrix(matrix);
        Matrix matrix2 = this.M;
        matrix2.reset();
        matrix2.setTranslate(rectF.left, -rectF.centerY());
        this.K.setLocalMatrix(matrix2);
        cta ctaVar = this.R;
        if (ctaVar != null) {
            ctaVar.a.set(0.0f, 0.0f, gm.L(140.0f), gm.L(140.0f));
            this.R.a.offset((getMeasuredWidth() - this.R.a.width()) / 2.0f, (getMeasuredHeight() - this.R.a.height()) / 2.0f);
            this.R.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.R.f();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    public void setInterceptTouch(boolean z) {
        this.S = z;
    }

    public void setSelected(int i) {
        boolean z;
        if (i == this.U) {
            return;
        }
        int i2 = 0;
        while (true) {
            w61[] w61VarArr = this.w;
            if (i2 < w61VarArr.length) {
                if (i == i2 && w61VarArr[i2].d <= 0.0f) {
                    i = -1;
                }
                w61 w61Var = w61VarArr[i2];
                if (i == i2) {
                    z = true;
                } else {
                    z = false;
                }
                w61Var.n = z;
                i2++;
            } else {
                this.U = i;
                invalidate();
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            this.E.setColor(cmb.w0(null, cmb.h6, false));
            try {
                ho hoVar = this.N;
                if (hoVar != null) {
                    hoVar.u(cmb.w0(null, cmb.F6, false));
                }
                ho hoVar2 = this.O;
                if (hoVar2 != null) {
                    hoVar2.u(cmb.w0(null, cmb.x6, false));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            invalidate();
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
