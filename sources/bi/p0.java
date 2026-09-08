package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.v51;
public final class p0 extends v51 {
    public final e3 N;

    public p0(e3 e3Var, o0 o0Var, Context context, int i10, m0 m0Var, b bVar) {
        super(o0Var, context, i10, 0, false, m0Var, bVar);
        this.N = e3Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        z0 z0Var;
        e1 e1Var;
        super.v(c1Var, i10);
        e3 e3Var = this.N;
        if (e3Var.f3044y) {
            View view = c1Var.f45766a;
            if ((view instanceof z0) && (e1Var = (z0Var = (z0) view).K) != null && e1Var.f2925a == e3Var.f3043x) {
                z0Var.b();
                e3Var.f3044y = false;
            }
        }
    }

    @Override
    public final void y(s4.c1 c1Var) {
        z0 z0Var;
        e1 e1Var;
        super.y(c1Var);
        e3 e3Var = this.N;
        if (e3Var.f3044y) {
            View view = c1Var.f45766a;
            if ((view instanceof z0) && (e1Var = (z0Var = (z0) view).K) != null && e1Var.f2925a == e3Var.f3043x) {
                z0Var.b();
                e3Var.f3044y = false;
            }
        }
    }
}
