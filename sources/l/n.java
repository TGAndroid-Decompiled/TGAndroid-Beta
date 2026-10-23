package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15861a;
    public a4.l f15862b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15861a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15861a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.l lVar = this.f15862b;
        if (lVar != null) {
            k kVar = ((m) lVar.f279b).f15849n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
