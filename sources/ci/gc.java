package ci;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class gc extends ProfileActivity {
    public final boolean V6;
    public final tc W6;

    public gc(tc tcVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.W6 = tcVar;
        this.V6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.V6) {
            this.W6.show();
        }
    }
}
