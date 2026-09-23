package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ix;
public final class s extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout e;

    public s(ix ixVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.e = ixVar;
    }

    @Override
    public final void c(le.m mVar) {
        switch (this.d) {
            case 0:
                super.c(mVar);
                ((ix) this.e).invalidate();
                return;
            default:
                super.c(mVar);
                float totalVisibility = getTotalVisibility();
                w5 w5Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (w5Var != null) {
                    w5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public s(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, com.google.firebase.messaging.m mVar) {
        super(context, d6Var, mVar);
        this.e = kVar;
    }
}
