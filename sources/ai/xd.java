package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class xd extends ProfileActivity {
    public final boolean A6;
    public final le B6;

    public xd(le leVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.B6 = leVar;
        this.A6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.A6) {
            this.B6.show();
        }
    }
}
