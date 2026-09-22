package ei;

import android.os.Bundle;
import org.telegram.ui.bo;
public final class z3 extends bo {
    public final org.telegram.ui.ActionBar.f3 Pc;

    public z3(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Pc = f3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Pc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
