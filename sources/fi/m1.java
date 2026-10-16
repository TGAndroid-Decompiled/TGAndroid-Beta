package fi;

import android.os.Bundle;
import org.telegram.ui.yy;
public final class m1 extends yy {
    public final org.telegram.tgnet.e B4;
    public final o1 C4;

    public m1(o1 o1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.C4 = o1Var;
        this.B4 = eVar;
    }

    @Override
    public final boolean G3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        o1 o1Var = this.C4;
        if (!o1Var.f9450c0) {
            o1Var.f9450c0 = true;
            this.B4.run("USER_DECLINED", null);
        }
    }
}
