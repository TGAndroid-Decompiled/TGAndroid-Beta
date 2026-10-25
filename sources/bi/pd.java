package bi;

import android.os.Bundle;
import org.telegram.ui.un;
public final class pd extends un {
    public final boolean f5252kd;
    public final be f5253ld;

    public pd(be beVar, Bundle bundle, boolean z10) {
        super(bundle);
        this.f5253ld = beVar;
        this.f5252kd = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f5252kd) {
            this.f5253ld.show();
        }
    }
}
