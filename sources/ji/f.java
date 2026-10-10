package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import s4.d1;
public final class f extends AnimatorListenerAdapter {
    public final int f14230a = 1;
    public final View f14231b;
    public final d1 f14232c;
    public final n d;

    public f(n nVar, d1 d1Var, View view) {
        this.d = nVar;
        this.f14232c = d1Var;
        this.f14231b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f14230a) {
            case 0:
                this.f14231b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14230a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f14231b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                n nVar = this.d;
                ArrayList arrayList = nVar.f47771y;
                d1 d1Var = this.f14232c;
                if (arrayList.remove(d1Var)) {
                    nVar.u(d1Var);
                    nVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f14231b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                n nVar2 = this.d;
                ArrayList arrayList2 = nVar2.A;
                d1 d1Var2 = this.f14232c;
                if (arrayList2.remove(d1Var2)) {
                    nVar2.d(d1Var2);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f14230a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(n nVar, View view, d1 d1Var) {
        this.d = nVar;
        this.f14231b = view;
        this.f14232c = d1Var;
    }
}
