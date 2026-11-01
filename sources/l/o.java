package l;

import android.view.ActionProvider;
import android.view.View;
import k2.m0;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f11543a;
    public m0 f11544b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f11543a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f11543a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        m0 m0Var = this.f11544b;
        if (m0Var != null) {
            l lVar = ((n) m0Var.f10701a).f11531n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
