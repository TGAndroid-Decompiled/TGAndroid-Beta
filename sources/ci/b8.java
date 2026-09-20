package ci;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class b8 implements ah.k {
    public final g8 f4398a;

    public b8(g8 g8Var) {
        this.f4398a = g8Var;
    }

    @Override
    public final void K(ah.a aVar) {
        aVar.a(this.f4398a.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.f19094d6;
        g8 g8Var = this.f4398a;
        canvas.drawColor(g8Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g8Var.f4711l0.b(canvas, -2);
        }
    }
}
