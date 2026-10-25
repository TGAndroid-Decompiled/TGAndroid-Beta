package ag;

import android.view.FrameMetrics;
import android.view.Window;
public final class c0 implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        g0.a(frameMetrics);
    }
}
