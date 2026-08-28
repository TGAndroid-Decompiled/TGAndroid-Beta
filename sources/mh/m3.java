package mh;

import android.app.Activity;
import android.view.ViewGroup;
import kh.b8;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class m3 extends z41 {
    public final u3 J;

    public m3(u3 u3Var, wk0 wk0Var, Activity activity, int i9, int i10, b8 b8Var, b6 b6Var) {
        super(wk0Var, activity, i9, i10, true, b8Var, b6Var);
        this.J = u3Var;
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        b6 b6Var;
        if (i9 == 42) {
            u3 u3Var = this.J;
            Activity parentActivity = u3Var.getParentActivity();
            int i10 = f6.L6;
            b6Var = ((org.telegram.ui.ActionBar.o2) u3Var).resourceProvider;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(parentActivity, i10, 21, 0, false, b6Var);
            m4Var.setHeight(25);
            return new f2.q1(m4Var);
        }
        return super.x(viewGroup, i9);
    }
}
