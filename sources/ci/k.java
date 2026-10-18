package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vw;
public final class k extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout e;

    public k(vw vwVar, Context context, c2.b bVar) {
        super(context, null, bVar);
        this.e = vwVar;
    }

    @Override
    public final void e(ne.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                ((vw) this.e).invalidate();
                return;
            default:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                h4 h4Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (h4Var != null) {
                    h4Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public k(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, c2.b bVar) {
        super(context, d6Var, bVar);
        this.e = kVar;
    }
}
