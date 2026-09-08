package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;
public final class k4 implements ek0 {
    public final o5 f3221a;

    public k4(o5 o5Var) {
        this.f3221a = o5Var;
    }

    @Override
    public final void B(View view, ah.j1 j1Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, j1Var, view, 4);
        if (!z10) {
            this.f3221a.n0(k0Var);
        } else {
            k0Var.run();
        }
    }

    @Override
    public final boolean S() {
        return false;
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean t() {
        ((gb) this.f3221a.Q1).b(false);
        return false;
    }

    @Override
    public final void J() {
    }

    @Override
    public final void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
