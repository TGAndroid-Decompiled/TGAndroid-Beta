package ii;

import android.os.Bundle;
import org.telegram.ui.uw;
public final class h1 extends uw {
    public final ai.n0 C4;
    public final j1 D4;

    public h1(j1 j1Var, Bundle bundle, ai.n0 n0Var) {
        super(bundle);
        this.D4 = j1Var;
        this.C4 = n0Var;
    }

    @Override
    public final boolean U3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        j1 j1Var = this.D4;
        if (!j1Var.V1) {
            j1Var.V1 = true;
            this.C4.a("USER_DECLINED", null);
        }
    }
}
