package l;

import android.view.ActionProvider;
import android.view.View;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f13991a;
    public android.support.v4.media.c f13992b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f13991a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f13991a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        android.support.v4.media.c cVar = this.f13992b;
        if (cVar != null) {
            l lVar = ((n) cVar.f1812b).f13979n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
