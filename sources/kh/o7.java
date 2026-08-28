package kh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class o7 implements ig.g {
    public final s7 f15799a;

    public o7(s7 s7Var) {
        this.f15799a = s7Var;
    }

    @Override
    public final void k(Canvas canvas) {
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        s7 s7Var = this.f15799a;
        canvas.drawColor(s7Var.getThemedColor(i9));
        if (SharedConfig.chatBlurEnabled()) {
            s7Var.f16040h0.b(canvas, -3);
        }
    }

    @Override
    public final void x0(g.x xVar) {
        xVar.a(this.f15799a.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }
}
