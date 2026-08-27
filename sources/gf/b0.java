package gf;

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
    public final a8.b E;

    public int f6934a;

    public long f6935b;

    public int f6936c;
    public e2.f d;

    public final AtomicInteger f6937e;

    public int f6938f;
    public final Paint h;

    public final Paint f6939n;

    public WindowManager f6940r;

    public WindowManager.LayoutParams f6941s;
    public Window v;

    public HandlerThread f6942w;

    public y f6943x;

    public View f6944y;

    public b0(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.f6934a = 0;
        this.f6935b = 0L;
        this.f6936c = 0;
        this.f6937e = new AtomicInteger(0);
        this.f6938f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.f6939n = paint2;
        this.B = new AtomicBoolean(false);
        this.C = new AtomicBoolean(false);
        this.D = new Handler(Looper.getMainLooper());
        this.E = new a8.b(this, 21);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (a0 a0Var : a0.values()) {
            if (Build.VERSION.SDK_INT >= a0Var.f6932c) {
                long metric = frameMetrics.getMetric(a0Var.f6930a);
                a0Var.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = a0Var.f6933e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    a0Var.f6933e = d;
                }
            } else {
                a0Var.d = Long.MIN_VALUE;
            }
        }
    }

    public static b0 b(LaunchActivity launchActivity, org.telegram.ui.n0 n0Var) {
        b0 b0Var = new b0(launchActivity);
        b0Var.setObservedView(n0Var);
        b0Var.f6940r = (WindowManager) launchActivity.getSystemService("window");
        b0Var.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        b0Var.f6941s = layoutParams;
        layoutParams.gravity = 8388627;
        int iDp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = b0Var.f6941s;
        layoutParams2.x = iDp;
        layoutParams2.y = iDp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        b0Var.f6940r.addView(b0Var, b0Var.f6941s);
        b0Var.C.set(true);
        if (b0Var.B.getAndSet(true)) {
            return b0Var;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        b0Var.f6942w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(b0Var.f6942w.getLooper());
        y yVar = new y();
        b0Var.f6943x = yVar;
        b0Var.v.addOnFrameMetricsAvailableListener(yVar, handler);
        b0Var.d = new e2.f(b0Var, 2);
        Choreographer.getInstance().postFrameCallback(b0Var.d);
        View view = b0Var.f6944y;
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
        if (window != null && (yVar = this.f6943x) != null) {
            window.removeOnFrameMetricsAvailableListener(yVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.f6944y;
        if (view != null && this.A != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.A);
            }
            this.A = null;
        }
        HandlerThread handlerThread = this.f6942w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.f6940r != null && this.C.getAndSet(false)) {
            try {
                this.f6940r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.f6940r = null;
        this.f6941s = null;
        this.v = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        String str;
        double d;
        b0 b0Var = this;
        float fDp = AndroidUtilities.dp(8.0f);
        float fDp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, b0Var.getWidth() > 0 ? b0Var.getWidth() : AndroidUtilities.dp(260.0f), ((a0.values().length + 9) * fDp2) + (2.0f * fDp), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), b0Var.h);
        float f10 = fDp + fDp2;
        a0[] a0VarArrValues = a0.values();
        int length = a0VarArrValues.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f11 = fDp2;
        long j10 = 0;
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f12 = f11;
            Paint paint = b0Var.f6939n;
            if (i10 >= length) {
                long j14 = j13;
                long jMax = Math.max(j10, Math.max(j11, j12));
                double d14 = d12;
                long j15 = j12;
                double d15 = d13;
                long j16 = j11;
                double d16 = d11;
                double dMax = Math.max(d16, Math.max(d15, d14));
                float f13 = f10 + f12;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), fDp, f13, paint);
                float f14 = f13 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j16 / 1000000.0d), Double.valueOf(d15)), fDp, f14, paint);
                float f15 = f14 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j15 / 1000000.0d), Double.valueOf(d14)), fDp, f15, paint);
                float f16 = f15 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j14 / 1000000.0d), Double.valueOf(d10)), fDp, f16, paint);
                float f17 = f16 + f12;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(jMax / 1000000.0d), Double.valueOf(dMax)), fDp, f17, paint);
                float f18 = f17 + f12 + f12;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.f6936c)), fDp, f18, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.f6944y != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f6938f)), fDp, f18 + f12, paint);
                return;
            }
            int i11 = length;
            a0 a0Var = a0VarArrValues[i10];
            int i12 = i10;
            boolean z10 = Build.VERSION.SDK_INT >= a0Var.f6932c;
            String str2 = a0Var.f6931b;
            long j17 = j13;
            if (z10) {
                long j18 = a0Var.d;
                if (j18 >= 0) {
                    str = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str2, Double.valueOf(j18 / 1000000.0d), Double.valueOf(a0Var.f6933e));
                    switch (a0Var) {
                        case UNKNOWN_DELAY_DURATION:
                        case SWAP_BUFFERS_DURATION:
                            j13 = j17 + a0Var.d;
                            d10 += a0Var.f6933e;
                            break;
                        case INPUT_HANDLING_DURATION:
                        case ANIMATION_DURATION:
                        case LAYOUT_MEASURE_DURATION:
                        case DRAW_DURATION:
                            j10 += a0Var.d;
                            d11 += a0Var.f6933e;
                            break;
                        case SYNC_DURATION:
                            long j19 = a0Var.d;
                            j10 += j19;
                            d = a0Var.f6933e;
                            d11 += d;
                            j11 += j19;
                            d13 += d;
                            break;
                        case COMMAND_ISSUE_DURATION:
                            j11 += a0Var.d;
                            d = a0Var.f6933e;
                            d13 += d;
                            break;
                        case EF99:
                            j12 += a0Var.d;
                            d12 += a0Var.f6933e;
                            break;
                    }
                } else {
                    str = String.format(Locale.US, "%-16s : n/a", str2);
                }
                j13 = j17;
            } else {
                str = String.format(Locale.US, "%-16s : n/a", str2);
                j13 = j17;
            }
            canvas.drawText(str, fDp, f10, paint);
            f10 += f12;
            i10 = i12 + 1;
            b0Var = this;
            f11 = f12;
            length = i11;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((a0.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.f6944y;
        if (view3 != null && this.A != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.A);
            }
            this.A = null;
        }
        this.f6944y = view;
        if (!this.B.get() || (view2 = this.f6944y) == null) {
            return;
        }
        this.A = new z(this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.A);
        }
    }
}
