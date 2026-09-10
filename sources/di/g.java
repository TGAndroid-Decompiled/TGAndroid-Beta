package di;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.vl0;
public final class g extends j61 {
    public final m N;

    public g(m mVar, vl0 vl0Var, Activity activity, int i10, int i11, ai.c0 c0Var, f6 f6Var) {
        super(vl0Var, activity, i10, i11, true, c0Var, f6Var);
        this.N = mVar;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 == 42) {
            m mVar = this.N;
            Activity parentActivity = mVar.getParentActivity();
            int i11 = j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.p2) mVar).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, f6Var);
            m4Var.setHeight(25);
            return new s4.c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
