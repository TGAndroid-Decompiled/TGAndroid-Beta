package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class yb extends b7 {
    public final kc C0;

    public yb(kc kcVar, Activity activity, org.telegram.ui.Components.ka kaVar, a7 a7Var) {
        super(activity, kaVar, a7Var);
        this.C0 = kcVar;
    }

    @Override
    public final void b() {
        k8 k8Var = this.d;
        if (k8Var != null && !k8Var.f5351u) {
            if (this.f4754n != null) {
                Matrix matrix = k8Var.f5338n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f5333k0;
                if (i10 < 0) {
                    i10 = this.f4746f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f5335l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f5329i0, getHeight() / this.d.f5331j0);
                Matrix matrix3 = this.f4751j0;
                matrix3.reset();
                this.f4750i0.invert(matrix3);
                this.f4754n.setTransform(matrix2);
                this.f4754n.invalidate();
            }
            invalidate();
        }
        this.C0.j();
    }

    @Override
    public final void i() {
        mb mbVar;
        kc kcVar = this.C0;
        k8 k8Var = kcVar.K1;
        if (k8Var != null && k8Var.f5351u && k8Var.K && (mbVar = kcVar.f5442v1) != null && mbVar.R0 != null) {
            for (int i10 = 0; i10 < kcVar.f5442v1.R0.getChildCount(); i10++) {
                View childAt = kcVar.f5442v1.R0.getChildAt(i10);
                if (childAt instanceof qg.e1) {
                    ((qg.e1) childAt).s();
                }
            }
        }
    }
}
