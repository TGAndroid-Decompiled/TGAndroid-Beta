package hi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class ga extends v5 {
    public final sa D0;

    public ga(sa saVar, Activity activity, org.telegram.ui.Components.ca caVar, u5 u5Var) {
        super(activity, caVar, u5Var);
        this.D0 = saVar;
    }

    @Override
    public final void b() {
        c7 c7Var = this.d;
        if (c7Var != null && !c7Var.f14377u) {
            if (this.f15633n != null) {
                Matrix matrix = c7Var.f14364n0;
                Matrix matrix2 = this.f15617a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i7 = this.d.f14359k0;
                if (i7 < 0) {
                    i7 = this.f15625f;
                }
                float f10 = width * i7;
                float height = 1.0f / getHeight();
                int i10 = this.d.f14361l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
                matrix2.postScale(getWidth() / this.d.f14355i0, getHeight() / this.d.f14357j0);
                Matrix matrix3 = this.f15631k0;
                matrix3.reset();
                this.f15630j0.invert(matrix3);
                this.f15633n.setTransform(matrix2);
                this.f15633n.invalidate();
            }
            invalidate();
        }
        this.D0.i();
    }

    @Override
    public final void i() {
        u9 u9Var;
        sa saVar = this.D0;
        c7 c7Var = saVar.L1;
        if (c7Var != null && c7Var.f14377u && c7Var.K && (u9Var = saVar.f15453w1) != null && u9Var.B0 != null) {
            for (int i7 = 0; i7 < saVar.f15453w1.B0.getChildCount(); i7++) {
                View childAt = saVar.f15453w1.B0.getChildAt(i7);
                if (childAt instanceof tg.v0) {
                    ((tg.v0) childAt).s();
                }
            }
        }
    }
}
