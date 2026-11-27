package defpackage;

import android.view.FrameMetrics;
import android.view.Window;
public final class ir4 implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        mr4.c(frameMetrics);
    }
}
