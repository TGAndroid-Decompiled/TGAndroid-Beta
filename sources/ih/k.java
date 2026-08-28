package ih;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vw;
public final class k extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f11655e;

    public k(vw vwVar, Context context, com.google.firebase.messaging.l lVar) {
        super(context, null, lVar);
        this.f11655e = vwVar;
    }

    @Override
    public final void c(td.j jVar) {
        switch (this.d) {
            case 0:
                super.c(jVar);
                ((vw) this.f11655e).invalidate();
                return;
            default:
                super.c(jVar);
                float totalVisibility = getTotalVisibility();
                dh.g gVar = ((org.telegram.ui.ActionBar.k) this.f11655e).B0;
                if (gVar != null) {
                    gVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public k(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, com.google.firebase.messaging.l lVar) {
        super(context, b6Var, lVar);
        this.f11655e = kVar;
    }
}
