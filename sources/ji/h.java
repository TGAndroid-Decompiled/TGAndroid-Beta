package ji;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.db;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.xn;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f13059a;
    public final float f13060b;
    public final n f13061c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f13059a = i10;
        this.f13061c = nVar;
        this.d = view;
        this.f13060b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f13059a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f13061c;
                xn xnVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - xnVar.f39541s9) - xnVar.Aa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f39541s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f13060b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f13061c;
                xn xnVar2 = nVar2.F;
                db dbVar = (db) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - xnVar2.f39541s9) - xnVar2.Aa) / 2.0f) - (dbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f39541s9;
                if (dbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - dbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                dbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f13060b));
                return;
        }
    }
}
