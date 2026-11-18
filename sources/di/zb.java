package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class zb extends ProfileActivity {
    public final boolean f10178b7;
    public final mc f10179c7;

    public zb(mc mcVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f10179c7 = mcVar;
        this.f10178b7 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f10178b7) {
            this.f10179c7.show();
        }
    }
}
