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
import org.telegram.ui.Components.es;
import org.telegram.ui.LaunchActivity;
public final class w2 {
    public final Context f8030a;
    public final t2 f8031b;
    public final t2 f8032c;
    public final WindowManager e;
    public final View f8033f;
    public final WindowManager.LayoutParams f8034g;
    public ValueAnimator f8035i;
    public int f8036j;
    public int f8037k;
    public int f8038l;
    public float f8039m;
    public int f8040n;
    public RadialGradient f8044r;
    public final Paint f8045s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f8041o = 0.75f;
    public float f8042p = 1.0f;
    public final Matrix f8043q = new Matrix();

    public w2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f8045s = paint;
        this.f8030a = context;
        this.e = windowManager;
        this.f8033f = view;
        this.f8034g = layoutParams;
        this.f8031b = new t2(this, context, 0);
        this.f8032c = new t2(this, context, 1);
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
        if (this.f8044r != null) {
            g();
            this.f8044r.setLocalMatrix(this.f8043q);
            Paint paint = this.f8045s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f8036j, this.f8037k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            t2 t2Var = this.f8032c;
            rectF.set(0.0f, 0.0f, t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(eb ebVar) {
        h(this.f8042p);
        e(1.0f, 320L, ebVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f8035i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8035i = null;
        }
        if (j10 <= 0) {
            this.h = f7;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f7);
        this.f8035i = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 18));
        this.f8035i.addListener(new bi.i2(this, f7, runnable, 1));
        this.f8035i.setDuration(j10);
        this.f8035i.setInterpolator(es.f24467i);
        this.f8035i.start();
    }

    public final void g() {
        int i10 = this.f8038l;
        int i11 = this.f8040n;
        t2 t2Var = this.f8031b;
        if (i10 != i11 || this.f8036j != t2Var.getMeasuredWidth() || this.f8037k != t2Var.getMeasuredHeight() || Math.abs(this.f8039m - this.h) > 0.005f) {
            this.f8038l = this.f8040n;
            this.f8036j = t2Var.getMeasuredWidth();
            int measuredHeight = t2Var.getMeasuredHeight();
            this.f8037k = measuredHeight;
            this.f8039m = this.h;
            if (this.f8036j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f8036j;
                    int i13 = this.f8037k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f8044r = android.support.v4.media.session.x.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f8040n) / 255.0f, Color.green(this.f8040n) / 255.0f, Color.blue(this.f8040n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f8040n) / 255.0f, Color.green(this.f8040n) / 255.0f, Color.blue(this.f8040n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f8036j;
                    int i15 = this.f8037k;
                    this.f8044r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f8040n, 0), this.f8040n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f8045s.setShader(this.f8044r);
                t2Var.invalidate();
                this.f8032c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f8033f;
        if (view != null && (layoutParams = this.f8034g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f8030a);
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
                this.f8045s.setAlpha((int) (this.f8042p * 255.0f * this.h));
                this.f8031b.invalidate();
                this.f8032c.invalidate();
                return;
            }
        }
    }
}
