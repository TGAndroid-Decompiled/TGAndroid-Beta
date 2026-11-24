package defpackage;

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
import org.telegram.ui.LaunchActivity;
public final class mi4 {
    public final Context a;
    public final ii4 b;
    public final ii4 c;
    public final WindowManager e;
    public final View f;
    public final WindowManager.LayoutParams g;
    public ValueAnimator i;
    public int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public RadialGradient r;
    public final Paint s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float o = 0.75f;
    public float p = 1.0f;
    public final Matrix q = new Matrix();

    public mi4(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.s = paint;
        this.a = context;
        this.e = windowManager;
        this.f = view;
        this.g = layoutParams;
        this.b = new ii4(this, context, (byte) 0);
        this.c = new ii4(this, context, (byte) 1);
        paint.setAlpha(0);
    }

    public static int f(float f) {
        if (f < 0.5f) {
            return bm2.f(Utilities.i(f / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return bm2.f(Utilities.i((f - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(li4 li4Var) {
        li4Var.setInvert(this.h);
        this.d.add(li4Var);
    }

    public final void b(Canvas canvas, boolean z) {
        if (this.r != null) {
            g();
            this.r.setLocalMatrix(this.q);
            Paint paint = this.s;
            if (z) {
                canvas.drawRect(0.0f, 0.0f, this.j, this.k, paint);
                return;
            }
            RectF rectF = gl.P;
            ii4 ii4Var = this.c;
            rectF.set(0.0f, 0.0f, ii4Var.getMeasuredWidth(), ii4Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, gl.L(12.0f) - 2, gl.L(12.0f) - 2, paint);
        }
    }

    public final void c(s6b s6bVar) {
        h(this.p);
        e(1.0f, 320L, s6bVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f, long j, Runnable runnable) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        if (j <= 0) {
            this.h = f;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f);
        this.i = ofFloat;
        ofFloat.addUpdateListener(new uz1(this, (byte) 29));
        this.i.addListener(new ji4(this, f, runnable, (byte) 0));
        this.i.setDuration(j);
        this.i.setInterpolator(s33.i);
        this.i.start();
    }

    public final void g() {
        RadialGradient radialGradient;
        int i = this.l;
        int i2 = this.n;
        ii4 ii4Var = this.b;
        if (i != i2 || this.j != ii4Var.getMeasuredWidth() || this.k != ii4Var.getMeasuredHeight() || Math.abs(this.m - this.h) > 0.005f) {
            this.l = this.n;
            this.j = ii4Var.getMeasuredWidth();
            int measuredHeight = ii4Var.getMeasuredHeight();
            this.k = measuredHeight;
            this.m = this.h;
            if (this.j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i3 = this.j;
                    int i4 = this.k;
                    float min = (2.0f - this.h) * (Math.min(i3, i4) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {gl.R1(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    radialGradient = mk1.b(i3 * 0.5f, i4 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                    this.r = radialGradient;
                } else {
                    int i5 = this.j;
                    int i6 = this.k;
                    RadialGradient radialGradient2 = new RadialGradient(i5 * 0.5f, i6 * 0.4f, (2.0f - this.h) * (Math.min(i5, i6) / 2.0f) * 1.35f, new int[]{bm2.o(this.n, 0), this.n}, new float[]{gl.R1(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                    this.r = radialGradient2;
                    radialGradient = radialGradient2;
                }
                this.s.setShader(radialGradient);
                ii4Var.invalidate();
                this.c.invalidate();
            }
        }
    }

    public final void h(float f) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f;
        if (view != null && (layoutParams = this.g) != null) {
            layoutParams.screenBrightness = f;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity W = gl.W(this.a);
        if (W == null) {
            W = LaunchActivity.H1;
        }
        if (W != null && !W.isFinishing() && (window = W.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f;
            window.setAttributes(attributes);
        }
    }

    public final void i() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                ((li4) arrayList.get(i)).setInvert(this.h);
                ((li4) arrayList.get(i)).invalidate();
                i++;
            } else {
                this.s.setAlpha((int) (this.p * 255.0f * this.h));
                this.b.invalidate();
                this.c.invalidate();
                return;
            }
        }
    }
}
