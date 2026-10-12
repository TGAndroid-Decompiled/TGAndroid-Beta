package bi;

import ai.e9;
import android.content.Context;
import org.telegram.ui.Components.gy0;
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
        if (uVar.f3928r.getVisibility() == 0) {
            uVar.f3930w.l();
        }
        gy0 gy0Var = uVar.f3932y;
        if (gy0Var != null) {
            e9 e9Var = this.f3916e;
            if (e9Var != null && e9Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            gy0Var.e(z10, true);
        }
    }
}
