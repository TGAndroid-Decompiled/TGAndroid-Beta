package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wl0;
public final class g extends l61 {
    public final l N;

    public g(l lVar, wl0 wl0Var, Activity activity, int i10, int i11, bi.v vVar, e6 e6Var) {
        super(wl0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = lVar;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 == 42) {
            l lVar = this.N;
            Activity parentActivity = lVar.getParentActivity();
            int i11 = j6.L6;
            e6Var = ((org.telegram.ui.ActionBar.n2) lVar).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, e6Var);
            m4Var.setHeight(25);
            return new s4.c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
