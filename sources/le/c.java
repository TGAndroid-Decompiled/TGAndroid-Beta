package le;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.voip.s1;
public final class c extends AnimatorListenerAdapter {
    public final int f15397a;
    public final float f15398b;
    public final float f15399c;
    public final Object d;

    public c(Object obj, float f7, float f10, int i10) {
        this.f15397a = i10;
        this.d = obj;
        this.f15398b = f7;
        this.f15399c = f10;
    }

    public void a() {
        e eVar = (e) this.d;
        if (eVar.f15405g) {
            eVar.d(this.f15398b + this.f15399c, 1.0f);
            if (eVar.f15405g) {
                eVar.f15405g = false;
            }
            eVar.f15401b.z(eVar.f15403e, eVar.f15400a);
        }
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15397a) {
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
        switch (this.f15397a) {
            case 0:
                a();
                return;
            default:
                s1 s1Var = (s1) this.d;
                s1Var.O = false;
                s1Var.M = true;
                s1Var.W = this.f15398b;
                s1Var.f31809a0 = this.f15399c;
                s1Var.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15397a) {
            case 0:
                ((e) this.d).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
