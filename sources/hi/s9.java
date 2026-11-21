package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class s9 extends AnimatorListenerAdapter {
    public final int f15379a;
    public final sa f15380b;

    public s9(sa saVar, int i7) {
        this.f15379a = i7;
        this.f15380b = saVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15379a) {
            case 0:
                sa saVar = this.f15380b;
                saVar.f15417k2 = null;
                saVar.f15434r.setTranslationY(0.0f);
                saVar.f15434r.b(0.0f);
                return;
            case 1:
                sa saVar2 = this.f15380b;
                saVar2.f15422n.removeView(saVar2.N0);
                saVar2.N0 = null;
                saVar2.f15427o2 = null;
                saVar2.f15433q2 = null;
                o3 o3Var = saVar2.f15394d1.M;
                boolean z10 = true;
                if (saVar2.f15403g0 == 1) {
                    z10 = false;
                }
                o3Var.b(z10);
                return;
            default:
                sa saVar3 = this.f15380b;
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
