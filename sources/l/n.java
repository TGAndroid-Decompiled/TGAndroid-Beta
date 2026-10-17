package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15792a;
    public ag.b f15793b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15792a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15792a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        ag.b bVar = this.f15793b;
        if (bVar != null) {
            k kVar = ((m) bVar.f634b).f15780n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
