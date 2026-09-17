package ci;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.LaunchActivity;
public final class y2 {
    public final Context f5806a;
    public final v2 f5807b;
    public final v2 f5808c;
    public final WindowManager e;
    public final View f5809f;
    public final WindowManager.LayoutParams f5810g;
    public ValueAnimator f5811i;
    public int f5812j;
    public int f5813k;
    public int f5814l;
    public float f5815m;
    public int f5816n;
    public RadialGradient f5820r;
    public final Paint f5821s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f5817o = 0.75f;
    public float f5818p = 1.0f;
    public final Matrix f5819q = new Matrix();

    public y2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f5821s = paint;
        this.f5806a = context;
        this.e = windowManager;
        this.f5809f = view;
        this.f5810g = layoutParams;
        this.f5807b = new v2(this, context, 0);
        this.f5808c = new v2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f7) {
        if (f7 < 0.5f) {
            return i0.a.d(Utilities.clamp(f7 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.d(Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(x2 x2Var) {
        x2Var.setInvert(this.h);
        this.d.add(x2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f5820r != null) {
            g();
            this.f5820r.setLocalMatrix(this.f5819q);
            Paint paint = this.f5821s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f5812j, this.f5813k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            v2 v2Var = this.f5808c;
            rectF.set(0.0f, 0.0f, v2Var.getMeasuredWidth(), v2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(ib ibVar) {
        h(this.f5818p);
        e(1.0f, 320L, ibVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f5811i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5811i = null;
        }
        if (j3 <= 0) {
            this.h = f7;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f5811i = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 17));
        this.f5811i.addListener(new ai.t2(this, f7, runnable, 1));
        this.f5811i.setDuration(j3);
        this.f5811i.setInterpolator(qr.f27382i);
        this.f5811i.start();
    }

    public final void g() {
        int i10 = this.f5814l;
        int i11 = this.f5816n;
        v2 v2Var = this.f5807b;
        if (i10 != i11 || this.f5812j != v2Var.getMeasuredWidth() || this.f5813k != v2Var.getMeasuredHeight() || Math.abs(this.f5815m - this.h) > 0.005f) {
            this.f5814l = this.f5816n;
            this.f5812j = v2Var.getMeasuredWidth();
            int measuredHeight = v2Var.getMeasuredHeight();
            this.f5813k = measuredHeight;
            this.f5815m = this.h;
            if (this.f5812j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f5812j;
                    int i13 = this.f5813k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f5820r = ah.f.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f5816n) / 255.0f, Color.green(this.f5816n) / 255.0f, Color.blue(this.f5816n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f5816n) / 255.0f, Color.green(this.f5816n) / 255.0f, Color.blue(this.f5816n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f5812j;
                    int i15 = this.f5813k;
                    this.f5820r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f5816n, 0), this.f5816n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f5821s.setShader(this.f5820r);
                v2Var.invalidate();
                this.f5808c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f5809f;
        if (view != null && (layoutParams = this.f5810g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f5806a);
        if (findActivity == null) {
            findActivity = LaunchActivity.G1;
        }
        if (findActivity != null && !findActivity.isFinishing() && (window = findActivity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f7;
            window.setAttributes(attributes);
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((x2) arrayList.get(i10)).setInvert(this.h);
                ((x2) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f5821s.setAlpha((int) (this.f5818p * 255.0f * this.h));
                this.f5807b.invalidate();
                this.f5808c.invalidate();
                return;
            }
        }
    }
}
