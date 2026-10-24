package ei;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class jb extends r6 {
    public final vb C0;

    public jb(vb vbVar, Activity activity, org.telegram.ui.Components.ha haVar, q6 q6Var) {
        super(activity, haVar, q6Var);
        this.C0 = vbVar;
    }

    @Override
    public final void b() {
        a8 a8Var = this.d;
        if (a8Var != null && !a8Var.f8744u) {
            if (this.f9737n != null) {
                Matrix matrix = a8Var.f8731n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f8726k0;
                if (i10 < 0) {
                    i10 = this.f9729f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f8728l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f8722i0, getHeight() / this.d.f8724j0);
                Matrix matrix3 = this.f9734j0;
                matrix3.reset();
                this.f9733i0.invert(matrix3);
                this.f9737n.setTransform(matrix2);
                this.f9737n.invalidate();
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
        if (a8Var != null && a8Var.f8744u && a8Var.K && (xaVar = vbVar.f10032v1) != null && xaVar.R0 != null) {
            for (int i10 = 0; i10 < vbVar.f10032v1.R0.getChildCount(); i10++) {
                View childAt = vbVar.f10032v1.R0.getChildAt(i10);
                if (childAt instanceof rg.f1) {
                    ((rg.f1) childAt).s();
                }
            }
        }
    }
}
