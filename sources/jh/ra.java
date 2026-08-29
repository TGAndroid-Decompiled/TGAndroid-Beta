package jh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class ra extends ProfileActivity {
    public final boolean f12738s6;
    public final db f12739t6;

    public ra(db dbVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f12739t6 = dbVar;
        this.f12738s6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f12738s6) {
            this.f12739t6.show();
        }
    }
}
