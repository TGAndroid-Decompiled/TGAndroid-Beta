package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;
public final class p3 implements fl0 {
    public final q4 f8898a;

    public p3(q4 q4Var) {
        this.f8898a = q4Var;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean i() {
        ((p9) this.f8898a.F1).b(false);
        return false;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, x0Var, view, 21);
        if (!z10) {
            this.f8898a.l0(l0Var);
        } else {
            l0Var.run();
        }
    }

    @Override
    public final void m() {
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
