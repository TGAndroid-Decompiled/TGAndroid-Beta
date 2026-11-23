package c3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final Runnable f4400a;

    public c(Runnable runnable) {
        this.f4400a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        this.f4400a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        this.f4400a.run();
    }
}
