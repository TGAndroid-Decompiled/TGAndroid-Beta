package ag;

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
public final class g0 extends View {
    public e0 E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final a5.d I;
    public int f1282a;
    public long f1283b;
    public int f1284c;
    public d0 d;
    public final AtomicInteger e;
    public int f1285f;
    public final Paint h;
    public final Paint f1286n;
    public WindowManager f1287r;
    public WindowManager.LayoutParams f1288s;
    public Window v;
    public HandlerThread f1289w;
    public c0 f1290x;
    public View f1291y;

    public g0(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f1282a = 0;
        this.f1283b = 0L;
        this.f1284c = 0;
        this.e = new AtomicInteger(0);
        this.f1285f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f1286n = paint2;
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = new Handler(Looper.getMainLooper());
        this.I = new a5.d(this, 3);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        f0[] values;
        for (f0 f0Var : f0.values()) {
            if (Build.VERSION.SDK_INT >= f0Var.f1278c) {
                long metric = frameMetrics.getMetric(f0Var.f1276a);
                f0Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = f0Var.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    f0Var.e = d;
                }
            } else {
                f0Var.d = Long.MIN_VALUE;
            }
        }
    }

    public static g0 b(LaunchActivity launchActivity, org.telegram.ui.k0 k0Var) {
        g0 g0Var = new g0(launchActivity);
        g0Var.setObservedView(k0Var);
        g0Var.f1287r = (WindowManager) launchActivity.getSystemService("window");
        g0Var.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        g0Var.f1288s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = g0Var.f1288s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        g0Var.f1287r.addView(g0Var, g0Var.f1288s);
        g0Var.G.set(true);
        if (g0Var.F.getAndSet(true)) {
            return g0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        g0Var.f1289w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(g0Var.f1289w.getLooper());
        ?? obj = new Object();
        g0Var.f1290x = obj;
        g0Var.v.addOnFrameMetricsAvailableListener(obj, handler);
        g0Var.d = new d0(g0Var, 0);
        Choreographer.getInstance().postFrameCallback(g0Var.d);
        View view = g0Var.f1291y;
        if (view != null) {
            g0Var.E = new e0(0, g0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(g0Var.E);
            }
        }
        g0Var.H.post(g0Var.I);
        return g0Var;
    }

    public final void c() {
        c0 c0Var;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.v;
        if (window != null && (c0Var = this.f1290x) != null) {
            window.removeOnFrameMetricsAvailableListener(c0Var);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.f1291y;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.f1289w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f1287r != null && this.G.getAndSet(false)) {
            try {
                this.f1287r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f1287r = null;
        this.f1288s = null;
        this.v = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        String str;
        boolean z10;
        String format;
        double d;
        g0 g0Var = this;
        float dp2 = AndroidUtilities.dp(8.0f);
        float dp3 = AndroidUtilities.dp(11.0f);
        int length = f0.values().length + 9;
        if (g0Var.getWidth() > 0) {
            dp = g0Var.getWidth();
        } else {
            dp = AndroidUtilities.dp(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, dp, (length * dp3) + (2.0f * dp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), g0Var.h);
        float f7 = dp2 + dp3;
        f0[] values = f0.values();
        int length2 = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f10 = dp3;
        long j10 = 0;
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f11 = f10;
            Paint paint = g0Var.f1286n;
            if (i10 < length2) {
                int i11 = length2;
                f0 f0Var = values[i10];
                int i12 = i10;
                if (Build.VERSION.SDK_INT >= f0Var.f1278c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = f0Var.f1277b;
                long j14 = j13;
                if (z10) {
                    long j15 = f0Var.d;
                    if (j15 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j15 / 1000000.0d), Double.valueOf(f0Var.e));
                        switch (f0Var.ordinal()) {
                            case 0:
                            case 7:
                                j13 = j14 + f0Var.d;
                                d10 += f0Var.e;
                                continue;
                                canvas.drawText(format, dp2, f7, paint);
                                f7 += f11;
                                i10 = i12 + 1;
                                g0Var = this;
                                f10 = f11;
                                length2 = i11;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j10 += f0Var.d;
                                d11 += f0Var.e;
                                break;
                            case 5:
                                long j16 = f0Var.d;
                                j10 += j16;
                                d = f0Var.e;
                                d11 += d;
                                j11 += j16;
                                d13 += d;
                                break;
                            case 6:
                                j11 += f0Var.d;
                                d = f0Var.e;
                                d13 += d;
                                break;
                            case 8:
                                j12 += f0Var.d;
                                d12 += f0Var.e;
                                break;
                        }
                        j13 = j14;
                        canvas.drawText(format, dp2, f7, paint);
                        f7 += f11;
                        i10 = i12 + 1;
                        g0Var = this;
                        f10 = f11;
                        length2 = i11;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j13 = j14;
                canvas.drawText(format, dp2, f7, paint);
                f7 += f11;
                i10 = i12 + 1;
                g0Var = this;
                f10 = f11;
                length2 = i11;
            } else {
                long j17 = j13;
                long max = Math.max(j10, Math.max(j11, j12));
                double d14 = d12;
                long j18 = j12;
                double d15 = d13;
                long j19 = j11;
                double d16 = d11;
                double max2 = Math.max(d16, Math.max(d15, d14));
                float f12 = f7 + f11;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), dp2, f12, paint);
                float f13 = f12 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j19 / 1000000.0d), Double.valueOf(d15)), dp2, f13, paint);
                float f14 = f13 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j18 / 1000000.0d), Double.valueOf(d14)), dp2, f14, paint);
                float f15 = f14 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j17 / 1000000.0d), Double.valueOf(d10)), dp2, f15, paint);
                float f16 = f15 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp2, f16, paint);
                float f17 = f16 + f11 + f11;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f1284c)), dp2, f17, paint);
                float f18 = f17 + f11;
                if (this.f1291y != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f1285f)), dp2, f18, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((f0.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.f1291y;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.f1291y = view;
        if (this.F.get() && (view2 = this.f1291y) != null) {
            this.E = new e0(0, this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.E);
            }
        }
    }
}
