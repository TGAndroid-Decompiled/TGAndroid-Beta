package ff;

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
import org.telegram.ui.LaunchActivity;
public final class b0 extends View {
    public z A;
    public final AtomicBoolean B;
    public final AtomicBoolean C;
    public final Handler D;
    public final androidx.activity.i E;
    public int f6134a;
    public long f6135b;
    public int f6136c;
    public dh.m d;
    public final AtomicInteger f6137e;
    public int f6138f;
    public final Paint h;
    public final Paint f6139n;
    public WindowManager f6140r;
    public WindowManager.LayoutParams f6141s;
    public Window v;
    public HandlerThread f6142w;
    public y f6143x;
    public View f6144y;

    public b0(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f6134a = 0;
        this.f6135b = 0L;
        this.f6136c = 0;
        this.f6137e = new AtomicInteger(0);
        this.f6138f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f6139n = paint2;
        this.B = new AtomicBoolean(false);
        this.C = new AtomicBoolean(false);
        this.D = new Handler(Looper.getMainLooper());
        this.E = new androidx.activity.i(this, 21);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        a0[] values;
        for (a0 a0Var : a0.values()) {
            if (Build.VERSION.SDK_INT >= a0Var.f6132c) {
                long metric = frameMetrics.getMetric(a0Var.f6130a);
                a0Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d9 = a0Var.f6133e;
                    if (d9 != 0.0d) {
                        d = ((d - d9) * 0.05d) + d9;
                    }
                    a0Var.f6133e = d;
                }
            } else {
                a0Var.d = Long.MIN_VALUE;
            }
        }
    }

    public static b0 b(LaunchActivity launchActivity, org.telegram.ui.m0 m0Var) {
        b0 b0Var = new b0(launchActivity);
        b0Var.setObservedView(m0Var);
        b0Var.f6140r = (WindowManager) launchActivity.getSystemService("window");
        b0Var.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        b0Var.f6141s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = b0Var.f6141s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        b0Var.f6140r.addView(b0Var, b0Var.f6141s);
        b0Var.C.set(true);
        if (b0Var.B.getAndSet(true)) {
            return b0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        b0Var.f6142w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(b0Var.f6142w.getLooper());
        ?? obj = new Object();
        b0Var.f6143x = obj;
        b0Var.v.addOnFrameMetricsAvailableListener(obj, handler);
        b0Var.d = new dh.m(b0Var, 2);
        Choreographer.getInstance().postFrameCallback(b0Var.d);
        View view = b0Var.f6144y;
        if (view != null) {
            b0Var.A = new z(b0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(b0Var.A);
            }
        }
        b0Var.D.post(b0Var.E);
        return b0Var;
    }

    public final void c() {
        y yVar;
        this.B.set(false);
        this.D.removeCallbacks(this.E);
        Window window = this.v;
        if (window != null && (yVar = this.f6143x) != null) {
            window.removeOnFrameMetricsAvailableListener(yVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.f6144y;
        if (view != null && this.A != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.A);
            }
            this.A = null;
        }
        HandlerThread handlerThread = this.f6142w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f6140r != null && this.C.getAndSet(false)) {
            try {
                this.f6140r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f6140r = null;
        this.f6141s = null;
        this.v = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        String str;
        boolean z10;
        String format;
        double d;
        b0 b0Var = this;
        float dp2 = AndroidUtilities.dp(8.0f);
        float dp3 = AndroidUtilities.dp(11.0f);
        int length = a0.values().length + 9;
        if (b0Var.getWidth() > 0) {
            dp = b0Var.getWidth();
        } else {
            dp = AndroidUtilities.dp(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, dp, (length * dp3) + (2.0f * dp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), b0Var.h);
        float f10 = dp2 + dp3;
        a0[] values = a0.values();
        int length2 = values.length;
        double d9 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        float f11 = dp3;
        long j10 = 0;
        int i9 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f12 = f11;
            Paint paint = b0Var.f6139n;
            if (i9 < length2) {
                int i10 = length2;
                a0 a0Var = values[i9];
                int i11 = i9;
                if (Build.VERSION.SDK_INT >= a0Var.f6132c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = a0Var.f6131b;
                long j14 = j13;
                if (z10) {
                    long j15 = a0Var.d;
                    if (j15 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j15 / 1000000.0d), Double.valueOf(a0Var.f6133e));
                        switch (a0Var.ordinal()) {
                            case 0:
                            case 7:
                                j13 = j14 + a0Var.d;
                                d9 += a0Var.f6133e;
                                continue;
                                canvas.drawText(format, dp2, f10, paint);
                                f10 += f12;
                                i9 = i11 + 1;
                                b0Var = this;
                                f11 = f12;
                                length2 = i10;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j10 += a0Var.d;
                                d10 += a0Var.f6133e;
                                break;
                            case 5:
                                long j16 = a0Var.d;
                                j10 += j16;
                                d = a0Var.f6133e;
                                d10 += d;
                                j11 += j16;
                                d12 += d;
                                break;
                            case 6:
                                j11 += a0Var.d;
                                d = a0Var.f6133e;
                                d12 += d;
                                break;
                            case 8:
                                j12 += a0Var.d;
                                d11 += a0Var.f6133e;
                                break;
                        }
                        j13 = j14;
                        canvas.drawText(format, dp2, f10, paint);
                        f10 += f12;
                        i9 = i11 + 1;
                        b0Var = this;
                        f11 = f12;
                        length2 = i10;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j13 = j14;
                canvas.drawText(format, dp2, f10, paint);
                f10 += f12;
                i9 = i11 + 1;
                b0Var = this;
                f11 = f12;
                length2 = i10;
            } else {
                long j17 = j13;
                long max = Math.max(j10, Math.max(j11, j12));
                double d13 = d11;
                long j18 = j12;
                double d14 = d12;
                long j19 = j11;
                double d15 = d10;
                double max2 = Math.max(d15, Math.max(d14, d13));
                float f13 = f10 + f12;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d15)), dp2, f13, paint);
                float f14 = f13 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j19 / 1000000.0d), Double.valueOf(d14)), dp2, f14, paint);
                float f15 = f14 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j18 / 1000000.0d), Double.valueOf(d13)), dp2, f15, paint);
                float f16 = f15 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j17 / 1000000.0d), Double.valueOf(d9)), dp2, f16, paint);
                float f17 = f16 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp2, f17, paint);
                float f18 = f17 + f12 + f12;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f6136c)), dp2, f18, paint);
                float f19 = f18 + f12;
                if (this.f6144y != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f6138f)), dp2, f19, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((a0.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.f6144y;
        if (view3 != null && this.A != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.A);
            }
            this.A = null;
        }
        this.f6144y = view;
        if (this.B.get() && (view2 = this.f6144y) != null) {
            this.A = new z(this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.A);
            }
        }
    }
}
