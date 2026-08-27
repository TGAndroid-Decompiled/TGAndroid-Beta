package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.LaunchActivity;

public final class r2 {

    public final Context f16626a;

    public final o2 f16627b;

    public final o2 f16628c;

    public final WindowManager f16629e;

    public final View f16630f;

    public final WindowManager.LayoutParams f16631g;

    public ValueAnimator f16632i;

    public int f16633j;

    public int f16634k;

    public int f16635l;

    public float f16636m;

    public int f16637n;

    public RadialGradient f16641r;

    public final Paint f16642s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;

    public float f16638o = 0.75f;

    public float f16639p = 1.0f;

    public final Matrix f16640q = new Matrix();

    public r2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f16642s = paint;
        this.f16626a = context;
        this.f16629e = windowManager;
        this.f16630f = view;
        this.f16631g = layoutParams;
        this.f16627b = new o2(this, context, 0);
        this.f16628c = new o2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        return f10 < 0.5f ? i0.b.d(Utilities.clamp(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1) : i0.b.d(Utilities.clamp((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(q2 q2Var) {
        q2Var.setInvert(this.h);
        this.d.add(q2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f16641r != null) {
            g();
            this.f16641r.setLocalMatrix(this.f16640q);
            Paint paint = this.f16642s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f16633j, this.f16634k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            o2 o2Var = this.f16628c;
            rectF.set(0.0f, 0.0f, o2Var.getMeasuredWidth(), o2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(na naVar) {
        h(this.f16639p);
        e(1.0f, 320L, naVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f16632i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16632i = null;
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f16632i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new m2(this, 0));
        this.f16632i.addListener(new hh.n5(this, f10, runnable, 2));
        this.f16632i.setDuration(j10);
        this.f16632i.setInterpolator(er.f28124i);
        this.f16632i.start();
    }

    public final void g() {
        int i10 = this.f16635l;
        int i11 = this.f16637n;
        o2 o2Var = this.f16627b;
        if (i10 == i11 && this.f16633j == o2Var.getMeasuredWidth() && this.f16634k == o2Var.getMeasuredHeight() && Math.abs(this.f16636m - this.h) <= 0.005f) {
            return;
        }
        this.f16635l = this.f16637n;
        this.f16633j = o2Var.getMeasuredWidth();
        int measuredHeight = o2Var.getMeasuredHeight();
        this.f16634k = measuredHeight;
        this.f16636m = this.h;
        if (this.f16633j <= 0 || measuredHeight <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int i12 = this.f16633j;
            float f10 = i12 * 0.5f;
            int i13 = this.f16634k;
            float f11 = i13 * 0.4f;
            float fMin = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
            float fRed = Color.red(this.f16637n) / 255.0f;
            float fGreen = Color.green(this.f16637n) / 255.0f;
            float fBlue = Color.blue(this.f16637n) / 255.0f;
            ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
            long[] jArr = {Color.valueOf(fRed, fGreen, fBlue, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f16637n) / 255.0f, Color.green(this.f16637n) / 255.0f, Color.blue(this.f16637n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()};
            float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f16641r = android.support.v4.media.session.z.b(f10, f11, fMin, jArr, fArr);
        } else {
            int i14 = this.f16633j;
            int i15 = this.f16634k;
            this.f16641r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.b.k(this.f16637n, 0), this.f16637n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f16642s.setShader(this.f16641r);
        o2Var.invalidate();
        this.f16628c.invalidate();
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f16630f;
        if (view != null && (layoutParams = this.f16631g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f16629e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity activityFindActivity = AndroidUtilities.findActivity(this.f16626a);
        if (activityFindActivity == null) {
            activityFindActivity = LaunchActivity.C1;
        }
        if (activityFindActivity == null || activityFindActivity.isFinishing() || (window = activityFindActivity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f10;
        window.setAttributes(attributes);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                this.f16642s.setAlpha((int) (this.f16639p * 255.0f * this.h));
                this.f16627b.invalidate();
                this.f16628c.invalidate();
                return;
            }
            ((q2) arrayList.get(i10)).setInvert(this.h);
            ((q2) arrayList.get(i10)).invalidate();
            i10++;
        }
    }
}
