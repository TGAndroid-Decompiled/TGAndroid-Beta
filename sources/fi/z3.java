package fi;

import android.os.Bundle;
import org.telegram.ui.co;
public final class z3 extends co {
    public final org.telegram.ui.ActionBar.f3 Qc;

    public z3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Qc = f3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Qc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
