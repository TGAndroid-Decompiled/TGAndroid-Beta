package org.telegram.messenger.utils;

import android.os.Build;
import android.view.FrameMetrics;
import android.view.Window;

public final class FrameMetricsOverlayView$$ExternalSyntheticLambda3 implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        for (FrameMetricsOverlayView.Metric metric : FrameMetricsOverlayView.Metric.values()) {
            metric.getClass();
            if (Build.VERSION.SDK_INT >= metric.minApi) {
                long metric2 = frameMetrics.getMetric(metric.key);
                metric.last = metric2;
                if (metric2 >= 0) {
                    double d = metric2 / 1000000.0d;
                    double d2 = metric.avgMs;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    metric.avgMs = d;
                }
            } else {
                metric.last = Long.MIN_VALUE;
            }
        }
    }
}
