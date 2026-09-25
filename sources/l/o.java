package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f14003a;
    public a4.m f14004b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f14003a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f14003a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.m mVar = this.f14004b;
        if (mVar != null) {
            l lVar = ((n) mVar.f275b).f13991n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
