package fi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.sv;
public final class j extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f12129e;

    public j(sv svVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.f12129e = svVar;
    }

    @Override
    public final void g(te.j jVar) {
        switch (this.d) {
            case 0:
                super.g(jVar);
                ((sv) this.f12129e).invalidate();
                return;
            default:
                super.g(jVar);
                float totalVisibility = getTotalVisibility();
                bi.v2 v2Var = ((org.telegram.ui.Components.u7) this.f12129e).G0;
                if (v2Var != null) {
                    v2Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.Components.u7 u7Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, ab.q qVar) {
        super(context, i6Var, qVar);
        this.f12129e = u7Var;
    }
}
