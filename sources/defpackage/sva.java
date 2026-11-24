package defpackage;

import android.os.Bundle;
public final class sva extends mu1 {
    public final boolean wd;
    public final bwa xd;

    public sva(bwa bwaVar, Bundle bundle, boolean z) {
        super(bundle);
        this.xd = bwaVar;
        this.wd = z;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.wd) {
            this.xd.show();
        }
    }
}
