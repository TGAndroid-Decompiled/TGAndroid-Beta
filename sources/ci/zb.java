package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class zb extends b7 {
    public final lc C0;

    public zb(lc lcVar, Activity activity, org.telegram.ui.Components.la laVar, a7 a7Var) {
        super(activity, laVar, a7Var);
        this.C0 = lcVar;
    }

    @Override
    public final void b() {
        l8 l8Var = this.d;
        if (l8Var != null && !l8Var.f5435u) {
            if (this.f4772n != null) {
                Matrix matrix = l8Var.f5422n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f5417k0;
                if (i10 < 0) {
                    i10 = this.f4764f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f5419l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f5413i0, getHeight() / this.d.f5415j0);
                Matrix matrix3 = this.f4769j0;
                matrix3.reset();
                this.f4768i0.invert(matrix3);
                this.f4772n.setTransform(matrix2);
                this.f4772n.invalidate();
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
        if (l8Var != null && l8Var.f5435u && l8Var.K && (nbVar = lcVar.f5526v1) != null && nbVar.R0 != null) {
            for (int i10 = 0; i10 < lcVar.f5526v1.R0.getChildCount(); i10++) {
                View childAt = lcVar.f5526v1.R0.getChildAt(i10);
                if (childAt instanceof qg.e1) {
                    ((qg.e1) childAt).s();
                }
            }
        }
    }
}
