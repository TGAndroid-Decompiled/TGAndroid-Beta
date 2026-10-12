package di;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class x7 implements bh.h {
    public final c8 f8091a;

    public x7(c8 c8Var) {
        this.f8091a = c8Var;
    }

    @Override
    public final void m0(bh.a aVar) {
        aVar.a(this.f8091a.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void v(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.f19901d6;
        c8 c8Var = this.f8091a;
        canvas.drawColor(c8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            c8Var.f6722l0.b(canvas, -2);
        }
    }
}
