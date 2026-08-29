package nh;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class b7 implements lg.g {
    public final g7 f17419a;

    public b7(g7 g7Var) {
        this.f17419a = g7Var;
    }

    @Override
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        g7 g7Var = this.f17419a;
        canvas.drawColor(g7Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            g7Var.f17714h0.b(canvas, -2);
        }
    }

    @Override
    public final void q(g.x xVar) {
        xVar.a(this.f17419a.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        xVar.b(SharedConfig.chatBlurEnabled());
    }
}
