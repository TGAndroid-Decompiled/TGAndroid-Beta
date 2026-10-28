package ai;

import android.graphics.Canvas;
import org.telegram.ui.Components.nm0;
public final class r extends nm0 {
    public r0 f1659f3;
    public q0 f1660g3;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        if (this.f1660g3 != null) {
            canvas2 = canvas;
            i10 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i10 = -1;
        }
        r0 r0Var = this.f1659f3;
        if (r0Var != null) {
            r0Var.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        q0 q0Var = this.f1660g3;
        if (q0Var != null) {
            q0Var.accept(canvas2);
            canvas2.restoreToCount(i10);
        }
    }
}
