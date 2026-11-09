package mi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.cn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f20078a;
    public final float f20079b;
    public final l f20080c;
    public final View d;

    public h(l lVar, View view, float f10, int i7) {
        this.f20078a = i7;
        this.f20080c = lVar;
        this.d = view;
        this.f20079b = f10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        float f11;
        switch (this.f20078a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar = this.f20080c;
                cn cnVar = lVar.F;
                f0 f0Var = (f0) this.d;
                float measuredHeight = ((((lVar.G.getMeasuredHeight() - cnVar.N9) - cnVar.Wa) / 2.0f) - (f0Var.getMeasuredHeight() / 2.0f)) + lVar.F.N9;
                if (f0Var.getTop() > measuredHeight) {
                    f10 = measuredHeight - f0Var.getTop();
                } else {
                    f10 = 0.0f;
                }
                f0Var.setTranslationY((f10 * floatValue) + ((1.0f - floatValue) * this.f20079b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l lVar2 = this.f20080c;
                cn cnVar2 = lVar2.F;
                ra raVar = (ra) this.d;
                float measuredHeight2 = ((((lVar2.G.getMeasuredHeight() - cnVar2.N9) - cnVar2.Wa) / 2.0f) - (raVar.getMeasuredHeight() / 2.0f)) + lVar2.F.N9;
                if (raVar.getTop() > measuredHeight2) {
                    f11 = measuredHeight2 - raVar.getTop();
                } else {
                    f11 = 0.0f;
                }
                raVar.setTranslationY((f11 * floatValue2) + ((1.0f - floatValue2) * this.f20079b));
                return;
        }
    }
}
