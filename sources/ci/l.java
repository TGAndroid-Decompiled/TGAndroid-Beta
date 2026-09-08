package ci;

import android.content.Context;
import bi.l8;
import org.telegram.ui.Components.xw0;
public final class l extends s {
    public final t v;

    public l(t tVar, Context context) {
        super(tVar, context);
        this.v = tVar;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        t tVar = this.v;
        if (tVar.f4864r.getVisibility() == 0) {
            tVar.f4866w.l();
        }
        xw0 xw0Var = tVar.f4868y;
        if (xw0Var != null) {
            l8 l8Var = this.f4852e;
            if (l8Var != null && l8Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            xw0Var.e(z10, true);
        }
    }
}
