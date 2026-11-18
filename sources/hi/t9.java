package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class t9 extends AnimatorListenerAdapter {
    public final int f15418a;
    public final ta f15419b;

    public t9(ta taVar, int i7) {
        this.f15418a = i7;
        this.f15419b = taVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15418a) {
            case 0:
                ta taVar = this.f15419b;
                taVar.f15456k2 = null;
                taVar.f15473r.setTranslationY(0.0f);
                taVar.f15473r.b(0.0f);
                return;
            case 1:
                ta taVar2 = this.f15419b;
                taVar2.f15461n.removeView(taVar2.N0);
                taVar2.N0 = null;
                taVar2.f15466o2 = null;
                taVar2.f15472q2 = null;
                p3 p3Var = taVar2.f15433d1.M;
                boolean z10 = true;
                if (taVar2.f15442g0 == 1) {
                    z10 = false;
                }
                p3Var.b(z10);
                return;
            default:
                ta taVar3 = this.f15419b;
                ba baVar = taVar3.D2;
                if (baVar != null) {
                    if (baVar.getParent() != null) {
                        ((ViewGroup) taVar3.D2.getParent()).removeView(taVar3.D2);
                    }
                    taVar3.D2 = null;
                }
                taVar3.F2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
