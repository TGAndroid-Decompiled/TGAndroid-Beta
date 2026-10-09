package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15282a;
    public a4.l f15283b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15282a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15282a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a4.l lVar = this.f15283b;
        if (lVar != null) {
            k kVar = ((m) lVar.f297b).f15270n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
