package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.li0;
public final class d3 implements li0 {
    public final b4 f11623a;

    public d3(b4 b4Var) {
        this.f11623a = b4Var;
    }

    @Override
    public final boolean B() {
        ((z8) this.f11623a.A1).b(false);
        return false;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final void h(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        aa.r rVar = new aa.r(this, p0Var, view, 27);
        if (!z10) {
            this.f11623a.l0(rVar);
        } else {
            rVar.run();
        }
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final void K() {
    }

    @Override
    public final void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
