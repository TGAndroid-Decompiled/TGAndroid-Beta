package lh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class k9 extends w51 {
    public final ja K;

    public k9(ja jaVar, sl0 sl0Var, Activity activity, int i10, int i11, dg.r1 r1Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(sl0Var, activity, i10, i11, true, r1Var, f6Var);
        this.K = jaVar;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == 42) {
            ja jaVar = this.K;
            Activity parentActivity = jaVar.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.p2) jaVar).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, f6Var);
            m4Var.setHeight(25);
            return new f2.l1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
