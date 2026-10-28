package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.k71;
public final class h0 extends k71 {
    public final m2 P;

    public h0(m2 m2Var, bi.r1 r1Var, Context context, int i10, f0 f0Var, b bVar) {
        super(r1Var, context, i10, 0, false, f0Var, bVar);
        this.P = m2Var;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        q0 q0Var;
        v0 v0Var;
        super.v(e1Var, i10);
        m2 m2Var = this.P;
        if (m2Var.f9355y) {
            View view = e1Var.f47773a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.f9237a == m2Var.f9354x) {
                q0Var.c();
                m2Var.f9355y = false;
            }
        }
    }

    @Override
    public final void y(s4.e1 e1Var) {
        q0 q0Var;
        v0 v0Var;
        super.y(e1Var);
        m2 m2Var = this.P;
        if (m2Var.f9355y) {
            View view = e1Var.f47773a;
            if ((view instanceof q0) && (v0Var = (q0Var = (q0) view).K) != null && v0Var.f9237a == m2Var.f9354x) {
                q0Var.c();
                m2Var.f9355y = false;
            }
        }
    }
}
