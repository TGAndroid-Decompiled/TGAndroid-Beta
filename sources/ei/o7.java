package ei;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class o7 implements bh.h {
    public final s7 f9558a;

    public o7(s7 s7Var) {
        this.f9558a = s7Var;
    }

    @Override
    public final void H(bh.a aVar) {
        aVar.a(this.f9558a.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void r(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
        s7 s7Var = this.f9558a;
        canvas.drawColor(s7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            s7Var.f9803l0.b(canvas, -3);
        }
    }
}
