package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class f0c extends AnimatorListenerAdapter {
    public final byte a;
    public final n0c b;

    public f0c(n0c n0cVar, byte b) {
        this.a = b;
        this.b = n0cVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        n0c n0cVar = this.b;
        switch (b) {
            case 0:
                if (n0cVar.b0 == animator) {
                    n0cVar.b0 = null;
                    return;
                }
                return;
            case 1:
                if (n0cVar.k0 == animator) {
                    n0cVar.k0 = null;
                }
                n0cVar.b(1.0f);
                return;
            default:
                if (n0cVar.K == animator) {
                    n0cVar.K = null;
                    return;
                }
                return;
        }
    }
}
