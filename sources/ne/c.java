package ne;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.s1;
public final class c extends AnimatorListenerAdapter {
    public final int f16294a;
    public final float f16295b;
    public final float f16296c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f16294a = i10;
        this.d = obj;
        this.f16295b = f7;
        this.f16296c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f16301g) {
            eVar.d(this.f16295b + this.f16296c, 1.0f);
            if (eVar.f16301g) {
                eVar.f16301g = false;
            }
            eVar.f16298b.C(eVar.e, eVar.f16297a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16294a) {
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
        switch (this.f16294a) {
            case 0:
                a();
                return;
            default:
                s1 s1Var = (s1) this.d;
                s1Var.O = false;
                s1Var.M = true;
                s1Var.W = this.f16295b;
                s1Var.f30450a0 = this.f16296c;
                s1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16294a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
