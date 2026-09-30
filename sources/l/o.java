package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f14019a;
    public a4.m f14020b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f14019a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f14019a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.m mVar = this.f14020b;
        if (mVar != null) {
            l lVar = ((n) mVar.f275b).f14007n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
