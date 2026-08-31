package oh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.qk0;
public final class i3 implements qk0 {
    public final f4 f17206a;

    public i3(f4 f4Var) {
        this.f17206a = f4Var;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final boolean h() {
        ((z8) this.f17206a.N1).b(false);
        return false;
    }

    @Override
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        mh.p6 p6Var = new mh.p6(this, q0Var, view, 4);
        if (!z4) {
            this.f17206a.n0(p6Var);
        } else {
            p6Var.run();
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void m() {
    }

    @Override
    public final void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
