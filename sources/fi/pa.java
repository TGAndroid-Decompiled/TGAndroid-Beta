package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class pa extends AnimatorListenerAdapter {
    public final int f11450a;
    public final sb f11451b;

    public pa(sb sbVar, int i10) {
        this.f11450a = i10;
        this.f11451b = sbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11450a) {
            case 0:
                sb sbVar = this.f11451b;
                sbVar.f11637j2 = null;
                sbVar.f11658r.setTranslationY(0.0f);
                sbVar.f11658r.b(0.0f);
                return;
            case 1:
                sb sbVar2 = this.f11451b;
                sbVar2.f11645n.removeView(sbVar2.M0);
                sbVar2.M0 = null;
                sbVar2.f11648n2 = null;
                sbVar2.f11654p2 = null;
                z3 z3Var = sbVar2.f11614c1.L;
                boolean z10 = true;
                if (sbVar2.f11623f0 == 1) {
                    z10 = false;
                }
                z3Var.b(z10);
                return;
            default:
                sb sbVar3 = this.f11451b;
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
