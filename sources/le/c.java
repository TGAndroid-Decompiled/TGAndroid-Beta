package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.u1;
public final class c extends AnimatorListenerAdapter {
    public final int f14171a;
    public final float f14172b;
    public final float f14173c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f14171a = i10;
        this.d = obj;
        this.f14172b = f7;
        this.f14173c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f14178g) {
            eVar.d(this.f14172b + this.f14173c, 1.0f);
            if (eVar.f14178g) {
                eVar.f14178g = false;
            }
            eVar.f14175b.C(eVar.e, eVar.f14174a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14171a) {
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
        switch (this.f14171a) {
            case 0:
                a();
                return;
            default:
                u1 u1Var = (u1) this.d;
                u1Var.O = false;
                u1Var.M = true;
                u1Var.W = this.f14172b;
                u1Var.f29682a0 = this.f14173c;
                u1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14171a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
