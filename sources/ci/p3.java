package ci;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.fl0;
public final class p3 implements fl0 {
    public final p4 f5648a;

    public p3(p4 p4Var) {
        this.f5648a = p4Var;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final boolean l() {
        ((q9) this.f5648a.Q1).b(false);
        return false;
    }

    @Override
    public final void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        a3.l0 l0Var = new a3.l0(this, i1Var, view, 19);
        if (!z10) {
            this.f5648a.m0(l0Var);
        } else {
            l0Var.run();
        }
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void u() {
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
