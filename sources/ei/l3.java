package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ki0;
public final class l3 implements ki0 {
    public final j4 f10604a;

    public l3(j4 j4Var) {
        this.f10604a = j4Var;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean v() {
        ((i9) this.f10604a.A1).b(false);
        return false;
    }

    @Override
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        ai.k3 k3Var = new ai.k3(this, n0Var, view, 24);
        if (!z10) {
            this.f10604a.l0(k3Var);
        } else {
            k3Var.run();
        }
    }

    @Override
    public final void J() {
    }

    @Override
    public final void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
