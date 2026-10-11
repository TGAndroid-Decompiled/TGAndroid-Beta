package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class c extends AnimatorListenerAdapter {
    public final int f16367a;
    public final float f16368b;
    public final float f16369c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f16367a = i10;
        this.d = obj;
        this.f16368b = f7;
        this.f16369c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f16375g) {
            eVar.d(this.f16368b + this.f16369c, 1.0f);
            if (eVar.f16375g) {
                eVar.f16375g = false;
            }
            eVar.f16371b.A(eVar.f16373e, eVar.f16370a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16367a) {
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
        switch (this.f16367a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f16368b;
                v1Var.f32350a0 = this.f16369c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16367a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
