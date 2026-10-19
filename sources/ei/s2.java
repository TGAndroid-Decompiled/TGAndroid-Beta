package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.LaunchActivity;
public final class s2 {
    public final Context f9768a;
    public final p2 f9769b;
    public final p2 f9770c;
    public final WindowManager e;
    public final View f9771f;
    public final WindowManager.LayoutParams f9772g;
    public ValueAnimator f9773i;
    public int f9774j;
    public int f9775k;
    public int f9776l;
    public float f9777m;
    public int f9778n;
    public RadialGradient f9782r;
    public final Paint f9783s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f9779o = 0.75f;
    public float f9780p = 1.0f;
    public final Matrix f9781q = new Matrix();

    public s2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f9783s = paint;
        this.f9768a = context;
        this.e = windowManager;
        this.f9771f = view;
        this.f9772g = layoutParams;
        this.f9769b = new p2(this, context, 0);
        this.f9770c = new p2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f7) {
        if (f7 < 0.5f) {
            return i0.a.f(Utilities.clamp(f7 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.f(Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(r2 r2Var) {
        r2Var.setInvert(this.h);
        this.d.add(r2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f9782r != null) {
            g();
            this.f9782r.setLocalMatrix(this.f9781q);
            Paint paint = this.f9783s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f9774j, this.f9775k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.f9770c;
            rectF.set(0.0f, 0.0f, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(pa paVar) {
        h(this.f9780p);
        e(1.0f, 320L, paVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f9773i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9773i = null;
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
        this.f9773i = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 25));
        this.f9773i.addListener(new ai.o7(this, f7, runnable, 2));
        this.f9773i.setDuration(j10);
        this.f9773i.setInterpolator(bs.f25016i);
        this.f9773i.start();
    }

    public final void g() {
        int i10 = this.f9776l;
        int i11 = this.f9778n;
        p2 p2Var = this.f9769b;
        if (i10 != i11 || this.f9774j != p2Var.getMeasuredWidth() || this.f9775k != p2Var.getMeasuredHeight() || Math.abs(this.f9777m - this.h) > 0.005f) {
            this.f9776l = this.f9778n;
            this.f9774j = p2Var.getMeasuredWidth();
            int measuredHeight = p2Var.getMeasuredHeight();
            this.f9775k = measuredHeight;
            this.f9777m = this.h;
            if (this.f9774j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f9774j;
                    int i13 = this.f9775k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f9782r = android.support.v4.media.session.x.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f9778n) / 255.0f, Color.green(this.f9778n) / 255.0f, Color.blue(this.f9778n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f9778n) / 255.0f, Color.green(this.f9778n) / 255.0f, Color.blue(this.f9778n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f9774j;
                    int i15 = this.f9775k;
                    this.f9782r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.o(this.f9778n, 0), this.f9778n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f9783s.setShader(this.f9782r);
                p2Var.invalidate();
                this.f9770c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f9771f;
        if (view != null && (layoutParams = this.f9772g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f9768a);
        if (findActivity == null) {
            findActivity = LaunchActivity.H1;
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
                ((r2) arrayList.get(i10)).setInvert(this.h);
                ((r2) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f9783s.setAlpha((int) (this.f9780p * 255.0f * this.h));
                this.f9769b.invalidate();
                this.f9770c.invalidate();
                return;
            }
        }
    }
}
