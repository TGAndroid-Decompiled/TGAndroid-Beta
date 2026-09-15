package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.u1;
public final class c extends AnimatorListenerAdapter {
    public final int f13976a;
    public final float f13977b;
    public final float f13978c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f13976a = i10;
        this.d = obj;
        this.f13977b = f7;
        this.f13978c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f13983g) {
            eVar.d(this.f13977b + this.f13978c, 1.0f);
            if (eVar.f13983g) {
                eVar.f13983g = false;
            }
            eVar.f13980b.C(eVar.e, eVar.f13979a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f13976a) {
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
        switch (this.f13976a) {
            case 0:
                a();
                return;
            default:
                u1 u1Var = (u1) this.d;
                u1Var.O = false;
                u1Var.M = true;
                u1Var.W = this.f13977b;
                u1Var.f29279a0 = this.f13978c;
                u1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f13976a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
