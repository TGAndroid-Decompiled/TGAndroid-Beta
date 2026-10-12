package fi;

import android.os.Bundle;
import org.telegram.ui.fo;
public final class a4 extends fo {
    public final org.telegram.ui.ActionBar.e3 Qc;

    public a4(Bundle bundle, org.telegram.ui.ActionBar.e3 e3Var) {
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
