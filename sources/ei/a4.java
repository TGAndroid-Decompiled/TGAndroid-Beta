package ei;

import android.os.Bundle;
import org.telegram.ui.yn;
public final class a4 extends yn {
    public final org.telegram.ui.ActionBar.f3 Kc;

    public a4(Bundle bundle, org.telegram.ui.ActionBar.f3 f3Var) {
        super(bundle);
        this.Kc = f3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.f3 f3Var = this.Kc;
        f3Var.makeAttached(null);
        f3Var.show();
    }
}
