package fi;

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
public final class p2 {
    public final Context f12574a;
    public final m2 f12575b;
    public final m2 f12576c;
    public final WindowManager f12577e;
    public final View f12578f;
    public final WindowManager.LayoutParams f12579g;
    public ValueAnimator f12580i;
    public int f12581j;
    public int f12582k;
    public int f12583l;
    public float f12584m;
    public int f12585n;
    public RadialGradient f12589r;
    public final Paint f12590s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f12586o = 0.75f;
    public float f12587p = 1.0f;
    public final Matrix f12588q = new Matrix();

    public p2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f12590s = paint;
        this.f12574a = context;
        this.f12577e = windowManager;
        this.f12578f = view;
        this.f12579g = layoutParams;
        this.f12575b = new m2(this, context, 0);
        this.f12576c = new m2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        if (f10 < 0.5f) {
            return i0.a.f(Utilities.i(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.f(Utilities.i((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(o2 o2Var) {
        o2Var.setInvert(this.h);
        this.d.add(o2Var);
    }

    public final void b(Canvas canvas, boolean z9) {
        if (this.f12589r != null) {
            g();
            this.f12589r.setLocalMatrix(this.f12588q);
            Paint paint = this.f12590s;
            if (z9) {
                canvas.drawRect(0.0f, 0.0f, this.f12581j, this.f12582k, paint);
                return;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            m2 m2Var = this.f12576c;
            rectF.set(0.0f, 0.0f, m2Var.getMeasuredWidth(), m2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) - 2, org.telegram.messenger.g0.L(12.0f) - 2, paint);
        }
    }

    public final void c(r9 r9Var) {
        h(this.f12587p);
        e(1.0f, 320L, r9Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f12580i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12580i = null;
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
        this.f12580i = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 27));
        this.f12580i.addListener(new bi.o7(this, f10, runnable, 2));
        this.f12580i.setDuration(j3);
        this.f12580i.setInterpolator(xq.f40347i);
        this.f12580i.start();
    }

    public final void g() {
        int i7 = this.f12583l;
        int i10 = this.f12585n;
        m2 m2Var = this.f12575b;
        if (i7 != i10 || this.f12581j != m2Var.getMeasuredWidth() || this.f12582k != m2Var.getMeasuredHeight() || Math.abs(this.f12584m - this.h) > 0.005f) {
            this.f12583l = this.f12585n;
            this.f12581j = m2Var.getMeasuredWidth();
            int measuredHeight = m2Var.getMeasuredHeight();
            this.f12582k = measuredHeight;
            this.f12584m = this.h;
            if (this.f12581j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i11 = this.f12581j;
                    int i12 = this.f12582k;
                    float min = (2.0f - this.h) * (Math.min(i11, i12) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f12589r = android.support.v4.media.session.w.b(i11 * 0.5f, i12 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f12585n) / 255.0f, Color.green(this.f12585n) / 255.0f, Color.blue(this.f12585n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f12585n) / 255.0f, Color.green(this.f12585n) / 255.0f, Color.blue(this.f12585n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i13 = this.f12581j;
                    int i14 = this.f12582k;
                    this.f12589r = new RadialGradient(i13 * 0.5f, i14 * 0.4f, (2.0f - this.h) * (Math.min(i13, i14) / 2.0f) * 1.35f, new int[]{i0.a.o(this.f12585n, 0), this.f12585n}, new float[]{org.telegram.messenger.g0.T1(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f12590s.setShader(this.f12589r);
                m2Var.invalidate();
                this.f12576c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f12578f;
        if (view != null && (layoutParams = this.f12579g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f12577e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity W = org.telegram.messenger.g0.W(this.f12574a);
        if (W == null) {
            W = LaunchActivity.G1;
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
                ((o2) arrayList.get(i7)).setInvert(this.h);
                ((o2) arrayList.get(i7)).invalidate();
                i7++;
            } else {
                this.f12590s.setAlpha((int) (this.f12587p * 255.0f * this.h));
                this.f12575b.invalidate();
                this.f12576c.invalidate();
                return;
            }
        }
    }
}
