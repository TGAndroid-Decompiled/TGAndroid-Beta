package nh;

import android.os.Bundle;
import org.telegram.ui.rn;

public final class n3 extends rn {
    public final org.telegram.ui.ActionBar.e3 Mc;

    public n3(Bundle bundle, org.telegram.ui.ActionBar.e3 e3Var) {
        super(bundle);
        this.Mc = e3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.e3 e3Var = this.Mc;
        e3Var.makeAttached(null);
        e3Var.show();
    }
}
