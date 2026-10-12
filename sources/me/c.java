package me;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class c extends AnimatorListenerAdapter {
    public final int f16089a;
    public final float f16090b;
    public final float f16091c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f16089a = i10;
        this.d = obj;
        this.f16090b = f7;
        this.f16091c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f16097g) {
            eVar.d(this.f16090b + this.f16091c, 1.0f);
            if (eVar.f16097g) {
                eVar.f16097g = false;
            }
            eVar.f16093b.C(eVar.f16095e, eVar.f16092a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f16089a) {
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
        switch (this.f16089a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f16090b;
                v1Var.f32050a0 = this.f16091c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f16089a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
