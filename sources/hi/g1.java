package hi;

import android.os.Bundle;
import org.telegram.ui.yw;
public final class g1 extends yw {
    public final bi.t0 C4;
    public final i1 D4;

    public g1(i1 i1Var, Bundle bundle, bi.t0 t0Var) {
        super(bundle);
        this.D4 = i1Var;
        this.C4 = t0Var;
    }

    @Override
    public final boolean U3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i1 i1Var = this.D4;
        if (!i1Var.U1) {
            i1Var.U1 = true;
            this.C4.a("USER_DECLINED", null);
        }
    }
}
