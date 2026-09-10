package ii;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.db;
import org.telegram.ui.Cells.h0;
import org.telegram.ui.eo;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f10659a;
    public final float f10660b;
    public final n f10661c;
    public final View d;

    public h(n nVar, View view, float f7, int i10) {
        this.f10659a = i10;
        this.f10661c = nVar;
        this.d = view;
        this.f10660b = f7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        float f10;
        switch (this.f10659a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar = this.f10661c;
                eo eoVar = nVar.F;
                h0 h0Var = (h0) this.d;
                float measuredHeight = ((((nVar.G.getMeasuredHeight() - eoVar.f32487s9) - eoVar.Aa) / 2.0f) - (h0Var.getMeasuredHeight() / 2.0f)) + nVar.F.f32487s9;
                if (h0Var.getTop() > measuredHeight) {
                    f7 = measuredHeight - h0Var.getTop();
                } else {
                    f7 = 0.0f;
                }
                h0Var.setTranslationY((f7 * floatValue) + ((1.0f - floatValue) * this.f10660b));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n nVar2 = this.f10661c;
                eo eoVar2 = nVar2.F;
                db dbVar = (db) this.d;
                float measuredHeight2 = ((((nVar2.G.getMeasuredHeight() - eoVar2.f32487s9) - eoVar2.Aa) / 2.0f) - (dbVar.getMeasuredHeight() / 2.0f)) + nVar2.F.f32487s9;
                if (dbVar.getTop() > measuredHeight2) {
                    f10 = measuredHeight2 - dbVar.getTop();
                } else {
                    f10 = 0.0f;
                }
                dbVar.setTranslationY((f10 * floatValue2) + ((1.0f - floatValue2) * this.f10660b));
                return;
        }
    }
}
