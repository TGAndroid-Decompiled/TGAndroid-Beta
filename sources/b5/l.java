package b5;

import android.media.Spatializer;
import o8.k0;
public final class l implements Spatializer.OnSpatializerStateChangedListener {
    public final r f1467a;

    public l(r rVar) {
        this.f1467a = rVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        r rVar = this.f1467a;
        k0 k0Var = r.f1489k;
        rVar.g();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        r rVar = this.f1467a;
        k0 k0Var = r.f1489k;
        rVar.g();
    }
}
