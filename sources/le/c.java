package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.s1;
public final class c extends AnimatorListenerAdapter {
    public final int f15370a;
    public final float f15371b;
    public final float f15372c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f15370a = i10;
        this.d = obj;
        this.f15371b = f7;
        this.f15372c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f15378g) {
            eVar.d(this.f15371b + this.f15372c, 1.0f);
            if (eVar.f15378g) {
                eVar.f15378g = false;
            }
            eVar.f15374b.z(eVar.f15376e, eVar.f15373a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15370a) {
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
        switch (this.f15370a) {
            case 0:
                a();
                return;
            default:
                s1 s1Var = (s1) this.d;
                s1Var.O = false;
                s1Var.M = true;
                s1Var.W = this.f15371b;
                s1Var.f31782a0 = this.f15372c;
                s1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15370a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
