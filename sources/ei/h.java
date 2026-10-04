package ei;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class h extends u61 {
    public final m N;

    public h(m mVar, zl0 zl0Var, Activity activity, int i10, int i11, bi.v vVar, d6 d6Var) {
        super(zl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = mVar;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 == 42) {
            m mVar = this.N;
            Activity parentActivity = mVar.getParentActivity();
            int i11 = i6.L6;
            d6Var = ((org.telegram.ui.ActionBar.n2) mVar).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i11, 21, 0, false, d6Var);
            m4Var.setHeight(25);
            return new s4.c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
