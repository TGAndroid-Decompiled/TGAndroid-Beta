package l;

import android.view.ActionProvider;
import android.view.View;
import h9.g1;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f19252a;
    public g1 f19253b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f19252a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f19252a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        g1 g1Var = this.f19253b;
        if (g1Var != null) {
            k kVar = ((m) g1Var.f14027b).f19240n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
