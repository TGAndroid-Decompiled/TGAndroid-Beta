package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.sv;
public final class j extends org.telegram.ui.ActionBar.n {
    public final int d = 1;
    public final FrameLayout f9152e;

    public j(sv svVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.f9152e = svVar;
    }

    @Override
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((sv) this.f9152e).invalidate();
                return;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                b4 b4Var = ((org.telegram.ui.Components.q7) this.f9152e).F0;
                if (b4Var != null) {
                    b4Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.Components.q7 q7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ab.q qVar) {
        super(context, h6Var, qVar);
        this.f9152e = q7Var;
    }
}
