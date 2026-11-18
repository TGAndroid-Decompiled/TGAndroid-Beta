package di;

import android.os.Bundle;
import org.telegram.ui.bn;
public final class ac extends bn {
    public final boolean f8509vd;
    public final mc f8510wd;

    public ac(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f8510wd = mcVar;
        this.f8509vd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f8509vd) {
            this.f8510wd.show();
        }
    }
}
