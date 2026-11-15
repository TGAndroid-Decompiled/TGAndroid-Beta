package di;

import android.os.Bundle;
import org.telegram.ui.an;
public final class xb extends an {
    public final boolean f9754ud;
    public final jc f9755vd;

    public xb(jc jcVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f9755vd = jcVar;
        this.f9754ud = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f9754ud) {
            this.f9755vd.show();
        }
    }
}
