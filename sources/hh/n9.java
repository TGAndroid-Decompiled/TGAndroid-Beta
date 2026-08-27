package hh;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

public final class n9 extends b51 {
    public final oa J;

    public n9(oa oaVar, zk0 zk0Var, Activity activity, int i10, int i11, ch.c cVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(zk0Var, activity, i10, i11, true, cVar, c6Var);
        this.J = oaVar;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        oa oaVar = this.J;
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(oaVar.getParentActivity(), org.telegram.ui.ActionBar.g6.L6, 21, 0, false, ((org.telegram.ui.ActionBar.n2) oaVar).resourceProvider);
        j4Var.setHeight(25);
        return new lk0(j4Var);
    }
}
