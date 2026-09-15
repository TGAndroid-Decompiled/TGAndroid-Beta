package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f13781a;
    public k2.c0 f13782b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f13781a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f13781a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        k2.c0 c0Var = this.f13782b;
        if (c0Var != null) {
            k kVar = ((m) c0Var.f13234b).f13769n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
