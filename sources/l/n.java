package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f13767a;
    public k2.b0 f13768b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f13767a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f13767a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        k2.b0 b0Var = this.f13768b;
        if (b0Var != null) {
            k kVar = ((m) b0Var.f13222b).f13755n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
