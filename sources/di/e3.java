package di;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.hi0;
public final class e3 implements hi0 {
    public final i4 f8958a;

    public e3(i4 i4Var) {
        this.f8958a = i4Var;
    }

    @Override
    public final boolean E() {
        return this.f8958a.L0();
    }

    @Override
    public final void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        i4 i4Var = this.f8958a;
        Paint paint = i4Var.W1;
        a8.b8 b8Var = i4Var.f9217y1;
        float f13 = -f11;
        float f14 = -f12;
        b8Var.k(f13, f14, i4Var.getMeasuredWidth() + f13, i4Var.getMeasuredHeight() + f14);
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
        ((g9) this.f8958a.f9221z1).b(false);
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        i4 i4Var = this.f8958a;
        if (!z9) {
            i4Var.l0(new aa.d0(this, view, o0Var, z9, z10));
        } else {
            org.telegram.ui.Components.v4.X(i4Var.f9168l2, 1, i4Var.f9164k1, new d3(this, z9, o0Var, view));
        }
    }

    @Override
    public final boolean v() {
        return true;
    }
}
