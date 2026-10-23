package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
public final class h0 extends b71 {
    public final m2 P;

    public h0(m2 m2Var, ai.u1 u1Var, Context context, int i10, f0 f0Var, b bVar) {
        super(u1Var, context, i10, 0, false, f0Var, bVar);
        this.P = m2Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        q0 q0Var;
        v0 v0Var;
        super.v(b1Var, i10);
        m2 m2Var = this.P;
        if (m2Var.f6095y) {
            View view = b1Var.f46343a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.f6001a == m2Var.f6094x) {
                q0Var.b();
                m2Var.f6095y = false;
            }
        }
    }

    @Override
    public final void y(s4.b1 b1Var) {
        q0 q0Var;
        v0 v0Var;
        super.y(b1Var);
        m2 m2Var = this.P;
        if (m2Var.f6095y) {
            View view = b1Var.f46343a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.f6001a == m2Var.f6094x) {
                q0Var.b();
                m2Var.f6095y = false;
            }
        }
    }
}
