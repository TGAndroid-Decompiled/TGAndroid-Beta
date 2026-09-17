package fi;

import android.os.Bundle;
import org.telegram.ui.uy;
public final class n1 extends uy {
    public final org.telegram.tgnet.e B4;
    public final p1 C4;

    public n1(p1 p1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.C4 = p1Var;
        this.B4 = eVar;
    }

    @Override
    public final boolean I3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        p1 p1Var = this.C4;
        if (!p1Var.f9909c0) {
            p1Var.f9909c0 = true;
            this.B4.run("USER_DECLINED", null);
        }
    }
}
