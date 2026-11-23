package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class zb extends ProfileActivity {
    public final boolean f10207b7;
    public final mc f10208c7;

    public zb(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f10208c7 = mcVar;
        this.f10207b7 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f10207b7) {
            this.f10208c7.show();
        }
    }
}
