package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bl0;
public final class q3 implements bl0 {
    public final q4 f5763a;

    public q3(q4 q4Var) {
        this.f5763a = q4Var;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean m() {
        ((r9) this.f5763a.Q1).b(false);
        return false;
    }

    @Override
    public final void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 19);
        if (!z10) {
            this.f5763a.n0(l0Var);
        } else {
            l0Var.run();
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void v() {
    }

    @Override
    public final void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
