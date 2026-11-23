package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class t9 extends AnimatorListenerAdapter {
    public final int f15385a;
    public final ta f15386b;

    public t9(ta taVar, int i7) {
        this.f15385a = i7;
        this.f15386b = taVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15385a) {
            case 0:
                ta taVar = this.f15386b;
                taVar.f15423k2 = null;
                taVar.f15440r.setTranslationY(0.0f);
                taVar.f15440r.b(0.0f);
                return;
            case 1:
                ta taVar2 = this.f15386b;
                taVar2.f15428n.removeView(taVar2.N0);
                taVar2.N0 = null;
                taVar2.f15433o2 = null;
                taVar2.f15439q2 = null;
                o3 o3Var = taVar2.f15400d1.M;
                boolean z10 = true;
                if (taVar2.f15409g0 == 1) {
                    z10 = false;
                }
                o3Var.b(z10);
                return;
            default:
                ta taVar3 = this.f15386b;
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
