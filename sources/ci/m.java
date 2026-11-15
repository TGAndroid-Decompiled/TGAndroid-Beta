package ci;

import android.graphics.Canvas;
import org.telegram.ui.Components.uj0;
public final class m extends uj0 {
    public aa.k f5432f3;
    public c0 f5433g3;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        if (this.f5433g3 != null) {
            canvas2 = canvas;
            i7 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        aa.k kVar = this.f5432f3;
        if (kVar != null) {
            kVar.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        c0 c0Var = this.f5433g3;
        if (c0Var != null) {
            c0Var.accept(canvas2);
            canvas2.restoreToCount(i7);
        }
    }
}
