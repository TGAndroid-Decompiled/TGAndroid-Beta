package fi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class h extends v51 {
    public final m N;

    public h(m mVar, ll0 ll0Var, Activity activity, int i10, int i11, ci.u uVar, f6 f6Var) {
        super(ll0Var, activity, i10, i11, true, uVar, f6Var);
        this.N = mVar;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 == 42) {
            m mVar = this.N;
            Activity parentActivity = mVar.getParentActivity();
            int i11 = j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.n2) mVar).resourceProvider;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, f6Var);
            l4Var.setHeight(25);
            return new s4.c1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
