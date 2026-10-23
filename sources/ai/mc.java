package ai;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.mm0;
public final class mc extends b71 {
    public final nd P;

    public mc(nd ndVar, mm0 mm0Var, Activity activity, int i10, int i11, q qVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(mm0Var, activity, i10, i11, true, qVar, g6Var);
        this.P = ndVar;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (i10 == 42) {
            nd ndVar = this.P;
            Activity parentActivity = ndVar.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.k6.L6;
            g6Var = ((org.telegram.ui.ActionBar.o2) ndVar).resourceProvider;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, g6Var);
            l4Var.setHeight(25);
            return new s4.b1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
