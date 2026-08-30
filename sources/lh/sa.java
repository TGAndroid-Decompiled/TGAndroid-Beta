package lh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class sa extends ProfileActivity {
    public final boolean t6;
    public final eb f13099u6;

    public sa(eb ebVar, Bundle bundle, boolean z4) {
        super(bundle, null);
        this.f13099u6 = ebVar;
        this.t6 = z4;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.t6) {
            this.f13099u6.show();
        }
    }
}
