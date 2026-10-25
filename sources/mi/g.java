package mi;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.g0;
import org.telegram.ui.un;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f18521a;
    public final float f18522b;
    public final m f18523c;
    public final View d;

    public g(m mVar, View view, float f7, int i10) {
        this.f18521a = i10;
        this.f18523c = mVar;
        this.d = view;
        this.f18522b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f18521a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar = this.f18523c;
                un unVar = mVar.F;
                g0 g0Var = (g0) this.d;
                float measuredHeight = ((((mVar.G.getMeasuredHeight() - unVar.E9) - unVar.Na) / 2.0f) - (g0Var.getMeasuredHeight() / 2.0f)) + mVar.F.E9;
                if (g0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - g0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                g0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f18522b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m mVar2 = this.f18523c;
                un unVar2 = mVar2.F;
                cb cbVar = (cb) this.d;
                float measuredHeight2 = ((((mVar2.G.getMeasuredHeight() - unVar2.E9) - unVar2.Na) / 2.0f) - (cbVar.getMeasuredHeight() / 2.0f)) + mVar2.F.E9;
                if (cbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - cbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                cbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f18522b));
                return;
        }
    }
}
