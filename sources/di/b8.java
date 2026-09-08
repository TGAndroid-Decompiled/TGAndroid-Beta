package di;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class b8 implements bh.h {
    public final g8 f6980a;

    public b8(g8 g8Var) {
        this.f6980a = g8Var;
    }

    @Override
    public final void k(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.f20690d6;
        g8 g8Var = this.f6980a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.f7311l0.b(canvas, -2);
        }
    }

    @Override
    public final void v(bh.a aVar) {
        aVar.a(this.f6980a.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
