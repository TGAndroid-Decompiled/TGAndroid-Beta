package di;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
public final class dc extends d7 {
    public final pc C0;

    public dc(pc pcVar, Activity activity, org.telegram.ui.Components.ja jaVar, c7 c7Var) {
        super(activity, jaVar, c7Var);
        this.C0 = pcVar;
    }

    @Override
    public final void b() {
        o8 o8Var = this.d;
        if (o8Var != null && !o8Var.f7810u) {
            if (this.f7113n != null) {
                Matrix matrix = o8Var.f7797n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f7792k0;
                if (i10 < 0) {
                    i10 = this.f7105f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f7794l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f7788i0, getHeight() / this.d.f7790j0);
                Matrix matrix3 = this.f7110j0;
                matrix3.reset();
                this.f7109i0.invert(matrix3);
                this.f7113n.setTransform(matrix2);
                this.f7113n.invalidate();
            }
            invalidate();
        }
        this.C0.j();
    }

    @Override
    public final void i() {
        rb rbVar;
        pc pcVar = this.C0;
        o8 o8Var = pcVar.K1;
        if (o8Var != null && o8Var.f7810u && o8Var.K && (rbVar = pcVar.f7938v1) != null && rbVar.R0 != null) {
            for (int i10 = 0; i10 < pcVar.f7938v1.R0.getChildCount(); i10++) {
                View childAt = pcVar.f7938v1.R0.getChildAt(i10);
                if (childAt instanceof rg.g1) {
                    ((rg.g1) childAt).s();
                }
            }
        }
    }
}
