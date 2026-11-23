package di;

import android.os.Bundle;
import org.telegram.ui.bn;
public final class ac extends bn {
    public final boolean f8530vd;
    public final mc f8531wd;

    public ac(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f8531wd = mcVar;
        this.f8530vd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f8530vd) {
            this.f8531wd.show();
        }
    }
}
