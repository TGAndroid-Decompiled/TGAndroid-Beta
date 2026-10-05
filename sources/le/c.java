package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class c extends AnimatorListenerAdapter {
    public final int f15438a;
    public final float f15439b;
    public final float f15440c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f15438a = i10;
        this.d = obj;
        this.f15439b = f7;
        this.f15440c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f15446g) {
            eVar.d(this.f15439b + this.f15440c, 1.0f);
            if (eVar.f15446g) {
                eVar.f15446g = false;
            }
            eVar.f15442b.V(eVar.f15444e, eVar.f15441a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15438a) {
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
        switch (this.f15438a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f15439b;
                v1Var.f32294a0 = this.f15440c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15438a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
