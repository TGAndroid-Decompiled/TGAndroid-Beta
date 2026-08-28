package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;
public final class s2 {
    public final Context f16009a;
    public final p2 f16010b;
    public final p2 f16011c;
    public final WindowManager f16012e;
    public final View f16013f;
    public final WindowManager.LayoutParams f16014g;
    public ValueAnimator f16015i;
    public int f16016j;
    public int f16017k;
    public int f16018l;
    public float f16019m;
    public int f16020n;
    public RadialGradient f16024r;
    public final Paint f16025s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f16021o = 0.75f;
    public float f16022p = 1.0f;
    public final Matrix f16023q = new Matrix();

    public s2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f16025s = paint;
        this.f16009a = context;
        this.f16012e = windowManager;
        this.f16013f = view;
        this.f16014g = layoutParams;
        this.f16010b = new p2(this, context, 0);
        this.f16011c = new p2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        if (f10 < 0.5f) {
            return i0.a.d(Utilities.clamp(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.d(Utilities.clamp((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(r2 r2Var) {
        r2Var.setInvert(this.h);
        this.d.add(r2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f16024r != null) {
            g();
            this.f16024r.setLocalMatrix(this.f16023q);
            Paint paint = this.f16025s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f16016j, this.f16017k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            p2 p2Var = this.f16011c;
            rectF.set(0.0f, 0.0f, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(qa qaVar) {
        h(this.f16022p);
        e(1.0f, 320L, qaVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f16015i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16015i = null;
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.f16015i = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 27));
        this.f16015i.addListener(new gh.o5(this, f10, runnable, 2));
        this.f16015i.setDuration(j10);
        this.f16015i.setInterpolator(gr.f28846i);
        this.f16015i.start();
    }

    public final void g() {
        int i9 = this.f16018l;
        int i10 = this.f16020n;
        p2 p2Var = this.f16010b;
        if (i9 != i10 || this.f16016j != p2Var.getMeasuredWidth() || this.f16017k != p2Var.getMeasuredHeight() || Math.abs(this.f16019m - this.h) > 0.005f) {
            this.f16018l = this.f16020n;
            this.f16016j = p2Var.getMeasuredWidth();
            int measuredHeight = p2Var.getMeasuredHeight();
            this.f16017k = measuredHeight;
            this.f16019m = this.h;
            if (this.f16016j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i11 = this.f16016j;
                    int i12 = this.f16017k;
                    float min = (2.0f - this.h) * (Math.min(i11, i12) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f16024r = android.support.v4.media.session.z.b(i11 * 0.5f, i12 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f16020n) / 255.0f, Color.green(this.f16020n) / 255.0f, Color.blue(this.f16020n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f16020n) / 255.0f, Color.green(this.f16020n) / 255.0f, Color.blue(this.f16020n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i13 = this.f16016j;
                    int i14 = this.f16017k;
                    this.f16024r = new RadialGradient(i13 * 0.5f, i14 * 0.4f, (2.0f - this.h) * (Math.min(i13, i14) / 2.0f) * 1.35f, new int[]{i0.a.k(this.f16020n, 0), this.f16020n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f16025s.setShader(this.f16024r);
                p2Var.invalidate();
                this.f16011c.invalidate();
            }
        }
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f16013f;
        if (view != null && (layoutParams = this.f16014g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.f16012e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f16009a);
        if (findActivity == null) {
            findActivity = LaunchActivity.C1;
        }
        if (findActivity != null && !findActivity.isFinishing() && (window = findActivity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = f10;
            window.setAttributes(attributes);
        }
    }

    public final void i() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 < arrayList.size()) {
                ((r2) arrayList.get(i9)).setInvert(this.h);
                ((r2) arrayList.get(i9)).invalidate();
                i9++;
            } else {
                this.f16025s.setAlpha((int) (this.f16022p * 255.0f * this.h));
                this.f16010b.invalidate();
                this.f16011c.invalidate();
                return;
            }
        }
    }
}
