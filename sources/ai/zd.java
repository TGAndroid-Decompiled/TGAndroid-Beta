package ai;

import android.os.Bundle;
import org.telegram.ui.sn;
public final class zd extends sn {
    public final boolean f2563ed;
    public final me f2564fd;

    public zd(me meVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f2564fd = meVar;
        this.f2563ed = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f2563ed) {
            this.f2564fd.show();
        }
    }
}
