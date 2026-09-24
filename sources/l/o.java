package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f13988a;
    public a4.m f13989b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f13988a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f13988a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.m mVar = this.f13989b;
        if (mVar != null) {
            l lVar = ((n) mVar.f275b).f13976n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
