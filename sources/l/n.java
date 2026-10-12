package l;

import android.view.ActionProvider;
import android.view.View;
import ji.h5;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f14458a;
    public h5 f14459b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f14458a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f14458a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        h5 h5Var = this.f14459b;
        if (h5Var != null) {
            k kVar = ((m) h5Var.f13312b).f14446n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
