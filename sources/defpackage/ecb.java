package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ecb extends AnimatorListenerAdapter {
    public final byte a;
    public final tbb b;

    public ecb(tbb tbbVar, byte b) {
        this.a = b;
        this.b = tbbVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        tbb tbbVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                lcb lcbVar = tbbVar.b;
                g6b g6bVar = lcbVar.u1;
                if (g6bVar != null) {
                    g6bVar.b();
                    lcbVar.w.removeView(lcbVar.u1);
                }
                lcbVar.u1 = null;
                lcbVar.U();
                return;
            default:
                super.onAnimationEnd(animator);
                g6b g6bVar2 = tbbVar.b.u1;
                if (g6bVar2 != null) {
                    g6bVar2.a(true);
                    return;
                }
                return;
        }
    }
}
