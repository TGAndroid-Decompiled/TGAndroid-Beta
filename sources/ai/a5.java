package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.kl0;
public final class a5 implements kl0 {
    public final f6 f642a;

    public a5(f6 f6Var) {
        this.f642a = f6Var;
    }

    @Override
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, n0Var, view, 1);
        if (!z10) {
            this.f642a.n0(k0Var);
        } else {
            k0Var.run();
        }
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final boolean q() {
        ((bc) this.f642a.Q1).b(false);
        return false;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
