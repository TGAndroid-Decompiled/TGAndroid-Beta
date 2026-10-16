package di;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class y7 implements bh.h {
    public final c8 f8134a;

    public y7(c8 c8Var) {
        this.f8134a = c8Var;
    }

    @Override
    public final void k(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
        c8 c8Var = this.f8134a;
        canvas.drawColor(c8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            c8Var.f6725l0.b(canvas, -3);
        }
    }

    @Override
    public final void m0(bh.a aVar) {
        aVar.a(this.f8134a.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
