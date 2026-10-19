package ei;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class jb extends r6 {
    public final vb C0;

    public jb(vb vbVar, Activity activity, org.telegram.ui.Components.ja jaVar, q6 q6Var) {
        super(activity, jaVar, q6Var);
        this.C0 = vbVar;
    }

    @Override
    public final void b() {
        a8 a8Var = this.d;
        if (a8Var != null && !a8Var.f8735u) {
            if (this.f9721n != null) {
                Matrix matrix = a8Var.f8722n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f8717k0;
                if (i10 < 0) {
                    i10 = this.f9713f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f8719l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f8713i0, getHeight() / this.d.f8715j0);
                Matrix matrix3 = this.f9718j0;
                matrix3.reset();
                this.f9717i0.invert(matrix3);
                this.f9721n.setTransform(matrix2);
                this.f9721n.invalidate();
            }
            invalidate();
        }
        this.C0.i();
    }

    @Override
    public final void i() {
        xa xaVar;
        vb vbVar = this.C0;
        a8 a8Var = vbVar.K1;
        if (a8Var != null && a8Var.f8735u && a8Var.K && (xaVar = vbVar.f10015v1) != null && xaVar.R0 != null) {
            for (int i10 = 0; i10 < vbVar.f10015v1.R0.getChildCount(); i10++) {
                View childAt = vbVar.f10015v1.R0.getChildAt(i10);
                if (childAt instanceof rg.e1) {
                    ((rg.e1) childAt).s();
                }
            }
        }
    }
}
