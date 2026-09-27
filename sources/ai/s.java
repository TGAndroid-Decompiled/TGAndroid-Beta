package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hx;
public final class s extends org.telegram.ui.ActionBar.n {
    public final int d = 1;
    public final FrameLayout e;

    public s(hx hxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.e = hxVar;
    }

    @Override
    public final void c(le.m mVar) {
        switch (this.d) {
            case 0:
                super.c(mVar);
                ((hx) this.e).invalidate();
                return;
            default:
                super.c(mVar);
                float totalVisibility = getTotalVisibility();
                w5 w5Var = ((org.telegram.ui.ActionBar.l) this.e).F0;
                if (w5Var != null) {
                    w5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public s(org.telegram.ui.ActionBar.l lVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, com.google.firebase.messaging.m mVar) {
        super(context, e6Var, mVar);
        this.e = lVar;
    }
}
