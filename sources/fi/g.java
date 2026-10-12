package fi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class g extends z61 {
    public final l N;

    public g(l lVar, mm0 mm0Var, Activity activity, int i10, int i11, ci.u uVar, c6 c6Var) {
        super(mm0Var, activity, i10, i11, true, uVar, c6Var);
        this.N = lVar;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        if (i10 == 42) {
            l lVar = this.N;
            Activity parentActivity = lVar.getParentActivity();
            int i11 = g6.L6;
            c6Var = ((org.telegram.ui.ActionBar.m2) lVar).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, c6Var);
            m4Var.setHeight(25);
            return new s4.b1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
