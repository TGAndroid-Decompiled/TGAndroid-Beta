package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.u1;
public final class c extends AnimatorListenerAdapter {
    public final int f14132a;
    public final float f14133b;
    public final float f14134c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f14132a = i10;
        this.d = obj;
        this.f14133b = f7;
        this.f14134c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f14139g) {
            eVar.d(this.f14133b + this.f14134c, 1.0f);
            if (eVar.f14139g) {
                eVar.f14139g = false;
            }
            eVar.f14136b.C(eVar.e, eVar.f14135a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14132a) {
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
        switch (this.f14132a) {
            case 0:
                a();
                return;
            default:
                u1 u1Var = (u1) this.d;
                u1Var.O = false;
                u1Var.M = true;
                u1Var.W = this.f14133b;
                u1Var.f29575a0 = this.f14134c;
                u1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14132a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
