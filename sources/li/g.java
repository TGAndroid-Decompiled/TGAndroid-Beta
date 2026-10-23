package li;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.qn;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f16109a;
    public final float f16110b;
    public final m f16111c;
    public final View d;

    public g(m mVar, View view, float f7, int i10) {
        this.f16109a = i10;
        this.f16111c = mVar;
        this.d = view;
        this.f16110b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f16109a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.f16111c;
                qn qnVar = mVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((mVar.G.getMeasuredHeight() - qnVar.f40849s9) - qnVar.Ba) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + mVar.F.f40849s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f16110b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.f16111c;
                qn qnVar2 = mVar2.F;
                xa xaVar = (xa) this.d;
                float measuredHeight2 = ((((mVar2.G.getMeasuredHeight() - qnVar2.f40849s9) - qnVar2.Ba) / 2.0f) - (xaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.f40849s9;
                if (xaVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - xaVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                xaVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f16110b));
                return;
        }
    }
}
