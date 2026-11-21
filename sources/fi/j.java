package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.tv;
public final class j extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f12164e;

    public j(tv tvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.f12164e = tvVar;
    }

    @Override
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((tv) this.f12164e).invalidate();
                return;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                bi.t2 t2Var = ((org.telegram.ui.Components.v7) this.f12164e).G0;
                if (t2Var != null) {
                    t2Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.Components.v7 v7Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ab.q qVar) {
        super(context, h6Var, qVar);
        this.f12164e = v7Var;
    }
}
