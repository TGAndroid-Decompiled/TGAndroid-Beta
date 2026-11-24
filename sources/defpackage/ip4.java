package defpackage;

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
import org.telegram.ui.LaunchActivity;
public final class ip4 extends View {
    public View E;
    public gp4 F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final Handler I;
    public final ez3 J;
    public int a;
    public long b;
    public int c;
    public fp4 d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window w;
    public HandlerThread x;
    public ep4 y;

    public ip4(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.e = new AtomicInteger(0);
        this.f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.G = new AtomicBoolean(false);
        this.H = new AtomicBoolean(false);
        this.I = new Handler(Looper.getMainLooper());
        this.J = new ez3(this, (byte) 9);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(gl.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(gl.n1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static ip4 a(LaunchActivity launchActivity, yc ycVar) {
        ip4 ip4Var = new ip4(launchActivity);
        ip4Var.setObservedView(ycVar);
        ip4Var.r = (WindowManager) launchActivity.getSystemService("window");
        ip4Var.w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        ip4Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = gl.L(12.0f);
        WindowManager.LayoutParams layoutParams2 = ip4Var.s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = gl.L(260.0f);
        ip4Var.r.addView(ip4Var, ip4Var.s);
        ip4Var.H.set(true);
        if (ip4Var.G.getAndSet(true)) {
            return ip4Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        ip4Var.x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(ip4Var.x.getLooper());
        ?? obj = new Object();
        ip4Var.y = obj;
        ip4Var.w.addOnFrameMetricsAvailableListener(obj, handler);
        ip4Var.d = new fp4(ip4Var, (byte) 0);
        Choreographer.getInstance().postFrameCallback(ip4Var.d);
        View view = ip4Var.E;
        if (view != null) {
            ip4Var.F = new gp4(ip4Var, (byte) 0);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(ip4Var.F);
            }
        }
        ip4Var.I.post(ip4Var.J);
        return ip4Var;
    }

    public static void c(FrameMetrics frameMetrics) {
        hp4[] values;
        for (hp4 hp4Var : hp4.values()) {
            if (Build.VERSION.SDK_INT >= hp4Var.c) {
                long metric = frameMetrics.getMetric(hp4Var.a);
                hp4Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d2 = hp4Var.e;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    hp4Var.e = d;
                }
            } else {
                hp4Var.d = Long.MIN_VALUE;
            }
        }
    }

    public final void b() {
        ep4 ep4Var;
        this.G.set(false);
        this.I.removeCallbacks(this.J);
        Window window = this.w;
        if (window != null && (ep4Var = this.y) != null) {
            window.removeOnFrameMetricsAvailableListener(ep4Var);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.E;
        if (view != null && this.F != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.F);
            }
            this.F = null;
        }
        HandlerThread handlerThread = this.x;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.r != null && this.H.getAndSet(false)) {
            try {
                this.r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.r = null;
        this.s = null;
        this.w = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        String str;
        boolean z;
        String format;
        double d;
        ip4 ip4Var = this;
        float L2 = gl.L(8.0f);
        float L3 = gl.L(11.0f);
        int length = hp4.values().length + 9;
        if (ip4Var.getWidth() > 0) {
            L = ip4Var.getWidth();
        } else {
            L = gl.L(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, L, (length * L3) + (2.0f * L2), gl.L(10.0f), gl.L(10.0f), ip4Var.h);
        float f = L2 + L3;
        hp4[] values = hp4.values();
        int length2 = values.length;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        float f2 = L3;
        long j = 0;
        int i = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        while (true) {
            float f3 = f2;
            Paint paint = ip4Var.n;
            if (i < length2) {
                int i2 = length2;
                hp4 hp4Var = values[i];
                int i3 = i;
                if (Build.VERSION.SDK_INT >= hp4Var.c) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = hp4Var.b;
                long j5 = j4;
                if (z) {
                    long j6 = hp4Var.d;
                    if (j6 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j6 / 1000000.0d), Double.valueOf(hp4Var.e));
                        switch (hp4Var.ordinal()) {
                            case 0:
                            case 7:
                                j4 = j5 + hp4Var.d;
                                d2 += hp4Var.e;
                                continue;
                                canvas.drawText(format, L2, f, paint);
                                f += f3;
                                i = i3 + 1;
                                ip4Var = this;
                                f2 = f3;
                                length2 = i2;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j += hp4Var.d;
                                d3 += hp4Var.e;
                                break;
                            case 5:
                                long j7 = hp4Var.d;
                                j += j7;
                                d = hp4Var.e;
                                d3 += d;
                                j2 += j7;
                                d5 += d;
                                break;
                            case 6:
                                j2 += hp4Var.d;
                                d = hp4Var.e;
                                d5 += d;
                                break;
                            case 8:
                                j3 += hp4Var.d;
                                d4 += hp4Var.e;
                                break;
                        }
                        j4 = j5;
                        canvas.drawText(format, L2, f, paint);
                        f += f3;
                        i = i3 + 1;
                        ip4Var = this;
                        f2 = f3;
                        length2 = i2;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j4 = j5;
                canvas.drawText(format, L2, f, paint);
                f += f3;
                i = i3 + 1;
                ip4Var = this;
                f2 = f3;
                length2 = i2;
            } else {
                long j8 = j4;
                long max = Math.max(j, Math.max(j2, j3));
                double d6 = d4;
                long j9 = j3;
                double d7 = d5;
                long j10 = j2;
                double d8 = d3;
                double max2 = Math.max(d8, Math.max(d7, d6));
                float f4 = f + f3;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j / 1000000.0d), Double.valueOf(d8)), L2, f4, paint);
                float f5 = f4 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d7)), L2, f5, paint);
                float f6 = f5 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j9 / 1000000.0d), Double.valueOf(d6)), L2, f6, paint);
                float f7 = f6 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j8 / 1000000.0d), Double.valueOf(d2)), L2, f7, paint);
                float f8 = f7 + f3;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), L2, f8, paint);
                float f9 = f8 + f3 + f3;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.c)), L2, f9, paint);
                float f10 = f9 + f3;
                if (this.E != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f)), L2, f10, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gl.L(210.0f), ((hp4.values().length + 9) * gl.L(11.0f)) + (gl.L(8.0f) << 1));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.E;
        if (view3 != null && this.F != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.F);
            }
            this.F = null;
        }
        this.E = view;
        if (this.G.get() && (view2 = this.E) != null) {
            this.F = new gp4(this, (byte) 0);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.F);
            }
        }
    }
}
