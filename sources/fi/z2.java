package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.li0;
public final class z2 implements li0 {
    public final b4 f12578a;

    public z2(b4 b4Var) {
        this.f12578a = b4Var;
    }

    @Override
    public final boolean B() {
        return this.f12578a.L0();
    }

    @Override
    public final void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        b4 b4Var = this.f12578a;
        Paint paint = b4Var.X1;
        a8.b8 b8Var = b4Var.f11547z1;
        float f13 = -f11;
        float f14 = -f12;
        b8Var.k(f13, f14, b4Var.getMeasuredWidth() + f13, b4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) b8Var.f341a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) b8Var.f341a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void K() {
        ((z8) this.f12578a.A1).b(false);
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        b4 b4Var = this.f12578a;
        if (!z10) {
            b4Var.l0(new aa.c0(this, view, p0Var, z10, z11));
        } else {
            org.telegram.ui.Components.t4.X(b4Var.f11497m2, 1, b4Var.l1, new y2(this, z10, p0Var, view));
        }
    }

    @Override
    public final boolean r() {
        return true;
    }
}
