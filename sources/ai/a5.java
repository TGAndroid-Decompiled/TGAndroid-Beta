package ai;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ml0;
public final class a5 implements ml0 {
    public final f6 f644a;

    public a5(f6 f6Var) {
        this.f644a = f6Var;
    }

    @Override
    public final void h(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        a3.k0 k0Var = new a3.k0(this, n0Var, view, 1);
        if (!z10) {
            this.f644a.n0(k0Var);
        } else {
            k0Var.run();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ((bc) this.f644a.Q1).b(false);
        return false;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void p() {
    }

    @Override
    public final void o(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
