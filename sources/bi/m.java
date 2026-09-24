package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.ix0;
public final class m extends t {
    public final u v;

    public m(u uVar, Context context) {
        super(uVar, context);
        this.v = uVar;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        u uVar = this.v;
        if (uVar.f3588r.getVisibility() == 0) {
            uVar.f3590w.l();
        }
        ix0 ix0Var = uVar.f3592y;
        if (ix0Var != null) {
            d9 d9Var = this.e;
            if (d9Var != null && d9Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ix0Var.e(z10, true);
        }
    }
}
