package ih;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.z41;
public final class g0 extends z41 {
    public final h2 J;

    public g0(h2 h2Var, gh.f1 f1Var, Context context, int i9, e0 e0Var, b bVar) {
        super(f1Var, context, i9, 0, false, e0Var, bVar);
        this.J = h2Var;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        p0 p0Var;
        u0 u0Var;
        super.v(q1Var, i9);
        h2 h2Var = this.J;
        if (h2Var.f12285y) {
            View view = q1Var.f5501a;
            if ((view instanceof p0) && (u0Var = (p0Var = (p0) view).G) != null && u0Var.f12174a == h2Var.f12284x) {
                p0Var.c();
                h2Var.f12285y = false;
            }
        }
    }

    @Override
    public final void y(f2.q1 q1Var) {
        p0 p0Var;
        u0 u0Var;
        super.y(q1Var);
        h2 h2Var = this.J;
        if (h2Var.f12285y) {
            View view = q1Var.f5501a;
            if ((view instanceof p0) && (u0Var = (p0Var = (p0) view).G) != null && u0Var.f12174a == h2Var.f12284x) {
                p0Var.c();
                h2Var.f12285y = false;
            }
        }
    }
}
