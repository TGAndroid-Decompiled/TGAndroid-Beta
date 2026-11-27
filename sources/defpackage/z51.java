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
public abstract class z51 extends View implements snb {
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
    public final hn N;
    public final hn O;
    public final hn P;
    public final hn Q;
    public dva R;
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
    public final mm n;
    public boolean r;
    public final mm s;
    public final x51[] w;
    public final float[] x;
    public final RectF y;

    static {
        int i = aob.ck;
        int i2 = aob.Yj;
        int i3 = aob.Zj;
        int i4 = aob.gk;
        int i5 = aob.dk;
        int i6 = aob.ak;
        int i7 = aob.ek;
        int i8 = aob.hk;
        int i9 = aob.bk;
        a0 = new int[]{i, i2, i3, i4, i5, i6, i7, i8, i4, i9, i9};
        b0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        c0 = -1L;
    }

    public z51(Context context, int i, int[] iArr, int i2, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        k43 k43Var = k43.h;
        this.n = new mm(750L, this, k43Var);
        this.r = false;
        this.s = new mm(650L, this, k43Var);
        this.x = new float[2];
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        this.G = new Path();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        hn hnVar = new hn(false, true, true);
        this.N = hnVar;
        hn hnVar2 = new hn(false, true, true);
        this.O = hnVar2;
        hn hnVar3 = new hn(false, true, true);
        this.P = hnVar3;
        hn hnVar4 = new hn(false, true, true);
        this.Q = hnVar4;
        this.S = true;
        this.U = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i2;
        this.e = i2 == 0;
        this.w = new x51[i];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(aob.w0(null, aob.i6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.K = linearGradient2;
        this.L = new Matrix();
        this.M = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        hnVar.n(0.2f, 450L, k43Var);
        hnVar.B = 0.6f;
        hnVar.u(aob.w0(null, aob.G6, false));
        hnVar.x(hl.o());
        hnVar.w(hl.L(32.0f));
        hnVar.b = 17;
        hnVar2.n(0.6f, 450L, k43Var);
        hnVar2.B = 0.6f;
        hnVar2.u(aob.w0(null, aob.y6, false));
        hnVar2.w(hl.L(12.0f));
        hnVar2.b = 17;
        hnVar3.n(0.2f, 450L, k43Var);
        hnVar3.B = 0.6f;
        hnVar3.a.setShader(linearGradient2);
        hnVar3.x(hl.o());
        hnVar3.w(hl.L(32.0f));
        hnVar3.b = 17;
        hnVar4.n(0.6f, 450L, k43Var);
        hnVar4.B = 0.6f;
        hnVar4.a.setShader(linearGradient2);
        hnVar4.x(hl.o());
        hnVar4.w(hl.L(12.0f));
        hnVar4.b = 17;
        int i3 = 0;
        while (true) {
            x51[] x51VarArr = this.w;
            if (i3 < x51VarArr.length) {
                x51 x51Var = new x51(this);
                x51VarArr[i3] = x51Var;
                int v = aob.v(aob.w0(null, iArr[i3], false), 50331648);
                int v2 = aob.v(aob.w0(null, iArr[i3], false), 822083583);
                Typeface typeface = hl.a;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, hl.L(86.0f), new int[]{v2, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                x51Var.v = radialGradient;
                Matrix matrix = new Matrix();
                x51Var.w = matrix;
                radialGradient.setLocalMatrix(matrix);
                x51Var.q.setShader(x51Var.v);
                i3++;
            } else {
                return;
            }
        }
    }

    public static void a(Canvas canvas, hn hnVar, float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return;
        }
        hnVar.C = (int) (f4 * 255.0f);
        hnVar.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        hnVar.draw(canvas);
        canvas.restore();
        hnVar.h();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e(long r30, boolean r32, defpackage.y51... r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z51.e(long, boolean, y51[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        int i = 0;
        while (true) {
            x51[] x51VarArr = this.w;
            if (i < x51VarArr.length) {
                x51 x51Var = x51VarArr[i];
                if (x51Var.b == null) {
                    boolean z = this.e;
                    int[] iArr = this.f;
                    if (z) {
                        x51Var.b = hgb.d(iArr[i], hl.L(16.0f), hl.L(16.0f), -1);
                    } else {
                        x51Var.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i]);
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
            x51[] x51VarArr = this.w;
            if (i < x51VarArr.length) {
                Bitmap bitmap = x51VarArr[i].b;
                if (bitmap != null) {
                    bitmap.recycle();
                    x51VarArr[i].b = null;
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
        int L = hl.L(b());
        int L2 = hl.L(172.0f);
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
        dva dvaVar = this.R;
        if (dvaVar != null) {
            dvaVar.a.set(0.0f, 0.0f, hl.L(140.0f), hl.L(140.0f));
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
            x51[] x51VarArr = this.w;
            if (i2 < x51VarArr.length) {
                if (i == i2 && x51VarArr[i2].d <= 0.0f) {
                    i = -1;
                }
                x51 x51Var = x51VarArr[i2];
                if (i == i2) {
                    z = true;
                } else {
                    z = false;
                }
                x51Var.n = z;
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
            this.E.setColor(aob.w0(null, aob.i6, false));
            try {
                hn hnVar = this.N;
                if (hnVar != null) {
                    hnVar.u(aob.w0(null, aob.G6, false));
                }
                hn hnVar2 = this.O;
                if (hnVar2 != null) {
                    hnVar2.u(aob.w0(null, aob.y6, false));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            invalidate();
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
