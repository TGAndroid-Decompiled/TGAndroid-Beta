package ff;

import android.view.FrameMetrics;
import android.view.Window;
public final class y implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i9) {
        b0.a(frameMetrics);
    }
}
