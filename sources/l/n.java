package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15321a;
    public a4.l f15322b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15321a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15321a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.l lVar = this.f15322b;
        if (lVar != null) {
            k kVar = ((m) lVar.f297b).f15309n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
