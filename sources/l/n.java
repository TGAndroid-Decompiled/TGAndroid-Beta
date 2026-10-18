package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15799a;
    public ag.b f15800b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15799a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15799a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        ag.b bVar = this.f15800b;
        if (bVar != null) {
            k kVar = ((m) bVar.f634b).f15787n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
