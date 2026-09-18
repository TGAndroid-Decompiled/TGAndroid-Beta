package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.bo;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f13070a;
    public final float f13071b;
    public final n f13072c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f13070a = i10;
        this.f13072c = nVar;
        this.d = view;
        this.f13071b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f13070a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f13072c;
                bo boVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - boVar.f32451s9) - boVar.Aa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f32451s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f13071b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f13072c;
                bo boVar2 = nVar2.F;
                cb cbVar = (cb) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - boVar2.f32451s9) - boVar2.Aa) / 2.0f) - (cbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f32451s9;
                if (cbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - cbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                cbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f13071b));
                return;
        }
    }
}
