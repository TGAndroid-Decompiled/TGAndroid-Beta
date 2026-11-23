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
import org.telegram.ui.Components.kr;
import org.telegram.ui.LaunchActivity;
public final class w2 {
    public final Context f15653a;
    public final t2 f15654b;
    public final t2 f15655c;
    public final WindowManager f15656e;
    public final View f15657f;
    public final WindowManager.LayoutParams f15658g;
    public ValueAnimator f15659i;
    public int f15660j;
    public int f15661k;
    public int f15662l;
    public float f15663m;
    public int f15664n;
    public RadialGradient f15668r;
    public final Paint f15669s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f15665o = 0.75f;
    public float f15666p = 1.0f;
    public final Matrix f15667q = new Matrix();

    public w2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f15669s = paint;
        this.f15653a = context;
        this.f15656e = windowManager;
        this.f15657f = view;
        this.f15658g = layoutParams;
        this.f15654b = new t2(this, context, 0);
        this.f15655c = new t2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        if (f10 < 0.5f) {
            return i0.a.f(Utilities.i(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.f(Utilities.i((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(v2 v2Var) {
        v2Var.setInvert(this.h);
        this.d.add(v2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f15668r != null) {
            g();
            this.f15668r.setLocalMatrix(this.f15667q);
            Paint paint = this.f15669s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f15660j, this.f15661k, paint);
                return;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            t2 t2Var = this.f15655c;
            rectF.set(0.0f, 0.0f, t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) - 2, org.telegram.messenger.g0.L(12.0f) - 2, paint);
        }
    }

    public final void c(ja jaVar) {
        h(this.f15666p);
        e(1.0f, 320L, jaVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f15659i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15659i = null;
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
        this.f15659i = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 28));
        this.f15659i.addListener(new di.j6(this, f10, runnable, 2));
        this.f15659i.setDuration(j3);
        this.f15659i.setInterpolator(kr.f36860i);
        this.f15659i.start();
    }

    public final void g() {
        int i7 = this.f15662l;
        int i10 = this.f15664n;
        t2 t2Var = this.f15654b;
        if (i7 != i10 || this.f15660j != t2Var.getMeasuredWidth() || this.f15661k != t2Var.getMeasuredHeight() || Math.abs(this.f15663m - this.h) > 0.005f) {
            this.f15662l = this.f15664n;
            this.f15660j = t2Var.getMeasuredWidth();
            int measuredHeight = t2Var.getMeasuredHeight();
            this.f15661k = measuredHeight;
            this.f15663m = this.h;
            if (this.f15660j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i11 = this.f15660j;
                    int i12 = this.f15661k;
                    float min = (2.0f - this.h) * (Math.min(i11, i12) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f15668r = android.support.v4.media.session.w.b(i11 * 0.5f, i12 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f15664n) / 255.0f, Color.green(this.f15664n) / 255.0f, Color.blue(this.f15664n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f15664n) / 255.0f, Color.green(this.f15664n) / 255.0f, Color.blue(this.f15664n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i13 = this.f15660j;
                    int i14 = this.f15661k;
                    this.f15668r = new RadialGradient(i13 * 0.5f, i14 * 0.4f, (2.0f - this.h) * (Math.min(i13, i14) / 2.0f) * 1.35f, new int[]{i0.a.o(this.f15664n, 0), this.f15664n}, new float[]{org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f15669s.setShader(this.f15668r);
                t2Var.invalidate();
                this.f15655c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f15657f;
        if (view != null && (layoutParams = this.f15658g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f15656e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity W = org.telegram.messenger.g0.W(this.f15653a);
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
                ((v2) arrayList.get(i7)).setInvert(this.h);
                ((v2) arrayList.get(i7)).invalidate();
                i7++;
            } else {
                this.f15669s.setAlpha((int) (this.f15666p * 255.0f * this.h));
                this.f15654b.invalidate();
                this.f15655c.invalidate();
                return;
            }
        }
    }
}
