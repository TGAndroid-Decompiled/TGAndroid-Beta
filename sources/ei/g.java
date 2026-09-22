package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.yl0;
public final class g extends m61 {
    public final l N;

    public g(l lVar, yl0 yl0Var, Activity activity, int i10, int i11, bi.v vVar, f6 f6Var) {
        super(yl0Var, activity, i10, i11, true, vVar, f6Var);
        this.N = lVar;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 == 42) {
            l lVar = this.N;
            Activity parentActivity = lVar.getParentActivity();
            int i11 = j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.n2) lVar).resourceProvider;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i11, 21, 0, false, f6Var);
            n4Var.setHeight(25);
            return new s4.c1(n4Var);
        }
        return super.x(viewGroup, i10);
    }
}
