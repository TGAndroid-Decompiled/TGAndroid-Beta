package lh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;

public final class n7 implements jg.g {

    public final r7 f16436a;

    public n7(r7 r7Var) {
        this.f16436a = r7Var;
    }

    @Override
    public final void A(g.y yVar) {
        yVar.a(this.f16436a.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        yVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public final void n(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        r7 r7Var = this.f16436a;
        canvas.drawColor(r7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            r7Var.f16658h0.b(canvas, -3);
        }
    }
}
