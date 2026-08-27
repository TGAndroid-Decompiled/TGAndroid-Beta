package jh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.vj0;

public final class i3 implements vj0 {

    public final e4 f13436a;

    public i3(e4 e4Var) {
        this.f13436a = e4Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean m() {
        ((z8) this.f13436a.M1).b(false);
        return false;
    }

    @Override
    public final void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        j3.m mVar = new j3.m(this, q0Var, view, 2);
        if (z10) {
            mVar.run();
        } else {
            this.f13436a.n0(mVar);
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void s() {
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
