package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final int f7082a;
    public final i f7083b;

    public g(i iVar, int i10) {
        this.f7082a = i10;
        this.f7083b = iVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7082a) {
            case 0:
                super.onAnimationEnd(animator);
                i iVar = this.f7083b;
                iVar.f7087b.d = 0.0f;
                iVar.Q = null;
                iVar.h(iVar.F);
                return;
            case 1:
                super.onAnimationEnd(animator);
                i iVar2 = this.f7083b;
                iVar2.f7087b.d = 0.0f;
                iVar2.Q = null;
                iVar2.h(iVar2.F);
                return;
            case 2:
                super.onAnimationEnd(animator);
                i iVar3 = this.f7083b;
                iVar3.f7087b.d = 0.0f;
                iVar3.Q = null;
                iVar3.h(iVar3.F);
                return;
            default:
                super.onAnimationEnd(animator);
                i iVar4 = this.f7083b;
                iVar4.f7087b.d = 0.0f;
                iVar4.Q = null;
                iVar4.h(iVar4.F);
                return;
        }
    }
}
