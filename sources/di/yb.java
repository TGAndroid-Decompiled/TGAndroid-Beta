package di;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class yb extends a7 {
    public final kc C0;

    public yb(kc kcVar, Activity activity, org.telegram.ui.Components.la laVar, z6 z6Var) {
        super(activity, laVar, z6Var);
        this.C0 = kcVar;
    }

    @Override
    public final void b() {
        k8 k8Var = this.d;
        if (k8Var != null && !k8Var.f7213u) {
            if (this.f6609n != null) {
                Matrix matrix = k8Var.f7200n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f7195k0;
                if (i10 < 0) {
                    i10 = this.f6601f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f7197l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f7191i0, getHeight() / this.d.f7193j0);
                Matrix matrix3 = this.f6606j0;
                matrix3.reset();
                this.f6605i0.invert(matrix3);
                this.f6609n.setTransform(matrix2);
                this.f6609n.invalidate();
            }
            invalidate();
        }
        this.C0.i();
    }

    @Override
    public final void i() {
        mb mbVar;
        kc kcVar = this.C0;
        k8 k8Var = kcVar.K1;
        if (k8Var != null && k8Var.f7213u && k8Var.K && (mbVar = kcVar.f7302v1) != null && mbVar.R0 != null) {
            for (int i10 = 0; i10 < kcVar.f7302v1.R0.getChildCount(); i10++) {
                View childAt = kcVar.f7302v1.R0.getChildAt(i10);
                if (childAt instanceof rg.g1) {
                    ((rg.g1) childAt).s();
                }
            }
        }
    }
}
