package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.wi0;
public final class b3 implements wi0 {
    public final z3 f11759a;

    public b3(z3 z3Var) {
        this.f11759a = z3Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        di.a8 a8Var = new di.a8(this, p0Var, view, 2);
        if (!z10) {
            this.f11759a.l0(a8Var);
        } else {
            a8Var.run();
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final boolean q() {
        ((w8) this.f11759a.A1).b(false);
        return false;
    }

    @Override
    public final void z() {
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
