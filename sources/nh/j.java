package nh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ix;
public final class j extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout e;

    public j(ix ixVar, Context context, cb.m mVar) {
        super(context, null, mVar);
        this.e = ixVar;
    }

    @Override
    public final void e(xd.j jVar) {
        switch (this.d) {
            case 0:
                super.e(jVar);
                ((ix) this.e).invalidate();
                return;
            default:
                super.e(jVar);
                float totalVisibility = getTotalVisibility();
                dh.d dVar = ((org.telegram.ui.ActionBar.k) this.e).C0;
                if (dVar != null) {
                    dVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public j(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, cb.m mVar) {
        super(context, f6Var, mVar);
        this.e = kVar;
    }
}
