package ai;

import android.os.Bundle;
import org.telegram.ui.sn;
public final class yd extends sn {
    public final boolean Qc;
    public final le Rc;

    public yd(le leVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = leVar;
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
