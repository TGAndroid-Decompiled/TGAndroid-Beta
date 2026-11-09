package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.ls;
import org.telegram.ui.jm0;
import org.telegram.ui.rc;
import org.telegram.ui.w71;
public final class ea implements ValueAnimator.AnimatorUpdateListener {
    public final int f11934a;
    public boolean f11935b = false;
    public final ls f11936c;

    public ea(ls lsVar, int i7) {
        this.f11934a = i7;
        this.f11936c = lsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11934a) {
            case 0:
                va vaVar = (va) this.f11936c;
                vaVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da daVar = vaVar.C2;
                if (daVar != null) {
                    daVar.invalidate();
                }
                if (!this.f11935b && vaVar.D2 > 0.5f) {
                    this.f11935b = true;
                    return;
                }
                return;
            case 1:
                rc rcVar = (rc) this.f11936c;
                rcVar.f49424n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.m0.invalidate();
                if (!this.f11935b && rcVar.f49424n0 > 0.5f) {
                    this.f11935b = true;
                    return;
                }
                return;
            case 2:
                jm0 jm0Var = (jm0) this.f11936c;
                jm0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jm0Var.X.invalidate();
                if (!this.f11935b && jm0Var.Y > 0.5f) {
                    this.f11935b = true;
                    return;
                }
                return;
            default:
                w71 w71Var = (w71) this.f11936c;
                w71Var.f50935j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w71Var.f50932i2.invalidate();
                if (!this.f11935b && w71Var.f50935j2 > 0.5f) {
                    this.f11935b = true;
                    return;
                }
                return;
        }
    }
}
