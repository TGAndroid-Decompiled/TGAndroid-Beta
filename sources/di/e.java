package di;

import android.app.Activity;
import android.view.ViewGroup;
import bi.v;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.rm0;
import s4.d1;
public final class e extends d71 {
    public final i N;

    public e(i iVar, rm0 rm0Var, Activity activity, int i10, int i11, v vVar, e6 e6Var) {
        super(rm0Var, activity, i10, i11, true, vVar, e6Var);
        this.N = iVar;
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        if (i10 == 42) {
            i iVar = this.N;
            Activity parentActivity = iVar.getParentActivity();
            int i11 = i6.L6;
            e6Var = ((n2) iVar).resourceProvider;
            m4 m4Var = new m4(parentActivity, i11, 21, 0, false, e6Var);
            m4Var.setHeight(25);
            return new d1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
