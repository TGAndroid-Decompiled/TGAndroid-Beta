package l;

import android.view.ActionProvider;
import android.view.View;
import jg.s0;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f16763a;
    public s0 f16764b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f16763a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f16763a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        s0 s0Var = this.f16764b;
        if (s0Var != null) {
            k kVar = ((m) s0Var.f15827b).f16751n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
