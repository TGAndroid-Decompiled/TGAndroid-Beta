package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.t1;
public final class c extends AnimatorListenerAdapter {
    public final int f12871a;
    public final float f12872b;
    public final float f12873c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f12871a = i10;
        this.d = obj;
        this.f12872b = f7;
        this.f12873c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f12878g) {
            eVar.d(this.f12872b + this.f12873c, 1.0f);
            if (eVar.f12878g) {
                eVar.f12878g = false;
            }
            eVar.f12875b.B(eVar.e, eVar.f12874a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f12871a) {
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
        switch (this.f12871a) {
            case 0:
                a();
                return;
            default:
                t1 t1Var = (t1) this.d;
                t1Var.O = false;
                t1Var.M = true;
                t1Var.W = this.f12872b;
                t1Var.f28448a0 = this.f12873c;
                t1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f12871a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
