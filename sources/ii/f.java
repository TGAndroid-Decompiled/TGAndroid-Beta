package ii;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import s4.c1;
public final class f extends AnimatorListenerAdapter {
    public final int f10653a = 1;
    public final View f10654b;
    public final c1 f10655c;
    public final n d;

    public f(n nVar, c1 c1Var, View view) {
        this.d = nVar;
        this.f10655c = c1Var;
        this.f10654b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f10653a) {
            case 0:
                this.f10654b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10653a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f10654b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                n nVar = this.d;
                ArrayList arrayList = nVar.f41676y;
                c1 c1Var = this.f10655c;
                if (arrayList.remove(c1Var)) {
                    nVar.u(c1Var);
                    nVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f10654b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                n nVar2 = this.d;
                ArrayList arrayList2 = nVar2.A;
                c1 c1Var2 = this.f10655c;
                if (arrayList2.remove(c1Var2)) {
                    nVar2.d(c1Var2);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f10653a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(n nVar, View view, c1 c1Var) {
        this.d = nVar;
        this.f10654b = view;
        this.f10655c = c1Var;
    }
}
