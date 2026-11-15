package ki;

import android.os.Bundle;
import org.telegram.ui.yw;
public final class h1 extends yw {
    public final bi.h0 D4;
    public final j1 E4;

    public h1(j1 j1Var, Bundle bundle, bi.h0 h0Var) {
        super(bundle);
        this.E4 = j1Var;
        this.D4 = h0Var;
    }

    @Override
    public final boolean U3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        j1 j1Var = this.E4;
        if (!j1Var.Y1) {
            j1Var.Y1 = true;
            this.D4.a("USER_DECLINED", null);
        }
    }
}
