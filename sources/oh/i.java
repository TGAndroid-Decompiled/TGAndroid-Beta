package oh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hx;
public final class i extends org.telegram.ui.ActionBar.m {
    public final int d = 1;
    public final FrameLayout f17203e;

    public i(hx hxVar, Context context, cb.m mVar) {
        super(context, null, mVar);
        this.f17203e = hxVar;
    }

    @Override
    public final void e(xd.j jVar) {
        switch (this.d) {
            case 0:
                super.e(jVar);
                ((hx) this.f17203e).invalidate();
                return;
            default:
                super.e(jVar);
                float totalVisibility = getTotalVisibility();
                eh.d dVar = ((org.telegram.ui.ActionBar.k) this.f17203e).C0;
                if (dVar != null) {
                    dVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    return;
                }
                return;
        }
    }

    public i(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, cb.m mVar) {
        super(context, g6Var, mVar);
        this.f17203e = kVar;
    }
}
