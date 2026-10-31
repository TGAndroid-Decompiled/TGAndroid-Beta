package ci;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.f0;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.un;
public final class j implements ValueAnimator.AnimatorUpdateListener {
    public final int f4219a;
    public final float f4220b;
    public final o f4221c;
    public final View d;

    public j(o oVar, View view, float f7, int i10) {
        this.f4219a = i10;
        this.f4221c = oVar;
        this.d = view;
        this.f4220b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f4219a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o oVar = this.f4221c;
                un unVar = oVar.F;
                f0 f0Var = (f0) this.d;
                float measuredHeight = ((((oVar.G.getMeasuredHeight() - unVar.L9) - unVar.Ua) / 2.0f) - (f0Var.getMeasuredHeight() / 2.0f)) + oVar.F.L9;
                if (f0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - f0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                f0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f4220b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o oVar2 = this.f4221c;
                un unVar2 = oVar2.F;
                ra raVar = (ra) this.d;
                float measuredHeight2 = ((((oVar2.G.getMeasuredHeight() - unVar2.L9) - unVar2.Ua) / 2.0f) - (raVar.getMeasuredHeight() / 2.0f)) + oVar2.F.L9;
                if (raVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - raVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                raVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f4220b));
                return;
        }
    }
}
