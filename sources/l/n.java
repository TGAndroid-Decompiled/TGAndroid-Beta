package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15286a;
    public a4.l f15287b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15286a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15286a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.l lVar = this.f15287b;
        if (lVar != null) {
            k kVar = ((m) lVar.f297b).f15274n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
