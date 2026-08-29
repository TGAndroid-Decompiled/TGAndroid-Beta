package nh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class va extends f6 {
    public final gb f18766y0;

    public va(gb gbVar, Activity activity, org.telegram.ui.Components.ga gaVar, e6 e6Var) {
        super(activity, gaVar, e6Var);
        this.f18766y0 = gbVar;
    }

    @Override
    public final void b() {
        o7 o7Var = this.d;
        if (o7Var != null && !o7Var.f18296u) {
            if (this.f17661n != null) {
                Matrix matrix = o7Var.f18283n0;
                Matrix matrix2 = this.S;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f18278k0;
                if (i10 < 0) {
                    i10 = this.f17653f;
                }
                float f9 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f18280l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f9, height * i11);
                matrix2.postScale(getWidth() / this.d.f18274i0, getHeight() / this.d.f18276j0);
                Matrix matrix3 = this.f17654f0;
                matrix3.reset();
                this.f17652e0.invert(matrix3);
                this.f17661n.setTransform(matrix2);
                this.f17661n.invalidate();
            }
            invalidate();
        }
        this.f18766y0.j();
    }

    @Override
    public final void i() {
        ja jaVar;
        gb gbVar = this.f18766y0;
        o7 o7Var = gbVar.G1;
        if (o7Var != null && o7Var.f18296u && o7Var.K && (jaVar = gbVar.f17792r1) != null && jaVar.N0 != null) {
            for (int i10 = 0; i10 < gbVar.f17792r1.N0.getChildCount(); i10++) {
                View childAt = gbVar.f17792r1.N0.getChildAt(i10);
                if (childAt instanceof bg.d2) {
                    ((bg.d2) childAt).s();
                }
            }
        }
    }
}
