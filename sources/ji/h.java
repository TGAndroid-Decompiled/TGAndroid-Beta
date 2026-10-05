package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.yn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f14200a;
    public final float f14201b;
    public final n f14202c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f14200a = i10;
        this.f14202c = nVar;
        this.d = view;
        this.f14201b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f14200a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f14202c;
                yn ynVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - ynVar.f43469q9) - ynVar.f43574ya) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f43469q9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f14201b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f14202c;
                yn ynVar2 = nVar2.F;
                bb bbVar = (bb) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - ynVar2.f43469q9) - ynVar2.f43574ya) / 2.0f) - (bbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f43469q9;
                if (bbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - bbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                bbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f14201b));
                return;
        }
    }
}
