package f5;

import android.media.Spatializer;
import s8.h0;
public final class j implements Spatializer.OnSpatializerStateChangedListener {
    public final p f6030a;

    public j(p pVar) {
        this.f6030a = pVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.f6030a;
        h0 h0Var = p.f6052k;
        pVar.g();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.f6030a;
        h0 h0Var = p.f6052k;
        pVar.g();
    }
}
