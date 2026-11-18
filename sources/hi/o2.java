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
import org.telegram.ui.Components.lr;
import org.telegram.ui.LaunchActivity;
public final class o2 {
    public final Context f15140a;
    public final l2 f15141b;
    public final l2 f15142c;
    public final WindowManager f15143e;
    public final View f15144f;
    public final WindowManager.LayoutParams f15145g;
    public ValueAnimator f15146i;
    public int f15147j;
    public int f15148k;
    public int f15149l;
    public float f15150m;
    public int f15151n;
    public RadialGradient f15155r;
    public final Paint f15156s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f15152o = 0.75f;
    public float f15153p = 1.0f;
    public final Matrix f15154q = new Matrix();

    public o2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f15156s = paint;
        this.f15140a = context;
        this.f15143e = windowManager;
        this.f15144f = view;
        this.f15145g = layoutParams;
        this.f15141b = new l2(this, context, 0);
        this.f15142c = new l2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        if (f10 < 0.5f) {
            return i0.a.f(Utilities.i(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.f(Utilities.i((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(n2 n2Var) {
        n2Var.setInvert(this.h);
        this.d.add(n2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f15155r != null) {
            g();
            this.f15155r.setLocalMatrix(this.f15154q);
            Paint paint = this.f15156s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f15147j, this.f15148k, paint);
                return;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            l2 l2Var = this.f15142c;
            rectF.set(0.0f, 0.0f, l2Var.getMeasuredWidth(), l2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) - 2, org.telegram.messenger.g0.L(12.0f) - 2, paint);
        }
    }

    public final void c(p9 p9Var) {
        h(this.f15153p);
        e(1.0f, 320L, p9Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f15146i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15146i = null;
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
        this.f15146i = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 28));
        this.f15146i.addListener(new di.j6(this, f10, runnable, 2));
        this.f15146i.setDuration(j3);
        this.f15146i.setInterpolator(lr.f37210i);
        this.f15146i.start();
    }

    public final void g() {
        int i7 = this.f15149l;
        int i10 = this.f15151n;
        l2 l2Var = this.f15141b;
        if (i7 != i10 || this.f15147j != l2Var.getMeasuredWidth() || this.f15148k != l2Var.getMeasuredHeight() || Math.abs(this.f15150m - this.h) > 0.005f) {
            this.f15149l = this.f15151n;
            this.f15147j = l2Var.getMeasuredWidth();
            int measuredHeight = l2Var.getMeasuredHeight();
            this.f15148k = measuredHeight;
            this.f15150m = this.h;
            if (this.f15147j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i11 = this.f15147j;
                    int i12 = this.f15148k;
                    float min = (2.0f - this.h) * (Math.min(i11, i12) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f15155r = android.support.v4.media.session.w.b(i11 * 0.5f, i12 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f15151n) / 255.0f, Color.green(this.f15151n) / 255.0f, Color.blue(this.f15151n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f15151n) / 255.0f, Color.green(this.f15151n) / 255.0f, Color.blue(this.f15151n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i13 = this.f15147j;
                    int i14 = this.f15148k;
                    this.f15155r = new RadialGradient(i13 * 0.5f, i14 * 0.4f, (2.0f - this.h) * (Math.min(i13, i14) / 2.0f) * 1.35f, new int[]{i0.a.o(this.f15151n, 0), this.f15151n}, new float[]{org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f15156s.setShader(this.f15155r);
                l2Var.invalidate();
                this.f15142c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f15144f;
        if (view != null && (layoutParams = this.f15145g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f15143e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity W = org.telegram.messenger.g0.W(this.f15140a);
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
                ((n2) arrayList.get(i7)).setInvert(this.h);
                ((n2) arrayList.get(i7)).invalidate();
                i7++;
            } else {
                this.f15156s.setAlpha((int) (this.f15153p * 255.0f * this.h));
                this.f15141b.invalidate();
                this.f15142c.invalidate();
                return;
            }
        }
    }
}
