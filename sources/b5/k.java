package b5;

import android.media.Spatializer;
import p8.k0;

public final class k implements Spatializer.OnSpatializerStateChangedListener {

    public final q f1952a;

    public k(q qVar) {
        this.f1952a = qVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        q qVar = this.f1952a;
        k0 k0Var = q.f1974k;
        qVar.g();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        q qVar = this.f1952a;
        k0 k0Var = q.f1974k;
        qVar.g();
    }
}
