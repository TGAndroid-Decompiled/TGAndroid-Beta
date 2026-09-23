package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class jb extends AnimatorListenerAdapter {
    public final int f4869a;
    public final lc f4870b;

    public jb(lc lcVar, int i10) {
        this.f4869a = i10;
        this.f4870b = lcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4869a) {
            case 0:
                lc lcVar = this.f4870b;
                lcVar.f5058j2 = null;
                lcVar.f5079r.setTranslationY(0.0f);
                lcVar.f5079r.b(0.0f);
                return;
            case 1:
                lc lcVar2 = this.f4870b;
                lcVar2.f5066n.removeView(lcVar2.M0);
                lcVar2.M0 = null;
                lcVar2.f5069n2 = null;
                lcVar2.f5075p2 = null;
                i4 i4Var = lcVar2.f5035c1.L;
                boolean z10 = true;
                if (lcVar2.f5044f0 == 1) {
                    z10 = false;
                }
                i4Var.b(z10);
                return;
            default:
                lc lcVar3 = this.f4870b;
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
