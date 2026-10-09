package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.u1;
public final class c extends AnimatorListenerAdapter {
    public final int f16339a;
    public final float f16340b;
    public final float f16341c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f16339a = i10;
        this.d = obj;
        this.f16340b = f7;
        this.f16341c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f16347g) {
            eVar.d(this.f16340b + this.f16341c, 1.0f);
            if (eVar.f16347g) {
                eVar.f16347g = false;
            }
            eVar.f16343b.A(eVar.f16345e, eVar.f16342a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16339a) {
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
        switch (this.f16339a) {
            case 0:
                a();
                return;
            default:
                u1 u1Var = (u1) this.d;
                u1Var.O = false;
                u1Var.M = true;
                u1Var.W = this.f16340b;
                u1Var.f32291a0 = this.f16341c;
                u1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16339a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
