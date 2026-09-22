package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class mb extends AnimatorListenerAdapter {
    public final int f5053a;
    public final oc f5054b;

    public mb(oc ocVar, int i10) {
        this.f5053a = i10;
        this.f5054b = ocVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5053a) {
            case 0:
                oc ocVar = this.f5054b;
                ocVar.f5235j2 = null;
                ocVar.f5256r.setTranslationY(0.0f);
                ocVar.f5256r.b(0.0f);
                return;
            case 1:
                oc ocVar2 = this.f5054b;
                ocVar2.f5243n.removeView(ocVar2.M0);
                ocVar2.M0 = null;
                ocVar2.f5246n2 = null;
                ocVar2.f5252p2 = null;
                j4 j4Var = ocVar2.f5212c1.L;
                boolean z10 = true;
                if (ocVar2.f5221f0 == 1) {
                    z10 = false;
                }
                j4Var.b(z10);
                return;
            default:
                oc ocVar3 = this.f5054b;
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
