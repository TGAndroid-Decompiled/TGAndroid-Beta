package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class yd extends ProfileActivity {
    public final boolean J6;
    public final me K6;

    public yd(me meVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.K6 = meVar;
        this.J6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.J6) {
            this.K6.show();
        }
    }
}
