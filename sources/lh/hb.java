package lh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

public final class hb extends q6 {

    public final sb f16082y0;

    public hb(sb sbVar, Activity activity, org.telegram.ui.Components.z9 z9Var, p6 p6Var) {
        super(activity, z9Var, p6Var);
        this.f16082y0 = sbVar;
    }

    @Override
    public final void b() {
        z7 z7Var = this.d;
        if (z7Var != null && !z7Var.f17235u) {
            if (this.f16575n != null) {
                Matrix matrix = z7Var.f17222n0;
                Matrix matrix2 = this.S;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f17217k0;
                if (i10 < 0) {
                    i10 = this.f16567f;
                }
                float f10 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f17219l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f10, height * i11);
                matrix2.postScale(getWidth() / this.d.f17213i0, getHeight() / this.d.f17215j0);
                Matrix matrix3 = this.f16568f0;
                matrix3.reset();
                this.f16566e0.invert(matrix3);
                this.f16575n.setTransform(matrix2);
                this.f16575n.invalidate();
            }
            invalidate();
        }
        this.f16082y0.j();
    }

    @Override
    public final void i() {
        va vaVar;
        sb sbVar = this.f16082y0;
        z7 z7Var = sbVar.G1;
        if (z7Var == null || !z7Var.f17235u || !z7Var.K || (vaVar = sbVar.f16798r1) == null || vaVar.N0 == null) {
            return;
        }
        for (int i10 = 0; i10 < sbVar.f16798r1.N0.getChildCount(); i10++) {
            View childAt = sbVar.f16798r1.N0.getChildAt(i10);
            if (childAt instanceof zf.e1) {
                ((zf.e1) childAt).s();
            }
        }
    }
}
