package hi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
public final class f extends j71 {
    public final k P;

    public f(k kVar, mm0 mm0Var, Activity activity, int i10, int i11, ai.e eVar, u6 u6Var) {
        super(mm0Var, activity, i10, i11, true, eVar, u6Var);
        this.P = kVar;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        if (i10 == 42) {
            k kVar = this.P;
            Activity parentActivity = kVar.getParentActivity();
            int i11 = y6.L6;
            u6Var = ((org.telegram.ui.ActionBar.r2) kVar).resourceProvider;
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(parentActivity, i11, 21, 0, false, u6Var);
            q4Var.setHeight(25);
            return new s4.e1(q4Var);
        }
        return super.x(viewGroup, i10);
    }
}
