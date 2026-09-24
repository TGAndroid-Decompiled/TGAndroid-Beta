package ei;

import android.os.Bundle;
import org.telegram.ui.qy;
public final class n1 extends qy {
    public final org.telegram.tgnet.e A4;
    public final p1 B4;

    public n1(p1 p1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.B4 = p1Var;
        this.A4 = eVar;
    }

    @Override
    public final boolean I3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        p1 p1Var = this.B4;
        if (!p1Var.f8520c0) {
            p1Var.f8520c0 = true;
            this.A4.run("USER_DECLINED", null);
        }
    }
}
