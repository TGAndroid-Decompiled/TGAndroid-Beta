package l;

import android.view.ActionProvider;
import android.view.View;
import zh.d3;
public final class o implements ActionProvider.VisibilityListener {
    public final ActionProvider f12673a;
    public d3 f12674b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f12673a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f12673a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        d3 d3Var = this.f12674b;
        if (d3Var != null) {
            l lVar = ((n) d3Var.f48346a).f12661n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
