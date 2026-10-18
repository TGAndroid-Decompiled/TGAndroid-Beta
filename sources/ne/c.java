package ne;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.s1;
public final class c extends AnimatorListenerAdapter {
    public final int f17388a;
    public final float f17389b;
    public final float f17390c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f17388a = i10;
        this.d = obj;
        this.f17389b = f7;
        this.f17390c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f17395g) {
            eVar.d(this.f17389b + this.f17390c, 1.0f);
            if (eVar.f17395g) {
                eVar.f17395g = false;
            }
            eVar.f17392b.E(eVar.e, eVar.f17391a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17388a) {
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
        switch (this.f17388a) {
            case 0:
                a();
                return;
            default:
                s1 s1Var = (s1) this.d;
                s1Var.O = false;
                s1Var.M = true;
                s1Var.W = this.f17389b;
                s1Var.f31733a0 = this.f17390c;
                s1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17388a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
