package ei;

import android.os.Bundle;
import org.telegram.ui.uy;
public final class o1 extends uy {
    public final q1 A4;
    public final org.telegram.tgnet.e f9235z4;

    public o1(q1 q1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.A4 = q1Var;
        this.f9235z4 = eVar;
    }

    @Override
    public final boolean R3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        q1 q1Var = this.A4;
        if (!q1Var.f9271c0) {
            q1Var.f9271c0 = true;
            this.f9235z4.run("USER_DECLINED", null);
        }
    }
}
