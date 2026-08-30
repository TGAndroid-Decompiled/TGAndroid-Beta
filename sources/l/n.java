package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f11085a;
    public a3.c f11086b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f11085a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f11085a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z4) {
        a3.c cVar = this.f11086b;
        if (cVar != null) {
            k kVar = ((m) cVar.f46b).f11073n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
