package gh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class o9 extends z41 {
    public final oa J;

    public o9(oa oaVar, wk0 wk0Var, Activity activity, int i9, int i10, bh.c cVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(wk0Var, activity, i9, i10, true, cVar, b6Var);
        this.J = oaVar;
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        if (i9 == 42) {
            oa oaVar = this.J;
            Activity parentActivity = oaVar.getParentActivity();
            int i10 = org.telegram.ui.ActionBar.f6.L6;
            b6Var = ((org.telegram.ui.ActionBar.o2) oaVar).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i10, 21, 0, false, b6Var);
            m4Var.setHeight(25);
            return new f2.q1(m4Var);
        }
        return super.x(viewGroup, i9);
    }
}
