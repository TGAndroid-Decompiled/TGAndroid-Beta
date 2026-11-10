package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f17721a;
    public g6.d0 f17722b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f17721a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f17721a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z9) {
        g6.d0 d0Var = this.f17722b;
        if (d0Var != null) {
            k kVar = ((m) d0Var.f13557b).f17709n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
