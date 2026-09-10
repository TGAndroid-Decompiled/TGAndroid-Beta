package ci;

import ai.c0;
import android.app.Activity;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.vl0;
import s4.c1;
public final class e extends j61 {
    public final j N;

    public e(j jVar, vl0 vl0Var, Activity activity, int i10, int i11, c0 c0Var, f6 f6Var) {
        super(vl0Var, activity, i10, i11, true, c0Var, f6Var);
        this.N = jVar;
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        if (i10 == 42) {
            j jVar = this.N;
            Activity parentActivity = jVar.getParentActivity();
            int i11 = j6.L6;
            f6Var = ((p2) jVar).resourceProvider;
            m4 m4Var = new m4(parentActivity, i11, 21, 0, false, f6Var);
            m4Var.setHeight(25);
            return new c1(m4Var);
        }
        return super.x(viewGroup, i10);
    }
}
