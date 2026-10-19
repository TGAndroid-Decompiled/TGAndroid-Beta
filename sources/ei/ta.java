package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ta extends AnimatorListenerAdapter {
    public final int f9863a;
    public final vb f9864b;

    public ta(vb vbVar, int i10) {
        this.f9863a = i10;
        this.f9864b = vbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9863a) {
            case 0:
                vb vbVar = this.f9864b;
                vbVar.f9979j2 = null;
                vbVar.f10000r.setTranslationY(0.0f);
                vbVar.f10000r.b(0.0f);
                return;
            case 1:
                vb vbVar2 = this.f9864b;
                vbVar2.f9987n.removeView(vbVar2.M0);
                vbVar2.M0 = null;
                vbVar2.f9990n2 = null;
                vbVar2.f9996p2 = null;
                b4 b4Var = vbVar2.f9956c1.L;
                boolean z10 = true;
                if (vbVar2.f9965f0 == 1) {
                    z10 = false;
                }
                b4Var.b(z10);
                return;
            default:
                vb vbVar3 = this.f9864b;
                db dbVar = vbVar3.C2;
                if (dbVar != null) {
                    if (dbVar.getParent() != null) {
                        ((ViewGroup) vbVar3.C2.getParent()).removeView(vbVar3.C2);
                    }
                    vbVar3.C2 = null;
                }
                vbVar3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
