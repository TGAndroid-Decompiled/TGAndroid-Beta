package ne;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.s1;
public final class c extends AnimatorListenerAdapter {
    public final int f17385a;
    public final float f17386b;
    public final float f17387c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f17385a = i10;
        this.d = obj;
        this.f17386b = f7;
        this.f17387c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f17392g) {
            eVar.d(this.f17386b + this.f17387c, 1.0f);
            if (eVar.f17392g) {
                eVar.f17392g = false;
            }
            eVar.f17389b.H(eVar.e, eVar.f17388a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17385a) {
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
        switch (this.f17385a) {
            case 0:
                a();
                return;
            default:
                s1 s1Var = (s1) this.d;
                s1Var.O = false;
                s1Var.M = true;
                s1Var.W = this.f17386b;
                s1Var.f31735a0 = this.f17387c;
                s1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17385a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
