package nh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ok0;
public final class e3 implements ok0 {
    public final d4 f15285a;

    public e3(d4 d4Var) {
        this.f15285a = d4Var;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        d4 d4Var = this.f15285a;
        if (!z4) {
            d4Var.n0(new cg.u0(this, view, q0Var, z4, z10));
        } else {
            org.telegram.ui.Components.z4.a0(d4Var.f15243z2, 1, d4Var.f15238y1, new d3(this, z4, q0Var, view));
        }
    }

    @Override
    public final boolean k() {
        return this.f15285a.N0();
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        d4 d4Var = this.f15285a;
        Paint paint = d4Var.f15192k2;
        a9.a aVar = d4Var.M1;
        float f13 = -f11;
        float f14 = -f12;
        aVar.w(f13, f14, d4Var.getMeasuredWidth() + f13, d4Var.getMeasuredHeight() + f14);
        if (f10 > 0.0f) {
            canvas.drawRoundRect(rectF, f10, f10, (Paint) aVar.f142a);
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) aVar.f142a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void m() {
        ((z8) this.f15285a.N1).b(false);
    }

    @Override
    public final boolean o() {
        return false;
    }
}
