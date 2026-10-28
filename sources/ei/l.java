package ei;

import android.content.Context;
import di.z6;
import org.telegram.ui.Components.fy0;
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
        if (rVar.f10005r.getVisibility() == 0) {
            rVar.f10007w.l();
        }
        fy0 fy0Var = rVar.f10009y;
        if (fy0Var != null) {
            z6 z6Var = this.e;
            if (z6Var != null && z6Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            fy0Var.e(z10, true);
        }
    }
}
