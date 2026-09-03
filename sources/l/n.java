package l;

import android.view.ActionProvider;
import android.view.View;
public final class n implements ActionProvider.VisibilityListener {
    public final ActionProvider f11195a;
    public bb.b f11196b;

    public n(r rVar, ActionProvider actionProvider) {
        this.f11195a = actionProvider;
    }

    public final View a(m mVar) {
        return this.f11195a.onCreateActionView(mVar);
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z4) {
        bb.b bVar = this.f11196b;
        if (bVar != null) {
            k kVar = ((m) bVar.f1772b).f11183n;
            kVar.h = true;
            kVar.p(true);
        }
    }
}
