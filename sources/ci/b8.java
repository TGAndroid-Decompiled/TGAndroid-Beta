package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class b8 implements ah.j {
    public final g8 f4392a;

    public b8(g8 g8Var) {
        this.f4392a = g8Var;
    }

    @Override
    public final void b(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.i6.f18836d6;
        g8 g8Var = this.f4392a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.f4705l0.b(canvas, -2);
        }
    }

    @Override
    public final void m(ah.a aVar) {
        aVar.a(this.f4392a.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }
}
