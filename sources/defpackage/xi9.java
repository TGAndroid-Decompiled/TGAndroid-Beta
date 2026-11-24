package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class xi9 extends qi9 {
    public final Paint X;

    public xi9(uj9 uj9Var, Rect rect, int i) {
        super(uj9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return hg9.v(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return gm.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        int i2;
        float f;
        uj9 uj9Var = this.a;
        if (uj9Var.D()) {
            i = cmb.wl;
        } else {
            i = cmb.vl;
        }
        int v0 = cmb.v0(i, uj9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        float f2 = -uj9Var.S;
        int i3 = uj9Var.C + uj9Var.T;
        Rect rect = this.b;
        float f3 = (i3 - rect.left) - rect.right;
        float f4 = 0.0f;
        if (uj9Var.s) {
            if (this.S) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (this.R) {
                f4 = 1.0f;
            }
            f4 = gm.R1(f, f4, uj9Var.t);
        } else if (this.R) {
            f4 = 1.0f;
        }
        wi9 wi9Var = this.M;
        if (wi9Var != null) {
            i2 = wi9Var.b.bottom;
        } else {
            i2 = 0;
        }
        float R1 = gm.R1((-1.0f) - i2, gm.L(6.0f), f4);
        canvas.drawRect(f2, R1, f3, R1 + 1.0f, paint);
    }
}
