package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.ls;
import org.telegram.ui.hm0;
import org.telegram.ui.rc;
import org.telegram.ui.v71;
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
                rcVar.f49451n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.m0.invalidate();
                if (!this.f11935b && rcVar.f49451n0 > 0.5f) {
                    this.f11935b = true;
                    return;
                }
                return;
            case 2:
                hm0 hm0Var = (hm0) this.f11936c;
                hm0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hm0Var.X.invalidate();
                if (!this.f11935b && hm0Var.Y > 0.5f) {
                    this.f11935b = true;
                    return;
                }
                return;
            default:
                v71 v71Var = (v71) this.f11936c;
                v71Var.f50553j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v71Var.f50550i2.invalidate();
                if (!this.f11935b && v71Var.f50553j2 > 0.5f) {
                    this.f11935b = true;
                    return;
                }
                return;
        }
    }
}
