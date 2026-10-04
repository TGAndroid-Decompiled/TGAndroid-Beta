package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class c extends AnimatorListenerAdapter {
    public final int f15437a;
    public final float f15438b;
    public final float f15439c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f15437a = i10;
        this.d = obj;
        this.f15438b = f7;
        this.f15439c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f15445g) {
            eVar.d(this.f15438b + this.f15439c, 1.0f);
            if (eVar.f15445g) {
                eVar.f15445g = false;
            }
            eVar.f15441b.V(eVar.f15443e, eVar.f15440a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15437a) {
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
        switch (this.f15437a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f15438b;
                v1Var.f32221a0 = this.f15439c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15437a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
