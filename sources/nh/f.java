package nh;

import android.app.Activity;
import android.view.ViewGroup;
import lh.a8;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

public final class f extends b51 {
    public final k J;

    public f(k kVar, zk0 zk0Var, Activity activity, int i10, int i11, a8 a8Var, c6 c6Var) {
        super(zk0Var, activity, i10, i11, true, a8Var, c6Var);
        this.J = kVar;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        if (i10 != 42) {
            return super.x(viewGroup, i10);
        }
        k kVar = this.J;
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(kVar.getParentActivity(), g6.L6, 21, 0, false, ((org.telegram.ui.ActionBar.n2) kVar).resourceProvider);
        j4Var.setHeight(25);
        return new lk0(j4Var);
    }
}
