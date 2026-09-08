package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class mb extends AnimatorListenerAdapter {
    public final int f7690a;
    public final pc f7691b;

    public mb(pc pcVar, int i10) {
        this.f7690a = i10;
        this.f7691b = pcVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7690a) {
            case 0:
                pc pcVar = this.f7691b;
                pcVar.f7902j2 = null;
                pcVar.f7923r.setTranslationY(0.0f);
                pcVar.f7923r.b(0.0f);
                return;
            case 1:
                pc pcVar2 = this.f7691b;
                pcVar2.f7910n.removeView(pcVar2.M0);
                pcVar2.M0 = null;
                pcVar2.f7913n2 = null;
                pcVar2.f7919p2 = null;
                j4 j4Var = pcVar2.f7878c1.L;
                boolean z10 = true;
                if (pcVar2.f7888f0 == 1) {
                    z10 = false;
                }
                j4Var.b(z10);
                return;
            default:
                pc pcVar3 = this.f7691b;
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
