package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class c extends AnimatorListenerAdapter {
    public final int f15436a;
    public final float f15437b;
    public final float f15438c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f15436a = i10;
        this.d = obj;
        this.f15437b = f7;
        this.f15438c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f15444g) {
            eVar.d(this.f15437b + this.f15438c, 1.0f);
            if (eVar.f15444g) {
                eVar.f15444g = false;
            }
            eVar.f15440b.V(eVar.f15442e, eVar.f15439a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15436a) {
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
        switch (this.f15436a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f15437b;
                v1Var.f32220a0 = this.f15438c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15436a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
