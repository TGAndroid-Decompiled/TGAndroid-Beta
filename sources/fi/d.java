package fi;

import ai.q;
import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import s4.b1;
public final class d extends t61 {
    public final g N;

    public d(g gVar, im0 im0Var, Activity activity, int i10, int i11, q qVar, d6 d6Var) {
        super(im0Var, activity, i10, i11, true, qVar, d6Var);
        this.N = gVar;
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 == 42) {
            g gVar = this.N;
            Activity parentActivity = gVar.getParentActivity();
            int i11 = h6.L6;
            d6Var = ((n2) gVar).resourceProvider;
            l4 l4Var = new l4(parentActivity, i11, 21, 0, false, d6Var);
            l4Var.setHeight(25);
            return new b1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
