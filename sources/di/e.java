package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.xl0;
import s4.c1;
public final class e extends k61 {
    public final i N;

    public e(i iVar, xl0 xl0Var, Activity activity, int i10, int i11, v vVar, d6 d6Var) {
        super(xl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = iVar;
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 == 42) {
            i iVar = this.N;
            Activity parentActivity = iVar.getParentActivity();
            int i11 = h6.L6;
            d6Var = ((m2) iVar).resourceProvider;
            m4 m4Var = new m4(parentActivity, i11, 21, 0, false, d6Var);
            m4Var.setHeight(25);
            return new c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
