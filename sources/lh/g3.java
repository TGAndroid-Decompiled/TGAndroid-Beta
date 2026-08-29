package lh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ek0;
public final class g3 implements ek0 {
    public final d4 f15619a;

    public g3(d4 d4Var) {
        this.f15619a = d4Var;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        l3.m mVar = new l3.m(this, q0Var, view, 2);
        if (!z10) {
            this.f15619a.n0(mVar);
        } else {
            mVar.run();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean w() {
        ((z8) this.f15619a.M1).b(false);
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
