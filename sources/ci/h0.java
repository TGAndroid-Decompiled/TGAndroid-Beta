package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.u61;
public final class h0 extends u61 {
    public final n2 N;

    public h0(n2 n2Var, ai.u1 u1Var, Context context, int i10, f0 f0Var, b bVar) {
        super(u1Var, context, i10, 0, false, f0Var, bVar);
        this.N = n2Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        q0 q0Var;
        v0 v0Var;
        super.v(b1Var, i10);
        n2 n2Var = this.N;
        if (n2Var.f6145y) {
            View view = b1Var.f45921a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.f6064a == n2Var.f6144x) {
                q0Var.b();
                n2Var.f6145y = false;
            }
        }
    }

    @Override
    public final void y(s4.b1 b1Var) {
        q0 q0Var;
        v0 v0Var;
        super.y(b1Var);
        n2 n2Var = this.N;
        if (n2Var.f6145y) {
            View view = b1Var.f45921a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.f6064a == n2Var.f6144x) {
                q0Var.b();
                n2Var.f6145y = false;
            }
        }
    }
}
