package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class z7 implements ah.j {
    public final d8 f6423a;

    public z7(d8 d8Var) {
        this.f6423a = d8Var;
    }

    @Override
    public final void g0(ah.a aVar) {
        aVar.a(this.f6423a.getThemedColor(org.telegram.ui.ActionBar.h6.f20560d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void l(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.f20560d6;
        d8 d8Var = this.f6423a;
        canvas.drawColor(d8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            d8Var.f4955l0.b(canvas, -3);
        }
    }
}
