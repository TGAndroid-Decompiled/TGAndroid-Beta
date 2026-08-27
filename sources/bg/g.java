package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class g extends AnimatorListenerAdapter {

    public final int f2124a;

    public final i f2125b;

    public g(i iVar, int i10) {
        this.f2124a = i10;
        this.f2125b = iVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2124a) {
            case 0:
                super.onAnimationEnd(animator);
                i iVar = this.f2125b;
                iVar.f2129b.d = 0.0f;
                iVar.P = null;
                iVar.h(iVar.E);
                break;
            case 1:
                super.onAnimationEnd(animator);
                i iVar2 = this.f2125b;
                iVar2.f2129b.d = 0.0f;
                iVar2.P = null;
                iVar2.h(iVar2.E);
                break;
            case 2:
                super.onAnimationEnd(animator);
                i iVar3 = this.f2125b;
                iVar3.f2129b.d = 0.0f;
                iVar3.P = null;
                iVar3.h(iVar3.E);
                break;
            default:
                super.onAnimationEnd(animator);
                i iVar4 = this.f2125b;
                iVar4.f2129b.d = 0.0f;
                iVar4.P = null;
                iVar4.h(iVar4.E);
                break;
        }
    }
}
