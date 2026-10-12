package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.z61;
public final class p0 extends z61 {
    public final h3 N;

    public p0(h3 h3Var, o0 o0Var, Context context, int i10, m0 m0Var, b bVar) {
        super(o0Var, context, i10, 0, false, m0Var, bVar);
        this.N = h3Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        z0 z0Var;
        e1 e1Var;
        super.v(b1Var, i10);
        h3 h3Var = this.N;
        if (h3Var.f3066y) {
            View view = b1Var.f44838a;
            if ((view instanceof z0) && (e1Var = (z0Var = (z0) view).K) != null && e1Var.f2970a == h3Var.f3065x) {
                z0Var.b();
                h3Var.f3066y = false;
            }
        }
    }

    @Override
    public final void y(s4.b1 b1Var) {
        z0 z0Var;
        e1 e1Var;
        super.y(b1Var);
        h3 h3Var = this.N;
        if (h3Var.f3066y) {
            View view = b1Var.f44838a;
            if ((view instanceof z0) && (e1Var = (z0Var = (z0) view).K) != null && e1Var.f2970a == h3Var.f3065x) {
                z0Var.b();
                h3Var.f3066y = false;
            }
        }
    }
}
