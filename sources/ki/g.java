package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import s4.b1;
public final class g extends AnimatorListenerAdapter {
    public final int f14316a = 1;
    public final View f14317b;
    public final b1 f14318c;
    public final n d;

    public g(n nVar, b1 b1Var, View view) {
        this.d = nVar;
        this.f14318c = b1Var;
        this.f14317b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14316a) {
            case 0:
                this.f14317b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14316a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f14317b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                n nVar = this.d;
                ArrayList arrayList = nVar.f44910y;
                b1 b1Var = this.f14318c;
                if (arrayList.remove(b1Var)) {
                    nVar.u(b1Var);
                    nVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f14317b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                n nVar2 = this.d;
                ArrayList arrayList2 = nVar2.A;
                b1 b1Var2 = this.f14318c;
                if (arrayList2.remove(b1Var2)) {
                    nVar2.d(b1Var2);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14316a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public g(n nVar, View view, b1 b1Var) {
        this.d = nVar;
        this.f14317b = view;
        this.f14318c = b1Var;
    }
}
