package gi;

import android.os.Bundle;
import org.telegram.ui.ey;
public final class j1 extends ey {
    public final ai.s0 D4;
    public final l1 E4;

    public j1(l1 l1Var, Bundle bundle, ai.s0 s0Var) {
        super(bundle);
        this.E4 = l1Var;
        this.D4 = s0Var;
    }

    @Override
    public final boolean G3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l1 l1Var = this.E4;
        if (!l1Var.f11340c0) {
            l1Var.f11340c0 = true;
            this.D4.run("USER_DECLINED", null);
        }
    }
}
