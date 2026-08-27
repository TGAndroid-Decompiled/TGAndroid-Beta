package hh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;

public final class xa extends ProfileActivity {

    public final boolean f10350s6;

    public final jb f10351t6;

    public xa(jb jbVar, Bundle bundle, boolean z10) {
        super(bundle, null);
        this.f10351t6 = jbVar;
        this.f10350s6 = z10;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f10350s6) {
            return;
        }
        this.f10351t6.show();
    }
}
