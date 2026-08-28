package jh;

import android.content.Context;
import ih.n6;
import org.telegram.ui.Components.gw0;
public final class l extends p {
    public final q v;

    public l(q qVar, Context context) {
        super(qVar, context);
        this.v = qVar;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        q qVar = this.v;
        if (qVar.f14369r.getVisibility() == 0) {
            qVar.f14371w.l();
        }
        gw0 gw0Var = qVar.f14373y;
        if (gw0Var != null) {
            n6 n6Var = this.f14358e;
            if (n6Var != null && n6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            gw0Var.e(z10, true);
        }
    }
}
