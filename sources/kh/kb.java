package kh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class kb extends r6 {
    public final wb f15555y0;

    public kb(wb wbVar, Activity activity, org.telegram.ui.Components.ba baVar, q6 q6Var) {
        super(activity, baVar, q6Var);
        this.f15555y0 = wbVar;
    }

    @Override
    public final void b() {
        a8 a8Var = this.d;
        if (a8Var != null && !a8Var.f14943u) {
            if (this.f15946n != null) {
                Matrix matrix = a8Var.f14930n0;
                Matrix matrix2 = this.S;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i9 = this.d.f14925k0;
                if (i9 < 0) {
                    i9 = this.f15938f;
                }
                float f10 = width * i9;
                float height = 1.0f / getHeight();
                int i10 = this.d.f14927l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
                matrix2.postScale(getWidth() / this.d.f14921i0, getHeight() / this.d.f14923j0);
                Matrix matrix3 = this.f15939f0;
                matrix3.reset();
                this.f15937e0.invert(matrix3);
                this.f15946n.setTransform(matrix2);
                this.f15946n.invalidate();
            }
            invalidate();
        }
        this.f15555y0.j();
    }

    @Override
    public final void i() {
        ya yaVar;
        wb wbVar = this.f15555y0;
        a8 a8Var = wbVar.G1;
        if (a8Var != null && a8Var.f14943u && a8Var.K && (yaVar = wbVar.f16302r1) != null && yaVar.N0 != null) {
            for (int i9 = 0; i9 < wbVar.f16302r1.N0.getChildCount(); i9++) {
                View childAt = wbVar.f16302r1.N0.getChildAt(i9);
                if (childAt instanceof yf.e1) {
                    ((yf.e1) childAt).s();
                }
            }
        }
    }
}
