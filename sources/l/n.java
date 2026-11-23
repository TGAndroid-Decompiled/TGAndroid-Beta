package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f19320a;
    public j6.r f19321b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f19320a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f19320a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        j6.r rVar = this.f19321b;
        if (rVar != null) {
            k kVar = ((m) rVar.f17372b).f19308n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
