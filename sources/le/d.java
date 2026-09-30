package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class d extends AnimatorListenerAdapter {
    public final int f14218a;
    public final float f14219b;
    public final float f14220c;
    public final Object d;

    public d(Object obj, float f7, float f10, int i10) {
        this.f14218a = i10;
        this.d = obj;
        this.f14219b = f7;
        this.f14220c = f10;
    }

    public void a() {
        f fVar = (f) this.d;
        if (fVar.f14225g) {
            fVar.d(this.f14219b + this.f14220c, 1.0f);
            if (fVar.f14225g) {
                fVar.f14225g = false;
            }
            fVar.f14222b.C(fVar.e, fVar.f14221a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14218a) {
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
        switch (this.f14218a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f14219b;
                v1Var.f29608a0 = this.f14220c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14218a) {
            case 0:
                ((f) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
