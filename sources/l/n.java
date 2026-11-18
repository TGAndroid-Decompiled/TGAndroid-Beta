package l;

import android.view.ActionProvider;
import android.view.View;
import h9.g1;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f19224a;
    public g1 f19225b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f19224a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f19224a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        g1 g1Var = this.f19225b;
        if (g1Var != null) {
            k kVar = ((m) g1Var.f13998b).f19212n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
