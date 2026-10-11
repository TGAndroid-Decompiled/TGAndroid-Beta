package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class c extends AnimatorListenerAdapter {
    public final int f16403a;
    public final float f16404b;
    public final float f16405c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f16403a = i10;
        this.d = obj;
        this.f16404b = f7;
        this.f16405c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f16411g) {
            eVar.d(this.f16404b + this.f16405c, 1.0f);
            if (eVar.f16411g) {
                eVar.f16411g = false;
            }
            eVar.f16407b.A(eVar.f16409e, eVar.f16406a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16403a) {
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
        switch (this.f16403a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f16404b;
                v1Var.f32414a0 = this.f16405c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16403a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
