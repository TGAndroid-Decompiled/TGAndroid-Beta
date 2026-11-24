package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
public final class an0 extends wec {
    public final Path W;
    public final Paint a0;
    public boolean b0;
    public boolean c0;
    public final boolean d0;
    public final zy9 e0;
    public final wjb f0;
    public final ao0 g0;
    public final dn0 h0;

    public an0(dn0 dn0Var, Context context, zy9 zy9Var, wjb wjbVar, ao0 ao0Var) {
        super(context, null);
        this.h0 = dn0Var;
        this.e0 = zy9Var;
        this.f0 = wjbVar;
        this.g0 = ao0Var;
        this.W = new Path();
        this.a0 = new Paint(1);
        this.d0 = gl.O1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        dn0 dn0Var = this.h0;
        an0 an0Var = dn0Var.l1;
        int v0 = bkb.v0(bkb.g5, this.f0);
        Paint paint = this.a0;
        paint.setColor(v0);
        if (this.b0) {
            int i3 = -gl.L(16.0f);
            ao0 ao0Var = this.g0;
            int i4 = ao0Var.n2;
            if (ao0Var.o1.getVisibility() == 0) {
                i = gl.L(16.0f) + gl.m;
            } else {
                i = 0;
            }
            int L = gl.L(10.0f) + Math.max(i3, i4 - i);
            zy9 zy9Var = this.e0;
            int i5 = zy9Var.o2;
            if (zy9Var.h2.c == 1.0f) {
                i2 = gl.m;
            } else {
                i2 = 0;
            }
            int max = Math.max(0, i5 - i2);
            float abs = Math.abs(L - max);
            if (an0Var.getCurrentPosition() == 0) {
                float positionAnimated = an0Var.getPositionAnimated() * abs;
                if (L < max) {
                    f = L + positionAnimated;
                } else {
                    f = L - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - an0Var.getPositionAnimated()) * abs;
                if (max < L) {
                    f = max + positionAnimated2;
                } else {
                    f = max - positionAnimated2;
                }
            }
            int i6 = (int) f;
            float L2 = gl.L(14.0f);
            RectF rectF = gl.P;
            rectF.set(0.0f, i6, getWidth(), gl.L(8.0f) + getHeight());
            canvas.drawRoundRect(rectF, L2, L2, paint);
            canvas.save();
            Path path = this.W;
            path.rewind();
            path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        if (this.d0 || dn0Var.n1) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean g(MotionEvent motionEvent) {
        if (this.h0.l1.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final float getAvailableTranslationX() {
        if (!this.d0 && !this.h0.n1) {
            return super.getAvailableTranslationX();
        }
        return getMeasuredWidth();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = this.c0;
        boolean z3 = this.h0.d;
        if (z2 != z3) {
            this.c0 = z3;
            if (z3) {
                this.e0.e1(true);
            }
        }
    }

    @Override
    public final void u() {
        this.b0 = false;
        this.h0.l1.invalidate();
    }

    @Override
    public final void w(boolean z) {
        dn0 dn0Var = this.h0;
        an0 an0Var = dn0Var.l1;
        float positionAnimated = an0Var.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.b0) {
                this.b0 = true;
                if (dn0Var.d) {
                    gl.t1(dn0Var.m1.b);
                }
            }
        } else {
            this.b0 = false;
        }
        an0Var.invalidate();
    }
}
