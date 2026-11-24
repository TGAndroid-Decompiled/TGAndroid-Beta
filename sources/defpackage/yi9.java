package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
public final class yi9 extends qi9 {
    public final Paint X;

    public yi9(uj9 uj9Var, Rect rect, int i) {
        super(uj9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return gm.L(12.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return gm.L(32.0f);
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        uj9 uj9Var = this.a;
        int i2 = uj9Var.C;
        int i3 = uj9Var.S;
        int i4 = i2 + i3 + uj9Var.T;
        Rect rect = this.b;
        int i5 = rect.left;
        int i6 = (i4 - i5) - rect.right;
        int i7 = i6 / 2;
        float f = (((i6 - i7) / 2.0f) - i3) + i5;
        float L = (gm.L(12.0f) - gm.L(1.0f)) / 2.0f;
        if (uj9Var.D()) {
            i = cmb.ml;
        } else {
            i = cmb.ll;
        }
        int v0 = cmb.v0(i, uj9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        RectF rectF = gm.P;
        rectF.set(f, L, i7 + f, gm.L(1.0f) + L);
        canvas.drawRoundRect(rectF, gm.L(0.5f), gm.L(0.5f), paint);
    }
}
