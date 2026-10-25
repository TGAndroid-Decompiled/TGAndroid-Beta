package oe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class c extends AnimatorListenerAdapter {
    public final int f19328a;
    public final float f19329b;
    public final float f19330c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f19328a = i10;
        this.d = obj;
        this.f19329b = f7;
        this.f19330c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.h) {
            eVar.d(this.f19329b + this.f19330c, 1.0f);
            if (eVar.h) {
                eVar.h = false;
            }
            eVar.f19332b.z(eVar.f19334f, eVar.f19331a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f19328a) {
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
        switch (this.f19328a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f19329b;
                v1Var.f34148a0 = this.f19330c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f19328a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
