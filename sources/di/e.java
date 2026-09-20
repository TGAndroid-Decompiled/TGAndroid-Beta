package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.vl0;
import s4.c1;
public final class e extends k61 {
    public final i N;

    public e(i iVar, vl0 vl0Var, Activity activity, int i10, int i11, v vVar, f6 f6Var) {
        super(vl0Var, activity, i10, i11, true, vVar, f6Var);
        this.N = iVar;
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 == 42) {
            i iVar = this.N;
            Activity parentActivity = iVar.getParentActivity();
            int i11 = j6.L6;
            f6Var = ((n2) iVar).resourceProvider;
            n4 n4Var = new n4(parentActivity, i11, 21, 0, false, f6Var);
            n4Var.setHeight(25);
            return new c1(n4Var);
        }
        return super.x(viewGroup, i10);
    }
}
