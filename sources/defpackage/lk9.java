package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
public final class lk9 extends dk9 {
    public final Paint X;

    public lk9(hl9 hl9Var, Rect rect, int i) {
        super(hl9Var, rect, i);
        this.X = new Paint(1);
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return hl.L(12.0f) + rect.top + rect.bottom;
    }

    @Override
    public final int J() {
        return hl.L(32.0f);
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        hl9 hl9Var = this.a;
        int i2 = hl9Var.C;
        int i3 = hl9Var.S;
        int i4 = i2 + i3 + hl9Var.T;
        Rect rect = this.b;
        int i5 = rect.left;
        int i6 = (i4 - i5) - rect.right;
        int i7 = i6 / 2;
        float f = (((i6 - i7) / 2.0f) - i3) + i5;
        float L = (hl.L(12.0f) - hl.L(1.0f)) / 2.0f;
        if (hl9Var.D()) {
            i = aob.nl;
        } else {
            i = aob.ml;
        }
        int v0 = aob.v0(i, hl9Var.D);
        Paint paint = this.X;
        paint.setColor(v0);
        RectF rectF = hl.P;
        rectF.set(f, L, i7 + f, hl.L(1.0f) + L);
        canvas.drawRoundRect(rectF, hl.L(0.5f), hl.L(0.5f), paint);
    }
}
