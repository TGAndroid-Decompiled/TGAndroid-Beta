package bi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
public final class fc extends j71 {
    public final dd P;

    public fc(dd ddVar, mm0 mm0Var, Activity activity, int i10, int i11, ai.e eVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(mm0Var, activity, i10, i11, true, eVar, u6Var);
        this.P = ddVar;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        if (i10 == 42) {
            dd ddVar = this.P;
            Activity parentActivity = ddVar.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.y6.L6;
            u6Var = ((org.telegram.ui.ActionBar.r2) ddVar).resourceProvider;
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(parentActivity, i11, 21, 0, false, u6Var);
            q4Var.setHeight(25);
            return new s4.e1(q4Var);
        }
        return super.x(viewGroup, i10);
    }
}
