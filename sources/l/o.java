package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f11442a;
    public ja.c f11443b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f11442a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f11442a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z4) {
        ja.c cVar = this.f11443b;
        if (cVar != null) {
            l lVar = ((n) cVar.f9988a).f11430n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
