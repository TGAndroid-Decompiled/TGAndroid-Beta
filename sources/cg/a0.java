package cg;

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
public final class a0 extends View {
    public View E;
    public y F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final Handler I;
    public final a3.o J;
    public int f4608a;
    public long f4609b;
    public int f4610c;
    public x d;
    public final AtomicInteger f4611e;
    public int f4612f;
    public final Paint h;
    public final Paint f4613n;
    public WindowManager f4614r;
    public WindowManager.LayoutParams f4615s;
    public Window f4616w;
    public HandlerThread f4617x;
    public w f4618y;

    public a0(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f4608a = 0;
        this.f4609b = 0L;
        this.f4610c = 0;
        this.f4611e = new AtomicInteger(0);
        this.f4612f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f4613n = paint2;
        this.G = new AtomicBoolean(false);
        this.H = new AtomicBoolean(false);
        this.I = new Handler(Looper.getMainLooper());
        this.J = new a3.o(this, 13);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(org.telegram.messenger.g0.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        z[] values;
        for (z zVar : z.values()) {
            if (Build.VERSION.SDK_INT >= zVar.f4767c) {
                long metric = frameMetrics.getMetric(zVar.f4765a);
                zVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = zVar.f4768e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    zVar.f4768e = d;
                }
            } else {
                zVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static a0 b(LaunchActivity launchActivity, org.telegram.ui.l0 l0Var) {
        a0 a0Var = new a0(launchActivity);
        a0Var.setObservedView(l0Var);
        a0Var.f4614r = (WindowManager) launchActivity.getSystemService("window");
        a0Var.f4616w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        a0Var.f4615s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = org.telegram.messenger.g0.L(12);
        WindowManager.LayoutParams layoutParams2 = a0Var.f4615s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = org.telegram.messenger.g0.L(260.0f);
        a0Var.f4614r.addView(a0Var, a0Var.f4615s);
        a0Var.H.set(true);
        if (a0Var.G.getAndSet(true)) {
            return a0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        a0Var.f4617x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(a0Var.f4617x.getLooper());
        ?? obj = new Object();
        a0Var.f4618y = obj;
        a0Var.f4616w.addOnFrameMetricsAvailableListener(obj, handler);
        a0Var.d = new x(a0Var, 0);
        Choreographer.getInstance().postFrameCallback(a0Var.d);
        View view = a0Var.E;
        if (view != null) {
            a0Var.F = new y(0, a0Var);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(a0Var.F);
            }
        }
        a0Var.I.post(a0Var.J);
        return a0Var;
    }

    public final void c() {
        w wVar;
        this.G.set(false);
        this.I.removeCallbacks(this.J);
        Window window = this.f4616w;
        if (window != null && (wVar = this.f4618y) != null) {
            window.removeOnFrameMetricsAvailableListener(wVar);
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
        HandlerThread handlerThread = this.f4617x;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f4614r != null && this.H.getAndSet(false)) {
            try {
                this.f4614r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f4614r = null;
        this.f4615s = null;
        this.f4616w = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        String str;
        boolean z10;
        String format;
        double d;
        a0 a0Var = this;
        float L2 = org.telegram.messenger.g0.L(8.0f);
        float L3 = org.telegram.messenger.g0.L(11.0f);
        int length = z.values().length + 9;
        if (a0Var.getWidth() > 0) {
            L = a0Var.getWidth();
        } else {
            L = org.telegram.messenger.g0.L(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, L, (length * L3) + (2.0f * L2), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), a0Var.h);
        float f10 = L2 + L3;
        z[] values = z.values();
        int length2 = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f11 = L3;
        long j10 = 0;
        int i3 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f12 = f11;
            Paint paint = a0Var.f4613n;
            if (i3 < length2) {
                int i10 = length2;
                z zVar = values[i3];
                int i11 = i3;
                if (Build.VERSION.SDK_INT >= zVar.f4767c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = zVar.f4766b;
                long j14 = j13;
                if (z10) {
                    long j15 = zVar.d;
                    if (j15 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j15 / 1000000.0d), Double.valueOf(zVar.f4768e));
                        switch (zVar.ordinal()) {
                            case 0:
                            case 7:
                                j13 = j14 + zVar.d;
                                d10 += zVar.f4768e;
                                continue;
                                canvas.drawText(format, L2, f10, paint);
                                f10 += f12;
                                i3 = i11 + 1;
                                a0Var = this;
                                f11 = f12;
                                length2 = i10;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j10 += zVar.d;
                                d11 += zVar.f4768e;
                                break;
                            case 5:
                                long j16 = zVar.d;
                                j10 += j16;
                                d = zVar.f4768e;
                                d11 += d;
                                j11 += j16;
                                d13 += d;
                                break;
                            case 6:
                                j11 += zVar.d;
                                d = zVar.f4768e;
                                d13 += d;
                                break;
                            case 8:
                                j12 += zVar.d;
                                d12 += zVar.f4768e;
                                break;
                        }
                        j13 = j14;
                        canvas.drawText(format, L2, f10, paint);
                        f10 += f12;
                        i3 = i11 + 1;
                        a0Var = this;
                        f11 = f12;
                        length2 = i10;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j13 = j14;
                canvas.drawText(format, L2, f10, paint);
                f10 += f12;
                i3 = i11 + 1;
                a0Var = this;
                f11 = f12;
                length2 = i10;
            } else {
                long j17 = j13;
                long max = Math.max(j10, Math.max(j11, j12));
                double d14 = d12;
                long j18 = j12;
                double d15 = d13;
                long j19 = j11;
                double d16 = d11;
                double max2 = Math.max(d16, Math.max(d15, d14));
                float f13 = f10 + f12;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), L2, f13, paint);
                float f14 = f13 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j19 / 1000000.0d), Double.valueOf(d15)), L2, f14, paint);
                float f15 = f14 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j18 / 1000000.0d), Double.valueOf(d14)), L2, f15, paint);
                float f16 = f15 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j17 / 1000000.0d), Double.valueOf(d10)), L2, f16, paint);
                float f17 = f16 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), L2, f17, paint);
                float f18 = f17 + f12 + f12;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f4610c)), L2, f18, paint);
                float f19 = f18 + f12;
                if (this.E != null) {
                    str = "onDraw";
                } else {
                    str = "onDraw (none)";
                }
                canvas.drawText(String.format(locale, "%-16s : %d /s", str, Integer.valueOf(this.f4612f)), L2, f19, paint);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(210.0f), ((z.values().length + 9) * org.telegram.messenger.g0.L(11.0f)) + (org.telegram.messenger.g0.L(8.0f) * 2));
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
            this.F = new y(0, this);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.F);
            }
        }
    }
}
