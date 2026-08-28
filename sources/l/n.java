package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f16601a;
    public android.support.v4.media.c f16602b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f16601a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f16601a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        android.support.v4.media.c cVar = this.f16602b;
        if (cVar != null) {
            k kVar = ((m) cVar.f281b).f16589n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
