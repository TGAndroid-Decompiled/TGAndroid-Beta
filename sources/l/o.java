package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f14005a;
    public a4.m f14006b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f14005a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f14005a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.m mVar = this.f14006b;
        if (mVar != null) {
            l lVar = ((n) mVar.f275b).f13993n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
