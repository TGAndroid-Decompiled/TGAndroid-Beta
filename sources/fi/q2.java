package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.LaunchActivity;
public final class q2 {
    public final Context f11464a;
    public final n2 f11465b;
    public final n2 f11466c;
    public final WindowManager e;
    public final View f11467f;
    public final WindowManager.LayoutParams f11468g;
    public ValueAnimator f11469i;
    public int f11470j;
    public int f11471k;
    public int f11472l;
    public float f11473m;
    public int f11474n;
    public RadialGradient f11478r;
    public final Paint f11479s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float f11475o = 0.75f;
    public float f11476p = 1.0f;
    public final Matrix f11477q = new Matrix();

    public q2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.f11479s = paint;
        this.f11464a = context;
        this.e = windowManager;
        this.f11467f = view;
        this.f11468g = layoutParams;
        this.f11465b = new n2(this, context, 0);
        this.f11466c = new n2(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f7) {
        if (f7 < 0.5f) {
            return i0.a.f(Utilities.clamp(f7 / 0.5f, 1.0f, 0.0f), -7544833, -1);
        }
        return i0.a.f(Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(p2 p2Var) {
        p2Var.setInvert(this.h);
        this.d.add(p2Var);
    }

    public final void b(Canvas canvas, boolean z10) {
        if (this.f11478r != null) {
            g();
            this.f11478r.setLocalMatrix(this.f11477q);
            Paint paint = this.f11479s;
            if (z10) {
                canvas.drawRect(0.0f, 0.0f, this.f11470j, this.f11471k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            n2 n2Var = this.f11466c;
            rectF.set(0.0f, 0.0f, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(la laVar) {
        h(this.f11476p);
        e(1.0f, 320L, laVar);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.f11469i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11469i = null;
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
        this.f11469i = ofFloat;
        ofFloat.addUpdateListener(new ai.g0(this, 27));
        this.f11469i.addListener(new bi.l7(this, f7, runnable, 2));
        this.f11469i.setDuration(j10);
        this.f11469i.setInterpolator(ds.f27532i);
        this.f11469i.start();
    }

    public final void g() {
        int i10 = this.f11472l;
        int i11 = this.f11474n;
        n2 n2Var = this.f11465b;
        if (i10 != i11 || this.f11470j != n2Var.getMeasuredWidth() || this.f11471k != n2Var.getMeasuredHeight() || Math.abs(this.f11473m - this.h) > 0.005f) {
            this.f11472l = this.f11474n;
            this.f11470j = n2Var.getMeasuredWidth();
            int measuredHeight = n2Var.getMeasuredHeight();
            this.f11471k = measuredHeight;
            this.f11473m = this.h;
            if (this.f11470j > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i12 = this.f11470j;
                    int i13 = this.f11471k;
                    float min = (2.0f - this.h) * (Math.min(i12, i13) / 2.0f) * 1.35f;
                    ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
                    float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f11478r = android.support.v4.media.session.x.b(i12 * 0.5f, i13 * 0.4f, min, new long[]{Color.valueOf(Color.red(this.f11474n) / 255.0f, Color.green(this.f11474n) / 255.0f, Color.blue(this.f11474n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.f11474n) / 255.0f, Color.green(this.f11474n) / 255.0f, Color.blue(this.f11474n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()}, fArr);
                } else {
                    int i14 = this.f11470j;
                    int i15 = this.f11471k;
                    this.f11478r = new RadialGradient(i14 * 0.5f, i15 * 0.4f, (2.0f - this.h) * (Math.min(i14, i15) / 2.0f) * 1.35f, new int[]{i0.a.o(this.f11474n, 0), this.f11474n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
                }
                this.f11479s.setShader(this.f11478r);
                n2Var.invalidate();
                this.f11466c.invalidate();
            }
        }
    }

    public final void h(float f7) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f11467f;
        if (view != null && (layoutParams = this.f11468g) != null) {
            layoutParams.screenBrightness = f7;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.f11464a);
        if (findActivity == null) {
            findActivity = LaunchActivity.I1;
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
                ((p2) arrayList.get(i10)).setInvert(this.h);
                ((p2) arrayList.get(i10)).invalidate();
                i10++;
            } else {
                this.f11479s.setAlpha((int) (this.f11476p * 255.0f * this.h));
                this.f11465b.invalidate();
                this.f11466c.invalidate();
                return;
            }
        }
    }
}
