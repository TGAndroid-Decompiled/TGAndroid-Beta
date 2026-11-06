package mi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.an;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f20075a;
    public final float f20076b;
    public final l f20077c;
    public final View d;

    public h(l lVar, View view, float f10, int i7) {
        this.f20075a = i7;
        this.f20077c = lVar;
        this.d = view;
        this.f20076b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f20075a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.f20077c;
                an anVar = lVar.F;
                f0 f0Var = (f0) this.d;
                float measuredHeight = ((((lVar.G.getMeasuredHeight() - anVar.L9) - anVar.Ua) / 2.0f) - (f0Var.getMeasuredHeight() / 2.0f)) + lVar.F.L9;
                if (f0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - f0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                f0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f20076b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar2 = this.f20077c;
                an anVar2 = lVar2.F;
                ra raVar = (ra) this.d;
                float measuredHeight2 = ((((lVar2.G.getMeasuredHeight() - anVar2.L9) - anVar2.Ua) / 2.0f) - (raVar.getMeasuredHeight() / 2.0f)) + lVar2.F.L9;
                if (raVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - raVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                raVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f20076b));
                return;
        }
    }
}
