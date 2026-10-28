package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class pa extends AnimatorListenerAdapter {
    public final int f11449a;
    public final sb f11450b;

    public pa(sb sbVar, int i10) {
        this.f11449a = i10;
        this.f11450b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11449a) {
            case 0:
                sb sbVar = this.f11450b;
                sbVar.f11636j2 = null;
                sbVar.f11657r.setTranslationY(0.0f);
                sbVar.f11657r.b(0.0f);
                return;
            case 1:
                sb sbVar2 = this.f11450b;
                sbVar2.f11644n.removeView(sbVar2.M0);
                sbVar2.M0 = null;
                sbVar2.f11647n2 = null;
                sbVar2.f11653p2 = null;
                z3 z3Var = sbVar2.f11613c1.L;
                boolean z10 = true;
                if (sbVar2.f11622f0 == 1) {
                    z10 = false;
                }
                z3Var.b(z10);
                return;
            default:
                sb sbVar3 = this.f11450b;
                ab abVar = sbVar3.C2;
                if (abVar != null) {
                    if (abVar.getParent() != null) {
                        ((ViewGroup) sbVar3.C2.getParent()).removeView(sbVar3.C2);
                    }
                    sbVar3.C2 = null;
                }
                sbVar3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
