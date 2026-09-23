package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class zb extends b7 {
    public final lc C0;

    public zb(lc lcVar, Activity activity, org.telegram.ui.Components.ja jaVar, a7 a7Var) {
        super(activity, jaVar, a7Var);
        this.C0 = lcVar;
    }

    @Override
    public final void b() {
        l8 l8Var = this.d;
        if (l8Var != null && !l8Var.f5005u) {
            if (this.f4393n != null) {
                Matrix matrix = l8Var.f4992n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f4987k0;
                if (i10 < 0) {
                    i10 = this.f4385f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f4989l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f4983i0, getHeight() / this.d.f4985j0);
                Matrix matrix3 = this.f4390j0;
                matrix3.reset();
                this.f4389i0.invert(matrix3);
                this.f4393n.setTransform(matrix2);
                this.f4393n.invalidate();
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
        if (l8Var != null && l8Var.f5005u && l8Var.K && (nbVar = lcVar.f5094v1) != null && nbVar.R0 != null) {
            for (int i10 = 0; i10 < lcVar.f5094v1.R0.getChildCount(); i10++) {
                View childAt = lcVar.f5094v1.R0.getChildAt(i10);
                if (childAt instanceof qg.h1) {
                    ((qg.h1) childAt).s();
                }
            }
        }
    }
}
