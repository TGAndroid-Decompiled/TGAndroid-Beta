package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class vb extends ProfileActivity {
    public final boolean Z6;
    public final ic f9624a7;

    public vb(ic icVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f9624a7 = icVar;
        this.Z6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Z6) {
            this.f9624a7.show();
        }
    }
}
