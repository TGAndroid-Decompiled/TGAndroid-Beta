package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f14029a;
    public za.c f14030b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f14029a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f14029a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        za.c cVar = this.f14030b;
        if (cVar != null) {
            k kVar = ((m) cVar.f50799b).f14017n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
