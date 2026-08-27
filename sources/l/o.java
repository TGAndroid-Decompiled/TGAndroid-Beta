package l;

import android.view.ActionProvider;
import android.view.View;

public final class o implements ActionProvider.VisibilityListener {

    public final ActionProvider f15357a;

    public ae.b f15358b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f15357a = actionProvider;
    }

    public final View a(n nVar) {
        return this.f15357a.onCreateActionView(nVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        ae.b bVar = this.f15358b;
        if (bVar != null) {
            l lVar = ((n) bVar.f245b).f15345n;
            lVar.h = true;
            lVar.p(true);
        }
    }
}
