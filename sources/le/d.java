package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.v1;
public final class d extends AnimatorListenerAdapter {
    public final int f14204a;
    public final float f14205b;
    public final float f14206c;
    public final Object d;

    public d(Object obj, float f7, float f10, int i10) {
        this.f14204a = i10;
        this.d = obj;
        this.f14205b = f7;
        this.f14206c = f10;
    }

    public void a() {
        f fVar = (f) this.d;
        if (fVar.f14211g) {
            fVar.d(this.f14205b + this.f14206c, 1.0f);
            if (fVar.f14211g) {
                fVar.f14211g = false;
            }
            fVar.f14208b.C(fVar.e, fVar.f14207a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14204a) {
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
        switch (this.f14204a) {
            case 0:
                a();
                return;
            default:
                v1 v1Var = (v1) this.d;
                v1Var.O = false;
                v1Var.M = true;
                v1Var.W = this.f14205b;
                v1Var.f29633a0 = this.f14206c;
                v1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14204a) {
            case 0:
                ((f) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
