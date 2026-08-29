package nh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.LaunchActivity;
public final class p2 {
    public final Context f18330a;
    public final m2 f18331b;
    public final m2 f18332c;
    public final WindowManager f18333e;
    public final View f18334f;
    public final WindowManager.LayoutParams f18335g;
    public ValueAnimator f18336i;
    public int f18337j;
    public int f18338k;
    public int f18339l;
    public float f18340m;
    public int f18341n;
    public RadialGradient f18345r;
    public final Paint f18346s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f18342o = 0.75f;
    public float f18343p = 1.0f;
    public final Matrix f18344q = new Matrix();

    public p2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f18346s = paint;
        this.f18330a = context;
        this.f18333e = windowManager;
        this.f18334f = view;
        this.f18335g = layoutParams;
        this.f18331b = new m2(this, context, 0);
        this.f18332c = new m2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f9) {
        if (f9 < 0.5f) {
            return i0.a.d(Utilities.clamp(f9 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.d(Utilities.clamp((f9 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(o2 o2Var) {
        o2Var.setInvert(this.h);
        this.d.add(o2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f18345r != null) {
            g();
            this.f18345r.setLocalMatrix(this.f18344q);
            Paint paint = this.f18346s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f18337j, this.f18338k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            m2 m2Var = this.f18332c;
            rectF.set(0.0f, 0.0f, m2Var.getMeasuredWidth(), m2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(ba baVar) {
        h(this.f18343p);
        e(1.0f, 320L, baVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f9, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f18336i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f18336i = null;
        }
        if (j10 <= 0) {
            this.h = f9;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f9);
        this.f18336i = ofFloat;
        ofFloat.addUpdateListener(new lh.d5(this, 6));
        this.f18336i.addListener(new jh.l5(this, f9, runnable, 2));
        this.f18336i.setDuration(j10);
        this.f18336i.setInterpolator(jr.f29802i);
        this.f18336i.start();
    }

    public final void g() {
        int i10 = this.f18339l;
        int i11 = this.f18341n;
        m2 m2Var = this.f18331b;
        if (i10 != i11 || this.f18337j != m2Var.getMeasuredWidth() || this.f18338k != m2Var.getMeasuredHeight() || Math.abs(this.f18340m - this.h) > 0.005f) {
            this.f18339l = this.f18341n;
            this.f18337j = m2Var.getMeasuredWidth();
            int measuredHeight = m2Var.getMeasuredHeight();
            this.f18338k = measuredHeight;
            this.f18340m = this.h;
            if (this.f18337j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f18337j;
                    int i13 = this.f18338k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f18345r = android.support.v4.media.session.z.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f18341n) / 255.0f, Color.green(this.f18341n) / 255.0f, Color.blue(this.f18341n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f18341n) / 255.0f, Color.green(this.f18341n) / 255.0f, Color.blue(this.f18341n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f18337j;
                    int i15 = this.f18338k;
                    this.f18345r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f18341n, 0), this.f18341n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f18346s.setShader(this.f18345r);
                m2Var.invalidate();
                this.f18332c.invalidate();
            }
        }
    }

    public final void h(float f9) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f18334f;
        if (view != null && (layoutParams = this.f18335g) != null) {
            layoutParams.screenBrightness = f9;
            WindowManager windowManager = this.f18333e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f18330a);
        if (findActivity == null) {
            findActivity = LaunchActivity.C1;
        }
        if (findActivity != null && !findActivity.isFinishing() && (window = findActivity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f9;
            window.setAttributes(attributes);
        }
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((o2) arrayList.get(i10)).setInvert(this.h);
                ((o2) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f18346s.setAlpha((int) (this.f18343p * 255.0f * this.h));
                this.f18331b.invalidate();
                this.f18332c.invalidate();
                return;
            }
        }
    }
}
