package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f14004a;
    public a4.m f14005b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f14004a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f14004a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.m mVar = this.f14005b;
        if (mVar != null) {
            l lVar = ((n) mVar.f275b).f13992n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
