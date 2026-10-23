package gi;

import android.os.Bundle;
import org.telegram.ui.sn;
public final class p3 extends sn {
    public final org.telegram.ui.ActionBar.h3 f11409ed;

    public p3(Bundle bundle, org.telegram.ui.ActionBar.h3 h3Var) {
        super(bundle);
        this.f11409ed = h3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.h3 h3Var = this.f11409ed;
        h3Var.makeAttached(null);
        h3Var.show();
    }
}
