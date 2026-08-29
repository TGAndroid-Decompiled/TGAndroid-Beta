package ih;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
public final class o5 extends k51 {
    public final q5 J;

    public o5(q5 q5Var, jl0 jl0Var, Context context, int i10, bg.t1 t1Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(jl0Var, context, i10, 0, false, t1Var, c6Var);
        this.J = q5Var;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        q5 q5Var = this.J;
        if (i10 == 0) {
            Context context = q5Var.getContext();
            int i11 = g6.L6;
            c6Var2 = ((org.telegram.ui.ActionBar.f3) q5Var).resourcesProvider;
            return new f2.n1(new org.telegram.ui.Cells.k4(context, i11, 13, 12, 4, false, false, c6Var2));
        } else if (i10 == 42) {
            Context context2 = q5Var.getContext();
            int i12 = g6.L6;
            c6Var = ((org.telegram.ui.ActionBar.f3) q5Var).resourcesProvider;
            return new f2.n1(new org.telegram.ui.Cells.k4(context2, i12, 13, 12, 4, false, true, c6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
