package defpackage;

import android.os.Bundle;
public final class vxa extends yv1 {
    public final boolean Gd;
    public final eya Hd;

    public vxa(eya eyaVar, Bundle bundle, boolean z) {
        super(bundle);
        this.Hd = eyaVar;
        this.Gd = z;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Gd) {
            this.Hd.show();
        }
    }
}
