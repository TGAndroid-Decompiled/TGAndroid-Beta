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
public abstract class r51 extends View implements tjb {
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
    public final gn N;
    public final gn O;
    public final gn P;
    public final gn Q;
    public bra R;
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
    public final lm n;
    public boolean r;
    public final lm s;
    public final p51[] w;
    public final float[] x;
    public final RectF y;

    static {
        int i = bkb.bk;
        int i2 = bkb.Xj;
        int i3 = bkb.Yj;
        int i4 = bkb.fk;
        int i5 = bkb.ck;
        int i6 = bkb.Zj;
        int i7 = bkb.dk;
        int i8 = bkb.gk;
        int i9 = bkb.ak;
        a0 = new int[]{i, i2, i3, i4, i5, i6, i7, i8, i4, i9, i9};
        b0 = new int[]{2131623951, 2131623954, 2131623948, 2131623949, 2131623954, 2131623949, 2131623953, 2131623952, 2131623950, 2131623950, 2131623948};
        c0 = -1L;
    }

    public r51(Context context, int i, int[] iArr, int i2, int[] iArr2) {
        super(context);
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.h = true;
        s33 s33Var = s33.h;
        this.n = new lm(750L, this, s33Var);
        this.r = false;
        this.s = new lm(650L, this, s33Var);
        this.x = new float[2];
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.E = paint;
        this.G = new Path();
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        gn gnVar = new gn(false, true, true);
        this.N = gnVar;
        gn gnVar2 = new gn(false, true, true);
        this.O = gnVar2;
        gn gnVar3 = new gn(false, true, true);
        this.P = gnVar3;
        gn gnVar4 = new gn(false, true, true);
        this.Q = gnVar4;
        this.S = true;
        this.U = -1;
        setLayerType(2, null);
        this.f = iArr2;
        this.d = i2;
        this.e = i2 == 0;
        this.w = new p51[i];
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(bkb.w0(null, bkb.h6, false));
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.J = linearGradient;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(200.0f), new int[]{7263574, -9513642, -12469647, 4307569}, new float[]{0.0f, 0.07f, 0.93f, 1.0f}, tileMode);
        this.K = linearGradient2;
        this.L = new Matrix();
        this.M = new Matrix();
        paint2.setShader(linearGradient);
        paint3.setShader(linearGradient);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        gnVar.n(0.2f, 450L, s33Var);
        gnVar.B = 0.6f;
        gnVar.u(bkb.w0(null, bkb.F6, false));
        gnVar.x(gl.o());
        gnVar.w(gl.L(32.0f));
        gnVar.b = 17;
        gnVar2.n(0.6f, 450L, s33Var);
        gnVar2.B = 0.6f;
        gnVar2.u(bkb.w0(null, bkb.x6, false));
        gnVar2.w(gl.L(12.0f));
        gnVar2.b = 17;
        gnVar3.n(0.2f, 450L, s33Var);
        gnVar3.B = 0.6f;
        gnVar3.a.setShader(linearGradient2);
        gnVar3.x(gl.o());
        gnVar3.w(gl.L(32.0f));
        gnVar3.b = 17;
        gnVar4.n(0.6f, 450L, s33Var);
        gnVar4.B = 0.6f;
        gnVar4.a.setShader(linearGradient2);
        gnVar4.x(gl.o());
        gnVar4.w(gl.L(12.0f));
        gnVar4.b = 17;
        int i3 = 0;
        while (true) {
            p51[] p51VarArr = this.w;
            if (i3 < p51VarArr.length) {
                p51 p51Var = new p51(this);
                p51VarArr[i3] = p51Var;
                int v = bkb.v(bkb.w0(null, iArr[i3], false), 50331648);
                int v2 = bkb.v(bkb.w0(null, iArr[i3], false), 822083583);
                Typeface typeface = gl.a;
                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gl.L(86.0f), new int[]{v2, v}, new float[]{0.3f, 1.0f}, Shader.TileMode.CLAMP);
                p51Var.v = radialGradient;
                Matrix matrix = new Matrix();
                p51Var.w = matrix;
                radialGradient.setLocalMatrix(matrix);
                p51Var.q.setShader(p51Var.v);
                i3++;
            } else {
                return;
            }
        }
    }

    public static void a(Canvas canvas, gn gnVar, float f, float f2, float f3, float f4) {
        if (f4 <= 0.0f) {
            return;
        }
        gnVar.C = (int) (f4 * 255.0f);
        gnVar.setBounds(0, 0, 0, 0);
        canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        gnVar.draw(canvas);
        canvas.restore();
        gnVar.h();
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e(long r30, boolean r32, defpackage.q51... r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r51.e(long, boolean, q51[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        int i = 0;
        while (true) {
            p51[] p51VarArr = this.w;
            if (i < p51VarArr.length) {
                p51 p51Var = p51VarArr[i];
                if (p51Var.b == null) {
                    boolean z = this.e;
                    int[] iArr = this.f;
                    if (z) {
                        p51Var.b = lcb.d(iArr[i], gl.L(16.0f), gl.L(16.0f), -1);
                    } else {
                        p51Var.b = BitmapFactory.decodeResource(getContext().getResources(), iArr[i]);
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
            p51[] p51VarArr = this.w;
            if (i < p51VarArr.length) {
                Bitmap bitmap = p51VarArr[i].b;
                if (bitmap != null) {
                    bitmap.recycle();
                    p51VarArr[i].b = null;
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
        int L = gl.L(b());
        int L2 = gl.L(172.0f);
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
        bra braVar = this.R;
        if (braVar != null) {
            braVar.a.set(0.0f, 0.0f, gl.L(140.0f), gl.L(140.0f));
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
            p51[] p51VarArr = this.w;
            if (i2 < p51VarArr.length) {
                if (i == i2 && p51VarArr[i2].d <= 0.0f) {
                    i = -1;
                }
                p51 p51Var = p51VarArr[i2];
                if (i == i2) {
                    z = true;
                } else {
                    z = false;
                }
                p51Var.n = z;
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
            this.E.setColor(bkb.w0(null, bkb.h6, false));
            try {
                gn gnVar = this.N;
                if (gnVar != null) {
                    gnVar.u(bkb.w0(null, bkb.F6, false));
                }
                gn gnVar2 = this.O;
                if (gnVar2 != null) {
                    gnVar2.u(bkb.w0(null, bkb.x6, false));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            invalidate();
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
