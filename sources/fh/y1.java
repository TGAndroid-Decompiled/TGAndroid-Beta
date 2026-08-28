package fh;

import android.content.Context;
import org.telegram.ui.Components.oc;
public final class y1 extends gh.k5 {
    public final p2 f6878n1;

    public y1(p2 p2Var, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, j10, b6Var, null);
        this.f6878n1 = p2Var;
    }

    @Override
    public final oc getBulletinFactory() {
        org.telegram.ui.ActionBar.b6 b6Var;
        p2 p2Var = this.f6878n1;
        org.telegram.ui.ActionBar.d3 d3Var = p2Var.container;
        b6Var = p2Var.resourcesProvider;
        return new oc(d3Var, b6Var);
    }
}
