package bi;

import android.os.Bundle;
import org.telegram.ui.cn;
public final class pd extends cn {
    public final boolean f4546td;
    public final ce f4547ud;

    public pd(ce ceVar, Bundle bundle, boolean z9) {
        super(bundle);
        this.f4547ud = ceVar;
        this.f4546td = z9;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f4546td) {
            this.f4547ud.show();
        }
    }
}
