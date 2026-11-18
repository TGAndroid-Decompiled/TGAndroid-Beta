package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.tv;
public final class j extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f12135e;

    public j(tv tvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.f12135e = tvVar;
    }

    @Override
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((tv) this.f12135e).invalidate();
                return;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                bi.p2 p2Var = ((org.telegram.ui.Components.v7) this.f12135e).G0;
                if (p2Var != null) {
                    p2Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.Components.v7 v7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ab.q qVar) {
        super(context, i6Var, qVar);
        this.f12135e = v7Var;
    }
}
