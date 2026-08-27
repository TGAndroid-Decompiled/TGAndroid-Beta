package gh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.zk0;

public final class v5 extends b51 {
    public final x5 J;

    public v5(x5 x5Var, zk0 zk0Var, Context context, int i10, ch.c cVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(zk0Var, context, i10, 0, false, cVar, c6Var);
        this.J = x5Var;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        x5 x5Var = this.J;
        if (i10 == 0) {
            return new lk0(new org.telegram.ui.Cells.j4(x5Var.getContext(), org.telegram.ui.ActionBar.g6.L6, 13, 12, 4, false, false, ((org.telegram.ui.ActionBar.e3) x5Var).resourcesProvider));
        }
        return i10 == 42 ? new lk0(new org.telegram.ui.Cells.j4(x5Var.getContext(), org.telegram.ui.ActionBar.g6.L6, 13, 12, 4, false, true, ((org.telegram.ui.ActionBar.e3) x5Var).resourcesProvider)) : super.x(viewGroup, i10);
    }
}
