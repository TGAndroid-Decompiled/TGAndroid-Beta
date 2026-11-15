package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class s9 extends AnimatorListenerAdapter {
    public final int f15033a;
    public final sa f15034b;

    public s9(sa saVar, int i7) {
        this.f15033a = i7;
        this.f15034b = saVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15033a) {
            case 0:
                sa saVar = this.f15034b;
                saVar.f15071k2 = null;
                saVar.f15088r.setTranslationY(0.0f);
                saVar.f15088r.b(0.0f);
                return;
            case 1:
                sa saVar2 = this.f15034b;
                saVar2.f15076n.removeView(saVar2.N0);
                saVar2.N0 = null;
                saVar2.f15081o2 = null;
                saVar2.f15087q2 = null;
                p3 p3Var = saVar2.f15048d1.M;
                boolean z10 = true;
                if (saVar2.f15057g0 == 1) {
                    z10 = false;
                }
                p3Var.b(z10);
                return;
            default:
                sa saVar3 = this.f15034b;
                aa aaVar = saVar3.D2;
                if (aaVar != null) {
                    if (aaVar.getParent() != null) {
                        ((ViewGroup) saVar3.D2.getParent()).removeView(saVar3.D2);
                    }
                    saVar3.D2 = null;
                }
                saVar3.F2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
