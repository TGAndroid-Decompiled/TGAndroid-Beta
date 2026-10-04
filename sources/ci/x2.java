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
import org.telegram.ui.Components.tr;
import org.telegram.ui.LaunchActivity;
public final class x2 {
    public final Context f6264a;
    public final u2 f6265b;
    public final u2 f6266c;
    public final WindowManager f6267e;
    public final View f6268f;
    public final WindowManager.LayoutParams f6269g;
    public ValueAnimator f6270i;
    public int f6271j;
    public int f6272k;
    public int f6273l;
    public float f6274m;
    public int f6275n;
    public RadialGradient f6279r;
    public final Paint f6280s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f6276o = 0.75f;
    public float f6277p = 1.0f;
    public final Matrix f6278q = new Matrix();

    public x2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f6280s = paint;
        this.f6264a = context;
        this.f6267e = windowManager;
        this.f6268f = view;
        this.f6269g = layoutParams;
        this.f6265b = new u2(this, context, 0);
        this.f6266c = new u2(this, context, 1);
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
        if (this.f6279r != null) {
            g();
            this.f6279r.setLocalMatrix(this.f6278q);
            Paint paint = this.f6280s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f6271j, this.f6272k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            u2 u2Var = this.f6266c;
            rectF.set(0.0f, 0.0f, u2Var.getMeasuredWidth(), u2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(eb ebVar) {
        h(this.f6277p);
        e(1.0f, 320L, ebVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f6270i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f6270i = null;
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
        this.f6270i = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 17));
        this.f6270i.addListener(new ai.t2(this, f7, runnable, 1));
        this.f6270i.setDuration(j3);
        this.f6270i.setInterpolator(tr.f31143i);
        this.f6270i.start();
    }

    public final void g() {
        int i10 = this.f6273l;
        int i11 = this.f6275n;
        u2 u2Var = this.f6265b;
        if (i10 != i11 || this.f6271j != u2Var.getMeasuredWidth() || this.f6272k != u2Var.getMeasuredHeight() || Math.abs(this.f6274m - this.h) > 0.005f) {
            this.f6273l = this.f6275n;
            this.f6271j = u2Var.getMeasuredWidth();
            int measuredHeight = u2Var.getMeasuredHeight();
            this.f6272k = measuredHeight;
            this.f6274m = this.h;
            if (this.f6271j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f6271j;
                    int i13 = this.f6272k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f6279r = ah.f.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f6275n) / 255.0f, Color.green(this.f6275n) / 255.0f, Color.blue(this.f6275n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f6275n) / 255.0f, Color.green(this.f6275n) / 255.0f, Color.blue(this.f6275n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f6271j;
                    int i15 = this.f6272k;
                    this.f6279r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f6275n, 0), this.f6275n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f6280s.setShader(this.f6279r);
                u2Var.invalidate();
                this.f6266c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f6268f;
        if (view != null && (layoutParams = this.f6269g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.f6267e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f6264a);
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
                this.f6280s.setAlpha((int) (this.f6277p * 255.0f * this.h));
                this.f6265b.invalidate();
                this.f6266c.invalidate();
                return;
            }
        }
    }
}
