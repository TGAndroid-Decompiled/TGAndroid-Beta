package hi;

import android.os.Bundle;
import org.telegram.ui.zw;
public final class g1 extends zw {
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
        if (!i1Var.X1) {
            i1Var.X1 = true;
            this.C4.a("USER_DECLINED", null);
        }
    }
}
