package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final int f5585a;
    public final i f5586b;

    public g(i iVar, int i10) {
        this.f5585a = i10;
        this.f5586b = iVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5585a) {
            case 0:
                super.onAnimationEnd(animator);
                i iVar = this.f5586b;
                iVar.f5590b.d = 0.0f;
                iVar.P = null;
                iVar.h(iVar.E);
                return;
            case 1:
                super.onAnimationEnd(animator);
                i iVar2 = this.f5586b;
                iVar2.f5590b.d = 0.0f;
                iVar2.P = null;
                iVar2.h(iVar2.E);
                return;
            case 2:
                super.onAnimationEnd(animator);
                i iVar3 = this.f5586b;
                iVar3.f5590b.d = 0.0f;
                iVar3.P = null;
                iVar3.h(iVar3.E);
                return;
            default:
                super.onAnimationEnd(animator);
                i iVar4 = this.f5586b;
                iVar4.f5590b.d = 0.0f;
                iVar4.P = null;
                iVar4.h(iVar4.E);
                return;
        }
    }
}
