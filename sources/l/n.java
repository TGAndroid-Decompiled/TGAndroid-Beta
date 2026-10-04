package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15216a;
    public a6.m f15217b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15216a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15216a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a6.m mVar = this.f15217b;
        if (mVar != null) {
            k kVar = ((m) mVar.f330b).f15204n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
