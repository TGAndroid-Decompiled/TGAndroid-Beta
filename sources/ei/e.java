package ei;

import android.app.Activity;
import android.view.ViewGroup;
import ci.u;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import s4.c1;
public final class e extends v51 {
    public final i N;

    public e(i iVar, ll0 ll0Var, Activity activity, int i10, int i11, u uVar, f6 f6Var) {
        super(ll0Var, activity, i10, i11, true, uVar, f6Var);
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
            l4 l4Var = new l4(parentActivity, i11, 21, 0, false, f6Var);
            l4Var.setHeight(25);
            return new c1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
