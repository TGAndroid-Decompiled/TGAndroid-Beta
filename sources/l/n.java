package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f13791a;
    public k2.c0 f13792b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f13791a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f13791a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        k2.c0 c0Var = this.f13792b;
        if (c0Var != null) {
            k kVar = ((m) c0Var.f13237b).f13779n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
