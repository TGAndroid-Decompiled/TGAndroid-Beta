package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class b8 implements ah.j {
    public final g8 f4394a;

    public b8(g8 g8Var) {
        this.f4394a = g8Var;
    }

    @Override
    public final void b(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.f18834d6;
        g8 g8Var = this.f4394a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.f4707l0.b(canvas, -2);
        }
    }

    @Override
    public final void m(ah.a aVar) {
        aVar.a(this.f4394a.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
