package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
public final class i7b extends zi8 {
    public final t7b D0;

    public i7b(t7b t7bVar, Context context, sl0 sl0Var, n00 n00Var) {
        super(context, sl0Var, n00Var);
        this.D0 = t7bVar;
    }

    @Override
    public final void a() {
        f4b f4bVar = this.d;
        if (f4bVar != null && !f4bVar.u) {
            if (this.n != null) {
                Matrix matrix = f4bVar.n0;
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
        x6b x6bVar;
        t7b t7bVar = this.D0;
        f4b f4bVar = t7bVar.L1;
        if (f4bVar != null && f4bVar.u && f4bVar.K && (x6bVar = t7bVar.w1) != null && x6bVar.H0 != null) {
            for (int i = 0; i < t7bVar.w1.H0.getChildCount(); i++) {
                View childAt = t7bVar.w1.H0.getChildAt(i);
                if (childAt instanceof u17) {
                    ((u17) childAt).s();
                }
            }
        }
    }
}
