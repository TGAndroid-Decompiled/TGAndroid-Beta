package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qw;
public final class k extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout e;

    public k(qw qwVar, Context context, c2.b bVar) {
        super(context, null, bVar);
        this.e = qwVar;
    }

    @Override
    public final void b(oe.l lVar) {
        switch (this.d) {
            case 0:
                super.b(lVar);
                ((qw) this.e).invalidate();
                return;
            default:
                super.b(lVar);
                float totalVisibility = getTotalVisibility();
                i4 i4Var = ((org.telegram.ui.Components.b8) this.e).F0;
                if (i4Var != null) {
                    i4Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public k(org.telegram.ui.Components.b8 b8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, c2.b bVar) {
        super(context, u6Var, bVar);
        this.e = b8Var;
    }
}
