package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15798a;
    public a4.l f15799b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15798a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15798a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.l lVar = this.f15799b;
        if (lVar != null) {
            k kVar = ((m) lVar.f279b).f15786n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
