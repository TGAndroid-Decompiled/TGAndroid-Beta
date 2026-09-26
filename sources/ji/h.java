package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.wn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f13059a;
    public final float f13060b;
    public final n f13061c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f13059a = i10;
        this.f13061c = nVar;
        this.d = view;
        this.f13060b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f13059a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f13061c;
                wn wnVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - wnVar.f39639s9) - wnVar.Aa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f39639s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f13060b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f13061c;
                wn wnVar2 = nVar2.F;
                bb bbVar = (bb) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - wnVar2.f39639s9) - wnVar2.Aa) / 2.0f) - (bbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f39639s9;
                if (bbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - bbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                bbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f13060b));
                return;
        }
    }
}
