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
        if (o8Var != null && !o8Var.f7782u) {
            if (this.f7085n != null) {
                Matrix matrix = o8Var.f7769n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.f7764k0;
                if (i10 < 0) {
                    i10 = this.f7077f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.f7766l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.f7760i0, getHeight() / this.d.f7762j0);
                Matrix matrix3 = this.f7082j0;
                matrix3.reset();
                this.f7081i0.invert(matrix3);
                this.f7085n.setTransform(matrix2);
                this.f7085n.invalidate();
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
        if (o8Var != null && o8Var.f7782u && o8Var.K && (rbVar = pcVar.f7910v1) != null && rbVar.R0 != null) {
            for (int i10 = 0; i10 < pcVar.f7910v1.R0.getChildCount(); i10++) {
                View childAt = pcVar.f7910v1.R0.getChildAt(i10);
                if (childAt instanceof rg.g1) {
                    ((rg.g1) childAt).s();
                }
            }
        }
    }
}
