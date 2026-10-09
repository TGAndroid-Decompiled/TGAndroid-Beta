package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class zb extends b7 {
    public final lc C0;

    public zb(lc lcVar, Activity activity, org.telegram.ui.Components.ma maVar, a7 a7Var) {
        super(activity, maVar, a7Var);
        this.C0 = lcVar;
    }

    @Override
    public final void b() {
        l8 l8Var = this.d;
        if (l8Var != null && !l8Var.f5436u) {
            if (this.f4773n != null) {
                Matrix matrix = l8Var.f5423n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f5418k0;
                if (i10 < 0) {
                    i10 = this.f4765f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f5420l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f5414i0, getHeight() / this.d.f5416j0);
                Matrix matrix3 = this.f4770j0;
                matrix3.reset();
                this.f4769i0.invert(matrix3);
                this.f4773n.setTransform(matrix2);
                this.f4773n.invalidate();
            }
            invalidate();
        }
        this.C0.i();
    }

    @Override
    public final void i() {
        nb nbVar;
        lc lcVar = this.C0;
        l8 l8Var = lcVar.K1;
        if (l8Var != null && l8Var.f5436u && l8Var.K && (nbVar = lcVar.f5527v1) != null && nbVar.R0 != null) {
            for (int i10 = 0; i10 < lcVar.f5527v1.R0.getChildCount(); i10++) {
                View childAt = lcVar.f5527v1.R0.getChildAt(i10);
                if (childAt instanceof qg.e1) {
                    ((qg.e1) childAt).s();
                }
            }
        }
    }
}
