package ne;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.s1;
public final class c extends AnimatorListenerAdapter {
    public final int f17384a;
    public final float f17385b;
    public final float f17386c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f17384a = i10;
        this.d = obj;
        this.f17385b = f7;
        this.f17386c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f17391g) {
            eVar.d(this.f17385b + this.f17386c, 1.0f);
            if (eVar.f17391g) {
                eVar.f17391g = false;
            }
            eVar.f17388b.E(eVar.e, eVar.f17387a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f17384a) {
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
        switch (this.f17384a) {
            case 0:
                a();
                return;
            default:
                s1 s1Var = (s1) this.d;
                s1Var.O = false;
                s1Var.M = true;
                s1Var.W = this.f17385b;
                s1Var.f31726a0 = this.f17386c;
                s1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f17384a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
