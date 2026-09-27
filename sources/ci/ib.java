package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ib extends AnimatorListenerAdapter {
    public final int f4796a;
    public final kc f4797b;

    public ib(kc kcVar, int i10) {
        this.f4796a = i10;
        this.f4797b = kcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4796a) {
            case 0:
                kc kcVar = this.f4797b;
                kcVar.f5014j2 = null;
                kcVar.f5035r.setTranslationY(0.0f);
                kcVar.f5035r.b(0.0f);
                return;
            case 1:
                kc kcVar2 = this.f4797b;
                kcVar2.f5022n.removeView(kcVar2.M0);
                kcVar2.M0 = null;
                kcVar2.f5025n2 = null;
                kcVar2.f5031p2 = null;
                i4 i4Var = kcVar2.f4991c1.L;
                boolean z10 = true;
                if (kcVar2.f5000f0 == 1) {
                    z10 = false;
                }
                i4Var.b(z10);
                return;
            default:
                kc kcVar3 = this.f4797b;
                sb sbVar = kcVar3.C2;
                if (sbVar != null) {
                    if (sbVar.getParent() != null) {
                        ((ViewGroup) kcVar3.C2.getParent()).removeView(kcVar3.C2);
                    }
                    kcVar3.C2 = null;
                }
                kcVar3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
