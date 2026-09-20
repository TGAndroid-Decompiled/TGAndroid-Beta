package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f13977a;
    public a4.m f13978b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f13977a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f13977a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.m mVar = this.f13978b;
        if (mVar != null) {
            l lVar = ((n) mVar.f275b).f13965n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
