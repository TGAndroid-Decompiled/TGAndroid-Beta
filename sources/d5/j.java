package d5;

import android.media.Spatializer;
import q8.k0;
public final class j implements Spatializer.OnSpatializerStateChangedListener {
    public final p f5341a;

    public j(p pVar) {
        this.f5341a = pVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f5341a;
        k0 k0Var = p.f5363k;
        pVar.g();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.f5341a;
        k0 k0Var = p.f5363k;
        pVar.g();
    }
}
