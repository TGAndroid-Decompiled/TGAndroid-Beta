package gi;

import android.os.Bundle;
import org.telegram.ui.cy;
public final class j1 extends cy {
    public final ai.s0 B4;
    public final l1 C4;

    public j1(l1 l1Var, Bundle bundle, ai.s0 s0Var) {
        super(bundle);
        this.C4 = l1Var;
        this.B4 = s0Var;
    }

    @Override
    public final boolean G3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l1 l1Var = this.C4;
        if (!l1Var.f11318c0) {
            l1Var.f11318c0 = true;
            this.B4.run("USER_DECLINED", null);
        }
    }
}
