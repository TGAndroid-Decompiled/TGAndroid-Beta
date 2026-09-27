package ei;

import android.os.Bundle;
import org.telegram.ui.ty;
public final class n1 extends ty {
    public final p1 A4;
    public final org.telegram.tgnet.e f8489z4;

    public n1(p1 p1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.A4 = p1Var;
        this.f8489z4 = eVar;
    }

    @Override
    public final boolean R3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        p1 p1Var = this.A4;
        if (!p1Var.f8523c0) {
            p1Var.f8523c0 = true;
            this.f8489z4.run("USER_DECLINED", null);
        }
    }
}
