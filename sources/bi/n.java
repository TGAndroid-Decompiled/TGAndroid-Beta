package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.lx;
public final class n extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f3373e;

    public n(lx lxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.f3373e = lxVar;
    }

    @Override
    public final void e(le.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                ((lx) this.f3373e).invalidate();
                return;
            default:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                g5 g5Var = ((org.telegram.ui.ActionBar.k) this.f3373e).F0;
                if (g5Var != null) {
                    g5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public n(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context, f6Var, mVar);
        this.f3373e = kVar;
    }
}
