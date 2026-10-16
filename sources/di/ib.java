package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ib extends AnimatorListenerAdapter {
    public final int f7089a;
    public final kc f7090b;

    public ib(kc kcVar, int i10) {
        this.f7089a = i10;
        this.f7090b = kcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7089a) {
            case 0:
                kc kcVar = this.f7090b;
                kcVar.f7269j2 = null;
                kcVar.f7290r.setTranslationY(0.0f);
                kcVar.f7290r.b(0.0f);
                return;
            case 1:
                kc kcVar2 = this.f7090b;
                kcVar2.f7277n.removeView(kcVar2.M0);
                kcVar2.M0 = null;
                kcVar2.f7280n2 = null;
                kcVar2.f7286p2 = null;
                h4 h4Var = kcVar2.f7246c1.L;
                boolean z10 = true;
                if (kcVar2.f7255f0 == 1) {
                    z10 = false;
                }
                h4Var.b(z10);
                return;
            default:
                kc kcVar3 = this.f7090b;
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
