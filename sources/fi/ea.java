package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.ls;
import org.telegram.ui.km0;
import org.telegram.ui.rc;
import org.telegram.ui.x71;
public final class ea implements ValueAnimator.AnimatorUpdateListener {
    public final int f11938a;
    public boolean f11939b = false;
    public final ls f11940c;

    public ea(ls lsVar, int i7) {
        this.f11938a = i7;
        this.f11940c = lsVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11938a) {
            case 0:
                va vaVar = (va) this.f11940c;
                vaVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da daVar = vaVar.C2;
                if (daVar != null) {
                    daVar.invalidate();
                }
                if (!this.f11939b && vaVar.D2 > 0.5f) {
                    this.f11939b = true;
                    return;
                }
                return;
            case 1:
                rc rcVar = (rc) this.f11940c;
                rcVar.f49369n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rcVar.m0.invalidate();
                if (!this.f11939b && rcVar.f49369n0 > 0.5f) {
                    this.f11939b = true;
                    return;
                }
                return;
            case 2:
                km0 km0Var = (km0) this.f11940c;
                km0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                km0Var.X.invalidate();
                if (!this.f11939b && km0Var.Y > 0.5f) {
                    this.f11939b = true;
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) this.f11940c;
                x71Var.f51594j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x71Var.f51591i2.invalidate();
                if (!this.f11939b && x71Var.f51594j2 > 0.5f) {
                    this.f11939b = true;
                    return;
                }
                return;
        }
    }
}
