package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.wl0;
public final class g extends j61 {
    public final l N;

    public g(l lVar, wl0 wl0Var, Activity activity, int i10, int i11, bi.v vVar, d6 d6Var) {
        super(wl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = lVar;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 == 42) {
            l lVar = this.N;
            Activity parentActivity = lVar.getParentActivity();
            int i11 = h6.L6;
            d6Var = ((org.telegram.ui.ActionBar.m2) lVar).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
            m4Var.setHeight(25);
            return new s4.c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
