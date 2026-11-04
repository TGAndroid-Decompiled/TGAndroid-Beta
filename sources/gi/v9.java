package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class v9 extends AnimatorListenerAdapter {
    public final int f13696a;
    public final va f13697b;

    public v9(va vaVar, int i3) {
        this.f13696a = i3;
        this.f13697b = vaVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13696a) {
            case 0:
                va vaVar = this.f13697b;
                vaVar.f13733k2 = null;
                vaVar.f13751r.setTranslationY(0.0f);
                vaVar.f13751r.b(0.0f);
                return;
            case 1:
                va vaVar2 = this.f13697b;
                vaVar2.f13738n.removeView(vaVar2.N0);
                vaVar2.N0 = null;
                vaVar2.f13744o2 = null;
                vaVar2.f13750q2 = null;
                p3 p3Var = vaVar2.f13710d1.M;
                boolean z10 = true;
                if (vaVar2.f13720g0 == 1) {
                    z10 = false;
                }
                p3Var.b(z10);
                return;
            default:
                va vaVar3 = this.f13697b;
                da daVar = vaVar3.D2;
                if (daVar != null) {
                    if (daVar.getParent() != null) {
                        ((ViewGroup) vaVar3.D2.getParent()).removeView(vaVar3.D2);
                    }
                    vaVar3.D2 = null;
                }
                vaVar3.F2 = null;
                super.onAnimationEnd(animator);
                return;
        }
    }
}
