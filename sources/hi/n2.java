package hi;

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
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
public final class n2 {
    public final Context f15070a;
    public final k2 f15071b;
    public final k2 f15072c;
    public final WindowManager f15073e;
    public final View f15074f;
    public final WindowManager.LayoutParams f15075g;
    public ValueAnimator f15076i;
    public int f15077j;
    public int f15078k;
    public int f15079l;
    public float f15080m;
    public int f15081n;
    public RadialGradient f15085r;
    public final Paint f15086s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f15082o = 0.75f;
    public float f15083p = 1.0f;
    public final Matrix f15084q = new Matrix();

    public n2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f15086s = paint;
        this.f15070a = context;
        this.f15073e = windowManager;
        this.f15074f = view;
        this.f15075g = layoutParams;
        this.f15071b = new k2(this, context, 0);
        this.f15072c = new k2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        if (f10 < 0.5f) {
            return i0.a.f(Utilities.i(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.f(Utilities.i((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(m2 m2Var) {
        m2Var.setInvert(this.h);
        this.d.add(m2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f15085r != null) {
            g();
            this.f15085r.setLocalMatrix(this.f15084q);
            Paint paint = this.f15086s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f15077j, this.f15078k, paint);
                return;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            k2 k2Var = this.f15072c;
            rectF.set(0.0f, 0.0f, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) - 2, org.telegram.messenger.g0.L(12.0f) - 2, paint);
        }
    }

    public final void c(o9 o9Var) {
        h(this.f15083p);
        e(1.0f, 320L, o9Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f15076i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15076i = null;
        }
        if (j3 <= 0) {
            this.h = f10;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f15076i = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 28));
        this.f15076i.addListener(new di.j6(this, f10, runnable, 2));
        this.f15076i.setDuration(j3);
        this.f15076i.setInterpolator(nr.f37958i);
        this.f15076i.start();
    }

    public final void g() {
        int i7 = this.f15079l;
        int i10 = this.f15081n;
        k2 k2Var = this.f15071b;
        if (i7 != i10 || this.f15077j != k2Var.getMeasuredWidth() || this.f15078k != k2Var.getMeasuredHeight() || Math.abs(this.f15080m - this.h) > 0.005f) {
            this.f15079l = this.f15081n;
            this.f15077j = k2Var.getMeasuredWidth();
            int measuredHeight = k2Var.getMeasuredHeight();
            this.f15078k = measuredHeight;
            this.f15080m = this.h;
            if (this.f15077j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i11 = this.f15077j;
                    int i12 = this.f15078k;
                    float min = (2.0f - this.h) * (Math.min(i11, i12) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f15085r = android.support.v4.media.session.w.b(i11 * 0.5f, i12 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f15081n) / 255.0f, Color.green(this.f15081n) / 255.0f, Color.blue(this.f15081n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f15081n) / 255.0f, Color.green(this.f15081n) / 255.0f, Color.blue(this.f15081n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i13 = this.f15077j;
                    int i14 = this.f15078k;
                    this.f15085r = new RadialGradient(i13 * 0.5f, i14 * 0.4f, (2.0f - this.h) * (Math.min(i13, i14) / 2.0f) * 1.35f, new int[]{i0.a.o(this.f15081n, 0), this.f15081n}, new float[]{org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f15086s.setShader(this.f15085r);
                k2Var.invalidate();
                this.f15072c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f15074f;
        if (view != null && (layoutParams = this.f15075g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f15073e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity W = org.telegram.messenger.g0.W(this.f15070a);
        if (W == null) {
            W = LaunchActivity.H1;
        }
        if (W != null && !W.isFinishing() && (window = W.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f10;
            window.setAttributes(attributes);
        }
    }

    public final void i() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((m2) arrayList.get(i7)).setInvert(this.h);
                ((m2) arrayList.get(i7)).invalidate();
                i7++;
            } else {
                this.f15086s.setAlpha((int) (this.f15083p * 255.0f * this.h));
                this.f15071b.invalidate();
                this.f15072c.invalidate();
                return;
            }
        }
    }
}
