package bg;

import a8.sa;
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
public final class c0 extends View {
    public View E;
    public a0 F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final Handler I;
    public final sa J;
    public int f3215a;
    public long f3216b;
    public int f3217c;
    public z d;
    public final AtomicInteger f3218e;
    public int f3219f;
    public final Paint h;
    public final Paint f3220n;
    public WindowManager f3221r;
    public WindowManager.LayoutParams f3222s;
    public Window f3223w;
    public HandlerThread f3224x;
    public y f3225y;

    public c0(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f3215a = 0;
        this.f3216b = 0L;
        this.f3217c = 0;
        this.f3218e = new AtomicInteger(0);
        this.f3219f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f3220n = paint2;
        this.G = new AtomicBoolean(false);
        this.H = new AtomicBoolean(false);
        this.I = new Handler(Looper.getMainLooper());
        this.J = new sa(this, 14);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(org.telegram.messenger.g0.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        b0[] values;
        for (b0 b0Var : b0.values()) {
            if (Build.VERSION.SDK_INT >= b0Var.f3205c) {
                long metric = frameMetrics.getMetric(b0Var.f3203a);
                b0Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d2 = b0Var.f3206e;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    b0Var.f3206e = d;
                }
            } else {
                b0Var.d = Long.MIN_VALUE;
            }
        }
    }

    public static c0 b(LaunchActivity launchActivity, org.telegram.ui.k0 k0Var) {
        c0 c0Var = new c0(launchActivity);
        c0Var.setObservedView(k0Var);
        c0Var.f3221r = (WindowManager) launchActivity.getSystemService("window");
        c0Var.f3223w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        c0Var.f3222s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = org.telegram.messenger.g0.L(12);
        WindowManager.LayoutParams layoutParams2 = c0Var.f3222s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = org.telegram.messenger.g0.L(260.0f);
        c0Var.f3221r.addView(c0Var, c0Var.f3222s);
        c0Var.H.set(true);
        if (c0Var.G.getAndSet(true)) {
            return c0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        c0Var.f3224x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(c0Var.f3224x.getLooper());
        ?? obj = new Object();
        c0Var.f3225y = obj;
        c0Var.f3223w.addOnFrameMetricsAvailableListener(obj, handler);
        c0Var.d = new z(c0Var, 0);
        Choreographer.getInstance().postFrameCallback(c0Var.d);
        View view = c0Var.E;
        if (view != null) {
            c0Var.F = new a0(0, c0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(c0Var.F);
            }
        }
        c0Var.I.post(c0Var.J);
        return c0Var;
    }

    public final void c() {
        y yVar;
        this.G.set(false);
        this.I.removeCallbacks(this.J);
        Window window = this.f3223w;
        if (window != null && (yVar = this.f3225y) != null) {
            window.removeOnFrameMetricsAvailableListener(yVar);
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
        HandlerThread handlerThread = this.f3224x;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f3221r != null && this.H.getAndSet(false)) {
            try {
                this.f3221r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f3221r = null;
        this.f3222s = null;
        this.f3223w = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        String str;
        boolean z10;
        String format;
        double d;
        c0 c0Var = this;
        float L2 = org.telegram.messenger.g0.L(8.0f);
        float L3 = org.telegram.messenger.g0.L(11.0f);
        int length = b0.values().length + 9;
        if (c0Var.getWidth() > 0) {
            L = c0Var.getWidth();
        } else {
            L = org.telegram.messenger.g0.L(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, L, (length * L3) + (2.0f * L2), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), c0Var.h);
        float f10 = L2 + L3;
        b0[] values = b0.values();
        int length2 = values.length;
        double d2 = 0.0d;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        float f11 = L3;
        long j3 = 0;
        int i7 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            float f12 = f11;
            Paint paint = c0Var.f3220n;
            if (i7 < length2) {
                int i10 = length2;
                b0 b0Var = values[i7];
                int i11 = i7;
                if (Build.VERSION.SDK_INT >= b0Var.f3205c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = b0Var.f3204b;
                long j13 = j12;
                if (z10) {
                    long j14 = b0Var.d;
                    if (j14 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j14 / 1000000.0d), Double.valueOf(b0Var.f3206e));
                        switch (b0Var.ordinal()) {
                            case 0:
                            case 7:
                                j12 = j13 + b0Var.d;
                                d2 += b0Var.f3206e;
                                continue;
                                canvas.drawText(format, L2, f10, paint);
                                f10 += f12;
                                i7 = i11 + 1;
                                c0Var = this;
                                f11 = f12;
                                length2 = i10;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j3 += b0Var.d;
                                d10 += b0Var.f3206e;
                                break;
                            case 5:
                                long j15 = b0Var.d;
                                j3 += j15;
                                d = b0Var.f3206e;
                                d10 += d;
                                j10 += j15;
                                d12 += d;
                                break;
                            case 6:
                                j10 += b0Var.d;
                                d = b0Var.f3206e;
                                d12 += d;
                                break;
                            case 8:
                                j11 += b0Var.d;
                                d11 += b0Var.f3206e;
                                break;
                        }
                        j12 = j13;
                        canvas.drawText(format, L2, f10, paint);
                        f10 += f12;
                        i7 = i11 + 1;
                        c0Var = this;
                        f11 = f12;
                        length2 = i10;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j12 = j13;
                canvas.drawText(format, L2, f10, paint);
                f10 += f12;
                i7 = i11 + 1;
                c0Var = this;
                f11 = f12;
                length2 = i10;
            } else {
                long j16 = j12;
                long max = Math.max(j3, Math.max(j10, j11));
                double d13 = d11;
                long j17 = j11;
                double d14 = d12;
                long j18 = j10;
                double d15 = d10;
                double max2 = Math.max(d15, Math.max(d14, d13));
                float f13 = f10 + f12;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j3 / 1000000.0d), Double.valueOf(d15)), L2, f13, paint);
                float f14 = f13 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j18 / 1000000.0d), Double.valueOf(d14)), L2, f14, paint);
                float f15 = f14 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j17 / 1000000.0d), Double.valueOf(d13)), L2, f15, paint);
                float f16 = f15 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j16 / 1000000.0d), Double.valueOf(d2)), L2, f16, paint);
                float f17 = f16 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), L2, f17, paint);
                float f18 = f17 + f12 + f12;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f3217c)), L2, f18, paint);
                float f19 = f18 + f12;
                if (this.E != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f3219f)), L2, f19, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(210.0f), ((b0.values().length + 9) * org.telegram.messenger.g0.L(11.0f)) + (org.telegram.messenger.g0.L(8.0f) * 2));
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
            this.F = new a0(0, this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.F);
            }
        }
    }
}
