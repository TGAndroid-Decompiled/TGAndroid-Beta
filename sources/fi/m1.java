package fi;

import android.os.Bundle;
import org.telegram.ui.yy;
public final class m1 extends yy {
    public final org.telegram.tgnet.e A4;
    public final o1 B4;

    public m1(o1 o1Var, Bundle bundle, org.telegram.tgnet.e eVar) {
        super(bundle);
        this.B4 = o1Var;
        this.A4 = eVar;
    }

    @Override
    public final boolean F3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        o1 o1Var = this.B4;
        if (!o1Var.f9447c0) {
            o1Var.f9447c0 = true;
            this.A4.run("USER_DECLINED", null);
        }
    }
}
