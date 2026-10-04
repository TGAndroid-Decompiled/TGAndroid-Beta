package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ib extends AnimatorListenerAdapter {
    public final int f5181a;
    public final kc f5182b;

    public ib(kc kcVar, int i10) {
        this.f5181a = i10;
        this.f5182b = kcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5181a) {
            case 0:
                kc kcVar = this.f5182b;
                kcVar.f5407j2 = null;
                kcVar.f5428r.setTranslationY(0.0f);
                kcVar.f5428r.b(0.0f);
                return;
            case 1:
                kc kcVar2 = this.f5182b;
                kcVar2.f5415n.removeView(kcVar2.M0);
                kcVar2.M0 = null;
                kcVar2.f5418n2 = null;
                kcVar2.f5424p2 = null;
                i4 i4Var = kcVar2.f5383c1.L;
                boolean z10 = true;
                if (kcVar2.f5393f0 == 1) {
                    z10 = false;
                }
                i4Var.b(z10);
                return;
            default:
                kc kcVar3 = this.f5182b;
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
