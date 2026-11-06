package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.hi0;
public final class i3 implements hi0 {
    public final i4 f9129a;

    public i3(i4 i4Var) {
        this.f9129a = i4Var;
    }

    @Override
    public final boolean E() {
        ((g9) this.f9129a.f9221z1).b(false);
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
            this.f9129a.l0(sVar);
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
