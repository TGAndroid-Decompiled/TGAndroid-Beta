package lg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n extends AnimatorListenerAdapter {
    public final int f11910a;
    public final q f11911b;

    public n(q qVar, int i10) {
        this.f11910a = i10;
        this.f11911b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11910a) {
            case 0:
                super.onAnimationEnd(animator);
                q qVar = this.f11911b;
                qVar.f11919b.d = 0.0f;
                qVar.f11923d0 = null;
                qVar.j(qVar.L);
                return;
            case 1:
                super.onAnimationEnd(animator);
                q qVar2 = this.f11911b;
                qVar2.f11919b.d = 0.0f;
                qVar2.f11923d0 = null;
                qVar2.j(qVar2.L);
                return;
            case 2:
                super.onAnimationEnd(animator);
                q qVar3 = this.f11911b;
                qVar3.f11919b.d = 0.0f;
                qVar3.f11923d0 = null;
                qVar3.j(qVar3.L);
                return;
            default:
                super.onAnimationEnd(animator);
                q qVar4 = this.f11911b;
                qVar4.f11919b.d = 0.0f;
                qVar4.f11923d0 = null;
                qVar4.j(qVar4.L);
                return;
        }
    }
}
