package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class od extends ProfileActivity {
    public final boolean U6;
    public final ce V6;

    public od(ce ceVar, Bundle bundle, boolean z9) {
        super(bundle, null);
        this.V6 = ceVar;
        this.U6 = z9;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.U6) {
            this.V6.show();
        }
    }
}
