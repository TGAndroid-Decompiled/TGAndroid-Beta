package lh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xw;
public final class i extends org.telegram.ui.ActionBar.n {
    public final int d = 1;
    public final FrameLayout f15697e;

    public i(xw xwVar, Context context, ab.m mVar) {
        super(context, null, mVar);
        this.f15697e = xwVar;
    }

    @Override
    public final void b(vd.k kVar) {
        switch (this.d) {
            case 0:
                super.b(kVar);
                ((xw) this.f15697e).invalidate();
                return;
            default:
                super.b(kVar);
                float totalVisibility = getTotalVisibility();
                bh.d dVar = ((org.telegram.ui.ActionBar.l) this.f15697e).B0;
                if (dVar != null) {
                    dVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public i(org.telegram.ui.ActionBar.l lVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, ab.m mVar) {
        super(context, c6Var, mVar);
        this.f15697e = lVar;
    }
}
