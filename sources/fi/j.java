package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.qv;
public final class j extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f11887e;

    public j(qv qvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.f11887e = qvVar;
    }

    @Override
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((qv) this.f11887e).invalidate();
                return;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                bi.v1 v1Var = ((org.telegram.ui.Components.o7) this.f11887e).G0;
                if (v1Var != null) {
                    v1Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.Components.o7 o7Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ab.q qVar) {
        super(context, e6Var, qVar);
        this.f11887e = o7Var;
    }
}
