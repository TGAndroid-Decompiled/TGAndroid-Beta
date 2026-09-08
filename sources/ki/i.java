package ki;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.co;
public final class i implements ValueAnimator.AnimatorUpdateListener {
    public final int f15031a;
    public final float f15032b;
    public final o f15033c;
    public final View d;

    public i(o oVar, View view, float f7, int i10) {
        this.f15031a = i10;
        this.f15033c = oVar;
        this.d = view;
        this.f15032b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f15031a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o oVar = this.f15033c;
                co coVar = oVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((oVar.G.getMeasuredHeight() - coVar.f35445s9) - coVar.Aa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + oVar.F.f35445s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f15032b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o oVar2 = this.f15033c;
                co coVar2 = oVar2.F;
                bb bbVar = (bb) this.d;
                float measuredHeight2 = ((((oVar2.G.getMeasuredHeight() - coVar2.f35445s9) - coVar2.Aa) / 2.0f) - (bbVar.getMeasuredHeight() / 2.0f)) + oVar2.F.f35445s9;
                if (bbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - bbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                bbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f15032b));
                return;
        }
    }
}
