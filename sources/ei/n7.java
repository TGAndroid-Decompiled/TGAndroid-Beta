package ei;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class n7 implements bh.h {
    public final s7 f9530a;

    public n7(s7 s7Var) {
        this.f9530a = s7Var;
    }

    @Override
    public final void J(bh.a aVar) {
        aVar.a(this.f9530a.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void z(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        s7 s7Var = this.f9530a;
        canvas.drawColor(s7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            s7Var.f9818l0.b(canvas, -2);
        }
    }
}
