package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f15183a;
    public xa.c f15184b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f15183a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f15183a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        xa.c cVar = this.f15184b;
        if (cVar != null) {
            l lVar = ((n) cVar.f49360b).f15171n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
