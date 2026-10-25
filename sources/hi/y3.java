package hi;

import android.os.Bundle;
import org.telegram.ui.un;
public final class y3 extends un {
    public final org.telegram.ui.ActionBar.k3 f13382kd;

    public y3(Bundle bundle, org.telegram.ui.ActionBar.k3 k3Var) {
        super(bundle);
        this.f13382kd = k3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.k3 k3Var = this.f13382kd;
        k3Var.makeAttached(null);
        k3Var.show();
    }
}
