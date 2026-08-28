package mh;

import android.os.Bundle;
import org.telegram.ui.qn;
public final class p3 extends qn {
    public final org.telegram.ui.ActionBar.f3 Mc;

    public p3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Mc = f3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Mc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
