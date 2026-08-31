package oh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.x51;
public final class e0 extends x51 {
    public final h2 K;

    public e0(h2 h2Var, mh.d1 d1Var, Context context, int i10, c0 c0Var, b bVar) {
        super(d1Var, context, i10, 0, false, c0Var, bVar);
        this.K = h2Var;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        o0 o0Var;
        t0 t0Var;
        super.v(m1Var, i10);
        h2 h2Var = this.K;
        if (h2Var.f17841y) {
            View view = m1Var.f5875a;
            if ((view instanceof o0) && (t0Var = (o0Var = (o0) view).H) != null && t0Var.f17755a == h2Var.f17840x) {
                o0Var.c();
                h2Var.f17841y = false;
            }
        }
    }

    @Override
    public final void y(f2.m1 m1Var) {
        o0 o0Var;
        t0 t0Var;
        super.y(m1Var);
        h2 h2Var = this.K;
        if (h2Var.f17841y) {
            View view = m1Var.f5875a;
            if ((view instanceof o0) && (t0Var = (o0Var = (o0) view).H) != null && t0Var.f17755a == h2Var.f17840x) {
                o0Var.c();
                h2Var.f17841y = false;
            }
        }
    }
}
