package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
public final class ao0 extends wgc {
    public final Path W;
    public final Paint a0;
    public boolean b0;
    public boolean c0;
    public final boolean d0;
    public final b1a e0;
    public final ylb f0;
    public final ap0 g0;
    public final do0 h0;

    public ao0(do0 do0Var, Context context, b1a b1aVar, ylb ylbVar, ap0 ap0Var) {
        super(context, null);
        this.h0 = do0Var;
        this.e0 = b1aVar;
        this.f0 = ylbVar;
        this.g0 = ap0Var;
        this.W = new Path();
        this.a0 = new Paint(1);
        this.d0 = gm.O1();
    }

    @Override
    public final boolean c(MotionEvent motionEvent) {
        if (this.h0.l1.getCurrentPosition() == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        float f;
        do0 do0Var = this.h0;
        ao0 ao0Var = do0Var.l1;
        int v0 = cmb.v0(cmb.g5, this.f0);
        Paint paint = this.a0;
        paint.setColor(v0);
        if (this.b0) {
            int i3 = -gm.L(16.0f);
            ap0 ap0Var = this.g0;
            int i4 = ap0Var.n2;
            if (ap0Var.o1.getVisibility() == 0) {
                i = gm.L(16.0f) + gm.m;
            } else {
                i = 0;
            }
            int L = gm.L(10.0f) + Math.max(i3, i4 - i);
            b1a b1aVar = this.e0;
            int i5 = b1aVar.o2;
            if (b1aVar.h2.c == 1.0f) {
                i2 = gm.m;
            } else {
                i2 = 0;
            }
            int max = Math.max(0, i5 - i2);
            float abs = Math.abs(L - max);
            if (ao0Var.getCurrentPosition() == 0) {
                float positionAnimated = ao0Var.getPositionAnimated() * abs;
                if (L < max) {
                    f = L + positionAnimated;
                } else {
                    f = L - positionAnimated;
                }
            } else {
                float positionAnimated2 = (1.0f - ao0Var.getPositionAnimated()) * abs;
                if (max < L) {
                    f = max + positionAnimated2;
                } else {
                    f = max - positionAnimated2;
                }
            }
            int i6 = (int) f;
            float L2 = gm.L(14.0f);
            RectF rectF = gm.P;
            rectF.set(0.0f, i6, getWidth(), gm.L(8.0f) + getHeight());
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
        if (this.d0 || do0Var.n1) {
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        super.dispatchDraw(canvas);
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
    public final void t() {
        this.b0 = false;
        this.h0.l1.invalidate();
    }

    @Override
    public final void w(boolean z) {
        do0 do0Var = this.h0;
        ao0 ao0Var = do0Var.l1;
        float positionAnimated = ao0Var.getPositionAnimated();
        if (positionAnimated > 0.0f && positionAnimated < 1.0f) {
            if (!this.b0) {
                this.b0 = true;
                if (do0Var.d) {
                    gm.t1(do0Var.m1.b);
                }
            }
        } else {
            this.b0 = false;
        }
        ao0Var.invalidate();
    }
}
