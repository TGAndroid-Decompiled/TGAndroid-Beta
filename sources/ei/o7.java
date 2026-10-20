package ei;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class o7 implements bh.h {
    public final s7 f9556a;

    public o7(s7 s7Var) {
        this.f9556a = s7Var;
    }

    @Override
    public final void J(bh.a aVar) {
        aVar.a(this.f9556a.getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void b(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.h6.f20990d6;
        s7 s7Var = this.f9556a;
        canvas.drawColor(s7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            s7Var.f9802l0.b(canvas, -3);
        }
    }
}
