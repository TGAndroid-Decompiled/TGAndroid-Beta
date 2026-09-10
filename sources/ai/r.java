package ai;

import android.content.Context;
import org.telegram.ui.Components.jx0;
import zh.a5;
public final class r extends z {
    public final a0 v;

    public r(a0 a0Var, Context context) {
        super(a0Var, context);
        this.v = a0Var;
    }

    @Override
    public final void l() {
        boolean z10;
        super.l();
        a0 a0Var = this.v;
        if (a0Var.f416r.getVisibility() == 0) {
            a0Var.f418w.l();
        }
        jx0 jx0Var = a0Var.f420y;
        if (jx0Var != null) {
            a5 a5Var = this.e;
            if (a5Var != null && a5Var.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            jx0Var.e(z10, true);
        }
    }
}
