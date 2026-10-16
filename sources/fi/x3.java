package fi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.mm0;
public final class x3 extends a71 {
    public final f4 N;

    public x3(f4 f4Var, mm0 mm0Var, Activity activity, int i10, int i11, ci.u uVar, c6 c6Var) {
        super(mm0Var, activity, i10, i11, true, uVar, c6Var);
        this.N = f4Var;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        if (i10 == 42) {
            f4 f4Var = this.N;
            Activity parentActivity = f4Var.getParentActivity();
            int i11 = g6.L6;
            c6Var = ((org.telegram.ui.ActionBar.m2) f4Var).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, c6Var);
            m4Var.setHeight(25);
            return new s4.b1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
