package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.s61;
public final class h0 extends s61 {
    public final m2 N;

    public h0(m2 m2Var, ai.u1 u1Var, Context context, int i10, f0 f0Var, b bVar) {
        super(u1Var, context, i10, 0, false, f0Var, bVar);
        this.N = m2Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        q0 q0Var;
        v0 v0Var;
        super.v(b1Var, i10);
        m2 m2Var = this.N;
        if (m2Var.f6088y) {
            View view = b1Var.f45910a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.f5994a == m2Var.f6087x) {
                q0Var.b();
                m2Var.f6088y = false;
            }
        }
    }

    @Override
    public final void y(s4.b1 b1Var) {
        q0 q0Var;
        v0 v0Var;
        super.y(b1Var);
        m2 m2Var = this.N;
        if (m2Var.f6088y) {
            View view = b1Var.f45910a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.f5994a == m2Var.f6087x) {
                q0Var.b();
                m2Var.f6088y = false;
            }
        }
    }
}
