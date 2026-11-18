package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import di.ga;
import org.telegram.ui.Components.ui0;
public final class b3 implements ui0 {
    public final z3 f11764a;

    public b3(z3 z3Var) {
        this.f11764a = z3Var;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        ga gaVar = new ga(this, p0Var, view, 1);
        if (!z10) {
            this.f11764a.l0(gaVar);
        } else {
            gaVar.run();
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final boolean q() {
        ((w8) this.f11764a.A1).b(false);
        return false;
    }

    @Override
    public final void z() {
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
