package ne;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.s1;
public final class c extends AnimatorListenerAdapter {
    public final int f16005a;
    public final float f16006b;
    public final float f16007c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f16005a = i10;
        this.d = obj;
        this.f16006b = f7;
        this.f16007c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f16012g) {
            eVar.d(this.f16006b + this.f16007c, 1.0f);
            if (eVar.f16012g) {
                eVar.f16012g = false;
            }
            eVar.f16009b.A(eVar.e, eVar.f16008a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16005a) {
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
        switch (this.f16005a) {
            case 0:
                a();
                return;
            default:
                s1 s1Var = (s1) this.d;
                s1Var.O = false;
                s1Var.M = true;
                s1Var.W = this.f16006b;
                s1Var.f30119a0 = this.f16007c;
                s1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16005a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
