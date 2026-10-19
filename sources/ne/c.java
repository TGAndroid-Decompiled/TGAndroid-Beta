package ne;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.s1;
public final class c extends AnimatorListenerAdapter {
    public final int f17387a;
    public final float f17388b;
    public final float f17389c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f17387a = i10;
        this.d = obj;
        this.f17388b = f7;
        this.f17389c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f17394g) {
            eVar.d(this.f17388b + this.f17389c, 1.0f);
            if (eVar.f17394g) {
                eVar.f17394g = false;
            }
            eVar.f17391b.H(eVar.e, eVar.f17390a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17387a) {
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
        switch (this.f17387a) {
            case 0:
                a();
                return;
            default:
                s1 s1Var = (s1) this.d;
                s1Var.O = false;
                s1Var.M = true;
                s1Var.W = this.f17388b;
                s1Var.f31737a0 = this.f17389c;
                s1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17387a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
