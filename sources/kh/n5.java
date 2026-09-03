package kh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class n5 extends w51 {
    public final p5 K;

    public n5(p5 p5Var, rl0 rl0Var, Context context, int i10, dg.r1 r1Var, f6 f6Var) {
        super(rl0Var, context, i10, 0, false, r1Var, f6Var);
        this.K = p5Var;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        p5 p5Var = this.K;
        if (i10 == 0) {
            Context context = p5Var.getContext();
            int i11 = j6.L6;
            f6Var2 = ((org.telegram.ui.ActionBar.g3) p5Var).resourcesProvider;
            return new f2.l1(new org.telegram.ui.Cells.l4(context, i11, 13, 12, 4, false, false, f6Var2));
        } else if (i10 == 42) {
            Context context2 = p5Var.getContext();
            int i12 = j6.L6;
            f6Var = ((org.telegram.ui.ActionBar.g3) p5Var).resourcesProvider;
            return new f2.l1(new org.telegram.ui.Cells.l4(context2, i12, 13, 12, 4, false, true, f6Var));
        } else {
            return super.x(viewGroup, i10);
        }
    }
}
