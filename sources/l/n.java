package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f13779a;
    public k2.c0 f13780b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f13779a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f13779a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        k2.c0 c0Var = this.f13780b;
        if (c0Var != null) {
            k kVar = ((m) c0Var.f13236b).f13767n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
