package defpackage;

import android.os.Bundle;
public final class vza extends zu1 {
    public final boolean Jd;
    public final e0b Kd;

    public vza(e0b e0bVar, Bundle bundle, boolean z) {
        super(bundle);
        this.Kd = e0bVar;
        this.Jd = z;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.Jd) {
            this.Kd.show();
        }
    }
}
