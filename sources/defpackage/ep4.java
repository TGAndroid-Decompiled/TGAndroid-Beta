package defpackage;

import android.view.FrameMetrics;
import android.view.Window;
public final class ep4 implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        ip4.c(frameMetrics);
    }
}
