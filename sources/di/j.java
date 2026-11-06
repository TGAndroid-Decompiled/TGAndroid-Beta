package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.pv;
public final class j extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f9238e;

    public j(pv pvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.f9238e = pvVar;
    }

    @Override
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((pv) this.f9238e).invalidate();
                return;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                a4 a4Var = ((org.telegram.ui.Components.r7) this.f9238e).F0;
                if (a4Var != null) {
                    a4Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.Components.r7 r7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ab.q qVar) {
        super(context, f6Var, qVar);
        this.f9238e = r7Var;
    }
}
