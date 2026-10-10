package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.Cells.za;
import org.telegram.ui.zn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f14236a;
    public final float f14237b;
    public final n f14238c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f14236a = i10;
        this.f14238c = nVar;
        this.d = view;
        this.f14237b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f14236a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f14238c;
                zn znVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - znVar.f44978s9) - znVar.Ba) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f44978s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f14237b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f14238c;
                zn znVar2 = nVar2.F;
                za zaVar = (za) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - znVar2.f44978s9) - znVar2.Ba) / 2.0f) - (zaVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f44978s9;
                if (zaVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - zaVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                zaVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f14237b));
                return;
        }
    }
}
