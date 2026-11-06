package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f17715a;
    public g6.d0 f17716b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f17715a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f17715a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z9) {
        g6.d0 d0Var = this.f17716b;
        if (d0Var != null) {
            k kVar = ((m) d0Var.f13555b).f17703n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
