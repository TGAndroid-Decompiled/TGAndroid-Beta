package nh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class c7 implements lg.g {
    public final g7 f17477a;

    public c7(g7 g7Var) {
        this.f17477a = g7Var;
    }

    @Override
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        g7 g7Var = this.f17477a;
        canvas.drawColor(g7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g7Var.f17714h0.b(canvas, -3);
        }
    }

    @Override
    public final void q(g.x xVar) {
        xVar.a(this.f17477a.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }
}
