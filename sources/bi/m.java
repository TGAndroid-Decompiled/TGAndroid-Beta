package bi;

import ai.e9;
import android.content.Context;
import org.telegram.ui.Components.ay0;
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
        if (uVar.f3929r.getVisibility() == 0) {
            uVar.f3931w.l();
        }
        ay0 ay0Var = uVar.f3933y;
        if (ay0Var != null) {
            e9 e9Var = this.f3917e;
            if (e9Var != null && e9Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ay0Var.e(z10, true);
        }
    }
}
