package fi;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class ja extends y5 {
    public final va C0;

    public ja(va vaVar, Activity activity, org.telegram.ui.Components.x9 x9Var, x5 x5Var) {
        super(activity, x9Var, x5Var);
        this.C0 = vaVar;
    }

    @Override
    public final void b() {
        e7 e7Var = this.d;
        if (e7Var != null && !e7Var.f11922u) {
            if (this.f13181n != null) {
                Matrix matrix = e7Var.f11909n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i7 = this.d.f11904k0;
                if (i7 < 0) {
                    i7 = this.f13173f;
                }
                float f10 = width * i7;
                float height = 1.0f / getHeight();
                int i10 = this.d.f11906l0;
                if (i10 < 0) {
                    i10 = this.h;
                }
                matrix2.preScale(f10, height * i10);
                matrix2.postScale(getWidth() / this.d.f11900i0, getHeight() / this.d.f11902j0);
                Matrix matrix3 = this.f13178j0;
                matrix3.reset();
                this.f13177i0.invert(matrix3);
                this.f13181n.setTransform(matrix2);
                this.f13181n.invalidate();
            }
            invalidate();
        }
        this.C0.i();
    }

    @Override
    public final void i() {
        x9 x9Var;
        va vaVar = this.C0;
        e7 e7Var = vaVar.K1;
        if (e7Var != null && e7Var.f11922u && e7Var.K && (x9Var = vaVar.f13004v1) != null && x9Var.A0 != null) {
            for (int i7 = 0; i7 < vaVar.f13004v1.A0.getChildCount(); i7++) {
                View childAt = vaVar.f13004v1.A0.getChildAt(i7);
                if (childAt instanceof tg.u0) {
                    ((tg.u0) childAt).s();
                }
            }
        }
    }
}
