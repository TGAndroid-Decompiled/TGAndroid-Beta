package defpackage;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class k9b extends cl8 {
    public final v9b D0;

    public k9b(v9b v9bVar, Activity activity, sm0 sm0Var, n10 n10Var) {
        super(activity, sm0Var, n10Var);
        this.D0 = v9bVar;
    }

    @Override
    public final void a() {
        g6b g6bVar = this.d;
        if (g6bVar != null && !g6bVar.u) {
            if (this.n != null) {
                Matrix matrix = g6bVar.n0;
                Matrix matrix2 = this.a0;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i = this.d.k0;
                if (i < 0) {
                    i = this.f;
                }
                float f = width * i;
                float height = 1.0f / getHeight();
                int i2 = this.d.l0;
                if (i2 < 0) {
                    i2 = this.h;
                }
                matrix2.preScale(f, height * i2);
                matrix2.postScale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                Matrix matrix3 = this.k0;
                matrix3.reset();
                this.j0.invert(matrix3);
                this.n.setTransform(matrix2);
                this.n.invalidate();
            }
            invalidate();
        }
        this.D0.g();
    }

    @Override
    public final void h() {
        z8b z8bVar;
        v9b v9bVar = this.D0;
        g6b g6bVar = v9bVar.L1;
        if (g6bVar != null && g6bVar.u && g6bVar.K && (z8bVar = v9bVar.w1) != null && z8bVar.H0 != null) {
            for (int i = 0; i < v9bVar.w1.H0.getChildCount(); i++) {
                View childAt = v9bVar.w1.H0.getChildAt(i);
                if (childAt instanceof u37) {
                    ((u37) childAt).s();
                }
            }
        }
    }
}
