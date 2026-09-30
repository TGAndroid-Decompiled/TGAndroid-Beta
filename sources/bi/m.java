package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.lx0;
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
        if (uVar.f3595r.getVisibility() == 0) {
            uVar.f3597w.l();
        }
        lx0 lx0Var = uVar.f3599y;
        if (lx0Var != null) {
            d9 d9Var = this.e;
            if (d9Var != null && d9Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            lx0Var.e(z10, true);
        }
    }
}
