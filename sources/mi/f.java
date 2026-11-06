package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import v4.d1;
public final class f extends AnimatorListenerAdapter {
    public final int f20069a = 1;
    public final View f20070b;
    public final d1 f20071c;
    public final l d;

    public f(l lVar, d1 d1Var, View view) {
        this.d = lVar;
        this.f20071c = d1Var;
        this.f20070b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f20069a) {
            case 0:
                this.f20070b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20069a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f20070b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                l lVar = this.d;
                ArrayList arrayList = lVar.f56992y;
                d1 d1Var = this.f20071c;
                if (arrayList.remove(d1Var)) {
                    lVar.u(d1Var);
                    lVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f20070b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                l lVar2 = this.d;
                ArrayList arrayList2 = lVar2.A;
                d1 d1Var2 = this.f20071c;
                if (arrayList2.remove(d1Var2)) {
                    lVar2.d(d1Var2);
                    lVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f20069a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(l lVar, View view, d1 d1Var) {
        this.d = lVar;
        this.f20070b = view;
        this.f20071c = d1Var;
    }
}
