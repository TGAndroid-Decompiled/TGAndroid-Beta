package lh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class o5 extends x51 {
    public final q5 K;

    public o5(q5 q5Var, tl0 tl0Var, Context context, int i10, eg.p1 p1Var, g6 g6Var) {
        super(tl0Var, context, i10, 0, false, p1Var, g6Var);
        this.K = q5Var;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        q5 q5Var = this.K;
        if (i10 == 0) {
            Context context = q5Var.getContext();
            int i11 = k6.L6;
            g6Var2 = ((org.telegram.ui.ActionBar.h3) q5Var).resourcesProvider;
            return new f2.m1(new org.telegram.ui.Cells.m4(context, i11, 13, 12, 4, false, false, g6Var2));
        } else if (i10 == 42) {
            Context context2 = q5Var.getContext();
            int i12 = k6.L6;
            g6Var = ((org.telegram.ui.ActionBar.h3) q5Var).resourcesProvider;
            return new f2.m1(new org.telegram.ui.Cells.m4(context2, i12, 13, 12, 4, false, true, g6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
