package ei;

import android.os.Bundle;
import org.telegram.ui.wn;
public final class z3 extends wn {
    public final org.telegram.ui.ActionBar.e3 Pc;

    public z3(Bundle bundle, org.telegram.ui.ActionBar.e3 e3Var) {
        super(bundle);
        this.Pc = e3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.e3 e3Var = this.Pc;
        e3Var.makeAttached(null);
        e3Var.show();
    }
}
