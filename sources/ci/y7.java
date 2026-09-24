package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class y7 implements ah.j {
    public final d8 f5876a;

    public y7(d8 d8Var) {
        this.f5876a = d8Var;
    }

    @Override
    public final void U(ah.a aVar) {
        aVar.a(this.f5876a.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.f19045d6;
        d8 d8Var = this.f5876a;
        canvas.drawColor(d8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            d8Var.f4531l0.b(canvas, -2);
        }
    }
}
