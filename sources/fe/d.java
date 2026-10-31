package fe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.b1;
public final class d extends AnimatorListenerAdapter {
    public final int f7025a;
    public final float f7026b;
    public final float f7027c;
    public final Object d;

    public d(Object obj, float f7, float f10, int i10) {
        this.f7025a = i10;
        this.d = obj;
        this.f7026b = f7;
        this.f7027c = f10;
    }

    public void a() {
        f fVar = (f) this.d;
        if (fVar.h) {
            fVar.d(this.f7026b + this.f7027c, 1.0f);
            if (fVar.h) {
                fVar.h = false;
            }
            fVar.f7029b.E(fVar.f7031f, fVar.f7028a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f7025a) {
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
        switch (this.f7025a) {
            case 0:
                a();
                return;
            default:
                b1 b1Var = (b1) this.d;
                b1Var.O = false;
                b1Var.M = true;
                b1Var.W = this.f7026b;
                b1Var.f31323a0 = this.f7027c;
                b1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f7025a) {
            case 0:
                ((f) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
