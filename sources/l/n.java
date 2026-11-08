package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f17718a;
    public g6.d0 f17719b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f17718a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f17718a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z9) {
        g6.d0 d0Var = this.f17719b;
        if (d0Var != null) {
            k kVar = ((m) d0Var.f13555b).f17706n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
