package ei;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.mv;
public final class k extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f10558e;

    public k(mv mvVar, Context context, b4.n nVar) {
        super(context, null, nVar);
        this.f10558e = mvVar;
    }

    @Override
    public final void b(qe.j jVar) {
        switch (this.d) {
            case 0:
                super.b(jVar);
                ((mv) this.f10558e).invalidate();
                return;
            default:
                super.b(jVar);
                float totalVisibility = getTotalVisibility();
                ai.d2 d2Var = ((org.telegram.ui.Components.p7) this.f10558e).G0;
                if (d2Var != null) {
                    d2Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    return;
                }
                return;
        }
    }

    public k(org.telegram.ui.Components.p7 p7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, b4.n nVar) {
        super(context, e6Var, nVar);
        this.f10558e = p7Var;
    }
}
