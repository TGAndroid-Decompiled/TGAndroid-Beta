package ii;

import android.os.Bundle;
import org.telegram.ui.wm;
public final class l3 extends wm {
    public final org.telegram.ui.ActionBar.t2 f15059sd;

    public l3(Bundle bundle, org.telegram.ui.ActionBar.t2 t2Var) {
        super(bundle);
        this.f15059sd = t2Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.t2 t2Var = this.f15059sd;
        t2Var.a0(null);
        t2Var.show();
    }
}
