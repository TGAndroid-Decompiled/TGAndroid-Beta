package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v9 extends AnimatorListenerAdapter {
    public final int f12932a;
    public final va f12933b;

    public v9(va vaVar, int i7) {
        this.f12932a = i7;
        this.f12933b = vaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12932a) {
            case 0:
                va vaVar = this.f12933b;
                vaVar.f12967j2 = null;
                vaVar.f12987r.setTranslationY(0.0f);
                vaVar.f12987r.b(0.0f);
                return;
            case 1:
                va vaVar2 = this.f12933b;
                vaVar2.f12975n.removeView(vaVar2.M0);
                vaVar2.M0 = null;
                vaVar2.f12977n2 = null;
                vaVar2.f12983p2 = null;
                q3 q3Var = vaVar2.f12944c1.L;
                boolean z9 = true;
                if (vaVar2.f12953f0 == 1) {
                    z9 = false;
                }
                q3Var.b(z9);
                return;
            default:
                va vaVar3 = this.f12933b;
                da daVar = vaVar3.C2;
                if (daVar != null) {
                    if (daVar.getParent() != null) {
                        ((ViewGroup) vaVar3.C2.getParent()).removeView(vaVar3.C2);
                    }
                    vaVar3.C2 = null;
                }
                vaVar3.E2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
