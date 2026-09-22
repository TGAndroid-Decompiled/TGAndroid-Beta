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
    public final Context f5805a;
    public final v2 f5806b;
    public final v2 f5807c;
    public final WindowManager e;
    public final View f5808f;
    public final WindowManager.LayoutParams f5809g;
    public ValueAnimator f5810i;
    public int f5811j;
    public int f5812k;
    public int f5813l;
    public float f5814m;
    public int f5815n;
    public RadialGradient f5819r;
    public final Paint f5820s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f5816o = 0.75f;
    public float f5817p = 1.0f;
    public final Matrix f5818q = new Matrix();

    public y2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f5820s = paint;
        this.f5805a = context;
        this.e = windowManager;
        this.f5808f = view;
        this.f5809g = layoutParams;
        this.f5806b = new v2(this, context, 0);
        this.f5807c = new v2(this, context, 1);
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
        if (this.f5819r != null) {
            g();
            this.f5819r.setLocalMatrix(this.f5818q);
            Paint paint = this.f5820s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f5811j, this.f5812k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            v2 v2Var = this.f5807c;
            rectF.set(0.0f, 0.0f, v2Var.getMeasuredWidth(), v2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(ib ibVar) {
        h(this.f5817p);
        e(1.0f, 320L, ibVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f5810i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5810i = null;
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
        this.f5810i = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 17));
        this.f5810i.addListener(new ai.t2(this, f7, runnable, 1));
        this.f5810i.setDuration(j3);
        this.f5810i.setInterpolator(qr.f27655i);
        this.f5810i.start();
    }

    public final void g() {
        int i10 = this.f5813l;
        int i11 = this.f5815n;
        v2 v2Var = this.f5806b;
        if (i10 != i11 || this.f5811j != v2Var.getMeasuredWidth() || this.f5812k != v2Var.getMeasuredHeight() || Math.abs(this.f5814m - this.h) > 0.005f) {
            this.f5813l = this.f5815n;
            this.f5811j = v2Var.getMeasuredWidth();
            int measuredHeight = v2Var.getMeasuredHeight();
            this.f5812k = measuredHeight;
            this.f5814m = this.h;
            if (this.f5811j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f5811j;
                    int i13 = this.f5812k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f5819r = ah.f.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f5815n) / 255.0f, Color.green(this.f5815n) / 255.0f, Color.blue(this.f5815n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f5815n) / 255.0f, Color.green(this.f5815n) / 255.0f, Color.blue(this.f5815n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f5811j;
                    int i15 = this.f5812k;
                    this.f5819r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f5815n, 0), this.f5815n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f5820s.setShader(this.f5819r);
                v2Var.invalidate();
                this.f5807c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f5808f;
        if (view != null && (layoutParams = this.f5809g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f5805a);
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
                this.f5820s.setAlpha((int) (this.f5817p * 255.0f * this.h));
                this.f5806b.invalidate();
                this.f5807c.invalidate();
                return;
            }
        }
    }
}
