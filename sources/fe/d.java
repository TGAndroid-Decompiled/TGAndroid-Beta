package fe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.c1;
public final class d extends AnimatorListenerAdapter {
    public final int f7026a;
    public final float f7027b;
    public final float f7028c;
    public final Object d;

    public d(Object obj, float f7, float f10, int i10) {
        this.f7026a = i10;
        this.d = obj;
        this.f7027b = f7;
        this.f7028c = f10;
    }

    public void a() {
        f fVar = (f) this.d;
        if (fVar.h) {
            fVar.d(this.f7027b + this.f7028c, 1.0f);
            if (fVar.h) {
                fVar.h = false;
            }
            fVar.f7030b.E(fVar.f7032f, fVar.f7029a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f7026a) {
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
        switch (this.f7026a) {
            case 0:
                a();
                return;
            default:
                c1 c1Var = (c1) this.d;
                c1Var.O = false;
                c1Var.M = true;
                c1Var.W = this.f7027b;
                c1Var.f31403a0 = this.f7028c;
                c1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f7026a) {
            case 0:
                ((f) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
