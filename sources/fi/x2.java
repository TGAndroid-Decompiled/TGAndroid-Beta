package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ui0;
public final class x2 implements ui0 {
    public final z3 f12719a;

    public x2(z3 z3Var) {
        this.f12719a = z3Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        z3 z3Var = this.f12719a;
        if (!z10) {
            z3Var.l0(new aa.c0(this, view, p0Var, z10, z11));
        } else {
            org.telegram.ui.Components.b5.X(z3Var.f12847m2, 1, z3Var.l1, new w2(this, z10, p0Var, view));
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final boolean q() {
        return this.f12719a.L0();
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        z3 z3Var = this.f12719a;
        Paint paint = z3Var.X1;
        a8.b8 b8Var = z3Var.f12897z1;
        float f13 = -f11;
        float f14 = -f12;
        b8Var.k(f13, f14, z3Var.getMeasuredWidth() + f13, z3Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.f341a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) b8Var.f341a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void z() {
        ((w8) this.f12719a.A1).b(false);
    }
}
