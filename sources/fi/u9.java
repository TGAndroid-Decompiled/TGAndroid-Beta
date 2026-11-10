package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class u9 extends AnimatorListenerAdapter {
    public final int f12901a;
    public final va f12902b;

    public u9(va vaVar, int i7) {
        this.f12901a = i7;
        this.f12902b = vaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12901a) {
            case 0:
                va vaVar = this.f12902b;
                vaVar.f12969j2 = null;
                vaVar.f12989r.setTranslationY(0.0f);
                vaVar.f12989r.b(0.0f);
                return;
            case 1:
                va vaVar2 = this.f12902b;
                vaVar2.f12977n.removeView(vaVar2.M0);
                vaVar2.M0 = null;
                vaVar2.f12979n2 = null;
                vaVar2.f12985p2 = null;
                q3 q3Var = vaVar2.f12946c1.L;
                boolean z9 = true;
                if (vaVar2.f12955f0 == 1) {
                    z9 = false;
                }
                q3Var.b(z9);
                return;
            default:
                va vaVar3 = this.f12902b;
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
