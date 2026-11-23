package di;

import android.os.Bundle;
import org.telegram.ui.bn;
public final class ac extends bn {
    public final boolean f8492vd;
    public final mc f8493wd;

    public ac(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f8493wd = mcVar;
        this.f8492vd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f8492vd) {
            this.f8493wd.show();
        }
    }
}
