package fi;

import ai.q;
import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.lm0;
import s4.b1;
public final class d extends a71 {
    public final g P;

    public d(g gVar, lm0 lm0Var, Activity activity, int i10, int i11, q qVar, g6 g6Var) {
        super(lm0Var, activity, i10, i11, true, qVar, g6Var);
        this.P = gVar;
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        if (i10 == 42) {
            g gVar = this.P;
            Activity parentActivity = gVar.getParentActivity();
            int i11 = k6.L6;
            g6Var = ((o2) gVar).resourceProvider;
            l4 l4Var = new l4(parentActivity, i11, 21, 0, false, g6Var);
            l4Var.setHeight(25);
            return new b1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
