package hi;

import android.os.Bundle;
import org.telegram.ui.an;
public final class l3 extends an {
    public final org.telegram.ui.ActionBar.v2 f14784rd;

    public l3(Bundle bundle, org.telegram.ui.ActionBar.v2 v2Var) {
        super(bundle);
        this.f14784rd = v2Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.v2 v2Var = this.f14784rd;
        v2Var.a0(null);
        v2Var.show();
    }
}
