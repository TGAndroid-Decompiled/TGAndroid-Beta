package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bl0;
public final class p3 implements bl0 {
    public final p4 f5644a;

    public p3(p4 p4Var) {
        this.f5644a = p4Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ((q9) this.f5644a.Q1).b(false);
        return false;
    }

    @Override
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 19);
        if (!z10) {
            this.f5644a.n0(l0Var);
        } else {
            l0Var.run();
        }
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void q() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
