package bi;

import android.graphics.Canvas;
import org.telegram.messenger.SharedConfig;
public final class d9 implements zg.g {
    public final i9 f2556a;

    public d9(i9 i9Var) {
        this.f2556a = i9Var;
    }

    @Override
    public final void d(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        i9 i9Var = this.f2556a;
        canvas.drawColor(i9Var.getThemedColor(i10));
        if (SharedConfig.chatBlurEnabled()) {
            i9Var.f2873l0.b(canvas, -2);
        }
    }

    @Override
    public final void u(g.z zVar) {
        zVar.a(this.f2556a.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        zVar.b(SharedConfig.chatBlurEnabled());
    }
}
