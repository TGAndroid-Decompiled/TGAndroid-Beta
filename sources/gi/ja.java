package gi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class ja extends y5 {
    public final va D0;

    public ja(va vaVar, Activity activity, org.telegram.ui.Components.x9 x9Var, x5 x5Var) {
        super(activity, x9Var, x5Var);
        this.D0 = vaVar;
    }

    @Override
    public final void b() {
        f7 f7Var = this.d;
        if (f7Var != null && !f7Var.f12744u) {
            if (this.f13953n != null) {
                Matrix matrix = f7Var.f12731n0;
                Matrix matrix2 = this.f13937a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i3 = this.d.f12726k0;
                if (i3 < 0) {
                    i3 = this.f13945f;
                }
                float f10 = width * i3;
                float height = 1.0f / getHeight();
                int i10 = this.d.f12728l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
                matrix2.postScale(getWidth() / this.d.f12722i0, getHeight() / this.d.f12724j0);
                Matrix matrix3 = this.f13951k0;
                matrix3.reset();
                this.f13950j0.invert(matrix3);
                this.f13953n.setTransform(matrix2);
                this.f13953n.invalidate();
            }
            invalidate();
        }
        this.D0.i();
    }

    @Override
    public final void i() {
        x9 x9Var;
        va vaVar = this.D0;
        f7 f7Var = vaVar.L1;
        if (f7Var != null && f7Var.f12744u && f7Var.K && (x9Var = vaVar.f13770w1) != null && x9Var.B0 != null) {
            for (int i3 = 0; i3 < vaVar.f13770w1.B0.getChildCount(); i3++) {
                View childAt = vaVar.f13770w1.B0.getChildAt(i3);
                if (childAt instanceof ug.t0) {
                    ((ug.t0) childAt).s();
                }
            }
        }
    }
}
