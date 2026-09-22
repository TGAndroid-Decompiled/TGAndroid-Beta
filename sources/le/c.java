package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.u1;
public final class c extends AnimatorListenerAdapter {
    public final int f14186a;
    public final float f14187b;
    public final float f14188c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f14186a = i10;
        this.d = obj;
        this.f14187b = f7;
        this.f14188c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f14193g) {
            eVar.d(this.f14187b + this.f14188c, 1.0f);
            if (eVar.f14193g) {
                eVar.f14193g = false;
            }
            eVar.f14190b.C(eVar.e, eVar.f14189a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14186a) {
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
        switch (this.f14186a) {
            case 0:
                a();
                return;
            default:
                u1 u1Var = (u1) this.d;
                u1Var.O = false;
                u1Var.M = true;
                u1Var.W = this.f14187b;
                u1Var.f29644a0 = this.f14188c;
                u1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14186a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
