package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class jb extends AnimatorListenerAdapter {
    public final int f5292a;
    public final lc f5293b;

    public jb(lc lcVar, int i10) {
        this.f5292a = i10;
        this.f5293b = lcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5292a) {
            case 0:
                lc lcVar = this.f5293b;
                lcVar.f5490j2 = null;
                lcVar.f5511r.setTranslationY(0.0f);
                lcVar.f5511r.b(0.0f);
                return;
            case 1:
                lc lcVar2 = this.f5293b;
                lcVar2.f5498n.removeView(lcVar2.M0);
                lcVar2.M0 = null;
                lcVar2.f5501n2 = null;
                lcVar2.f5507p2 = null;
                h4 h4Var = lcVar2.f5466c1.L;
                boolean z10 = true;
                if (lcVar2.f5476f0 == 1) {
                    z10 = false;
                }
                h4Var.b(z10);
                return;
            default:
                lc lcVar3 = this.f5293b;
                tb tbVar = lcVar3.C2;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) lcVar3.C2.getParent()).removeView(lcVar3.C2);
                    }
                    lcVar3.C2 = null;
                }
                lcVar3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
