package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import s4.e1;
public final class f extends AnimatorListenerAdapter {
    public final int f18518a = 1;
    public final View f18519b;
    public final e1 f18520c;
    public final m d;

    public f(m mVar, e1 e1Var, View view) {
        this.d = mVar;
        this.f18520c = e1Var;
        this.f18519b = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f18518a) {
            case 0:
                this.f18519b.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18518a) {
            case 0:
                animator.removeAllListeners();
                View view = this.f18519b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                m mVar = this.d;
                ArrayList arrayList = mVar.f47793y;
                e1 e1Var = this.f18520c;
                if (arrayList.remove(e1Var)) {
                    mVar.u(e1Var);
                    mVar.G();
                    return;
                }
                return;
            default:
                animator.removeAllListeners();
                View view2 = this.f18519b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                m mVar2 = this.d;
                ArrayList arrayList2 = mVar2.A;
                e1 e1Var2 = this.f18520c;
                if (arrayList2.remove(e1Var2)) {
                    mVar2.d(e1Var2);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f18518a) {
            case 0:
                this.d.getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f(m mVar, View view, e1 e1Var) {
        this.d = mVar;
        this.f18519b = view;
        this.f18520c = e1Var;
    }
}
