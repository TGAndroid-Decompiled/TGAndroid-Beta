package hi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class ga extends x5 {
    public final sa D0;

    public ga(sa saVar, Activity activity, org.telegram.ui.Components.u9 u9Var, w5 w5Var) {
        super(activity, u9Var, w5Var);
        this.D0 = saVar;
    }

    @Override
    public final void b() {
        d7 d7Var = this.d;
        if (d7Var != null && !d7Var.f14165u) {
            if (this.f15355n != null) {
                Matrix matrix = d7Var.f14152n0;
                Matrix matrix2 = this.f15339a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i7 = this.d.f14147k0;
                if (i7 < 0) {
                    i7 = this.f15347f;
                }
                float f10 = width * i7;
                float height = 1.0f / getHeight();
                int i10 = this.d.f14149l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
                matrix2.postScale(getWidth() / this.d.f14143i0, getHeight() / this.d.f14145j0);
                Matrix matrix3 = this.f15353k0;
                matrix3.reset();
                this.f15352j0.invert(matrix3);
                this.f15355n.setTransform(matrix2);
                this.f15355n.invalidate();
            }
            invalidate();
        }
        this.D0.i();
    }

    @Override
    public final void i() {
        u9 u9Var;
        sa saVar = this.D0;
        d7 d7Var = saVar.L1;
        if (d7Var != null && d7Var.f14165u && d7Var.K && (u9Var = saVar.f15107w1) != null && u9Var.B0 != null) {
            for (int i7 = 0; i7 < saVar.f15107w1.B0.getChildCount(); i7++) {
                View childAt = saVar.f15107w1.B0.getChildAt(i7);
                if (childAt instanceof tg.u0) {
                    ((tg.u0) childAt).s();
                }
            }
        }
    }
}
