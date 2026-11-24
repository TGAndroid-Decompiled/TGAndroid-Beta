package defpackage;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
public final class rva extends ProfileActivity {
    public final boolean b7;
    public final bwa c7;

    public rva(bwa bwaVar, Bundle bundle, boolean z) {
        super(bundle, null);
        this.c7 = bwaVar;
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
