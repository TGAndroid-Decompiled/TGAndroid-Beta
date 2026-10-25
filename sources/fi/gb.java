package fi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class gb extends o6 {
    public final sb C0;

    public gb(sb sbVar, Activity activity, org.telegram.ui.Components.la laVar, n6 n6Var) {
        super(activity, laVar, n6Var);
        this.C0 = sbVar;
    }

    @Override
    public final void b() {
        w7 w7Var = this.d;
        if (w7Var != null && !w7Var.f11929u) {
            if (this.f11377n != null) {
                Matrix matrix = w7Var.f11916n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f11911k0;
                if (i10 < 0) {
                    i10 = this.f11369f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f11913l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f11907i0, getHeight() / this.d.f11909j0);
                Matrix matrix3 = this.f11374j0;
                matrix3.reset();
                this.f11373i0.invert(matrix3);
                this.f11377n.setTransform(matrix2);
                this.f11377n.invalidate();
            }
            invalidate();
        }
        this.C0.i();
    }

    @Override
    public final void i() {
        ta taVar;
        sb sbVar = this.C0;
        w7 w7Var = sbVar.K1;
        if (w7Var != null && w7Var.f11929u && w7Var.K && (taVar = sbVar.f11673v1) != null && taVar.G0 != null) {
            for (int i10 = 0; i10 < sbVar.f11673v1.G0.getChildCount(); i10++) {
                View childAt = sbVar.f11673v1.G0.getChildAt(i10);
                if (childAt instanceof sg.g1) {
                    ((sg.g1) childAt).s();
                }
            }
        }
    }
}
