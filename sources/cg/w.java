package cg;

import android.view.FrameMetrics;
import android.view.Window;
public final class w implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i3) {
        a0.a(frameMetrics);
    }
}
