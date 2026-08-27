package nh;

import android.os.Bundle;
import org.telegram.ui.gy;

public final class i1 extends gy {

    public final cg.u0 f18749x4;

    public final k1 f18750y4;

    public i1(k1 k1Var, Bundle bundle, cg.u0 u0Var) {
        super(bundle);
        this.f18750y4 = k1Var;
        this.f18749x4 = u0Var;
    }

    @Override
    public final boolean I3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k1 k1Var = this.f18750y4;
        if (k1Var.Y) {
            return;
        }
        k1Var.Y = true;
        this.f18749x4.run("USER_DECLINED", null);
    }
}
