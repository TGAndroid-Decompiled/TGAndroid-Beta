package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;
public final class l3 implements fl0 {
    public final q4 f8755a;

    public l3(q4 q4Var) {
        this.f8755a = q4Var;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean i() {
        return this.f8755a.L0();
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        q4 q4Var = this.f8755a;
        Paint paint = q4Var.f8970c2;
        aa.m0 m0Var = q4Var.E1;
        float f12 = -f10;
        float f13 = -f11;
        m0Var.w(f12, f13, q4Var.getMeasuredWidth() + f12, q4Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) m0Var.f1150a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) m0Var.f1150a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void m() {
        ((p9) this.f8755a.F1).b(false);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        q4 q4Var = this.f8755a;
        if (!z10) {
            q4Var.l0(new bi.s9(this, view, x0Var, z10, z11));
        } else {
            org.telegram.ui.Components.g5.Z(q4Var.f9020r2, 1, q4Var.f9015q1, new k3(this, z10, x0Var, view));
        }
    }
}
