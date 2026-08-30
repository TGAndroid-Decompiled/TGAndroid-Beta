package fg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class g extends AnimatorListenerAdapter {
    public final int f6151a;
    public final i f6152b;

    public g(i iVar, int i10) {
        this.f6151a = i10;
        this.f6152b = iVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6151a) {
            case 0:
                super.onAnimationEnd(animator);
                i iVar = this.f6152b;
                iVar.f6156b.d = 0.0f;
                iVar.Q = null;
                iVar.h(iVar.F);
                return;
            case 1:
                super.onAnimationEnd(animator);
                i iVar2 = this.f6152b;
                iVar2.f6156b.d = 0.0f;
                iVar2.Q = null;
                iVar2.h(iVar2.F);
                return;
            case 2:
                super.onAnimationEnd(animator);
                i iVar3 = this.f6152b;
                iVar3.f6156b.d = 0.0f;
                iVar3.Q = null;
                iVar3.h(iVar3.F);
                return;
            default:
                super.onAnimationEnd(animator);
                i iVar4 = this.f6152b;
                iVar4.f6156b.d = 0.0f;
                iVar4.Q = null;
                iVar4.h(iVar4.F);
                return;
        }
    }
}
