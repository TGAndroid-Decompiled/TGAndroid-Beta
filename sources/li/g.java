package li;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.sn;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f16172a;
    public final float f16173b;
    public final m f16174c;
    public final View d;

    public g(m mVar, View view, float f7, int i10) {
        this.f16172a = i10;
        this.f16174c = mVar;
        this.d = view;
        this.f16173b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f16172a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.f16174c;
                sn snVar = mVar.F;
                g0 g0Var = (g0) this.d;
                float measuredHeight = ((((mVar.G.getMeasuredHeight() - snVar.E9) - snVar.Na) / 2.0f) - (g0Var.getMeasuredHeight() / 2.0f)) + mVar.F.E9;
                if (g0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - g0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                g0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f16173b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.f16174c;
                sn snVar2 = mVar2.F;
                ya yaVar = (ya) this.d;
                float measuredHeight2 = ((((mVar2.G.getMeasuredHeight() - snVar2.E9) - snVar2.Na) / 2.0f) - (yaVar.getMeasuredHeight() / 2.0f)) + mVar2.F.E9;
                if (yaVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - yaVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                yaVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f16173b));
                return;
        }
    }
}
