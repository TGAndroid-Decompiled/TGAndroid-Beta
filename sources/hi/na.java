package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class na extends AnimatorListenerAdapter {
    public final int f15052a;
    public final nb f15053b;

    public na(nb nbVar, int i7) {
        this.f15052a = i7;
        this.f15053b = nbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15052a) {
            case 0:
                nb nbVar = this.f15053b;
                nbVar.f15090k2 = null;
                nbVar.f15107r.setTranslationY(0.0f);
                nbVar.f15107r.b(0.0f);
                return;
            case 1:
                nb nbVar2 = this.f15053b;
                nbVar2.f15095n.removeView(nbVar2.N0);
                nbVar2.N0 = null;
                nbVar2.f15100o2 = null;
                nbVar2.f15106q2 = null;
                x3 x3Var = nbVar2.f15067d1.M;
                boolean z10 = true;
                if (nbVar2.f15076g0 == 1) {
                    z10 = false;
                }
                x3Var.b(z10);
                return;
            default:
                nb nbVar3 = this.f15053b;
                va vaVar = nbVar3.D2;
                if (vaVar != null) {
                    if (vaVar.getParent() != null) {
                        ((ViewGroup) nbVar3.D2.getParent()).removeView(nbVar3.D2);
                    }
                    nbVar3.D2 = null;
                }
                nbVar3.F2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
