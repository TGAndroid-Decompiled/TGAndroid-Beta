package f5;

import android.media.Spatializer;
import s8.h0;
public final class j implements Spatializer.OnSpatializerStateChangedListener {
    public final p f5919a;

    public j(p pVar) {
        this.f5919a = pVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.f5919a;
        h0 h0Var = p.f5939k;
        pVar.g();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.f5919a;
        h0 h0Var = p.f5939k;
        pVar.g();
    }
}
