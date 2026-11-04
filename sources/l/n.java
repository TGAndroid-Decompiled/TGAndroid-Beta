package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f17464a;
    public hi.d f17465b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f17464a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f17464a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        hi.d dVar = this.f17465b;
        if (dVar != null) {
            k kVar = ((m) dVar.f14429b).f17452n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
