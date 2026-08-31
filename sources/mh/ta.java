package mh;

import android.os.Bundle;
import org.telegram.ui.xn;
public final class ta extends xn {
    public final boolean Nc;
    public final eb Oc;

    public ta(eb ebVar, Bundle bundle, boolean z4) {
        super(bundle);
        this.Oc = ebVar;
        this.Nc = z4;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Nc) {
            this.Oc.show();
        }
    }
}
