package hh;

import android.os.Bundle;
import org.telegram.ui.rn;

public final class ya extends rn {
    public final boolean Mc;
    public final jb Nc;

    public ya(jb jbVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Nc = jbVar;
        this.Mc = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Mc) {
            return;
        }
        this.Nc.show();
    }
}
