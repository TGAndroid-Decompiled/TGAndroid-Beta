package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15797a;
    public ag.b f15798b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15797a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15797a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        ag.b bVar = this.f15798b;
        if (bVar != null) {
            k kVar = ((m) bVar.f634b).f15785n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
