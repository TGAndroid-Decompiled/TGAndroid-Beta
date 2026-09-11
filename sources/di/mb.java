package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class mb extends AnimatorListenerAdapter {
    public final int f7662a;
    public final pc f7663b;

    public mb(pc pcVar, int i10) {
        this.f7662a = i10;
        this.f7663b = pcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7662a) {
            case 0:
                pc pcVar = this.f7663b;
                pcVar.f7874j2 = null;
                pcVar.f7895r.setTranslationY(0.0f);
                pcVar.f7895r.b(0.0f);
                return;
            case 1:
                pc pcVar2 = this.f7663b;
                pcVar2.f7882n.removeView(pcVar2.M0);
                pcVar2.M0 = null;
                pcVar2.f7885n2 = null;
                pcVar2.f7891p2 = null;
                j4 j4Var = pcVar2.f7850c1.L;
                boolean z10 = true;
                if (pcVar2.f7860f0 == 1) {
                    z10 = false;
                }
                j4Var.b(z10);
                return;
            default:
                pc pcVar3 = this.f7663b;
                xb xbVar = pcVar3.C2;
                if (xbVar != null) {
                    if (xbVar.getParent() != null) {
                        ((ViewGroup) pcVar3.C2.getParent()).removeView(pcVar3.C2);
                    }
                    pcVar3.C2 = null;
                }
                pcVar3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
