package jh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yw;

public final class i extends org.telegram.ui.ActionBar.m {
    public final int d = 1;

    public final FrameLayout f13423e;

    public i(yw ywVar, Context context, com.google.firebase.messaging.l lVar) {
        super(context, null, lVar);
        this.f13423e = ywVar;
    }

    @Override
    public final void c(ud.j jVar) {
        switch (this.d) {
            case 0:
                super.c(jVar);
                ((yw) this.f13423e).invalidate();
                break;
            default:
                super.c(jVar);
                float totalVisibility = getTotalVisibility();
                ag.d dVar = ((org.telegram.ui.ActionBar.k) this.f13423e).B0;
                if (dVar != null) {
                    dVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                }
                break;
        }
    }

    public i(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, com.google.firebase.messaging.l lVar) {
        super(context, c6Var, lVar);
        this.f13423e = kVar;
    }
}
