package ei;

import android.os.Bundle;
import org.telegram.ui.bo;
public final class z3 extends bo {
    public final org.telegram.ui.ActionBar.g3 Qc;

    public z3(Bundle bundle, org.telegram.ui.ActionBar.g3 g3Var) {
        super(bundle);
        this.Qc = g3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.g3 g3Var = this.Qc;
        g3Var.makeAttached(null);
        g3Var.show();
    }
}
