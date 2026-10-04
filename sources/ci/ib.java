package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ib extends AnimatorListenerAdapter {
    public final int f5180a;
    public final kc f5181b;

    public ib(kc kcVar, int i10) {
        this.f5180a = i10;
        this.f5181b = kcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5180a) {
            case 0:
                kc kcVar = this.f5181b;
                kcVar.f5406j2 = null;
                kcVar.f5427r.setTranslationY(0.0f);
                kcVar.f5427r.b(0.0f);
                return;
            case 1:
                kc kcVar2 = this.f5181b;
                kcVar2.f5414n.removeView(kcVar2.M0);
                kcVar2.M0 = null;
                kcVar2.f5417n2 = null;
                kcVar2.f5423p2 = null;
                i4 i4Var = kcVar2.f5382c1.L;
                boolean z10 = true;
                if (kcVar2.f5392f0 == 1) {
                    z10 = false;
                }
                i4Var.b(z10);
                return;
            default:
                kc kcVar3 = this.f5181b;
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
