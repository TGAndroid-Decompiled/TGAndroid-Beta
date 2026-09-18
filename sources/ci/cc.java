package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class cc extends d7 {
    public final oc C0;

    public cc(oc ocVar, Activity activity, org.telegram.ui.Components.ja jaVar, c7 c7Var) {
        super(activity, jaVar, c7Var);
        this.C0 = ocVar;
    }

    @Override
    public final void b() {
        o8 o8Var = this.d;
        if (o8Var != null && !o8Var.f5183u) {
            if (this.f4520n != null) {
                Matrix matrix = o8Var.f5170n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f5165k0;
                if (i10 < 0) {
                    i10 = this.f4512f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f5167l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f5161i0, getHeight() / this.d.f5163j0);
                Matrix matrix3 = this.f4517j0;
                matrix3.reset();
                this.f4516i0.invert(matrix3);
                this.f4520n.setTransform(matrix2);
                this.f4520n.invalidate();
            }
            invalidate();
        }
        this.C0.j();
    }

    @Override
    public final void i() {
        qb qbVar;
        oc ocVar = this.C0;
        o8 o8Var = ocVar.K1;
        if (o8Var != null && o8Var.f5183u && o8Var.K && (qbVar = ocVar.f5272v1) != null && qbVar.R0 != null) {
            for (int i10 = 0; i10 < ocVar.f5272v1.R0.getChildCount(); i10++) {
                View childAt = ocVar.f5272v1.R0.getChildAt(i10);
                if (childAt instanceof qg.e1) {
                    ((qg.e1) childAt).s();
                }
            }
        }
    }
}
