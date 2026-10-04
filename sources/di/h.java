package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
import s4.c1;
public final class h extends u61 {
    public final k N;

    public h(k kVar, zl0 zl0Var, Activity activity, int i10, int i11, v vVar, d6 d6Var) {
        super(zl0Var, activity, i10, i11, true, vVar, d6Var);
        this.N = kVar;
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        if (i10 == 42) {
            k kVar = this.N;
            Activity parentActivity = kVar.getParentActivity();
            int i11 = i6.L6;
            d6Var = ((n2) kVar).resourceProvider;
            m4 m4Var = new m4(parentActivity, i11, 21, 0, false, d6Var);
            m4Var.setHeight(25);
            return new c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
