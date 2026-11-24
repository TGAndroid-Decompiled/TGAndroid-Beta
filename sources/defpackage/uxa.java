package defpackage;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class uxa extends ProfileActivity {
    public final boolean g7;
    public final eya h7;

    public uxa(eya eyaVar, Bundle bundle, boolean z) {
        super(bundle, null);
        this.h7 = eyaVar;
        this.g7 = z;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.g7) {
            this.h7.show();
        }
    }
}
