package di;

import android.os.Bundle;
import org.telegram.ui.bn;
public final class ac extends bn {
    public final boolean f8506vd;
    public final mc f8507wd;

    public ac(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f8507wd = mcVar;
        this.f8506vd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f8506vd) {
            this.f8507wd.show();
        }
    }
}
