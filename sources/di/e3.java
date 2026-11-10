package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.hi0;
public final class e3 implements hi0 {
    public final j4 f8951a;

    public e3(j4 j4Var) {
        this.f8951a = j4Var;
    }

    @Override
    public final boolean E() {
        return this.f8951a.L0();
    }

    @Override
    public final void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        j4 j4Var = this.f8951a;
        Paint paint = j4Var.W1;
        a8.b8 b8Var = j4Var.f9254y1;
        float f13 = -f11;
        float f14 = -f12;
        b8Var.k(f13, f14, j4Var.getMeasuredWidth() + f13, j4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.f335a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) b8Var.f335a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void M() {
        ((h9) this.f8951a.f9258z1).b(false);
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        j4 j4Var = this.f8951a;
        if (!z9) {
            j4Var.l0(new aa.d0(this, view, o0Var, z9, z10));
        } else {
            org.telegram.ui.Components.u4.X(j4Var.f9205l2, 1, j4Var.f9201k1, new d3(this, z9, o0Var, view));
        }
    }

    @Override
    public final boolean v() {
        return true;
    }
}
