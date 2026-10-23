package ei;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class o7 implements bh.h {
    public final s7 f9570a;

    public o7(s7 s7Var) {
        this.f9570a = s7Var;
    }

    @Override
    public final void J(bh.a aVar) {
        aVar.a(this.f9570a.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void z(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        s7 s7Var = this.f9570a;
        canvas.drawColor(s7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            s7Var.f9818l0.b(canvas, -3);
        }
    }
}
