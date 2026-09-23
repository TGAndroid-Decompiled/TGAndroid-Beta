package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.v51;
public final class x0 extends v51 {
    public final r3 N;

    public x0(r3 r3Var, w0 w0Var, Context context, int i10, t0 t0Var, d dVar) {
        super(w0Var, context, i10, 0, false, t0Var, dVar);
        this.N = r3Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        h1 h1Var;
        m1 m1Var;
        super.v(c1Var, i10);
        r3 r3Var = this.N;
        if (r3Var.f1343y) {
            View view = c1Var.f42627a;
            if ((view instanceof h1) && (m1Var = (h1Var = (h1) view).K) != null && m1Var.f1226a == r3Var.f1342x) {
                h1Var.c();
                r3Var.f1343y = false;
            }
        }
    }

    @Override
    public final void y(s4.c1 c1Var) {
        h1 h1Var;
        m1 m1Var;
        super.y(c1Var);
        r3 r3Var = this.N;
        if (r3Var.f1343y) {
            View view = c1Var.f42627a;
            if ((view instanceof h1) && (m1Var = (h1Var = (h1) view).K) != null && m1Var.f1226a == r3Var.f1342x) {
                h1Var.c();
                r3Var.f1343y = false;
            }
        }
    }
}
