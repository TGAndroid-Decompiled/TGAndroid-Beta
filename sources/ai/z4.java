package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.rk0;
public final class z4 implements rk0 {
    public final e6 f1780a;

    public z4(e6 e6Var) {
        this.f1780a = e6Var;
    }

    @Override
    public final void i(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, p0Var, view, 1);
        if (!z10) {
            this.f1780a.n0(k0Var);
        } else {
            k0Var.run();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ((ac) this.f1780a.Q1).b(false);
        return false;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void p() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
