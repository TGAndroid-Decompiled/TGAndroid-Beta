package org.telegram.messenger.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;

public final class FrameMetricsOverlayView extends View {
    private final AtomicBoolean attachedToWindowManager;
    private final Paint bgPaint;
    private Choreographer.FrameCallback choreographerCallback;
    private Window hostWindow;
    private Window.OnFrameMetricsAvailableListener listener;
    private WindowManager.LayoutParams lp;
    private Handler metricsHandler;
    private HandlerThread metricsThread;
    private View observedView;
    private final AtomicInteger onDrawCountAccum;
    private ViewTreeObserver.OnDrawListener onDrawListener;
    private int onDrawPerSecond;
    private final Runnable redraw;
    private final AtomicBoolean running;
    private final Paint textPaint;
    private final Handler uiHandler;
    private int vsyncCountAccum;
    private int vsyncPerSecond;
    private long vsyncWindowStartNs;
    private WindowManager wm;

    enum Metric {
        UNKNOWN_DELAY_DURATION(0, "unknown delay", true),
        INPUT_HANDLING_DURATION(1, "input", true),
        ANIMATION_DURATION(2, "animation", true),
        LAYOUT_MEASURE_DURATION(3, "layout", true),
        DRAW_DURATION(4, "draw", true),
        SYNC_DURATION(5, "sync", true),
        COMMAND_ISSUE_DURATION(6, "cmd issue", true),
        SWAP_BUFFERS_DURATION(7, "swap buffers", true),
        GPU_DURATION(12, "gpu", true, 31),
        TOTAL_DURATION(8, "total", true);

        double avgMs;
        final boolean isDuration;
        final int key;
        final String label;
        long last;
        final int minApi;

        Metric(int i, String str, boolean z) {
            this(i, str, z, 24);
        }

        Metric(int i, String str, boolean z, int i2) {
            this.last = Long.MIN_VALUE;
            this.avgMs = 0.0d;
            this.key = i;
            this.label = str;
            this.isDuration = z;
            this.minApi = i2;
        }

        boolean isAvailable() {
            return Build.VERSION.SDK_INT >= this.minApi;
        }
    }

    public static FrameMetricsOverlayView attachToActivityCorner(Activity activity, int i, int i2, View view) {
        FrameMetricsOverlayView frameMetricsOverlayView = new FrameMetricsOverlayView(activity);
        frameMetricsOverlayView.setObservedView(view);
        frameMetricsOverlayView.attachInternal(activity, i, i2);
        return frameMetricsOverlayView;
    }

    public void setObservedView(View view) {
        detachOnDrawListener();
        this.observedView = view;
        if (this.running.get()) {
            attachOnDrawListener();
        }
    }

    public void detach() {
        stop();
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

    public FrameMetricsOverlayView(Context context) {
        super(context.getApplicationContext());
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
        this.redraw = new Runnable() {
            @Override
            public void run() {
                if (FrameMetricsOverlayView.this.running.get()) {
                    FrameMetricsOverlayView.this.invalidate();
                    FrameMetricsOverlayView.this.uiHandler.postDelayed(this, 300L);
                }
            }
        };
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    private void attachInternal(Activity activity, int i, int i2) {
        this.wm = (WindowManager) activity.getSystemService("window");
        this.hostWindow = activity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        this.lp = layoutParams;
        layoutParams.gravity = i;
        int iDp = AndroidUtilities.dp(i2);
        WindowManager.LayoutParams layoutParams2 = this.lp;
        layoutParams2.x = iDp;
        layoutParams2.y = iDp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        this.wm.addView(this, this.lp);
        this.attachedToWindowManager.set(true);
        start();
    }

    private void start() {
        if (this.running.getAndSet(true)) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        this.metricsThread = handlerThread;
        handlerThread.start();
        this.metricsHandler = new Handler(this.metricsThread.getLooper());
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = new Window.OnFrameMetricsAvailableListener() {
            @Override
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                FrameMetricsOverlayView.m1128$r8$lambda$m42WIPdz4HTot3OVFKZa0YbcXM(window, frameMetrics, i);
            }
        };
        this.listener = onFrameMetricsAvailableListener;
        this.hostWindow.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.metricsHandler);
        this.choreographerCallback = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j) {
                FrameMetricsOverlayView.$r8$lambda$gltRIaOZHlqXqiv9bXSxIVoxzrU(this.f$0, j);
            }
        };
        Choreographer.getInstance().postFrameCallback(this.choreographerCallback);
        attachOnDrawListener();
        this.uiHandler.post(this.redraw);
    }

    public static void m1128$r8$lambda$m42WIPdz4HTot3OVFKZa0YbcXM(Window window, FrameMetrics frameMetrics, int i) {
        for (Metric metric : Metric.values()) {
            if (!metric.isAvailable()) {
                metric.last = Long.MIN_VALUE;
            } else {
                long metric2 = frameMetrics.getMetric(metric.key);
                metric.last = metric2;
                if (metric.isDuration && metric2 >= 0) {
                    double d = metric2 / 1000000.0d;
                    double d2 = metric.avgMs;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    metric.avgMs = d;
                }
            }
        }
    }

    public static void $r8$lambda$gltRIaOZHlqXqiv9bXSxIVoxzrU(FrameMetricsOverlayView frameMetricsOverlayView, long j) {
        if (frameMetricsOverlayView.running.get()) {
            long j2 = frameMetricsOverlayView.vsyncWindowStartNs;
            if (j2 == 0) {
                frameMetricsOverlayView.vsyncWindowStartNs = j;
            } else if (j - j2 >= 1000000000) {
                frameMetricsOverlayView.vsyncPerSecond = frameMetricsOverlayView.vsyncCountAccum;
                frameMetricsOverlayView.onDrawPerSecond = frameMetricsOverlayView.onDrawCountAccum.getAndSet(0);
                frameMetricsOverlayView.vsyncCountAccum = 0;
                frameMetricsOverlayView.vsyncWindowStartNs = j;
            } else {
                frameMetricsOverlayView.vsyncCountAccum++;
            }
            Choreographer.getInstance().postFrameCallback(frameMetricsOverlayView.choreographerCallback);
        }
    }

    private void stop() {
        Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener;
        this.running.set(false);
        this.uiHandler.removeCallbacks(this.redraw);
        Window window = this.hostWindow;
        if (window != null && (onFrameMetricsAvailableListener = this.listener) != null) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
        if (this.choreographerCallback != null) {
            Choreographer.getInstance().removeFrameCallback(this.choreographerCallback);
            this.choreographerCallback = null;
        }
        detachOnDrawListener();
        HandlerThread handlerThread = this.metricsThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    private void attachOnDrawListener() {
        if (this.observedView == null) {
            return;
        }
        this.onDrawListener = new ViewTreeObserver.OnDrawListener() {
            @Override
            public final void onDraw() {
                this.f$0.onDrawCountAccum.incrementAndGet();
            }
        };
        ViewTreeObserver viewTreeObserver = this.observedView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnDrawListener(this.onDrawListener);
        }
    }

    private void detachOnDrawListener() {
        View view = this.observedView;
        if (view == null || this.onDrawListener == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnDrawListener(this.onDrawListener);
        }
        this.onDrawListener = null;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int i;
        double d;
        int i2;
        String str;
        String str2;
        float fDp = AndroidUtilities.dp(8.0f);
        float fDp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() > 0 ? getWidth() : AndroidUtilities.dp(260.0f), (2.0f * fDp) + ((Metric.values().length + 9) * fDp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.bgPaint);
        float f = fDp + fDp2;
        Metric[] metricArrValues = Metric.values();
        int length = metricArrValues.length;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        float f2 = fDp2;
        long j = 0;
        long j2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        while (i3 < length) {
            Metric[] metricArr = metricArrValues;
            Metric metric = metricArr[i3];
            if (metric.isAvailable()) {
                i = length;
                d = d2;
                long j5 = metric.last;
                if (j5 >= 0) {
                    if (metric.isDuration) {
                        f2 = f2;
                        str = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", metric.label, Double.valueOf(j5 / 1000000.0d), Double.valueOf(metric.avgMs));
                        switch (metric) {
                            case UNKNOWN_DELAY_DURATION:
                            case SWAP_BUFFERS_DURATION:
                                j4 += metric.last;
                                d4 += metric.avgMs;
                                str = str;
                                d2 = d;
                                break;
                            case INPUT_HANDLING_DURATION:
                            case ANIMATION_DURATION:
                            case LAYOUT_MEASURE_DURATION:
                            case DRAW_DURATION:
                                j3 += metric.last;
                                d2 = d + metric.avgMs;
                                str = str;
                                break;
                            case SYNC_DURATION:
                                long j6 = metric.last;
                                j3 += j6;
                                double d6 = metric.avgMs;
                                j += j6;
                                d3 += d6;
                                str = str;
                                d2 = d + d6;
                                break;
                            case COMMAND_ISSUE_DURATION:
                                j += metric.last;
                                d3 += metric.avgMs;
                                d2 = d;
                                break;
                            case GPU_DURATION:
                                j2 += metric.last;
                                d5 += metric.avgMs;
                                d2 = d;
                                break;
                            default:
                                d2 = d;
                                break;
                        }
                        i2 = 1;
                    } else {
                        str2 = String.format(Locale.US, "%-16s : %d", metric.label, Long.valueOf(j5));
                        j4 = j4;
                        d2 = d;
                        i2 = 1;
                    }
                    canvas.drawText(str, fDp, f, this.textPaint);
                    f += f2;
                    i3 += i2;
                    metricArrValues = metricArr;
                    length = i;
                    f2 = f2;
                }
                str = str2;
                canvas.drawText(str, fDp, f, this.textPaint);
                f += f2;
                i3 += i2;
                metricArrValues = metricArr;
                length = i;
                f2 = f2;
            } else {
                i = length;
                d = d2;
            }
            long j7 = j4;
            i2 = 1;
            str2 = String.format(Locale.US, "%-16s : n/a", metric.label);
            j4 = j7;
            d2 = d;
            str = str2;
            canvas.drawText(str, fDp, f, this.textPaint);
            f += f2;
            i3 += i2;
            metricArrValues = metricArr;
            length = i;
            f2 = f2;
        }
        double d7 = d2;
        float f3 = f2;
        float f4 = f;
        long j8 = j3;
        long jMax = Math.max(j8, Math.max(j, j2));
        double d8 = d5;
        long j9 = j2;
        double dMax = Math.max(d7, Math.max(d3, d8));
        float f5 = f4 + f3;
        Locale locale = Locale.US;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j8 / 1000000.0d), Double.valueOf(d7)), fDp, f5, this.textPaint);
        float f6 = f5 + f3;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j / 1000000.0d), Double.valueOf(d3)), fDp, f6, this.textPaint);
        float f7 = f6 + f3;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j9 / 1000000.0d), Double.valueOf(d8)), fDp, f7, this.textPaint);
        float f8 = f7 + f3;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j4 / 1000000.0d), Double.valueOf(d4)), fDp, f8, this.textPaint);
        float f9 = f8 + f3;
        canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(jMax / 1000000.0d), Double.valueOf(dMax)), fDp, f9, this.textPaint);
        float f10 = f9 + f3 + f3;
        canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.vsyncPerSecond)), fDp, f10, this.textPaint);
        canvas.drawText(String.format(locale, "%-16s : %d /s", this.observedView != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.onDrawPerSecond)), fDp, f10 + f3, this.textPaint);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), (AndroidUtilities.dp(8.0f) * 2) + (AndroidUtilities.dp(11.0f) * (Metric.values().length + 9)));
    }
}
