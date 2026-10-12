package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mx;
public final class s extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f1680e;

    public s(mx mxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.f1680e = mxVar;
    }

    @Override
    public final void c(me.l lVar) {
        switch (this.d) {
            case 0:
                super.c(lVar);
                ((mx) this.f1680e).invalidate();
                return;
            default:
                super.c(lVar);
                float totalVisibility = getTotalVisibility();
                x5 x5Var = ((org.telegram.ui.ActionBar.k) this.f1680e).F0;
                if (x5Var != null) {
                    x5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public s(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, com.google.firebase.messaging.m mVar) {
        super(context, c6Var, mVar);
        this.f1680e = kVar;
    }
}
