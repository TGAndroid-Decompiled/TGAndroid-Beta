package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
import s4.c1;
public final class e extends w51 {
    public final i N;

    public e(i iVar, ll0 ll0Var, Activity activity, int i10, int i11, v vVar, e6 e6Var) {
        super(ll0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = iVar;
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 == 42) {
            i iVar = this.N;
            Activity parentActivity = iVar.getParentActivity();
            int i11 = i6.L6;
            e6Var = ((n2) iVar).resourceProvider;
            l4 l4Var = new l4(parentActivity, i11, 21, 0, false, e6Var);
            l4Var.setHeight(25);
            return new c1(l4Var);
        }
        return super.x(viewGroup, i10);
    }
}
