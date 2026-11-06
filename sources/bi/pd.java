package bi;

import android.os.Bundle;
import org.telegram.ui.an;
public final class pd extends an {
    public final boolean f4546rd;
    public final ce f4547sd;

    public pd(ce ceVar, Bundle bundle, boolean z9) {
        super(bundle);
        this.f4547sd = ceVar;
        this.f4546rd = z9;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f4546rd) {
            this.f4547sd.show();
        }
    }
}
