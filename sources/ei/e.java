package ei;

import android.app.Activity;
import android.view.ViewGroup;
import ci.u;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import s4.b1;
public final class e extends z61 {
    public final i N;

    public e(i iVar, mm0 mm0Var, Activity activity, int i10, int i11, u uVar, c6 c6Var) {
        super(mm0Var, activity, i10, i11, true, uVar, c6Var);
        this.N = iVar;
    }

    @Override
    public final b1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        if (i10 == 42) {
            i iVar = this.N;
            Activity parentActivity = iVar.getParentActivity();
            int i11 = g6.L6;
            c6Var = ((m2) iVar).resourceProvider;
            m4 m4Var = new m4(parentActivity, i11, 21, 0, false, c6Var);
            m4Var.setHeight(25);
            return new b1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
