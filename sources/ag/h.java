package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h extends AnimatorListenerAdapter {
    public final int f200a;
    public final j f201b;

    public h(j jVar, int i9) {
        this.f200a = i9;
        this.f201b = jVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f200a) {
            case 0:
                super.onAnimationEnd(animator);
                j jVar = this.f201b;
                jVar.f205b.d = 0.0f;
                jVar.P = null;
                jVar.h(jVar.E);
                return;
            case 1:
                super.onAnimationEnd(animator);
                j jVar2 = this.f201b;
                jVar2.f205b.d = 0.0f;
                jVar2.P = null;
                jVar2.h(jVar2.E);
                return;
            case 2:
                super.onAnimationEnd(animator);
                j jVar3 = this.f201b;
                jVar3.f205b.d = 0.0f;
                jVar3.P = null;
                jVar3.h(jVar3.E);
                return;
            default:
                super.onAnimationEnd(animator);
                j jVar4 = this.f201b;
                jVar4.f205b.d = 0.0f;
                jVar4.P = null;
                jVar4.h(jVar4.E);
                return;
        }
    }
}
