package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;
public final class n4 implements fl0 {
    public final q5 f3358a;

    public n4(q5 q5Var) {
        this.f3358a = q5Var;
    }

    @Override
    public final boolean D() {
        return false;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean n() {
        ((jb) this.f3358a.Q1).b(false);
        return false;
    }

    @Override
    public final void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 4);
        if (!z10) {
            this.f3358a.n0(l0Var);
        } else {
            l0Var.run();
        }
    }

    @Override
    public final void y() {
    }

    @Override
    public final void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
