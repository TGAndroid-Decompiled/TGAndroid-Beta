package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class y7 implements ah.j {
    public final d8 f6354a;

    public y7(d8 d8Var) {
        this.f6354a = d8Var;
    }

    @Override
    public final void g0(ah.a aVar) {
        aVar.a(this.f6354a.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void l(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.f20559d6;
        d8 d8Var = this.f6354a;
        canvas.drawColor(d8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            d8Var.f4955l0.b(canvas, -2);
        }
    }
}
