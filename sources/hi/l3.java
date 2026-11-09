package hi;

import android.os.Bundle;
import org.telegram.ui.cn;
public final class l3 extends cn {
    public final org.telegram.ui.ActionBar.v2 f14784td;

    public l3(Bundle bundle, org.telegram.ui.ActionBar.v2 v2Var) {
        super(bundle);
        this.f14784td = v2Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.v2 v2Var = this.f14784td;
        v2Var.a0(null);
        v2Var.show();
    }
}
