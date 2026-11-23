package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class s9 extends AnimatorListenerAdapter {
    public final int f15382a;
    public final sa f15383b;

    public s9(sa saVar, int i7) {
        this.f15382a = i7;
        this.f15383b = saVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15382a) {
            case 0:
                sa saVar = this.f15383b;
                saVar.f15420k2 = null;
                saVar.f15437r.setTranslationY(0.0f);
                saVar.f15437r.b(0.0f);
                return;
            case 1:
                sa saVar2 = this.f15383b;
                saVar2.f15425n.removeView(saVar2.N0);
                saVar2.N0 = null;
                saVar2.f15430o2 = null;
                saVar2.f15436q2 = null;
                o3 o3Var = saVar2.f15397d1.M;
                boolean z10 = true;
                if (saVar2.f15406g0 == 1) {
                    z10 = false;
                }
                o3Var.b(z10);
                return;
            default:
                sa saVar3 = this.f15383b;
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
