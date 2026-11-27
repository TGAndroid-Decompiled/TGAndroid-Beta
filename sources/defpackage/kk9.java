package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
public final class kk9 extends dk9 {
    public final Paint X;

    public kk9(hl9 hl9Var, Rect rect, int i) {
        super(hl9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return uh9.w(6.0f, rect.top, 1) + rect.bottom;
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return hl.L(32.0f) + rect.left + rect.right;
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        int i2;
        float f;
        hl9 hl9Var = this.a;
        if (hl9Var.D()) {
            i = aob.xl;
        } else {
            i = aob.wl;
        }
        int v0 = aob.v0(i, hl9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        float f2 = -hl9Var.S;
        int i3 = hl9Var.C + hl9Var.T;
        Rect rect = this.b;
        float f3 = (i3 - rect.left) - rect.right;
        float f4 = 0.0f;
        if (hl9Var.s) {
            if (this.S) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (this.R) {
                f4 = 1.0f;
            }
            f4 = hl.R1(f, f4, hl9Var.t);
        } else if (this.R) {
            f4 = 1.0f;
        }
        jk9 jk9Var = this.M;
        if (jk9Var != null) {
            i2 = jk9Var.b.bottom;
        } else {
            i2 = 0;
        }
        float R1 = hl.R1((-1.0f) - i2, hl.L(6.0f), f4);
        canvas.drawRect(f2, R1, f3, R1 + 1.0f, paint);
    }
}
