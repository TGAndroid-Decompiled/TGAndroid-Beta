package gi;

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
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public final class n2 {
    public final Context f13280a;
    public final k2 f13281b;
    public final k2 f13282c;
    public final WindowManager f13283e;
    public final View f13284f;
    public final WindowManager.LayoutParams f13285g;
    public ValueAnimator f13286i;
    public int f13287j;
    public int f13288k;
    public int f13289l;
    public float f13290m;
    public int f13291n;
    public RadialGradient f13295r;
    public final Paint f13296s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f13292o = 0.75f;
    public float f13293p = 1.0f;
    public final Matrix f13294q = new Matrix();

    public n2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f13296s = paint;
        this.f13280a = context;
        this.f13283e = windowManager;
        this.f13284f = view;
        this.f13285g = layoutParams;
        this.f13281b = new k2(this, context, 0);
        this.f13282c = new k2(this, context, 1);
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
        if (this.f13295r != null) {
            g();
            this.f13295r.setLocalMatrix(this.f13294q);
            Paint paint = this.f13296s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f13287j, this.f13288k, paint);
                return;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            k2 k2Var = this.f13282c;
            rectF.set(0.0f, 0.0f, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) - 2, org.telegram.messenger.g0.L(12.0f) - 2, paint);
        }
    }

    public final void c(r9 r9Var) {
        h(this.f13293p);
        e(1.0f, 320L, r9Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f13286i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13286i = null;
        }
        if (j10 <= 0) {
            this.h = f10;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f13286i = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 28));
        this.f13286i.addListener(new ci.p6(this, f10, runnable, 2));
        this.f13286i.setDuration(j10);
        this.f13286i.setInterpolator(xq.f40454i);
        this.f13286i.start();
    }

    public final void g() {
        int i3 = this.f13289l;
        int i10 = this.f13291n;
        k2 k2Var = this.f13281b;
        if (i3 != i10 || this.f13287j != k2Var.getMeasuredWidth() || this.f13288k != k2Var.getMeasuredHeight() || Math.abs(this.f13290m - this.h) > 0.005f) {
            this.f13289l = this.f13291n;
            this.f13287j = k2Var.getMeasuredWidth();
            int measuredHeight = k2Var.getMeasuredHeight();
            this.f13288k = measuredHeight;
            this.f13290m = this.h;
            if (this.f13287j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i11 = this.f13287j;
                    int i12 = this.f13288k;
                    float min = (2.0f - this.h) * (Math.min(i11, i12) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f13295r = android.support.v4.media.session.w.b(i11 * 0.5f, i12 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f13291n) / 255.0f, Color.green(this.f13291n) / 255.0f, Color.blue(this.f13291n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f13291n) / 255.0f, Color.green(this.f13291n) / 255.0f, Color.blue(this.f13291n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i13 = this.f13287j;
                    int i14 = this.f13288k;
                    this.f13295r = new RadialGradient(i13 * 0.5f, i14 * 0.4f, (2.0f - this.h) * (Math.min(i13, i14) / 2.0f) * 1.35f, new int[]{i0.a.o(this.f13291n, 0), this.f13291n}, new float[]{org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f13296s.setShader(this.f13295r);
                k2Var.invalidate();
                this.f13282c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f13284f;
        if (view != null && (layoutParams = this.f13285g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f13283e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity W = org.telegram.messenger.g0.W(this.f13280a);
        if (W == null) {
            W = LaunchActivity.K1;
        }
        if (W != null && !W.isFinishing() && (window = W.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f10;
            window.setAttributes(attributes);
        }
    }

    public final void i() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 < arrayList.size()) {
                ((m2) arrayList.get(i3)).setInvert(this.h);
                ((m2) arrayList.get(i3)).invalidate();
                i3++;
            } else {
                this.f13296s.setAlpha((int) (this.f13293p * 255.0f * this.h));
                this.f13281b.invalidate();
                this.f13282c.invalidate();
                return;
            }
        }
    }
}
