package hi;

import android.os.Bundle;
import org.telegram.ui.wn;
public final class y3 extends wn {
    public final org.telegram.ui.ActionBar.k3 f13381od;

    public y3(Bundle bundle, org.telegram.ui.ActionBar.k3 k3Var) {
        super(bundle);
        this.f13381od = k3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.k3 k3Var = this.f13381od;
        k3Var.makeAttached(null);
        k3Var.show();
    }
}
