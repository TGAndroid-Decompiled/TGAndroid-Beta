package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.rv;
public final class j extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f9147e;

    public j(rv rvVar, Context context, ab.q qVar) {
        super(context, null, qVar);
        this.f9147e = rvVar;
    }

    @Override
    public final void f(te.j jVar) {
        switch (this.d) {
            case 0:
                super.f(jVar);
                ((rv) this.f9147e).invalidate();
                return;
            default:
                super.f(jVar);
                float totalVisibility = getTotalVisibility();
                b4 b4Var = ((org.telegram.ui.Components.r7) this.f9147e).F0;
                if (b4Var != null) {
                    b4Var.setTranslationY(totalVisibility * org.telegram.messenger.g0.L(-11.0f));
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.Components.r7 r7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ab.q qVar) {
        super(context, g6Var, qVar);
        this.f9147e = r7Var;
    }
}
