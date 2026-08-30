package nh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ok0;
public final class h3 implements ok0 {
    public final d4 f15377a;

    public h3(d4 d4Var) {
        this.f15377a = d4Var;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i(View view, mg.q0 q0Var, boolean z4, boolean z10) {
        lh.p6 p6Var = new lh.p6(this, q0Var, view, 2);
        if (!z4) {
            this.f15377a.n0(p6Var);
        } else {
            p6Var.run();
        }
    }

    @Override
    public final boolean j() {
        ((z8) this.f15377a.N1).b(false);
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
