package di;

import android.content.Context;
import ci.z6;
import org.telegram.ui.Components.vx0;
public final class l extends q {
    public final r v;

    public l(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        r rVar = this.v;
        if (rVar.f8066r.getVisibility() == 0) {
            rVar.f8068w.l();
        }
        vx0 vx0Var = rVar.f8070y;
        if (vx0Var != null) {
            z6 z6Var = this.e;
            if (z6Var != null && z6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            vx0Var.e(z10, true);
        }
    }
}
