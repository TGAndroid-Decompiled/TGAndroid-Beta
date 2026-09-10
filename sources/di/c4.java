package di;

import android.os.Bundle;
import org.telegram.ui.eo;
public final class c4 extends eo {
    public final org.telegram.ui.ActionBar.h3 Qc;

    public c4(Bundle bundle, org.telegram.ui.ActionBar.h3 h3Var) {
        super(bundle);
        this.Qc = h3Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.ActionBar.h3 h3Var = this.Qc;
        h3Var.makeAttached(null);
        h3Var.show();
    }
}
