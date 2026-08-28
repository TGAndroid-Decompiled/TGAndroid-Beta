package fh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class d6 extends z41 {
    public final f6 J;

    public d6(f6 f6Var, wk0 wk0Var, Context context, int i9, bh.c cVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(wk0Var, context, i9, 0, false, cVar, b6Var);
        this.J = f6Var;
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        f6 f6Var = this.J;
        if (i9 == 0) {
            Context context = f6Var.getContext();
            int i10 = org.telegram.ui.ActionBar.f6.L6;
            b6Var2 = ((org.telegram.ui.ActionBar.f3) f6Var).resourcesProvider;
            return new f2.q1(new org.telegram.ui.Cells.m4(context, i10, 13, 12, 4, false, false, b6Var2));
        } else if (i9 == 42) {
            Context context2 = f6Var.getContext();
            int i11 = org.telegram.ui.ActionBar.f6.L6;
            b6Var = ((org.telegram.ui.ActionBar.f3) f6Var).resourcesProvider;
            return new f2.q1(new org.telegram.ui.Cells.m4(context2, i11, 13, 12, 4, false, true, b6Var));
        } else {
            return super.x(viewGroup, i9);
        }
    }
}
