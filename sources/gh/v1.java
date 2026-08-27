package gh;

import android.content.Context;
import org.telegram.ui.Components.mc;

public final class v1 extends hh.i5 {

    public final k2 f7586n1;

    public v1(k2 k2Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, j10, c6Var, null);
        this.f7586n1 = k2Var;
    }

    @Override
    public final mc getBulletinFactory() {
        k2 k2Var = this.f7586n1;
        return new mc(k2Var.container, k2Var.resourcesProvider);
    }
}
