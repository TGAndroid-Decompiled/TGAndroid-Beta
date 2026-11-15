package l;

import android.view.ActionProvider;
import android.view.View;
import hi.l0;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f18860a;
    public l0 f18861b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f18860a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f18860a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        l0 l0Var = this.f18861b;
        if (l0Var != null) {
            k kVar = ((m) l0Var.f14544b).f18848n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
