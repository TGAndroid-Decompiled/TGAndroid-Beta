package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class mb extends AnimatorListenerAdapter {
    public final int f5055a;
    public final oc f5056b;

    public mb(oc ocVar, int i10) {
        this.f5055a = i10;
        this.f5056b = ocVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5055a) {
            case 0:
                oc ocVar = this.f5056b;
                ocVar.f5237j2 = null;
                ocVar.f5258r.setTranslationY(0.0f);
                ocVar.f5258r.b(0.0f);
                return;
            case 1:
                oc ocVar2 = this.f5056b;
                ocVar2.f5245n.removeView(ocVar2.M0);
                ocVar2.M0 = null;
                ocVar2.f5248n2 = null;
                ocVar2.f5254p2 = null;
                j4 j4Var = ocVar2.f5214c1.L;
                boolean z10 = true;
                if (ocVar2.f5223f0 == 1) {
                    z10 = false;
                }
                j4Var.b(z10);
                return;
            default:
                oc ocVar3 = this.f5056b;
                wb wbVar = ocVar3.C2;
                if (wbVar != null) {
                    if (wbVar.getParent() != null) {
                        ((ViewGroup) ocVar3.C2.getParent()).removeView(ocVar3.C2);
                    }
                    ocVar3.C2 = null;
                }
                ocVar3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
