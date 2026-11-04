package ni;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.wm;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f20428a;
    public final float f20429b;
    public final l f20430c;
    public final View d;

    public h(l lVar, View view, float f10, int i3) {
        this.f20428a = i3;
        this.f20430c = lVar;
        this.d = view;
        this.f20429b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f20428a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.f20430c;
                wm wmVar = lVar.F;
                f0 f0Var = (f0) this.d;
                float measuredHeight = ((((lVar.G.getMeasuredHeight() - wmVar.M9) - wmVar.Va) / 2.0f) - (f0Var.getMeasuredHeight() / 2.0f)) + lVar.F.M9;
                if (f0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - f0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                f0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f20429b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar2 = this.f20430c;
                wm wmVar2 = lVar2.F;
                ra raVar = (ra) this.d;
                float measuredHeight2 = ((((lVar2.G.getMeasuredHeight() - wmVar2.M9) - wmVar2.Va) / 2.0f) - (raVar.getMeasuredHeight() / 2.0f)) + lVar2.F.M9;
                if (raVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - raVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                raVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f20429b));
                return;
        }
    }
}
