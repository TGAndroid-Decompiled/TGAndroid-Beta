package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.rk0;
public final class z4 implements rk0 {
    public final e6 f1933a;

    public z4(e6 e6Var) {
        this.f1933a = e6Var;
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public final boolean E() {
        ((ac) this.f1933a.Q1).b(false);
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final void i(View view, zg.m0 m0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, m0Var, view, 1);
        if (!z10) {
            this.f1933a.n0(k0Var);
        } else {
            k0Var.run();
        }
    }

    @Override
    public final void I() {
    }

    @Override
    public final void H(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
