package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.u1;
public final class d extends AnimatorListenerAdapter {
    public final int f13964a;
    public final float f13965b;
    public final float f13966c;
    public final Object d;

    public d(Object obj, float f7, float f10, int i10) {
        this.f13964a = i10;
        this.d = obj;
        this.f13965b = f7;
        this.f13966c = f10;
    }

    public void a() {
        f fVar = (f) this.d;
        if (fVar.f13971g) {
            fVar.d(this.f13965b + this.f13966c, 1.0f);
            if (fVar.f13971g) {
                fVar.f13971g = false;
            }
            fVar.f13968b.C(fVar.e, fVar.f13967a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f13964a) {
            case 0:
                a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13964a) {
            case 0:
                a();
                return;
            default:
                u1 u1Var = (u1) this.d;
                u1Var.O = false;
                u1Var.M = true;
                u1Var.W = this.f13965b;
                u1Var.f29250a0 = this.f13966c;
                u1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f13964a) {
            case 0:
                ((f) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
