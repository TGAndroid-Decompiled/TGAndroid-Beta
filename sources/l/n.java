package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15285a;
    public a4.l f15286b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15285a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15285a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.l lVar = this.f15286b;
        if (lVar != null) {
            k kVar = ((m) lVar.f297b).f15273n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
