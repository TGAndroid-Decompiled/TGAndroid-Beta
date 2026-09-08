package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import s4.c1;
public final class g extends AnimatorListenerAdapter {
    public final int f15025a = 1;
    public final View f15026b;
    public final c1 f15027c;
    public final o d;

    public g(o oVar, c1 c1Var, View view) {
        this.d = oVar;
        this.f15027c = c1Var;
        this.f15026b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f15025a) {
            case 0:
                this.f15026b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15025a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f15026b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                o oVar = this.d;
                ArrayList arrayList = oVar.f45840y;
                c1 c1Var = this.f15027c;
                if (arrayList.remove(c1Var)) {
                    oVar.u(c1Var);
                    oVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f15026b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                o oVar2 = this.d;
                ArrayList arrayList2 = oVar2.A;
                c1 c1Var2 = this.f15027c;
                if (arrayList2.remove(c1Var2)) {
                    oVar2.d(c1Var2);
                    oVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f15025a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public g(o oVar, View view, c1 c1Var) {
        this.d = oVar;
        this.f15026b = view;
        this.f15027c = c1Var;
    }
}
