package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
public final class w3 extends x51 {
    public final e4 N;

    public w3(e4 e4Var, ml0 ml0Var, Activity activity, int i10, int i11, bi.v vVar, f6 f6Var) {
        super(ml0Var, activity, i10, i11, true, vVar, f6Var);
        this.N = e4Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 == 42) {
            e4 e4Var = this.N;
            Activity parentActivity = e4Var.getParentActivity();
            int i11 = j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.o2) e4Var).resourceProvider;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, f6Var);
            l4Var.setHeight(25);
            return new s4.c1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
