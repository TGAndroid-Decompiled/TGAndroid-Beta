package l;

import android.view.ActionProvider;
import android.view.View;
import h9.g1;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f19221a;
    public g1 f19222b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f19221a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f19221a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        g1 g1Var = this.f19222b;
        if (g1Var != null) {
            k kVar = ((m) g1Var.f13993b).f19209n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
