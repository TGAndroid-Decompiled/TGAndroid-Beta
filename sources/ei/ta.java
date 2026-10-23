package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ta extends AnimatorListenerAdapter {
    public final int f9879a;
    public final vb f9880b;

    public ta(vb vbVar, int i10) {
        this.f9879a = i10;
        this.f9880b = vbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f9879a) {
            case 0:
                vb vbVar = this.f9880b;
                vbVar.f9996j2 = null;
                vbVar.f10017r.setTranslationY(0.0f);
                vbVar.f10017r.b(0.0f);
                return;
            case 1:
                vb vbVar2 = this.f9880b;
                vbVar2.f10004n.removeView(vbVar2.M0);
                vbVar2.M0 = null;
                vbVar2.f10007n2 = null;
                vbVar2.f10013p2 = null;
                b4 b4Var = vbVar2.f9973c1.L;
                boolean z10 = true;
                if (vbVar2.f9982f0 == 1) {
                    z10 = false;
                }
                b4Var.b(z10);
                return;
            default:
                vb vbVar3 = this.f9880b;
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
