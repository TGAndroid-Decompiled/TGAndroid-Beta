package defpackage;

import android.os.Bundle;
public final class sva extends mu1 {
    public final boolean vd;
    public final bwa wd;

    public sva(bwa bwaVar, Bundle bundle, boolean z) {
        super(bundle);
        this.wd = bwaVar;
        this.vd = z;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.vd) {
            this.wd.show();
        }
    }
}
