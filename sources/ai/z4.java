package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ok0;
public final class z4 implements ok0 {
    public final f6 f1784a;

    public z4(f6 f6Var) {
        this.f1784a = f6Var;
    }

    @Override
    public final void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, o0Var, view, 1);
        if (!z10) {
            this.f1784a.n0(k0Var);
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
        ((ac) this.f1784a.Q1).b(false);
        return false;
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
