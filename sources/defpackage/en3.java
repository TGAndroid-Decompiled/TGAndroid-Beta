package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.ui.Components.a;
import org.telegram.ui.Components.d;
public final class en3 extends View {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public int E0;
    public final mm F;
    public long F0;
    public final mm G;
    public long G0;
    public final mm H;
    public long H0;
    public final mm I;
    public long I0;
    public final mm J;
    public Drawable J0;
    public final mm K;
    public final int[] K0;
    public int L;
    public boolean L0;
    public float M;
    public final mm M0;
    public float N;
    public final mm N0;
    public float O;
    public final mm O0;
    public final float[] P;
    public final Paint P0;
    public int Q;
    public final RectF Q0;
    public boolean R;
    public long R0;
    public float S;
    public final Matrix S0;
    public float T;
    public final SparseArray T0;
    public final Paint U;
    public final Paint U0;
    public final Path V;
    public cn3 V0;
    public b29 W;
    public jl0 W0;
    public final Path X0;
    public Paint Y0;
    public float Z0;
    public final bn3 a;
    public int a0;
    public float a1;
    public tw1 b;
    public final Paint b0;
    public long b1;
    public a c;
    public final Paint c0;
    public long c1;
    public final Paint d;
    public final Paint d0;
    public dn3 d1;
    public final Paint e;
    public final Paint e0;
    public int e1;
    public final Paint f;
    public final Paint f0;
    public int f1;
    public final mm g0;
    public int g1;
    public final Paint h;
    public final mm h0;
    public int h1;
    public float i0;
    public int i1;
    public float j0;
    public boolean j1;
    public float k0;
    public final p1 k1;
    public boolean l0;
    public boolean l1;
    public final RectF m0;
    public float m1;
    public final Drawable n;
    public final RectF n0;
    public float n1;
    public final int[] o0;
    public boolean p0;
    public int q0;
    public final RectF r;
    public int r0;
    public final RectF s;
    public LinearGradient s0;
    public RadialGradient t0;
    public LinearGradient u0;
    public final Paint v0;
    public final RectF w;
    public final Paint w0;
    public final float[] x;
    public final Matrix x0;
    public boolean y;
    public boolean y0;
    public final float[] z0;

    public en3(Context context, bn3 bn3Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Paint(1);
        this.f = new Paint(1);
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.r = new RectF();
        this.s = new RectF();
        this.w = new RectF();
        this.x = new float[2];
        k43 k43Var = k43.g;
        this.F = new mm(this, 0L, 220L, k43Var);
        k43 k43Var2 = k43.h;
        this.G = new mm(this, 0L, 320L, k43Var2);
        k43 k43Var3 = k43.j;
        this.H = new mm(this, 0L, 200L, k43Var3);
        this.I = new mm(this, 0L, 300L, k43Var2);
        this.J = new mm(this, 0L, 200L, k43Var3);
        this.K = new mm(this, 0L, 160L, k43Var2);
        this.L = 0;
        this.P = new float[3];
        this.Q = -1;
        this.U = new Paint(1);
        this.V = new Path();
        this.b0 = new Paint(1);
        this.c0 = new Paint(1);
        this.d0 = new Paint(1);
        this.e0 = new Paint(1);
        this.f0 = new Paint(1);
        this.g0 = new mm(this, 0L, 320L, new k43(0.25d, 0.1d, 0.25d, 1.0d));
        this.h0 = new mm(this, 0L, 150L, k43Var);
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new int[2];
        this.v0 = new Paint(1);
        this.w0 = new Paint(1);
        this.x0 = new Matrix();
        this.z0 = new float[5];
        this.K0 = new int[2];
        this.M0 = new mm(this, 0L, 220L, k43Var);
        this.N0 = new mm(this, 0L, 420L, k43Var3);
        this.O0 = new mm(this, 0L, 260L, k43Var);
        this.P0 = new Paint(1);
        this.Q0 = new RectF();
        this.S0 = new Matrix();
        this.T0 = new SparseArray();
        this.U0 = new Paint(1);
        this.X0 = new Path();
        this.e1 = -15820126;
        this.f1 = -14910766;
        this.g1 = -14910766;
        this.h1 = -7696492;
        this.i1 = -1726275033;
        this.k1 = new p1(this, (byte) 22);
        this.a = bn3Var;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.N(2.0f));
        paint2.setColor(-1);
        Drawable e = c00.e(context, 2131232710);
        this.n = e;
        e.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final boolean a(View view, float[] fArr) {
        if (view != null && view.getWidth() != 0) {
            float width = view.getWidth() / 2.0f;
            float height = view.getHeight() / 2.0f;
            ViewParent parent = getParent();
            while (view != null) {
                if (view != parent) {
                    width += view.getTranslationX() + view.getLeft();
                    height += view.getTranslationY() + view.getTop();
                    ViewParent parent2 = view.getParent();
                    if (parent2 instanceof View) {
                        view = (View) parent2;
                    } else {
                        view = null;
                    }
                } else {
                    fArr[0] = width - getLeft();
                    fArr[1] = height - getTop();
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(int i) {
        if (this.p0) {
            return g(i);
        }
        float max = Math.max(0.0f, Math.min(1.0f, this.a1)) * hn3.c(11);
        int i2 = (max > 0.004f ? 1 : (max == 0.004f ? 0 : -1));
        int i3 = this.i1;
        if (i2 <= 0) {
            return i3;
        }
        return vm2.f(max, i3, vm2.f(0.5f, i, this.g1) | (-16777216));
    }

    public final void c(Canvas canvas, float f, float f2, float f3, float f4, int i, float f5) {
        if (f5 <= 0.01f) {
            return;
        }
        int i2 = (i & 16316664) | (-16777216);
        SparseArray sparseArray = this.T0;
        SweepGradient sweepGradient = (SweepGradient) sparseArray.get(i2);
        if (sweepGradient == null) {
            int i3 = 16777215 & i2;
            SweepGradient sweepGradient2 = new SweepGradient(0.0f, 0.0f, new int[]{i3, i2, i3, i3}, new float[]{0.0f, 0.19444445f, 0.3888889f, 1.0f});
            if (sparseArray.size() > 256) {
                sparseArray.clear();
            }
            sparseArray.put(i2, sweepGradient2);
            sweepGradient = sweepGradient2;
        }
        float f6 = f4 - 70.0f;
        Matrix matrix = this.S0;
        matrix.setRotate(f6);
        matrix.postTranslate(f, f2);
        sweepGradient.setLocalMatrix(matrix);
        Paint paint = this.U0;
        paint.setShader(sweepGradient);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeWidth(Math.max(1.0f, hl.N(1.1f)));
        paint.setColor(-1);
        paint.setAlpha((int) (Math.min(1.0f, f5) * 255.0f));
        RectF rectF = this.w;
        rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
        canvas.drawArc(rectF, f6, 140.0f, false, paint);
        paint.setShader(null);
    }

    public final void d(android.graphics.Canvas r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en3.d(android.graphics.Canvas):void");
    }

    public final void e() {
        this.y = false;
        this.E = false;
        this.F.e(true, 0.0f);
        this.G.e(true, 0.0f);
        setVisibility(8);
    }

    public final int f(float f, float f2) {
        if (this.l0) {
            RectF rectF = this.m0;
            if (!rectF.isEmpty() && this.g0.c > 0.7f && rectF.contains(f, f2)) {
                return 1;
            }
        }
        if (this.F.c >= 0.6f && this.y) {
            RectF rectF2 = this.r;
            if (!rectF2.isEmpty() && this.E && rectF2.contains(f, f2)) {
                return 0;
            }
            if (this.s.contains(f, f2)) {
                return 2;
            }
        }
        return -1;
    }

    public final int g(int i) {
        if (this.p0) {
            return vm2.f(0.4f, i, -1);
        }
        return vm2.f(hn3.c(11), this.h1, vm2.f(0.5f, i, this.g1));
    }

    public int getRightMode() {
        return this.L;
    }

    public final void h() {
        if (!this.j1 && isAttachedToWindow()) {
            this.j1 = true;
            postOnAnimation(this.k1);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            h();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.k1);
        this.j1 = false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r71) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.y) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.Q = f(motionEvent.getX(), motionEvent.getY());
                invalidate();
                if (this.Q < 0) {
                    return false;
                }
            } else if (actionMasked == 1) {
                int f = f(motionEvent.getX(), motionEvent.getY());
                int i = this.Q;
                this.Q = -1;
                invalidate();
                if (i >= 0 && i == f) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    bn3 bn3Var = this.a;
                    if (i == 0) {
                        bn3Var.v();
                    } else if (i == 1) {
                        bn3Var.w();
                    } else {
                        d dVar = bn3Var.f;
                        byte b = bn3Var.r;
                        if (b == 1) {
                            Editable text = dVar.a.F0.getText();
                            if (bn3Var.s.getRightMode() == 2 || (text != null && ((bn3Var.z() > 0 || bn3Var.O > 0) && text.toString().trim().length() > 0))) {
                                bn3Var.E();
                            }
                        } else if (b == 3) {
                            dVar.a.E1();
                        }
                    }
                }
            } else {
                if (actionMasked == 3) {
                    this.Q = -1;
                    invalidate();
                }
                if (this.Q < 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && getVisibility() == 0) {
            h();
        }
    }

    public void setBorderColorSource(cn3 cn3Var) {
        this.V0 = cn3Var;
    }

    public void setBubbleProvider(dn3 dn3Var) {
        this.d1 = dn3Var;
    }

    public void setCancelShown(boolean z) {
        this.E = z;
        if (!z) {
            this.R = false;
        }
        invalidate();
    }

    public void setDayIconBase(int i) {
        this.h1 = (-16777216) | i;
        this.i1 = i;
    }

    public void setHandOff(boolean z) {
        this.l1 = z;
        invalidate();
    }

    public void setLevel(float f) {
        this.N = f;
    }

    public void setRightMode(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        invalidate();
    }

    public void setSendIconColor(int i) {
        this.n.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setShown(boolean z) {
        float f;
        if (this.y == z && this.E == z) {
            return;
        }
        this.y = z;
        this.E = z;
        if (z) {
            setVisibility(0);
            h();
            this.G.e(true, 0.0f);
            this.L0 = false;
            this.l1 = false;
            this.M0.e(true, 0.0f);
            this.G0 = 0L;
            if (this.A0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.F.e(true, f);
            this.L = 0;
            this.H.e(true, 1.0f);
            this.I.e(true, 0.0f);
            this.J.e(true, 0.0f);
        }
        invalidate();
    }

    public void setStopGlass(jl0 jl0Var) {
        this.W0 = jl0Var;
        if (jl0Var != null) {
            jl0Var.r(0.0f);
            jl0Var.X = 0.0f;
        }
    }

    public void setStopIsland(boolean z) {
        if (this.l0 == z) {
            return;
        }
        this.l0 = z;
        mm mmVar = this.g0;
        if (z) {
            mmVar.e(true, 0.0f);
            this.h0.e(true, 0.0f);
        } else {
            float f = mmVar.c;
            this.i0 = f;
            mmVar.e(true, f);
        }
        invalidate();
    }
}
