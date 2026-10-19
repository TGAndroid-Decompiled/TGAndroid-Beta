package li;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.qn;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f16111a;
    public final float f16112b;
    public final m f16113c;
    public final View d;

    public g(m mVar, View view, float f7, int i10) {
        this.f16111a = i10;
        this.f16113c = mVar;
        this.d = view;
        this.f16112b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f16111a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.f16113c;
                qn qnVar = mVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((mVar.G.getMeasuredHeight() - qnVar.f40847s9) - qnVar.Ba) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + mVar.F.f40847s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f16112b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.f16113c;
                qn qnVar2 = mVar2.F;
                xa xaVar = (xa) this.d;
                float measuredHeight2 = ((((mVar2.G.getMeasuredHeight() - qnVar2.f40847s9) - qnVar2.Ba) / 2.0f) - (xaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.f40847s9;
                if (xaVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - xaVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                xaVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f16112b));
                return;
        }
    }
}
