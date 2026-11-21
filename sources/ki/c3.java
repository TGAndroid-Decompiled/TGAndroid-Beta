package ki;

import android.os.Bundle;
import org.telegram.ui.bn;
public final class c3 extends bn {
    public final org.telegram.ui.ActionBar.w2 f18637vd;

    public c3(Bundle bundle, org.telegram.ui.ActionBar.w2 w2Var) {
        super(bundle);
        this.f18637vd = w2Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.w2 w2Var = this.f18637vd;
        w2Var.a0(null);
        w2Var.show();
    }
}
