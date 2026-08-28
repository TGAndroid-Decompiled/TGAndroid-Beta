package ih;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.tj0;
public final class k3 implements tj0 {
    public final i4 f11670a;

    public k3(i4 i4Var) {
        this.f11670a = i4Var;
    }

    @Override
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        h3 h3Var = new h3(this, r0Var, view, 0);
        if (!z10) {
            this.f11670a.n0(h3Var);
        } else {
            h3Var.run();
        }
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean p() {
        ((d9) this.f11670a.M1).b(false);
        return false;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void t() {
    }

    @Override
    public final void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
