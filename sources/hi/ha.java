package hi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class ha extends w5 {
    public final ta D0;

    public ha(ta taVar, Activity activity, org.telegram.ui.Components.ca caVar, v5 v5Var) {
        super(activity, caVar, v5Var);
        this.D0 = taVar;
    }

    @Override
    public final void b() {
        d7 d7Var = this.d;
        if (d7Var != null && !d7Var.f14430u) {
            if (this.f15663n != null) {
                Matrix matrix = d7Var.f14417n0;
                Matrix matrix2 = this.f15647a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i7 = this.d.f14412k0;
                if (i7 < 0) {
                    i7 = this.f15655f;
                }
                float f10 = width * i7;
                float height = 1.0f / getHeight();
                int i10 = this.d.f14414l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
                matrix2.postScale(getWidth() / this.d.f14408i0, getHeight() / this.d.f14410j0);
                Matrix matrix3 = this.f15661k0;
                matrix3.reset();
                this.f15660j0.invert(matrix3);
                this.f15663n.setTransform(matrix2);
                this.f15663n.invalidate();
            }
            invalidate();
        }
        this.D0.i();
    }

    @Override
    public final void i() {
        v9 v9Var;
        ta taVar = this.D0;
        d7 d7Var = taVar.L1;
        if (d7Var != null && d7Var.f14430u && d7Var.K && (v9Var = taVar.f15495w1) != null && v9Var.B0 != null) {
            for (int i7 = 0; i7 < taVar.f15495w1.B0.getChildCount(); i7++) {
                View childAt = taVar.f15495w1.B0.getChildAt(i7);
                if (childAt instanceof tg.u0) {
                    ((tg.u0) childAt).s();
                }
            }
        }
    }
}
