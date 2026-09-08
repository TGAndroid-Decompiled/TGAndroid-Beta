package di;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
public final class y2 {
    public final Context f8476a;
    public final v2 f8477b;
    public final v2 f8478c;
    public final WindowManager f8479e;
    public final View f8480f;
    public final WindowManager.LayoutParams f8481g;
    public ValueAnimator f8482i;
    public int f8483j;
    public int f8484k;
    public int f8485l;
    public float f8486m;
    public int f8487n;
    public RadialGradient f8491r;
    public final Paint f8492s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f8488o = 0.75f;
    public float f8489p = 1.0f;
    public final Matrix f8490q = new Matrix();

    public y2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f8492s = paint;
        this.f8476a = context;
        this.f8479e = windowManager;
        this.f8480f = view;
        this.f8481g = layoutParams;
        this.f8477b = new v2(this, context, 0);
        this.f8478c = new v2(this, context, 1);
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
        if (this.f8491r != null) {
            g();
            this.f8491r.setLocalMatrix(this.f8490q);
            Paint paint = this.f8492s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f8483j, this.f8484k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            v2 v2Var = this.f8478c;
            rectF.set(0.0f, 0.0f, v2Var.getMeasuredWidth(), v2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(ib ibVar) {
        h(this.f8489p);
        e(1.0f, 320L, ibVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f8482i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8482i = null;
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
        this.f8482i = ofFloat;
        ofFloat.addUpdateListener(new ah.d0(this, 18));
        this.f8482i.addListener(new bi.h2(this, f7, runnable, 1));
        this.f8482i.setDuration(j3);
        this.f8482i.setInterpolator(pr.f29495i);
        this.f8482i.start();
    }

    public final void g() {
        int i10 = this.f8485l;
        int i11 = this.f8487n;
        v2 v2Var = this.f8477b;
        if (i10 != i11 || this.f8483j != v2Var.getMeasuredWidth() || this.f8484k != v2Var.getMeasuredHeight() || Math.abs(this.f8486m - this.h) > 0.005f) {
            this.f8485l = this.f8487n;
            this.f8483j = v2Var.getMeasuredWidth();
            int measuredHeight = v2Var.getMeasuredHeight();
            this.f8484k = measuredHeight;
            this.f8486m = this.h;
            if (this.f8483j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f8483j;
                    int i13 = this.f8484k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f8491r = android.support.v4.media.session.y.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f8487n) / 255.0f, Color.green(this.f8487n) / 255.0f, Color.blue(this.f8487n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f8487n) / 255.0f, Color.green(this.f8487n) / 255.0f, Color.blue(this.f8487n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f8483j;
                    int i15 = this.f8484k;
                    this.f8491r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f8487n, 0), this.f8487n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f8492s.setShader(this.f8491r);
                v2Var.invalidate();
                this.f8478c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f8480f;
        if (view != null && (layoutParams = this.f8481g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.f8479e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f8476a);
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
                this.f8492s.setAlpha((int) (this.f8489p * 255.0f * this.h));
                this.f8477b.invalidate();
                this.f8478c.invalidate();
                return;
            }
        }
    }
}
