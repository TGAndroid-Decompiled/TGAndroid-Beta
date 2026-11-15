package di;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class wb extends ProfileActivity {
    public final boolean Z6;
    public final jc f9710a7;

    public wb(jc jcVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f9710a7 = jcVar;
        this.Z6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Z6) {
            this.f9710a7.show();
        }
    }
}
