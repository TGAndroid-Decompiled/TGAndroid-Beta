package ki;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.i0;
import org.telegram.ui.Cells.za;
import org.telegram.ui.fo;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f14317a;
    public final float f14318b;
    public final n f14319c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f14317a = i10;
        this.f14319c = nVar;
        this.d = view;
        this.f14318b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f14317a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f14319c;
                fo foVar = nVar.F;
                i0 i0Var = (i0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - foVar.f36104s9) - foVar.Ba) / 2.0f) - (i0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f36104s9;
                if (i0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - i0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                i0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f14318b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f14319c;
                fo foVar2 = nVar2.F;
                za zaVar = (za) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - foVar2.f36104s9) - foVar2.Ba) / 2.0f) - (zaVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f36104s9;
                if (zaVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - zaVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                zaVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f14318b));
                return;
        }
    }
}
