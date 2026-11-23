package l;

import android.view.ActionProvider;
import android.view.View;
import h9.g1;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f19255a;
    public g1 f19256b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f19255a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f19255a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        g1 g1Var = this.f19256b;
        if (g1Var != null) {
            k kVar = ((m) g1Var.f14030b).f19243n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
