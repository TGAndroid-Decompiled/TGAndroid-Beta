package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.y10;
public final class t6 extends FrameLayout {
    public final j2 f5453a;
    public final s6 f5454b;
    public final s6 f5455c;
    public final s6 d;
    public boolean e;
    public final y10 f5456f;
    public final RectF h;

    public t6(Context context, org.telegram.ui.ActionBar.u6 u6Var, j2 j2Var) {
        super(context);
        this.f5456f = new y10();
        this.h = new RectF();
        this.f5453a = j2Var;
        s6 s6Var = new s6(context, u6Var);
        this.f5454b = s6Var;
        s6 s6Var2 = new s6(context, u6Var);
        this.f5455c = s6Var2;
        s6 s6Var3 = new s6(context, u6Var);
        this.d = s6Var3;
        addView(s6Var, kb1.h(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(s6Var2, kb1.h(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(s6Var3, kb1.h(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(j6 j6Var, float f7, boolean z10, j6 j6Var2, float f10, boolean z11, j6 j6Var3, float f11, boolean z12) {
        j2 j2Var = this.f5453a;
        s6 s6Var = this.f5454b;
        if (j6Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            s6Var.setVisibility(0);
            s6Var.e(j6Var.f4873a, j6Var.f4874b, j2Var);
            s6Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            s6Var.setVisibility(4);
        }
        s6 s6Var2 = this.f5455c;
        if (j6Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            s6Var2.setVisibility(0);
            s6Var2.e(j6Var2.f4873a, j6Var2.f4874b, j2Var);
            s6Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ai.g0(s6Var2, 6));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            s6Var2.setVisibility(4);
        }
        s6 s6Var3 = this.d;
        if (j6Var3 != null) {
            float f14 = f11;
            if (z12) {
                f14 = Math.max(0.5f, f14);
            }
            s6Var3.setVisibility(0);
            s6Var3.e(j6Var3.f4873a, j6Var3.f4874b, j2Var);
            s6Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
            return;
        }
        s6Var3.setVisibility(4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f));
        y10 y10Var = this.f5456f;
        y10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        y10Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), 1073741824));
    }
}
