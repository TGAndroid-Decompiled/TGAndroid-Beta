package jf;

import ag.q1;
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
public final class a0 extends View {
    public y A;
    public final AtomicBoolean B;
    public final AtomicBoolean C;
    public final Handler D;
    public final q1 E;
    public int f11550a;
    public long f11551b;
    public int f11552c;
    public af.b d;
    public final AtomicInteger f11553e;
    public int f11554f;
    public final Paint h;
    public final Paint f11555n;
    public WindowManager f11556r;
    public WindowManager.LayoutParams f11557s;
    public Window v;
    public HandlerThread f11558w;
    public x f11559x;
    public View f11560y;

    public a0(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f11550a = 0;
        this.f11551b = 0L;
        this.f11552c = 0;
        this.f11553e = new AtomicInteger(0);
        this.f11554f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f11555n = paint2;
        this.B = new AtomicBoolean(false);
        this.C = new AtomicBoolean(false);
        this.D = new Handler(Looper.getMainLooper());
        this.E = new q1(this, 27);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        z[] values;
        for (z zVar : z.values()) {
            if (Build.VERSION.SDK_INT >= zVar.f11690c) {
                long metric = frameMetrics.getMetric(zVar.f11688a);
                zVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = zVar.f11691e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    zVar.f11691e = d;
                }
            } else {
                zVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static a0 b(LaunchActivity launchActivity, org.telegram.ui.n0 n0Var) {
        a0 a0Var = new a0(launchActivity);
        a0Var.setObservedView(n0Var);
        a0Var.f11556r = (WindowManager) launchActivity.getSystemService("window");
        a0Var.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        a0Var.f11557s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = a0Var.f11557s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        a0Var.f11556r.addView(a0Var, a0Var.f11557s);
        a0Var.C.set(true);
        if (a0Var.B.getAndSet(true)) {
            return a0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        a0Var.f11558w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(a0Var.f11558w.getLooper());
        ?? obj = new Object();
        a0Var.f11559x = obj;
        a0Var.v.addOnFrameMetricsAvailableListener(obj, handler);
        a0Var.d = new af.b(a0Var, 3);
        Choreographer.getInstance().postFrameCallback(a0Var.d);
        View view = a0Var.f11560y;
        if (view != null) {
            a0Var.A = new y(a0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(a0Var.A);
            }
        }
        a0Var.D.post(a0Var.E);
        return a0Var;
    }

    public final void c() {
        x xVar;
        this.B.set(false);
        this.D.removeCallbacks(this.E);
        Window window = this.v;
        if (window != null && (xVar = this.f11559x) != null) {
            window.removeOnFrameMetricsAvailableListener(xVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.f11560y;
        if (view != null && this.A != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.A);
            }
            this.A = null;
        }
        HandlerThread handlerThread = this.f11558w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f11556r != null && this.C.getAndSet(false)) {
            try {
                this.f11556r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f11556r = null;
        this.f11557s = null;
        this.v = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int dp;
        String str;
        boolean z10;
        String format;
        double d;
        a0 a0Var = this;
        float dp2 = AndroidUtilities.dp(8.0f);
        float dp3 = AndroidUtilities.dp(11.0f);
        int length = z.values().length + 9;
        if (a0Var.getWidth() > 0) {
            dp = a0Var.getWidth();
        } else {
            dp = AndroidUtilities.dp(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, dp, (length * dp3) + (2.0f * dp2), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), a0Var.h);
        float f9 = dp2 + dp3;
        z[] values = z.values();
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
            Paint paint = a0Var.f11555n;
            if (i10 < length2) {
                int i11 = length2;
                z zVar = values[i10];
                int i12 = i10;
                if (Build.VERSION.SDK_INT >= zVar.f11690c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = zVar.f11689b;
                long j14 = j13;
                if (z10) {
                    long j15 = zVar.d;
                    if (j15 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j15 / 1000000.0d), Double.valueOf(zVar.f11691e));
                        switch (zVar.ordinal()) {
                            case 0:
                            case 7:
                                j13 = j14 + zVar.d;
                                d10 += zVar.f11691e;
                                continue;
                                canvas.drawText(format, dp2, f9, paint);
                                f9 += f11;
                                i10 = i12 + 1;
                                a0Var = this;
                                f10 = f11;
                                length2 = i11;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j10 += zVar.d;
                                d11 += zVar.f11691e;
                                break;
                            case 5:
                                long j16 = zVar.d;
                                j10 += j16;
                                d = zVar.f11691e;
                                d11 += d;
                                j11 += j16;
                                d13 += d;
                                break;
                            case 6:
                                j11 += zVar.d;
                                d = zVar.f11691e;
                                d13 += d;
                                break;
                            case 8:
                                j12 += zVar.d;
                                d12 += zVar.f11691e;
                                break;
                        }
                        j13 = j14;
                        canvas.drawText(format, dp2, f9, paint);
                        f9 += f11;
                        i10 = i12 + 1;
                        a0Var = this;
                        f10 = f11;
                        length2 = i11;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j13 = j14;
                canvas.drawText(format, dp2, f9, paint);
                f9 += f11;
                i10 = i12 + 1;
                a0Var = this;
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
                float f12 = f9 + f11;
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
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f11552c)), dp2, f17, paint);
                float f18 = f17 + f11;
                if (this.f11560y != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f11554f)), dp2, f18, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((z.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.f11560y;
        if (view3 != null && this.A != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.A);
            }
            this.A = null;
        }
        this.f11560y = view;
        if (this.B.get() && (view2 = this.f11560y) != null) {
            this.A = new y(this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.A);
            }
        }
    }
}
