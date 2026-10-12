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
import org.telegram.ui.Components.js;
import org.telegram.ui.LaunchActivity;
public final class w2 {
    public final Context f6181a;
    public final t2 f6182b;
    public final t2 f6183c;
    public final WindowManager f6184e;
    public final View f6185f;
    public final WindowManager.LayoutParams f6186g;
    public ValueAnimator f6187i;
    public int f6188j;
    public int f6189k;
    public int f6190l;
    public float f6191m;
    public int f6192n;
    public RadialGradient f6196r;
    public final Paint f6197s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f6193o = 0.75f;
    public float f6194p = 1.0f;
    public final Matrix f6195q = new Matrix();

    public w2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f6197s = paint;
        this.f6181a = context;
        this.f6184e = windowManager;
        this.f6185f = view;
        this.f6186g = layoutParams;
        this.f6182b = new t2(this, context, 0);
        this.f6183c = new t2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f7) {
        if (f7 < 0.5f) {
            return i0.a.d(Utilities.clamp(f7 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.d(Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(v2 v2Var) {
        v2Var.setInvert(this.h);
        this.d.add(v2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f6196r != null) {
            g();
            this.f6196r.setLocalMatrix(this.f6195q);
            Paint paint = this.f6197s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f6188j, this.f6189k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            t2 t2Var = this.f6183c;
            rectF.set(0.0f, 0.0f, t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(fb fbVar) {
        h(this.f6194p);
        e(1.0f, 320L, fbVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.f6187i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f6187i = null;
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
        this.f6187i = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 17));
        this.f6187i.addListener(new ai.u2(this, f7, runnable, 1));
        this.f6187i.setDuration(j3);
        this.f6187i.setInterpolator(js.f27636i);
        this.f6187i.start();
    }

    public final void g() {
        int i10 = this.f6190l;
        int i11 = this.f6192n;
        t2 t2Var = this.f6182b;
        if (i10 != i11 || this.f6188j != t2Var.getMeasuredWidth() || this.f6189k != t2Var.getMeasuredHeight() || Math.abs(this.f6191m - this.h) > 0.005f) {
            this.f6190l = this.f6192n;
            this.f6188j = t2Var.getMeasuredWidth();
            int measuredHeight = t2Var.getMeasuredHeight();
            this.f6189k = measuredHeight;
            this.f6191m = this.h;
            if (this.f6188j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f6188j;
                    int i13 = this.f6189k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f6196r = ah.e.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f6192n) / 255.0f, Color.green(this.f6192n) / 255.0f, Color.blue(this.f6192n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f6192n) / 255.0f, Color.green(this.f6192n) / 255.0f, Color.blue(this.f6192n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f6188j;
                    int i15 = this.f6189k;
                    this.f6196r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f6192n, 0), this.f6192n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f6197s.setShader(this.f6196r);
                t2Var.invalidate();
                this.f6183c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f6185f;
        if (view != null && (layoutParams = this.f6186g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.f6184e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f6181a);
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
                ((v2) arrayList.get(i10)).setInvert(this.h);
                ((v2) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f6197s.setAlpha((int) (this.f6194p * 255.0f * this.h));
                this.f6182b.invalidate();
                this.f6183c.invalidate();
                return;
            }
        }
    }
}
