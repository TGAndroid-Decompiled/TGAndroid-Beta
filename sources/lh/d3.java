package lh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;
public final class d3 implements ek0 {
    public final d4 f15467a;

    public d3(d4 d4Var) {
        this.f15467a = d4Var;
    }

    @Override
    public final void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
        d4 d4Var = this.f15467a;
        Paint paint = d4Var.f15494j2;
        bg.c2 c2Var = d4Var.L1;
        float f12 = -f10;
        float f13 = -f11;
        c2Var.w(f12, f13, d4Var.getMeasuredWidth() + f12, d4Var.getMeasuredHeight() + f13);
        if (f9 > 0.0f) {
            canvas.drawRoundRect(rectF, f9, f9, (Paint) c2Var.d);
            canvas.drawRoundRect(rectF, f9, f9, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) c2Var.d);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void H() {
        ((z8) this.f15467a.M1).b(false);
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        d4 d4Var = this.f15467a;
        if (!z10) {
            d4Var.n0(new ag.w0(this, view, q0Var, z10, z11));
        } else {
            org.telegram.ui.Components.c5.a0(d4Var.f15545y2, 1, d4Var.f15540x1, new c3(this, z10, q0Var, view));
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean w() {
        return this.f15467a.N0();
    }
}
