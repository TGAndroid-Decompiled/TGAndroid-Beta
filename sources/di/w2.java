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
    public final Context f8027a;
    public final t2 f8028b;
    public final t2 f8029c;
    public final WindowManager e;
    public final View f8030f;
    public final WindowManager.LayoutParams f8031g;
    public ValueAnimator f8032i;
    public int f8033j;
    public int f8034k;
    public int f8035l;
    public float f8036m;
    public int f8037n;
    public RadialGradient f8041r;
    public final Paint f8042s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f8038o = 0.75f;
    public float f8039p = 1.0f;
    public final Matrix f8040q = new Matrix();

    public w2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f8042s = paint;
        this.f8027a = context;
        this.e = windowManager;
        this.f8030f = view;
        this.f8031g = layoutParams;
        this.f8028b = new t2(this, context, 0);
        this.f8029c = new t2(this, context, 1);
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
        if (this.f8041r != null) {
            g();
            this.f8041r.setLocalMatrix(this.f8040q);
            Paint paint = this.f8042s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f8033j, this.f8034k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            t2 t2Var = this.f8029c;
            rectF.set(0.0f, 0.0f, t2Var.getMeasuredWidth(), t2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(eb ebVar) {
        h(this.f8039p);
        e(1.0f, 320L, ebVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f8032i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8032i = null;
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
        this.f8032i = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 18));
        this.f8032i.addListener(new bi.i2(this, f7, runnable, 1));
        this.f8032i.setDuration(j10);
        this.f8032i.setInterpolator(es.f24773i);
        this.f8032i.start();
    }

    public final void g() {
        int i10 = this.f8035l;
        int i11 = this.f8037n;
        t2 t2Var = this.f8028b;
        if (i10 != i11 || this.f8033j != t2Var.getMeasuredWidth() || this.f8034k != t2Var.getMeasuredHeight() || Math.abs(this.f8036m - this.h) > 0.005f) {
            this.f8035l = this.f8037n;
            this.f8033j = t2Var.getMeasuredWidth();
            int measuredHeight = t2Var.getMeasuredHeight();
            this.f8034k = measuredHeight;
            this.f8036m = this.h;
            if (this.f8033j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f8033j;
                    int i13 = this.f8034k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f8041r = android.support.v4.media.session.x.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f8037n) / 255.0f, Color.green(this.f8037n) / 255.0f, Color.blue(this.f8037n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f8037n) / 255.0f, Color.green(this.f8037n) / 255.0f, Color.blue(this.f8037n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f8033j;
                    int i15 = this.f8034k;
                    this.f8041r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f8037n, 0), this.f8037n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f8042s.setShader(this.f8041r);
                t2Var.invalidate();
                this.f8029c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f8030f;
        if (view != null && (layoutParams = this.f8031g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f8027a);
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
                this.f8042s.setAlpha((int) (this.f8039p * 255.0f * this.h));
                this.f8028b.invalidate();
                this.f8029c.invalidate();
                return;
            }
        }
    }
}
