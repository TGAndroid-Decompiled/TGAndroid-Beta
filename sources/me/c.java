package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class c extends AnimatorListenerAdapter {
    public final int f16090a;
    public final float f16091b;
    public final float f16092c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f16090a = i10;
        this.d = obj;
        this.f16091b = f7;
        this.f16092c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f16098g) {
            eVar.d(this.f16091b + this.f16092c, 1.0f);
            if (eVar.f16098g) {
                eVar.f16098g = false;
            }
            eVar.f16094b.C(eVar.f16096e, eVar.f16093a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16090a) {
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
        switch (this.f16090a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f16091b;
                v1Var.f32036a0 = this.f16092c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16090a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
