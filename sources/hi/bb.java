package hi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class bb extends f6 {
    public final nb D0;

    public bb(nb nbVar, Activity activity, org.telegram.ui.Components.ba baVar, e6 e6Var) {
        super(activity, baVar, e6Var);
        this.D0 = nbVar;
    }

    @Override
    public final void b() {
        x7 x7Var = this.d;
        if (x7Var != null && !x7Var.f15775u) {
            if (this.f14461n != null) {
                Matrix matrix = x7Var.f15762n0;
                Matrix matrix2 = this.f14445a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i7 = this.d.f15757k0;
                if (i7 < 0) {
                    i7 = this.f14453f;
                }
                float f10 = width * i7;
                float height = 1.0f / getHeight();
                int i10 = this.d.f15759l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
                matrix2.postScale(getWidth() / this.d.f15753i0, getHeight() / this.d.f15755j0);
                Matrix matrix3 = this.f14459k0;
                matrix3.reset();
                this.f14458j0.invert(matrix3);
                this.f14461n.setTransform(matrix2);
                this.f14461n.invalidate();
            }
            invalidate();
        }
        this.D0.i();
    }

    @Override
    public final void i() {
        pa paVar;
        nb nbVar = this.D0;
        x7 x7Var = nbVar.L1;
        if (x7Var != null && x7Var.f15775u && x7Var.K && (paVar = nbVar.f15126w1) != null && paVar.B0 != null) {
            for (int i7 = 0; i7 < nbVar.f15126w1.B0.getChildCount(); i7++) {
                View childAt = nbVar.f15126w1.B0.getChildAt(i7);
                if (childAt instanceof tg.z0) {
                    ((tg.z0) childAt).s();
                }
            }
        }
    }
}
