package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class z7 implements ah.j {
    public final d8 f5926a;

    public z7(d8 d8Var) {
        this.f5926a = d8Var;
    }

    @Override
    public final void U(ah.a aVar) {
        aVar.a(this.f5926a.getThemedColor(org.telegram.ui.ActionBar.h6.f19076d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.f19076d6;
        d8 d8Var = this.f5926a;
        canvas.drawColor(d8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            d8Var.f4538l0.b(canvas, -3);
        }
    }
}
