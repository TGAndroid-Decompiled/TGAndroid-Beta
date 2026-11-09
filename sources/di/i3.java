package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ii0;
public final class i3 implements ii0 {
    public final j4 f9103a;

    public i3(j4 j4Var) {
        this.f9103a = j4Var;
    }

    @Override
    public final boolean E() {
        ((h9) this.f9103a.f9253z1).b(false);
        return false;
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        aa.s sVar = new aa.s(this, o0Var, view, 22);
        if (!z9) {
            this.f9103a.l0(sVar);
        } else {
            sVar.run();
        }
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void M() {
    }

    @Override
    public final void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
