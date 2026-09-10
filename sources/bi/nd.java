package bi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class nd extends e8 {
    public final ce C0;

    public nd(ce ceVar, Activity activity, org.telegram.ui.Components.ia iaVar, d8 d8Var) {
        super(activity, iaVar, d8Var);
        this.C0 = ceVar;
    }

    @Override
    public final void b() {
        r9 r9Var = this.d;
        if (r9Var != null && !r9Var.f3600u) {
            if (this.f2647n != null) {
                Matrix matrix = r9Var.f3587n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f3582k0;
                if (i10 < 0) {
                    i10 = this.f2639f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f3584l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f3578i0, getHeight() / this.d.f3580j0);
                Matrix matrix3 = this.f2644j0;
                matrix3.reset();
                this.f2643i0.invert(matrix3);
                this.f2647n.setTransform(matrix2);
                this.f2647n.invalidate();
            }
            invalidate();
        }
        this.C0.j();
    }

    @Override
    public final void i() {
        ad adVar;
        ce ceVar = this.C0;
        r9 r9Var = ceVar.K1;
        if (r9Var != null && r9Var.f3600u && r9Var.K && (adVar = ceVar.f2498v1) != null && adVar.R0 != null) {
            for (int i10 = 0; i10 < ceVar.f2498v1.R0.getChildCount(); i10++) {
                View childAt = ceVar.f2498v1.R0.getChildAt(i10);
                if (childAt instanceof pg.e1) {
                    ((pg.e1) childAt).s();
                }
            }
        }
    }
}
