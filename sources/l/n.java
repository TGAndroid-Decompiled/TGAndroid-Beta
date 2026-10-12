package l;

import android.view.ActionProvider;
import android.view.View;
import k2.g0;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f15031a;
    public g0 f15032b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f15031a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f15031a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        g0 g0Var = this.f15032b;
        if (g0Var != null) {
            k kVar = ((m) g0Var.f14467b).f15019n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
