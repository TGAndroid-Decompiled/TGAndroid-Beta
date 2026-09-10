package bi;

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
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
public final class m3 {
    public final Context f3076a;
    public final i3 f3077b;
    public final i3 f3078c;
    public final WindowManager e;
    public final View f3079f;
    public final WindowManager.LayoutParams f3080g;
    public ValueAnimator f3081i;
    public int f3082j;
    public int f3083k;
    public int f3084l;
    public float f3085m;
    public int f3086n;
    public RadialGradient f3090r;
    public final Paint f3091s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f3087o = 0.75f;
    public float f3088p = 1.0f;
    public final Matrix f3089q = new Matrix();

    public m3(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f3091s = paint;
        this.f3076a = context;
        this.e = windowManager;
        this.f3079f = view;
        this.f3080g = layoutParams;
        this.f3077b = new i3(this, context, 0);
        this.f3078c = new i3(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f7) {
        if (f7 < 0.5f) {
            return i0.a.d(Utilities.clamp(f7 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.d(Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(l3 l3Var) {
        l3Var.setInvert(this.h);
        this.d.add(l3Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f3090r != null) {
            g();
            this.f3090r.setLocalMatrix(this.f3089q);
            Paint paint = this.f3091s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f3082j, this.f3083k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            i3 i3Var = this.f3078c;
            rectF.set(0.0f, 0.0f, i3Var.getMeasuredWidth(), i3Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(rc rcVar) {
        h(this.f3088p);
        e(1.0f, 320L, rcVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f3081i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3081i = null;
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
        this.f3081i = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 3));
        this.f3081i.addListener(new j3(this, f7, runnable, 0));
        this.f3081i.setDuration(j3);
        this.f3081i.setInterpolator(wr.f28821i);
        this.f3081i.start();
    }

    public final void g() {
        int i10 = this.f3084l;
        int i11 = this.f3086n;
        i3 i3Var = this.f3077b;
        if (i10 != i11 || this.f3082j != i3Var.getMeasuredWidth() || this.f3083k != i3Var.getMeasuredHeight() || Math.abs(this.f3085m - this.h) > 0.005f) {
            this.f3084l = this.f3086n;
            this.f3082j = i3Var.getMeasuredWidth();
            int measuredHeight = i3Var.getMeasuredHeight();
            this.f3083k = measuredHeight;
            this.f3085m = this.h;
            if (this.f3082j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f3082j;
                    int i13 = this.f3083k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f3090r = ah.b.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f3086n) / 255.0f, Color.green(this.f3086n) / 255.0f, Color.blue(this.f3086n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f3086n) / 255.0f, Color.green(this.f3086n) / 255.0f, Color.blue(this.f3086n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f3082j;
                    int i15 = this.f3083k;
                    this.f3090r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f3086n, 0), this.f3086n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f3091s.setShader(this.f3090r);
                i3Var.invalidate();
                this.f3078c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f3079f;
        if (view != null && (layoutParams = this.f3080g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f3076a);
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
                ((l3) arrayList.get(i10)).setInvert(this.h);
                ((l3) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f3091s.setAlpha((int) (this.f3088p * 255.0f * this.h));
                this.f3077b.invalidate();
                this.f3078c.invalidate();
                return;
            }
        }
    }
}
