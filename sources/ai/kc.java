package ai;

import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class kc extends s61 {
    public final ld N;

    public kc(ld ldVar, im0 im0Var, Activity activity, int i10, int i11, q qVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(im0Var, activity, i10, i11, true, qVar, d6Var);
        this.N = ldVar;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        if (i10 == 42) {
            ld ldVar = this.N;
            Activity parentActivity = ldVar.getParentActivity();
            int i11 = org.telegram.ui.ActionBar.h6.L6;
            d6Var = ((org.telegram.ui.ActionBar.n2) ldVar).resourceProvider;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(parentActivity, i11, 21, 0, false, d6Var);
            l4Var.setHeight(25);
            return new s4.b1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
