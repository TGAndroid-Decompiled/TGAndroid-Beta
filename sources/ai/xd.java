package ai;

import android.os.Bundle;
import org.telegram.ui.sn;
public final class xd extends sn {
    public final boolean Qc;
    public final ke Rc;

    public xd(ke keVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = keVar;
        this.Qc = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Qc) {
            this.Rc.show();
        }
    }
}
