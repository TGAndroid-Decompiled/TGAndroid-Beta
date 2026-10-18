package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class xd extends ProfileActivity {
    public final boolean f2454y6;
    public final le f2455z6;

    public xd(le leVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f2455z6 = leVar;
        this.f2454y6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f2454y6) {
            this.f2455z6.show();
        }
    }
}
