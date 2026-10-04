package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15217a;
    public a6.m f15218b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15217a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15217a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        a6.m mVar = this.f15218b;
        if (mVar != null) {
            k kVar = ((m) mVar.f330b).f15205n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
