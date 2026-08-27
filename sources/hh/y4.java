package hh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.v10;

public final class y4 extends FrameLayout {

    public final q1 f10377a;

    public final x4 f10378b;

    public final x4 f10379c;
    public final x4 d;

    public boolean f10380e;

    public final v10 f10381f;
    public final RectF h;

    public y4(Context context, org.telegram.ui.ActionBar.c6 c6Var, q1 q1Var) {
        super(context);
        this.f10381f = new v10();
        this.h = new RectF();
        this.f10377a = q1Var;
        x4 x4Var = new x4(context, c6Var);
        this.f10378b = x4Var;
        x4 x4Var2 = new x4(context, c6Var);
        this.f10379c = x4Var2;
        x4 x4Var3 = new x4(context, c6Var);
        this.d = x4Var3;
        addView(x4Var, h7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(x4Var2, h7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(x4Var3, h7.z5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(o4 o4Var, float f10, boolean z10, o4 o4Var2, float f11, boolean z11, o4 o4Var3, float f12, boolean z12) {
        q1 q1Var = this.f10377a;
        x4 x4Var = this.f10378b;
        if (o4Var != null) {
            if (z10) {
                f10 = Math.max(0.5f, f10);
            }
            x4Var.setVisibility(0);
            x4Var.e(o4Var.f9824a, o4Var.f9825b, q1Var);
            x4Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f10 - 0.5f) / 1.5f));
        } else {
            x4Var.setVisibility(4);
        }
        x4 x4Var2 = this.f10379c;
        if (o4Var2 != null) {
            float fMax = f11;
            if (z11) {
                fMax = Math.max(0.5f, fMax);
            }
            float f13 = (fMax - 0.5f) / 1.5f;
            x4Var2.setVisibility(0);
            x4Var2.e(o4Var2.f9824a, o4Var2.f9825b, q1Var);
            x4Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.f10380e) {
                this.f10380e = true;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ag.u(x4Var2, 8));
                valueAnimatorOfFloat.setDuration(180L);
                valueAnimatorOfFloat.start();
            }
        } else {
            x4Var2.setVisibility(4);
        }
        x4 x4Var3 = this.d;
        if (o4Var3 == null) {
            x4Var3.setVisibility(4);
            return;
        }
        float fMax2 = f12;
        if (z12) {
            fMax2 = Math.max(0.5f, fMax2);
        }
        x4Var3.setVisibility(0);
        x4Var3.e(o4Var3.f9824a, o4Var3.f9825b, q1Var);
        x4Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((fMax2 - 0.5f) / 1.5f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float width = getWidth();
        float fDp = AndroidUtilities.dp(8.0f);
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, width, fDp);
        v10 v10Var = this.f10381f;
        v10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        v10Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
