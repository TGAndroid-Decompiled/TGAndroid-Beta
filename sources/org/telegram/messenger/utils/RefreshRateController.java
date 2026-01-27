package org.telegram.messenger.utils;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.Window;
import org.telegram.messenger.AndroidUtilities;

public final class RefreshRateController {
    private final Activity activity;
    private Window.OnFrameMetricsAvailableListener listener;
    private Display.Mode mode60;
    private Display.Mode modeMax;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final long[] frameNs = new long[240];
    private int ringCount = 0;
    private int ringPos = 0;
    private long ringSumNs = 0;
    private long belowSinceMs = -1;
    private long aboveSinceMs = -1;
    private long lastSwitchMs = 0;
    private int currentPreferredModeId = 0;

    private void logDecision(String str, float f) {
    }

    public RefreshRateController(Activity activity) {
        this.activity = activity;
    }

    public void start() {
        if (resolveModes()) {
            installListener();
        }
    }

    public void stop() {
        removeListener();
        resetStats();
    }

    private void resetStats() {
        this.ringCount = 0;
        this.ringPos = 0;
        this.ringSumNs = 0L;
        this.belowSinceMs = -1L;
        this.aboveSinceMs = -1L;
    }

    private void installListener() {
        Window window = this.activity.getWindow();
        if (this.listener != null) {
            return;
        }
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() {
            @Override
            public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                this.f$0.lambda$installListener$0(window2, frameMetrics, i);
            }
        };
        this.listener = onFrameMetricsAvailableListener;
        window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.mainHandler);
    }

    public void lambda$installListener$0(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(8);
        if (metric <= 0) {
            return;
        }
        pushFrame(metric);
        maybeSwitch();
    }

    private void removeListener() {
        Window window = this.activity.getWindow();
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.listener;
        if (onFrameMetricsAvailableListener != null) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
            this.listener = null;
        }
    }

    private void pushFrame(long j) {
        int i = this.ringCount;
        if (i < 240) {
            this.ringCount = i + 1;
        } else {
            this.ringSumNs -= this.frameNs[this.ringPos];
        }
        long[] jArr = this.frameNs;
        int i2 = this.ringPos;
        jArr[i2] = j;
        this.ringSumNs += j;
        int i3 = i2 + 1;
        this.ringPos = i3;
        if (i3 == 240) {
            this.ringPos = 0;
        }
    }

    private float getAvgFps() {
        int i = this.ringCount;
        if (i == 0) {
            return 0.0f;
        }
        double d = this.ringSumNs / i;
        if (d <= 0.0d) {
            return 0.0f;
        }
        return (float) (1.0E9d / d);
    }

    private void maybeSwitch() {
        if (this.ringCount < 30) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        float avgFps = getAvgFps();
        boolean z = jUptimeMillis - this.lastSwitchMs >= 3000;
        if (isPrefer60()) {
            if (avgFps < 58.5f) {
                this.aboveSinceMs = -1L;
                return;
            }
            if (this.aboveSinceMs < 0) {
                this.aboveSinceMs = jUptimeMillis;
            }
            if (jUptimeMillis - this.aboveSinceMs < 1800 || !z) {
                return;
            }
            setPreferredMode(this.modeMax);
            this.lastSwitchMs = jUptimeMillis;
            this.belowSinceMs = -1L;
            this.aboveSinceMs = -1L;
            logDecision("UP", avgFps);
            return;
        }
        if (avgFps > 55.0f) {
            this.belowSinceMs = -1L;
            return;
        }
        if (this.belowSinceMs < 0) {
            this.belowSinceMs = jUptimeMillis;
        }
        if (jUptimeMillis - this.belowSinceMs < 1800 || !z) {
            return;
        }
        setPreferredMode(this.mode60);
        this.lastSwitchMs = jUptimeMillis;
        this.belowSinceMs = -1L;
        this.aboveSinceMs = -1L;
        logDecision("DOWN", avgFps);
    }

    private boolean isPrefer60() {
        Display.Mode mode = this.mode60;
        return mode != null && this.currentPreferredModeId == mode.getModeId();
    }

    private boolean resolveModes() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.utils.RefreshRateController.resolveModes():boolean");
    }

    private void setPreferredMode(Display.Mode mode) {
        if (mode == null) {
            return;
        }
        AndroidUtilities.setPreferredMaxRefreshRate(this.activity.getWindow(), mode.getRefreshRate());
        this.currentPreferredModeId = mode.getModeId();
    }

    private static Display getDisplayCompat(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            return activity.getDisplay();
        }
        return activity.getWindowManager().getDefaultDisplay();
    }
}
