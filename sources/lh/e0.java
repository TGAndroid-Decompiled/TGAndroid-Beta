package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k51;
public final class e0 extends k51 {
    public final f2 J;

    public e0(f2 f2Var, jh.e1 e1Var, Context context, int i10, c0 c0Var, b bVar) {
        super(e1Var, context, i10, 0, false, c0Var, bVar);
        this.J = f2Var;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        n0 n0Var;
        s0 s0Var;
        super.v(n1Var, i10);
        f2 f2Var = this.J;
        if (f2Var.f16288y) {
            View view = n1Var.f6432a;
            if ((view instanceof n0) && (s0Var = (n0Var = (n0) view).G) != null && s0Var.f16194a == f2Var.f16287x) {
                n0Var.c();
                f2Var.f16288y = false;
            }
        }
    }

    @Override
    public final void y(f2.n1 n1Var) {
        n0 n0Var;
        s0 s0Var;
        super.y(n1Var);
        f2 f2Var = this.J;
        if (f2Var.f16288y) {
            View view = n1Var.f6432a;
            if ((view instanceof n0) && (s0Var = (n0Var = (n0) view).G) != null && s0Var.f16194a == f2Var.f16287x) {
                n0Var.c();
                f2Var.f16288y = false;
            }
        }
    }
}
