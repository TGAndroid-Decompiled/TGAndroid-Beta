package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class lq5 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public Boolean c;
    public final zq5 d;

    public lq5(zq5 zq5Var, Context context) {
        super(context);
        this.d = zq5Var;
        this.a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        boolean z;
        boolean z2;
        zq5 zq5Var = this.d;
        int L = (zq5Var.T1 - zq5Var.t0) - gl.L(8.0f);
        int L2 = gl.L(36.0f) + getMeasuredHeight();
        int i2 = zq5Var.t0;
        int i3 = gl.m;
        int i4 = L + i3;
        int i5 = (L2 + i2) - i3;
        boolean z3 = true;
        if (this.b) {
            int i6 = i3 << 1;
            if (i4 + i2 < i6) {
                int min = Math.min(i3, (i6 - i4) - i2);
                i4 -= min;
                i5 += min;
                f = 1.0f - Math.min(1.0f, (min << 1) / gl.m);
            } else {
                f = 1.0f;
            }
            int i7 = zq5Var.t0;
            int i8 = i4 + i7;
            int i9 = gl.m;
            if (i8 < i9) {
                i = Math.min(i9, (i9 - i4) - i7);
            } else {
                i = 0;
            }
        } else {
            i = 0;
            f = 1.0f;
        }
        zq5Var.s0.setBounds(0, i4, getMeasuredWidth(), gl.L(10.0f) + i5 + gl.n);
        zq5Var.s0.draw(canvas);
        if (f != 1.0f) {
            bkb.s0.setColor(bkb.w0(null, bkb.g5, false));
            int i10 = zq5Var.t0 + i4;
            RectF rectF = this.a;
            rectF.set(zq5Var.u0, zq5Var.t0 + i4, getMeasuredWidth() - zq5Var.u0, gl.L(24.0f) + i10);
            canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
        }
        if (i > 0) {
            bkb.s0.setColor(bkb.w0(null, bkb.g5, false));
            canvas.drawRect(zq5Var.u0, gl.m - i, getMeasuredWidth() - zq5Var.u0, gl.m, bkb.s0);
        }
        if (i > gl.m / 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = this.c;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        if (gl.B(bkb.v0(bkb.g5, zq5Var.J0)) > 0.721f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (gl.B(bkb.v(bkb.v0(bkb.r8, zq5Var.J0), 855638016)) <= 0.721f) {
            z3 = false;
        }
        this.c = Boolean.valueOf(z);
        if (!z) {
            z2 = z3;
        }
        gl.n3(zq5Var.getWindow(), z2);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            zq5 zq5Var = this.d;
            if (zq5Var.T1 != 0 && motionEvent.getY() < zq5Var.T1) {
                zq5Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d.I0();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        zq5 zq5Var = this.d;
        zq5Var.U1 = true;
        int i3 = zq5Var.u0;
        setPadding(i3, gl.m, i3, 0);
        zq5Var.U1 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.b = true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.d.U1) {
            return;
        }
        super.requestLayout();
    }
}
