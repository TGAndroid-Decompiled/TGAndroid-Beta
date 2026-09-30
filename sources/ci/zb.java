package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class zb extends b7 {
    public final lc C0;

    public zb(lc lcVar, Activity activity, org.telegram.ui.Components.ka kaVar, a7 a7Var) {
        super(activity, kaVar, a7Var);
        this.C0 = lcVar;
    }

    @Override
    public final void b() {
        l8 l8Var = this.d;
        if (l8Var != null && !l8Var.f5012u) {
            if (this.f4400n != null) {
                Matrix matrix = l8Var.f4999n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f4994k0;
                if (i10 < 0) {
                    i10 = this.f4392f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f4996l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f4990i0, getHeight() / this.d.f4992j0);
                Matrix matrix3 = this.f4397j0;
                matrix3.reset();
                this.f4396i0.invert(matrix3);
                this.f4400n.setTransform(matrix2);
                this.f4400n.invalidate();
            }
            invalidate();
        }
        this.C0.j();
    }

    @Override
    public final void i() {
        nb nbVar;
        lc lcVar = this.C0;
        l8 l8Var = lcVar.K1;
        if (l8Var != null && l8Var.f5012u && l8Var.K && (nbVar = lcVar.f5101v1) != null && nbVar.R0 != null) {
            for (int i10 = 0; i10 < lcVar.f5101v1.R0.getChildCount(); i10++) {
                View childAt = lcVar.f5101v1.R0.getChildAt(i10);
                if (childAt instanceof qg.f1) {
                    ((qg.f1) childAt).s();
                }
            }
        }
    }
}
