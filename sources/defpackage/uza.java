package defpackage;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class uza extends ProfileActivity {
    public final boolean b7;
    public final e0b c7;

    public uza(e0b e0bVar, Bundle bundle, boolean z) {
        super(bundle, null);
        this.c7 = e0bVar;
        this.b7 = z;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.b7) {
            this.c7.show();
        }
    }
}
