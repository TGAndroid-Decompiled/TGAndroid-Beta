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

    private enum Metric {
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
        paint2.setTextSize(AndroidUtilities.dp(10.0f));
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
                FrameMetricsOverlayView.lambda$start$0(window, frameMetrics, i);
            }
        };
        this.listener = onFrameMetricsAvailableListener;
        this.hostWindow.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, this.metricsHandler);
        this.choreographerCallback = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j) {
                this.f$0.lambda$start$1(j);
            }
        };
        Choreographer.getInstance().postFrameCallback(this.choreographerCallback);
        attachOnDrawListener();
        this.uiHandler.post(this.redraw);
    }

    public static void lambda$start$0(Window window, FrameMetrics frameMetrics, int i) {
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

    public void lambda$start$1(long j) {
        if (this.running.get()) {
            long j2 = this.vsyncWindowStartNs;
            if (j2 == 0) {
                this.vsyncWindowStartNs = j;
            } else if (j - j2 >= 1000000000) {
                this.vsyncPerSecond = this.vsyncCountAccum;
                this.onDrawPerSecond = this.onDrawCountAccum.getAndSet(0);
                this.vsyncCountAccum = 0;
                this.vsyncWindowStartNs = j;
            } else {
                this.vsyncCountAccum++;
            }
            Choreographer.getInstance().postFrameCallback(this.choreographerCallback);
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
                this.f$0.lambda$attachOnDrawListener$2();
            }
        };
        ViewTreeObserver viewTreeObserver = this.observedView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnDrawListener(this.onDrawListener);
        }
    }

    public void lambda$attachOnDrawListener$2() {
        this.onDrawCountAccum.incrementAndGet();
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
        Metric[] metricArr;
        int i;
        float f;
        int i2;
        long j;
        String str;
        double d;
        double d2;
        double d3;
        long j2;
        long j3;
        long j4;
        long j5;
        int i3 = 3;
        float fDp = AndroidUtilities.dp(8.0f);
        float fDp2 = AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() > 0 ? getWidth() : AndroidUtilities.dp(260.0f), (2.0f * fDp) + ((Metric.values().length + 9) * fDp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.bgPaint);
        float f2 = fDp + fDp2;
        Metric[] metricArrValues = Metric.values();
        int length = metricArrValues.length;
        double d4 = 0.0d;
        long j6 = 0;
        double d5 = 0.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i4 = 0;
        while (i4 < length) {
            Metric metric = metricArrValues[i4];
            if (metric.isAvailable()) {
                f = fDp;
                long j11 = metric.last;
                if (j11 < j6) {
                    metricArr = metricArrValues;
                    i = length;
                } else if (metric.isDuration) {
                    Locale locale = Locale.US;
                    String str2 = metric.label;
                    Double dValueOf = Double.valueOf(j11 / 1000000.0d);
                    metricArr = metricArrValues;
                    i = length;
                    Double dValueOf2 = Double.valueOf(metric.avgMs);
                    Object[] objArr = new Object[i3];
                    objArr[0] = str2;
                    objArr[1] = dValueOf;
                    objArr[2] = dValueOf2;
                    str = String.format(locale, "%-16s : %5.2f / %5.2f ms", objArr);
                    switch (metric) {
                        case UNKNOWN_DELAY_DURATION:
                        case SWAP_BUFFERS_DURATION:
                            double d8 = d5;
                            d3 = d6;
                            d2 = d4;
                            j3 = j8;
                            i2 = i4;
                            j2 = j7;
                            d = d8;
                            j10 += metric.last;
                            d7 += metric.avgMs;
                            double d9 = d3;
                            d5 = d;
                            j7 = j2;
                            j = j3;
                            d4 = d2;
                            d6 = d9;
                            break;
                        case INPUT_HANDLING_DURATION:
                        case ANIMATION_DURATION:
                        case LAYOUT_MEASURE_DURATION:
                        case DRAW_DURATION:
                            long j12 = j8;
                            i2 = i4;
                            j7 += metric.last;
                            d6 = d6;
                            d5 = d5;
                            d4 += metric.avgMs;
                            j = j12;
                            break;
                        case SYNC_DURATION:
                            long j13 = j8;
                            long j14 = metric.last;
                            i2 = i4;
                            j7 += j14;
                            double d10 = metric.avgMs;
                            d4 += d10;
                            j = j13 + j14;
                            d6 = d6;
                            d5 += d10;
                            break;
                        case COMMAND_ISSUE_DURATION:
                            long j15 = j8 + metric.last;
                            d5 += metric.avgMs;
                            d4 = d4;
                            d6 = d6;
                            j = j15;
                            i2 = i4;
                            break;
                        case GPU_DURATION:
                            j9 += metric.last;
                            d6 += metric.avgMs;
                        default:
                            j = j8;
                            i2 = i4;
                            break;
                    }
                    float f3 = f;
                    canvas.drawText(str, f3, f2, this.textPaint);
                    f2 += fDp2;
                    i4 = i2 + 1;
                    j8 = j;
                    fDp = f3;
                    metricArrValues = metricArr;
                    length = i;
                    j6 = 0;
                    i3 = 3;
                } else {
                    metricArr = metricArrValues;
                    i = length;
                    long j16 = j8;
                    i2 = i4;
                    j2 = j7;
                    d = d5;
                    d3 = d6;
                    d2 = d4;
                    j3 = j16;
                    j5 = j9;
                    j4 = j10;
                    str = String.format(Locale.US, "%-16s : %d", metric.label, Long.valueOf(j11));
                    j10 = j4;
                    j9 = j5;
                    double d92 = d3;
                    d5 = d;
                    j7 = j2;
                    j = j3;
                    d4 = d2;
                    d6 = d92;
                    float f32 = f;
                    canvas.drawText(str, f32, f2, this.textPaint);
                    f2 += fDp2;
                    i4 = i2 + 1;
                    j8 = j;
                    fDp = f32;
                    metricArrValues = metricArr;
                    length = i;
                    j6 = 0;
                    i3 = 3;
                }
            } else {
                metricArr = metricArrValues;
                i = length;
                f = fDp;
            }
            long j17 = j8;
            i2 = i4;
            j2 = j7;
            d = d5;
            d3 = d6;
            d2 = d4;
            j3 = j17;
            j5 = j9;
            j4 = j10;
            str = String.format(Locale.US, "%-16s : n/a", metric.label);
            j10 = j4;
            j9 = j5;
            double d922 = d3;
            d5 = d;
            j7 = j2;
            j = j3;
            d4 = d2;
            d6 = d922;
            float f322 = f;
            canvas.drawText(str, f322, f2, this.textPaint);
            f2 += fDp2;
            i4 = i2 + 1;
            j8 = j;
            fDp = f322;
            metricArrValues = metricArr;
            length = i;
            j6 = 0;
            i3 = 3;
        }
        float f4 = fDp;
        double d11 = d5;
        double d12 = d6;
        long j18 = j7;
        double d13 = d4;
        long j19 = j8;
        long j20 = j9;
        long jMax = Math.max(j18, Math.max(j19, j20));
        double dMax = Math.max(d13, Math.max(d11, d12));
        float f5 = f2 + fDp2;
        Locale locale2 = Locale.US;
        canvas.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j18 / 1000000.0d), Double.valueOf(d13)), f4, f5, this.textPaint);
        float f6 = f5 + fDp2;
        canvas.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j19 / 1000000.0d), Double.valueOf(d11)), f4, f6, this.textPaint);
        float f7 = f6 + fDp2;
        canvas.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j20 / 1000000.0d), Double.valueOf(d12)), f4, f7, this.textPaint);
        float f8 = f7 + fDp2;
        canvas.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d7)), f4, f8, this.textPaint);
        float f9 = f8 + fDp2;
        canvas.drawText(String.format(locale2, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(jMax / 1000000.0d), Double.valueOf(dMax)), f4, f9, this.textPaint);
        float f10 = f9 + fDp2 + fDp2;
        canvas.drawText(String.format(locale2, "%-16s : %d /s", "vsync", Integer.valueOf(this.vsyncPerSecond)), f4, f10, this.textPaint);
        canvas.drawText(String.format(locale2, "%-16s : %d /s", this.observedView != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.onDrawPerSecond)), f4, f10 + fDp2, this.textPaint);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(260.0f), (AndroidUtilities.dp(8.0f) * 2) + (AndroidUtilities.dp(14.0f) * (Metric.values().length + 9)));
    }
}
