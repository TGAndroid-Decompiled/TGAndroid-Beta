package fh;

import android.content.Context;
import org.telegram.ui.Components.oc;
public final class x1 extends u6 {
    public final p2 f6861t0;

    public x1(p2 p2Var, Context context, int i9, zf.k kVar, long j10, c1 c1Var) {
        super(context, i9, null, kVar, j10, c1Var, false, false);
        this.f6861t0 = p2Var;
    }

    @Override
    public final oc W() {
        org.telegram.ui.ActionBar.b6 b6Var;
        p2 p2Var = this.f6861t0;
        org.telegram.ui.ActionBar.d3 d3Var = p2Var.container;
        b6Var = p2Var.resourcesProvider;
        return new oc(d3Var, b6Var);
    }
}
