package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class vc extends AnimatorListenerAdapter {
    public final int f3804a;
    public final ce f3805b;

    public vc(ce ceVar, int i10) {
        this.f3804a = i10;
        this.f3805b = ceVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3804a) {
            case 0:
                ce ceVar = this.f3805b;
                ceVar.f2462j2 = null;
                ceVar.f2483r.setTranslationY(0.0f);
                ceVar.f2483r.b(0.0f);
                return;
            case 1:
                ce ceVar2 = this.f3805b;
                ceVar2.f2470n.removeView(ceVar2.M0);
                ceVar2.M0 = null;
                ceVar2.f2473n2 = null;
                ceVar2.f2479p2 = null;
                b5 b5Var = ceVar2.f2439c1.L;
                boolean z10 = true;
                if (ceVar2.f2448f0 == 1) {
                    z10 = false;
                }
                b5Var.b(z10);
                return;
            default:
                ce ceVar3 = this.f3805b;
                gd gdVar = ceVar3.C2;
                if (gdVar != null) {
                    if (gdVar.getParent() != null) {
                        ((ViewGroup) ceVar3.C2.getParent()).removeView(ceVar3.C2);
                    }
                    ceVar3.C2 = null;
                }
                ceVar3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
