package lf;

import android.view.FrameMetrics;
import android.view.Window;
public final class x implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        a0.a(frameMetrics);
    }
}
