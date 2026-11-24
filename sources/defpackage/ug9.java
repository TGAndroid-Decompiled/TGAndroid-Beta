package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class ug9 extends mg9 {
    public final Paint X;

    public ug9(rh9 rh9Var, Rect rect, int i) {
        super(rh9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return de9.w(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int K() {
        Rect rect = this.b;
        return gl.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void W(Canvas canvas) {
        int i;
        int i2;
        float f;
        rh9 rh9Var = this.a;
        if (rh9Var.D()) {
            i = bkb.wl;
        } else {
            i = bkb.vl;
        }
        int v0 = bkb.v0(i, rh9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        float f2 = -rh9Var.S;
        int i3 = rh9Var.C + rh9Var.T;
        Rect rect = this.b;
        float f3 = (i3 - rect.left) - rect.right;
        float f4 = 0.0f;
        if (rh9Var.s) {
            if (this.S) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (this.R) {
                f4 = 1.0f;
            }
            f4 = gl.R1(f, f4, rh9Var.t);
        } else if (this.R) {
            f4 = 1.0f;
        }
        tg9 tg9Var = this.M;
        if (tg9Var != null) {
            i2 = tg9Var.b.bottom;
        } else {
            i2 = 0;
        }
        float R1 = gl.R1((-1.0f) - i2, gl.L(6.0f), f4);
        canvas.drawRect(f2, R1, f3, R1 + 1.0f, paint);
    }
}
