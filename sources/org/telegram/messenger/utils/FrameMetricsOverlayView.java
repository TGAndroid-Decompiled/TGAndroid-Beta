package org.telegram.messenger.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.LiveData;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.pip.PipActivityHandler$$ExternalSyntheticLambda3;
import org.telegram.ui.LaunchActivity;

public final class FrameMetricsOverlayView extends View {
    public final AtomicBoolean attachedToWindowManager;
    public final Paint bgPaint;
    public PipActivityHandler$$ExternalSyntheticLambda3 choreographerCallback;
    public Window hostWindow;
    public FrameMetricsOverlayView$$ExternalSyntheticLambda3 listener;
    public WindowManager.LayoutParams lp;
    public HandlerThread metricsThread;
    public View observedView;
    public final AtomicInteger onDrawCountAccum;
    public FrameMetricsOverlayView$$ExternalSyntheticLambda5 onDrawListener;
    public int onDrawPerSecond;
    public final LiveData.AnonymousClass1 redraw;
    public final AtomicBoolean running;
    public final Paint textPaint;
    public final Handler uiHandler;
    public int vsyncCountAccum;
    public int vsyncPerSecond;
    public long vsyncWindowStartNs;
    public WindowManager wm;

    public enum Metric {
        UNKNOWN_DELAY_DURATION("unknown delay", 0, 24),
        INPUT_HANDLING_DURATION("input", 1, 24),
        ANIMATION_DURATION("animation", 2, 24),
        LAYOUT_MEASURE_DURATION("layout", 3, 24),
        DRAW_DURATION("draw", 4, 24),
        SYNC_DURATION("sync", 5, 24),
        COMMAND_ISSUE_DURATION("cmd issue", 6, 24),
        SWAP_BUFFERS_DURATION("swap buffers", 7, 24),
        GPU_DURATION("gpu", 12, 31),
        TOTAL_DURATION("total", 8, 24);

        public final int key;
        public final String label;
        public final int minApi;
        public long last = Long.MIN_VALUE;
        public double avgMs = 0.0d;

        Metric(String str, int i, int i2) {
            this.key = i;
            this.label = str;
            this.minApi = i2;
        }
    }

    public FrameMetricsOverlayView(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.vsyncCountAccum = 0;
        this.vsyncWindowStartNs = 0L;
        this.vsyncPerSecond = 0;
        this.onDrawCountAccum = new AtomicInteger(0);
        this.onDrawPerSecond = 0;
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        this.textPaint = paint2;
        this.running = new AtomicBoolean(false);
        this.attachedToWindowManager = new AtomicBoolean(false);
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.redraw = new LiveData.AnonymousClass1(this, 26);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public final void detach() {
        FrameMetricsOverlayView$$ExternalSyntheticLambda3 frameMetricsOverlayView$$ExternalSyntheticLambda3;
        this.running.set(false);
        this.uiHandler.removeCallbacks(this.redraw);
        Window window = this.hostWindow;
        if (window != null && (frameMetricsOverlayView$$ExternalSyntheticLambda3 = this.listener) != null) {
            window.removeOnFrameMetricsAvailableListener(frameMetricsOverlayView$$ExternalSyntheticLambda3);
        }
        if (this.choreographerCallback != null) {
            Choreographer.getInstance().removeFrameCallback(this.choreographerCallback);
            this.choreographerCallback = null;
        }
        View view = this.observedView;
        if (view != null && this.onDrawListener != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.onDrawListener);
            }
            this.onDrawListener = null;
        }
        HandlerThread handlerThread = this.metricsThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.wm != null && this.attachedToWindowManager.getAndSet(false)) {
            try {
                this.wm.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.wm = null;
        this.lp = null;
        this.hostWindow = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        String str;
        FrameMetricsOverlayView frameMetricsOverlayView = this;
        float fDp = AndroidUtilities.dp(8.0f);
        float fDp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, frameMetricsOverlayView.getWidth() > 0 ? frameMetricsOverlayView.getWidth() : AndroidUtilities.dp(260.0f), ((Metric.values().length + 9) * fDp2) + (2.0f * fDp), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), frameMetricsOverlayView.bgPaint);
        float f = fDp + fDp2;
        Metric[] metricArrValues = Metric.values();
        int length = metricArrValues.length;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        float f2 = fDp;
        long j = 0;
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        double d4 = 0.0d;
        while (true) {
            Paint paint = frameMetricsOverlayView.textPaint;
            Metric[] metricArr = metricArrValues;
            if (i >= length) {
                float f3 = fDp2;
                float f4 = f2;
                long j5 = j3;
                double d5 = d;
                long j6 = j2;
                double d6 = d2;
                long jMax = Math.max(j, Math.max(j6, j5));
                double dMax = Math.max(d5, Math.max(d6, d4));
                float f5 = f + f3;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j / 1000000.0d), Double.valueOf(d5)), f4, f5, paint);
                float f6 = f5 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j6 / 1000000.0d), Double.valueOf(d6)), f4, f6, paint);
                float f7 = f6 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j5 / 1000000.0d), Double.valueOf(d4)), f4, f7, paint);
                float f8 = f7 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j4 / 1000000.0d), Double.valueOf(d3)), f4, f8, paint);
                float f9 = f8 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(jMax / 1000000.0d), Double.valueOf(dMax)), f4, f9, paint);
                float f10 = f9 + f3 + f3;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.vsyncPerSecond)), f4, f10, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.observedView != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.onDrawPerSecond)), f4, f10 + f3, paint);
                return;
            }
            int i2 = length;
            Metric metric = metricArr[i];
            metric.getClass();
            float f11 = fDp2;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = i;
            String str2 = metric.label;
            if (i3 >= metric.minApi) {
                long j7 = metric.last;
                if (j7 >= 0) {
                    str = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j7 / 1000000.0d), Double.valueOf(metric.avgMs));
                    switch (metric) {
                        case UNKNOWN_DELAY_DURATION:
                        case SWAP_BUFFERS_DURATION:
                            j4 += metric.last;
                            d3 += metric.avgMs;
                            break;
                        case INPUT_HANDLING_DURATION:
                        case ANIMATION_DURATION:
                        case LAYOUT_MEASURE_DURATION:
                        case DRAW_DURATION:
                            j += metric.last;
                            j3 = j3;
                            d2 = d2;
                            j2 = j2;
                            d += metric.avgMs;
                            f2 = f2;
                            break;
                        case SYNC_DURATION:
                            double d7 = d;
                            long j8 = j2;
                            double d8 = d2;
                            long j9 = metric.last;
                            j += j9;
                            double d9 = metric.avgMs;
                            d = d7 + d9;
                            long j10 = j8 + j9;
                            d2 = d8 + d9;
                            j2 = j10;
                            d = d;
                            j3 = j3;
                            break;
                        case COMMAND_ISSUE_DURATION:
                            d = d;
                            j2 += metric.last;
                            d2 += metric.avgMs;
                            d = d;
                            j3 = j3;
                            break;
                        case GPU_DURATION:
                            j3 += metric.last;
                            d4 += metric.avgMs;
                            f2 = f2;
                            break;
                        default:
                            f2 = f2;
                            break;
                    }
                } else {
                    long j11 = j4;
                    str = String.format(Locale.US, "%-16s : n/a", str2);
                    j4 = j11;
                }
                d2 = d2;
                j2 = j2;
                d = d;
                j3 = j3;
            } else {
                long j12 = j4;
                str = String.format(Locale.US, "%-16s : n/a", str2);
                j4 = j12;
                d2 = d2;
                j2 = j2;
                d = d;
                j3 = j3;
            }
            canvas.drawText(str, f2, f, paint);
            f += f11;
            i = i4 + 1;
            frameMetricsOverlayView = this;
            f2 = f2;
            metricArrValues = metricArr;
            length = i2;
            fDp2 = f11;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((Metric.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.observedView;
        if (view3 != null && this.onDrawListener != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.onDrawListener);
            }
            this.onDrawListener = null;
        }
        this.observedView = view;
        if (!this.running.get() || (view2 = this.observedView) == null) {
            return;
        }
        this.onDrawListener = new FrameMetricsOverlayView$$ExternalSyntheticLambda5(this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.onDrawListener);
        }
    }
}
