package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
public final class vg9 extends mg9 {
    public final Paint X;

    public vg9(rh9 rh9Var, Rect rect, int i) {
        super(rh9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return gl.L(12.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int K() {
        return gl.L(32.0f);
    }

    @Override
    public final void W(Canvas canvas) {
        int i;
        rh9 rh9Var = this.a;
        int i2 = rh9Var.C;
        int i3 = rh9Var.S;
        int i4 = i2 + i3 + rh9Var.T;
        Rect rect = this.b;
        int i5 = rect.left;
        int i6 = (i4 - i5) - rect.right;
        int i7 = i6 / 2;
        float f = (((i6 - i7) / 2.0f) - i3) + i5;
        float L = (gl.L(12.0f) - gl.L(1.0f)) / 2.0f;
        if (rh9Var.D()) {
            i = bkb.ml;
        } else {
            i = bkb.ll;
        }
        int v0 = bkb.v0(i, rh9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        RectF rectF = gl.P;
        rectF.set(f, L, i7 + f, gl.L(1.0f) + L);
        canvas.drawRoundRect(rectF, gl.L(0.5f), gl.L(0.5f), paint);
    }
}
