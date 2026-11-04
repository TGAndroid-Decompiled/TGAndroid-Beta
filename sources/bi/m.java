package bi;

import android.graphics.Canvas;
import org.telegram.ui.Components.tj0;
public final class m extends tj0 {
    public d0 f3790f3;
    public c0 f3791g3;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        if (this.f3791g3 != null) {
            canvas2 = canvas;
            i3 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i3 = -1;
        }
        d0 d0Var = this.f3790f3;
        if (d0Var != null) {
            d0Var.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        c0 c0Var = this.f3791g3;
        if (c0Var != null) {
            c0Var.accept(canvas2);
            canvas2.restoreToCount(i3);
        }
    }
}
