package hi;

import android.os.Bundle;
import org.telegram.ui.ww;
public final class g1 extends ww {
    public final bi.t0 B4;
    public final i1 C4;

    public g1(i1 i1Var, Bundle bundle, bi.t0 t0Var) {
        super(bundle);
        this.C4 = i1Var;
        this.B4 = t0Var;
    }

    @Override
    public final boolean U3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i1 i1Var = this.C4;
        if (!i1Var.U1) {
            i1Var.U1 = true;
            this.B4.a("USER_DECLINED", null);
        }
    }
}
