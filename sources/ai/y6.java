package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.s10;
public final class y6 extends FrameLayout {
    public final l2 f2486a;
    public final x6 f2487b;
    public final x6 f2488c;
    public final x6 d;
    public boolean e;
    public final s10 f2489f;
    public final RectF h;

    public y6(Context context, org.telegram.ui.ActionBar.d6 d6Var, l2 l2Var) {
        super(context);
        this.f2489f = new s10();
        this.h = new RectF();
        this.f2486a = l2Var;
        x6 x6Var = new x6(context, d6Var);
        this.f2487b = x6Var;
        x6 x6Var2 = new x6(context, d6Var);
        this.f2488c = x6Var2;
        x6 x6Var3 = new x6(context, d6Var);
        this.d = x6Var3;
        addView(x6Var, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(x6Var2, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(x6Var3, w7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(o6 o6Var, float f7, boolean z10, o6 o6Var2, float f10, boolean z11, o6 o6Var3, float f11, boolean z12) {
        l2 l2Var = this.f2486a;
        x6 x6Var = this.f2487b;
        if (o6Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            x6Var.setVisibility(0);
            x6Var.e(o6Var.f1936a, o6Var.f1937b, l2Var);
            x6Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            x6Var.setVisibility(4);
        }
        x6 x6Var2 = this.f2488c;
        if (o6Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            x6Var2.setVisibility(0);
            x6Var2.e(o6Var2.f1936a, o6Var2.f1937b, l2Var);
            x6Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ah.c0(x6Var2, 4));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            x6Var2.setVisibility(4);
        }
        x6 x6Var3 = this.d;
        if (o6Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            x6Var3.setVisibility(0);
            x6Var3.e(o6Var3.f1936a, o6Var3.f1937b, l2Var);
            x6Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        x6Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        s10 s10Var = this.f2489f;
        s10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        s10Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
