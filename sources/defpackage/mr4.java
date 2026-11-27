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
public final class mr4 extends View {
    public View E;
    public kr4 F;
    public final AtomicBoolean G;
    public final AtomicBoolean H;
    public final Handler I;
    public final zz3 J;
    public int a;
    public long b;
    public int c;
    public jr4 d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window w;
    public HandlerThread x;
    public ir4 y;

    public mr4(LaunchActivity launchActivity) {
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
        this.J = new zz3(this, (byte) 9);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(hl.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(hl.n1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static mr4 a(LaunchActivity launchActivity, d26 d26Var) {
        mr4 mr4Var = new mr4(launchActivity);
        mr4Var.setObservedView(d26Var);
        mr4Var.r = (WindowManager) launchActivity.getSystemService("window");
        mr4Var.w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        mr4Var.s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = hl.L(12.0f);
        WindowManager.LayoutParams layoutParams2 = mr4Var.s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = hl.L(260.0f);
        mr4Var.r.addView(mr4Var, mr4Var.s);
        mr4Var.H.set(true);
        if (mr4Var.G.getAndSet(true)) {
            return mr4Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        mr4Var.x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(mr4Var.x.getLooper());
        ?? obj = new Object();
        mr4Var.y = obj;
        mr4Var.w.addOnFrameMetricsAvailableListener(obj, handler);
        mr4Var.d = new jr4(mr4Var, (byte) 0);
        Choreographer.getInstance().postFrameCallback(mr4Var.d);
        View view = mr4Var.E;
        if (view != null) {
            mr4Var.F = new kr4(mr4Var, (byte) 0);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(mr4Var.F);
            }
        }
        mr4Var.I.post(mr4Var.J);
        return mr4Var;
    }

    public static void c(FrameMetrics frameMetrics) {
        lr4[] values;
        for (lr4 lr4Var : lr4.values()) {
            if (Build.VERSION.SDK_INT >= lr4Var.c) {
                long metric = frameMetrics.getMetric(lr4Var.a);
                lr4Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d2 = lr4Var.e;
                    if (d2 != 0.0d) {
                        d = ((d - d2) * 0.05d) + d2;
                    }
                    lr4Var.e = d;
                }
            } else {
                lr4Var.d = Long.MIN_VALUE;
            }
        }
    }

    public final void b() {
        ir4 ir4Var;
        this.G.set(false);
        this.I.removeCallbacks(this.J);
        Window window = this.w;
        if (window != null && (ir4Var = this.y) != null) {
            window.removeOnFrameMetricsAvailableListener(ir4Var);
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
        mr4 mr4Var = this;
        float L2 = hl.L(8.0f);
        float L3 = hl.L(11.0f);
        int length = lr4.values().length + 9;
        if (mr4Var.getWidth() > 0) {
            L = mr4Var.getWidth();
        } else {
            L = hl.L(260.0f);
        }
        canvas.drawRoundRect(0.0f, 0.0f, L, (length * L3) + (2.0f * L2), hl.L(10.0f), hl.L(10.0f), mr4Var.h);
        float f = L2 + L3;
        lr4[] values = lr4.values();
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
            Paint paint = mr4Var.n;
            if (i < length2) {
                int i2 = length2;
                lr4 lr4Var = values[i];
                int i3 = i;
                if (Build.VERSION.SDK_INT >= lr4Var.c) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = lr4Var.b;
                long j5 = j4;
                if (z) {
                    long j6 = lr4Var.d;
                    if (j6 >= 0) {
                        format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j6 / 1000000.0d), Double.valueOf(lr4Var.e));
                        switch (lr4Var.ordinal()) {
                            case 0:
                            case 7:
                                j4 = j5 + lr4Var.d;
                                d2 += lr4Var.e;
                                continue;
                                canvas.drawText(format, L2, f, paint);
                                f += f3;
                                i = i3 + 1;
                                mr4Var = this;
                                f2 = f3;
                                length2 = i2;
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                j += lr4Var.d;
                                d3 += lr4Var.e;
                                break;
                            case 5:
                                long j7 = lr4Var.d;
                                j += j7;
                                d = lr4Var.e;
                                d3 += d;
                                j2 += j7;
                                d5 += d;
                                break;
                            case 6:
                                j2 += lr4Var.d;
                                d = lr4Var.e;
                                d5 += d;
                                break;
                            case 8:
                                j3 += lr4Var.d;
                                d4 += lr4Var.e;
                                break;
                        }
                        j4 = j5;
                        canvas.drawText(format, L2, f, paint);
                        f += f3;
                        i = i3 + 1;
                        mr4Var = this;
                        f2 = f3;
                        length2 = i2;
                    }
                }
                format = String.format(Locale.US, "%-16s : n/a", str2);
                j4 = j5;
                canvas.drawText(format, L2, f, paint);
                f += f3;
                i = i3 + 1;
                mr4Var = this;
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
        setMeasuredDimension(hl.L(210.0f), ((lr4.values().length + 9) * hl.L(11.0f)) + (hl.L(8.0f) << 1));
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
            this.F = new kr4(this, (byte) 0);
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.addOnDrawListener(this.F);
            }
        }
    }
}
