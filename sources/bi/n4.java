package bi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;
public final class n4 implements fl0 {
    public final q5 f3362a;

    public n4(q5 q5Var) {
        this.f3362a = q5Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean m() {
        ((jb) this.f3362a.Q1).b(false);
        return false;
    }

    @Override
    public final void n(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 4);
        if (!z10) {
            this.f3362a.n0(l0Var);
        } else {
            l0Var.run();
        }
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void y() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
