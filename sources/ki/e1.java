package ki;

import android.os.Bundle;
import org.telegram.ui.bx;
public final class e1 extends bx {
    public final bi.h0 G4;
    public final g1 H4;

    public e1(g1 g1Var, Bundle bundle, bi.h0 h0Var) {
        super(bundle);
        this.H4 = g1Var;
        this.G4 = h0Var;
    }

    @Override
    public final boolean U3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        g1 g1Var = this.H4;
        if (!g1Var.Y1) {
            g1Var.Y1 = true;
            this.G4.a("USER_DECLINED", null);
        }
    }
}
