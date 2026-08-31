package mh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class k9 extends x51 {
    public final ja K;

    public k9(ja jaVar, tl0 tl0Var, Activity activity, int i10, int i11, eg.p1 p1Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(tl0Var, activity, i10, i11, true, p1Var, g6Var);
        this.K = jaVar;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (i10 == 42) {
            ja jaVar = this.K;
            Activity parentActivity = jaVar.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.k6.L6;
            g6Var = ((org.telegram.ui.ActionBar.p2) jaVar).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, g6Var);
            m4Var.setHeight(25);
            return new f2.m1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
