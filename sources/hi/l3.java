package hi;

import android.os.Bundle;
import org.telegram.ui.cn;
public final class l3 extends cn {
    public final org.telegram.ui.ActionBar.w2 f14786td;

    public l3(Bundle bundle, org.telegram.ui.ActionBar.w2 w2Var) {
        super(bundle);
        this.f14786td = w2Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.w2 w2Var = this.f14786td;
        w2Var.a0(null);
        w2Var.show();
    }
}
