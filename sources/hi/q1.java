package hi;

import android.os.Bundle;
import org.telegram.ui.ey;
public final class q1 extends ey {
    public final bi.t0 C4;
    public final s1 D4;

    public q1(s1 s1Var, Bundle bundle, bi.t0 t0Var) {
        super(bundle);
        this.D4 = s1Var;
        this.C4 = t0Var;
    }

    @Override
    public final boolean Q3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        s1 s1Var = this.D4;
        if (!s1Var.f13262c0) {
            s1Var.f13262c0 = true;
            this.C4.run("USER_DECLINED", null);
        }
    }
}
