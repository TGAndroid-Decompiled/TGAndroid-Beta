package li;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.sn;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f16103a;
    public final float f16104b;
    public final m f16105c;
    public final View d;

    public g(m mVar, View view, float f7, int i10) {
        this.f16103a = i10;
        this.f16105c = mVar;
        this.d = view;
        this.f16104b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f16103a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.f16105c;
                sn snVar = mVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((mVar.G.getMeasuredHeight() - snVar.f41377s9) - snVar.Ba) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + mVar.F.f41377s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f16104b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.f16105c;
                sn snVar2 = mVar2.F;
                xa xaVar = (xa) this.d;
                float measuredHeight2 = ((((mVar2.G.getMeasuredHeight() - snVar2.f41377s9) - snVar2.Ba) / 2.0f) - (xaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.f41377s9;
                if (xaVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - xaVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                xaVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f16104b));
                return;
        }
    }
}
