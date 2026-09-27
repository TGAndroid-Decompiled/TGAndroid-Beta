package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.xn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f13062a;
    public final float f13063b;
    public final n f13064c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f13062a = i10;
        this.f13064c = nVar;
        this.d = view;
        this.f13063b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f13062a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f13064c;
                xn xnVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - xnVar.f39922s9) - xnVar.Aa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f39922s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f13063b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f13064c;
                xn xnVar2 = nVar2.F;
                bb bbVar = (bb) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - xnVar2.f39922s9) - xnVar2.Aa) / 2.0f) - (bbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f39922s9;
                if (bbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - bbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                bbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f13063b));
                return;
        }
    }
}
