package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.zn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f13071a;
    public final float f13072b;
    public final n f13073c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f13071a = i10;
        this.f13073c = nVar;
        this.d = view;
        this.f13072b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f13071a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f13073c;
                zn znVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - znVar.f40475s9) - znVar.Aa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f40475s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f13072b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f13073c;
                zn znVar2 = nVar2.F;
                cb cbVar = (cb) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - znVar2.f40475s9) - znVar2.Aa) / 2.0f) - (cbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f40475s9;
                if (cbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - cbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                cbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f13072b));
                return;
        }
    }
}
