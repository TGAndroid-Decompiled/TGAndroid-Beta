package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.qk0;
public final class z4 implements qk0 {
    public final e6 f1778a;

    public z4(e6 e6Var) {
        this.f1778a = e6Var;
    }

    @Override
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, o0Var, view, 1);
        if (!z10) {
            this.f1778a.n0(k0Var);
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
        ((ac) this.f1778a.Q1).b(false);
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
