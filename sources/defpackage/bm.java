package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bm extends AnimatorListenerAdapter {
    public final byte a;
    public final hm b;

    public bm(hm hmVar, byte b) {
        this.a = b;
        this.b = hmVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        hm hmVar = this.b;
        switch (b) {
            case 0:
                hm.e(hmVar);
                hm.f();
                return;
            case 1:
                hm.e(hmVar);
                if (hm.a(hmVar) != null) {
                    hm.a(hmVar).run();
                    hm.d(hmVar);
                    return;
                }
                return;
            default:
                hm.b(hmVar);
                return;
        }
    }
}
