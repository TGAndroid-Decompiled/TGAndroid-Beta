package ai;

import android.os.Bundle;
import org.telegram.ui.qn;
public final class yd extends qn {
    public final boolean Rc;
    public final le Sc;

    public yd(le leVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.Sc = leVar;
        this.Rc = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Rc) {
            this.Sc.show();
        }
    }
}
