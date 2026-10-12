package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.px;
public final class n extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout e;

    public n(px pxVar, Context context, c2.b bVar) {
        super(context, null, bVar);
        this.e = pxVar;
    }

    @Override
    public final void e(ne.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                ((px) this.e).invalidate();
                return;
            default:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                i5 i5Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (i5Var != null) {
                    i5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public n(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, c2.b bVar) {
        super(context, c6Var, bVar);
        this.e = kVar;
    }
}
