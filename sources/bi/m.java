package bi;

import ai.d9;
import android.content.Context;
import org.telegram.ui.Components.ux0;
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
        if (uVar.f3880r.getVisibility() == 0) {
            uVar.f3882w.l();
        }
        ux0 ux0Var = uVar.f3884y;
        if (ux0Var != null) {
            d9 d9Var = this.f3868e;
            if (d9Var != null && d9Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ux0Var.e(z10, true);
        }
    }
}
