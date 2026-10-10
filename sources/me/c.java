package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.u1;
public final class c extends AnimatorListenerAdapter {
    public final int f16343a;
    public final float f16344b;
    public final float f16345c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f16343a = i10;
        this.d = obj;
        this.f16344b = f7;
        this.f16345c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f16351g) {
            eVar.d(this.f16344b + this.f16345c, 1.0f);
            if (eVar.f16351g) {
                eVar.f16351g = false;
            }
            eVar.f16347b.A(eVar.f16349e, eVar.f16346a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16343a) {
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
        switch (this.f16343a) {
            case 0:
                a();
                return;
            default:
                u1 u1Var = (u1) this.d;
                u1Var.O = false;
                u1Var.M = true;
                u1Var.W = this.f16344b;
                u1Var.f32356a0 = this.f16345c;
                u1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16343a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
