package ai;

import android.graphics.Canvas;
import org.telegram.ui.Components.pj0;
public final class r extends pj0 {
    public aa.k f1606e3;
    public k0 f1607f3;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        if (this.f1607f3 != null) {
            canvas2 = canvas;
            i7 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        aa.k kVar = this.f1606e3;
        if (kVar != null) {
            kVar.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        k0 k0Var = this.f1607f3;
        if (k0Var != null) {
            k0Var.accept(canvas2);
            canvas2.restoreToCount(i7);
        }
    }
}
