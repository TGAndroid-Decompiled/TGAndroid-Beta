package bg;

import android.view.FrameMetrics;
import android.view.Window;
public final class y implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
        c0.a(frameMetrics);
    }
}
