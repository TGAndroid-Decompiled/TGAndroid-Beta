package c3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
public final class c implements Spatializer$OnSpatializerStateChangedListener {
    public final Runnable f5265a;

    public c(Runnable runnable) {
        this.f5265a = runnable;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z9) {
        this.f5265a.run();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z9) {
        this.f5265a.run();
    }
}
