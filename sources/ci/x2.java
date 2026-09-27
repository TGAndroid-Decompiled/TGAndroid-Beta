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
import org.telegram.ui.Components.sr;
import org.telegram.ui.LaunchActivity;
public final class x2 {
    public final Context f5816a;
    public final u2 f5817b;
    public final u2 f5818c;
    public final WindowManager e;
    public final View f5819f;
    public final WindowManager.LayoutParams f5820g;
    public ValueAnimator f5821i;
    public int f5822j;
    public int f5823k;
    public int f5824l;
    public float f5825m;
    public int f5826n;
    public RadialGradient f5830r;
    public final Paint f5831s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f5827o = 0.75f;
    public float f5828p = 1.0f;
    public final Matrix f5829q = new Matrix();

    public x2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f5831s = paint;
        this.f5816a = context;
        this.e = windowManager;
        this.f5819f = view;
        this.f5820g = layoutParams;
        this.f5817b = new u2(this, context, 0);
        this.f5818c = new u2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f7) {
        if (f7 < 0.5f) {
            return i0.a.d(Utilities.clamp(f7 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.d(Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(w2 w2Var) {
        w2Var.setInvert(this.h);
        this.d.add(w2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f5830r != null) {
            g();
            this.f5830r.setLocalMatrix(this.f5829q);
            Paint paint = this.f5831s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f5822j, this.f5823k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            u2 u2Var = this.f5818c;
            rectF.set(0.0f, 0.0f, u2Var.getMeasuredWidth(), u2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(eb ebVar) {
        h(this.f5828p);
        e(1.0f, 320L, ebVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f5821i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5821i = null;
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
        this.f5821i = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 17));
        this.f5821i.addListener(new ai.t2(this, f7, runnable, 1));
        this.f5821i.setDuration(j3);
        this.f5821i.setInterpolator(sr.f28361i);
        this.f5821i.start();
    }

    public final void g() {
        int i10 = this.f5824l;
        int i11 = this.f5826n;
        u2 u2Var = this.f5817b;
        if (i10 != i11 || this.f5822j != u2Var.getMeasuredWidth() || this.f5823k != u2Var.getMeasuredHeight() || Math.abs(this.f5825m - this.h) > 0.005f) {
            this.f5824l = this.f5826n;
            this.f5822j = u2Var.getMeasuredWidth();
            int measuredHeight = u2Var.getMeasuredHeight();
            this.f5823k = measuredHeight;
            this.f5825m = this.h;
            if (this.f5822j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f5822j;
                    int i13 = this.f5823k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f5830r = ah.f.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f5826n) / 255.0f, Color.green(this.f5826n) / 255.0f, Color.blue(this.f5826n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f5826n) / 255.0f, Color.green(this.f5826n) / 255.0f, Color.blue(this.f5826n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f5822j;
                    int i15 = this.f5823k;
                    this.f5830r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f5826n, 0), this.f5826n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f5831s.setShader(this.f5830r);
                u2Var.invalidate();
                this.f5818c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f5819f;
        if (view != null && (layoutParams = this.f5820g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f5816a);
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
                ((w2) arrayList.get(i10)).setInvert(this.h);
                ((w2) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f5831s.setAlpha((int) (this.f5828p * 255.0f * this.h));
                this.f5817b.invalidate();
                this.f5818c.invalidate();
                return;
            }
        }
    }
}
