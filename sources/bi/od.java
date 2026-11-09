package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class od extends ProfileActivity {
    public final boolean X6;
    public final ce Y6;

    public od(ce ceVar, Bundle bundle, boolean z9) {
        super(bundle, null);
        this.Y6 = ceVar;
        this.X6 = z9;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.X6) {
            this.Y6.show();
        }
    }
}
