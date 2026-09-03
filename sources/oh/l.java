package oh;

import android.content.Context;
import nh.l6;
import org.telegram.ui.Components.zw0;
public final class l extends q {
    public final r v;

    public l(r rVar, Context context) {
        super(rVar, context);
        this.v = rVar;
    }

    @Override
    public final void l() {
        boolean z4;
        super.l();
        r rVar = this.v;
        if (rVar.f16586r.getVisibility() == 0) {
            rVar.f16588w.l();
        }
        zw0 zw0Var = rVar.f16590y;
        if (zw0Var != null) {
            l6 l6Var = this.e;
            if (l6Var != null && l6Var.k()) {
                z4 = true;
            } else {
                z4 = false;
            }
            zw0Var.e(z4, true);
        }
    }
}
