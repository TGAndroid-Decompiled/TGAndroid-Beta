package ai;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class wd extends ProfileActivity {
    public final boolean f2388y6;
    public final ke f2389z6;

    public wd(ke keVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f2389z6 = keVar;
        this.f2388y6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f2388y6) {
            this.f2389z6.show();
        }
    }
}
