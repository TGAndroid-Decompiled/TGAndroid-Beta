package ci;

import android.graphics.Canvas;
import org.telegram.ui.Components.ck0;
public final class m extends ck0 {
    public aa.k f5712f3;
    public d0 f5713g3;

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i7;
        if (this.f5713g3 != null) {
            canvas2 = canvas;
            i7 = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            canvas2 = canvas;
            i7 = -1;
        }
        aa.k kVar = this.f5712f3;
        if (kVar != null) {
            kVar.accept(canvas2);
        }
        super.dispatchDraw(canvas2);
        d0 d0Var = this.f5713g3;
        if (d0Var != null) {
            d0Var.accept(canvas2);
            canvas2.restoreToCount(i7);
        }
    }
}
