package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f15157a;
    public xa.c f15158b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f15157a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f15157a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        xa.c cVar = this.f15158b;
        if (cVar != null) {
            l lVar = ((n) cVar.f49331b).f15145n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
