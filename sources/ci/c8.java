package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class c8 implements ah.k {
    public final g8 f4435a;

    public c8(g8 g8Var) {
        this.f4435a = g8Var;
    }

    @Override
    public final void U(ah.a aVar) {
        aVar.a(this.f4435a.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.f19062d6;
        g8 g8Var = this.f4435a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.f4710l0.b(canvas, -3);
        }
    }
}
