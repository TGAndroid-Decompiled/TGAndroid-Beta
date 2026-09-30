package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class d extends AnimatorListenerAdapter {
    public final int f14203a;
    public final float f14204b;
    public final float f14205c;
    public final Object d;

    public d(Object obj, float f7, float f10, int i10) {
        this.f14203a = i10;
        this.d = obj;
        this.f14204b = f7;
        this.f14205c = f10;
    }

    public void a() {
        f fVar = (f) this.d;
        if (fVar.f14210g) {
            fVar.d(this.f14204b + this.f14205c, 1.0f);
            if (fVar.f14210g) {
                fVar.f14210g = false;
            }
            fVar.f14207b.C(fVar.e, fVar.f14206a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14203a) {
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
        switch (this.f14203a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f14204b;
                v1Var.f29602a0 = this.f14205c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14203a) {
            case 0:
                ((f) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
