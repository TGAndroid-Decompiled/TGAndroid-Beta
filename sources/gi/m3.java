package gi;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.mm0;
public final class m3 extends b71 {
    public final u3 P;

    public m3(u3 u3Var, mm0 mm0Var, Activity activity, int i10, int i11, ai.q qVar, g6 g6Var) {
        super(mm0Var, activity, i10, i11, true, qVar, g6Var);
        this.P = u3Var;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        if (i10 == 42) {
            u3 u3Var = this.P;
            Activity parentActivity = u3Var.getParentActivity();
            int i11 = k6.L6;
            g6Var = ((org.telegram.ui.ActionBar.o2) u3Var).resourceProvider;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, g6Var);
            l4Var.setHeight(25);
            return new s4.b1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
