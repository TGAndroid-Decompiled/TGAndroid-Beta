package di;

import android.content.Context;
import ci.z6;
import org.telegram.ui.Components.rx0;
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
        if (rVar.f8060r.getVisibility() == 0) {
            rVar.f8062w.l();
        }
        rx0 rx0Var = rVar.f8064y;
        if (rx0Var != null) {
            z6 z6Var = this.e;
            if (z6Var != null && z6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            rx0Var.e(z10, true);
        }
    }
}
