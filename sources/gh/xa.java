package gh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class xa extends ProfileActivity {
    public final boolean f9188s6;
    public final jb f9189t6;

    public xa(jb jbVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f9189t6 = jbVar;
        this.f9188s6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f9188s6) {
            this.f9189t6.show();
        }
    }
}
