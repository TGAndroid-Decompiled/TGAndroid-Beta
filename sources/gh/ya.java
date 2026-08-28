package gh;

import android.os.Bundle;
import org.telegram.ui.qn;
public final class ya extends qn {
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
        if (!this.Mc) {
            this.Nc.show();
        }
    }
}
