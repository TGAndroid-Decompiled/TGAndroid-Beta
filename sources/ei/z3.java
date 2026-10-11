package ei;

import android.os.Bundle;
import org.telegram.ui.zn;
public final class z3 extends zn {
    public final org.telegram.ui.ActionBar.e3 Qc;

    public z3(Bundle bundle, org.telegram.ui.ActionBar.e3 e3Var) {
        super(bundle);
        this.Qc = e3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.e3 e3Var = this.Qc;
        e3Var.makeAttached(null);
        e3Var.show();
    }
}
