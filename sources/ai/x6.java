package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.u10;
public final class x6 extends FrameLayout {
    public final h2 f2436a;
    public final w6 f2437b;
    public final w6 f2438c;
    public final w6 d;
    public boolean e;
    public final u10 f2439f;
    public final RectF h;

    public x6(Context context, org.telegram.ui.ActionBar.d6 d6Var, h2 h2Var) {
        super(context);
        this.f2439f = new u10();
        this.h = new RectF();
        this.f2436a = h2Var;
        w6 w6Var = new w6(context, d6Var);
        this.f2437b = w6Var;
        w6 w6Var2 = new w6(context, d6Var);
        this.f2438c = w6Var2;
        w6 w6Var3 = new w6(context, d6Var);
        this.d = w6Var3;
        addView(w6Var, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(w6Var2, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(w6Var3, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(n6 n6Var, float f7, boolean z10, n6 n6Var2, float f10, boolean z11, n6 n6Var3, float f11, boolean z12) {
        h2 h2Var = this.f2436a;
        w6 w6Var = this.f2437b;
        if (n6Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            w6Var.setVisibility(0);
            w6Var.e(n6Var.f1894a, n6Var.f1895b, h2Var);
            w6Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            w6Var.setVisibility(4);
        }
        w6 w6Var2 = this.f2438c;
        if (n6Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            w6Var2.setVisibility(0);
            w6Var2.e(n6Var2.f1894a, n6Var2.f1895b, h2Var);
            w6Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.c0(w6Var2, 4));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            w6Var2.setVisibility(4);
        }
        w6 w6Var3 = this.d;
        if (n6Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            w6Var3.setVisibility(0);
            w6Var3.e(n6Var3.f1894a, n6Var3.f1895b, h2Var);
            w6Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        w6Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        u10 u10Var = this.f2439f;
        u10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        u10Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
