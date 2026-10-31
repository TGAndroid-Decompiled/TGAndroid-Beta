package l;

import android.view.ActionProvider;
import android.view.View;
import k2.m0;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f11542a;
    public m0 f11543b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f11542a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f11542a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        m0 m0Var = this.f11543b;
        if (m0Var != null) {
            l lVar = ((n) m0Var.f10700a).f11530n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
