package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
public final class w3 extends w51 {
    public final e4 N;

    public w3(e4 e4Var, ll0 ll0Var, Activity activity, int i10, int i11, bi.v vVar, e6 e6Var) {
        super(ll0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = e4Var;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 == 42) {
            e4 e4Var = this.N;
            Activity parentActivity = e4Var.getParentActivity();
            int i11 = i6.L6;
            e6Var = ((org.telegram.ui.ActionBar.n2) e4Var).resourceProvider;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, e6Var);
            l4Var.setHeight(25);
            return new s4.c1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
