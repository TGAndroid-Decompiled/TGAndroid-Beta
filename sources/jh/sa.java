package jh;

import android.os.Bundle;
import org.telegram.ui.tn;
public final class sa extends tn {
    public final boolean Mc;
    public final db Nc;

    public sa(db dbVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Nc = dbVar;
        this.Mc = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Mc) {
            this.Nc.show();
        }
    }
}
