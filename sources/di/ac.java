package di;

import android.os.Bundle;
import org.telegram.ui.bn;
public final class ac extends bn {
    public final boolean f8493vd;
    public final mc f8494wd;

    public ac(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f8494wd = mcVar;
        this.f8493vd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f8493vd) {
            this.f8494wd.show();
        }
    }
}
