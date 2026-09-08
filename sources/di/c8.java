package di;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class c8 implements bh.h {
    public final g8 f7023a;

    public c8(g8 g8Var) {
        this.f7023a = g8Var;
    }

    @Override
    public final void k(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.f20690d6;
        g8 g8Var = this.f7023a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.f7311l0.b(canvas, -3);
        }
    }

    @Override
    public final void v(bh.a aVar) {
        aVar.a(this.f7023a.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
