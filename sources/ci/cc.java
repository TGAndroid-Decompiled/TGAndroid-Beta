package ci;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class cc extends d7 {
    public final oc C0;

    public cc(oc ocVar, Activity activity, org.telegram.ui.Components.ha haVar, c7 c7Var) {
        super(activity, haVar, c7Var);
        this.C0 = ocVar;
    }

    @Override
    public final void b() {
        o8 o8Var = this.d;
        if (o8Var != null && !o8Var.f5178u) {
            if (this.f4515n != null) {
                Matrix matrix = o8Var.f5165n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f5160k0;
                if (i10 < 0) {
                    i10 = this.f4507f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f5162l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f5156i0, getHeight() / this.d.f5158j0);
                Matrix matrix3 = this.f4512j0;
                matrix3.reset();
                this.f4511i0.invert(matrix3);
                this.f4515n.setTransform(matrix2);
                this.f4515n.invalidate();
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
        if (o8Var != null && o8Var.f5178u && o8Var.K && (qbVar = ocVar.f5267v1) != null && qbVar.R0 != null) {
            for (int i10 = 0; i10 < ocVar.f5267v1.R0.getChildCount(); i10++) {
                View childAt = ocVar.f5267v1.R0.getChildAt(i10);
                if (childAt instanceof qg.h1) {
                    ((qg.h1) childAt).s();
                }
            }
        }
    }
}
