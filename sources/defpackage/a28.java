package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class a28 implements s09 {
    public final y28 a;

    public a28(y28 y28Var) {
        this.a = y28Var;
    }

    @Override
    public final void A() {
        ((d8b) this.a.G1).b(false);
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        y28 y28Var = this.a;
        if (!z) {
            y28Var.d0(new d97(this, view, h19Var, z, z2));
        } else {
            ij.X(y28Var.s2, y28Var.r1, 1, new gv1(this, z, h19Var, view));
        }
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean u() {
        return this.a.G0();
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        y28 y28Var = this.a;
        Paint paint = y28Var.d2;
        ep epVar = y28Var.F1;
        float f4 = -f2;
        float f5 = -f3;
        epVar.i(f4, f5, y28Var.getMeasuredWidth() + f4, y28Var.getMeasuredHeight() + f5);
        if (f > 0.0f) {
            canvas.drawRoundRect(rectF, f, f, (Paint) epVar.a);
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) epVar.a);
        canvas.drawRect(rectF, paint);
    }
}
