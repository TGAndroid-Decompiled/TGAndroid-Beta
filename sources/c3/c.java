package c3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final Runnable f4368a;

    public c(Runnable runnable) {
        this.f4368a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f4368a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f4368a.run();
    }
}
