package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class od extends ProfileActivity {
    public final boolean S6;
    public final be T6;

    public od(be beVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.T6 = beVar;
        this.S6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.S6) {
            this.T6.show();
        }
    }
}
