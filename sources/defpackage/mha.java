package defpackage;

import android.content.Context;
import android.os.Bundle;
public final class mha extends hv1 {
    public final eja f;

    public mha(eja ejaVar, Context context, wk5 wk5Var, Bundle bundle) {
        super(context, wk5Var, bundle);
        this.f = ejaVar;
    }

    @Override
    public final void b(boolean z) {
        s7 s7Var = this.f.q0;
        if (s7Var != null) {
            s7Var.setShowSearchProgress(z);
        }
    }
}
