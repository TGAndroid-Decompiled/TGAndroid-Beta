package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.xl0;
public final class w3 extends k61 {
    public final e4 N;

    public w3(e4 e4Var, xl0 xl0Var, Activity activity, int i10, int i11, bi.v vVar, d6 d6Var) {
        super(xl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = e4Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 == 42) {
            e4 e4Var = this.N;
            Activity parentActivity = e4Var.getParentActivity();
            int i11 = h6.L6;
            d6Var = ((org.telegram.ui.ActionBar.m2) e4Var).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
            m4Var.setHeight(25);
            return new s4.c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
